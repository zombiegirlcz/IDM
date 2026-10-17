package com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.bottom_sheet;

import cli.k;
import cli.n;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.pa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.cards_core.R$string;
import com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.b;
import com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.bottom_sheet.CheckoutBottomSheetInput;
import com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.model.CheckoutOrderFeeBreakdown;
import dxe.e;
import dxe.f;
import java.util.ArrayList;
import java.util.List;
import koi.j;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import mx0.v5;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements n {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CheckoutBottomSheetContract$InputData f90743a;

    public a(CheckoutBottomSheetContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f90743a = inputData;
    }

    public static j a(String str, TextLocalisedClause textLocalisedClause, b bVar, LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton, int i, int i2) {
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model(str, defaultFilledButton, null, textLocalisedClause, false, null, null, bVar, null, 744);
        int i3 = R$attr.uikit_dp16;
        yp0.b.p(model, i, i2, i3, i3);
        return model;
    }

    public static aim.e b(Clause clause, CheckoutOrderFeeBreakdown checkoutOrderFeeBreakdown) {
        Pair pair;
        List<CheckoutOrderFeeBreakdown.CheckoutFeeTax> list = checkoutOrderFeeBreakdown.f90760c;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (CheckoutOrderFeeBreakdown.CheckoutFeeTax checkoutFeeTax : list) {
            switch (f.f120943a[checkoutFeeTax.f90762b.ordinal()]) {
                case 1:
                    pair = new Pair("TAX_VAT_LIST_ID", Integer.valueOf(R$string.card_checkout_tax_dialog_vat));
                    break;
                case 2:
                    pair = new Pair("TAX_CGST_LIST_ID", Integer.valueOf(R$string.card_checkout_tax_dialog_cgst));
                    break;
                case 3:
                    pair = new Pair("TAX_IGST_LIST_ID", Integer.valueOf(R$string.card_checkout_tax_dialog_igst));
                    break;
                case 4:
                    pair = new Pair("TAX_SGST_LIST_ID", Integer.valueOf(R$string.card_checkout_tax_dialog_sgst));
                    break;
                case 5:
                    pair = new Pair("TAX_GMF_LIST_ID", Integer.valueOf(R$string.card_checkout_tax_dialog_gmf));
                    break;
                case 6:
                    pair = new Pair("TAX_STAMP_DUTY_LIST_ID", Integer.valueOf(com.revolut.retail.common.ui.R$string.common_tax_stamp_duty));
                    break;
                case 7:
                    pair = new Pair("TAX_UNKNOWN_LIST_ID", Integer.valueOf(R$string.card_checkout_tax_dialog_tax));
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            arrayList.add(new CellDetailsDelegate.Model((String) pair.f186385a, new TextLocalisedClause(((Number) pair.f186386b).intValue(), null, null, 14), sx4.f.b(3, null, null, checkoutFeeTax.f90761a), 0, null, null, null, null, null, false, 0, 0, 32760));
        }
        aim.e eVarB = u.b();
        aim.e eVarB2 = u.b();
        eVarB2.add(new CellDetailsDelegate.Model("FEE_LIST_ID", clause, sx4.f.b(3, null, null, checkoutOrderFeeBreakdown.f90759b), 0, null, null, null, null, null, false, 0, 0, 32760));
        eVarB2.addAll(arrayList);
        aim.e eVarA = u.a(eVarB2);
        yp0.b.k(eVarA, 0, 0, 0, 0, 31);
        eVarB.addAll(eVarA);
        List listC = u.c(new CellDetailsDelegate.Model("TOTAL_LIST_ID", new TextLocalisedClause(com.revolut.feature.topup_screen.impl.R$string.checkout_plan_price_breakdown_total_price, null, null, 14), sx4.f.b(3, null, null, checkoutOrderFeeBreakdown.f90758a), 0, null, null, null, null, null, false, 0, 0, 32760));
        yp0.b.k(listC, 0, R$attr.uikit_dp24, 0, 0, 29);
        eVarB.addAll(listC);
        return u.a(eVarB);
    }

    public static lw0.a d(Clause clause, TextLocalisedClause textLocalisedClause) {
        return new lw0.a(clause, textLocalisedClause, null, null, false, 28);
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        lw0.a aVarD;
        List listC;
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        CheckoutBottomSheetContract$InputData checkoutBottomSheetContract$InputData = this.f90743a;
        CheckoutBottomSheetInput checkoutBottomSheetInput = checkoutBottomSheetContract$InputData.f90730a;
        if (checkoutBottomSheetInput instanceof CheckoutBottomSheetInput.CancelOrder) {
            aVarD = d(new TextLocalisedClause(com.revolut.feature.topup_screen.impl.R$string.checkout_dialog_cancel_order_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.topup_screen.impl.R$string.checkout_dialog_cancel_order_description, null, null, 14));
        } else if (checkoutBottomSheetInput instanceof CheckoutBottomSheetInput.TopUpMethodFee) {
            aVarD = d(new TextLocalisedClause(com.revolut.feature.topup_screen.impl.R$string.checkout_dialog_card_surcharge_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.topup_screen.impl.R$string.checkout_dialog_card_surcharge_description, null, null, 14));
        } else if (checkoutBottomSheetInput instanceof CheckoutBottomSheetInput.PreKycLearnMore) {
            aVarD = d(new TextLocalisedClause(com.revolut.feature.topup_screen.impl.R$string.topup_prekyc_dialog_learn_more_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.topup_screen.impl.R$string.topup_prekyc_dialog_learn_more_subtitle, null, null, 14));
        } else if (checkoutBottomSheetInput instanceof CheckoutBottomSheetInput.PlanPriceBreakdown) {
            aVarD = d(((CheckoutBottomSheetInput.PlanPriceBreakdown) checkoutBottomSheetInput).f90739a, null);
        } else if ((checkoutBottomSheetInput instanceof CheckoutBottomSheetInput.CardPriceBreakdown) || (checkoutBottomSheetInput instanceof CheckoutBottomSheetInput.DeliveryPriceBreakdown) || (checkoutBottomSheetInput instanceof CheckoutBottomSheetInput.CardCustomisationPriceBreakdown)) {
            aVarD = d(new TextLocalisedClause(R$string.card_checkout_tax_dialog_title, null, null, 14), null);
        } else {
            if (!(checkoutBottomSheetInput instanceof CheckoutBottomSheetInput.CreditPlanFee)) {
                throw new NoWhenBranchMatchedException();
            }
            aVarD = d(new TextLocalisedClause(com.revolut.feature.topup_screen.impl.R$string.topup_checkout_explanation_pay_with_credit_title, null, null, 14), null);
        }
        CheckoutBottomSheetInput checkoutBottomSheetInput2 = checkoutBottomSheetContract$InputData.f90730a;
        boolean z = checkoutBottomSheetInput2 instanceof CheckoutBottomSheetInput.CancelOrder;
        b.C0559b c0559b = b.C0559b.f90729a;
        if (z) {
            listC = v.k(a("CHECKOUT_CANCEL_DIALOG_CANCEL_BUTTON_ID", new TextLocalisedClause(com.revolut.feature.topup_screen.impl.R$string.checkout_dialog_cancel_order_primary_action, null, null, 14), b.a.f90728a, LargeActionButton.ButtonStyle.f58725a, R$attr.uikit_dp24, R$attr.uikit_dp8), a("CHECKOUT_CANCEL_DIALOG_DISMISS_BUTTON_ID", new TextLocalisedClause(com.revolut.feature.topup_screen.impl.R$string.checkout_dialog_cancel_order_secondary_action, null, null, 14), c0559b, LargeActionButton.ButtonStyle.f58726b, R$attr.uikit_dp8, R$attr.uikit_dp24));
        } else if (checkoutBottomSheetInput2 instanceof CheckoutBottomSheetInput.TopUpMethodFee) {
            listC = u.c(a("CHECKOUT_DIALOG_DISMISS_BUTTON_ID", new TextLocalisedClause(com.revolut.feature.topup_screen.impl.R$string.checkout_dialog_card_surcharge_primary_action, null, null, 14), c0559b, LargeActionButton.ButtonStyle.f58725a, R$attr.uikit_dp24, R$attr.uikit_dp8));
        } else if (checkoutBottomSheetInput2 instanceof CheckoutBottomSheetInput.PreKycLearnMore) {
            listC = u.c(a("CHECKOUT_DIALOG_DISMISS_BUTTON_ID", new TextLocalisedClause(com.revolut.feature.topup_screen.impl.R$string.topup_checkout_got_it, null, null, 14), c0559b, LargeActionButton.ButtonStyle.f58725a, R$attr.uikit_dp24, R$attr.uikit_dp8));
        } else if (checkoutBottomSheetInput2 instanceof CheckoutBottomSheetInput.PlanPriceBreakdown) {
            listC = b(new TextLocalisedClause(com.revolut.feature.topup_screen.impl.R$string.checkout_plan_price_breakdown_plan_price, null, null, 14), ((CheckoutBottomSheetInput.PlanPriceBreakdown) checkoutBottomSheetInput2).f90740b);
        } else if (checkoutBottomSheetInput2 instanceof CheckoutBottomSheetInput.CardPriceBreakdown) {
            CheckoutBottomSheetInput.CardPriceBreakdown cardPriceBreakdown = (CheckoutBottomSheetInput.CardPriceBreakdown) checkoutBottomSheetInput2;
            listC = b(cardPriceBreakdown.f90733a, cardPriceBreakdown.f90734b);
        } else if (checkoutBottomSheetInput2 instanceof CheckoutBottomSheetInput.DeliveryPriceBreakdown) {
            CheckoutBottomSheetInput.DeliveryPriceBreakdown deliveryPriceBreakdown = (CheckoutBottomSheetInput.DeliveryPriceBreakdown) checkoutBottomSheetInput2;
            listC = b(deliveryPriceBreakdown.f90737a, deliveryPriceBreakdown.f90738b);
        } else if (checkoutBottomSheetInput2 instanceof CheckoutBottomSheetInput.CardCustomisationPriceBreakdown) {
            listC = b(new TextLocalisedClause(com.revolut.feature.topup_screen.impl.R$string.checkout_card_customisation_item_v2, null, null, 14), ((CheckoutBottomSheetInput.CardCustomisationPriceBreakdown) checkoutBottomSheetInput2).f90732a);
        } else {
            if (!(checkoutBottomSheetInput2 instanceof CheckoutBottomSheetInput.CreditPlanFee)) {
                throw new NoWhenBranchMatchedException();
            }
            CheckoutBottomSheetInput.CreditPlanFee creditPlanFee = (CheckoutBottomSheetInput.CreditPlanFee) checkoutBottomSheetInput2;
            PlainTextDelegate.Model model = new PlainTextDelegate.Model("CREDIT_PLAN_FEE_DESCRIPTION_ID", (Clause) null, (Clause) new TextLocalisedClause(creditPlanFee.f90736b ? com.revolut.feature.topup_screen.impl.R$string.topup_checkout_explanation_pay_with_credit_description_annual : com.revolut.feature.topup_screen.impl.R$string.topup_checkout_explanation_pay_with_credit_description_monthly, u.c(creditPlanFee.f90735a), null, 12), (v5) null, (UrlImage) null, false, (pa) null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 65518);
            yp0.b.l(model, 0, R$attr.uikit_dp24, 0, 0, null, false, 61);
            listC = u.c(model);
        }
        return new cii.b(null, listC, aVarD);
    }
}
