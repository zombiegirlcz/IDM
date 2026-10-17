package com.appsflyer.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import ch.qos.logback.core.net.SyslogConstants;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class AFg1rSDK implements AFg1oSDK {

    @NotNull
    private final Context AFKeystoreWrapper;

    @NotNull
    private final AppsFlyerProperties values;

    public AFg1rSDK(@NotNull Context context, @NotNull AppsFlyerProperties appsFlyerProperties) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(appsFlyerProperties, "");
        this.AFKeystoreWrapper = context;
        this.values = appsFlyerProperties;
    }

    @Override // com.appsflyer.internal.AFg1oSDK
    public final AFg1nSDK valueOf() {
        String string;
        if (!Boolean.parseBoolean(this.values.getString("enableTCFDataCollection"))) {
            return null;
        }
        try {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.AFKeystoreWrapper);
            int i = defaultSharedPreferences.getInt("IABTCF_gdprApplies", -1);
            int i2 = defaultSharedPreferences.getInt("IABTCF_CmpSdkID", -1);
            int i3 = defaultSharedPreferences.getInt("IABTCF_PolicyVersion", -1);
            int i5 = defaultSharedPreferences.getInt("IABTCF_CmpSdkVersion", -1);
            String str = "";
            if (i == 1 && (string = defaultSharedPreferences.getString("IABTCF_TCString", "")) != null) {
                Intrinsics.checkNotNullExpressionValue(string, "");
                str = string;
            }
            return new AFg1nSDK(i3, i, i2, i5, str);
        } catch (Exception e) {
            AFg1cSDK.e$default(AFLogger.INSTANCE, AFg1bSDK.DMA, "TCF data collection exception", e, false, false, false, false, SyslogConstants.LOG_CLOCK, null);
            return null;
        }
    }
}
