package kyk;

import android.content.Context;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.add_note.AddNoteScreenContract$InputData;
import com.revolut.feature.picker.legacy.PickerScreenContract$InputData;
import com.revolut.feature.wealth.commodity_additional_services.impl.data.additional_services.network.CommodityAdditionalServicesService;
import kotlin.jvm.internal.Intrinsics;
import lf9.b0;
import y7a.f0;

/* JADX INFO: loaded from: classes12.dex */
public final class n implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f190960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f190961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f190962c;

    public /* synthetic */ n(Object obj2, int i, int i2) {
        this.f190960a = i2;
        this.f190962c = obj2;
        this.f190961b = i;
    }

    @Override // phm.a
    public final Object get() {
        Object aVar;
        Object hVar;
        switch (this.f190960a) {
            case 0:
                int i = this.f190961b;
                if (i == 0) {
                    o oVar = (o) this.f190962c;
                    return new com.revolut.retail.feature.trading_onboarding.impl.ui.partner_consent_request.a(oVar.f190963a, (r0l.a) oVar.d.get());
                }
                if (i == 1) {
                    return new r0l.b();
                }
                throw new AssertionError(i);
            case 1:
                aj3.j jVar = (aj3.j) this.f190962c;
                PickerScreenContract$InputData pickerScreenContract$InputData = jVar.f5394b;
                int i2 = this.f190961b;
                if (i2 == 0) {
                    return new f0(ImmutableMap.of("TradingOnboardingNationalityPickerInteractor", (a8a.d) ((f) jVar.f).f190941h.get()), pickerScreenContract$InputData, (jki.p) jVar.d.get());
                }
                if (i2 == 1) {
                    return new com.revolut.feature.picker.legacy.a(pickerScreenContract$InputData, jVar.f5395c);
                }
                throw new AssertionError(i2);
            case 2:
                l0d.a aVar2 = (l0d.a) this.f190962c;
                a31.a aVar3 = aVar2.d;
                int i3 = this.f190961b;
                if (i3 == 0) {
                    return new n0d.e(aVar2.f191233a, aVar2.f191234b, aVar2.f191235c, aVar3);
                }
                if (i3 == 1) {
                    return new ae9.d(aVar2.e, aVar2.f, aVar3, aVar2.i, aVar2.f191236g);
                }
                if (i3 != 2) {
                    throw new AssertionError(i3);
                }
                n0d.b bVar = (n0d.b) ((n0d.e) aVar2.f191237h.get()).b();
                vc.s.k(bVar);
                return bVar;
            case 3:
                int i5 = this.f190961b;
                if (i5 == 0) {
                    return new com.revolut.retail.feature.marketnews.impl.flows.wealthassettypenews.a(((l0k.e) this.f190962c).f191279a);
                }
                if (i5 == 1) {
                    return new ln.c();
                }
                throw new AssertionError(i5);
            case 4:
                int i6 = this.f190961b;
                if (i6 == 0) {
                    return new com.revolut.retail.feature.marketnews.impl.flows.wealthnews.a(((l0k.h) this.f190962c).f191293a);
                }
                if (i6 == 1) {
                    return new ln.c();
                }
                throw new AssertionError(i6);
            case 5:
                l5h.a aVar4 = (l5h.a) this.f190962c;
                ee0.a aVar5 = aVar4.f192263c;
                int i21 = this.f190961b;
                if (i21 == 0) {
                    return new ne0.d();
                }
                if (i21 == 1) {
                    je0.d mapper = aVar5.d();
                    vc.s.j(mapper);
                    yk0.a databaseSessionProvider = aVar4.d.b();
                    vc.s.j(databaseSessionProvider);
                    xe0.f storageFactory = aVar5.f();
                    vc.s.j(storageFactory);
                    g5h.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(mapper, "mapper");
                    Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                    Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                    return xe0.f.f(storageFactory, databaseSessionProvider, "commodity_additional_services_storage", mapper, 0, null, 56);
                }
                if (i21 == 2) {
                    gte.a aVarB = aVar4.f192262b.b();
                    vc.s.j(aVarB);
                    aVar = new ax2.a(aVarB, 1);
                } else {
                    if (i21 != 3) {
                        if (i21 != 4) {
                            throw new AssertionError(i21);
                        }
                        CommodityAdditionalServicesService commodityAdditionalServicesService = (CommodityAdditionalServicesService) v0.a.f((c21.b) aVar4.e, "retrofit", CommodityAdditionalServicesService.class, "create(...)");
                        vc.s.k(commodityAdditionalServicesService);
                        return commodityAdditionalServicesService;
                    }
                    aVar = new f5h.c((CommodityAdditionalServicesService) aVar4.f192266j.get(), new fnc.s(fe0.c.a()), (ne0.j) aVar4.f192264g.get(), (ue0.c) aVar4.f192265h.get());
                }
                return aVar;
            case 6:
                l9f.f fVar = (l9f.f) this.f190962c;
                int i22 = this.f190961b;
                if (i22 == 0) {
                    return kxa.j.k((j60.a) fVar.d.get());
                }
                if (i22 == 1) {
                    return ehe.n.s((com.revolut.kompot.navigable.a) fVar.f193167b.get(), (rp0.m) fVar.f193168c.get());
                }
                if (i22 == 2) {
                    return new rp0.m();
                }
                if (i22 == 3) {
                    return new x9f.m(fVar.f193166a, new x9f.n(), (j60.a) fVar.d.get());
                }
                throw new AssertionError(i22);
            case 7:
                l9f.g gVar = (l9f.g) this.f190962c;
                int i32 = this.f190961b;
                if (i32 == 0) {
                    return kxa.j.k((j60.a) gVar.d.get());
                }
                if (i32 == 1) {
                    return ehe.n.s((com.revolut.kompot.navigable.a) gVar.f193170b.get(), (rp0.m) gVar.f193171c.get());
                }
                if (i32 == 2) {
                    return new rp0.m();
                }
                if (i32 == 3) {
                    return new iaf.r(gVar.f193169a, (iaf.k) gVar.f.get(), (j60.a) gVar.d.get());
                }
                if (i32 == 4) {
                    return new iaf.s();
                }
                throw new AssertionError(i32);
            case 8:
                lal.b bVar2 = (lal.b) this.f190962c;
                int i33 = this.f190961b;
                if (i33 == 0) {
                    return new val.h((jki.p) bVar2.f193429b.get(), bVar2.f193428a);
                }
                if (i33 == 1) {
                    return new val.i();
                }
                throw new AssertionError(i33);
            case 9:
                int i43 = this.f190961b;
                if (i43 == 0) {
                    return new zal.g((jki.p) ((lal.d) this.f190962c).f193434a.get());
                }
                if (i43 == 1) {
                    return new zal.h();
                }
                throw new AssertionError(i43);
            case 10:
                lal.f fVar2 = (lal.f) this.f190962c;
                int i59 = this.f190961b;
                if (i59 == 0) {
                    return new cbl.f((jki.p) fVar2.f193440b.get(), fVar2.f193439a);
                }
                if (i59 == 1) {
                    return new cbl.g();
                }
                throw new AssertionError(i59);
            case 11:
                lal.g gVar2 = (lal.g) this.f190962c;
                int i66 = this.f190961b;
                if (i66 == 0) {
                    hVar = new wal.h((jki.p) gVar2.f193444c.get(), gVar2.f193442a);
                } else {
                    if (i66 != 1) {
                        if (i66 == 2) {
                            return new tal.f();
                        }
                        throw new AssertionError(i66);
                    }
                    hVar = new wal.j((tal.e) gVar2.f193443b.get());
                }
                return hVar;
            case 12:
                lal.m mVar = (lal.m) this.f190962c;
                int i74 = this.f190961b;
                if (i74 == 0) {
                    return new ebl.f((jki.p) mVar.f193465b.get(), mVar.f193464a);
                }
                if (i74 == 1) {
                    return new ebl.g();
                }
                throw new AssertionError(i74);
            case 13:
                fc4.c cVar = (fc4.c) this.f190962c;
                int i92 = this.f190961b;
                if (i92 == 0) {
                    return new ifm.b();
                }
                if (i92 == 1) {
                    return new iri.j();
                }
                if (i92 == 2) {
                    return new ec4.a((pgi.l) cVar.f133640g.get(), 1);
                }
                if (i92 == 3) {
                    return new pgi.o();
                }
                throw new AssertionError(i92);
            case 14:
                x9e.a aVar6 = ((lce.b) this.f190962c).f193880b;
                int i96 = this.f190961b;
                if (i96 == 0) {
                    return new ifm.b();
                }
                if (i96 == 1) {
                    return new iri.j();
                }
                if (i96 == 2) {
                    return new kce.b();
                }
                if (i96 != 3) {
                    throw new AssertionError(i96);
                }
                z8e.a aVarD = aVar6.d();
                vc.s.j(aVarD);
                c9e.c cVarB = aVar6.b();
                vc.s.j(cVarB);
                return new kce.r(aVarD, cVarB);
            case 15:
                ld1.b bVar3 = (ld1.b) this.f190962c;
                AddNoteScreenContract$InputData addNoteScreenContract$InputData = bVar3.f193923a;
                int i99 = this.f190961b;
                if (i99 == 0) {
                    return new ee1.i(addNoteScreenContract$InputData, (jki.p) bVar3.f193925c.get());
                }
                if (i99 == 1) {
                    return new ee1.h(addNoteScreenContract$InputData);
                }
                throw new AssertionError(i99);
            case 16:
                l70.e eVar = ((ld1.l) this.f190962c).e;
                int i100 = this.f190961b;
                if (i100 == 0) {
                    return new com.revolut.feature.acquiring.lite_pos.impl.ui.flow.manage_tax_rates.a();
                }
                if (i100 != 1) {
                    throw new AssertionError(i100);
                }
                qd0.b bVarN = eVar.n();
                vc.s.j(bVarN);
                u80.t tVarU = eVar.u();
                vc.s.j(tVarU);
                return new rd1.d(bVarN, tVarU);
            case 17:
                lf9.a aVar7 = (lf9.a) this.f190962c;
                up1.c cVar2 = aVar7.f194679b;
                int i101 = this.f190961b;
                if (i101 == 0) {
                    sri.m mVar2 = (sri.m) aVar7.d.get();
                    vo1.c cVarA = ((up1.e) cVar2).a();
                    vc.s.j(cVarA);
                    return new kf9.c(mVar2, cVarA);
                }
                if (i101 == 1) {
                    Context context = aVar7.f194678a;
                    b0.Companion.getClass();
                    Intrinsics.checkNotNullParameter(context, "context");
                    return sri.o.c(context, null, null, 14);
                }
                if (i101 == 2) {
                    sri.m mVar3 = (sri.m) aVar7.d.get();
                    vo1.c cVarA2 = ((up1.e) cVar2).a();
                    vc.s.j(cVarA2);
                    return new kf9.f(mVar3, cVarA2, aVar7.f194680c.e());
                }
                if (i101 != 3) {
                    throw new AssertionError(i101);
                }
                vo1.c cVarA3 = ((up1.e) cVar2).a();
                vc.s.j(cVarA3);
                return new kf9.j((sri.m) aVar7.d.get(), cVarA3);
            case 18:
                int i102 = this.f190961b;
                if (i102 == 0) {
                    lf9.w wVar = (lf9.w) this.f190962c;
                    return new mg9.h(wVar.f194809b, (cli.n) wVar.f194810c.get());
                }
                if (i102 == 1) {
                    return new mg9.g();
                }
                throw new AssertionError(i102);
            case 19:
                lf9.y yVar = (lf9.y) this.f190962c;
                int i103 = this.f190961b;
                if (i103 == 0) {
                    return new og9.j((cli.n) yVar.f194816c.get(), yVar.f194815b);
                }
                if (i103 == 1) {
                    return new og9.k();
                }
                throw new AssertionError(i103);
            case 20:
                int i104 = this.f190961b;
                if (i104 == 0) {
                    lf9.w wVar2 = (lf9.w) this.f190962c;
                    return new mg9.h(wVar2.f194809b, (cli.n) wVar2.f194810c.get());
                }
                if (i104 == 1) {
                    return new mg9.g();
                }
                throw new AssertionError(i104);
            case 21:
                lf9.y yVar2 = (lf9.y) this.f190962c;
                int i105 = this.f190961b;
                if (i105 == 0) {
                    return new og9.j((cli.n) yVar2.f194816c.get(), yVar2.f194815b);
                }
                if (i105 == 1) {
                    return new og9.k();
                }
                throw new AssertionError(i105);
            case 22:
                int i106 = this.f190961b;
                if (i106 == 0) {
                    lf9.w wVar3 = (lf9.w) this.f190962c;
                    return new mg9.h(wVar3.f194809b, (cli.n) wVar3.f194810c.get());
                }
                if (i106 == 1) {
                    return new mg9.g();
                }
                throw new AssertionError(i106);
            case 23:
                lf9.y yVar3 = (lf9.y) this.f190962c;
                int i107 = this.f190961b;
                if (i107 == 0) {
                    return new og9.j((cli.n) yVar3.f194816c.get(), yVar3.f194815b);
                }
                if (i107 == 1) {
                    return new og9.k();
                }
                throw new AssertionError(i107);
            case 24:
                ljl.k kVar = (ljl.k) this.f190962c;
                oll.e eVar2 = kVar.f196004a;
                int i108 = this.f190961b;
                if (i108 == 0) {
                    return new oll.j(eVar2, (cli.n) kVar.d.get());
                }
                if (i108 == 1) {
                    return new i3g.k(eVar2);
                }
                throw new AssertionError(i108);
            case 25:
                int i109 = this.f190961b;
                if (i109 == 0) {
                    ljl.q qVar = (ljl.q) this.f190962c;
                    return new com.revolut.sso.impl.ui.passcode.create_flow.c(qVar.f196052a, (hzl.e) qVar.d.get());
                }
                if (i109 != 1) {
                    throw new AssertionError(i109);
                }
                aol.b.Companion.getClass();
                return new hzl.e(0);
            case 26:
                ljl.r rVar = (ljl.r) this.f190962c;
                int i110 = this.f190961b;
                if (i110 == 0) {
                    return new af9.j((cli.n) rVar.f196087b.get(), new ew3.a(ImmutableSet.of((ze9.d) new ze9.a(), (ze9.d) new ze9.b(), (ze9.d) new ze9.c(), new ze9.d())));
                }
                if (i110 == 1) {
                    return new af9.k();
                }
                throw new AssertionError(i110);
            case 27:
                int i111 = this.f190961b;
                if (i111 == 0) {
                    return new rml.c((jki.p) ((ljl.t) this.f190962c).f196099b.get());
                }
                if (i111 == 1) {
                    return new rml.d();
                }
                throw new AssertionError(i111);
            case 28:
                int i112 = this.f190961b;
                if (i112 == 0) {
                    return new gll.j((jki.p) ((ljl.w) this.f190962c).f196122a.get());
                }
                if (i112 == 1) {
                    return new gll.k();
                }
                throw new AssertionError(i112);
            default:
                int i113 = this.f190961b;
                if (i113 == 0) {
                    return new enl.d((jki.p) ((ljl.x) this.f190962c).f196135b.get());
                }
                if (i113 == 1) {
                    return new enl.e();
                }
                throw new AssertionError(i113);
        }
    }
}
