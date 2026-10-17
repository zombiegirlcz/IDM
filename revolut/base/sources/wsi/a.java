package wsi;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import com.revolut.retail.feature.adjust_analytics.api.R$string;
import nii.g0;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.y0;
import org.jetbrains.annotations.NotNull;
import tsi.b;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements b {

    @NotNull
    public static final C1655a Companion = new C1655a();

    /* JADX INFO: renamed from: wsi.a$a, reason: collision with other inner class name */
    public static final class C1655a {
        private C1655a() {
        }
    }

    public final y0 a(boolean z) {
        return z ? new y0("EXCLUDE_RECURRING_PROCESSING_DIALOG", new g0(new TextLocalisedClause(R$string.analytics_adjust_amount_processing_bottom_sheet_title, null, null, 14), new TextLocalisedClause(R$string.analytics_adjust_amount_processing_bottom_sheet_description, null, null, 14), null, null, null, null, null, null, false, null, false, null, 16380), false, 4) : new y0("EXCLUDE_RECURRING_SUCCEED_DIALOG", new j0((Clause) new TextLocalisedClause(R$string.analytics_adjust_amount_success_bottom_sheet_title, null, null, 14), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4094), false, 4);
    }
}
