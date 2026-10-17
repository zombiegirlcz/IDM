package jqj;

import com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval;
import java.time.LocalDate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ h v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(h hVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = hVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e(this.v, continuation, 0);
            default:
                return new e(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((e) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        AnalyticsSpendingPeriod$Interval analyticsSpendingPeriod$Interval;
        int i = this.u;
        h hVar = this.v;
        LocalDate localDate = null;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                kqj.c cVar = (kqj.c) j6.a.k(kqj.c.class, hVar.f177736a, "KEY_CYCLE");
                if (cVar != null) {
                    return kqj.b.c(cVar);
                }
                return null;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                kqj.c cVar2 = (kqj.c) j6.a.k(kqj.c.class, hVar.f177736a, "KEY_CYCLE");
                if (cVar2 == null) {
                    return null;
                }
                lzi.h hVarC = kqj.b.c(cVar2);
                kzi.a aVar3 = hVar.d;
                lzi.j jVar = (lzi.j) hVar.f177737b.get("KEY_PERIOD");
                if (jVar != null && (analyticsSpendingPeriod$Interval = jVar.f200981b) != null) {
                    localDate = analyticsSpendingPeriod$Interval.f99210a;
                }
                return ((gqj.c) aVar3).d(localDate, hVarC);
        }
    }
}
