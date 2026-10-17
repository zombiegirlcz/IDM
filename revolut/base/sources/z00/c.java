package z00;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.f0;
import x00.j;

/* JADX INFO: loaded from: classes16.dex */
public final class c implements x00.a {
    @Override // x00.a
    public final j a(ArrayList lines) {
        String strE;
        String strL;
        Intrinsics.checkNotNullParameter(lines, "lines");
        Iterator it8 = lines.iterator();
        while (true) {
            if (!it8.hasNext()) {
                strE = null;
                break;
            }
            String str = (String) it8.next();
            if (a0.H(str, "P<", false)) {
                String strU0 = f0.U0(44, a0.D(str, " ", "", false));
                Intrinsics.checkNotNullParameter(strU0, "<this>");
                String strA = pu7.a.a(strU0, "<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
                Intrinsics.checkNotNullParameter(strA, "<this>");
                String upperCase = strA.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                strE = a0.E(upperCase, '0', 'O');
                b.Companion.getClass();
                if (b.f318154c.f(strE)) {
                    break;
                }
            }
        }
        if (strE != null) {
            Iterator it9 = lines.iterator();
            while (true) {
                if (!it9.hasNext()) {
                    strL = null;
                    break;
                }
                String strU02 = f0.U0(44, a0.D((String) it9.next(), " ", "", false));
                Intrinsics.checkNotNullParameter(strU02, "<this>");
                strL = pw5.a.L(pu7.a.a(strU02, "<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<00"));
                if (strL != null) {
                    b.Companion.getClass();
                    if (b.d.f(strL)) {
                        break;
                    }
                }
            }
            if (strL != null) {
                return new b(strE, strL);
            }
        }
        return null;
    }
}
