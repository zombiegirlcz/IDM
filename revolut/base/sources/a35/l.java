package a35;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import vkm.y;
import zh9.u0;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final class l implements pfe.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f1065a;

    public l(n creditProductsMediator) {
        Intrinsics.checkNotNullParameter(creditProductsMediator, "creditProductsMediator");
        this.f1065a = creditProductsMediator;
    }

    @Override // pfe.g
    public final Flow a() {
        Set<Map.Entry> setEntrySet = ((q) this.f1065a).f1072a.entrySet();
        ArrayList arrayList = new ArrayList(w.t(setEntrySet, 10));
        for (Map.Entry entry : setEntrySet) {
            arrayList.add(nim.a.v(((i) entry.getValue()).l(), new o((Class) entry.getKey(), 0)));
        }
        y yVar = new y(new j(2, 0, null), vkm.q.q(nim.a.v(u0.k(arrayList), new b(5))));
        h0 h0Var = h0.f322473a;
        return rd0.e.e(mo3.a.g(rd0.e.n(yVar, h0Var), null, new a08.n(17), 1), h0Var, new k(3, 0, null));
    }

    @Override // pfe.g
    public final Flow d(sfe.a dataLoadingMode) {
        Intrinsics.checkNotNullParameter(dataLoadingMode, "dataLoadingMode");
        Flow flowA = ((q) this.f1065a).a(c8g.c.C(dataLoadingMode));
        k kVar = new k(3, 1, null);
        h0 h0Var = h0.f322473a;
        return rd0.e.n(rd0.e.e(flowA, h0Var, kVar), h0Var);
    }
}
