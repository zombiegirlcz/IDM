package p8k;

import com.revolut.core.model.account.AccountId;
import com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.transfer.PaymentLinksTransferData;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import com.revolut.shared.feature.market_data.models.domain.models.OrderRate;
import efm.r;
import imh.y;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import l1l.p;
import l1l.q;
import mif.e0;
import te0.w;
import ukm.i0;
import vkm.v1;
import yhm.o;
import zhm.f0;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends gim.i implements Function3 {
    public /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int u = 1;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f234165w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ long f234166x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f234167y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(long j2, Continuation continuation, Flow flow) {
        super(3, continuation);
        this.f234166x = j2;
        this.B = flow;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.u) {
            case 0:
                g gVar = new g((Continuation) obj4, (j) this.z, (OrderQuote) this.A, (PaymentLinksTransferData) this.B, this.f234166x);
                gVar.f234167y = (FlowCollector) obj2;
                gVar.f234165w = obj3;
                return gVar.invokeSuspend(Unit.f186387a);
            default:
                Flow flow = (Flow) this.B;
                g gVar2 = new g(this.f234166x, (Continuation) obj4, flow);
                gVar2.f234165w = (CoroutineScope) obj2;
                gVar2.A = (FlowCollector) obj3;
                return gVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        go.g gVar;
        int i;
        OrderRate orderRate;
        i0 i0VarZ;
        i0 i0VarZ2;
        Ref$ObjectRef ref$ObjectRef;
        FlowCollector flowCollector;
        int i2 = this.u;
        long j2 = this.f234166x;
        Object obj3 = this.B;
        Continuation continuation = null;
        int i3 = 0;
        int i5 = 2;
        switch (i2) {
            case 0:
                OrderQuote orderQuote = (OrderQuote) this.A;
                PaymentLinksTransferData paymentLinksTransferData = (PaymentLinksTransferData) obj3;
                j jVar = (j) this.z;
                Object obj4 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector2 = (FlowCollector) this.f234167y;
                    d dVar = (d) this.f234165w;
                    go.g gVar2 = new go.g(jVar.u.a(new l1l.g((orderQuote == null || (orderRate = orderQuote.f104757j) == null) ? null : Boolean.valueOf(orderRate.e))).f316033b, 2);
                    urf.f fVar = jVar.f234177r;
                    i iVar = new i(paymentLinksTransferData, dVar);
                    fVar.getClass();
                    v1 v1Var = new v1(new h(urf.f.a(iVar), null, 0));
                    u5k.c cVar = jVar.o;
                    r rVarH = w.h(dVar.f234162a);
                    r rVarH2 = w.h(paymentLinksTransferData.f102239j);
                    r rVarX = jVar.f234175p.x(AccountId.Personal.f51414a).x();
                    Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
                    r map = ((u5k.d) cVar).b(rVarH, rVarH2, rVarX).map(new b(i3, new p5e.h(jVar, paymentLinksTransferData, 4)));
                    Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                    vkm.d dVarB = rd0.e.b(map);
                    int i21 = e.f234164a[jVar.f234172l.getF102201c().ordinal()];
                    if (i21 != 1) {
                        i = 2;
                        if (i21 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        gVar = new go.g(f0.f322471a, 2);
                    } else {
                        srf.d dVar2 = jVar.f234176q;
                        ir8.c cVar2 = new ir8.c(paymentLinksTransferData, j2, orderQuote);
                        dVar2.getClass();
                        List list = srf.d.a(cVar2).f316033b;
                        i = 2;
                        gVar = new go.g(list, 2);
                    }
                    String str = paymentLinksTransferData.f;
                    jVar.f234179t.getClass();
                    go.g gVar3 = new go.g(q.a(str), i);
                    go.g gVar4 = new go.g(jVar.v.b(new p(orderQuote != null ? orderQuote.f104760n : null)).f316033b, i);
                    Flow[] flowArr = new Flow[6];
                    flowArr[0] = gVar2;
                    flowArr[1] = v1Var;
                    flowArr[i] = dVarB;
                    flowArr[3] = gVar;
                    flowArr[4] = gVar3;
                    flowArr[5] = gVar4;
                    this.f234167y = null;
                    this.f234165w = null;
                    this.v = 1;
                    vkm.q.w(flowCollector2);
                    Object objG = e0.g(this, new h52.c(flowArr, 27), new y(3, 15, null), flowCollector2, flowArr);
                    if (objG != fim.a.COROUTINE_SUSPENDED) {
                        objG = Unit.f186387a;
                    }
                    if (objG != fim.a.COROUTINE_SUSPENDED) {
                        objG = Unit.f186387a;
                    }
                    if (objG == obj4) {
                        return obj4;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 == 0) {
                    o.b(obj2);
                    CoroutineScope coroutineScope = (CoroutineScope) this.f234165w;
                    FlowCollector flowCollector3 = (FlowCollector) this.A;
                    i0VarZ = com.bumptech.glide.d.z(coroutineScope, -1, new oji.c(i5, continuation, (Flow) obj3), 1);
                    Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                    i0VarZ2 = com.bumptech.glide.d.z(coroutineScope, 0, new eh1.g(j2, null), 1);
                    ref$ObjectRef = ref$ObjectRef2;
                    flowCollector = flowCollector3;
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i0VarZ2 = (i0) this.z;
                    ref$ObjectRef = (Ref$ObjectRef) this.f234167y;
                    i0VarZ = (i0) this.A;
                    flowCollector = (FlowCollector) this.f234165w;
                    o.b(obj2);
                }
                while (ref$ObjectRef.f186409a != wkm.b.d) {
                    flm.h hVar = new flm.h(getContext());
                    hVar.h(i0VarZ.b(), new u29.c(ref$ObjectRef, i0VarZ2, continuation, 19));
                    hVar.h(i0VarZ2.g(), new vge.r(ref$ObjectRef, flowCollector, continuation, 22));
                    this.f234165w = flowCollector;
                    this.A = i0VarZ;
                    this.f234167y = ref$ObjectRef;
                    this.z = i0VarZ2;
                    this.v = 1;
                    if (hVar.d(this) == aVar) {
                        return aVar;
                    }
                }
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Continuation continuation, j jVar, OrderQuote orderQuote, PaymentLinksTransferData paymentLinksTransferData, long j2) {
        super(3, continuation);
        this.z = jVar;
        this.A = orderQuote;
        this.B = paymentLinksTransferData;
        this.f234166x = j2;
    }
}
