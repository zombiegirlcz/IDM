package eql;

import com.revolut.feature.kyc.vendors.shared.api.uae_pass.UaePassFlowConfiguration;
import com.revolut.feature.kyc.vendors.shared.api.uae_pass.UaePassFlowControllerDescriptor;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.sso.api.exceptions.RevolutSSOException;
import com.revolut.sso.impl.domain.models.ChallengeDetails;
import gkl.e0;
import gkl.h0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes12.dex */
public final class a0 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ c0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(c0 c0Var, Continuation continuation) {
        super(2, continuation);
        this.v = c0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a0(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        Continuation continuation = null;
        c0 c0Var = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            x xVar = new x(c0Var, continuation, 2);
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
        ChallengeDetails.UaePass uaePass = challengeDetails instanceof ChallengeDetails.UaePass ? (ChallengeDetails.UaePass) challengeDetails : null;
        if (uaePass == null) {
            throw new IllegalStateException(new RevolutSSOException.IllegalState("UAE PASS challenge doesn't have UaePass details").toString());
        }
        c0Var.getClass();
        String str = uaePass.f106117a;
        String str2 = uaePass.f106118b;
        ViewController viewControllerO2 = c0Var.o2(new UaePassFlowControllerDescriptor(new UaePassFlowConfiguration(str, str2, zhm.u.c(str2))));
        l block = new l(c0Var, 1);
        Intrinsics.checkNotNullParameter(block, "block");
        viewControllerO2.H = block;
        yji.n.P2(c0Var, viewControllerO2, null, null, 3);
        return Unit.f186387a;
    }
}
