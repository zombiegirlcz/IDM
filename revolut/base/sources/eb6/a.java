package eb6;

import android.os.Parcelable;
import aw0.e;
import aw0.n6;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.donations.impl.R$string;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import grl.k9;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public static ActionsBottomSheetController a(boolean z) {
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.donations_donated_amount_info_screen_title, null, null, 14), new TextLocalisedClause(z ? R$string.donations_donated_amount_info_screen_same_currency_description : R$string.donations_donated_amount_info_screen_different_currency_description, null, null, 14), null, null, false, 28);
        e eVar = new e(false, null, null, new n6(new TextLocalisedClause(R$string.donations_donated_amount_info_screen_screen_action, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
        k9 k9Var = k9.Donations;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return new ActionsBottomSheetController(new dii.a(aVar, eVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
    }
}
