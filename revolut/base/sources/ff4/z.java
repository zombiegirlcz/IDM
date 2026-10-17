package ff4;

import android.content.pm.PackageInfo;
import aw0.n6;
import com.revolut.feature.alipay.impl.ui.webcontainer.AlipayPlusWebContainerScreen;
import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.payments_list.BlockedPaymentsListFlow;
import com.revolut.feature.credit.application.plugins.impl.models.CreditOnboardingClosePayload;
import com.revolut.feature.credit.application.plugins.impl.ui.personal_details.customer_identification.CustomerIdentificationScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.valuators.details.ValuatorDetailsScreen;
import com.revolut.feature.crypto.earn.assets.shared.impl.ui.error.ErrorScreenController;
import com.revolut.feature.crypto.qr.parser.impl.ui.scanner.CryptoQrScannerController;
import com.revolut.feature.crypto.strategies.impl.ui.crypto_strategies.CryptoStrategiesController;
import com.revolut.feature.external_accounts.impl.ui.screen.cross_border.branches.CrossBorderBranchesScreen;
import com.revolut.feature.instruments.trend.collections.impl.ui.collection.InstrumentsTrendCollectionController;
import com.revolut.feature.insurance_car.impl.ui.screen.policy.claims.ClaimsScreen;
import com.revolut.feature.junior_core.models.configuration.JuniorPlanConfiguration;
import com.revolut.feature.junior_core.models.configuration.Links;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.pay_later.impl.ui.planprogress.PlanProgressController;
import com.revolut.feature.payment.counterparty.impl.screen.profile.CounterPartyDetailsScreen;
import com.revolut.feature.profile.impl.ui.profile.screens.notification_setting_details.NotificationSettingDetailsViewController;
import com.revolut.feature.retail.savings.impl.challenge.presentation.pause_challenge.PauseChallengeScreen;
import com.revolut.feature.tax_residency.impl.ui.sole.TaxResidencySoleScreen;
import com.revolut.feature.tax_residency.impl.ui.sole.TaxResidencySoleScreenModel$ModalStep;
import com.revolut.feature.three_ds_verification.impl.ui.merchant_redirect.screen.MerchantRedirectDialogController;
import com.revolut.feature.transaction_list.impl.ui.simple_transactions.SimpleTransactionsScreen;
import com.revolut.feature.wealth_discovery.impl.collection.top_movers.TopMoversScreen;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_billing.EsimMobilePlanBillingScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_get_port_out_credentials.EsimMobilePlanGetPortOutCredentialsScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_preview.PlanPreviewScreen;
import fse.d;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import le.u1;
import nii.n1;
import vkm.j2;
import yhm.m;
import zh9.u0;
import zhm.h0;
import zhm.y0;
import zi5.d;

