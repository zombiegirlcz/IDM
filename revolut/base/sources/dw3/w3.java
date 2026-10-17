package dw3;

import com.revolut.feature.apm.payid.impl.flow.PayIdFlowContract$InputData;
import com.revolut.feature.card.verification.impl.flow.card_penny_topup.CardPennyTopUpFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.consent_preferences.preferences.LegacyConsentPreferencesScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.ticketor.ManualUnderwritingTicketorContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.preapplication.PreApplicationChecksScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.waiting_list.WaitingListFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.waiting_list_v3.WaitingListV3FlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.waiting_list_v3.dashboard.WaitingListV3DashboardScreenContract$InputData;
import com.revolut.feature.crypto.onboarding.impl.ui.fca.screen.learn.CryptoFcaLearnScreenContract$InputData;
import com.revolut.feature.defi.settings.impl.ui.recovery_phrase.consent.RecoveryPhraseConsentContract$InputData;
import com.revolut.feature.joint.impl.ui.deeplink.JointDeeplinkFlowContract$InputData;
import com.revolut.feature.joint.impl.ui.withdraw.JointWithdrawContract$InputData;
import com.revolut.feature.travel.flights.impl.ui.screen.checkin_details.TravelFlightsCheckInDetailsScreenContract$InputData;
import com.revolut.feature.wealth.analytics.ui.widgetised.dashboard.account_picker.AccountPickerContract$InputData;
import com.revolut.retail.feature.impl.budgeting.ui.rev10.goals.overview.GoalsOverviewScreenContract$InputData;
import com.revolut.retail.feature.impl.budgeting.ui.rev10.set_budgets.flow.SetBudgetsFlowContract$InputData;
import com.revolut.retail.feature.impl.userauth.flow.UserOnboardingFlowContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class w3 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f120057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f120058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f120059c;

    public /* synthetic */ w3(Object obj2, Object obj3, int i) {
        this.f120057a = i;
        this.f120058b = obj2;
        this.f120059c = obj3;
    }

    @Override // phm.a
    public final Object get() {
        switch (this.f120057a) {
            case 0:
                LegacyConsentPreferencesScreenContract$InputData legacyConsentPreferencesScreenContract$InputData = ((x3) this.f120059c).f120142a;
                return new d74.m(legacyConsentPreferencesScreenContract$InputData, (rw3.a) ((c1) this.f120058b).N2.get(), new d74.n(legacyConsentPreferencesScreenContract$InputData));
            case 1:
                hw3.d0 d0Var = (hw3.d0) ((c1) this.f120058b).T0.get();
                d4 d4Var = (d4) this.f120059c;
                ManualUnderwritingTicketorContract$InputData manualUnderwritingTicketorContract$InputData = d4Var.f118565a;
                z9l.i iVar = (z9l.i) ((vxc.b) d4Var.f118566b.J).f293051n.get();
                vc.s.j(iVar);
                return new xd4.i(d0Var, manualUnderwritingTicketorContract$InputData, new xd4.l(iVar));
            case 2:
                e5 e5Var = (e5) this.f120059c;
                PreApplicationChecksScreenContract$InputData preApplicationChecksScreenContract$InputData = e5Var.f118646a;
                c1 c1Var = (c1) this.f120058b;
                xq3.z zVar = (xq3.z) c1Var.f118428c.f282088e0.get();
                vc.s.j(zVar);
                return new com.revolut.feature.credit.application.plugins.impl.ui.preapplication.b(preApplicationChecksScreenContract$InputData, zVar, new com.revolut.feature.credit.application.models.preapplication.a(), c1Var.f118452l.a(), new rg4.x(e5Var.f118647b));
            case 3:
                c1 c1Var2 = (c1) this.f120058b;
                hw3.n nVar = (hw3.n) c1Var2.f118455m2.get();
                WaitingListFlowContract$InputData waitingListFlowContract$InputData = ((g7) this.f120059c).f118827a;
                q06.l lVarA = c1Var2.O.a();
                vc.s.j(lVarA);
                return new com.revolut.feature.credit.application.plugins.impl.ui.waiting_list.a(nVar, waitingListFlowContract$InputData, lVarA);
            case 4:
                WaitingListV3DashboardScreenContract$InputData waitingListV3DashboardScreenContract$InputData = ((h7) this.f120059c).f118915a;
                c1 c1Var3 = (c1) this.f120058b;
                hw3.n nVar2 = (hw3.n) c1Var3.f118455m2.get();
                r05.e eVarA = c1Var3.P.a();
                ang.f fVarE = c1Var3.k.e();
                q06.l lVarA2 = c1Var3.O.a();
                vc.s.j(lVarA2);
                return new pj4.k(waitingListV3DashboardScreenContract$InputData, nVar2, eVarA, fVarE, lVarA2, new pj4.l());
            case 5:
                WaitingListV3FlowContract$InputData waitingListV3FlowContract$InputData = ((i7) this.f120059c).f118985a;
                c1 c1Var4 = (c1) this.f120058b;
                hw3.n nVar3 = (hw3.n) c1Var4.f118455m2.get();
                y80.a aVarR = c1Var4.f118443h.r();
                vc.s.j(aVarR);
                return new com.revolut.feature.credit.application.plugins.impl.ui.waiting_list_v3.c(waitingListV3FlowContract$InputData, nVar3, aVarR);
            case 6:
                return new o48.i(((e48.i) this.f120059c).f122444a, ((e48.g) this.f120058b).f.e(), new o48.j());
            case 7:
                JointDeeplinkFlowContract$InputData jointDeeplinkFlowContract$InputData = ((e48.l) this.f120059c).f122453a;
                e48.g gVar = (e48.g) this.f120058b;
                return new com.revolut.feature.joint.impl.ui.deeplink.a(jointDeeplinkFlowContract$InputData, gVar.d.c(), new com.revolut.feature.joint.impl.ui.deeplink.b(), gVar.e.b());
            case 8:
                e48.q qVar = (e48.q) this.f120059c;
                JointWithdrawContract$InputData jointWithdrawContract$InputData = qVar.f122466a;
                qd0.b languageProvider = qVar.f122467b.v.n();
                vc.s.j(languageProvider);
                n58.a aVar = n58.b.Companion;
                aVar.getClass();
                Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
                w80.b bVarB = v80.b.b(languageProvider, false, false, 58);
                e48.g gVar2 = (e48.g) this.f120058b;
                wsg.n nVarB = gVar2.e.b();
                x8k.c cVarC = gVar2.f122438w.c();
                rea.m mVarF = gVar2.f122439x.f();
                ang.f fVarE2 = gVar2.f.e();
                wj0.a aVarI = ((nj0.d) gVar2.f122440y).i();
                vc.s.j(aVarI);
                u80.o oVar = new u80.o();
                aVar.getClass();
                return new com.revolut.feature.joint.impl.ui.withdraw.b(jointWithdrawContract$InputData, bVarB, nVarB, cVarC, mVarF, fVarE2, aVarI, new m58.p(oVar, new mp0.d(11)));
            case 9:
                k66.l lVar = new k66.l();
                c70.a aVarZ = ((e66.d) this.f120058b).f122930c.z();
                vc.s.j(aVarZ);
                return new com.revolut.feature.defi.settings.impl.ui.recovery_phrase.screen.a(lVar, aVarZ, ((e66.b) this.f120059c).f122924a);
            case 10:
                m66.h hVar = new m66.h();
                xv5.c cVarA = ((e66.d) this.f120058b).f122929b.a();
                vc.s.j(cVarA);
                return new m66.g(hVar, cVarA, ((e66.e) this.f120059c).f122932a);
            case 11:
                h66.h hVar2 = new h66.h();
                RecoveryPhraseConsentContract$InputData recoveryPhraseConsentContract$InputData = ((e66.f) this.f120059c).f122934a;
                b66.c cVar = (b66.c) ((e66.d) this.f120058b).f122931g.get();
                f66.a aVar2 = new f66.a();
                h66.c cVar2 = new h66.c();
                c66.c publicKeyDecoder = new c66.c();
                c66.h kdf2 = new c66.h();
                Intrinsics.checkNotNullParameter(publicKeyDecoder, "publicKeyDecoder");
                Intrinsics.checkNotNullParameter(kdf2, "kdf");
                return new h66.e(hVar2, recoveryPhraseConsentContract$InputData, cVar, aVar2, cVar2, new com.revolut.feature.defi.settings.impl.data.seed_phrase_export.crypto.g(new com.revolut.feature.defi.settings.impl.data.seed_phrase_export.crypto.e(), new com.revolut.feature.defi.settings.impl.data.seed_phrase_export.crypto.c(), new com.revolut.feature.defi.settings.impl.data.seed_phrase_export.crypto.b(), new c66.j(), new com.revolut.feature.defi.settings.impl.data.seed_phrase_export.crypto.d()));
            case 12:
                PayIdFlowContract$InputData payIdFlowContract$InputData = ((ea2.i) this.f120059c).f124084a;
                ea2.h hVar3 = (ea2.h) this.f120058b;
                cu8.r0 r0VarA = hVar3.f124075h.a();
                q12.a aVarG = hVar3.i.g();
                vc.s.j(aVarG);
                return new com.revolut.feature.apm.payid.impl.flow.a(payIdFlowContract$InputData, r0VarA, aVarG);
            case 13:
                ee6.b bVar = (ee6.b) this.f120058b;
                fe6.a aVar3 = (fe6.a) bVar.f125085m.get();
                jvh.a aVarA = bVar.f125082h.a();
                vc.s.j(aVarA);
                vil.g gVar3 = (vil.g) ((ljl.q0) ((ee6.c) this.f120059c).f125088a.f125079b).l0.get();
                vc.s.j(gVar3);
                return new ie6.r(aVar3, aVarA, new ie6.s(new ge6.h(gVar3)));
            case 14:
                ei5.b bVar2 = (ei5.b) this.f120059c;
                qi5.b riskCategoryDisclaimerProvider = new qi5.b();
                Intrinsics.checkNotNullParameter(riskCategoryDisclaimerProvider, "riskCategoryDisclaimerProvider");
                pi5.i iVar2 = new pi5.i();
                ei5.d dVar = (ei5.d) this.f120058b;
                f80.a aVarX = dVar.f126429m.x();
                vc.s.j(aVarX);
                CryptoFcaLearnScreenContract$InputData cryptoFcaLearnScreenContract$InputData = bVar2.f126418a;
                sd5.c cVarA2 = dVar.e.a();
                vc.s.j(cVarA2);
                return new pi5.f(iVar2, aVarX, cryptoFcaLearnScreenContract$InputData, cVarA2);
            case 15:
                oi5.c cVar3 = ((ei5.e) this.f120059c).f126439a;
                ei5.d dVar2 = (ei5.d) this.f120058b;
                til.m mVarA = dVar2.f126428l.a();
                vc.s.j(mVarA);
                return new com.revolut.feature.crypto.onboarding.impl.ui.eligibility.a(cVar3, mVarA, (ji5.i) dVar2.f126434s.get());
            case 16:
                ejg.a aVar4 = (ejg.a) this.f120059c;
                thf.c cVarC2 = aVar4.f126880b.f126885g.c();
                vc.s.j(cVarC2);
                return new com.revolut.feature.trusted_merchants.impl.ui.kompot.details.a(new jjg.j(new pjg.g(cVarC2)), (yig.a) ((ejg.b) this.f120058b).f126890n.get(), aVar4.f126879a);
            case 17:
                thf.c cVarC3 = ((ejg.e) this.f120059c).f126898a.f126885g.c();
                vc.s.j(cVarC3);
                return new com.revolut.feature.trusted_merchants.impl.ui.kompot.list.a(new i3g.k(new qjg.g(cVarC3)), (yig.a) ((ejg.b) this.f120058b).f126890n.get());
            case 18:
                ere.c cVar4 = (ere.c) this.f120058b;
                mli.e eVarB = ((j51.a) cVar4.f128650a).b();
                vc.s.j(eVarB);
                com.revolut.retail.feature.api.userauth.navigation.a aVarA2 = cVar4.f128651b.a();
                vc.s.j(aVarA2);
                return new com.revolut.feature.terminated_users.impl.ui.logout_confirmation.b(eVarB, aVarA2, ((ere.a) this.f120059c).f128646a);
            case 19:
                erj.k kVar = (erj.k) this.f120059c;
                SetBudgetsFlowContract$InputData setBudgetsFlowContract$InputData = kVar.f128714a;
                erj.h hVar4 = (erj.h) this.f120058b;
                pzi.b bVar3 = (pzi.b) hVar4.z.get();
                cmd.b bVar4 = (cmd.b) kVar.f128715b.f128698m.G0.get();
                vc.s.j(bVar4);
                erd.c cVar5 = new erd.c(bVar4, 1);
                tzi.a aVarA3 = hVar4.i.a();
                vc.s.j(aVarA3);
                return new com.revolut.retail.feature.impl.budgeting.ui.rev10.set_budgets.flow.b(setBudgetsFlowContract$InputData, bVar3, cVar5, aVarA3);
            case 20:
                erj.p pVar = (erj.p) this.f120059c;
                GoalsOverviewScreenContract$InputData goalsOverviewScreenContract$InputData = pVar.f128733b;
                erj.h hVar5 = (erj.h) this.f120058b;
                pzi.a aVar5 = (pzi.a) hVar5.B.get();
                pzi.b bVar5 = (pzi.b) hVar5.z.get();
                grj.j jVar = (grj.j) hVar5.E.get();
                ke3.e eVar = hVar5.f128694g;
                ge3.e eVarD = eVar.d();
                vc.s.j(eVarD);
                wsg.n nVarB2 = hVar5.f.b();
                tzi.a aVarA4 = hVar5.i.a();
                vc.s.j(aVarA4);
                mrj.a aVar6 = (mrj.a) hVar5.F.get();
                srj.c cVar6 = new srj.c();
                thf.c cVarC4 = hVar5.f128699n.c();
                vc.s.j(cVarC4);
                l80.e eVarH = hVar5.e.h();
                vc.s.j(eVarH);
                ang.f fVarE3 = hVar5.f128696j.e();
                g48.r0 r0VarC = hVar5.k.c();
                ge3.a aVarE = eVar.e();
                vc.s.j(aVarE);
                l5i.q qVarB = eVar.b();
                erj.h hVar6 = pVar.f128734c;
                thf.c cVarC5 = hVar6.f128699n.c();
                vc.s.j(cVarC5);
                srj.b bVar6 = new srj.b(cVarC5);
                mzi.b bVarF = ((dqj.r) hVar6.o).f();
                vc.s.j(bVarF);
                return new urj.n(goalsOverviewScreenContract$InputData, aVar5, bVar5, jVar, eVarD, nVarB2, aVarA4, aVar6, cVar6, cVarC4, eVarH, fVarE3, r0VarC, aVarE, qVarB, new urj.r(bVar6, bVarF));
            case 21:
                erj.p pVar2 = (erj.p) this.f120059c;
                GoalsOverviewScreenContract$InputData goalsOverviewScreenContract$InputData2 = pVar2.f128733b;
                erj.h hVar7 = (erj.h) this.f120058b;
                pzi.a aVar7 = (pzi.a) hVar7.B.get();
                pzi.b bVar7 = (pzi.b) hVar7.z.get();
                grj.j jVar2 = (grj.j) hVar7.E.get();
                ke3.e eVar2 = hVar7.f128694g;
                ge3.e eVarD2 = eVar2.d();
                vc.s.j(eVarD2);
                wsg.n nVarB3 = hVar7.f.b();
                tzi.a aVarA5 = hVar7.i.a();
                vc.s.j(aVarA5);
                mrj.a aVar8 = (mrj.a) hVar7.F.get();
                srj.c cVar7 = new srj.c();
                thf.c cVarC6 = hVar7.f128699n.c();
                vc.s.j(cVarC6);
                l80.e eVarH2 = hVar7.e.h();
                vc.s.j(eVarH2);
                ang.f fVarE4 = hVar7.f128696j.e();
                g48.r0 r0VarC2 = hVar7.k.c();
                ge3.a aVarE2 = eVar2.e();
                vc.s.j(aVarE2);
                l5i.q qVarB2 = eVar2.b();
                erj.h hVar8 = pVar2.f128734c;
                thf.c cVarC7 = hVar8.f128699n.c();
                vc.s.j(cVarC7);
                srj.b bVar8 = new srj.b(cVarC7);
                mzi.b bVarF2 = ((dqj.r) hVar8.o).f();
                vc.s.j(bVarF2);
                return new urj.n(goalsOverviewScreenContract$InputData2, aVar7, bVar7, jVar2, eVarD2, nVarB3, aVarA5, aVar8, cVar7, cVarC6, eVarH2, fVarE4, r0VarC2, aVarE2, qVarB2, new urj.r(bVar8, bVarF2));
            case 22:
                CardPennyTopUpFlowContract$InputData cardPennyTopUpFlowContract$InputData = ((ev2.a) this.f120059c).f129680a;
                ev2.c cVar8 = (ev2.c) this.f120058b;
                jvh.a aVarA6 = cVar8.d.a();
                vc.s.j(aVarA6);
                til.m mVarA2 = cVar8.e.a();
                vc.s.j(mVarA2);
                return new com.revolut.feature.card.verification.impl.flow.card_penny_topup.b(cardPennyTopUpFlowContract$InputData, aVarA6, mVarA2);
            case 23:
                ev2.b bVar9 = (ev2.b) this.f120059c;
                kv2.g gVar4 = bVar9.f129683a;
                kv2.m mVar = new kv2.m(gVar4, bVar9.f129684b.f129687b.a());
                y51.a aVarA7 = ((ev2.c) this.f120058b).f129688c.a();
                vc.s.j(aVarA7);
                return new kv2.k(mVar, gVar4, aVarA7);
            case 24:
                ewg.b bVar10 = (ewg.b) this.f120059c;
                AccountPickerContract$InputData accountPickerContract$InputData = bVar10.f130172a;
                kpj.f fVar = new kpj.f((hwg.a) ((ewg.h) this.f120058b).l0.get());
                kwg.b bVarC = bVar10.f130174c.c();
                ewg.h hVar9 = bVar10.f130173b;
                xoj.a aVarA8 = hVar9.f130203l.a();
                vc.s.j(aVarA8);
                gte.a aVarB = hVar9.k.b();
                vc.s.j(aVarB);
                tzg.m mVarT = hVar9.i.t();
                vc.s.j(mVarT);
                return new jyg.n(accountPickerContract$InputData, fVar, new jwg.h((kwg.l) bVarC, aVarA8, aVarB, mVarT, hVar9.d()), new jyg.p(new uyg.l(hVar9.c()), hVar9.c()));
            case 25:
                ewj.d dVar3 = (ewj.d) this.f120059c;
                UserOnboardingFlowContract$InputData userOnboardingFlowContract$InputData = dVar3.f130316a;
                ewj.c cVar9 = (ewj.c) this.f120058b;
                zvj.a aVar9 = cVar9.f130303a;
                fwj.p pVarA = aVar9.a();
                vc.s.j(pVarA);
                xmg.a aVar10 = cVar9.f130304b;
                ing.b bVarA = aVar10.a();
                vc.s.j(bVarA);
                ewj.c cVar10 = dVar3.f130317b;
                l70.e eVar3 = cVar10.f130305c;
                z80.b bVarS = eVar3.s();
                vc.s.j(bVarS);
                fwj.p pVarA2 = cVar10.f130303a.a();
                vc.s.j(pVarA2);
                qd0.b bVarN = eVar3.n();
                vc.s.j(bVarN);
                fk3.a aVarA9 = cVar10.d.a();
                vc.s.j(aVarA9);
                h30.q qVar2 = new h30.q(bVarS, pVarA2, bVarN, aVarA9);
                fwj.p pVarA3 = cVar10.f130303a.a();
                vc.s.j(pVarA3);
                fk3.a aVarA10 = cVar10.d.a();
                vc.s.j(aVarA10);
                n8b.a aVarA11 = cVar10.e.a();
                vc.s.j(aVarA11);
                hxj.b bVar11 = new hxj.b(pVarA3, aVarA10, aVarA11);
                ljl.q1 q1Var = cVar9.f;
                bjl.f fVar2 = (bjl.f) ((ljl.q0) q1Var).f196066k0.get();
                vc.s.j(fVar2);
                fkl.i iVar3 = (fkl.i) ((ljl.q0) q1Var).j0.get();
                vc.s.j(iVar3);
                wl0.c cVarA3 = cVar10.f130306g.a();
                pre.c cVarA4 = cVar10.f130307h.a();
                vc.s.j(cVarA4);
                yme.a aVarA12 = cVar10.i.a();
                vc.s.j(aVarA12);
                fwj.p pVarA4 = cVar10.f130303a.a();
                vc.s.j(pVarA4);
                mli.e eVarA2 = ((j51.a) cVar10.f130308j).a();
                vc.s.j(eVarA2);
                fwj.b bVar12 = new fwj.b(cVarA3, cVarA4, aVarA12, pVarA4, eVarA2);
                com.revolut.retail.feature.api.userauth.navigation.a aVarA13 = cVar9.k.a();
                vc.s.j(aVarA13);
                jte.c cVarA5 = cVar9.f130309l.a();
                vc.s.j(cVarA5);
                xoj.a aVarA14 = cVar9.f130310m.a();
                vc.s.j(aVarA14);
                dl0.a aVar11 = (dl0.a) cVar9.f130311n.f127229c.get();
                vc.s.j(aVar11);
                v60.g gVarA = ((a0b.d) cVar9.o).a();
                bng.b bVar13 = new bng.b(aVar10.e(), 0);
                b90.e eVar4 = (b90.e) cVar9.f130305c.U.get();
                vc.s.j(eVar4);
                f86.a aVar12 = (f86.a) cVar9.f130312p.d.get();
                vc.s.j(aVar12);
                sf0.h hVarB = cVar9.f130313q.b();
                vc.s.j(hVarB);
                v60.e eVarA3 = cVar9.f130314r.a();
                vc.s.j(eVarA3);
                w31.e deviceFingerprintInteractor = ((x31.a) aVar9.B).a();
                vc.s.j(deviceFingerprintInteractor);
                fwj.d userAuthAnalyticsInteractor = (fwj.d) aVar9.f325704r.f10791b.get();
                vc.s.j(userAuthAnalyticsInteractor);
                fwj.p userOnboardingInteractor = (fwj.p) aVar9.M.get();
                Intrinsics.checkNotNullParameter(deviceFingerprintInteractor, "deviceFingerprintInteractor");
                Intrinsics.checkNotNullParameter(userAuthAnalyticsInteractor, "userAuthAnalyticsInteractor");
                Intrinsics.checkNotNullParameter(userOnboardingInteractor, "userOnboardingInteractor");
                uc.d dVar4 = new uc.d();
                dVar4.f278952a = deviceFingerprintInteractor;
                dVar4.f278953b = userAuthAnalyticsInteractor;
                dVar4.f278954c = userOnboardingInteractor;
                cwj.a aVar13 = (cwj.a) aVar9.P.get();
                vc.s.j(aVar13);
                mli.e eVarB2 = ((j51.a) cVar9.f130308j).b();
                vc.s.j(eVarB2);
                zm0.c cVarJ = cVar9.f130306g.j();
                vc.s.j(cVarJ);
                return new com.revolut.retail.feature.impl.userauth.flow.f(userOnboardingFlowContract$InputData, pVarA, bVarA, qVar2, bVar11, fVar2, iVar3, bVar12, aVarA13, cVarA5, aVarA14, aVar11, gVarA, bVar13, eVar4, aVar12, hVarB, eVarA3, dVar4, aVar13, eVarB2, cVarJ);
            case 26:
                eyd.d dVar5 = (eyd.d) this.f120059c;
                zyd.p pVar3 = new zyd.p(dVar5.f130725b.f.g());
                zyd.h hVar10 = dVar5.f130724a;
                eyd.b0 b0Var = (eyd.b0) this.f120058b;
                wsg.n nVarB4 = b0Var.i.b();
                vxd.b bVar14 = b0Var.f130699c;
                zxd.c cVarA6 = ((eyd.b) bVar14).a();
                vc.s.j(cVarA6);
                return new zyd.m(pVar3, hVar10, nVarB4, cVarA6, ((eyd.b) bVar14).c(), new vyd.a());
            case 27:
                return new j5g.d(new j5g.e(), ((f4g.i) this.f120059c).f132125a, (b4g.o0) ((f4g.b) this.f120058b).f132068t.get());
            case 28:
                o5g.j jVar3 = new o5g.j();
                TravelFlightsCheckInDetailsScreenContract$InputData travelFlightsCheckInDetailsScreenContract$InputData = ((f4g.j) this.f120059c).f132130a;
                f4g.b bVar15 = (f4g.b) this.f120058b;
                b4g.f fVar3 = (b4g.f) bVar15.f132067s.get();
                c70.a aVarZ2 = bVar15.d.z();
                vc.s.j(aVarZ2);
                return new o5g.i(jVar3, travelFlightsCheckInDetailsScreenContract$InputData, fVar3, aVarZ2);
            default:
                f4g.k kVar2 = (f4g.k) this.f120059c;
                n5g.a boundsSectionMapper = new n5g.a();
                n5g.c instructionsSectionMapper = new n5g.c();
                q4g.n separateTicketsBannerMapper = new q4g.n();
                Intrinsics.checkNotNullParameter(boundsSectionMapper, "boundsSectionMapper");
                Intrinsics.checkNotNullParameter(instructionsSectionMapper, "instructionsSectionMapper");
                Intrinsics.checkNotNullParameter(separateTicketsBannerMapper, "separateTicketsBannerMapper");
                return new com.revolut.feature.travel.flights.impl.ui.screen.checkin.a(new at.r(new r39.a()), kVar2.f132135a, (b4g.f) ((f4g.b) this.f120058b).f132067s.get());
        }
    }
}
