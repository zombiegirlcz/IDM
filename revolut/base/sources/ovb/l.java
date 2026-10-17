package ovb;

import com.revolut.data.model.Data;
import com.revolut.feature.store.core.api.model.StoreProduct;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import vkm.q;

/* JADX INFO: loaded from: classes6.dex */
public final class l extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f230022w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f230023x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.rev_points.exclusive_store.impl.ui.screen.checkout.d f230024y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i, com.revolut.feature.rev_points.exclusive_store.impl.ui.screen.checkout.d dVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f230024y = dVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                l lVar = new l(0, this.f230024y, continuation);
                lVar.f230022w = flowCollector;
                lVar.f230023x = obj3;
                return lVar.invokeSuspend(Unit.f186387a);
            case 1:
                l lVar2 = new l(1, this.f230024y, continuation);
                lVar2.f230022w = flowCollector;
                lVar2.f230023x = obj3;
                return lVar2.invokeSuspend(Unit.f186387a);
            default:
                l lVar3 = new l(2, this.f230024y, continuation);
                lVar3.f230022w = flowCollector;
                lVar3.f230023x = obj3;
                return lVar3.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f230022w;
                    com.revolut.feature.rev_points.exclusive_store.impl.ui.screen.checkout.d dVar = this.f230024y;
                    i4b.f fVar = dVar.f83606q;
                    String productId = dVar.o.f83596a;
                    fVar.getClass();
                    Intrinsics.checkNotNullParameter(productId, "productId");
                    w4l.i loadingStrategy = w4l.i.f294643c;
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    y1e.b bVar = (y1e.b) fVar.f158330b;
                    bVar.getClass();
                    Intrinsics.checkNotNullParameter(productId, "productId");
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    vkm.d dVarB = bVar.d.b(productId, loadingStrategy);
                    this.f230022w = null;
                    this.f230023x = null;
                    this.v = 1;
                    if (q.u(flowCollector, dVarB, this) == aVar) {
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
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = this.f230022w;
                    StoreProduct storeProduct = (StoreProduct) ((Data) this.f230023x).getContent();
                    Flow pVar = (storeProduct == null || !storeProduct.i) ? vkm.i.f290039a : new a07.p(this.f230024y.f83609t.j(w4l.h.f294642c), 29);
                    this.f230022w = null;
                    this.f230023x = null;
                    this.v = 1;
                    if (q.u(flowCollector2, pVar, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector3 = this.f230022w;
                    vkm.d dVarB2 = rd0.e.b(this.f230024y.f83607r.c(true));
                    this.f230022w = null;
                    this.f230023x = null;
                    this.v = 1;
                    if (q.u(flowCollector3, dVarB2, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
