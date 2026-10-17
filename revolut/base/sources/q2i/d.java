package q2i;

import aw0.o9;
import aw0.u0;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.RateClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.exchange.models.TakeProfitStopLoss;
import com.revolut.feature_exchange.impl.R$string;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import qv0.i;
import zhm.f0;

/* JADX INFO: loaded from: classes10.dex */
public final class d {
    public final List a(TakeProfitStopLoss takeProfitStopLoss, boolean z, xi0.b currency, xi0.b referencedCurrency) {
        Clause textLocalisedClause;
        CellDetailsDelegate.Model model;
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(referencedCurrency, "referencedCurrency");
        if (takeProfitStopLoss == null || !takeProfitStopLoss.f72159a) {
            return f0.f322471a;
        }
        Double d = takeProfitStopLoss.f72160b;
        Double d5 = takeProfitStopLoss.f72161c;
        boolean z3 = d == null && d5 == null;
        TextLocalisedClause textLocalisedClause2 = z3 ? new TextLocalisedClause(R$string.fx_orders_take_profit_stop_loss_title, null, null, 14) : new TextLocalisedClause(R$string.cryptobuysell_take_profit_stop_loss_title_abbreviation, null, null, 14);
        if (z) {
            m70.a.c(t0.f186434a);
            textLocalisedClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        } else {
            textLocalisedClause = z3 ? new TextLocalisedClause(R$string.cryptobuysell_take_profit_stop_loss_setup_label, null, null, 14) : new TextLocalisedClause(R$string.cryptobuysell_take_profit_stop_loss_edit, null, null, 14);
        }
        ResourceImage resourceImage = new ResourceImage(z3 ? R$drawable.uikit_icn_24_plus : R$drawable.uikit_icn_24_pencil, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246);
        if (z) {
            resourceImage = null;
        }
        CellDetailsActionDelegate.Model model2 = new CellDetailsActionDelegate.Model("TAKE_PROFIT_STOP_LOSS_TITLE_LIST_ID", textLocalisedClause2, 0, resourceImage, textLocalisedClause, false, false, u0.MEDIUM, null, 0, R$attr.uikit_dp0, 28512);
        if (d != null) {
            model = new CellDetailsDelegate.Model("TAKE_PROFIT_LIST_ID", new TextLocalisedClause(R$string.cryptobuysell_take_profit_stop_loss_abbreviation_take_profit, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), new RateClause(new BigDecimal(String.valueOf(d.doubleValue())), currency, new RateClause.Format.Default(referencedCurrency, true), null), 0, null, null, null, null, null, false, R$attr.uikit_dp0, d5 != null ? R$attr.uikit_dp8 : R$attr.uikit_dp16, 26608);
        } else {
            model = null;
        }
        i[] elements = {model2, model, d5 != null ? new CellDetailsDelegate.Model("STOP_LOSS_ID", new TextLocalisedClause(R$string.cryptobuysell_take_profit_stop_loss_abbreviation_stop_loss, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), new RateClause(new BigDecimal(String.valueOf(d5.doubleValue())), currency, new RateClause.Format.Default(referencedCurrency, true), null), 0, null, null, null, null, null, false, R$attr.uikit_dp0, R$attr.uikit_dp16, 26608) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        yp0.b.k(listL, z ? R$attr.uikit_dp8 : R$attr.uikit_dp0, 0, 0, 0, 30);
        return listL;
    }
}
