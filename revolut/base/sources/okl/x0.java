package okl;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes12.dex */
public final class x0 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.sso.impl.ui.auth.n v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f226249w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(com.revolut.sso.impl.ui.auth.n nVar, String str, Continuation continuation) {
        super(2, continuation);
        this.v = nVar;
        this.f226249w = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new x0(this.v, this.f226249w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((x0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        com.revolut.sso.impl.ui.auth.n nVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            w0 w0Var = new w0(nVar, this.f226249w, null);
            this.u = 1;
            obj2 = nVar.p2(this, w0Var);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        nVar.C1((aii.u) obj2);
        oki.h.D2(nVar.l0);
        return Unit.f186387a;
    }
}
