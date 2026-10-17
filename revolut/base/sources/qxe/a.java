package qxe;

import jli.g;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import t61.j;
import zhm.d0;

/* JADX INFO: loaded from: classes8.dex */
public final class a {
    public static String a(j jVar, wi0.b userCountryCode) {
        Intrinsics.checkNotNullParameter(userCountryCode, "userCountryCode");
        if (jVar != null) {
            String str = jVar.f;
            wi0.b.Companion.getClass();
            if (Intrinsics.f(userCountryCode, wi0.b.X0)) {
                String[] elements = {str, jVar.f268166n};
                Intrinsics.checkNotNullParameter(elements, "elements");
                return d0.k0(d.L(elements), " ", null, null, 0, b.f, 30);
            }
            String strC = str != null ? g.c(str) : null;
            if (strC != null) {
                return strC;
            }
        }
        return "";
    }
}
