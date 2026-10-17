package o9a;

import android.os.Parcelable;
import aw0.n6;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.pix.impl.R$string;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import grl.k9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public abstract class a {
    public static final ActionsBottomSheetController a() {
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.pix_authorisation_request_notify_before_payment_modal_title, null, null, 14), null, null, null, false, 30);
        aw0.e eVar = new aw0.e(false, null, null, new n6(new TextLocalisedClause(R$string.pix_authorisation_request_notify_before_payment_modal_action, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.pix_authorisation_request_notify_before_payment_modal_description, null, null, 14);
        k9 value = k9.ProductUnspecified;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        Intrinsics.checkNotNullParameter(value, "value");
        return new ActionsBottomSheetController(new dii.a(aVar, eVar, new AnalyticsProduct.Retail(value), (AnalyticsContext) null, textLocalisedClause));
    }
}
