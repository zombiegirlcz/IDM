package jol;

import android.os.Parcelable;
import bjl.p0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CountryClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import com.revolut.sso.api.R$string;
import com.revolut.sso.impl.domain.models.Claim;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KClass;
import nii.h0;
import nii.j0;
import nii.l0;
import nii.u1;
import nii.w1;
import nii.y0;
import nii.z;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes12.dex */
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z80.b f177166a;

    public c(z80.b phoneToolsProvider, p0 revolutSsoDependenciesProvider) {
        Intrinsics.checkNotNullParameter(phoneToolsProvider, "phoneToolsProvider");
        Intrinsics.checkNotNullParameter(revolutSsoDependenciesProvider, "revolutSsoDependenciesProvider");
        this.f177166a = phoneToolsProvider;
    }

    public final y0 a(Claim claim) {
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(claim, "claim");
        kotlin.jvm.internal.p0 p0Var = o0.f186429a;
        KClass[] elements = {p0Var.b(Claim.Phone.class), p0Var.b(Claim.Email.class)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (!kotlin.collections.d.y0(elements).contains(p0Var.b(claim.getClass()))) {
            return e("LIST_ID_DIALOG_IDENTITY_IN_USE");
        }
        boolean z = claim instanceof Claim.Phone;
        if (z) {
            i = R$string.revolut_sso_lost_access_phone_same_identity_title;
        } else {
            if (!(claim instanceof Claim.Email)) {
                throw new IllegalStateException(("Unexpected state with claim " + p0Var.b(claim.getClass())).toString());
            }
            i = R$string.revolut_sso_lost_access_email_same_identity_title;
        }
        if (z) {
            i2 = R$string.revolut_sso_lost_access_phone_same_identity_description;
        } else {
            if (!(claim instanceof Claim.Email)) {
                throw new IllegalStateException(("Unexpected state with claim " + p0Var.b(claim.getClass())).toString());
            }
            i2 = R$string.revolut_sso_lost_access_email_same_identity_description;
        }
        return new y0("LIST_ID_DIALOG_IDENTITY_IN_USE", new z(new TextLocalisedClause(i, null, null, 14), new TextLocalisedClause(i2, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_common_actions_got_it, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 4);
    }

    public final y0 b(Claim claim) {
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(claim, "claim");
        kotlin.jvm.internal.p0 p0Var = o0.f186429a;
        KClass[] elements = {p0Var.b(Claim.Phone.class), p0Var.b(Claim.Email.class)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (!kotlin.collections.d.y0(elements).contains(p0Var.b(claim.getClass()))) {
            return e("LIST_ID_DIALOG_CLAIM_IS_THE_SAME");
        }
        boolean z = claim instanceof Claim.Phone;
        if (z) {
            i = R$string.revolut_sso_create_new_phone_error_the_same_title;
        } else {
            if (!(claim instanceof Claim.Email)) {
                throw new IllegalStateException(("Unexpected state with claim " + p0Var.b(claim.getClass())).toString());
            }
            i = R$string.revolut_sso_create_new_email_error_the_same_title;
        }
        if (z) {
            i2 = R$string.revolut_sso_create_new_phone_error_the_same_description;
        } else {
            if (!(claim instanceof Claim.Email)) {
                throw new IllegalStateException(("Unexpected state with claim " + p0Var.b(claim.getClass())).toString());
            }
            i2 = R$string.revolut_sso_create_new_email_error_the_same_description;
        }
        return new y0("LIST_ID_DIALOG_CLAIM_IS_THE_SAME", new z(new TextLocalisedClause(i, null, null, 14), new TextLocalisedClause(i2, null, null, 14), null, null, null, null, false, null, null, null, null, null, null, 32764), false, 4);
    }

    public final y0 c() {
        return new y0("DIALOG_ID_EXTERNAL_ACCOUNT_NOT_CONNECTED", new z(new TextLocalisedClause(R$string.revolut_sso_social_signin_dialog_account_not_connected_title, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_social_signin_dialog_account_not_connected_description, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_social_signin_dialog_account_not_connected_action, null, null, 14), null, null, null, true, null, null, null, null, null, null, 32500), false, 4);
    }

    public final y0 d() {
        return new y0("EXTERNAL_IDENTITY_VERIFICATION_FAILED", new z(new TextLocalisedClause(R$string.revolut_sso_bankid_dialog_verification_failed_title, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_bankid_dialog_verification_failed_description, null, null, 14), null, null, null, null, false, null, null, null, null, null, null, 32764), false, 4);
    }

    public final y0 e(String dialogId) {
        Intrinsics.checkNotNullParameter(dialogId, "dialogId");
        return new y0(dialogId, new z(new TextLocalisedClause(R$string.revolut_sso_login_error_generic_title, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_login_error_generic_description, null, null, 14), null, null, null, null, true, null, null, null, null, null, null, 32508), false, 4);
    }

    public final y0 f() {
        return new y0("DIALOG_ID_INCORRECT_CREDENTIALS", new z(new TextLocalisedClause(R$string.revolut_sso_login_error_title, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_login_error_message, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_common_actions_got_it, null, null, 14), null, null, null, true, null, null, null, null, null, null, 32500), false, 4);
    }

    public final y0 g(String str) {
        Intrinsics.checkNotNullParameter(str, "$v$c$com-revolut-sso-impl-domain-models-Claim-Phone$-claim$0");
        z80.b bVar = this.f177166a;
        wi0.b bVarE = bVar.e(str);
        if (bVarE == null) {
            return e("LIST_ID_DIALOG_PHONE_COUNTRY_MISMATCH");
        }
        CountryClause countryClause = new CountryClause(bVarE, null);
        return new y0("LIST_ID_DIALOG_PHONE_COUNTRY_MISMATCH", new l0(new TextLocalisedClause(R$string.revolut_sso_change_phone_local_country_error_title, u.c(countryClause), null, 12), new TextLocalisedClause(R$string.revolut_sso_change_phone_local_country_error_description, v.k(countryClause, j6.a.q("+", bVar.j(bVarE))), null, 12), null, new TextLocalisedClause(R$string.revolut_sso_change_phone_local_country_error_action, null, null, 14), null, null, false, null, 1012), false, 4);
    }

    public final y0 h() {
        return new y0("LIST_ID_DIALOG_SESSION_EXPIRED", new z(new TextLocalisedClause(R$string.revolut_sso_session_expired_title, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_session_expired_description, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_common_actions_start_over, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 4);
    }

    public final y0 i() {
        Intrinsics.checkNotNullParameter("DIALOG_ID_SIM_BINDING_APP_MINIMISE", "dialogId");
        return new y0("DIALOG_ID_SIM_BINDING_APP_MINIMISE", new z(new TextLocalisedClause(R$string.revolut_sso_sim_binding_screen_verification_app_minimized_title, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_sim_binding_screen_verification_app_minimized_description, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_sim_binding_screen_verification_verification_failed_dialog_action, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 4);
    }

    public final y0 j(boolean z) {
        Intrinsics.checkNotNullParameter("DIALOG_ID_SIM_BINDING_SUCCESSFUL", "dialogId");
        return new y0("DIALOG_ID_SIM_BINDING_SUCCESSFUL", new j0((Clause) new TextLocalisedClause(R$string.revolut_sso_sim_binding_screen_verification_verification_success_dialog_title, null, null, 14), (Clause) (z ? new TextLocalisedClause(R$string.revolut_sso_sim_binding_screen_verification_verification_success_dialog_description, null, null, 14) : null), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) new w1(6, new TextLocalisedClause(R$string.revolut_sso_sim_binding_screen_verification_verification_success_dialog_action, null, null, 14), null), false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4076), false, 4);
    }

    public final y0 k(int i) {
        return new y0("LIST_ID_DIALOG_SOCIAL_ACCOUNT_UNLINKED", new z(new TextLocalisedClause(R$string.revolut_sso_external_account_not_linked_title, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_external_account_not_linked_subtitle, u.c(new TextLocalisedClause(i, null, null, 14)), null, 12), null, null, null, null, false, null, null, null, null, null, null, 32764), false, 4);
    }
}
