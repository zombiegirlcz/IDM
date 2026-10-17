package jqj;

import com.revolut.data.model.Data;
import com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval;
import com.revolut.retail.feature.impl.analytics_cycle.network.AnalyticsSpendingCycleService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import vkm.q;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f177733w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(h hVar, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f177733w = hVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                return new d(this.f177733w, continuation, 0).invokeSuspend(Unit.f186387a);
            default:
                return new d(this.f177733w, continuation, 1).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        AnalyticsSpendingPeriod$Interval analyticsSpendingPeriod$Interval;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    AnalyticsSpendingCycleService analyticsSpendingCycleService = this.f177733w.f177738c;
                    this.v = 1;
                    obj2 = analyticsSpendingCycleService.getSpendingCycle(this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return hqj.b.c((hqj.c) obj2);
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                h hVar = this.f177733w;
                if (i2 == 0) {
                    o.b(obj2);
                    jij.d dVar = new jij.d(hVar.e.c(Unit.f186387a, true), 8);
                    this.v = 1;
                    obj2 = q.x(dVar, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                lzi.h hVar2 = (lzi.h) ((Data) obj2).getContent();
                kzi.a aVar3 = hVar.d;
                if (hVar2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                lzi.j jVar = (lzi.j) hVar.f177737b.get("KEY_PERIOD");
                return ((gqj.c) aVar3).d((jVar == null || (analyticsSpendingPeriod$Interval = jVar.f200981b) == null) ? null : analyticsSpendingPeriod$Interval.f99210a, hVar2);
        }
    }
}
