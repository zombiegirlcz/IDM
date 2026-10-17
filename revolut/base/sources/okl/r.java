package okl;

import android.content.Intent;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.sso.impl.domain.models.ChallengeDetails;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes12.dex */
public final class r extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.sso.impl.ui.auth.n v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f226234w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.revolut.sso.impl.ui.auth.n nVar, CoroutineScope coroutineScope, Continuation continuation) {
        super(2, continuation);
        this.v = nVar;
        this.f226234w = coroutineScope;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        r rVar = new r(this.v, this.f226234w, continuation);
        rVar.u = obj2;
        return rVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((r) create((gkl.e0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        gkl.e0 e0Var = (gkl.e0) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ChallengeDetails challengeDetails = e0Var.f144443a.f106101g;
        ChallengeDetails.BankId bankId = challengeDetails instanceof ChallengeDetails.BankId ? (ChallengeDetails.BankId) challengeDetails : null;
        if (bankId == null) {
            throw new IllegalStateException("Expected BankId challenge details");
        }
        com.revolut.sso.impl.ui.auth.n nVar = this.v;
        Intent intentI = nVar.f106375q.i(bankId.f106106a, false);
        if (intentI == null || nVar.C1(new ExternalDestination.ByIntent(intentI, null)) == null) {
            nVar.y3();
            Unit unit = Unit.f186387a;
        }
        return Unit.f186387a;
    }
}
