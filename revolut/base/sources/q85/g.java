package q85;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import p35.p0;
import p35.u0;
import q35.m;
import q35.n;
import q35.p;
import q35.q;
import q35.r;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class g extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f242988w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(h hVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f242988w = hVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g(this.f242988w, continuation, 0);
            default:
                return new g(this.f242988w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((g) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        u0 u0Var;
        String str;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    h hVar = this.f242988w;
                    r rVar = (r) zi0.c.I(((c) hVar.t2()).f242986a);
                    l35.b bVar = hVar.f242990q;
                    String str2 = hVar.f242992s;
                    boolean z = rVar instanceof n;
                    if (z || (rVar instanceof m)) {
                        u0Var = u0.DIRECT_DEBIT;
                    } else {
                        if (!(rVar instanceof q)) {
                            if (rVar instanceof p) {
                                throw new IllegalStateException("LoanPaymentSource.None does not have any type");
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                        u0Var = u0.WALLET;
                    }
                    p0 p0Var = p0.DISABLED;
                    if (z) {
                        str = ((n) rVar).f241834a;
                    } else if (rVar instanceof m) {
                        str = ((m) rVar).f241832b;
                    } else {
                        if (!(rVar instanceof p) && !(rVar instanceof q)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str = null;
                    }
                    pfm.a aVarQ = ((y45.f) bVar).q(str2, u0Var, p0Var, str);
                    this.v = 1;
                    if (nim.a.a(aVarQ, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    h hVar2 = this.f242988w;
                    g gVar = new g(hVar2, null, 0);
                    this.v = 1;
                    if (hVar2.p2(this, gVar) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
