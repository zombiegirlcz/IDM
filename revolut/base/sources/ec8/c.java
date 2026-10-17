package ec8;

import aw0.n6;
import com.revolut.feature.add_card_to_google_pay_shared.impl.verification.otp.multiple.GooglePayMultipleOtpVerificationController;
import com.revolut.feature.address.common.impl.flow.field_search.search.FieldSearchScreen;
import com.revolut.feature.apm.bills.f24.impl.ui.entry.F24EntryController;
import com.revolut.feature.checklist_challenges_ui.impl.ui.checklist_collection.ChecklistCollectionScreen;
import com.revolut.feature.credit.card.impl.ui.repay.choose_payments.CreditCardChoosePaymentsScreen;
import com.revolut.feature.crypto.earn.assets.shared.impl.ui.assets.EarnAssetsScreenController;
import com.revolut.feature.insurance_car.impl.ui.screen.mta.driver_type.MtaDriverTypeScreen;
import com.revolut.feature.junior_allowance.impl.ui.screen.list.JuniorAllowancesListScreen;
import com.revolut.feature.junior_savings.impl.ui.screen.savings_list.JuniorSavingsListScreen;
import com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.overview.screens.list.ChallengesOverviewListScreen;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.details.section_details.SectionDetailsScreen;
import com.revolut.feature.retail.savings.api.documents.models.TaxForm;
import com.revolut.feature.retail.savings.impl.ui.fund_information.FundInfoController;
import com.revolut.feature.revolutpay.shared.ui.account_picker.AccountPickerScreen;
import com.revolut.feature.spending_analytics.impl.ui.rev10.category_management.custom.CategoryManagementCustomController;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.disclaimer.IncomeSorterDisclaimerBottomSheetController;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.price_breakdown.TravelHotelsPriceBreakdownScreen;
import com.revolut.feature.username.ui.UsernameScreen;
import com.revolut.feature.wealth.private_equity.impl.ui.fund_details.investment_details.FundInvestmentDetailsScreen;
import com.revolut.sso.impl.ui.passkeys_management.passkeys_list.PasskeysListController;
import com.revolut.sso.impl.ui.revolut_id.connected_apps.connected_app_details.details.ConnectedAppDetailsScreen;
import e8.r;
import eh1.m;
import epg.u;
import ha3.x;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import nii.n1;
import skm.a2;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c((JuniorAllowancesListScreen) this.v, continuation, 0);
            case 1:
                return new c((AccountPickerScreen) this.v, continuation, 1);
            case 2:
                return new c((TravelHotelsPriceBreakdownScreen) this.v, continuation, 2);
            case 3:
                return new c((ee7.g) this.v, continuation, 3);
            case 4:
                return new c((EarnAssetsScreenController) this.v, continuation, 4);
            case 5:
                return new c((SectionDetailsScreen) this.v, continuation, 5);
            case 6:
                return new c((FundInvestmentDetailsScreen) this.v, continuation, 6);
            case 7:
                return new c((GooglePayMultipleOtpVerificationController) this.v, continuation, 7);
            case 8:
                return new c((eh1.i) this.v, continuation, 8);
            case 9:
                return new c((ChecklistCollectionScreen) this.v, continuation, 9);
            case 10:
                return new c((FieldSearchScreen) this.v, continuation, 10);
            case 11:
                return new c((com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_sender.g) this.v, continuation, 11);
            case 12:
                return new c((ejd.k) this.v, continuation, 12);
            case 13:
                return new c((elf.m) this.v, continuation, 13);
            case 14:
                return new c((eli.j) this.v, continuation, 14);
            case 15:
                return new c((JuniorSavingsListScreen) this.v, continuation, 15);
            case 16:
                return new c((enb.g) this.v, continuation, 16);
            case 17:
                return new c((MtaDriverTypeScreen) this.v, continuation, 17);
            case 18:
                return new c((com.revolut.feature.tax_residency.impl.flows.submit.a) this.v, continuation, 18);
            case 19:
                return new c((PasskeysListController) this.v, continuation, 19);
            case 20:
                return new c((FundInfoController) this.v, continuation, 20);
            case 21:
                return new c((CategoryManagementCustomController) this.v, continuation, 21);
            case 22:
                return new c((UsernameScreen) this.v, continuation, 22);
            case 23:
                return new c((ConnectedAppDetailsScreen) this.v, continuation, 23);
            case 24:
                return new c((F24EntryController) this.v, continuation, 24);
            case 25:
                return new c((com.revolut.feature.credit.card.impl.ui.cancellation.flow.withdrawal.d) this.v, continuation, 25);
            case 26:
                return new c((ChallengesOverviewListScreen) this.v, continuation, 26);
            case 27:
                return new c((IncomeSorterDisclaimerBottomSheetController) this.v, continuation, 27);
            case 28:
                return new c((com.revolut.feature.salary_switch.impl.ui.flow.a) this.v, continuation, 28);
            default:
                return new c((CreditCardChoosePaymentsScreen) this.v, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((c) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((c) create((tji.m) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((c) create((rp0.p) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((c) create(obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((c) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((c) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((c) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((c) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v20, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v25, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v64, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v77, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v83, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        aii.q qVar = aii.q.f5292a;
        int i2 = 1;
        ArrayList arrayList = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object obj3 = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((oki.h) ((JuniorAllowancesListScreen) obj3).d()).B2();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.revolutpay.shared.ui.account_picker.a) ((edc.b) ((AccountPickerScreen) obj3).N.getValue())).B2();
                break;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((TravelHotelsPriceBreakdownScreen) obj3).m2().onBackPressed();
                break;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ee7.g gVar = (ee7.g) obj3;
                r.d(gVar.d, new ee7.f(gVar, i2), 1);
                break;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.crypto.earn.assets.shared.impl.ui.assets.a) ((EarnAssetsScreenController) obj3).d()).B2();
                break;
            case 5:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((eg9.e) ((SectionDetailsScreen) obj3).P.getValue()).B2();
                break;
            case 6:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.wealth.private_equity.impl.ui.fund_details.investment_details.b) ((egh.k) ((FundInvestmentDetailsScreen) obj3).N.getValue())).B2();
                break;
            case 7:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                eh1.i iVar = (eh1.i) ((eh1.k) ((GooglePayMultipleOtpVerificationController) obj3).O.getValue());
                ((x) ((l93.f) iVar.f125688p.f182069b)).f.e();
                iVar.C2(m.a.f125696a);
                break;
            case 8:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                eh1.i iVar2 = (eh1.i) obj3;
                k7i.i iVar3 = iVar2.f125688p;
                break;
            case 9:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.checklist_challenges_ui.impl.ui.checklist_collection.a) ((ChecklistCollectionScreen) obj3).e3()).C2(qVar);
                break;
            case 10:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((FieldSearchScreen) obj3).d().B2();
                break;
            case 11:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                oki.h.D2(((com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_sender.g) obj3).f103240y);
                break;
            case 12:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ejd.k.y2((ejd.k) obj3);
                break;
            case 13:
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                elf.m mVar = (elf.m) obj3;
                a2 a2Var = mVar.f127372r;
                if (a2Var != null) {
                    a2Var.f(null);
                }
                mVar.f127372r = null;
                break;
            case 14:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((eli.j) obj3).c();
                break;
            case 15:
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((JuniorSavingsListScreen) obj3).m2().onBackPressed();
                break;
            case 16:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ue0.c cVar = ((enb.g) obj3).f127799c;
                Type type = enb.h.f127802a;
                Intrinsics.checkNotNullExpressionValue(type, "<get-TAX_FORM>(...)");
                List list = (List) cVar.T2("STORAGE_KEY_TAX_FORMS", type);
                if (list != null) {
                    List<cnb.i> list2 = list;
                    arrayList = new ArrayList(w.t(list2, 10));
                    for (cnb.i iVar4 : list2) {
                        Intrinsics.checkNotNullParameter(iVar4, "<this>");
                        arrayList.add(new TaxForm(iVar4.f25381a, iVar4.f25382b, iVar4.f25383c, iVar4.d));
                    }
                }
                break;
            case 17:
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((MtaDriverTypeScreen) obj3).m2().onBackPressed();
                break;
            case 18:
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.tax_residency.impl.flows.submit.a aVar20 = (com.revolut.feature.tax_residency.impl.flows.submit.a) obj3;
                aVar20.G2(new eoe.e(aVar20.f90068t.f90062b));
                break;
            case 19:
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((PasskeysListController) obj3).m2().onBackPressed();
                break;
            case 20:
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((FundInfoController) obj3).m2().onBackPressed();
                break;
            case 21:
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.spending_analytics.impl.ui.rev10.category_management.custom.b) ((CategoryManagementCustomController) obj3).e3()).B2();
                break;
            case 22:
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                u uVar = (u) ((epg.o) ((UsernameScreen) obj3).f94690b0.getValue());
                uVar.getClass();
                uVar.l2(new ebg.o(uVar, objArr2 == true ? 1 : 0, 21), new yi5.b(26));
                break;
            case 23:
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((ConnectedAppDetailsScreen) obj3).m2().onBackPressed();
                break;
            case 24:
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((F24EntryController) obj3).m2().onBackPressed();
                break;
            case 25:
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                oki.h.D2(((com.revolut.feature.credit.card.impl.ui.cancellation.flow.withdrawal.d) obj3).f69160w);
                break;
            case 26:
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((ChallengesOverviewListScreen) obj3).m2().onBackPressed();
                break;
            case 27:
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((eqd.g) ((IncomeSorterDisclaimerBottomSheetController) obj3).X.getValue()).C2(qVar);
                break;
            case 28:
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                oki.h.D2(((com.revolut.feature.salary_switch.impl.ui.flow.a) obj3).f85318t);
                break;
            default:
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.credit.card.impl.ui.repay.choose_payments.a) ((eu4.u) ((CreditCardChoosePaymentsScreen) obj3).R.getValue())).B2();
                break;
        }
        return Unit.f186387a;
    }
}
