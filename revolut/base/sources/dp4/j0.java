package dp4;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes22.dex */
public final class j0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k0 f116658w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(k0 k0Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f116658w = k0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                j0 j0Var = new j0(this.f116658w, continuation, 0);
                j0Var.v = obj2;
                return j0Var;
            default:
                j0 j0Var2 = new j0(this.f116658w, continuation, 1);
                j0Var2.v = obj2;
                return j0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((j0) create((cp4.c0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((j0) create((cp4.d0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        k0 k0Var = this.f116658w;
        switch (i) {
            case 0:
                cp4.c0 c0Var = (cp4.c0) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                List list = (List) k0Var.f116661c.a(c0Var);
                if (list != null) {
                    return fo4.b.a(list);
                }
                return null;
            default:
                cp4.d0 d0Var = (cp4.d0) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                List list2 = (List) k0Var.f116661c.a(d0Var);
                if (list2 != null) {
                    return i2b.a.C(list2);
                }
                return null;
        }
    }
}
