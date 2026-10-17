package imk;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import vkm.j2;

/* JADX INFO: loaded from: classes11.dex */
public final class m0 extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f162529w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f162530x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.screen.g f162531y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(int i, com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.screen.g gVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f162531y = gVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                m0 m0Var = new m0(0, this.f162531y, continuation);
                m0Var.f162529w = flowCollector;
                m0Var.f162530x = obj3;
                return m0Var.invokeSuspend(Unit.f186387a);
            case 1:
                m0 m0Var2 = new m0(1, this.f162531y, continuation);
                m0Var2.f162529w = flowCollector;
                m0Var2.f162530x = obj3;
                return m0Var2.invokeSuspend(Unit.f186387a);
            default:
                m0 m0Var3 = new m0(2, this.f162531y, continuation);
                m0Var3.f162529w = flowCollector;
                m0Var3.f162530x = obj3;
                return m0Var3.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f162529w;
                    hha.d dVar = (hha.d) this.f162530x;
                    egk.e eVar = this.f162531y.u;
                    String currentPlanId = dVar.f152287a;
                    wik.t tVar = (wik.t) eVar;
                    tVar.getClass();
                    Intrinsics.checkNotNullParameter(currentPlanId, "currentPlanId");
                    kjk.u uVar = tVar.f297935a;
                    List enabledExperiments = tVar.c();
                    kjk.f0 f0Var = (kjk.f0) uVar;
                    f0Var.getClass();
                    Intrinsics.checkNotNullParameter(currentPlanId, "currentPlanId");
                    Intrinsics.checkNotNullParameter(enabledExperiments, "enabledExperiments");
                    w4l.i loadingStrategy = w4l.i.f294643c;
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    vkm.d dVarB = rd0.e.b(((w4l.f) f0Var.i.getValue()).e(new Pair(currentPlanId, enabledExperiments), loadingStrategy));
                    this.f162529w = null;
                    this.f162530x = null;
                    this.v = 1;
                    vkm.q.w(flowCollector);
                    Object objCollect = dVarB.collect(new i52.l(flowCollector, dVar, 8), this);
                    if (objCollect != aVar) {
                        objCollect = Unit.f186387a;
                    }
                    if (objCollect != aVar) {
                        objCollect = Unit.f186387a;
                    }
                    if (objCollect == aVar) {
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
                    FlowCollector flowCollector2 = this.f162529w;
                    com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.screen.g gVar = this.f162531y;
                    wkm.l lVarQ = vkm.q.Q(mo3.a.g(rd0.e.b(gVar.f103574t.q()), null, new ijj.r(15), 1), new m0(0, gVar, null));
                    this.f162529w = null;
                    this.f162530x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, lVarQ, this) == aVar2) {
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
                    FlowCollector flowCollector3 = this.f162529w;
                    Pair pair = (Pair) this.f162530x;
                    hha.d dVar2 = (hha.d) pair.f186385a;
                    Data data = (Data) pair.f186386b;
                    com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.screen.g gVar2 = this.f162531y;
                    Flow flowB3 = gVar2.f103575w.b3();
                    this.f162529w = null;
                    this.f162530x = null;
                    this.v = 1;
                    vkm.q.w(flowCollector3);
                    Object objCollect2 = ((j2) flowB3).collect(new ard.b0(flowCollector3, gVar2, dVar2, data, 10), this);
                    if (objCollect2 != aVar3) {
                        objCollect2 = Unit.f186387a;
                    }
                    if (objCollect2 != aVar3) {
                        objCollect2 = Unit.f186387a;
                    }
                    if (objCollect2 == aVar3) {
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
