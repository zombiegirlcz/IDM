package jv;

import com.revolut.feature.unified_transactions.api.filter.UnifiedTransactionsFilter;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes16.dex */
public final class d extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public /* synthetic */ long v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f178700w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i, int i2, Continuation continuation) {
        super(i, continuation);
        this.u = i2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.u) {
            case 0:
                long jLongValue = ((Number) obj3).longValue();
                d dVar = new d(3, 0, (Continuation) obj4);
                dVar.f178700w = (xv.l) obj2;
                dVar.v = jLongValue;
                return dVar.invokeSuspend(Unit.f186387a);
            case 1:
                long jLongValue2 = ((Number) obj3).longValue();
                d dVar2 = new d(3, 1, (Continuation) obj4);
                dVar2.f178700w = (hrf.c) obj2;
                dVar2.v = jLongValue2;
                return dVar2.invokeSuspend(Unit.f186387a);
            default:
                long jLongValue3 = ((Number) obj2).longValue();
                d dVar3 = new d(3, 2, (Continuation) obj4);
                dVar3.v = jLongValue3;
                dVar3.f178700w = (Pair) obj3;
                return dVar3.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                xv.l lVar = (xv.l) this.f178700w;
                long j2 = this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return new Pair(lVar, new Long(j2));
            case 1:
                hrf.c cVar = (hrf.c) this.f178700w;
                long j3 = this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return new Pair(cVar, new Long(j3));
            default:
                long j5 = this.v;
                Pair pair = (Pair) this.f178700w;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return new jkg.a(new jkg.e((UnifiedTransactionsFilter) pair.f186385a, 100, (String) pair.f186386b, j5, null));
        }
    }
}
