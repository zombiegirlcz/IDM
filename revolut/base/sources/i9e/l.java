package i9e;

import android.app.Activity;
import android.content.Context;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.apm.upi.impl.data.network.UpiService;
import com.revolut.feature.apm.upi.impl.flow.UpiTransferFlowContract$InputData;
import com.revolut.feature.apm.upi.impl.flow.screen.amount.UpiTransferAmountScreenContract$InputData;
import com.revolut.feature.apm.upi.impl.flow.screen.review.UpiTransferReviewScreenContract$InputData;
import com.revolut.feature.apm.upi.impl.provider.UpiAliasDialogProvider;
import com.revolut.feature.apm.upi.impl.screens.pending_payment.subscription.UpiConfirmationScreenContract$InputData;
import com.revolut.feature.contacts_chooser.api.navigation.ContactsChooserInputData;
import com.revolut.feature.rev_points.giftcards.api.navigation.descriptor.RevPointsGiftcardsPurchaseController$InputData;
import com.revolut.feature.subscriptions.impl.edit_frequency.EditSubscriptionFrequencyControllerContract$InputData;
import com.revolut.feature.subscriptions.impl.edit_subscription_end_date.EditSubscriptionEndDateControllerContract$InputData;
import com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.SubscriptionDetailsControllerContract$InputData;
import com.revolut.feature.tax_residency.impl.screens.tin.TaxNumberInputScreenContract$InputData;
import com.revolut.feature.tax_residency.impl.v2.ui.tin_input.TinInputScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import dce.y0;
import g48.r0;
import java.util.Collection;
import kl.c0;
import kotlin.jvm.internal.Intrinsics;
import om4.k0;
import rp0.l0;

