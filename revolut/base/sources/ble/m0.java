package ble;

import com.revolut.feature.invest_feed.api.models.InvestWidgetContext;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes8.dex */
public final class m0 extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f16581w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f16582x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.tab.invest.impl.ui.home.f f16583y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(int i, com.revolut.feature.tab.invest.impl.ui.home.f fVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f16583y = fVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                m0 m0Var = new m0(0, this.f16583y, continuation);
                m0Var.f16581w = flowCollector;
                m0Var.f16582x = obj3;
                return m0Var.invokeSuspend(Unit.f186387a);
            default:
                m0 m0Var2 = new m0(1, this.f16583y, continuation);
                m0Var2.f16581w = flowCollector;
                m0Var2.f16582x = obj3;
                return m0Var2.invokeSuspend(Unit.f186387a);
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
                    FlowCollector flowCollector = this.f16581w;
                    Flow flowE = ((gld.f0) this.f16583y.Q).f144638l.e();
                    this.f16581w = null;
                    this.f16582x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, flowE, this) == aVar) {
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
                    FlowCollector flowCollector2 = this.f16581w;
                    ash.e eVar = this.f16583y.S;
                    InvestWidgetContext.INSTANCE.getClass();
                    ard.c0 c0VarC3 = eVar.c3(InvestWidgetContext.Companion.b(), dsh.s.ADD_NEW_WIDGET);
                    this.f16581w = null;
                    this.f16582x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, c0VarC3, this) == aVar2) {
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
