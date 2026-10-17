package jue;

import dj0.d;
import java.util.ArrayList;
import java.util.List;
import qte.b;
import rue.a;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public abstract class a {
    public static final b a(a.e eVar) {
        d dVarO = mo3.a.o(eVar.getTotal());
        List<a.b> breakdown = eVar.getBreakdown();
        ArrayList arrayList = new ArrayList(w.t(breakdown, 10));
        for (a.b bVar : breakdown) {
            arrayList.add(new qte.a(mo3.a.o(bVar.getValue()), bVar.getType(), bVar.getShortDescription(), bVar.getTitle(), bVar.getDescription()));
        }
        return new b(dVarO, arrayList);
    }
}
