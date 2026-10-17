package j4g;

import android.os.Parcelable;
import aw0.e;
import aw0.m6;
import aw0.n6;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.travel.flights.api.R$string;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import grl.k9;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class c {
    public static ActionsBottomSheetController a(TextLocalisedClause textLocalisedClause) {
        int i = R$attr.uikit_colorGreyTone50;
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.travel_flights_notifications_price_update, null, null, 14), new TextLocalisedClause(R$string.travel_flights_checkout_error_price_update, null, new Custom(Integer.valueOf(i), false, null, false, null, 254), 10), new lw0.b(new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(i), (List) null, new ImageTransformations(null, null, null, null, null, 24, 24, 31), (Clause) null, 182), null), null, false, 24);
        e eVar = new e(false, null, null, m6.c(n6.Companion, textLocalisedClause, LargeActionButton.ButtonStyle.d, null, null, false, null, null, null, 1020), null, null, 55);
        k9 k9Var = k9.Travel;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return new ActionsBottomSheetController(new dii.a(aVar, eVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
    }
}
