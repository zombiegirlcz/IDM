package mrl;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import orl.s;
import zhm.w;

/* JADX INFO: loaded from: classes12.dex */
public abstract class e {
    public static final k4l.j a(s sVar) {
        k4l.h hVar;
        Intrinsics.checkNotNullParameter(sVar, "<this>");
        dj0.d dVarO = mo3.a.o(sVar.getTotal());
        s.a breakdown = sVar.getBreakdown();
        if (breakdown != null) {
            Intrinsics.checkNotNullParameter(breakdown, "<this>");
            List<s.b> primary = breakdown.getPrimary();
            ArrayList arrayList = new ArrayList(w.t(primary, 10));
            for (s.b bVar : primary) {
                Intrinsics.checkNotNullParameter(bVar, "<this>");
                arrayList.add(new k4l.i(mo3.a.o(bVar.getInvestment()), bVar.getRef(), bVar.getSymbol()));
            }
            hVar = new k4l.h(breakdown.getOthersCount(), mo3.a.o(breakdown.getOthers()), arrayList);
        } else {
            hVar = null;
        }
        return new k4l.j(dVarO, hVar);
    }
}
