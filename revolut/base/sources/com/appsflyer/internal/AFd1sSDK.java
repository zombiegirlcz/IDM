package com.appsflyer.internal;

import android.content.pm.PackageItemInfo;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class AFd1sSDK {
    private static String AFKeystoreWrapper = "292";
    private Bundle AFInAppEventParameterName = null;
    public final AFd1oSDK AFInAppEventType;
    public final AFd1nSDK valueOf;
    public final AFd1pSDK values;

    public AFd1sSDK(AFd1nSDK aFd1nSDK, AFd1pSDK aFd1pSDK, AFd1oSDK aFd1oSDK) {
        this.valueOf = aFd1nSDK;
        this.values = aFd1pSDK;
        this.AFInAppEventType = aFd1oSDK;
    }

    public static String AFInAppEventParameterName() {
        return AppsFlyerProperties.getInstance().getString("AppUserId");
    }

    @NonNull
    public static String AFKeystoreWrapper() {
        return "6.14.2";
    }

    public static String registerClient() {
        StringBuilder sb6 = new StringBuilder("version: 6.14.2 (build ");
        sb6.append(AFKeystoreWrapper);
        sb6.append(")");
        return sb6.toString();
    }

    public static String valueOf() {
        return String.valueOf(Build.VERSION.SDK_INT);
    }

    @NonNull
    public static String values() {
        return UUID.randomUUID().toString();
    }

    public final String AFInAppEventType(String str) {
        Object obj2;
        try {
            if (this.AFInAppEventParameterName == null) {
                this.AFInAppEventParameterName = ((PackageItemInfo) this.valueOf.AFKeystoreWrapper.getPackageManager().getApplicationInfo(this.valueOf.AFKeystoreWrapper.getPackageName(), 128)).metaData;
            }
            Bundle bundle = this.AFInAppEventParameterName;
            if (bundle == null || (obj2 = bundle.get(str)) == null) {
                return null;
            }
            return obj2.toString();
        } catch (Throwable th10) {
            StringBuilder sb6 = new StringBuilder("Could not load manifest metadata!");
            sb6.append(th10.getMessage());
            AFLogger.afErrorLog(sb6.toString(), th10);
            return null;
        }
    }

    public final String AFLogger() {
        String string = AppsFlyerProperties.getInstance().getString("channel");
        if (string == null) {
            string = AFInAppEventType("CHANNEL");
        }
        if (string == null || !string.equals("")) {
            return string;
        }
        return null;
    }

    public final boolean unregisterClient() {
        return !this.AFInAppEventType.AFKeystoreWrapper();
    }

    public final String AFKeystoreWrapper(String str) {
        try {
            int identifier = this.valueOf.AFKeystoreWrapper.getResources().getIdentifier(str, "string", this.valueOf.AFKeystoreWrapper.getPackageName());
            if (identifier != 0) {
                return this.valueOf.AFKeystoreWrapper.getString(identifier);
            }
            return null;
        } catch (Resources.NotFoundException e) {
            StringBuilder sb6 = new StringBuilder("Could not load string resource!");
            sb6.append(e.getMessage());
            AFLogger.afErrorLog(sb6.toString(), e);
            return null;
        }
    }

    public final boolean values(String str) {
        String strAFInAppEventType = AFInAppEventType(str);
        if (strAFInAppEventType != null) {
            return Boolean.parseBoolean(strAFInAppEventType);
        }
        return false;
    }

    public final String AFInAppEventType() {
        AFh1tSDK aFh1tSDK = this.AFInAppEventType.AFLogger;
        AFa1cSDK aFa1cSDK = aFh1tSDK != null ? new AFa1cSDK(aFh1tSDK.AFInAppEventType, aFh1tSDK.unregisterClient) : null;
        if (aFa1cSDK != null) {
            return aFa1cSDK.valueOf;
        }
        return null;
    }
}
