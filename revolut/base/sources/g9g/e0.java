package g9g;

import android.app.Activity;
import android.content.Context;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.card_design.impl.card_design.CardDesignFlowContract$InputData;
import com.revolut.feature.card_design.impl.card_design.card_personalisation_info.CardPersonalisationInfoScreenContract$InputData;
import com.revolut.feature.card_design.impl.card_design.local_global_card_info.LocalGlobalCardInfoScreenContract$InputData;
import com.revolut.feature.junior_tasks.impl.services.JuniorTasksRewardsQuoteService;
import com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.overview.flow.ChallengesOverviewContract$InputData;
import com.revolut.feature.payments.bills_chooser.api.navigation.BillsChooserInputData;
import com.revolut.feature.payments.bills_chooser.api.navigation.SplitBillInputData;
import com.revolut.feature.payments.bills_chooser.impl.data.ItemizationScanBillService;
import com.revolut.feature.transactions.impl.ui.pending.screen.PendingTransactionScreenContract$InputData;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.TravelHotelsHomeBookingsScreenContract$InputData;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.location_picker.TravelHotelsLocationPickerScreenContract$InputData;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.picker.dates.TravelHotelsDatesPickerScreenContract$InputData;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.traveller_information_edit.TravelHotelsTravellerInformationEditScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import java.util.Collection;
import java.util.Optional;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import om4.m4;
import qgk.k3;
import sgm.e3;
import t80.e;

