package lsj;

import h30.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class c extends q implements Function1 {
    public static final c f = new c();

    public c() {
        super(1, ksj.b.class, "toEntity", "toEntity(Lcom/revolut/retail/feature/impl/budgeting_cycle/network/AnalyticsCycleNetworkDto;)Lcom/revolut/retail/feature/api/budgeting_cycle/models/BudgetingCycle;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        uzi.c cVar;
        ksj.c p0 = (ksj.c) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p0, "<this>");
        String period = p0.getPeriod();
        if (Intrinsics.f(period, "MONTHLY")) {
            cVar = uzi.c.MONTHLY;
        } else {
            if (!Intrinsics.f(period, "WEEKLY")) {
                throw new IllegalStateException(l.r("Unexpected cycle period: ", p0.getPeriod()));
            }
            cVar = uzi.c.WEEKLY;
        }
        return new uzi.b(cVar, p0.getStart());
    }
}
