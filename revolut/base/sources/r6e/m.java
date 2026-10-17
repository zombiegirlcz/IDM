package r6e;

import android.content.Context;
import com.revolut.feature.hidden_accounts.impl.ui.biometric_authentication.BiometricAuthenticationFlowContract$InputData;
import com.revolut.feature.hidden_accounts.impl.ui.secret_accounts_flow.CreateSecretPhraseFlowContract$InputData;
import com.revolut.feature.junior_allowance.impl.ui.flow.allowance.JuniorAllowanceFlowContract$InputData;
import com.revolut.feature.junior_allowance.impl.ui.screen.allowance_pager.JuniorAllowancePagerScreenContract$Input;
import com.revolut.feature.onboarding.impl.exchange_global_access.flow.ExchangeGlobalAccessFlowContract$InputData;
import com.revolut.feature.onboarding.impl.exchange_global_access.flow_v2.ExchangeGlobalAccessFlowV2Contract$InputData;
import com.revolut.feature.payments.who_to_transfer.impl.ui.flow.tab_payments.TabPaymentsFlowContract$InputData;
import com.revolut.feature.shared.help_centre.impl.faq.flow.SharedFaqLazyFlowContract$InputData;
import com.revolut.feature.subaccount.impl.ui.add_money.flow.SubaccountAddMoneyFlowContract$InputData;
import com.revolut.feature.subaccount.impl.ui.invite.screen.decline.VaultInvitationDeclineScreenContract$InputData;
import com.revolut.feature.trade_rev_points.impl.ui.flow.agent_details.TradeRevPointsAgentDetailsFlowContract$InputData;
import com.revolut.feature.trade_rev_points.impl.ui.screen.account_registration.TradeRevPointsAccountRegistrationScreenContract$InputData;
import com.revolut.feature.trade_rev_points.impl.ui.screen.account_registration_tax_id.TradeRevPointsAccountRegistrationTaxIdScreenContract$InputData;
import com.revolut.feature.wealth.options.ui.impl.data.network.OptionsApiService;
import com.revolut.feature.wealth.options.ui.impl.ui.tab.OptionsTabControllerContract$Input;
import com.revolut.feature.web_sign_in.navigation.WebSignInDestinationInput;
import com.revolut.feature_retail_user_declarations.bank_terms.AcceptBankTermsScreenContract$InputData;
import com.revolut.retail.feature.impl.rewards_hub.ui.screen.eligibility_criteria.EligibilityCriteriaScreenContract$InputData;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class m implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f251765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f251766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f251767c;

    public /* synthetic */ m(Object obj2, Object obj3, int i) {
        this.f251765a = i;
        this.f251766b = obj2;
        this.f251767c = obj3;
    }

    @Override // phm.a
    public final Object get() {
        switch (this.f251765a) {
            case 0:
                n nVar = (n) this.f251767c;
                SubaccountAddMoneyFlowContract$InputData subaccountAddMoneyFlowContract$InputData = nVar.f251768a;
                o oVar = (o) this.f251766b;
                g6e.d dVarB = oVar.f251773c.b();
                vc.s.j(dVarB);
                w5i.b bVarB = nVar.f251769b.J.b();
                vc.s.j(bVarB);
                n7e.h hVar = new n7e.h(bVarB);
                Context context = oVar.f251777l;
                k0.Companion.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                zfe.g.Companion.getClass();
                return new com.revolut.feature.subaccount.impl.ui.add_money.flow.b(subaccountAddMoneyFlowContract$InputData, dVarB, hVar, zfe.f.a(context));
            case 1:
                o oVar2 = (o) this.f251766b;
                g6e.b bVarA = oVar2.f251775h.a();
                vc.s.j(bVarA);
                pqi.a aVar = oVar2.f251785w;
                tqi.g gVarE = aVar.e();
                c70.a aVarZ = oVar2.o.z();
                vc.s.j(aVarZ);
                f01.c cVarG = aVar.g();
                r rVar = (r) this.f251767c;
                return new com.revolut.feature.subaccount.impl.ui.qr_link.a(bVarA, gVarE, aVarZ, cVarG, rVar.f251796a, new t8e.g(rVar.f251797b.o.d()));
            case 2:
                VaultInvitationDeclineScreenContract$InputData vaultInvitationDeclineScreenContract$InputData = ((v) this.f251767c).f251811a;
                m8e.k kVar = new m8e.k(vaultInvitationDeclineScreenContract$InputData);
                ppg.b bVarB2 = ((wpg.l) ((o) this.f251766b).i).b();
                vc.s.j(bVarB2);
                return new m8e.m(kVar, vaultInvitationDeclineScreenContract$InputData, bVarB2);
            case 3:
                w wVar = (w) this.f251767c;
                k8e.d dVar = wVar.f251813a;
                o oVar3 = (o) this.f251766b;
                wsg.n nVarB = oVar3.k.b();
                ppg.b bVarB3 = ((wpg.l) oVar3.i).b();
                vc.s.j(bVarB3);
                Context context2 = wVar.f251814b.f251777l;
                j8e.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(context2, "context");
                zfe.e.Companion.getClass();
                zfe.e eVarA = zfe.d.a(context2);
                l89.b bVar = oVar3.f251778m;
                s99.i iVarB = ((s99.a) bVar).b();
                t99.k kVarA = ((s99.a) bVar).a();
                vc.s.j(kVarA);
                return new com.revolut.feature.subaccount.impl.ui.invite.flow.b(dVar, nVarB, bVarB3, eVarA, iVarB, kVarA);
            case 4:
                SharedFaqLazyFlowContract$InputData sharedFaqLazyFlowContract$InputData = ((r7d.u) this.f251767c).f252179a;
                r7d.l lVar = (r7d.l) this.f251766b;
                return new com.revolut.feature.shared.help_centre.impl.faq.flow.b(sharedFaqLazyFlowContract$InputData, lVar.c(), lVar.f252129a.c());
            case 5:
                rb8.b bVar2 = (rb8.b) this.f251767c;
                JuniorAllowanceFlowContract$InputData juniorAllowanceFlowContract$InputData = bVar2.f252986a;
                rb8.a aVar2 = (rb8.a) this.f251766b;
                wsg.n nVarB2 = aVar2.f252977g.b();
                hj8.a aVarA = aVar2.e.a();
                vc.s.j(aVarA);
                xua.a aVarA2 = aVar2.f252978h.a();
                vc.s.j(aVarA2);
                rb8.a aVar3 = bVar2.f252987b;
                l80.e eVarH = aVar3.i.h();
                vc.s.j(eVarH);
                cc8.a aVar4 = new cc8.a(eVarH, bVar2.f252986a);
                sb8.a aVar5 = (sb8.a) aVar2.f252984q.get();
                yb8.a aVar6 = new yb8.a();
                gte.a aVarB = aVar2.f252979j.b();
                vc.s.j(aVarB);
                l80.e eVarH2 = aVar3.i.h();
                vc.s.j(eVarH2);
                bc8.b bVar3 = new bc8.b(eVarH2, new te8.t(aVar3.k.f()));
                te8.z zVarE = aVar2.k.e();
                vc.s.j(zVarE);
                return new com.revolut.feature.junior_allowance.impl.ui.flow.allowance.a(juniorAllowanceFlowContract$InputData, nVarB2, aVarA, aVarA2, aVar4, aVar5, aVar6, aVarB, bVar3, zVarE);
            case 6:
                JuniorAllowancePagerScreenContract$Input juniorAllowancePagerScreenContract$Input = ((rb8.c) this.f251767c).f252989a;
                dc8.g gVar = new dc8.g();
                rb8.a aVar7 = (rb8.a) this.f251766b;
                return new dc8.f(juniorAllowancePagerScreenContract$Input, gVar, aVar7.f252980l.e(), aVar7.b());
            case 7:
                rb8.d dVar2 = (rb8.d) this.f251767c;
                l80.e eVarH3 = dVar2.f252992b.i.h();
                vc.s.j(eVarH3);
                a3e.u uVar = new a3e.u(new fc8.c(eVarH3));
                ec8.h hVar2 = dVar2.f252991a;
                rb8.a aVar8 = (rb8.a) this.f251766b;
                ang.f fVarE = aVar8.f252980l.e();
                hj8.a aVarA3 = aVar8.e.a();
                vc.s.j(aVarA3);
                ao.h hVarA = aVar8.f.a();
                om4.d0 d0VarB = aVar8.b();
                gte.a aVarB2 = aVar8.f252979j.b();
                vc.s.j(aVarB2);
                return new com.revolut.feature.junior_allowance.impl.ui.screen.list.a(uVar, hVar2, fVarE, aVarA3, hVarA, d0VarB, aVarB2);
            case 8:
                rc5.c cVar = (rc5.c) this.f251767c;
                uc5.b bVar4 = cVar.f253202a;
                rc5.b bVar5 = (rc5.b) this.f251766b;
                utd.a aVarG = bVar5.f253197a.g();
                com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) bVar5.d).c();
                vc.s.j(aVarC);
                rc5.b bVar6 = cVar.f253203b;
                thf.g gVarE2 = bVar6.e.e();
                vc.s.j(gVarE2);
                l80.e eVarH4 = bVar6.f.h();
                vc.s.j(eVarH4);
                return new uc5.g(bVar4, aVarG, aVarC, new uc5.f(bVar4, gVarE2, eVarH4));
            case 9:
                veh.n nVar2 = new veh.n();
                OptionsTabControllerContract$Input optionsTabControllerContract$Input = ((reh.a) this.f251767c).f253586a;
                reh.b bVar7 = (reh.b) this.f251766b;
                neh.b bVar8 = new neh.b((OptionsApiService) bVar7.e.get(), (ne0.j) bVar7.f.get(), (ue0.c) bVar7.f253591g.get());
                zdl.c cVar2 = bVar7.f253590c;
                ybl.b bVarB4 = cVar2.b();
                vc.s.j(bVarB4);
                rul.e eVar = new rul.e(bVar8, bVarB4);
                ybl.b bVarB5 = cVar2.b();
                vc.s.j(bVarB5);
                return new veh.k(nVar2, optionsTabControllerContract$Input, eVar, bVarB5);
            case 10:
                EligibilityCriteriaScreenContract$InputData eligibilityCriteriaScreenContract$InputData = ((rtj.b) this.f251767c).f257267a;
                rtj.g gVar2 = (rtj.g) this.f251766b;
                return new guj.d(eligibilityCriteriaScreenContract$InputData, (stj.h) gVar2.f257288n.get(), ((s41.a) gVar2.f257283g).d(), new guj.g());
            case 11:
                rtj.c cVar3 = (rtj.c) this.f251767c;
                rtj.g gVar3 = cVar3.f257270b;
                l80.e eVarH5 = gVar3.f257284h.h();
                vc.s.j(eVarH5);
                return new auj.n(new auj.q(new vtj.c(eVarH5)), cVar3.f257269a, new stj.b((stj.h) gVar3.f257288n.get()), (stj.h) ((rtj.g) this.f251766b).f257288n.get());
            case 12:
                ryc.a aVar9 = (ryc.a) this.f251767c;
                ryc.b bVar9 = (ryc.b) this.f251766b;
                pyc.f fVar = (pyc.f) bVar9.f258302r.get();
                t70.g gVarO = bVar9.f258293c.o();
                vc.s.j(gVarO);
                qyc.q qVar = new qyc.q(fVar, gVarO);
                kli.a.p(qVar, bq.i.d(((ryc.c) aVar9.f258289a).f258307a));
                return qVar;
            case 13:
                jx0.a aVar10 = (jx0.a) this.f251767c;
                ryc.b bVar10 = (ryc.b) this.f251766b;
                pyc.f fVar2 = (pyc.f) bVar10.f258302r.get();
                t70.g gVarO2 = bVar10.f258293c.o();
                vc.s.j(gVarO2);
                azc.q qVar2 = new azc.q(fVar2, gVarO2);
                kli.a.p(qVar2, bq.i.d(((ryc.c) aVar10.f179038b).f258307a));
                return qVar2;
            case 14:
                kdh.b bVar11 = (kdh.b) this.f251767c;
                ryc.b bVar12 = (ryc.b) this.f251766b;
                bzc.b0 b0Var = new bzc.b0((pyc.h) bVar12.f258304t.get(), (pyc.f) bVar12.f258302r.get(), (bzc.b) bVar12.f258305w.get(), (mxc.b) bVar12.f258306x.get());
                kli.a.p(b0Var, bq.i.d(((ryc.c) bVar11.f182899b).f258307a));
                return b0Var;
            case 15:
                return new y4a.b(((s3a.i) this.f251767c).f259520a, (h4a.a) ((s3a.k) this.f251766b).j0.get());
            case 16:
                TabPaymentsFlowContract$InputData tabPaymentsFlowContract$InputData = ((s3a.j) this.f251767c).f259522a;
                s3a.k kVar2 = (s3a.k) this.f251766b;
                pn3.a aVar11 = (pn3.a) kVar2.f259547s0.get();
                s70.a aVarM = kVar2.f259532g.m();
                vc.s.j(aVarM);
                return new com.revolut.feature.payments.who_to_transfer.impl.ui.flow.tab_payments.a(tabPaymentsFlowContract$InputData, aVar11, aVarM, new k5a.a(), (ue0.c) kVar2.f259545r0.get());
            case 17:
                ExchangeGlobalAccessFlowContract$InputData exchangeGlobalAccessFlowContract$InputData = ((s99.b) this.f251767c).f261133a;
                s99.a aVar12 = (s99.a) this.f251766b;
                ila.b bVar13 = aVar12.f261128b;
                fn2.c cVarB = bVar13.b();
                jla.h hVarA2 = bVar13.a();
                pre.c cVarA = aVar12.f261129c.a();
                vc.s.j(cVarA);
                ang.f fVarE2 = aVar12.f261127a.e();
                zja.a aVarA4 = ((ika.b) aVar12.d).a();
                vc.s.j(aVarA4);
                return new com.revolut.feature.onboarding.impl.exchange_global_access.flow.a(exchangeGlobalAccessFlowContract$InputData, cVarB, hVarA2, cVarA, fVarE2, aVarA4);
            case 18:
                ExchangeGlobalAccessFlowV2Contract$InputData exchangeGlobalAccessFlowV2Contract$InputData = ((s99.c) this.f251767c).f261135a;
                s99.a aVar13 = (s99.a) this.f251766b;
                ila.b bVar14 = aVar13.f261128b;
                fn2.c cVarB2 = bVar14.b();
                jla.h hVarA3 = bVar14.a();
                ang.f fVarE3 = aVar13.f261127a.e();
                zja.a aVarA5 = ((ika.b) aVar13.d).a();
                vc.s.j(aVarA5);
                tja.a aVar14 = (tja.a) aVar13.e.f263700p.get();
                vc.s.j(aVar14);
                til.m mVarA = aVar13.f.a();
                vc.s.j(mVarA);
                return new com.revolut.feature.onboarding.impl.exchange_global_access.flow_v2.c(exchangeGlobalAccessFlowV2Contract$InputData, cVarB2, hVarA3, fVarE3, aVarA5, aVar14, mVarA, aVar13.f261130g.a(), new s99.j(), new u99.a());
            case 19:
                sf1.o oVar4 = (sf1.o) this.f251767c;
                ag1.b bVar15 = oVar4.f262294a;
                ag1.h hVar3 = new ag1.h(bVar15, new bg1.a((Map) oVar4.f262295b.K.get()));
                sf1.n nVar3 = (sf1.n) this.f251766b;
                return new ag1.o(hVar3, bVar15, (tf1.o) nVar3.O.get(), (tf1.q) nVar3.N.get());
            case 20:
                return new com.revolut.feature.apm.bills.boleto.impl.finder.onboarding.a(((sm1.h) this.f251767c).f264327a, (en1.a) ((sm1.d) this.f251766b).f264316m.get(), new an1.c());
            case 21:
                WebSignInDestinationInput webSignInDestinationInput = ((srh.d) this.f251767c).f265222a;
                njl.a aVar15 = ((srh.b) this.f251766b).f265216a;
                xjl.r rVar2 = (xjl.r) aVar15.f216603b.get();
                vc.s.j(rVar2);
                xjl.s sVar = (xjl.s) aVar15.f216604c.get();
                vc.s.j(sVar);
                return new com.revolut.feature.web_sign_in.ui.flow.web_sign_in.a(webSignInDestinationInput, rVar2, sVar);
            case 22:
                su8.b bVar16 = (su8.b) this.f251767c;
                uu8.a aVar16 = bVar16.f265688a;
                return new uu8.d(aVar16, ((su8.a) this.f251766b).a(), new uu8.c(aVar16, bVar16.f265689b.a()));
            case 23:
                TradeRevPointsAccountRegistrationTaxIdScreenContract$InputData tradeRevPointsAccountRegistrationTaxIdScreenContract$InputData = ((t1f.b) this.f251767c).f267279a;
                c2f.o oVar5 = new c2f.o(tradeRevPointsAccountRegistrationTaxIdScreenContract$InputData);
                t1f.h hVar4 = (t1f.h) this.f251766b;
                return new c2f.l(oVar5, tradeRevPointsAccountRegistrationTaxIdScreenContract$InputData, hVar4.a(), hVar4.c());
            case 24:
                t1f.e eVar2 = (t1f.e) this.f251767c;
                TradeRevPointsAgentDetailsFlowContract$InputData tradeRevPointsAgentDetailsFlowContract$InputData = eVar2.f267287a;
                t1f.h hVar5 = (t1f.h) this.f251766b;
                w1c.j jVar = hVar5.f267300g;
                tsk.t tVarA = hVar5.a();
                v1f.c cVar4 = new v1f.c();
                TradeRevPointsAgentDetailsFlowContract$InputData inputData = eVar2.f267287a;
                w1f.d defaultDialogConfigProvider = new w1f.b();
                w1f.e getMorePointsDialogConfigProvider = new w1f.e();
                x1f.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(inputData, "inputData");
                Intrinsics.checkNotNullParameter(defaultDialogConfigProvider, "defaultDialogConfigProvider");
                Intrinsics.checkNotNullParameter(getMorePointsDialogConfigProvider, "getMorePointsDialogConfigProvider");
                if (x1f.a.f302399a[inputData.getF91116b().ordinal()] == 1) {
                    defaultDialogConfigProvider = getMorePointsDialogConfigProvider;
                }
                return new com.revolut.feature.trade_rev_points.impl.ui.flow.agent_details.c(tradeRevPointsAgentDetailsFlowContract$InputData, tVarA, new y1f.g(cVar4, defaultDialogConfigProvider), jVar.a(), jVar.b());
            case 25:
                a2f.s sVar2 = new a2f.s();
                t1f.n nVar4 = (t1f.n) this.f251767c;
                TradeRevPointsAccountRegistrationScreenContract$InputData tradeRevPointsAccountRegistrationScreenContract$InputData = nVar4.f267331b;
                t1f.h hVar6 = (t1f.h) this.f251766b;
                tsk.t tVarA2 = hVar6.a();
                sf0.h hVarB = nVar4.f267332c.f267304m.b();
                vc.s.j(hVarB);
                return new a2f.p(sVar2, tradeRevPointsAccountRegistrationScreenContract$InputData, tVarA2, new kl.b0(hVarB), hVar6.f267310t.e(), hVar6.c());
            case 26:
                a2f.s sVar3 = new a2f.s();
                t1f.n nVar5 = (t1f.n) this.f251767c;
                TradeRevPointsAccountRegistrationScreenContract$InputData tradeRevPointsAccountRegistrationScreenContract$InputData2 = nVar5.f267331b;
                t1f.h hVar7 = (t1f.h) this.f251766b;
                tsk.t tVarA3 = hVar7.a();
                sf0.h hVarB2 = nVar5.f267332c.f267304m.b();
                vc.s.j(hVarB2);
                return new a2f.p(sVar3, tradeRevPointsAccountRegistrationScreenContract$InputData2, tVarA3, new kl.b0(hVarB2), hVar7.f267310t.e(), hVar7.c());
            case 27:
                BiometricAuthenticationFlowContract$InputData biometricAuthenticationFlowContract$InputData = ((ta7.b) this.f251767c).f269114a;
                ta7.d dVar3 = (ta7.d) this.f251766b;
                an0.c cVar5 = dVar3.d;
                cn0.c cVar6 = (cn0.c) cVar5.A.get();
                vc.s.j(cVar6);
                zm0.b bVarI = cVar5.i();
                vc.s.j(bVarI);
                hn0.n nVarH = cVar5.h();
                vc.s.j(nVarH);
                oe9.a aVar17 = (oe9.a) dVar3.e.i.get();
                vc.s.j(aVar17);
                cn0.e eVarE = cVar5.e();
                vc.s.j(eVarE);
                return new com.revolut.feature.hidden_accounts.impl.ui.biometric_authentication.b(biometricAuthenticationFlowContract$InputData, cVar6, bVarI, nVarH, aVar17, eVarE);
            case 28:
                CreateSecretPhraseFlowContract$InputData createSecretPhraseFlowContract$InputData = ((ta7.c) this.f251767c).f269116a;
                ta7.d dVar4 = (ta7.d) this.f251766b;
                wa7.m mVarI = dVar4.f269119a.i();
                za7.b bVar17 = new za7.b();
                zja.a aVarA6 = ((ika.b) dVar4.f).a();
                vc.s.j(aVarA6);
                return new com.revolut.feature.hidden_accounts.impl.ui.secret_accounts_flow.c(createSecretPhraseFlowContract$InputData, mVarI, bVar17, aVarA6);
            default:
                oai.c cVar7 = (oai.c) this.f251767c;
                AcceptBankTermsScreenContract$InputData acceptBankTermsScreenContract$InputData = cVar7.f223666b;
                bai.q qVar3 = new bai.q(acceptBankTermsScreenContract$InputData, new dai.a());
                AcceptBankTermsScreenContract$InputData acceptBankTermsScreenContract$InputData2 = cVar7.f223666b;
                ore.b bVar18 = ((ta9.m) this.f251766b).f269238b;
                pre.c cVarA2 = bVar18.a();
                vc.s.j(cVarA2);
                mre.c cVarB3 = bVar18.b();
                vc.s.j(cVarB3);
                n8b.b bVarB6 = ((ta9.m) cVar7.d).f269245j.b();
                vc.s.j(bVarB6);
                return new com.revolut.feature_retail_user_declarations.bank_terms.a(qVar3, acceptBankTermsScreenContract$InputData2, cVarA2, cVarB3, new bai.r(acceptBankTermsScreenContract$InputData, bVarB6));
        }
    }
}
