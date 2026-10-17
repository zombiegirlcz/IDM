package c55;

import android.os.Parcelable;
import aw0.c7;
import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.pa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.LocalDateClause$DateFormat;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.core.ui.bottom_sheet.list.CreditBottomSheetListItemsController;
import com.revolut.feature.credit.loan.api.models.rev10.LoanAccrual;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.youTransactor.uCube.rpc.Constants;
import grl.k9;
import java.time.LocalDate;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mx0.v5;
import org.jetbrains.annotations.NotNull;
import rp0.m;

/* JADX INFO: loaded from: classes21.dex */
public final class z {

    @NotNull
    public static final u Companion = new u();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f21472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f21473b;

    public z(m loanCommonItemFactory, t loanRepaymentBreakdownExplainerDescriptionFactory) {
        Intrinsics.checkNotNullParameter(loanCommonItemFactory, "loanCommonItemFactory");
        Intrinsics.checkNotNullParameter(loanRepaymentBreakdownExplainerDescriptionFactory, "loanRepaymentBreakdownExplainerDescriptionFactory");
        this.f21472a = loanCommonItemFactory;
        this.f21473b = loanRepaymentBreakdownExplainerDescriptionFactory;
    }

    public static mp.p a() {
        return new mp.p("GOT_IT_BUTTON_ID", new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), (Object) null);
    }

    public static rp0.y b() {
        return dy4.b.a(rp0.m.Companion, new TextLocalisedClause(R$string.loan_management_schedule_explainer_sheet_additional_repayment_title, null, null, 14), new TextLocalisedClause(R$string.loan_management_schedule_explainer_sheet_additional_repayment_description, null, null, 14), a(), null, null, Constants.TAG_F4);
    }

    public static rp0.y d(x breakdown) {
        Intrinsics.checkNotNullParameter(breakdown, "breakdown");
        xi0.b currency = breakdown.f21466a.f115083b;
        m.b bVar = rp0.m.Companion;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.loan_management_schedule_explainer_sheet_payment_breakdown_title, null, null, 14);
        CellDetailsDelegate.Model model = new CellDetailsDelegate.Model("PRINCIPAL_REPAYMENT_LIST_ID", new TextLocalisedClause(R$string.loan_management_schedule_explainer_sheet_payment_breakdown_principal_repayment, null, null, 14), sx4.f.b(3, null, null, breakdown.f21466a), 0, null, null, null, null, null, false, 0, 0, 32760);
        LoanAccrual loanAccrual = breakdown.d;
        CellDetailsActionDelegate.Model model2 = loanAccrual != null ? new CellDetailsActionDelegate.Model("FEE_ITEM_ID", new TextLocalisedClause(R$string.loan_management_schedule_explainer_sheet_payment_breakdown_accrued_fee, null, null, 14), 0, new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), sx4.f.b(1, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), null, loanAccrual.f70124a), null, false, false, null, null, null, 0, 0, 0, 0, 4194276) : null;
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.loan_management_schedule_explainer_sheet_payment_breakdown_accrued_interest, null, null, 14);
        LoanAccrual loanAccrual2 = breakdown.f21468c;
        dj0.d dVar = loanAccrual2 != null ? loanAccrual2.f70124a : null;
        Intrinsics.checkNotNullParameter(currency, "currency");
        CellDetailsDelegate.Model model3 = new CellDetailsDelegate.Model("INTEREST_LIST_ID", textLocalisedClause2, sx4.f.b(3, null, null, dj0.d.c(pyd.c.M(dVar), 0L, currency, 1)), 0, null, null, null, null, null, false, 0, 0, 32760);
        dj0.d dVar2 = breakdown.f21467b;
        Object[] elements = {model, model2, model3, dVar2 != null ? new CellDetailsDelegate.Model("RESCHEDULED_PRINCIPAL_REPAYMENT_LIST_ID", new TextLocalisedClause(R$string.loan_management_schedule_explainer_sheet_payment_breakdown_rescheduled_amount, null, null, 14), sx4.f.b(3, null, null, dVar2), 0, null, null, null, null, null, false, 0, 0, 32760) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        return dy4.b.a(bVar, textLocalisedClause, null, a(), null, listL, Constants.TAG_EMV_L1_CHECKSUM);
    }

    public static rp0.y f() {
        return dy4.b.a(rp0.m.Companion, new TextLocalisedClause(R$string.loan_management_payment_full_info_loan_fee_dialog_title, null, null, 14), new TextLocalisedClause(R$string.loan_management_payment_full_info_loan_fee_dialog_description, null, null, 14), a(), null, null, Constants.TAG_F4);
    }

    public static rp0.y h(w parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        m.b bVar = rp0.m.Companion;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.loan_management_schedule_explainer_sheet_future_repayments_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.loan_management_schedule_explainer_sheet_future_repayments_description, zhm.u.c(sx4.g.b(parcel.f21465c, null)), null, 12);
        List listK = zhm.v.k(new CellDetailsDelegate.Model("CURRENT-MONTHLY-REPAYMENTS", new TextLocalisedClause(R$string.loan_management_schedule_explainer_sheet_future_repayments_current_monthly_repayments, null, null, 14), sx4.f.b(3, null, null, parcel.f21463a), 0, null, null, null, null, null, false, 0, 0, 32760), new CellDetailsDelegate.Model("REDUCTION", new TextLocalisedClause(R$string.loan_management_schedule_explainer_sheet_future_repayments_reduction, null, null, 14), sx4.f.b(3, null, null, parcel.e), 0, null, null, null, null, null, false, 0, 0, 32760), new CellDetailsDelegate.Model("NEW-AMOUNT", new TextLocalisedClause(R$string.loan_management_schedule_explainer_sheet_future_repayments_you_will_pay, zhm.u.c(sx4.g.b(parcel.f21465c, null)), null, 12), sx4.f.b(3, null, null, parcel.f21464b), 0, null, null, null, null, null, false, 0, 0, 32760));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return dy4.b.a(bVar, textLocalisedClause, textLocalisedClause2, a(), null, listK, Constants.TAG_PCI_PED_CHECKSUM);
    }

    public static rp0.y j() {
        return dy4.b.a(rp0.m.Companion, new TextLocalisedClause(R$string.loan_management_schedule_explainer_sheet_overdue_balance_title, null, null, 14), new TextLocalisedClause(R$string.loan_management_schedule_explainer_sheet_overdue_balance_description, null, null, 14), a(), null, null, Constants.TAG_F4);
    }

    public final CreditBottomSheetListItemsController c(dj0.d dVar) {
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.loan_management_schedule_explainer_sheet_breakage_fee_title, null, null, 14), null, null, null, false, 30);
        TextLocalisedClause[] elements = {new TextLocalisedClause(R$string.loan_management_schedule_explainer_sheet_breakage_fee_description, null, null, 14), dVar != null ? new TextLocalisedClause(R$string.loan_management_schedule_explainer_sheet_breakage_fee_description_zero_fee_amount, zhm.u.c(sx4.f.b(3, null, null, dVar)), null, 12) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        PlainTextDelegate.Model model = new PlainTextDelegate.Model("breakage-fee-explainer-dialog", (Clause) null, (Clause) yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), kotlin.collections.d.L(elements)), (v5) null, (UrlImage) null, false, (pa) null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 65518);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        List listK = zhm.v.k(model, this.f21472a.a("breakage_fee_explainer_got_it_button"));
        k9 k9Var = k9.Credit;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return new CreditBottomSheetListItemsController(new cy4.a(aVar, listK, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var)));
    }

    public final CreditBottomSheetListItemsController e() {
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.loan_management_schedule_explainer_sheet_early_repayment_amount_title, null, null, 14), null, null, null, false, 30);
        PlainTextDelegate.Model model = new PlainTextDelegate.Model("breakage-fee-explainer-dialog", (Clause) null, (Clause) new TextLocalisedClause(R$string.loan_management_schedule_explainer_sheet_early_repayment_amount_description, null, null, 14), (v5) null, (UrlImage) null, false, (pa) null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 65518);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        List listK = zhm.v.k(model, this.f21472a.a("early_repayment_explainer_got_it_button"));
        k9 k9Var = k9.Credit;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return new CreditBottomSheetListItemsController(new cy4.a(aVar, listK, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var)));
    }

    public final rp0.y g(v parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        m.b bVar = rp0.m.Companion;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.loan_management_schedule_explainer_sheet_final_repayment_title, null, null, 14);
        dj0.d amountRepaid = parcel.f21460a;
        LocalDate date = parcel.d;
        b95.a product = parcel.e;
        Intrinsics.checkNotNullParameter(amountRepaid, "amountRepaid");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(product, "product");
        TextLocalisedClause textLocalisedClause2 = ((y45.q) this.f21473b.f21459a).a(product) ? new TextLocalisedClause(R$string.loan_management_repayment_v2_schedule_tooltip_final_repayment_subtitle, zhm.v.k(sx4.f.b(3, null, null, amountRepaid), sx4.g.b(date, null)), null, 12) : new TextLocalisedClause(R$string.loan_management_schedule_explainer_sheet_final_repayment_description, zhm.u.c(sx4.g.b(date, null)), null, 12);
        List listK = zhm.v.k(new CellDetailsDelegate.Model("CURRENT-MONTHLY-REPAYMENTS", new TextLocalisedClause(R$string.loan_management_schedule_explainer_sheet_final_repayment_current_monthly_repayments, null, null, 14), sx4.f.b(3, null, null, parcel.f21461b), 0, null, null, null, null, null, false, 0, 0, 32760), new CellDetailsDelegate.Model("REDUCTION", new TextLocalisedClause(R$string.loan_management_schedule_explainer_sheet_final_repayment_reduction, null, null, 14), sx4.f.b(3, null, null, parcel.f), 0, null, null, null, null, null, false, 0, 0, 32760), new CellDetailsDelegate.Model("FINAL-REPAYMENT-DATE", new TextLocalisedClause(R$string.loan_management_schedule_explainer_sheet_final_repayment_final_repayment_date, zhm.u.c(sx4.g.b(date, null)), null, 12), sx4.f.b(3, null, null, parcel.f21462c), 0, null, null, null, null, null, false, 0, 0, 32760));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return dy4.b.a(bVar, textLocalisedClause, textLocalisedClause2, a(), null, listK, Constants.TAG_PCI_PED_CHECKSUM);
    }

    public final rp0.y i(y breakdown) {
        Intrinsics.checkNotNullParameter(breakdown, "breakdown");
        m.b bVar = rp0.m.Companion;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.loan_management_schedule_explainer_sheet_next_repayment_title, null, null, 14);
        LocalDate newDate = breakdown.f21469a;
        dj0.d dVar = breakdown.f21470b;
        b95.a product = breakdown.d;
        Intrinsics.checkNotNullParameter(newDate, "newDate");
        Intrinsics.checkNotNullParameter(product, "product");
        TextLocalisedClause textLocalisedClause2 = ((y45.q) this.f21473b.f21459a).a(product) ? new TextLocalisedClause(R$string.loan_management_repayment_v2_schedule_tooltip_next_repayment_subtitle, zhm.u.c(sx4.g.b(newDate, null)), null, 12) : new TextLocalisedClause(R$string.loan_management_schedule_explainer_sheet_next_repayment_description, zhm.u.c(sx4.g.b(newDate, null)), null, 12);
        aim.e eVarB = zhm.u.b();
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.loan_management_schedule_explainer_sheet_next_repayment_next_repayment_date, null, null, 14);
        com.revolut.core.ui_kit.models.j jVar = c7.Companion;
        LocalDate localDate = breakdown.f21469a;
        LocalDateClause$DateFormat.INSTANCE.getClass();
        LocalDateClause$DateFormat.DateMedium dateMedium = LocalDateClause$DateFormat.Companion.f57815b;
        jVar.getClass();
        eVarB.add(new CellDetailsDelegate.Model("NEXT-REPAYMENT-DATE", textLocalisedClause3, com.revolut.core.ui_kit.models.j.a(localDate, dateMedium, null), 0, null, null, null, null, null, false, 0, 0, 32760));
        eVarB.add(new CellDetailsDelegate.Model("NEXT-REPAYMENT", new TextLocalisedClause(R$string.loan_management_schedule_explainer_sheet_next_repayment_next_repayment, null, null, 14), sx4.f.b(3, null, null, breakdown.f21471c), 0, null, null, null, null, null, false, 0, 0, 32760));
        if (dVar != null) {
            eVarB.add(new CellDetailsDelegate.Model("YOU-WILL-PAY", new TextLocalisedClause(R$string.loan_management_schedule_explainer_sheet_next_repayment_you_will_pay, null, null, 14), sx4.f.b(3, null, null, dVar), 0, null, null, null, null, null, false, 0, 0, 32760));
        }
        aim.e eVarA = zhm.u.a(eVarB);
        yp0.b.k(eVarA, 0, 0, 0, 0, 31);
        return dy4.b.a(bVar, textLocalisedClause, textLocalisedClause2, a(), null, eVarA, Constants.TAG_PCI_PED_CHECKSUM);
    }
}
