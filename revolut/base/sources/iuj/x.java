package iuj;

import com.revolut.data.model.Data;
import com.revolut.feature.referrals.api.ReferralsDeeplinkApi$Toggles;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import vkm.q0;
import zhm.h0;

/* JADX INFO: loaded from: classes11.dex */
public final class x extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f168650w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f168651x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ a0 f168652y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(int i, a0 a0Var, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f168652y = a0Var;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                x xVar = new x(0, this.f168652y, continuation);
                xVar.f168650w = flowCollector;
                xVar.f168651x = obj3;
                return xVar.invokeSuspend(Unit.f186387a);
            case 1:
                x xVar2 = new x(1, this.f168652y, continuation);
                xVar2.f168650w = flowCollector;
                xVar2.f168651x = obj3;
                return xVar2.invokeSuspend(Unit.f186387a);
            default:
                x xVar3 = new x(2, this.f168652y, continuation);
                xVar3.f168650w = flowCollector;
                xVar3.f168651x = obj3;
                return xVar3.invokeSuspend(Unit.f186387a);
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
                    FlowCollector flowCollector = this.f168650w;
                    stj.h hVar = this.f168652y.o;
                    hVar.getClass();
                    w4l.i loadingStrategy = w4l.i.f294643c;
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    mtj.q qVar = (mtj.q) hVar.f265610a;
                    qVar.getClass();
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    q0 q0VarN = rd0.e.n(qVar.f.b(Unit.f186387a, loadingStrategy), h0.f322473a);
                    this.f168650w = null;
                    this.f168651x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, q0VarN, this) == aVar) {
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
                    FlowCollector flowCollector2 = this.f168650w;
                    a0 a0Var = this.f168652y;
                    Flow gVar = !((jte.d) a0Var.f168625q).c(ReferralsDeeplinkApi$Toggles.SalaryReferral.f81672c) ? new go.g(new Data(null, null, false, 7, null), 2) : rd0.e.n(rd0.e.b(wwa.b.e(a0Var.f168624p, pwa.n.SALARY, 2)), h0.f322473a);
                    this.f168650w = null;
                    this.f168651x = null;
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
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector3 = this.f168650w;
                    q0 q0VarN2 = rd0.e.n(rd0.e.b(wwa.b.e(this.f168652y.f168624p, null, 3)), h0.f322473a);
                    this.f168650w = null;
                    this.f168651x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector3, q0VarN2, this) == aVar3) {
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
