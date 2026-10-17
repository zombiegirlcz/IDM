package xo8;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class b0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h0 f307692w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(h0 h0Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f307692w = h0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                b0 b0Var = new b0(this.f307692w, continuation, 0);
                b0Var.v = ((Boolean) obj2).booleanValue();
                return b0Var;
            case 1:
                b0 b0Var2 = new b0(this.f307692w, continuation, 1);
                b0Var2.v = ((Boolean) obj2).booleanValue();
                return b0Var2;
            case 2:
                b0 b0Var3 = new b0(this.f307692w, continuation, 2);
                b0Var3.v = ((Boolean) obj2).booleanValue();
                return b0Var3;
            default:
                b0 b0Var4 = new b0(this.f307692w, continuation, 3);
                b0Var4.v = ((Boolean) obj2).booleanValue();
                return b0Var4;
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
        return ((b0) create(bool, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        h0 h0Var = this.f307692w;
        switch (i) {
            case 0:
                boolean z = this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h0Var.H2(h0Var.E, new v2e.x(z, 19));
                break;
            case 1:
                boolean z3 = this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h0Var.H2(h0Var.E, new v2e.x(z3, 20));
                break;
            case 2:
                boolean z4 = this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h0Var.H2(h0Var.E, new v2e.x(z4, 21));
                break;
            default:
                boolean z6 = this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h0Var.H2(h0Var.E, new v2e.x(z6, 22));
                break;
        }
        return Unit.f186387a;
    }
}
