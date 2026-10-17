package com.appsflyer.internal;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public interface AFd1aSDK {

    public interface AFa1zSDK {
        void onConfigurationChanged(boolean z);
    }

    void AFInAppEventParameterName();

    void AFInAppEventParameterName(@NonNull Throwable th10, @NonNull String str);

    void AFInAppEventType();

    void AFKeystoreWrapper(AFa1zSDK aFa1zSDK);
}
