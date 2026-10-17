package kql;

import az0.l1;
import bjl.p0;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.sso.impl.domain.models.AuthAction;
import com.revolut.sso.impl.domain.models.Challenge;
import com.revolut.sso.impl.domain.models.ChallengeDetails;
import gld.e0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import skm.a2;
import tll.s;
import yji.n;

/* JADX INFO: loaded from: classes12.dex */
public final class h extends n implements f {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final zkl.a f188447l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final jol.b f188448m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final tll.n f188449n;
    public final p0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final s f188450p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b5l.a f188451q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public a2 f188452r;

    public h(zkl.a bypassChallengeControllerModelExtension, jol.b dialogsFactory, tll.n parentStateDispatcher, p0 revolutSsoDependenciesProvider, s simBindingParentStateReceiver, b5l.a simBindingScreenFactory) {
        Intrinsics.checkNotNullParameter(bypassChallengeControllerModelExtension, "bypassChallengeControllerModelExtension");
        Intrinsics.checkNotNullParameter(dialogsFactory, "dialogsFactory");
        Intrinsics.checkNotNullParameter(parentStateDispatcher, "parentStateDispatcher");
        Intrinsics.checkNotNullParameter(revolutSsoDependenciesProvider, "revolutSsoDependenciesProvider");
        Intrinsics.checkNotNullParameter(simBindingParentStateReceiver, "simBindingParentStateReceiver");
        Intrinsics.checkNotNullParameter(simBindingScreenFactory, "simBindingScreenFactory");
        this.f188447l = bypassChallengeControllerModelExtension;
        this.f188448m = dialogsFactory;
        this.f188449n = parentStateDispatcher;
        this.o = revolutSsoDependenciesProvider;
        this.f188450p = simBindingParentStateReceiver;
        this.f188451q = simBindingScreenFactory;
    }

    @Override // yji.n
    public final void F2() {
        a2 a2Var = this.f188452r;
        if (a2Var != null) {
            a2Var.f(null);
        }
    }

    public final void Z2(Function0 onRestartRequired) {
        Intrinsics.checkNotNullParameter(onRestartRequired, "onRestartRequired");
        a2 a2Var = this.f188452r;
        if (a2Var == null) {
            return;
        }
        a2Var.f(null);
        this.f188452r = null;
        n.j2(this, L2(((jol.c) this.f188448m).i()), null, new e0(2, null, onRestartRequired), 3);
    }

    public final ViewController b3(hd.e claimSubmissionStrategy, AuthAction authAction, Challenge challenge, String str, Function1 onScreenResult) {
        Intrinsics.checkNotNullParameter(claimSubmissionStrategy, "claimSubmissionStrategy");
        Intrinsics.checkNotNullParameter(authAction, "authAction");
        Intrinsics.checkNotNullParameter(challenge, "challenge");
        Intrinsics.checkNotNullParameter(str, "$v$c$com-revolut-sso-impl-domain-models-Claim-Phone$-userPhoneNumber$0");
        Intrinsics.checkNotNullParameter(onScreenResult, "onScreenResult");
        String str2 = challenge.f106100c;
        if (str2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        ChallengeDetails challengeDetails = challenge.f106101g;
        if (challengeDetails instanceof ChallengeDetails.InSms) {
            return this.f188447l.Z2(authAction, str2, new l1(this, claimSubmissionStrategy, authAction, str2, onScreenResult, 4), new l1(this, str2, str, challenge, claimSubmissionStrategy, authAction, onScreenResult));
        }
        throw new IllegalArgumentException(j6.a.q("Wrong challenge details for IN_SMS: ", challengeDetails != null ? challengeDetails.getClass().getName() : null).toString());
    }
}
