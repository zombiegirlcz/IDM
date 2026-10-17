package nnl;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.sso.api.R$string;
import nii.y0;
import nii.z;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements nnl.a {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public final y0 a() {
        return new y0("LIST_ID_DIALOG_MANUAL_REVIEW_REJECTED_RESCAN_DOCUMENT", new z(new TextLocalisedClause(R$string.revolut_sso_access_recovery_manual_review_info_required_popup_title, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_access_recovery_manual_review_info_required_popup_iddoc_description, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_access_recovery_manual_review_info_required_popup_iddoc_action, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 4);
    }

    public final y0 b() {
        return new y0("LIST_ID_DIALOG_MANUAL_REVIEW_REJECTED_RETAKE_FACE_OTP_VIDEO", new z(new TextLocalisedClause(R$string.revolut_sso_access_recovery_manual_review_info_required_popup_title, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_access_recovery_manual_review_info_required_popup_faceotp_description, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_access_recovery_manual_review_info_required_popup_faceotp_action, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 4);
    }

    public final y0 c() {
        return new y0("LIST_ID_DIALOG_MANUAL_REVIEW_REJECTED_RETAKE_PHOTO", new z(new TextLocalisedClause(R$string.revolut_sso_access_recovery_manual_review_info_required_popup_title, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_access_recovery_manual_review_info_required_popup_selfie_description, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_access_recovery_manual_review_info_required_popup_selfie_action, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 4);
    }
}
