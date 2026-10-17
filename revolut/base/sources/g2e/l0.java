package g2e;

import f2e.b1;
import f2e.c1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class l0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n0 f140008w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(n0 n0Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f140008w = n0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                l0 l0Var = new l0(this.f140008w, continuation, 0);
                l0Var.v = obj2;
                return l0Var;
            default:
                l0 l0Var2 = new l0(this.f140008w, continuation, 1);
                l0Var2.v = obj2;
                return l0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((l0) create((d0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((l0) create((e0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        n0 n0Var = this.f140008w;
        switch (i) {
            case 0:
                d0 d0Var = (d0) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                b1 b1Var = (b1) n0Var.f140017c.T2("STORE_EXCLUSIVES_FILTERS_STORAGE_KEY" + n0.a(d0Var), b1.class);
                if (b1Var != null) {
                    return do3.q.B(b1Var);
                }
                return null;
            default:
                e0 e0Var = (e0) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                c1 c1Var = (c1) n0Var.f140017c.T2("STORE_EXCLUSIVES_HEADER_STORAGE_KEY" + n0.b(e0Var), c1.class);
                if (c1Var != null) {
                    return ebm.a.E(c1Var);
                }
                return null;
        }
    }
}
