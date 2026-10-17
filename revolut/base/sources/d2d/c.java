package d2d;

import cp5.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import skm.e0;
import skm.p0;
import zhm.d0;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class c {
    public static ArrayList b(List list, xi0.b bVar) {
        ArrayList arrayListA0 = d0.A0(list, bVar);
        ArrayList arrayList = new ArrayList(w.t(arrayListA0, 10));
        Iterator it8 = arrayListA0.iterator();
        while (it8.hasNext()) {
            v1.c.A(arrayList, bVar, (xi0.b) it8.next());
        }
        return arrayList;
    }

    public static String c(xi0.b bVar) {
        String strE = d.e(bVar);
        if (strE.length() == 0) {
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
            strE = d.q(locale, bVar);
            if (strE == null) {
                return bVar.f306286a;
            }
        }
        return strE;
    }

    public final Object a(List list, String str, int i, gim.c cVar) {
        if (str.length() <= 0 || i <= 0) {
            return str.length() > 0 ? e0.J(p0.f264002b, new chf.a(this, str, list, null, 7), cVar) : e0.J(p0.f264002b, new cn0.d(list, i, this, (Continuation) null), cVar);
        }
        return f0.f322471a;
    }
}
