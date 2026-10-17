package whc;

import afj.y3;
import android.content.Context;
import ccb.j;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.acquiring.card_reader.ui.impl.ui.screen.payment.CardReaderPaymentScreen;
import com.revolut.feature.acquiring.card_reader.ui.impl.ui.screen.payment.CardReaderPaymentScreenContract$InputData;
import com.revolut.feature.card_order_new.api.SelectedTab;
import com.revolut.feature.card_order_new.impl.brazil.CardSubtypePickerControllerContract$InputData;
import com.revolut.feature.card_order_new.impl.kompot.CardOrderFlowContract$InputData;
import com.revolut.feature.card_order_new.impl.kompot.ordernewcard.OrderNewCardFlowContract$InputData;
import com.revolut.feature.card_order_new.impl.kompot.ordernewcard.tab.OrderNewCardTabControllerContract$InputData;
import com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.CardPersonalisationControllerContract$InputData;
import com.revolut.feature.card_order_new.impl.kompot.screen.extra_security.CardExtraSecurityControllerContract$InputData;
import com.revolut.feature.junior.isa.impl.ui.jisa_add_phone_number.JuniorIsaAddPhoneNumberScreenContract$InputData;
import com.revolut.feature.junior_payment_links.impl.ui.screen.custom_amount.JuniorPaymentLinkCustomAmountScreenContract$Input;
import com.revolut.feature.revolut_x_balances.api.fiat.navigation.RevolutXFiatBalancesDetailsController$InputData;
import com.revolut.feature.revolut_x_balances.impl.breakdown.RevXOrdersBreakdownScreen;
import com.revolut.feature.revolut_x_balances.impl.fiat.RevolutXFiatBalancesDetailsScreen;
import com.revolut.feature.rewards.impl.ui.rent_and_bills.screen.manage.RentAndBillsManageLinkedPaymentsScreenContract$InputData;
import com.revolut.feature.rewards.impl.ui.rent_and_bills.screen.rev_points_earned.RentAndBillsRevPointsEarnedScreenContract$InputData;
import com.revolut.feature.vaults.impl.ui.details.spare_change.kompot.SpareChangeScreenContract$InputData;
import com.revolut.feature.vaults.impl.ui.details.terms_viewer.VaultTermsViewerScreenContract$InputData;
import com.revolut.feature.vaults.impl.ui.money_flow.add_money.screen.AddMoneyScreenContract$InputData;
import com.revolut.feature.vaults.impl.ui.money_flow.recurring_transfer.RecurringTransferFlowContract$FlowInput;
import com.revolut.feature.vaults.impl.ui.money_flow.withdraw.WithdrawMoneyFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import et6.h1;
import f23.l0;
import g23.k0;
import g23.o0;
import g48.r0;
import i60.b;
import ip0.v7;
import java.util.Collection;
import java.util.Optional;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import nyb.m0;
import qgk.k3;
import rp0.g1;
import rp0.x0;
import skm.p0;
import vqg.i;

