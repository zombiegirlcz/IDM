package rpb;

import com.revolut.data.model.Data;
import com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import rp0.n0;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class r implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f256338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f256339b;

    public /* synthetic */ r(u uVar, int i) {
        this.f256338a = i;
        this.f256339b = uVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Flow flowV;
        f fVar;
        Object next;
        f fVar2;
        int i = this.f256338a;
        u uVar = this.f256339b;
        switch (i) {
            case 0:
                vf0.h hVar = (vf0.h) obj2;
                Intrinsics.checkNotNullParameter(hVar, "<destruct>");
                List list = (List) hVar.f288433a;
                xi0.b bVar = (xi0.b) hVar.f288434b;
                o oVar = (o) hVar.f288435c;
                Pair pair = (Pair) hVar.d;
                g gVar = (g) pair.f186385a;
                g gVar2 = (g) pair.f186386b;
                djb.p pVar = uVar.d;
                akg.n nVarC = ((rnb.r) pVar).c(gVar.f256316b, gVar.f256317c, list, bVar);
                od0.i iVar = od0.i.f224256b;
                if (gVar2 == null) {
                    od0.i.Companion.getClass();
                    flowV = new go.g(new Data(iVar, null, false, 6, null), 2);
                } else {
                    List list2 = list;
                    if ((list2 instanceof Collection) && list2.isEmpty()) {
                        od0.i.Companion.getClass();
                        flowV = new go.g(new Data(iVar, null, false, 6, null), 2);
                    } else {
                        Iterator it8 = list2.iterator();
                        while (it8.hasNext()) {
                            if (oc.c.I(((pcd.s) it8.next()).i.getMillis()).compareTo((ChronoLocalDate) gVar.f256316b) < 0) {
                                flowV = nim.a.v(((rnb.r) pVar).c(gVar2.f256316b, gVar2.f256317c, list, bVar), new rnb.u(1, od0.i.Companion, od0.h.class, "of", "of(Ljava/lang/Object;)Lcom/revolut/core/common/Optional;", 0, 5));
                            }
                        }
                        od0.i.Companion.getClass();
                        flowV = new go.g(new Data(iVar, null, false, 6, null), 2);
                    }
                }
                return nim.a.v(u0.m(nVarC, flowV), new qz9.o(gVar, 23, gVar2, oVar));
            case 1:
                lzi.h cycle = (lzi.h) obj2;
                Intrinsics.checkNotNullParameter(cycle, "cycle");
                lzi.j jVarD = ((gqj.c) uVar.k).d(null, cycle);
                if (cycle instanceof lzi.g) {
                    fVar = f.WEEKLY;
                } else {
                    if (!(cycle instanceof lzi.c) && !(cycle instanceof lzi.e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    fVar = f.MONTHLY;
                }
                AnalyticsSpendingPeriod$Interval analyticsSpendingPeriod$Interval = jVarD.f200981b;
                return new g(fVar, analyticsSpendingPeriod$Interval.f99210a, analyticsSpendingPeriod$Interval.f99211b);
            case 2:
                vf0.h hVar2 = (vf0.h) obj2;
                Intrinsics.checkNotNullParameter(hVar2, "<destruct>");
                List list3 = (List) hVar2.f288433a;
                xi0.b bVar2 = (xi0.b) hVar2.f288434b;
                o oVar2 = (o) hVar2.f288435c;
                g gVar3 = (g) hVar2.d;
                return nim.a.v(((rnb.r) uVar.d).e(gVar3.f256316b, gVar3.f256317c, list3, bVar2), new rgf.m(gVar3, oVar2, 20));
            case 3:
                pcd.s vault = (pcd.s) obj2;
                Intrinsics.checkNotNullParameter(vault, "vault");
                pcd.a aVarA = opg.c.a(vault);
                String str = aVarA != null ? aVarA.f234844g : null;
                if (str != null && str.length() != 0) {
                    return nim.a.v(uVar.f256350n.j(str, w4l.h.f294642c), new n0(18));
                }
                IllegalStateException illegalStateException = new IllegalStateException(j6.a.q("No challenge account id for vault: ", vault.f234881a));
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                return new go.g(new Data(null, illegalStateException, false, 5, null), 2);
            default:
                lzi.h cycle2 = (lzi.h) obj2;
                Intrinsics.checkNotNullParameter(cycle2, "cycle");
                kzi.a aVar = uVar.k;
                AnalyticsSpendingPeriod$Interval analyticsSpendingPeriod$Interval2 = ((gqj.c) aVar).d(null, cycle2).f200981b;
                LocalDate localDate = analyticsSpendingPeriod$Interval2.f99210a;
                LocalDate localDate2 = analyticsSpendingPeriod$Interval2.f99211b;
                LocalDate localDateMinusDays = localDate.minusDays(oc.c.h(localDate, localDate2));
                Intrinsics.h(localDateMinusDays);
                Iterator it9 = ((gqj.c) aVar).a(localDateMinusDays, cycle2).iterator();
                while (true) {
                    if (it9.hasNext()) {
                        next = it9.next();
                        if (Intrinsics.f(((AnalyticsSpendingPeriod$Interval) next).f99211b, localDate.minusDays(1L))) {
                        }
                    } else {
                        next = null;
                    }
                }
                AnalyticsSpendingPeriod$Interval analyticsSpendingPeriod$Interval3 = (AnalyticsSpendingPeriod$Interval) next;
                if (cycle2 instanceof lzi.g) {
                    fVar2 = f.WEEKLY;
                } else {
                    if (!(cycle2 instanceof lzi.c) && !(cycle2 instanceof lzi.e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    fVar2 = f.MONTHLY;
                }
                return new Pair(new g(fVar2, localDate, localDate2), analyticsSpendingPeriod$Interval3 != null ? new g(fVar2, analyticsSpendingPeriod$Interval3.f99210a, analyticsSpendingPeriod$Interval3.f99211b) : null);
        }
    }
}
