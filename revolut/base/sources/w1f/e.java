package w1f;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.trade_rev_points.api.R$string;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.w1;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements d {
    @Override // w1f.d
    public final j0 a(c options) {
        List titleArgs = options.f293849a;
        Intrinsics.checkNotNullParameter(options, "options");
        if (options.d) {
            Intrinsics.checkNotNullParameter(titleArgs, "titleArgs");
            return new j0((Clause) new TextLocalisedClause(R$string.miles_top_up_status_sheet_success_title, titleArgs, null, 12), (Clause) new TextLocalisedClause(com.revolut.feature.travel.miles.api.R$string.miles_top_up_status_sheet_success_spare_change_description, null, null, 14), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) new w1(2, new TextLocalisedClause(com.revolut.feature.travel.miles.api.R$string.miles_top_up_status_sheet_success_spare_change_button_accept, null, null, 14), new TextLocalisedClause(com.revolut.feature.travel.miles.api.R$string.miles_top_up_status_sheet_success_spare_change_button_cancel, null, null, 14)), false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4076);
        }
        return d8l.d.i(titleArgs, options.f293851c, options.f293850b);
    }
}
