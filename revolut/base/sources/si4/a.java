package si4;

import android.os.Parcelable;
import aw0.e;
import aw0.n6;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.credit.application.plugins.api.models.config.SpousalConsentPartnerPopupScreenConfig;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import grl.k9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public abstract class a {
    public static final ActionsBottomSheetController a(SpousalConsentPartnerPopupScreenConfig config, w0 w0Var) {
        Intrinsics.checkNotNullParameter(config, "config");
        lw0.a aVar = new lw0.a(config.getF66421a(), config.getF66422b(), null, null, false, 28);
        e eVar = new e(false, null, null, new n6(config.getF66423c(), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1016), null, null, 55);
        k9 value = k9.Credit;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        Intrinsics.checkNotNullParameter(value, "value");
        return new ActionsBottomSheetController(new dii.a(aVar, eVar, new AnalyticsProduct.Retail(value), new AnalyticsContext(w0Var), null, 16));
    }
}
