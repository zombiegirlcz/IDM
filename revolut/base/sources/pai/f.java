package pai;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.user_declarations.shared.R$string;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.y0;
import nii.z;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class f {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static y0 a() {
        return new y0("EMAIL_VERIFICATION_STATUS_DIALOG_ID", new z(new TextLocalisedClause(R$string.signup_main_form_email_verify_status_failure_title, null, null, 14), new TextLocalisedClause(R$string.signup_main_form_email_verify_status_failure_subtitle, null, null, 14), new TextLocalisedClause(R$string.common_action_got_it, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 4);
    }

    public static y0 b() {
        return new y0("EMAIL_VERIFICATION_STATUS_DIALOG_ID", new j0((Clause) new TextLocalisedClause(R$string.signup_main_form_email_verify_status_success_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.signup_main_form_email_verify_status_success_subtitle, null, null, 14), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4092), false, 4);
    }
}
