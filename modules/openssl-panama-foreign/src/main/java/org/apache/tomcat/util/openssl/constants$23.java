/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Generated by jextract

package org.apache.tomcat.util.openssl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$23 {

    static final FunctionDescriptor OPENSSL_init_ssl$FUNC = FunctionDescriptor.of(JAVA_INT,
        JAVA_LONG,
        ADDRESS
    );
    static final MethodHandle OPENSSL_init_ssl$MH = RuntimeHelper.downcallHandle(
        "OPENSSL_init_ssl",
        constants$23.OPENSSL_init_ssl$FUNC, false
    );
    static final FunctionDescriptor ERR_get_error$FUNC = FunctionDescriptor.of(JAVA_LONG);
    static final MethodHandle ERR_get_error$MH = RuntimeHelper.downcallHandle(
        "ERR_get_error",
        constants$23.ERR_get_error$FUNC, false
    );
    static final FunctionDescriptor ERR_peek_last_error$FUNC = FunctionDescriptor.of(JAVA_LONG);
    static final MethodHandle ERR_peek_last_error$MH = RuntimeHelper.downcallHandle(
        "ERR_peek_last_error",
        constants$23.ERR_peek_last_error$FUNC, false
    );
    static final FunctionDescriptor ERR_clear_error$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle ERR_clear_error$MH = RuntimeHelper.downcallHandle(
        "ERR_clear_error",
        constants$23.ERR_clear_error$FUNC, false
    );
    static final FunctionDescriptor ERR_error_string$FUNC = FunctionDescriptor.of(ADDRESS,
        JAVA_LONG,
        ADDRESS
    );
    static final MethodHandle ERR_error_string$MH = RuntimeHelper.downcallHandle(
        "ERR_error_string",
        constants$23.ERR_error_string$FUNC, false
    );
    static final FunctionDescriptor PKCS12_verify_mac$FUNC = FunctionDescriptor.of(JAVA_INT,
        ADDRESS,
        ADDRESS,
        JAVA_INT
    );
    static final MethodHandle PKCS12_verify_mac$MH = RuntimeHelper.downcallHandle(
        "PKCS12_verify_mac",
        constants$23.PKCS12_verify_mac$FUNC, false
    );
}

