package sf9;

import android.os.Parcelable;
import aw0.n6;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.pay_bills_taxes.api.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import grl.k9;

/* JADX INFO: loaded from: classes5.dex */
public final class a {
    public static dii.a a() {
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.pay_bills_taxes_country_mx_bill_number_bottom_dialog_title, null, null, 14), new TextLocalisedClause(R$string.pay_bills_taxes_country_mx_bill_number_bottom_dialog_subtitle, null, null, 14), null, null, false, 28);
        aw0.e eVar = new aw0.e(false, null, null, new n6(new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
        k9 k9Var = k9.Payments;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return new dii.a(aVar, eVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24);
    }
}
