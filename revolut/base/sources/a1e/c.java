package a1e;

import afj.f0;
import afj.g0;
import afj.i0;
import afj.j0;
import afj.l0;
import afj.q0;
import afj.r0;
import afj.t0;
import afj.x;
import android.app.Activity;
import android.content.Context;
import at.r;
import com.google.common.collect.ImmutableSet;
import com.hcaptcha.sdk.HCaptchaConfig;
import com.revolut.feature.retail.legacy.login.impl.network.AuthService;
import com.revolut.feature.shared.consent.prompt.builder.impl.ui.screen.ConsentPromptScreenContract$InputData;
import com.revolut.feature.wealth.private_companies.api.ui.details.PrivateCompanyDetailsContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import com.revolut.retail.feature.esim.impl.ui.flows.installation.EsimInstallationFlowContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.device_picker.EsimDevicePickerControllerScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_choose_number.EsimMobilePlanChooseNumberScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_featured_number_selection.EsimMobilePlanFeaturedNumberSelectionScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_my_numbers.EsimMobilePlanMyNumbersScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.pac.number_transfer_confirmation.EsimMobilePlanPacNumberTransferConfirmationScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_action.EsimMobilePlanPhoneNumberActionScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_cancellation_preview.EsimMobilePlanPhoneNumberCancellationPreviewScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_checkout.EsimMobilePlanPhoneNumberCheckoutScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_checkout.EsimMobilePlanPhoneNumberPurchaseStatusDialogFactory;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_label_edit.EsimMobilePlanPhoneNumberLabelEditScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_porting_cancellation.EsimMobilePlanPortingCancellationScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.utils.EsimInstallationDialogBuilder;
import d7d.o;
import dfj.c0;
import dfj.i1;
import dfj.q1;
import dfj.s3;
import dfj.s4;
import dfj.v2;
import dfj.w;
import dfj.w1;
import dfj.z2;
import i1e.u;
import ijj.t;
import java.util.Collection;
import java.util.Optional;
import jid.z;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import rp0.g1;
import rp0.p0;
import rp0.x0;
import tij.q;
import vc.s;
import wp5.y;
import zab.h0;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f604c;
    public final Object d;

    public /* synthetic */ c(Object obj2, Object obj3, int i, int i2) {
        this.f602a = i2;
        this.f604c = obj2;
        this.d = obj3;
        this.f603b = i;
    }

    private final Object a() {
        j0 j0Var = (j0) this.d;
        EsimMobilePlanPhoneNumberLabelEditScreenContract$InputData esimMobilePlanPhoneNumberLabelEditScreenContract$InputData = j0Var.f4296a;
        int i = this.f603b;
        if (i == 0) {
            return new gmj.i((cli.n) j0Var.f4297b.get(), esimMobilePlanPhoneNumberLabelEditScreenContract$InputData, (i1) ((afj.b) this.f604c).g0.get(), new nkj.d());
        }
        if (i == 1) {
            return new gmj.j(new imj.a(), esimMobilePlanPhoneNumberLabelEditScreenContract$InputData);
        }
        throw new AssertionError(i);
    }

    private final Object b() {
        l0 l0Var = (l0) this.d;
        int i = this.f603b;
        if (i == 0) {
            return new lmj.e((cli.n) l0Var.f4325b.get());
        }
        if (i != 1) {
            throw new AssertionError(i);
        }
        EsimMobilePlanPortingCancellationScreenContract$InputData esimMobilePlanPortingCancellationScreenContract$InputData = l0Var.f4324a;
        z80.b bVarS = ((afj.b) this.f604c).f4150p.s();
        s.j(bVarS);
        return new com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_porting_cancellation.a(esimMobilePlanPortingCancellationScreenContract$InputData, bVarS);
    }

    private final Object c() {
        afj.b bVar = (afj.b) this.f604c;
        q0 q0Var = (q0) this.d;
        int i = this.f603b;
        if (i == 0) {
            return new com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_subscription.b(q0Var.f4399a, (z2) bVar.Q0.get());
        }
        if (i != 1) {
            throw new AssertionError(i);
        }
        com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) q0Var.e.get();
        oej.c esimInstallationInteractor = bVar.f4122b.b();
        s.j(esimInstallationInteractor);
        ngj.a.Companion.getClass();
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(esimInstallationInteractor, "esimInstallationInteractor");
        return new ynj.l(controller.m2(), esimInstallationInteractor);
    }

    private final Object d() {
        afj.b bVar = (afj.b) this.f604c;
        r0 r0Var = (r0) this.d;
        int i = this.f603b;
        if (i == 0) {
            return new com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_cancellation.b(r0Var.f4416a, (cli.n) r0Var.d.get(), (s4) bVar.f4139j1.get(), new mjj.f(), (w) bVar.f4135h0.get(), ((s41.a) bVar.f4164w).d());
        }
        if (i == 1) {
            return new t(r0Var.f4416a, new mjj.d(new mjj.a((f01.a) r0Var.f4418c.get(), 0), afj.b.b()), new mjj.e(afj.b.b()), new mjj.b(afj.b.b()));
        }
        if (i != 2) {
            throw new AssertionError(i);
        }
        ViewController viewController = r0Var.f4417b;
        ljj.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(viewController, "viewController");
        return new f01.c(viewController.m2());
    }

    private final Object e() {
        t0 t0Var = (t0) this.d;
        afj.b bVar = (afj.b) this.f604c;
        int i = this.f603b;
        if (i == 0) {
            return new com.revolut.retail.feature.esim.impl.ui.flows.refund.c(t0Var.f4447a, bVar.z.a(), (z2) bVar.Q0.get());
        }
        if (i != 1) {
            throw new AssertionError(i);
        }
        com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) t0Var.e.get();
        oej.c esimInstallationInteractor = bVar.f4122b.b();
        s.j(esimInstallationInteractor);
        qgj.a.Companion.getClass();
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(esimInstallationInteractor, "esimInstallationInteractor");
        return new ynj.l(controller.m2(), esimInstallationInteractor);
    }

    @Override // phm.a
    public final Object get() {
        Object cVar;
        Object bVar;
        switch (this.f602a) {
            case 0:
                b bVar2 = (b) this.f604c;
                d dVar = (d) this.d;
                int i = this.f603b;
                switch (i) {
                    case 0:
                        o0h.b bVar3 = dVar.f605a;
                        o0h.a aVar = dVar.f606b;
                        o0h.b bVar4 = dVar.f605a;
                        b bVar5 = dVar.f607c;
                        ou5.b bVarA = bVar2.f593h.a();
                        p9h.a aVar2 = bVar5.f593h;
                        return nga.c.y(bVar3, bVarA, nga.c.C(bVar4, aVar2.a(), nga.c.B(aVar, bVar5.f593h.a()), nga.c.A(bVar4, bVar5.f593h.a()), nga.c.D(aVar, aVar2.a(), (ln.a) dVar.d.get())), new en.c(ImmutableSet.of((ln.d) dVar.d.get()), (sri.m) bVar5.f598p.get()), (n0h.a) dVar.e.get());
                    case 1:
                        return new ln.c();
                    case 2:
                        return s2l.c.k((r60.b) dVar.i.get());
                    case 3:
                        return com.revolut.data.database.models.openbanking.d.w((com.revolut.kompot.navigable.a) dVar.f608g.get(), (p0) dVar.f609h.get());
                    case 4:
                        return new p0();
                    case 5:
                        e4m.e eVar = dVar.f612m;
                        b bVar6 = dVar.f607c;
                        return new i1e.s((p) eVar.get(), bVar2.f589a.q(), new zjh.j((f1e.d) bVar6.f601s.get()), (r60.b) dVar.i.get(), nga.c.B(dVar.f606b, bVar6.f593h.a()), (i1e.f) dVar.f613n.get());
                    case 6:
                        return new u(nga.c.A(dVar.f605a, dVar.f607c.f593h.a()), (i1e.j) dVar.k.get(), (i1e.i) dVar.f611l.get());
                    case 7:
                        return new j1e.c();
                    case 8:
                        return new j1e.b();
                    case 9:
                        return new j1e.a();
                    default:
                        throw new AssertionError(i);
                }
            case 1:
                a7d.d dVar2 = (a7d.d) this.d;
                int i2 = this.f603b;
                if (i2 == 0) {
                    p pVar = (p) dVar2.f1845b.get();
                    ConsentPromptScreenContract$InputData consentPromptScreenContract$InputData = dVar2.f1844a;
                    ld8.c cVar2 = (ld8.c) ((a7d.b) this.f604c).f1839a.f173011r.get();
                    s.j(cVar2);
                    return new d7d.n(pVar, consentPromptScreenContract$InputData, cVar2, (g1) dVar2.d.get());
                }
                if (i2 == 1) {
                    return new o();
                }
                if (i2 != 2) {
                    throw new AssertionError(i2);
                }
                com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) dVar2.f1846c.get();
                e7d.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller, "controller");
                return x0.a(g1.Companion, controller.D2());
            case 2:
                a9i.a aVar3 = (a9i.a) this.d;
                xoi.d dVar3 = aVar3.f2658a;
                int i3 = this.f603b;
                if (i3 == 0) {
                    return new iri.g((iri.j) ((a9i.c) this.f604c).f2668h.get(), new iri.b(), bq.i.f(dVar3), bq.i.l(dVar3));
                }
                if (i3 == 1) {
                    return new iri.l(new iri.b(), bq.i.f(dVar3), (iri.d) aVar3.e.get());
                }
                if (i3 == 2) {
                    return new iri.d(bq.i.f(dVar3));
                }
                if (i3 == 3) {
                    return bq.i.t(dVar3);
                }
                throw new AssertionError(i3);
            case 3:
                abb.a aVar4 = (abb.a) this.f604c;
                abb.b bVar7 = (abb.b) this.d;
                int i5 = this.f603b;
                switch (i5) {
                    case 0:
                        return kpi.f.a();
                    case 1:
                        Context contextI = bq.i.i(bVar7.f2909a);
                        BaseDelegatesActivity baseDelegatesActivityF = bq.i.f(bVar7.f2909a);
                        t70.g gVarO = aVar4.f2894b.o();
                        s.j(gVarO);
                        cVar = new npi.c(contextI, baseDelegatesActivityF, gVarO);
                        return cVar;
                    case 2:
                        return new tpi.i((rpi.c) bVar7.e.get(), gsi.c.a(bVar7.f2909a));
                    case 3:
                        return new rpi.b(bq.i.b(bVar7.f2909a));
                    case 4:
                        return new rpi.h(bq.i.b(bVar7.f2909a));
                    case 5:
                        cVar = new iri.g((iri.j) aVar4.f2900m.get(), new iri.b(), bq.i.f(bVar7.f2909a), bq.i.l(bVar7.f2909a));
                        return cVar;
                    case 6:
                        return new iri.l(new iri.b(), bq.i.f(bVar7.f2909a), (iri.d) bVar7.i.get());
                    case 7:
                        return new iri.d(bq.i.f(bVar7.f2909a));
                    case 8:
                        return new opi.b(bq.i.f(bVar7.f2909a));
                    case 9:
                        bVar7.getClass();
                        cVar = new cn.d(ImmutableSet.copyOf((Collection) dn.b.a()), (cn.e) aVar4.f2901n.get(), aVar4.a());
                        return cVar;
                    case 10:
                        um.c cVar3 = (um.c) aVar4.o.get();
                        bVar7.getClass();
                        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(5);
                        abb.a aVar5 = bVar7.f2910b;
                        hn.h hVar = (hn.h) aVar5.f2902p.get();
                        t70.g gVarO2 = aVar5.f2894b.o();
                        s.j(gVarO2);
                        builderBuilderWithExpectedSize.add(new jn.a(hVar, gVarO2));
                        builderBuilderWithExpectedSize.add(new vm.b(com.google.android.gms.internal.mlkit_vision_face.a.f()));
                        builderBuilderWithExpectedSize.add(aVar5.b());
                        builderBuilderWithExpectedSize.addAll((Iterable) in.g.a());
                        builderBuilderWithExpectedSize.add(new jn.d(e4m.b.a(bVar7.f2916m)));
                        cVar = new in.e(cVar3, builderBuilderWithExpectedSize.build(), aVar4.a());
                        return cVar;
                    case 11:
                        return bq.i.t(bVar7.f2909a);
                    case 12:
                        bVar7.getClass();
                        ImmutableSet.Builder builderBuilderWithExpectedSize2 = ImmutableSet.builderWithExpectedSize(3);
                        builderBuilderWithExpectedSize2.addAll((Iterable) kn.g.a());
                        builderBuilderWithExpectedSize2.add(bVar7.o.get());
                        builderBuilderWithExpectedSize2.add(new kn.h(e4m.b.a(bVar7.f)));
                        cVar = new kn.e(builderBuilderWithExpectedSize2.build(), (ym.d) aVar4.f2904r.get(), aVar4.a());
                        return cVar;
                    case 13:
                        return new zm.a();
                    case 14:
                        bVar7.getClass();
                        ImmutableSet.Builder builderBuilderWithExpectedSize3 = ImmutableSet.builderWithExpectedSize(2);
                        builderBuilderWithExpectedSize3.addAll((Iterable) hn.g.a());
                        builderBuilderWithExpectedSize3.add(bVar7.f2910b.b());
                        cVar = new hn.d(builderBuilderWithExpectedSize3.build(), (hn.h) aVar4.f2902p.get(), (npi.f) bVar7.d.get());
                        return cVar;
                    case 15:
                        return new en.c(ImmutableSet.of((ln.d) bVar7.f2910b.f2903q.get()), bq.i.l(bVar7.f2909a));
                    case 16:
                        cVar = new gn.c((lpi.e) bVar7.f2921s.get(), (sm.e) aVar4.f2906t.get(), ImmutableSet.copyOf((Collection) gn.e.a()), aVar4.a());
                        return cVar;
                    case 17:
                        return new lpi.b(bq.i.i(bVar7.f2909a), bq.i.j(bVar7.f2909a));
                    case 18:
                        bVar7.getClass();
                        cVar = new in.e(ImmutableSet.copyOf((Collection) pm.b.a()), (om.c) aVar4.u.get(), aVar4.a());
                        return cVar;
                    case 19:
                        hu2.a aVar6 = (hu2.a) bVar7.v.get();
                        xoi.d dVar4 = bVar7.f2909a;
                        com.hcaptcha.sdk.a aVarL = jr9.h.l(bq.i.b(dVar4));
                        Activity context = bq.i.b(dVar4);
                        abb.f.Companion.getClass();
                        Intrinsics.checkNotNullParameter(context, "activity");
                        Intrinsics.checkNotNullParameter(context, "context");
                        Object obj2 = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.get("com.hcaptcha.sdk.site-key");
                        if (obj2 == null) {
                            throw new IllegalStateException("HCaptcha site key must be specified in the Android manifest.");
                        }
                        HCaptchaConfig hCaptchaConfigM = jr9.h.m((String) obj2);
                        aoi.c cVarA = aoi.f.a();
                        dm0.d dVarD = bVar7.f2910b.d.d();
                        s.j(dVarD);
                        return new gu2.b(aVar6, new ku2.h(aVarL, hCaptchaConfigM, cVarA, dVarD));
                    case 20:
                        fk3.a aVarA = aVar4.f2895c.a();
                        s.j(aVarA);
                        bVar = new o5j.b(aVarA);
                        return bVar;
                    case 21:
                        return new gqi.b(bq.i.b(bVar7.f2909a));
                    case 22:
                        e4m.e eVar2 = bVar7.f2916m;
                        xoi.d dVar5 = bVar7.f2909a;
                        f9b.f fVar = (f9b.f) eVar2.get();
                        f01.c cVarO = bq.i.o(dVar5);
                        zab.d dVar6 = (zab.d) aVar4.f2908x.get();
                        zab.h hVar2 = (zab.h) aVar4.f2907w.get();
                        sri.m mVarL = bq.i.l(dVar5);
                        tpi.j jVar = (tpi.j) bVar7.f.get();
                        AuthService authService = (AuthService) aVar4.v.get();
                        k21.c cVar4 = (k21.c) ((c21.b) aVar4.f2896g).f20564d0.get();
                        s.j(cVar4);
                        z80.b bVarS = aVar4.f2894b.s();
                        s.j(bVarS);
                        tl0.a aVarC = aVar4.d.c();
                        zm0.c cVarJ = aVar4.f2898j.j();
                        s.j(cVarJ);
                        bVar = new zab.t(fVar, cVarO, dVar6, hVar2, mVarL, jVar, authService, cVar4, bVarS, aVarC, cVarJ, (gu2.b) bVar7.f2923w.get(), (zab.e) bVar7.f2924x.get(), (opi.d) bVar7.k.get());
                        return bVar;
                    case 23:
                        return new h0();
                    default:
                        throw new AssertionError(i5);
                }
            case 4:
                af5.a aVar7 = (af5.a) this.d;
                af5.d dVar7 = (af5.d) this.f604c;
                int i6 = this.f603b;
                if (i6 == 0) {
                    std.a extension = (std.a) aVar7.f3887b.get();
                    hf5.c.Companion.getClass();
                    Intrinsics.checkNotNullParameter(extension, "extension");
                    zhm.h0 h0Var = extension.f265555l;
                    s.k(h0Var);
                    return h0Var;
                }
                if (i6 == 1) {
                    gud.b bVarA2 = dVar7.f3896h.a();
                    qy5.a factory = new qy5.a(bVarA2);
                    hf5.c.Companion.getClass();
                    Intrinsics.checkNotNullParameter(factory, "factory");
                    return new dud.a(bVarA2);
                }
                if (i6 != 2) {
                    throw new AssertionError(i6);
                }
                gf5.f fVar2 = new gf5.f(aVar7.f3886a.f3892a.f249364b.h());
                yud.g gVarD = dVar7.f3892a.d();
                df5.b bVar8 = new df5.b(dVar7.f.e(), 0);
                std.a aVar8 = (std.a) aVar7.f3887b.get();
                sh5.d dVarF = dVar7.i.f();
                s.j(dVarF);
                return new gf5.h(fVar2, gVarD, bVar8, aVar8, dVarF);
            case 5:
                afh.b bVar9 = (afh.b) this.d;
                afh.e eVar3 = (afh.e) this.f604c;
                r7d.l lVar = eVar3.f4093h;
                u8h.c cVar5 = eVar3.f4092g;
                int i21 = this.f603b;
                if (i21 == 0) {
                    return kii.e.j((u8h.b) cVar5, "factory");
                }
                if (i21 == 1) {
                    return h7d.d.a(bVar9.f4068b, (i7d.o) bVar9.e.get(), lVar.d());
                }
                if (i21 == 2) {
                    return h7d.f.a(lVar.d(), Optional.empty());
                }
                if (i21 == 3) {
                    return new hfh.h((d1h.e) bVar9.d.get(), (i7d.o) bVar9.e.get(), new hfh.i((d1h.h) bVar9.f4070g.get(), 0));
                }
                if (i21 == 4) {
                    return kii.e.k((u8h.b) cVar5);
                }
                throw new AssertionError(i21);
            case 6:
                afh.e eVar4 = (afh.e) this.f604c;
                afh.c cVar6 = (afh.c) this.d;
                int i22 = this.f603b;
                switch (i22) {
                    case 0:
                        return oyj.c.e(((z3h.g) eVar4.f4089a).a(), cVar6.f4072a, (n2h.a) cVar6.f.get());
                    case 1:
                        z zVarA = ((z3h.g) eVar4.f4089a).a();
                        PrivateCompanyDetailsContract$InputData inputData = cVar6.f4073b;
                        dfh.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(inputData, "inputData");
                        return oyj.c.g(zVarA, new n2h.e(inputData.f95721a.f95722a, true), new zjh.f((gdh.a) cVar6.e.get()));
                    case 2:
                        kbb.c factory2 = eVar4.f4090b.a();
                        Intrinsics.checkNotNullParameter(factory2, "factory");
                        return factory2.s();
                    case 3:
                        return kxa.j.m((j60.a) cVar6.f4077j.get());
                    case 4:
                        return y.r((com.revolut.kompot.navigable.a) cVar6.f4076h.get(), (rp0.m) cVar6.i.get());
                    case 5:
                        return new rp0.m();
                    case 6:
                        gdh.a aVar9 = (gdh.a) cVar6.e.get();
                        f9f.b.e(aVar9);
                        return aVar9;
                    case 7:
                        return f9f.b.j((gdh.a) cVar6.e.get());
                    case 8:
                        l1d.a extension2 = (l1d.a) cVar6.f4080n.get();
                        efh.c.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension2, "extension");
                        s.k(extension2);
                        return extension2;
                    case 9:
                        k2d.d dVar8 = eVar4.f4091c;
                        m2d.a factory3 = new m2d.a();
                        efh.c.Companion.getClass();
                        Intrinsics.checkNotNullParameter(factory3, "factory");
                        return m2d.a.a();
                    case 10:
                        u1d.a extension3 = (u1d.a) cVar6.f4081p.get();
                        efh.c.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension3, "extension");
                        s.k(extension3);
                        return extension3;
                    case 11:
                        jpc.e factory4 = eVar4.d.a();
                        j60.a bottomExpandableDialogControllerExtension = (j60.a) cVar6.f4077j.get();
                        efh.c.Companion.getClass();
                        Intrinsics.checkNotNullParameter(factory4, "factory");
                        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
                        return factory4.c("COMBINED_WATCHLIST_ORDERING_SECURITIES", bottomExpandableDialogControllerExtension);
                    case 12:
                        ybl.b bVarB = eVar4.e.b();
                        s.j(bVarB);
                        gte.a aVarB = eVar4.f.b();
                        s.j(aVarB);
                        l1d.a aVar10 = (l1d.a) cVar6.f4080n.get();
                        u1d.a aVar11 = (u1d.a) cVar6.f4081p.get();
                        n2h.a aVar12 = (n2h.a) cVar6.f.get();
                        afh.e eVar5 = cVar6.f4074c;
                        m2d.a factory5 = new m2d.a();
                        efh.c.Companion.getClass();
                        Intrinsics.checkNotNullParameter(factory5, "factory");
                        q2d.a aVar13 = new q2d.a();
                        jpc.e factory6 = eVar5.d.a();
                        Intrinsics.checkNotNullParameter(factory6, "factory");
                        ffh.c cVar7 = new ffh.c(aVar13, new o3d.f());
                        z factory7 = ((z3h.g) eVar5.f4089a).a();
                        p2h.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(factory7, "factory");
                        return new bfh.o(bVarB, aVarB, aVar10, aVar11, aVar12, new ffh.b(cVar7, new m3h.c((d4h.b) factory7.f174462c)), cVar6.f4073b);
                    default:
                        throw new AssertionError(i22);
                }
            case 7:
                afh.d dVar9 = (afh.d) this.d;
                afh.e eVar6 = (afh.e) this.f604c;
                r7d.l lVar2 = eVar6.f4093h;
                u8h.c cVar8 = eVar6.f4092g;
                int i32 = this.f603b;
                if (i32 == 0) {
                    return kii.e.j((u8h.b) cVar8, "factory");
                }
                if (i32 == 1) {
                    return h7d.d.a(dVar9.f4085b, (i7d.o) dVar9.e.get(), lVar2.d());
                }
                if (i32 == 2) {
                    return h7d.f.a(lVar2.d(), Optional.empty());
                }
                if (i32 == 3) {
                    return new jfh.h((d1h.e) dVar9.d.get(), (i7d.o) dVar9.e.get(), new hfh.i((d1h.h) dVar9.f4087g.get(), 1));
                }
                if (i32 == 4) {
                    return kii.e.k((u8h.b) cVar8);
                }
                throw new AssertionError(i32);
            case 8:
                afj.c cVar9 = (afj.c) this.d;
                afj.b bVar10 = (afj.b) this.f604c;
                int i33 = this.f603b;
                if (i33 == 0) {
                    wj0.a aVarI = ((nj0.d) bVar10.f4134h).i();
                    s.j(aVarI);
                    return new com.revolut.retail.feature.esim.impl.ui.flows.checkout.c(aVarI, cVar9.f4182a, bVar10.z.a());
                }
                if (i33 != 1) {
                    throw new AssertionError(i33);
                }
                com.revolut.kompot.navigable.a controller2 = (com.revolut.kompot.navigable.a) cVar9.e.get();
                oej.c esimInstallationInteractor = bVar10.f4122b.b();
                s.j(esimInstallationInteractor);
                ufj.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller2, "controller");
                Intrinsics.checkNotNullParameter(esimInstallationInteractor, "esimInstallationInteractor");
                return new ynj.l(controller2.m2(), esimInstallationInteractor);
            case 9:
                afj.b bVar11 = (afj.b) this.f604c;
                int i43 = this.f603b;
                if (i43 == 0) {
                    return new com.revolut.retail.feature.esim.impl.ui.flows.troubleshooting.b((z2) bVar11.Q0.get());
                }
                if (i43 != 1) {
                    throw new AssertionError(i43);
                }
                com.revolut.kompot.navigable.a controller3 = (com.revolut.kompot.navigable.a) ((afj.f) this.d).e.get();
                oej.c esimInstallationInteractor2 = bVar11.f4122b.b();
                s.j(esimInstallationInteractor2);
                vgj.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller3, "controller");
                Intrinsics.checkNotNullParameter(esimInstallationInteractor2, "esimInstallationInteractor");
                return new ynj.l(controller3.m2(), esimInstallationInteractor2);
            case 10:
                afj.h hVar3 = (afj.h) this.d;
                ite.a aVar14 = ((afj.b) this.f604c).f4120a;
                int i59 = this.f603b;
                if (i59 == 0) {
                    EsimDevicePickerControllerScreenContract$InputData esimDevicePickerControllerScreenContract$InputData = hVar3.f4263a;
                    gte.a aVarB2 = aVar14.b();
                    s.j(aVarB2);
                    return new khj.j(esimDevicePickerControllerScreenContract$InputData, aVarB2, (cli.n) hVar3.f4264b.get());
                }
                if (i59 != 1) {
                    throw new AssertionError(i59);
                }
                gte.a aVarB3 = aVar14.b();
                s.j(aVarB3);
                return new khj.l(aVarB3);
            case 11:
                afj.b bVar12 = (afj.b) this.f604c;
                afj.i iVar = (afj.i) this.d;
                afj.b bVar13 = iVar.f4278a;
                int i66 = this.f603b;
                if (i66 == 0) {
                    cli.n nVar = (cli.n) iVar.f4279b.get();
                    c70.a aVarZ = bVar12.f4150p.z();
                    s.j(aVarZ);
                    gte.a aVarB4 = bVar12.f4120a.b();
                    s.j(aVarB4);
                    return new rhj.l(nVar, aVarZ, aVarB4, (gfj.b) bVar12.m0.get(), new g2e.t(((n86.d) bVar13.f4152q).d()), new r10.d((c0) bVar13.f4124b1.get(), new g2e.t(((n86.d) bVar13.f4152q).d())), new nkj.d());
                }
                if (i66 != 1) {
                    throw new AssertionError(i66);
                }
                jm0.a aVar15 = bVar13.f4144m;
                dm0.d dVarD2 = aVar15.d();
                s.j(dVarD2);
                dm0.d dVarD3 = aVar15.d();
                s.j(dVarD3);
                return new qee.s(new thj.a(new q(dVarD2, new tb4.t(dVarD3), bVar13.a(), bVar13.d())));
            case 12:
                afj.m mVar = (afj.m) this.d;
                afj.b bVar14 = (afj.b) this.f604c;
                int i74 = this.f603b;
                if (i74 == 0) {
                    return new com.revolut.retail.feature.esim.impl.ui.flows.home.c(mVar.f4336a, (w) bVar14.f4135h0.get(), (bej.a) bVar14.G0.get(), (cej.b) bVar14.X.get(), (z2) bVar14.Q0.get());
                }
                if (i74 != 1) {
                    throw new AssertionError(i74);
                }
                com.revolut.kompot.navigable.a controller4 = (com.revolut.kompot.navigable.a) mVar.e.get();
                oej.c esimInstallationInteractor3 = bVar14.f4122b.b();
                s.j(esimInstallationInteractor3);
                yfj.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller4, "controller");
                Intrinsics.checkNotNullParameter(esimInstallationInteractor3, "esimInstallationInteractor");
                return new ynj.l(controller4.m2(), esimInstallationInteractor3);
            case 13:
                afj.b bVar15 = (afj.b) this.f604c;
                nej.a aVar16 = bVar15.f4122b;
                afj.n nVar2 = (afj.n) this.d;
                int i92 = this.f603b;
                if (i92 == 0) {
                    oej.c cVarB = aVar16.b();
                    s.j(cVarB);
                    ynj.l lVar3 = (ynj.l) nVar2.e.get();
                    EsimInstallationDialogBuilder esimInstallationDialogBuilder = new EsimInstallationDialogBuilder();
                    afj.b bVar16 = nVar2.f4351b;
                    return new chj.g(cVarB, lVar3, esimInstallationDialogBuilder, new r10.w((v2) bVar16.R.get(), bVar16.f4156s.b()));
                }
                if (i92 == 1) {
                    com.revolut.kompot.navigable.a controller5 = (com.revolut.kompot.navigable.a) nVar2.d.get();
                    oej.c esimInstallationInteractor4 = aVar16.b();
                    s.j(esimInstallationInteractor4);
                    agj.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(controller5, "controller");
                    Intrinsics.checkNotNullParameter(esimInstallationInteractor4, "esimInstallationInteractor");
                    return new ynj.l(controller5.m2(), esimInstallationInteractor4);
                }
                if (i92 != 2) {
                    throw new AssertionError(i92);
                }
                EsimInstallationFlowContract$InputData esimInstallationFlowContract$InputData = nVar2.f4350a;
                chj.d dVar10 = (chj.d) nVar2.f.get();
                ajj.a aVar17 = new ajj.a();
                gte.a aVarB5 = bVar15.f4120a.b();
                s.j(aVarB5);
                return new com.revolut.retail.feature.esim.impl.ui.flows.installation.a(esimInstallationFlowContract$InputData, dVar10, aVar17, aVarB5);
            case 14:
                afj.o oVar = (afj.o) this.d;
                int i96 = this.f603b;
                if (i96 == 0) {
                    return new cjj.i((cli.n) oVar.f4367b.get(), oVar.f4366a, (i1) ((afj.b) this.f604c).g0.get());
                }
                if (i96 == 1) {
                    return new r(new ejj.b(), new ejj.a(), new ejj.c());
                }
                throw new AssertionError(i96);
            case 15:
                afj.p pVar2 = (afj.p) this.d;
                int i99 = this.f603b;
                if (i99 == 0) {
                    return new com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_cancellation.a(pVar2.f4381a);
                }
                if (i99 != 1) {
                    throw new AssertionError(i99);
                }
                com.revolut.kompot.navigable.a controller6 = (com.revolut.kompot.navigable.a) pVar2.e.get();
                oej.c esimInstallationInteractor5 = ((afj.b) this.f604c).f4122b.b();
                s.j(esimInstallationInteractor5);
                cgj.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller6, "controller");
                Intrinsics.checkNotNullParameter(esimInstallationInteractor5, "esimInstallationInteractor");
                return new ynj.l(controller6.m2(), esimInstallationInteractor5);
            case 16:
                afj.b bVar17 = (afj.b) this.f604c;
                afj.q qVar = (afj.q) this.d;
                int i100 = this.f603b;
                if (i100 == 0) {
                    return new com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_checkout.b(qVar.f4396a, bVar17.z.a());
                }
                if (i100 != 1) {
                    throw new AssertionError(i100);
                }
                com.revolut.kompot.navigable.a controller7 = (com.revolut.kompot.navigable.a) qVar.e.get();
                oej.c esimInstallationInteractor6 = bVar17.f4122b.b();
                s.j(esimInstallationInteractor6);
                egj.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller7, "controller");
                Intrinsics.checkNotNullParameter(esimInstallationInteractor6, "esimInstallationInteractor");
                return new ynj.l(controller7.m2(), esimInstallationInteractor6);
            case 17:
                afj.s sVar = (afj.s) this.d;
                EsimMobilePlanChooseNumberScreenContract$InputData esimMobilePlanChooseNumberScreenContract$InputData = sVar.f4428a;
                int i101 = this.f603b;
                if (i101 == 0) {
                    return new rjj.h((cli.n) sVar.f4429b.get(), esimMobilePlanChooseNumberScreenContract$InputData);
                }
                if (i101 != 1) {
                    throw new AssertionError(i101);
                }
                gte.a aVarB6 = ((afj.b) this.f604c).f4120a.b();
                s.j(aVarB6);
                return new rjj.j(esimMobilePlanChooseNumberScreenContract$InputData, aVarB6);
            case 18:
                afj.b bVar18 = (afj.b) this.f604c;
                x xVar = (x) this.d;
                EsimMobilePlanFeaturedNumberSelectionScreenContract$InputData esimMobilePlanFeaturedNumberSelectionScreenContract$InputData = xVar.f4513a;
                int i102 = this.f603b;
                if (i102 == 0) {
                    return new dkj.l(esimMobilePlanFeaturedNumberSelectionScreenContract$InputData, (i1) bVar18.g0.get(), new ugc.a(afj.b.b()), (cli.n) xVar.f4514b.get());
                }
                if (i102 != 1) {
                    throw new AssertionError(i102);
                }
                z80.b bVarS2 = bVar18.f4150p.s();
                s.j(bVarS2);
                return new dkj.m(esimMobilePlanFeaturedNumberSelectionScreenContract$InputData, bVarS2);
            case 19:
                afj.b bVar19 = (afj.b) this.f604c;
                afj.y yVar = (afj.y) this.d;
                afj.b bVar20 = yVar.f4526b;
                int i103 = this.f603b;
                if (i103 == 0) {
                    EsimMobilePlanMyNumbersScreenContract$InputData esimMobilePlanMyNumbersScreenContract$InputData = yVar.f4525a;
                    cli.n nVar3 = (cli.n) yVar.f4527c.get();
                    s3 s3Var = (s3) bVar19.f4140k0.get();
                    i1 i1Var = (i1) bVar19.g0.get();
                    nkj.d dVar11 = new nkj.d();
                    ynj.p pVar3 = new ynj.p();
                    z80.b bVarS3 = bVar20.f4150p.s();
                    s.j(bVarS3);
                    return new com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_my_numbers.a(esimMobilePlanMyNumbersScreenContract$InputData, nVar3, s3Var, i1Var, dVar11, pVar3, new lkj.a(bVarS3), (q1) bVar19.f4130e1.get());
                }
                if (i103 != 1) {
                    throw new AssertionError(i103);
                }
                z80.b bVarS4 = bVar20.f4150p.s();
                s.j(bVarS4);
                ynj.p esimPhoneNumberStateResolver = new ynj.p();
                Intrinsics.checkNotNullParameter(esimPhoneNumberStateResolver, "esimPhoneNumberStateResolver");
                okj.b bVar21 = new okj.b();
                nkj.e eVar7 = new nkj.e();
                ynj.p phoneNumberStateResolver = new ynj.p();
                Intrinsics.checkNotNullParameter(phoneNumberStateResolver, "phoneNumberStateResolver");
                nkj.c cVar10 = new nkj.c(bVarS4, bVar21, eVar7, new nkj.f());
                ynj.p esimPhoneNumberStateResolver2 = new ynj.p();
                Intrinsics.checkNotNullParameter(esimPhoneNumberStateResolver2, "esimPhoneNumberStateResolver");
                return new kkj.s(cVar10, new nkj.b());
            case 20:
                afj.b bVar22 = (afj.b) this.f604c;
                f0 f0Var = (f0) this.d;
                int i104 = this.f603b;
                if (i104 == 0) {
                    cli.n nVar4 = (cli.n) f0Var.f4238c.get();
                    EsimMobilePlanPacNumberTransferConfirmationScreenContract$InputData esimMobilePlanPacNumberTransferConfirmationScreenContract$InputData = f0Var.f4236a;
                    s70.a aVarM = bVar22.f4150p.m();
                    s.j(aVarM);
                    return new com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.pac.number_transfer_confirmation.b(nVar4, esimMobilePlanPacNumberTransferConfirmationScreenContract$InputData, aVarM, new nd.k(new olj.a()), (q1) bVar22.f4130e1.get(), (f01.a) f0Var.e.get(), new skj.a());
                }
                if (i104 == 1) {
                    EsimMobilePlanPacNumberTransferConfirmationScreenContract$InputData esimMobilePlanPacNumberTransferConfirmationScreenContract$InputData2 = f0Var.f4236a;
                    ugc.a aVar18 = new ugc.a(afj.b.b());
                    z80.b bVarS5 = f0Var.f4237b.f4150p.s();
                    s.j(bVarS5);
                    return new elj.p(esimMobilePlanPacNumberTransferConfirmationScreenContract$InputData2, aVar18, new rlj.a(bVarS5, new ynj.e()), new rlj.c());
                }
                if (i104 != 2) {
                    throw new AssertionError(i104);
                }
                com.revolut.kompot.navigable.a controller8 = (com.revolut.kompot.navigable.a) f0Var.d.get();
                flj.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller8, "controller");
                return new f01.c(controller8.m2());
            case 21:
                g0 g0Var = (g0) this.d;
                EsimMobilePlanPhoneNumberActionScreenContract$InputData esimMobilePlanPhoneNumberActionScreenContract$InputData = g0Var.f4251a;
                int i105 = this.f603b;
                if (i105 != 0) {
                    if (i105 == 1) {
                        return new zlj.q(esimMobilePlanPhoneNumberActionScreenContract$InputData, new ynj.p());
                    }
                    throw new AssertionError(i105);
                }
                cli.n nVar5 = (cli.n) g0Var.f4252b.get();
                c70.a aVarZ2 = ((afj.b) this.f604c).f4150p.z();
                s.j(aVarZ2);
                return new zlj.o(nVar5, esimMobilePlanPhoneNumberActionScreenContract$InputData, aVarZ2);
            case 22:
                afj.b bVar23 = (afj.b) this.f604c;
                afj.h0 h0Var2 = (afj.h0) this.d;
                EsimMobilePlanPhoneNumberCancellationPreviewScreenContract$InputData esimMobilePlanPhoneNumberCancellationPreviewScreenContract$InputData = h0Var2.f4266a;
                int i106 = this.f603b;
                if (i106 == 0) {
                    return new bmj.h((cli.n) h0Var2.f4267b.get(), esimMobilePlanPhoneNumberCancellationPreviewScreenContract$InputData, (i1) bVar23.g0.get());
                }
                if (i106 != 1) {
                    throw new AssertionError(i106);
                }
                z80.b bVarS6 = bVar23.f4150p.s();
                s.j(bVarS6);
                return new bmj.i(esimMobilePlanPhoneNumberCancellationPreviewScreenContract$InputData, bVarS6);
            case 23:
                i0 i0Var = (i0) this.d;
                afj.b bVar24 = i0Var.f4282b;
                afj.b bVar25 = (afj.b) this.f604c;
                int i107 = this.f603b;
                if (i107 == 0) {
                    cli.n nVar6 = (cli.n) i0Var.f4283c.get();
                    EsimMobilePlanPhoneNumberCheckoutScreenContract$InputData esimMobilePlanPhoneNumberCheckoutScreenContract$InputData = i0Var.f4281a;
                    i90.b bVar26 = new i90.b();
                    bej.e eVar8 = (bej.e) bVar25.f4151p1.get();
                    q7c.g gVarE = bVar25.k.e();
                    nyb.k kVarC = bVar25.f4166x.c();
                    s.j(kVarC);
                    return new com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_checkout.c(nVar6, esimMobilePlanPhoneNumberCheckoutScreenContract$InputData, bVar26, eVar8, gVarE, kVarC, (s3) bVar25.f4140k0.get(), ((s41.a) bVar25.f4164w).d(), (bej.m) bVar25.F0.get(), new unj.j(), (w1) bVar25.q1.get(), new EsimMobilePlanPhoneNumberPurchaseStatusDialogFactory());
                }
                if (i107 != 1) {
                    throw new AssertionError(i107);
                }
                dec.r rVar = new dec.r();
                dec.g gVar = new dec.g();
                dec.a aVar19 = new dec.a();
                l80.e eVarH = bVar24.f4150p.h();
                s.j(eVarH);
                qjj.f fVar3 = new qjj.f(new dec.q(rVar, gVar, aVar19, eVarH));
                com.revolut.retail.feature.esim.impl.ui.screens.checkout.mappers.a aVar20 = new com.revolut.retail.feature.esim.impl.ui.screens.checkout.mappers.a(new ghj.a(), afj.b.b());
                fmj.b finalPriceMapper = new fmj.b();
                Intrinsics.checkNotNullParameter(finalPriceMapper, "finalPriceMapper");
                fmj.a aVar21 = new fmj.a();
                fmj.d dVar12 = new fmj.d();
                z80.b bVarS7 = bVar24.f4150p.s();
                s.j(bVarS7);
                return new dmj.x0(fVar3, aVar20, aVar21, dVar12, new fmj.f(bVarS7));
            case 24:
                return a();
            case 25:
                return b();
            case 26:
                return c();
            case 27:
                return d();
            case 28:
                return e();
            default:
                afj.b bVar27 = (afj.b) this.f604c;
                afj.x0 x0Var = (afj.x0) this.d;
                int i108 = this.f603b;
                if (i108 == 0) {
                    return new com.revolut.retail.feature.esim.impl.ui.flows.subscription.b(x0Var.f4516a, (z2) bVar27.Q0.get());
                }
                if (i108 != 1) {
                    throw new AssertionError(i108);
                }
                com.revolut.kompot.navigable.a controller9 = (com.revolut.kompot.navigable.a) x0Var.e.get();
                oej.c esimInstallationInteractor7 = bVar27.f4122b.b();
                s.j(esimInstallationInteractor7);
                tgj.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller9, "controller");
                Intrinsics.checkNotNullParameter(esimInstallationInteractor7, "esimInstallationInteractor");
                return new ynj.l(controller9.m2(), esimInstallationInteractor7);
        }
    }
}
