package cw8;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.kyc.api.R$string;
import nii.y0;
import nii.z;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    @NotNull
    public static final C0649a Companion = new C0649a();

    /* JADX INFO: renamed from: cw8.a$a, reason: collision with other inner class name */
    public static final class C0649a {
        private C0649a() {
        }
    }

    public static y0 a() {
        return new y0("IDNOW_EID_STATUS_DIALOG_ID", new z(new TextLocalisedClause(R$string.kyc_vendors_idnow_eid_error_verification_title, null, null, 14), new TextLocalisedClause(R$string.kyc_vendors_idnow_eid_error_verification_description, null, null, 14), new TextLocalisedClause(R$string.common_action_try_again, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 4);
    }
}
