package tt;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.camerakit.revolut.ui.R$string;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.v1;
import nii.y0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static y0 a() {
        return new y0("DOCUMENT_SCANNED_DIALOG_ID", new j0((Clause) new TextLocalisedClause(R$string.vision_capture_flip_document_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.vision_capture_flip_document_description, null, null, 14), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) new v1(new TextLocalisedClause(R$string.vision_capture_flip_document_proceed, null, null, 14), null), false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4076), false, 4);
    }
}
