package xf6;

import com.revolut.feature.cashback.impl.ui.yourcashback.YourCashbackFlowContract$InputData;
import com.revolut.feature.external_accounts.impl.flow.link_result.LinkResultFlowContract$InputData;
import com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.accounts_au.OpenBankingAuthAccountsAuFlowContract$InputData;
import com.revolut.feature.external_accounts.impl.ui.brazil.consent_details.BrazilConsentDetailsScreenContract$InputData;
import com.revolut.feature.external_accounts.impl.ui.brazil.consents.BrazilConsentsScreenContract$InputData;
import com.revolut.feature.external_accounts.impl.ui.brazil.payment_confirmation.screen.expiry_date_update.BrPaymentExpiryDateUpdateScreenContract$InputData;
import com.revolut.feature.external_accounts.impl.ui.brazil.pix_branch_selection.PixBranchSelectionScreenContract$InputData;
import com.revolut.feature.external_accounts.impl.ui.colombia.pse.topup.PseTopupFlowContract$InputData;
import com.revolut.feature.external_accounts.impl.ui.india.upi.flow.UpiTransferFlowContract$InputData;
import com.revolut.feature.giro.api.navigation.GiroCreationFlowInputData;
import com.revolut.feature.trading_orders.api.invest.placement.InvestOrderContract$InputData;
import com.revolut.feature.trading_orders.api.ui.details_pager.InvestOrderDetailsPagerFeatureContract$InputData;
import com.revolut.oauth.impl.ui.consent.screen.ConsentScreenContract$InputData;
import com.revolut.retail.feature.crypto.prelaunch.impl.ui.details.CryptoPreLaunchDetailsContract$InputData;
import com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.add_event.TravelItineraryAddEventContract$InputData;
import com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.confirm_edit_dates.TravelItineraryConfirmEditDatesContract$InputData;
import com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.remove_event.TravelItineraryRemoveEventContract$InputData;
import com.revolut.retail.feature.travel_status.impl.ui.flow.TravelStatusFlowContract$InputData;
import com.revolut.retail.feature.travel_status.impl.ui.screens.enrollment.TravelStatusEnrollmentScreenContract$InputData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f304883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f304884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qji.b f304885c;

    public /* synthetic */ i0(Object obj2, qji.b bVar, int i) {
        this.f304883a = i;
        this.f304884b = obj2;
        this.f304885c = bVar;
    }

    @Override // phm.a
    public final Object get() {
        switch (this.f304883a) {
            case 0:
                oe6.a aVarA = ((t) this.f304884b).k.a();
                vc.s.j(aVarA);
                return new nk6.j(aVarA, new nk6.m((je6.h) ((j0) this.f304885c).f304898a.f305064e0.get()));
            case 1:
                k0 k0Var = (k0) this.f304885c;
                PixBranchSelectionScreenContract$InputData pixBranchSelectionScreenContract$InputData = k0Var.f304910a;
                oe6.a aVarA2 = ((t) this.f304884b).k.a();
                vc.s.j(aVarA2);
                return new pk6.j(pixBranchSelectionScreenContract$InputData, aVarA2, new pk6.m((je6.h) k0Var.f304911b.f305064e0.get()));
            case 2:
                return new bl6.l(((l0) this.f304885c).f304922a, (rg6.a) ((t) this.f304884b).N0.get(), new bl6.m());
            case 3:
                PseTopupFlowContract$InputData pseTopupFlowContract$InputData = ((n0) this.f304885c).f304956a;
                t tVar = (t) this.f304884b;
                sri.m mVar = (sri.m) tVar.I.get();
                rg6.a aVar = (rg6.a) tVar.N0.get();
                wsg.n nVarB = tVar.f305070l.b();
                wj0.a aVarI = ((nj0.d) tVar.d).i();
                vc.s.j(aVarI);
                return new com.revolut.feature.external_accounts.impl.ui.colombia.pse.topup.a(pseTopupFlowContract$InputData, mVar, aVar, nVarB, aVarI);
            case 4:
                o0 o0Var = (o0) this.f304885c;
                return new sm6.p(o0Var.f304972a, (kg6.a) ((t) this.f304884b).f305085w0.get(), new qr0.i(new sm6.b(o0Var.f304973b.f305062c)), new sm6.q());
            case 5:
                UpiTransferFlowContract$InputData upiTransferFlowContract$InputData = ((p0) this.f304885c).f304984a;
                t tVar2 = (t) this.f304884b;
                sri.m mVar2 = (sri.m) tVar2.I.get();
                kg6.a aVar2 = (kg6.a) tVar2.f305085w0.get();
                wj0.a aVarI2 = ((nj0.d) tVar2.d).i();
                vc.s.j(aVarI2);
                return new com.revolut.feature.external_accounts.impl.ui.india.upi.flow.a(upiTransferFlowContract$InputData, mVar2, aVar2, aVarI2, tVar2.g());
            case 6:
                r0 r0Var = (r0) this.f304885c;
                no6.c cVar = r0Var.f305014a;
                t tVar3 = (t) this.f304884b;
                oe6.a aVarA3 = tVar3.k.a();
                vc.s.j(aVarA3);
                oe6.h hVar = (oe6.h) tVar3.f305082t0.get();
                lo6.a aVar3 = new lo6.a();
                f80.a aVarX = r0Var.f305015b.f305066h.x();
                vc.s.j(aVarX);
                return new no6.m(cVar, aVarA3, hVar, aVar3, new lo6.c(aVarX), new no6.n());
            case 7:
                p1 p1Var = (p1) this.f304885c;
                LinkResultFlowContract$InputData linkResultFlowContract$InputData = p1Var.f304987a;
                o1 o1Var = (o1) this.f304884b;
                xg6.l lVarD = ((t) o1Var.f304975a).d();
                vc.s.j(lVarD);
                o1 o1Var2 = p1Var.f304988b;
                oe6.a aVarA4 = o1Var2.f304976b.a();
                vc.s.j(aVarA4);
                vg6.p pVar = new vg6.p(aVarA4, o1Var2.f304977c.b());
                vg6.q qVar = new vg6.q();
                zfe.e eVarG = ((jge.m) o1Var.d.e).g();
                vc.s.j(eVarG);
                oe6.a aVarA5 = o1Var.f304976b.a();
                vc.s.j(aVarA5);
                return new vg6.k(linkResultFlowContract$InputData, lVarD, pVar, qVar, eVarG, aVarA5);
            case 8:
                e2 e2Var = (e2) this.f304885c;
                je6.g gVar = e2Var.f304836b.f305139g;
                ne6.b bVar = (ne6.b) ((t) gVar).D0.get();
                vc.s.j(bVar);
                lk6.b bVar2 = new lk6.b(bVar);
                BrazilConsentDetailsScreenContract$InputData brazilConsentDetailsScreenContract$InputData = e2Var.f304835a;
                je6.h hVarC = ((t) gVar).c();
                vc.s.j(hVarC);
                return new com.revolut.feature.external_accounts.impl.ui.brazil.consent_details.a(new ij6.k(bVar2, brazilConsentDetailsScreenContract$InputData, hVarC), brazilConsentDetailsScreenContract$InputData, (com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.a) ((w2) this.f304884b).Y.get());
            case 9:
                f2 f2Var = (f2) this.f304885c;
                je6.h hVarC2 = ((t) f2Var.f304851b.f305139g).c();
                vc.s.j(hVarC2);
                BrazilConsentsScreenContract$InputData brazilConsentsScreenContract$InputData = f2Var.f304850a;
                kj6.k kVar = new kj6.k(hVarC2, brazilConsentsScreenContract$InputData);
                w2 w2Var = (w2) this.f304884b;
                return new com.revolut.feature.external_accounts.impl.ui.brazil.consents.a(kVar, brazilConsentsScreenContract$InputData, new com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.b((lf6.a) w2Var.X.get(), w2Var.f305144n.b(), w2Var.f.b()));
            case 10:
                g2 g2Var = (g2) this.f304885c;
                je6.g gVar2 = g2Var.f304863b.f305139g;
                ne6.b bVar3 = (ne6.b) ((t) gVar2).D0.get();
                vc.s.j(bVar3);
                je6.h hVarC3 = ((t) gVar2).c();
                vc.s.j(hVarC3);
                return new com.revolut.feature.external_accounts.impl.ui.brazil.inbound_consent_details.a(new mj6.k(bVar3, hVarC3), g2Var.f304862a, (qg6.a) ((w2) this.f304884b).f305135a0.get());
            case 11:
                h2 h2Var = (h2) this.f304885c;
                je6.h hVarC4 = ((t) h2Var.f304877b.f305139g).c();
                vc.s.j(hVarC4);
                return new com.revolut.feature.external_accounts.impl.ui.brazil.linked_accounts.a(new zj6.k(hVarC4), h2Var.f304876a, (com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.a) ((w2) this.f304884b).Y.get());
            case 12:
                return new jl6.l(new jl6.j(((o2) this.f304885c).f304978a), ((c21.b) ((w2) this.f304884b).G).c());
            case 13:
                p2 p2Var = (p2) this.f304885c;
                OpenBankingAuthAccountsAuFlowContract$InputData openBankingAuthAccountsAuFlowContract$InputData = p2Var.f304990a;
                xg6.b bVar4 = (xg6.b) ((w2) this.f304884b).U.get();
                w2 w2Var2 = p2Var.f304991b;
                sf0.h hVarB = w2Var2.i.b();
                vc.s.j(hVarB);
                v60.e eVarA = w2Var2.f305141j.a();
                vc.s.j(eVarA);
                return new com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.accounts_au.a(openBankingAuthAccountsAuFlowContract$InputData, bVar4, new e52.c(hVarB, eVarA, 1));
            case 14:
                w2 w2Var3 = ((b3) this.f304885c).f304801a;
                whf.n nVarB2 = w2Var3.I.b();
                vc.s.j(nVarB2);
                je6.h hVarC5 = ((t) w2Var3.f305139g).c();
                vc.s.j(hVarC5);
                bk6.q qVar2 = new bk6.q(hVarC5, nVarB2);
                w2 w2Var4 = (w2) this.f304884b;
                return new com.revolut.feature.external_accounts.impl.ui.brazil.open_finance.a(qVar2, (xg6.y) w2Var4.f305137b0.get(), (com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.a) w2Var4.Y.get());
            case 15:
                g3 g3Var = (g3) this.f304885c;
                BrPaymentExpiryDateUpdateScreenContract$InputData brPaymentExpiryDateUpdateScreenContract$InputData = g3Var.f304866b;
                l80.e eVarH = ((w2) g3Var.f304867c).e.h();
                vc.s.j(eVarH);
                hk6.i iVar = new hk6.i(eVarH);
                l80.e eVarH2 = ((w2) this.f304884b).e.h();
                vc.s.j(eVarH2);
                return new com.revolut.feature.external_accounts.impl.ui.brazil.payment_confirmation.screen.expiry_date_update.a(brPaymentExpiryDateUpdateScreenContract$InputData, iVar, eVarH2);
            case 16:
                g3 g3Var2 = (g3) this.f304885c;
                BrPaymentExpiryDateUpdateScreenContract$InputData brPaymentExpiryDateUpdateScreenContract$InputData2 = g3Var2.f304866b;
                l80.e eVarH3 = ((w2) g3Var2.f304867c).e.h();
                vc.s.j(eVarH3);
                hk6.i iVar2 = new hk6.i(eVarH3);
                l80.e eVarH4 = ((w2) this.f304884b).e.h();
                vc.s.j(eVarH4);
                return new com.revolut.feature.external_accounts.impl.ui.brazil.payment_confirmation.screen.expiry_date_update.a(brPaymentExpiryDateUpdateScreenContract$InputData2, iVar2, eVarH4);
            case 17:
                xi3.a aVar4 = (xi3.a) this.f304885c;
                yi3.b bVar5 = aVar4.f306299a;
                xi3.b bVar6 = (xi3.b) this.f304884b;
                q70.a aVar5 = (q70.a) bVar6.f306302a.f192437e0.get();
                vc.s.j(aVar5);
                return new com.revolut.feature.chooser.external_map.screen.b(bVar5, aVar5, new yi3.e((zi3.a) aVar4.f306300b.e.get()), (zi3.c) bVar6.f.get());
            case 18:
                ConsentScreenContract$InputData consentScreenContract$InputData = ((xmi.c) this.f304885c).f307268a;
                xmi.e eVar = (xmi.e) this.f304884b;
                vmi.d dVar = (vmi.d) eVar.i.get();
                rqk.m mVarB = eVar.d.b();
                b3l.b consentFooterCopyProvider = new b3l.b();
                Intrinsics.checkNotNullParameter(consentFooterCopyProvider, "consentFooterCopyProvider");
                return new cni.q(consentScreenContract$InputData, dVar, mVarB, new com.revolut.oauth.impl.ui.consent.screen.b());
            case 19:
                xsl.c cVar2 = (xsl.c) this.f304885c;
                InvestOrderDetailsPagerFeatureContract$InputData inputData = cVar2.f308583a;
                wsl.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(inputData, "inputData");
                String f104631b = inputData.f91744a.getF104631b();
                vsl.e eVar2 = vsl.g.Companion;
                List listC = zhm.u.c(inputData.f91744a);
                eVar2.getClass();
                vsl.c cVar3 = new vsl.c(null, f104631b, vsl.e.a(listC));
                vsl.i iVar3 = new vsl.i();
                vsl.h hVar2 = new vsl.h();
                InvestOrderDetailsPagerFeatureContract$InputData investOrderDetailsPagerFeatureContract$InputData = cVar2.f308583a;
                vrl.g gVarB = ((xsl.p) this.f304884b).k.b();
                vc.s.j(gVarB);
                return new vsl.g(cVar3, iVar3, hVar2, investOrderDetailsPagerFeatureContract$InputData, gVarB, new htl.l());
            case 20:
                xsl.h hVar3 = (xsl.h) this.f304885c;
                InvestOrderContract$InputData investOrderContract$InputData = hVar3.f308640a;
                xsl.p pVar2 = (xsl.p) this.f304884b;
                gte.a aVarB = pVar2.f308692a.b();
                vc.s.j(aVarB);
                l89.b bVar7 = pVar2.B;
                s99.i iVarB = ((s99.a) bVar7).b();
                t99.k kVarA = ((s99.a) bVar7).a();
                vc.s.j(kVarA);
                xsl.p pVar3 = hVar3.f308641b;
                vrl.c cVar4 = (vrl.c) pVar3.S.get();
                vrl.b bVar8 = (vrl.b) pVar3.k.Q.get();
                vc.s.j(bVar8);
                ybl.b bVarB = pVar3.e.b();
                vc.s.j(bVarB);
                vul.h hVar4 = new vul.h(cVar4, bVar8, bVarB);
                vrl.c cVar5 = (vrl.c) pVar3.S.get();
                vrl.b bVar9 = (vrl.b) pVar3.k.Q.get();
                vc.s.j(bVar9);
                return new com.revolut.trading.orders.ui.invest.placement.wrapper_flow.b(investOrderContract$InputData, aVarB, iVarB, kVarA, hVar4, new vul.c(cVar5, bVar9));
            case 21:
                xuj.a aVar6 = (xuj.a) this.f304885c;
                TravelItineraryAddEventContract$InputData travelItineraryAddEventContract$InputData = aVar6.f309073a;
                yuj.a aVar7 = (yuj.a) ((xuj.i) this.f304884b).f309104s.get();
                xuj.i iVar4 = aVar6.f309074b;
                sf0.h hVarB2 = iVar4.k.b();
                vc.s.j(hVarB2);
                v60.e eVarA2 = iVar4.f309098l.a();
                vc.s.j(eVarA2);
                return new com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.add_event.b(travelItineraryAddEventContract$InputData, aVar7, new abk.c(hVarB2, eVarA2, 3), new com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.add_event.c(travelItineraryAddEventContract$InputData));
            case 22:
                xuj.b bVar10 = (xuj.b) this.f304885c;
                TravelItineraryConfirmEditDatesContract$InputData travelItineraryConfirmEditDatesContract$InputData = bVar10.f309076a;
                yuj.a aVar8 = (yuj.a) ((xuj.i) this.f304884b).f309104s.get();
                xuj.i iVar5 = bVar10.f309077b;
                sf0.h hVarB3 = iVar5.k.b();
                vc.s.j(hVarB3);
                v60.e eVarA3 = iVar5.f309098l.a();
                vc.s.j(eVarA3);
                return new gvj.b(travelItineraryConfirmEditDatesContract$InputData, aVar8, new abk.c(hVarB3, eVarA3, 3), new gvj.c(travelItineraryConfirmEditDatesContract$InputData));
            case 23:
                TravelItineraryRemoveEventContract$InputData travelItineraryRemoveEventContract$InputData = ((xuj.e) this.f304885c).f309083a;
                return new mvj.b(travelItineraryRemoveEventContract$InputData, (yuj.a) ((xuj.i) this.f304884b).f309104s.get(), new mvj.c(travelItineraryRemoveEventContract$InputData));
            case 24:
                TravelStatusEnrollmentScreenContract$InputData travelStatusEnrollmentScreenContract$InputData = ((y1l.c) this.f304885c).f310401a;
                y1l.b bVar11 = (y1l.b) this.f304884b;
                return new e2l.g(travelStatusEnrollmentScreenContract$InputData, new z1l.d((u1l.e) bVar11.f310400p.get()), ((s41.a) bVar11.f310395h).d(), new e2l.i());
            case 25:
                TravelStatusFlowContract$InputData travelStatusFlowContract$InputData = ((y1l.d) this.f304885c).f310403a;
                y1l.b bVar12 = (y1l.b) this.f304884b;
                return new com.revolut.retail.feature.travel_status.impl.ui.flow.b(travelStatusFlowContract$InputData, new vfg.p((u1l.g) bVar12.o.get()), new z1l.d((u1l.e) bVar12.f310400p.get()));
            case 26:
                y1l.e eVar3 = (y1l.e) this.f304885c;
                return new g2l.m(eVar3.f310406a, new ugc.a((u1l.b) ((y1l.b) this.f304884b).f310399n.get()), new g2l.o(eVar3.f310407b.e.g(), new g2l.b()));
            case 27:
                GiroCreationFlowInputData giroCreationFlowInputData = ((y67.e) this.f304885c).f311220a;
                y67.d dVar2 = (y67.d) this.f304884b;
                im1.a aVar9 = (im1.a) dVar2.f311216a.f.get();
                vc.s.j(aVar9);
                rea.m mVarF = dVar2.f311217b.f();
                y67.j.Companion.getClass();
                xi0.b.Companion.getClass();
                xi0.b bVar13 = xi0.b.o;
                vc.s.k(bVar13);
                return new com.revolut.feature.giro.impl.ui.a(giroCreationFlowInputData, aVar9, mVarF, bVar13);
            case 28:
                yaj.h hVar5 = (yaj.h) this.f304885c;
                CryptoPreLaunchDetailsContract$InputData cryptoPreLaunchDetailsContract$InputData = hVar5.f312060a;
                yaj.i iVar6 = hVar5.f312061b;
                f01.c cVarG = iVar6.f312063a.g();
                df0.b bVarA = iVar6.f312064b.a();
                vc.s.j(bVarA);
                zaj.n nVar = new zaj.n(cryptoPreLaunchDetailsContract$InputData, cVarG, bVarA);
                waj.a aVar10 = (waj.a) ((yaj.g) ((yaj.i) this.f304884b).f312065c).f312059h.get();
                vc.s.j(aVar10);
                return new zaj.l(nVar, cryptoPreLaunchDetailsContract$InputData, aVar10);
            default:
                YourCashbackFlowContract$InputData yourCashbackFlowContract$InputData = ((yc3.h) this.f304885c).f312485a;
                zja.a aVarA6 = ((ika.b) ((yc3.a) this.f304884b).f312435a).a();
                vc.s.j(aVarA6);
                return new com.revolut.feature.cashback.impl.ui.yourcashback.b(yourCashbackFlowContract$InputData, aVarA6);
        }
    }
}
