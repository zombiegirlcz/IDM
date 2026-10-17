package mll;

import com.revolut.sso.api.models.GoogleEvidence;
import com.revolut.sso.impl.domain.models.Claim;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class p extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ qll.b0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.sso.impl.ui.combined_authentication.flow.c f207075w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(qll.b0 b0Var, com.revolut.sso.impl.ui.combined_authentication.flow.c cVar, Continuation continuation) {
        super(1, continuation);
        this.v = b0Var;
        this.f207075w = cVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new p(this.v, this.f207075w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((p) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            qll.a0 a0Var = (qll.a0) this.v;
            String value = a0Var.f247577a.f144463a;
            Intrinsics.checkNotNullParameter(value, "value");
            Claim.Email email = new Claim.Email(value);
            GoogleEvidence googleEvidence = new GoogleEvidence(a0Var.f247577a.f144464b);
            this.u = 1;
            if (com.revolut.sso.impl.ui.combined_authentication.flow.c.N2(this.f207075w, email, googleEvidence, this) == aVar) {
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
