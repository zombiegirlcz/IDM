package vfg;

import com.revolut.feature.rev_points.models.RevPointsTransaction;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import lfg.k0;
import nyb.m0;
import te0.w;

/* JADX INFO: loaded from: classes9.dex */
public final class t implements gfg.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k0 f288639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m0 f288640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.b f288641c;
    public final Object d;

    public t(k0 milesTransactionsRepository, m0 revPointsTransactionsInteractor, yk0.d schedulerProvider) {
        Intrinsics.checkNotNullParameter(milesTransactionsRepository, "milesTransactionsRepository");
        Intrinsics.checkNotNullParameter(revPointsTransactionsInteractor, "revPointsTransactionsInteractor");
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        this.f288639a = milesTransactionsRepository;
        this.f288640b = revPointsTransactionsInteractor;
        this.f288641c = j6.a.h("create(...)");
        this.d = w.y0(new s(this, schedulerProvider));
    }

    public final boolean a(String str) {
        lk0.g gVar = (lk0.g) this.f288641c.f();
        if (gVar != null) {
            List list = gVar.f196174a;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    List list2 = ((lk0.e) it8.next()).f196171a;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator it9 = list2.iterator();
                        while (it9.hasNext()) {
                            if (Intrinsics.f(((RevPointsTransaction) it9.next()).f84054a, str)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final efm.r b(gfg.b pageParams, int i) {
        k0 k0Var = this.f288639a;
        k0Var.getClass();
        Intrinsics.checkNotNullParameter(pageParams, "pageParams");
        efm.r rVarFlatMap = k0Var.e.e(pageParams, w4l.i.f294643c).flatMap(new vf0.n(new abf.n(i, this, 28), 23));
        Intrinsics.checkNotNullExpressionValue(rVarFlatMap, "flatMap(...)");
        return yoj.b.p(rVarFlatMap);
    }
}
