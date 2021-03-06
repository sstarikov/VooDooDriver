/*
Copyright 2011-2012 SugarCRM Inc.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
Please see the License for the specific language governing permissions and
limitations under the License.
*/

package org.sugarcrm.vddlogger;

import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXParseException;

/**
 * Error handler for VDD's XML parser
 *
 * <p>Having a custom error handler serves merely to keep extraneous
 * error messages from appearing on the console.</p>
 */
class VddErrorHandler implements ErrorHandler {

   /**
    * Handle an XML warning
    *
    * @param e the exception generated by the warning
    */
   public void warning(SAXParseException e) throws SAXParseException {
      throw e;
   }

   /**
    * Handle an XML error
    *
    * @param e the exception generated by the error
    */
   public void error(SAXParseException e) throws SAXParseException {
      throw e;
   }

   /**
    * Handle a fatal XML error
    *
    * @param e the exception generated by the fatal error
    */
   public void fatalError(SAXParseException e) throws SAXParseException {
      throw e;
   }
}
