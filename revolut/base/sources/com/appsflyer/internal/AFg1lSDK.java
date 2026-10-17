package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.FirebaseMessagingServiceListener;
import com.appsflyer.internal.AFe1aSDK.AnonymousClass4;
import com.google.firebase.messaging.FirebaseMessagingService;

/* JADX INFO: loaded from: classes.dex */
public final class AFg1lSDK {
    public static String AFInAppEventType;
    public final AFd1pSDK valueOf;

    static {
        StringBuilder sb6 = new StringBuilder("https://%sregister.%s/api/v");
        sb6.append(AFb1rSDK.AFInAppEventParameterName);
        AFInAppEventType = sb6.toString();
    }

    public AFg1lSDK(@NonNull Context context) {
        this.valueOf = AFb1rSDK.AFInAppEventParameterName().AFInAppEventType(context);
    }

    public static boolean AFInAppEventType(Context context) {
        if (AppsFlyerLib.getInstance().isStopped()) {
            return false;
        }
        try {
            String str = FirebaseMessagingService.ACTION_DIRECT_BOOT_REMOTE_INTENT;
            return AFb1vSDK.valueOf(context, new Intent("com.google.firebase.MESSAGING_EVENT", null, context, FirebaseMessagingServiceListener.class));
        } catch (ClassNotFoundException unused) {
            return false;
        } catch (Throwable th10) {
            AFLogger.INSTANCE.e(AFg1bSDK.UNINSTALL, "An error occurred while trying to verify manifest declarations: ", th10);
            return false;
        }
    }

    public static boolean AFKeystoreWrapper(@NonNull AFd1pSDK aFd1pSDK) {
        return aFd1pSDK.AFKeystoreWrapper("sentRegisterRequestToAF");
    }

    public static void AFKeystoreWrapper(String str) {
        AFd1fSDK aFd1fSDKAFInAppEventType = AFb1rSDK.AFInAppEventParameterName().AFInAppEventType();
        AFf1cSDK aFf1cSDK = new AFf1cSDK(str, aFd1fSDKAFInAppEventType);
        AFe1aSDK aFe1aSDKW = aFd1fSDKAFInAppEventType.w();
        aFe1aSDKW.AFInAppEventParameterName.execute(aFe1aSDKW.new AnonymousClass4(aFf1cSDK));
    }

    public final AFg1jSDK AFKeystoreWrapper() {
        String string;
        String string2;
        String strAFKeystoreWrapper = this.valueOf.AFKeystoreWrapper("afUninstallToken", (String) null);
        long jAFInAppEventParameterName = this.valueOf.AFInAppEventParameterName("afUninstallToken_received_time", 0L);
        boolean zAFKeystoreWrapper = this.valueOf.AFKeystoreWrapper("afUninstallToken_queued");
        this.valueOf.AFKeystoreWrapper("afUninstallToken_queued", false);
        if (strAFKeystoreWrapper == null && (string2 = AppsFlyerProperties.getInstance().getString("afUninstallToken")) != null) {
            strAFKeystoreWrapper = string2.split(",")[r0.length - 1];
        }
        if (jAFInAppEventParameterName == 0 && (string = AppsFlyerProperties.getInstance().getString("afUninstallToken")) != null) {
            String[] strArrSplit = string.split(",");
            if (strArrSplit.length >= 2) {
                try {
                    jAFInAppEventParameterName = Long.parseLong(strArrSplit[strArrSplit.length - 2]);
                } catch (NumberFormatException unused) {
                }
            }
        }
        if (strAFKeystoreWrapper != null) {
            return new AFg1jSDK(strAFKeystoreWrapper, jAFInAppEventParameterName, zAFKeystoreWrapper);
        }
        return null;
    }
}