/* JADX INFO: loaded from: classes6.dex */
public final class t implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f297584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f297585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f297586c;
    public final Object d;

    public /* synthetic */ t(Object obj2, Object obj3, int i, int i2) {
        this.f297584a = i2;
        this.f297585b = obj2;
        this.d = obj3;
        this.f297586c = i;
    }

    private final Object a() {
        wy7.f fVar = (wy7.f) this.f297585b;
        wy7.h hVar = (wy7.h) this.d;
        int i = this.f297586c;
        switch (i) {
            case 0:
                return kpi.f.a();
            case 1:
                Context contextI = bq.i.i(hVar.f301163a);
                BaseDelegatesActivity baseDelegatesActivityF = bq.i.f(hVar.f301163a);
                t70.g gVarO = fVar.f301145b.o();
                vc.s.j(gVarO);
                return new npi.c(contextI, baseDelegatesActivityF, gVarO);
            case 2:
                return new tpi.i((rpi.c) hVar.f301167h.get(), gsi.c.a(hVar.f301163a));
            case 3:
                return new rpi.b(bq.i.b(hVar.f301163a));
            case 4:
                return new rpi.h(bq.i.b(hVar.f301163a));
            case 5:
                return new iri.g((iri.j) fVar.f.get(), new iri.b(), bq.i.f(hVar.f301163a), bq.i.l(hVar.f301163a));
            case 6:
                return new iri.l(new iri.b(), bq.i.f(hVar.f301163a), (iri.d) hVar.f301169l.get());
            case 7:
                return new iri.d(bq.i.f(hVar.f301163a));
            case 8:
                return new opi.b(bq.i.f(hVar.f301163a));
            case 9:
                return new en.c(ImmutableSet.of((ln.d) hVar.e.f301148h.get()), bq.i.l(hVar.f301163a));
            case 10:
                return new iqi.b(hVar.f301164b, bq.i.b(hVar.f301163a));
            case 11:
                return new xpi.c(hVar.f301165c, bq.i.b(hVar.f301163a));
            case 12:
                hVar.getClass();
                return new cn.d(ImmutableSet.copyOf((Collection) dn.b.a()), (cn.e) fVar.f301154q.get(), fVar.c());
            case 13:
                um.c cVar = (um.c) fVar.f301155r.get();
                hVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(5);
                wy7.f fVar2 = hVar.e;
                hn.h hVar2 = (hn.h) fVar2.f301156s.get();
                t70.g gVarO2 = fVar2.f301145b.o();
                vc.s.j(gVarO2);
                builderBuilderWithExpectedSize.add(new jn.a(hVar2, gVarO2));
                builderBuilderWithExpectedSize.add(new vm.b(com.google.android.gms.internal.mlkit_vision_face.a.f()));
                builderBuilderWithExpectedSize.add(fVar2.d());
                builderBuilderWithExpectedSize.addAll((Iterable) in.g.a());
                builderBuilderWithExpectedSize.add(new jn.d(e4m.b.a(hVar.f301175s)));
                return new in.e(cVar, builderBuilderWithExpectedSize.build(), fVar.c());
            case 14:
                return bq.i.t(hVar.f301163a);
            case 15:
                hVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize2 = ImmutableSet.builderWithExpectedSize(3);
                builderBuilderWithExpectedSize2.addAll((Iterable) kn.g.a());
                builderBuilderWithExpectedSize2.add(hVar.u.get());
                builderBuilderWithExpectedSize2.add(new kn.h(e4m.b.a(hVar.i)));
                return new kn.e(builderBuilderWithExpectedSize2.build(), (ym.d) fVar.f301157t.get(), fVar.c());
            case 16:
                return new zm.a();
            case 17:
                hVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize3 = ImmutableSet.builderWithExpectedSize(2);
                builderBuilderWithExpectedSize3.addAll((Iterable) hn.g.a());
                builderBuilderWithExpectedSize3.add(hVar.e.d());
                return new hn.d(builderBuilderWithExpectedSize3.build(), (hn.h) fVar.f301156s.get(), (npi.f) hVar.f301166g.get());
            case 18:
                return new gn.c((lpi.e) hVar.f301178x.get(), (sm.e) fVar.B.get(), ImmutableSet.copyOf((Collection) gn.e.a()), fVar.c());
            case 19:
                return new lpi.b(bq.i.i(hVar.f301163a), bq.i.j(hVar.f301163a));
            case 20:
                hVar.getClass();
                return new in.e(ImmutableSet.copyOf((Collection) pm.b.a()), (om.c) fVar.C.get(), fVar.c());
            case 21:
                return new wm.l((opi.d) hVar.f301171n.get(), (wm.a) fVar.f301160y.get(), ImmutableSet.copyOf((Collection) xm.b.a()), fVar.c());
            case 22:
                hVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize4 = ImmutableSet.builderWithExpectedSize(2);
                builderBuilderWithExpectedSize4.addAll((Iterable) g3l.f.a());
                return new g3l.c(j6.a.g(hVar.e.f301158w, builderBuilderWithExpectedSize4), (g3l.g) fVar.v.get(), (k3l.b) hVar.B.get(), fVar.c());
            case 23:
                return new k3l.d(bq.i.b(hVar.f301163a));
            case 24:
                xpi.g gVar = (xpi.g) hVar.f301173q.get();
                iqi.h hVar3 = (iqi.h) hVar.f301172p.get();
                f9b.f fVar3 = (f9b.f) hVar.f301175s.get();
                opi.d dVar = (opi.d) hVar.f301171n.get();
                gz7.l lVar = (gz7.l) fVar.D.get();
                gz7.h hVar4 = (gz7.h) fVar.E.get();
                fx7.f fVarB = hVar.e.f301146c.b();
                vc.s.j(fVarB);
                gz7.v vVar = new gz7.v(gVar, hVar3, fVar3, dVar, lVar, hVar4, new iz7.c(new yx7.h(fVarB)), new iz7.a((xpi.g) hVar.f301173q.get(), (iqi.h) hVar.f301172p.get()), hVar.d);
                kli.a.p(vVar, bq.i.d(hVar.f301163a));
                return vVar;
            default:
                throw new AssertionError(i);
        }
    }

    private final Object b() {
        x13.m mVar = (x13.m) this.d;
        x13.p pVar = (x13.p) this.f297585b;
        int i = this.f297586c;
        if (i != 0) {
            if (i != 1) {
                throw new AssertionError(i);
            }
            c90.a aVarE = pVar.f302157c.e();
            vc.s.j(aVarE);
            return new j33.t(aVarE, (c90.c) pVar.W.get(), pVar.f302166r.a());
        }
        cli.n nVar = (cli.n) mVar.d.get();
        CardExtraSecurityControllerContract$InputData cardExtraSecurityControllerContract$InputData = mVar.f302146a;
        z43.a aVarA = pVar.d.a();
        vc.s.j(aVarA);
        fk3.a aVarA2 = pVar.f302171y.a();
        vc.s.j(aVarA2);
        l93.f fVarJ = pVar.o.j();
        vc.s.j(fVarJ);
        return new com.revolut.feature.card_order_new.impl.kompot.screen.extra_security.b(nVar, cardExtraSecurityControllerContract$InputData, aVarA, aVarA2, fVarJ);
    }

    private final Object c() {
        x13.n nVar = (x13.n) this.d;
        int i = this.f297586c;
        if (i == 0) {
            return new v23.n((cli.n) nVar.d.get(), nVar.f302149a, ((s41.a) ((x13.p) this.f297585b).C).d());
        }
        if (i == 1) {
            return new v23.o();
        }
        throw new AssertionError(i);
    }

    private final Object d() {
        x13.p pVar = (x13.p) this.f297585b;
        x13.q qVar = (x13.q) this.d;
        int i = this.f297586c;
        switch (i) {
            case 0:
                return kxa.j.m((j60.a) qVar.f302175g.get());
            case 1:
                return wp5.y.r((com.revolut.kompot.navigable.a) qVar.e.get(), (rp0.m) qVar.f.get());
            case 2:
                return new rp0.m();
            case 3:
                return agk.b.B(qVar.f302172a, (zfk.c) qVar.f302178l.get(), (xfk.b) qVar.i.get(), (bgk.a) qVar.f302177j.get(), (wfk.a) qVar.k.get(), (bgk.a) qVar.f302179m.get());
            case 4:
                agk.a aVar = qVar.f302172a;
                mhk.a aVarC = pVar.f302156b.c();
                vc.s.j(aVarC);
                return y3.C(aVar, aVarC, (xfk.b) qVar.i.get(), (bgk.a) qVar.f302177j.get(), (wfk.a) qVar.k.get());
            case 5:
                agk.a aVar2 = qVar.f302172a;
                fhk.a aVarB = pVar.f302156b.b();
                vc.s.j(aVarB);
                return y3.b(aVar2, aVarB);
            case 6:
                agk.a aVar3 = qVar.f302172a;
                ohk.a aVarD = pVar.f302156b.d();
                vc.s.j(aVarD);
                return y3.D(aVar3, aVarD);
            case 7:
                agk.a aVar4 = qVar.f302172a;
                dhk.a aVarA = pVar.f302156b.a();
                vc.s.j(aVarA);
                return y3.z(aVar4, aVarA);
            case 8:
                agk.a aVar5 = qVar.f302172a;
                ohk.a aVarD2 = pVar.f302156b.d();
                vc.s.j(aVarD2);
                return agk.b.y(aVar5, aVarD2);
            case 9:
                CardOrderFlowContract$InputData cardOrderFlowContract$InputData = qVar.f302173b;
                x13.p pVar2 = qVar.f302174c;
                l70.e eVar = pVar.f302157c;
                us6.q qVar2 = pVar.f302159h;
                s13.d dVar = pVar.f;
                i90.b bVar = new i90.b();
                z43.a aVarA2 = pVar2.d.a();
                vc.s.j(aVarA2);
                c23.b bVar2 = new c23.b(aVarA2);
                qh3.c cVar = (qh3.c) qVar.o.get();
                o13.c cVar2 = (o13.c) dVar.f259064m.get();
                vc.s.j(cVar2);
                f73.c cVar3 = new f73.c();
                t13.a aVar6 = (t13.a) dVar.f259063l.get();
                vc.s.j(aVar6);
                gr6.h hVarK = qVar2.k();
                vc.s.j(hVarK);
                zt6.b bVar3 = (zt6.b) qVar2.f282696o1.get();
                vc.s.j(bVar3);
                hy2.f fVarA = pVar.i.a();
                ffk.t tVarF = pVar.f302160j.f();
                vc.s.j(tVarF);
                u13.g gVar = (u13.g) dVar.i.get();
                vc.s.j(gVar);
                s33.e eVar2 = (s33.e) dVar.k.get();
                vc.s.j(eVar2);
                q89.e eVarA = pVar.k.a();
                vc.s.j(eVarA);
                l33.a aVar7 = new l33.a();
                sf0.h hVarB = pVar.f302161l.b();
                vc.s.j(hVarB);
                v60.e eVarA2 = pVar.f302162m.a();
                vc.s.j(eVarA2);
                q13.d dVar2 = (q13.d) qVar.f302181p.get();
                l93.e eVar3 = (l93.e) pVar.o.I.get();
                vc.s.j(eVar3);
                u51.a aVarA3 = pVar2.f302164p.a();
                vc.s.j(aVarA3);
                m33.c cVar4 = new m33.c(aVarA3, pVar2.f302165q.b());
                gte.a aVarB2 = pVar.f302155a.b();
                vc.s.j(aVarB2);
                return new com.revolut.feature.card_order_new.impl.kompot.c(cardOrderFlowContract$InputData, bVar, bVar2, cVar, cVar2, cVar3, aVar6, hVarK, bVar3, fVarA, tVarF, gVar, eVar2, eVarA, aVar7, hVarB, eVarA2, dVar2, eVar3, cVar4, aVarB2, pVar.f302166r.a(), (j60.a) qVar.f302175g.get(), pVar.f302167s.e());
            case 10:
                wh3.a provider = pVar.e.a();
                vc.s.j(provider);
                zfk.c planSubscriberControllerModelExtension = (zfk.c) qVar.f302178l.get();
                d23.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(provider, "provider");
                Intrinsics.checkNotNullParameter(planSubscriberControllerModelExtension, "planSubscriberControllerModelExtension");
                return provider.a(planSubscriberControllerModelExtension);
            case 11:
                u13.g gVar2 = (u13.g) pVar.f.i.get();
                vc.s.j(gVar2);
                zi1.d dVarA = pVar.f302163n.a();
                vc.s.j(dVarA);
                return new q13.d(gVar2, dVarA);
            case 12:
                qh3.c extension = (qh3.c) qVar.o.get();
                d23.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension, "extension");
                vc.s.k(extension);
                return extension;
            case 13:
                f0m.a asciiConverter = (f0m.a) qVar.f302184s.get();
                zzl.b regexMatcher = (zzl.b) qVar.f302185t.get();
                n8b.a countryInteractor = pVar.f302170x.a();
                vc.s.j(countryInteractor);
                gj1.b addressFormCustomizations = (gj1.b) qVar.u.get();
                p13.e addressValidator = new p13.e(new p13.a());
                d23.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(asciiConverter, "asciiConverter");
                Intrinsics.checkNotNullParameter(regexMatcher, "regexMatcher");
                Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
                Intrinsics.checkNotNullParameter(addressFormCustomizations, "addressFormCustomizations");
                Intrinsics.checkNotNullParameter(addressValidator, "addressValidator");
                return new nj1.h(asciiConverter, regexMatcher, zhm.u.c(addressValidator), countryInteractor, addressFormCustomizations);
            case 14:
                d23.a.Companion.getClass();
                return new f0m.b();
            case 15:
                d23.a.Companion.getClass();
                return new zzl.c();
            case 16:
                return new m33.d();
            case 17:
                rh1.b bVarA = pVar.A.a();
                vc.s.j(bVarA);
                return new e23.d(bVarA);
            case 18:
                rh1.b bVarA2 = pVar.A.a();
                vc.s.j(bVarA2);
                return new e23.g(bVarA2);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object e() {
        x13.p pVar = (x13.p) this.f297585b;
        ite.a aVar = pVar.f302155a;
        x13.r rVar = (x13.r) this.d;
        int i = this.f297586c;
        switch (i) {
            case 0:
                n60.b bVar = (n60.b) rVar.f.get();
                o5k.i.m(bVar);
                return bVar;
            case 1:
                return o5k.i.r((com.revolut.kompot.navigable.a) rVar.e.get());
            case 2:
                n60.a aVar2 = (n60.a) rVar.f302192h.get();
                o5k.i.l(aVar2);
                return aVar2;
            case 3:
                return o5k.i.q((com.revolut.kompot.navigable.a) rVar.e.get());
            case 4:
                cli.n nVar = (cli.n) rVar.f302193j.get();
                CardPersonalisationControllerContract$InputData cardPersonalisationControllerContract$InputData = rVar.f302188a;
                n60.b bVar2 = (n60.b) rVar.f.get();
                n60.a aVar3 = (n60.a) rVar.f302192h.get();
                r70.c cVarA = pVar.f302157c.A();
                vc.s.j(cVarA);
                x23.p pVar2 = (x23.p) rVar.k.get();
                z43.a aVarA = pVar.d.a();
                vc.s.j(aVarA);
                ang.f fVarE = pVar.f302167s.e();
                hy2.f fVarA = pVar.i.a();
                a53.a aVar4 = (a53.a) pVar.B.i.get();
                vc.s.j(aVar4);
                gte.a aVarB = aVar.b();
                vc.s.j(aVarB);
                return new com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.c(nVar, cardPersonalisationControllerContract$InputData, bVar2, aVar3, cVarA, pVar2, aVarA, fVarE, fVarA, aVar4, aVarB);
            case 5:
                gte.a aVarB2 = aVar.b();
                vc.s.j(aVarB2);
                return new x23.y(aVarB2, new lx2.d((c90.c) rVar.f302190c.W.get()));
            case 6:
                return new x23.p(rVar.f302189b);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object f() {
        x13.p pVar = (x13.p) this.f297585b;
        x13.v vVar = (x13.v) this.d;
        agk.c cVar = vVar.f302204a;
        x13.p pVar2 = vVar.f302206c;
        int i = this.f297586c;
        if (i == 0) {
            qh3.c extension = (qh3.c) vVar.e.get();
            m13.c.Companion.getClass();
            Intrinsics.checkNotNullParameter(extension, "extension");
            vc.s.k(extension);
            return extension;
        }
        if (i == 1) {
            wh3.a provider = pVar.e.a();
            vc.s.j(provider);
            zfk.c planSubscriberControllerModelExtension = (zfk.c) vVar.d.get();
            m13.c.Companion.getClass();
            Intrinsics.checkNotNullParameter(provider, "provider");
            Intrinsics.checkNotNullParameter(planSubscriberControllerModelExtension, "planSubscriberControllerModelExtension");
            return provider.a(planSubscriberControllerModelExtension);
        }
        if (i == 2) {
            mhk.a aVarC = pVar.f302156b.c();
            vc.s.j(aVarC);
            fhk.a factory = pVar2.f302156b.b();
            vc.s.j(factory);
            Intrinsics.checkNotNullParameter(factory, "factory");
            ehk.g gVarA = factory.a();
            ohk.a factory2 = pVar2.f302156b.d();
            vc.s.j(factory2);
            Intrinsics.checkNotNullParameter(factory2, "factory");
            ohk.g gVarA2 = factory2.a();
            dhk.a factory3 = pVar2.f302156b.a();
            vc.s.j(factory3);
            Intrinsics.checkNotNullParameter(factory3, "factory");
            return agk.b.w(cVar, aVarC, gVarA, gVarA2, new dhk.e(factory3.f114822a));
        }
        if (i == 3) {
            zfk.c cVar2 = (zfk.c) vVar.d.get();
            fhk.a factory4 = pVar2.f302156b.b();
            vc.s.j(factory4);
            Intrinsics.checkNotNullParameter(factory4, "factory");
            ehk.g gVarA3 = factory4.a();
            ohk.a factory5 = pVar2.f302156b.d();
            vc.s.j(factory5);
            Intrinsics.checkNotNullParameter(factory5, "factory");
            ohk.g gVarA4 = factory5.a();
            dhk.a factory6 = pVar2.f302156b.a();
            vc.s.j(factory6);
            Intrinsics.checkNotNullParameter(factory6, "factory");
            return agk.b.D(cVar, cVar2, gVarA3, gVarA4, new dhk.e(factory6.f114822a));
        }
        if (i != 4) {
            throw new AssertionError(i);
        }
        l13.m mVar = new l13.m();
        CardSubtypePickerControllerContract$InputData cardSubtypePickerControllerContract$InputData = vVar.f302205b;
        f73.b bVar = new f73.b();
        l93.f fVarJ = pVar.o.j();
        vc.s.j(fVarJ);
        qh3.c cVar3 = (qh3.c) vVar.e.get();
        hy2.f fVarA = pVar.i.a();
        al4.b bVarN = pVar.E.n();
        vc.s.j(bVarN);
        ffk.t tVarF = pVar.f302160j.f();
        vc.s.j(tVarF);
        q89.e eVarA = pVar.k.a();
        vc.s.j(eVarA);
        return new l13.l(mVar, cardSubtypePickerControllerContract$InputData, bVar, fVarJ, cVar3, fVarA, bVarN, tVarF, eVarA);
    }

    private final Object g() {
        x13.p pVar = (x13.p) this.f297585b;
        x13.z zVar = (x13.z) this.d;
        int i = this.f297586c;
        switch (i) {
            case 0:
                wj0.a idempotencyKeyHolder = ((nj0.d) pVar.D).i();
                vc.s.j(idempotencyKeyHolder);
                l80.e dateProvider = pVar.f302157c.h();
                vc.s.j(dateProvider);
                l23.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
                Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
                return new m60.b(idempotencyKeyHolder, dateProvider, "JUNIOR_VIRTUAL_CARD_ORDER");
            case 1:
                qh3.c extension = (qh3.c) zVar.f.get();
                l23.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension, "extension");
                vc.s.k(extension);
                return extension;
            case 2:
                wh3.a provider = pVar.e.a();
                vc.s.j(provider);
                zfk.c planSubscriberControllerModelExtension = (zfk.c) zVar.e.get();
                l23.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(provider, "provider");
                Intrinsics.checkNotNullParameter(planSubscriberControllerModelExtension, "planSubscriberControllerModelExtension");
                return provider.a(planSubscriberControllerModelExtension);
            case 3:
                agk.c cVar = zVar.f302218a;
                x13.p pVar2 = zVar.f302220c;
                mhk.a aVarC = pVar.f302156b.c();
                vc.s.j(aVarC);
                fhk.a factory = pVar2.f302156b.b();
                vc.s.j(factory);
                Intrinsics.checkNotNullParameter(factory, "factory");
                ehk.g gVarA = factory.a();
                ohk.a factory2 = pVar2.f302156b.d();
                vc.s.j(factory2);
                Intrinsics.checkNotNullParameter(factory2, "factory");
                ohk.g gVarA2 = factory2.a();
                dhk.a factory3 = pVar2.f302156b.a();
                vc.s.j(factory3);
                Intrinsics.checkNotNullParameter(factory3, "factory");
                return agk.b.w(cVar, aVarC, gVarA, gVarA2, new dhk.e(factory3.f114822a));
            case 4:
                agk.c cVar2 = zVar.f302218a;
                x13.p pVar3 = zVar.f302220c;
                zfk.c cVar3 = (zfk.c) zVar.e.get();
                fhk.a factory4 = pVar3.f302156b.b();
                vc.s.j(factory4);
                Intrinsics.checkNotNullParameter(factory4, "factory");
                ehk.g gVarA3 = factory4.a();
                ohk.a factory5 = pVar3.f302156b.d();
                vc.s.j(factory5);
                Intrinsics.checkNotNullParameter(factory5, "factory");
                ohk.g gVarA4 = factory5.a();
                dhk.a factory6 = pVar3.f302156b.a();
                vc.s.j(factory6);
                Intrinsics.checkNotNullParameter(factory6, "factory");
                return agk.b.D(cVar2, cVar3, gVarA3, gVarA4, new dhk.e(factory6.f114822a));
            case 5:
                sh3.a aVarA = pVar.z.a();
                vc.s.j(aVarA);
                ffk.t tVarF = pVar.f302160j.f();
                vc.s.j(tVarF);
                f73.b bVar = new f73.b();
                l93.f fVarJ = pVar.o.j();
                vc.s.j(fVarJ);
                gte.a aVarB = pVar.f302155a.b();
                vc.s.j(aVarB);
                return new f23.m(aVarA, tVarF, bVar, fVarJ, aVarB, (qh3.c) zVar.f.get());
            case 6:
                e4m.e eVar = zVar.f302223j;
                x13.p pVar4 = zVar.f302220c;
                cli.n nVar = (cli.n) eVar.get();
                OrderNewCardFlowContract$InputData orderNewCardFlowContract$InputData = zVar.f302219b;
                al4.p pVarI = pVar4.E.i();
                xh9.a aVarE = pVar4.F.e();
                vc.s.j(aVarE);
                gr6.e eVarA = pVar4.G.a();
                vc.s.j(eVarA);
                gr6.a aVarA2 = pVar4.H.a();
                vc.s.j(aVarA2);
                r0 r0VarC = pVar4.I.c();
                jla.h hVarA = pVar4.f302166r.a();
                ld5.b bVarB = pVar4.J.b();
                vc.s.j(bVarB);
                xh5.a aVarA3 = pVar4.K.a();
                vc.s.j(aVarA3);
                l0 l0Var = new l0(pVarI, aVarE, eVarA, aVarA2, r0VarC, hVarA, bVarB, aVarA3);
                al4.b bVarN = pVar.E.n();
                vc.s.j(bVarN);
                cha.a aVar = (cha.a) pVar4.f302160j.K.get();
                vc.s.j(aVar);
                yik.h hVarB = ((k3) pVar4.L).b();
                q89.e eVarA2 = pVar4.k.a();
                vc.s.j(eVarA2);
                return new com.revolut.feature.card_order_new.impl.kompot.ordernewcard.a(nVar, orderNewCardFlowContract$InputData, l0Var, bVarN, new f23.c0(aVar, hVarB, eVarA2), (k23.f) zVar.f302224l.get(), new m23.i(), (f23.m) zVar.i.get());
            case 7:
                return new f23.a0();
            case 8:
                CoroutineScope coroutineScope = (CoroutineScope) zVar.k.get();
                ang.f fVarE = pVar.f302167s.e();
                fk3.a aVarA4 = pVar.f302171y.a();
                vc.s.j(aVarA4);
                ffk.t tVarF2 = pVar.f302160j.f();
                vc.s.j(tVarF2);
                return new k23.f(coroutineScope, fVarE, aVarA4, tVarF2);
            case 9:
                l23.b.Companion.getClass();
                p0 p0Var = p0.f264001a;
                return rd0.e.a(zkm.o.f323119a.e);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object h() {
        x13.p pVar = (x13.p) this.f297585b;
        x13.a0 a0Var = (x13.a0) this.d;
        int i = this.f297586c;
        switch (i) {
            case 0:
                return kxa.j.k((j60.a) a0Var.f302110g.get());
            case 1:
                return ehe.n.s((com.revolut.kompot.navigable.a) a0Var.e.get(), (rp0.m) a0Var.f.get());
            case 2:
                return new rp0.m();
            case 3:
                qh3.c extension = (qh3.c) a0Var.f302112j.get();
                l23.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension, "extension");
                vc.s.k(extension);
                return extension;
            case 4:
                wh3.a provider = pVar.e.a();
                vc.s.j(provider);
                zfk.c planSubscriberControllerModelExtension = (zfk.c) a0Var.i.get();
                l23.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(provider, "provider");
                Intrinsics.checkNotNullParameter(planSubscriberControllerModelExtension, "planSubscriberControllerModelExtension");
                return provider.a(planSubscriberControllerModelExtension);
            case 5:
                agk.c cVar = a0Var.f302107a;
                x13.p pVar2 = a0Var.d;
                mhk.a aVarC = pVar.f302156b.c();
                vc.s.j(aVarC);
                fhk.a factory = pVar2.f302156b.b();
                vc.s.j(factory);
                Intrinsics.checkNotNullParameter(factory, "factory");
                ehk.g gVarA = factory.a();
                ohk.a factory2 = pVar2.f302156b.d();
                vc.s.j(factory2);
                Intrinsics.checkNotNullParameter(factory2, "factory");
                ohk.g gVarA2 = factory2.a();
                dhk.a factory3 = pVar2.f302156b.a();
                vc.s.j(factory3);
                Intrinsics.checkNotNullParameter(factory3, "factory");
                return agk.b.w(cVar, aVarC, gVarA, gVarA2, new dhk.e(factory3.f114822a));
            case 6:
                agk.c cVar2 = a0Var.f302107a;
                x13.p pVar3 = a0Var.d;
                zfk.c cVar3 = (zfk.c) a0Var.i.get();
                fhk.a factory4 = pVar3.f302156b.b();
                vc.s.j(factory4);
                Intrinsics.checkNotNullParameter(factory4, "factory");
                ehk.g gVarA3 = factory4.a();
                ohk.a factory5 = pVar3.f302156b.d();
                vc.s.j(factory5);
                Intrinsics.checkNotNullParameter(factory5, "factory");
                ohk.g gVarA4 = factory5.a();
                dhk.a factory6 = pVar3.f302156b.a();
                vc.s.j(factory6);
                Intrinsics.checkNotNullParameter(factory6, "factory");
                return agk.b.D(cVar2, cVar3, gVarA3, gVarA4, new dhk.e(factory6.f114822a));
            case 7:
                return new k0(a0Var.f302108b, pVar.E.i(), a0Var.f302109c);
            case 8:
                OrderNewCardTabControllerContract$InputData orderNewCardTabControllerContract$InputData = a0Var.f302108b;
                c73.j jVar = pVar.f302158g;
                return new o0(orderNewCardTabControllerContract$InputData, new f73.b(), (g23.l0) a0Var.f302115n.get());
            case 9:
                return new g23.l0();
            case 10:
                OrderNewCardTabControllerContract$InputData orderNewCardTabControllerContract$InputData2 = a0Var.f302108b;
                zf8.k kVarA = pVar.M.a();
                vc.s.j(kVarA);
                ic8.a aVar = (ic8.a) pVar.N.f.get();
                vc.s.j(aVar);
                wf8.c cVar4 = (wf8.c) pVar.M.f313200l.get();
                vc.s.j(cVar4);
                j60.a aVar2 = (j60.a) a0Var.f302110g.get();
                k93.b bVar = (k93.b) pVar.V.get();
                hy2.f fVarA = pVar.i.a();
                wj0.a aVarI = ((nj0.d) pVar.D).i();
                vc.s.j(aVarI);
                return new i23.n(orderNewCardTabControllerContract$InputData2, kVarA, aVar, cVar4, aVar2, bVar, fVarA, aVarI, ((oq8.a) pVar.u).c());
            case 11:
                g23.l0 l0Var = (g23.l0) a0Var.f302115n.get();
                ite.a aVar3 = pVar.f302155a;
                jm4.r rVar = pVar.E;
                gte.a aVarB = aVar3.b();
                vc.s.j(aVarB);
                return new g23.d(l0Var, aVarB, rVar.e(), rVar.c(), rVar.i());
            case 12:
                sh5.d dVarF = pVar.K.f();
                vc.s.j(dVarF);
                return new g23.r(dVarF);
            case 13:
                w9j.e eVarB = pVar.O.b();
                vc.s.j(eVarB);
                bbj.c cVarA = pVar.P.a();
                vc.s.j(cVarA);
                mre.c cVarB = pVar.Q.b();
                vc.s.j(cVarB);
                return new g23.u(eVarB, cVarA, cVarB);
            case 14:
                OrderNewCardTabControllerContract$InputData orderNewCardTabControllerContract$InputData3 = a0Var.f302108b;
                g23.l0 l0Var2 = (g23.l0) a0Var.f302115n.get();
                k23.f fVar = a0Var.f302109c;
                k23.b bVar2 = (k23.b) a0Var.f302120t.get();
                c73.j jVar2 = pVar.f302158g;
                return new g23.o(orderNewCardTabControllerContract$InputData3, l0Var2, fVar, bVar2, new f73.b());
            case 15:
                return new k23.b(pVar.i.a(), a0Var.f302109c);
            case 16:
                OrderNewCardTabControllerContract$InputData orderNewCardTabControllerContract$InputData4 = a0Var.f302108b;
                g23.l0 l0Var3 = (g23.l0) a0Var.f302115n.get();
                k23.f fVar2 = a0Var.f302109c;
                k23.b bVar3 = (k23.b) a0Var.f302120t.get();
                jm4.r rVar2 = pVar.E;
                jm4.r rVar3 = pVar.E;
                return new g23.l(orderNewCardTabControllerContract$InputData4, l0Var3, fVar2, bVar3, rVar2.d(), rVar3.a(), rVar3.c(), rVar3.i(), new f73.b());
            case 17:
                return new g23.g0(a0Var.f302108b, (g23.l0) a0Var.f302115n.get(), a0Var.f302109c, (k23.b) a0Var.f302120t.get(), pVar.I.c(), new f73.b());
            case 18:
                OrderNewCardTabControllerContract$InputData orderNewCardTabControllerContract$InputData5 = a0Var.f302108b;
                g23.l0 l0Var4 = (g23.l0) a0Var.f302115n.get();
                k23.f fVar3 = a0Var.f302109c;
                k23.b bVar4 = (k23.b) a0Var.f302120t.get();
                us6.q qVar = pVar.f302159h;
                us6.q qVar2 = pVar.f302159h;
                gr6.h hVarK = qVar.k();
                vc.s.j(hVarK);
                h1 h1VarN = qVar2.n();
                vc.s.j(h1VarN);
                hr6.l lVarL = qVar2.l();
                vc.s.j(lVarL);
                return new g23.z(orderNewCardTabControllerContract$InputData5, l0Var4, fVar3, bVar4, hVarK, h1VarN, lVarL, pVar.R.a(), new f73.b());
            case 19:
                sh3.a aVarA = pVar.z.a();
                vc.s.j(aVarA);
                ffk.t tVarF = pVar.f302160j.f();
                vc.s.j(tVarF);
                f73.b bVar5 = new f73.b();
                l93.f fVarJ = pVar.o.j();
                vc.s.j(fVarJ);
                gte.a aVarB2 = pVar.f302155a.b();
                vc.s.j(aVarB2);
                return new f23.m(aVarA, tVarF, bVar5, fVarJ, aVarB2, (qh3.c) a0Var.f302112j.get());
            case 20:
                return new n23.k((cli.n) a0Var.z.get(), a0Var.f302108b, (j23.q) a0Var.J.get());
            case 21:
                return new n23.l();
            case 22:
                a0Var.getClass();
                ImmutableMap.Builder builderBuilderWithExpectedSize = ImmutableMap.builderWithExpectedSize(7);
                builderBuilderWithExpectedSize.put(SelectedTab.DEBIT, a0Var.C);
                builderBuilderWithExpectedSize.put(SelectedTab.CREDIT, a0Var.D);
                builderBuilderWithExpectedSize.put(SelectedTab.PAY_LATER, a0Var.E);
                builderBuilderWithExpectedSize.put(SelectedTab.FREELANCER, a0Var.F);
                builderBuilderWithExpectedSize.put(SelectedTab.JOINT, a0Var.G);
                builderBuilderWithExpectedSize.put(SelectedTab.JUNIOR, a0Var.H);
                builderBuilderWithExpectedSize.put(SelectedTab.CRYPTO, a0Var.I);
                return new j23.q(builderBuilderWithExpectedSize.build());
            case 23:
                return new j23.k((h23.d) a0Var.B.get(), (k0) a0Var.f302114m.get());
            case 24:
                OrderNewCardTabControllerContract$InputData orderNewCardTabControllerContract$InputData6 = a0Var.f302108b;
                g23.l0 l0Var5 = (g23.l0) a0Var.f302115n.get();
                k23.f fVar4 = a0Var.f302109c;
                k23.b bVar6 = (k23.b) a0Var.f302120t.get();
                wsg.n nVarB = pVar.f302165q.b();
                ha3.c cVar5 = (ha3.c) pVar.o.F.get();
                vc.s.j(cVar5);
                return new h23.d(orderNewCardTabControllerContract$InputData6, l0Var5, fVar4, bVar6, nVarB, cVar5, (h23.k) a0Var.A.get());
            case 25:
                OrderNewCardTabControllerContract$InputData orderNewCardTabControllerContract$InputData7 = a0Var.f302108b;
                k23.f fVar5 = a0Var.f302109c;
                k23.b bVar7 = (k23.b) a0Var.f302120t.get();
                gte.a aVarB3 = pVar.f302155a.b();
                vc.s.j(aVarB3);
                q89.e eVarA = pVar.k.a();
                vc.s.j(eVarA);
                al4.b bVarN = pVar.E.n();
                vc.s.j(bVarN);
                return new h23.k(orderNewCardTabControllerContract$InputData7, fVar5, bVar7, aVarB3, eVarA, bVarN, (f23.m) a0Var.f302123y.get());
            case 26:
                return new j23.j((g23.l) a0Var.v.get(), (g23.d) a0Var.f302117q.get(), (k0) a0Var.f302114m.get());
            case 27:
                return new j23.l((o0) a0Var.o.get());
            case 28:
                return new j23.l((g23.z) a0Var.f302122x.get());
            case 29:
                return new j23.l((g23.g0) a0Var.f302121w.get());
            case 30:
                OrderNewCardTabControllerContract$InputData orderNewCardTabControllerContract$InputData8 = a0Var.f302108b;
                g23.l0 l0Var6 = (g23.l0) a0Var.f302115n.get();
                x13.p pVar4 = a0Var.d;
                ang.f fVarE = pVar4.f302167s.e();
                te8.c0 c0Var = (te8.c0) pVar4.S.z.get();
                vc.s.j(c0Var);
                ffk.t tVarF2 = pVar4.f302160j.f();
                vc.s.j(tVarF2);
                return new j23.l(new i23.d(orderNewCardTabControllerContract$InputData8, l0Var6, fVarE, c0Var, new jid.z(tVarF2, pVar4.i.a()), (i23.n) a0Var.f302116p.get()));
            case 31:
                return new j23.j((g23.r) a0Var.f302118r.get(), (g23.o) a0Var.u.get(), (g23.u) a0Var.f302119s.get());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object i() {
        x13.p pVar = (x13.p) this.f297585b;
        x13.c0 c0Var = (x13.c0) this.d;
        int i = this.f297586c;
        if (i == 0) {
            n60.a aVar = (n60.a) c0Var.e.get();
            o5k.i.l(aVar);
            return aVar;
        }
        if (i == 1) {
            return o5k.i.q((com.revolut.kompot.navigable.a) c0Var.d.get());
        }
        if (i != 2) {
            if (i == 3) {
                return new com.revolut.feature.card_order_new.common.setpin.kompot.c(c0Var.f302127a);
            }
            throw new AssertionError(i);
        }
        cli.n nVar = (cli.n) c0Var.f302130g.get();
        k13.a aVar2 = new k13.a();
        n60.a aVar3 = (n60.a) c0Var.e.get();
        ang.f fVarE = pVar.f302167s.e();
        l93.f fVarJ = pVar.o.j();
        vc.s.j(fVarJ);
        return new com.revolut.feature.card_order_new.common.setpin.kompot.a(nVar, aVar2, aVar3, fVarE, fVarJ, c0Var.f302127a);
    }

    private final Object j() {
        et5.a aVar = ((x4c.b) this.f297585b).f302850a;
        x4c.a aVar2 = (x4c.a) this.d;
        int i = this.f297586c;
        switch (i) {
            case 0:
                ev5.d dVarD = ((ku5.f) aVar).d();
                vc.s.j(dVarD);
                return qt5.h.a(dVarD, (pt5.s) aVar2.f.get());
            case 1:
                ev5.d dVarD2 = ((ku5.f) aVar).d();
                vc.s.j(dVarD2);
                ev5.d dVarD3 = ((ku5.f) aVar2.f302846c.f302850a).d();
                vc.s.j(dVarD3);
                return qt5.g.a(dVarD2, qt5.f.a(dVarD3, Optional.empty()), (pt5.r) aVar2.d.get(), (pt5.m) aVar2.e.get());
            case 2:
                ViewController viewController = aVar2.f302844a;
                v4c.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(viewController, "viewController");
                return (RevXOrdersBreakdownScreen) viewController;
            case 3:
                ev5.d dVarD4 = ((ku5.f) aVar).d();
                vc.s.j(dVarD4);
                return qt5.i.a(dVarD4, Optional.empty(), Optional.empty());
            case 4:
                return new u4c.e((pt5.m) aVar2.e.get(), aVar2.f302845b, (cli.n) aVar2.i.get());
            case 5:
                return new u4c.g((pt5.f) aVar2.f302848h.get());
            case 6:
                ev5.d dVarD5 = ((ku5.f) aVar).d();
                vc.s.j(dVarD5);
                return qt5.e.a(dVarD5);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object k() {
        x4c.b bVar = (x4c.b) this.f297585b;
        et5.a aVar = bVar.f302850a;
        x4c.c cVar = (x4c.c) this.d;
        x4c.b bVar2 = cVar.f302857c;
        int i = this.f297586c;
        switch (i) {
            case 0:
                ev5.d dVarD = ((ku5.f) aVar).d();
                vc.s.j(dVarD);
                return qt5.h.a(dVarD, (pt5.s) cVar.f.get());
            case 1:
                ev5.d dVarD2 = ((ku5.f) aVar).d();
                vc.s.j(dVarD2);
                ev5.d dVarD3 = ((ku5.f) bVar2.f302850a).d();
                vc.s.j(dVarD3);
                return qt5.g.a(dVarD2, qt5.f.a(dVarD3, Optional.empty()), (pt5.r) cVar.d.get(), (pt5.m) cVar.e.get());
            case 2:
                ViewController viewController = cVar.f302855a;
                a5c.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(viewController, "viewController");
                return (RevolutXFiatBalancesDetailsScreen) viewController;
            case 3:
                ev5.d dVarD4 = ((ku5.f) aVar).d();
                vc.s.j(dVarD4);
                return qt5.i.a(dVarD4, Optional.empty(), Optional.empty());
            case 4:
                return new z4c.g(cVar.f302856b, (z4c.b) cVar.d.get(), t2d.c.d(bVar2.f302852c.a(), bVar2.f302851b.b()));
            case 5:
                RevolutXFiatBalancesDetailsController$InputData revolutXFiatBalancesDetailsController$InputData = cVar.f302856b;
                xv5.c cVarA = bVar.d.a();
                vc.s.j(cVarA);
                ur5.c revolutXFiatBalanceInteractor = t2d.c.d(bVar2.f302852c.a(), bVar2.f302851b.b());
                ppk.f ratesInteractor = bVar2.f302852c.a();
                Intrinsics.checkNotNullParameter(revolutXFiatBalanceInteractor, "revolutXFiatBalanceInteractor");
                Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
                r10.w wVar = new r10.w();
                wVar.f250865a = revolutXFiatBalanceInteractor;
                wVar.f250866b = ratesInteractor;
                pt5.m mVar = (pt5.m) cVar.e.get();
                j61.b bVarC = bVar.e.c();
                vc.s.j(bVarC);
                l61.a aVarB = bVar.f.b();
                vc.s.j(aVarB);
                return new com.revolut.feature.revolut_x_balances.impl.fiat.a(revolutXFiatBalancesDetailsController$InputData, cVarA, wVar, mVar, bVarC, aVarB, new z4c.c(), new y4c.k(new vr5.c(), (pt5.f) cVar.i.get()));
            case 6:
                ev5.d dVarD5 = ((ku5.f) aVar).d();
                vc.s.j(dVarD5);
                return qt5.e.a(dVarD5);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object l() {
        x98.d dVar = (x98.d) this.d;
        x98.o oVar = (x98.o) this.f297585b;
        int i = this.f297586c;
        if (i == 0) {
            la8.i iVar = new la8.i();
            JuniorIsaAddPhoneNumberScreenContract$InputData juniorIsaAddPhoneNumberScreenContract$InputData = dVar.f303607a;
            z80.b bVarS = oVar.f303633j.s();
            vc.s.j(bVarS);
            e4m.e eVar = dVar.f303608b;
            hj8.a aVarA = oVar.d.a();
            vc.s.j(aVarA);
            return new com.revolut.feature.junior.isa.impl.ui.jisa_add_phone_number.a(iVar, juniorIsaAddPhoneNumberScreenContract$InputData, bVarS, eVar, aVarA, oVar.o.a(), (x98.c) dVar.f303609c.get());
        }
        if (i != 1) {
            if (i == 2) {
                return new x98.c(this);
            }
            throw new AssertionError(i);
        }
        oai.a sharedDeps = oVar.f303636n;
        ma8.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(sharedDeps, "sharedDeps");
        x7a.c cVar = (x7a.c) sharedDeps.f.get();
        vc.s.k(cVar);
        return cVar;
    }

    private final Object m() {
        xb1.p pVar = (xb1.p) this.f297585b;
        ka1.l lVar = pVar.f303956b;
        xb1.k kVar = (xb1.k) this.d;
        int i = this.f297586c;
        if (i == 0) {
            xc1.d extension = (xc1.d) kVar.e.get();
            Intrinsics.checkNotNullParameter(extension, "extension");
            xc1.d dVar = extension;
            vc.s.k(dVar);
            return dVar;
        }
        if (i == 1) {
            xc1.a dialogDisplayerProvider = (xc1.a) kVar.d.get();
            Intrinsics.checkNotNullParameter(dialogDisplayerProvider, "dialogDisplayerProvider");
            return new xc1.d(dialogDisplayerProvider);
        }
        if (i == 2) {
            com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) kVar.f303941c.get();
            qc1.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(controller, "controller");
            CardReaderPaymentScreen cardReaderPaymentScreen = (CardReaderPaymentScreen) controller;
            vc.s.k(cardReaderPaymentScreen);
            return cardReaderPaymentScreen;
        }
        if (i != 3) {
            if (i == 4) {
                return new pc1.r();
            }
            if (i != 5) {
                throw new AssertionError(i);
            }
            com.revolut.kompot.navigable.a controller2 = (com.revolut.kompot.navigable.a) kVar.f303941c.get();
            qc1.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(controller2, "controller");
            return x0.a(g1.Companion, controller2.D2());
        }
        jki.p pVar2 = (jki.p) kVar.f303942g.get();
        CardReaderPaymentScreenContract$InputData cardReaderPaymentScreenContract$InputData = kVar.f303939a;
        da1.e eVar = (da1.e) lVar.P.get();
        vc.s.j(eVar);
        da1.d dVar2 = (da1.d) lVar.f182384w.get();
        vc.s.j(dVar2);
        cfc.b bVarA = pVar.f303955a.a();
        vc.s.j(bVarA);
        g1 g1Var = (g1) kVar.f303943h.get();
        efc.b bVar = (efc.b) kVar.f303940b.f303955a.f14957q.get();
        vc.s.j(bVar);
        return new pc1.q(pVar2, cardReaderPaymentScreenContract$InputData, eVar, dVar2, bVarA, g1Var, new pc1.b(bVar), (xc1.d) kVar.e.get());
    }

    @Override // phm.a
    public final Object get() {
        Object bVar;
        Object cVar;
        Object cVar2;
        Object cVar3;
        switch (this.f297584a) {
            case 0:
                z zVar = (z) this.f297585b;
                r7d.l lVar = zVar.f297614a;
                qga.b bVar2 = zVar.f297615b;
                vn.a aVar = zVar.f297616c;
                u uVar = (u) this.d;
                z zVar2 = uVar.f297589c;
                int i = this.f297586c;
                switch (i) {
                    case 0:
                        return h7d.d.a(uVar.f297587a, (i7d.o) uVar.d.get(), lVar.d());
                    case 1:
                        return h7d.f.a(lVar.d(), Optional.empty());
                    case 2:
                        return nga.c.s(bVar2.c(), (mga.i0) uVar.f297590g.get(), (mga.f0) uVar.i.get(), (on.a) uVar.f297592j.get());
                    case 3:
                        yji.o controller = (com.revolut.kompot.navigable.a) uVar.f.get();
                        xic.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(controller, "controller");
                        mga.i0 i0Var = (mga.i0) controller;
                        vc.s.k(i0Var);
                        return i0Var;
                    case 4:
                        return nga.c.u(bVar2.c(), uVar.f297588b, (wn.a) uVar.f297591h.get());
                    case 5:
                        return v7.z(aVar, "provider");
                    case 6:
                        os2.g factory = aVar.c();
                        Intrinsics.checkNotNullParameter(factory, "factory");
                        return (sn.a) factory.f229224b;
                    case 7:
                        wn.a aVar2 = (wn.a) uVar.f297591h.get();
                        n57.a.d(aVar2);
                        return aVar2;
                    case 8:
                        bgc.d dVarA = zVar.d.a();
                        bgc.d dVarA2 = zVar2.d.a();
                        xua.a aVarA = zVar2.e.a();
                        vc.s.j(aVarA);
                        l80.e eVarH = zVar2.f.h();
                        vc.s.j(eVarH);
                        utk.f fVar = new utk.f(dVarA2, aVarA, eVarH);
                        zxb.k0 k0Var = zVar2.f297617g;
                        nyb.k kVarC = k0Var.c();
                        vc.s.j(kVarC);
                        m0 m0VarG = k0Var.g();
                        vc.s.j(m0VarG);
                        com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) zVar2.f297618h).c();
                        vc.s.j(aVarC);
                        vgc.p pVar = new vgc.p(kVarC, m0VarG, aVarC);
                        ffk.t tVarF = zVar.i.f();
                        vc.s.j(tVarF);
                        return new yic.x(dVarA, fVar, pVar, tVarF, zVar.f297619j.b(), (i7d.o) uVar.d.get(), new tyc.l(new bjc.b(), new bjc.c()));
                    default:
                        throw new AssertionError(i);
                }
            case 1:
                z zVar3 = (z) this.f297585b;
                v vVar = (v) this.d;
                int i2 = this.f297586c;
                switch (i2) {
                    case 0:
                        return h7d.d.a(vVar.f297595a, (i7d.o) vVar.f.get(), zVar3.f297614a.d());
                    case 1:
                        return h7d.f.a(zVar3.f297614a.d(), Optional.of((i7d.m) vVar.e.get()));
                    case 2:
                        return new hjc.a();
                    case 3:
                        return nga.c.s(zVar3.f297615b.c(), (mga.i0) vVar.i.get(), (mga.f0) vVar.k.get(), (on.a) vVar.f297601l.get());
                    case 4:
                        yji.o controller2 = (com.revolut.kompot.navigable.a) vVar.f297599h.get();
                        xic.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(controller2, "controller");
                        mga.i0 i0Var2 = (mga.i0) controller2;
                        vc.s.k(i0Var2);
                        return i0Var2;
                    case 5:
                        return nga.c.u(zVar3.f297615b.c(), vVar.f297596b, (wn.a) vVar.f297600j.get());
                    case 6:
                        return v7.z(zVar3.f297616c, "provider");
                    case 7:
                        os2.g factory2 = zVar3.f297616c.c();
                        Intrinsics.checkNotNullParameter(factory2, "factory");
                        return (sn.a) factory2.f229224b;
                    case 8:
                        wn.a aVar3 = (wn.a) vVar.f297600j.get();
                        n57.a.d(aVar3);
                        return aVar3;
                    case 9:
                        RentAndBillsManageLinkedPaymentsScreenContract$InputData rentAndBillsManageLinkedPaymentsScreenContract$InputData = vVar.f297597c;
                        z zVar4 = vVar.d;
                        bgc.d dVarA3 = zVar3.d.a();
                        bgc.d dVarA4 = zVar4.d.a();
                        xua.a aVarA2 = zVar4.e.a();
                        vc.s.j(aVarA2);
                        l80.e eVarH2 = zVar4.f.h();
                        vc.s.j(eVarH2);
                        utk.f fVar2 = new utk.f(dVarA4, aVarA2, eVarH2);
                        zxb.k0 k0Var2 = zVar4.f297617g;
                        nyb.k kVarC2 = k0Var2.c();
                        vc.s.j(kVarC2);
                        m0 m0VarG2 = k0Var2.g();
                        vc.s.j(m0VarG2);
                        com.revolut.domain.interactors.transactions.a aVarC2 = ((bjf.a) zVar4.f297618h).c();
                        vc.s.j(aVarC2);
                        vgc.p pVar2 = new vgc.p(kVarC2, m0VarG2, aVarC2);
                        xua.a aVarA3 = zVar3.e.a();
                        vc.s.j(aVarA3);
                        rp0.l0 l0Var = (rp0.l0) vVar.o.get();
                        tga.k kVarB = zVar3.f297619j.b();
                        i7d.o oVar = (i7d.o) vVar.f.get();
                        RentAndBillsManageLinkedPaymentsScreenContract$InputData inputData = vVar.f297597c;
                        gjc.d dVar = new gjc.d(inputData);
                        gjc.i statusMapper = new gjc.i(inputData);
                        c3j.c cVar4 = new c3j.c();
                        m3j.j jVarD = b3j.p.d();
                        thf.c cVarC = zVar4.k.c();
                        vc.s.j(cVarC);
                        gjc.f linkedPaymentsMapper = new gjc.f(inputData, new ojc.d(cVar4, jVarD, cVarC));
                        gjc.b detailsMapper = new gjc.b(inputData);
                        Intrinsics.checkNotNullParameter(inputData, "inputData");
                        Intrinsics.checkNotNullParameter(statusMapper, "statusMapper");
                        Intrinsics.checkNotNullParameter(linkedPaymentsMapper, "linkedPaymentsMapper");
                        Intrinsics.checkNotNullParameter(detailsMapper, "detailsMapper");
                        twg.c cVar5 = new twg.c();
                        cVar5.f275017a = inputData;
                        cVar5.f275018b = statusMapper;
                        cVar5.f275019c = linkedPaymentsMapper;
                        cVar5.d = detailsMapper;
                        return new djc.b0(rentAndBillsManageLinkedPaymentsScreenContract$InputData, dVarA3, fVar2, pVar2, aVarA3, l0Var, kVarB, oVar, new djc.c0(dVar, cVar5));
                    case 10:
                        com.revolut.kompot.navigable.a controller3 = (com.revolut.kompot.navigable.a) vVar.f297599h.get();
                        fjc.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(controller3, "controller");
                        return new rp0.l0(controller3.m2());
                    default:
                        throw new AssertionError(i2);
                }
            case 2:
                z zVar5 = (z) this.f297585b;
                w wVar = (w) this.d;
                int i3 = this.f297586c;
                if (i3 == 0) {
                    com.revolut.kompot.navigable.a aVar4 = (com.revolut.kompot.navigable.a) wVar.f297606b.get();
                    i60.b.Companion.getClass();
                    return b.a.a(aVar4);
                }
                if (i3 != 1) {
                    throw new AssertionError(i3);
                }
                RentAndBillsRevPointsEarnedScreenContract$InputData rentAndBillsRevPointsEarnedScreenContract$InputData = wVar.f297605a;
                m0 m0VarG3 = zVar5.f297617g.g();
                vc.s.j(m0VarG3);
                return new ijc.k(rentAndBillsRevPointsEarnedScreenContract$InputData, m0VarG3, zVar5.d.a(), (h60.d) wVar.f297607c.get(), new kjc.a());
            case 3:
                wi8.g gVar = (wi8.g) this.d;
                JuniorPaymentLinkCustomAmountScreenContract$Input juniorPaymentLinkCustomAmountScreenContract$Input = gVar.f297857b;
                int i5 = this.f297586c;
                if (i5 == 0) {
                    n60.a aVar5 = (n60.a) gVar.e.get();
                    o5k.i.l(aVar5);
                    return aVar5;
                }
                if (i5 == 1) {
                    return o5k.i.q((com.revolut.kompot.navigable.a) gVar.d.get());
                }
                if (i5 == 2) {
                    return new ej8.h(new ej8.j(juniorPaymentLinkCustomAmountScreenContract$Input, (w80.b) gVar.f297859g.get(), new u80.o()), juniorPaymentLinkCustomAmountScreenContract$Input, (w80.b) gVar.f297859g.get(), (n60.a) gVar.e.get());
                }
                if (i5 != 3) {
                    throw new AssertionError(i5);
                }
                qd0.b languageProvider = ((wi8.e) this.f297585b).f297847a.n();
                vc.s.j(languageProvider);
                fj8.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
                return v80.b.b(languageProvider, false, false, 58);
            case 4:
                wi8.g gVar2 = (wi8.g) this.d;
                JuniorPaymentLinkCustomAmountScreenContract$Input juniorPaymentLinkCustomAmountScreenContract$Input2 = gVar2.f297857b;
                int i6 = this.f297586c;
                if (i6 == 0) {
                    n60.a aVar6 = (n60.a) gVar2.e.get();
                    o5k.i.l(aVar6);
                    return aVar6;
                }
                if (i6 == 1) {
                    return o5k.i.q((com.revolut.kompot.navigable.a) gVar2.d.get());
                }
                if (i6 == 2) {
                    return new ej8.h(new ej8.j(juniorPaymentLinkCustomAmountScreenContract$Input2, (w80.b) gVar2.f297859g.get(), new u80.o()), juniorPaymentLinkCustomAmountScreenContract$Input2, (w80.b) gVar2.f297859g.get(), (n60.a) gVar2.e.get());
                }
                if (i6 != 3) {
                    throw new AssertionError(i6);
                }
                qd0.b languageProvider2 = ((wi8.e) this.f297585b).f297847a.n();
                vc.s.j(languageProvider2);
                fj8.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(languageProvider2, "languageProvider");
                return v80.b.b(languageProvider2, false, false, 58);
            case 5:
                wpg.d dVar2 = (wpg.d) this.d;
                wpg.l lVar2 = (wpg.l) this.f297585b;
                int i21 = this.f297586c;
                switch (i21) {
                    case 0:
                        return kxa.j.l((j60.a) dVar2.e.get());
                    case 1:
                        return h30.l.p((com.revolut.kompot.navigable.a) dVar2.f299246c.get(), (rp0.m) dVar2.d.get());
                    case 2:
                        return new rp0.m();
                    case 3:
                        clb.c extension = (clb.c) dVar2.f299247g.get();
                        qqg.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension, "extension");
                        vc.s.k(extension);
                        return extension;
                    case 4:
                        dkk.a0 savingsErrorHandlingApiFactory = ((blb.e) lVar2.v).d();
                        qqg.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(savingsErrorHandlingApiFactory, "savingsErrorHandlingApiFactory");
                        return savingsErrorHandlingApiFactory.a();
                    case 5:
                        w80.b bVar3 = (w80.b) dVar2.i.get();
                        u80.o oVar2 = new u80.o();
                        gte.a aVarB = dVar2.f299245b.f299286p.b();
                        vc.s.j(aVarB);
                        pqg.k0 k0Var3 = new pqg.k0(bVar3, oVar2, aVarB, dVar2.f299244a);
                        AddMoneyScreenContract$InputData addMoneyScreenContract$InputData = dVar2.f299244a;
                        usg.a aVar7 = lVar2.f299279c;
                        tib.b bVar4 = lVar2.v;
                        wsg.n nVarB = aVar7.b();
                        ppg.b bVar5 = (ppg.b) lVar2.H.get();
                        ijb.a aVarG = ((blb.e) bVar4).g();
                        vc.s.j(aVarG);
                        acb.j jVar = (acb.j) dVar2.f299249j.get();
                        w80.b bVar6 = (w80.b) dVar2.i.get();
                        eli.j jVarA = lVar2.f299292x.a();
                        pqg.m mVar = (pqg.m) dVar2.k.get();
                        skb.f fVarB = ((blb.e) bVar4).b();
                        j60.a aVar8 = (j60.a) dVar2.e.get();
                        qr0.i iVar = new qr0.i((srf.h) dVar2.f299250l.get());
                        ppg.a aVar9 = (ppg.a) lVar2.S.get();
                        xua.a aVarA4 = lVar2.f299293y.a();
                        vc.s.j(aVarA4);
                        zbb.a aVar10 = (zbb.a) dVar2.f299251m.get();
                        clb.c cVar6 = (clb.c) dVar2.f299247g.get();
                        n8b.a aVarA5 = lVar2.A.a();
                        vc.s.j(aVarA5);
                        return new pqg.i0(k0Var3, addMoneyScreenContract$InputData, nVarB, bVar5, aVarG, jVar, bVar6, jVarA, mVar, fVarB, aVar8, iVar, aVar9, aVarA4, aVar10, cVar6, aVarA5, lVar2.B.a());
                    case 6:
                        qd0.b languageProvider3 = lVar2.f299289s.n();
                        vc.s.j(languageProvider3);
                        qqg.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(languageProvider3, "languageProvider");
                        return v80.b.b(languageProvider3, false, false, 58);
                    case 7:
                        return xb1.a.q(new l4i.a(), lVar2.f299291w.a());
                    case 8:
                        return new pqg.b((hpg.b) lVar2.Z.get());
                    case 9:
                        return qqg.c.a();
                    case 10:
                        fk3.a aVarA6 = lVar2.z.a();
                        vc.s.j(aVarA6);
                        return xb1.a.o(aVarA6);
                    default:
                        throw new AssertionError(i21);
                }
            case 6:
                wpg.f fVar3 = (wpg.f) this.d;
                int i22 = this.f297586c;
                if (i22 == 0) {
                    return new crg.h((jki.p) fVar3.f299257b.get(), fVar3.f299256a, (ypg.d) ((wpg.l) this.f297585b).T.get(), (crg.a) fVar3.f299258c.get());
                }
                if (i22 == 1) {
                    return new crg.i();
                }
                if (i22 == 2) {
                    return new crg.a();
                }
                throw new AssertionError(i22);
            case 7:
                wpg.i iVar2 = (wpg.i) this.d;
                wpg.l lVar3 = (wpg.l) this.f297585b;
                usg.a aVar11 = lVar3.f299279c;
                l70.e eVar = lVar3.f299289s;
                int i32 = this.f297586c;
                if (i32 == 0) {
                    wj0.a idempotencyKeyHolder = ((nj0.d) lVar3.k).i();
                    vc.s.j(idempotencyKeyHolder);
                    l80.e dateProvider = eVar.h();
                    vc.s.j(dateProvider);
                    uqg.c.Companion.getClass();
                    Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
                    Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
                    bVar = new m60.b(idempotencyKeyHolder, dateProvider, "payments_recurring_transfer");
                } else {
                    if (i32 != 1) {
                        if (i32 == 2) {
                            l80.e dateProvider2 = eVar.h();
                            vc.s.j(dateProvider2);
                            wsg.n walletInteractor = aVar11.b();
                            xua.a recurringPaymentInteractor = lVar3.f299293y.a();
                            vc.s.j(recurringPaymentInteractor);
                            com.revolut.domain.interactors.transactions.a transactionsInteractor = ((bjf.a) lVar3.E).c();
                            vc.s.j(transactionsInteractor);
                            uqg.c.Companion.getClass();
                            Intrinsics.checkNotNullParameter(dateProvider2, "dateProvider");
                            Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
                            Intrinsics.checkNotNullParameter(recurringPaymentInteractor, "recurringPaymentInteractor");
                            Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
                            return new uqg.a(dateProvider2, walletInteractor, recurringPaymentInteractor, transactionsInteractor, 0);
                        }
                        if (i32 != 3) {
                            if (i32 == 4) {
                                return uqg.d.a();
                            }
                            throw new AssertionError(i32);
                        }
                        ppg.b bVar7 = (ppg.b) lVar3.H.get();
                        wsg.n nVarB2 = aVar11.b();
                        ppg.a aVar12 = (ppg.a) lVar3.S.get();
                        ijb.a aVarG2 = ((blb.e) lVar3.v).g();
                        vc.s.j(aVarG2);
                        srf.h transferValidator = (srf.h) iVar2.f299269g.get();
                        uqg.c.Companion.getClass();
                        Intrinsics.checkNotNullParameter(transferValidator, "transferValidator");
                        o7.d dVar3 = new o7.d(transferValidator);
                        hj8.a aVarA7 = lVar3.C.a();
                        vc.s.j(aVarA7);
                        return new tqg.a(aVarA7, aVarG2, dVar3, aVar12, bVar7, nVarB2);
                    }
                    RecurringTransferFlowContract$FlowInput recurringTransferFlowContract$FlowInput = iVar2.f299266a;
                    zof.f fVarD = lVar3.D.d();
                    vc.s.j(fVarD);
                    l80.e eVarH3 = eVar.h();
                    vc.s.j(eVarH3);
                    bVar = new com.revolut.feature.vaults.impl.ui.money_flow.recurring_transfer.a(recurringTransferFlowContract$FlowInput, fVarD, eVarH3);
                }
                return bVar;
            case 8:
                wpg.l lVar4 = (wpg.l) this.f297585b;
                wpg.j jVar2 = (wpg.j) this.d;
                int i33 = this.f297586c;
                if (i33 != 0) {
                    if (i33 == 1) {
                        return new iqg.p();
                    }
                    throw new AssertionError(i33);
                }
                cli.n nVar = (cli.n) jVar2.f299272b.get();
                SpareChangeScreenContract$InputData spareChangeScreenContract$InputData = jVar2.f299271a;
                xvh.c cVarA = ((a6d.e) lVar4.f299280g).a();
                vc.s.j(cVarA);
                return new com.revolut.feature.vaults.impl.ui.details.spare_change.kompot.b(nVar, spareChangeScreenContract$InputData, cVarA, (ppg.b) lVar4.H.get());
            case 9:
                wpg.l lVar5 = (wpg.l) this.f297585b;
                wpg.k kVar = (wpg.k) this.d;
                VaultTermsViewerScreenContract$InputData vaultTermsViewerScreenContract$InputData = kVar.f299274a;
                int i43 = this.f297586c;
                if (i43 == 0) {
                    pre.c cVarA2 = lVar5.u.a();
                    vc.s.j(cVarA2);
                    return new com.revolut.feature.vaults.impl.ui.details.terms_viewer.a(vaultTermsViewerScreenContract$InputData, cVarA2, (cli.n) kVar.f299275b.get());
                }
                if (i43 == 1) {
                    return new com.revolut.feature.vaults.impl.ui.details.terms_viewer.b(vaultTermsViewerScreenContract$InputData);
                }
                if (i43 != 2) {
                    throw new AssertionError(i43);
                }
                z70.a contextProvider = lVar5.f299289s.f();
                vc.s.j(contextProvider);
                kqg.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
                Context context = contextProvider.getContext();
                return com.bumptech.glide.c.k(context).a(context);
            case 10:
                wpg.m mVar2 = (wpg.m) this.d;
                wpg.l lVar6 = (wpg.l) this.f297585b;
                usg.a aVar13 = lVar6.f299279c;
                int i59 = this.f297586c;
                if (i59 == 0) {
                    return new vqg.f(mVar2.f299294a);
                }
                if (i59 == 1) {
                    final wsg.n walletInteractor2 = aVar13.b();
                    final ppg.b vaultsInteractor = (ppg.b) lVar6.H.get();
                    final vqg.b dialogConfigProvider = new vqg.b();
                    wqg.c.Companion.getClass();
                    Intrinsics.checkNotNullParameter(walletInteractor2, "walletInteractor");
                    Intrinsics.checkNotNullParameter(vaultsInteractor, "vaultsInteractor");
                    Intrinsics.checkNotNullParameter(dialogConfigProvider, "dialogConfigProvider");
                    final int i66 = 0;
                    return new xbb.d() { // from class: wqg.a
                        @Override // xbb.d
                        public final j a() {
                            switch (i66) {
                            }
                            return new i(walletInteractor2, vaultsInteractor, dialogConfigProvider);
                        }
                    };
                }
                if (i59 != 2) {
                    throw new AssertionError(i59);
                }
                ppg.b bVar8 = (ppg.b) lVar6.H.get();
                wsg.n nVarB3 = aVar13.b();
                ppg.a aVar14 = (ppg.a) lVar6.S.get();
                srf.e transferValidator2 = xbb.e.a();
                Intrinsics.checkNotNullParameter(transferValidator2, "transferValidator");
                o7.d dVar4 = new o7.d(transferValidator2);
                ijb.a aVarG3 = ((blb.e) lVar6.v).g();
                vc.s.j(aVarG3);
                hj8.a aVarA8 = lVar6.C.a();
                vc.s.j(aVarA8);
                return new mqg.e(aVarA8, aVarG3, dVar4, aVar14, bVar8, nVarB3);
            case 11:
                wpg.n nVar2 = (wpg.n) this.d;
                wpg.l lVar7 = (wpg.l) this.f297585b;
                usg.a aVar15 = lVar7.f299279c;
                int i74 = this.f297586c;
                if (i74 == 0) {
                    WithdrawMoneyFlowContract$InputData withdrawMoneyFlowContract$InputData = nVar2.f299297a;
                    wpg.l lVar8 = nVar2.f299298b;
                    return new xqg.e(withdrawMoneyFlowContract$InputData, new ccb.m0((ppg.b) lVar8.H.get(), lVar8.f299279c.b()));
                }
                if (i74 == 1) {
                    final wsg.n walletInteractor3 = aVar15.b();
                    final ppg.b vaultsInteractor2 = (ppg.b) lVar7.H.get();
                    final vqg.b dialogConfigProvider2 = new vqg.b();
                    yqg.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(walletInteractor3, "walletInteractor");
                    Intrinsics.checkNotNullParameter(vaultsInteractor2, "vaultsInteractor");
                    Intrinsics.checkNotNullParameter(dialogConfigProvider2, "dialogConfigProvider");
                    final int i92 = 1;
                    return new xbb.d() { // from class: wqg.a
                        @Override // xbb.d
                        public final j a() {
                            switch (i92) {
                            }
                            return new i(walletInteractor3, vaultsInteractor2, dialogConfigProvider2);
                        }
                    };
                }
                if (i74 != 2) {
                    throw new AssertionError(i74);
                }
                ppg.b bVar9 = (ppg.b) lVar7.H.get();
                wsg.n nVarB4 = aVar15.b();
                ppg.a aVar16 = (ppg.a) lVar7.S.get();
                srf.e transferValidator3 = xbb.e.a();
                Intrinsics.checkNotNullParameter(transferValidator3, "transferValidator");
                o7.d dVar5 = new o7.d(transferValidator3);
                ijb.a aVarG4 = ((blb.e) lVar7.v).g();
                vc.s.j(aVarG4);
                hj8.a aVarA9 = lVar7.C.a();
                vc.s.j(aVarA9);
                return new mqg.e(aVarA9, aVarG4, dVar5, aVar16, bVar9, nVarB4);
            case 12:
                wy7.f fVar4 = (wy7.f) this.f297585b;
                wy7.a aVar17 = (wy7.a) this.d;
                int i96 = this.f297586c;
                switch (i96) {
                    case 0:
                        return kpi.f.a();
                    case 1:
                        Context contextI = bq.i.i(aVar17.f301093a);
                        BaseDelegatesActivity baseDelegatesActivityF = bq.i.f(aVar17.f301093a);
                        t70.g gVarO = fVar4.f301145b.o();
                        vc.s.j(gVarO);
                        cVar = new npi.c(contextI, baseDelegatesActivityF, gVarO);
                        break;
                    case 2:
                        return new tpi.i((rpi.c) aVar17.e.get(), gsi.c.a(aVar17.f301093a));
                    case 3:
                        return new rpi.b(bq.i.b(aVar17.f301093a));
                    case 4:
                        return new rpi.h(bq.i.b(aVar17.f301093a));
                    case 5:
                        cVar = new iri.g((iri.j) fVar4.f.get(), (iri.m) fVar4.k.get(), bq.i.f(aVar17.f301093a), bq.i.l(aVar17.f301093a));
                        break;
                    case 6:
                        cVar = new iri.l((iri.m) fVar4.k.get(), bq.i.f(aVar17.f301093a), (iri.d) aVar17.i.get());
                        break;
                    case 7:
                        return new iri.d(bq.i.f(aVar17.f301093a));
                    case 8:
                        return new opi.b(bq.i.f(aVar17.f301093a));
                    case 9:
                        return new en.c(ImmutableSet.of((ln.d) aVar17.f301094b.f301148h.get()), bq.i.l(aVar17.f301093a));
                    case 10:
                        aVar17.getClass();
                        return new xpi.c(xpi.f.d, bq.i.b(aVar17.f301093a));
                    case 11:
                        aVar17.getClass();
                        xoi.d dVar6 = aVar17.f301093a;
                        return new ypi.e(ypi.h.d, bq.i.b(dVar6), bq.i.o(dVar6), bq.i.g(dVar6));
                    case 12:
                        xpi.g gVar3 = (xpi.g) aVar17.f301100m.get();
                        ypi.i iVar3 = (ypi.i) aVar17.f301101n.get();
                        f9b.f fVar5 = (f9b.f) aVar17.o.get();
                        xy7.k kVar2 = (xy7.k) fVar4.f301150l.get();
                        xy7.f fVar6 = (xy7.f) fVar4.f301151m.get();
                        wy7.f fVar7 = aVar17.f301094b;
                        fx7.f fVarB2 = fVar7.f301146c.b();
                        vc.s.j(fVarB2);
                        yx7.h hVar = new yx7.h(fVarB2);
                        qd0.b bVarN = fVar7.f301145b.n();
                        vc.s.j(bVarN);
                        xy7.o oVar3 = new xy7.o(gVar3, iVar3, fVar5, kVar2, fVar6, new yy7.c(hVar, bVarN));
                        kli.a.p(oVar3, bq.i.d(aVar17.f301093a));
                        return oVar3;
                    case 13:
                        return bq.i.t(aVar17.f301093a);
                    default:
                        throw new AssertionError(i96);
                }
                return cVar;
            case 13:
                wy7.f fVar8 = (wy7.f) this.f297585b;
                wy7.b bVar10 = (wy7.b) this.d;
                int i99 = this.f297586c;
                switch (i99) {
                    case 0:
                        return kpi.f.a();
                    case 1:
                        Context contextI2 = bq.i.i(bVar10.f301103a);
                        BaseDelegatesActivity baseDelegatesActivityF2 = bq.i.f(bVar10.f301103a);
                        t70.g gVarO2 = fVar8.f301145b.o();
                        vc.s.j(gVarO2);
                        cVar2 = new npi.c(contextI2, baseDelegatesActivityF2, gVarO2);
                        break;
                    case 2:
                        return new tpi.i((rpi.c) bVar10.e.get(), gsi.c.a(bVar10.f301103a));
                    case 3:
                        return new rpi.b(bq.i.b(bVar10.f301103a));
                    case 4:
                        return new rpi.h(bq.i.b(bVar10.f301103a));
                    case 5:
                        cVar2 = new iri.g((iri.j) fVar8.f.get(), (iri.m) fVar8.f301152n.get(), bq.i.f(bVar10.f301103a), bq.i.l(bVar10.f301103a));
                        break;
                    case 6:
                        cVar2 = new iri.l((iri.m) fVar8.f301152n.get(), bq.i.f(bVar10.f301103a), (iri.d) bVar10.i.get());
                        break;
                    case 7:
                        return new iri.d(bq.i.f(bVar10.f301103a));
                    case 8:
                        return new opi.b(bq.i.f(bVar10.f301103a));
                    case 9:
                        return new en.c(ImmutableSet.of((ln.d) bVar10.f301104b.f301148h.get()), bq.i.l(bVar10.f301103a));
                    case 10:
                        bVar10.getClass();
                        return new xpi.c(xpi.f.d, bq.i.b(bVar10.f301103a));
                    case 11:
                        bVar10.getClass();
                        xoi.d dVar7 = bVar10.f301103a;
                        return new ypi.e(ypi.h.d, bq.i.b(dVar7), bq.i.o(dVar7), bq.i.g(dVar7));
                    case 12:
                        xpi.g gVar4 = (xpi.g) bVar10.f301110m.get();
                        ypi.i iVar4 = (ypi.i) bVar10.f301111n.get();
                        f9b.f fVar9 = (f9b.f) bVar10.o.get();
                        az7.e eVar2 = (az7.e) fVar8.o.get();
                        az7.b bVar11 = (az7.b) fVar8.f301153p.get();
                        qd0.b bVarN2 = bVar10.f301104b.f301145b.n();
                        vc.s.j(bVarN2);
                        az7.g gVar5 = new az7.g(gVar4, iVar4, fVar9, eVar2, bVar11, new bz7.b(bVarN2));
                        kli.a.p(gVar5, bq.i.d(bVar10.f301103a));
                        return gVar5;
                    case 13:
                        return bq.i.t(bVar10.f301103a);
                    default:
                        throw new AssertionError(i99);
                }
                return cVar2;
            case 14:
                wy7.f fVar10 = (wy7.f) this.f297585b;
                wy7.c cVar7 = (wy7.c) this.d;
                int i100 = this.f297586c;
                switch (i100) {
                    case 0:
                        return kpi.f.a();
                    case 1:
                        Context contextI3 = bq.i.i(cVar7.f301113a);
                        BaseDelegatesActivity baseDelegatesActivityF3 = bq.i.f(cVar7.f301113a);
                        t70.g gVarO3 = fVar10.f301145b.o();
                        vc.s.j(gVarO3);
                        cVar3 = new npi.c(contextI3, baseDelegatesActivityF3, gVarO3);
                        break;
                    case 2:
                        return new tpi.i((rpi.c) cVar7.f.get(), gsi.c.a(cVar7.f301113a));
                    case 3:
                        return new rpi.b(bq.i.b(cVar7.f301113a));
                    case 4:
                        return new rpi.h(bq.i.b(cVar7.f301113a));
                    case 5:
                        cVar3 = new iri.g((iri.j) fVar10.f.get(), (iri.m) fVar10.f301147g.get(), bq.i.f(cVar7.f301113a), bq.i.l(cVar7.f301113a));
                        break;
                    case 6:
                        cVar3 = new iri.l((iri.m) fVar10.f301147g.get(), bq.i.f(cVar7.f301113a), (iri.d) cVar7.f301118j.get());
                        break;
                    case 7:
                        return new iri.d(bq.i.f(cVar7.f301113a));
                    case 8:
                        return new opi.b(bq.i.f(cVar7.f301113a));
                    case 9:
                        return new en.c(ImmutableSet.of((ln.d) cVar7.f301115c.f301148h.get()), bq.i.l(cVar7.f301113a));
                    case 10:
                        ypi.h hVar2 = cVar7.f301114b;
                        xoi.d dVar8 = cVar7.f301113a;
                        return new ypi.e(hVar2, bq.i.b(dVar8), bq.i.o(dVar8), bq.i.g(dVar8));
                    case 11:
                        cVar7.getClass();
                        return new xpi.c(xpi.f.d, bq.i.b(cVar7.f301113a));
                    case 12:
                        xpi.g gVar6 = (xpi.g) cVar7.o.get();
                        ypi.i iVar5 = (ypi.i) cVar7.f301121n.get();
                        f9b.f fVar11 = (f9b.f) cVar7.f301122p.get();
                        dz7.m mVar3 = (dz7.m) fVar10.i.get();
                        dz7.f fVar12 = (dz7.f) fVar10.f301149j.get();
                        fx7.f fVarB3 = cVar7.f301115c.f301146c.b();
                        vc.s.j(fVarB3);
                        dz7.q qVar = new dz7.q(gVar6, iVar5, fVar11, mVar3, fVar12, new ez7.b(new yx7.h(fVarB3)));
                        kli.a.p(qVar, bq.i.d(cVar7.f301113a));
                        return qVar;
                    case 13:
                        return bq.i.t(cVar7.f301113a);
                    default:
                        throw new AssertionError(i100);
                }
                return cVar3;
            case 15:
                wy7.f fVar13 = (wy7.f) this.f297585b;
                wy7.e eVar3 = (wy7.e) this.d;
                int i101 = this.f297586c;
                switch (i101) {
                    case 0:
                        return kpi.f.a();
                    case 1:
                        Context contextI4 = bq.i.i(eVar3.f301127a);
                        BaseDelegatesActivity baseDelegatesActivityF4 = bq.i.f(eVar3.f301127a);
                        t70.g gVarO4 = fVar13.f301145b.o();
                        vc.s.j(gVarO4);
                        return new npi.c(contextI4, baseDelegatesActivityF4, gVarO4);
                    case 2:
                        return new tpi.i((rpi.c) eVar3.f.get(), gsi.c.a(eVar3.f301127a));
                    case 3:
                        return new rpi.b(bq.i.b(eVar3.f301127a));
                    case 4:
                        return new rpi.h(bq.i.b(eVar3.f301127a));
                    case 5:
                        return new iri.g((iri.j) fVar13.f.get(), new vy7.n(), bq.i.f(eVar3.f301127a), bq.i.l(eVar3.f301127a));
                    case 6:
                        return new iri.l(new vy7.n(), bq.i.f(eVar3.f301127a), (iri.d) eVar3.f301132j.get());
                    case 7:
                        return new iri.d(bq.i.f(eVar3.f301127a));
                    case 8:
                        return new opi.b(bq.i.f(eVar3.f301127a));
                    case 9:
                        return new en.c(ImmutableSet.of((ln.d) eVar3.f301128b.f301148h.get()), bq.i.l(eVar3.f301127a));
                    case 10:
                        eVar3.getClass();
                        return new xpi.c(xpi.f.d, bq.i.b(eVar3.f301127a));
                    case 11:
                        eVar3.getClass();
                        return new cn.d(ImmutableSet.copyOf((Collection) dn.b.a()), (cn.e) fVar13.f301154q.get(), fVar13.c());
                    case 12:
                        um.c cVar8 = (um.c) fVar13.f301155r.get();
                        eVar3.getClass();
                        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(5);
                        wy7.f fVar14 = eVar3.f301128b;
                        hn.h hVar3 = (hn.h) fVar14.f301156s.get();
                        t70.g gVarO5 = fVar14.f301145b.o();
                        vc.s.j(gVarO5);
                        builderBuilderWithExpectedSize.add(new jn.a(hVar3, gVarO5));
                        builderBuilderWithExpectedSize.add(new vm.b(com.google.android.gms.internal.mlkit_vision_face.a.f()));
                        builderBuilderWithExpectedSize.add(fVar14.d());
                        builderBuilderWithExpectedSize.addAll((Iterable) in.g.a());
                        builderBuilderWithExpectedSize.add(new jn.d(e4m.b.a(eVar3.f301136p)));
                        return new in.e(cVar8, builderBuilderWithExpectedSize.build(), fVar13.c());
                    case 13:
                        return bq.i.t(eVar3.f301127a);
                    case 14:
                        eVar3.getClass();
                        ImmutableSet.Builder builderBuilderWithExpectedSize2 = ImmutableSet.builderWithExpectedSize(3);
                        builderBuilderWithExpectedSize2.addAll((Iterable) kn.g.a());
                        builderBuilderWithExpectedSize2.add(eVar3.f301138r.get());
                        builderBuilderWithExpectedSize2.add(new kn.h(e4m.b.a(eVar3.f301130g)));
                        return new kn.e(builderBuilderWithExpectedSize2.build(), (ym.d) fVar13.f301157t.get(), fVar13.c());
                    case 15:
                        return new zm.a();
                    case 16:
                        eVar3.getClass();
                        ImmutableSet.Builder builderBuilderWithExpectedSize3 = ImmutableSet.builderWithExpectedSize(2);
                        builderBuilderWithExpectedSize3.addAll((Iterable) hn.g.a());
                        builderBuilderWithExpectedSize3.add(eVar3.f301128b.d());
                        return new hn.d(builderBuilderWithExpectedSize3.build(), (hn.h) fVar13.f301156s.get(), (npi.f) eVar3.e.get());
                    case 17:
                        return new gn.c((lpi.e) eVar3.u.get(), (sm.e) fVar13.B.get(), ImmutableSet.copyOf((Collection) gn.e.a()), fVar13.c());
                    case 18:
                        return new lpi.b(bq.i.i(eVar3.f301127a), bq.i.j(eVar3.f301127a));
                    case 19:
                        eVar3.getClass();
                        return new in.e(ImmutableSet.copyOf((Collection) pm.b.a()), (om.c) fVar13.C.get(), fVar13.c());
                    case 20:
                        eVar3.getClass();
                        ImmutableSet.Builder builderBuilderWithExpectedSize4 = ImmutableSet.builderWithExpectedSize(2);
                        builderBuilderWithExpectedSize4.addAll((Iterable) g3l.f.a());
                        return new g3l.c(j6.a.g(eVar3.f301128b.f301158w, builderBuilderWithExpectedSize4), (g3l.g) fVar13.v.get(), (k3l.b) eVar3.f301142x.get(), fVar13.c());
                    case 21:
                        return new k3l.d(bq.i.b(eVar3.f301127a));
                    case 22:
                        return new wm.l((opi.d) eVar3.f301133l.get(), (wm.a) fVar13.f301160y.get(), ImmutableSet.copyOf((Collection) xm.b.a()), fVar13.c());
                    case 23:
                        vy7.i iVar6 = new vy7.i((xpi.g) eVar3.f301135n.get(), (vy7.b) fVar13.H.get());
                        kli.a.p(iVar6, bq.i.d(eVar3.f301127a));
                        return iVar6;
                    default:
                        throw new AssertionError(i101);
                }
            case 16:
                return a();
            case 17:
                return b();
            case 18:
                return c();
            case 19:
                return d();
            case 20:
                return e();
            case 21:
                return f();
            case 22:
                return g();
            case 23:
                return h();
            case 24:
                return i();
            case 25:
                return j();
            case 26:
                return k();
            case 27:
                return l();
            case 28:
                return m();
            default:
                int i102 = this.f297586c;
                if (i102 != 0) {
                    if (i102 == 1) {
                        return new rc1.d();
                    }
                    throw new AssertionError(i102);
                }
                jki.p pVar3 = (jki.p) ((xb1.l) this.d).f303944a.get();
                cfc.b bVarA = ((xb1.p) this.f297585b).f303955a.a();
                vc.s.j(bVarA);
                return new rc1.b(pVar3, bVarA);
        }
    }
}
