package ulm;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchGroup;

/* JADX INFO: loaded from: classes13.dex */
public final class a1 {
    public static b1 a(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.text.o oVarD = b1.e.d(0, str);
        if (oVarD == null) {
            throw new IllegalArgumentException(p.a.l(CoreConstants.DOUBLE_QUOTE_CHAR, "No subtype found for: \"", str));
        }
        String str2 = (String) ((kotlin.text.m) oVarD.c()).get(1);
        Locale locale = Locale.ROOT;
        String lowerCase = str2.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String lowerCase2 = ((String) ((kotlin.text.m) oVarD.c()).get(2)).toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        ArrayList arrayList = new ArrayList();
        int i = oVarD.getRange().f186449b;
        while (true) {
            int i2 = i + 1;
            if (i2 >= str.length()) {
                return new b1(str, lowerCase, lowerCase2, (String[]) arrayList.toArray(new String[0]));
            }
            kotlin.text.o oVarD2 = b1.f.d(i2, str);
            if (oVarD2 == null) {
                StringBuilder sb6 = new StringBuilder("Parameter is not formatted correctly: \"");
                String strSubstring = str.substring(i2);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                sb6.append(strSubstring);
                sb6.append("\" for: \"");
                throw new IllegalArgumentException(j6.a.u(sb6, str, CoreConstants.DOUBLE_QUOTE_CHAR).toString());
            }
            kotlin.text.n nVar = oVarD2.f187921c;
            MatchGroup matchGroupA = nVar.a(1);
            String strA = matchGroupA != null ? matchGroupA.getF187889a() : null;
            if (strA == null) {
                i = oVarD2.getRange().f186449b;
            } else {
                MatchGroup matchGroupA2 = nVar.a(2);
                String strA2 = matchGroupA2 != null ? matchGroupA2.getF187889a() : null;
                if (strA2 == null) {
                    MatchGroup matchGroupA3 = nVar.a(3);
                    Intrinsics.h(matchGroupA3);
                    strA2 = matchGroupA3.getF187889a();
                } else if (kotlin.text.d0.r0(CoreConstants.SINGLE_QUOTE_CHAR, strA2) && kotlin.text.d0.L(strA2, CoreConstants.SINGLE_QUOTE_CHAR) && strA2.length() > 2) {
                    strA2 = strA2.substring(1, strA2.length() - 1);
                    Intrinsics.checkNotNullExpressionValue(strA2, "substring(...)");
                }
                arrayList.add(strA);
                arrayList.add(strA2);
                i = oVarD2.getRange().f186449b;
            }
        }
    }

    public static b1 b(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            return a(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
