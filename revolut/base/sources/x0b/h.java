package x0b;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.HeaderDelegate;
import com.revolut.core.ui_kit.delegates.IconSelectorDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.delegates.widgets.GoalProgressWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.h1;
import com.revolut.core.ui_kit.delegates.widgets.j1;
import com.revolut.core.ui_kit.delegates.widgets.p1;
import com.revolut.core.ui_kit.delegates.widgets.q1;
import com.revolut.core.ui_kit.delegates.widgets.r1;
import com.revolut.core.ui_kit.delegates.widgets.t1;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClauseTint;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.TextImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.card.api.models.instalment.CreditCardCustomAmountQuote;
import com.revolut.feature.credit.card.api.models.instalment.CreditCardFutureInstalmentQuote;
import com.revolut.feature.credit.card.api.models.instalment.CreditCardInstalmentAmountBreakdown;
import com.revolut.feature.credit.card.impl.ui.instalment.repay.details.CreditCardRepayDetailsControllerScreenContract$InputData;
import com.revolut.feature.credit.core.R$plurals;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.crypto_feed.dependencies.fiatbalances.RevolutXFiatBalancesContract$RevolutXFiatBalanceData;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.youTransactor.uCube.rpc.Constants;
import ip0.hp;
import ip0.ne;
import ip0.r40;
import ip0.xn;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import jel.w2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import xs4.r;
import xs4.s;
import xs4.t;
import y4f.q;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class h implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f301556a;

    public /* synthetic */ h(int i) {
        this.f301556a = i;
    }

    private final Object a(Object obj2, Object obj3, Object obj4) {
        boolean z;
        List listE0;
        int i;
        Clause textLocalisedClause;
        com.revolut.feature.credit.card.impl.ui.instalment.repay.details.a content = (com.revolut.feature.credit.card.impl.ui.instalment.repay.details.a) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.credit_card_instalment_repay_details_title, null, null, 14);
        CreditCardRepayDetailsControllerScreenContract$InputData.RepayDetails repayDetails = content.f69486a;
        dj0.d dVar = content.f69487b;
        xs4.j jVar = new xs4.j(textLocalisedClause2, com.revolut.feature.credit.card.impl.ui.instalment.repay.details.d.j(repayDetails) ? new TextLocalisedClause(R$string.credit_card_instalment_repay_full_description, null, null, 14) : new TextLocalisedClause(R$string.credit_card_instalment_repay_details_description, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false);
        CreditCardRepayDetailsControllerScreenContract$InputData.RepayDetails repayDetails2 = content.f69486a;
        if (repayDetails2 instanceof CreditCardRepayDetailsControllerScreenContract$InputData.RepayDetails.CustomAmount) {
            CreditCardRepayDetailsControllerScreenContract$InputData.RepayDetails.CustomAmount customAmount = (CreditCardRepayDetailsControllerScreenContract$InputData.RepayDetails.CustomAmount) repayDetails2;
            CreditCardCustomAmountQuote creditCardCustomAmountQuote = customAmount.f69482b;
            dj0.d dVar2 = customAmount.f69481a;
            z = false;
            CreditCardCustomAmountQuote.InstalmentDetails instalmentDetails = creditCardCustomAmountQuote.f68761a;
            int i2 = creditCardCustomAmountQuote.f68763c;
            if (instalmentDetails == null) {
                listE0 = com.revolut.feature.credit.card.impl.ui.instalment.repay.details.d.d(dVar2, dVar2, dVar);
            } else {
                LocalDate localDate = instalmentDetails.f68766c;
                dj0.d dVar3 = creditCardCustomAmountQuote.f68762b;
                dj0.d dVar4 = instalmentDetails.e;
                if (i2 != 1) {
                    i = 1;
                    textLocalisedClause = dVar3 != null ? new TextLocalisedClause(R$string.credit_card_instalment_repay_details_payment_description_amount, v.k(Integer.valueOf(i2), com.revolut.feature.credit.card.impl.ui.instalment.repay.details.d.k(sx4.f.b(3, null, null, dVar4)), com.revolut.feature.credit.card.impl.ui.instalment.repay.details.d.k(sx4.f.b(3, null, null, dVar3))), null, 12) : new TextLocalisedQuantityClause(R$plurals.credit_card_instalment_repay_details_payment_description_amount_no_interest, Integer.valueOf(i2), v.k(Integer.valueOf(i2), com.revolut.feature.credit.card.impl.ui.instalment.repay.details.d.k(sx4.f.b(3, null, null, dVar4))), (Style) null, 24);
                } else if (dVar3 != null) {
                    i = 1;
                    textLocalisedClause = new TextLocalisedClause(R$string.credit_card_instalment_repay_details_payment_description, v.k(com.revolut.feature.credit.card.impl.ui.instalment.repay.details.d.k(sx4.f.b(3, null, null, dVar4)), com.revolut.feature.credit.card.impl.ui.instalment.repay.details.d.k(sx4.f.b(3, null, null, dVar3))), null, 12);
                } else {
                    i = 1;
                    textLocalisedClause = new TextLocalisedClause(R$string.credit_card_instalment_repay_details_payment_description_no_interest, u.c(com.revolut.feature.credit.card.impl.ui.instalment.repay.details.d.k(sx4.f.b(3, null, null, dVar4))), null, 12);
                }
                List listC = u.c(com.revolut.feature.credit.card.impl.ui.instalment.repay.details.d.e(textLocalisedClause, dVar2));
                yp0.b.k(listC, 0, 0, 0, 0, 31);
                r40 r40VarI = com.revolut.feature.credit.card.impl.ui.instalment.repay.details.d.i(sx4.f.b(i, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), null, dVar2), null);
                CompositeClause compositeClauseG = sx4.g.g(com.revolut.feature.credit.card.impl.ui.instalment.repay.details.d.a(i2 - 1, instalmentDetails.f68764a), new ImageClauseTint.Color(R$attr.uikit_colorGreyTone50));
                MoneyClause moneyClauseB = sx4.f.b(1, new Custom(null, true, null, false, null, Constants.TAG_FD_NON_SECURE_FIRMWARE_VERSION), null, creditCardCustomAmountQuote.d);
                TextLocalisedClause textLocalisedClauseB = com.revolut.feature.credit.card.impl.ui.instalment.repay.details.d.b(localDate);
                CreditCardInstalmentAmountBreakdown creditCardInstalmentAmountBreakdown = instalmentDetails.f;
                r40 r40VarH = com.revolut.feature.credit.card.impl.ui.instalment.repay.details.d.h(compositeClauseG, moneyClauseB, textLocalisedClauseB, new s(creditCardInstalmentAmountBreakdown.f68776a, creditCardInstalmentAmountBreakdown.f68777b, localDate));
                if (i2 == 1) {
                    r40VarH = null;
                }
                CreditCardInstalmentAmountBreakdown creditCardInstalmentAmountBreakdown2 = instalmentDetails.f68767g;
                dj0.d dVar5 = instalmentDetails.f68765b;
                dj0.d dVar6 = creditCardInstalmentAmountBreakdown2.f68776a;
                dj0.d dVar7 = creditCardInstalmentAmountBreakdown2.f68777b;
                LocalDate localDate2 = instalmentDetails.d;
                LocalDate localDateMinusMonths = localDate2.minusMonths(1L);
                Intrinsics.checkNotNullExpressionValue(localDateMinusMonths, "minusMonths(...)");
                r rVar = new r(dVar6, dVar7, localDateMinusMonths);
                LocalDate localDateO = oc.c.O(localDate2);
                r40[] elements = {r40VarI, r40VarH, i2 == 1 ? com.revolut.feature.credit.card.impl.ui.instalment.repay.details.d.g(sx4.g.g(sx4.f.b(3, null, null, dVar5), new ImageClauseTint.Color(R$attr.uikit_colorGreyTone50)), new TextLocalisedClause(R$string.credit_card_instalment_repay_due_on, u.c(sx4.g.b(localDateO, null)), null, 12), null, rVar) : com.revolut.feature.credit.card.impl.ui.instalment.repay.details.d.g(sx4.g.g(sx4.f.b(3, null, null, dVar5), new ImageClauseTint.Color(R$attr.uikit_colorGreyTone50)), sx4.f.b(1, new Custom(null, true, null, false, null, Constants.TAG_FD_NON_SECURE_FIRMWARE_VERSION), null, creditCardCustomAmountQuote.e), sx4.g.f(new TextLocalisedClause(R$string.credit_card_instalment_repay_last_instalment, u.c(sx4.g.b(localDateO, null)), null, 12), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254)), rVar)};
                Intrinsics.checkNotNullParameter(elements, "elements");
                listE0 = d0.E0(yp0.b.g(kotlin.collections.d.L(elements), com.revolut.feature.credit.card.impl.ui.instalment.repay.details.d.f(), null, 0, 0, 126), listC);
            }
        } else {
            z = false;
            if (!(repayDetails2 instanceof CreditCardRepayDetailsControllerScreenContract$InputData.RepayDetails.FutureInstalments)) {
                throw new NoWhenBranchMatchedException();
            }
            CreditCardRepayDetailsControllerScreenContract$InputData.RepayDetails.FutureInstalments futureInstalments = (CreditCardRepayDetailsControllerScreenContract$InputData.RepayDetails.FutureInstalments) repayDetails2;
            u.b();
            CreditCardFutureInstalmentQuote creditCardFutureInstalmentQuote = futureInstalments.f69483a;
            if (com.revolut.feature.credit.card.impl.ui.instalment.repay.details.d.j(futureInstalments)) {
                dj0.d dVar8 = creditCardFutureInstalmentQuote.d;
                listE0 = com.revolut.feature.credit.card.impl.ui.instalment.repay.details.d.d(dVar8, dVar8, dVar);
            } else {
                dj0.d dVar9 = creditCardFutureInstalmentQuote.e;
                LocalDate localDate3 = creditCardFutureInstalmentQuote.f68772h;
                dj0.d dVar10 = creditCardFutureInstalmentQuote.d;
                int i3 = creditCardFutureInstalmentQuote.f68768a;
                List listC2 = u.c(com.revolut.feature.credit.card.impl.ui.instalment.repay.details.d.e(dVar9 != null ? new TextLocalisedQuantityClause(R$plurals.credit_card_instalment_repay_details_payment_description_future, Integer.valueOf(i3), v.k(new TextClause(String.valueOf(i3), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), com.revolut.feature.credit.card.impl.ui.instalment.repay.details.d.k(sx4.f.b(3, null, null, dVar9))), (Style) null, 24) : new TextLocalisedQuantityClause(R$plurals.credit_card_instalment_repay_details_payment_description_future_no_interest, Integer.valueOf(i3), (List) null, (Style) null, 28), dVar10));
                yp0.b.k(listC2, 0, 0, 0, 0, 31);
                Clause clauseB = sx4.f.b(1, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), null, dVar10);
                if (dVar9 != null) {
                    clauseB = sx4.g.g(clauseB, ImageClauseTint.TextColor.f57790a);
                }
                r40 r40VarI2 = com.revolut.feature.credit.card.impl.ui.instalment.repay.details.d.i(clauseB, dVar9 != null ? new t(dVar10) : null);
                r40 r40VarH2 = i3 == 1 ? null : com.revolut.feature.credit.card.impl.ui.instalment.repay.details.d.h(com.revolut.feature.credit.card.impl.ui.instalment.repay.details.d.a(i3 - 1, creditCardFutureInstalmentQuote.f), com.revolut.feature.credit.card.impl.ui.instalment.repay.details.d.b(futureInstalments.f69484b), null, null);
                CompositeClause compositeClauseG2 = sx4.g.g(sx4.f.b(3, null, null, creditCardFutureInstalmentQuote.f68771g), new ImageClauseTint.Color(R$attr.uikit_colorGreyTone50));
                TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.credit_card_instalment_repay_last_instalment, u.c(sx4.g.b(oc.c.O(localDate3), null)), null, 12);
                TimeClause timeClauseB = sx4.g.b(oc.c.O(futureInstalments.f69485c), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), true, null, false, null, Constants.TAG_FC_SPEED_MODE));
                CreditCardInstalmentAmountBreakdown creditCardInstalmentAmountBreakdown3 = creditCardFutureInstalmentQuote.i;
                dj0.d dVar11 = creditCardInstalmentAmountBreakdown3.f68776a;
                dj0.d dVar12 = creditCardInstalmentAmountBreakdown3.f68777b;
                LocalDate localDateMinusMonths2 = localDate3.minusMonths(1L);
                Intrinsics.checkNotNullExpressionValue(localDateMinusMonths2, "minusMonths(...)");
                r40[] elements2 = {r40VarI2, r40VarH2, com.revolut.feature.credit.card.impl.ui.instalment.repay.details.d.g(compositeClauseG2, textLocalisedClause3, timeClauseB, new r(dVar11, dVar12, localDateMinusMonths2))};
                Intrinsics.checkNotNullParameter(elements2, "elements");
                listE0 = d0.E0(yp0.b.g(kotlin.collections.d.L(elements2), com.revolut.feature.credit.card.impl.ui.instalment.repay.details.d.f(), null, 0, 0, 126), listC2);
            }
        }
        return new xs4.k(jVar, listE0, new xs4.i(new TextLocalisedClause(R$string.credit_card_instalment_repay_action_confirm, null, null, 14), z, true));
    }

    private final Object b(Object obj2, Object obj3, Object obj4) {
        sdf.d content = (sdf.d) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        k4l.h hVar = content.f261871a.f180987b;
        GoalProgressWidgetDelegate.Model model = null;
        if (hVar != null) {
            dj0.d dVar = hVar.f180975b;
            List list = hVar.f180974a;
            if (!list.isEmpty()) {
                List<k4l.i> list2 = list;
                ArrayList arrayList = new ArrayList(w.t(list2, 10));
                int i = 0;
                for (Object obj5 : list2) {
                    int i2 = i + 1;
                    if (i < 0) {
                        v.s();
                        throw null;
                    }
                    k4l.i iVar = (k4l.i) obj5;
                    TextClause textClause = new TextClause(iVar.f180981b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                    long j2 = iVar.f180982c.f115082a;
                    List list3 = xvl.i.f309295a;
                    arrayList.add(new j1(((Number) list3.get(i % list3.size())).intValue(), j2, textClause));
                    i = i2;
                }
                j1 j1Var = dVar.f(dj0.d.e) ? new j1(R$attr.uikit_colorGreyTone50, dVar.f115082a, new TextLocalisedClause(com.revolut.trading.orders.R$string.wealth_invest_widget_invest_plans_others, null, null, 14)) : null;
                ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                for (k4l.i iVar2 : list2) {
                    xi0.a aVar = xi0.b.Companion;
                    String str = iVar2.f180980a;
                    String str2 = iVar2.f180980a;
                    aVar.getClass();
                    arrayList2.add(cp5.d.y(xi0.a.a(str)) ? new CurrencyImage(str2, (ImageTransformations) null, (TextLocalisedClause) null, 14) : nbh.a.a(str2));
                }
                int i3 = hVar.f180976c;
                model = new GoalProgressWidgetDelegate.Model("LIST_ID_RECURRING_BUY_WIDGET", new TextLocalisedClause(com.revolut.trading.orders.R$string.wealth_invest_widget_invest_plans_header_title, null, null, 14), new r1(new q1(new MoneyClause(content.f261871a.f180986a, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null), new p1(new TextLocalisedClause(com.revolut.trading.orders.R$string.wealth_invest_widget_invest_plans_monthly, null, null, 14), null)), new h1(d0.E0(v.l(j1Var), arrayList)), new t1(d0.I0(d0.E0(v.l(i3 > 0 ? new TextImage(a0.d.n("+", i3), new Color.Solid(R$attr.uikit_colorForeground), new Color.Solid(R$attr.uikit_colorForeground_10), null, 14, 40, null, null, 200) : null), arrayList2))), true, null, 192);
            }
        }
        return v.l(model);
    }

    private final Object c(Object obj2, Object obj3, Object obj4) {
        dj0.d totalPrice = (dj0.d) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(totalPrice, "totalPrice");
        return new TextLocalisedClause(com.revolut.feature.revolut_shop.api.R$string.revolut_shop_flow_home_screen_checkout_button_pay, u.c(new MoneyClause(totalPrice, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12);
    }

    private final Object d(Object obj2, Object obj3, Object obj4) {
        Pair pair = (Pair) obj2;
        ((Boolean) obj3).booleanValue();
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        return Boolean.valueOf(((dj0.d) pair.f186385a).f115082a <= ((dj0.d) pair.f186386b).f115082a);
    }

    private final Object e(Object obj2, Object obj3, Object obj4) {
        CellDetailsDelegate.Model model;
        CellDetailsDelegate.Model modelB;
        b5c.b data = (b5c.b) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(data, "data");
        xi0.b bVar = data.f12487a;
        xi0.b bVar2 = data.f12488b;
        BigDecimal bigDecimal = data.f12489c;
        long j2 = data.d;
        long j3 = data.e;
        RevolutXFiatBalancesContract$RevolutXFiatBalanceData data2 = new RevolutXFiatBalancesContract$RevolutXFiatBalanceData(bVar, bVar2, bigDecimal, j2, j3);
        Intrinsics.checkNotNullParameter(data2, "data");
        dj0.d dVarX = zi0.c.x(data2);
        HeaderDelegate.Model modelA = dVarX != null ? vr5.c.a(new MoneyClause(dVarX, u5l.b.b(), null, null, 12)) : vr5.c.a(new TextClause("-", (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
        CellDetailsDelegate.Model model2 = new CellDetailsDelegate.Model("TOTAL_LIST_ID", new TextLocalisedClause(com.revolut.feature.crypto_feed.dependencies.R$string.crypto_revx_fiat_pocket_details_stats_total_title, null, null, 14), new MoneyClause(new dj0.d(j2, bVar), u5l.b.b(), null, null, 12), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
        if (j3 != j2) {
            model = new CellDetailsDelegate.Model("AVAILABLE_LIST_ID", new TextLocalisedClause(com.revolut.feature.crypto_feed.dependencies.R$string.crypto_revx_fiat_pocket_details_stats_available_title, null, null, 14), new MoneyClause(new dj0.d(j3, bVar), u5l.b.b(), null, null, 12), null, new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), j3 != j2, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048520);
        } else {
            model = null;
        }
        if (bigDecimal != null) {
            modelB = vr5.c.b(u5l.b.a(bigDecimal, bVar2));
        } else {
            Intrinsics.checkNotNullParameter(data2, "<this>");
            modelB = Intrinsics.f(bVar, bVar2) ? vr5.c.b(u5l.b.a(new BigDecimal(1), bVar2)) : vr5.c.b(new TextClause("-", (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
        }
        Object[] elements = {modelA, model2, model, modelB};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        return listL;
    }

    private final Object g(Object obj2, Object obj3, Object obj4) {
        y4d.k content = (y4d.k) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        List<xi0.b> list = content.f310890c;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (xi0.b bVar : list) {
            IconSelectorDelegate.SelectableIconModel.Companion aVar = IconSelectorDelegate.SelectableIconModel.INSTANCE;
            String strQ = j6.a.q("CURRENCY_LIST_ID_", bVar.f306286a);
            CurrencyImage currencyImage = new CurrencyImage(bVar.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14);
            boolean zEquals = bVar.equals(content.f310889b);
            CurrencyClause.Format.Ticker ticker = CurrencyClause.Format.Ticker.f57756a;
            arrayList.add(IconSelectorDelegate.SelectableIconModel.Companion.a(aVar, strQ, currencyImage, zEquals, new CurrencyClause(bVar, ticker, null, 4), new CurrencyClause(bVar, ticker, null, 4), null, 0, false, false, bVar, null, 3040));
        }
        return u.c(new IconSelectorDelegate.Model("iconSelectorDelegate_displayCurrencySelector", arrayList, hp.f164586b, null, null, 56));
    }

    private final Object h(Object obj2, Object obj3, Object obj4) {
        y4d.k content = (y4d.k) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        return u.c(new xn(content.f310888a, new ne(new TextClause(cp5.d.J(content.f310889b), (Style) null, (Integer) null, false, (o9) null, (List) null, 126))));
    }

    private final Object i(Object obj2, Object obj3, Object obj4) {
        w2 noteDetails = (w2) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(noteDetails, "noteDetails");
        if (noteDetails.f173593n.isEmpty()) {
            return f0.f322471a;
        }
        RowDelegate.Model model = new RowDelegate.Model("payout_scenario_row", null, new TextLocalisedClause(com.revolut.feature.structured_note.details.impl.R$string.trading_structured_notes_payout_widget_title, null, null, 14), null, 0, new TextLocalisedClause(com.revolut.feature.structured_note.details.impl.R$string.trading_structured_notes_payout_widget_description, null, null, 14), null, null, 0, new tf(new yy0.j(new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246))), true, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536867802);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return u.c(model);
    }

    private final Object j(Object obj2, Object obj3, Object obj4) {
        y4f.a content = (y4f.a) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        dj0.d dVar = content.f310899a;
        dj0.d dVar2 = content.f310900b;
        dj0.d dVar3 = content.f310901c;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.trading.impl.R$string.wealth_trading_holdings_information_section_bank_balances_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R.string.common_info, null, null, 14);
        int i = R$attr.uikit_dp0;
        ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model("BANK_BALANCES_HEADER", (Image) null, (Clause) textLocalisedClause, (ResourceImage) null, false, false, (Clause) textLocalisedClause2, true, (Object) null, (AnalyticsContext) null, i, i, 0, 0, (String) null, 237370);
        yp0.b.r(model, R$attr.uikit_dp16, 0, 0, 0, 14);
        List listK = v.k(new CellDetailsDelegate.Model("TOTAL_CASH_ITEM", new TextLocalisedClause(com.revolut.feature.trading.impl.R$string.wealth_trading_holdings_information_section_bank_balances_cell_total_cash, null, null, 14), new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552), new CellDetailsDelegate.Model("UNSETTLED_BUYS_ITEM", new TextLocalisedClause(com.revolut.feature.trading.impl.R$string.wealth_trading_holdings_information_section_bank_balances_cell_reserved, null, null, 14), new MoneyClause(dVar2, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552), new CellDetailsDelegate.Model("AVAILABLE_TO_WITHDRAW_ITEM", new TextLocalisedClause(com.revolut.feature.trading.impl.R$string.wealth_trading_holdings_information_section_bank_balances_cell_available_to_withdraw, null, null, 14), new MoneyClause(dVar3, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        List listQ = i2b.a.q(model, listK);
        dj0.d dVar4 = content.d;
        dj0.d dVar5 = content.e;
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.trading.impl.R$string.wealth_trading_brokerage_holdings_header_title, null, null, 14);
        TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R.string.common_info, null, null, 14);
        int i2 = R$attr.uikit_dp0;
        ListSubheaderDelegate.Model model2 = new ListSubheaderDelegate.Model("BROKERAGE_HOLDINGS_HEADER", (Image) null, (Clause) textLocalisedClause3, (ResourceImage) null, false, false, (Clause) textLocalisedClause4, true, (Object) null, (AnalyticsContext) null, i2, i2, 0, 0, (String) null, 237370);
        yp0.b.r(model2, R$attr.uikit_dp24, 0, 0, 0, 14);
        List listK2 = v.k(new CellDetailsDelegate.Model("NET_CREDITS_DEBTS_ITEM", new TextLocalisedClause(com.revolut.feature.trading.impl.R$string.wealth_trading_holdings_information_section_brokerage_holdings_cell_net_credits_debits, null, null, 14), new MoneyClause(dVar4, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), 0, null, null, null, null, null, false, 0, 0, 32760), new CellDetailsDelegate.Model("SECURITIES_ITEM", new TextLocalisedClause(com.revolut.feature.trading.impl.R$string.wealth_trading_holdings_information_section_brokerage_holdings_cell_securities, null, null, 14), new MoneyClause(dVar5, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552));
        yp0.b.k(listK2, 0, 0, 0, 0, 31);
        List listO = i2b.a.o(listQ, i2b.a.q(model2, listK2));
        boolean z = content.f;
        TextLocalisedClause textLocalisedClause5 = new TextLocalisedClause(com.revolut.feature.trading.impl.R$string.wealth_trading_holdings_information_section_additional_information_title, null, null, 14);
        int i3 = R$attr.uikit_dp0;
        ListSubheaderDelegate.Model model3 = new ListSubheaderDelegate.Model("ADDITIONAL_INFORMATION", (Image) null, (Clause) textLocalisedClause5, (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, i3, i3, 0, 0, 53242);
        yp0.b.r(model3, R$attr.uikit_dp24, 0, 0, 0, 14);
        List listC = u.c(new CellDetailsActionDelegate.Model("ON_MARGIN_CALL_ITEM", new TextLocalisedClause(com.revolut.feature.trading.impl.R$string.wealth_trading_holdings_information_section_additional_information_cell_on_margin_call, null, null, 14), 0, new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), z ? new TextLocalisedClause(com.revolut.feature.trading.impl.R$string.wealth_trading_holdings_information_section_additional_information_cell_on_margin_call_value_yes, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10) : new TextLocalisedClause(com.revolut.feature.trading.impl.R$string.wealth_trading_holdings_information_section_additional_information_cell_on_margin_call_value_no, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10), null, false, false, null, null, new y4f.l(z), 0, 0, 0, 0, 4192228));
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        return i2b.a.o(i2b.a.o(listO, i2b.a.q(model3, listC)), q.a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0ba3  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0ba6  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0bc1  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0bc6  */
    /* JADX WARN: Type inference failed for: r13v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v3, types: [int] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r2v38, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v40, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v15, types: [java.lang.StringBuilder] */
    @Override // kotlin.jvm.functions.Function3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r48, java.lang.Object r49, java.lang.Object r50) {
        /*
            Method dump skipped, instruction units count: 3476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x0b.h.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ h(Object obj2, int i) {
        this.f301556a = i;
    }
}
