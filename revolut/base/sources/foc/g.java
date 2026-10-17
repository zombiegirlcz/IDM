package foc;

import com.revolut.core.ui_kit.models.Clause;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.h0;
import zhm.d0;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class g {
    public static ArrayList a(hoc.d dVar, Function1 function1, pdh.c cVar, h0 h0Var) {
        List listP0 = d0.P0(dVar.a(), new d());
        long startMillis = dVar.getStartMillis();
        long endMillis = dVar.getEndMillis();
        long jB = listP0.size() > 1 ? ((c.f136918a[cVar.ordinal()] == 1 ? ((hoc.h) d0.m0(listP0)).b() : endMillis) - startMillis) / ((long) (listP0.size() - 1)) : 0L;
        long j2 = endMillis - startMillis;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj2 : listP0) {
            int i2 = i + 1;
            hw0.k kVar = null;
            if (i < 0) {
                v.s();
                throw null;
            }
            hoc.h hVar = (hoc.h) obj2;
            BigDecimal bigDecimal = (BigDecimal) h0Var.invoke(hVar);
            if (bigDecimal != null) {
                kVar = new hw0.k((String) null, bigDecimal.floatValue(), ((int) (((((long) i) * jB) / j2) * 1000.0f)) / 1000.0f, (iw0.a) null, function1.invoke(hVar), (Clause) null, 41);
            }
            if (kVar != null) {
                arrayList.add(kVar);
            }
            i = i2;
        }
        return arrayList;
    }
}
