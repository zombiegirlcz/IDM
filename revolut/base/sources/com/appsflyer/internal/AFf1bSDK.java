package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import org.jetbrains.annotations.NotNull;
import yhm.m;

/* JADX INFO: loaded from: classes16.dex */
public final class AFf1bSDK {
    private static /* synthetic */ boolean AFInAppEventType(AFf1bSDK aFf1bSDK, String str) {
        return AFInAppEventType(str, TimeUnit.HOURS, 1L);
    }

    public final boolean AFKeystoreWrapper(String str) {
        return AFInAppEventType(this, str);
    }

    private static boolean AFInAppEventType(String str, @NotNull TimeUnit timeUnit, long j2) {
        Long lN;
        Object objA;
        Intrinsics.checkNotNullParameter(timeUnit, "");
        if (str != null && (lN = z.n(str)) != null) {
            try {
                m.Companion companion = yhm.m.INSTANCE;
                objA = Boolean.valueOf(Math.abs(lN.longValue() - TimeUnit.MILLISECONDS.toSeconds(AFb1rSDK.AFInAppEventParameterName().AFInAppEventType().AFLogger().AFInAppEventType())) < timeUnit.toSeconds(1L));
            } catch (Throwable th10) {
                m.Companion companion2 = yhm.m.INSTANCE;
                objA = yhm.o.a(th10);
            }
            Throwable thA = yhm.m.a(objA);
            if (thA != null) {
                StringBuilder sb6 = new StringBuilder("Could not convert ");
                sb6.append(str);
                sb6.append(" to TS");
                AFLogger.afErrorLog(sb6.toString(), thA);
            }
            if (objA instanceof yhm.n) {
                objA = null;
            }
            Boolean bool = (Boolean) objA;
            if (bool != null) {
                return bool.booleanValue();
            }
        }
        return false;
    }
}
