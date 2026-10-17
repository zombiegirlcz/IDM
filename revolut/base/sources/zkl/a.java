package zkl;

import bjl.p0;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.sso.api.R$string;
import com.revolut.sso.api.login.RevolutSsoApi$Toggles;
import com.revolut.sso.impl.domain.models.AuthAction;
import jte.d;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nii.l0;
import nii.y0;
import okl.n1;
import rqk.k;
import xkl.e;
import yji.n;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final n1 f323091l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p0 f323092m;

    public a(n1 authenticationInteractor, p0 revolutSsoDependenciesProvider) {
        Intrinsics.checkNotNullParameter(authenticationInteractor, "authenticationInteractor");
        Intrinsics.checkNotNullParameter(revolutSsoDependenciesProvider, "revolutSsoDependenciesProvider");
        this.f323091l = authenticationInteractor;
        this.f323092m = revolutSsoDependenciesProvider;
    }

    public final ViewController Z2(AuthAction authAction, String challengeId, Function0 onBypass, Function0 onCreateController) {
        Intrinsics.checkNotNullParameter(authAction, "authAction");
        Intrinsics.checkNotNullParameter(challengeId, "challengeId");
        Intrinsics.checkNotNullParameter(onBypass, "onBypass");
        Intrinsics.checkNotNullParameter(onCreateController, "onCreateController");
        od0.a aVar = od0.a.f224253a;
        if (od0.a.e()) {
            if (((d) ((k) this.f323092m).f).c(RevolutSsoApi$Toggles.InSmsChallengeBypassEnabled.f105879a)) {
                n.l2(this, L2(new y0(null, new l0(new TextLocalisedClause(R$string.revolut_sso_testing_send_sms_screen_title, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_testing_send_sms_screen_description, null, null, 14), null, new TextLocalisedClause(R$string.revolut_sso_testing_send_sms_screen_accept_action, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_testing_send_sms_screen_decline_action, null, null, 14), null, false, null, 996), false, 5)), null, new e(this, authAction, challengeId, onBypass, (Continuation) null), 3);
            }
        }
        return (ViewController) onCreateController.invoke();
    }
}
