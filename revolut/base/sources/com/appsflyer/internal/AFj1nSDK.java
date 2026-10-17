package com.appsflyer.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes16.dex */
public final class AFj1nSDK {
    public String AFInAppEventParameterName;
    public final WeakReference<Context> AFInAppEventType;

    public AFj1nSDK(@NonNull Context context) {
        this.AFInAppEventType = new WeakReference<>(context);
    }
}
