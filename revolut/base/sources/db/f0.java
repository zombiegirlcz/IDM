package db;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class f0 extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i0 f112608w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f112609x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(i0 i0Var, String str, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f112608w = i0Var;
        this.f112609x = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f0(this.f112608w, this.f112609x, continuation, 0);
            default:
                return new f0(this.f112608w, this.f112609x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((f0) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    ang.f fVar = this.f112608w.f112612p;
                    String str = this.f112609x;
                    Intrinsics.h(str);
                    pfm.t tVarC = ylg.b.c(fVar, zhm.u.c(new eo3.b(str)));
                    this.v = 1;
                    if (nim.a.a(tVarC, this) == aVar) {
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
                i0 i0Var = this.f112608w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    ufm.n nVarI0 = te0.w.i0(i0Var.f112615s.a(this.f112609x));
                    this.v = 1;
                    obj2 = nim.a.b(nVarI0, this);
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
                f0 f0Var = new f0(i0Var, (String) obj2, null, 0);
                this.v = 2;
                if (do3.q.t(i0Var, f0Var, this) == aVar2) {
                    return aVar2;
                }
                return Unit.f186387a;
        }
    }
}
