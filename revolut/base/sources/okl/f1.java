package okl;

import com.revolut.sso.impl.domain.models.AuthResult;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes12.dex */
public final class f1 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.sso.impl.ui.auth.n v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AuthResult.PermissionRequired f226178w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(com.revolut.sso.impl.ui.auth.n nVar, AuthResult.PermissionRequired permissionRequired, Continuation continuation) {
        super(2, continuation);
        this.v = nVar;
        this.f226178w = permissionRequired;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new f1(this.v, this.f226178w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f1) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            AuthResult.PermissionRequired permissionRequired = this.f226178w;
            com.revolut.sso.impl.ui.auth.n nVar = this.v;
            com.revolut.sso.impl.ui.auth.i iVar = new com.revolut.sso.impl.ui.auth.i(nVar, permissionRequired, null);
            this.u = 1;
            if (nVar.p2(this, iVar) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }
}
