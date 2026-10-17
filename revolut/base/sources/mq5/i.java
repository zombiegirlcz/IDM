package mq5;

import aw0.n6;
import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.crypto.withdraw.impl.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i {
    public static dii.a a(g explanation) {
        Clause textLocalisedClause;
        Clause textLocalisedClause2;
        Intrinsics.checkNotNullParameter(explanation, "explanation");
        boolean z = explanation instanceof d;
        f fVar = f.f207890a;
        e eVar = e.f207889a;
        if (z) {
            textLocalisedClause = new TextClause(((d) explanation).f207888a.f70990a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        } else if (explanation.equals(eVar)) {
            textLocalisedClause = new TextLocalisedClause(R$string.crypto_withdrawals_fees_breakdown_popup_network_fee_title, null, null, 14);
        } else {
            if (!explanation.equals(fVar)) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.crypto_withdrawals_fees_breakdown_popup_service_fee_title, null, null, 14);
        }
        if (z) {
            textLocalisedClause2 = new TextClause(((d) explanation).f207888a.f70991b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        } else if (explanation.equals(eVar)) {
            textLocalisedClause2 = new TextLocalisedClause(R$string.crypto_withdrawals_fees_breakdown_popup_network_fee_description, null, null, 14);
        } else {
            if (!explanation.equals(fVar)) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause2 = new TextLocalisedClause(R$string.crypto_withdrawals_fees_breakdown_popup_service_fee_description, null, null, 14);
        }
        return new dii.a(new lw0.a(textLocalisedClause, textLocalisedClause2, null, null, false, 28), new aw0.e(false, null, null, new n6(new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55), AnalyticsProduct.Shared.Crypto.f, null, null, 24);
    }
}
