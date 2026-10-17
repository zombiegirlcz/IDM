package com.appsflyer.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.appsflyer.lvl.AppsFlyerLVL;

/* JADX INFO: loaded from: classes.dex */
public final class AFg1vSDK {

    public interface AFa1tSDK {
        void AFInAppEventType(String str, Exception exc2);

        void values(@NonNull String str, @NonNull String str2);
    }

    public final boolean AFInAppEventType(long j2, @NonNull Context context, @NonNull final AFa1tSDK aFa1tSDK) {
        try {
            AppsFlyerLVL.checkLicense(j2, context, new AppsFlyerLVL.resultListener() { // from class: com.appsflyer.internal.AFg1vSDK.2
                public final void onLvlFailure(Exception exc2) {
                    aFa1tSDK.AFInAppEventType("onLvlFailure with exception", exc2);
                }

                public final void onLvlResult(String str, String str2) {
                    if (str != null && str2 != null) {
                        aFa1tSDK.values(str, str2);
                    } else if (str2 == null) {
                        aFa1tSDK.AFInAppEventType("onLvlResult with error", new Exception("AFLVL Invalid signature"));
                    } else {
                        aFa1tSDK.AFInAppEventType("onLvlResult with error", new Exception("AFLVL Invalid signedData"));
                    }
                }
            });
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
