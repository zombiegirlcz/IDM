package bt7;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import axi.b0;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.hcaptcha.sdk.HCaptchaConfig;
import com.revolut.feature.apm.blik.impl.ui.confirmation.BlikConfirmationScreenContract$InputData;
import com.revolut.feature.apm.blik.impl.ui.settings.BlikSettingsContract$InputData;
import com.revolut.feature.card_contactless_limit.impl.ui.kompot.ResetCardScaContract$InputData;
import com.revolut.feature.card_payment_method.api.declaration.LinkCardFlowInputData;
import com.revolut.feature.card_payment_method.api.declaration.SelectPaymentMethodInputData;
import com.revolut.feature.card_payment_method.impl.flows.link_card.screens.chooser.ChooserScreenContract$InputData;
import com.revolut.feature.card_screen.api.navigation.CardSelectionNavigationData$InputData;
import com.revolut.feature.insurance_credit.impl.ui.screen.coverage_details.CoverageDetailsScreenContract$InputData;
import com.revolut.feature.insurance_credit.impl.ui.screen.details.InsuranceDetailsScreenContract$InputData;
import com.revolut.feature.pricing_plans.unlock_benefits.impl.ui.screen.unlock_benefits.UnlockBenefitsScreenContract$InputData;
import com.revolut.feature.retail.legacy.login.impl.network.AuthService;
import com.revolut.feature.select.payment.impl.ui.select_card.SelectPaymentScreenContract$InputData;
import com.revolut.feature.semi_independent_onboarding.impl.data.SemiIndependentOnboardingConfigService;
import com.revolut.feature.subscriptions.impl.subscriptiondetails.SubscriptionDetailsScreenContract$Configuration;
import com.revolut.feature.trading.impl.ui.collections.CollectionScreenContract$Input;
import com.revolut.kompot.navigable.screen.BaseScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.AirportLoungePassCheckoutScreenContract$InputData;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_details.AirportLoungePassDetailsScreenContract$InputData;
import com.revolut.retail.feature.crypto.navigation.impl.ui.screen.interceptor.CryptoNavigationInterceptorScreenContract$InputData;
import cwi.a0;
import cwi.c0;
import cwi.z;
import dec.q;
import eli.p;
import g48.r0;
import ip0.v7;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import ku1.e0;
import ku1.i0;
import ku1.j0;
import lp.l9;
import mae.u;
import mga.f0;
import om4.m4;
import qce.o0;
import qce.t0;
import qu1.r;
import rp0.g1;
import rp0.x0;
import uf7.g0;
import uo.q0;
import v3e.d0;
import vc.s;
import wli.x;
import wtc.b1;
import y99.w;
import z0h.q1;
import zab.h0;
import zab.t;
import zae.o;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f18414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18415c;
    public final Object d;

    public /* synthetic */ e(Object obj2, Object obj3, int i, int i2) {
        this.f18413a = i2;
        this.f18414b = obj2;
        this.d = obj3;
        this.f18415c = i;
    }

    private final Object a() {
        ca9.d dVar = (ca9.d) this.f18414b;
        ca9.c cVar = (ca9.c) this.d;
        int i = this.f18415c;
        switch (i) {
            case 0:
                return kpi.f.a();
            case 1:
                Context contextI = bq.i.i(cVar.f22542a);
                BaseDelegatesActivity baseDelegatesActivityF = bq.i.f(cVar.f22542a);
                t70.g gVarO = dVar.f22560b.o();
                s.j(gVarO);
                return new npi.c(contextI, baseDelegatesActivityF, gVarO);
            case 2:
                return new tpi.i((rpi.c) cVar.e.get(), gsi.c.a(cVar.f22542a));
            case 3:
                return new rpi.b(bq.i.b(cVar.f22542a));
            case 4:
                return new rpi.h(bq.i.b(cVar.f22542a));
            case 5:
                return new iri.g((iri.j) dVar.i.get(), (iri.m) dVar.f22564j.get(), bq.i.f(cVar.f22542a), bq.i.l(cVar.f22542a));
            case 6:
                return new iri.l((iri.m) dVar.f22564j.get(), bq.i.f(cVar.f22542a), (iri.d) cVar.i.get());
            case 7:
                return new iri.d(bq.i.f(cVar.f22542a));
            case 8:
                return new opi.b(bq.i.f(cVar.f22542a));
            case 9:
                cVar.getClass();
                return new xpi.c(xpi.f.d, bq.i.b(cVar.f22542a));
            case 10:
                cVar.getClass();
                return new iqi.b(iqi.g.f167870b, bq.i.b(cVar.f22542a));
            case 11:
                cVar.getClass();
                iqi.f fVar = iqi.g.Companion;
                return new iqi.d(bq.i.b(cVar.f22542a));
            case 12:
                ca9.d dVar2 = cVar.f22543b;
                return new en.c(ImmutableSet.of((ln.d) dVar2.f22565l.get(), (ln.d) dVar2.f22566m.get()), bq.i.l(cVar.f22542a));
            case 13:
                cVar.getClass();
                return new cn.d(ImmutableSet.copyOf((Collection) dn.b.a()), (cn.e) dVar.f22567n.get(), dVar.a());
            case 14:
                um.c cVar2 = (um.c) dVar.o.get();
                cVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(5);
                ca9.d dVar3 = cVar.f22543b;
                hn.h hVar = (hn.h) dVar3.f22568p.get();
                t70.g gVarO2 = dVar3.f22560b.o();
                s.j(gVarO2);
                builderBuilderWithExpectedSize.add(new jn.a(hVar, gVarO2));
                builderBuilderWithExpectedSize.add(new vm.b(com.google.android.gms.internal.mlkit_vision_face.a.f()));
                builderBuilderWithExpectedSize.add(dVar3.b());
                builderBuilderWithExpectedSize.addAll((Iterable) in.g.a());
                builderBuilderWithExpectedSize.add(new jn.d(e4m.b.a(cVar.f22552q)));
                return new in.e(cVar2, builderBuilderWithExpectedSize.build(), dVar.a());
            case 15:
                return bq.i.t(cVar.f22542a);
            case 16:
                cVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize2 = ImmutableSet.builderWithExpectedSize(3);
                builderBuilderWithExpectedSize2.addAll((Iterable) kn.g.a());
                builderBuilderWithExpectedSize2.add(cVar.f22554s.get());
                builderBuilderWithExpectedSize2.add(new kn.h(e4m.b.a(cVar.f)));
                return new kn.e(builderBuilderWithExpectedSize2.build(), (ym.d) dVar.f22569q.get(), dVar.a());
            case 17:
                return new zm.a();
            case 18:
                cVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize3 = ImmutableSet.builderWithExpectedSize(2);
                builderBuilderWithExpectedSize3.addAll((Iterable) hn.g.a());
                builderBuilderWithExpectedSize3.add(cVar.f22543b.b());
                return new hn.d(builderBuilderWithExpectedSize3.build(), (hn.h) dVar.f22568p.get(), (npi.f) cVar.d.get());
            case 19:
                return new gn.c((lpi.e) cVar.v.get(), (sm.e) dVar.f22571s.get(), ImmutableSet.copyOf((Collection) gn.e.a()), dVar.a());
            case 20:
                return new lpi.b(bq.i.i(cVar.f22542a), bq.i.j(cVar.f22542a));
            case 21:
                cVar.getClass();
                return new in.e(ImmutableSet.copyOf((Collection) pm.b.a()), (om.c) dVar.f22572t.get(), dVar.a());
            case 22:
                return new wm.l((opi.d) cVar.k.get(), (wm.a) dVar.u.get(), ImmutableSet.copyOf((Collection) xm.b.a()), dVar.a());
            case 23:
                t70.g gVarO3 = dVar.f22560b.o();
                s.j(gVarO3);
                return new ea9.e(gVarO3, (o89.a) dVar.k.get(), (ypi.i) cVar.f22550n.get());
            case 24:
                n89.b bVar = (n89.b) dVar.k.get();
                n89.c cVar3 = (n89.c) dVar.f22565l.get();
                t70.g gVarO4 = dVar.f22560b.o();
                s.j(gVarO4);
                return new ba9.c(bVar, cVar3, gVarO4, (ba9.d) cVar.A.get(), (ypi.i) cVar.f22550n.get());
            case 25:
                n89.b bVar2 = (n89.b) dVar.k.get();
                t70.g gVarO5 = dVar.f22560b.o();
                s.j(gVarO5);
                return new ba9.d(bVar2, gVarO5);
            case 26:
                y99.g gVar = (y99.g) dVar.k.get();
                y99.h hVar2 = (y99.h) dVar.f22565l.get();
                e4m.e eVar = cVar.f22552q;
                xoi.d dVar4 = cVar.f22542a;
                w wVar = new w(gVar, hVar2, (f9b.f) eVar.get(), (tpi.j) cVar.f.get(), (iqi.h) cVar.f22549m.get(), (xpi.g) cVar.f22548l.get(), (kpi.c) cVar.f22544c.get(), bq.i.e(dVar4));
                kli.a.p(wVar, bq.i.d(dVar4));
                return wVar;
            default:
                throw new AssertionError(i);
        }
    }

    private final Object b() {
        cbb.c cVar = (cbb.c) this.f18414b;
        cbb.a aVar = (cbb.a) this.d;
        int i = this.f18415c;
        switch (i) {
            case 0:
                return kpi.f.a();
            case 1:
                Context contextI = bq.i.i(aVar.f22726a);
                BaseDelegatesActivity baseDelegatesActivityF = bq.i.f(aVar.f22726a);
                t70.g gVarO = cVar.f22747b.o();
                s.j(gVarO);
                return new npi.c(contextI, baseDelegatesActivityF, gVarO);
            case 2:
                return new tpi.i((rpi.c) aVar.e.get(), gsi.c.a(aVar.f22726a));
            case 3:
                return new rpi.b(bq.i.b(aVar.f22726a));
            case 4:
                return new rpi.h(bq.i.b(aVar.f22726a));
            case 5:
                return new iri.g((iri.j) cVar.G.get(), new iri.b(), bq.i.f(aVar.f22726a), bq.i.l(aVar.f22726a));
            case 6:
                return new iri.l(new iri.b(), bq.i.f(aVar.f22726a), (iri.d) aVar.i.get());
            case 7:
                return new iri.d(bq.i.f(aVar.f22726a));
            case 8:
                return new opi.b(bq.i.f(aVar.f22726a));
            case 9:
                aVar.getClass();
                return new cn.d(ImmutableSet.copyOf((Collection) dn.b.a()), (cn.e) cVar.H.get(), cVar.a());
            case 10:
                um.c cVar2 = (um.c) cVar.I.get();
                aVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(5);
                cbb.c cVar3 = aVar.f22727b;
                hn.h hVar = (hn.h) cVar3.J.get();
                t70.g gVarO2 = cVar3.f22747b.o();
                s.j(gVarO2);
                builderBuilderWithExpectedSize.add(new jn.a(hVar, gVarO2));
                builderBuilderWithExpectedSize.add(new vm.b(com.google.android.gms.internal.mlkit_vision_face.a.f()));
                builderBuilderWithExpectedSize.add(cVar3.b());
                builderBuilderWithExpectedSize.addAll((Iterable) in.g.a());
                builderBuilderWithExpectedSize.add(new jn.d(e4m.b.a(aVar.f22733m)));
                return new in.e(cVar2, builderBuilderWithExpectedSize.build(), cVar.a());
            case 11:
                return bq.i.t(aVar.f22726a);
            case 12:
                aVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize2 = ImmutableSet.builderWithExpectedSize(3);
                builderBuilderWithExpectedSize2.addAll((Iterable) kn.g.a());
                builderBuilderWithExpectedSize2.add(aVar.o.get());
                builderBuilderWithExpectedSize2.add(new kn.h(e4m.b.a(aVar.f)));
                return new kn.e(builderBuilderWithExpectedSize2.build(), (ym.d) cVar.L.get(), cVar.a());
            case 13:
                return new zm.a();
            case 14:
                aVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize3 = ImmutableSet.builderWithExpectedSize(2);
                builderBuilderWithExpectedSize3.addAll((Iterable) hn.g.a());
                builderBuilderWithExpectedSize3.add(aVar.f22727b.b());
                return new hn.d(builderBuilderWithExpectedSize3.build(), (hn.h) cVar.J.get(), (npi.f) aVar.d.get());
            case 15:
                return new en.c(ImmutableSet.of((ln.d) aVar.f22727b.K.get()), bq.i.l(aVar.f22726a));
            case 16:
                return new gn.c((lpi.e) aVar.f22738s.get(), (sm.e) cVar.N.get(), ImmutableSet.copyOf((Collection) gn.e.a()), cVar.a());
            case 17:
                return new lpi.b(bq.i.i(aVar.f22726a), bq.i.j(aVar.f22726a));
            case 18:
                aVar.getClass();
                return new in.e(ImmutableSet.copyOf((Collection) pm.b.a()), (om.c) cVar.O.get(), cVar.a());
            case 19:
                hu2.a aVar2 = (hu2.a) aVar.v.get();
                xoi.d dVar = aVar.f22726a;
                com.hcaptcha.sdk.a aVarL = jr9.h.l(bq.i.b(dVar));
                Activity context = bq.i.b(dVar);
                cbb.e.Companion.getClass();
                Intrinsics.checkNotNullParameter(context, "activity");
                Intrinsics.checkNotNullParameter(context, "context");
                Object obj2 = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.get("com.hcaptcha.sdk.site-key");
                if (obj2 == null) {
                    throw new IllegalStateException("HCaptcha site key must be specified in the Android manifest.");
                }
                HCaptchaConfig hCaptchaConfigM = jr9.h.m((String) obj2);
                aoi.c cVarA = aoi.f.a();
                dm0.d dVarD = aVar.f22727b.d.d();
                s.j(dVarD);
                return new gu2.b(aVar2, new ku2.h(aVarL, hCaptchaConfigM, cVarA, dVarD));
            case 20:
                fk3.a aVarA = cVar.f22748c.a();
                s.j(aVarA);
                return new o5j.b(aVarA);
            case 21:
                return new gqi.b(bq.i.b(aVar.f22726a));
            case 22:
                xoi.d dVar2 = aVar.f22726a;
                cbb.c cVar4 = aVar.f22727b;
                xoi.d dVar3 = aVar.f22726a;
                sri.m mVarL = bq.i.l(dVar2);
                e4m.e eVar = cVar4.R;
                osb.a aVar3 = cVar4.f;
                bbb.h hVar2 = (bbb.h) eVar.get();
                a61.a aVar4 = new a61.a(bq.i.b(dVar3), (tpi.j) aVar.f.get());
                f9b.f fVar = (f9b.f) aVar.f22733m.get();
                ujg.a aVarB = aVar3.b();
                s.j(aVarB);
                p pVar = (p) aVar3.k.get();
                s.j(pVar);
                bbb.l presenter = new bbb.l(mVarL, hVar2, aVar4, fVar, aVarB, pVar);
                sri.m mVarL2 = bq.i.l(dVar3);
                e4m.e eVar2 = cVar4.R;
                osb.a aVar5 = cVar4.f;
                bbb.h hVar3 = (bbb.h) eVar2.get();
                a61.a aVar6 = new a61.a(bq.i.b(dVar3), (tpi.j) aVar.f.get());
                f9b.f fVar2 = (f9b.f) aVar.f22733m.get();
                ujg.a aVarB2 = aVar5.b();
                s.j(aVarB2);
                pri.f fVarD = bq.i.d(dVar3);
                p pVar2 = (p) aVar5.k.get();
                s.j(pVar2);
                bbb.a authorizedPresenter = new bbb.a(mVarL2, hVar3, aVar6, fVar2, aVarB2, fVarD, pVar2);
                zm0.c sessionProvider = cVar.C.j();
                s.j(sessionProvider);
                cbb.e.Companion.getClass();
                Intrinsics.checkNotNullParameter(presenter, "presenter");
                Intrinsics.checkNotNullParameter(authorizedPresenter, "authorizedPresenter");
                Intrinsics.checkNotNullParameter(sessionProvider, "sessionProvider");
                return ((cn0.g) sessionProvider).d() instanceof mm0.n ? authorizedPresenter : presenter;
            case 23:
                e4m.e eVar3 = aVar.f22733m;
                xoi.d dVar4 = aVar.f22726a;
                f9b.f fVar3 = (f9b.f) eVar3.get();
                f01.c cVarO = bq.i.o(dVar4);
                zab.d dVar5 = (zab.d) cVar.S.get();
                zab.h hVar4 = (zab.h) cVar.Q.get();
                sri.m mVarL3 = bq.i.l(dVar4);
                tpi.j jVar = (tpi.j) aVar.f.get();
                AuthService authService = (AuthService) cVar.P.get();
                k21.c cVar5 = (k21.c) ((c21.b) cVar.B).f20564d0.get();
                s.j(cVar5);
                z80.b bVarS = cVar.f22747b.s();
                s.j(bVarS);
                tl0.a aVarC = cVar.d.c();
                zm0.c cVarJ = cVar.C.j();
                s.j(cVarJ);
                return new t(fVar3, cVarO, dVar5, hVar4, mVarL3, jVar, authService, cVar5, bVarS, aVarC, cVarJ, (gu2.b) aVar.f22740w.get(), (zab.e) aVar.f22742y.get(), (opi.d) aVar.k.get());
            case 24:
                return new h0();
            default:
                throw new AssertionError(i);
        }
    }

    private final Object c() {
        cce.b bVar = (cce.b) this.f18414b;
        cce.a aVar = (cce.a) this.d;
        int i = this.f18415c;
        switch (i) {
            case 0:
                return kpi.f.a();
            case 1:
                Context contextI = bq.i.i(aVar.f23027a);
                BaseDelegatesActivity baseDelegatesActivityF = bq.i.f(aVar.f23027a);
                t70.g gVarO = bVar.f23051b.o();
                s.j(gVarO);
                return new npi.c(contextI, baseDelegatesActivityF, gVarO);
            case 2:
                return new tpi.i((rpi.c) aVar.f23035h.get(), gsi.c.a(aVar.f23027a));
            case 3:
                return new rpi.b(bq.i.b(aVar.f23027a));
            case 4:
                return new rpi.h(bq.i.b(aVar.f23027a));
            case 5:
                return new iri.g((iri.j) bVar.E.get(), (iri.m) bVar.F.get(), bq.i.f(aVar.f23027a), bq.i.l(aVar.f23027a));
            case 6:
                return new iri.l((iri.m) bVar.F.get(), bq.i.f(aVar.f23027a), (iri.d) aVar.f23039l.get());
            case 7:
                return new iri.d(bq.i.f(aVar.f23027a));
            case 8:
                return new opi.b(bq.i.f(aVar.f23027a));
            case 9:
                return new xpi.c(aVar.f23029b, bq.i.b(aVar.f23027a));
            case 10:
                aVar.getClass();
                return new cn.d(ImmutableSet.copyOf((Collection) dn.b.a()), (cn.e) bVar.G.get(), bVar.a());
            case 11:
                um.c cVar = (um.c) bVar.H.get();
                aVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(5);
                cce.b bVar2 = aVar.e;
                hn.h hVar = (hn.h) bVar2.I.get();
                t70.g gVarO2 = bVar2.f23051b.o();
                s.j(gVarO2);
                builderBuilderWithExpectedSize.add(new jn.a(hVar, gVarO2));
                builderBuilderWithExpectedSize.add(new vm.b(com.google.android.gms.internal.mlkit_vision_face.a.f()));
                builderBuilderWithExpectedSize.add(bVar2.b());
                builderBuilderWithExpectedSize.addAll((Iterable) in.g.a());
                builderBuilderWithExpectedSize.add(new jn.d(e4m.b.a(aVar.f23043q)));
                return new in.e(cVar, builderBuilderWithExpectedSize.build(), bVar.a());
            case 12:
                return bq.i.t(aVar.f23027a);
            case 13:
                aVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize2 = ImmutableSet.builderWithExpectedSize(3);
                builderBuilderWithExpectedSize2.addAll((Iterable) kn.g.a());
                builderBuilderWithExpectedSize2.add(aVar.f23045s.get());
                builderBuilderWithExpectedSize2.add(new kn.h(e4m.b.a(aVar.i)));
                return new kn.e(builderBuilderWithExpectedSize2.build(), (ym.d) bVar.K.get(), bVar.a());
            case 14:
                return new zm.a();
            case 15:
                aVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize3 = ImmutableSet.builderWithExpectedSize(2);
                builderBuilderWithExpectedSize3.addAll((Iterable) hn.g.a());
                builderBuilderWithExpectedSize3.add(aVar.e.b());
                return new hn.d(builderBuilderWithExpectedSize3.build(), (hn.h) bVar.I.get(), (npi.f) aVar.f23034g.get());
            case 16:
                return new en.c(ImmutableSet.of((ln.d) aVar.e.J.get()), bq.i.l(aVar.f23027a));
            case 17:
                return new gn.c((lpi.e) aVar.f23047w.get(), (sm.e) bVar.M.get(), ImmutableSet.copyOf((Collection) gn.e.a()), bVar.a());
            case 18:
                return new lpi.b(bq.i.i(aVar.f23027a), bq.i.j(aVar.f23027a));
            case 19:
                aVar.getClass();
                return new in.e(ImmutableSet.copyOf((Collection) pm.b.a()), (om.c) bVar.N.get(), bVar.a());
            case 20:
                return new cqi.j(bq.i.f(aVar.f23027a));
            case 21:
                aVar.getClass();
                return new g3l.c(ImmutableSet.copyOf((Collection) g3l.f.a()), (g3l.g) bVar.O.get(), (k3l.b) aVar.A.get(), bVar.a());
            case 22:
                return new k3l.d(bq.i.b(aVar.f23027a));
            case 23:
                s3l.f fVar = (s3l.f) bVar.P.get();
                aVar.getClass();
                return new com.revolut.retail.retail_shot.mediator.a(fVar, ImmutableSet.copyOf((Collection) s3l.e.a()), (r3l.a) aVar.D.get(), bVar.a());
            case 24:
                return new r3l.c((g1) aVar.C.get());
            case 25:
                return l9.k(bq.i.b(aVar.f23027a));
            case 26:
                qb8.b bVar3 = (qb8.b) aVar.F.get();
                bce.a aVar2 = (bce.a) bVar.R.get();
                qce.j jVar = (qce.j) aVar.L.get();
                sri.m mVarL = bq.i.l(aVar.f23027a);
                xpi.g gVar = (xpi.g) aVar.o.get();
                ImmutableMap.Builder builderBuilderWithExpectedSize4 = ImmutableMap.builderWithExpectedSize(24);
                builderBuilderWithExpectedSize4.put("BASIC", aVar.N.get());
                builderBuilderWithExpectedSize4.put("DIRECT_DEBIT", aVar.O.get());
                builderBuilderWithExpectedSize4.put("WALLET", aVar.P.get());
                builderBuilderWithExpectedSize4.put("INTERNAL_TRANSFER", aVar.Q.get());
                builderBuilderWithExpectedSize4.put("JUNIOR_ALLOWANCE", aVar.R.get());
                builderBuilderWithExpectedSize4.put("BANK_TRANSFER", aVar.T.get());
                builderBuilderWithExpectedSize4.put("CARD_MANDATE", aVar.U.get());
                builderBuilderWithExpectedSize4.put("MOBILE_PLAN_SUBSCRIPTION", aVar.V.get());
                builderBuilderWithExpectedSize4.put("SAVINGS_VAULTS", aVar.W.get());
                builderBuilderWithExpectedSize4.put("CREDIT_SCHEDULED_PAYMENTS", aVar.X.get());
                builderBuilderWithExpectedSize4.put("BILL_ACCOUNTS", aVar.Y.get());
                builderBuilderWithExpectedSize4.put("PAID_PLAN", aVar.Z.get());
                builderBuilderWithExpectedSize4.put("COBRANDS", aVar.f23028a0.get());
                builderBuilderWithExpectedSize4.put("REFUND", aVar.f23030b0.get());
                builderBuilderWithExpectedSize4.put("BILL", aVar.c0.get());
                builderBuilderWithExpectedSize4.put("BILL_BOLETO", aVar.f23032d0.get());
                builderBuilderWithExpectedSize4.put("QR_CODE", aVar.f23033e0.get());
                builderBuilderWithExpectedSize4.put("BILLS_AND_TAXES", aVar.f0.get());
                builderBuilderWithExpectedSize4.put("PIX_MANDATE", aVar.g0.get());
                builderBuilderWithExpectedSize4.put("UPI", aVar.f23036h0.get());
                builderBuilderWithExpectedSize4.put("UPI_MANDATE", aVar.i0.get());
                builderBuilderWithExpectedSize4.put("GIRO_DIRECT_DEBIT", aVar.j0.get());
                builderBuilderWithExpectedSize4.put("MASAV_DIRECT_DEBIT", aVar.f23038k0.get());
                builderBuilderWithExpectedSize4.put("PAYTO_MANDATE", aVar.l0.get());
                ImmutableMap immutableMapBuild = builderBuilderWithExpectedSize4.build();
                SubscriptionDetailsScreenContract$Configuration subscriptionDetailsScreenContract$Configuration = aVar.d;
                x xVarD = ((s41.a) bVar.B).d();
                c70.a aVarZ = bVar.f23051b.z();
                s.j(aVarZ);
                return new o(bVar3, aVar2, jVar, mVarL, gVar, immutableMapBuild, subscriptionDetailsScreenContract$Configuration, xVarD, aVarZ);
            case 27:
                r3l.a shotDialogView = (r3l.a) aVar.D.get();
                sb8.a juniorAllowanceShotDialogEventsProvider = (sb8.a) ((rb8.a) bVar.f23052c).f252984q.get();
                yb8.a juniorAllowanceShotDialogProvider = new yb8.a();
                Intrinsics.checkNotNullParameter(juniorAllowanceShotDialogEventsProvider, "juniorAllowanceShotDialogEventsProvider");
                Intrinsics.checkNotNullParameter(juniorAllowanceShotDialogProvider, "juniorAllowanceShotDialogProvider");
                nd.l factory = new nd.l();
                ace.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(shotDialogView, "shotDialogView");
                Intrinsics.checkNotNullParameter(factory, "factory");
                Intrinsics.checkNotNullParameter(shotDialogView, "shotDialogView");
                return new qb8.b(shotDialogView, juniorAllowanceShotDialogEventsProvider, juniorAllowanceShotDialogProvider);
            case 28:
                qce.p pVar = (qce.p) bVar.T.get();
                e4m.e eVar = aVar.f23043q;
                xoi.d dVar = aVar.f23027a;
                f9b.f fVar2 = (f9b.f) eVar.get();
                tpi.j jVar2 = (tpi.j) aVar.i.get();
                cqi.h hVar2 = (cqi.h) aVar.z.get();
                k3l.b bVar4 = (k3l.b) aVar.A.get();
                sri.m mVarL2 = bq.i.l(dVar);
                z8e.a aVarD = bVar.f23054h.d();
                s.j(aVarD);
                f01.c cVarO = bq.i.o(dVar);
                t70.b bVarG = bVar.f23051b.g();
                s.j(bVarG);
                opi.d dVar2 = (opi.d) aVar.f23041n.get();
                qce.i iVar = (qce.i) aVar.H.get();
                qce.l lVar = (qce.l) aVar.I.get();
                ogm.i iVar2 = new ogm.i(aVar.f23031c);
                kpg.a aVar3 = (kpg.a) ((wpg.l) bVar.f23060q).I.get();
                s.j(aVar3);
                mr2.b bVar5 = (mr2.b) bVar.f23061r.E.get();
                s.j(bVar5);
                qce.g gVar2 = (qce.g) aVar.J.get();
                cce.b bVar6 = aVar.e;
                xua.a aVarA = bVar6.f23055j.a();
                s.j(aVarA);
                ppg.b bVarB = ((wpg.l) bVar6.f23060q).b();
                s.j(bVarB);
                a9e.h hVar3 = (a9e.h) aVar.G.get();
                nhf.a aVarA2 = bVar6.f.a();
                s.j(aVarA2);
                oce.h hVar4 = new oce.h(aVarA, bVarB, hVar3, aVarA2);
                msb.a aVar4 = (msb.a) aVar.K.get();
                vz1.g gVarH = ((lz1.m) bVar.f23064w.f213961c).h();
                s.j(gVarH);
                ob2.h hVar5 = new ob2.h(gVarH, new qb2.e());
                vz1.g gVarH2 = ((lz1.m) bVar.f23056l).h();
                s.j(gVarH2);
                return new o0(pVar, fVar2, jVar2, hVar2, bVar4, mVarL2, aVarD, cVarO, bVarG, dVar2, iVar, lVar, iVar2, aVar3, bVar5, gVar2, hVar4, aVar4, hVar5, gVarH2, new v8i.c());
            case 29:
                mae.h hVarA = bVar.f23054h.a();
                s.j(hVarA);
                f01.c cVarO2 = bq.i.o(aVar.f23027a);
                t70.b bVarG2 = bVar.f23051b.g();
                s.j(bVarG2);
                cce.b bVar7 = aVar.e;
                xua.a aVarA3 = bVar7.f23055j.a();
                s.j(aVarA3);
                ppg.b bVarB2 = ((wpg.l) bVar7.f23060q).b();
                s.j(bVarB2);
                a9e.h hVar6 = (a9e.h) aVar.G.get();
                mae.h hVarA2 = bVar7.f23054h.a();
                s.j(hVarA2);
                f01.c cVarG = bVar7.f23063t.g();
                t70.b bVarG3 = bVar7.f23051b.g();
                s.j(bVarG3);
                hj8.a aVarA4 = bVar7.u.a();
                s.j(aVarA4);
                wsg.n nVarB = bVar7.v.b();
                nhf.a aVarA5 = bVar7.f.a();
                s.j(aVarA5);
                return new qce.f(hVarA, cVarO2, bVarG2, new t0(aVarA3, bVarB2, hVar6, hVarA2, cVarG, bVarG3, aVarA4, nVarB, aVarA5));
            case 30:
                mae.p factory2 = bVar.f23054h.e();
                s.j(factory2);
                f01.c uiKitResources = bq.i.o(aVar.f23027a);
                t70.b currenciesLocalization = bVar.f23051b.g();
                s.j(currenciesLocalization);
                rce.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory2, "factory");
                Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
                Intrinsics.checkNotNullParameter(currenciesLocalization, "currenciesLocalization");
                return factory2.d(uiKitResources, currenciesLocalization);
            case 31:
                return new qce.h();
            case 32:
                return new qce.g();
            case 33:
                return ms1.g.D(aVar.f23027a);
            case 34:
                a9e.b bVar8 = (a9e.b) aVar.M.get();
                l80.e eVarH = bVar.f23051b.h();
                s.j(eVarH);
                return new cbe.b(bVar8, eVarH);
            case 35:
                mae.p factory3 = bVar.f23054h.e();
                s.j(factory3);
                f01.c uiKitResources2 = bq.i.o(aVar.f23027a);
                ace.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory3, "factory");
                Intrinsics.checkNotNullParameter(uiKitResources2, "uiKitResources");
                return factory3.b(uiKitResources2);
            case 36:
                a9e.b bVar9 = (a9e.b) aVar.M.get();
                abe.b bVarH = aVar.h();
                l80.e eVarH2 = bVar.f23051b.h();
                s.j(eVarH2);
                return new lbe.b(bVar9, bVarH, eVarH2, aVar.f(), aVar.g());
            case 37:
                a9e.b bVar10 = (a9e.b) aVar.M.get();
                l80.e eVarH3 = bVar.f23051b.h();
                s.j(eVarH3);
                a9e.c cVar2 = (a9e.c) bVar.f23054h.A.get();
                s.j(cVar2);
                return new zbe.b(bVar10, eVarH3, cVar2, new mae.e(), new ugc.a((a9e.b) aVar.M.get(), new mae.e()));
            case 38:
                a9e.b bVar11 = (a9e.b) aVar.M.get();
                l80.e eVarH4 = bVar.f23051b.h();
                s.j(eVarH4);
                a9e.b bVar12 = (a9e.b) aVar.M.get();
                cce.b bVar13 = aVar.e;
                l70.e eVar2 = bVar13.f23051b;
                vl3.n nVar = bVar13.f23059p;
                l80.e eVarH5 = eVar2.h();
                s.j(eVarH5);
                dl3.f fVarC = nVar.c();
                s.j(fVarC);
                cl3.a aVarD2 = nVar.d();
                s.j(aVarD2);
                return new obe.b(bVar11, eVarH4, new obe.d(bVar12, eVarH5, fVarC, aVarD2, new obe.c()));
            case 39:
                l80.e eVarH6 = bVar.f23051b.h();
                s.j(eVarH6);
                a9e.b bVar14 = (a9e.b) aVar.M.get();
                vb8.b bVar15 = new vb8.b();
                hj8.a aVarA6 = bVar.u.a();
                s.j(aVarA6);
                return new pbe.a(eVarH6, bVar14, bVar15, aVarA6, aVar.d);
            case 40:
                a9e.b bVar16 = (a9e.b) aVar.M.get();
                abe.b bVarH2 = aVar.h();
                l80.e eVarH7 = bVar.f23051b.h();
                s.j(eVarH7);
                return new bbe.c(bVar16, bVarH2, eVarH7, (a9e.i) aVar.S.get(), b3j.p.d(), aVar.f(), aVar.g());
            case 41:
                mae.p factory4 = bVar.f23054h.e();
                s.j(factory4);
                t70.g localization = bVar.f23051b.o();
                s.j(localization);
                ace.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory4, "factory");
                Intrinsics.checkNotNullParameter(localization, "localization");
                Intrinsics.checkNotNullParameter(localization, "localization");
                return new u(localization);
            case 42:
                a9e.b bVar17 = (a9e.b) aVar.M.get();
                l93.f fVarJ = bVar.f23066y.j();
                s.j(fVarJ);
                l80.e eVarH8 = bVar.f23051b.h();
                s.j(eVarH8);
                ur2.c cVarA = bVar.f23061r.a();
                s.j(cVarA);
                gte.a aVarB = bVar.f23065x.b();
                s.j(aVarB);
                hj8.a aVarA7 = bVar.u.a();
                s.j(aVarA7);
                return new ibe.c(bVar17, fVarJ, eVarH8, cVarA, aVarB, aVarA7, bVar.v.b(), aVar.f(), aVar.g());
            case 43:
                a9e.b bVar18 = (a9e.b) aVar.M.get();
                l80.e eVarH9 = bVar.f23051b.h();
                s.j(eVarH9);
                return new mbe.b(bVar18, eVarH9);
            case 44:
                x9e.a aVar5 = bVar.f23054h;
                l70.e eVar3 = bVar.f23051b;
                mae.h hVarA3 = aVar5.a();
                s.j(hVarA3);
                a9e.b bVar19 = (a9e.b) aVar.M.get();
                l80.e eVarH10 = eVar3.h();
                s.j(eVarH10);
                f01.c cVarO3 = bq.i.o(aVar.f23027a);
                t70.b bVarG4 = eVar3.g();
                s.j(bVarG4);
                return new wbe.c(hVarA3, bVar19, eVarH10, cVarO3, bVarG4);
            case 45:
                a9e.b bVar20 = (a9e.b) aVar.M.get();
                mae.h hVarA4 = bVar.f23054h.a();
                s.j(hVarA4);
                l80.e eVarH11 = bVar.f23051b.h();
                s.j(eVarH11);
                return new kbe.d(bVar20, hVarA4, eVarH11);
            case 46:
                a9e.b bVar21 = (a9e.b) aVar.M.get();
                l80.e eVarH12 = bVar.f23051b.h();
                s.j(eVarH12);
                return new hbe.c(bVar21, eVarH12);
            case 47:
                a9e.b bVar22 = (a9e.b) aVar.M.get();
                l80.e eVarH13 = bVar.f23051b.h();
                s.j(eVarH13);
                egk.e eVarE = bVar.z.e();
                s.j(eVarE);
                return new tbe.a(bVar22, eVarH13, eVarE, new mae.c());
            case 48:
                a9e.b bVar23 = (a9e.b) aVar.M.get();
                l80.e eVarH14 = bVar.f23051b.h();
                s.j(eVarH14);
                return new jbe.b(bVar23, eVarH14, new mae.a());
            case 49:
                a9e.b bVar24 = (a9e.b) aVar.M.get();
                thf.c cVarC = bVar.A.c();
                s.j(cVarC);
                return new vbe.b(bVar24, cVarC, bVar.f23063t.g());
            case 50:
                a9e.b bVar25 = (a9e.b) aVar.M.get();
                l80.e eVarH15 = bVar.f23051b.h();
                s.j(eVarH15);
                return new dbe.b(bVar25, eVarH15, aVar.e());
            case 51:
                a9e.b bVar26 = (a9e.b) aVar.M.get();
                l80.e eVarH16 = bVar.f23051b.h();
                s.j(eVarH16);
                return new fbe.c(bVar26, eVarH16);
            case 52:
                a9e.b bVar27 = (a9e.b) aVar.M.get();
                abe.b bVarH3 = aVar.h();
                l70.e eVar4 = bVar.f23051b;
                p8a.c cVar3 = bVar.k;
                l80.e eVarH17 = eVar4.h();
                s.j(eVarH17);
                s8a.l lVarE = cVar3.e();
                i8a.c cVar4 = (i8a.c) cVar3.B.get();
                s.j(cVar4);
                return new ube.d(bVar27, bVarH3, eVarH17, lVarE, cVar4);
            case 53:
                a9e.b bVar28 = (a9e.b) aVar.M.get();
                l80.e eVarH18 = bVar.f23051b.h();
                s.j(eVarH18);
                return new ebe.a(bVar28, eVarH18, aVar.e());
            case 54:
                a9e.b bVar29 = (a9e.b) aVar.M.get();
                abe.b bVarH4 = aVar.h();
                s8a.f fVarD = bVar.k.d();
                s.j(fVarD);
                l80.e eVarH19 = bVar.f23051b.h();
                s.j(eVarH19);
                return new sbe.b(bVar29, bVarH4, fVarD, eVarH19);
            case 55:
                a9e.b bVar30 = (a9e.b) aVar.M.get();
                abe.b bVarH5 = aVar.h();
                a9e.i iVar3 = (a9e.i) aVar.S.get();
                l80.e eVarH20 = bVar.f23051b.h();
                s.j(eVarH20);
                return new xbe.b(bVar30, bVarH5, iVar3, eVarH20);
            case 56:
                a9e.b bVar31 = (a9e.b) aVar.M.get();
                vz1.g gVarH3 = ((lz1.m) bVar.f23056l).h();
                s.j(gVarH3);
                return new ybe.d(bVar31, gVarH3, bVar.f23064w.b());
            case 57:
                vz1.g gVarH4 = ((lz1.m) bVar.f23056l).h();
                s.j(gVarH4);
                a9e.b bVar32 = (a9e.b) aVar.M.get();
                l80.e eVarH21 = bVar.f23051b.h();
                s.j(eVarH21);
                return new nbe.d(gVarH4, bVar32, eVarH21);
            case 58:
                vz1.g gVarH5 = ((lz1.m) bVar.f23056l).h();
                s.j(gVarH5);
                a9e.b bVar33 = (a9e.b) aVar.M.get();
                l80.e eVarH22 = bVar.f23051b.h();
                s.j(eVarH22);
                return new qbe.d(gVarH5, bVar33, eVarH22);
            case 59:
                a9e.b bVar34 = (a9e.b) aVar.M.get();
                abe.b bVarH6 = aVar.h();
                vz1.g gVarH6 = ((lz1.m) bVar.f23056l).h();
                s.j(gVarH6);
                l80.e eVarH23 = bVar.f23051b.h();
                s.j(eVarH23);
                return new rbe.e(bVar34, bVarH6, gVarH6, eVarH23, bVar.f23064w.b());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object d() {
        cga.c cVar = (cga.c) this.d;
        cga.a aVar = (cga.a) this.f18414b;
        int i = this.f18415c;
        if (i != 0) {
            if (i != 1) {
                throw new AssertionError(i);
            }
            ViewController viewController = cVar.f23896b;
            jga.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(viewController, "viewController");
            return new f01.c(viewController.m2());
        }
        UnlockBenefitsScreenContract$InputData unlockBenefitsScreenContract$InputData = cVar.f23895a;
        n30.n nVarK = ((h30.n) aVar.f23889c).k();
        egk.d dVarA = aVar.d.a();
        s.j(dVarA);
        jvh.a aVarA = aVar.e.a();
        s.j(aVarA);
        return new iga.j(unlockBenefitsScreenContract$InputData, nVarK, dVarA, new ega.d(aVarA, aVar.f.e()), ((s41.a) aVar.f23890g).d(), new com.revolut.feature.pricing_plans.unlock_benefits.impl.ui.screen.unlock_benefits.b((f01.a) cVar.f23897c.get()));
    }

    private final Object e() {
        cu1.m mVar = (cu1.m) this.d;
        cu1.k kVar = (cu1.k) this.f18414b;
        int i = this.f18415c;
        if (i != 0) {
            if (i != 1) {
                throw new AssertionError(i);
            }
            thf.c cVarC = kVar.f108752r.c();
            s.j(cVarC);
            return new i0(cVarC, new j0());
        }
        jki.p pVar = (jki.p) mVar.f108764b.get();
        BlikConfirmationScreenContract$InputData blikConfirmationScreenContract$InputData = mVar.f108763a;
        eu1.a aVar = (eu1.a) kVar.z.get();
        w39.b bVarA = kVar.i.a();
        s.j(bVarA);
        wsg.n nVarB = kVar.f108753s.b();
        du1.b bVarA2 = kVar.a();
        ku1.d dVar = (ku1.d) kVar.A.get();
        ku1.a aVar2 = new ku1.a();
        l80.e eVarH = kVar.o.h();
        s.j(eVarH);
        return new e0(pVar, blikConfirmationScreenContract$InputData, aVar, bVarA, nVarB, bVarA2, dVar, aVar2, eVarH);
    }

    private final Object f() {
        cu1.p pVar = (cu1.p) this.d;
        cu1.k kVar = (cu1.k) this.f18414b;
        p12.l lVar = kVar.f108748m;
        int i = this.f18415c;
        if (i == 0) {
            Object extension = lVar.b();
            s.j(extension);
            ru1.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(extension, "extension");
            return (yji.n) extension;
        }
        if (i != 1) {
            throw new AssertionError(i);
        }
        BlikSettingsContract$InputData blikSettingsContract$InputData = pVar.f108771a;
        eu1.a aVar = (eu1.a) kVar.z.get();
        v02.b bVarB = lVar.b();
        s.j(bVarB);
        v02.c cVarC = lVar.c();
        s.j(cVarC);
        wj0.a aVarI = ((nj0.d) kVar.e).i();
        s.j(aVarI);
        z80.b bVarS = pVar.f108772b.o.s();
        s.j(bVarS);
        return new qu1.p(blikSettingsContract$InputData, aVar, bVarB, cVarC, aVarI, new r(bVarS));
    }

    private final Object g() {
        int i = this.f18415c;
        if (i != 0) {
            if (i == 1) {
                return new vu1.i();
            }
            throw new AssertionError(i);
        }
        eu1.a aVar = (eu1.a) ((cu1.k) this.f18414b).z.get();
        cu1.t tVar = (cu1.t) this.d;
        return new vu1.h(aVar, tVar.f108781a, (cli.n) tVar.f108782b.get());
    }

    private final Object h() {
        poi.b bVar = ((cwi.h0) this.f18414b).f109697c;
        z zVar = (z) this.d;
        cwi.h0 h0Var = zVar.f109824b;
        int i = this.f18415c;
        if (i == 0) {
            com.revolut.kompot.navigable.a aVar = (com.revolut.kompot.navigable.a) zVar.f109825c.get();
            xvi.g gVar = new xvi.g(h0Var.f109696b);
            q0 q0VarJ = bVar.j();
            uo.b bVarB = bVar.b();
            s.j(bVarB);
            ho.t tVarC = h0Var.f109697c.c();
            s.j(tVarC);
            return yf6.b.g(aVar, gVar, q0VarJ, bVarB, new xvi.b(tVarC));
        }
        if (i == 1) {
            return new cxi.h(zVar.f109823a, (cli.n) zVar.e.get());
        }
        if (i != 2) {
            throw new AssertionError(i);
        }
        exi.c entriesPriceMapper = new exi.c();
        Intrinsics.checkNotNullParameter(entriesPriceMapper, "entriesPriceMapper");
        exi.b clausesMapper = new exi.b();
        Intrinsics.checkNotNullParameter(clausesMapper, "clausesMapper");
        return new cxi.i();
    }

    private final Object i() {
        cwi.h0 h0Var = (cwi.h0) this.f18414b;
        a0 a0Var = (a0) this.d;
        int i = this.f18415c;
        switch (i) {
            case 0:
                e4m.e eVar = a0Var.d;
                cwi.h0 h0Var2 = a0Var.f109624c;
                com.revolut.kompot.navigable.a aVar = (com.revolut.kompot.navigable.a) eVar.get();
                xvi.g gVar = new xvi.g(h0Var2.f109696b);
                q0 q0VarJ = h0Var.f109697c.j();
                uo.b bVarB = h0Var.f109697c.b();
                s.j(bVarB);
                ho.t tVarC = h0Var2.f109697c.c();
                s.j(tVarC);
                return yf6.b.g(aVar, gVar, q0VarJ, bVarB, new xvi.b(tVarC));
            case 1:
                return nga.c.s(h0Var.f109706r.c(), (mga.i0) a0Var.f.get(), (f0) a0Var.f109626h.get(), (on.a) a0Var.i.get());
            case 2:
                yji.o controller = (com.revolut.kompot.navigable.a) a0Var.d.get();
                bxi.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller, "controller");
                mga.i0 i0Var = (mga.i0) controller;
                s.k(i0Var);
                return i0Var;
            case 3:
                return nga.c.u(h0Var.f109706r.c(), a0Var.f109622a, (wn.a) a0Var.f109625g.get());
            case 4:
                return v7.z(h0Var.f109707s, "provider");
            case 5:
                os2.g factory = h0Var.f109707s.c();
                Intrinsics.checkNotNullParameter(factory, "factory");
                return (sn.a) factory.f229224b;
            case 6:
                wn.a aVar2 = (wn.a) a0Var.f109625g.get();
                n57.a.d(aVar2);
                return aVar2;
            case 7:
                gxi.d dVar = (gxi.d) a0Var.f109628l.get();
                bxi.b.Companion.getClass();
                u6c.t tVar = u6c.t.AIRPORT_LOUNGES;
                s.k(tVar);
                gte.a aVarB = h0Var.f109699h.b();
                s.j(aVarB);
                return new gxi.g(dVar, tVar, aVarB);
            case 8:
                q7c.g gVarE = h0Var.f109708t.e();
                q7c.m mVarD = h0Var.f109708t.d();
                s.j(mVarD);
                bxi.b.Companion.getClass();
                u6c.t tVar2 = u6c.t.AIRPORT_LOUNGES;
                s.k(tVar2);
                return new gxi.i(gVarE, mVarD, tVar2);
            case 9:
                AirportLoungePassCheckoutScreenContract$InputData airportLoungePassCheckoutScreenContract$InputData = a0Var.f109623b;
                cwi.h0 h0Var3 = a0Var.f109624c;
                cli.n nVar = (cli.n) a0Var.f109630n.get();
                sf0.h hVarB = h0Var3.v.b();
                s.j(hVarB);
                fxi.c cVar = new fxi.c(hVarB);
                cwi.x xVar = h0Var.f109695a;
                cwi.x xVar2 = h0Var.f109695a;
                dwi.r rVar = (dwi.r) xVar.E.get();
                s.j(rVar);
                qvi.d dVarD = xVar2.d();
                s.j(dVarD);
                nyb.k kVarC = h0Var.o.c();
                s.j(kVarC);
                gxi.c cVar2 = (gxi.c) a0Var.f109629m.get();
                gte.a aVarB2 = h0Var.f109699h.b();
                s.j(aVarB2);
                dwi.s sVarA = xVar2.a();
                s.j(sVarA);
                fkg.a aVarD = h0Var3.f.d();
                dwi.s sVarA2 = h0Var3.f109695a.a();
                s.j(sVarA2);
                fyi.d dVar2 = new fyi.d(aVarD, new dwi.h(sVarA2));
                b0 b0Var = new b0(h0Var3.f109703n.d(), 0);
                sfk.a aVarE = h0Var.f109700j.e();
                s.j(aVarE);
                tga.k kVarB = h0Var.f109709w.b();
                x xVarD = ((s41.a) h0Var.d).d();
                rga.c cVarB = h0Var.f109706r.b();
                s.j(cVarB);
                return new com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.c(airportLoungePassCheckoutScreenContract$InputData, nVar, cVar, rVar, dVarD, kVarC, cVar2, aVarB2, sVarA, dVar2, b0Var, aVarE, kVarB, xVarD, cVarB);
            case 10:
                hxi.m mVar = new hxi.m();
                n8b.a aVarA = a0Var.f109624c.u.a();
                s.j(aVarA);
                fxi.g gVar2 = new fxi.g(mVar, aVarA);
                fxi.f fVar = new fxi.f(new nd7.d(new nd7.c()), new fxi.i());
                gxi.h exchangeAmountItemMapper = new gxi.h();
                Intrinsics.checkNotNullParameter(exchangeAmountItemMapper, "exchangeAmountItemMapper");
                fxi.h hVar = new fxi.h();
                dec.r rVar2 = new dec.r();
                dec.g gVar3 = new dec.g();
                dec.a aVar3 = new dec.a();
                l80.e eVarH = a0Var.f109624c.f.h();
                s.j(eVarH);
                gxi.j jVar = new gxi.j(new q(rVar2, gVar3, aVar3, eVarH));
                gte.a aVarB3 = h0Var.f109699h.b();
                s.j(aVarB3);
                return new com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.d(gVar2, fVar, hVar, jVar, aVarB3);
            default:
                throw new AssertionError(i);
        }
    }

    @Override // phm.a
    public final Object get() {
        Object cVar;
        Object f0Var;
        switch (this.f18413a) {
            case 0:
                i iVar = (i) this.f18414b;
                f fVar = (f) this.d;
                CoverageDetailsScreenContract$InputData coverageDetailsScreenContract$InputData = fVar.f18416a;
                int i = this.f18415c;
                if (i == 0) {
                    return new com.revolut.feature.insurance_credit.impl.ui.screen.coverage_details.a((cli.n) fVar.f18417b.get(), coverageDetailsScreenContract$InputData, ((s41.a) iVar.f18429j).d());
                }
                if (i == 1) {
                    return new qt7.i(coverageDetailsScreenContract$InputData, (st7.b) iVar.D.get(), (st7.a) iVar.E.get());
                }
                throw new AssertionError(i);
            case 1:
                i iVar2 = (i) this.f18414b;
                g gVar = (g) this.d;
                int i2 = this.f18415c;
                if (i2 == 0) {
                    return new wt7.i((cli.n) gVar.f18421c.get(), gVar.f18419a, ((s41.a) iVar2.f18429j).d(), ((nj0.d) iVar2.f18425b).f216295c, (ys7.h) iVar2.f18439x.get());
                }
                if (i2 == 1) {
                    return new wt7.j(new yt7.b(gVar.f18420b.f18428h.g()));
                }
                throw new AssertionError(i2);
            case 2:
                k kVar = (k) this.d;
                i iVar3 = (i) this.f18414b;
                int i3 = this.f18415c;
                if (i3 != 0) {
                    if (i3 == 1) {
                        return new tt7.r((vt7.b) iVar3.z.get(), (vt7.d) iVar3.A.get(), (vt7.c) iVar3.B.get(), (vt7.a) iVar3.C.get(), new yik.b());
                    }
                    if (i3 != 2) {
                        throw new AssertionError(i3);
                    }
                    com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) kVar.d.get();
                    ut7.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(controller, "controller");
                    return x0.a(g1.Companion, controller.D2());
                }
                cli.n nVar = (cli.n) kVar.f18446c.get();
                InsuranceDetailsScreenContract$InputData insuranceDetailsScreenContract$InputData = kVar.f18444a;
                ys7.h hVar = (ys7.h) iVar3.f18439x.get();
                c70.a aVarZ = kVar.f18445b.i.z();
                s.j(aVarZ);
                tr7.a aVar = new tr7.a(aVarZ, (g1) kVar.e.get());
                x xVarD = ((s41.a) iVar3.f18429j).d();
                ffk.t tVarF = iVar3.k.f();
                s.j(tVarF);
                return new com.revolut.feature.insurance_credit.impl.ui.screen.details.b(nVar, insuranceDetailsScreenContract$InputData, hVar, aVar, xVarD, tVarF, new zt7.a());
            case 3:
                bx2.b bVar = (bx2.b) this.d;
                bx2.a aVar2 = (bx2.a) this.f18414b;
                da3.j jVar = aVar2.f19483b;
                int i5 = this.f18415c;
                if (i5 != 0) {
                    if (i5 == 1) {
                        return new ex2.m();
                    }
                    throw new AssertionError(i5);
                }
                cli.n nVar2 = (cli.n) bVar.f19486b.get();
                ResetCardScaContract$InputData resetCardScaContract$InputData = bVar.f19485a;
                ha3.d dVarE = jVar.e();
                s.j(dVarE);
                l93.f fVarJ = jVar.j();
                s.j(fVarJ);
                fk3.b bVarB = aVar2.f19484c.b();
                s.j(bVarB);
                return new ex2.l(nVar2, resetCardScaContract$InputData, dVarE, fVarJ, bVarB);
            case 4:
                bxc.a aVar3 = (bxc.a) this.f18414b;
                bxc.c cVar2 = (bxc.c) this.d;
                int i6 = this.f18415c;
                if (i6 != 0) {
                    if (i6 == 1) {
                        return new fxc.b();
                    }
                    throw new AssertionError(i6);
                }
                fxc.p pVar = new fxc.p(cVar2.f19666b.f19660b.a(), (fxc.b) cVar2.f19667c.get());
                SelectPaymentScreenContract$InputData selectPaymentScreenContract$InputData = cVar2.f19665a;
                y51.a aVarA = aVar3.f19659a.a();
                s.j(aVarA);
                return new fxc.u(pVar, selectPaymentScreenContract$InputData, aVarA, aVar3.f19661c.e(), (fxc.b) cVar2.f19667c.get());
            case 5:
                int i21 = this.f18415c;
                if (i21 != 0) {
                    if (i21 == 1) {
                        return new e06.i();
                    }
                    throw new AssertionError(i21);
                }
                w80.b bVarJ = ((c06.c) this.f18414b).f20174b.j();
                s.j(bVarJ);
                c06.b bVar2 = (c06.b) this.d;
                return new e06.h(bVarJ, bVar2.f20170a, (cli.n) bVar2.f20172c.get());
            case 6:
                int i22 = this.f18415c;
                if (i22 != 0) {
                    if (i22 == 1) {
                        return new g06.m();
                    }
                    throw new AssertionError(i22);
                }
                t53.a aVar4 = (t53.a) ((c06.c) this.f18414b).f20173a.f259914g.get();
                s.j(aVar4);
                c06.e eVar = (c06.e) this.d;
                return new g06.l(aVar4, eVar.f20178a, (cli.n) eVar.f20179b.get());
            case 7:
                s53.c cVar3 = ((c06.c) this.f18414b).f20173a;
                c06.f fVar2 = (c06.f) this.d;
                int i32 = this.f18415c;
                if (i32 == 0) {
                    n60.a aVar5 = (n60.a) fVar2.f20182b.get();
                    o5k.i.l(aVar5);
                    return aVar5;
                }
                if (i32 == 1) {
                    return o5k.i.q((com.revolut.kompot.navigable.a) fVar2.f20181a.get());
                }
                if (i32 != 2) {
                    if (i32 != 3) {
                        throw new AssertionError(i32);
                    }
                    t53.b tipsArticleInteractor = (t53.b) cVar3.f259915h.get();
                    s.j(tipsArticleInteractor);
                    Intrinsics.checkNotNullParameter(tipsArticleInteractor, "tipsArticleInteractor");
                    return new i06.s();
                }
                cli.n nVar3 = (cli.n) fVar2.d.get();
                t53.a aVar6 = (t53.a) cVar3.f259914g.get();
                s.j(aVar6);
                t53.b bVar3 = (t53.b) cVar3.f259915h.get();
                s.j(bVar3);
                return new i06.q(nVar3, aVar6, bVar3, (n60.a) fVar2.f20182b.get());
            case 8:
                c1d.a aVar7 = (c1d.a) this.f18414b;
                l70.e eVar2 = aVar7.f20445a;
                c1d.b bVar4 = (c1d.b) this.d;
                c1d.a aVar8 = bVar4.f20449a;
                int i33 = this.f18415c;
                if (i33 == 0) {
                    c70.a clipboard = eVar2.z();
                    s.j(clipboard);
                    r70.c hapticEngine = eVar2.A();
                    s.j(hapticEngine);
                    tqi.e shareExternalDestinationFactory = aVar7.f20446b.d();
                    f1d.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(clipboard, "clipboard");
                    Intrinsics.checkNotNullParameter(hapticEngine, "hapticEngine");
                    Intrinsics.checkNotNullParameter(shareExternalDestinationFactory, "shareExternalDestinationFactory");
                    return new i1d.d(clipboard, hapticEngine, shareExternalDestinationFactory);
                }
                if (i33 != 1) {
                    throw new AssertionError(i33);
                }
                hf8.b bVarC = aVar8.f.c();
                f01.c cVarG = aVar8.f20446b.g();
                z80.b bVarS = aVar8.f20445a.s();
                s.j(bVarS);
                e1d.j jVar2 = new e1d.j(bVarC, cVarG, bVarS);
                o7.b bVar5 = new o7.b(new x0d.e(aVar8.a(), new ne0.d(), aVar8.b(), new y0d.a()));
                nj0.d dVar = (nj0.d) aVar8.f20447c;
                ik0.b retrofitFactory = dVar.m();
                s.j(retrofitFactory);
                ek.a converterFactory = dVar.d();
                Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
                Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
                Object objCreate = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27).create(SemiIndependentOnboardingConfigService.class);
                Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
                SemiIndependentOnboardingConfigService semiIndependentOnboardingConfigService = (SemiIndependentOnboardingConfigService) objCreate;
                s.k(semiIndependentOnboardingConfigService);
                return new com.revolut.feature.semi_independent_onboarding.impl.ui.details.b(jVar2, bVar5, new r10.t(new x0d.b(semiIndependentOnboardingConfigService, new ne0.d(), aVar8.b()), new x0d.e(aVar8.a(), new ne0.d(), aVar8.b(), new y0d.a())), (i1d.d) bVar4.f20450b.get(), new i1d.a());
            case 9:
                c1d.c cVar4 = (c1d.c) this.d;
                c1d.a aVar9 = (c1d.a) this.f18414b;
                l70.e eVar3 = aVar9.f20445a;
                int i43 = this.f18415c;
                if (i43 != 0) {
                    if (i43 != 1) {
                        throw new AssertionError(i43);
                    }
                    c1d.a aVar10 = cVar4.f20453b;
                    return new com.revolut.feature.semi_independent_onboarding.impl.ui.invitation.a(new o7.b(new x0d.e(aVar10.a(), new ne0.d(), aVar10.b(), new y0d.a())), cVar4.f20452a, (i1d.d) cVar4.f20454c.get(), new i1d.a());
                }
                c70.a clipboard2 = eVar3.z();
                s.j(clipboard2);
                r70.c hapticEngine2 = eVar3.A();
                s.j(hapticEngine2);
                tqi.e shareExternalDestinationFactory2 = aVar9.f20446b.d();
                h1d.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(clipboard2, "clipboard");
                Intrinsics.checkNotNullParameter(hapticEngine2, "hapticEngine");
                Intrinsics.checkNotNullParameter(shareExternalDestinationFactory2, "shareExternalDestinationFactory");
                return new i1d.d(clipboard2, hapticEngine2, shareExternalDestinationFactory2);
            case 10:
                c43.h hVar2 = (c43.h) this.f18414b;
                da3.j jVar3 = hVar2.d;
                c43.k kVar2 = (c43.k) this.d;
                int i59 = this.f18415c;
                if (i59 == 0) {
                    return kxa.j.k((j60.a) kVar2.e.get());
                }
                if (i59 == 1) {
                    return ehe.n.s((com.revolut.kompot.navigable.a) kVar2.f21039c.get(), (rp0.m) kVar2.d.get());
                }
                if (i59 == 2) {
                    return new rp0.m();
                }
                if (i59 != 3) {
                    if (i59 == 4) {
                        return new e43.b();
                    }
                    throw new AssertionError(i59);
                }
                da3.j jVar4 = kVar2.f21038b.d;
                ia3.r rVarB = jVar4.b();
                m93.g gVarI = jVar4.i();
                s.j(gVarI);
                h43.u uVar = new h43.u(rVarB, gVarI);
                ChooserScreenContract$InputData chooserScreenContract$InputData = kVar2.f21037a;
                l93.f fVarJ2 = jVar3.j();
                s.j(fVarJ2);
                j60.a aVar11 = (j60.a) kVar2.e.get();
                n6e.b bVarA = hVar2.f.a();
                xua.a aVarA2 = hVar2.f21025r.a();
                s.j(aVarA2);
                mt8.d dVarB = hVar2.v.b();
                s.j(dVarB);
                mre.c cVarB = hVar2.f21027t.b();
                s.j(cVarB);
                b1 b1Var = (b1) hVar2.f21022n.f292061b0.get();
                s.j(b1Var);
                ha3.k kVar3 = (ha3.k) jVar3.H.get();
                s.j(kVar3);
                e43.b bVar6 = (e43.b) kVar2.f21040g.get();
                al4.b bVarN = hVar2.f21021m.n();
                s.j(bVarN);
                return new h43.s(uVar, chooserScreenContract$InputData, fVarJ2, aVar11, bVarA, aVarA2, dVarB, cVarB, b1Var, kVar3, bVar6, bVarN);
            case 11:
                c43.h hVar3 = (c43.h) this.f18414b;
                c43.l lVar = (c43.l) this.d;
                int i66 = this.f18415c;
                if (i66 == 0) {
                    LinkCardFlowInputData linkCardFlowInputData = lVar.f21042a;
                    l93.f fVarJ3 = hVar3.d.j();
                    s.j(fVarJ3);
                    return new com.revolut.feature.card_payment_method.impl.flows.link_card.flow.b(linkCardFlowInputData, fVarJ3, hVar3.u.c());
                }
                if (i66 != 1) {
                    throw new AssertionError(i66);
                }
                com.revolut.kompot.navigable.a controller2 = (com.revolut.kompot.navigable.a) lVar.e.get();
                g43.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller2, "controller");
                return x0.a(g1.Companion, controller2.C2().D2());
            case 12:
                c43.h hVar4 = (c43.h) this.f18414b;
                c43.m mVar = (c43.m) this.d;
                int i74 = this.f18415c;
                switch (i74) {
                    case 0:
                        return trl.f.i((t60.b) mVar.e.get());
                    case 1:
                        return trl.f.r(mVar.f21045a);
                    case 2:
                        return kxa.j.l((j60.a) mVar.i.get());
                    case 3:
                        return h30.l.p((com.revolut.kompot.navigable.a) mVar.f21048g.get(), (rp0.m) mVar.f21049h.get());
                    case 4:
                        return new rp0.m();
                    case 5:
                        fd6.a extension = (fd6.a) mVar.f21051l.get();
                        Intrinsics.checkNotNullParameter(extension, "extension");
                        s.k(extension);
                        return extension;
                    case 6:
                        i4b.f factory = ((zc6.a) hVar4.f21023p).d();
                        xc6.a modelExtension = (xc6.a) mVar.k.get();
                        Intrinsics.checkNotNullParameter(factory, "factory");
                        Intrinsics.checkNotNullParameter(modelExtension, "legalEntityControllerModelExtension");
                        Intrinsics.checkNotNullParameter(modelExtension, "modelExtension");
                        return new fd6.a(modelExtension);
                    case 7:
                        return r6.b.k((zc6.a) hVar4.f21023p, "factory");
                    case 8:
                        Object extension2 = (xc6.a) mVar.k.get();
                        Intrinsics.checkNotNullParameter(extension2, "extension");
                        yji.n nVar4 = (yji.n) extension2;
                        s.k(nVar4);
                        return nVar4;
                    case 9:
                        jki.p pVar2 = (jki.p) mVar.f21061y.get();
                        y33.a aVar12 = (y33.a) hVar4.f21029x.get();
                        SelectPaymentMethodInputData selectPaymentMethodInputData = mVar.f21047c;
                        j60.a aVar13 = (j60.a) mVar.i.get();
                        v43.c cVar5 = (v43.c) mVar.z.get();
                        c43.h hVar5 = mVar.d;
                        mae.p pVarE = hVar5.f21019j.e();
                        s.j(pVarE);
                        f01.c cVarG2 = hVar5.k.g();
                        t70.b bVarG = hVar5.f21020l.g();
                        s.j(bVarG);
                        v43.a aVar14 = new v43.a(c21.l.z(pVarE, cVarG2, bVarG));
                        sh5.d dVarF = hVar4.f21024q.f();
                        s.j(dVarF);
                        xua.a aVarA3 = hVar4.f21025r.a();
                        s.j(aVarA3);
                        ang.f fVarE = hVar4.f21026s.e();
                        mre.c cVarB2 = hVar4.f21027t.b();
                        s.j(cVarB2);
                        b1 b1Var2 = (b1) hVar4.f21022n.f292061b0.get();
                        s.j(b1Var2);
                        return new q43.o0(pVar2, aVar12, selectPaymentMethodInputData, aVar13, cVar5, aVar14, dVarF, aVarA3, fVarE, cVarB2, b1Var2, hVar4.f21014a.a(), ((zc6.a) hVar4.f21023p).b(), (g1) mVar.A.get());
                    case 10:
                        return new s43.l((s43.h) mVar.o.get(), ImmutableMap.of(q43.b0.CRYPTO, (s43.g) mVar.v.get(), q43.b0.FIAT, (s43.g) mVar.f21059w.get(), q43.b0.PERSONAL_VAULT, (s43.g) mVar.f21060x.get()));
                    case 11:
                        return new s43.p();
                    case 12:
                        return new u43.g((s43.b) mVar.f21054p.get(), (t43.c) mVar.f21055q.get(), (s43.n) mVar.f21057s.get(), (u43.a) mVar.u.get());
                    case 13:
                        return new t43.a();
                    case 14:
                        return new t43.c();
                    case 15:
                        return new s43.n((f01.a) mVar.f21056r.get());
                    case 16:
                        BaseScreen screen = mVar.f21046b;
                        r43.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(screen, "screen");
                        cVar = new f01.c(screen.m2());
                        break;
                    case 17:
                        return new u43.a((e43.b) mVar.f21058t.get());
                    case 18:
                        return new e43.b();
                    case 19:
                        return new u43.j((s43.b) mVar.f21054p.get(), (t43.c) mVar.f21055q.get(), (s43.n) mVar.f21057s.get(), (u43.a) mVar.u.get());
                    case 20:
                        return new u43.l((s43.b) mVar.f21054p.get(), (t43.c) mVar.f21055q.get(), (s43.n) mVar.f21057s.get(), (u43.a) mVar.u.get());
                    case 21:
                        cVar = new v43.e(((zc6.a) hVar4.f21023p).c());
                        break;
                    case 22:
                        com.revolut.kompot.navigable.a controller3 = (com.revolut.kompot.navigable.a) mVar.f21048g.get();
                        r43.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(controller3, "controller");
                        x0 x0Var = g1.Companion;
                        View decorView = controller3.m2().getWindow().getDecorView();
                        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
                        return x0.a(x0Var, decorView);
                    case 23:
                        return new s43.m();
                    default:
                        throw new AssertionError(i74);
                }
                return cVar;
            case 13:
                c4e.c cVar6 = (c4e.c) this.f18414b;
                c4e.b bVar7 = (c4e.b) this.d;
                int i92 = this.f18415c;
                switch (i92) {
                    case 0:
                        ypi.h hVar6 = bVar7.f21144b;
                        fsi.g gVar2 = bVar7.f21143a;
                        return new ypi.e(hVar6, bq.i.b(gVar2), bq.i.o(gVar2), bq.i.g(gVar2));
                    case 1:
                        return new hqi.f(bVar7.f21145c, bq.i.b(bVar7.f21143a));
                    case 2:
                        return new in.e(ImmutableSet.of(), ImmutableSet.of(), cVar6.b());
                    case 3:
                        return new aqi.d(bq.i.b(bVar7.f21143a), new y80.b());
                    case 4:
                        Context contextI = bq.i.i(bVar7.f21143a);
                        BaseDelegatesActivity baseDelegatesActivityF = bq.i.f(bVar7.f21143a);
                        t70.g gVarO = cVar6.f21161b.o();
                        s.j(gVarO);
                        return new npi.c(contextI, baseDelegatesActivityF, gVarO);
                    case 5:
                        return new iri.g((iri.j) cVar6.f21164h.get(), (iri.m) cVar6.f21165j.get(), bq.i.f(bVar7.f21143a), bq.i.l(bVar7.f21143a));
                    case 6:
                        return new iri.l((iri.m) cVar6.f21165j.get(), bq.i.f(bVar7.f21143a), (iri.d) bVar7.k.get());
                    case 7:
                        return new iri.d(bq.i.f(bVar7.f21143a));
                    case 8:
                        return kpi.f.a();
                    case 9:
                        return new tpi.i((rpi.c) bVar7.f21151n.get(), gsi.c.a(bVar7.f21143a));
                    case 10:
                        return new rpi.b(bq.i.b(bVar7.f21143a));
                    case 11:
                        return new rpi.h(bq.i.b(bVar7.f21143a));
                    case 12:
                        return new opi.b(bq.i.f(bVar7.f21143a));
                    case 13:
                        bVar7.getClass();
                        return new cn.d(ImmutableSet.copyOf((Collection) dn.b.a()), (cn.e) cVar6.k.get(), cVar6.b());
                    case 14:
                        um.c cVar7 = (um.c) cVar6.i.get();
                        bVar7.getClass();
                        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(5);
                        c4e.c cVar8 = bVar7.d;
                        hn.h hVar7 = (hn.h) cVar8.f21166l.get();
                        t70.g gVarO2 = cVar8.f21161b.o();
                        s.j(gVarO2);
                        builderBuilderWithExpectedSize.add(new jn.a(hVar7, gVarO2));
                        builderBuilderWithExpectedSize.add(new vm.b(com.google.android.gms.internal.mlkit_vision_face.a.f()));
                        builderBuilderWithExpectedSize.add(cVar8.c());
                        builderBuilderWithExpectedSize.addAll((Iterable) in.g.a());
                        builderBuilderWithExpectedSize.add(new jn.d(e4m.b.a(bVar7.f21155s)));
                        return new in.e(cVar7, builderBuilderWithExpectedSize.build(), cVar6.b());
                    case 15:
                        return bq.i.t(bVar7.f21143a);
                    case 16:
                        bVar7.getClass();
                        ImmutableSet.Builder builderBuilderWithExpectedSize2 = ImmutableSet.builderWithExpectedSize(3);
                        builderBuilderWithExpectedSize2.addAll((Iterable) kn.g.a());
                        builderBuilderWithExpectedSize2.add(bVar7.u.get());
                        builderBuilderWithExpectedSize2.add(new kn.h(e4m.b.a(bVar7.o)));
                        return new kn.e(builderBuilderWithExpectedSize2.build(), (ym.d) cVar6.f21168n.get(), cVar6.b());
                    case 17:
                        return new zm.a();
                    case 18:
                        bVar7.getClass();
                        ImmutableSet.Builder builderBuilderWithExpectedSize3 = ImmutableSet.builderWithExpectedSize(2);
                        builderBuilderWithExpectedSize3.addAll((Iterable) hn.g.a());
                        builderBuilderWithExpectedSize3.add(bVar7.d.c());
                        return new hn.d(builderBuilderWithExpectedSize3.build(), (hn.h) cVar6.f21166l.get(), (npi.f) bVar7.i.get());
                    case 19:
                        return new en.c(ImmutableSet.of((ln.d) bVar7.d.f21167m.get()), bq.i.l(bVar7.f21143a));
                    case 20:
                        return new gn.c((lpi.e) bVar7.f21159y.get(), (sm.e) cVar6.f21169p.get(), ImmutableSet.copyOf((Collection) gn.e.a()), cVar6.b());
                    case 21:
                        return new lpi.b(bq.i.i(bVar7.f21143a), bq.i.j(bVar7.f21143a));
                    case 22:
                        bVar7.getClass();
                        return new in.e(ImmutableSet.copyOf((Collection) pm.b.a()), (om.c) cVar6.f21170q.get(), cVar6.b());
                    case 23:
                        s3l.f fVar3 = (s3l.f) cVar6.f21171r.get();
                        bVar7.getClass();
                        return new com.revolut.retail.retail_shot.mediator.a(fVar3, ImmutableSet.copyOf((Collection) s3l.e.a()), (r3l.a) bVar7.C.get(), cVar6.b());
                    case 24:
                        return new r3l.c((g1) bVar7.B.get());
                    case 25:
                        return l9.k(bq.i.b(bVar7.f21143a));
                    case 26:
                        return new k3l.d(bq.i.b(bVar7.f21143a));
                    case 27:
                        v3e.d dVar2 = (v3e.d) cVar6.f21165j.get();
                        e4m.e eVar4 = bVar7.f21155s;
                        fsi.g gVar3 = bVar7.f21143a;
                        f9b.f fVar4 = (f9b.f) eVar4.get();
                        sri.m mVarL = bq.i.l(gVar3);
                        v3e.b bVar8 = (v3e.b) cVar6.f21172s.get();
                        v3e.k kVar4 = new v3e.k();
                        z3e.c cVarA = ((w3e.a) cVar6.d).a();
                        npi.f fVar5 = (npi.f) bVar7.i.get();
                        f80.a aVarX = cVar6.f21161b.x();
                        s.j(aVarX);
                        return new d0(dVar2, fVar4, mVarL, bVar8, kVar4, cVarA, fVar5, aVarX, ImmutableSet.of(), bq.i.e(gVar3), (s3l.f) cVar6.f21171r.get());
                    default:
                        throw new AssertionError(i92);
                }
            case 14:
                c4f.d dVar3 = (c4f.d) this.f18414b;
                u8h.c cVar9 = dVar3.d;
                c4f.c cVar10 = (c4f.c) this.d;
                int i96 = this.f18415c;
                switch (i96) {
                    case 0:
                        return n57.a.t((o5d.c) cVar10.e.get());
                    case 1:
                        return n57.a.w(dVar3.f21205c.a(), cVar10.f21196a);
                    case 2:
                        return a10.b.f((u8h.b) cVar9, "factory");
                    case 3:
                        return n57.a.v((o5d.c) cVar10.e.get());
                    case 4:
                        return n57.a.g((o5d.c) cVar10.e.get());
                    case 5:
                        c4f.d dVar4 = cVar10.d;
                        u4f.a aVar15 = new u4f.a(h9h.a.x());
                        gte.a aVarB = dVar4.f.b();
                        s.j(aVarB);
                        cq9.m mVar2 = new cq9.m(new s4f.q(aVar15, new s4f.p(aVarB, new s4f.o())), new nd.m(new s4f.t()), new s4f.s((q1) cVar10.f21201j.get()), new t5d.d());
                        CollectionScreenContract$Input collectionScreenContract$Input = cVar10.f21198c;
                        x8h.g gVarB = dVar3.e.b();
                        s4f.u uVar2 = new s4f.u();
                        l4f.a aVar16 = new l4f.a();
                        aah.h hVar8 = (aah.h) cVar10.f21199g.get();
                        ybl.b bVarB2 = dVar3.f21204b.b();
                        s.j(bVarB2);
                        return new s4f.x(mVar2, collectionScreenContract$Input, gVarB, uVar2, aVar16, hVar8, bVarB2, (o5d.a) cVar10.k.get());
                    case 6:
                        return a10.b.g((u8h.b) cVar9, "factory");
                    case 7:
                        return n57.a.u((o5d.c) cVar10.e.get());
                    default:
                        throw new AssertionError(i96);
                }
            case 15:
                c4f.e eVar5 = (c4f.e) this.d;
                c4f.d dVar5 = (c4f.d) this.f18414b;
                zdl.c cVar11 = dVar5.f21204b;
                int i99 = this.f18415c;
                if (i99 != 0) {
                    if (i99 == 1) {
                        return new y4f.q();
                    }
                    if (i99 == 2) {
                        return new a5f.b();
                    }
                    throw new AssertionError(i99);
                }
                cli.n nVar5 = (cli.n) eVar5.f21207a.get();
                a5f.a aVar17 = (a5f.a) eVar5.f21208b.get();
                ybl.k kVarD = dVar5.f21203a.d();
                s.j(kVarD);
                ybl.d dVarH = cVar11.h();
                s.j(dVarH);
                ael.t tVarF2 = cVar11.f();
                s.j(tVarF2);
                return new com.revolut.feature.trading.impl.ui.holdings.information.entry.a(nVar5, aVar17, kVarD, dVarH, tVarF2);
            case 16:
                c73.i iVar4 = (c73.i) this.d;
                c73.j jVar5 = (c73.j) this.f18414b;
                da3.j jVar6 = jVar5.f;
                int i100 = this.f18415c;
                if (i100 != 0) {
                    if (i100 == 1) {
                        return new b73.k(new ia3.f(jVar6.b(), (m93.g) jVar6.C.get()));
                    }
                    throw new AssertionError(i100);
                }
                cli.n nVar6 = (cli.n) iVar4.f21857b.get();
                CardSelectionNavigationData$InputData cardSelectionNavigationData$InputData = iVar4.f21856a;
                mt8.d dVarB2 = jVar5.f21869q.b();
                s.j(dVarB2);
                r0 r0VarC = jVar5.k.c();
                d73.u uVarA = jVar5.a();
                l93.f fVarJ4 = jVar6.j();
                s.j(fVarJ4);
                zf8.k kVarA = jVar5.f21863h.a();
                s.j(kVarA);
                jla.h hVarA = jVar5.f21865l.a();
                m4 m4VarD = jVar5.f21866m.d();
                s.j(m4VarD);
                return new b73.i(nVar6, cardSelectionNavigationData$InputData, dVarB2, r0VarC, uVarA, fVarJ4, kVarA, hVarA, m4VarD);
            case 17:
                return a();
            case 18:
                caj.a aVar18 = (caj.a) this.f18414b;
                caj.b bVar9 = (caj.b) this.d;
                int i101 = this.f18415c;
                if (i101 != 0) {
                    if (i101 == 1) {
                        return new eaj.g();
                    }
                    throw new AssertionError(i101);
                }
                jki.p pVar3 = (jki.p) bVar9.f22659b.get();
                x xVarD2 = ((s41.a) aVar18.f22655a).d();
                CryptoNavigationInterceptorScreenContract$InputData cryptoNavigationInterceptorScreenContract$InputData = bVar9.f22658a;
                ji5.m mVarE = aVar18.f22656b.e();
                s.j(mVarE);
                return new eaj.f(pVar3, xVarD2, cryptoNavigationInterceptorScreenContract$InputData, mVarE);
            case 19:
                return b();
            case 20:
                return c();
            case 21:
                cf7.b bVar10 = (cf7.b) this.f18414b;
                cf7.c cVar12 = (cf7.c) this.d;
                int i102 = this.f18415c;
                switch (i102) {
                    case 0:
                        return kxa.j.k((j60.a) cVar12.d.get());
                    case 1:
                        return ehe.n.s((com.revolut.kompot.navigable.a) cVar12.f23590b.get(), (rp0.m) cVar12.f23591c.get());
                    case 2:
                        return new rp0.m();
                    case 3:
                        cli.n nVar7 = (cli.n) cVar12.f.get();
                        r10.q qVarA = bVar10.a();
                        dsh.h hVarB = cVar12.b();
                        g0 g0Var = new g0();
                        sf7.a aVar19 = new sf7.a();
                        q06.l lVarA = bVar10.f23578l.a();
                        s.j(lVarA);
                        f0Var = new uf7.f0(nVar7, qVarA, hVarB, g0Var, aVar19, lVarA, new bil.a(ImmutableMap.of(if7.c.class, (vf7.d) cVar12.f23602t.get()), 3), (j60.a) cVar12.d.get(), cVar12.f23589a);
                        break;
                    case 4:
                        return new uf7.h0();
                    case 5:
                        return new yf7.a();
                    case 6:
                        return new zf7.a();
                    case 7:
                        xf7.a commonMapper = new xf7.a();
                        Intrinsics.checkNotNullParameter(commonMapper, "commonMapper");
                        return new ag7.b();
                    case 8:
                        return new bg7.a();
                    case 9:
                        f0Var = new cg7.b(new xf7.a(), bVar10.f23577j.g());
                        break;
                    case 10:
                        return new dg7.a();
                    case 11:
                        return new eg7.a();
                    case 12:
                        return new fg7.a();
                    case 13:
                        xf7.a commonMapper2 = new xf7.a();
                        Intrinsics.checkNotNullParameter(commonMapper2, "commonMapper");
                        return new gg7.b();
                    case 14:
                        return new hg7.a();
                    case 15:
                        return new ig7.a();
                    case 16:
                        return new jg7.a();
                    case 17:
                        whf.b bVarA2 = bVar10.k.a();
                        s.j(bVarA2);
                        xf7.a aVar20 = new xf7.a();
                        thf.g gVarE = bVar10.k.e();
                        s.j(gVarE);
                        f0Var = new kg7.f(bVarA2, aVar20, gVarE);
                        break;
                    case 18:
                        return new vf7.c(cVar12.b(), (j60.a) cVar12.d.get());
                    default:
                        throw new AssertionError(i102);
                }
                return f0Var;
            case 22:
                cf7.h hVar9 = (cf7.h) this.d;
                int i103 = this.f18415c;
                if (i103 == 0) {
                    return new xg7.i(new xg7.k(hVar9.f23618b.f23577j.g()), ((cf7.b) this.f18414b).a(), hVar9.f23617a, (g1) hVar9.d.get());
                }
                if (i103 != 1) {
                    throw new AssertionError(i103);
                }
                com.revolut.kompot.navigable.a controller4 = (com.revolut.kompot.navigable.a) hVar9.f23619c.get();
                yg7.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller4, "controller");
                x0 x0Var2 = g1.Companion;
                View decorView2 = controller4.m2().getWindow().getDecorView();
                Intrinsics.checkNotNullExpressionValue(decorView2, "getDecorView(...)");
                return x0.a(x0Var2, decorView2);
            case 23:
                return d();
            case 24:
                return e();
            case 25:
                return f();
            case 26:
                return g();
            case 27:
                return h();
            case 28:
                return i();
            default:
                cwi.h0 h0Var = (cwi.h0) this.f18414b;
                poi.b bVar11 = h0Var.f109697c;
                cwi.x xVar = h0Var.f109695a;
                c0 c0Var = (c0) this.d;
                cwi.h0 h0Var2 = c0Var.f109645b;
                int i104 = this.f18415c;
                if (i104 == 0) {
                    com.revolut.kompot.navigable.a aVar21 = (com.revolut.kompot.navigable.a) c0Var.f109646c.get();
                    xvi.g gVar4 = new xvi.g(h0Var2.f109696b);
                    q0 q0VarJ = bVar11.j();
                    uo.b bVarB3 = bVar11.b();
                    s.j(bVarB3);
                    ho.t tVarC = h0Var2.f109697c.c();
                    s.j(tVarC);
                    return yf6.b.g(aVar21, gVar4, q0VarJ, bVarB3, new xvi.b(tVarC));
                }
                if (i104 != 1) {
                    if (i104 == 2) {
                        return new byi.l((c90.c) c0Var.e.get(), new dyi.c((c90.c) c0Var.e.get()), new dyi.a());
                    }
                    if (i104 != 3) {
                        throw new AssertionError(i104);
                    }
                    com.revolut.kompot.navigable.a controller5 = (com.revolut.kompot.navigable.a) c0Var.f109646c.get();
                    cyi.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(controller5, "controller");
                    return new c90.c(controller5.m2());
                }
                AirportLoungePassDetailsScreenContract$InputData airportLoungePassDetailsScreenContract$InputData = c0Var.f109644a;
                ang.f fVarE2 = h0Var.f109703n.e();
                cli.n nVar8 = (cli.n) c0Var.f.get();
                fkg.a aVarD = h0Var2.f.d();
                dwi.s sVarA = h0Var2.f109695a.a();
                s.j(sVarA);
                fyi.d dVar6 = new fyi.d(aVarD, new dwi.h(sVarA));
                dwi.s sVarA2 = xVar.a();
                s.j(sVarA2);
                qvi.d dVarD = xVar.d();
                s.j(dVarD);
                return new com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_details.b(airportLoungePassDetailsScreenContract$InputData, fVarE2, nVar8, dVar6, sVarA2, dVarD);
        }
    }
}