/* JADX INFO: loaded from: classes9.dex */
public final class e0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f141655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f141656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f141657c;
    public final Object d;

    public /* synthetic */ e0(Object obj2, Object obj3, int i, int i2) {
        this.f141655a = i2;
        this.f141656b = obj2;
        this.d = obj3;
        this.f141657c = i;
    }

    private final Object a() {
        gp9.d dVar = (gp9.d) this.f141656b;
        gp9.i iVar = (gp9.i) this.d;
        int i = this.f141657c;
        switch (i) {
            case 0:
                return kxa.j.k((j60.a) iVar.f.get());
            case 1:
                return ehe.n.s((com.revolut.kompot.navigable.a) iVar.d.get(), (rp0.m) iVar.e.get());
            case 2:
                return new rp0.m();
            case 3:
                n60.a aVar = (n60.a) iVar.f145384h.get();
                o5k.i.l(aVar);
                return aVar;
            case 4:
                return o5k.i.q((com.revolut.kompot.navigable.a) iVar.d.get());
            case 5:
                return f0k.d.p((e60.a) iVar.f145389p.get());
            case 6:
                com.revolut.kompot.navigable.a aVar2 = (com.revolut.kompot.navigable.a) iVar.d.get();
                g60.a aVarA = f60.v.a((com.revolut.kompot.navigable.a) iVar.d.get());
                Activity activityA = f60.t.a((com.revolut.kompot.navigable.a) iVar.d.get());
                t80.x xVarJ = iVar.j();
                com.revolut.kompot.navigable.a aVar3 = (com.revolut.kompot.navigable.a) iVar.d.get();
                f60.y.a(aVar3);
                d4m.a aVarA2 = e4m.b.a(iVar.f145385j);
                nli.a aVar4 = new nli.a((t80.c) iVar.k.get(), f60.t.a((com.revolut.kompot.navigable.a) iVar.d.get()));
                t80.x xVarJ2 = iVar.j();
                zk0.b bVarL = iVar.f145381b.f145357g.l();
                vc.s.j(bVarL);
                return v1.c.q(aVar2, new t80.v(aVarA, activityA, xVarJ, aVar3, aVarA2, aVar4, new oli.c(xVarJ2, bVarL, new nli.a((t80.c) iVar.k.get(), f60.t.a((com.revolut.kompot.navigable.a) iVar.d.get())), f60.v.a((com.revolut.kompot.navigable.a) iVar.d.get()), iVar.c()), new oli.g(f60.u.a(f60.t.a((com.revolut.kompot.navigable.a) iVar.d.get())), v1.c.e((com.revolut.kompot.navigable.a) iVar.d.get()), new ami.n(e4m.b.a(iVar.f145386l), 1), e4m.b.a(iVar.f145385j), iVar.j(), new nli.a((t80.c) iVar.k.get(), f60.t.a((com.revolut.kompot.navigable.a) iVar.d.get())), new i90.b(), iVar.b(), iVar.c()), iVar.c()), f60.x.a(), (rp0.m) iVar.f145387m.get(), (e60.t) iVar.o.get());
            case 7:
                com.revolut.kompot.navigable.a aVar5 = (com.revolut.kompot.navigable.a) iVar.d.get();
                f60.y.a(aVar5);
                return pli.c.a(new ks0.n(aVar5));
            case 8:
                gq9.h.Companion.getClass();
                return new t80.c(new e.a("scan_bill_itemization"), 20971520L);
            case 9:
                return t96.a.a();
            case 10:
                return f60.z.a();
            case 11:
                aii.o oVar = (aii.o) iVar.f145388n.get();
                y80.a aVarR = dVar.f145357g.r();
                vc.s.j(aVarR);
                return new e60.y(oVar, aVarR, iVar.b(), Optional.empty());
            case 12:
                gq9.f extension = (gq9.f) iVar.f145391r.get();
                gq9.h.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension, "extension");
                vc.s.k(extension);
                return extension;
            case 13:
                e60.a mediaPickerControllerExtension = (e60.a) iVar.f145389p.get();
                zk0.b bVarL2 = dVar.f145359j.f135915a.l();
                vc.s.j(bVarL2);
                kl9.c scanFlowFileFactory = new kl9.c(bVarL2);
                gq9.i scanBillDialogsFactory = new gq9.i();
                kl9.d scanFlowProgressProducer = new kl9.d();
                gp9.d dVar2 = iVar.f145381b;
                nj0.a aVar6 = dVar2.k;
                l70.e eVar = dVar2.f145357g;
                nj0.d dVar3 = (nj0.d) aVar6;
                ik0.b retrofitFactory = dVar3.m();
                vc.s.j(retrofitFactory);
                ek.a converterFactory = dVar3.d();
                Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
                Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
                Object objCreate = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27).create(ItemizationScanBillService.class);
                Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
                ItemizationScanBillService itemizationScanBillService = (ItemizationScanBillService) objCreate;
                vc.s.k(itemizationScanBillService);
                zk0.b bVarL3 = eVar.l();
                vc.s.j(bVarL3);
                lp9.b bVar = new lp9.b(itemizationScanBillService, bVarL3);
                l80.e eVarH = eVar.h();
                vc.s.j(eVarH);
                g2e.t scanBillInteractor = new g2e.t(bVar, eVarH);
                i90.b uuidUtils = new i90.b();
                SplitBillInputData inputData = iVar.f145380a;
                gq9.h.Companion.getClass();
                Intrinsics.checkNotNullParameter(mediaPickerControllerExtension, "mediaPickerControllerExtension");
                Intrinsics.checkNotNullParameter(scanFlowFileFactory, "scanFlowFileFactory");
                Intrinsics.checkNotNullParameter(scanBillDialogsFactory, "scanBillDialogsFactory");
                Intrinsics.checkNotNullParameter(scanFlowProgressProducer, "scanFlowProgressProducer");
                Intrinsics.checkNotNullParameter(scanBillInteractor, "scanBillInteractor");
                Intrinsics.checkNotNullParameter(uuidUtils, "uuidUtils");
                Intrinsics.checkNotNullParameter(inputData, "inputData");
                return new gq9.f(mediaPickerControllerExtension, scanBillInteractor, scanFlowProgressProducer, scanBillDialogsFactory, scanFlowFileFactory, uuidUtils, inputData);
            case 14:
                e60.t tVar = (e60.t) iVar.o.get();
                f60.w.a(tVar);
                return tVar;
            case 15:
                SplitBillInputData splitBillInputData = iVar.f145380a;
                SplitBillInputData splitBillInputData2 = iVar.f145380a;
                gp9.d dVar4 = iVar.f145381b;
                hp9.c cVar = (hp9.c) dVar4.f145366s.get();
                qd0.b bVarN = dVar4.f145357g.n();
                vc.s.j(bVarN);
                yp9.e eVar2 = new yp9.e(splitBillInputData, cVar, bVarN, new yp9.h());
                ang.f fVarE = dVar.f145360l.e();
                yp9.b bVar2 = new yp9.b(splitBillInputData2, new zp9.x(), new yp9.f());
                n60.a aVar7 = (n60.a) iVar.f145384h.get();
                j60.a aVar8 = (j60.a) iVar.f.get();
                nq9.c cVarC = dVar4.f145361m.c();
                vc.s.j(cVarC);
                zp9.s sVar = new zp9.s(cVarC);
                dl3.f fVarC = dVar4.i.c();
                vc.s.j(fVarC);
                zp9.v vVar = new zp9.v(sVar, new zp9.t(fVarC));
                np9.a aVar9 = new np9.a();
                SplitBillInputData splitBillInputData3 = iVar.f145380a;
                nhf.a aVarA3 = dVar.d.a();
                vc.s.j(aVarA3);
                gq9.f fVar = (gq9.f) iVar.f145391r.get();
                i90.b bVar3 = new i90.b();
                gte.a aVarB = dVar4.f145362n.b();
                vc.s.j(aVarB);
                return new com.revolut.feature.payments.bills_chooser.impl.ui.bills_split_summary.c(eVar2, fVarE, bVar2, aVar7, aVar8, vVar, aVar9, splitBillInputData3, aVarA3, fVar, new yp9.a(splitBillInputData2, bVar3, new toh.d(aVarB, splitBillInputData2)), (cli.n) iVar.v.get());
            case 16:
                SplitBillInputData splitBillInputData4 = iVar.f145380a;
                SplitBillInputData splitBillInputData5 = iVar.f145380a;
                gp9.d dVar5 = iVar.f145381b;
                djf.c cVar2 = dVar5.f;
                thf.d dVarD = cVar2.d();
                vc.s.j(dVarD);
                thf.m mVarG = cVar2.g();
                vc.s.j(mVarG);
                nq9.c cVarC2 = dVar5.f145361m.c();
                vc.s.j(cVarC2);
                zp9.b bVar4 = new zp9.b(dVarD, mVarG, cVarC2, (a9e.h) iVar.u.get());
                zp9.c0 splitsHeaderTitleMapper = new zp9.c0();
                Intrinsics.checkNotNullParameter(splitsHeaderTitleMapper, "splitsHeaderTitleMapper");
                zp9.a0 a0Var = new zp9.a0();
                nq9.c cVarC3 = dVar5.f145361m.c();
                vc.s.j(cVarC3);
                zp9.e eVar3 = new zp9.e(cVarC3, new zp9.r());
                dl3.f fVarC2 = dVar5.i.c();
                vc.s.j(fVarC2);
                zp9.d0 d0Var = new zp9.d0(eVar3, new zp9.n(fVarC2, new zp9.r(), new zp9.o()));
                gte.a aVarB2 = dVar5.f145362n.b();
                vc.s.j(aVarB2);
                return new com.revolut.feature.payments.bills_chooser.impl.ui.bills_split_summary.d(splitBillInputData4, bVar4, a0Var, d0Var, new zp9.y(new toh.d(aVarB2, splitBillInputData5), splitBillInputData5), new e3(new zp9.j(new zp9.k(), dVar5.f145364q.b(), splitBillInputData5, new zp9.h()), new zp9.g(splitBillInputData5)));
            case 17:
                mae.p factory = dVar.o.e();
                vc.s.j(factory);
                f01.c uiKitResources = dVar.f145363p.g();
                t70.b currenciesLocalization = dVar.f145357g.g();
                vc.s.j(currenciesLocalization);
                xp9.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory, "factory");
                Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
                Intrinsics.checkNotNullParameter(currenciesLocalization, "currenciesLocalization");
                return factory.d(uiKitResources, currenciesLocalization);
            case 18:
                qd0.b languageProvider = dVar.f145357g.n();
                vc.s.j(languageProvider);
                xp9.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
                return new u80.d(((s80.b) languageProvider).b());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object b() {
        h08.h hVar = (h08.h) this.f141656b;
        h08.b bVar = (h08.b) this.d;
        int i = this.f141657c;
        switch (i) {
            case 0:
                return kpi.f.a();
            case 1:
                Context contextI = bq.i.i(bVar.f148212a);
                BaseDelegatesActivity baseDelegatesActivityF = bq.i.f(bVar.f148212a);
                t70.g gVarO = hVar.f148280b.o();
                vc.s.j(gVarO);
                return new npi.c(contextI, baseDelegatesActivityF, gVarO);
            case 2:
                return new tpi.i((rpi.c) bVar.e.get(), gsi.c.a(bVar.f148212a));
            case 3:
                return new rpi.b(bq.i.b(bVar.f148212a));
            case 4:
                return new rpi.h(bq.i.b(bVar.f148212a));
            case 5:
                return new iri.g((iri.j) hVar.f148284j.get(), new f08.k(), bq.i.f(bVar.f148212a), bq.i.l(bVar.f148212a));
            case 6:
                return new iri.l(new f08.k(), bq.i.f(bVar.f148212a), (iri.d) bVar.i.get());
            case 7:
                return new iri.d(bq.i.f(bVar.f148212a));
            case 8:
                return new opi.b(bq.i.f(bVar.f148212a));
            case 9:
                bVar.getClass();
                return new xpi.c(xpi.f.d, bq.i.b(bVar.f148212a));
            case 10:
                return new en.c(ImmutableSet.of((ln.d) bVar.f148213b.f148285l.get()), bq.i.l(bVar.f148212a));
            case 11:
                i08.h hVar2 = new i08.h((xpi.g) bVar.f148218l.get(), (f08.d) hVar.L.get(), (f08.a) hVar.B.get(), (f9b.f) bVar.f148220n.get(), new j08.a(), new yx7.q());
                kli.a.p(hVar2, bq.i.d(bVar.f148212a));
                return hVar2;
            case 12:
                return bq.i.t(bVar.f148212a);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object c() {
        h08.h hVar = (h08.h) this.f141656b;
        h08.c cVar = (h08.c) this.d;
        int i = this.f141657c;
        switch (i) {
            case 0:
                return kpi.f.a();
            case 1:
                Context contextI = bq.i.i(cVar.f148221a);
                BaseDelegatesActivity baseDelegatesActivityF = bq.i.f(cVar.f148221a);
                t70.g gVarO = hVar.f148280b.o();
                vc.s.j(gVarO);
                return new npi.c(contextI, baseDelegatesActivityF, gVarO);
            case 2:
                return new tpi.i((rpi.c) cVar.e.get(), gsi.c.a(cVar.f148221a));
            case 3:
                return new rpi.b(bq.i.b(cVar.f148221a));
            case 4:
                return new rpi.h(bq.i.b(cVar.f148221a));
            case 5:
                return new iri.g((iri.j) hVar.f148284j.get(), new f08.k(), bq.i.f(cVar.f148221a), bq.i.l(cVar.f148221a));
            case 6:
                return new iri.l(new f08.k(), bq.i.f(cVar.f148221a), (iri.d) cVar.i.get());
            case 7:
                return new iri.d(bq.i.f(cVar.f148221a));
            case 8:
                return new opi.b(bq.i.f(cVar.f148221a));
            case 9:
                cVar.getClass();
                return new xpi.c(xpi.f.d, bq.i.b(cVar.f148221a));
            case 10:
                cVar.getClass();
                return new cn.d(ImmutableSet.copyOf((Collection) dn.b.a()), (cn.e) hVar.o.get(), hVar.h());
            case 11:
                um.c cVar2 = (um.c) hVar.f148288p.get();
                cVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(6);
                h08.h hVar2 = cVar.f148222b;
                builderBuilderWithExpectedSize.add(hVar2.c());
                builderBuilderWithExpectedSize.add(new vm.b(com.google.android.gms.internal.mlkit_vision_face.a.f()));
                builderBuilderWithExpectedSize.add(hVar2.i());
                builderBuilderWithExpectedSize.add(hVar2.f148292t.get());
                builderBuilderWithExpectedSize.addAll((Iterable) in.g.a());
                builderBuilderWithExpectedSize.add(new jn.d(e4m.b.a(cVar.f148229n)));
                return new in.e(cVar2, builderBuilderWithExpectedSize.build(), hVar.h());
            case 12:
                return bq.i.t(cVar.f148221a);
            case 13:
                cVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize2 = ImmutableSet.builderWithExpectedSize(3);
                builderBuilderWithExpectedSize2.addAll((Iterable) kn.g.a());
                builderBuilderWithExpectedSize2.add(cVar.f148230p.get());
                builderBuilderWithExpectedSize2.add(new kn.h(e4m.b.a(cVar.f)));
                return new kn.e(builderBuilderWithExpectedSize2.build(), (ym.d) hVar.f148291s.get(), hVar.h());
            case 14:
                return new zm.a();
            case 15:
                cVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize3 = ImmutableSet.builderWithExpectedSize(2);
                builderBuilderWithExpectedSize3.addAll((Iterable) hn.g.a());
                builderBuilderWithExpectedSize3.add(cVar.f148222b.i());
                return new hn.d(builderBuilderWithExpectedSize3.build(), (hn.h) hVar.f148289q.get(), (npi.f) cVar.d.get());
            case 16:
                return new en.c(ImmutableSet.of((ln.d) cVar.f148222b.f148285l.get()), bq.i.l(cVar.f148221a));
            case 17:
                return new gn.c((lpi.e) cVar.f148234t.get(), (sm.e) hVar.F.get(), ImmutableSet.copyOf((Collection) gn.e.a()), hVar.h());
            case 18:
                return new lpi.b(bq.i.i(cVar.f148221a), bq.i.j(cVar.f148221a));
            case 19:
                cVar.getClass();
                return new in.e(ImmutableSet.copyOf((Collection) pm.b.a()), (om.c) hVar.G.get(), hVar.h());
            case 20:
                cqi.h hVar3 = (cqi.h) cVar.f148235w.get();
                an.a aVar = (an.a) hVar.z.get();
                ImmutableSet.Builder builderBuilderWithExpectedSize4 = ImmutableSet.builderWithExpectedSize(2);
                builderBuilderWithExpectedSize4.add(cVar.f148222b.C.get());
                builderBuilderWithExpectedSize4.addAll((Iterable) bn.b.a());
                return new an.q(hVar3, aVar, builderBuilderWithExpectedSize4.build(), hVar.h());
            case 21:
                return new cqi.j(bq.i.f(cVar.f148221a));
            case 22:
                return new wm.l((opi.d) cVar.k.get(), (wm.a) hVar.f148294x.get(), ImmutableSet.copyOf((Collection) xm.b.a()), hVar.h());
            case 23:
                xpi.g gVar = (xpi.g) cVar.f148227l.get();
                f08.d dVar = (f08.d) hVar.L.get();
                f08.a aVar2 = (f08.a) hVar.B.get();
                f9b.f fVar = (f9b.f) cVar.f148229n.get();
                tpi.j jVar = (tpi.j) cVar.f.get();
                z80.b bVarS = cVar.f148222b.f148280b.s();
                vc.s.j(bVarS);
                m08.l lVar = new m08.l(gVar, dVar, aVar2, fVar, jVar, new g08.e(bVarS), (opi.d) cVar.k.get(), (mm.d) hVar.u.get());
                kli.a.p(lVar, bq.i.d(cVar.f148221a));
                return lVar;
            default:
                throw new AssertionError(i);
        }
    }

    @Override // phm.a
    public final Object get() {
        Object jVar;
        Object cVar;
        Object cVar2;
        switch (this.f141655a) {
            case 0:
                f0 f0Var = (f0) this.d;
                d dVar = (d) this.f141656b;
                int i = this.f141657c;
                if (i == 0) {
                    xdg.a extension = (xdg.a) f0Var.f141665b.get();
                    heg.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(extension, "extension");
                    vc.s.k(extension);
                    return extension;
                }
                if (i == 1) {
                    return new xdg.f((i9g.n) dVar.p0.get(), (i9g.l) dVar.E0.get(), (i9g.h0) dVar.f141631o0.get(), (i9g.b0) dVar.m0.get());
                }
                if (i == 2) {
                    return new com.revolut.feature.travel.hotels.impl.ui_kompot.screen.room_details.a((cli.n) f0Var.d.get(), f0Var.f141664a, (i9g.l) dVar.E0.get(), (xdg.a) f0Var.f141665b.get(), (p8g.c) dVar.g0.get());
                }
                if (i == 3) {
                    return new geg.l((p8g.c) dVar.g0.get());
                }
                throw new AssertionError(i);
            case 1:
                d dVar2 = (d) this.f141656b;
                int i2 = this.f141657c;
                if (i2 != 0) {
                    if (i2 == 1) {
                        return new xdg.f((i9g.n) dVar2.p0.get(), (i9g.l) dVar2.E0.get(), (i9g.h0) dVar2.f141631o0.get(), (i9g.b0) dVar2.m0.get());
                    }
                    if (i2 == 2) {
                        return new deg.i(new deg.j());
                    }
                    throw new AssertionError(i2);
                }
                xdg.a extension2 = (xdg.a) ((h0) this.d).f141684a.get();
                eeg.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension2, "extension");
                vc.s.k(extension2);
                return extension2;
            case 2:
                m0 m0Var = (m0) this.d;
                d dVar3 = (d) this.f141656b;
                int i3 = this.f141657c;
                if (i3 == 0) {
                    return new afg.i((cli.n) m0Var.d.get(), m0Var.f141739a, (i9g.l0) dVar3.H0.get(), (i9g.n) dVar3.p0.get(), (p8g.c) dVar3.g0.get());
                }
                if (i3 == 1) {
                    jVar = new afg.j((cfg.e) m0Var.f141741c.get());
                } else {
                    if (i3 != 2) {
                        if (i3 == 3) {
                            return new cfg.b((p8g.c) dVar3.g0.get());
                        }
                        throw new AssertionError(i3);
                    }
                    jVar = new cfg.d((cfg.a) m0Var.f141740b.get());
                }
                return jVar;
            case 3:
                d dVar4 = (d) this.f141656b;
                n0 n0Var = (n0) this.d;
                int i5 = this.f141657c;
                if (i5 == 0) {
                    return new com.revolut.feature.travel.hotels.impl.ui_kompot.screen.traveller_information_edit.c((cli.n) n0Var.f141751c.get(), n0Var.f141749a, (i9g.l) dVar4.E0.get(), (i9g.n) dVar4.p0.get(), (i9g.n0) dVar4.z0.get());
                }
                if (i5 != 1) {
                    throw new AssertionError(i5);
                }
                TravelHotelsTravellerInformationEditScreenContract$InputData travelHotelsTravellerInformationEditScreenContract$InputData = n0Var.f141749a;
                d dVar5 = n0Var.f141750b;
                z80.b bVarS = dVar5.e.s();
                vc.s.j(bVarS);
                return new ac4.g(travelHotelsTravellerInformationEditScreenContract$InputData, new kag.a(bVarS, (i9g.n0) dVar5.z0.get()));
            case 4:
                o0 o0Var = (o0) this.d;
                d dVar6 = (d) this.f141656b;
                int i6 = this.f141657c;
                if (i6 == 0) {
                    return new com.revolut.feature.travel.hotels.impl.ui_kompot.flow.rooms_selection.a(o0Var.f141765a, (i9g.l) dVar6.E0.get(), (i9g.b0) dVar6.m0.get(), (i9g.h0) dVar6.f141631o0.get(), dVar6.c(), (xag.g) o0Var.d.get());
                }
                if (i6 == 1) {
                    return new xag.g();
                }
                throw new AssertionError(i6);
            case 5:
                d dVar7 = (d) this.f141656b;
                r0 r0Var = (r0) this.d;
                int i21 = this.f141657c;
                if (i21 == 0) {
                    dyb.a extension3 = (dyb.a) r0Var.f141805c.get();
                    lbg.c.Companion.getClass();
                    Intrinsics.checkNotNullParameter(extension3, "extension");
                    vc.s.k(extension3);
                    return extension3;
                }
                if (i21 == 1) {
                    o7.b provider = dVar7.i.d();
                    lbg.c.Companion.getClass();
                    Intrinsics.checkNotNullParameter(provider, "provider");
                    dyb.a aVarE = provider.e();
                    vc.s.k(aVarE);
                    return aVarE;
                }
                if (i21 != 2) {
                    throw new AssertionError(i21);
                }
                ebg.r rVar = new ebg.r(r0Var.f141804b, new dyf.f(new dyf.c()));
                TravelHotelsHomeBookingsScreenContract$InputData travelHotelsHomeBookingsScreenContract$InputData = r0Var.f141804b;
                ayf.n nVarA = dVar7.f141634r.a();
                vc.s.j(nVarA);
                fag.i0 i0Var = (fag.i0) dVar7.B0.get();
                dyb.a aVar = (dyb.a) r0Var.f141805c.get();
                a29.b bVarA = dVar7.A.a();
                vc.s.j(bVarA);
                return new ebg.p(rVar, travelHotelsHomeBookingsScreenContract$InputData, nVarA, i0Var, aVar, bVarA);
            case 6:
                d dVar8 = (d) this.f141656b;
                r0 r0Var2 = (r0) this.d;
                int i22 = this.f141657c;
                if (i22 == 0) {
                    dyb.a extension4 = (dyb.a) r0Var2.f141805c.get();
                    lbg.c.Companion.getClass();
                    Intrinsics.checkNotNullParameter(extension4, "extension");
                    vc.s.k(extension4);
                    return extension4;
                }
                if (i22 == 1) {
                    o7.b provider2 = dVar8.i.d();
                    lbg.c.Companion.getClass();
                    Intrinsics.checkNotNullParameter(provider2, "provider");
                    dyb.a aVarE2 = provider2.e();
                    vc.s.k(aVarE2);
                    return aVarE2;
                }
                if (i22 != 2) {
                    throw new AssertionError(i22);
                }
                ebg.r rVar2 = new ebg.r(r0Var2.f141804b, new dyf.f(new dyf.c()));
                TravelHotelsHomeBookingsScreenContract$InputData travelHotelsHomeBookingsScreenContract$InputData2 = r0Var2.f141804b;
                ayf.n nVarA2 = dVar8.f141634r.a();
                vc.s.j(nVarA2);
                fag.i0 i0Var2 = (fag.i0) dVar8.B0.get();
                dyb.a aVar2 = (dyb.a) r0Var2.f141805c.get();
                a29.b bVarA2 = dVar8.A.a();
                vc.s.j(bVarA2);
                return new ebg.p(rVar2, travelHotelsHomeBookingsScreenContract$InputData2, nVarA2, i0Var2, aVar2, bVarA2);
            case 7:
                z0 z0Var = (z0) this.d;
                d dVar9 = (d) this.f141656b;
                ite.a aVar3 = dVar9.f141622g;
                int i32 = this.f141657c;
                switch (i32) {
                    case 0:
                        n60.a aVar4 = (n60.a) z0Var.d.get();
                        o5k.i.l(aVar4);
                        return aVar4;
                    case 1:
                        return o5k.i.q((com.revolut.kompot.navigable.a) z0Var.f141866c.get());
                    case 2:
                        cli.n nVar = (cli.n) z0Var.i.get();
                        TravelHotelsLocationPickerScreenContract$InputData travelHotelsLocationPickerScreenContract$InputData = z0Var.f141865b;
                        p8g.d dVar10 = (p8g.d) dVar9.l0.get();
                        i9g.h0 h0Var = (i9g.h0) dVar9.f141631o0.get();
                        i9g.b0 b0Var = (i9g.b0) dVar9.m0.get();
                        w39.b bVarA3 = dVar9.f141638t.a();
                        vc.s.j(bVarA3);
                        n60.a aVar5 = (n60.a) z0Var.d.get();
                        l80.e eVarH = dVar9.e.h();
                        vc.s.j(eVarH);
                        gte.a aVarB = aVar3.b();
                        vc.s.j(aVarB);
                        return new com.revolut.feature.travel.hotels.impl.ui_kompot.screen.location_picker.a(nVar, travelHotelsLocationPickerScreenContract$InputData, dVar10, h0Var, b0Var, bVarA3, aVar5, eVarH, aVarB, ((s41.a) dVar9.u).d());
                    case 3:
                        oag.a aVar6 = (oag.a) z0Var.f.get();
                        oag.b bVar = (oag.b) z0Var.f141867g.get();
                        tcg.a aVar7 = (tcg.a) z0Var.f141868h.get();
                        gte.a aVarB2 = aVar3.b();
                        vc.s.j(aVarB2);
                        return new tcg.b0(aVar6, bVar, aVar7, aVarB2);
                    case 4:
                        return new oag.k();
                    case 5:
                        return new oag.l();
                    case 6:
                        n8b.a aVarA = dVar9.f141636s.a();
                        vc.s.j(aVarA);
                        gte.a aVarB3 = aVar3.b();
                        vc.s.j(aVarB3);
                        return new tcg.e0(aVarB3, aVarA);
                    default:
                        throw new AssertionError(i32);
                }
            case 8:
                z0 z0Var2 = (z0) this.d;
                d dVar11 = (d) this.f141656b;
                ite.a aVar8 = dVar11.f141622g;
                int i33 = this.f141657c;
                switch (i33) {
                    case 0:
                        n60.a aVar9 = (n60.a) z0Var2.d.get();
                        o5k.i.l(aVar9);
                        return aVar9;
                    case 1:
                        return o5k.i.q((com.revolut.kompot.navigable.a) z0Var2.f141866c.get());
                    case 2:
                        cli.n nVar2 = (cli.n) z0Var2.i.get();
                        TravelHotelsLocationPickerScreenContract$InputData travelHotelsLocationPickerScreenContract$InputData2 = z0Var2.f141865b;
                        p8g.d dVar12 = (p8g.d) dVar11.l0.get();
                        i9g.h0 h0Var2 = (i9g.h0) dVar11.f141631o0.get();
                        i9g.b0 b0Var2 = (i9g.b0) dVar11.m0.get();
                        w39.b bVarA4 = dVar11.f141638t.a();
                        vc.s.j(bVarA4);
                        n60.a aVar10 = (n60.a) z0Var2.d.get();
                        l80.e eVarH2 = dVar11.e.h();
                        vc.s.j(eVarH2);
                        gte.a aVarB4 = aVar8.b();
                        vc.s.j(aVarB4);
                        return new com.revolut.feature.travel.hotels.impl.ui_kompot.screen.location_picker.a(nVar2, travelHotelsLocationPickerScreenContract$InputData2, dVar12, h0Var2, b0Var2, bVarA4, aVar10, eVarH2, aVarB4, ((s41.a) dVar11.u).d());
                    case 3:
                        oag.a aVar11 = (oag.a) z0Var2.f.get();
                        oag.b bVar2 = (oag.b) z0Var2.f141867g.get();
                        tcg.a aVar12 = (tcg.a) z0Var2.f141868h.get();
                        gte.a aVarB5 = aVar8.b();
                        vc.s.j(aVarB5);
                        return new tcg.b0(aVar11, bVar2, aVar12, aVarB5);
                    case 4:
                        return new oag.k();
                    case 5:
                        return new oag.l();
                    case 6:
                        n8b.a aVarA2 = dVar11.f141636s.a();
                        vc.s.j(aVarA2);
                        gte.a aVarB6 = aVar8.b();
                        vc.s.j(aVarB6);
                        return new tcg.e0(aVarB6, aVarA2);
                    default:
                        throw new AssertionError(i33);
                }
            case 9:
                z0 z0Var3 = (z0) this.d;
                d dVar13 = (d) this.f141656b;
                ite.a aVar13 = dVar13.f141622g;
                int i43 = this.f141657c;
                switch (i43) {
                    case 0:
                        n60.a aVar14 = (n60.a) z0Var3.d.get();
                        o5k.i.l(aVar14);
                        return aVar14;
                    case 1:
                        return o5k.i.q((com.revolut.kompot.navigable.a) z0Var3.f141866c.get());
                    case 2:
                        cli.n nVar3 = (cli.n) z0Var3.i.get();
                        TravelHotelsLocationPickerScreenContract$InputData travelHotelsLocationPickerScreenContract$InputData3 = z0Var3.f141865b;
                        p8g.d dVar14 = (p8g.d) dVar13.l0.get();
                        i9g.h0 h0Var3 = (i9g.h0) dVar13.f141631o0.get();
                        i9g.b0 b0Var3 = (i9g.b0) dVar13.m0.get();
                        w39.b bVarA5 = dVar13.f141638t.a();
                        vc.s.j(bVarA5);
                        n60.a aVar15 = (n60.a) z0Var3.d.get();
                        l80.e eVarH3 = dVar13.e.h();
                        vc.s.j(eVarH3);
                        gte.a aVarB7 = aVar13.b();
                        vc.s.j(aVarB7);
                        return new com.revolut.feature.travel.hotels.impl.ui_kompot.screen.location_picker.a(nVar3, travelHotelsLocationPickerScreenContract$InputData3, dVar14, h0Var3, b0Var3, bVarA5, aVar15, eVarH3, aVarB7, ((s41.a) dVar13.u).d());
                    case 3:
                        oag.a aVar16 = (oag.a) z0Var3.f.get();
                        oag.b bVar3 = (oag.b) z0Var3.f141867g.get();
                        tcg.a aVar17 = (tcg.a) z0Var3.f141868h.get();
                        gte.a aVarB8 = aVar13.b();
                        vc.s.j(aVarB8);
                        return new tcg.b0(aVar16, bVar3, aVar17, aVarB8);
                    case 4:
                        return new oag.k();
                    case 5:
                        return new oag.l();
                    case 6:
                        n8b.a aVarA3 = dVar13.f141636s.a();
                        vc.s.j(aVarA3);
                        gte.a aVarB9 = aVar13.b();
                        vc.s.j(aVarB9);
                        return new tcg.e0(aVarB9, aVarA3);
                    default:
                        throw new AssertionError(i43);
                }
            case 10:
                d dVar15 = (d) this.f141656b;
                d1 d1Var = (d1) this.d;
                int i59 = this.f141657c;
                if (i59 != 0) {
                    if (i59 == 1) {
                        return new ycg.k();
                    }
                    throw new AssertionError(i59);
                }
                cli.n nVar4 = (cli.n) d1Var.f141651c.get();
                TravelHotelsDatesPickerScreenContract$InputData travelHotelsDatesPickerScreenContract$InputData = d1Var.f141650b;
                l80.e eVarH4 = dVar15.e.h();
                vc.s.j(eVarH4);
                return new com.revolut.feature.travel.hotels.impl.ui_kompot.screen.picker.dates.a(nVar4, travelHotelsDatesPickerScreenContract$InputData, eVarH4, (i9g.h0) dVar15.f141631o0.get());
            case 11:
                d dVar16 = (d) this.f141656b;
                d1 d1Var2 = (d1) this.d;
                int i66 = this.f141657c;
                if (i66 != 0) {
                    if (i66 == 1) {
                        return new ycg.k();
                    }
                    throw new AssertionError(i66);
                }
                cli.n nVar5 = (cli.n) d1Var2.f141651c.get();
                TravelHotelsDatesPickerScreenContract$InputData travelHotelsDatesPickerScreenContract$InputData2 = d1Var2.f141650b;
                l80.e eVarH5 = dVar16.e.h();
                vc.s.j(eVarH5);
                return new com.revolut.feature.travel.hotels.impl.ui_kompot.screen.picker.dates.a(nVar5, travelHotelsDatesPickerScreenContract$InputData2, eVarH5, (i9g.h0) dVar16.f141631o0.get());
            case 12:
                int i74 = this.f141657c;
                if (i74 == 0) {
                    return new jeg.j((cli.n) ((j1) this.d).f141722b.get(), (xag.g) ((p0) this.f141656b).e.get());
                }
                if (i74 == 1) {
                    return new jeg.k();
                }
                throw new AssertionError(i74);
            case 13:
                int i92 = this.f141657c;
                if (i92 == 0) {
                    return new jeg.j((cli.n) ((j1) this.d).f141722b.get(), (xag.g) ((o0) this.f141656b).d.get());
                }
                if (i92 == 1) {
                    return new jeg.k();
                }
                throw new AssertionError(i92);
            case 14:
                ga.c cVar3 = (ga.c) this.d;
                int i96 = this.f141657c;
                if (i96 == 0) {
                    til.m mVarA = ((ga.a) this.f141656b).f141955a.a();
                    vc.s.j(mVarA);
                    return new com.feature.navigation.hub.impl.ui.flow.d(mVarA, (rp0.g1) cVar3.e.get(), cVar3.f141965a);
                }
                if (i96 != 1) {
                    throw new AssertionError(i96);
                }
                com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) cVar3.d.get();
                la.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller, "controller");
                return rp0.x0.a(rp0.g1.Companion, controller.D2());
            case 15:
                gnf.a aVar18 = (gnf.a) this.f141656b;
                gnf.e eVar = (gnf.e) this.d;
                int i99 = this.f141657c;
                if (i99 == 0) {
                    return kxa.j.l((j60.a) eVar.d.get());
                }
                if (i99 == 1) {
                    return h30.l.p((com.revolut.kompot.navigable.a) eVar.f144986b.get(), (rp0.m) eVar.f144987c.get());
                }
                if (i99 == 2) {
                    return new rp0.m();
                }
                if (i99 != 3) {
                    if (i99 != 4) {
                        throw new AssertionError(i99);
                    }
                    gte.a aVarB10 = aVar18.f144973b.b();
                    vc.s.j(aVarB10);
                    thf.g gVarE = aVar18.f144974c.e();
                    vc.s.j(gVarE);
                    return new nnf.n(aVarB10, gVarE);
                }
                jki.p pVar = (jki.p) eVar.f.get();
                PendingTransactionScreenContract$InputData pendingTransactionScreenContract$InputData = eVar.f144985a;
                com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) aVar18.d).c();
                vc.s.j(aVarC);
                mjf.u uVarA = aVar18.e.a();
                vc.s.j(uVarA);
                return new nnf.l(pVar, pendingTransactionScreenContract$InputData, aVarC, uVarA, (j60.a) eVar.d.get(), new nnf.a());
            case 16:
                gp8.k kVar = (gp8.k) this.d;
                gp8.n nVar6 = (gp8.n) this.f141656b;
                gp8.b bVar4 = nVar6.f145324a;
                int i100 = this.f141657c;
                if (i100 == 0) {
                    ChallengesOverviewContract$InputData challengesOverviewContract$InputData = kVar.f145315a;
                    hp8.b bVarA6 = bVar4.a();
                    vc.s.j(bVarA6);
                    wsg.n nVarB = nVar6.f145325b.b();
                    bq8.f fVar = new bq8.f();
                    sf0.h hVarB = nVar6.f145326c.b();
                    vc.s.j(hVarB);
                    v60.e eVarA = nVar6.d.a();
                    vc.s.j(eVarA);
                    return new bq8.e(challengesOverviewContract$InputData, bVarA6, nVarB, fVar, hVarB, eVarA);
                }
                if (i100 == 1) {
                    ChallengesOverviewContract$InputData challengesOverviewContract$InputData2 = kVar.f145315a;
                    hp8.b bVarA7 = bVar4.a();
                    vc.s.j(bVarA7);
                    return new com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.overview.flow.b(challengesOverviewContract$InputData2, bVarA7, (bq8.a) kVar.d.get(), (zp8.h) kVar.f.get(), new fkg.a(new kl.c0((JuniorTasksRewardsQuoteService) bVar4.f145294m.get())));
                }
                if (i100 != 2) {
                    if (i100 == 3) {
                        return aq8.c.a();
                    }
                    throw new AssertionError(i100);
                }
                ChallengesOverviewContract$InputData challengesOverviewContract$InputData3 = kVar.f145315a;
                CoroutineScope coroutineScope = (CoroutineScope) kVar.e.get();
                hp8.b bVarA8 = bVar4.a();
                vc.s.j(bVarA8);
                return new zp8.h(challengesOverviewContract$InputData3, coroutineScope, bVarA8, nVar6.e.a());
            case 17:
                djf.c cVar4 = ((gp9.d) this.f141656b).f;
                gp9.e eVar2 = (gp9.e) this.d;
                int i101 = this.f141657c;
                if (i101 == 0) {
                    return kxa.j.l((j60.a) eVar2.e.get());
                }
                if (i101 == 1) {
                    return h30.l.p((com.revolut.kompot.navigable.a) eVar2.f145369c.get(), (rp0.m) eVar2.d.get());
                }
                if (i101 == 2) {
                    return new rp0.m();
                }
                if (i101 != 3) {
                    if (i101 != 4) {
                        throw new AssertionError(i101);
                    }
                    thf.i iVar = (thf.i) cVar4.O.get();
                    vc.s.j(iVar);
                    thf.e eVar3 = (thf.e) cVar4.U.get();
                    vc.s.j(eVar3);
                    return new rp9.e(iVar, eVar3);
                }
                BillsChooserInputData billsChooserInputData = eVar2.f145367a;
                gp9.d dVar17 = eVar2.f145368b;
                opf.b bVarG = dVar17.f145354a.g();
                fk3.a aVarA4 = dVar17.f145355b.a();
                vc.s.j(aVarA4);
                com.revolut.domain.interactors.transactions.a aVarC2 = ((bjf.a) dVar17.f145356c).c();
                vc.s.j(aVarC2);
                nhf.a aVarA5 = dVar17.d.a();
                vc.s.j(aVarA5);
                return new rp9.m(billsChooserInputData, new sp9.b(bVarG, aVarA4, aVarC2, aVarA5, dVar17.e.b()), new tp9.a(), (j60.a) eVar2.e.get(), new kp9.a(), (jki.p) eVar2.f145370g.get());
            case 18:
                gp9.f fVar2 = (gp9.f) this.d;
                gp9.d dVar18 = (gp9.d) this.f141656b;
                l70.e eVar4 = dVar18.f145357g;
                int i102 = this.f141657c;
                if (i102 == 0) {
                    fk3.a aVarA6 = dVar18.f145355b.a();
                    vc.s.j(aVarA6);
                    return new up9.l(aVarA6, (w80.b) fVar2.f145373b.get(), new l2j.a(), (ldd.b) fVar2.f145374c.get(), fVar2.f145372a, (jki.p) fVar2.d.get());
                }
                if (i102 == 1) {
                    qd0.b languageProvider = eVar4.n();
                    vc.s.j(languageProvider);
                    vp9.a.Companion.getClass();
                    Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
                    return v80.b.b(languageProvider, false, false, 58);
                }
                if (i102 == 2) {
                    ldd.a factory = new ldd.a();
                    vp9.a.Companion.getClass();
                    Intrinsics.checkNotNullParameter(factory, "factory");
                    return new ldd.b();
                }
                if (i102 != 3) {
                    throw new AssertionError(i102);
                }
                w80.b bVar5 = (w80.b) fVar2.f145373b.get();
                qd0.b bVarN = eVar4.n();
                vc.s.j(bVarN);
                u80.o oVar = new u80.o();
                ldd.b bVar6 = (ldd.b) fVar2.f145374c.get();
                vo9.a aVarB11 = ((ut9.a) dVar18.f145358h).b();
                vc.s.j(aVarB11);
                return new up9.f(bVar5, bVarN, oVar, bVar6, aVarB11);
            case 19:
                return a();
            case 20:
                gsc.c cVar5 = (gsc.c) this.f141656b;
                gsc.e eVar5 = (gsc.e) this.d;
                int i103 = this.f141657c;
                if (i103 == 0) {
                    return new com.revolut.feature.sca_prompt.impl.trusted_entities.a(new nsc.o(new nd.k(new msc.a())), cVar5.a(), (nii.t0) eVar5.f146387b.get(), new dsc.a(), new psc.b(new dsc.a(), new nd.k(new msc.a()), new msc.a()));
                }
                if (i103 != 1) {
                    throw new AssertionError(i103);
                }
                ViewController controller2 = eVar5.f146386a;
                osc.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller2, "controller");
                return new nii.t0(controller2.m2());
            case 21:
                gxj.a aVar19 = (gxj.a) this.f141656b;
                int i104 = this.f141657c;
                if (i104 != 0) {
                    if (i104 != 1) {
                        throw new AssertionError(i104);
                    }
                    pwj.a aVar20 = aVar19.f147757a;
                    pwj.d.Companion.getClass();
                    return new wwj.h(new pwj.b());
                }
                cli.n nVar7 = (cli.n) ((ewj.b) this.d).f130301b.get();
                s70.a aVarM = aVar19.f147758b.m();
                vc.s.j(aVarM);
                w70.a aVar21 = aVar19.f147758b.f192433b;
                vc.s.j(aVar21);
                return new wwj.f(nVar7, aVarM, aVar21);
            case 22:
                gy2.e eVar6 = (gy2.e) this.d;
                gy2.d dVar19 = (gy2.d) this.f141656b;
                int i105 = this.f141657c;
                if (i105 != 0) {
                    if (i105 == 1) {
                        return new jx2.l();
                    }
                    if (i105 != 2) {
                        throw new AssertionError(i105);
                    }
                    CardDesignFlowContract$InputData inputData = eVar6.f147797a;
                    ux2.a.Companion.getClass();
                    Intrinsics.checkNotNullParameter(inputData, "inputData");
                    return new ay2.p(inputData.getF64617c(), inputData.getD());
                }
                CardDesignFlowContract$InputData cardDesignFlowContract$InputData = eVar6.f147797a;
                jr6.p pVar2 = (jr6.p) dVar19.f147784h.N0.get();
                vc.s.j(pVar2);
                k93.b bVar7 = (k93.b) dVar19.z.get();
                z43.c cVar6 = (z43.c) dVar19.i.k.get();
                vc.s.j(cVar6);
                jx2.l lVar = (jx2.l) eVar6.d.get();
                fn2.c cVarB = dVar19.f147785j.b();
                gy2.d dVar20 = eVar6.f147798b;
                hy2.f fVarA = dVar20.k.a();
                lg3.a aVarA7 = ((og3.e) dVar20.f147786l).a();
                vc.s.j(aVarA7);
                ffk.t tVarF = dVar20.f147787m.f();
                vc.s.j(tVarF);
                gte.a aVarB12 = dVar20.f147788n.b();
                vc.s.j(aVarB12);
                nyb.k kVarC = dVar20.o.c();
                vc.s.j(kVarC);
                ay2.h hVar = new ay2.h(fVarA, aVarA7, tVarF, aVarB12, kVarC);
                q89.e eVarA2 = dVar19.f147781b.a();
                vc.s.j(eVarA2);
                gte.a aVarB13 = dVar19.f147788n.b();
                vc.s.j(aVarB13);
                kx2.a aVarB14 = eVar6.b();
                vx2.c cVarD = dVar19.k.d();
                m4 m4VarD = dVar19.f147792s.d();
                ang.f fVarE = dVar19.f147791r.e();
                l93.f fVarJ = dVar19.f147780a.j();
                vc.s.j(fVarJ);
                return new com.revolut.feature.card_design.impl.card_design.d(cardDesignFlowContract$InputData, pVar2, bVar7, cVar6, lVar, cVarB, hVar, eVarA2, aVarB13, aVarB14, cVarD, m4VarD, fVarE, fVarJ, new i90.b());
            case 23:
                gy2.g gVar = (gy2.g) this.d;
                gy2.d dVar21 = (gy2.d) this.f141656b;
                int i106 = this.f141657c;
                if (i106 == 0) {
                    cli.n nVar8 = (cli.n) gVar.f147805c.get();
                    CardPersonalisationInfoScreenContract$InputData cardPersonalisationInfoScreenContract$InputData = gVar.f147803a;
                    ffk.t tVarF2 = dVar21.f147787m.f();
                    vc.s.j(tVarF2);
                    return new ox2.b(nVar8, cardPersonalisationInfoScreenContract$InputData, tVarF2);
                }
                if (i106 != 1) {
                    throw new AssertionError(i106);
                }
                hy2.f fVarA2 = dVar21.k.a();
                yik.h hVarB2 = ((k3) dVar21.f147795x).b();
                gte.a aVarB15 = dVar21.f147788n.b();
                vc.s.j(aVarB15);
                return new ox2.f(fVarA2, hVarB2, aVarB15);
            case 24:
                gy2.h hVar2 = (gy2.h) this.d;
                int i107 = this.f141657c;
                if (i107 == 0) {
                    return new qx2.c((cli.n) hVar2.f147808c.get(), hVar2.f147806a);
                }
                if (i107 == 1) {
                    return new qx2.g(((gy2.d) this.f141656b).a());
                }
                throw new AssertionError(i107);
            case 25:
                gy2.i iVar2 = (gy2.i) this.d;
                gy2.d dVar22 = (gy2.d) this.f141656b;
                int i108 = this.f141657c;
                if (i108 == 0) {
                    cli.n nVar9 = (cli.n) iVar2.f147811c.get();
                    LocalGlobalCardInfoScreenContract$InputData localGlobalCardInfoScreenContract$InputData = iVar2.f147809a;
                    q89.e eVarA3 = dVar22.f147781b.a();
                    vc.s.j(eVarA3);
                    l93.f fVarJ2 = dVar22.f147780a.j();
                    vc.s.j(fVarJ2);
                    return new wx2.e(nVar9, localGlobalCardInfoScreenContract$InputData, eVarA3, fVarJ2);
                }
                if (i108 != 1) {
                    throw new AssertionError(i108);
                }
                wx2.a aVar22 = new wx2.a();
                wx2.b bVar8 = new wx2.b();
                wx2.c cVar7 = new wx2.c();
                gte.a aVarB16 = dVar22.f147788n.b();
                vc.s.j(aVarB16);
                return new wx2.h(aVar22, bVar8, cVar7, aVarB16);
            case 26:
                h08.h hVar3 = (h08.h) this.f141656b;
                h08.a aVar23 = (h08.a) this.d;
                int i109 = this.f141657c;
                switch (i109) {
                    case 0:
                        return kpi.f.a();
                    case 1:
                        Context contextI = bq.i.i(aVar23.f148202a);
                        BaseDelegatesActivity baseDelegatesActivityF = bq.i.f(aVar23.f148202a);
                        t70.g gVarO = hVar3.f148280b.o();
                        vc.s.j(gVarO);
                        cVar = new npi.c(contextI, baseDelegatesActivityF, gVarO);
                        break;
                    case 2:
                        return new tpi.i((rpi.c) aVar23.e.get(), gsi.c.a(aVar23.f148202a));
                    case 3:
                        return new rpi.b(bq.i.b(aVar23.f148202a));
                    case 4:
                        return new rpi.h(bq.i.b(aVar23.f148202a));
                    case 5:
                        cVar = new iri.g((iri.j) hVar3.f148284j.get(), new f08.k(), bq.i.f(aVar23.f148202a), bq.i.l(aVar23.f148202a));
                        break;
                    case 6:
                        return new iri.l(new f08.k(), bq.i.f(aVar23.f148202a), (iri.d) aVar23.i.get());
                    case 7:
                        return new iri.d(bq.i.f(aVar23.f148202a));
                    case 8:
                        return new opi.b(bq.i.f(aVar23.f148202a));
                    case 9:
                        return new en.c(ImmutableSet.of((ln.d) aVar23.f148203b.f148285l.get()), bq.i.l(aVar23.f148202a));
                    case 10:
                        aVar23.getClass();
                        return new xpi.c(xpi.f.d, bq.i.b(aVar23.f148202a));
                    case 11:
                        aVar23.getClass();
                        xoi.d dVar23 = aVar23.f148202a;
                        return new ypi.e(ypi.h.d, bq.i.b(dVar23), bq.i.o(dVar23), bq.i.g(dVar23));
                    case 12:
                        xpi.g gVar2 = (xpi.g) aVar23.f148209m.get();
                        ypi.i iVar3 = (ypi.i) aVar23.f148210n.get();
                        f9b.f fVar3 = (f9b.f) aVar23.o.get();
                        f08.a aVar24 = (f08.a) hVar3.B.get();
                        f08.d dVar24 = (f08.d) hVar3.L.get();
                        yx7.d labelUiBuilder = new yx7.d();
                        Intrinsics.checkNotNullParameter(labelUiBuilder, "labelUiBuilder");
                        o08.k kVar2 = new o08.k(gVar2, iVar3, fVar3, aVar24, dVar24, new p08.b(), new n08.e0());
                        kli.a.p(kVar2, bq.i.d(aVar23.f148202a));
                        return kVar2;
                    case 13:
                        return bq.i.t(aVar23.f148202a);
                    default:
                        throw new AssertionError(i109);
                }
                return cVar;
            case 27:
                return b();
            case 28:
                return c();
            default:
                h08.h hVar4 = (h08.h) this.f141656b;
                h08.d dVar25 = (h08.d) this.d;
                int i110 = this.f141657c;
                switch (i110) {
                    case 0:
                        return kpi.f.a();
                    case 1:
                        Context contextI2 = bq.i.i(dVar25.f148238a);
                        BaseDelegatesActivity baseDelegatesActivityF2 = bq.i.f(dVar25.f148238a);
                        t70.g gVarO2 = hVar4.f148280b.o();
                        vc.s.j(gVarO2);
                        cVar2 = new npi.c(contextI2, baseDelegatesActivityF2, gVarO2);
                        break;
                    case 2:
                        return new tpi.i((rpi.c) dVar25.e.get(), gsi.c.a(dVar25.f148238a));
                    case 3:
                        return new rpi.b(bq.i.b(dVar25.f148238a));
                    case 4:
                        return new rpi.h(bq.i.b(dVar25.f148238a));
                    case 5:
                        cVar2 = new iri.g((iri.j) hVar4.f148284j.get(), new f08.k(), bq.i.f(dVar25.f148238a), bq.i.l(dVar25.f148238a));
                        break;
                    case 6:
                        return new iri.l(new f08.k(), bq.i.f(dVar25.f148238a), (iri.d) dVar25.i.get());
                    case 7:
                        return new iri.d(bq.i.f(dVar25.f148238a));
                    case 8:
                        return new opi.b(bq.i.f(dVar25.f148238a));
                    case 9:
                        return new en.c(ImmutableSet.of((ln.d) dVar25.f148239b.f148285l.get()), bq.i.l(dVar25.f148238a));
                    case 10:
                        dVar25.getClass();
                        return new xpi.c(xpi.f.d, bq.i.b(dVar25.f148238a));
                    case 11:
                        dVar25.getClass();
                        xoi.d dVar26 = dVar25.f148238a;
                        return new ypi.e(ypi.h.d, bq.i.b(dVar26), bq.i.o(dVar26), bq.i.g(dVar26));
                    case 12:
                        cVar2 = new com.revolut.retail.toast.mediator.a((d4l.a) hVar4.K.get(), (c4l.b) dVar25.o.get());
                        break;
                    case 13:
                        return new c4l.e(bq.i.i(dVar25.f148238a), bq.i.g(dVar25.f148238a));
                    case 14:
                        xpi.g gVar3 = (xpi.g) dVar25.f148245m.get();
                        ypi.i iVar4 = (ypi.i) dVar25.f148246n.get();
                        f08.d dVar27 = (f08.d) hVar4.L.get();
                        f08.a aVar25 = (f08.a) hVar4.B.get();
                        f9b.f fVar4 = (f9b.f) dVar25.f148248q.get();
                        opi.d dVar28 = (opi.d) dVar25.k.get();
                        h08.h hVar5 = dVar25.f148239b;
                        c70.a aVarZ = hVar5.f148280b.z();
                        vc.s.j(aVarZ);
                        u08.a aVar26 = new u08.a(aVarZ, (d4l.a) hVar5.K.get());
                        yx7.m planCoverageIconUIBuilder = new yx7.m();
                        yx7.t vendorUiBuilder = new yx7.t();
                        Intrinsics.checkNotNullParameter(planCoverageIconUIBuilder, "planCoverageIconUIBuilder");
                        Intrinsics.checkNotNullParameter(vendorUiBuilder, "vendorUiBuilder");
                        s08.p pVar3 = new s08.p(gVar3, iVar4, dVar27, aVar25, fVar4, dVar28, aVar26, new g08.k());
                        kli.a.p(pVar3, bq.i.d(dVar25.f148238a));
                        return pVar3;
                    case 15:
                        return bq.i.t(dVar25.f148238a);
                    default:
                        throw new AssertionError(i110);
                }
                return cVar2;
        }
    }
}
