package j5i;

import aw0.o9;
import com.revolut.core.model.money.ScaleMode;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature_market_data_impl.ui.activity.stackedbreakdown.Screen;
import com.revolut.retail.wealth.resources.R$string;
import efm.r;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import p4i.f;
import rp0.l;
import rp0.t;
import rp0.y;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements f {
    @Override // p4i.f
    public final r E(Screen screen) {
        y yVar;
        Screen.TransactionPriceDescriptionDetails screen2 = (Screen.TransactionPriceDescriptionDetails) screen;
        Intrinsics.checkNotNullParameter(screen2, "screen");
        Intrinsics.checkNotNullParameter(screen2, "screen");
        boolean z = screen2 instanceof Screen.TransactionPriceDescriptionDetails.DirtyPrice;
        ScaleMode.TradingPrecise tradingPrecise = ScaleMode.TradingPrecise.f51443a;
        if (z) {
            Screen.TransactionPriceDescriptionDetails.DirtyPrice dirtyPrice = (Screen.TransactionPriceDescriptionDetails.DirtyPrice) screen2;
            t tVar = new t(new TextLocalisedClause(R$string.wealth_orders_bonds_dialog_price_description_dirty_price, null, null, 14), new TextLocalisedClause(R$string.wealth_orders_bonds_dialog_price_description_dirty_price_description, null, null, 14), null, 28);
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.wealth_orders_bonds_dialog_price_description_clean_price, null, null, 14);
            ej0.b bVar = dirtyPrice.f97149a;
            CellDetailsDelegate.Model model = new CellDetailsDelegate.Model("CLEAN_PRICE_CELL", textLocalisedClause, bVar != null ? new MoneyClause(mif.a.P(bVar, 0, 3), new MoneyClause.Format.Defaults(null, tradingPrecise, false, false, 5), null, null, 12) : new TextClause("-", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), true, 0, null, new b(new TextLocalisedClause(R$string.wealth_orders_bonds_dialog_price_description_clean_price, null, null, 14), new TextLocalisedClause(R$string.wealth_orders_bonds_dialog_price_description_clean_price_description, null, null, 14)), null, null, 0, null, false, null, 0, 0, 0, 0, 1048008);
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.wealth_orders_bonds_dialog_price_description_accrued_interest, null, null, 14);
            ej0.b bVar2 = dirtyPrice.f97150b;
            List listK = v.k(model, new CellDetailsDelegate.Model("ACCRUED_INTEREST_CELL", textLocalisedClause2, bVar2 != null ? new MoneyClause(mif.a.R(bVar2), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12) : new TextClause("-", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), true, 0, null, new b(new TextLocalisedClause(R$string.wealth_orders_bonds_dialog_price_description_accrued_interest, null, null, 14), new TextLocalisedClause(R$string.wealth_orders_bonds_dialog_price_description_accrued_interest_description, null, null, 14)), null, null, 0, null, false, null, 0, 0, 0, 0, 1048008));
            yp0.b.k(listK, R$attr.uikit_dp0, R$attr.uikit_dp24, 0, 0, 28);
            yVar = new y(listK, tVar, l.WINDOW, null, dirtyPrice, null, 984);
        } else {
            if (!(screen2 instanceof Screen.TransactionPriceDescriptionDetails.Units)) {
                throw new NoWhenBranchMatchedException();
            }
            Screen.TransactionPriceDescriptionDetails.Units units = (Screen.TransactionPriceDescriptionDetails.Units) screen2;
            dj0.d dVar = units.f97151a;
            t tVar2 = new t(new TextLocalisedClause(R$string.wealth_orders_bonds_dialog_price_description_units, null, null, 14), new TextLocalisedClause(R$string.wealth_orders_bonds_dialog_price_description_units_description, null, null, 14), null, 28);
            List listK2 = v.k(new CellDetailsDelegate.Model("INVESTMENT_SENSITIVITY_CELL", new TextLocalisedClause(R$string.wealth_orders_bonds_dialog_price_description_investment_sensitivity, null, null, 14), dVar != null ? new MoneyClause(pyd.c.V(dVar, units.f97152b), new MoneyClause.Format.Defaults(null, tradingPrecise, false, false, 5), null, null, 12) : new TextClause("-", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), true, 0, null, new b(new TextLocalisedClause(R$string.wealth_orders_bonds_dialog_price_description_investment_sensitivity, null, null, 14), new TextLocalisedClause(R$string.wealth_orders_bonds_dialog_price_description_investment_sensitivity_description, null, null, 14)), null, null, 0, null, false, null, 0, 0, 0, 0, 1048008), new CellDetailsDelegate.Model("FACE_VALUE_CELL", new TextLocalisedClause(R$string.wealth_orders_bonds_dialog_price_description_face_value, null, null, 14), dVar != null ? new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12) : new TextClause("-", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), true, 0, null, new b(new TextLocalisedClause(R$string.wealth_orders_bonds_dialog_price_description_face_value, null, null, 14), new TextLocalisedClause(R$string.wealth_orders_bonds_dialog_price_description_face_value_description, null, null, 14)), null, null, 0, null, false, null, 0, 0, 0, 0, 1048008));
            yp0.b.k(listK2, R$attr.uikit_dp0, R$attr.uikit_dp24, 0, 0, 28);
            yVar = new y(listK2, tVar2, l.WINDOW, null, units, null, 984);
        }
        r rVarJust = r.just(yVar);
        Intrinsics.checkNotNullExpressionValue(rVarJust, "just(...)");
        return rVarJust;
    }
}
