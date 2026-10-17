package mn1;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.sa;
import com.revolut.core.ui_kit.delegates.t4;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.domain.models.banktransfer.AccountFieldType;
import com.revolut.feature.apm.bills.core.api.model.search.boleto.BillBoletoAliasType;
import com.revolut.feature.apm.bills.core.api.model.search.boleto.BillBoletoFees;
import com.revolut.feature.apm.bills.core.api.model.search.boleto.BillSearchBoletoResult;
import com.revolut.feature.pay_bills_taxes.api.R$string;
import com.revolut.feature.payments.api.mapper.PaymentPocketInfo;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import com.revolut.revolut.feature_fourthline_impl.R;
import ip0.y10;
import java.time.LocalDate;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class s implements cli.n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        RowDelegate.Model model;
        int i;
        AccountFieldType accountFieldType;
        dj0.d dVar;
        h domainState = (h) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        BillSearchBoletoResult billSearchBoletoResult = domainState.f207335a;
        TransferScheduleData transferScheduleData = domainState.f207336b;
        sa saVar = new sa("ID_WARNING_TAG", (Clause) new TextLocalisedClause(R$string.pay_bills_taxes_country_br_review_trust_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.pay_bills_taxes_country_br_review_trust_subtitle, null, null, 14), (List) null, false, (Image) new ResourceImage(R$drawable.uikit_icn_24_warning, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorOrange), (List) null, (ImageTransformations) null, (Clause) null, 246), (y10) null, (Object) null, 4056);
        yp0.b.l(saVar, 0, 0, 0, 0, null, false, 63);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.pay_bills_taxes_country_br_review_item_total_amount_title, null, null, 14);
        BillSearchBoletoResult billSearchBoletoResult2 = domainState.f207335a;
        t4 t4Var = new t4(new MoneyClause(billSearchBoletoResult2.f61429b, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12));
        int i2 = R$string.pay_bills_taxes_country_br_review_item_total_amount_subtitle;
        String str = billSearchBoletoResult.d;
        BillBoletoFees billBoletoFees = billSearchBoletoResult.f;
        if (str == null) {
            str = "";
        }
        CounterTextDelegate.Model model2 = new CounterTextDelegate.Model("ID_TOTAL_AMOUNT_TAG", textLocalisedClause, t4Var, new TextLocalisedClause(i2, zhm.u.c(str), null, 12), false, null, null, 0, 0, 0, 0, 2032);
        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        CellDetailsDelegate.Model model3 = new CellDetailsDelegate.Model("ID_BILL_AMOUNT_TAG", new TextLocalisedClause(R$string.pay_bills_taxes_country_br_review_item_bill_amount_title, null, null, 14), new MoneyClause(billSearchBoletoResult2.f61430c, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), 0, null, null, null, null, null, false, 0, 0, 32760);
        CellDetailsDelegate.Model model4 = new CellDetailsDelegate.Model("ID_FEES_TAG", new TextLocalisedClause(R$string.pay_bills_taxes_country_br_review_item_fees_title, null, null, 14), (billBoletoFees == null || (dVar = billBoletoFees.d) == null) ? new TextLocalisedClause(R$string.pay_bills_taxes_country_br_review_item_no_fees_title, null, null, 14) : new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), new Click(30, (Integer) null, (Object) null, "ID_FEES_TAG", false), null, 8), 0, null, null, null, null, billBoletoFees != null ? new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246) : null, (billBoletoFees != null ? billBoletoFees.d : null) != null, 0, 0, 31224);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_payment_from_title, null, null, 14);
        PaymentPocketInfo paymentPocketInfo = domainState.f;
        Image image = paymentPocketInfo != null ? paymentPocketInfo.f79169a : null;
        Clause[] elements = {paymentPocketInfo != null ? paymentPocketInfo.f79170b : null, new CurrencyClause(domainState.e, CurrencyClause.Format.Ticker.f57756a, null, 4)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listK = zhm.v.k(model3, model4, new CellDetailsActionDelegate.Model("ID_PAYMENT_FROM", textLocalisedClause2, 0, image, new CompositeClause(kotlin.collections.d.L(elements), new DotDividerClause((Integer) null), null, null, 12), false, false, null, null, 0, 0, 32736));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        aim.e eVarB = zhm.u.b();
        String str2 = billSearchBoletoResult.f61431g;
        if (str2 != null) {
            eVarB.add(new CellDetailsNoteDelegate.Model("ID_INSTITUTION_TAG", new TextLocalisedClause(R$string.pay_bills_taxes_country_br_review_item_institution_title, null, null, 14), null, new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, false, null, null, null, null, null, 0, 131060));
        }
        BillBoletoAliasType billBoletoAliasType = billSearchBoletoResult.f61432h;
        String str3 = billSearchBoletoResult.i;
        if (billBoletoAliasType != null && str3 != null) {
            int[] iArr = t.f207350a;
            int i3 = iArr[billBoletoAliasType.ordinal()];
            if (i3 == 1) {
                i = R$string.pay_bills_taxes_country_br_review_item_cnpj_title;
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R$string.pay_bills_taxes_country_br_review_item_cpf_title;
            }
            TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(i, null, null, 14);
            int i5 = iArr[billBoletoAliasType.ordinal()];
            if (i5 == 1) {
                accountFieldType = AccountFieldType.BRAZIL_CNPJ_ID;
            } else {
                if (i5 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                accountFieldType = AccountFieldType.BRAZIL_CPF_ID;
            }
            eVarB.add(new CellDetailsDelegate.Model("ID_ALIAS_TAG", textLocalisedClause3, new TextClause(n61.j.b(accountFieldType, str3), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 0, null, null, null, null, null, false, 0, 0, 32760));
        }
        LocalDate localDate = billSearchBoletoResult.f61433j;
        if (localDate != null) {
            eVarB.add(new CellDetailsDelegate.Model("ID_DUE_DATE_TAG", new TextLocalisedClause(R$string.pay_bills_taxes_country_br_review_item_due_date_title, null, null, 14), new TimeClause(oc.c.F(localDate), new TimeClause.Format.DateMedium(0), null, null, 12), 0, null, null, null, null, null, false, 0, 0, 32760));
        }
        String str4 = billSearchBoletoResult.f61434l;
        if (str4 == null || d0.W(str4)) {
            str4 = null;
        }
        String str5 = billSearchBoletoResult.f61435m;
        if (str5 == null || d0.W(str5)) {
            str5 = null;
        }
        String str6 = billSearchBoletoResult.k;
        String str7 = (str6 == null || d0.W(str6)) ? null : str6;
        String str8 = str4 == null ? str5 : str4;
        Clause textClause = (str8 == null || str7 == null) ? str8 != null ? new TextClause(str8, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : str7 != null ? new TextClause(str7, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null : yoj.b.m(new TextClause(" · ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), zhm.v.k(new TextClause(str8, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(str7, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)));
        if (textClause != null) {
            eVarB.add(new CellDetailsNoteDelegate.Model("ID_BANK_TAG", new TextLocalisedClause(R$string.pay_bills_taxes_country_br_review_item_bank_title, null, null, 14), null, textClause, null, false, null, null, null, null, null, 0, 131060));
        }
        String str9 = billSearchBoletoResult.f61436n;
        if (str9 != null) {
            eVarB.add(new CellDetailsNoteDelegate.Model("ID_BILL_NUMBER_TAG", new TextLocalisedClause(R$string.pay_bills_taxes_country_br_review_item_bill_number_title, null, null, 14), null, new TextClause(str9, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, false, null, null, null, null, null, 0, 131060));
        }
        aim.e eVarA = zhm.u.a(eVarB);
        yp0.b.k(eVarA, 0, 0, 0, 0, 31);
        TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R$string.pay_bills_taxes_country_br_review_item_scheduled_on_title, null, null, 14);
        long j2 = transferScheduleData.f104285a;
        CellDetailsDelegate.Model model5 = new CellDetailsDelegate.Model("ID_SCHEDULED_ON_TAG", textLocalisedClause4, j2 == 0 ? new TextLocalisedClause(R$string.pay_bills_taxes_country_br_review_item_scheduled_on_today, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10) : new TimeClause(j2, TimeClause.Format.PrettyDayOfWeek.f57975b, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), null, 8), 0, null, null, null, null, new ResourceImage(R$drawable.uikit_icn_24_pencil, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), true, 0, 0, 31224);
        yp0.b.l(model5, 0, 0, 0, 0, null, false, 63);
        Boolean bool = domainState.f207338g;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            model = new RowDelegate.Model("ID_HIDE_SHOW_BOLETO_TAG", null, new TextLocalisedClause(zBooleanValue ? R$string.pay_bills_taxes_country_br_review_item_display : R$string.pay_bills_taxes_country_br_review_item_hide, null, new Custom(Integer.valueOf(zBooleanValue ? R$attr.uikit_colorBlue : R$attr.uikit_colorRed), false, null, false, null, 254), 10), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870906);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        } else {
            model = null;
        }
        return new p(transferScheduleData.f104285a != 0 ? new TextLocalisedClause(R.string.common_action_schedule, null, null, 14) : new TextLocalisedClause(R$string.pay_bills_taxes_country_br_review_cta_button_title, null, null, 14), zhm.d0.E0(zhm.v.l(model), zhm.d0.F0(model5, zhm.d0.E0(eVarA, zhm.d0.E0(listK, zhm.v.k(saVar, model2))))));
    }
}
