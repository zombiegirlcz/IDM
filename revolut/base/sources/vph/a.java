package vph;

import android.os.Parcelable;
import aw0.n6;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.retail.wealth.resources.R$string;
import grl.k9;

/* JADX INFO: loaded from: classes10.dex */
public final class a {
    public static dii.a a() {
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.screener_all_filters_screen_reset_dialog_title, null, null, 14), new TextLocalisedClause(R$string.screener_all_filters_screen_reset_dialog_description, null, null, 14), null, null, false, 28);
        aw0.g gVar = new aw0.g(new n6(new TextLocalisedClause(R$string.screener_all_filters_screen_reset_dialog_no, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(R$string.screener_all_filters_screen_reset_dialog_yes, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), (Clause) null, (aw0.f) null, 25);
        k9 k9Var = k9.Wealth;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return new dii.a(aVar, gVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24);
    }
}
