package d6j;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes10.dex */
public final class f0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n0 f111558w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(int i, n0 n0Var, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f111558w = n0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                f0 f0Var = new f0(0, this.f111558w, continuation);
                f0Var.v = ((Boolean) obj2).booleanValue();
                return f0Var;
            default:
                f0 f0Var2 = new f0(1, this.f111558w, continuation);
                f0Var2.v = ((Boolean) obj2).booleanValue();
                return f0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        int i = this.u;
        Boolean bool = (Boolean) obj2;
        bool.booleanValue();
        Continuation continuation = (Continuation) obj3;
        switch (i) {
        }
        return ((f0) create(bool, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        n0 n0Var = this.f111558w;
        switch (i) {
            case 0:
                boolean z = this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n0Var.H2(n0Var.R, new cmc.a(z, 4));
                break;
            default:
                boolean z3 = this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n0Var.L.b3(z3);
                n0Var.H2(n0Var.R, new cmc.a(z3, 5));
                break;
        }
        return Unit.f186387a;
    }
}
