package com.appsflyer.internal;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class AFe1xSDK {
    public static boolean valueOf(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        int iAFInAppEventParameterName = AFc1sSDK.AFInAppEventParameterName(str);
        int iAFInAppEventParameterName2 = AFc1sSDK.AFInAppEventParameterName(str2);
        Pair<Integer, Integer> pairAFKeystoreWrapper = AFe1ySDK.AFKeystoreWrapper(str2);
        Pair<Integer, Integer> pairAFInAppEventParameterName = AFe1ySDK.AFInAppEventParameterName(str2);
        return (iAFInAppEventParameterName2 == -1 || pairAFKeystoreWrapper != null) ? pairAFInAppEventParameterName != null ? ((Number) pairAFInAppEventParameterName.f186385a).intValue() <= iAFInAppEventParameterName && iAFInAppEventParameterName <= ((Number) pairAFInAppEventParameterName.f186386b).intValue() : pairAFKeystoreWrapper != null && ((Number) pairAFKeystoreWrapper.f186385a).intValue() <= iAFInAppEventParameterName && iAFInAppEventParameterName <= ((Number) pairAFKeystoreWrapper.f186386b).intValue() : iAFInAppEventParameterName2 == iAFInAppEventParameterName;
    }
}
