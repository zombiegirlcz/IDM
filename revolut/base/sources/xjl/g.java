package xjl;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.widgets.z4;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.application.impl.repositories.CreditLimitIncreaseApplicationRepositoryImpl$CreditLimitIncreasePreferenceCacheKey$storageCacheType$1;
import com.revolut.feature.credit.card.impl.ui.description.CreditCardDescriptionScreen;
import com.revolut.feature.credit.card.impl.ui.description.CreditCardDescriptionScreenContract$InputData;
import com.revolut.feature.identity.auth.domain.model.RegisteredIdentityId;
import com.revolut.feature.insurance.impl.ui.cfac.my_claims.expense_details.CFACClaimExpenseDetailsScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.policy.telematic_device.unplugged.TelematicsDeviceUnpluggedScreen;
import com.revolut.feature.pay_with_smile.impl.ui.consent.PayWithSmileConsentScreen;
import com.revolut.feature.retail.savings.api.challenge.model.SavingsChallenge;
import com.revolut.feature.retail.savings.api.documents.navigation.SavingsDocumentLauncherDestination;
import com.revolut.feature.retail.savings.api.documents.navigation.SavingsProductDocumentsDestination;
import com.revolut.feature.retail.savings.api.navigation.feature_config.SavingsKompotFeatureConfig$NextInterestPaymentDialogScreen$InputData;
import com.revolut.feature.retail.savings.impl.common.product_info.InterestAndTaxParcel;
import com.revolut.feature.retail.savings.impl.ui.common.dialogs.next_interest_payment.NextInterestPaymentDialogScreen;
import com.revolut.feature.retail.savings.impl.ui.details.SavingsDetailsScreen;
import com.revolut.feature.retail.savings.impl.ui.details.SavingsDetailsScreenContract$Step;
import com.revolut.feature.retail.savings.impl.ui.fund_information.FundInfoController;
import com.revolut.feature.retail.savings.impl.ui.fund_information.FundInfoControllerContract$InputData;
import com.revolut.feature.retail.savings.impl.ui.info.interest_fees.InterestAndFeesScreen;
import com.revolut.feature.retail.savings.impl.ui.info.interest_fees.InterestAndFeesScreenContract$InputData;
import com.revolut.feature.retail.savings.impl.ui.info.protection.ProtectionAndSafetyScreen;
import com.revolut.feature.retail.savings.impl.ui.info.protection.ProtectionAndSafetyScreenContract$InputData;
import com.revolut.feature.security_hub.impl.ui.linked_wallets.tab.common_linked_wallets_tab.CommonLinkedWalletsTabScreen;
import com.revolut.feature.shared.help_centre.api.faq.SharedFaqDestination;
import com.revolut.feature.shared.savings.models.product.SavingsDocument;
import com.revolut.feature.shared.savings.models.product.SavingsProduct;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import com.revolut.feature.spending_analytics.impl.ui.budget.setup_budget.SetupBudgetController;
import com.revolut.feature.statements.api.navigation.SavingsAccountsStatementFeatureConfig$SavingsAccountInfo;
import com.revolut.feature.tax_residency.api.exemption.TaxExemptionDestination$TaxExemption;
import com.revolut.feature.wealth.account_closure.impl.ui.screens.review_closure_conditions.ReviewClosureConditionsBottomSheetController;
import com.revolut.feature.widgets.impl.ui.screen.customisation.WidgetCarouselScreen;
import com.revolut.feature_document_view.declaration.DocumentViewFeatureConfiguration;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.screen.BaseScreen;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.adjust_analytics.impl.ui.AdjustAnalyticsController;
import com.revolut.retail.feature.api.AnalyticsAccount;
import com.revolut.retail.feature.api.AnalyticsAccountsSelection;
import com.revolut.retail.feature.esim.api.model.EsimGiftRecipient;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingServiceProvider;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.dynamic_form.number_transfer_confirmation.EsimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.dynamic_form.number_transfer_confirmation.EsimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$ModalStep;
import dfj.v0;
import dfj.x0;
import ft3.d1;
import java.io.File;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import m9d.w0;
import nii.n1;
import rp0.y;
import vkm.j2;
import wim.z;
import xec.c0;
import xmd.s0;
import xnd.a0;
import xr3.w;
import zhm.d0;
import zhm.f0;
import zhm.r0;
import zhm.v;

