package dp4;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes22.dex */
public final class x0 extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public /* synthetic */ String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ ux4.b f116713w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ c1 f116714x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x0(c1 c1Var, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f116714x = c1Var;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        String str = (String) obj2;
        ux4.b bVar = (ux4.b) obj3;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                x0 x0Var = new x0(this.f116714x, continuation, 0);
                x0Var.v = str;
                x0Var.f116713w = bVar;
                return x0Var.invokeSuspend(Unit.f186387a);
            default:
                x0 x0Var2 = new x0(this.f116714x, continuation, 1);
                x0Var2.v = str;
                x0Var2.f116713w = bVar;
                return x0Var2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        c1 c1Var = this.f116714x;
        switch (i) {
            case 0:
                String str = this.v;
                ux4.b bVar = this.f116713w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                c1Var.e.b(new cp4.f(str), hx7.a.C(bVar));
                break;
            default:
                String str2 = this.v;
                ux4.b bVar2 = this.f116713w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                c1Var.e.b(new cp4.s(str2), hx7.a.C(bVar2));
                break;
        }
        return Unit.f186387a;
    }
}
