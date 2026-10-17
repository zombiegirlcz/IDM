package p5k;

import aw0.ka;
import aw0.o9;
import aw0.t0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.pa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.HtmlClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.ImageClauseTint;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.transfer.models.quotes.CreditCardInterest;
import com.revolut.feature.transfer.models.quotes.CreditCardInterestPromotion;
import com.revolut.feature.transfer.models.quotes.TransferQuoteSplitOption;
import com.revolut.feature_market_data_impl.ui.activity.stackedbreakdown.Screen;
import com.revolut.retail.feature.payments.core.R$string;
import ip0.ck0;
import ip0.yj0;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mx0.v5;

/* JADX INFO: loaded from: classes11.dex */
public final class a {
    public a(l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
    }

    public static qv0.i a(TextLocalisedClause textLocalisedClause, Object obj2) {
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("INTEREST_DIALOG_BUTTON_ID", LargeActionButton.ButtonStyle.f58725a, null, textLocalisedClause, false, null, null, obj2, null, 744);
        yp0.b.r(model, R$attr.uikit_dp16, R$attr.uikit_dp24, 0, 0, 12);
        return model;
    }

    public static TextDelegate.Model c() {
        return new TextDelegate.Model("INTEREST_COMMON_DIALOG_DISCLAIMER_ID", new TextLocalisedClause(R$string.payments_core_interest_dialog_common_disclaimer, null, null, 14), false, new ck0(yj0.CENTER_HORIZONTAL), null, null, R$attr.uikit_dp8, 0, 0, 0, 1908);
    }

