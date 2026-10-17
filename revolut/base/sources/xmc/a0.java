package xmc;

import com.revolut.feature.wealth.models.robo.Template;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import vkm.q0;
import zh9.u0;

/* JADX INFO: loaded from: classes6.dex */
public final class a0 extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f307120w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f307121x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ f0 f307122y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(int i, Continuation continuation, f0 f0Var) {
        super(3, continuation);
        this.u = i;
        this.f307122y = f0Var;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                a0 a0Var = new a0(0, continuation, this.f307122y);
                a0Var.f307120w = flowCollector;
                a0Var.f307121x = obj3;
                return a0Var.invokeSuspend(Unit.f186387a);
            default:
                a0 a0Var2 = new a0(1, continuation, this.f307122y);
                a0Var2.f307120w = flowCollector;
                a0Var2.f307121x = obj3;
                return a0Var2.invokeSuspend(Unit.f186387a);
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
                    FlowCollector flowCollector = this.f307120w;
                    f0 f0Var = this.f307122y;
                    q0 q0VarA = f0Var.f307133r.a();
                    b0 b0Var = new b0(0, null, f0Var);
                    this.f307120w = null;
                    this.f307121x = null;
                    this.v = 1;
                    vkm.q.w(flowCollector);
                    Object objCollect = q0VarA.collect(new akg.m(flowCollector, b0Var, 5), this);
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
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = this.f307120w;
                    f0 f0Var2 = this.f307122y;
                    hd.r rVar = f0Var2.f307132q;
                    Template template = f0Var2.f307131p.f85131b;
                    rVar.getClass();
                    Intrinsics.checkNotNullParameter(template, "template");
                    Continuation continuation = null;
                    jhi.b bVarG = mo3.a.g(new q0(nim.a.v(u0.m(((qmc.b) rVar.f151364a).a(), rd0.e.b(ybl.l.c((ybl.l) rVar.f151365b, false, 3))), new zf5.n(rVar, template, 20)), new b0(1, continuation, f0Var2), 1), null, c0.f307125a, 1);
                    b0 b0Var2 = new b0(2, continuation, f0Var2);
                    this.f307120w = null;
                    this.f307121x = null;
                    this.v = 1;
                    vkm.q.w(flowCollector2);
                    Object objCollect2 = bVarG.collect(new akg.m(flowCollector2, b0Var2, 5), this);
                    if (objCollect2 != aVar2) {
                        objCollect2 = Unit.f186387a;
                    }
                    if (objCollect2 != aVar2) {
                        objCollect2 = Unit.f186387a;
                    }
                    if (objCollect2 == aVar2) {
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
