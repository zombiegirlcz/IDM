package y7k;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.revolut.apm.pix.validation.api.PixIdentifiedType;
import com.revolut.core.backend_flow.api.navigation.BackendFlowDestination;
import com.revolut.core.backend_flow.api.navigation.BackendFlowInput;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.bills.core.api.model.form.AddressField;
import com.revolut.feature.apm.bills.core.api.model.form.BillFormFieldV2;
import com.revolut.feature.backend_flow.domain.models.BottomPromptScreen;
import com.revolut.feature.cash_topup.impl.ui.flow.barcode.CashTopUpBarcodeFlowContract$Step;
import com.revolut.feature.junior_payment_links.impl.R$string;
import com.revolut.feature.junior_payment_links.impl.ui.flow.card_profile.JuniorCardProfileFlowContract$Step;
import com.revolut.feature.onboarding.api.exchange_global_access.ExchangeGlobalAccessOutput;
import com.revolut.feature.onboarding.impl.missinginfo.MissingInfoActivity;
import com.revolut.feature.pockets.impl.ui.add_new.AddNewPocketFlowContract$Step;
import com.revolut.feature.shared_separate_favourites.common.screen.counterpart_chooser.SharedFavouritesCounterpartChooserScreen;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetDetails;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import com.revolut.feature.transaction.troubleshooter.impl.ui.flow.screen.list.TroubleshooterListScreenContract$InputData;
import com.revolut.feature.wealth.api.navigation.models.RecurringDepositSchedule;
import com.revolut.feature.wealth.impl.ui.screens.composite_add_money.CompositeAddMoneyScreenContract$FlowStep;
import com.revolut.feature.wealth.impl.ui.screens.composite_add_money.schedule.ScheduleScreenContract$Input;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.common.ui.R$id;
import com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.transfer.PaymentLinksTransferData;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_gift_sending.PlanGiftSendingFlowContract$Step;
import com.revolut.shared.feature.wealth.models.screener.ScreenerCollection;
import com.revolut.shared.feature.wealth.models.screener.ScreenerSelectedSorting;
import com.revolut.shared.feature.wealth_discovery.domain.api.CorporateEventsApi$Toggles$InstrumentDetailsEarningsCallBanner;
import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.bouncycastle.asn1.BERTags;
import y20.a1;
import zhm.y0;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class g0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f311550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f311551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f311552c;

    public /* synthetic */ g0(com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.b bVar, FavouritesAssetDetails favouritesAssetDetails, String str) {
        this.f311550a = 19;
        this.f311552c = str;
        this.f311551b = favouritesAssetDetails;
    }

    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        String strO;
        int iMax;
        Pair pair;
        vim.e eVarA;
        switch (this.f311550a) {
            case 0:
                Function1 function1 = (Function1) this.f311552c;
                com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.a aVar = (com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.a) this.f311551b;
                r update = (r) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return r.a(update, (PaymentLinksTransferData) function1.invoke(aVar.N2()), null, 0, 13);
            case 1:
                com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.a aVar2 = (com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.a) this.f311551b;
                String str = (String) this.f311552c;
                PaymentLinksTransferData updateTransferData = (PaymentLinksTransferData) obj2;
                Intrinsics.checkNotNullParameter(updateTransferData, "$this$updateTransferData");
                return PaymentLinksTransferData.a(updateTransferData, aVar2.E.b(str, updateTransferData.f102235b.f306286a), null, null, null, null, null, null, 510);
            case 2:
                com.revolut.feature.onboarding.impl.missinginfo.d dVar = (com.revolut.feature.onboarding.impl.missinginfo.d) this.f311552c;
                ViewController viewController = (ViewController) this.f311551b;
                ybi.b output = (ybi.b) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                dVar.l2(new com.revolut.feature.onboarding.impl.missinginfo.c(dVar, output.f312372a, null), new ga9.h(viewController, 1));
                return Unit.f186387a;
            case 3:
                y99.w wVar = (y99.w) this.f311552c;
                y99.j jVar = (y99.j) this.f311551b;
                m89.a currentStep = (m89.a) obj2;
                Intrinsics.checkNotNullParameter(currentStep, "currentStep");
                switch (y99.q.f311796a[currentStep.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                        ((iqi.b) wVar.f311805n).setVisible(false);
                        break;
                    case 4:
                    case 5:
                    case 6:
                        ((iqi.b) wVar.f311805n).setVisible(true);
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                MissingInfoActivity missingInfoActivity = (MissingInfoActivity) jVar;
                CoordinatorLayout.Behavior behavior = missingInfoActivity.f78287s0;
                View viewFindViewById = missingInfoActivity.findViewById(R$id.fragment_container);
                ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
                CoordinatorLayout.LayoutParams layoutParams2 = layoutParams instanceof CoordinatorLayout.LayoutParams ? (CoordinatorLayout.LayoutParams) layoutParams : null;
                if (layoutParams2 != null) {
                    CoordinatorLayout.Behavior behavior2 = missingInfoActivity.f78287s0;
                    if (behavior2 != null) {
                        layoutParams2.setBehavior(behavior2);
                    }
                    missingInfoActivity.f78287s0 = null;
                    if (!Intrinsics.f(behavior, null)) {
                        viewFindViewById.requestLayout();
                    }
                }
                return Unit.f186387a;
            case 4:
                ya6.d dVar2 = (ya6.d) this.f311552c;
                String str2 = (String) this.f311551b;
                Data data = (Data) obj2;
                Intrinsics.h(data);
                if (pyd.c.G(data)) {
                    dVar2.d.j(str2, zi0.c.I(data));
                }
                return Unit.f186387a;
            case 5:
                com.revolut.feature_retail_user_declarations.email.screen.a aVar3 = (com.revolut.feature_retail_user_declarations.email.screen.a) this.f311552c;
                String domain = (String) this.f311551b;
                yai.k update2 = (yai.k) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                qai.a aVar4 = aVar3.u;
                String email = update2.f312032a;
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(email, "email");
                Intrinsics.checkNotNullParameter(domain, "domain");
                int iS = kotlin.text.d0.S(email, '@', 0, 6);
                if (iS >= 0) {
                    String strSubstring = email.substring(0, iS);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    strO = strSubstring + "@" + domain;
                } else {
                    strO = com.google.android.gms.internal.mlkit_vision_face.a.o(email, "@", domain);
                }
                return yai.k.a(update2, strO, null, false, null, null, 62);
            case 6:
                com.revolut.feature.cash_topup.impl.ui.flow.barcode.a aVar5 = (com.revolut.feature.cash_topup.impl.ui.flow.barcode.a) this.f311552c;
                CashTopUpBarcodeFlowContract$Step cashTopUpBarcodeFlowContract$Step = (CashTopUpBarcodeFlowContract$Step) this.f311551b;
                ic3.e result = (ic3.e) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (!(result instanceof ic3.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar5.C1(new BackendFlowDestination(BackendFlowInput.Companion.a(BackendFlowInput.INSTANCE, "a3144f55-a1e7-43da-8daf-9fa410015667", foh.i.q(new Pair("storeId", ((ic3.d) result).f160207a), new Pair("transactionId", ((CashTopUpBarcodeFlowContract$Step.SelectStoreToReportIssue) cashTopUpBarcodeFlowContract$Step).f65650a)), null, 4)));
                return Unit.f186387a;
            case 7:
                com.revolut.feature.wealth.impl.ui.screens.composite_add_money.b bVar = (com.revolut.feature.wealth.impl.ui.screens.composite_add_money.b) this.f311552c;
                CompositeAddMoneyScreenContract$FlowStep compositeAddMoneyScreenContract$FlowStep = (CompositeAddMoneyScreenContract$FlowStep) this.f311551b;
                aii.r result2 = (aii.r) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                if (result2 instanceof dii.g) {
                    bVar.l2(new y65.l(bVar, (dii.g) result2, ((CompositeAddMoneyScreenContract$FlowStep.PreActionPrompt) compositeAddMoneyScreenContract$FlowStep).f95580b, null, 6), new ybh.g0(bVar, 1));
                }
                return Unit.f186387a;
            case 8:
                com.revolut.feature.wealth.impl.ui.screens.composite_add_money.b bVar2 = (com.revolut.feature.wealth.impl.ui.screens.composite_add_money.b) this.f311552c;
                String str3 = (String) this.f311551b;
                ybh.n update3 = (ybh.n) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                dj0.d dVar3 = update3.f312323a;
                dj0.d dVarC = dVar3 != null ? dj0.d.c(dVar3, bVar2.f95590q.b(str3, dVar3.f115083b.f306286a), null, 2) : null;
                return ybh.n.a(update3, dVarC, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, update3.f312333q && dVar3 != null && dVar3.equals(dVarC), 57342);
            case 9:
                com.revolut.feature.wealth.impl.ui.screens.composite_add_money.b bVar3 = (com.revolut.feature.wealth.impl.ui.screens.composite_add_money.b) this.f311552c;
                ScheduleScreenContract$Input input = (ScheduleScreenContract$Input) this.f311551b;
                ech.j output2 = (ech.j) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                cli.y yVar = bVar3.K;
                ?? r62 = bVar3.J;
                Intrinsics.checkNotNullParameter(input, "input");
                Intrinsics.checkNotNullParameter(output2, "output");
                if (output2 instanceof ech.h) {
                    ((MutableStateFlow) r62.getValue()).k(Boolean.FALSE);
                    bVar3.H2(yVar, new ybh.a0(4));
                } else if (output2 instanceof ech.i) {
                    ech.i iVar = (ech.i) output2;
                    RecurringDepositSchedule recurringDepositSchedule = new RecurringDepositSchedule(iVar.f124740a, iVar.f124741b);
                    ((MutableStateFlow) r62.getValue()).k(Boolean.TRUE);
                    bVar3.H2(yVar, new ybh.h0(recurringDepositSchedule, 0));
                } else {
                    if (!Intrinsics.f(output2, ech.g.f124738a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (!input.f95601c && !((Boolean) ((MutableStateFlow) r62.getValue()).getValue()).booleanValue()) {
                        bVar3.C2(ybh.p.f312339a);
                    }
                }
                return Unit.f186387a;
            case 10:
                com.revolut.feature.wealth.impl.ui.screens.composite_add_money.b bVar4 = (com.revolut.feature.wealth.impl.ui.screens.composite_add_money.b) this.f311552c;
                CompositeAddMoneyScreenContract$FlowStep.ScaPrompt scaPrompt = (CompositeAddMoneyScreenContract$FlowStep.ScaPrompt) this.f311551b;
                Intrinsics.checkNotNullParameter((vrc.j) obj2, "<unused var>");
                bVar4.C2(new ybh.q(scaPrompt.f95582b));
                return Unit.f186387a;
            case 11:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.f311552c;
                com.revolut.retail.feature.crypto_deposits.impl.ui.directdeposit.b bVar5 = (com.revolut.retail.feature.crypto_deposits.impl.ui.directdeposit.b) this.f311551b;
                yja.b result3 = (yja.b) obj2;
                Intrinsics.checkNotNullParameter(result3, "result");
                ref$ObjectRef.f186409a = result3;
                if (result3 == yja.b.CLOSE_CLICK) {
                    oki.h.D2(bVar5.z);
                } else {
                    bVar5.n2(new ybj.h(bVar5, null, 0), new whi.b(6)).k(new y8a.h(bVar5, 20));
                }
                return Unit.f186387a;
            case 12:
                yc0.j jVar2 = (yc0.j) this.f311552c;
                BottomPromptScreen bottomPromptScreen = (BottomPromptScreen) this.f311551b;
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return jVar2.b(bottomPromptScreen);
            case 13:
                String str4 = (String) this.f311552c;
                yca.t tVar = (yca.t) this.f311551b;
                yca.h update4 = (yca.h) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                String lowerCase = str4.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                yca.l keyInput = new yca.l(lowerCase, tVar.f312596r.a(str4));
                g8a.t type = update4.f312582b;
                Intrinsics.checkNotNullParameter(keyInput, "keyInput");
                Intrinsics.checkNotNullParameter(type, "type");
                return new yca.h(keyInput, type);
            case 14:
                yca.t tVar2 = (yca.t) this.f311552c;
                PixIdentifiedType.Valid valid = (PixIdentifiedType.Valid) this.f311551b;
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                yji.l.b1(tVar2, tVar2.X1(((uca.c) tVar2.f312595q).c(it8, valid)), null, new yca.p(tVar2, valid, null), 3);
                return Boolean.TRUE;
            case 15:
                com.revolut.feature.retail.private_banking.impl.ui.deposit_assets.flow.b bVar6 = (com.revolut.feature.retail.private_banking.impl.ui.deposit_assets.flow.b) this.f311552c;
                yki.b bVar7 = (yki.b) this.f311551b;
                adb.j it9 = (adb.j) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                bVar6.n2(new y65.l(bVar6, it9, bVar7, null, 7), new whi.b(6));
                return Unit.f186387a;
            case 16:
                Set set = (Set) this.f311552c;
                Instant instant = (Instant) this.f311551b;
                o4l.a it10 = (o4l.a) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return Boolean.valueOf(set.contains(it10.f222295a) && it10.f222296b.toInstant().compareTo(instant) > 0);
            case 17:
                yea.c cVar = (yea.c) this.f311552c;
                String str5 = (String) this.f311551b;
                yhm.r rVar = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                List list = (List) rVar.f314201a;
                eda.a aVar6 = (eda.a) rVar.f314202b;
                List list2 = (List) rVar.f314203c;
                List list3 = list;
                ArrayList arrayList = new ArrayList(zhm.w.t(list3, 10));
                Iterator it11 = list3.iterator();
                while (it11.hasNext()) {
                    arrayList.add(z92.f.l((io3.d) it11.next()));
                }
                List list4 = aVar6.f124959b;
                ArrayList arrayList2 = new ArrayList(zhm.w.t(list4, 10));
                Iterator it12 = list4.iterator();
                while (it12.hasNext()) {
                    arrayList2.add(z92.f.l((io3.d) it12.next()));
                }
                List list5 = aVar6.f124958a;
                ArrayList arrayList3 = new ArrayList(zhm.w.t(list5, 10));
                Iterator it13 = list5.iterator();
                while (it13.hasNext()) {
                    arrayList3.add(z92.f.l((io3.d) it13.next()));
                }
                ArrayList arrayList4 = new ArrayList();
                for (Object obj3 : list2) {
                    if (cp5.d.A((xi0.b) obj3)) {
                        arrayList4.add(obj3);
                    }
                }
                aim.o oVar = new aim.o();
                oVar.addAll(arrayList4);
                oVar.removeAll(arrayList2);
                oVar.removeAll(arrayList);
                oVar.removeAll(arrayList3);
                aim.o oVarA = y0.a(oVar);
                ArrayList arrayList5 = new ArrayList(zhm.w.t(oVarA, 10));
                Object it14 = oVarA.iterator();
                while (((aim.i) it14).hasNext()) {
                    arrayList5.add(new yea.a((xi0.b) ((aim.j) it14).next()));
                }
                return zhm.d0.P0(cVar.i(str5, arrayList5), new q2j.v(cVar, 26));
            case 18:
                com.revolut.feature.pockets.impl.ui.add_new.c cVar2 = (com.revolut.feature.pockets.impl.ui.add_new.c) this.f311552c;
                AddNewPocketFlowContract$Step addNewPocketFlowContract$Step = (AddNewPocketFlowContract$Step) this.f311551b;
                ExchangeGlobalAccessOutput output3 = (ExchangeGlobalAccessOutput) obj2;
                Intrinsics.checkNotNullParameter(output3, "output");
                xi0.b bVar8 = ((AddNewPocketFlowContract$Step.McyFlowStep) addNewPocketFlowContract$Step).f80886a;
                if (output3 instanceof ExchangeGlobalAccessOutput.FeatureAvailable) {
                    cVar2.l2(new a1(cVar2, bVar8, null, 24), new yi5.b(26));
                }
                return Unit.f186387a;
            case 19:
                String str6 = (String) this.f311552c;
                FavouritesAssetDetails favouritesAssetDetails = (FavouritesAssetDetails) this.f311551b;
                od0.i fractionalDigitsOptional = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(fractionalDigitsOptional, "fractionalDigitsOptional");
                Integer num = (Integer) fractionalDigitsOptional.f224257a;
                if (str6 == null) {
                    iMax = 0;
                } else if (num != null) {
                    iMax = num.intValue();
                } else {
                    FavouritesAssetTypeKey favouritesAssetTypeKey = favouritesAssetDetails.d;
                    y1d.b.Companion.getClass();
                    if (Intrinsics.f(favouritesAssetTypeKey, y1d.a.e)) {
                        xi0.b.Companion.getClass();
                        iMax = cp5.d.p(xi0.a.a(str6));
                    } else {
                        xi0.a aVar7 = xi0.b.Companion;
                        String str7 = favouritesAssetDetails.f86863a;
                        aVar7.getClass();
                        iMax = Math.max(cp5.d.p(xi0.a.a(str7)), 10);
                    }
                }
                return Integer.valueOf(iMax);
            case 20:
                com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.b bVar9 = (com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.b) this.f311552c;
                String str8 = (String) this.f311551b;
                String baseCurrencyAssetId = (String) obj2;
                Intrinsics.checkNotNullParameter(baseCurrencyAssetId, "baseCurrencyAssetId");
                return Intrinsics.f(baseCurrencyAssetId, ((yed.o) bVar9.t2()).f312875b.f86863a) ? str8 : baseCurrencyAssetId;
            case 21:
                SharedFavouritesCounterpartChooserScreen sharedFavouritesCounterpartChooserScreen = (SharedFavouritesCounterpartChooserScreen) this.f311552c;
                com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.b bVar10 = (com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.b) this.f311551b;
                cgd.m output4 = (cgd.m) obj2;
                Intrinsics.checkNotNullParameter(output4, "output");
                if (!(output4 instanceof cgd.l)) {
                    throw new NoWhenBranchMatchedException();
                }
                sharedFavouritesCounterpartChooserScreen.k2(new y1a.a(bVar10, output4, 25));
                return Unit.f186387a;
            case 22:
                String str9 = (String) this.f311552c;
                yf1.y yVar2 = (yf1.y) this.f311551b;
                yf1.m update5 = (yf1.m) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                yf1.l kVar = (kotlin.text.d0.W(str9) || str9.length() == 0) ? yf1.j.f313121a : new yf1.k(str9);
                yVar2.getClass();
                if (kVar.getClass() == update5.f313124b.getClass()) {
                    return yf1.m.a(update5, null, kVar, null, null, null, null, 61);
                }
                if (kVar instanceof yf1.j) {
                    qf1.c cVar3 = update5.e;
                    pair = new Pair(cVar3, cVar3);
                } else {
                    if (!(kVar instanceof yf1.k)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    pair = new Pair(update5.d, null);
                }
                return yf1.m.a(update5, null, kVar, null, (qf1.c) pair.f186386b, (qf1.c) pair.f186385a, null, 37);
            case 23:
                yff.u uVar = (yff.u) this.f311552c;
                List list6 = (List) this.f311551b;
                yff.g updateState = (yff.g) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                TroubleshooterListScreenContract$InputData troubleshooterListScreenContract$InputData = uVar.f313358p;
                return yff.g.a(updateState, null, null, l7d.a.c(troubleshooterListScreenContract$InputData.f91892a, troubleshooterListScreenContract$InputData.f91894c, list6), 47);
            case 24:
                return yff.g.a((yff.g) obj2, (Data) this.f311552c, (yff.k) this.f311551b, null, 51);
            case 25:
                com.revolut.feature.pay_bills_taxes.impl.ui.screen.subform.a aVar8 = (com.revolut.feature.pay_bills_taxes.impl.ui.screen.subform.a) this.f311552c;
                BillFormFieldV2 billFormFieldV2 = (BillFormFieldV2) this.f311551b;
                jg9.n nVar = (jg9.n) obj2;
                if (nVar == null) {
                    return Unit.f186387a;
                }
                aVar8.N2(nVar.f173954a, ((AddressField) billFormFieldV2).f61352a);
                return Unit.f186387a;
            case 26:
                com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_gift_sending.a aVar9 = (com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_gift_sending.a) this.f311552c;
                PlanGiftSendingFlowContract$Step.BillingPicker billingPicker = (PlanGiftSendingFlowContract$Step.BillingPicker) this.f311551b;
                igk.c output5 = (igk.c) obj2;
                Intrinsics.checkNotNullParameter(output5, "output");
                if (output5 == null) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar9.C2(new igk.o(output5.f161239c, billingPicker.f103177a.f152287a, billingPicker.f103178b, output5.f161238b));
                return Unit.f186387a;
            case 27:
                yhl.b bVar11 = (yhl.b) this.f311552c;
                LocalDate localDate = (LocalDate) this.f311551b;
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                List list7 = (List) pair2.f186385a;
                Set set2 = (Set) pair2.f186386b;
                ArrayList arrayList6 = new ArrayList();
                for (Object obj4 : list7) {
                    if (obj4 instanceof iel.a) {
                        arrayList6.add(obj4);
                    }
                }
                ArrayList arrayList7 = new ArrayList();
                for (Object obj5 : arrayList6) {
                    iel.a aVar10 = (iel.a) obj5;
                    if (aVar10 instanceof iel.d) {
                        iel.d dVar4 = (iel.d) aVar10;
                        LocalDate localDate2 = dVar4.e;
                        LocalDate localDate3 = dVar4.f160776b;
                        if (localDate2 == null) {
                            localDate2 = localDate3;
                        }
                        LocalDate localDateMinusDays = localDate2.minusDays(7L);
                        Intrinsics.checkNotNullExpressionValue(localDateMinusDays, "minusDays(...)");
                        LocalDate localDatePlusDays = localDate3.plusDays(7L);
                        Intrinsics.checkNotNullExpressionValue(localDatePlusDays, "plusDays(...)");
                        eVarA = vim.i.b(localDateMinusDays, localDatePlusDays);
                    } else if (aVar10 instanceof iel.x) {
                        iel.x xVar = (iel.x) aVar10;
                        LocalDate localDate4 = xVar.e;
                        LocalDate localDate5 = xVar.f160824b;
                        if (localDate4 == null) {
                            localDate4 = localDate5;
                        }
                        LocalDate localDateMinusDays2 = localDate4.minusDays(7L);
                        Intrinsics.checkNotNullExpressionValue(localDateMinusDays2, "minusDays(...)");
                        LocalDate localDatePlusDays2 = localDate5.plusDays(7L);
                        Intrinsics.checkNotNullExpressionValue(localDatePlusDays2, "plusDays(...)");
                        eVarA = vim.i.b(localDateMinusDays2, localDatePlusDays2);
                    } else if (aVar10 instanceof iel.y) {
                        eVarA = yhl.b.a(((iel.y) aVar10).f160827b);
                    } else if (aVar10 instanceof iel.a0) {
                        eVarA = yhl.b.a(((iel.a0) aVar10).f160767b);
                    } else if (aVar10 instanceof iel.b) {
                        eVarA = yhl.b.a(((iel.b) aVar10).f160770b);
                    } else if (aVar10 instanceof iel.v) {
                        eVarA = yhl.b.a(((iel.v) aVar10).f160819b);
                    } else if (aVar10 instanceof iel.h) {
                        LocalDate localDate6 = ((iel.h) aVar10).f160784b;
                        LocalDate localDateMinusDays3 = localDate6.minusDays(7L);
                        Intrinsics.checkNotNullExpressionValue(localDateMinusDays3, "minusDays(...)");
                        eVarA = vim.i.b(localDateMinusDays3, localDate6);
                    } else if (aVar10 instanceof iel.o) {
                        iel.o oVar2 = (iel.o) aVar10;
                        eVarA = oVar2.e == iel.n.DELISTED ? yhl.b.a(oVar2.f160800b) : null;
                    } else if (aVar10 instanceof iel.r) {
                        iel.r rVar2 = (iel.r) aVar10;
                        if (!rVar2.e.isEmpty()) {
                            eVarA = yhl.b.a(rVar2.f160812b);
                        }
                    } else if (!(aVar10 instanceof iel.k) && !(aVar10 instanceof iel.c) && !(aVar10 instanceof iel.m) && !(aVar10 instanceof iel.g) && !(aVar10 instanceof iel.q)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (pd.b.j(eVarA != null ? Boolean.valueOf(eVarA.contains(localDate)) : null) && !set2.contains(aVar10.b())) {
                        arrayList7.add(obj5);
                    }
                }
                ArrayList arrayList8 = new ArrayList();
                for (Object obj6 : arrayList7) {
                    iel.a aVar11 = (iel.a) obj6;
                    if (((jte.d) bVar11.e).c(CorporateEventsApi$Toggles$InstrumentDetailsEarningsCallBanner.f105364c) || !(aVar11 instanceof iel.h)) {
                        arrayList8.add(obj6);
                    }
                }
                return arrayList8;
            case 28:
                rul.e eVar = (rul.e) this.f311552c;
                Integer num2 = (Integer) this.f311551b;
                ScreenerCollection collection = (ScreenerCollection) obj2;
                Intrinsics.checkNotNullParameter(collection, "collection");
                ugl.c cVar4 = (ugl.c) eVar.f257630b;
                ArrayList arrayList9 = collection.f105157g;
                List list8 = collection.i;
                ScreenerSelectedSorting screenerSelectedSorting = collection.f105159j;
                return ugl.c.a(cVar4, arrayList9, list8, screenerSelectedSorting != null ? screenerSelectedSorting.f105170a : null, screenerSelectedSorting != null ? screenerSelectedSorting.f105171b : null, num2, BERTags.FLAGS);
            default:
                com.revolut.feature.junior_payment_links.impl.ui.flow.card_profile.a aVar12 = (com.revolut.feature.junior_payment_links.impl.ui.flow.card_profile.a) this.f311552c;
                JuniorCardProfileFlowContract$Step.CustomAmountSetup customAmountSetup = (JuniorCardProfileFlowContract$Step.CustomAmountSetup) this.f311551b;
                ti8.b output6 = (ti8.b) obj2;
                Intrinsics.checkNotNullParameter(output6, "output");
                if (output6 == null) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar12.H2(aVar12.v, new yi8.f(output6, 0));
                aVar12.B2();
                if (!customAmountSetup.f77081a.a()) {
                    aVar12.f77089t.getClass();
                    aVar12.X1(new mii.k("DIALOG_ID_CUSTOM_LINK_UPDATED", new TextLocalisedClause(R$string.junior_payment_links_custom_amount_screen_shot_dialog_link_updated, null, null, 14), null, null, null, 28));
                }
                return Unit.f186387a;
        }
    }

    public /* synthetic */ g0(com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.a aVar, String str) {
        this.f311550a = 1;
        this.f311551b = aVar;
        this.f311552c = str;
    }

    public /* synthetic */ g0(Object obj2, Object obj3, int i) {
        this.f311550a = i;
        this.f311552c = obj2;
        this.f311551b = obj3;
    }
}
