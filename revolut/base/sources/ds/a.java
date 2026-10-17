package ds;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.biometric_verification.impl.ui.flow.dialogs.SuccessUploadDialogPayload;
import com.revolut.camerakit.revolut.ui.R$string;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;
import nii.b0;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.y0;
import nii.z;
import rd0.e;
import vkm.z1;

/* JADX INFO: loaded from: classes17.dex */
public final class a {
    public static y0 a() {
        return new y0(null, new z(new TextLocalisedClause(R$string.vision_error_invalid_token_title, null, null, 14), new TextLocalisedClause(R$string.vision_error_invalid_token_description, null, null, 14), new TextLocalisedClause(R$string.vision_error_invalid_token_try_again, null, null, 14), null, null, null, true, null, null, null, null, null, null, 32500), false, 5);
    }

    public static y0 b(z1 progressSource) {
        Intrinsics.checkNotNullParameter(progressSource, "progressSource");
        return new y0(null, new b0(new TextLocalisedClause(R$string.vision_upload_uploading, null, null, 14), null, null, null, e.c(progressSource, g.f186406a), 0, true, false, null, 1838), false, 5);
    }

    public static y0 c() {
        return new y0(null, new z(new TextLocalisedClause(R$string.vision_error_generic_title, null, null, 14), new TextLocalisedClause(R$string.vision_error_generic_description, null, null, 14), new TextLocalisedClause(R$string.vision_error_generic_action_try_again, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 5);
    }

    public static y0 d() {
        return new y0(null, new z(new TextLocalisedClause(R$string.vision_upload_error_rejection_selfie_title, null, null, 14), new TextLocalisedClause(R$string.vision_upload_please_retake, null, null, 14), new TextLocalisedClause(R$string.vision_upload_retake_photo, null, null, 14), null, null, null, true, null, null, null, null, null, null, 32500), false, 5);
    }

    public static y0 e() {
        return new y0(null, new z(new TextLocalisedClause(R$string.vision_upload_error_internet_connection_selfie_title, null, null, 14), new TextLocalisedClause(R$string.camera_capture_error_internet_connection, null, null, 14), new TextLocalisedClause(R$string.vision_upload_retry, null, null, 14), null, null, null, true, null, null, null, null, null, null, 32500), false, 5);
    }

    public static y0 f() {
        return new y0(null, new j0((Clause) new TextLocalisedClause(R$string.vision_upload_uploaded, null, null, 14), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) SuccessUploadDialogPayload.f50473a, (u1) null, true, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4054), false, 5);
    }
}