/* JADX INFO: loaded from: classes22.dex */
public final class z extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new z((b0) this.v, continuation, 0);
            case 1:
                return new z((ErrorScreenController) this.v, continuation, 1);
            case 2:
                return new z((ff8.i) this.v, continuation, 2);
            case 3:
                return new z((bfe.f) this.v, continuation, 3);
            case 4:
                return new z((CustomerIdentificationScreen) this.v, continuation, 4);
            case 5:
                return new z((SimpleTransactionsScreen) this.v, continuation, 5);
            case 6:
                return new z((InstrumentsTrendCollectionController) this.v, continuation, 6);
            case 7:
                return new z((ValuatorDetailsScreen) this.v, continuation, 7);
            case 8:
                return new z((CryptoQrScannerController) this.v, continuation, 8);
            case 9:
                return new z((com.revolut.feature.crypto.qr.parser.impl.ui.scanner.a) this.v, continuation, 9);
            case 10:
                return new z((EsimMobilePlanBillingScreen) this.v, continuation, 10);
            case 11:
                return new z((com.revolut.feature.external_accounts.impl.ui.brazil.payment_confirmation.d) this.v, continuation, 11);
            case 12:
                return new z((PlanProgressController) this.v, continuation, 12);
            case 13:
                return new z((PauseChallengeScreen) this.v, continuation, 13);
            case 14:
                return new z((EsimMobilePlanGetPortOutCredentialsScreen) this.v, continuation, 14);
            case 15:
                return new z((fkl.h) this.v, continuation, 15);
            case 16:
                return new z((AlipayPlusWebContainerScreen) this.v, continuation, 16);
            case 17:
                return new z((fla.g) this.v, continuation, 17);
            case 18:
                return new z((CryptoStrategiesController) this.v, continuation, 18);
            case 19:
                return new z((PlanPreviewScreen) this.v, continuation, 19);
            case 20:
                return new z((CrossBorderBranchesScreen) this.v, continuation, 20);
            case 21:
                return new z((CounterPartyDetailsScreen) this.v, continuation, 21);
            case 22:
                return new z((com.revolut.feature.payment.counterparty.impl.screen.profile.a) this.v, continuation, 22);
            case 23:
                return new z((NotificationSettingDetailsViewController) this.v, continuation, 23);
            case 24:
                return new z((TopMoversScreen) this.v, continuation, 24);
            case 25:
                return new z((TaxResidencySoleScreen) this.v, continuation, 25);
            case 26:
                return new z((fq3.j) this.v, continuation, 26);
            case 27:
                return new z((ClaimsScreen) this.v, continuation, 27);
            case 28:
                return new z((BlockedPaymentsListFlow) this.v, continuation, 28);
            default:
                return new z((MerchantRedirectDialogController) this.v, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((z) create((cv3.u) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((z) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((z) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((z) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((z) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((z) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((z) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((z) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((z) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((z) create((Throwable) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((z) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((z) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((z) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((z) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((z) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((z) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((z) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((z) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((z) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((z) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((z) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((z) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((z) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((z) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((z) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((z) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((z) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((z) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((z) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((z) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v107, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v113, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v126, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v132, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v18, types: [yhm.n] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.util.HashSet] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v47, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v65, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v70, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v15, types: [java.lang.Object, java.util.Map] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        lf8.g gVar;
        ?? A;
        int i = this.u;
        lf8.j jVar = null;
        Object obj3 = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                b0 b0Var = (b0) obj3;
                b0Var.H2(b0Var.f134712t, new fe9.f(8));
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((ff5.b) ((ErrorScreenController) obj3).Q.getValue()).B2();
                break;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                af8.f fVar = (af8.f) ((ff8.i) obj3).f134779c.T2("KEY_ACCOUNT_CONFIGURATIONS", ff8.i.f134775g);
                if (fVar != null) {
                    Object obj4 = ue8.a.f279313a;
                    Intrinsics.checkNotNullParameter(fVar, "<this>");
                    af8.h hVarD = fVar.getLinks();
                    Intrinsics.checkNotNullParameter(hVarD, "<this>");
                    Links links = new Links(hVarD.getCardholderTerms(), hVarD.getPrivacyStatement(), hVarD.getDepositTerms(), hVarD.getDataProtectionTerms());
                    af8.c cVarC = fVar.getFeatureFlags();
                    Intrinsics.checkNotNullParameter(cVarC, "<this>");
                    lf8.c cVar = new lf8.c(cVarC.getCreationAvailable());
                    String strE = fVar.getOnboardingPaywallType();
                    if (strE == null || (gVar = (lf8.g) u1.v(strE, ue8.a.f279313a)) == null) {
                        gVar = lf8.g.SKIP;
                    }
                    lf8.g gVar2 = gVar;
                    List<af8.g> listF = fVar.getPlanConfigurations();
                    ArrayList arrayList = new ArrayList(zhm.w.t(listF, 10));
                    for (af8.g gVar3 : listF) {
                        Intrinsics.checkNotNullParameter(gVar3, "<this>");
                        String strL = gVar3.getPlanId();
                        int iJ = gVar3.getMinimumAge();
                        int iH = gVar3.getMaximumUseAge();
                        int iG = gVar3.getMaximumRegistrationAgeExclusive();
                        int iB = gVar3.getMaxGuardianAccountCount();
                        int iD = gVar3.getMaxTotalAccountCount();
                        int iE = gVar3.getMaximumCardsPerAccount();
                        int iF = gVar3.getMaximumCoparentsPerJuniorAccount();
                        dj0.d dVarV = hx7.a.v(gVar3.getMinimumTopUpAmount());
                        jo3.b bVarC = gVar3.getMaxTopUpLimit();
                        arrayList.add(new JuniorPlanConfiguration(strL, iJ, iH, iG, iB, iD, iE, iF, dVarV, bVarC != null ? hx7.a.v(bVarC) : null, ue8.a.a(gVar3.getIb.b.Features java.lang.String()), gVar3.getSuggestUpgradeOnOnboarding(), gVar3.getMinAgeDifference()));
                    }
                    af8.a aVarA = fVar.getConsentPromptsEligibility();
                    Intrinsics.checkNotNullParameter(aVarA, "<this>");
                    lf8.a aVar4 = new lf8.a(new lf8.d(aVarA.getFirstPartyMarketing().getKidAgeInMonth()));
                    af8.b bVarB = fVar.getFeatureConfigurations();
                    Intrinsics.checkNotNullParameter(bVarB, "<this>");
                    lf8.e eVar = new lf8.e(bVarB.getJ2jTransfers().getAvailabilityAge());
                    af8.j youthTaxAdvantage = bVarB.getYouthTaxAdvantage();
                    if (youthTaxAdvantage != null) {
                        Intrinsics.checkNotNullParameter(youthTaxAdvantage, "<this>");
                        af8.i minimumAge = youthTaxAdvantage.getMinimumAge();
                        Intrinsics.checkNotNullParameter(minimumAge, "<this>");
                        lf8.k kVar = new lf8.k(minimumAge.getYears(), minimumAge.getDaysAdjustment());
                        af8.i maximumAge = youthTaxAdvantage.getMaximumAge();
                        Intrinsics.checkNotNullParameter(maximumAge, "<this>");
                        jVar = new lf8.j(kVar, new lf8.k(maximumAge.getYears(), maximumAge.getDaysAdjustment()), youthTaxAdvantage.getTinRequiredAge());
                    }
                }
                break;
            case 3:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bfe.f fVar2 = (bfe.f) obj3;
                try {
                    m.Companion companion = yhm.m.INSTANCE;
                    List listB = ((n80.e) fVar2.f14980c).b(4096);
                    ArrayList<PackageInfo> arrayList2 = new ArrayList();
                    for (Object obj5 : listB) {
                        String[] strArr = ((PackageInfo) obj5).requestedPermissions;
                        if (strArr != null) {
                            zee.a aVar6 = zee.b.Companion;
                            zee.b permission = zee.b.SYSTEM_ALERT_WINDOW;
                            aVar6.getClass();
                            Intrinsics.checkNotNullParameter(strArr, "<this>");
                            Intrinsics.checkNotNullParameter(permission, "permission");
                            int length = strArr.length;
                            int i2 = 0;
                            while (true) {
                                if (i2 >= length) {
                                }
                                if (kotlin.text.d0.J(strArr[i2], permission.qualifier, false)) {
                                    arrayList2.add(obj5);
                                } else {
                                    i2++;
                                }
                                break;
                            }
                        }
                    }
                    A = new HashSet();
                    for (PackageInfo packageInfo : arrayList2) {
                        afe.d dVar = fVar2.f14979b;
                        String packageName = packageInfo.packageName;
                        Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
                        A.add(yee.b.a(dVar.a(packageName), y0.b(zee.b.SYSTEM_ALERT_WINDOW)));
                    }
                } catch (Throwable th10) {
                    m.Companion companion2 = yhm.m.INSTANCE;
                    A = yhm.o.a(th10);
                }
                Throwable thA = yhm.m.a(A);
                if (thA != null) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, thA, h0Var);
                }
                h0 h0Var2 = h0.f322473a;
                if (A instanceof yhm.n) {
                }
                break;
            case 4:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((fg4.e) ((CustomerIdentificationScreen) obj3).O.getValue()).B2();
                break;
            case 5:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((fhf.j) ((fhf.f) ((SimpleTransactionsScreen) obj3).P.getValue())).B2();
                break;
            case 6:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.instruments.trend.collections.impl.ui.collection.a) ((InstrumentsTrendCollectionController) obj3).d()).B2();
                break;
            case 7:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((ValuatorDetailsScreen) obj3).m2().onBackPressed();
                break;
            case 8:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.crypto.qr.parser.impl.ui.scanner.a) ((fj5.c) ((CryptoQrScannerController) obj3).P.getValue())).C2(d.a.f322503a);
                break;
            case 9:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.crypto.qr.parser.impl.ui.scanner.a) obj3).J2();
                break;
            case 10:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_billing.a) ((EsimMobilePlanBillingScreen) obj3).d()).B2();
                break;
            case 11:
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                oki.h.D2(((com.revolut.feature.external_accounts.impl.ui.brazil.payment_confirmation.d) obj3).f72712t);
                break;
            case 12:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((PlanProgressController) obj3).m2().onBackPressed();
                break;
            case 13:
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((fkb.f) ((PauseChallengeScreen) obj3).O.getValue()).C2(fkb.b.f135740a);
                break;
            case 14:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((fkj.f) ((EsimMobilePlanGetPortOutCredentialsScreen) obj3).W.getValue()).B2();
                break;
            case 15:
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((fkl.h) obj3).f135869c.I0("LOGOUT_REQUIRED");
                break;
            case 16:
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((AlipayPlusWebContainerScreen) obj3).e3().I2(fl1.h.f135891a);
                break;
            case 17:
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                break;
            case 18:
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((CryptoStrategiesController) obj3).m2().onBackPressed();
                break;
            case 19:
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((fnk.n) ((PlanPreviewScreen) obj3).R2()).B2();
                break;
            case 20:
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((fo6.p) ((CrossBorderBranchesScreen) obj3).d()).B2();
                break;
            case 21:
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.payment.counterparty.impl.screen.profile.a) ((CounterPartyDetailsScreen) obj3).d()).I2(fo9.k.f136847a);
                break;
            case 22:
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.payment.counterparty.impl.screen.profile.a) obj3).C1(u0.b(com.revolut.retail.core.navigation.a.c(new FinishCommand(null, null, null, 7), new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(t49.a.f267950b, null, null, 6))))));
                break;
            case 23:
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((NotificationSettingDetailsViewController) obj3).m2().onBackPressed();
                break;
            case 24:
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.wealth_discovery.impl.collection.top_movers.a) ((foh.o) ((TopMoversScreen) obj3).R.getValue())).B2();
                break;
            case 25:
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                oki.h.v2(((com.revolut.feature.tax_residency.impl.ui.sole.b) ((fpe.h) ((TaxResidencySoleScreen) obj3).Q.getValue())).f90151q, TaxResidencySoleScreenModel$ModalStep.WhatIsTaxResidency.f90148a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                break;
            case 26:
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                fq3.j jVar2 = (fq3.j) obj3;
                mri.w.r0(jVar2.f137184m, ((CreditOnboardingClosePayload) jVar2.f137181h.f66219b).f66907a.f66892b);
                break;
            case 27:
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((ClaimsScreen) obj3).m2().onBackPressed();
                break;
            case 28:
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((fs2.o) ((fs2.c) ((BlockedPaymentsListFlow) obj3).P.getValue())).B2();
                break;
            default:
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                fse.f fVar3 = (fse.f) ((fse.b) ((MerchantRedirectDialogController) obj3).R.getValue());
                fse.c cVar2 = (fse.c) ((j2) fVar3.o.f22677a).getValue();
                String str = cVar2.f137667b ? cVar2.f137666a.f60543p : null;
                if (str != null) {
                    fVar3.C2(new fse.e(str));
                } else {
                    fVar3.C2(d.a.f137668a);
                }
                break;
        }
        return Unit.f186387a;
    }
}
