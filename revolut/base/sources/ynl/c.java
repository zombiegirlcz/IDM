package ynl;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.sso.api.R$string;
import com.revolut.sso.impl.domain.models.SsoServerError;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import rd0.d;
import zhm.h0;

/* JADX INFO: loaded from: classes12.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f315501a;

    public c(a passcodeFlowsCommonDialogsFactory) {
        Intrinsics.checkNotNullParameter(passcodeFlowsCommonDialogsFactory, "passcodeFlowsCommonDialogsFactory");
        this.f315501a = passcodeFlowsCommonDialogsFactory;
    }

    public final y0 a(SsoServerError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        boolean z = error instanceof SsoServerError.CodeExpiredOrInvalid;
        a aVar = this.f315501a;
        if (z) {
            ((b) aVar).getClass();
            return new y0("DIALOG_ID_AUTH_CODE_EXPIRED", new z(new TextLocalisedClause(R$string.revolut_sso_passcode_change_alert_verification_expired_title, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_passcode_change_alert_verification_expired_description, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_passcode_change_alert_button_title, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 4);
        }
        if (error instanceof SsoServerError.PasscodeIsTheSame) {
            ((b) aVar).getClass();
            return new y0("DIALOG_ID_PASSCODE_IS_THE_SAME", new z(new TextLocalisedClause(R$string.revolut_sso_passcode_change_alert_same_pin_title, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_passcode_change_alert_same_pin_description, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_passcode_change_alert_button_title, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 4);
        }
        if (error instanceof SsoServerError.PasscodeContainsBirthDate) {
            ((b) aVar).getClass();
            return new y0("DIALOG_ID_PASSCODE_CONTAINS_BIRTH_DATE", new z(new TextLocalisedClause(R$string.revolut_sso_passcode_change_birthdate_title, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_passcode_change_alert_birthdate_description, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_passcode_change_alert_button_title, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 4);
        }
        if (error instanceof SsoServerError.PasscodeContainsCurrentDate) {
            ((b) aVar).getClass();
            return new y0("DIALOG_ID_PASSCODE_CONTAINS_CURRENT_DATE", new z(new TextLocalisedClause(R$string.revolut_sso_passcode_change_alert_weak_passcode_title, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_passcode_change_alert_current_date_description, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_passcode_change_alert_button_title, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 4);
        }
        if (error instanceof SsoServerError.PasscodeContainsIndividualCreatedDate) {
            ((b) aVar).getClass();
            return new y0("DIALOG_ID_PASSCODE_CONTAINS_INDIVIDUAL_CREATED_DATE", new z(new TextLocalisedClause(R$string.revolut_sso_passcode_change_alert_weak_passcode_title, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_passcode_change_alert_individual_created_date_description, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_passcode_change_alert_button_title, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 4);
        }
        if (error instanceof SsoServerError.PasscodeIsNotStrong) {
            ((b) aVar).getClass();
            return new y0("DIALOG_ID_PASSCODE_IS_NOT_STRONG", new z(new TextLocalisedClause(R$string.revolut_sso_passcode_change_alert_weak_passcode_title, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_passcode_change_alert_weak_passcode_description, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_passcode_change_alert_button_title, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 4);
        }
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
        d.a(rd0.c.ERROR, "Revolut SSO", null, error, h0Var);
        ((b) aVar).getClass();
        return new y0("DIALOG_ID_PASSCODE_UPDATE_GENERAL_ERROR", new z(new TextLocalisedClause(R$string.revolut_sso_passcode_change_alert_general_error_title, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_passcode_change_alert_general_error_description, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_common_actions_got_it, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 4);
    }
}
