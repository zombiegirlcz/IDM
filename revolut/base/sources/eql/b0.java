package eql;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes12.dex */
public final class b0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f128488w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ c0 f128489x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(c0 c0Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f128489x = c0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                b0 b0Var = new b0(this.f128489x, continuation, 0);
                b0Var.f128488w = obj2;
                return b0Var;
            case 1:
                b0 b0Var2 = new b0(this.f128489x, continuation, 1);
                b0Var2.f128488w = obj2;
                return b0Var2;
            case 2:
                b0 b0Var3 = new b0(this.f128489x, continuation, 2);
                b0Var3.f128488w = obj2;
                return b0Var3;
            default:
                b0 b0Var4 = new b0(this.f128489x, continuation, 3);
                b0Var4.f128488w = obj2;
                return b0Var4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        akl.l lVar = (akl.l) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((b0) create(lVar, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                akl.l lVar = (akl.l) this.f128488w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    String str = ((rqk.k) this.f128489x.u).f256593p;
                    gkl.n nVar = gkl.n.BANK_ID;
                    this.f128488w = null;
                    this.v = 1;
                    if (((akl.r) lVar).d(str, nVar, this) == aVar) {
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
                akl.l lVar2 = (akl.l) this.f128488w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    String str2 = ((rqk.k) this.f128489x.u).f256593p;
                    gkl.n nVar2 = gkl.n.DAP;
                    this.f128488w = null;
                    this.v = 1;
                    if (((akl.r) lVar2).d(str2, nVar2, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                akl.l lVar3 = (akl.l) this.f128488w;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    String str3 = ((rqk.k) this.f128489x.u).f256593p;
                    gkl.n nVar3 = gkl.n.GOOGLE;
                    this.f128488w = null;
                    this.v = 1;
                    if (((akl.r) lVar3).d(str3, nVar3, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                akl.l lVar4 = (akl.l) this.f128488w;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    String str4 = ((rqk.k) this.f128489x.u).f256593p;
                    gkl.n nVar4 = gkl.n.UAE_PASS;
                    this.f128488w = null;
                    this.v = 1;
                    if (((akl.r) lVar4).d(str4, nVar4, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
