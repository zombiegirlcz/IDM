package com.appsflyer.internal.components.network.http.exceptions;

import androidx.annotation.NonNull;
import com.appsflyer.internal.AFe1jSDK;
import java.io.IOException;

/* JADX INFO: loaded from: classes16.dex */
public class ParsingException extends IOException {

    @NonNull
    private final AFe1jSDK<String> AFInAppEventParameterName;

    public ParsingException(String str, Throwable th10, @NonNull AFe1jSDK<String> aFe1jSDK) {
        super(str, th10);
        this.AFInAppEventParameterName = aFe1jSDK;
    }

    @NonNull
    public AFe1jSDK<String> getRawResponse() {
        return this.AFInAppEventParameterName;
    }
}
