package sdi;

import android.content.Context;
import androidx.room.util.DBUtil;
import com.revolut.camerakit.revolut.ui.barcode.BarcodeReaderFlowContract$OutputData;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.bills.core.api.model.BillFormField;
import com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.BizumTransferData;
import com.revolut.feature.insurance_embedded.impl.ui.flow.coverage_activation.InsuranceCoverageActivationFlowContract$Step;
import com.revolut.feature.payments.bills_chooser.api.navigation.LimitedCurrenciesConfig;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.flow.v2.a;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.review.IncomeSorterReviewContract$ModalStep;
import com.revolut.feature.tab.accounts.api.exceptions.ProductAccountNotFoundException;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.transfer_reasons.impl.flow.TransferReasonsFlowContract$State;
import com.revolut.feature.transfer_reasons.impl.flow.refund.TransferReasonsRefundFlowContract$State;
import com.revolut.feature.transfer_reasons.models.reason.TransferReasons;
import com.revolut.feature.wealth.ui.impl.transfer_picker.WealthTransferPickerControllerContract$State;
import com.revolut.feature.wealth.ui.impl.transfer_picker.WealthTransferPickerControllerContract$TransferAccount;
import com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketInfo;
import com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketState;
import com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketThreshold;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.core.navigation.feature.ByIdFeatureConfig;
import com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanAction;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_contextual_selection.PlanContextualSelectionFlowContract$Step;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.student_verification.StudentVerificationFlowContract$Step;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.student_verification.a;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import gu7.e1;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import javax.crypto.SecretKey;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.d0;
import rtl.y;
import sl3.r;
import sl3.u;
import snf.i0;
import snf.l0;
import tof.a3;
import tof.fc;
import tof.i7;
import tof.na;
import tof.z8;
import vkm.j2;
import wk2.w;
import yhm.m;
import ynk.e;
import yy3.x;
import zhm.f0;
import zhm.r0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f261913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f261914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f261915c;

    public /* synthetic */ k(com.revolut.feature.credit.card.impl.ui.repay_with_review.payment_review.a aVar, g1j.b bVar, BalanceWrapper.PocketBalanceWrapper pocketBalanceWrapper) {
        this.f261913a = 26;
        this.f261914b = bVar;
        this.f261915c = pocketBalanceWrapper;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Data data;
        Data content;
        su4.h hVarL2;
        dj0.d dVar;
        int i = this.f261913a;
        int i2 = 26;
        boolean z = false;
        int i3 = 1;
        Object obj3 = this.f261915c;
        Object obj4 = this.f261914b;
        switch (i) {
            case 0:
                q qVar = (q) obj4;
                ProductAccountId productAccountId = (ProductAccountId) obj3;
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                RevPointsPocketState revPointsPocketState = (RevPointsPocketState) pair.f186385a;
                List list = (List) pair.f186386b;
                if (revPointsPocketState instanceof RevPointsPocketState.Active) {
                    tdi.g gVar = qVar.f261927b;
                    RevPointsPocketInfo revPointsPocketInfo = ((RevPointsPocketState.Active) revPointsPocketState).f97790b;
                    return gVar.a(revPointsPocketInfo, hx7.q.t(revPointsPocketInfo, list));
                }
                if (!(revPointsPocketState instanceof RevPointsPocketState.Inactive)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (!Intrinsics.f(productAccountId.f89729a, "POINTS_POCKET_DISCOVER_ITEM_ID")) {
                    throw new ProductAccountNotFoundException("Points Pocket is inactive");
                }
                RevPointsPocketThreshold revPointsPocketThresholdB = hx7.q.B(list);
                if (revPointsPocketThresholdB != null) {
                    return tdi.e.b(revPointsPocketThresholdB);
                }
                throw new ProductAccountNotFoundException("Points Pocket has no thresholds");
            case 1:
                qe4.c cVar = (qe4.c) obj4;
                LocalDateTime localDateTime = (LocalDateTime) obj3;
                String str = cVar.f245058a;
                String str2 = cVar.f245059b;
                LocalDateTime localDateTimePlusSeconds = localDateTime.plusSeconds(cVar.f245060c);
                Intrinsics.checkNotNullExpressionValue(localDateTimePlusSeconds, "plusSeconds(...)");
                return se4.e.a((se4.e) obj2, str, str2, localDateTimePlusSeconds, null, x.STARTED, localDateTime, 8);
            case 2:
                sf9.g gVar2 = (sf9.g) obj4;
                InputTextDelegate.Model model = (InputTextDelegate.Model) obj3;
                BarcodeReaderFlowContract$OutputData output = (BarcodeReaderFlowContract$OutputData) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (output instanceof BarcodeReaderFlowContract$OutputData.Success) {
                    Object obj5 = model.P;
                    BillFormField billFormField = obj5 instanceof BillFormField ? (BillFormField) obj5 : null;
                    String str3 = billFormField != null ? billFormField.f61274a : null;
                    if (str3 == null) {
                        str3 = "";
                    }
                    String str4 = ((BarcodeReaderFlowContract$OutputData.Success) output).f50756a.f51390a;
                    gVar2.p3(str3, str4 != null ? str4 : "");
                }
                return Unit.f186387a;
            case 3:
                sgd.f fVar = (sgd.f) obj3;
                sgd.c update = (sgd.c) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                String nameInput = ((CharSequence) obj4).toString();
                if (!d0.W(nameInput) && !Intrinsics.f(nameInput, fVar.o.f262645b.f86896b)) {
                    z = true;
                }
                update.getClass();
                Intrinsics.checkNotNullParameter(nameInput, "nameInput");
                return new sgd.c(nameInput, z);
            case 4:
                com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_contextual_selection.a aVar = (com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_contextual_selection.a) obj4;
                yki.l lVar = (yki.l) obj3;
                vlk.p result = (vlk.p) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof vlk.o) {
                    oki.h.D2(lVar);
                } else {
                    if (!(result instanceof vlk.n)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    PricingPlanAction pricingPlanAction = ((vlk.n) result).f290490a;
                    com.revolut.retail.feature.pricing_plans.ui.impl.flow.action.b bVar = aVar.f103151p;
                    yki.a aVar2 = aVar.f103152q;
                    if ((pricingPlanAction instanceof PricingPlanAction.Dismiss) || (pricingPlanAction instanceof PricingPlanAction.Decline)) {
                        oki.h.D2(aVar2);
                    } else if (pricingPlanAction instanceof PricingPlanAction.OpenUrl) {
                        PricingPlanAction.OpenUrl action = (PricingPlanAction.OpenUrl) pricingPlanAction;
                        bVar.getClass();
                        Intrinsics.checkNotNullParameter(action, "action");
                        bVar.T2(new rgk.n(bVar, action, null), new yi5.b(27));
                    } else {
                        boolean z3 = pricingPlanAction instanceof PricingPlanAction.OpenBillingPicker;
                        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
                        if (z3) {
                            PricingPlanAction.OpenBillingPicker openBillingPicker = (PricingPlanAction.OpenBillingPicker) pricingPlanAction;
                            oki.h.w2(aVar2, new PlanContextualSelectionFlowContract$Step.BillingPicker(openBillingPicker.f102803b, openBillingPicker.f102802a, openBillingPicker.f102804c, openBillingPicker.d), bottom_dialog);
                        } else if (pricingPlanAction instanceof PricingPlanAction.SeeAllBenefits) {
                            oki.h.w2(aVar2, new PlanContextualSelectionFlowContract$Step.PlanBenefits(((PricingPlanAction.SeeAllBenefits) pricingPlanAction).f102806a), ModalDestination.Style.POPUP.f98311a);
                        } else if (pricingPlanAction instanceof PricingPlanAction.Upgrade) {
                            bVar.d3((PricingPlanAction.Upgrade) pricingPlanAction, new shk.c(aVar, 2));
                        } else if (pricingPlanAction instanceof PricingPlanAction.ApplyDiscount) {
                            bVar.b3((PricingPlanAction.ApplyDiscount) pricingPlanAction, new y(aVar, 29));
                        } else if (pricingPlanAction instanceof PricingPlanAction.SeeAllDocuments) {
                            oki.h.w2(aVar2, new PlanContextualSelectionFlowContract$Step.PlanDocuments(((PricingPlanAction.SeeAllDocuments) pricingPlanAction).f102807a), bottom_dialog);
                        } else if (pricingPlanAction instanceof PricingPlanAction.FlowSpecific) {
                            rgk.q.a((PricingPlanAction.FlowSpecific) pricingPlanAction, "PlanContextualSelectionFlowModel");
                        } else {
                            if (!(pricingPlanAction instanceof PricingPlanAction.Unsupported)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            rgk.q.b((PricingPlanAction.Unsupported) pricingPlanAction, "PlanContextualSelectionFlowModel");
                        }
                    }
                }
                return Unit.f186387a;
            case 5:
                ((com.revolut.kompot.common.flow.permissions.c) obj4).G2((com.revolut.kompot.common.flow.permissions.a) obj3);
                return Unit.f186387a;
            case 6:
                com.revolut.retail.feature.pricing_plans.ui.impl.flows.student_verification.g gVar3 = (com.revolut.retail.feature.pricing_plans.ui.impl.flows.student_verification.g) obj4;
                yki.i iVar = gVar3.f103298x;
                StudentVerificationFlowContract$Step.StudentStatus studentStatus = (StudentVerificationFlowContract$Step.StudentStatus) obj3;
                ynk.e output2 = (ynk.e) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                if (output2 instanceof e.c) {
                    oki.h.u2(gVar3, iVar, new StudentVerificationFlowContract$Step.EmailValidation(studentStatus.f103286b, 4), null, 6);
                } else if (output2 instanceof e.b) {
                    oki.h.w2(iVar, StudentVerificationFlowContract$Step.GraduateStudent.f103281a, ModalDestination.Style.FULLSCREEN_IMMEDIATE.f98308a);
                } else {
                    if (!Intrinsics.f(output2, e.a.f315497a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    gVar3.C2(a.C0635a.f103287a);
                }
                return Unit.f186387a;
            case 7:
                w wVar = (w) obj4;
                w wVar2 = (w) obj3;
                r7a.i permissionFlowOutput = (r7a.i) obj2;
                Intrinsics.checkNotNullParameter(permissionFlowOutput, "permissionFlowOutput");
                if (permissionFlowOutput instanceof r7a.h) {
                    wVar.invoke();
                } else if ((permissionFlowOutput instanceof r7a.e) || (permissionFlowOutput instanceof r7a.f)) {
                    wVar2.invoke();
                } else {
                    if (!(permissionFlowOutput instanceof r7a.g)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    try {
                        m.Companion companion = yhm.m.INSTANCE;
                        throw new IllegalStateException("Unhandled secondary click");
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Throwable th10) {
                        m.Companion companion2 = yhm.m.INSTANCE;
                        Throwable thA = yhm.m.a(yhm.o.a(th10));
                        if (thA != null) {
                            hx7.e.n(thA);
                        }
                    }
                }
                return Unit.f186387a;
            case 8:
                ml3.o remoteContact = (ml3.o) obj2;
                Intrinsics.checkNotNullParameter(remoteContact, "remoteContact");
                efm.k kVarC = ((u) obj4).f264133b.c((String) obj3);
                r rVar = new r(new scl.e(remoteContact, 29), 8);
                kVarC.getClass();
                return new rfm.m(kVarC, rVar, 1).e(pyd.c.e0(remoteContact, null));
            case 9:
                com.revolut.feature.profile.impl.ui.details.email.c cVar2 = (com.revolut.feature.profile.impl.ui.details.email.c) obj4;
                String str5 = (String) obj3;
                tma.h output3 = (tma.h) obj2;
                Intrinsics.checkNotNullParameter(output3, "output");
                if (output3 instanceof tma.g) {
                    cVar2.l2(new sma.f(cVar2, "CHECK_INBOX_SCREEN_SECONDARY_BUTTON_TAG", str5, (Continuation) null, 0), new rnb.u(1, cVar2, com.revolut.feature.profile.impl.ui.details.email.c.class, "handleError", "handleError(Ljava/lang/Throwable;)Z", 0, 28));
                } else {
                    if (!Intrinsics.f(output3, tma.f.f272172a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cVar2.B2();
                }
                return Unit.f186387a;
            case 10:
                l0 l0Var = (l0) obj4;
                a3 a3Var = (a3) obj3;
                i0 accountsDataSources = (i0) obj2;
                Intrinsics.checkNotNullParameter(accountsDataSources, "accountsDataSources");
                efm.r map = te0.w.l(l0Var.a(1, a3Var, accountsDataSources), l0Var.a(2, a3Var, accountsDataSources)).map(new r(new sl3.i(23), 22));
                Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                return map;
            case 11:
                WealthTransferPickerControllerContract$TransferAccount.TaxAdvantageAccount taxAdvantageAccount = (WealthTransferPickerControllerContract$TransferAccount.TaxAdvantageAccount) obj4;
                snh.e update2 = (snh.e) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return snh.e.a(update2, new WealthTransferPickerControllerContract$State.CashHoldingChooser((List) obj3, taxAdvantageAccount.f96080a, taxAdvantageAccount.f96082c));
            case 12:
                WealthTransferPickerControllerContract$TransferAccount.Securities securities = (WealthTransferPickerControllerContract$TransferAccount.Securities) obj4;
                snh.e update3 = (snh.e) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return snh.e.a(update3, new WealthTransferPickerControllerContract$State.CashHoldingChooser((List) obj3, securities.f96077a, securities.f96079c));
            case 13:
                sp5.c cVar3 = (sp5.c) obj4;
                cVar3.f264882g.a(xq5.c.SECURITY_CHECKS);
                cVar3.f264881c.c0(new ym.b((qp5.b) obj3, true));
                return Unit.f186387a;
            case 14:
                ((sp5.j) obj4).f264896h.c0(new ym.b((qp5.d) obj3, true));
                return Unit.f186387a;
            case 15:
                List preloadedTransactions = (List) obj2;
                Intrinsics.checkNotNullParameter(preloadedTransactions, "preloadedTransactions");
                return com.revolut.domain.interactors.transactions.a.d(((sp9.b) obj4).f264909c, (i7) obj3, null, null, null, null, 30).startWith(zi0.c.P(preloadedTransactions, false, null, 3));
            case 16:
                sp9.b bVar2 = (sp9.b) obj4;
                String str6 = (String) obj3;
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                k71.q qVar2 = (k71.q) pair2.f186385a;
                Data data2 = (Data) pair2.f186386b;
                Collection collection = (List) data2.getContent();
                if (collection == null) {
                    collection = f0.f322471a;
                }
                bVar2.getClass();
                if (str6 != null && !d0.W(str6)) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj6 : collection) {
                        a3 a3Var2 = (a3) obj6;
                        String str7 = a3Var2.A.f272779a.d;
                        boolean zJ = pd.b.j(str7 != null ? Boolean.valueOf(jli.g.h(str7, str6)) : null);
                        String str8 = a3Var2.f272614t;
                        boolean zJ2 = pd.b.j(str8 != null ? Boolean.valueOf(jli.g.h(str8, str6)) : null);
                        String str9 = a3Var2.f272609r;
                        boolean zJ3 = pd.b.j(str9 != null ? Boolean.valueOf(jli.g.h(str9, str6)) : null);
                        if (zJ || zJ2 || zJ3) {
                            arrayList.add(obj6);
                        }
                    }
                    collection = arrayList;
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj7 : collection) {
                    if (((a3) obj7).M1) {
                        arrayList2.add(obj7);
                    }
                }
                return new Data(new sp9.c(arrayList2, qVar2), data2.getError(), data2.getLoading());
            case 17:
                sp9.b bVar3 = (sp9.b) obj4;
                LimitedCurrenciesConfig limitedCurrenciesConfig = (LimitedCurrenciesConfig) obj3;
                Pair pair3 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair3, "<destruct>");
                Set setH1 = (Set) pair3.f186385a;
                Map map2 = (Map) pair3.f186386b;
                bVar3.getClass();
                if (limitedCurrenciesConfig instanceof LimitedCurrenciesConfig.AllowOnlyForCountries) {
                    Set set = ((LimitedCurrenciesConfig.AllowOnlyForCountries) limitedCurrenciesConfig).f79192a;
                    if (!set.isEmpty() && !map2.isEmpty()) {
                        setH1 = zhm.d0.h1(setH1);
                        for (Map.Entry entry : map2.entrySet()) {
                            xi0.b bVar4 = (xi0.b) entry.getKey();
                            if (((Set) entry.getValue()).containsAll(set)) {
                                setH1.remove(bVar4);
                            } else {
                                setH1.add(bVar4);
                            }
                        }
                    }
                } else if (!Intrinsics.f(limitedCurrenciesConfig, LimitedCurrenciesConfig.DisallowAll.f79193a)) {
                    throw new NoWhenBranchMatchedException();
                }
                i7 i7VarA = fc.a(sp9.b.f, new na(new z8(setH1)));
                return new sfm.b(com.revolut.domain.interactors.transactions.a.b(bVar3.f264909c, i7VarA, null, 100, null, null, 26), new sp5.h(i3, new k(bVar3, i7VarA, 15)), 2);
            case 18:
                com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.review.i iVar2 = (com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.review.i) obj4;
                IncomeSorterReviewContract$ModalStep.ExecuteSorter executeSorter = (IncomeSorterReviewContract$ModalStep.ExecuteSorter) obj3;
                dii.g it8 = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                if (!(it8 instanceof dii.b) && !(it8 instanceof dii.c) && !(it8 instanceof dii.d)) {
                    if (it8 instanceof dii.e) {
                        iVar2.l2(new s56.d0(iVar2, executeSorter.f87844c, executeSorter.f87842a, executeSorter.f87843b, Boolean.TRUE, (Continuation) null, 3), new yi5.b(i2));
                    } else {
                        if (!(it8 instanceof dii.f)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        iVar2.l2(new s56.d0(iVar2, executeSorter.f87844c, executeSorter.f87842a, executeSorter.f87843b, Boolean.FALSE, (Continuation) null, 3), new yi5.b(i2));
                    }
                }
                return Unit.f186387a;
            case 19:
                com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.review.i iVar3 = (com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.review.i) obj4;
                wi0.b bVar5 = (wi0.b) obj3;
                dii.g result2 = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                if (result2 instanceof dii.c) {
                    String str10 = ((dii.c) result2).f115066a.f275445a;
                    if (Intrinsics.f(str10, "CRYPTO_LEARN_MORE_INSURANCE_LINK_ID")) {
                        iVar3.C1(new ExternalDestination.Browser("https://www.revolut.com/en-LT/legal/deposit-insurance-information/?geo-redirect=true", null));
                    } else {
                        Continuation continuation = null;
                        if (Intrinsics.f(str10, "CRYPTO_LEARN_MORE_TERMS_LINK_ID")) {
                            iVar3.n2(new sbb.w(iVar3, bVar5, continuation, 22), new whi.b(6));
                        }
                    }
                }
                return Unit.f186387a;
            case 20:
                com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.review.i iVar4 = (com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.review.i) obj4;
                IncomeSorterReviewContract$ModalStep.ActiveSorterConflict activeSorterConflict = (IncomeSorterReviewContract$ModalStep.ActiveSorterConflict) obj3;
                dii.g result3 = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(result3, "result");
                if (result3 instanceof dii.e) {
                    iVar4.l2(new com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.review.d(iVar4, activeSorterConflict, null), new yi5.b(i2));
                } else if (result3 instanceof dii.f) {
                    iVar4.l1().M0(a.e.f87814b);
                }
                return Unit.f186387a;
            case 21:
                com.revolut.retail.core.navigation.b bVar6 = (com.revolut.retail.core.navigation.b) obj4;
                ByIdFeatureConfig byIdFeatureConfig = (ByIdFeatureConfig) obj3;
                uri.a launcher = (uri.a) obj2;
                Intrinsics.checkNotNullParameter(launcher, "launcher");
                Context context = (Context) bVar6.f98676j.get();
                if (context != null) {
                    launcher.a(bVar6, context, byIdFeatureConfig);
                }
                return Unit.f186387a;
            case 22:
                ss4.k kVar = (ss4.k) obj3;
                dj0.d dVar2 = (dj0.d) obj2;
                ss4.i iVar5 = (ss4.i) ((ss4.l) ((j2) ((ss4.y) obj4).f265309t.f22677a).getValue()).f265284a.getContent();
                dj0.d dVar3 = iVar5 != null ? iVar5.f265278a : null;
                if (dVar3 == null) {
                    dVar3 = new dj0.d(0L, dVar2.f115083b);
                }
                return new ss4.i(dVar3, dVar2, kVar, (iVar5 == null || (data = iVar5.d) == null) ? new Data(null, null, false, 7, null) : data, iVar5 != null ? iVar5.e : null);
            case 23:
                del.b portfolioBalance = (del.b) obj2;
                Intrinsics.checkNotNullParameter(portfolioBalance, "portfolioBalance");
                return new tsd.g((TradingAccount.TaxAdvantage.JIsa) obj4, portfolioBalance.e.size(), mif.a.Q(portfolioBalance.f113708a), (TradingLegalEntityInformation) obj3);
            case 24:
                TransferReasonsFlowContract$State transferReasonsFlowContract$State = (TransferReasonsFlowContract$State) obj3;
                return new TransferReasonsRefundFlowContract$State((TransferReasons) obj4, transferReasonsFlowContract$State.f92332a, transferReasonsFlowContract$State.f92333b, transferReasonsFlowContract$State.f92334c, 48);
            case 25:
                od0.i it9 = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return ((st1.f) obj4).f265445s.validate(new l1l.r((hrf.i) it9.g(), ((BizumTransferData) obj3).f61631a.d())).f316033b;
            case 26:
                g1j.b bVar7 = (g1j.b) obj4;
                BalanceWrapper.PocketBalanceWrapper pocketBalanceWrapper = (BalanceWrapper.PocketBalanceWrapper) obj3;
                su4.i update4 = (su4.i) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                Data data3 = update4.f265649a;
                try {
                    Object content2 = data3.getContent();
                    if (content2 != null) {
                        su4.h hVar = (su4.h) content2;
                        j1j.d dVar4 = bVar7.f139686a;
                        if (pocketBalanceWrapper != null) {
                            Long l2 = pocketBalanceWrapper.f99405b;
                            dVar = new dj0.d(l2 != null ? l2.longValue() : 0L, pocketBalanceWrapper.f99406c);
                        } else {
                            dVar = null;
                        }
                        hVarL2 = com.revolut.feature.credit.card.impl.ui.repay_with_review.payment_review.a.L2(su4.h.a(hVar, dVar4, dVar, false, false, null, null, 7155));
                    } else {
                        hVarL2 = null;
                    }
                    content = new Data(hVarL2, data3.getError(), data3.getLoading());
                    break;
                } catch (Throwable th11) {
                    content = new Data(null, th11, data3.getLoading());
                }
                Intrinsics.checkNotNullParameter(content, "content");
                return new su4.i(content);
            case 27:
                com.revolut.feature.insurance_embedded.impl.ui.flow.coverage_activation.a aVar3 = (com.revolut.feature.insurance_embedded.impl.ui.flow.coverage_activation.a) obj4;
                yki.l lVar2 = (yki.l) obj3;
                yu7.h output4 = (yu7.h) obj2;
                Intrinsics.checkNotNullParameter(output4, "output");
                if (!(output4 instanceof yu7.g)) {
                    throw new NoWhenBranchMatchedException();
                }
                oki.h.t2(aVar3, lVar2, InsuranceCoverageActivationFlowContract$Step.EligibleCards.f76057a, true, null, false, 12);
                return Unit.f186387a;
            case 28:
                sv7.c cVar4 = (sv7.c) obj4;
                String str11 = ((e1) obj3).f146736b;
                if (((dii.g) obj2) instanceof dii.e) {
                    cVar4.A2(nu7.a.b(str11));
                }
                return Unit.f186387a;
            default:
                sv9.a aVar4 = (sv9.a) obj4;
                List list2 = (List) obj3;
                Pair pair4 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair4, "<destruct>");
                KeyPair keyPair = (KeyPair) pair4.f186385a;
                String str12 = ((do3.n) pair4.f186386b).f116414l;
                if (str12 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                gv9.j jVar = (gv9.j) aVar4.f265852b;
                List<iv9.a> list3 = (List) DBUtil.performBlocking(jVar.f147114a, true, false, new gmk.j(jVar, 25));
                qv9.a aVar5 = aVar4.f265853c;
                cv9.a aVar6 = aVar4.f265851a;
                LinkedList linkedList = new LinkedList(list2);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (iv9.a aVar7 : list3) {
                    String strQ = pyd.c.q(aVar7);
                    if (!linkedHashMap.containsKey(strQ)) {
                        String str13 = aVar7.d;
                        if (str13 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        linkedHashMap.put(strQ, ((pv9.d) aVar6).a(str13, aVar7.f168778b, pyd.c.n(aVar7)));
                    }
                }
                LinkedHashMap linkedHashMapZ = r0.z(linkedHashMap);
                ListIterator listIterator = linkedList.listIterator();
                Intrinsics.checkNotNullExpressionValue(listIterator, "listIterator(...)");
                while (listIterator.hasNext()) {
                    kv9.h hVar2 = (kv9.h) listIterator.next();
                    if (hVar2.getType() == kv9.j.KEY) {
                        String strO = pyd.c.o(hVar2);
                        if (str12.equals(hVar2.getSender().getCode()) || Intrinsics.f(strO, str12)) {
                            String strS = pyd.c.s(hVar2);
                            String media = hVar2.getMedia();
                            if (media == null) {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            linkedHashMapZ.put(strS, ((pv9.d) aVar6).a(media, hVar2.getSender().getCode(), pyd.c.o(hVar2)));
                        } else {
                            listIterator.remove();
                        }
                    } else {
                        kv9.j type = hVar2.getType();
                        kv9.j jVar2 = kv9.j.TEXT;
                        if (type == jVar2 && hVar2.getRecipient().getCode() != null) {
                            dv9.q qVar3 = (dv9.q) linkedHashMapZ.get(pyd.c.s(hVar2));
                            if (qVar3 == null || !(qVar3 instanceof dv9.o)) {
                                listIterator.remove();
                            } else {
                                try {
                                    String media2 = hVar2.getMedia();
                                    if (media2 == null) {
                                        media2 = "";
                                    }
                                    byte[] bArrA = aVar5.a(media2);
                                    PublicKey publicKey = ((dv9.o) qVar3).f118078b;
                                    PrivateKey privateKey = keyPair.getPrivate();
                                    Intrinsics.checkNotNullExpressionValue(privateKey, "getPrivate(...)");
                                    listIterator.set(kv9.h.a(hVar2, a0.u(((pv9.d) aVar6).d(bArrA, publicKey, privateKey, pyd.c.s(hVar2)))));
                                } catch (Exception unused) {
                                    listIterator.remove();
                                }
                            }
                        } else if (hVar2.getType() == jVar2 && hVar2.getRecipient().getGroupId() != null) {
                            dv9.q qVar4 = (dv9.q) linkedHashMapZ.get(pyd.c.s(hVar2));
                            dv9.p pVar = qVar4 instanceof dv9.p ? (dv9.p) qVar4 : null;
                            SecretKey symmetricKey = pVar != null ? pVar.f118079a : null;
                            if (symmetricKey == null) {
                                listIterator.remove();
                            } else {
                                try {
                                    String media3 = hVar2.getMedia();
                                    if (media3 == null) {
                                        media3 = "";
                                    }
                                    byte[] plainText = aVar5.a(media3);
                                    pv9.d dVar5 = (pv9.d) aVar6;
                                    dVar5.getClass();
                                    Intrinsics.checkNotNullParameter(plainText, "plainText");
                                    Intrinsics.checkNotNullParameter(symmetricKey, "symmetricKey");
                                    listIterator.set(kv9.h.a(hVar2, a0.u(dVar5.f240018a.a(plainText, symmetricKey))));
                                } catch (Exception unused2) {
                                    listIterator.remove();
                                }
                            }
                        }
                    }
                }
                return linkedList;
        }
    }

    public /* synthetic */ k(Object obj2, Object obj3, int i) {
        this.f261913a = i;
        this.f261914b = obj2;
        this.f261915c = obj3;
    }

    public /* synthetic */ k(w wVar, w wVar2, sk2.a aVar) {
        this.f261913a = 7;
        this.f261914b = wVar;
        this.f261915c = wVar2;
    }
}
