package ekf;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.SharedFlow;
import tof.a3;
import tof.f5;
import tof.n1;

/* JADX INFO: loaded from: classes8.dex */
public final class s extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ v f127124w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(v vVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f127124w = vVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new s(this.f127124w, continuation, 0);
            default:
                return new s(this.f127124w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((s) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str;
        String str2;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                v vVar = this.f127124w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    SharedFlow sharedFlowD = vVar.f127129l.d();
                    this.v = 1;
                    obj2 = vkm.q.x(sharedFlowD, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                a3 a3Var = (a3) obj2;
                f5 f5Var = a3Var.y0;
                Continuation continuation = null;
                n1 n1Var = f5Var != null ? f5Var.f272751c : null;
                if (n1Var == null || (str = n1Var.f272940a) == null) {
                    return Unit.f186387a;
                }
                al6.c cVar = new al6.c(7);
                chj.h0 h0Var = new chj.h0(vVar, a3Var, n1Var, 1);
                r rVar = new r(vVar, str, continuation, 0);
                this.v = 2;
                if (n14.k.W(vVar, null, cVar, h0Var, rVar, this, 1) == aVar) {
                    return aVar;
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                v vVar2 = this.f127124w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    SharedFlow sharedFlowD2 = vVar2.f127129l.d();
                    this.v = 1;
                    obj2 = vkm.q.x(sharedFlowD2, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                f5 f5Var2 = ((a3) obj2).y0;
                Continuation continuation2 = null;
                n1 n1Var2 = f5Var2 != null ? f5Var2.f272751c : null;
                if (n1Var2 == null || (str2 = n1Var2.f272940a) == null) {
                    return Unit.f186387a;
                }
                al6.c cVar2 = new al6.c(8);
                a3b.i iVar = new a3b.i(vVar2, n1Var2, 7);
                r rVar2 = new r(vVar2, str2, continuation2, 1);
                this.v = 2;
                if (n14.k.W(vVar2, null, cVar2, iVar, rVar2, this, 1) == aVar2) {
                    return aVar2;
                }
                return Unit.f186387a;
        }
    }
}
