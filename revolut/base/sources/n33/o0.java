package n33;

import com.revolut.feature.card_order_new.api.CardOrderAccountWrapper;
import com.revolut.feature.card_order_new.api.SelectedTab;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes21.dex */
public final class o0 extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f211772w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f211773x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ t0 f211774y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0(Continuation continuation, t0 t0Var, int i) {
        super(3, continuation);
        this.u = i;
        this.f211774y = t0Var;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                o0 o0Var = new o0(continuation, this.f211774y, 0);
                o0Var.f211772w = flowCollector;
                o0Var.f211773x = obj3;
                return o0Var.invokeSuspend(Unit.f186387a);
            default:
                o0 o0Var2 = new o0(continuation, this.f211774y, 1);
                o0Var2.f211772w = flowCollector;
                o0Var2.f211773x = obj3;
                return o0Var2.invokeSuspend(Unit.f186387a);
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
                    FlowCollector flowCollector = this.f211772w;
                    SelectedTab selectedTab = (SelectedTab) this.f211773x;
                    SelectedTab selectedTab2 = SelectedTab.CREDIT;
                    t0 t0Var = this.f211774y;
                    Flow flowV = selectedTab == selectedTab2 ? nim.a.v(t0Var.B.a(), new c(17)) : rd0.e.b(nim.a.w(t0Var.k.W(com.revolut.feature.card_order_new.api.a.a((CardOrderAccountWrapper) ((s2) t0Var.i).w0().get())), p0.f211779a));
                    this.f211772w = null;
                    this.f211773x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, flowV, this) == aVar) {
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
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = this.f211772w;
                    if (((Boolean) this.f211773x).booleanValue()) {
                        t0 t0Var2 = this.f211774y;
                        gVar = rd0.e.e(new n1g.p(mo3.a.g(((et6.g) t0Var2.o).d(w4l.h.f294642c), null, null, 3), t0Var2, 3), zhm.h0.f322473a, new n28.b(3, 7, null));
                    } else {
                        gVar = new go.g(Boolean.FALSE, 2);
                    }
                    this.f211772w = null;
                    this.f211773x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, gVar, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