    public static rp0.y i(Clause clause, Clause clause2, Object obj2) {
        rp0.s sVar = new rp0.s(null, new TextLocalisedClause(R$string.review_transfer_dialog_estimated_interest_title, null, null, 14), new TextLocalisedClause(R$string.review_transfer_dialog_estimated_interest_subtitle, null, null, 14), 24);
        aim.e eVarB = zhm.u.b();
        CellDetailsDelegate.Model[] elements = {new CellDetailsDelegate.Model("INTEREST_INSTALMENT_DIALOG_DISCLAIMER_ESTIMATED_INTEREST_ID", new t0((Clause) new TextLocalisedClause(R$string.review_transfer_dialog_estimated_interest_title, null, null, 14), (Image) null, 0, false, 30), clause, null, null, null, null, 0, null, false, false, null, null, 32760), clause2 != null ? new CellDetailsDelegate.Model("INTEREST_INSTALMENT_DIALOG_DISCLAIMER_ID", new t0((Clause) new TextLocalisedClause(R$string.review_transfer_dialog_estimated_interest_item_current_rate, null, null, 14), (Image) null, 0, false, 30), clause2, null, obj2, null, null, 0, null, false, false, null, null, 32696) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        eVarB.addAll(listL);
        eVarB.add(a(new TextLocalisedClause(R$string.payments_core_interest_dialog_interest_applies_button, null, null, 14), obj2));
        return new rp0.y(zhm.u.a(eVarB), sVar, null, null, obj2, null, 988);
    }

    public static List j(dj0.d dVar, String str, String str2) {
        CellDetailsDelegate.Model[] elements = {str2 != null ? new CellDetailsDelegate.Model("INTEREST_COMMON_DIALOG_ANNUAL_INTEREST_RATE_ID", new t0((Clause) new TextLocalisedClause(R$string.payments_core_interest_dialog_common_annual_interest_rate_label, null, null, 14), (Image) null, 0, false, 30), new TextLocalisedClause(R$string.payments_core_interest_dialog_common_annual_interest_rate_value, zhm.u.c(str2), null, 12), null, null, null, null, 0, null, false, false, null, null, 32760) : null, str != null ? new CellDetailsDelegate.Model("INTEREST_COMMON_DIALOG_APR_ID", new t0((Clause) new TextLocalisedClause(R$string.payments_core_interest_dialog_common_apr_label, null, null, 14), (Image) null, 0, false, 30), new TextLocalisedClause(R$string.payments_core_interest_dialog_common_apr_value, zhm.u.c(str), null, 12), null, null, null, null, 0, null, false, false, null, null, 32760) : null, new CellDetailsDelegate.Model("INTEREST_COMMON_DIALOG_DAILY_INTEREST_ID", new t0((Clause) new TextLocalisedClause(R$string.payments_core_interest_dialog_common_estimated_interest_label, null, null, 14), (Image) null, 0, false, 30), new TextLocalisedClause(R$string.payments_core_interest_dialog_common_estimated_interest_value, zhm.u.c(new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), null, null, null, null, 0, null, false, false, null, null, 32760)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        return listL;
    }

    public final u b(TransferQuoteSplitOption transferQuoteSplitOption, CreditCardInterest creditCardInterest, wi0.b bVar) {
        Double d = transferQuoteSplitOption != null ? transferQuoteSplitOption.f92291g : null;
        CreditCardInterestPromotion creditCardInterestPromotion = creditCardInterest != null ? creditCardInterest.d : null;
        if (creditCardInterestPromotion != null && System.currentTimeMillis() < creditCardInterestPromotion.f92274a) {
            return new t(creditCardInterest.f92271a, creditCardInterest.f92272b, creditCardInterest.f92273c, creditCardInterestPromotion);
        }
        if (transferQuoteSplitOption != null && d != null) {
            return new r(d.doubleValue(), transferQuoteSplitOption.f92288a);
        }
        if (transferQuoteSplitOption != null && creditCardInterest != null) {
            return new q(creditCardInterest.f92271a, creditCardInterest.f92272b);
        }
        if (creditCardInterest != null) {
            return new s(creditCardInterest.f92271a, creditCardInterest.f92272b, creditCardInterest.f92273c, bVar);
        }
        return null;
    }

    public final rp0.y d(dj0.d dailyAmount, String str, Screen.InterestBreakdown interestBreakdown) {
        Intrinsics.checkNotNullParameter(dailyAmount, "dailyAmount");
        return i(new TextLocalisedClause(R$string.payments_core_fees_breakdown_section_interest_applies_value, zhm.u.c(new MoneyClause(dailyAmount, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, interestBreakdown);
    }

    public final rp0.y e(double d, dj0.d interest, Screen.InterestBreakdown interestBreakdown) {
        Intrinsics.checkNotNullParameter(interest, "interest");
        MoneyClause moneyClause = new MoneyClause(interest, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
        BigDecimal bigDecimalMultiply = BigDecimal.valueOf(d).multiply(BigDecimal.valueOf(100L));
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        return i(moneyClause, new PercentageClause(bigDecimalMultiply, (PercentageClause.Format) null, (Style) null, 6), interestBreakdown);
    }

    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [com.revolut.core.ui_kit.models.Style, com.revolut.core.ui_kit.views.f, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v3 */
    public final rp0.y f(dj0.d amount, String str, String str2, CreditCardInterestPromotion promotion) {
        int i;
        ?? r62;
        Float fValueOf = Float.valueOf(12.0f);
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(promotion, "promotion");
        List listJ = j(amount, str, str2);
        TextDelegate.Model modelC = c();
        String str3 = promotion.f92275b;
        TextDelegate.Model model = null;
        if (str3 != null) {
            ImageClause imageClause = new ImageClause(R$drawable.uikit_icn_24_link_external, new ImageClauseTint.Color(R$attr.uikit_colorAccent), fValueOf, fValueOf, 16);
            i = 12;
            r62 = 0;
            List listK = zhm.v.k(imageClause, new TextLocalisedClause(R$string.payments_core_interest_dialog_common_promotion_terms, zhm.u.c(new HtmlClause(0, 14, (Integer) null, "INTEREST_COMMON_DIALOG_PROMOTION_TERMS_ID", str3)), null, 12));
            m70.a.t(kotlin.jvm.internal.t0.f186434a);
            model = new TextDelegate.Model("INTEREST_COMMON_DIALOG_PROMOTION_TERMS_ID", new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), false, new ck0(yj0.CENTER_HORIZONTAL), null, null, R$attr.uikit_dp0, 0, 0, 0, 1908);
        } else {
            i = 12;
            r62 = 0;
        }
        qv0.i iVarA = a(new TextLocalisedClause(R$string.payments_core_interest_dialog_interest_free_button, r62, r62, 14), null);
        rp0.s sVar = new rp0.s(r62, new TextLocalisedClause(R$string.payments_core_interest_dialog_interest_free_title, zhm.u.c(new TimeClause(promotion.f92274a, new TimeClause.Format.DateMedium(0), null, null, 8)), r62, i), new TextLocalisedClause(R$string.payments_core_interest_dialog_interest_free_description, zhm.u.c(new TimeClause(promotion.f92274a, new TimeClause.Format.DayAndMonth(ka.SHORT), null, null, 8)), r62, i), 24);
        aim.e eVarB = zhm.u.b();
        eVarB.addAll(listJ);
        eVarB.add(modelC);
        if (model != null) {
            eVarB.add(model);
        }
        eVarB.add(iVarA);
        return new rp0.y(zhm.u.a(eVarB), sVar, null, null, null, null, 988);
    }

    public final rp0.y g(dj0.d amount, String str, String str2, Screen.InterestBreakdown interestBreakdown) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        List listJ = j(amount, str, str2);
        TextDelegate.Model modelC = c();
        qv0.i iVarA = a(new TextLocalisedClause(R$string.payments_core_interest_dialog_interest_applies_button, null, null, 14), interestBreakdown);
        rp0.s sVar = new rp0.s(null, new TextLocalisedClause(R$string.payments_core_interest_dialog_interest_applies_title, null, null, 14), new TextLocalisedClause(R$string.payments_core_interest_dialog_interest_applies_description, null, null, 14), 24);
        aim.e eVarB = zhm.u.b();
        eVarB.addAll(listJ);
        eVarB.add(modelC);
        eVarB.add(iVarA);
        return new rp0.y(zhm.u.a(eVarB), sVar, null, null, interestBreakdown, null, 988);
    }

    public final rp0.y h(Screen.InterestBreakdown interestBreakdown) {
        PlainTextDelegate.Model model = new PlainTextDelegate.Model("INTEREST_APPLIES_DIALOG_INFO_ID", (Clause) null, (Clause) new TextLocalisedClause(R$string.payments_core_interest_dialog_credit_limit_transfer_interest_description_without_rate, null, null, 14), (v5) null, (UrlImage) null, false, (pa) null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 65518);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        qv0.i iVarA = a(new TextLocalisedClause(R$string.payments_core_interest_dialog_interest_applies_button, null, null, 14), interestBreakdown);
        rp0.s sVar = new rp0.s(null, new TextLocalisedClause(R$string.payments_core_interest_dialog_credit_limit_transfer_interest_title, null, null, 14), null, 24);
        qv0.i[] elements = {model, iVarA};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new rp0.y(kotlin.collections.d.L(elements), sVar, null, null, interestBreakdown, null, 988);
    }
}
