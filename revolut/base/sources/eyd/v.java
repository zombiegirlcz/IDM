package eyd;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.pay_with_photo.api.PayWithPhotoPreviewControllerDescriptor$InputData;
import com.revolut.feature.travel.flights.impl.ui.screen.search_results.sort_by.TravelFlightsSearchSortByScreenContract$InputData;
import f4g.b1;
import f4g.v0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class v implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f130832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f130833b;

    public /* synthetic */ v(Object obj2, int i) {
        this.f130832a = i;
        this.f130833b = obj2;
    }

    @Override // phm.a
    public final Object get() {
        switch (this.f130832a) {
            case 0:
                return new com.revolut.feature.statements.impl.ui.savings.flow.a(((w) this.f130833b).f130834a);
            case 1:
                return new com.revolut.feature.statements.impl.ui.statement_of_fees.flow.a(((x) this.f130833b).f130837a);
            case 2:
                return new com.revolut.retail.feature.limits.impl.ui.limits.flow.a(((ezj.d) this.f130833b).f130960a);
            case 3:
                return new com.revolut.feature.travel.flights.impl.ui.flow.root.a(((f4g.p) this.f130833b).f132167a);
            case 4:
                f4g.r rVar = (f4g.r) this.f130833b;
                qd0.b bVarN = rVar.f132180b.d.n();
                vc.s.j(bVarN);
                f6g.a cardMapper = new f6g.a(new p4g.b(bVarN));
                q4g.n separateTicketsBannerMapper = new q4g.n();
                Intrinsics.checkNotNullParameter(cardMapper, "cardMapper");
                Intrinsics.checkNotNullParameter(separateTicketsBannerMapper, "separateTicketsBannerMapper");
                return new g6g.f(new g6g.h(), rVar.f132179a);
            case 5:
                return new v6g.f(new v6g.g(((f4g.y) this.f130833b).f132219a, new x6g.a()));
            case 6:
                TravelFlightsSearchSortByScreenContract$InputData travelFlightsSearchSortByScreenContract$InputData = ((v0) this.f130833b).f132208b;
                return new d7g.e(new d7g.g(travelFlightsSearchSortByScreenContract$InputData), travelFlightsSearchSortByScreenContract$InputData);
            case 7:
                TravelFlightsSearchSortByScreenContract$InputData travelFlightsSearchSortByScreenContract$InputData2 = ((v0) this.f130833b).f132208b;
                return new d7g.e(new d7g.g(travelFlightsSearchSortByScreenContract$InputData2), travelFlightsSearchSortByScreenContract$InputData2);
            case 8:
                TravelFlightsSearchSortByScreenContract$InputData travelFlightsSearchSortByScreenContract$InputData3 = ((v0) this.f130833b).f132208b;
                return new d7g.e(new d7g.g(travelFlightsSearchSortByScreenContract$InputData3), travelFlightsSearchSortByScreenContract$InputData3);
            case 9:
                return new c1g.v(((b1) this.f130833b).f132075a.a());
            case 10:
                return new a7d.a(((f51.b) this.f130833b).f132255a, 8);
            case 11:
                return new u6h.g(new u6h.j(), ((f6h.a) this.f130833b).f132425a);
            case 12:
                f6l.a aVar = (f6l.a) this.f130833b;
                return new c1d.d(aVar.f132452a, aVar.f132453b, aVar.f132454c, aVar.d, aVar.e, aVar.f, 6);
            case 13:
                f76.a aVar2 = (f76.a) this.f130833b;
                return new anb.c0(aVar2.f132559a, aVar2.f132560b, aVar2.f132561c, aVar2.d, 9);
            case 14:
                fbb.a aVar3 = (fbb.a) this.f130833b;
                return new a2d.m(aVar3.f133532a, aVar3.f133533b, aVar3.f133534c, 9);
            case 15:
                fc5.a aVar4 = (fc5.a) this.f130833b;
                return new ax4.c(aVar4.f133645a, aVar4.f133646b, aVar4.f133647c, aVar4.d, 5);
            case 16:
                return new com.revolut.retail.feature.cryptocommoditydetails.impl.ui.price_targets.details.flow.a(((fdj.b) this.f130833b).f133951a);
            case 17:
                return new mdk.b(new mdk.d(((fdk.a) this.f130833b).f133968a));
            case 18:
                fe5.c cVar = (fe5.c) this.f130833b;
                return new anb.c0(cVar.f134450a, cVar.f134451b, cVar.f134452c, cVar.d, 7);
            case 19:
                fff.a aVar5 = (fff.a) this.f130833b;
                return new a16.b(aVar5.f134801a, aVar5.f134802b, 5);
            case 20:
                return new igd.e(((fgd.c) this.f130833b).f135039a);
            case 21:
                fjf.a aVar6 = (fjf.a) this.f130833b;
                wsg.n nVarB = aVar6.f135608a.b();
                hj8.a aVarA = aVar6.f135609b.a();
                vc.s.j(aVarA);
                xoj.a aVarA2 = aVar6.f135610c.a();
                vc.s.j(aVarA2);
                u71.a aVarG = ((c21.b) aVar6.d).g();
                vc.s.j(aVarG);
                mt8.d dVarB = aVar6.e.b();
                vc.s.j(dVarB);
                fbj.a aVarA3 = ((qbj.m) aVar6.f).a();
                vc.s.j(aVarA3);
                toa.a aVarA4 = aVar6.f135611g.a();
                vc.s.j(aVarA4);
                c61.a aVar7 = (c61.a) aVar6.f135612h.M.get();
                vc.s.j(aVar7);
                g6e.d dVarB2 = aVar6.i.b();
                vc.s.j(dVarB2);
                ap5.b bVarE = ((yo5.w) aVar6.f135613j).e();
                vc.s.j(bVarE);
                wif.a aVarA5 = aVar6.k.a();
                g48.r0 r0VarC = aVar6.f135614l.c();
                ang.f fVarE = aVar6.f135615m.e();
                qmc.h hVarA = aVar6.f135616n.a();
                ppg.a aVarA6 = ((wpg.l) aVar6.o).a();
                vc.s.j(aVarA6);
                jm4.r rVar2 = aVar6.f135617p;
                al4.m mVarR = rVar2.r();
                vc.s.j(mVarR);
                al4.e eVarP = rVar2.p();
                vc.s.j(eVarP);
                jla.h hVarA2 = aVar6.f135618q.a();
                cw9.d dVarA = aVar6.f135619r.a();
                wa7.m mVarI = aVar6.f135620s.i();
                cl3.a aVarD = aVar6.f135621t.d();
                vc.s.j(aVarD);
                return new njf.j(nVarB, aVarA, aVarA2, aVarG, dVarB, aVarA3, aVarA4, aVar7, dVarB2, bVarE, aVarA5, r0VarC, fVarE, hVarA, aVarA6, mVarR, eVarP, hVarA2, dVarA, mVarI, aVarD);
            case 22:
                return ImmutableSet.of((gl9.c) new gl9.d(), new gl9.c(((b3j.p) ((fl9.a) this.f130833b).d).e()));
            case 23:
                PayWithPhotoPreviewControllerDescriptor$InputData payWithPhotoPreviewControllerDescriptor$InputData = ((fl9.b) this.f130833b).f135913a;
                return new ml9.f(payWithPhotoPreviewControllerDescriptor$InputData, new ml9.h(payWithPhotoPreviewControllerDescriptor$InputData));
            case 24:
                return new bna.b(((fma.c) this.f130833b).f136048a);
            case 25:
                return new a7d.a(((fma.n) this.f130833b).f136207a, 10);
            case 26:
                return new pnb.h(((fnb.b) ((fnb.e) this.f130833b).f136606a).a(), new pnb.f());
            case 27:
                fsg.d dVar = (fsg.d) this.f130833b;
                wli.x xVarD = ((s41.a) dVar.f137676a).d();
                yf.c cVarA = dVar.f137677b.a();
                eli.j jVarA = dVar.f137678c.a();
                mli.e eVarA = ((j51.a) dVar.d).a();
                vc.s.j(eVarA);
                com.revolut.retail.feature.api.userauth.navigation.a aVarA7 = dVar.e.a();
                vc.s.j(aVarA7);
                ffk.t tVarF = dVar.f.f();
                vc.s.j(tVarF);
                bal.a aVarB = ((vxc.b) dVar.f137679g).b();
                vc.s.j(aVarB);
                gsg.d dVar2 = new gsg.d(aVarB);
                wif.a aVarA8 = dVar.f137680h.a();
                csg.a aVar8 = (csg.a) ((fsg.a) dVar.i).f137671a.get();
                vc.s.j(aVar8);
                mre.c cVarB = dVar.f137681j.b();
                vc.s.j(cVarB);
                ang.f fVarE2 = dVar.k.e();
                uil.a aVarA9 = dVar.f137682l.a();
                vc.s.j(aVarA9);
                sf0.h hVarB = dVar.f137683m.b();
                vc.s.j(hVarB);
                return new com.revolut.feature.voluntary.offboarding.impl.ui.flow.e(xVarD, cVarA, jVarA, eVarA, aVarA7, tVarF, dVar2, aVarA8, aVar8, cVarB, fVarE2, aVarA9, hVarB);
            case 28:
                fta.g gVar = (fta.g) this.f130833b;
                return new af5.f(gVar.f138001a, gVar.f138002b, gVar.f138003c, gVar.d, gVar.e, gVar.f, gVar.f138004g, gVar.f138005h, gVar.i, gVar.f138006j, 2);
            default:
                return new com.revolut.retail.feature.balance.picker.impl.disclaimers.savings.flow.a(((g2j.j) this.f130833b).f140112a);
        }
    }
}
