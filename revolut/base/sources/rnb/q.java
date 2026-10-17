package rnb;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mif.e0;
import tof.a3;
import zhm.d0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class q implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f255576a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xi0.b f255577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LocalDate f255578c;

    public /* synthetic */ q(LocalDate localDate, xi0.b bVar) {
        this.f255578c = localDate;
        this.f255577b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        List listC;
        switch (this.f255576a) {
            case 0:
                ejb.e netBalanceStatisticsPeriod = (ejb.e) obj2;
                Intrinsics.checkNotNullParameter(netBalanceStatisticsPeriod, "netBalanceStatisticsPeriod");
                xi0.b bVar = this.f255577b;
                ejb.d dVar = new ejb.d(this.f255578c, new dj0.d(0L, bVar), new dj0.d(0L, bVar), new dj0.d(0L, bVar));
                List<ejb.d> list = netBalanceStatisticsPeriod.d;
                int iT = zhm.w.t(list, 9);
                if (iT == 0) {
                    listC = zhm.u.c(dVar);
                } else {
                    ArrayList arrayList = new ArrayList(iT + 1);
                    arrayList.add(dVar);
                    for (ejb.d dVar2 : list) {
                        ejb.d dVar3 = new ejb.d(dVar2.f126838a, pyd.c.O(dVar.f126839b, dVar2.f126839b), pyd.c.O(dVar.f126840c, dVar2.f126840c), pyd.c.O(dVar.d, dVar2.d));
                        arrayList.add(dVar3);
                        dVar = dVar3;
                    }
                    listC = arrayList;
                }
                return new ejb.e(netBalanceStatisticsPeriod.f126841a, netBalanceStatisticsPeriod.f126842b, netBalanceStatisticsPeriod.f126843c, d0.V(listC, 1));
            default:
                yhm.r rVar = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                List<a3> list2 = (List) rVar.f314201a;
                boolean zBooleanValue = ((Boolean) rVar.f314202b).booleanValue();
                List list3 = (List) rVar.f314203c;
                BigDecimal ZERO = BigDecimal.ZERO;
                Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
                xi0.b bVar2 = this.f255577b;
                ej0.b bVar3 = new ej0.b(ZERO, bVar2);
                Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
                ej0.b bVar4 = new ej0.b(ZERO, bVar2);
                Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
                ejb.f fVar = new ejb.f(bVar3, bVar4, new ej0.b(ZERO, bVar2));
                Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
                ej0.b bVar5 = new ej0.b(ZERO, bVar2);
                Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
                ej0.b bVar6 = new ej0.b(ZERO, bVar2);
                Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
                ejb.f fVar2 = new ejb.f(bVar5, bVar6, new ej0.b(ZERO, bVar2));
                for (a3 a3Var : list2) {
                    Date date = a3Var.f272593h.toDate();
                    Intrinsics.checkNotNullExpressionValue(date, "toDate(...)");
                    LocalDate localDateN = ebm.a.N(date);
                    ejb.f fVarI = r.i(bVar2, a3Var, list3);
                    fVar = e0.z(fVar, fVarI);
                    if (this.f255578c.compareTo((ChronoLocalDate) localDateN) <= 0) {
                        fVar2 = e0.z(fVar2, fVarI);
                    }
                }
                return new ejb.h(fVar, fVar2, zBooleanValue);
        }
    }

    public /* synthetic */ q(xi0.b bVar, r rVar, LocalDate localDate) {
        this.f255577b = bVar;
        this.f255578c = localDate;
    }
}
