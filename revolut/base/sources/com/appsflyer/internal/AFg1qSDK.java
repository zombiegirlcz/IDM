package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.appsflyer.AFLogger;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class AFg1qSDK {

    @NotNull
    private final String AFKeystoreWrapper;

    @NotNull
    private final Map<String, Object> valueOf;
    private final PackageManager values;

    public AFg1qSDK(@NotNull AFd1nSDK aFd1nSDK, @NotNull AFd1sSDK aFd1sSDK) {
        Intrinsics.checkNotNullParameter(aFd1nSDK, "");
        Intrinsics.checkNotNullParameter(aFd1sSDK, "");
        this.valueOf = new LinkedHashMap();
        Context context = aFd1nSDK.AFKeystoreWrapper;
        this.values = context != null ? context.getPackageManager() : null;
        String packageName = aFd1sSDK.valueOf.AFKeystoreWrapper.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "");
        this.AFKeystoreWrapper = packageName;
    }

    @NotNull
    public final Map<String, Object> AFInAppEventParameterName() {
        InstallSourceInfo installSourceInfo;
        String installerPackageName;
        if (this.valueOf.isEmpty()) {
            try {
                PackageManager packageManager = this.values;
                if (packageManager != null && (installerPackageName = packageManager.getInstallerPackageName(this.AFKeystoreWrapper)) != null) {
                    this.valueOf.put("installer_package", installerPackageName);
                }
            } catch (Exception e) {
                AFLogger.afErrorLog("Exception while getting the app's installer package. ", e);
            }
            if (Build.VERSION.SDK_INT >= 30) {
                Map<String, Object> map = this.valueOf;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                String str = this.AFKeystoreWrapper;
                PackageManager packageManager2 = this.values;
                if (packageManager2 != null && (installSourceInfo = packageManager2.getInstallSourceInfo(str)) != null) {
                    Intrinsics.checkNotNullExpressionValue(installSourceInfo, "");
                    linkedHashMap = new LinkedHashMap();
                    String initiatingPackageName = installSourceInfo.getInitiatingPackageName();
                    if (initiatingPackageName != null) {
                        linkedHashMap.put("initiating_package", initiatingPackageName);
                    }
                    String installingPackageName = installSourceInfo.getInstallingPackageName();
                    if (installingPackageName != null) {
                        linkedHashMap.put("installing_package", installingPackageName);
                    }
                    String originatingPackageName = installSourceInfo.getOriginatingPackageName();
                    if (originatingPackageName != null) {
                        linkedHashMap.put("originating_package", originatingPackageName);
                    }
                }
                map.put("install_source_info", linkedHashMap);
            }
        }
        return this.valueOf;
    }
}
