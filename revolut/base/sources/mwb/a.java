package mwb;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.kompot.common.R$string;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import nii.g0;
import nii.h0;
import nii.j;
import nii.j0;
import nii.u1;
import nii.y0;
import nii.z;

/* JADX INFO: loaded from: classes6.dex */
public final class a {
    public static y0 a() {
        return new y0(null, new z(new TextLocalisedClause(R$string.common_error_state_title, null, null, 14), null, null, null, null, null, true, null, null, null, null, null, null, 32510), false, 5);
    }

    public static y0 b() {
        return new y0(null, new g0(new TextLocalisedClause(com.revolut.feature.rev_points.giftcards.api.R$string.gift_cards_detail_dialog_pending_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.rev_points.giftcards.api.R$string.gift_cards_detail_dialog_pending_description, null, null, 14), null, null, null, null, null, j.a.f216169a, true, null, false, null, 15996), false, 5);
    }

    public static y0 c() {
        return new y0(null, new j0((Clause) new TextLocalisedClause(com.revolut.feature.rev_points.giftcards.api.R$string.gift_cards_common_success_title, null, null, 14), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) u1.b.f216225a, true, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4046), false, 5);
    }
}
