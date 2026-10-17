package okl;

import com.revolut.sso.api.models.TelephoneEvidence;
import com.revolut.sso.impl.domain.models.Claim;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes12.dex */
public final class o0 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.sso.impl.ui.auth.n v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f226226w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ lni.i f226227x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(com.revolut.sso.impl.ui.auth.n nVar, String str, lni.i iVar, Continuation continuation) {
        super(2, continuation);
        this.v = nVar;
        this.f226226w = str;
        this.f226227x = iVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new o0(this.v, this.f226226w, this.f226227x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((o0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            Claim.Phone phone = new Claim.Phone(this.f226226w);
            gkl.m mVar = gkl.m.PHONE;
            String secret = ((lni.g) this.f226227x).f197263a;
            Intrinsics.checkNotNullParameter(secret, "secret");
            TelephoneEvidence telephoneEvidence = new TelephoneEvidence(secret);
            this.u = 1;
            if (com.revolut.sso.impl.ui.auth.n.L2(this.v, phone, mVar, telephoneEvidence, this) == aVar) {
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
