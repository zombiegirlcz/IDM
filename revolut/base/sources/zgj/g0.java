package zgj;

import com.revolut.retail.feature.esim.api.model.EsimGiftRecipient;
import com.revolut.retail.feature.esim.impl.ui.screens.checkout.EsimCheckoutScreenContract$InputData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes11.dex */
public final class g0 extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f322157w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f322158x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.esim.impl.ui.screens.checkout.a f322159y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(int i, com.revolut.retail.feature.esim.impl.ui.screens.checkout.a aVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f322159y = aVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                g0 g0Var = new g0(0, this.f322159y, continuation);
                g0Var.f322157w = flowCollector;
                g0Var.f322158x = obj3;
                return g0Var.invokeSuspend(Unit.f186387a);
            case 1:
                g0 g0Var2 = new g0(1, this.f322159y, continuation);
                g0Var2.f322157w = flowCollector;
                g0Var2.f322158x = obj3;
                return g0Var2.invokeSuspend(Unit.f186387a);
            case 2:
                g0 g0Var3 = new g0(2, this.f322159y, continuation);
                g0Var3.f322157w = flowCollector;
                g0Var3.f322158x = obj3;
                return g0Var3.invokeSuspend(Unit.f186387a);
            default:
                g0 g0Var4 = new g0(3, this.f322159y, continuation);
                g0Var4.f322157w = flowCollector;
                g0Var4.f322158x = obj3;
                return g0Var4.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String strN;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f322157w;
                    com.revolut.retail.feature.esim.impl.ui.screens.checkout.a aVar2 = this.f322159y;
                    Flow flowH = xam.a.h(new f0(2, aVar2, null), c8g.a.D(aVar2.H.B(h0.f322161a)));
                    this.f322157w = null;
                    this.f322158x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, flowH, this) == aVar) {
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
                    FlowCollector flowCollector2 = this.f322157w;
                    vkm.y yVarB = this.f322159y.v.b((w4l.k) this.f322158x);
                    this.f322157w = null;
                    this.f322158x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, yVarB, this) == aVar3) {
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
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector3 = this.f322157w;
                    com.revolut.retail.feature.esim.impl.ui.screens.checkout.a aVar5 = this.f322159y;
                    t38.e eVarB = aVar5.f100923s.b(w4l.i.f294643c);
                    vkm.d dVarA = aVar5.f100924t.a(w4l.h.f294642c);
                    dfj.w wVar = aVar5.f100921q;
                    EsimCheckoutScreenContract$InputData esimCheckoutScreenContract$InputData = aVar5.f100920p;
                    String str = esimCheckoutScreenContract$InputData.f100907a;
                    EsimGiftRecipient esimGiftRecipient = esimCheckoutScreenContract$InputData.f100909c;
                    if (esimGiftRecipient != null) {
                        aVar5.G.getClass();
                        strN = ugc.a.n(esimGiftRecipient);
                    } else {
                        strN = null;
                    }
                    j23.b bVarE = yh5.b.e(eVarB, dVarA, c8g.a.D(wVar.c(str, strN)));
                    this.f322157w = null;
                    this.f322158x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector3, bVarE, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector4 = this.f322157w;
                    vkm.d dVarB = rd0.e.b(this.f322159y.A.b());
                    this.f322157w = null;
                    this.f322158x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector4, dVarB, this) == aVar6) {
                        return aVar6;
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
