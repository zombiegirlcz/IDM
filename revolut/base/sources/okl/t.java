package okl;

import android.content.Intent;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.sso.impl.domain.models.ChallengeDetails;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes12.dex */
public final class t extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.sso.impl.ui.auth.n v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f226239w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.revolut.sso.impl.ui.auth.n nVar, CoroutineScope coroutineScope, Continuation continuation) {
        super(2, continuation);
        this.v = nVar;
        this.f226239w = coroutineScope;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        t tVar = new t(this.v, this.f226239w, continuation);
        tVar.u = obj2;
        return tVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((t) create((gkl.e0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        gkl.e0 e0Var = (gkl.e0) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ChallengeDetails challengeDetails = e0Var.f144443a.f106101g;
        ChallengeDetails.DAP dap = challengeDetails instanceof ChallengeDetails.DAP ? (ChallengeDetails.DAP) challengeDetails : null;
        if (dap == null) {
            throw new IllegalStateException("Expected DAP challenge details");
        }
        com.revolut.sso.impl.ui.auth.n nVar = this.v;
        Intent intentN = nVar.A.n(dap.f106108a, null);
        if (intentN == null || nVar.C1(new ExternalDestination.ByIntent(intentN, null)) == null) {
            nVar.y3();
            Unit unit = Unit.f186387a;
        }
        return Unit.f186387a;
    }
}
