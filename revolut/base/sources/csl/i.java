package csl;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.trading_orders.common.models.AutoTopUpSource;
import com.revolut.feature.trading_orders.common.models.FrequencySettings;
import com.revolut.retail.trading.core.domain.orders.OrderExpiry;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.trading.orders.ui.trade.model.ExtendedHoursStatus;
import java.util.List;
import k4l.r0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes12.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kvl.f f108540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wul.j f108541b;

    public i(kvl.f autoTopUpMapper, wul.j scheduleSettingsMapper) {
        Intrinsics.checkNotNullParameter(autoTopUpMapper, "autoTopUpMapper");
        Intrinsics.checkNotNullParameter(scheduleSettingsMapper, "scheduleSettingsMapper");
        this.f108540a = autoTopUpMapper;
        this.f108541b = scheduleSettingsMapper;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r19v4 */
    /* JADX WARN: Type inference failed for: r19v5, types: [com.revolut.core.ui_kit_core.displayers.image.Image] */
    /* JADX WARN: Type inference failed for: r19v6 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v10, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r3v8, types: [aim.e, java.util.List] */
    public final aim.e a(qvl.d orderSettings) {
        TextLocalisedClause textLocalisedClause;
        ResourceImage resourceImage;
        Clause textLocalisedClause2;
        int i;
        ?? model;
        ?? model2;
        ?? model3;
        TextLocalisedClause textLocalisedClause3;
        Clause textLocalisedClause4;
        boolean z;
        Intrinsics.checkNotNullParameter(orderSettings, "orderSettings");
        r0 r0Var = orderSettings.f249719a;
        Amount amount = orderSettings.f249720b;
        OrderExpiry orderExpiry = orderSettings.d;
        ExtendedHoursStatus extendedHoursStatus = orderSettings.f;
        FrequencySettings frequencySettings = orderSettings.f249722g;
        od0.i iVar = orderSettings.f249723h;
        boolean z3 = orderSettings.f249721c;
        boolean z4 = orderSettings.e;
        CellDetailsActionDelegate.Model model4 = null;
        if (oi0.d.y(r0Var) || oi0.d.D(r0Var)) {
            int i2 = h.f108538a[r0Var.ordinal()];
            if (i2 == 1) {
                textLocalisedClause = new TextLocalisedClause(R$string.wealth_trading_orders_limit_price, null, null, 14);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("add handler for " + r0Var);
                }
                textLocalisedClause = new TextLocalisedClause(R$string.wealth_trading_orders_stop_price, null, null, 14);
            }
            TextLocalisedClause textLocalisedClause5 = textLocalisedClause;
            if (amount != null) {
                resourceImage = null;
                textLocalisedClause2 = e4i.c.a(amount, null, null, null, null, o9.NON_SENSITIVE, 31);
            } else {
                resourceImage = null;
                textLocalisedClause2 = new TextLocalisedClause(R$string.trading_common_action_set_up, null, null, 14);
            }
            Clause clause = textLocalisedClause2;
            i = 14;
            model4 = new CellDetailsActionDelegate.Model("SET_LIMITS_ITEM", textLocalisedClause5, 0, z3 ? new ResourceImage(R$drawable.uikit_icn_24_pencil, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246) : resourceImage, clause, null, false, z3, null, null, null, 0, 0, 0, 0, 4194148);
            model = resourceImage;
        } else {
            model = 0;
            i = 14;
        }
        if (extendedHoursStatus == null || (extendedHoursStatus instanceof ExtendedHoursStatus.Unavailable)) {
            model2 = model;
        } else {
            if (extendedHoursStatus instanceof ExtendedHoursStatus.OptedOut) {
                z = false;
            } else {
                if (!(extendedHoursStatus instanceof ExtendedHoursStatus.OptedIn)) {
                    if (extendedHoursStatus == null || (extendedHoursStatus instanceof ExtendedHoursStatus.Unavailable)) {
                        throw new IllegalStateException();
                    }
                    throw new NoWhenBranchMatchedException();
                }
                z = ((ExtendedHoursStatus.OptedIn) extendedHoursStatus).f107063a;
            }
            model2 = new CellDetailsSwitcherDelegate.Model("LIST_ID_EXTENDED_HOURS_SWITCHER", new TextLocalisedClause(com.revolut.trading.orders.R$string.wealth_trading_orders_include_extended_hours, model, model, i), z, true, R$drawable.uikit_icn_16_info_outline, null, null, null, 4064);
        }
        if (orderExpiry != null) {
            TextLocalisedClause textLocalisedClause6 = new TextLocalisedClause(R$string.wealth_trading_orders_review_expiry, model, model, i);
            switch (h.f108539b[orderExpiry.f104648b.ordinal()]) {
                case 1:
                    textLocalisedClause4 = new TextLocalisedClause(com.revolut.trading.orders.R$string.trading_orders_expiry_date_today_title, model, model, i);
                    break;
                case 2:
                    textLocalisedClause4 = new TextLocalisedClause(com.revolut.trading.orders.R$string.trading_orders_expiry_date_next_trading_day_title, model, model, i);
                    break;
                case 3:
                    textLocalisedClause4 = new TextLocalisedClause(com.revolut.trading.orders.R$string.trading_orders_expiry_date_one_week_title, model, model, i);
                    break;
                case 4:
                    textLocalisedClause4 = new TextLocalisedClause(com.revolut.trading.orders.R$string.trading_orders_expiry_date_ninety_days_title, model, model, i);
                    break;
                case 5:
                    textLocalisedClause4 = new TextLocalisedClause(com.revolut.trading.orders.R$string.trading_orders_expiry_date_six_months_title, model, model, i);
                    break;
                case 6:
                    long jI = pu7.a.I(orderExpiry.f104647a);
                    TimeClause.Format.INSTANCE.getClass();
                    textLocalisedClause4 = new TimeClause(jI, TimeClause.Format.f57959a, null, null, 12);
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            model3 = new CellDetailsActionDelegate.Model("SET_EXPIRY_ITEM", textLocalisedClause6, 0, z4 ? new ResourceImage(R$drawable.uikit_icn_24_pencil, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246) : model, textLocalisedClause4, null, false, z4, null, null, null, 0, 0, 0, 0, 4194148);
        } else {
            model3 = model;
        }
        ?? B = frequencySettings != null ? this.f108541b.b(frequencySettings.f91773a, frequencySettings.f91774b, true) : model;
        if (iVar != null) {
            AutoTopUpSource autoTopUpSource = (AutoTopUpSource) iVar.f224257a;
            ((lvl.b) this.f108540a).getClass();
            ResourceImage resourceImage2 = new ResourceImage(autoTopUpSource != null ? R$drawable.uikit_icn_24_pencil : R$drawable.uikit_icn_16_topup_auto, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246);
            if (autoTopUpSource == null) {
                textLocalisedClause3 = new TextLocalisedClause(R$string.wealth_trading_orders_auto_topup_add, null, null, 14);
            } else {
                if (!(autoTopUpSource instanceof AutoTopUpSource.Pocket)) {
                    throw new NoWhenBranchMatchedException();
                }
                int i3 = R$string.wealth_trading_orders_auto_topup_details_format;
                xi0.a aVar = xi0.b.Companion;
                String str = ((AutoTopUpSource.Pocket) autoTopUpSource).f91770a.f163147c;
                aVar.getClass();
                textLocalisedClause3 = new TextLocalisedClause(i3, u.c(new CurrencyClause(xi0.a.a(str), CurrencyClause.Format.Ticker.f57756a, null, 4)), null, 12);
            }
            model = new CellDetailsActionDelegate.Model("AUTO_TOP_UP_SETTINGS_ITEM", new TextLocalisedClause(R$string.wealth_trading_orders_auto_topup, null, null, 14), R$drawable.uikit_icn_16_info_outline, resourceImage2, textLocalisedClause3, false, false, null, autoTopUpSource, 0, 0, 32224);
        }
        ?? B2 = u.b();
        if (model2 != 0) {
            B2.add(model2);
        }
        if (model4 != null) {
            B2.add(model4);
        }
        if (model3 != 0) {
            B2.add(model3);
        }
        if (B != 0) {
            B2.add(B);
        }
        if (model != 0) {
            B2.add(model);
        }
        aim.e eVarA = u.a(B2);
        yp0.b.k(eVarA, R$attr.uikit_dp0, R$attr.uikit_dp16, 0, 0, 28);
        return eVarA;
    }
}
