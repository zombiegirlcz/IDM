package lbc;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.feature.revolutpay.order_tracking.api.declaration.RevolutPayOrderTrackingCoreApi$Toggles$RevolutPayTrackingWidget;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import vge.f1;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class y extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f193653w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f193654x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.revolutpay.order_tracking.impl.ui.order_details.a f193655y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(int i, com.revolut.feature.revolutpay.order_tracking.impl.ui.order_details.a aVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f193655y = aVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                y yVar = new y(0, this.f193655y, continuation);
                yVar.f193653w = flowCollector;
                yVar.f193654x = obj3;
                return yVar.invokeSuspend(Unit.f186387a);
            default:
                y yVar2 = new y(1, this.f193655y, continuation);
                yVar2.f193653w = flowCollector;
                yVar2.f193654x = obj3;
                return yVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Flow gVar;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f193653w;
                    com.revolut.feature.revolutpay.order_tracking.impl.ui.order_details.a aVar2 = this.f193655y;
                    tul.b bVar = aVar2.f84625r;
                    String orderId = aVar2.o.f84619a;
                    bVar.getClass();
                    Intrinsics.checkNotNullParameter(orderId, "orderId");
                    qac.i iVar = (qac.i) bVar.f274637b;
                    Intrinsics.checkNotNullParameter(orderId, "orderId");
                    w4l.i loadingStrategy = w4l.i.f294643c;
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    int i2 = 0;
                    int i3 = 1;
                    Flow flowI = c6d.b.i(boh.f.e(nim.a.v(iVar.e.a(orderId, loadingStrategy), qac.f.f), new l3l.m(i3, aVar2, com.revolut.feature.revolutpay.order_tracking.impl.ui.order_details.a.class, "observeLinkedTransactions", "observeLinkedTransactions(Lcom/revolut/feature/revolutpay/order_tracking/models/delivery/TrackingOrderDetails;)Lkotlinx/coroutines/flow/Flow;", i2, 17)), new l3l.m(i3, aVar2, com.revolut.feature.revolutpay.order_tracking.impl.ui.order_details.a.class, "toTickerFlow", "toTickerFlow(Lcom/revolut/feature/revolutpay/order_tracking/impl/ui/order_details/OrderDetailsScreenModel$CompositeOrderDetails;)Lkotlinx/coroutines/flow/Flow;", i2, 18));
                    this.f193653w = null;
                    this.f193654x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, flowI, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = this.f193653w;
                    wac.d dVar = this.f193655y.f84626s;
                    Continuation continuation = null;
                    if (((jte.d) dVar.f295864b).c(RevolutPayOrderTrackingCoreApi$Toggles$RevolutPayTrackingWidget.f84601c)) {
                        gVar = rd0.e.e(vkm.q.H(new rch.o(2, dVar, wac.d.class, "isWidgetAvailable", "isWidgetAvailable(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 21), t1.E(new olf.e(((qac.i) dVar.f295863a.f274637b).d.C0("TRACKING_WIDGET_TIP_DISMISSED_KEY", Boolean.TYPE), 25))), h0.f322473a, new f1(3, 17, continuation));
                    } else {
                        gVar = new go.g(Boolean.FALSE, 2);
                    }
                    this.f193653w = null;
                    this.f193654x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, gVar, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
