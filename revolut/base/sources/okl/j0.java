package okl;

import com.revolut.sso.impl.domain.models.Claim;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes12.dex */
public final class j0 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.sso.impl.ui.auth.n v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f226198w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(com.revolut.sso.impl.ui.auth.n nVar, String str, Continuation continuation) {
        super(2, continuation);
        this.v = nVar;
        this.f226198w = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new j0(this.v, this.f226198w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            Claim.Phone phone = new Claim.Phone(this.f226198w);
            this.u = 1;
            if (com.revolut.sso.impl.ui.auth.n.Q2(this.v, phone, null, null, this, 6) == aVar) {
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
