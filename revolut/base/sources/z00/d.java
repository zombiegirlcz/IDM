package z00;

import java.util.ArrayList;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.a0;
import kotlin.text.o;
import x00.j;
import zhm.d0;

/* JADX INFO: loaded from: classes16.dex */
public final class d implements x00.a {
    @Override // x00.a
    public final j a(ArrayList lines) {
        String value;
        o oVarB;
        String value2;
        String strL;
        Intrinsics.checkNotNullParameter(lines, "lines");
        String strD = a0.D(d0.k0(lines, "", null, null, 0, null, 62), " ", "", false);
        b.Companion.getClass();
        Regex regex = b.f318154c;
        o oVarB2 = regex.b(strD);
        if (oVarB2 != null && (value = oVarB2.getValue()) != null) {
            Intrinsics.checkNotNullParameter(value, "<this>");
            String strA = pu7.a.a(value, "<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
            if (strA != null) {
                Intrinsics.checkNotNullParameter(strA, "<this>");
                String upperCase = strA.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                String strE = a0.E(upperCase, '0', 'O');
                if (strE != null) {
                    if (!regex.f(strE)) {
                        strE = null;
                    }
                    if (strE != null && (oVarB = b.e.b(strD)) != null && (value2 = oVarB.getValue()) != null) {
                        Intrinsics.checkNotNullParameter(value2, "<this>");
                        String strA2 = pu7.a.a(value2, "<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<00");
                        if (strA2 != null && (strL = pw5.a.L(strA2)) != null) {
                            if (!b.d.f(strL)) {
                                strL = null;
                            }
                            if (strL != null) {
                                return new b(strE, strL);
                            }
                        }
                    }
                }
            }
        }
        return null;
    }
}
