package acf;

import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
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
import zhm.d0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements c {
    public static RowDelegate.Model b(String str, ResourceImage resourceImage, TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, lbf.k kVar) {
        return new RowDelegate.Model(str, new RowDelegate.Model.MainImage.Image24(resourceImage, false, false, 6), textLocalisedClause, null, 0, textLocalisedClause2, null, null, 0, null, false, null, false, null, null, null, null, null, null, kVar, null, 0, 0, 0, 0, 532676568);
    }

    @Override // acf.c
    public final ArrayList a(m pricingPlan, hel.b tradingContext) {
        int i;
        int i2;
        TextLocalisedClause textLocalisedClause;
        RowDelegate.Model modelB;
        int i3;
        int i5;
        int i6;
        Intrinsics.checkNotNullParameter(pricingPlan, "pricingPlan");
        Intrinsics.checkNotNullParameter(tradingContext, "tradingContext");
        switch (d.f3130a[tradingContext.ordinal()]) {
            case 1:
                i = R$string.price_plan_add_ons_add_on_features_title_uk;
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                i = R$string.price_plan_add_ons_add_on_features_title;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        List listC = u.c(new ListSubheaderDelegate.Model("TRADING_ADD_ONS_FEATURES_LIST_TITLE_ID", (Image) null, (Clause) new TextLocalisedClause(i, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530));
        List<lbf.k> list = pricingPlan.d;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (lbf.k kVar : list) {
            switch (d.f3131b[kVar.ordinal()]) {
                case 1:
                    switch (d.f3130a[tradingContext.ordinal()]) {
                        case 1:
                            i2 = R$string.price_plan_add_ons_add_on_stock_trading_commision_subtitle_uk;
                            break;
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            i2 = R$string.price_plan_add_ons_add_on_stock_trading_commision_subtitle;
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_wealth, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
                    TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.price_plan_add_ons_add_on_stock_trading_commision_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10);
                    Pair pairB = nbf.a.b(pricingPlan);
                    if (pairB != null) {
                        Custom custom = new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254);
                        Intrinsics.checkNotNullParameter(pairB, "<this>");
                        textLocalisedClause = new TextLocalisedClause(i2, v.k(pairB.f186385a, pairB.f186386b), custom, 8);
                    } else {
                        textLocalisedClause = null;
                    }
                    modelB = b("TRADING_ADD_ONS_FEATURE_STOCKS_ID", resourceImage, textLocalisedClause2, textLocalisedClause, kVar);
                    break;
                case 2:
                    modelB = b("TRADING_ADD_ONS_FEATURE_CRYPTO_ID", new ResourceImage(R$drawable.uikit_icn_24_bitcoin, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R$string.price_plan_add_ons_add_on_discounted_crypto_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), new TextLocalisedClause(R$string.price_plan_add_ons_add_on_discounted_crypto_subtitle, u.c("0.12%"), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 8), kVar);
                    break;
                case 3:
                    int[] iArr = d.f3130a;
                    switch (iArr[tradingContext.ordinal()]) {
                        case 1:
                            i3 = R$string.price_plan_add_ons_add_on_advanced_analytics_title_uk;
                            break;
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            i3 = R$string.price_plan_add_ons_add_on_advanced_analytics_title;
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    switch (iArr[tradingContext.ordinal()]) {
                        case 1:
                            i5 = R$string.price_plan_add_ons_add_on_advanced_analytics_subtitle_uk;
                            break;
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            i5 = R$string.price_plan_add_ons_add_on_advanced_analytics_subtitle;
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    modelB = b("TRADING_ADD_ONS_FEATURE_ADVANCED_PORTFOLIO_ID", new ResourceImage(R$drawable.uikit_icn_24_line_chart, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(i3, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), new TextLocalisedClause(i5, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), kVar);
                    break;
                case 4:
                    modelB = b("TRADING_ADD_ONS_FEATURE_WEB_TERMINAL_ID", new ResourceImage(R$drawable.uikit_icn_24_laptop, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R$string.price_plan_add_ons_add_on_web_terminal_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), new TextLocalisedClause(R$string.price_plan_add_ons_add_on_web_terminal_subtitle, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), kVar);
                    break;
                case 5:
                    modelB = b("TRADING_ADD_ONS_EXTENDED_SECURITIES_ID", new ResourceImage(R$drawable.uikit_icn_24_rocket, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R$string.price_plan_add_ons_add_on_extended_securities_universe_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), new TextLocalisedClause(R$string.price_plan_add_ons_add_on_extended_securities_universe_subtitle, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), kVar);
                    break;
                case 6:
                    switch (d.f3130a[tradingContext.ordinal()]) {
                        case 1:
                            i6 = R$string.price_plan_add_ons_add_on_securities_trading_increased_order_limit_subtitle_uk;
                            break;
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            i6 = R$string.price_plan_add_ons_add_on_securities_trading_increased_order_limit_subtitle;
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    modelB = b("TRADING_ADD_ONS_HIGHER_ORDER_LIMITS_ID", new ResourceImage(R$drawable.uikit_icn_24_limit, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R$string.price_plan_add_ons_add_on_securities_trading_increased_order_limit_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), new TextLocalisedClause(i6, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), kVar);
                    break;
                case 7:
                    modelB = b("TRADING_ADD_ONS_DEDICATED_SUPPORT_ID", new ResourceImage(R$drawable.uikit_icn_24_chat, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R$string.price_plan_add_ons_add_on_dedicated_customer_support_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), new TextLocalisedClause(R$string.price_plan_add_ons_add_on_dedicated_customer_support_subtitle, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), kVar);
                    break;
                case 8:
                    modelB = b("TRADING_ADD_ONS_NO_MINIMUM_FEES_ID", new ResourceImage(R$drawable.uikit_icn_24_coins, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R$string.price_plan_add_ons_add_on_no_minimum_fees_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), new TextLocalisedClause(R$string.price_plan_add_ons_add_on_no_minimum_fees_subtitle, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), kVar);
                    break;
                case 9:
                    modelB = b("TRADING_ADD_ONS_ORDER_BOOK_ID", new ResourceImage(R$drawable.uikit_icn_24_lightning, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R$string.price_plan_add_ons_add_on_order_book_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), new TextLocalisedClause(R$string.price_plan_add_ons_add_on_order_book_subtitle, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), kVar);
                    break;
                case 10:
                    modelB = null;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            arrayList.add(v.l(modelB));
        }
        return d0.E0(w.u(arrayList), listC);
    }
}
