package com.appsflyer.internal.components.network.http.exceptions;

import androidx.annotation.NonNull;
import com.appsflyer.internal.AFe1mSDK;
import java.io.IOException;

/* JADX INFO: loaded from: classes16.dex */
public class HttpException extends IOException {
    private final AFe1mSDK AFInAppEventParameterName;

    public HttpException(@NonNull Throwable th10, @NonNull AFe1mSDK aFe1mSDK) {
        super(th10.getMessage(), th10);
        this.AFInAppEventParameterName = aFe1mSDK;
    }

    @NonNull
    public AFe1mSDK getMetrics() {
        return this.AFInAppEventParameterName;
    }
}
