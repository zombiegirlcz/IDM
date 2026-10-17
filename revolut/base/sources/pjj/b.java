package pjj;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import com.revolut.retail.feature.esim.impl.R$string;
import com.revolut.retail.feature.esim.impl.ui.screens.checkout.dialogs.CheckoutSuccessDialogResult;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.w1;

/* JADX INFO: loaded from: classes11.dex */
public final class b {
    public static j0 a(TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2) {
        return new j0((Clause) textLocalisedClause, (Clause) textLocalisedClause2, (StatusDialogDescriptionProgress) null, (Parcelable) CheckoutSuccessDialogResult.InstallationUnavailable.f100932a, (u1) new w1(6, new TextLocalisedClause(R$string.common_action_got_it, null, null, 14), null), false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4068);
    }
}
