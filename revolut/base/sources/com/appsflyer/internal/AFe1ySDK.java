package com.appsflyer.internal;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.MatchGroup;
import kotlin.text.Regex;
import kotlin.text.z;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class AFe1ySDK {
    public static final Pair<Integer, Integer> AFInAppEventParameterName(@NotNull String str) {
        String str2;
        String str3;
        String str4;
        Intrinsics.checkNotNullParameter(str, "");
        kotlin.text.o oVarE = new Regex("^(\\d+).(\\+)$|^(\\d+).(\\d+).(\\+)$").e(str);
        if (oVarE != null) {
            kotlin.text.n nVar = oVarE.f187921c;
            MatchGroup matchGroupA = nVar.a(1);
            Integer numM = (matchGroupA == null || (str4 = matchGroupA.f187889a) == null) ? null : z.m(str4);
            MatchGroup matchGroupA2 = nVar.a(3);
            Integer numM2 = (matchGroupA2 == null || (str3 = matchGroupA2.f187889a) == null) ? null : z.m(str3);
            MatchGroup matchGroupA3 = nVar.a(4);
            Integer numM3 = (matchGroupA3 == null || (str2 = matchGroupA3.f187889a) == null) ? null : z.m(str2);
            if (numM != null) {
                return new Pair<>(Integer.valueOf(numM.intValue() * 1000000), Integer.valueOf(((numM.intValue() + 1) * 1000000) - 1));
            }
            if (numM2 != null && numM3 != null) {
                return new Pair<>(Integer.valueOf((numM3.intValue() * 1000) + (numM2.intValue() * 1000000)), Integer.valueOf((((numM3.intValue() + 1) * 1000) + (numM2.intValue() * 1000000)) - 1));
            }
        }
        return null;
    }

    public static final Pair<Integer, Integer> AFKeystoreWrapper(@NotNull String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        Intrinsics.checkNotNullParameter(str, "");
        kotlin.text.o oVarE = new Regex("(\\d+).(\\d+).(\\d+)-(\\d+).(\\d+).(\\d+)").e(str);
        if (oVarE != null) {
            kotlin.text.n nVar = oVarE.f187921c;
            MatchGroup matchGroupA = nVar.a(1);
            Integer numM = (matchGroupA == null || (str7 = matchGroupA.f187889a) == null) ? null : z.m(str7);
            MatchGroup matchGroupA2 = nVar.a(2);
            Integer numM2 = (matchGroupA2 == null || (str6 = matchGroupA2.f187889a) == null) ? null : z.m(str6);
            MatchGroup matchGroupA3 = nVar.a(3);
            Integer numM3 = (matchGroupA3 == null || (str5 = matchGroupA3.f187889a) == null) ? null : z.m(str5);
            MatchGroup matchGroupA4 = nVar.a(4);
            Integer numM4 = (matchGroupA4 == null || (str4 = matchGroupA4.f187889a) == null) ? null : z.m(str4);
            MatchGroup matchGroupA5 = nVar.a(5);
            Integer numM5 = (matchGroupA5 == null || (str3 = matchGroupA5.f187889a) == null) ? null : z.m(str3);
            MatchGroup matchGroupA6 = nVar.a(6);
            Integer numM6 = (matchGroupA6 == null || (str2 = matchGroupA6.f187889a) == null) ? null : z.m(str2);
            Integer num = numM6;
            if (AFKeystoreWrapper(numM, numM2, numM3, numM4, numM5, numM6)) {
                Intrinsics.h(numM);
                int iIntValue = numM.intValue() * 1000000;
                Intrinsics.h(numM2);
                int iIntValue2 = (numM2.intValue() * 1000) + iIntValue;
                Intrinsics.h(numM3);
                Integer numValueOf = Integer.valueOf(numM3.intValue() + iIntValue2);
                Intrinsics.h(numM4);
                int iIntValue3 = numM4.intValue() * 1000000;
                Intrinsics.h(numM5);
                int iIntValue4 = (numM5.intValue() * 1000) + iIntValue3;
                Intrinsics.h(num);
                return new Pair<>(numValueOf, Integer.valueOf(num.intValue() + iIntValue4));
            }
        }
        return null;
    }

    public static final String valueOf(String str, String str2) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str2);
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        byte[] bArrDigest = messageDigest.digest(bytes);
        Intrinsics.checkNotNullExpressionValue(bArrDigest, "");
        String string = "";
        for (byte b4 : bArrDigest) {
            StringBuilder sbS = p.a.s(string);
            String str3 = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b4)}, 1));
            Intrinsics.checkNotNullExpressionValue(str3, "");
            sbS.append(str3);
            string = sbS.toString();
        }
        return string;
    }

    private static boolean AFKeystoreWrapper(@NotNull Object... objArr) {
        Intrinsics.checkNotNullParameter(objArr, "");
        return !kotlin.collections.d.I(objArr, null);
    }
}
