package dmj;

import com.google.crypto.tink.shaded.protobuf.t1;
import dfj.g1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import vkm.j2;
import vkm.v1;

/* JADX INFO: loaded from: classes11.dex */
public final class i0 extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f116163w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f116164x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_checkout.c f116165y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(int i, com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_checkout.c cVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f116165y = cVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                i0 i0Var = new i0(0, this.f116165y, continuation);
                i0Var.f116163w = flowCollector;
                i0Var.f116164x = obj3;
                return i0Var.invokeSuspend(Unit.f186387a);
            case 1:
                i0 i0Var2 = new i0(1, this.f116165y, continuation);
                i0Var2.f116163w = flowCollector;
                i0Var2.f116164x = obj3;
                return i0Var2.invokeSuspend(Unit.f186387a);
            case 2:
                i0 i0Var3 = new i0(2, this.f116165y, continuation);
                i0Var3.f116163w = flowCollector;
                i0Var3.f116164x = obj3;
                return i0Var3.invokeSuspend(Unit.f186387a);
            case 3:
                i0 i0Var4 = new i0(3, this.f116165y, continuation);
                i0Var4.f116163w = flowCollector;
                i0Var4.f116164x = obj3;
                return i0Var4.invokeSuspend(Unit.f186387a);
            default:
                i0 i0Var5 = new i0(4, this.f116165y, continuation);
                i0Var5.f116163w = flowCollector;
                i0Var5.f116164x = obj3;
                return i0Var5.invokeSuspend(Unit.f186387a);
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
                    FlowCollector flowCollector = this.f116163w;
                    com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_checkout.c cVar = this.f116165y;
                    v1 v1VarD = c8g.a.D(xam.a.h(new k0(cVar, null), cVar.z.B(j0.f116167a)));
                    this.f116163w = null;
                    this.f116164x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, v1VarD, this) == aVar) {
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
                    FlowCollector flowCollector2 = this.f116163w;
                    com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_checkout.c cVar2 = this.f116165y;
                    Flow flowH = xam.a.h(new p0(cVar2, null), xam.a.h(new o0(cVar2, null), c8g.a.D(cVar2.z.B(m0.f116172a))));
                    this.f116163w = null;
                    this.f116164x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, flowH, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector3 = this.f116163w;
                    com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_checkout.c cVar3 = this.f116165y;
                    bej.e eVar = cVar3.f101382p;
                    String idempotencyKey = ((a0) ((j2) cVar3.z.f22677a).getValue()).f116135b;
                    String subscriptionId = cVar3.o.f101371a;
                    g1 g1Var = (g1) eVar;
                    g1Var.getClass();
                    Intrinsics.checkNotNullParameter(idempotencyKey, "idempotencyKey");
                    Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
                    nfj.f0 f0Var = g1Var.f113977b;
                    f0Var.getClass();
                    Intrinsics.checkNotNullParameter(idempotencyKey, "idempotencyKey");
                    Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
                    Continuation continuation = null;
                    Flow flowE = t1.E(rd0.e.e(new v1(new mtj.i(f0Var, idempotencyKey, subscriptionId, continuation, 11)), m72.b.w("EsimMobilePlanPhoneNumberCheckoutRepositoryImpl", "observeEsimPhoneNumberCheckout"), new im2.b(3, 21, continuation)));
                    this.f116163w = null;
                    this.f116164x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector3, flowE, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector4 = this.f116163w;
                    vkm.d dVarB = rd0.e.b(this.f116165y.f101384r.c(true));
                    this.f116163w = null;
                    this.f116164x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector4, dVarB, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector5 = this.f116163w;
                    com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_checkout.c cVar4 = this.f116165y;
                    vkm.d dVarA = cVar4.f101385s.a(cVar4.o.f101371a, w4l.h.f294642c);
                    this.f116163w = null;
                    this.f116164x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector5, dVarA, this) == aVar5) {
                        return aVar5;
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
