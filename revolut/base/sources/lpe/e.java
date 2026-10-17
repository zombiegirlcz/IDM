package lpe;

import android.os.Parcelable;
import aw0.n6;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.tax_residency.impl.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import grl.k9;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class e {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static dii.a a() {
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.tin_flow_learn_more_title, null, null, 14), new TextLocalisedClause(R$string.tin_flow_learn_more_description, null, null, 14), null, null, false, 20);
        aw0.e eVar = new aw0.e(false, null, null, new n6(new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, "what_is_tax_residency_dialog_large_action_button_id", false, null, null, 1000), null, null, 55);
        k9 k9Var = k9.Onboarding;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return new dii.a(aVar, eVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24);
    }
}
