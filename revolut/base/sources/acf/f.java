package acf;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.trading_add_ons.impl.R$string;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import lbf.m;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final class f implements c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Custom f3132a = new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Custom f3133b = new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254);

    public static final class a {
        private a() {
        }
    }

    public static RowDelegate.Model b(String str, ResourceImage resourceImage, TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, lbf.k kVar) {
        return new RowDelegate.Model(str, new RowDelegate.Model.MainImage.Image24(resourceImage, false, false, 6), textLocalisedClause, null, 0, textLocalisedClause2, null, null, 0, null, false, null, false, null, null, null, null, null, null, kVar, null, 0, 0, 0, 0, 532676568);
    }

    @Override // acf.c
    public final ArrayList a(m pricingPlan, hel.b tradingContext) {
        int i;
        int i2;
        int i3;
        int i5;
        Intrinsics.checkNotNullParameter(pricingPlan, "pricingPlan");
        Intrinsics.checkNotNullParameter(tradingContext, "tradingContext");
        List<lbf.k> list = pricingPlan.d;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (lbf.k kVar : list) {
            int i6 = g.f3135b[kVar.ordinal()];
            Custom custom = this.f3133b;
            Custom custom2 = this.f3132a;
            RowDelegate.Model modelB = null;
            TextLocalisedClause textLocalisedClause = null;
            switch (i6) {
                case 1:
                    switch (g.f3134a[tradingContext.ordinal()]) {
                        case 1:
                            i = R$string.price_plan_add_ons_add_on_stock_trading_commision_subtitle_uk;
                            break;
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            i = R$string.price_plan_add_ons_add_on_stock_trading_commision_subtitle;
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_wealth, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
                    TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.price_plan_add_ons_add_on_stock_trading_commision_title, null, custom2, 10);
                    Pair pairB = nbf.a.b(pricingPlan);
                    if (pairB != null) {
                        Intrinsics.checkNotNullParameter(pairB, "<this>");
                        textLocalisedClause = new TextLocalisedClause(i, v.k(pairB.f186385a, pairB.f186386b), custom, 8);
                    }
                    modelB = b("TRADING_ADD_ONS_FEATURE_STOCKS_ID", resourceImage, textLocalisedClause2, textLocalisedClause, kVar);
                    break;
                case 2:
                    modelB = b("TRADING_ADD_ONS_FEATURE_CRYPTO_ID", new ResourceImage(R$drawable.uikit_icn_24_bitcoin, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R$string.price_plan_add_ons_add_on_discounted_crypto_title, null, custom2, 10), new TextLocalisedClause(R$string.price_plan_add_ons_add_on_discounted_crypto_subtitle, u.c("0.12%"), custom, 8), kVar);
                    break;
                case 3:
                    int[] iArr = g.f3134a;
                    switch (iArr[tradingContext.ordinal()]) {
                        case 1:
                            i2 = R$string.price_plan_add_ons_add_on_advanced_analytics_title_uk;
                            break;
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            i2 = R$string.price_plan_add_ons_add_on_advanced_analytics_title;
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    switch (iArr[tradingContext.ordinal()]) {
                        case 1:
                            i3 = R$string.price_plan_add_ons_add_on_advanced_analytics_subtitle_uk;
                            break;
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            i3 = R$string.price_plan_add_ons_add_on_advanced_analytics_subtitle;
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    modelB = b("TRADING_ADD_ONS_FEATURE_ADVANCED_PORTFOLIO_ID", new ResourceImage(R$drawable.uikit_icn_24_line_chart, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(i2, null, custom2, 10), new TextLocalisedClause(i3, null, custom, 10), kVar);
                    break;
                case 4:
                    modelB = b("TRADING_ADD_ONS_FEATURE_WEB_TERMINAL_ID", new ResourceImage(R$drawable.uikit_icn_24_laptop, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R$string.price_plan_add_ons_add_on_web_terminal_title, null, custom2, 10), new TextLocalisedClause(R$string.price_plan_add_ons_add_on_web_terminal_subtitle, null, custom, 10), kVar);
                    break;
                case 5:
                    modelB = b("TRADING_ADD_ONS_EXTENDED_SECURITIES_ID", new ResourceImage(R$drawable.uikit_icn_24_rocket, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R$string.price_plan_add_ons_add_on_extended_securities_universe_title, null, custom2, 10), new TextLocalisedClause(R$string.price_plan_add_ons_add_on_extended_securities_universe_subtitle, null, custom, 10), kVar);
                    break;
                case 6:
                    switch (g.f3134a[tradingContext.ordinal()]) {
                        case 1:
                            i5 = R$string.price_plan_add_ons_add_on_securities_trading_increased_order_limit_subtitle_uk;
                            break;
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            i5 = R$string.price_plan_add_ons_add_on_securities_trading_increased_order_limit_subtitle_with_risk_warning;
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    modelB = b("TRADING_ADD_ONS_HIGHER_ORDER_LIMITS_ID", new ResourceImage(R$drawable.uikit_icn_24_limit, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R$string.price_plan_add_ons_add_on_securities_trading_increased_buy_order_limit_title, null, custom2, 10), new TextLocalisedClause(i5, null, custom, 10), kVar);
                    break;
                case 7:
                    modelB = b("TRADING_ADD_ONS_DEDICATED_SUPPORT_ID", new ResourceImage(R$drawable.uikit_icn_24_chat, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R$string.price_plan_add_ons_add_on_dedicated_customer_support_title, null, custom2, 10), new TextLocalisedClause(R$string.price_plan_add_ons_add_on_dedicated_customer_support_subtitle, null, custom, 10), kVar);
                    break;
                case 8:
                    modelB = b("TRADING_ADD_ONS_NO_MINIMUM_FEES_ID", new ResourceImage(R$drawable.uikit_icn_24_coins, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R$string.price_plan_add_ons_add_on_no_minimum_fees_title, null, custom2, 10), new TextLocalisedClause(R$string.price_plan_add_ons_add_on_no_minimum_fees_subtitle, null, custom, 10), kVar);
                    break;
                case 9:
                    modelB = b("TRADING_ADD_ONS_ORDER_BOOK_ID", new ResourceImage(R$drawable.uikit_icn_24_lightning, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R$string.price_plan_add_ons_add_on_order_book_level_2_title, null, custom2, 10), new TextLocalisedClause(R$string.price_plan_add_ons_add_on_order_book_level_2_subtitle, null, custom, 10), kVar);
                    break;
                case 10:
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            arrayList.add(v.l(modelB));
        }
        return w.u(arrayList);
    }
}
