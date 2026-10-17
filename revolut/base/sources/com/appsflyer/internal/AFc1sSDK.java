package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchGroup;
import kotlin.text.Regex;
import kotlin.text.z;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class AFc1sSDK {
    public static final int AFInAppEventParameterName(@NotNull String str) {
        String str2;
        Integer numM;
        String str3;
        Integer numM2;
        String str4;
        Integer numM3;
        Intrinsics.checkNotNullParameter(str, "");
        kotlin.text.o oVarE = new Regex("(\\d+).(\\d+).(\\d+).*").e(str);
        if (oVarE == null) {
            return -1;
        }
        kotlin.text.n nVar = oVarE.f187921c;
        MatchGroup matchGroupA = nVar.a(1);
        int iIntValue = 0;
        int iIntValue2 = ((matchGroupA == null || (str4 = matchGroupA.f187889a) == null || (numM3 = z.m(str4)) == null) ? 0 : numM3.intValue()) * 1000000;
        MatchGroup matchGroupA2 = nVar.a(2);
        int iIntValue3 = (((matchGroupA2 == null || (str3 = matchGroupA2.f187889a) == null || (numM2 = z.m(str3)) == null) ? 0 : numM2.intValue()) * 1000) + iIntValue2;
        MatchGroup matchGroupA3 = nVar.a(3);
        if (matchGroupA3 != null && (str2 = matchGroupA3.f187889a) != null && (numM = z.m(str2)) != null) {
            iIntValue = numM.intValue();
        }
        return iIntValue3 + iIntValue;
    }
}
