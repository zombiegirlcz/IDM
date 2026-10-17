package an1;

import android.os.Parcelable;
import as1.a0;
import as1.g;
import aw0.o9;
import bej.k;
import bej.l;
import bg2.x;
import bt2.k;
import c7k.j;
import ck3.n;
import cli.y;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.domain.models.moneyrequest.MoneyRequest;
import com.revolut.feature.apm.bills.boleto.api.R$string;
import com.revolut.feature.credit.application.plugins.impl.ui.home_insurance.e;
import com.revolut.feature.credit.application.plugins.impl.ui.solicitor_selection.SolicitorSelectionFlowContract$Step;
import com.revolut.feature.credit.card.api.models.cancellation.CreditCardCancellationSuccessSheet;
import com.revolut.feature.pix.impl.flow.refund.screen.review.PixRefundReviewScreenContract$InputData;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanHubInfoBannerActionSuccess;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.CobrandedCardsPlanHubScreenContract$ActionBannerPayload;
import com.revolut.feature.wealth.ui.api.WealthUiApi$Toggles;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$plurals;
import com.revolut.retail.trading.core.domain.orders.InvestFundOrder;
import com.revolut.retail.trading.core.domain.orders.InvestOrder;
import com.revolut.revolut.feature_fourthline_impl.R;
import crg.h;
import ct6.t;
import dtl.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import nii.e0;
import nii.g0;
import nii.h0;
import nii.j0;
import nii.m0;
import nii.t1;
import nii.u1;
import nii.v1;
import nii.z;
import uy3.i;
import vkm.j2;
import vu.f;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class d implements t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6549b;

    public /* synthetic */ d(m mVar, InvestOrder investOrder) {
        this.f6548a = 12;
        this.f6549b = investOrder;
    }

    @Override // nii.p1
    public final m0 a(Object obj2) {
        TextLocalisedClause textLocalisedClause;
        int i = this.f6548a;
        z zVarB = null;
        Object obj3 = this.f6549b;
        switch (i) {
            case 0:
                ((com.revolut.feature.apm.bills.boleto.impl.finder.onboarding.a) obj3).f61175q.getClass();
                return new g0(new TextLocalisedClause(R$string.boleto_finder_onboarding_accept_result_pending_title, null, null, 14), new TextLocalisedClause(R$string.boleto_finder_onboarding_accept_result_pending_description, null, null, 14), null, null, null, null, null, null, false, null, false, null, 16380);
            case 1:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                ((com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.b) obj3).f71219r.getClass();
                return new j0((Clause) new TextLocalisedClause(com.revolut.feature.crypto.withdraw.impl.R$string.crypto_withdrawals_screen_address_details_updated_success_title, null, null, 14), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4094);
            case 2:
                y yVar = ((a0) obj3).f8759w;
                j2 j2Var = (j2) yVar.f22677a;
                j2 j2Var2 = (j2) yVar.f22677a;
                if (((g) j2Var.getValue()).f8761b.f61454h == null) {
                    textLocalisedClause = new TextLocalisedClause(com.revolut.feature.apm.bills.tapi.impl.R$string.tapi_transfer_review_submit_title_single, u.c(new MoneyClause(((g) j2Var2.getValue()).f8760a, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12);
                } else {
                    int i2 = com.revolut.feature.apm.bills.tapi.impl.R$string.tapi_transfer_review_submit_title;
                    MoneyClause moneyClause = new MoneyClause(((g) j2Var2.getValue()).f8760a, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
                    String str = ((g) j2Var2.getValue()).f8761b.f61454h;
                    if (str == null) {
                        str = "";
                    }
                    textLocalisedClause = new TextLocalisedClause(i2, v.k(moneyClause, new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
                }
                return new j0((Clause) textLocalisedClause, (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4094);
            case 3:
                x xVar = (x) obj3;
                rf2.a aVar = xVar.u;
                y yVar2 = xVar.z;
                dj0.d dVar = ((bg2.g) ((j2) yVar2.f22677a).getValue()).f15052a;
                String displayName = ((bg2.g) ((j2) yVar2.f22677a).getValue()).f15053b.getDisplayName();
                aVar.getClass();
                return rf2.a.a(dVar, displayName);
            case 4:
                SolicitorSelectionFlowContract$Step.CustomSolicitorAddress customSolicitorAddress = (SolicitorSelectionFlowContract$Step.CustomSolicitorAddress) obj3;
                return new j0((Clause) new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_solicitor_selection_success_popup_title, u.c(customSolicitorAddress.f68380a.f130891c.f130906a), null, 12), (Clause) new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_solicitor_selection_success_popup_description, u.c(customSolicitorAddress.f68380a.f130891c.f130907b), null, 12), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4092);
            case 5:
                SolicitorSelectionFlowContract$Step.PartnerSolicitorDetails partnerSolicitorDetails = (SolicitorSelectionFlowContract$Step.PartnerSolicitorDetails) obj3;
                return new j0((Clause) new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_solicitor_selection_success_popup_title, u.c(partnerSolicitorDetails.f68386a.f130893b.f130906a), null, 12), (Clause) new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_solicitor_selection_success_popup_description, u.c(partnerSolicitorDetails.f68386a.f130893b.f130907b), null, 12), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4092);
            case 6:
                vu.g gVar = ((k) obj3).f18268p;
                return new j0((Clause) new TextLocalisedClause(((n5j.b) gVar).b(f.referrals_select_retail_account_success), null, null, 14), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) new v1(new TextLocalisedClause(((n5j.b) gVar).b(f.referrals_select_retail_account_refer_a_business), null, null, 14), null), false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4078);
            case 7:
                j jVar = (j) obj3;
                e7k.a aVar2 = jVar.f22056q;
                MoneyRequest moneyRequest = ((c7k.a) jVar.t2()).f22045a;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(moneyRequest, "moneyRequest");
                return new j0((Clause) new TextLocalisedClause(com.revolut.retail.feature.payments.money_request.core.R$string.send_request_quick_action_success_decline_title_with_money, v.k(new TextClause(com.revolut.domain.models.moneyrequest.a.c(moneyRequest.f60320l), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new MoneyClause(moneyRequest.d, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4094);
            case 8:
                ((n) obj3).f24770s.getClass();
                return new j0((Clause) new TextLocalisedClause(com.revolut.feature.commodities.onboarding.impl.R$string.commodities_risk_consent_confirm_success_dialog, null, null, 14), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) StatusViewContract$Duration.Long.f59733a, (h0) null, (ResourceImage) null, 3582);
            case 9:
                ((h) obj3).f108386q.getClass();
                return new j0((Clause) new TextLocalisedClause(com.revolut.feature.vaults.R$string.vaults_document_reacceptance_document_accepted_title, null, null, 14), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4094);
            case 10:
                return e.P2((e) obj3, (i) obj2);
            case 11:
                return new j0((Clause) new TextLocalisedClause(com.revolut.feature.credit.core.R$string.home_insurance_partner_success_title, u.c(((uy3.e) obj3).f284064c), null, 12), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4094);
            case 12:
                return new j0((Clause) (((InvestOrder) obj3) instanceof InvestFundOrder ? new TextLocalisedClause(com.revolut.trading.orders.R$string.wealth_order_fund_cancellation_success_title, null, null, 14) : new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trade_status_cancelled, null, null, 14)), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4092);
            case 13:
                dx5.n nVar = (dx5.n) obj3;
                vw5.a aVar3 = nVar.f120884r;
                dj0.d investedAmount = nVar.f120882p.f71547a.f71519b;
                String collectionName = ((xzg.k) zi0.c.I(((dx5.e) nVar.t2()).f120873c)).e();
                aVar3.getClass();
                Intrinsics.checkNotNullParameter(investedAmount, "investedAmount");
                Intrinsics.checkNotNullParameter(collectionName, "collectionName");
                j0 configuration = new j0((Clause) new TextLocalisedClause(com.revolut.feature.cryptocommodity_invest.api.R$string.cryptocommodity_invest_collections_confirmation_screen_success_dialog_message, v.k(new MoneyClause(investedAmount, new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), null, 8), collectionName), null, 12), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4094);
                Intrinsics.checkNotNullParameter(configuration, "configuration");
                return configuration;
            case 14:
                ((t) ((com.revolut.feature.freelancer.impl.ui.extension.a) obj3).o).getClass();
                return new j0((Clause) new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_account_closure_account_actions_account_removed, null, null, 14), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4094);
            case 15:
                eg2.u uVar = (eg2.u) obj3;
                rf2.a aVar4 = uVar.f125543s;
                y yVar3 = uVar.u;
                dj0.d dVar2 = ((eg2.g) ((j2) yVar3.f22677a).getValue()).f125526a;
                String displayName2 = ((eg2.g) ((j2) yVar3.f22677a).getValue()).f125527b.getDisplayName();
                aVar4.getClass();
                return rf2.a.a(dVar2, displayName2);
            case 16:
                eik.j jVar2 = (eik.j) obj2;
                fik.d dVar3 = ((com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_sender.g) obj3).f103237t;
                if (jVar2 instanceof eik.i) {
                    return null;
                }
                if (!(jVar2 instanceof eik.h)) {
                    throw new NoWhenBranchMatchedException();
                }
                eik.h hVar = (eik.h) jVar2;
                List recipientErrors = hVar.f126670a;
                List recipientContacts = hVar.f126671b;
                Clause planName = hVar.f126672c;
                dVar3.getClass();
                Intrinsics.checkNotNullParameter(recipientErrors, "recipientErrors");
                Intrinsics.checkNotNullParameter(planName, "planName");
                Intrinsics.checkNotNullParameter(recipientContacts, "recipientContacts");
                if (!recipientErrors.isEmpty()) {
                    pck.i iVar = (pck.i) d0.M0(recipientErrors);
                    if (iVar != null) {
                        pck.h hVar2 = iVar.f234930b;
                        TextClause textClause = new TextClause(fik.d.f(iVar, recipientContacts), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                        switch (fik.c.f135470a[hVar2.ordinal()]) {
                            case 1:
                                zVarB = fik.d.a(com.revolut.retail.feature.pricing_plans.ui.impl.R$string.premium_plan_referral_recipient_ineligible_already_offered_title, com.revolut.retail.feature.pricing_plans.ui.impl.R$string.premium_plan_referral_recipient_ineligible_already_offered_description, u.c(textClause), u.c(planName));
                                break;
                            case 2:
                                zVarB = fik.d.c(dVar3, com.revolut.retail.feature.pricing_plans.ui.impl.R$string.premium_plan_referral_recipient_ineligible_already_referred_title, u.c(textClause), com.revolut.retail.feature.pricing_plans.ui.impl.R$string.premium_plan_referral_recipient_ineligible_already_referred_description, null, 8);
                                break;
                            case 3:
                                zVarB = fik.d.a(com.revolut.retail.feature.pricing_plans.ui.impl.R$string.premium_plan_referral_recipient_ineligible_offer_unavailable_title, com.revolut.retail.feature.pricing_plans.ui.impl.R$string.premium_plan_referral_recipient_ineligible_offer_unavailable_description, u.c(textClause), u.c(planName));
                                break;
                            case 4:
                                zVarB = fik.d.a(com.revolut.retail.feature.pricing_plans.ui.impl.R$string.premium_plan_referral_recipient_ineligible_same_or_higher_plan_title, com.revolut.retail.feature.pricing_plans.ui.impl.R$string.premium_plan_referral_recipient_ineligible_same_or_higher_plan_description, u.c(textClause), u.c(planName));
                                break;
                            case 5:
                                zVarB = fik.d.a(com.revolut.retail.feature.pricing_plans.ui.impl.R$string.premium_plan_referral_recipient_ineligible_not_trusted_title, com.revolut.retail.feature.pricing_plans.ui.impl.R$string.premium_plan_referral_recipient_ineligible_not_trusted_description, u.c(textClause), u.c(textClause));
                                break;
                            case 6:
                                zVarB = fik.d.a(com.revolut.retail.feature.pricing_plans.ui.impl.R$string.premium_plan_referral_recipient_ineligible_plan_sharing_off_title, com.revolut.retail.feature.pricing_plans.ui.impl.R$string.premium_plan_referral_recipient_ineligible_plan_sharing_off_description, u.c(textClause), u.c(textClause));
                                break;
                            case 7:
                            case 8:
                                zVarB = fik.d.c(dVar3, com.revolut.retail.feature.pricing_plans.ui.impl.R$string.premium_plan_referral_recipient_ineligible_generic_title, null, com.revolut.retail.feature.pricing_plans.ui.impl.R$string.premium_plan_referral_recipient_ineligible_generic_description, u.c(textClause), 2);
                                break;
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        List list = recipientErrors;
                        boolean z = list instanceof Collection;
                        if (z && list.isEmpty()) {
                            zVarB = fik.d.c(dVar3, com.revolut.retail.feature.pricing_plans.ui.impl.R$string.premium_plan_referral_recipient_ineligible_multiple_not_trusted_title, null, com.revolut.retail.feature.pricing_plans.ui.impl.R$string.premium_plan_referral_recipient_ineligible_multiple_not_trusted_description, u.c(fik.d.d(recipientErrors, recipientContacts)), 2);
                        } else {
                            Iterator it8 = list.iterator();
                            while (it8.hasNext()) {
                                if (((pck.i) it8.next()).f234930b != pck.h.NOT_TRUSTED_CONTACT) {
                                    if (z && list.isEmpty()) {
                                        zVarB = fik.d.c(dVar3, com.revolut.retail.feature.pricing_plans.ui.impl.R$string.premium_plan_referral_recipient_ineligible_multiple_generic_title, null, com.revolut.retail.feature.pricing_plans.ui.impl.R$string.premium_plan_referral_recipient_ineligible_multiple_generic_description, u.c(fik.d.d(recipientErrors, recipientContacts)), 2);
                                    } else {
                                        Iterator it9 = list.iterator();
                                        while (it9.hasNext()) {
                                            if (((pck.i) it9.next()).f234930b == pck.h.NOT_TRUSTED_CONTACT) {
                                                ArrayList arrayList = new ArrayList();
                                                for (Object obj4 : list) {
                                                    if (((pck.i) obj4).f234930b == pck.h.NOT_TRUSTED_CONTACT) {
                                                        arrayList.add(obj4);
                                                    }
                                                }
                                                zVarB = fik.d.b(com.revolut.retail.feature.pricing_plans.ui.impl.R$string.premium_plan_referral_recipient_ineligible_multiple_generic_with_not_trusted_title, new TextLocalisedQuantityClause(R$plurals.premium_plan_referral_recipient_ineligible_multiple_generic_with_not_trusted_description, Integer.valueOf(arrayList.size()), v.k(Integer.valueOf(arrayList.size()), fik.d.d(arrayList, recipientContacts)), (Style) null, 24), f0.f322471a);
                                            }
                                        }
                                        zVarB = fik.d.c(dVar3, com.revolut.retail.feature.pricing_plans.ui.impl.R$string.premium_plan_referral_recipient_ineligible_multiple_generic_title, null, com.revolut.retail.feature.pricing_plans.ui.impl.R$string.premium_plan_referral_recipient_ineligible_multiple_generic_description, u.c(fik.d.d(recipientErrors, recipientContacts)), 2);
                                    }
                                }
                            }
                            zVarB = fik.d.c(dVar3, com.revolut.retail.feature.pricing_plans.ui.impl.R$string.premium_plan_referral_recipient_ineligible_multiple_not_trusted_title, null, com.revolut.retail.feature.pricing_plans.ui.impl.R$string.premium_plan_referral_recipient_ineligible_multiple_not_trusted_description, u.c(fik.d.d(recipientErrors, recipientContacts)), 2);
                        }
                    }
                }
                return zVarB == null ? fik.d.e() : zVarB;
            case 17:
                pfj.b it10 = (pfj.b) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                skj.a aVar5 = ((com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.pac.number_transfer_confirmation.b) obj3).f101322t;
                pfj.a aVar6 = it10.f235602b;
                aVar5.getClass();
                return skj.a.b(aVar6);
            case 18:
                CreditCardCancellationSuccessSheet creditCardCancellationSuccessSheet = ((com.revolut.feature.credit.card.impl.ui.cancellation.flow.withdrawal.d) obj3).I2().f69150a.f68703b.f68706c;
                return new j0((Clause) new TextClause(creditCardCancellationSuccessSheet.f68713a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Clause) new TextClause(creditCardCancellationSuccessSheet.f68714b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4092);
            case 19:
                Float fValueOf = Float.valueOf(24.0f);
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return new g0(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trading_free_stocks_select_claim_success_title, null, null, 14), null, null, ((jte.d) ((com.revolut.retail.feature.trading_onboarding.impl.ui.free_stocks.select.b) obj3).f104171s).c(WealthUiApi$Toggles.FreeStocksShare.f95854c) ? yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(new ImageClause(R$drawable.uikit_icn_24_share_ios, Integer.valueOf(R$attr.uikit_colorOnAccentNeutral), fValueOf, fValueOf, 16), new TextLocalisedClause(R.string.common_share, null, null, 14))) : null, null, null, null, null, false, null, false, null, 16374);
            case 20:
                ((com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_billing.a) obj3).f101101s.getClass();
                return new j0((Clause) new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.esim_mobile_plans_billing_pocket_updating_success_title, null, null, 14), (Clause) new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.esim_mobile_plans_billing_pocket_updating_success_subtitle, null, null, 14), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4092);
            case 21:
                e0f.f0 transactionResult = (e0f.f0) obj2;
                Intrinsics.checkNotNullParameter(transactionResult, "transactionResult");
                return ((com.revolut.feature.topup_screen.impl.flows.topup_flows.card.b) obj3).f90975t.b(transactionResult);
            case 22:
                CobrandedCardsPlanHubInfoBannerActionSuccess cobrandedCardsPlanHubInfoBannerActionSuccess = (CobrandedCardsPlanHubInfoBannerActionSuccess) obj3;
                if (cobrandedCardsPlanHubInfoBannerActionSuccess != null) {
                    return new j0((Clause) new TextClause(cobrandedCardsPlanHubInfoBannerActionSuccess.f82352a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Clause) new TextClause(cobrandedCardsPlanHubInfoBannerActionSuccess.f82353b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4092);
                }
                return null;
            case 23:
                CobrandedCardsPlanHubScreenContract$ActionBannerPayload.Subscribe subscribe = (CobrandedCardsPlanHubScreenContract$ActionBannerPayload.Subscribe) obj3;
                return new j0((Clause) new TextClause(subscribe.f82574c.f82352a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Clause) new TextClause(subscribe.f82574c.f82353b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4092);
            case 24:
                bej.k kVar = (bej.k) obj2;
                jkj.a aVar7 = ((hkj.f) obj3).f152936r;
                if (kVar instanceof l) {
                    aVar7.getClass();
                    return new j0((Clause) new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.esim_mobile_plans_invoices_document_loading_dialog_ready, null, null, 14), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4094);
                }
                if (kVar instanceof k.a) {
                    aVar7.getClass();
                    return new g0(new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.esim_mobile_plans_invoices_document_loading_dialog_pending_title, null, null, 14), new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.esim_mobile_plans_invoices_document_loading_dialog_pending_subtitle, null, null, 14), null, null, null, null, null, null, false, null, false, null, 16380);
                }
                if (!(kVar instanceof bej.j)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (((bej.j) kVar).f14855a) {
                    aVar7.getClass();
                    return new e0((Clause) new TextLocalisedClause(com.revolut.kompot.common.R$string.common_offline_state_title, null, null, 14), (Clause) new TextLocalisedClause(com.revolut.kompot.common.R$string.common_offline_state_description, null, null, 14), (TextLocalisedClause) null, (Parcelable) null, false, (AnalyticsProduct) null, 1020);
                }
                aVar7.getClass();
                return jkj.a.a();
            case 25:
                ((ht1.k) obj3).f155214q.getClass();
                return new j0((Clause) new TextLocalisedClause(com.revolut.feature.apm.bizum.api.R$string.bizum_settings_deregister_success_title, null, null, 14), (Clause) new TextLocalisedClause(com.revolut.feature.apm.bizum.api.R$string.bizum_settings_deregister_success_description, null, null, 14), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4092);
            case 26:
                ((com.revolut.feature.security_hub.impl.ui.flow.m) obj3).f85572r.getClass();
                return new j0((Clause) new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_linked_wallets_acknowledge_new_dialog_success, null, null, 14), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4094);
            case 27:
                rud.a aVar8 = ((com.revolut.feature.staking.impl.confirmation.a) obj3).v;
                dj0.d amount = (dj0.d) ((Pair) obj2).f186385a;
                ((rud.b) aVar8).getClass();
                Intrinsics.checkNotNullParameter(amount, "amount");
                j0 configuration2 = new j0((Clause) new TextLocalisedClause(com.revolut.feature.staking.api.R$string.staking_stake_successful_dialog, u.c(new MoneyClause(amount, new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), o9.SENSITIVE)), null, 12), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, true, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4062);
                Intrinsics.checkNotNullParameter(configuration2, "configuration");
                return configuration2;
            case 28:
                int i3 = com.revolut.feature.pix.impl.R$string.pix_refund_review_success_dialog_title;
                PixRefundReviewScreenContract$InputData pixRefundReviewScreenContract$InputData = ((ica.n) obj3).o;
                return new g0(new TextLocalisedClause(i3, v.k(new MoneyClause(pixRefundReviewScreenContract$InputData.f80739a, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), pixRefundReviewScreenContract$InputData.f80741c), null, 12), new TextLocalisedClause(com.revolut.feature.pix.impl.R$string.pix_refund_review_success_dialog_description, null, null, 14), null, null, null, null, null, null, false, null, false, null, 16380);
            default:
                ((iek.n) obj3).f160764q.getClass();
                return new j0((Clause) new TextLocalisedClause(com.revolut.retail.feature.pod_nominees.impl.R$string.pod_nominees_details_success_dialog_remove_title, null, null, 14), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4094);
        }
    }

    public /* synthetic */ d(Object obj2, int i) {
        this.f6548a = i;
        this.f6549b = obj2;
    }
}
