package k50;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes19.dex */
public final class a3 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j4 f181026w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a3(int i, j4 j4Var, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f181026w = j4Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                a3 a3Var = new a3(0, this.f181026w, continuation);
                a3Var.v = ((Boolean) obj2).booleanValue();
                return a3Var;
            default:
                a3 a3Var2 = new a3(1, this.f181026w, continuation);
                a3Var2.v = ((Boolean) obj2).booleanValue();
                return a3Var2;
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
        return ((a3) create(bool, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        j4 j4Var = this.f181026w;
        switch (i) {
            case 0:
                boolean z = this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j4Var.H2(j4Var.f181140w0, new jck.y(z, 10));
                break;
            default:
                boolean z3 = this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j4Var.H2(j4Var.f181140w0, new jck.y(z3, 11));
                break;
        }
        return Unit.f186387a;
    }
}
