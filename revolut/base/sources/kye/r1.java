package kye;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes8.dex */
public final class r1 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k3 f190820w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r1(int i, Continuation continuation, k3 k3Var) {
        super(2, continuation);
        this.u = i;
        this.f190820w = k3Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new r1(0, continuation, this.f190820w);
            case 1:
                return new r1(1, continuation, this.f190820w);
            case 2:
                return new r1(2, continuation, this.f190820w);
            case 3:
                return new r1(3, continuation, this.f190820w);
            default:
                return new r1(4, continuation, this.f190820w);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((r1) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    k3 k3Var = this.f190820w;
                    String str = ((m) ((vkm.j2) k3Var.f190763d0.f22677a).getValue()).f190775b;
                    u51.a aVar2 = k3Var.I;
                    n nVar = k3Var.f190767s;
                    yte.n nVarK = pw5.a.K(nVar.f190796b, nVar.f190795a);
                    this.v = 1;
                    if (((e0f.r1) aVar2).o(str, nVarK, this) == aVar) {
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
                k3 k3Var2 = this.f190820w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    efm.d0 d0VarA = ((ang.b) k3Var2.U).a();
                    this.v = 1;
                    obj2 = nim.a.b(d0VarA, this);
                    if (obj2 == aVar3) {
                        return aVar3;
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
                Intrinsics.checkNotNullExpressionValue(obj2, "await(...)");
                if (l71.f.i((l71.d) obj2)) {
                    Flow flowQ = vkm.q.q(k3Var2.f190763d0.B(new m0(8)));
                    x1 x1Var = new x1(k3Var2, null);
                    this.v = 2;
                    if (vkm.q.o(flowQ, x1Var, this) == aVar3) {
                        return aVar3;
                    }
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    k3 k3Var3 = this.f190820w;
                    Flow flowQ2 = vkm.q.q(yh5.b.d(new vkm.t0(k3Var3.f190763d0.B(new m0(15)), 1), rd0.e.b(m70.a.g(k3Var3.M.X(e1f.c.a(k3Var3.f190767s.f190795a), w4l.i.f294643c), null, new l0(4), 1))));
                    x2 x2Var = new x2(k3Var3, null);
                    this.v = 1;
                    if (vkm.q.o(flowQ2, x2Var, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                k3 k3Var4 = this.f190820w;
                f3 f3Var = new f3(k3Var4, null);
                this.v = 1;
                Object objB = pu7.a.B(k3Var4.k, "on auto topup click", f3Var, this);
                return objB == aVar5 ? aVar5 : objB;
            default:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (skm.k0.b(50L, this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                this.f190820w.T2();
                return Unit.f186387a;
        }
    }
}
