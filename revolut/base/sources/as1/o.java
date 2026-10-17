package as1;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.x4;
import com.revolut.core.ui_kit.models.AssetClause;
import com.revolut.core.ui_kit.models.AssetClauseType;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.ImageClauseTint;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.RateClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.bills.core.api.model.search.tapi.BillSearchTapiResult;
import com.revolut.feature.apm.bills.tapi.impl.R$string;
import com.revolut.feature.apm.core.models.transfers.payments.ApmQuote;
import com.revolut.feature.apm.core.models.transfers.payments.ApmQuoteCharges;
import com.revolut.feature.apm.core.models.transfers.payments.ApmQuoteRate;
import com.revolut.feature.payments.api.mapper.PaymentPocketInfo;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import zhm.d0;

/* JADX INFO: loaded from: classes20.dex */
public final class o implements cli.n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        dj0.d dVar;
        Boolean boolValueOf;
        dj0.d dVar2;
        boolean z;
        CellDetailsActionDelegate.Model model;
        TextLocalisedClause textLocalisedClause;
        dj0.d dVar3;
        dj0.d dVar4;
        int i;
        boolean z3;
        Clause textLocalisedClause2;
        String str;
        boolean z4;
        CellDetailsActionDelegate.Model model2;
        String str2;
        Boolean boolValueOf2;
        boolean z6;
        TextClause textClause;
        ApmQuoteRate apmQuoteRate;
        g domainState = (g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Float fValueOf = Float.valueOf(16.0f);
        CounterTextDelegate.Model.Companion companion = CounterTextDelegate.Model.INSTANCE;
        x4 x4Var = new x4(new TextLocalisedClause(R$string.tapi_transfer_review_counter_title, null, null, 14));
        ApmQuote apmQuote = domainState.e;
        dj0.d dVar5 = domainState.f;
        String str3 = domainState.f8762c;
        dj0.d dVar6 = domainState.f8760a;
        BillSearchTapiResult billSearchTapiResult = domainState.f8761b;
        if (apmQuote == null || (dVar = apmQuote.f62212g) == null) {
            dVar = dVar6;
        }
        MoneyClause moneyClause = new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
        if (dVar5 != null) {
            boolValueOf = Boolean.valueOf(dVar6.f115082a <= dVar5.f115082a);
        } else {
            boolValueOf = null;
        }
        TextLocalisedClause textLocalisedClause3 = !pd.b.k(boolValueOf) ? new TextLocalisedClause(R$string.tapi_transfer_review_error_insufficient_balance, null, new Custom(Integer.valueOf(R$attr.uikit_colorStatusDanger), false, null, false, null, 254), 10) : null;
        int i2 = R$string.tapi_transfer_review_counter_subtitle_format;
        String str4 = billSearchTapiResult.f61454h;
        if (str4 == null) {
            str4 = "";
        }
        TextLocalisedClause[] elements = {textLocalisedClause3, new TextLocalisedClause(i2, zhm.u.c(str4), null, 12)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        t0 t0Var = t0.f186434a;
        List listC = zhm.u.c(CounterTextDelegate.Model.Companion.a(companion, "ID_COUNTER", x4Var, moneyClause, new CompositeClause(listL, new TextClause(m70.a.o(t0Var), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), null, null, 0, 0, 4080));
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        CellDetailsDelegate.Model model3 = new CellDetailsDelegate.Model("ID_AMOUNT", new TextLocalisedClause(R$string.tapi_transfer_review_field_amount, null, null, 14), new MoneyClause(pyd.c.M(dVar6), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), 0, null, null, null, null, null, false, 0, 0, 32760);
        if (apmQuote == null || (apmQuoteRate = apmQuote.f62209a) == null) {
            dVar2 = dVar6;
            z = true;
            model = null;
        } else {
            TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(com.revolut.feature.revolutpay.shared.R$string.revolut_pay_order_summary_payment_breakdown_exchange_rate, null, null, 14);
            BigDecimal ONE = BigDecimal.ONE;
            Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
            AssetClause assetClause = new AssetClause(ONE, new AssetClauseType.Money(new MoneyClause.Format.Defaults(null, null, false, false, 15)), cp5.d.J(apmQuoteRate.f62229b), null, o9.NON_SENSITIVE, 8);
            dVar2 = dVar6;
            BigDecimal bigDecimal = new BigDecimal(String.valueOf(apmQuoteRate.f62228a));
            xi0.b bVar = apmQuoteRate.f62230c;
            z = true;
            RateClause rateClause = new RateClause(bigDecimal, bVar, new RateClause.Format.Default(null, true), null);
            Intrinsics.checkNotNullParameter(t0Var, "<this>");
            model = new CellDetailsActionDelegate.Model("ID_EXCHANGE_RATE", textLocalisedClause4, 0, new ResourceImage(R$drawable.uikit_icn_16_arrow_rates, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), new CompositeClause(zhm.v.k(assetClause, new TextClause(" = ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), rateClause), null, null, null, 14), null, false, true, null, null, null, 0, 0, 0, 0, 4194148);
        }
        TextLocalisedClause textLocalisedClause5 = new TextLocalisedClause(R$string.tapi_transfer_review_field_service_fees, null, null, 14);
        if (apmQuote == null || apmQuote.f62213h != z) {
            textLocalisedClause = textLocalisedClause5;
            dVar3 = dVar2;
            dVar4 = dVar5;
            i = 14;
            z3 = z;
            textLocalisedClause2 = null;
        } else {
            textLocalisedClause = textLocalisedClause5;
            dVar3 = dVar2;
            dVar4 = dVar5;
            i = 14;
            z3 = z;
            ImageClause imageClause = new ImageClause(R$drawable.uikit_icn_24_info_outline, ImageClauseTint.TextColor.f57790a, fValueOf, fValueOf, 16);
            ApmQuoteCharges apmQuoteCharges = apmQuote.d;
            MoneyClause moneyClause2 = new MoneyClause(pyd.c.M(apmQuoteCharges != null ? apmQuoteCharges.f62222a : null), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
            Clause[] clauseArr = new Clause[2];
            clauseArr[0] = imageClause;
            clauseArr[z3 ? 1 : 0] = moneyClause2;
            textLocalisedClause2 = new CompositeClause(zhm.v.k(clauseArr), new TextClause("  ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
        }
        if (textLocalisedClause2 == null) {
            textLocalisedClause2 = new TextLocalisedClause(R$string.tapi_transfer_review_field_fees_no_fees_title, null, null, i);
        }
        CellDetailsActionDelegate.Model model4 = new CellDetailsActionDelegate.Model("ID_FEES", textLocalisedClause, 0, null, textLocalisedClause2, false, apmQuote != null && apmQuote.f62213h == z3, null, null, 0, 0, 32672);
        ur1.a aVar = domainState.d;
        if (aVar != null) {
            TextLocalisedClause textLocalisedClause6 = new TextLocalisedClause(R$string.tapi_transfer_review_field_payment_from_title, null, null, i);
            PaymentPocketInfo paymentPocketInfo = aVar.f282232c;
            Image image = paymentPocketInfo != null ? paymentPocketInfo.f79169a : null;
            z4 = true;
            Clause[] clauseArr2 = {paymentPocketInfo != null ? paymentPocketInfo.f79170b : null, new CurrencyClause(z92.f.l(aVar.f282231b), CurrencyClause.Format.Ticker.f57756a, null, 4)};
            str = "elements";
            Intrinsics.checkNotNullParameter(clauseArr2, str);
            model2 = new CellDetailsActionDelegate.Model("ID_PAYMENT_FROM", textLocalisedClause6, 0, image, new CompositeClause(kotlin.collections.d.L(clauseArr2), new DotDividerClause((Integer) null), null, null, 12), false, false, null, null, 0, 0, 32736);
        } else {
            str = "elements";
            z4 = true;
            model2 = null;
        }
        Object[] objArr = {model3, model, model4, model2};
        Intrinsics.checkNotNullParameter(objArr, str);
        List listL2 = kotlin.collections.d.L(objArr);
        yp0.b.k(listL2, 0, 0, 0, 0, 31);
        TextLocalisedClause textLocalisedClause7 = new TextLocalisedClause(R$string.tapi_transfer_review_field_bill_number_title, null, null, i);
        Intrinsics.checkNotNullParameter(billSearchTapiResult, "<this>");
        String str5 = billSearchTapiResult.f61453g;
        if (str5 == null) {
            BillSearchTapiResult.PaymentMethodDetails paymentMethodDetails = billSearchTapiResult.i;
            String str6 = paymentMethodDetails != null ? paymentMethodDetails.f61455a : null;
            str2 = str6 == null ? "" : str6;
        } else {
            str2 = str5;
        }
        List listC2 = zhm.u.c(new CellDetailsDelegate.Model("ID_BILL_NUMBER", textLocalisedClause7, new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 0, null, null, null, null, null, false, 0, 0, 32760));
        yp0.b.k(listC2, 0, 0, 0, 0, 31);
        TextLocalisedClause textLocalisedClause8 = new TextLocalisedClause(R$string.tapi_transfer_review_field_label_title, null, null, i);
        String str7 = billSearchTapiResult.f;
        ResourceImage resourceImage = (str7 == null || str7.length() == 0) ? new ResourceImage(R$drawable.uikit_icn_24_plus, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246) : new ResourceImage(R$drawable.uikit_icn_24_pencil, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246);
        TextLocalisedClause textLocalisedClause9 = (str3 == null || str3.length() == 0) ? new TextLocalisedClause(R.string.common_action_add, null, null, i) : new TextLocalisedClause(R.string.common_action_edit, null, null, i);
        if (str3 != null) {
            boolValueOf2 = null;
            z6 = z4;
            textClause = new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        } else {
            boolValueOf2 = null;
            z6 = z4;
            textClause = null;
        }
        List listC3 = zhm.u.c(new CellDetailsNoteDelegate.Model("ID_LABEL", textLocalisedClause8, null, textClause, null, false, resourceImage, textLocalisedClause9, null, null, null, 0, 130676));
        yp0.b.k(listC3, 0, 0, 0, 0, 31);
        ArrayList arrayListE0 = d0.E0(listC3, d0.E0(listC2, d0.E0(listL2, listC)));
        dj0.d dVar7 = dVar4;
        if (dVar7 != null) {
            boolValueOf2 = Boolean.valueOf(dVar3.f115082a <= dVar7.f115082a ? z6 : false);
        }
        return new n(arrayListE0, pd.b.k(boolValueOf2));
    }
}
