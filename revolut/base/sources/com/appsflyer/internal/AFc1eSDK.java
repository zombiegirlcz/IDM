package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import zhm.r0;

/* JADX INFO: loaded from: classes.dex */
public final class AFc1eSDK implements AFc1pSDK {

    @NotNull
    private final AFd1pSDK valueOf;

    public AFc1eSDK(@NotNull AFd1pSDK aFd1pSDK) {
        Intrinsics.checkNotNullParameter(aFd1pSDK, "");
        this.valueOf = aFd1pSDK;
    }

    @Override // com.appsflyer.internal.AFc1pSDK
    public final void AFInAppEventParameterName() {
        this.valueOf.AFInAppEventParameterName("deeplink_data");
    }

    @Override // com.appsflyer.internal.AFc1pSDK
    @NotNull
    public final Map<String, Object> AFInAppEventType() {
        if (this.valueOf.valueOf("deeplink_data")) {
            try {
                String strAFKeystoreWrapper = this.valueOf.AFKeystoreWrapper("deeplink_data", (String) null);
                return strAFKeystoreWrapper == null ? r0.g() : AFj1sSDK.valueOf(new JSONObject(strAFKeystoreWrapper));
            } catch (Throwable th10) {
                AFLogger.afErrorLog("Exception while parsing stored deeplink data", th10, true, false);
            }
        }
        return r0.g();
    }

    @Override // com.appsflyer.internal.AFc1pSDK
    public final void AFInAppEventParameterName(@NotNull Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.valueOf.AFInAppEventParameterName("deeplink_data", new JSONObject(map).toString());
    }
}
