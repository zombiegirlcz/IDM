package g2j;

import at.r;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.details.additional_information.TravelHotelsBookingAdditionalInformationScreenContract$InputData;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.picker.guest.child_age.TravelHotelsChildAgePickerContract$InputData;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.price_breakdown.TravelHotelsPriceBreakdownScreenContract$InputData;
import g9g.b1;
import g9g.f1;
import g9g.v0;
import g9g.z;
import i9g.b0;
import i9g.d0;
import i9g.h0;
import i9g.n0;
import vc.s;

/* JADX INFO: loaded from: classes10.dex */
public final class m implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f140119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f140120b;

    public /* synthetic */ m(Object obj2, int i) {
        this.f140119a = i;
        this.f140120b = obj2;
    }

    @Override // phm.a
    public final Object get() {
        switch (this.f140119a) {
            case 0:
                return new c2j.d(new c2j.e(), ((n) this.f140120b).f140121a);
            case 1:
                g51.a aVar = (g51.a) this.f140120b;
                return new a0b.g(aVar.f140601a, aVar.f140602b, aVar.f140603c, aVar.d, aVar.e, aVar.f, aVar.f140604g, 3);
            case 2:
                return new com.revolut.feature.defi.remittances.impl.ui.receive.flow.a(((g56.b) this.f140120b).f140630a);
            case 3:
                return new com.revolut.feature.defi.remittances.impl.ui.send.flow.a(((g56.g) this.f140120b).f140654a);
            case 4:
                return new com.revolut.feature.defi.remittances.impl.ui.defi_to_cefi.flow.a(((g56.j) this.f140120b).f140661a);
            case 5:
                g7l.d dVar = (g7l.d) this.f140120b;
                return new c3d.a(dVar.f141218a, dVar.f141219b, dVar.f141220c, 8);
            case 6:
                return new add.b(((g8b.b) this.f140120b).f141335a, 3);
            case 7:
                g8j.b bVar = (g8j.b) this.f140120b;
                return new a2d.m(bVar.f141405a, bVar.f141406b, bVar.f141407c, 12);
            case 8:
                g9g.e eVar = (g9g.e) this.f140120b;
                r rVar = new r(new fcg.a());
                TravelHotelsBookingAdditionalInformationScreenContract$InputData travelHotelsBookingAdditionalInformationScreenContract$InputData = eVar.f141652a;
                g9g.d dVar2 = eVar.f141653b;
                return new ibg.h(rVar, travelHotelsBookingAdditionalInformationScreenContract$InputData, new d0((b0) dVar2.m0.get(), (h0) dVar2.f141631o0.get()));
            case 9:
                return new com.revolut.feature.travel.hotels.impl.ui_kompot.flow.amendment.a(((g9g.g) this.f140120b).f141670a);
            case 10:
                return new ubg.g(new tyc.l(new ubg.i(), new ubg.j()), ((g9g.l) this.f140120b).f141731a);
            case 11:
                return new com.revolut.feature.travel.hotels.impl.ui_kompot.flow.property.b(((z) this.f140120b).f141861a);
            case 12:
                v0 v0Var = (v0) this.f140120b;
                g9g.d dVar3 = v0Var.f141836c;
                l70.e eVar2 = dVar3.e;
                z80.b bVarS = eVar2.s();
                s.j(bVarS);
                jul.o oVarI = eVar2.i();
                fcg.a aVar2 = new fcg.a();
                da3.j jVar = dVar3.v;
                ia3.r rVarB = jVar.b();
                n0 n0Var = (n0) dVar3.z0.get();
                mag.f fVar = new mag.f(new mag.b());
                mag.g gVar = new mag.g();
                p8g.c cVar = (p8g.c) dVar3.g0.get();
                m93.d dVarF = jVar.f();
                s.j(dVarF);
                mag.a aVar3 = new mag.a();
                mag.b bVar2 = new mag.b();
                l80.e eVarH = eVar2.h();
                s.j(eVarH);
                qd0.b bVarN = eVar2.n();
                s.j(bVarN);
                return new zbg.e(new yq5.d(new lag.c(bVarS, oVarI, aVar2, rVarB, n0Var, fVar, gVar, cVar, dVarF, aVar3, bVar2, new ccg.i(eVarH, new m9g.b(bVarN)))), v0Var.f141835b);
            case 13:
                v0 v0Var2 = (v0) this.f140120b;
                g9g.d dVar4 = v0Var2.f141836c;
                l70.e eVar3 = dVar4.e;
                z80.b bVarS2 = eVar3.s();
                s.j(bVarS2);
                jul.o oVarI2 = eVar3.i();
                fcg.a aVar4 = new fcg.a();
                da3.j jVar2 = dVar4.v;
                ia3.r rVarB2 = jVar2.b();
                n0 n0Var2 = (n0) dVar4.z0.get();
                mag.f fVar2 = new mag.f(new mag.b());
                mag.g gVar2 = new mag.g();
                p8g.c cVar2 = (p8g.c) dVar4.g0.get();
                m93.d dVarF2 = jVar2.f();
                s.j(dVarF2);
                mag.a aVar5 = new mag.a();
                mag.b bVar3 = new mag.b();
                l80.e eVarH2 = eVar3.h();
                s.j(eVarH2);
                qd0.b bVarN2 = eVar3.n();
                s.j(bVarN2);
                return new zbg.e(new yq5.d(new lag.c(bVarS2, oVarI2, aVar4, rVarB2, n0Var2, fVar2, gVar2, cVar2, dVarF2, aVar5, bVar3, new ccg.i(eVarH2, new m9g.b(bVarN2)))), v0Var2.f141835b);
            case 14:
                v0 v0Var3 = (v0) this.f140120b;
                g9g.d dVar5 = v0Var3.f141836c;
                l70.e eVar4 = dVar5.e;
                z80.b bVarS3 = eVar4.s();
                s.j(bVarS3);
                jul.o oVarI3 = eVar4.i();
                fcg.a aVar6 = new fcg.a();
                da3.j jVar3 = dVar5.v;
                ia3.r rVarB3 = jVar3.b();
                n0 n0Var3 = (n0) dVar5.z0.get();
                mag.f fVar3 = new mag.f(new mag.b());
                mag.g gVar3 = new mag.g();
                p8g.c cVar3 = (p8g.c) dVar5.g0.get();
                m93.d dVarF3 = jVar3.f();
                s.j(dVarF3);
                mag.a aVar7 = new mag.a();
                mag.b bVar4 = new mag.b();
                l80.e eVarH3 = eVar4.h();
                s.j(eVarH3);
                qd0.b bVarN3 = eVar4.n();
                s.j(bVarN3);
                return new zbg.e(new yq5.d(new lag.c(bVarS3, oVarI3, aVar6, rVarB3, n0Var3, fVar3, gVar3, cVar3, dVarF3, aVar7, bVar4, new ccg.i(eVarH3, new m9g.b(bVarN3)))), v0Var3.f141835b);
            case 15:
                b1 b1Var = (b1) this.f140120b;
                TravelHotelsPriceBreakdownScreenContract$InputData travelHotelsPriceBreakdownScreenContract$InputData = b1Var.f141602b;
                g9g.d dVar6 = b1Var.f141603c;
                return new com.revolut.feature.travel.hotels.impl.ui_kompot.screen.price_breakdown.a(new edg.f(travelHotelsPriceBreakdownScreenContract$InputData, new gdg.d(dVar6.e.i(), (p8g.c) dVar6.g0.get(), new gdg.g(new fcg.b(), (p8g.c) dVar6.g0.get()), new fcg.b()), new kdc.d(), new gdg.a(new fcg.b(), (p8g.c) dVar6.g0.get())));
            case 16:
                b1 b1Var2 = (b1) this.f140120b;
                TravelHotelsPriceBreakdownScreenContract$InputData travelHotelsPriceBreakdownScreenContract$InputData2 = b1Var2.f141602b;
                g9g.d dVar7 = b1Var2.f141603c;
                return new com.revolut.feature.travel.hotels.impl.ui_kompot.screen.price_breakdown.a(new edg.f(travelHotelsPriceBreakdownScreenContract$InputData2, new gdg.d(dVar7.e.i(), (p8g.c) dVar7.g0.get(), new gdg.g(new fcg.b(), (p8g.c) dVar7.g0.get()), new fcg.b()), new kdc.d(), new gdg.a(new fcg.b(), (p8g.c) dVar7.g0.get())));
            case 17:
                b1 b1Var3 = (b1) this.f140120b;
                TravelHotelsPriceBreakdownScreenContract$InputData travelHotelsPriceBreakdownScreenContract$InputData3 = b1Var3.f141602b;
                g9g.d dVar8 = b1Var3.f141603c;
                return new com.revolut.feature.travel.hotels.impl.ui_kompot.screen.price_breakdown.a(new edg.f(travelHotelsPriceBreakdownScreenContract$InputData3, new gdg.d(dVar8.e.i(), (p8g.c) dVar8.g0.get(), new gdg.g(new fcg.b(), (p8g.c) dVar8.g0.get()), new fcg.b()), new kdc.d(), new gdg.a(new fcg.b(), (p8g.c) dVar8.g0.get())));
            case 18:
                TravelHotelsChildAgePickerContract$InputData travelHotelsChildAgePickerContract$InputData = ((f1) this.f140120b).f141668b;
                return new bdg.d(travelHotelsChildAgePickerContract$InputData, new bdg.e(travelHotelsChildAgePickerContract$InputData));
            case 19:
                TravelHotelsChildAgePickerContract$InputData travelHotelsChildAgePickerContract$InputData2 = ((f1) this.f140120b).f141668b;
                return new bdg.d(travelHotelsChildAgePickerContract$InputData2, new bdg.e(travelHotelsChildAgePickerContract$InputData2));
            case 20:
                ga.d dVar9 = (ga.d) this.f140120b;
                return new ap3.b(dVar9.f141968a, dVar9.f141969b, dVar9.f141970c, dVar9.d, dVar9.e, dVar9.f, dVar9.f141971g, 3);
            case 21:
                ggf.a aVar8 = (ggf.a) this.f140120b;
                return new c3d.a(aVar8.f143679a, aVar8.f143680b, aVar8.f143681c, 10);
            case 22:
                return new a7d.a(((gh5.b) this.f140120b).f143853a, 12);
            case 23:
                gja.a aVar9 = (gja.a) this.f140120b;
                return new ajf.d(aVar9.f144245a, aVar9.f144246b, aVar9.f144247c, aVar9.d, aVar9.e, 5);
            case 24:
                gjf.a aVar10 = (gjf.a) this.f140120b;
                jhf.a aVar11 = aVar10.f144272a;
                com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) aVar11).c();
                s.j(aVarC);
                sjf.e eVarD = ((bjf.a) aVar11).d();
                s.j(eVarD);
                xmf.b bVar5 = (xmf.b) aVar10.f144273b.f161783h.get();
                s.j(bVar5);
                mhf.j jVarE = ((bjf.a) aVar11).e();
                s.j(jVarE);
                return new ojf.e(aVarC, eVarD, bVar5, jVarE);
            case 25:
                gjf.b bVar6 = (gjf.b) this.f140120b;
                return new c3d.d(bVar6.f144275a, bVar6.f144276b, 7);
            case 26:
                gm1.b bVar7 = (gm1.b) this.f140120b;
                return new ax4.c(bVar7.f144753a, bVar7.f144754b, bVar7.f144755c, bVar7.d, 7);
            case 27:
                return new com.revolut.feature.transactions.impl.ui.pending.a(((gnf.b) this.f140120b).f144977a);
            case 28:
                gni.a aVar12 = (gni.a) this.f140120b;
                return new dj5.b(aVar12.f145022a, aVar12.f145023b, aVar12.f145024c, 1);
            default:
                return new np6.b(((gp6.g) this.f140120b).f145275a, new mp6.o());
        }
    }
}
