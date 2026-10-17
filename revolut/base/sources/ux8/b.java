package ux8;

import a2d.m;
import bo9.d;
import c21.f;
import com.revolut.feature.bank_account_switching.api.navigation.BankAccountSwitchingFlowInputData;
import com.revolut.feature.contacts.api.navigation.BlockUserBottomSheetInputData;
import com.revolut.feature.shared.beneficiary.api.confirmation_of_payee.ConfirmationOfPayeeScreenContract$InputData;
import com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.info_preload.PeerToPeerInfoPreloadFlowContract$InputData;
import dkb.j;
import e4m.e;
import fu6.t;
import h6d.g;
import h6d.i;
import k2e.w;
import s6e.b0;
import sf0.h;
import vc.s;
import vl3.l;
import vn2.x;
import vtc.q0;
import vxc.k;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f283911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f283912b;

    public /* synthetic */ b(Object obj2, int i) {
        this.f283911a = i;
        this.f283912b = obj2;
    }

    @Override // phm.a
    public final Object get() {
        switch (this.f283911a) {
            case 0:
                c cVar = (c) this.f283912b;
                return new s5d.b(cVar.f283913a, cVar.f283914b, 6);
            case 1:
                v00.a aVar = (v00.a) this.f283912b;
                return new gx.a(aVar.f284706a, aVar.f284707b, aVar.f284708c, aVar.d, 1);
            case 2:
                return new com.revolut.feature_exchange.impl.ui.takeprofit_stopsell.a(((v0i.e) this.f283912b).f284882a);
            case 3:
                v0j.a aVar2 = (v0j.a) this.f283912b;
                return new k(aVar2.f284913a, aVar2.f284914b, aVar2.f284915c, aVar2.d);
            case 4:
                v1b.a aVar3 = (v1b.a) this.f283912b;
                ConfirmationOfPayeeScreenContract$InputData confirmationOfPayeeScreenContract$InputData = aVar3.f285278a;
                g6d.a aVar4 = new g6d.a();
                h6d.b bVar = new h6d.b(confirmationOfPayeeScreenContract$InputData, new g6d.c(), aVar3.b());
                ConfirmationOfPayeeScreenContract$InputData confirmationOfPayeeScreenContract$InputData2 = aVar3.f285278a;
                return new s1b.c(new t(confirmationOfPayeeScreenContract$InputData, aVar4, bVar, new i(confirmationOfPayeeScreenContract$InputData2, aVar3.b()), new h6d.e(confirmationOfPayeeScreenContract$InputData2, new g6d.c(), aVar3.b()), new g(confirmationOfPayeeScreenContract$InputData2, aVar3.b())));
            case 5:
                v1c.a aVar5 = (v1c.a) this.f283912b;
                return new d(aVar5.f285281a, aVar5.f285282b, aVar5.f285283c, aVar5.d, aVar5.e, aVar5.f, 16);
            case 6:
                v1c.b bVar2 = (v1c.b) this.f283912b;
                return new bo9.g(bVar2.f285285a, bVar2.f285286b, bVar2.f285287c, bVar2.d, bVar2.e, bVar2.f, bVar2.f285288g, bVar2.f285289h, 5);
            case 7:
                v31.a aVar6 = (v31.a) this.f283912b;
                return new f(aVar6.f285842a, aVar6.f285843b, aVar6.f285844c, aVar6.d, aVar6.e, aVar6.f, aVar6.f285845g, aVar6.f285846h, aVar6.i, aVar6.f285847j, aVar6.k);
            case 8:
                w31.e eVarA = ((x31.a) ((v76.a) this.f283912b).f286561b).a();
                s.j(eVarA);
                return eVarA;
            case 9:
                return new u5k.d(((v8k.c) this.f283912b).K.a());
            case 10:
                v8k.e eVar = (v8k.e) this.f283912b;
                PeerToPeerInfoPreloadFlowContract$InputData peerToPeerInfoPreloadFlowContract$InputData = eVar.f286832a;
                v8k.c cVar2 = eVar.f286833b;
                b0 b0VarC = cVar2.S.c();
                cl3.a aVarD = cVar2.f286804l.d();
                s.j(aVarD);
                fnc.s sVarB = ((j1a.i) cVar2.T).b();
                ge3.e eVarD = cVar2.U.d();
                s.j(eVarD);
                j9k.t tVar = new j9k.t(b0VarC, aVarD, sVarB, eVarD);
                h hVarB = cVar2.f.b();
                s.j(hVarB);
                v60.e eVarA2 = cVar2.V.a();
                s.j(eVarA2);
                return new com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.info_preload.b(peerToPeerInfoPreloadFlowContract$InputData, tVar, new abk.c(hVarB, eVarA2, 2));
            case 11:
                vc9.a aVar7 = (vc9.a) this.f283912b;
                return new dj5.b(aVar7.f287652a, aVar7.f287653b, aVar7.f287654c, 3);
            case 12:
                vcd.a aVar8 = (vcd.a) this.f283912b;
                return new q0(aVar8.f287677a, aVar8.f287678b, aVar8.f287679c, aVar8.d, 1);
            case 13:
                return new meb.g(((vdb.d) this.f283912b).f287842a, new meb.h());
            case 14:
                return new com.revolut.feature.retail.restaurants.impl.ui.flow.reservationcreation.a(((vdb.e) this.f283912b).f287844a);
            case 15:
                return new jeb.f(((vdb.g) this.f283912b).f287848a, new jeb.g());
            case 16:
                return new oeb.f(((vdb.i) this.f283912b).f287852a, new oeb.g());
            case 17:
                vf6.a aVar9 = (vf6.a) this.f283912b;
                return new nbb.b(aVar9.f288510a, aVar9.f288511b, aVar9.f288512c, aVar9.d, aVar9.e, aVar9.f, aVar9.f288513g, aVar9.f288514h, aVar9.i, aVar9.f288515j, aVar9.k, aVar9.f288516l, aVar9.f288517m, aVar9.f288518n, aVar9.o, aVar9.f288519p, aVar9.f288520q, aVar9.f288521r, aVar9.f288522s, aVar9.f288523t, aVar9.u, aVar9.v, aVar9.f288524w, aVar9.f288525x, aVar9.f288526y, aVar9.z, aVar9.A, aVar9.B, aVar9.C, aVar9.D, aVar9.E, aVar9.F, aVar9.G, aVar9.H, aVar9.I);
            case 18:
                vfb.a aVar10 = (vfb.a) this.f283912b;
                return new w(aVar10.f288545a, aVar10.f288546b, aVar10.f288547c, aVar10.d, aVar10.e, aVar10.f, aVar10.f288548g, aVar10.f288549h, aVar10.i, aVar10.f288550j, aVar10.k, aVar10.f288551l, aVar10.f288552m, aVar10.f288553n, aVar10.o, aVar10.f288554p, aVar10.f288555q, aVar10.f288556r, aVar10.f288557s, 2);
            case 19:
                return new com.revolut.feature.shared_separate_favourites.combined_watchlist.flow.a(((vfd.b) this.f283912b).f288574a);
            case 20:
                return new com.revolut.feature.retail.savings.impl.challenge.presentation.onboarding.setup.a(((vjb.b) ((vjb.g) this.f283912b).f289693a).b(), new yjb.c(), new j());
            case 21:
                vjd.e eVar2 = (vjd.e) this.f283912b;
                return new m(eVar2.f289715a, eVar2.f289716b, eVar2.f289717c, 29);
            case 22:
                vl3.i iVar = (vl3.i) this.f283912b;
                BlockUserBottomSheetInputData blockUserBottomSheetInputData = iVar.f290192a;
                em3.h hVar = new em3.h(blockUserBottomSheetInputData);
                vl3.k kVar = iVar.f290193b;
                return new em3.e(hVar, blockUserBottomSheetInputData, new r10.t(kVar.f290210n.f(), kVar.f290212q.a()));
            case 23:
                gte.a aVarB = ((vl3.k) this.f283912b).f290202a.b();
                s.j(aVarB);
                return new ul3.a(aVarB);
            case 24:
                return new com.revolut.feature.contacts.impl.ui.contact.flow.a(((l) this.f283912b).f290219a);
            case 25:
                vn2.w wVar = (vn2.w) this.f283912b;
                BankAccountSwitchingFlowInputData bankAccountSwitchingFlowInputData = wVar.f290725a;
                vn2.h hVar2 = wVar.f290726b;
                return new com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.mobility.b(bankAccountSwitchingFlowInputData, new smd.s(hVar2.f290676a.c(), hVar2.f290677b.e()));
            case 26:
                x xVar = (x) this.f283912b;
                BankAccountSwitchingFlowInputData bankAccountSwitchingFlowInputData2 = xVar.f290728a;
                vn2.h hVar3 = xVar.f290729b;
                return new com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.overstap.b(bankAccountSwitchingFlowInputData2, new smd.s(hVar3.f290676a.c(), hVar3.f290677b.e()));
            case 27:
                return new com.revolut.feature.tax_residency.impl.stamp_duty.flow.a(((voe.d) this.f283912b).f290955a);
            case 28:
                voe.e eVar3 = (voe.e) this.f283912b;
                return new ax4.c(eVar3.f290958a, eVar3.f290959b, eVar3.f290960c, eVar3.d, 17);
            default:
                vqe.a aVar11 = (vqe.a) this.f283912b;
                return new vub.j(aVar11.f291389a, aVar11.f291390b, aVar11.f291391c, 1);
        }
    }
}
