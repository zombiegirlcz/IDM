package dpe;

import aw0.e;
import aw0.n6;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.tax_residency.api.WhatIsTaxDialogConfig;
import com.revolut.feature.tax_residency.impl.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import grl.k9;
import kotlin.jvm.internal.Intrinsics;
import tme.b;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements b {
    public final dii.a a(wi0.b countryCode, WhatIsTaxDialogConfig whatIsTaxDialogConfig) {
        Clause textLocalisedClause;
        Clause textLocalisedClause2;
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        if (whatIsTaxDialogConfig == null || (textLocalisedClause = whatIsTaxDialogConfig.f89965a) == null) {
            textLocalisedClause = new TextLocalisedClause(R$string.tax_residency_signup_intro_what_is_a_tax_residency, null, null, 14);
        }
        Clause clause = textLocalisedClause;
        if (whatIsTaxDialogConfig == null || (textLocalisedClause2 = whatIsTaxDialogConfig.f89966b) == null) {
            wi0.b.Companion.getClass();
            textLocalisedClause2 = new TextLocalisedClause(Intrinsics.f(countryCode, wi0.b.J2) ? R$string.tax_residency_list_what_is_trading_singapore_description : R$string.tax_residency_list_what_is_description, null, null, 14);
        }
        lw0.a aVar = new lw0.a(clause, textLocalisedClause2, null, null, false, 20);
        e eVar = new e(false, null, null, new n6(new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, "what_is_tax_residency_dialog_large_action_button_id", false, null, null, 1000), null, null, 55);
        AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
        k9 k9Var = frl.a.k;
        return new dii.a(aVar, eVar, com.google.android.gms.internal.mlkit_vision_face.a.g(companion, k9Var, k9Var), null, null, 24);
    }
}
