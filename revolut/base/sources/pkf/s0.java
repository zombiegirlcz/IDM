package pkf;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import tof.a3;

/* JADX INFO: loaded from: classes8.dex */
public final class s0 extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f237124w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f237125x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ w0 f237126y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s0(Continuation continuation, w0 w0Var, int i) {
        super(3, continuation);
        this.u = i;
        this.f237126y = w0Var;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                s0 s0Var = new s0(continuation, this.f237126y, 0);
                s0Var.f237124w = flowCollector;
                s0Var.f237125x = obj3;
                return s0Var.invokeSuspend(Unit.f186387a);
            default:
                s0 s0Var2 = new s0(continuation, this.f237126y, 1);
                s0Var2.f237124w = flowCollector;
                s0Var2.f237125x = obj3;
                return s0Var2.invokeSuspend(Unit.f186387a);
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
                    FlowCollector flowCollector = this.f237124w;
                    w0 w0Var = this.f237126y;
                    wkm.l lVarQ = vkm.q.Q(w0Var.f237144l.d(), new s0(null, w0Var, 1));
                    this.f237124w = null;
                    this.f237125x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, lVarQ, this) == aVar) {
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
                    FlowCollector flowCollector2 = this.f237124w;
                    a3 a3Var = (a3) this.f237125x;
                    w0 w0Var2 = this.f237126y;
                    Flow flowF = w0Var2.f237148q.f(a3Var, w4l.i.f294643c);
                    vbj.c cVar = w0Var2.f237146n;
                    String transactionId = a3Var.f272581b;
                    cVar.getClass();
                    Intrinsics.checkNotNullParameter(transactionId, "transactionId");
                    j23.b bVarD = yh5.b.d(flowF, rd0.e.b(nz8.d.r(skm.p0.f264003c, new uvf.b((Object) cVar, (Object) ("STORAGE_KEY_CANCEL_BUTTON_VISIBLE_FOR_MESH_PENDING_DEPOSIT" + transactionId), false, (Continuation) null, 15))));
                    this.f237124w = null;
                    this.f237125x = null;
                    this.v = 1;
                    vkm.q.w(flowCollector2);
                    Object objCollect = bVarD.collect(new im9.k(flowCollector2, w0Var2, a3Var, 26), this);
                    if (objCollect != aVar2) {
                        objCollect = Unit.f186387a;
                    }
                    if (objCollect != aVar2) {
                        objCollect = Unit.f186387a;
                    }
                    if (objCollect == aVar2) {
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
