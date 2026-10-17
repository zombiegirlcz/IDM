package hk9;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import zh9.p1;

/* JADX INFO: loaded from: classes5.dex */
public final class o extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q f152882w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f152883x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(q qVar, int i, Continuation continuation, int i2) {
        super(1, continuation);
        this.u = i2;
        this.f152882w = qVar;
        this.f152883x = i;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new o(this.f152882w, this.f152883x, continuation, 0);
            default:
                return new o(this.f152882w, this.f152883x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((o) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                q qVar = this.f152882w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    di9.c cVar = qVar.f152886q;
                    Integer num = new Integer(this.f152883x);
                    p1 p1Var = p1.Cards;
                    this.v = 1;
                    if (((sj9.a) cVar).Z2(num, p1Var, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                qVar.C2(aii.q.f5292a);
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    q qVar2 = this.f152882w;
                    o oVar = new o(qVar2, this.f152883x, null, 0);
                    this.v = 1;
                    if (qVar2.p2(this, oVar) == aVar2) {
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
