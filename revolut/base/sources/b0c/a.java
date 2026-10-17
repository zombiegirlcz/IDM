package b0c;

import android.os.Parcelable;
import aw0.h;
import aw0.k7;
import aw0.n6;
import aw0.o9;
import aw0.p9;
import aw0.wa;
import bnh.f;
import bnh.g;
import bnh.q;
import bq7.e;
import bq7.i;
import bq7.m;
import bxg.l;
import cfl.p;
import com.revolut.core.ui_kit.delegates.ActionCardDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.kj;
import com.revolut.core.ui_kit.delegates.mj;
import com.revolut.core.ui_kit.models.AssetClause;
import com.revolut.core.ui_kit.models.AssetClauseType;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.shared_separate_favourites.domain.watchlist.Watchlist;
import com.revolut.feature.wealth.analytics.ui.widgetised.models.PnLValues;
import com.revolut.retail.feature.esim.api.model.EsimSubscriptionPhoneNumberCancellationPreview;
import com.revolut.retail.feature.esim.impl.R$string;
import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import com.revolut.shared.feature.wealth.ui_kit.models.image.InstrumentImage;
import com.youTransactor.uCube.rpc.Constants;
import d9.e1;
import ip0.cp0;
import ip0.iq;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import koi.j;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.text.d0;
import nel.a0;
import xl7.n;
import xzg.k;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class a implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11645a;

    public /* synthetic */ a(int i) {
        this.f11645a = i;
    }

    private final Object a(Object obj2, Object obj3, Object obj4) {
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter((EsimSubscriptionPhoneNumberCancellationPreview) obj2, "<unused var>");
        return new h(false, new n6(new TextLocalisedClause(R$string.esim_mobile_plans_secondary_number_termination_cta, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(com.revolut.kompot.common.R$string.common_action_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, null, 121);
    }

    private final Object b(Object obj2, Object obj3, Object obj4) {
        bnh.h content = (bnh.h) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        if (content instanceof g) {
            ArrayList arrayList = ((g) content).f17184b;
            ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
            Iterator it8 = arrayList.iterator();
            while (it8.hasNext()) {
                arrayList2.add(new bnh.b((q) it8.next(), true));
            }
            return arrayList2;
        }
        if (!(content instanceof f)) {
            if (Intrinsics.f(content, bnh.e.f17179a)) {
                return f0.f322471a;
            }
            throw new NoWhenBranchMatchedException();
        }
        List list = ((f) content).f17181a;
        ArrayList arrayList3 = new ArrayList(w.t(list, 10));
        Iterator it9 = list.iterator();
        while (it9.hasNext()) {
            arrayList3.add(new bnh.b((q) it9.next(), false));
        }
        return arrayList3;
    }

    private final Object c(Object obj2, Object obj3, Object obj4) {
        CellDetailsDelegate.Model model;
        bq7.e dVar;
        kl7.a refund = (kl7.a) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        Intrinsics.checkNotNullParameter(refund, "refund");
        RowDelegate.Model model2 = new RowDelegate.Model("EFFECTIVE_DATE_ID", n.k(R$drawable.uikit_icn_24_calendar, false, null, 15), new TextLocalisedClause(com.revolut.feature.insurance_car.impl.R$string.car_insurance_policy_cancellation_refund_effective_date, null, null, 14), null, 0, n.h(refund.f185288b), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872);
        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        dj0.d dVar2 = refund.f185289c;
        if (dVar2 != null) {
            CellDetailsDelegate.Model model3 = new CellDetailsDelegate.Model("REFUND_ID", new TextLocalisedClause(com.revolut.feature.insurance_car.impl.R$string.car_insurance_policy_cancellation_refund_refund_amount, null, null, 14), n.g(dVar2, null, null, 3), 0, null, null, null, null, null, false, 0, 0, 32760);
            yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
            model = model3;
        } else {
            model = null;
        }
        j[] elements = {model2, model};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        TextLocalisedClause textLocalisedClause = refund.d ? new TextLocalisedClause(com.revolut.feature.insurance_car.impl.R$string.car_insurance_policy_cancellation_refund_description_payment_overdue, v.k(new TextLocalisedClause(com.revolut.feature.insurance_car.impl.R$string.car_insurance_policy_cancellation_refund_description_policy_wording, null, new Click(30, (Integer) null, (Object) null, "POLICY_WORDING", false), 10), m.b()), null, 12) : refund.e ? new TextLocalisedClause(com.revolut.feature.insurance_car.impl.R$string.car_insurance_policy_cancellation_refund_description_claim_exists, v.k(new TextLocalisedClause(com.revolut.feature.insurance_car.impl.R$string.car_insurance_policy_cancellation_refund_description_policy_wording, null, new Click(30, (Integer) null, (Object) null, "POLICY_WORDING", false), 10), m.b()), null, 12) : new TextLocalisedClause(com.revolut.feature.insurance_car.impl.R$string.car_insurance_policy_cancellation_refund_description, u.c(m.b()), null, 12);
        if (zBooleanValue) {
            dVar = e.b.f17776a;
        } else {
            Object[] elements2 = {new TextLocalisedClause(com.revolut.feature.insurance_car.impl.R$string.car_insurance_policy_cancellation_refund_title, null, null, 14), dVar2 != null ? n.g(dVar2, null, null, 3) : null};
            Intrinsics.checkNotNullParameter(elements2, "elements");
            dVar = new bq7.d(new CompositeClause(kotlin.collections.d.L(elements2), new DotDividerClause((Integer) null), null, null, 12));
        }
        return new i(listL, textLocalisedClause, dVar);
    }

    private final Object d(Object obj2, Object obj3, Object obj4) {
        k collection = (k) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(collection, "collection");
        return collection.e();
    }

    private final Object e(Object obj2, Object obj3, Object obj4) {
        bxg.g assetIndicator = (bxg.g) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(assetIndicator, "assetIndicator");
        return new l(new TextClause(assetIndicator.f19685a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(assetIndicator.f19686b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), u.c(IconNavBarMenuItem.Companion.a(IconNavBarMenuItem.INSTANCE, "ASSET_INDICATOR_INFO_ICON_LIST_ID", new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, 124)));
    }

    private final Object g(Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        RowDelegate.Model.c.b bVar;
        Clause textClause;
        Pair pair;
        Clause clauseM;
        bxg.g sortedAssets = (bxg.g) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(sortedAssets, "sortedAssets");
        List list = sortedAssets.f;
        pwg.q sortOrder = sortedAssets.d;
        List<pwg.b> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (pwg.b asset : list2) {
            if (asset == null) {
                throw new NoWhenBranchMatchedException();
            }
            kel.n nVar = asset.f240450a;
            String str = nVar.e;
            Intrinsics.checkNotNullParameter(asset, "asset");
            a0 a0Var = asset.f240451b;
            nel.n nVar2 = a0Var.f214560a;
            String strQ = j6.a.q("STOCK_ASSET_LIST_ID_", str);
            RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(new InstrumentImage(str, 30, null, null), null, null, false, null, false, 62);
            pwg.g assetValue = asset.f240452c;
            if (assetValue != null) {
                Intrinsics.checkNotNullParameter(assetValue, "assetValue");
                if (assetValue instanceof pwg.f) {
                    float f = ((pwg.f) assetValue).f240460a;
                    PercentageClause.Format.Custom custom = new PercentageClause.Format.Custom(2, 2, p9.NEVER, wa.SHOW_ALL_ZEROES, null);
                    BigDecimal bigDecimal = new BigDecimal(String.valueOf(f));
                    if (e1.I(bigDecimal)) {
                        clauseM = new PercentageClause(bigDecimal, custom, (Style) null, 4);
                        i2 = 0;
                    } else {
                        if (e1.G(bigDecimal)) {
                            i2 = 0;
                            pair = new Pair(Integer.valueOf(R$drawable.uikit_icn_10_stocks_arrow_up), Integer.valueOf(R$attr.uikit_colorPerformancePositive));
                        } else {
                            i2 = 0;
                            pair = new Pair(Integer.valueOf(R$drawable.uikit_icn_10_stocks_arrow_down), Integer.valueOf(R$attr.uikit_colorPerformanceNegative));
                        }
                        int iIntValue = ((Number) pair.f186385a).intValue();
                        int iIntValue2 = ((Number) pair.f186386b).intValue();
                        ImageClause imageClause = new ImageClause(iIntValue, Integer.valueOf(iIntValue2), (Float) null, (Float) null, 28);
                        PercentageClause percentageClause = new PercentageClause(bigDecimal, custom, new Custom(Integer.valueOf(iIntValue2), false, null, false, null, 254));
                        Clause[] clauseArr = new Clause[2];
                        clauseArr[i2] = imageClause;
                        clauseArr[1] = percentageClause;
                        clauseM = yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(clauseArr));
                    }
                    textClause = clauseM;
                } else {
                    i2 = 0;
                    if (!(assetValue instanceof pwg.e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    textClause = new TextClause(String.valueOf(((pwg.e) assetValue).f240459a), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                }
                bVar = new RowDelegate.Model.c.b(textClause, null, null, false, 126);
            } else {
                i2 = 0;
                bVar = null;
            }
            TextClause textClause2 = new TextClause(nVar2.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            AssetClause assetClause = new AssetClause(nVar.f183174b, new AssetClauseType.Stock(i2), nVar2.e, null, null, 24);
            InstrumentTicker instrumentTicker = a0Var.f214561b;
            List listK = v.k(assetClause, new MoneyClause(pyd.c.M(instrumentTicker != null ? instrumentTicker.e : null), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12));
            m70.a.a(t0.f186434a);
            arrayList.add(new RowDelegate.Model(strQ, image40, textClause2, null, 0, yoj.b.m(new TextClause(" · ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), listK), null, null, 0, bVar, true, null, false, null, null, null, null, null, null, asset, null, 0, 0, 0, 0, 532673496));
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.wealth.analytics.R$string.wealth_analytics_widgetised_portfolio_insights_assets, null, null, 14);
        String sortOrderLabel = sortedAssets.f19687c;
        Float fValueOf = Float.valueOf(16.0f);
        Intrinsics.checkNotNullParameter(sortOrderLabel, "sortOrderLabel");
        Intrinsics.checkNotNullParameter(sortOrder, "sortOrder");
        int i3 = bxg.v.f19701a[sortOrder.ordinal()];
        if (i3 == 1) {
            i = R$drawable.uikit_icn_24_arrow_thin_up;
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$drawable.uikit_icn_24_arrow_thin_down;
        }
        return yp0.b.g(arrayList, new ListSubheaderDelegate.Model("ASSET_INDICATOR_SUBHEADER_LIST_ID", (Image) null, (Clause) textLocalisedClause, (Image) null, (Clause) yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(new TextClause(sortOrderLabel, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new ImageClause(i, Integer.valueOf(R$attr.uikit_colorAccent), fValueOf, fValueOf, 16))), (String) null, (ListSubheaderDelegate.Model.a) new ListSubheaderDelegate.Model.a.b(false, false, true, 3), false, false, (Object) new bxg.k(sortOrder), (Parcelable) null, 0, 0, 0, 0, 64426), null, 0, 0, 126);
    }

    private final Object h(Object obj2, Object obj3, Object obj4) {
        fzg.g breakdown = (fzg.g) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(breakdown, "breakdown");
        aw0.t0 t0Var = new aw0.t0((Clause) new TextLocalisedClause(com.revolut.feature.wealth.analytics.R$string.wealth_analytics_widgetised_profit_and_loss_profit_factor, null, null, 14), (Image) new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), 0, false, 28);
        BigDecimal bigDecimal = breakdown.f139201a;
        CellDetailsDelegate.Model model = new CellDetailsDelegate.Model("BREAKDOWN_FIRST_LIST_ID", t0Var, bigDecimal != null ? new NumberClause(bigDecimal, new NumberClause.Format.FixedDigitsAfterDot(1, 8, null, wa.STRIP_ALL_TRAILING_ZEROES, RoundingMode.HALF_EVEN), null, null, 12) : new TextClause("-", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, null, 0, null, false, true, null, null, 28664);
        aw0.t0 t0Var2 = new aw0.t0((Clause) new TextLocalisedClause(com.revolut.feature.wealth.analytics.R$string.wealth_analytics_widgetised_profit_and_loss_win_rate, null, null, 14), (Image) new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), 0, false, 28);
        BigDecimal bigDecimal2 = breakdown.f139202b;
        List listK = v.k(model, new CellDetailsDelegate.Model("BREAKDOWN_SECOND_LIST_ID", t0Var2, bigDecimal2 != null ? new PercentageClause(bigDecimal2, new PercentageClause.Format.Custom(0, 12, null, null, RoundingMode.HALF_EVEN), (Style) null, 4) : new TextClause("-", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, null, 0, null, false, true, null, null, 28664));
        yp0.b.k(listK, R$attr.uikit_dp0, 0, 0, 0, 30);
        return listK;
    }

    private final Object i(Object obj2, Object obj3, Object obj4) {
        PnLValues content = (PnLValues) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        aw0.t0 t0Var = new aw0.t0((Clause) new TextLocalisedClause(com.revolut.feature.wealth.analytics.R$string.wealth_analytics_widgetised_profit_and_loss_breakdown_realised, null, null, 14), (Image) new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorTransparent), (List) null, (ImageTransformations) null, (Clause) null, 246), 0, false, 28);
        dj0.d dVar = content.f95097b;
        k7 k7Var = k7.ALWAYS;
        List listK = v.k(new CellDetailsDelegate.Model("BREAKDOWN_FIRST_LIST_ID", t0Var, new MoneyClause(dVar, new MoneyClause.Format.Defaults(k7Var, null, false, false, 14), null, null, 12), null, null, null, null, 0, null, false, false, null, null, 28664), new CellDetailsDelegate.Model("BREAKDOWN_SECOND_LIST_ID", new aw0.t0((Clause) new TextLocalisedClause(com.revolut.feature.wealth.analytics.R$string.wealth_analytics_widgetised_profit_and_loss_breakdown_unrealised, null, null, 14), (Image) new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorTransparent), (List) null, (ImageTransformations) null, (Clause) null, 246), 0, false, 28), new MoneyClause(content.f95098c, new MoneyClause.Format.Defaults(k7Var, null, false, false, 14), null, null, 12), null, null, null, null, 0, null, false, false, null, null, 28664));
        yp0.b.k(listK, R$attr.uikit_dp0, 0, 0, 0, 30);
        return listK;
    }

    private final Object j(Object obj2, Object obj3, Object obj4) {
        ybl.g productGroupAvailability = (ybl.g) obj2;
        ((Boolean) obj3).booleanValue();
        Intrinsics.checkNotNullParameter(productGroupAvailability, "productGroupAvailability");
        return Boolean.valueOf(productGroupAvailability.c(p.CFD, TradingAccountType.Margin.f105271a));
    }

    private final Object k(Object obj2, Object obj3, Object obj4) {
        ybl.h productGroupAvailability = (ybl.h) obj2;
        ((Boolean) obj3).booleanValue();
        Intrinsics.checkNotNullParameter(productGroupAvailability, "productGroupAvailability");
        return Boolean.valueOf(productGroupAvailability.d(TradingAccountType.Gia.f105270a));
    }

    private final Object l(Object obj2, Object obj3, Object obj4) {
        do3.n user = (do3.n) obj2;
        ((Boolean) obj3).booleanValue();
        Intrinsics.checkNotNullParameter(user, "user");
        return do3.q.y(user);
    }

    private final Object m(Object obj2, Object obj3, Object obj4) {
        c9d.g content = (c9d.g) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        aim.e eVarB = u.b();
        List listC = u.c(content.f22355a);
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        eVarB.addAll(listC);
        eVarB.addAll(content.f22356b);
        return u.a(eVarB);
    }

    private final Object n(Object obj2, Object obj3, Object obj4) {
        hel.a config = (hel.a) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(config, "config");
        String str = config.e.B;
        if (str != null) {
            if (d0.W(str)) {
                str = null;
            }
            if (str != null) {
                kj kjVar = new kj("TRANSFER_OUT_DISCLAIMER_WEB_VIEW_LIST_ID", new mj(str, null), new cp0(true, null, null, null, 126), Constants.TAG_FULL_SVPP_IDENTIFICATION);
                yp0.b.l(kjVar, 0, R$attr.uikit_dp24, 0, 0, null, false, 61);
                List listC = u.c(kjVar);
                if (listC != null) {
                    return listC;
                }
            }
        }
        return iii.c.b(null, null, 6, true);
    }

    private final Object o(Object obj2, Object obj3, Object obj4) {
        vtd.d content = (vtd.d) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.crypto.earn.assets.shared.impl.R$string.crypto_staking_staking_overview_earned_this_month_title, null, null, 14);
        com.revolut.core.ui_kit.delegates.e eVar = com.revolut.core.ui_kit.delegates.e.SMALL;
        com.revolut.core.ui_kit.delegates.f fVar = new com.revolut.core.ui_kit.delegates.f(textLocalisedClause, eVar);
        LayeredImage.Companion companion = LayeredImage.INSTANCE;
        ActionCardDelegate.Model model = new ActionCardDelegate.Model("MONTH_REWARDS_ITEM_ID", null, companion.i(R$drawable.uikit_icn_24_calendar, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), null, fVar, null, new MoneyClause(content.f292103a, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), false, 15320);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        ActionCardDelegate.Model model2 = new ActionCardDelegate.Model("ALL_TIME_REWARDS_ITEM_ID", null, companion.i(R$drawable.uikit_icn_24_all_time, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), null, new com.revolut.core.ui_kit.delegates.f(new TextLocalisedClause(com.revolut.feature.crypto.earn.assets.shared.impl.R$string.crypto_staking_staking_overview_earned_all_time_title, null, null, 14), eVar), null, new MoneyClause(content.f292104b, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), false, 15320);
        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        return cf5.n.a(v.k(model, model2));
    }

    private final Object p(Object obj2, Object obj3, Object obj4) {
        List watchlists = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(watchlists, "watchlists");
        List<Pair> list = watchlists;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (Pair pair : list) {
            Watchlist watchlist = (Watchlist) pair.f186385a;
            arrayList.add(new InputChecklistDelegate.Model(j6.a.q("list-id-", watchlist.f86895a), new TextClause(watchlist.f86896b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), ((Boolean) pair.f186386b).booleanValue(), false, null, iq.CHECK_BUTTON, null, null, watchlist, null, 0, 0, 0, 523992));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:293:0x0d6e  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0d70  */
    @Override // kotlin.jvm.functions.Function3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r62, java.lang.Object r63, java.lang.Object r64) {
        /*
            Method dump skipped, instruction units count: 3598
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b0c.a.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ a(Object obj2, int i) {
        this.f11645a = i;
    }
}
