package s4i;

import aw0.m6;
import aw0.n6;
import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature_market_data_impl.ui.breakdown.kompot.flow.BreakdownFlowContract$Payloads$FaqDetails;
import com.revolut.retail.feature.payments.core.R$string;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    @NotNull
    private static final C1438a Companion = new C1438a();

    /* JADX INFO: renamed from: s4i.a$a, reason: collision with other inner class name */
    public static final class C1438a {
        private C1438a() {
        }
    }

    public static eii.b a(String str, int i, MoneyClause moneyClause, int i2) {
        return new eii.b(new CellDetailsDelegate.Model(str, new TextLocalisedClause(i, null, null, 14), moneyClause == null ? new TextClause("-", (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : moneyClause, null, new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), true, 0, null, new BreakdownFlowContract$Payloads$FaqDetails(new TextLocalisedClause(i, null, null, 14), new TextLocalisedClause(i2, null, null, 14)), null, null, 0, null, false, null, 0, 0, 0, 0, 1048008));
    }

    public static n6 b() {
        return m6.c(n6.Companion, new TextLocalisedClause(R$string.payments_core_interest_dialog_interest_applies_button, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020);
    }

    public static dii.a c(int i, int i2, AnalyticsProduct analyticsProduct) {
        return new dii.a(new lw0.a(new TextLocalisedClause(i, null, null, 14), null, null, null, false, 30), null, analyticsProduct, null, new dii.i(new TextLocalisedClause(i2, null, null, 14)), 8);
    }
}
