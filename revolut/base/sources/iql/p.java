package iql;

import com.revolut.sso.api.models.GoogleEvidence;
import com.revolut.sso.impl.domain.models.Claim;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class p extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ gnl.i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.sso.impl.ui.signup.b f167910w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(gnl.i iVar, com.revolut.sso.impl.ui.signup.b bVar, Continuation continuation) {
        super(1, continuation);
        this.v = iVar;
        this.f167910w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new p(this.v, this.f167910w, continuation);
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
            gnl.l lVar = (gnl.l) this.v;
            String value = lVar.f145040a.f144463a;
            com.revolut.sso.impl.ui.signup.b bVar = this.f167910w;
            bVar.H2(bVar.z, new ik3.a(value, 5));
            Intrinsics.checkNotNullParameter(value, "value");
            Claim.Email email = new Claim.Email(value);
            GoogleEvidence googleEvidence = new GoogleEvidence(lVar.f145040a.f144464b);
            this.u = 1;
            if (com.revolut.sso.impl.ui.signup.b.I2(bVar, email, googleEvidence, this) == aVar) {
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
