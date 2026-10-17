package okl;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.sso.api.R$string;
import com.revolut.sso.impl.domain.models.Claim;
import com.revolut.sso.impl.domain.models.SsoServerError;
import com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$Step;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f226184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Claim f226185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.revolut.sso.impl.ui.auth.n f226186c;

    public /* synthetic */ h(Claim claim, com.revolut.sso.impl.ui.auth.n nVar, int i) {
        this.f226184a = i;
        this.f226185b = claim;
        this.f226186c = nVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        nii.y0 y0Var;
        int i = this.f226184a;
        boolean z = false;
        Continuation continuation = null;
        com.revolut.sso.impl.ui.auth.n nVar = this.f226186c;
        Claim claim = this.f226185b;
        switch (i) {
            case 0:
                inl.a result = (inl.a) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                int i2 = o.e[result.ordinal()];
                if (i2 == 1) {
                    if (claim instanceof Claim.Email) {
                        com.revolut.sso.impl.ui.auth.n.j3(nVar, new AuthenticationFlowContract$Step.CreateNewEmail(false));
                    } else {
                        if (!(claim instanceof Claim.Phone)) {
                            if ((claim instanceof Claim.BioPublicKey) || (claim instanceof Claim.Google) || (claim instanceof Claim.IdentityId) || (claim instanceof Claim.Password) || (claim instanceof Claim.Pin) || (claim instanceof Claim.PublicKey) || (claim instanceof Claim.WebAuthn)) {
                                throw new IllegalStateException(claim.getClass().getName().concat(" is not supported").toString());
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                        com.revolut.sso.impl.ui.auth.n.j3(nVar, new AuthenticationFlowContract$Step.CreateNewPhone(false));
                    }
                    Unit unit = Unit.f186387a;
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i3 = 13;
                    if (claim instanceof Claim.Email) {
                        nVar.l2(new oh4.i(nVar, gkl.m.EMAIL, continuation, i3), new yi5.b(26));
                    } else {
                        if (!(claim instanceof Claim.Phone)) {
                            if ((claim instanceof Claim.BioPublicKey) || (claim instanceof Claim.Google) || (claim instanceof Claim.IdentityId) || (claim instanceof Claim.Password) || (claim instanceof Claim.Pin) || (claim instanceof Claim.PublicKey) || (claim instanceof Claim.WebAuthn)) {
                                throw new IllegalStateException(claim.getClass().getName().concat(" is not supported").toString());
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                        nVar.l2(new oh4.i(nVar, gkl.m.PHONE, continuation, i3), new yi5.b(26));
                    }
                }
                return Unit.f186387a;
            default:
                Throwable throwable = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                if (throwable instanceof SsoServerError) {
                    if (claim instanceof Claim.Pin) {
                        yji.l.b1(nVar, nVar.X1(nVar.f106368a0.a((SsoServerError) throwable)), null, new com.revolut.sso.impl.ui.auth.f(nVar, null), 3);
                    } else if (claim instanceof Claim.Password) {
                        SsoServerError error = (SsoServerError) throwable;
                        iol.a aVar = nVar.f106369b0.f163345a;
                        Intrinsics.checkNotNullParameter(error, "error");
                        if (error instanceof SsoServerError.PasswordInvalid) {
                            ((iol.b) aVar).getClass();
                            y0Var = new nii.y0("DIALOG_ID_PASSWORD_INVALID", new nii.z(new TextLocalisedClause(R$string.revolut_sso_password_change_alert_invalid_password_title, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_password_change_alert_invalid_password_description, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_password_change_alert_change_password_action, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 4);
                        } else if (error instanceof SsoServerError.PasswordIsTheSame) {
                            ((iol.b) aVar).getClass();
                            y0Var = new nii.y0("DIALOG_ID_PASSWORD_IS_THE_SAME", new nii.z(new TextLocalisedClause(R$string.revolut_sso_password_change_alert_same_password_title, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_password_change_alert_same_password_description, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_password_change_alert_change_password_action, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 4);
                        } else if (error instanceof SsoServerError.PasswordNotStrongEnough) {
                            ((iol.b) aVar).getClass();
                            y0Var = new nii.y0("DIALOG_ID_PASSWORD_NOT_STRONG_ENOUGH", new nii.z(new TextLocalisedClause(R$string.revolut_sso_password_change_alert_not_strong_enough_title, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_password_change_alert_not_strong_enough_description, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_password_change_alert_change_password_action, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 4);
                        } else if (error instanceof SsoServerError.PasswordTooLong) {
                            ((iol.b) aVar).getClass();
                            y0Var = new nii.y0("DIALOG_ID_PASSWORD_TOO_LONG", new nii.z(new TextLocalisedClause(R$string.revolut_sso_password_change_alert_long_password_title, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_password_change_alert_long_password_description, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_password_change_alert_change_password_action, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 4);
                        } else {
                            y0Var = null;
                        }
                        if (y0Var != null) {
                            yji.l.b1(nVar, nVar.X1(y0Var), null, null, 7);
                        }
                    } else if (!(claim instanceof Claim.BioPublicKey) && !(claim instanceof Claim.Email) && !(claim instanceof Claim.Google) && !(claim instanceof Claim.IdentityId) && !(claim instanceof Claim.Phone) && !(claim instanceof Claim.PublicKey) && !(claim instanceof Claim.WebAuthn)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