/* JADX INFO: loaded from: classes8.dex */
public final class l implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f159693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f159694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f159695c;
    public final Object d;

    public /* synthetic */ l(Object obj2, Object obj3, int i, int i2) {
        this.f159693a = i2;
        this.f159694b = obj2;
        this.d = obj3;
        this.f159695c = i;
    }

    private final Object a() {
        in3.e eVar = (in3.e) this.f159694b;
        l70.e eVar2 = eVar.e;
        in3.g gVar = (in3.g) this.d;
        in3.e eVar3 = gVar.f162630c;
        int i = this.f159695c;
        if (i == 0) {
            return kxa.j.j((j60.a) gVar.f.get());
        }
        if (i == 1) {
            return v1.c.r((com.revolut.kompot.navigable.a) gVar.d.get(), (rp0.m) gVar.e.get());
        }
        if (i == 2) {
            return new rp0.m();
        }
        if (i == 3) {
            bn3.a handler = gVar.f162628a;
            on3.a.Companion.getClass();
            Intrinsics.checkNotNullParameter(handler, "handler");
            vc.s.k(handler);
            return handler;
        }
        if (i != 4) {
            if (i != 5) {
                throw new AssertionError(i);
            }
            s70.a aVarM = eVar2.m();
            vc.s.j(aVarM);
            y80.a aVarR = eVar2.r();
            vc.s.j(aVarR);
            return new pn3.b(aVarM, aVarR);
        }
        ContactsChooserInputData contactsChooserInputData = gVar.f162629b;
        s3a.r rVar = eVar3.f162622c;
        jk3.c cVar = eVar3.d;
        d3a.b bVarA = ((s3a.k) rVar).a();
        vc.s.j(bVarA);
        fk3.a aVarA = cVar.a();
        vc.s.j(aVarA);
        kn3.f fVar = new kn3.f(bVarA, aVarA);
        t3a.h hVar = (t3a.h) ((s3a.k) rVar).i0.get();
        vc.s.j(hVar);
        fk3.a aVarA2 = cVar.a();
        vc.s.j(aVarA2);
        kn3.b bVar = new kn3.b(fVar, new kn3.h(hVar, aVarA2), new kn3.d());
        pn3.a aVar = (pn3.a) gVar.i.get();
        nn3.b bVar2 = new nn3.b();
        gn3.c cVar2 = new gn3.c((ue0.c) eVar3.k.get());
        nn3.a0 a0Var = new nn3.a0();
        j60.a aVar2 = (j60.a) gVar.f.get();
        bn3.a aVar3 = gVar.f162628a;
        wli.x xVarD = ((s41.a) eVar.f).d();
        dl3.f fVarC = eVar3.f162623g.c();
        vc.s.j(fVarC);
        nq9.b bVarB = eVar3.f162624h.b();
        vc.s.j(bVarB);
        return new com.revolut.feature.contacts_chooser.impl.ui.a(contactsChooserInputData, bVar, aVar, bVar2, cVar2, a0Var, aVar2, aVar3, xVarD, new nn3.l(fVarC, bVarB, new nn3.b(), new nn3.i()));
    }

    private final Object b() {
        ine.l lVar = (ine.l) this.d;
        int i = this.f159695c;
        if (i == 0) {
            return kxa.j.r((j60.a) lVar.f.get());
        }
        if (i == 1) {
            return kxa.j.p((com.revolut.kompot.navigable.a) lVar.d.get(), (rp0.m) lVar.e.get(), new j60.e());
        }
        if (i == 2) {
            return new rp0.m();
        }
        if (i == 3) {
            return new com.revolut.feature.tax_residency.impl.flows.missing.b(lVar.f162867a, (yme.a) ((ine.o) this.f159694b).f162889q.get(), (j60.a) lVar.f162871h.get());
        }
        if (i != 4) {
            throw new AssertionError(i);
        }
        j60.a bottomExpandableDialogEmbeddedControllerExtension = (j60.a) lVar.f.get();
        coe.a.Companion.getClass();
        Intrinsics.checkNotNullParameter(bottomExpandableDialogEmbeddedControllerExtension, "bottomExpandableDialogEmbeddedControllerExtension");
        vc.s.k(bottomExpandableDialogEmbeddedControllerExtension);
        return bottomExpandableDialogEmbeddedControllerExtension;
    }

    private final Object c() {
        ine.o oVar = (ine.o) this.f159694b;
        int i = this.f159695c;
        if (i == 0) {
            return new com.revolut.feature.tax_residency.impl.flows.tin.a(((ine.m) this.d).f162872a);
        }
        if (i != 1) {
            throw new AssertionError(i);
        }
        n8b.b bVarB = oVar.d.b();
        vc.s.j(bVarB);
        fk3.a aVarA = oVar.f162884j.a();
        vc.s.j(aVarA);
        return new moe.f(bVarB, aVarA);
    }

    private final Object d() {
        ine.n nVar = (ine.n) this.d;
        ine.o oVar = (ine.o) this.f159694b;
        int i = this.f159695c;
        if (i == 0) {
            return new com.revolut.feature.tax_residency.impl.flows.list.b(nVar.f162875a, (ihm.k) nVar.d.get(), (ihm.k) nVar.e.get());
        }
        if (i == 1) {
            aoe.b.Companion.getClass();
            v60.i iVar = new v60.i();
            Intrinsics.checkNotNullExpressionValue(iVar, "create(...)");
            return iVar;
        }
        if (i == 2) {
            aoe.b.Companion.getClass();
            v60.i iVar2 = new v60.i();
            Intrinsics.checkNotNullExpressionValue(iVar2, "create(...)");
            return iVar2;
        }
        if (i != 3) {
            throw new AssertionError(i);
        }
        n8b.b bVarB = oVar.d.b();
        vc.s.j(bVarB);
        fk3.a aVarA = oVar.f162884j.a();
        vc.s.j(aVarA);
        return new moe.f(bVarB, aVarA);
    }

    private final Object e() {
        ine.r rVar = (ine.r) this.d;
        int i = this.f159695c;
        if (i == 0) {
            return new com.revolut.feature.tax_residency.impl.ui.sole.b(rVar.f162898a, new fpe.k((f01.a) rVar.f162900c.get()), (tme.b) ((ine.o) this.f159694b).f162891s.get());
        }
        if (i != 1) {
            throw new AssertionError(i);
        }
        ViewController viewController = rVar.f162899b;
        gpe.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(viewController, "viewController");
        return new f01.c(viewController.m2());
    }

    private final Object f() {
        ine.s sVar = (ine.s) this.d;
        TinInputScreenContract$InputData tinInputScreenContract$InputData = sVar.f162901a;
        int i = this.f159695c;
        if (i == 0) {
            return new com.revolut.feature.tax_residency.impl.v2.ui.tin_input.a(tinInputScreenContract$InputData, new jpe.d((joe.b) ((ine.p) this.f159694b).f162893b.f162888p.get()), (zzl.b) sVar.f162902b.get(), new ype.n(tinInputScreenContract$InputData));
        }
        if (i != 1) {
            throw new AssertionError(i);
        }
        zpe.b.Companion.getClass();
        return new zzl.c();
    }

    private final Object g() {
        ine.o oVar = (ine.o) this.f159694b;
        ine.v vVar = (ine.v) this.d;
        int i = this.f159695c;
        if (i == 0) {
            return new noe.k((jki.p) vVar.f162912c.get(), vVar.f162911b, (yme.a) oVar.f162889q.get(), oVar.f.e());
        }
        if (i == 1) {
            return new noe.l();
        }
        throw new AssertionError(i);
    }

    private final Object h() {
        ine.o oVar = (ine.o) this.f159694b;
        ine.v vVar = (ine.v) this.d;
        int i = this.f159695c;
        if (i == 0) {
            return new noe.k((jki.p) vVar.f162912c.get(), vVar.f162911b, (yme.a) oVar.f162889q.get(), oVar.f.e());
        }
        if (i == 1) {
            return new noe.l();
        }
        throw new AssertionError(i);
    }

    private final Object i() {
        ine.o oVar = (ine.o) this.f159694b;
        ine.x xVar = (ine.x) this.d;
        int i = this.f159695c;
        switch (i) {
            case 0:
                return kxa.j.s((j60.a) xVar.e.get());
            case 1:
                return kxa.j.q((com.revolut.kompot.navigable.a) xVar.f162918c.get(), (rp0.m) xVar.d.get(), new j60.e());
            case 2:
                return new rp0.m();
            case 3:
                TaxNumberInputScreenContract$InputData taxNumberInputScreenContract$InputData = xVar.f162917b;
                yme.a aVar = (yme.a) oVar.f162889q.get();
                tme.b bVar = (tme.b) oVar.f162891s.get();
                mre.c cVarB = oVar.i.b();
                vc.s.j(cVarB);
                j60.a aVar2 = (j60.a) xVar.f162919g.get();
                zzl.b bVar2 = (zzl.b) xVar.f162920h.get();
                gte.a aVarB = oVar.e.b();
                vc.s.j(aVarB);
                return new com.revolut.feature.tax_residency.impl.screens.tin.c(taxNumberInputScreenContract$InputData, aVar, bVar, cVarB, aVar2, bVar2, aVarB, (e0m.f) xVar.i.get(), (jki.p) xVar.f162921j.get());
            case 4:
                j60.a bottomExpandableDialog = (j60.a) xVar.e.get();
                soe.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(bottomExpandableDialog, "bottomExpandableDialog");
                vc.s.k(bottomExpandableDialog);
                return bottomExpandableDialog;
            case 5:
                soe.b.Companion.getClass();
                return new zzl.c();
            case 6:
                zzl.b regexMatcher = (zzl.b) xVar.f162920h.get();
                soe.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(regexMatcher, "regexMatcher");
                return new e0m.f(regexMatcher);
            case 7:
                return new com.revolut.feature.tax_residency.impl.screens.tin.d(xVar.f162917b);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object j() {
        ine.o oVar = (ine.o) this.f159694b;
        ine.x xVar = (ine.x) this.d;
        int i = this.f159695c;
        switch (i) {
            case 0:
                return kxa.j.s((j60.a) xVar.e.get());
            case 1:
                return kxa.j.q((com.revolut.kompot.navigable.a) xVar.f162918c.get(), (rp0.m) xVar.d.get(), new j60.e());
            case 2:
                return new rp0.m();
            case 3:
                TaxNumberInputScreenContract$InputData taxNumberInputScreenContract$InputData = xVar.f162917b;
                yme.a aVar = (yme.a) oVar.f162889q.get();
                tme.b bVar = (tme.b) oVar.f162891s.get();
                mre.c cVarB = oVar.i.b();
                vc.s.j(cVarB);
                j60.a aVar2 = (j60.a) xVar.f162919g.get();
                zzl.b bVar2 = (zzl.b) xVar.f162920h.get();
                gte.a aVarB = oVar.e.b();
                vc.s.j(aVarB);
                return new com.revolut.feature.tax_residency.impl.screens.tin.c(taxNumberInputScreenContract$InputData, aVar, bVar, cVarB, aVar2, bVar2, aVarB, (e0m.f) xVar.i.get(), (jki.p) xVar.f162921j.get());
            case 4:
                j60.a bottomExpandableDialog = (j60.a) xVar.e.get();
                soe.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(bottomExpandableDialog, "bottomExpandableDialog");
                vc.s.k(bottomExpandableDialog);
                return bottomExpandableDialog;
            case 5:
                soe.b.Companion.getClass();
                return new zzl.c();
            case 6:
                zzl.b regexMatcher = (zzl.b) xVar.f162920h.get();
                soe.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(regexMatcher, "regexMatcher");
                return new e0m.f(regexMatcher);
            case 7:
                return new com.revolut.feature.tax_residency.impl.screens.tin.d(xVar.f162917b);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object k() {
        ine.o oVar = (ine.o) this.f159694b;
        ine.x xVar = (ine.x) this.d;
        int i = this.f159695c;
        switch (i) {
            case 0:
                return kxa.j.s((j60.a) xVar.e.get());
            case 1:
                return kxa.j.q((com.revolut.kompot.navigable.a) xVar.f162918c.get(), (rp0.m) xVar.d.get(), new j60.e());
            case 2:
                return new rp0.m();
            case 3:
                TaxNumberInputScreenContract$InputData taxNumberInputScreenContract$InputData = xVar.f162917b;
                yme.a aVar = (yme.a) oVar.f162889q.get();
                tme.b bVar = (tme.b) oVar.f162891s.get();
                mre.c cVarB = oVar.i.b();
                vc.s.j(cVarB);
                j60.a aVar2 = (j60.a) xVar.f162919g.get();
                zzl.b bVar2 = (zzl.b) xVar.f162920h.get();
                gte.a aVarB = oVar.e.b();
                vc.s.j(aVarB);
                return new com.revolut.feature.tax_residency.impl.screens.tin.c(taxNumberInputScreenContract$InputData, aVar, bVar, cVarB, aVar2, bVar2, aVarB, (e0m.f) xVar.i.get(), (jki.p) xVar.f162921j.get());
            case 4:
                j60.a bottomExpandableDialog = (j60.a) xVar.e.get();
                soe.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(bottomExpandableDialog, "bottomExpandableDialog");
                vc.s.k(bottomExpandableDialog);
                return bottomExpandableDialog;
            case 5:
                soe.b.Companion.getClass();
                return new zzl.c();
            case 6:
                zzl.b regexMatcher = (zzl.b) xVar.f162920h.get();
                soe.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(regexMatcher, "regexMatcher");
                return new e0m.f(regexMatcher);
            case 7:
                return new com.revolut.feature.tax_residency.impl.screens.tin.d(xVar.f162917b);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object l() {
        ine.y yVar = (ine.y) this.d;
        int i = this.f159695c;
        if (i == 0) {
            return new com.revolut.feature.tax_residency.impl.v2.ui.list.a(new upe.r(), yVar.f162922a, new jpe.d((joe.b) ((ine.g) this.f159694b).f162853b.f162888p.get()), new upe.t(), (l0) yVar.f162924c.get(), new lpe.e());
        }
        if (i != 1) {
            throw new AssertionError(i);
        }
        com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) yVar.f162923b.get();
        vpe.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(controller, "controller");
        return new l0(controller.m2());
    }

    private final Object m() {
        iw2.b bVar = (iw2.b) this.f159694b;
        iw2.a aVar = (iw2.a) this.d;
        int i = this.f159695c;
        switch (i) {
            case 0:
                return new iri.g((iri.j) bVar.f168927p.get(), (iri.m) bVar.f168928q.get(), bq.i.f(aVar.f168901a), bq.i.l(aVar.f168901a));
            case 1:
                return new iri.l((iri.m) bVar.f168928q.get(), bq.i.f(aVar.f168901a), (iri.d) aVar.d.get());
            case 2:
                return new iri.d(bq.i.f(aVar.f168901a));
            case 3:
                return new tpi.i((rpi.c) aVar.f.get(), gsi.c.a(aVar.f168901a));
            case 4:
                return new rpi.b(bq.i.b(aVar.f168901a));
            case 5:
                return new rpi.h(bq.i.b(aVar.f168901a));
            case 6:
                Context contextI = bq.i.i(aVar.f168901a);
                BaseDelegatesActivity baseDelegatesActivityF = bq.i.f(aVar.f168901a);
                t70.g gVarO = bVar.f168919b.o();
                vc.s.j(gVarO);
                return new npi.c(contextI, baseDelegatesActivityF, gVarO);
            case 7:
                Activity activity = bq.i.b(aVar.f168901a);
                zri.a screensRepository = (zri.a) aVar.f168906j.get();
                th0.a aVar2 = bVar.f168920c;
                li0.c tapAndPayClientFactory = new li0.c();
                a73.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(activity, "activity");
                Intrinsics.checkNotNullParameter(screensRepository, "screensRepository");
                Intrinsics.checkNotNullParameter(tapAndPayClientFactory, "tapAndPayClientFactory");
                return new z63.d(activity, screensRepository, tapAndPayClientFactory);
            case 8:
                a73.a.Companion.getClass();
                return zri.a.f324739a;
            case 9:
                aVar.getClass();
                return new cn.d(ImmutableSet.copyOf((Collection) dn.b.a()), (cn.e) bVar.f168929r.get(), bVar.b());
            case 10:
                um.c cVar = (um.c) bVar.f168930s.get();
                aVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(5);
                iw2.b bVar2 = aVar.f168902b;
                hn.h hVar = (hn.h) bVar2.f168931t.get();
                t70.g gVarO2 = bVar2.f168919b.o();
                vc.s.j(gVarO2);
                builderBuilderWithExpectedSize.add(new jn.a(hVar, gVarO2));
                builderBuilderWithExpectedSize.add(new vm.b(com.google.android.gms.internal.mlkit_vision_face.a.f()));
                builderBuilderWithExpectedSize.add(bVar2.c());
                builderBuilderWithExpectedSize.addAll((Iterable) in.g.a());
                builderBuilderWithExpectedSize.add(new jn.d(e4m.b.a(aVar.f168908m)));
                return new in.e(cVar, builderBuilderWithExpectedSize.build(), bVar.b());
            case 11:
                return bq.i.t(aVar.f168901a);
            case 12:
                aVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize2 = ImmutableSet.builderWithExpectedSize(3);
                builderBuilderWithExpectedSize2.addAll((Iterable) kn.g.a());
                builderBuilderWithExpectedSize2.add(aVar.o.get());
                builderBuilderWithExpectedSize2.add(new kn.h(e4m.b.a(aVar.f168904g)));
                return new kn.e(builderBuilderWithExpectedSize2.build(), (ym.d) bVar.v.get(), bVar.b());
            case 13:
                return new zm.a();
            case 14:
                aVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize3 = ImmutableSet.builderWithExpectedSize(2);
                builderBuilderWithExpectedSize3.addAll((Iterable) hn.g.a());
                builderBuilderWithExpectedSize3.add(aVar.f168902b.c());
                return new hn.d(builderBuilderWithExpectedSize3.build(), (hn.h) bVar.f168931t.get(), (npi.f) aVar.i.get());
            case 15:
                return new en.c(ImmutableSet.of((ln.d) aVar.f168902b.u.get()), bq.i.l(aVar.f168901a));
            case 16:
                return new gn.c((lpi.e) aVar.f168913s.get(), (sm.e) bVar.f168934y.get(), ImmutableSet.copyOf((Collection) gn.e.a()), bVar.b());
            case 17:
                return new lpi.b(bq.i.i(aVar.f168901a), bq.i.j(aVar.f168901a));
            case 18:
                aVar.getClass();
                return new in.e(ImmutableSet.copyOf((Collection) pm.b.a()), (om.c) bVar.z.get(), bVar.b());
            case 19:
                aVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize4 = ImmutableSet.builderWithExpectedSize(2);
                builderBuilderWithExpectedSize4.addAll((Iterable) g3l.f.a());
                builderBuilderWithExpectedSize4.add(aVar.f168902b.a());
                return new g3l.c(builderBuilderWithExpectedSize4.build(), (g3l.g) bVar.f168933x.get(), (k3l.b) aVar.v.get(), bVar.b());
            case 20:
                return new k3l.d(bq.i.b(aVar.f168901a));
            case 21:
                return kpi.f.a();
            case 22:
                ew2.k kVar = (ew2.k) bVar.A.get();
                e4m.e eVar = aVar.k;
                iw2.b bVar3 = aVar.f168902b;
                xoi.d dVar = aVar.f168901a;
                z63.p pVar = (z63.p) eVar.get();
                k3l.b bVar4 = (k3l.b) aVar.v.get();
                wsg.n nVarB = bVar3.f168923j.b();
                ang.f fVarE = bVar3.f.e();
                f9b.f fVar = (f9b.f) aVar.f168908m.get();
                wg1.b bVarB = bVar3.k.f138522a.b();
                vc.s.j(bVarB);
                li0.a aVar3 = new li0.a();
                li0.d dVar2 = new li0.d();
                sri.m mVarL = bq.i.l(dVar);
                gte.a aVarB = bVar3.f168924l.b();
                vc.s.j(aVarB);
                z63.k kVar2 = new z63.k(pVar, bVar4, nVarB, fVarE, fVar, bVarB, aVar3, dVar2, mVarL, aVarB);
                tpi.j jVar = (tpi.j) aVar.f168904g.get();
                f9b.f fVar2 = (f9b.f) aVar.f168908m.get();
                z63.p pVar2 = (z63.p) aVar.k.get();
                tri.c cVarE = bq.i.e(dVar);
                mm.d dVar3 = (mm.d) bVar.f168932w.get();
                gte.a aVarB2 = bVar.f168924l.b();
                vc.s.j(aVarB2);
                da3.j jVar2 = bVar3.d;
                l93.f fVarJ = jVar2.j();
                vc.s.j(fVarJ);
                ha3.f fVarD = jVar2.d();
                vc.s.j(fVarD);
                return new ew2.u(kVar, kVar2, jVar, fVar2, pVar2, cVarE, dVar3, aVarB2, new ja3.f(bq.i.i(dVar), gmf.b.h(dVar), fVarD, fVarJ, bq.i.j(dVar)), bq.i.d(dVar), bVar.f168925m, bq.i.l(dVar), (kpi.c) aVar.f168916x.get());
            default:
                throw new AssertionError(i);
        }
    }

    @Override // phm.a
    public final Object get() {
        Object bVar;
        Object aVar;
        Object cVar;
        switch (this.f159693a) {
            case 0:
                o oVar = (o) this.f159694b;
                m mVar = (m) this.d;
                int i = this.f159695c;
                if (i != 0) {
                    if (i == 1) {
                        return new aae.i();
                    }
                    throw new AssertionError(i);
                }
                cli.n nVar = (cli.n) mVar.f159697b.get();
                EditSubscriptionEndDateControllerContract$InputData editSubscriptionEndDateControllerContract$InputData = mVar.f159696a;
                l80.e eVarH = oVar.e.h();
                vc.s.j(eVarH);
                xua.a aVarA = oVar.f159703b.a();
                vc.s.j(aVarA);
                return new aae.h(nVar, editSubscriptionEndDateControllerContract$InputData, eVarH, aVarA);
            case 1:
                n nVar2 = (n) this.d;
                int i2 = this.f159695c;
                if (i2 != 0) {
                    if (i2 == 1) {
                        return new y9e.h();
                    }
                    throw new AssertionError(i2);
                }
                cli.n nVar3 = (cli.n) nVar2.f159700b.get();
                EditSubscriptionFrequencyControllerContract$InputData editSubscriptionFrequencyControllerContract$InputData = nVar2.f159699a;
                xua.a aVarA2 = ((o) this.f159694b).f159703b.a();
                vc.s.j(aVarA2);
                return new y9e.g(nVar3, editSubscriptionFrequencyControllerContract$InputData, aVarA2);
            case 2:
                q qVar = (q) this.d;
                o oVar2 = (o) this.f159694b;
                int i3 = this.f159695c;
                switch (i3) {
                    case 0:
                        return kxa.j.k((j60.a) qVar.f.get());
                    case 1:
                        return ehe.n.s((com.revolut.kompot.navigable.a) qVar.d.get(), (rp0.m) qVar.e.get());
                    case 2:
                        return new rp0.m();
                    case 3:
                        e4m.e eVar = qVar.f159726h;
                        o oVar3 = qVar.f159724c;
                        cli.n nVar4 = (cli.n) eVar.get();
                        SubscriptionDetailsControllerContract$InputData subscriptionDetailsControllerContract$InputData = qVar.f159722a;
                        ImmutableMap.Builder builderBuilderWithExpectedSize = ImmutableMap.builderWithExpectedSize(23);
                        builderBuilderWithExpectedSize.put("BASIC", qVar.i.get());
                        builderBuilderWithExpectedSize.put("DIRECT_DEBIT", qVar.f159727j.get());
                        builderBuilderWithExpectedSize.put("WALLET", qVar.k.get());
                        builderBuilderWithExpectedSize.put("INTERNAL_TRANSFER", qVar.f159728l.get());
                        builderBuilderWithExpectedSize.put("JUNIOR_ALLOWANCE", qVar.f159729m.get());
                        builderBuilderWithExpectedSize.put("BANK_TRANSFER", qVar.o.get());
                        builderBuilderWithExpectedSize.put("CARD_MANDATE", qVar.f159731p.get());
                        builderBuilderWithExpectedSize.put("MOBILE_PLAN_SUBSCRIPTION", qVar.f159732q.get());
                        builderBuilderWithExpectedSize.put("SAVINGS_VAULTS", qVar.f159734s.get());
                        builderBuilderWithExpectedSize.put("CREDIT_SCHEDULED_PAYMENTS", qVar.f159735t.get());
                        builderBuilderWithExpectedSize.put("BILL_ACCOUNTS", qVar.u.get());
                        builderBuilderWithExpectedSize.put("PAID_PLAN", qVar.v.get());
                        builderBuilderWithExpectedSize.put("REFUND", qVar.f159736w.get());
                        builderBuilderWithExpectedSize.put("BILL", qVar.f159737x.get());
                        builderBuilderWithExpectedSize.put("BILL_BOLETO", qVar.f159738y.get());
                        builderBuilderWithExpectedSize.put("QR_CODE", qVar.z.get());
                        builderBuilderWithExpectedSize.put("BILLS_AND_TAXES", qVar.A.get());
                        builderBuilderWithExpectedSize.put("PIX_MANDATE", qVar.B.get());
                        builderBuilderWithExpectedSize.put("UPI", qVar.C.get());
                        builderBuilderWithExpectedSize.put("UPI_MANDATE", qVar.D.get());
                        builderBuilderWithExpectedSize.put("GIRO_DIRECT_DEBIT", qVar.E.get());
                        builderBuilderWithExpectedSize.put("MASAV_DIRECT_DEBIT", qVar.F.get());
                        builderBuilderWithExpectedSize.put("PAYTO_MANDATE", qVar.G.get());
                        ImmutableMap immutableMapBuild = builderBuilderWithExpectedSize.build();
                        uc.d dVarA = oVar3.A.a();
                        com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) oVar3.B).c();
                        vc.s.j(aVarC);
                        nhf.a aVarA3 = oVar3.o.a();
                        vc.s.j(aVarA3);
                        o71.a aVarA4 = ((c21.b) oVar3.C).a();
                        s71.c cVar2 = new s71.c();
                        c cVar3 = (c) oVar3.f159704c.f303681y.get();
                        vc.s.j(cVar3);
                        gce.m mVar2 = new gce.m(dVarA, aVarC, aVarA3, aVarA4, cVar2, new o7.d(cVar3), oVar3.D.c(), ((rb8.a) oVar3.u).a());
                        xua.a recurringPaymentInteractor = oVar3.f159703b.a();
                        vc.s.j(recurringPaymentInteractor);
                        ryc.a pixAuthorisationRequestInteractor = oVar3.f159717x.c();
                        vz1.g apmPaymentsAuthorisationsRepository = ((lz1.m) oVar3.f159718y).h();
                        vc.s.j(apmPaymentsAuthorisationsRepository);
                        sb8.a juniorAllowanceShotDialogDispatcher = (sb8.a) ((rb8.a) oVar3.u).f252984q.get();
                        vc.s.j(juniorAllowanceShotDialogDispatcher);
                        Intrinsics.checkNotNullParameter(recurringPaymentInteractor, "recurringPaymentInteractor");
                        Intrinsics.checkNotNullParameter(pixAuthorisationRequestInteractor, "pixAuthorisationRequestInteractor");
                        Intrinsics.checkNotNullParameter(apmPaymentsAuthorisationsRepository, "apmPaymentsAuthorisationsRepository");
                        Intrinsics.checkNotNullParameter(juniorAllowanceShotDialogDispatcher, "juniorAllowanceShotDialogDispatcher");
                        twg.c cVar4 = new twg.c();
                        cVar4.f275017a = recurringPaymentInteractor;
                        cVar4.f275018b = pixAuthorisationRequestInteractor;
                        cVar4.f275019c = apmPaymentsAuthorisationsRepository;
                        cVar4.d = juniorAllowanceShotDialogDispatcher;
                        l70.e eVar2 = oVar2.e;
                        fpg.c cVar5 = oVar2.f159709m;
                        c70.a aVarZ = eVar2.z();
                        vc.s.j(aVarZ);
                        wli.x xVarD = ((s41.a) oVar2.E).d();
                        z8e.a aVarD = oVar2.f159704c.d();
                        vc.s.j(aVarD);
                        mde.e eVarE = oVar2.f159707j.e();
                        k1a.g gVarA = ((j1a.i) oVar2.f159714s).a();
                        vz1.g gVarH = ((lz1.m) oVar2.z.f213961c).h();
                        vc.s.j(gVarH);
                        ob2.h hVar = new ob2.h(gVarH, new qb2.e());
                        j60.a aVar2 = (j60.a) qVar.f.get();
                        f01.a aVar3 = (f01.a) qVar.f159733r.get();
                        t70.b bVarG = oVar2.e.g();
                        vc.s.j(bVarG);
                        r0 r0VarC = oVar2.D.c();
                        d3j.b bVarE = ((b3j.p) oVar2.v).e();
                        cl3.a aVarD2 = oVar2.f159715t.d();
                        vc.s.j(aVarD2);
                        ppg.b bVarB = ((wpg.l) cVar5).b();
                        vc.s.j(bVarB);
                        kpg.a aVar4 = (kpg.a) ((wpg.l) cVar5).I.get();
                        vc.s.j(aVar4);
                        xua.a aVarA5 = oVar3.f159703b.a();
                        vc.s.j(aVarA5);
                        ppg.b bVarB2 = ((wpg.l) oVar3.f159709m).b();
                        vc.s.j(bVarB2);
                        a9e.h hVar2 = (a9e.h) qVar.H.get();
                        nhf.a aVarA6 = oVar3.o.a();
                        vc.s.j(aVarA6);
                        oce.h hVar3 = new oce.h(aVarA5, bVarB2, hVar2, aVarA6);
                        ur2.c cVarA = oVar2.f159706h.a();
                        vc.s.j(cVarA);
                        v8i.c cVar6 = new v8i.c();
                        co9.b bVarB3 = oVar2.F.b();
                        vc.s.j(bVarB3);
                        vz1.g gVarH2 = ((lz1.m) oVar2.f159718y).h();
                        vc.s.j(gVarH2);
                        return new com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c(nVar4, subscriptionDetailsControllerContract$InputData, immutableMapBuild, mVar2, cVar4, aVarZ, xVarD, aVarD, eVarE, gVarA, hVar, aVar2, aVar3, bVarG, r0VarC, bVarE, aVarD2, bVarB, aVar4, hVar3, cVarA, cVar6, bVarB3, gVarH2);
                    case 4:
                        return new y0();
                    case 5:
                        a9e.b bVar2 = (a9e.b) oVar2.H.get();
                        l80.e eVarH2 = oVar2.e.h();
                        vc.s.j(eVarH2);
                        return new cbe.b(bVar2, eVarH2);
                    case 6:
                        a9e.b bVar3 = (a9e.b) oVar2.H.get();
                        abe.b bVarQ = qVar.q();
                        l80.e eVarH3 = oVar2.e.h();
                        vc.s.j(eVarH3);
                        return new lbe.b(bVar3, bVarQ, eVarH3, qVar.c(), qVar.j());
                    case 7:
                        a9e.b bVar4 = (a9e.b) oVar2.H.get();
                        l80.e eVarH4 = oVar2.e.h();
                        vc.s.j(eVarH4);
                        a9e.c cVar7 = (a9e.c) oVar2.f159704c.A.get();
                        vc.s.j(cVar7);
                        return new zbe.b(bVar4, eVarH4, cVar7, new mae.e(), new ugc.a((a9e.b) qVar.f159724c.H.get(), new mae.e()));
                    case 8:
                        a9e.b bVar5 = (a9e.b) oVar2.H.get();
                        l80.e eVarH5 = oVar2.e.h();
                        vc.s.j(eVarH5);
                        o oVar4 = qVar.f159724c;
                        e4m.e eVar3 = oVar4.H;
                        vl3.n nVar5 = oVar4.f159715t;
                        a9e.b bVar6 = (a9e.b) eVar3.get();
                        l80.e eVarH6 = oVar4.e.h();
                        vc.s.j(eVarH6);
                        dl3.f fVarC = nVar5.c();
                        vc.s.j(fVarC);
                        cl3.a aVarD3 = nVar5.d();
                        vc.s.j(aVarD3);
                        bVar = new obe.b(bVar5, eVarH5, new obe.d(bVar6, eVarH6, fVarC, aVarD3, new obe.c()));
                        return bVar;
                    case 9:
                        l80.e eVarH7 = oVar2.e.h();
                        vc.s.j(eVarH7);
                        a9e.b bVar7 = (a9e.b) oVar2.H.get();
                        vb8.b bVar8 = new vb8.b();
                        hj8.a aVarA7 = oVar2.f159710n.a();
                        vc.s.j(aVarA7);
                        aVar = new pbe.a(eVarH7, bVar7, bVar8, aVarA7, qVar.f159723b);
                        return aVar;
                    case 10:
                        a9e.b bVar9 = (a9e.b) oVar2.H.get();
                        abe.b bVarQ2 = qVar.q();
                        l80.e eVarH8 = oVar2.e.h();
                        vc.s.j(eVarH8);
                        bVar = new bbe.c(bVar9, bVarQ2, eVarH8, (a9e.i) qVar.f159730n.get(), b3j.p.d(), qVar.c(), qVar.j());
                        return bVar;
                    case 11:
                        mae.p factory = oVar2.f159704c.e();
                        vc.s.j(factory);
                        t70.g localization = oVar2.e.o();
                        vc.s.j(localization);
                        ece.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(factory, "factory");
                        Intrinsics.checkNotNullParameter(localization, "localization");
                        Intrinsics.checkNotNullParameter(localization, "localization");
                        return new mae.u(localization);
                    case 12:
                        a9e.b bVar10 = (a9e.b) oVar2.H.get();
                        l93.f fVarJ = oVar2.f.j();
                        vc.s.j(fVarJ);
                        l80.e eVarH9 = oVar2.e.h();
                        vc.s.j(eVarH9);
                        ur2.c cVarA2 = oVar2.f159706h.a();
                        vc.s.j(cVarA2);
                        gte.a aVarB = oVar2.f159702a.b();
                        vc.s.j(aVarB);
                        hj8.a aVarA8 = oVar2.f159710n.a();
                        vc.s.j(aVarA8);
                        aVar = new ibe.c(bVar10, fVarJ, eVarH9, cVarA2, aVarB, aVarA8, oVar2.f159711p.b(), qVar.c(), qVar.j());
                        return aVar;
                    case 13:
                        a9e.b bVar11 = (a9e.b) oVar2.H.get();
                        l80.e eVarH10 = oVar2.e.h();
                        vc.s.j(eVarH10);
                        return new mbe.b(bVar11, eVarH10);
                    case 14:
                        x9e.a aVar5 = oVar2.f159704c;
                        l70.e eVar4 = oVar2.e;
                        mae.h hVarA = aVar5.a();
                        vc.s.j(hVarA);
                        a9e.b bVar12 = (a9e.b) oVar2.H.get();
                        l80.e eVarH11 = eVar4.h();
                        vc.s.j(eVarH11);
                        f01.a aVar6 = (f01.a) qVar.f159733r.get();
                        t70.b bVarG2 = eVar4.g();
                        vc.s.j(bVarG2);
                        bVar = new wbe.c(hVarA, bVar12, eVarH11, aVar6, bVarG2);
                        return bVar;
                    case 15:
                        com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) qVar.d.get();
                        ece.e.Companion.getClass();
                        Intrinsics.checkNotNullParameter(controller, "controller");
                        cVar = new f01.c(controller.m2());
                        return cVar;
                    case 16:
                        a9e.b bVar13 = (a9e.b) oVar2.H.get();
                        mae.h hVarA2 = oVar2.f159704c.a();
                        vc.s.j(hVarA2);
                        l80.e eVarH12 = oVar2.e.h();
                        vc.s.j(eVarH12);
                        return new kbe.d(bVar13, hVarA2, eVarH12);
                    case 17:
                        a9e.b bVar14 = (a9e.b) oVar2.H.get();
                        l80.e eVarH13 = oVar2.e.h();
                        vc.s.j(eVarH13);
                        return new hbe.c(bVar14, eVarH13);
                    case 18:
                        a9e.b bVar15 = (a9e.b) oVar2.H.get();
                        l80.e eVarH14 = oVar2.e.h();
                        vc.s.j(eVarH14);
                        egk.e eVarE2 = oVar2.f159716w.e();
                        vc.s.j(eVarE2);
                        return new tbe.a(bVar15, eVarH14, eVarE2, new mae.c());
                    case 19:
                        a9e.b bVar16 = (a9e.b) oVar2.H.get();
                        thf.c cVarC = oVar2.f159708l.c();
                        vc.s.j(cVarC);
                        return new vbe.b(bVar16, cVarC, oVar2.d.g());
                    case 20:
                        a9e.b bVar17 = (a9e.b) oVar2.H.get();
                        l80.e eVarH15 = oVar2.e.h();
                        vc.s.j(eVarH15);
                        bVar = new dbe.b(bVar17, eVarH15, qVar.b());
                        return bVar;
                    case 21:
                        a9e.b bVar18 = (a9e.b) oVar2.H.get();
                        l80.e eVarH16 = oVar2.e.h();
                        vc.s.j(eVarH16);
                        return new fbe.c(bVar18, eVarH16);
                    case 22:
                        e4m.e eVar5 = oVar2.H;
                        p8a.c cVar8 = oVar2.f159717x;
                        a9e.b bVar19 = (a9e.b) eVar5.get();
                        abe.b bVarQ3 = qVar.q();
                        l80.e eVarH17 = oVar2.e.h();
                        vc.s.j(eVarH17);
                        s8a.l lVarE = cVar8.e();
                        i8a.c cVar9 = (i8a.c) cVar8.B.get();
                        vc.s.j(cVar9);
                        return new ube.d(bVar19, bVarQ3, eVarH17, lVarE, cVar9);
                    case 23:
                        a9e.b bVar20 = (a9e.b) oVar2.H.get();
                        l80.e eVarH18 = oVar2.e.h();
                        vc.s.j(eVarH18);
                        bVar = new ebe.a(bVar20, eVarH18, qVar.b());
                        return bVar;
                    case 24:
                        a9e.b bVar21 = (a9e.b) oVar2.H.get();
                        abe.b bVarQ4 = qVar.q();
                        s8a.f fVarD = oVar2.f159717x.d();
                        vc.s.j(fVarD);
                        l80.e eVarH19 = oVar2.e.h();
                        vc.s.j(eVarH19);
                        bVar = new sbe.b(bVar21, bVarQ4, fVarD, eVarH19);
                        return bVar;
                    case 25:
                        a9e.b bVar22 = (a9e.b) oVar2.H.get();
                        abe.b bVarQ5 = qVar.q();
                        a9e.i iVar = (a9e.i) qVar.f159730n.get();
                        l80.e eVarH20 = oVar2.e.h();
                        vc.s.j(eVarH20);
                        bVar = new xbe.b(bVar22, bVarQ5, iVar, eVarH20);
                        return bVar;
                    case 26:
                        a9e.b bVar23 = (a9e.b) oVar2.H.get();
                        vz1.g gVarH3 = ((lz1.m) oVar2.f159718y).h();
                        vc.s.j(gVarH3);
                        return new ybe.d(bVar23, gVarH3, oVar2.z.b());
                    case 27:
                        vz1.g gVarH4 = ((lz1.m) oVar2.f159718y).h();
                        vc.s.j(gVarH4);
                        a9e.b bVar24 = (a9e.b) oVar2.H.get();
                        l80.e eVarH21 = oVar2.e.h();
                        vc.s.j(eVarH21);
                        return new nbe.d(gVarH4, bVar24, eVarH21);
                    case 28:
                        vz1.g gVarH5 = ((lz1.m) oVar2.f159718y).h();
                        vc.s.j(gVarH5);
                        a9e.b bVar25 = (a9e.b) oVar2.H.get();
                        l80.e eVarH22 = oVar2.e.h();
                        vc.s.j(eVarH22);
                        return new qbe.d(gVarH5, bVar25, eVarH22);
                    case 29:
                        a9e.b bVar26 = (a9e.b) oVar2.H.get();
                        abe.b bVarQ6 = qVar.q();
                        vz1.g gVarH6 = ((lz1.m) oVar2.f159718y).h();
                        vc.s.j(gVarH6);
                        l80.e eVarH23 = oVar2.e.h();
                        vc.s.j(eVarH23);
                        cVar = new rbe.e(bVar26, bVarQ6, gVarH6, eVarH23, oVar2.z.b());
                        return cVar;
                    case 30:
                        mae.p factory2 = oVar2.f159704c.e();
                        vc.s.j(factory2);
                        f01.a uiKitResources = (f01.a) qVar.f159733r.get();
                        t70.b currenciesLocalization = oVar2.e.g();
                        vc.s.j(currenciesLocalization);
                        ece.e.Companion.getClass();
                        Intrinsics.checkNotNullParameter(factory2, "factory");
                        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
                        Intrinsics.checkNotNullParameter(currenciesLocalization, "currenciesLocalization");
                        return factory2.d(uiKitResources, currenciesLocalization);
                    default:
                        throw new AssertionError(i3);
                }
            case 3:
                if2.c cVar10 = (if2.c) this.d;
                int i5 = this.f159695c;
                if (i5 == 0) {
                    return new kg2.r((w80.b) cVar10.f160844c.get(), cVar10.f160842a, (cli.n) cVar10.d.get());
                }
                if (i5 != 1) {
                    if (i5 != 2) {
                        throw new AssertionError(i5);
                    }
                    return new kg2.q(new u80.o(), (w80.b) cVar10.f160844c.get());
                }
                qd0.b languageProvider = ((if2.f) this.f159694b).f160851a.n();
                vc.s.j(languageProvider);
                lg2.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
                return v80.b.b(languageProvider, false, false, 58);
            case 4:
                if2.d dVar = (if2.d) this.d;
                if2.f fVar = dVar.f160845a;
                if2.f fVar2 = (if2.f) this.f159694b;
                int i6 = this.f159695c;
                if (i6 != 0) {
                    if (i6 != 1) {
                        throw new AssertionError(i6);
                    }
                    whf.b bVarA = fVar2.f160857l.a();
                    vc.s.j(bVarA);
                    return new pf2.q(bVarA);
                }
                whf.b bVarA2 = fVar.f160857l.a();
                vc.s.j(bVarA2);
                hg2.h hVarC = fVar.c();
                f80.a aVarX = fVar.f160851a.x();
                vc.s.j(aVarX);
                xx9.p pVarB = fVar.f160858m.b();
                vc.s.j(pVarB);
                lal.a aVar7 = new lal.a(bVarA2, hVarC, aVarX, pVarB);
                c70.a aVarZ2 = fVar2.f160851a.z();
                vc.s.j(aVarZ2);
                e12.f fVar3 = (e12.f) dVar.f160846b.get();
                kz9.a aVarA9 = fVar2.f160859n.a();
                vc.s.j(aVarA9);
                a12.j jVarE = fVar.o.e();
                vc.s.j(jVarE);
                pf2.f fVar4 = new pf2.f();
                thf.g gVarE = fVar.f160857l.e();
                vc.s.j(gVarE);
                tn9.a aVarC2 = fVar.f160854g.c();
                vc.s.j(aVarC2);
                return new pf2.n(aVar7, aVarZ2, fVar3, aVarA9, new pf2.p(jVarE, fVar4, gVarE, new mf2.b(aVarC2)));
            case 5:
                if2.e eVar6 = (if2.e) this.d;
                UpiConfirmationScreenContract$InputData upiConfirmationScreenContract$InputData = eVar6.f160848a;
                if2.f fVar5 = (if2.f) this.f159694b;
                int i21 = this.f159695c;
                if (i21 == 0) {
                    return new tg2.o(upiConfirmationScreenContract$InputData, ((lz1.m) fVar5.f160852b).g(), new kxk.o(upiConfirmationScreenContract$InputData, new su9.c(e4m.b.a(eVar6.f160849b), e4m.b.a(eVar6.f160850c))));
                }
                if (i21 == 1) {
                    t12.b frequencyMapper = new t12.b();
                    vg2.c commonMapper = new vg2.c();
                    Intrinsics.checkNotNullParameter(frequencyMapper, "frequencyMapper");
                    Intrinsics.checkNotNullParameter(commonMapper, "commonMapper");
                    return new vg2.f();
                }
                if (i21 != 2) {
                    throw new AssertionError(i21);
                }
                t12.b frequencyMapper2 = new t12.b();
                vg2.c commonMapper2 = new vg2.c();
                Intrinsics.checkNotNullParameter(frequencyMapper2, "frequencyMapper");
                Intrinsics.checkNotNullParameter(commonMapper2, "commonMapper");
                return new vg2.b();
            case 6:
                if2.l lVar = (if2.l) this.d;
                if2.f fVar6 = (if2.f) this.f159694b;
                pqi.a aVar8 = fVar6.k;
                l70.e eVar7 = fVar6.f160851a;
                int i22 = this.f159695c;
                if (i22 != 0) {
                    if (i22 != 1) {
                        throw new AssertionError(i22);
                    }
                    com.revolut.kompot.navigable.a controller2 = (com.revolut.kompot.navigable.a) lVar.f160883b.get();
                    ng2.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(controller2, "controller");
                    yy0.f fVarQ = jh.d.f(controller2.m2()).Q();
                    vc.s.k(fVarQ);
                    return fVarQ;
                }
                hg2.h hVarC2 = fVar6.c();
                fkg.a aVarD4 = eVar7.d();
                c70.a aVarZ3 = eVar7.z();
                vc.s.j(aVarZ3);
                tqi.g gVarE2 = aVar8.e();
                f80.a aVarX2 = eVar7.x();
                vc.s.j(aVarX2);
                return new mg2.p(hVarC2, aVarD4, aVarZ3, gVarE2, aVarX2, lVar.b(), aVar8.g(), new mg2.m(lVar.b()));
            case 7:
                if2.m mVar3 = (if2.m) this.d;
                if2.f fVar7 = mVar3.f160886b;
                if2.f fVar8 = (if2.f) this.f159694b;
                l70.e eVar8 = fVar8.f160851a;
                int i32 = this.f159695c;
                if (i32 == 0) {
                    n60.b bVar27 = (n60.b) mVar3.d.get();
                    o5k.i.m(bVar27);
                    return bVar27;
                }
                if (i32 == 1) {
                    return o5k.i.r((com.revolut.kompot.navigable.a) mVar3.f160887c.get());
                }
                if (i32 != 2) {
                    if (i32 == 3) {
                        yof.d dVar2 = (yof.d) mVar3.f160888g.get();
                        u80.o oVar5 = new u80.o();
                        w80.b bVarJ = eVar8.j();
                        vc.s.j(bVarJ);
                        l80.e eVarH24 = eVar8.h();
                        vc.s.j(eVarH24);
                        c0 c0VarF = b3j.p.f();
                        tn9.a aVarC3 = fVar8.f160854g.c();
                        vc.s.j(aVarC3);
                        return new bg2.n(dVar2, oVar5, bVarJ, eVarH24, c0VarF, aVarC3);
                    }
                    if (i32 != 4) {
                        if (i32 != 5) {
                            throw new AssertionError(i32);
                        }
                        ldd.a factory3 = new ldd.a();
                        cg2.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(factory3, "factory");
                        return new ldd.b();
                    }
                    ppf.a factory4 = fVar8.f160862r.b();
                    vc.s.j(factory4);
                    ldd.b delegate = (ldd.b) mVar3.f.get();
                    cg2.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(factory4, "factory");
                    Intrinsics.checkNotNullParameter(delegate, "delegate");
                    return ppf.a.a(delegate);
                }
                UpiTransferAmountScreenContract$InputData upiTransferAmountScreenContract$InputData = mVar3.f160885a;
                wsg.n nVarB = fVar8.i.b();
                w80.b bVarJ2 = eVar8.j();
                vc.s.j(bVarJ2);
                cli.n nVar6 = (cli.n) mVar3.f160889h.get();
                com.revolut.domain.interactors.transactions.a aVarC4 = ((bjf.a) fVar7.f160863s).c();
                vc.s.j(aVarC4);
                bf2.c cVar11 = new bf2.c((UpiService) fVar7.L.get(), ((nj0.d) fVar7.e).i);
                xua.a aVarA10 = fVar7.f160864t.a();
                vc.s.j(aVarA10);
                yw1.b bVarK = ((lz1.m) fVar7.f160852b).k();
                vc.s.j(bVarK);
                wf2.e eVar9 = new wf2.e(aVarC4, cVar11, aVarA10, bVarK, new wf2.a());
                n60.b bVar28 = (n60.b) mVar3.d.get();
                l2j.a aVar9 = new l2j.a();
                rf2.a aVar10 = new rf2.a();
                vo9.a aVarB2 = ((ut9.a) fVar8.u).b();
                vc.s.j(aVarB2);
                l80.e eVarH25 = eVar8.h();
                vc.s.j(eVarH25);
                zof.f fVarD2 = fVar7.f160862r.d();
                vc.s.j(fVarD2);
                zjh.c cVar12 = new zjh.c(fVarD2);
                k0 k0VarQ = fVar8.v.q();
                vc.s.j(k0VarQ);
                return new bg2.x(upiTransferAmountScreenContract$InputData, nVarB, bVarJ2, nVar6, eVar9, bVar28, aVar9, aVar10, aVarB2, eVarH25, cVar12, k0VarQ);
            case 8:
                if2.f fVar9 = (if2.f) this.f159694b;
                if2.n nVar7 = (if2.n) this.d;
                int i33 = this.f159695c;
                if (i33 == 0) {
                    Object extension = (jf2.a) nVar7.d.get();
                    kf2.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(extension, "extension");
                    yji.n nVar8 = (yji.n) extension;
                    vc.s.k(nVar8);
                    return nVar8;
                }
                if (i33 == 1) {
                    return new jf2.d(fVar9.b(), new UpiAliasDialogProvider());
                }
                if (i33 != 2) {
                    throw new AssertionError(i33);
                }
                UpiTransferFlowContract$InputData upiTransferFlowContract$InputData = nVar7.f160890a;
                b3a.a aVarA11 = fVar9.f160861q.a();
                vc.s.j(aVarA11);
                jf2.a aVar11 = (jf2.a) nVar7.d.get();
                wj0.a aVarI = ((nj0.d) fVar9.e).i();
                vc.s.j(aVarI);
                return new com.revolut.feature.apm.upi.impl.flow.b(upiTransferFlowContract$InputData, aVarA11, aVar11, aVarI, new ag2.a());
            case 9:
                if2.f fVar10 = (if2.f) this.f159694b;
                if2.o oVar6 = (if2.o) this.d;
                int i43 = this.f159695c;
                if (i43 == 0) {
                    return kxa.j.k((j60.a) oVar6.d.get());
                }
                if (i43 == 1) {
                    return ehe.n.s((com.revolut.kompot.navigable.a) oVar6.f160894b.get(), (rp0.m) oVar6.f160895c.get());
                }
                if (i43 == 2) {
                    return new rp0.m();
                }
                if (i43 == 3) {
                    ve2.a extension2 = (ve2.a) oVar6.f.get();
                    xg2.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(extension2, "extension");
                    vc.s.k(extension2);
                    return extension2;
                }
                if (i43 != 4) {
                    if (i43 == 5) {
                        return new wg2.h(new wg2.i(), (ve2.a) oVar6.f.get(), (ze2.a) fVar10.H.get(), (zf2.a) fVar10.K.get());
                    }
                    throw new AssertionError(i43);
                }
                kf2.c factory5 = (kf2.c) fVar10.G.get();
                xg2.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory5, "factory");
                Object obj2 = factory5.f183284a.get();
                Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                ve2.a aVar12 = (ve2.a) obj2;
                vc.s.k(aVar12);
                return aVar12;
            case 10:
                if2.f fVar11 = (if2.f) this.f159694b;
                if2.p pVar = (if2.p) this.d;
                if2.f fVar12 = pVar.f160899b;
                int i59 = this.f159695c;
                if (i59 == 0) {
                    return kxa.j.k((j60.a) pVar.e.get());
                }
                if (i59 == 1) {
                    return ehe.n.s((com.revolut.kompot.navigable.a) pVar.f160900c.get(), (rp0.m) pVar.d.get());
                }
                if (i59 == 2) {
                    return new rp0.m();
                }
                if (i59 != 3) {
                    if (i59 != 4) {
                        throw new AssertionError(i59);
                    }
                    yof.k kVarG = fVar11.f160862r.g();
                    vc.s.j(kVarG);
                    return new eg2.r(kVarG, new eg2.a());
                }
                UpiTransferReviewScreenContract$InputData inputData = pVar.f160898a;
                wsg.n walletInteractor = fVar12.i.b();
                wf2.e upiTransferInteractor = pVar.b();
                l80.e dateProvider = fVar12.f160851a.h();
                vc.s.j(dateProvider);
                Intrinsics.checkNotNullParameter(inputData, "inputData");
                Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
                Intrinsics.checkNotNullParameter(upiTransferInteractor, "upiTransferInteractor");
                Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
                twg.c cVar13 = new twg.c();
                cVar13.f275017a = inputData;
                cVar13.f275018b = walletInteractor;
                cVar13.f275019c = upiTransferInteractor;
                cVar13.d = dateProvider;
                wf2.e eVarB = pVar.b();
                zof.f fVarD3 = fVar12.f160862r.d();
                vc.s.j(fVarD3);
                zjh.c cVar14 = new zjh.c(fVarD3);
                rf2.a aVar13 = new rf2.a();
                l80.e eVarH26 = fVar11.f160851a.h();
                vc.s.j(eVarH26);
                return new eg2.u(inputData, cVar13, eVarB, cVar14, aVar13, eVarH26, (cli.n) pVar.f160901g.get());
            case 11:
                il8.k kVar = (il8.k) this.f159694b;
                int i66 = this.f159695c;
                if (i66 == 0) {
                    return new com.revolut.feature.junior_remote_login.impl.ui.flow.add_phone_number.a(((il8.c) this.d).f162140a, (pn3.a) kVar.i.get());
                }
                if (i66 != 1) {
                    throw new AssertionError(i66);
                }
                oai.a sharedDeps = kVar.e;
                nl8.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(sharedDeps, "sharedDeps");
                x7a.c cVar15 = (x7a.c) sharedDeps.f.get();
                vc.s.k(cVar15);
                return cVar15;
            case 12:
                il8.k kVar2 = (il8.k) this.f159694b;
                il8.f fVar13 = (il8.f) this.d;
                int i74 = this.f159695c;
                if (i74 == 0) {
                    return new com.revolut.feature.junior_remote_login.impl.ui.screen.contact_picker.a((cli.n) fVar13.f162151c.get(), fVar13.f162149a, (am8.a) fVar13.d.get(), (bm8.b) fVar13.e.get());
                }
                if (i74 == 1) {
                    z80.b bVarS = kVar2.f162164a.s();
                    vc.s.j(bVarS);
                    return new wl8.p(bVarS, (zl8.a) fVar13.f162150b.get());
                }
                if (i74 == 2) {
                    return new zl8.a();
                }
                if (i74 != 3) {
                    if (i74 == 4) {
                        return new bm8.b((am8.a) fVar13.d.get());
                    }
                    throw new AssertionError(i74);
                }
                cl3.a aVarD5 = kVar2.d.d();
                vc.s.j(aVarD5);
                return new am8.a(aVarD5);
            case 13:
                il8.j jVar = (il8.j) this.d;
                int i92 = this.f159695c;
                if (i92 == 0) {
                    return new cm8.k((cli.n) jVar.f162162b.get(), jVar.f162161a, ((il8.k) this.f159694b).f162166c.a());
                }
                if (i92 == 1) {
                    return new cm8.l();
                }
                throw new AssertionError(i92);
            case 14:
                return a();
            case 15:
                int i96 = this.f159695c;
                if (i96 != 0) {
                    if (i96 == 1) {
                        return new poe.k();
                    }
                    throw new AssertionError(i96);
                }
                yme.a aVar14 = (yme.a) ((ine.o) this.f159694b).f162889q.get();
                ine.h hVar4 = (ine.h) this.d;
                return new poe.j(aVar14, hVar4.f162855a, (jki.p) hVar4.f162856b.get());
            case 16:
                ine.j jVar2 = (ine.j) this.d;
                int i99 = this.f159695c;
                if (i99 == 0) {
                    return kxa.j.r((j60.a) jVar2.d.get());
                }
                if (i99 == 1) {
                    return kxa.j.p((com.revolut.kompot.navigable.a) jVar2.f162862b.get(), (rp0.m) jVar2.f162863c.get(), new j60.e());
                }
                if (i99 == 2) {
                    return new rp0.m();
                }
                if (i99 == 3) {
                    return new com.revolut.feature.tax_residency.impl.flows.submit.a(jVar2.f162861a, (yme.a) ((ine.o) this.f159694b).f162889q.get(), (j60.a) jVar2.f.get());
                }
                if (i99 != 4) {
                    throw new AssertionError(i99);
                }
                j60.a bottomExpandableDialogEmbeddedControllerExtension = (j60.a) jVar2.d.get();
                foe.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(bottomExpandableDialogEmbeddedControllerExtension, "bottomExpandableDialogEmbeddedControllerExtension");
                vc.s.k(bottomExpandableDialogEmbeddedControllerExtension);
                return bottomExpandableDialogEmbeddedControllerExtension;
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
                iwb.a aVar15 = (iwb.a) this.d;
                iwb.e eVar10 = (iwb.e) this.f159694b;
                iwb.r rVar = eVar10.f169015a;
                int i100 = this.f159695c;
                if (i100 == 0) {
                    nwb.a extension3 = (nwb.a) aVar15.f169004b.get();
                    owb.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(extension3, "extension");
                    vc.s.k(extension3);
                    return extension3;
                }
                if (i100 == 1) {
                    jwb.e eVarB2 = rVar.b();
                    vc.s.j(eVarB2);
                    sf0.h hVarB = eVar10.f169023n.b();
                    vc.s.j(hVarB);
                    v60.e eVarA = eVar10.o.a();
                    vc.s.j(eVarA);
                    return new nwb.d(eVarB2, hVarB, eVarA, new mwb.a());
                }
                if (i100 != 2) {
                    throw new AssertionError(i100);
                }
                uwb.d selectableVoucherProductsMapper = new uwb.d();
                Intrinsics.checkNotNullParameter(selectableVoucherProductsMapper, "selectableVoucherProductsMapper");
                xwb.h hVar5 = new xwb.h();
                i90.b bVar29 = new i90.b();
                RevPointsGiftcardsPurchaseController$InputData revPointsGiftcardsPurchaseController$InputData = aVar15.f169003a;
                nyb.k kVarC = eVar10.d.c();
                vc.s.j(kVarC);
                jwb.e eVarB3 = rVar.b();
                vc.s.j(eVarB3);
                return new com.revolut.feature.rev_points.giftcards.impl.ui.screen.purchase.a(hVar5, bVar29, revPointsGiftcardsPurchaseController$InputData, kVarC, eVarB3, (nwb.a) aVar15.f169004b.get(), new mwb.a());
        }
    }
}
