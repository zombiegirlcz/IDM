package q2e;

import com.revolut.data.model.Data;
import com.revolut.feature.store.api.model.StoreCampaignParams;
import com.revolut.feature.store.api.model.StoreGiftcardsOffer;
import com.revolut.feature.store.impl.ui.brand_detail.flow.StoreBrandDetailFlowContract$InputData;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes7.dex */
public final class a0 extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f241564w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f241565x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.store.impl.ui.brand_detail.flow.c f241566y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(Continuation continuation, com.revolut.feature.store.impl.ui.brand_detail.flow.c cVar, int i) {
        super(3, continuation);
        this.u = i;
        this.f241566y = cVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                a0 a0Var = new a0(continuation, this.f241566y, 0);
                a0Var.f241564w = flowCollector;
                a0Var.f241565x = obj3;
                return a0Var.invokeSuspend(Unit.f186387a);
            case 1:
                a0 a0Var2 = new a0(continuation, this.f241566y, 1);
                a0Var2.f241564w = flowCollector;
                a0Var2.f241565x = obj3;
                return a0Var2.invokeSuspend(Unit.f186387a);
            case 2:
                a0 a0Var3 = new a0(continuation, this.f241566y, 2);
                a0Var3.f241564w = flowCollector;
                a0Var3.f241565x = obj3;
                return a0Var3.invokeSuspend(Unit.f186387a);
            case 3:
                a0 a0Var4 = new a0(continuation, this.f241566y, 3);
                a0Var4.f241564w = flowCollector;
                a0Var4.f241565x = obj3;
                return a0Var4.invokeSuspend(Unit.f186387a);
            default:
                a0 a0Var5 = new a0(continuation, this.f241566y, 4);
                a0Var5.f241564w = flowCollector;
                a0Var5.f241565x = obj3;
                return a0Var5.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Flow gVar;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f241564w;
                    Pair pair = (Pair) this.f241565x;
                    String id10 = (String) pair.f186385a;
                    w4l.k loadingStrategy = (w4l.k) pair.f186386b;
                    if (id10 != null) {
                        com.revolut.feature.store.impl.ui.brand_detail.flow.c cVar = this.f241566y;
                        l2e.a aVar2 = cVar.f88663p;
                        String source = cVar.o.f88651a;
                        StoreCampaignParams params = new StoreCampaignParams(id10, source);
                        aVar2.getClass();
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                        g2e.r rVar = aVar2.f191789a;
                        g2e.h params2 = new g2e.h(id10, source, null);
                        rVar.getClass();
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                        String strZ = rVar.e.z();
                        x4l.c cVar2 = rVar.f140026j;
                        Intrinsics.checkNotNullParameter(id10, "id");
                        Intrinsics.checkNotNullParameter(source, "source");
                        gVar = cVar2.b(new g2e.h(id10, source, strZ), loadingStrategy);
                    } else {
                        gVar = new go.g(new Data(null, null, false, 3, null), 2);
                    }
                    this.f241564w = null;
                    this.f241565x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, gVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = this.f241564w;
                    w4l.k kVar = (w4l.k) this.f241565x;
                    com.revolut.feature.store.impl.ui.brand_detail.flow.c cVar3 = this.f241566y;
                    l2e.a aVar4 = cVar3.f88663p;
                    StoreBrandDetailFlowContract$InputData storeBrandDetailFlowContract$InputData = cVar3.o;
                    vkm.d dVarA = aVar4.a(new t1e.u(storeBrandDetailFlowContract$InputData.f88651a, storeBrandDetailFlowContract$InputData.d), kVar);
                    this.f241564w = null;
                    this.f241565x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, dVarA, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector3 = this.f241564w;
                    vkm.d dVarB = rd0.e.b(this.f241566y.f88667t.c(Intrinsics.f((w4l.k) this.f241565x, w4l.i.f294643c)));
                    this.f241564w = null;
                    this.f241565x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector3, dVarB, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector4 = this.f241564w;
                    StoreGiftcardsOffer storeGiftcardsOffer = (StoreGiftcardsOffer) this.f241565x;
                    vii.b bVar = this.f241566y.D;
                    this.f241564w = null;
                    this.f241565x = null;
                    this.v = 1;
                    vkm.q.w(flowCollector4);
                    Object objCollect = bVar.f289601b.collect(new m0(flowCollector4, storeGiftcardsOffer, 0), this);
                    if (objCollect != aVar6) {
                        objCollect = Unit.f186387a;
                    }
                    if (objCollect != aVar6) {
                        objCollect = Unit.f186387a;
                    }
                    if (objCollect == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector5 = this.f241564w;
                    Pair pair2 = (Pair) this.f241565x;
                    StoreGiftcardsOffer storeGiftcardsOffer2 = (StoreGiftcardsOffer) pair2.f186385a;
                    Flow flowD = storeGiftcardsOffer2 != null ? this.f241566y.f88666s.d(storeGiftcardsOffer2.f88527a, (w4l.k) pair2.f186386b) : new go.g(new Data(null, null, false, 7, null), 2);
                    this.f241564w = null;
                    this.f241565x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector5, flowD, this) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
