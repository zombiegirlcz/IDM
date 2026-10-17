package us6;

import com.revolut.feature.bank_account_switching.api.navigation.BankAccountSwitchingFlowInputData;
import com.revolut.feature.contacts.impl.ui.profile_card.ContactProfileCardScreenContract$ContactProfileCardInputData;
import com.revolut.feature.external_accounts.impl.ui.colombia.pse.screen.verification_code.PseVerificationCodeScreenContract$InputData;
import com.revolut.feature.freelancer.impl.ui.cashback.flow.FreelancerCashbackFlowContract$InputData;
import com.revolut.feature.freelancer.impl.ui.invoice.templates.list.InvoiceTemplatesListScreenContract$InputData;
import com.revolut.feature.freelancer.impl.ui.sales.details.kompot.screen.FreelancerSaleDetailsScreenContract$InputData;
import com.revolut.feature.retail.restaurants.impl.ui.confirmreservation.ConfirmReservationScreenContract$InputData;
import com.revolut.feature.retail.restaurants.impl.ui.reservationcreation.ReservationCreationScreenContract$InputData;
import com.revolut.feature.retail.savings.impl.challenge.presentation.tracking.SavingsChallengeTrackerContract$InputData;
import com.revolut.feature.security_hub.impl.ui.linked_wallet_card_cancel.LinkedWalletCardCancelScreenContract$InputData;
import com.revolut.feature.security_hub.impl.ui.linked_wallet_details.LinkedWalletDetailsScreenContract$InputData;
import com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.flow.MultipleWatchlistsFlowContract$InputData;
import com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.screen.edit_watchlists.EditWatchlistsControllerContract$InputData;
import com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.screen.widget_watchlist_selector.WidgetSelectorScreenContract$InputData;
import com.revolut.feature_exchange.impl.ui.order_details_kompot.OrderDetailsScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class o0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f282641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f282642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xki.e f282643c;

    public /* synthetic */ o0(Object obj2, xki.e eVar, int i) {
        this.f282641a = i;
        this.f282642b = obj2;
        this.f282643c = eVar;
    }

    @Override // phm.a
    public final Object get() {
        switch (this.f282641a) {
            case 0:
                return new com.revolut.feature.freelancer.impl.ui.profile.a(((p0) this.f282643c).f282657a, (et6.h1) ((q) this.f282642b).c0.get());
            case 1:
                q qVar = (q) this.f282642b;
                b9k.f fVarC = qVar.c();
                w0 w0Var = (w0) this.f282643c;
                w80.b bVarB = w0Var.b();
                et6.f1 f1VarE = qVar.e();
                et6.h1 h1Var = (et6.h1) qVar.c0.get();
                gr6.m mVarB = qVar.f282681h.b();
                vc.s.j(mVarB);
                q27.b bVar = new q27.b();
                et6.a3 a3Var = (et6.a3) qVar.f282707t0.get();
                wj0.a aVarI = ((nj0.d) qVar.K).i();
                vc.s.j(aVarI);
                return new com.revolut.feature.freelancer.impl.ui.sales.refund.screen.b(fVarC, bVarB, f1VarE, h1Var, mVarB, bVar, a3Var, aVarI, w0Var.f282784a, qVar.f282685j.a(), new o27.w(w0Var.b(), new u80.o(), new q27.c()));
            case 2:
                q qVar2 = (q) this.f282642b;
                gr6.a aVarA = qVar2.f282681h.a();
                vc.s.j(aVarA);
                et6.f1 f1VarE2 = qVar2.e();
                et6.h1 h1Var2 = (et6.h1) qVar2.c0.get();
                gr6.l lVar = (gr6.l) qVar2.f282683h1.get();
                o7.b bVar2 = new o7.b((au6.u1) qVar2.f282716x1.get());
                et6.a3 a3Var2 = (et6.a3) qVar2.f282707t0.get();
                et6.h3 h3Var = (et6.h3) qVar2.f282677e1.get();
                y0 y0Var = (y0) this.f282643c;
                FreelancerSaleDetailsScreenContract$InputData freelancerSaleDetailsScreenContract$InputData = y0Var.f282809a;
                tqi.g gVarE = qVar2.o.e();
                q qVar3 = y0Var.f282810b;
                return new com.revolut.feature.freelancer.impl.ui.sales.details.kompot.screen.a(aVarA, f1VarE2, h1Var2, lVar, bVar2, a3Var2, h3Var, freelancerSaleDetailsScreenContract$InputData, gVarE, new l17.a(qVar3.o.g()), qVar2.f282699q.e(), new com.revolut.feature.freelancer.impl.ui.sales.details.kompot.screen.b(new q17.f((jr6.u) qVar3.f282704s0.get()), new q17.g(), new q17.i((jr6.t) qVar3.A0.get()), new q17.j(), y0Var.f282809a, new q17.k(), new q17.m((jr6.t) qVar3.A0.get()), new q17.n(), (jr6.t) qVar3.A0.get(), (jr6.u) qVar3.f282704s0.get(), new q17.q((jr6.u) qVar3.f282704s0.get()), new r17.c(new m17.b((jr6.t) qVar3.A0.get()))));
            case 3:
                q qVar4 = (q) this.f282642b;
                bt6.b bVar3 = qVar4.f282712w;
                a61.a aVarA2 = bVar3.a();
                r10.f fVarD = bVar3.d();
                et6.h1 h1Var3 = (et6.h1) qVar4.c0.get();
                ang.f fVarE = qVar4.f282699q.e();
                gr6.e eVarA = ((d1) this.f282643c).f282490a.f282692n.a();
                vc.s.j(eVarA);
                return new u07.l(aVarA2, fVarD, h1Var3, fVarE, new u07.n(eVarA, new l07.a(), new t07.b()));
            case 4:
                c2 c2Var = (c2) this.f282642b;
                q qVar5 = c2Var.f282475a;
                et6.u0 u0VarJ = qVar5.j();
                gr6.p pVar = (gr6.p) qVar5.L0.get();
                vc.s.j(pVar);
                FreelancerCashbackFlowContract$InputData freelancerCashbackFlowContract$InputData = ((a2) this.f282643c).f282447a;
                zja.a aVarA3 = ((ika.b) c2Var.f282476b).a();
                vc.s.j(aVarA3);
                return new com.revolut.feature.freelancer.impl.ui.cashback.flow.c(u0VarJ, pVar, freelancerCashbackFlowContract$InputData, aVarA3);
            case 5:
                g2 g2Var = (g2) this.f282642b;
                et6.h1 h1VarN = g2Var.f282552a.n();
                vc.s.j(h1VarN);
                return new com.revolut.feature.freelancer.impl.ui.invoice.templates.details.c(h1VarN, ((w2) this.f282643c).f282792a, g2Var.e.a(), new yy6.s(new az6.c(new had.b(), new had.c())));
            case 6:
                InvoiceTemplatesListScreenContract$InputData invoiceTemplatesListScreenContract$InputData = ((z2) this.f282643c).f282827a;
                g2 g2Var2 = (g2) this.f282642b;
                et6.p1 p1VarO = g2Var2.f282552a.o();
                vc.s.j(p1VarO);
                return new dz6.q(invoiceTemplatesListScreenContract$InputData, p1VarO, g2Var2.e.a(), new dz6.r());
            case 7:
                v0i.c cVar = (v0i.c) this.f282643c;
                b3i.k titleMapper = new b3i.k();
                Intrinsics.checkNotNullParameter(titleMapper, "titleMapper");
                dcl.q qVar6 = new dcl.q();
                b3i.i iVar = new b3i.i(new s1i.a(), new b3i.a());
                b3i.i itemMapper = new b3i.i(new s1i.a(), new b3i.a());
                Intrinsics.checkNotNullParameter(itemMapper, "itemMapper");
                a3e.u uVar = new a3e.u(qVar6, new o7.d(iVar, new b3i.f(), new b3i.e(new b3i.i(new s1i.a(), new b3i.a()))));
                OrderDetailsScreenContract$InputData orderDetailsScreenContract$InputData = cVar.f284872a;
                b3i.l lVar2 = new b3i.l();
                v0i.b bVar4 = cVar.f284873b;
                ffk.t tVarF = bVar4.f284860g.f();
                vc.s.j(tVarF);
                ang.f fVarE2 = bVar4.f284869s.e();
                sh5.d dVarF = bVar4.f284865n.f();
                vc.s.j(dVarF);
                return new com.revolut.feature_exchange.impl.ui.order_details_kompot.b(uVar, orderDetailsScreenContract$InputData, new b9.w2(orderDetailsScreenContract$InputData, lVar2, tVarF, fVarE2, dVarF, bVar4.e.d()), (p0i.b) ((v0i.b) this.f282642b).u.get(), new b3i.c(), new b3i.a());
            case 8:
                zdb.e eVar = ((vdb.a) this.f282643c).f287834a;
                vdb.j jVar = (vdb.j) this.f282642b;
                wdb.n nVar = (wdb.n) jVar.f287863p.get();
                l80.e eVarH = jVar.e.h();
                vc.s.j(eVarH);
                return new zdb.i(eVar, nVar, eVarH, new zdb.j());
            case 9:
                vdb.b bVar5 = (vdb.b) this.f282643c;
                ConfirmReservationScreenContract$InputData confirmReservationScreenContract$InputData = bVar5.f287836a;
                vdb.j jVar2 = (vdb.j) this.f282642b;
                wdb.n nVar2 = (wdb.n) jVar2.f287863p.get();
                p7c.r rVar = jVar2.f;
                q7c.g gVarE2 = rVar.e();
                q7c.m mVarD = rVar.d();
                vc.s.j(mVarD);
                wdb.w wVar = new wdb.w(gVarE2, mVarD);
                dec.r rVar2 = new dec.r();
                dec.g gVar = new dec.g();
                dec.a aVar = new dec.a();
                l80.e eVarH2 = bVar5.f287837b.e.h();
                vc.s.j(eVarH2);
                return new com.revolut.feature.retail.restaurants.impl.ui.confirmreservation.a(confirmReservationScreenContract$InputData, nVar2, wVar, new beb.y(new beb.b0(new dec.q(rVar2, gVar, aVar, eVarH2))));
            case 10:
                ReservationCreationScreenContract$InputData reservationCreationScreenContract$InputData = ((vdb.f) this.f282643c).f287846a;
                vdb.j jVar3 = (vdb.j) this.f282642b;
                wdb.n nVar3 = (wdb.n) jVar3.f287863p.get();
                l80.e eVarH3 = jVar3.e.h();
                vc.s.j(eVarH3);
                wj0.a aVarI2 = ((nj0.d) jVar3.f287854a).i();
                vc.s.j(aVarI2);
                return new com.revolut.feature.retail.restaurants.impl.ui.reservationcreation.a(reservationCreationScreenContract$InputData, nVar3, eVarH3, aVarI2, new ieb.p());
            case 11:
                return new com.revolut.feature.retail.restaurants.impl.ui.reservationdetails.a(((vdb.h) this.f282643c).f287850a, (wdb.n) ((vdb.j) this.f282642b).f287863p.get(), new qeb.a(), new qeb.j());
            case 12:
                EditWatchlistsControllerContract$InputData editWatchlistsControllerContract$InputData = ((vgd.a) this.f282643c).f288839a;
                zgd.a watchlistActionsRowMapper = new zgd.a();
                Intrinsics.checkNotNullParameter(watchlistActionsRowMapper, "watchlistActionsRowMapper");
                xgd.t tVar = new xgd.t();
                l3d.r rVarA = ((vgd.b) this.f282642b).f288841a.a();
                vc.s.j(rVarA);
                return new com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.screen.edit_watchlists.a(editWatchlistsControllerContract$InputData, tVar, rVarA, new xgd.r(), new pgd.a(), new qgd.g());
            case 13:
                com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.flow.a aVar2 = new com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.flow.a();
                qgd.g gVar2 = new qgd.g();
                xgd.s sVar = new xgd.s();
                MultipleWatchlistsFlowContract$InputData multipleWatchlistsFlowContract$InputData = ((vgd.c) this.f282643c).f288844a;
                l3d.r rVarA2 = ((vgd.b) this.f282642b).f288841a.a();
                vc.s.j(rVarA2);
                return new com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.flow.b(aVar2, gVar2, sVar, multipleWatchlistsFlowContract$InputData, rVarA2);
            case 14:
                qgd.d dVar = ((vgd.d) this.f282643c).f288847a;
                l3d.r rVarA3 = ((vgd.b) this.f282642b).f288841a.a();
                vc.s.j(rVarA3);
                return new qgd.f(dVar, rVarA3, new i90.b(), new qgd.h());
            case 15:
                sgd.d dVar2 = ((vgd.e) this.f282643c).f288849a;
                l3d.r rVarA4 = ((vgd.b) this.f282642b).f288841a.a();
                vc.s.j(rVarA4);
                return new sgd.f(dVar2, rVarA4, new sgd.g());
            case 16:
                WidgetSelectorScreenContract$InputData widgetSelectorScreenContract$InputData = ((vgd.h) this.f282643c).f288861a;
                l3d.r rVarA5 = ((vgd.b) this.f282642b).f288841a.a();
                vc.s.j(rVarA5);
                return new dhd.b(widgetSelectorScreenContract$InputData, rVarA5, new dhd.e(widgetSelectorScreenContract$InputData));
            case 17:
                hkb.f fVar = new hkb.f();
                SavingsChallengeTrackerContract$InputData savingsChallengeTrackerContract$InputData = ((vjb.f) this.f282643c).f289691a;
                vjb.g gVar3 = (vjb.g) this.f282642b;
                ugc.a aVarB = ((vjb.b) gVar3.f289693a).b();
                f80.a aVarX = gVar3.d.x();
                vc.s.j(aVarX);
                return new hkb.d(fVar, savingsChallengeTrackerContract$InputData, aVarB, aVarX, ((s41.a) gVar3.e).d());
            case 18:
                yk6.o oVar = new yk6.o();
                vk6.d dVar3 = (vk6.d) this.f282643c;
                PseVerificationCodeScreenContract$InputData pseVerificationCodeScreenContract$InputData = dVar3.f289870a;
                c70.a aVarZ = ((vk6.b) this.f282642b).e.z();
                vc.s.j(aVarZ);
                return new yk6.n(oVar, pseVerificationCodeScreenContract$InputData, aVarZ, new yk6.a(((lz1.m) dVar3.f289871b.f289864b).g(), pseVerificationCodeScreenContract$InputData));
            case 19:
                return new com.revolut.feature.junior_referrals.impl.ui.allow_referrals_prompt.a(((vk8.b) this.f282643c).f289887a, ((vk8.c) this.f282642b).f289889a.a());
            case 20:
                vl3.m mVar = (vl3.m) this.f282643c;
                ContactProfileCardScreenContract$ContactProfileCardInputData contactProfileCardScreenContract$ContactProfileCardInputData = mVar.f290222a;
                vl3.k kVar = mVar.f290223b;
                q06.l lVarA = kVar.v.a();
                vc.s.j(lVarA);
                f80.a aVarX2 = kVar.f290205g.x();
                vc.s.j(aVarX2);
                bm3.c cVar2 = new bm3.c(lVarA, aVarX2);
                vl3.k kVar2 = (vl3.k) this.f282642b;
                tqi.g gVarE3 = kVar2.e.e();
                c70.a aVarZ2 = kVar2.f290205g.z();
                vc.s.j(aVarZ2);
                zl3.a aVar3 = new zl3.a();
                ContactProfileCardScreenContract$ContactProfileCardInputData contactProfileCardScreenContract$ContactProfileCardInputData2 = mVar.f290222a;
                dl3.f fVarC2 = kVar.f290210n.c();
                vc.s.j(fVarC2);
                return new jm3.g(contactProfileCardScreenContract$ContactProfileCardInputData, cVar2, gVarE3, aVarZ2, aVar3, new jm3.i(contactProfileCardScreenContract$ContactProfileCardInputData2, new jm3.c(fVarC2)));
            case 21:
                vn2.r rVar3 = (vn2.r) this.f282643c;
                return new com.revolut.feature.bank_account_switching.impl.ui.switch_out.a(rVar3.f290714a, ((s41.a) ((vn2.h) this.f282642b).f290680h).d(), new sp2.a(), new bp2.c((pn2.d) rVar3.f290715b.o.get()));
            case 22:
                vn2.t tVar2 = (vn2.t) this.f282643c;
                BankAccountSwitchingFlowInputData bankAccountSwitchingFlowInputData = tVar2.f290720a;
                vn2.h hVar = tVar2.f290721b;
                smd.s sVar2 = new smd.s(hVar.f290676a.c(), hVar.f290677b.e());
                l61.a aVarB2 = ((vn2.h) this.f282642b).f290677b.b();
                vc.s.j(aVarB2);
                return new com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.cass.b(bankAccountSwitchingFlowInputData, sVar2, aVarB2, new cq2.a());
            case 23:
                return new bpe.k(((voe.a) this.f282643c).f290945a, (cne.a) ((voe.c) this.f282642b).f290954j.get(), new bpe.l());
            case 24:
                m93.d dVarF2 = ((vtc.b) this.f282643c).f291951a.e.f();
                vc.s.j(dVarF2);
                a3e.u uVar2 = new a3e.u(new xtc.c(dVarF2));
                vtc.t tVar3 = (vtc.t) this.f282642b;
                l93.f fVarJ = tVar3.e.j();
                vc.s.j(fVarJ);
                return new fuc.h(uVar2, fVarJ, new wtc.t(), (wtc.u) tVar3.f292064e0.get());
            case 25:
                return new com.revolut.feature.security_hub.impl.ui.street_mode.edit_trusted_location.a(((vtc.d) this.f282643c).f291962a, new mvc.j(), ((vtc.t) this.f282642b).f292068j.d(), new ovc.a());
            case 26:
                vtc.t tVar4 = (vtc.t) this.f282642b;
                whf.b bVarA = tVar4.C.a();
                vc.s.j(bVarA);
                com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) tVar4.D).c();
                vc.s.j(aVarC);
                g8i.a aVarQ = tVar4.E.Q();
                puc.a aVar4 = new puc.a();
                djf.c cVar3 = ((vtc.g) this.f282643c).f291977a.C;
                whf.n nVarB = cVar3.b();
                vc.s.j(nVarB);
                qhf.a aVar5 = (qhf.a) cVar3.M.get();
                vc.s.j(aVar5);
                return new com.revolut.feature.security_hub.impl.ui.hidden_transactions.a(bVarA, aVarC, aVarQ, aVar4, new nuc.p(nVarB, aVar5));
            case 27:
                return new quc.g(new quc.i(((vtc.h) this.f282643c).f291983a.f292066h.a()), (wtc.u) ((vtc.t) this.f282642b).f292064e0.get());
            case 28:
                suc.n nVar4 = new suc.n();
                LinkedWalletCardCancelScreenContract$InputData linkedWalletCardCancelScreenContract$InputData = ((vtc.i) this.f282643c).f291988a;
                l93.f fVarJ2 = ((vtc.t) this.f282642b).e.j();
                vc.s.j(fVarJ2);
                return new suc.m(nVar4, linkedWalletCardCancelScreenContract$InputData, fVarJ2);
            default:
                vtc.j jVar4 = (vtc.j) this.f282643c;
                vtc.t tVar5 = jVar4.f291994b;
                m93.d dVarF3 = tVar5.e.f();
                vc.s.j(dVarF3);
                xtc.c cVar4 = new xtc.c(dVarF3);
                thf.g gVarE4 = tVar5.C.e();
                vc.s.j(gVarE4);
                uuc.b bVar6 = new uuc.b(gVarE4);
                z80.b bVarS = tVar5.f292075r.s();
                vc.s.j(bVarS);
                tuc.s sVar3 = new tuc.s(cVar4, bVar6, bVarS);
                LinkedWalletDetailsScreenContract$InputData linkedWalletDetailsScreenContract$InputData = jVar4.f291993a;
                com.revolut.domain.interactors.transactions.a aVarC2 = ((bjf.a) tVar5.D).c();
                vc.s.j(aVarC2);
                nhf.a aVarA4 = tVar5.I.a();
                vc.s.j(aVarA4);
                wtc.b bVar7 = new wtc.b(aVarC2, aVarA4);
                uuc.c cVar5 = new uuc.c();
                vtc.t tVar6 = (vtc.t) this.f282642b;
                return new com.revolut.feature.security_hub.impl.ui.linked_wallet_details.a(sVar3, linkedWalletDetailsScreenContract$InputData, bVar7, cVar5, (wtc.h) tVar6.U.get(), tVar6.f292072n.e());
        }
    }
}
