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
public final class y extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ c0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(c0 c0Var, Continuation continuation) {
        super(2, continuation);
        this.v = c0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new y(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((y) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
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
            x xVar = new x(c0Var, continuation, 0);
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
        ChallengeDetails.BankId bankId = challengeDetails instanceof ChallengeDetails.BankId ? (ChallengeDetails.BankId) challengeDetails : null;
        if (bankId == null || (str = bankId.f106106a) == null) {
            throw new IllegalStateException(new RevolutSSOException.IllegalState("BANKID challenge doesn't have a deeplink to launch").toString());
        }
        Intent intentI = c0Var.f128492n.i(str, true);
        if (intentI != null) {
            return c0Var.A2(new ExternalDestination.ByIntent(intentI, null));
        }
        throw new IllegalStateException(new RevolutSSOException.IllegalState("Couldn't get intent to launch BANKID app").toString());
    }
}
