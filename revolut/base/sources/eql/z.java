package eql;

import android.content.Intent;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.sso.api.exceptions.RevolutSSOException;
import com.revolut.sso.impl.domain.models.ChallengeDetails;
import gkl.e0;
import gkl.h0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes12.dex */
public final class z extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ c0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(c0 c0Var, Continuation continuation) {
        super(2, continuation);
        this.v = c0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new z(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((z) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        c0 c0Var = this.v;
        Continuation continuation = null;
        if (i == 0) {
            yhm.o.b(obj2);
            x xVar = new x(c0Var, continuation, 1);
            this.u = 1;
            obj2 = c0Var.Y2(this, xVar);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        h0 h0Var = (h0) obj2;
        if (!(h0Var instanceof e0)) {
            throw new IllegalStateException(new RevolutSSOException.IllegalState("Unexpected challenge result").toString());
        }
        ChallengeDetails challengeDetails = ((e0) h0Var).f144443a.f106101g;
        ChallengeDetails.DAP dap = challengeDetails instanceof ChallengeDetails.DAP ? (ChallengeDetails.DAP) challengeDetails : null;
        if (dap == null || (str = dap.f106108a) == null) {
            throw new IllegalStateException(new RevolutSSOException.IllegalState("DAP challenge doesn't have a deeplink to launch").toString());
        }
        Intent intentN = c0Var.f128495r.n(str, "https://play.google.com/store/apps/details?id=hu.gov.dap.app");
        if (intentN != null) {
            return c0Var.A2(new ExternalDestination.ByIntent(intentN, null));
        }
        throw new IllegalStateException(new RevolutSSOException.IllegalState("Couldn't get intent to launch DAP app").toString());
    }
}
