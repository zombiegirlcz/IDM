package com.appsflyer.internal;

import android.app.Activity;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class AFi1qSDK implements AFi1rSDK {
    private String AFInAppEventType;

    private static String values(Activity activity) {
        Uri uriAFKeystoreWrapper = AFc1aSDK.AFKeystoreWrapper(activity != null ? activity.getIntent() : null);
        String string = uriAFKeystoreWrapper != null ? uriAFKeystoreWrapper.toString() : null;
        if (string == null) {
            string = "";
        }
        if (AFKeystoreWrapper(string)) {
            return null;
        }
        return string;
    }

    @Override // com.appsflyer.internal.AFi1rSDK
    public final void AFInAppEventType(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        String str = this.AFInAppEventType;
        if (str == null || str.length() == 0) {
            this.AFInAppEventType = values(activity);
        }
    }

    @Override // com.appsflyer.internal.AFi1rSDK
    public final String AFKeystoreWrapper(Activity activity) {
        String str = this.AFInAppEventType;
        this.AFInAppEventType = null;
        return (str == null || str.length() == 0) ? values(activity) : str;
    }

    @Override // com.appsflyer.internal.AFi1rSDK
    @NotNull
    public final String valueOf(Activity activity) {
        Uri referrer = (activity == null || activity.getIntent() == null) ? null : activity.getReferrer();
        String string = referrer != null ? referrer.toString() : null;
        return string == null ? "" : string;
    }

    private static boolean AFKeystoreWrapper(String str) {
        return a0.H(str, "android-app://", false);
    }
}
