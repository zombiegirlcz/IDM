package y5b;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import w5b.z6;

/* JADX INFO: loaded from: classes6.dex */
public final class o extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p f311056w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(p pVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f311056w = pVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                o oVar = new o(this.f311056w, continuation, 0);
                oVar.v = obj2;
                return oVar;
            default:
                o oVar2 = new o(this.f311056w, continuation, 1);
                oVar2.v = obj2;
                return oVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((o) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((o) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        p pVar = this.f311056w;
        switch (i) {
            case 0:
                String str = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                z6 z6Var = (z6) pVar.f311058b.T2(m.a(p.Companion, str), z6.class);
                if (z6Var != null) {
                    return yh5.b.F(z6Var);
                }
                return null;
            default:
                Pair pair = (Pair) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                z6 z6Var2 = (z6) pVar.f311058b.T2(m.b(p.Companion, (String) pair.f186385a, (String) pair.f186386b), z6.class);
                if (z6Var2 != null) {
                    return yh5.b.F(z6Var2);
                }
                return null;
        }
    }
}