/* JADX INFO: loaded from: classes12.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f306556w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
        this.f306556w = obj3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g((h) this.v, (xil.m) this.f306556w, continuation, 0);
            case 1:
                g gVar = new g((u) this.f306556w, continuation, 1);
                gVar.v = ((RegisteredIdentityId) obj2).f74764a;
                return gVar;
            case 2:
                g gVar2 = new g((CFACClaimExpenseDetailsScreen) this.f306556w, continuation, 2);
                gVar2.v = obj2;
                return gVar2;
            case 3:
                g gVar3 = new g((com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.dynamic_form.number_transfer_confirmation.b) this.f306556w, continuation, 3);
                gVar3.v = obj2;
                return gVar3;
            case 4:
                g gVar4 = new g((com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_benefits_to_lose.a) this.f306556w, continuation, 4);
                gVar4.v = obj2;
                return gVar4;
            case 5:
                g gVar5 = new g((PayWithSmileConsentScreen) this.f306556w, continuation, 5);
                gVar5.v = obj2;
                return gVar5;
            case 6:
                g gVar6 = new g((xlj.g) this.f306556w, continuation, 6);
                gVar6.v = obj2;
                return gVar6;
            case 7:
                g gVar7 = new g((SetupBudgetController) this.f306556w, continuation, 7);
                gVar7.v = obj2;
                return gVar7;
            case 8:
                g gVar8 = new g(continuation, (AnalyticsAccountsSelection) this.f306556w, 8);
                gVar8.v = obj2;
                return gVar8;
            case 9:
                g gVar9 = new g((a0) this.f306556w, continuation, 9);
                gVar9.v = obj2;
                return gVar9;
            case 10:
                g gVar10 = new g((com.revolut.feature.user_declarations.shared.flows.income.screen.b) this.f306556w, continuation, 10);
                gVar10.v = obj2;
                return gVar10;
            case 11:
                g gVar11 = new g((SavingsDetailsScreen) this.f306556w, continuation, 11);
                gVar11.v = obj2;
                return gVar11;
            case 12:
                g gVar12 = new g(continuation, (pcd.s) this.f306556w, 12);
                gVar12.v = obj2;
                return gVar12;
            case 13:
                g gVar13 = new g((xp8.l) this.f306556w, continuation, 13);
                gVar13.v = obj2;
                return gVar13;
            case 14:
                g gVar14 = new g((CreditCardDescriptionScreen) this.f306556w, continuation, 14);
                gVar14.v = obj2;
                return gVar14;
            case 15:
                g gVar15 = new g((TelematicsDeviceUnpluggedScreen) this.f306556w, continuation, 15);
                gVar15.v = obj2;
                return gVar15;
            case 16:
                g gVar16 = new g((xq7.g) this.f306556w, continuation, 16);
                gVar16.v = obj2;
                return gVar16;
            case 17:
                g gVar17 = new g((xqd.f) this.f306556w, continuation, 17);
                gVar17.v = obj2;
                return gVar17;
            case 18:
                g gVar18 = new g((xr3.u) this.f306556w, continuation, 18);
                gVar18.v = obj2;
                return gVar18;
            case 19:
                g gVar19 = new g((w) this.f306556w, continuation, 19);
                gVar19.v = obj2;
                return gVar19;
            case 20:
                return new g((xrg.d) this.v, (File) this.f306556w, continuation, 20);
            case 21:
                g gVar20 = new g((com.revolut.feature.credit.card.impl.ui.instalment.repay.details.c) this.f306556w, continuation, 21);
                gVar20.v = obj2;
                return gVar20;
            case 22:
                g gVar21 = new g((WidgetCarouselScreen) this.f306556w, continuation, 22);
                gVar21.v = obj2;
                return gVar21;
            case 23:
                g gVar22 = new g((AdjustAnalyticsController) this.f306556w, continuation, 23);
                gVar22.v = obj2;
                return gVar22;
            case 24:
                g gVar23 = new g((xsi.p) this.f306556w, continuation, 24);
                gVar23.v = obj2;
                return gVar23;
            case 25:
                g gVar24 = new g((cc7.l) this.f306556w, continuation, 25);
                gVar24.v = obj2;
                return gVar24;
            case 26:
                g gVar25 = new g((xti.j) this.f306556w, continuation, 26);
                gVar25.v = obj2;
                return gVar25;
            case 27:
                return new g((com.revolut.feature.rev_points.buying.impl.ui.flow.a) this.v, (bvb.f) this.f306556w, continuation, 27);
            case 28:
                g gVar26 = new g((CommonLinkedWalletsTabScreen) this.f306556w, continuation, 28);
                gVar26.v = obj2;
                return gVar26;
            default:
                g gVar27 = new g((ReviewClosureConditionsBottomSheetController) this.f306556w, continuation, 29);
                gVar27.v = obj2;
                return gVar27;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((g) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((g) create(new RegisteredIdentityId(((RegisteredIdentityId) obj2).f74764a), (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((g) create((File) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((g) create((x0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((g) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((g) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((g) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((g) create((CharSequence) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((g) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((g) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((g) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((g) create(obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((g) create((yhm.r) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((g) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((g) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((g) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((g) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((g) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((g) create((xr3.t) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((g) create((d1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((g) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((g) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((g) create((z4) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((g) create((CharSequence) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((g) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((g) create((bua.f) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((g) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((g) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((g) create((vuc.e) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((g) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v122, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v68, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v73, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v89, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String strA;
        Pair pair;
        Flow flowA;
        ncd.a aVar;
        SavingsProductData savingsProductData;
        SavingsProduct savingsProduct;
        long j2;
        xsi.a aVarA;
        int i = this.u;
        int i2 = 21;
        int i3 = 14;
        int i5 = 16;
        int i6 = 3;
        int i21 = 26;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        int i22 = 2;
        final int i32 = 1;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        Object[] objArr8 = 0;
        Object[] objArr9 = 0;
        Object obj3 = this.f306556w;
        switch (i) {
            case 0:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h hVar = (h) this.v;
                xil.m mVar = (xil.m) obj3;
                hVar.f306558b.G(mVar, "KEY_SSO_FLOW_SCOPE", z.d(o0.b(xil.m.class)));
                hVar.f306557a.f("KEY_SSO_FLOW_SCOPE", mVar);
                return Unit.f186387a;
            case 1:
                String str = (String) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                zjl.c cVar = (zjl.c) ((u) obj3).f306583b.T2("USER_ACTIVITY_" + str, zjl.c.class);
                if (cVar == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(cVar, "<this>");
                return new cjl.w(cVar.f322877a);
            case 2:
                File document = (File) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xk7.e eVar = (xk7.e) ((CFACClaimExpenseDetailsScreen) obj3).V.getValue();
                Intrinsics.h(document);
                xk7.g gVar = (xk7.g) eVar;
                gVar.getClass();
                Intrinsics.checkNotNullParameter(document, "document");
                if (Intrinsics.f(lim.o.n(document), "pdf")) {
                    gVar.A1(new c0(gVar, document, objArr3 == true ? 1 : 0, i2), new yi5.b(25));
                } else {
                    String path = document.getPath();
                    Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
                    m70.a.c(t0.f186434a);
                    gVar.C1(new BridgeDestination(new FeatureCommand(new DocumentViewFeatureConfiguration(new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), path))));
                }
                return Unit.f186387a;
            case 3:
                x0 x0Var = (x0) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.dynamic_form.number_transfer_confirmation.b bVar = (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.dynamic_form.number_transfer_confirmation.b) obj3;
                if (x0Var instanceof v0) {
                    com.revolut.kompot.navigable.vc.modal.a aVar6 = bVar.f101286y;
                    v0 v0Var = (v0) x0Var;
                    String str2 = v0Var.f114125a;
                    List<zej.f> list = v0Var.f114126b;
                    ArrayList arrayList = new ArrayList();
                    for (zej.f fVar : list) {
                        EsimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$InputData esimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$InputData = bVar.o;
                        int i33 = xkj.p.f306840a[fVar.ordinal()];
                        if (i33 == 1) {
                            strA = bVar.u.a(esimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$InputData.f101263b);
                        } else if (i33 == 2) {
                            ugc.a aVar7 = bVar.v;
                            EsimGiftRecipient esimGiftRecipient = esimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$InputData.f;
                            aVar7.getClass();
                            strA = ugc.a.f(esimGiftRecipient);
                        } else {
                            if (i33 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            EsimPhoneNumberPortingServiceProvider esimPhoneNumberPortingServiceProvider = ((xkj.g) ((j2) bVar.f101285x.f22677a).getValue()).f306819a;
                            strA = esimPhoneNumberPortingServiceProvider != null ? esimPhoneNumberPortingServiceProvider.f100398b : null;
                        }
                        if (strA == null) {
                            com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.dynamic_form.number_transfer_confirmation.b.K2("Can't resolve portability form param " + fVar.name());
                            pair = null;
                        } else {
                            pair = new Pair(fVar.b(), strA);
                        }
                        if (pair != null) {
                            arrayList.add(pair);
                        }
                    }
                    oki.h.v2(aVar6, new EsimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$ModalStep.PortabilityForm(str2, r0.t(arrayList)), ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a);
                }
                return Unit.f186387a;
            case 4:
                Pair pair2 = (Pair) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_benefits_to_lose.a aVar9 = (com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_benefits_to_lose.a) obj3;
                aVar9.H2(aVar9.f103476w, new w0((Data) pair2.f186385a, (Data) pair2.f186386b, i21));
                return Unit.f186387a;
            case 5:
                ty0.a click = (ty0.a) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xl9.j jVar = (xl9.j) ((PayWithSmileConsentScreen) obj3).R.getValue();
                Intrinsics.h(click);
                xl9.o oVar = (xl9.o) jVar;
                oVar.getClass();
                Intrinsics.checkNotNullParameter(click, "click");
                if (Intrinsics.f(click.f275445a, "ID_PRIVACY_NOTICE")) {
                    wi0.b bVar2 = ((xl9.e) ((j2) oVar.f306970q.f22677a).getValue()).d;
                    if (bVar2 == null) {
                        wi0.b.Companion.getClass();
                        bVar2 = wi0.b.p0;
                    }
                    oVar.C1(new ExternalDestination.Browser(a0.d.v(new Object[]{j6.a.q("en-", bVar2.f297794a)}, 1, "https://www.revolut.com/%s/legal/pws-privacy-notice/", "format(...)"), null));
                }
                return Unit.f186387a;
            case 6:
                Data data = (Data) this.v;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xlj.g gVar2 = (xlj.g) obj3;
                gVar2.H2(gVar2.f307026r, new xl9.m(data, i22));
                return Unit.f186387a;
            case 7:
                CharSequence charSequence = (CharSequence) this.v;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                s0 s0VarH3 = ((SetupBudgetController) obj3).R2();
                String amountString = charSequence.toString();
                s0VarH3.getClass();
                Intrinsics.checkNotNullParameter(amountString, "amountString");
                xmd.o oVarI2 = s0VarH3.I2();
                if (oVarI2 != null) {
                    dj0.d dVar = oVarI2.f307185a;
                    s0VarH3.L2(xmd.o.a(oVarI2, new dj0.d(s0VarH3.f307197q.b(amountString, dVar.f115083b.f306286a), dVar.f115083b), null, 2));
                }
                return Unit.f186387a;
            case 8:
                Pair pair3 = (Pair) this.v;
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                yhm.r rVar = (yhm.r) pair3.f186385a;
                Pair pair4 = (Pair) pair3.f186386b;
                return new xnd.l((AnalyticsAccountsSelection) obj3, (String) rVar.f314202b, d0.i1((List) rVar.f314203c), (Set) rVar.f314201a, (xi0.b) pair4.f186386b, d0.i1((List) pair4.f186385a));
            case 9:
                a0 a0Var = (a0) obj3;
                List list2 = (List) this.v;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (list2.isEmpty()) {
                    return zi0.c.i(new ynd.a(f0.f322471a));
                }
                List list3 = list2;
                if ((list3 instanceof Collection) && list3.isEmpty()) {
                    flowA = zi0.c.i(uib.c.SAVINGS);
                } else {
                    Iterator it8 = list3.iterator();
                    while (it8.hasNext()) {
                        if (((AnalyticsAccount) it8.next()) instanceof AnalyticsAccount.Savings) {
                            flowA = nim.a.A(nim.a.v(a0Var.e.a(w4l.j.f294644c), new xlj.h(i2)), new xlj.h(22));
                        }
                    }
                    flowA = zi0.c.i(uib.c.SAVINGS);
                }
                return xam.a.h(new wo2.l((Object) list2, (Object) a0Var, (Continuation) (objArr4 == true ? 1 : 0), 10), flowA);
            case 10:
                Data data2 = (Data) this.v;
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.user_declarations.shared.flows.income.screen.b bVar3 = (com.revolut.feature.user_declarations.shared.flows.income.screen.b) obj3;
                bVar3.H2(bVar3.f94636t, new xl9.m(data2, 6));
                return Unit.f186387a;
            case 11:
                Object obj4 = this.v;
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xob.n nVarE3 = ((SavingsDetailsScreen) obj3).d();
                String listId = ((koi.j) obj4).getF52302a();
                Object f53071x = ((qv0.p) obj4).getF54982q();
                com.revolut.feature.retail.savings.impl.ui.details.a aVar17 = (com.revolut.feature.retail.savings.impl.ui.details.a) nVarE3;
                skb.f fVar2 = aVar17.f83370s;
                j60.a aVar18 = aVar17.f83369r;
                Intrinsics.checkNotNullParameter(listId, "listId");
                if (Intrinsics.f(listId, "SERVICE_FEE_INTEREST_ITEM_LIST_ID")) {
                    aVar18.x(fVar2.d());
                } else if (f53071x instanceof njb.c) {
                    y yVarF = fVar2.f(((njb.c) f53071x).f216436a);
                    if (yVarF != null) {
                        aVar18.x(yVarF);
                    }
                } else if (f53071x instanceof njb.a) {
                    aVar18.x(fVar2.a(((njb.a) f53071x).f216434a));
                } else if (f53071x instanceof njb.j) {
                    aVar18.x(fVar2.b(((njb.j) f53071x).f216443a));
                } else if (f53071x instanceof njb.k) {
                    aVar18.x(fVar2.e(((njb.k) f53071x).f216444a));
                } else if (f53071x instanceof SavingsDocument) {
                    aVar17.C1(new SavingsDocumentLauncherDestination((SavingsDocument) f53071x));
                } else if (f53071x instanceof tkb.d) {
                    ((tkb.c) aVar17.f83374y).c3((tkb.d) f53071x);
                } else {
                    boolean z = f53071x instanceof InterestAndTaxParcel;
                    ModalDestination.Style.POPUP popup = ModalDestination.Style.POPUP.f98311a;
                    Continuation continuation = null;
                    if (z) {
                        InterestAndTaxParcel interestAndTaxParcel = (InterestAndTaxParcel) f53071x;
                        if (interestAndTaxParcel instanceof InterestAndTaxParcel.Deeplink) {
                            aVar17.I2(((InterestAndTaxParcel.Deeplink) f53071x).f83203a);
                        } else {
                            if (!(interestAndTaxParcel instanceof InterestAndTaxParcel.Embedded)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            yji.l.j2(aVar17, new InterestAndFeesScreen(new InterestAndFeesScreenContract$InputData(aVar17.J2().f307764b.f214169a.f86683a.f86617a)), popup, null, 2);
                        }
                    } else if (f53071x instanceof rkb.c) {
                        aVar17.I2(((rkb.c) f53071x).f254789a);
                    } else if (f53071x instanceof xob.o) {
                        aVar17.C1(new TaxExemptionDestination$TaxExemption(((xob.o) f53071x).f307777a.name()));
                    } else if (f53071x instanceof xob.g) {
                        String str3 = ((xob.g) f53071x).f307769a;
                        if (str3 != null) {
                            aVar17.I2(str3);
                        } else {
                            aVar17.C1(new SharedFaqDestination((SharedFaqDestination.StartPoint) new SharedFaqDestination.StartPoint.TopLevelFaq(null), (SharedFaqDestination.PassthroughData) null, false, 14));
                        }
                    } else if (f53071x instanceof qkb.a) {
                        aVar17.I2(((qkb.a) f53071x).f246977a);
                    } else if (Intrinsics.f(listId, "PROTECTION_AND_SAFETY_LIST_ID")) {
                        yji.l.j2(aVar17, new ProtectionAndSafetyScreen(new ProtectionAndSafetyScreenContract$InputData(aVar17.J2().f307764b.f214169a.f86683a.f86617a)), popup, null, 2);
                    } else if (Intrinsics.f(listId, "FUND_INFO_LIST_ITEM_ID")) {
                        yji.l.j2(aVar17, new FundInfoController(new FundInfoControllerContract$InputData(aVar17.J2().f307764b.f214169a.f86683a.f86617a)), popup, null, 2);
                    } else if (Intrinsics.f(listId, "DOCUMENT_STATEMENT_LIST_ITEM_ID") || Intrinsics.f(listId, "SAVINGS_STATEMENT_LIST_ITEM_ID")) {
                        pcd.s sVar = aVar17.J2().f307763a;
                        List listC = zhm.u.c(new SavingsAccountsStatementFeatureConfig$SavingsAccountInfo(sVar.f234881a, sVar.f234885h.f234859a));
                        int i43 = xob.r.f307781a[sVar.f234889n.ordinal()];
                        aVar17.l2(new wo2.l(aVar17, listC, i43 != 1 ? i43 != 2 ? v.k(pcd.b.PERSONAL, pcd.b.YOUTH) : zhm.u.c(pcd.b.PERSONAL_UNDER_18) : zhm.u.c(pcd.b.PERSONAL_JOINT), continuation, 12), new yi5.b(i21));
                    } else {
                        boolean zF = Intrinsics.f(listId, "ANNUAL_INTEREST_LIST_ITEM");
                        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
                        if (zF) {
                            xob.e eVar2 = (xob.e) ((xob.f) ((j2) aVar17.K.f22677a).getValue()).f307768a.getContent();
                            if (eVar2 != null && (aVar = eVar2.f307764b) != null && (savingsProductData = aVar.f214169a) != null && (savingsProduct = savingsProductData.f86683a) != null) {
                                SavingsProduct.InterestRate interestRate = savingsProduct.f86621h;
                                boolean zA = aVar17.G.a(savingsProduct.f86628r);
                                if (interestRate.f86644a.size() <= 1 && !zA) {
                                    aVar18.x(fVar2.c(aVar17.J2().f307764b));
                                } else {
                                    String str4 = interestRate.f;
                                    if (str4 != null) {
                                        aVar17.I2(str4);
                                    } else {
                                        oki.h.v2(aVar17.J, new SavingsDetailsScreenContract$Step.InterestRateExplanation(savingsProduct), bottom_dialog);
                                    }
                                }
                            }
                        } else if (Intrinsics.f(listId, "NEXT_INTEREST_PAYMENT_LIST_ITEM")) {
                            xob.e eVarJ2 = aVar17.J2();
                            pcd.s sVar2 = eVarJ2.f307763a;
                            ncd.a aVar19 = eVarJ2.f307764b;
                            xob.m mVar2 = eVarJ2.f307765c;
                            ncd.d dVarG = opg.a.g(aVar19.f214169a);
                            if (mVar2 instanceof xob.l) {
                                yji.l.j2(aVar17, new NextInterestPaymentDialogScreen(new SavingsKompotFeatureConfig$NextInterestPaymentDialogScreen$InputData.AmountForDailyInterestPayment(sVar2.f234881a, ((xob.l) mVar2).f307776a, sVar2, dVarG)), bottom_dialog, null, 2);
                            } else if (Intrinsics.f(mVar2, xob.i.f307773a)) {
                                yji.l.j2(aVar17, new NextInterestPaymentDialogScreen(new SavingsKompotFeatureConfig$NextInterestPaymentDialogScreen$InputData.CutOffTime(dVarG)), bottom_dialog, null, 2);
                            }
                        } else if (Intrinsics.f(listId, "DOCUMENTS_LIST_ITEM_ID") || Intrinsics.f(listId, "SAVINGS_DOCUMENTS_LIST_ITEM_ID")) {
                            aVar17.C1(new SavingsProductDocumentsDestination(aVar17.J2().f307764b.f214169a.f86683a.f86617a, null));
                        }
                    }
                }
                return Unit.f186387a;
            case 12:
                yhm.r rVar2 = (yhm.r) this.v;
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                yhm.r rVar3 = (yhm.r) rVar2.f314201a;
                yhm.r rVar4 = (yhm.r) rVar2.f314202b;
                Pair pair5 = (Pair) rVar2.f314203c;
                return new xob.e((pcd.s) obj3, (ncd.a) rVar3.f314202b, (xob.m) rVar3.f314201a, (n38.z) ((od0.i) rVar3.f314203c).g(), (od0.i) rVar4.f314201a, (uib.a) rVar4.f314202b, (SavingsChallenge) ((od0.i) rVar4.f314203c).g(), (xme.e) pair5.f186385a, (pjb.b) ((od0.i) pair5.f186386b).g());
            case 13:
                Data data3 = (Data) this.v;
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                fo3.c cVar2 = (fo3.c) data3.getContent();
                xi0.b bVar4 = cVar2 != null ? cVar2.d : null;
                if (bVar4 != null) {
                    xp8.l lVar = (xp8.l) obj3;
                    lVar.H2(lVar.f307914s, new vgc.b(11, bVar4));
                }
                return Unit.f186387a;
            case 14:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xq4.g gVar3 = (xq4.g) ((CreditCardDescriptionScreen) obj3).f69206a0.getValue();
                Intrinsics.h(clickData);
                String str5 = clickData.f275445a;
                String str6 = clickData.f275446b;
                com.revolut.feature.credit.card.impl.ui.description.a aVar23 = (com.revolut.feature.credit.card.impl.ui.description.a) gVar3;
                aVar23.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                if (aVar23.f69212p instanceof CreditCardDescriptionScreenContract$InputData.Remote) {
                    aVar23.y2(str6, str5);
                } else if (Intrinsics.f(str5, "PROMOTION_TERMS_ID")) {
                    Object obj5 = clickData.d;
                    Intrinsics.i(obj5, "null cannot be cast to non-null type kotlin.String");
                    aVar23.y2(str6, (String) obj5);
                } else {
                    aVar23.l2(new xnl.f(aVar23, clickData, objArr5 == true ? 1 : 0, 4), new yi5.b(i21));
                }
                return Unit.f186387a;
            case 15:
                ty0.a aVar24 = (ty0.a) this.v;
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((xq7.g) ((xq7.e) ((TelematicsDeviceUnpluggedScreen) obj3).Y.getValue())).y2(aVar24.f275445a);
                return Unit.f186387a;
            case 16:
                Data data4 = (Data) this.v;
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((xq7.g) obj3).x2(new xl9.m(data4, i3));
                return Unit.f186387a;
            case 17:
                Data data5 = (Data) this.v;
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xqd.f fVar3 = (xqd.f) obj3;
                fVar3.H2(fVar3.f308162q, new xl9.m(data5, 15));
                return Unit.f186387a;
            case 18:
                xr3.t tVar = (xr3.t) this.v;
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ve0.c cVar3 = ((xr3.u) obj3).d;
                String str7 = tVar.f308238b;
                Type type = new CreditLimitIncreaseApplicationRepositoryImpl$CreditLimitIncreasePreferenceCacheKey$storageCacheType$1().getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                er3.c cVar4 = (er3.c) cVar3.T2(str7, type);
                if (cVar4 != null) {
                    return z92.f.H(cVar4);
                }
                return null;
            case 19:
                d1 d1Var = (d1) this.v;
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return ((w) obj3).f308245c.T2(w.a(d1Var), Boolean.TYPE);
            case 20:
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                zk0.b bVar5 = ((xrg.d) this.v).f308342m;
                zk0.a aVar31 = zk0.a.INTERNAL_CACHE;
                String name = ((File) obj3).getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                ((a80.h) bVar5).e(aVar31, name);
                return Unit.f186387a;
            case 21:
                Data data6 = (Data) this.v;
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.credit.card.impl.ui.instalment.repay.details.c cVar5 = (com.revolut.feature.credit.card.impl.ui.instalment.repay.details.c) obj3;
                cVar5.H2(cVar5.f69492s, new xl9.m(data6, i5));
                return Unit.f186387a;
            case 22:
                z4 z4Var = (z4) this.v;
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xsh.h hVar2 = z4Var.d;
                xsh.f fVar4 = (xsh.f) ((WidgetCarouselScreen) obj3).T.getValue();
                String widgetType = hVar2.f308500a;
                xsh.r rVar5 = (xsh.r) fVar4;
                rVar5.getClass();
                Intrinsics.checkNotNullParameter(widgetType, "widgetType");
                for (xsh.h hVar3 : ((xsh.d) rVar5.t2()).f308493a) {
                    if (Intrinsics.f(hVar3.f308500a, widgetType)) {
                        dsh.e eVar3 = hVar3.f;
                        if (eVar3 == null) {
                            throw new IllegalArgumentException(j6.a.q("Config is not created yet ", hVar3.f308500a).toString());
                        }
                        dsh.j jVarB = ((ish.h) rVar5.f308517q).b(rVar5.f308518r.f96384a, widgetType, eVar3);
                        if (jVarB == null) {
                            throw new IllegalStateException("Customisation action is not available");
                        }
                        ModalDestination.Style style = jVarB.f117328c;
                        final xpe.c cVar6 = new xpe.c(rVar5, widgetType, i5);
                        final dsh.k kVar = jVarB.f117327b;
                        if (kVar instanceof dsh.m) {
                            BaseScreen baseScreen = ((dsh.m) kVar).f117330a;
                            final Object[] objArr10 = objArr == true ? 1 : 0;
                            rVar5.Y1(baseScreen, style, new Function1() { // from class: xsh.k
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj6) {
                                    aii.r it9 = (aii.r) obj6;
                                    switch (objArr10) {
                                        case 0:
                                            Intrinsics.checkNotNullParameter(it9, "it");
                                            cVar6.invoke(((dsh.m) kVar).f117331b.invoke(it9));
                                            break;
                                        default:
                                            Intrinsics.checkNotNullParameter(it9, "it");
                                            cVar6.invoke(((dsh.n) kVar).f117333b.invoke(it9));
                                            break;
                                    }
                                    return Unit.f186387a;
                                }
                            });
                        } else {
                            if (!(kVar instanceof dsh.n)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            rVar5.f2(((dsh.n) kVar).f117332a, style, new Function1() { // from class: xsh.k
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj6) {
                                    aii.r it9 = (aii.r) obj6;
                                    switch (i32) {
                                        case 0:
                                            Intrinsics.checkNotNullParameter(it9, "it");
                                            cVar6.invoke(((dsh.m) kVar).f117331b.invoke(it9));
                                            break;
                                        default:
                                            Intrinsics.checkNotNullParameter(it9, "it");
                                            cVar6.invoke(((dsh.n) kVar).f117333b.invoke(it9));
                                            break;
                                    }
                                    return Unit.f186387a;
                                }
                            });
                            Unit unit = Unit.f186387a;
                        }
                        return Unit.f186387a;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            case 23:
                CharSequence charSequence2 = (CharSequence) this.v;
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xsi.d dVarE3 = ((AdjustAnalyticsController) obj3).d();
                String newValue = charSequence2.toString();
                xsi.p pVar = (xsi.p) dVarE3;
                pVar.getClass();
                Intrinsics.checkNotNullParameter(newValue, "newValue");
                cli.y yVar = pVar.u;
                xsi.b bVar6 = (xsi.b) ((xsi.c) ((j2) yVar.f22677a).getValue()).f308526a.getContent();
                if (bVar6 != null) {
                    xsi.a aVar35 = bVar6.f308525c;
                    if (pVar.f308544w) {
                        pVar.f308544w = false;
                    } else {
                        long jB = pVar.f308540q.b(newValue, aVar35.f308522c.f306286a);
                        long j3 = bVar6.f308524b - jB;
                        if (newValue.length() == 0) {
                            aVarA = xsi.a.a(aVar35, 0L, j3, 5);
                            j2 = jB;
                        } else {
                            j2 = jB;
                            aVarA = xsi.a.a(aVar35, j2, j3, 4);
                        }
                        pVar.H2(yVar, new xsi.n(xsi.b.a(bVar6, aVarA, j2 == 0), 1));
                    }
                }
                return Unit.f186387a;
            case 24:
                Data data7 = (Data) this.v;
                fim.a aVar36 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xsi.p pVar2 = (xsi.p) obj3;
                pVar2.H2(pVar2.u, new xl9.m(data7, 17));
                return Unit.f186387a;
            case 25:
                cc7.l lVar2 = (cc7.l) obj3;
                bua.f fVar5 = (bua.f) this.v;
                fim.a aVar37 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                int i59 = 27;
                if (Intrinsics.f(fVar5, bua.b.f18756a)) {
                    lVar2.T2(new xta.e(lVar2, objArr9 == true ? 1 : 0, objArr2 == true ? 1 : 0), new yi5.b(i59));
                } else if (Intrinsics.f(fVar5, bua.c.f18757a)) {
                    lVar2.T2(new xta.e(lVar2, objArr8 == true ? 1 : 0, i32), new yi5.b(i59));
                    lVar2.A2(((yp.b) lVar2.f22958p).b(null));
                } else if (Intrinsics.f(fVar5, bua.a.f18755a)) {
                    lVar2.T2(new xta.e(lVar2, objArr7 == true ? 1 : 0, i22), new yi5.b(i59));
                } else if (Intrinsics.f(fVar5, bua.e.f18759a)) {
                    Unit unit2 = Unit.f186387a;
                } else {
                    if (!Intrinsics.f(fVar5, bua.d.f18758a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    lVar2.T2(new xta.e(lVar2, objArr6 == true ? 1 : 0, i6), new yi5.b(i59));
                }
                return Unit.f186387a;
            case 26:
                Data data8 = (Data) this.v;
                fim.a aVar38 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xti.j jVar2 = (xti.j) obj3;
                jVar2.H2(jVar2.f308833r, new xl9.m(data8, 18));
                return Unit.f186387a;
            case 27:
                fim.a aVar39 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.rev_points.buying.impl.ui.flow.a aVar40 = (com.revolut.feature.rev_points.buying.impl.ui.flow.a) this.v;
                oki.h.D2(aVar40.f83565r);
                Function1 function1 = aVar40.o.d;
                if (function1 != null) {
                    function1.invoke(Boolean.valueOf(((bvb.f) obj3).e));
                }
                return Unit.f186387a;
            case 28:
                vuc.e deviceParcel = (vuc.e) this.v;
                fim.a aVar41 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xuc.k kVar2 = (xuc.k) ((CommonLinkedWalletsTabScreen) obj3).Q.getValue();
                kVar2.getClass();
                Intrinsics.checkNotNullParameter(deviceParcel, "deviceParcel");
                kVar2.C2(new xuc.g(deviceParcel));
                return Unit.f186387a;
            default:
                ty0.a aVar42 = (ty0.a) this.v;
                fim.a aVar43 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xug.q qVarM3 = ((ReviewClosureConditionsBottomSheetController) obj3).R2();
                Object obj6 = aVar42.d;
                qVarM3.getClass();
                if (obj6 instanceof xug.e) {
                    xug.e eVar4 = (xug.e) obj6;
                    if (eVar4 instanceof xug.d) {
                        Intrinsics.checkNotNullParameter("topic.closing-your-trading-account", "key");
                        qVarM3.C2(new xug.j());
                    } else {
                        if (!eVar4.equals(xug.c.f309062a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        qVarM3.C2(xug.k.f309067a);
                    }
                } else {
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.b(rd0.c.WARNING, "ReviewClosureConditionsBottomSheetControllerModel", a0.d.m(obj6, "unhandled parcel="), null, null, 16);
                }
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f306556w = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Continuation continuation, Object obj2, int i) {
        super(2, continuation);
        this.u = i;
        this.f306556w = obj2;
    }
}
