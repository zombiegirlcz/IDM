package dk9;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import vi9.c0;

/* JADX INFO: loaded from: classes5.dex */
public final class z extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a0 f115490w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ bi9.f f115491x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(a0 a0Var, bi9.f fVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f115490w = a0Var;
        this.f115491x = fVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new z(this.f115490w, this.f115491x, continuation, 0);
            default:
                return new z(this.f115490w, this.f115491x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((z) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    xh9.a aVar2 = this.f115490w.f115463q;
                    bi9.f fVar = this.f115491x;
                    ti9.g gVar = (ti9.g) aVar2;
                    pfm.a aVarP = gVar.p(fVar.f15452b, fVar.f15451a.f322326a);
                    this.v = 1;
                    if (nim.a.a(aVarP, this) == aVar) {
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
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                bi9.f fVar2 = this.f115491x;
                a0 a0Var = this.f115490w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    j60.a.v(a0Var.f115464r, false, null, 3);
                    z zVar = new z(a0Var, fVar2, null, 0);
                    this.v = 1;
                    if (a0Var.p2(this, zVar) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                a0Var.u.getClass();
                return a0Var.X1(c0.g(fVar2));
        }
    }
}
