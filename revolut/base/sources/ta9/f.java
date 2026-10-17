package ta9;

import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.payments_list.BlockedPaymentsListFlowContract$Input;
import com.revolut.feature.card_management.impl.ui.change_pin.ChangePinFlowContract$InputData;
import com.revolut.feature.credit.loan.impl.ui.rev10.payment_settings.hub.LoanPaymentSettingsHubControllerContract$InputData;
import com.revolut.feature.credit.loan.impl.ui.rev10.paymentmanagement.confirm.CreateMandateConfirmationControllerContract$InputData;
import com.revolut.feature.credit.loan.impl.ui.rev10.paymentmanagement.manage.LoanManageRepaymentsControllerContract$InputData;
import com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.LoanRepaymentFlowContract$InputData;
import com.revolut.feature.credit.loan.impl.ui.rev10.selectbackupcardflow.LoanSelectBackupCardFlowContract$InputData;
import com.revolut.feature.credit.loan.impl.ui.statements.flow.LoanStatementsFlowContract$InputData;
import com.revolut.feature.crypto.gift.asset.api.navigation.CryptoGiftAssetTransferInfoInputData;
import com.revolut.feature.instruments.trend.collections.impl.ui.launcher.InstrumentsTrendCollectionsLauncherFlowContract$InputData;
import com.revolut.feature.onboarding.impl.language_change.flow.LanguageChangeFlowContract$InputData;
import com.revolut.feature.onboarding.impl.onboarding.biometric.OnboardingBiometricFlowContract$InputData;
import com.revolut.feature.onboarding.impl.onboarding.country.flow.CountryOfResidenceFlowContract$InputData;
import com.revolut.feature.onboarding.impl.onboarding.product_lifecycle.OnboardingProductLifecycleFlowContract$InputData;
import com.revolut.feature.onboarding.impl.onboarding.selfie.OnboardingSelfieFlowContract$InputData;
import com.revolut.feature.onboarding.impl.onboarding.waiting_verification.WaitingVerificationFlowContract$InputData;
import com.revolut.feature.onboarding.impl.onboarding.workflow.OnboardingWorkflowFlowContract$InputData;
import com.revolut.feature.pay_with_smile.impl.ui.fallback_confirmation.FallbackConfirmationScreenContract$InputData;
import com.revolut.feature.pay_with_smile.impl.ui.flow.create_passcode.CreatePasscodeFlowContract$InputData;
import com.revolut.feature.payments_migration.impl.ui.screen.move_payment.account_details.AccountDetailsPaymentControllerContract$InputData;
import com.revolut.feature.payments_migration.impl.ui.screen.move_payment.cards.CardsPaymentControllerContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import u45.a1;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f269203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f269204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qji.b f269205c;

    public /* synthetic */ f(Object obj2, qji.b bVar, int i) {
        this.f269203a = i;
        this.f269204b = obj2;
        this.f269205c = bVar;
    }

    @Override // phm.a
    public final Object get() {
        switch (this.f269203a) {
            case 0:
                g gVar = (g) this.f269205c;
                m99.a documentViewItemsMapper = new m99.a();
                Intrinsics.checkNotNullParameter(documentViewItemsMapper, "documentViewItemsMapper");
                oa9.i iVar = new oa9.i();
                ore.b bVar = ((m) this.f269204b).f269238b;
                mre.c cVarB = bVar.b();
                vc.s.j(cVarB);
                pre.c cVarA = bVar.a();
                vc.s.j(cVarA);
                return new oa9.h(iVar, cVarB, cVarA, gVar.f269206a);
            case 1:
                h hVar = (h) this.f269205c;
                CountryOfResidenceFlowContract$InputData countryOfResidenceFlowContract$InputData = hVar.f269209a;
                m mVar = (m) this.f269204b;
                db9.e eVar = new db9.e();
                j99.a aVar = mVar.L;
                l99.a aVar2 = new l99.a();
                ryc.a aVarB = aVar.f172311a.b();
                z70.a aVarF = aVar.f172312b.f();
                vc.s.j(aVarF);
                jt0.b bVar2 = new jt0.b(aVar2, aVarB, aVarF, aVar.f172313c.a());
                k99.c countryResidenceDisclaimerScreenContentProvider = new k99.c();
                Intrinsics.checkNotNullParameter(countryResidenceDisclaimerScreenContentProvider, "countryResidenceDisclaimerScreenContentProvider");
                r39.a aVar3 = new r39.a();
                m mVar2 = hVar.f269210b;
                qb9.b bVar3 = (qb9.b) mVar2.f269236a.f269202h.get();
                vc.s.j(bVar3);
                i4b.f fVar = new i4b.f(bVar3);
                gte.a aVarB2 = mVar.f269248n.b();
                vc.s.j(aVarB2);
                return new com.revolut.feature.onboarding.impl.onboarding.country.flow.c(countryOfResidenceFlowContract$InputData, eVar, bVar2, aVar3, fVar, aVarB2, new pa9.f((s89.a) mVar2.Y.get()));
            case 2:
                LanguageChangeFlowContract$InputData languageChangeFlowContract$InputData = ((l) this.f269205c).f269234a;
                dl0.a aVar4 = (dl0.a) ((m) this.f269204b).N.f127229c.get();
                vc.s.j(aVar4);
                return new com.revolut.feature.onboarding.impl.language_change.flow.a(languageChangeFlowContract$InputData, aVar4);
            case 3:
                OnboardingBiometricFlowContract$InputData onboardingBiometricFlowContract$InputData = ((n) this.f269205c).f269257a;
                mt8.d dVarB = ((m) this.f269204b).K.b();
                vc.s.j(dVarB);
                return new com.revolut.feature.onboarding.impl.onboarding.biometric.d(onboardingBiometricFlowContract$InputData, dVarB, new bs.a());
            case 4:
                OnboardingProductLifecycleFlowContract$InputData onboardingProductLifecycleFlowContract$InputData = ((q) this.f269205c).f269267a;
                fk3.a aVarA = ((m) this.f269204b).f269240c.a();
                vc.s.j(aVarA);
                return new pb9.k(onboardingProductLifecycleFlowContract$InputData, aVarA);
            case 5:
                OnboardingSelfieFlowContract$InputData onboardingSelfieFlowContract$InputData = ((r) this.f269205c).f269270a;
                m mVar3 = (m) this.f269204b;
                pr.q qVar = mVar3.I;
                bs.b bVar4 = new bs.b();
                zr.l lVar = (zr.l) qVar.f238877n.get();
                vc.s.j(lVar);
                px.g gVar2 = mVar3.J;
                mw.a aVarB3 = gVar2.f240527a.b();
                vc.s.j(aVarB3);
                ds.a aVar5 = (ds.a) qVar.o.get();
                vc.s.j(aVar5);
                mt8.d dVarB2 = mVar3.K.b();
                vc.s.j(dVarB2);
                py.d dVarB3 = gVar2.b();
                vc.s.j(dVarB3);
                return new tb9.g(onboardingSelfieFlowContract$InputData, bVar4, lVar, aVarB3, aVar5, dVarB2, dVarB3);
            case 6:
                OnboardingWorkflowFlowContract$InputData onboardingWorkflowFlowContract$InputData = ((s) this.f269205c).f269272a;
                fk3.a aVarA2 = ((m) this.f269204b).f269240c.a();
                vc.s.j(aVarA2);
                return new bc9.j(onboardingWorkflowFlowContract$InputData, aVarA2);
            case 7:
                WaitingVerificationFlowContract$InputData waitingVerificationFlowContract$InputData = ((a0) this.f269205c).f269169a;
                m mVar4 = (m) this.f269204b;
                fwj.p pVarA = mVar4.f269249p.a();
                vc.s.j(pVarA);
                sf0.h hVarB = mVar4.f269251r.b();
                vc.s.j(hVarB);
                return new com.revolut.feature.onboarding.impl.onboarding.waiting_verification.a(waitingVerificationFlowContract$InputData, pVarA, hVarB);
            case 8:
                CryptoGiftAssetTransferInfoInputData cryptoGiftAssetTransferInfoInputData = ((tg5.f) this.f269205c).f271081a;
                return new bh5.e(cryptoGiftAssetTransferInfoInputData, (mg5.a) ((tg5.d) this.f269204b).f271077q.get(), new bh5.c(cryptoGiftAssetTransferInfoInputData));
            case 9:
                InstrumentsTrendCollectionsLauncherFlowContract$InputData instrumentsTrendCollectionsLauncherFlowContract$InputData = ((th7.c) this.f269205c).f271321a;
                tzg.m mVarT = ((th7.b) this.f269204b).d.t();
                vc.s.j(mVarT);
                return new com.revolut.feature.instruments.trend.collections.impl.ui.launcher.b(instrumentsTrendCollectionsLauncherFlowContract$InputData, mVarT);
            case 10:
                CreatePasscodeFlowContract$InputData createPasscodeFlowContract$InputData = ((tl9.a) this.f269205c).f272019a;
                hzl.e eVarA = am9.d.a();
                tl9.c cVar = (tl9.c) this.f269204b;
                return new com.revolut.feature.pay_with_smile.impl.ui.flow.create_passcode.c(createPasscodeFlowContract$InputData, eVarA, cVar.f272028g.e(), (ql9.d) cVar.f272033n.get());
            case 11:
                tl9.b bVar5 = (tl9.b) this.f269205c;
                FallbackConfirmationScreenContract$InputData fallbackConfirmationScreenContract$InputData = bVar5.f272022a;
                tl9.c cVar2 = (tl9.c) this.f269204b;
                l80.e eVarH = cVar2.f272030j.h();
                vc.s.j(eVarH);
                ql9.d dVar = (ql9.d) cVar2.f272033n.get();
                l80.e eVarH2 = bVar5.f272023b.f272030j.h();
                vc.s.j(eVarH2);
                return new yl9.k(fallbackConfirmationScreenContract$InputData, eVarH, dVar, new yl9.l(fallbackConfirmationScreenContract$InputData, eVarH2));
            case 12:
                xl9.t tVar = new xl9.t(((tl9.d) this.f269205c).f272034a);
                tl9.c cVar3 = (tl9.c) this.f269204b;
                return new xl9.o(tVar, (ql9.d) cVar3.f272033n.get(), cVar3.f272028g.e());
            case 13:
                return new com.revolut.feature.pay_with_smile.impl.ui.flow.enrollment.c(((tl9.e) this.f269205c).f272036a, ((tl9.c) this.f269204b).a());
            case 14:
                tr2.n nVar = (tr2.n) this.f269205c;
                BlockedPaymentsListFlowContract$Input blockedPaymentsListFlowContract$Input = nVar.f273671a;
                fs2.p pVar = new fs2.p(blockedPaymentsListFlowContract$Input, nVar.f273672b.f273658h.a());
                tr2.m mVar5 = (tr2.m) this.f269204b;
                mj8.b bVar6 = mVar5.f273664q;
                return new fs2.o(pVar, blockedPaymentsListFlowContract$Input, new k18.c((hj8.a) bVar6.f205950m.get(), bVar6.f205946g.a(), bVar6.f205947h.b()), mVar5.f273667t.b());
            case 15:
                return new b0i.e(((tyh.e) this.f269205c).f275619a, ((tyh.b) this.f269204b).f275594n.a(), new b0i.c());
            case 16:
                return new xyh.o(((tyh.h) this.f269205c).f275641a, new xyh.m(), (czh.l) ((tyh.b) this.f269204b).P.get());
            case 17:
                ChangePinFlowContract$InputData changePinFlowContract$InputData = ((tz2.k) this.f269205c).f275786a;
                tz2.e eVar2 = (tz2.e) this.f269204b;
                l93.f fVarJ = eVar2.f275760c.j();
                vc.s.j(fVarJ);
                sf0.h hVarB2 = eVar2.f275764l.b();
                vc.s.j(hVarB2);
                return new com.revolut.feature.card_management.impl.ui.change_pin.b(changePinFlowContract$InputData, fVarJ, hVarB2);
            case 18:
                u45.u uVar = (u45.u) this.f269205c;
                LoanManageRepaymentsControllerContract$InputData loanManageRepaymentsControllerContract$InputData = uVar.f277224a;
                u45.h hVar2 = (u45.h) this.f269204b;
                y45.i iVarI = hVar2.f277124a.i();
                vc.s.j(iVarI);
                return new com.revolut.feature.credit.loan.impl.ui.rev10.paymentmanagement.manage.a(loanManageRepaymentsControllerContract$InputData, iVarI, (m35.c) hVar2.S.get(), new j75.k(new c45.b(), uVar.f277225b.q()));
            case 19:
                u45.y yVar = (u45.y) this.f269205c;
                LoanPaymentSettingsHubControllerContract$InputData loanPaymentSettingsHubControllerContract$InputData = yVar.f277254a;
                u45.h hVar3 = (u45.h) this.f269204b;
                l35.b bVar7 = (l35.b) hVar3.L.get();
                y45.i iVarI2 = hVar3.f277124a.i();
                vc.s.j(iVarI2);
                return new e75.o(loanPaymentSettingsHubControllerContract$InputData, bVar7, iVarI2, (m35.c) hVar3.S.get(), new e75.q(new c45.b(), new c55.h(), yVar.f277255b.q()));
            case 20:
                LoanRepaymentFlowContract$InputData loanRepaymentFlowContract$InputData = ((u45.c0) this.f269205c).f277073a;
                l35.h hVarF = ((u45.h) this.f269204b).f277124a.f();
                vc.s.j(hVarF);
                return new com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.a(loanRepaymentFlowContract$InputData, hVarF);
            case 21:
                LoanSelectBackupCardFlowContract$InputData loanSelectBackupCardFlowContract$InputData = ((u45.h0) this.f269205c).f277145a;
                u45.h hVar4 = (u45.h) this.f269204b;
                l35.b bVar8 = (l35.b) hVar4.L.get();
                zwc.a aVar6 = (zwc.a) hVar4.f277144y.f.get();
                vc.s.j(aVar6);
                return new com.revolut.feature.credit.loan.impl.ui.rev10.selectbackupcardflow.b(loanSelectBackupCardFlowContract$InputData, bVar8, aVar6, hVar4.f277133j.e());
            case 22:
                u45.j0 j0Var = (u45.j0) this.f269205c;
                l70.e eVar3 = j0Var.f277158b.f277138q;
                l80.e eVarH3 = eVar3.h();
                vc.s.j(eVarH3);
                n65.d dVar2 = new n65.d(eVarH3);
                l80.e eVarH4 = eVar3.h();
                vc.s.j(eVarH4);
                return new com.revolut.feature.credit.loan.impl.ui.rev10.changerepaymentday.selectday_v2.a(new s65.s(dVar2, eVarH4), j0Var.f277157a, (l35.b) ((u45.h) this.f269204b).L.get(), new n65.a());
            case 23:
                LoanStatementsFlowContract$InputData loanStatementsFlowContract$InputData = ((u45.m0) this.f269205c).f277177a;
                y45.k kVarA = ((u45.h) this.f269204b).f277124a.a();
                vc.s.j(kVarA);
                return new com.revolut.feature.credit.loan.impl.ui.statements.flow.a(loanStatementsFlowContract$InputData, kVarA);
            case 24:
                a1 a1Var = (a1) this.f269205c;
                CreateMandateConfirmationControllerContract$InputData createMandateConfirmationControllerContract$InputData = a1Var.f277051b;
                u45.h hVar5 = (u45.h) this.f269204b;
                z35.c cVar4 = hVar5.o;
                b45.h hVarB3 = cVar4.b();
                y45.i iVarI3 = hVar5.f277124a.i();
                vc.s.j(iVarI3);
                m35.f fVar2 = (m35.f) hVar5.T.get();
                sf0.h hVarB4 = cVar4.f319169g.b();
                vc.s.j(hVarB4);
                return new com.revolut.feature.credit.loan.impl.ui.rev10.paymentmanagement.confirm.a(createMandateConfirmationControllerContract$InputData, hVarB3, iVarI3, fVar2, new c45.d(hVarB4), new ac4.g(a1Var.f277051b, (g75.n) ((u45.l0) a1Var.d).e.get()));
            case 25:
                a1 a1Var2 = (a1) this.f269205c;
                CreateMandateConfirmationControllerContract$InputData createMandateConfirmationControllerContract$InputData2 = a1Var2.f277051b;
                u45.h hVar6 = (u45.h) this.f269204b;
                z35.c cVar5 = hVar6.o;
                b45.h hVarB5 = cVar5.b();
                y45.i iVarI4 = hVar6.f277124a.i();
                vc.s.j(iVarI4);
                m35.f fVar3 = (m35.f) hVar6.T.get();
                sf0.h hVarB6 = cVar5.f319169g.b();
                vc.s.j(hVarB6);
                c45.d dVar3 = new c45.d(hVarB6);
                CreateMandateConfirmationControllerContract$InputData createMandateConfirmationControllerContract$InputData3 = a1Var2.f277051b;
                u45.h hVar7 = ((u45.w) a1Var2.d).f277241b;
                return new com.revolut.feature.credit.loan.impl.ui.rev10.paymentmanagement.confirm.a(createMandateConfirmationControllerContract$InputData2, hVarB5, iVarI4, fVar3, dVar3, new ac4.g(createMandateConfirmationControllerContract$InputData3, new i75.a(new c45.b())));
            case 26:
                u5a.a aVar7 = (u5a.a) this.f269205c;
                AccountDetailsPaymentControllerContract$InputData accountDetailsPaymentControllerContract$InputData = aVar7.f277402a;
                u5a.f fVar4 = (u5a.f) this.f269204b;
                kbb.c cVarB2 = fVar4.f277420l.b();
                wda.b bVarA = fVar4.f277421m.a();
                wsg.b bVarA2 = fVar4.f277422n.a();
                l70.e eVar4 = fVar4.k;
                c70.a aVarZ = eVar4.z();
                vc.s.j(aVarZ);
                r70.c cVarA2 = eVar4.A();
                vc.s.j(cVarA2);
                s70.a aVarM = eVar4.m();
                vc.s.j(aVarM);
                AccountDetailsPaymentControllerContract$InputData accountDetailsPaymentControllerContract$InputData2 = aVar7.f277402a;
                l6a.a aVar8 = new l6a.a();
                u5a.f fVar5 = aVar7.f277403b;
                wda.b bVarA3 = fVar5.f277421m.a();
                gte.a aVarB4 = fVar5.f277416c.b();
                vc.s.j(aVarB4);
                return new com.revolut.feature.payments_migration.impl.ui.screen.move_payment.account_details.a(accountDetailsPaymentControllerContract$InputData, cVarB2, bVarA, bVarA2, aVarZ, cVarA2, aVarM, new j6a.n(accountDetailsPaymentControllerContract$InputData2, aVar8, bVarA3, aVarB4));
            case 27:
                u5a.b bVar9 = (u5a.b) this.f269205c;
                CardsPaymentControllerContract$InputData cardsPaymentControllerContract$InputData = bVar9.f277405a;
                u5a.f fVar6 = bVar9.f277406b;
                l63.a aVar9 = (l63.a) fVar6.f277418h.u.get();
                vc.s.j(aVar9);
                o7.d dVar4 = new o7.d(aVar9);
                u5a.f fVar7 = (u5a.f) this.f269204b;
                da3.j jVar = fVar7.f277419j;
                ha3.f fVarD = jVar.d();
                vc.s.j(fVarD);
                l93.f fVarJ2 = jVar.j();
                vc.s.j(fVarJ2);
                l70.e eVar5 = fVar7.k;
                c70.a aVarZ2 = eVar5.z();
                vc.s.j(aVarZ2);
                r70.c cVarA3 = eVar5.A();
                vc.s.j(cVarA3);
                CardsPaymentControllerContract$InputData cardsPaymentControllerContract$InputData2 = bVar9.f277405a;
                l6a.a aVar10 = new l6a.a();
                m93.a aVarA3 = fVar6.f277419j.a();
                vc.s.j(aVarA3);
                return new k6a.s(cardsPaymentControllerContract$InputData, dVar4, fVarD, fVarJ2, aVarZ2, cVarA3, new k6a.u(cardsPaymentControllerContract$InputData2, aVar10, aVarA3));
            case 28:
                u5a.f fVar8 = (u5a.f) this.f269204b;
                v5a.c cVarA4 = fVar8.a();
                u5a.c cVar6 = (u5a.c) this.f269205c;
                u5a.f fVar9 = cVar6.f277408a;
                qe7.a aVarA4 = ((te7.b) fVar9.f).a();
                vc.s.j(aVarA4);
                pre.c cVarA5 = fVar9.f277417g.a();
                vc.s.j(cVarA5);
                v5a.g gVar3 = new v5a.g(aVarA4, cVarA5);
                l63.a aVar11 = (l63.a) fVar9.f277418h.u.get();
                vc.s.j(aVar11);
                return new com.revolut.feature.payments_migration.impl.ui.screen.migrate_subscriptions.c(cVarA4, gVar3, new o7.d(aVar11), new d6a.i(), new d6a.m(fVar9.a()), ((s41.a) fVar8.i).d(), new ac4.g(new i6a.b(cVar6.b(), new e6a.b()), new i6a.d(cVar6.b(), new e6a.b())));
            default:
                u5a.h hVar8 = (u5a.h) this.f269205c;
                u5a.f fVar10 = hVar8.f277432b;
                l63.a aVar12 = (l63.a) fVar10.f277418h.u.get();
                vc.s.j(aVar12);
                return new com.revolut.feature.payments_migration.impl.ui.screen.search.b(new o7.d(aVar12), ((s41.a) ((u5a.f) this.f269204b).i).d(), new d6a.i(), new d6a.m(fVar10.a()), hVar8.f277431a, new p6a.k(new e6a.a(new f6a.b(), new f6a.c(), new f6a.e(), new f6a.f(), new f6a.g(), new f6a.i(), new f6a.d()), new e6a.b()));
        }
    }
}
