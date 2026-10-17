package jv5;

import au6.u;
import com.revolut.feature.crypto_investments.api.widget.investments.sorting.CryptoInvestmentsSortingType;
import com.revolut.feature.crypto_investments.models.SplitAccountsItemGroup;
import gim.i;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import vkm.q;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f178767w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f178768x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ e f178769y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Continuation continuation, e eVar, int i) {
        super(3, continuation);
        this.u = i;
        this.f178769y = eVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                c cVar = new c(continuation, this.f178769y, 0);
                cVar.f178767w = flowCollector;
                cVar.f178768x = obj3;
                return cVar.invokeSuspend(Unit.f186387a);
            default:
                c cVar2 = new c(continuation, this.f178769y, 1);
                cVar2.f178767w = flowCollector;
                cVar2.f178768x = obj3;
                return cVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Flow flowQ;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector = this.f178767w;
                    Continuation continuation = null;
                    if (((Boolean) this.f178768x).booleanValue()) {
                        flowQ = new go.g(SplitAccountsItemGroup.Empty.f71455a, 2);
                    } else {
                        e eVar = this.f178769y;
                        flowQ = q.Q(new t38.e(eVar.f178779t, 24, eVar.f178773m.c(), new u(3, 5, (Continuation) null)), new c(continuation, eVar, 1));
                    }
                    this.f178767w = null;
                    this.f178768x = null;
                    this.v = 1;
                    if (q.u(flowCollector, flowQ, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector2 = this.f178767w;
                    Pair pair = (Pair) this.f178768x;
                    boolean zBooleanValue = ((Boolean) pair.f186385a).booleanValue();
                    CryptoInvestmentsSortingType sortingType = (CryptoInvestmentsSortingType) pair.f186386b;
                    e eVar2 = this.f178769y;
                    a5h.g gVar = eVar2.f178772l;
                    st5.b itemsLimit = st5.b.FIVE;
                    gVar.getClass();
                    Intrinsics.checkNotNullParameter(sortingType, "sortingType");
                    Intrinsics.checkNotNullParameter(itemsLimit, "itemsLimit");
                    v0b.b bVarH = ta6.a.h(new t38.e(((ut5.h) gVar.e).B(), 24, mo3.a.e(((ut5.c) gVar.d).c(), new jul.c(3), new jul.c(4)), new h(gVar, itemsLimit, zBooleanValue, sortingType, null)), eVar2.f178775p.B(), eVar2.o.e(w4l.h.f294642c), new d(eVar2, null));
                    this.f178767w = null;
                    this.f178768x = null;
                    this.v = 1;
                    if (q.u(flowCollector2, bVarH, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
