package ql7;

import android.app.Activity;
import android.content.Context;
import ch.qos.logback.core.rolling.SizeBasedTriggeringPolicy;
import com.revolut.feature.insurance_car.impl.ui.flow.delivery.DeliveryFlowContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.screen.mta.date.MtaDateSelectorScreenContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.screen.mta.review.MtaReviewScreenContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.screen.mta.view_driver.ViewDriverScreenContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.car.search.CarSearchScreenContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.date.DateSelectorScreenContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.plan_selection.MotorPlanSelectorScreenContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.survey.claims_details.ClaimsDetailsScreenContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.screen.policy.details.PolicyDetailsScreenContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.screen.policy.summary.PolicySummaryScreenContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.screen.policy.telematic_device.delivery.DeviceDeliveryScreenContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.screen.upload_documents.files.UploadFilesListScreenContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.screen.upload_documents.preview.DocumentsPreviewScreenContract$InputData;
import java.io.File;
import java.util.Optional;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class l implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f247371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k0 f247372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f247373c;
    public final Object d;

    public /* synthetic */ l(k0 k0Var, Object obj2, int i, int i2) {
        this.f247371a = i2;
        this.f247372b = k0Var;
        this.d = obj2;
        this.f247373c = i;
    }

    @Override // phm.a
    public final Object get() {
        Object fVar;
        Object fVar2;
        Object fVar3;
        Object fVar4;
        Object fVar5;
        Object fVar6;
        Object fVar7;
        switch (this.f247371a) {
            case 0:
                m mVar = (m) this.d;
                int i = this.f247373c;
                if (i == 0) {
                    return new ro7.o((jki.p) mVar.f247380b.get(), mVar.f247379a);
                }
                if (i != 1) {
                    throw new AssertionError(i);
                }
                n8b.a aVarA = this.f247372b.f247357l.a();
                vc.s.j(aVarA);
                return new ro7.p(aVarA);
            case 1:
                n nVar = (n) this.d;
                k0 k0Var = this.f247372b;
                int i2 = this.f247373c;
                if (i2 != 0) {
                    if (i2 == 1) {
                        return new rl7.d((ll7.i0) k0Var.f247367y.get());
                    }
                    throw new AssertionError(i2);
                }
                ll7.a aVar = (ll7.a) k0Var.f247363s.get();
                ll7.u uVar = (ll7.u) k0Var.f247366x.get();
                ll7.v vVar = (ll7.v) k0Var.f247365w.get();
                sf0.h hVarB = k0Var.e.b();
                vc.s.j(hVarB);
                l80.e eVarH = k0Var.f.h();
                vc.s.j(eVarH);
                wsg.n nVarB = k0Var.f247354g.b();
                gte.a aVarB = k0Var.f247355h.b();
                vc.s.j(aVarB);
                return new com.revolut.feature.insurance_car.impl.ui.flow.onboarding.main.j(aVar, uVar, vVar, hVarB, eVarH, nVarB, aVarB, nVar.f247398a, new i90.b(), new aq7.a(nVar.d));
            case 2:
                o oVar = (o) this.d;
                k0 k0Var2 = this.f247372b;
                int i3 = this.f247373c;
                if (i3 == 0) {
                    return new gm7.d((ll7.m) k0Var2.z.get());
                }
                if (i3 == 1) {
                    return new com.revolut.feature.insurance_car.impl.ui.flow.policy.d(oVar.f247407a, (gm7.d) oVar.d.get(), (ll7.m) k0Var2.z.get(), (ll7.a) k0Var2.f247363s.get());
                }
                if (i3 != 2) {
                    throw new AssertionError(i3);
                }
                com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) oVar.f.get();
                dn7.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller, "controller");
                return rp0.x0.a(rp0.g1.Companion, controller.D2());
            case 3:
                p pVar = (p) this.d;
                int i5 = this.f247373c;
                switch (i5) {
                    case 0:
                        tl7.f fVar8 = (tl7.f) pVar.e.get();
                        ufg.p0.l(fVar8);
                        return fVar8;
                    case 1:
                        fVar = new tl7.f((j60.a) pVar.d.get(), new vn7.a(), new in7.a(), new yl7.a(), new yl7.b(), new yl7.e());
                        break;
                    case 2:
                        return h30.l.p((com.revolut.kompot.navigable.a) pVar.f247420b.get(), (rp0.m) pVar.f247421c.get());
                    case 3:
                        return new rp0.m();
                    case 4:
                        return kxa.j.l((j60.a) pVar.d.get());
                    case 5:
                        jki.p pVar2 = (jki.p) pVar.f247423h.get();
                        CarSearchScreenContract$InputData carSearchScreenContract$InputData = pVar.f247419a;
                        tl7.f fVar9 = (tl7.f) pVar.e.get();
                        k0 k0Var3 = this.f247372b;
                        ll7.a aVar2 = (ll7.a) k0Var3.f247363s.get();
                        sf0.h hVarB2 = k0Var3.e.b();
                        vc.s.j(hVarB2);
                        fVar = new uo7.m(pVar2, carSearchScreenContract$InputData, fVar9, aVar2, hVarB2);
                        break;
                    case 6:
                        return new uo7.n();
                    default:
                        throw new AssertionError(i5);
                }
                return fVar;
            case 4:
                r rVar = (r) this.d;
                int i6 = this.f247373c;
                switch (i6) {
                    case 0:
                        tl7.f fVar10 = (tl7.f) rVar.e.get();
                        ufg.p0.l(fVar10);
                        return fVar10;
                    case 1:
                        fVar2 = new tl7.f((j60.a) rVar.d.get(), new vn7.a(), new in7.a(), new yl7.a(), new yl7.b(), new yl7.e());
                        break;
                    case 2:
                        return h30.l.p((com.revolut.kompot.navigable.a) rVar.f247444b.get(), (rp0.m) rVar.f247445c.get());
                    case 3:
                        return new rp0.m();
                    case 4:
                        return kxa.j.l((j60.a) rVar.d.get());
                    case 5:
                        jki.p pVar3 = (jki.p) rVar.f247447h.get();
                        ClaimsDetailsScreenContract$InputData claimsDetailsScreenContract$InputData = rVar.f247443a;
                        l80.e eVarH2 = this.f247372b.f.h();
                        vc.s.j(eVarH2);
                        fVar2 = new vp7.r(pVar3, claimsDetailsScreenContract$InputData, eVarH2, (tl7.f) rVar.e.get());
                        break;
                    case 6:
                        return new vp7.s();
                    default:
                        throw new AssertionError(i6);
                }
                return fVar2;
            case 5:
                v vVar2 = (v) this.d;
                int i21 = this.f247373c;
                switch (i21) {
                    case 0:
                        tl7.f fVar11 = (tl7.f) vVar2.e.get();
                        ufg.p0.l(fVar11);
                        return fVar11;
                    case 1:
                        fVar3 = new tl7.f((j60.a) vVar2.d.get(), new vn7.a(), new in7.a(), new yl7.a(), new yl7.b(), new yl7.e());
                        break;
                    case 2:
                        return h30.l.p((com.revolut.kompot.navigable.a) vVar2.f247491b.get(), (rp0.m) vVar2.f247492c.get());
                    case 3:
                        return new rp0.m();
                    case 4:
                        return kxa.j.l((j60.a) vVar2.d.get());
                    case 5:
                        jki.p pVar4 = (jki.p) vVar2.f247494h.get();
                        DateSelectorScreenContract$InputData dateSelectorScreenContract$InputData = vVar2.f247490a;
                        tl7.f fVar12 = (tl7.f) vVar2.e.get();
                        l80.e eVarH3 = this.f247372b.f.h();
                        vc.s.j(eVarH3);
                        fVar3 = new wo7.i(pVar4, dateSelectorScreenContract$InputData, fVar12, eVarH3);
                        break;
                    case 6:
                        return new wo7.j();
                    default:
                        throw new AssertionError(i21);
                }
                return fVar3;
            case 6:
                x xVar = (x) this.d;
                int i22 = this.f247373c;
                if (i22 == 0) {
                    return kxa.j.m((j60.a) xVar.f.get());
                }
                if (i22 == 1) {
                    return wp5.y.r((com.revolut.kompot.navigable.a) xVar.d.get(), (rp0.m) xVar.e.get());
                }
                if (i22 == 2) {
                    return new rp0.m();
                }
                if (i22 != 3) {
                    throw new AssertionError(i22);
                }
                DeliveryFlowContract$InputData deliveryFlowContract$InputData = xVar.f247515a;
                vn7.a aVar3 = new vn7.a();
                k0 k0Var4 = this.f247372b;
                return new com.revolut.feature.insurance_car.impl.ui.flow.delivery.a(deliveryFlowContract$InputData, aVar3, (ll7.v) k0Var4.f247365w.get(), (j60.a) xVar.f.get(), (String) k0Var4.v.get());
            case 7:
                y yVar = (y) this.d;
                int i32 = this.f247373c;
                if (i32 == 0) {
                    return kxa.j.l((j60.a) yVar.f.get());
                }
                if (i32 == 1) {
                    return h30.l.p((com.revolut.kompot.navigable.a) yVar.d.get(), (rp0.m) yVar.e.get());
                }
                if (i32 == 2) {
                    return new rp0.m();
                }
                k0 k0Var5 = this.f247372b;
                if (i32 == 3) {
                    jki.p pVar5 = (jki.p) yVar.f247531h.get();
                    DeviceDeliveryScreenContract$InputData deviceDeliveryScreenContract$InputData = yVar.f247527a;
                    ll7.v vVar3 = (ll7.v) k0Var5.f247365w.get();
                    c70.a aVarZ = yVar.f247528b.f.z();
                    vc.s.j(aVarZ);
                    return new vq7.j(pVar5, deviceDeliveryScreenContract$InputData, vVar3, new tr7.a(aVarZ, (rp0.g1) yVar.f247529c.f247410g.get()), (j60.a) yVar.f.get(), (vq7.a) yVar.i.get());
                }
                if (i32 == 4) {
                    qd0.b bVarN = k0Var5.f.n();
                    vc.s.j(bVarN);
                    return new vq7.l(bVarN);
                }
                if (i32 != 5) {
                    throw new AssertionError(i32);
                }
                wq7.a.Companion.getClass();
                return new vq7.a();
            case 8:
                z zVar = (z) this.d;
                k0 k0Var6 = this.f247372b;
                int i33 = this.f247373c;
                if (i33 == 0) {
                    return new tn7.h((jki.p) zVar.f247545b.get(), zVar.f247544a, (ll7.v) k0Var6.f247365w.get());
                }
                if (i33 != 1) {
                    throw new AssertionError(i33);
                }
                qd0.b bVarN2 = k0Var6.f.n();
                vc.s.j(bVarN2);
                return new tn7.k(bVarN2);
            case 9:
                b0 b0Var = (b0) this.d;
                DocumentsPreviewScreenContract$InputData documentsPreviewScreenContract$InputData = b0Var.f247237a;
                int i43 = this.f247373c;
                if (i43 == 0) {
                    return new fr7.i((cli.n) b0Var.f247238b.get(), documentsPreviewScreenContract$InputData, (ll7.v) this.f247372b.f247365w.get());
                }
                if (i43 == 1) {
                    return new fr7.l(documentsPreviewScreenContract$InputData);
                }
                throw new AssertionError(i43);
            case 10:
                c0 c0Var = (c0) this.d;
                int i59 = this.f247373c;
                if (i59 == 0) {
                    return new com.revolut.feature.insurance_car.impl.ui.screen.onboarding.proof_of_driving_number.driver_number_input.a((cli.n) c0Var.f247256b.get(), (ll7.k) this.f247372b.A.get(), c0Var.f247255a);
                }
                if (i59 == 1) {
                    return new mp7.o();
                }
                throw new AssertionError(i59);
            case 11:
                f0 f0Var = (f0) this.d;
                int i66 = this.f247373c;
                switch (i66) {
                    case 0:
                        tl7.f fVar13 = (tl7.f) f0Var.e.get();
                        ufg.p0.l(fVar13);
                        return fVar13;
                    case 1:
                        fVar4 = new tl7.f((j60.a) f0Var.d.get(), new vn7.a(), new in7.a(), new yl7.a(), new yl7.b(), new yl7.e());
                        break;
                    case 2:
                        return h30.l.p((com.revolut.kompot.navigable.a) f0Var.f247295b.get(), (rp0.m) f0Var.f247296c.get());
                    case 3:
                        return new rp0.m();
                    case 4:
                        return kxa.j.l((j60.a) f0Var.d.get());
                    case 5:
                        fVar4 = new cp7.p((jki.p) f0Var.f247298h.get(), f0Var.f247294a, this.f247372b.i.e(), (tl7.f) f0Var.e.get());
                        break;
                    case 6:
                        return new cp7.q();
                    default:
                        throw new AssertionError(i66);
                }
                return fVar4;
            case 12:
                i0 i0Var = (i0) this.d;
                int i74 = this.f247373c;
                if (i74 == 0) {
                    return new fq7.i((jki.p) i0Var.f247330b.get(), i0Var.f247329a, (ll7.v) this.f247372b.f247365w.get());
                }
                if (i74 == 1) {
                    return new fq7.l();
                }
                throw new AssertionError(i74);
            case 13:
                int i92 = this.f247373c;
                if (i92 != 0) {
                    if (i92 == 1) {
                        return new wn7.m();
                    }
                    throw new AssertionError(i92);
                }
                jki.p pVar6 = (jki.p) ((m0) this.d).f247382a.get();
                k0 k0Var7 = this.f247372b;
                return new wn7.l(pVar6, (ll7.a) k0Var7.f247363s.get(), (ll7.v) k0Var7.f247365w.get());
            case 14:
                o0 o0Var = (o0) this.d;
                k0 k0Var8 = this.f247372b;
                int i96 = this.f247373c;
                switch (i96) {
                    case 0:
                        tl7.f fVar14 = (tl7.f) o0Var.e.get();
                        ufg.p0.l(fVar14);
                        return fVar14;
                    case 1:
                        return new tl7.f((j60.a) o0Var.d.get(), new vn7.a(), new in7.a(), new yl7.a(), new yl7.b(), new yl7.e());
                    case 2:
                        return h30.l.p((com.revolut.kompot.navigable.a) o0Var.f247412b.get(), (rp0.m) o0Var.f247413c.get());
                    case 3:
                        return new rp0.m();
                    case 4:
                        return kxa.j.l((j60.a) o0Var.d.get());
                    case 5:
                        return new lq7.l((jki.p) o0Var.f247415h.get(), o0Var.f247411a, (ll7.v) k0Var8.f247365w.get(), (tl7.f) o0Var.e.get());
                    case 6:
                        l80.e eVarH4 = k0Var8.f.h();
                        vc.s.j(eVarH4);
                        return new lq7.o(eVarH4);
                    default:
                        throw new AssertionError(i96);
                }
            case 15:
                r0 r0Var = (r0) this.d;
                int i99 = this.f247373c;
                switch (i99) {
                    case 0:
                        tl7.f fVar15 = (tl7.f) r0Var.e.get();
                        ufg.p0.l(fVar15);
                        return fVar15;
                    case 1:
                        fVar5 = new tl7.f((j60.a) r0Var.d.get(), new vn7.a(), new in7.a(), new yl7.a(), new yl7.b(), new yl7.e());
                        break;
                    case 2:
                        return h30.l.p((com.revolut.kompot.navigable.a) r0Var.f247449b.get(), (rp0.m) r0Var.f247450c.get());
                    case 3:
                        return new rp0.m();
                    case 4:
                        return kxa.j.l((j60.a) r0Var.d.get());
                    case 5:
                        jki.p pVar7 = (jki.p) r0Var.f247452h.get();
                        MtaDateSelectorScreenContract$InputData mtaDateSelectorScreenContract$InputData = r0Var.f247448a;
                        tl7.f fVar16 = (tl7.f) r0Var.e.get();
                        l80.e eVarH5 = this.f247372b.f.h();
                        vc.s.j(eVarH5);
                        fVar5 = new ao7.o(pVar7, mtaDateSelectorScreenContract$InputData, fVar16, eVarH5);
                        break;
                    case 6:
                        return new ao7.q();
                    default:
                        throw new AssertionError(i99);
                }
                return fVar5;
            case 16:
                t0 t0Var = (t0) this.d;
                k0 k0Var9 = this.f247372b;
                int i100 = this.f247373c;
                if (i100 == 0) {
                    return new gm7.d((ll7.m) k0Var9.z.get());
                }
                if (i100 == 1) {
                    return new com.revolut.feature.insurance_car.impl.ui.flow.mta.b(t0Var.f247470a, (ll7.m) k0Var9.z.get(), (gm7.d) t0Var.d.get());
                }
                throw new AssertionError(i100);
            case 17:
                w0 w0Var = (w0) this.d;
                int i101 = this.f247373c;
                if (i101 == 0) {
                    return new nq7.g((jki.p) w0Var.f247507b.get(), w0Var.f247506a);
                }
                if (i101 != 1) {
                    throw new AssertionError(i101);
                }
                l80.e eVarH6 = this.f247372b.f.h();
                vc.s.j(eVarH6);
                return new nq7.i(eVarH6);
            case 18:
                z0 z0Var = (z0) this.d;
                int i102 = this.f247373c;
                if (i102 == 0) {
                    return new ip7.j((jki.p) z0Var.f247548b.get(), z0Var.f247547a, (ll7.u) this.f247372b.f247366x.get());
                }
                if (i102 == 1) {
                    return new ip7.l();
                }
                throw new AssertionError(i102);
            case 19:
                a1 a1Var = (a1) this.d;
                MotorPlanSelectorScreenContract$InputData motorPlanSelectorScreenContract$InputData = a1Var.f247227a;
                k0 k0Var10 = this.f247372b;
                int i103 = this.f247373c;
                switch (i103) {
                    case 0:
                        return kxa.j.l((j60.a) a1Var.d.get());
                    case 1:
                        return h30.l.p((com.revolut.kompot.navigable.a) a1Var.f247228b.get(), (rp0.m) a1Var.f247229c.get());
                    case 2:
                        return new rp0.m();
                    case 3:
                        kp7.w extension = (kp7.w) a1Var.f.get();
                        lp7.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension, "extension");
                        vc.s.k(extension);
                        return extension;
                    case 4:
                        ll7.u uVar2 = (ll7.u) k0Var10.f247366x.get();
                        dha.c cVarI = k0Var10.k.i();
                        vc.s.j(cVarI);
                        return new kp7.w(motorPlanSelectorScreenContract$InputData, uVar2, cVarI);
                    case 5:
                        jki.p pVar8 = (jki.p) a1Var.f247231h.get();
                        ll7.u uVar3 = (ll7.u) k0Var10.f247366x.get();
                        kp7.w wVar = (kp7.w) a1Var.f.get();
                        j60.a aVar4 = (j60.a) a1Var.d.get();
                        vn7.a aVar5 = new vn7.a();
                        l80.e eVarH7 = k0Var10.f.h();
                        vc.s.j(eVarH7);
                        return new com.revolut.feature.insurance_car.impl.ui.screen.onboarding.plan_selection.e(pVar8, motorPlanSelectorScreenContract$InputData, uVar3, wVar, aVar4, aVar5, eVarH7);
                    case 6:
                        sf0.h hVarB3 = k0Var10.e.b();
                        vc.s.j(hVarB3);
                        return new kp7.t(hVarB3);
                    default:
                        throw new AssertionError(i103);
                }
            case 20:
                b1 b1Var = (b1) this.d;
                int i104 = this.f247373c;
                if (i104 == 0) {
                    return kxa.j.l((j60.a) b1Var.f.get());
                }
                if (i104 == 1) {
                    return h30.l.p((com.revolut.kompot.navigable.a) b1Var.d.get(), (rp0.m) b1Var.e.get());
                }
                if (i104 == 2) {
                    return new rp0.m();
                }
                if (i104 != 3) {
                    if (i104 == 4) {
                        return new hq7.l();
                    }
                    throw new AssertionError(i104);
                }
                jki.p pVar9 = (jki.p) b1Var.f247244h.get();
                PolicyDetailsScreenContract$InputData policyDetailsScreenContract$InputData = b1Var.f247240a;
                k0 k0Var11 = this.f247372b;
                ll7.v vVar4 = (ll7.v) k0Var11.f247365w.get();
                c70.a aVarZ2 = b1Var.f247241b.f.z();
                vc.s.j(aVarZ2);
                tr7.a aVar6 = new tr7.a(aVarZ2, (rp0.g1) b1Var.f247242c.f247410g.get());
                j60.a aVar7 = (j60.a) b1Var.f.get();
                vn7.a aVar8 = new vn7.a();
                ang.f fVarE = k0Var11.i.e();
                n8b.a aVarA2 = k0Var11.f247357l.a();
                vc.s.j(aVarA2);
                return new hq7.k(pVar9, policyDetailsScreenContract$InputData, vVar4, aVar6, aVar7, aVar8, fVarE, aVarA2);
            case 21:
                c1 c1Var = (c1) this.d;
                int i105 = this.f247373c;
                if (i105 == 0) {
                    return kxa.j.l((j60.a) c1Var.f.get());
                }
                if (i105 == 1) {
                    return h30.l.p((com.revolut.kompot.navigable.a) c1Var.d.get(), (rp0.m) c1Var.e.get());
                }
                if (i105 == 2) {
                    return new rp0.m();
                }
                k0 k0Var12 = this.f247372b;
                if (i105 != 3) {
                    if (i105 != 4) {
                        throw new AssertionError(i105);
                    }
                    l80.e eVarH8 = k0Var12.f.h();
                    vc.s.j(eVarH8);
                    return new rq7.v(eVarH8);
                }
                jki.p pVar10 = (jki.p) c1Var.f247262h.get();
                PolicySummaryScreenContract$InputData policySummaryScreenContract$InputData = c1Var.f247258a;
                ll7.v vVar5 = (ll7.v) k0Var12.f247365w.get();
                c70.a aVarZ3 = c1Var.f247259b.f.z();
                vc.s.j(aVarZ3);
                return new rq7.s(pVar10, policySummaryScreenContract$InputData, vVar5, new tr7.a(aVarZ3, (rp0.g1) c1Var.f247260c.f247410g.get()), (j60.a) c1Var.f.get(), new vn7.a());
            case 22:
                g1 g1Var = (g1) this.d;
                int i106 = this.f247373c;
                if (i106 == 0) {
                    return kxa.j.l((j60.a) g1Var.d.get());
                }
                if (i106 == 1) {
                    return h30.l.p((com.revolut.kompot.navigable.a) g1Var.f247310b.get(), (rp0.m) g1Var.f247311c.get());
                }
                if (i106 == 2) {
                    return new rp0.m();
                }
                if (i106 == 3) {
                    return new qp7.q((jki.p) g1Var.f.get(), g1Var.f247309a, (j60.a) g1Var.d.get(), new vn7.a(), (ll7.u) this.f247372b.f247366x.get());
                }
                if (i106 == 4) {
                    return new qp7.r();
                }
                throw new AssertionError(i106);
            case 23:
                i1 i1Var = (i1) this.d;
                int i107 = this.f247373c;
                if (i107 == 0) {
                    return kxa.j.l((j60.a) i1Var.d.get());
                }
                if (i107 == 1) {
                    return h30.l.p((com.revolut.kompot.navigable.a) i1Var.f247333b.get(), (rp0.m) i1Var.f247334c.get());
                }
                if (i107 == 2) {
                    return new rp0.m();
                }
                if (i107 == 3) {
                    return new pq7.p((jki.p) i1Var.f.get(), i1Var.f247332a, (ll7.v) this.f247372b.f247365w.get(), (j60.a) i1Var.d.get(), (pq7.a) i1Var.f247335g.get());
                }
                if (i107 == 4) {
                    return new pq7.q();
                }
                if (i107 != 5) {
                    throw new AssertionError(i107);
                }
                qq7.a.Companion.getClass();
                return new pq7.a();
            case 24:
                j1 j1Var = (j1) this.d;
                int i108 = this.f247373c;
                if (i108 == 0) {
                    return new xq7.g((jki.p) j1Var.f247344b.get(), j1Var.f247343a, (ll7.v) this.f247372b.f247365w.get());
                }
                if (i108 == 1) {
                    return new xq7.h();
                }
                throw new AssertionError(i108);
            case 25:
                l1 l1Var = (l1) this.d;
                int i109 = this.f247373c;
                if (i109 == 0) {
                    return new dr7.j((jki.p) l1Var.f247377b.get(), l1Var.f247376a, (ll7.v) this.f247372b.f247365w.get());
                }
                if (i109 == 1) {
                    return new dr7.k();
                }
                throw new AssertionError(i109);
            case 26:
                m1 m1Var = (m1) this.d;
                k0 k0Var13 = this.f247372b;
                int i110 = this.f247373c;
                switch (i110) {
                    case 0:
                        return f0k.d.o((e60.a) m1Var.f247390l.get());
                    case 1:
                        com.revolut.kompot.navigable.a aVar9 = (com.revolut.kompot.navigable.a) m1Var.d.get();
                        g60.a aVarA3 = f60.n.a((com.revolut.kompot.navigable.a) m1Var.d.get());
                        Activity activityA = f60.l.a((com.revolut.kompot.navigable.a) m1Var.d.get());
                        t80.g gVar = (t80.g) m1Var.e.get();
                        com.revolut.kompot.navigable.a aVar10 = (com.revolut.kompot.navigable.a) m1Var.d.get();
                        f60.q.a(aVar10);
                        d4m.a aVarA4 = e4m.b.a(m1Var.f);
                        nli.a aVar11 = new nli.a((t80.c) m1Var.f247387g.get(), f60.l.a((com.revolut.kompot.navigable.a) m1Var.d.get()));
                        t80.g gVar2 = (t80.g) m1Var.e.get();
                        zk0.b bVarL = m1Var.f247385b.f.l();
                        vc.s.j(bVarL);
                        return f0k.d.u(aVar9, new t80.v(aVarA3, activityA, gVar, aVar10, aVarA4, aVar11, new oli.c(gVar2, bVarL, new nli.a((t80.c) m1Var.f247387g.get(), f60.l.a((com.revolut.kompot.navigable.a) m1Var.d.get())), f60.n.a((com.revolut.kompot.navigable.a) m1Var.d.get()), m1Var.e()), new oli.g(f60.m.a(f60.l.a((com.revolut.kompot.navigable.a) m1Var.d.get())), pli.b.a(f60.m.a(f60.l.a((com.revolut.kompot.navigable.a) m1Var.d.get()))), new ami.n(e4m.b.a(m1Var.f247388h), 1), e4m.b.a(m1Var.f), (t80.g) m1Var.e.get(), new nli.a((t80.c) m1Var.f247387g.get(), f60.l.a((com.revolut.kompot.navigable.a) m1Var.d.get())), new i90.b(), m1Var.d(), m1Var.e()), m1Var.e()), f60.p.a(), (rp0.m) m1Var.i.get(), (e60.t) m1Var.k.get(), new nji.b());
                    case 2:
                        l70.e eVar = k0Var13.f;
                        l70.e eVar2 = k0Var13.f;
                        f80.a aVarX = eVar.x();
                        vc.s.j(aVarX);
                        l80.e eVarH9 = eVar2.h();
                        vc.s.j(eVarH9);
                        zk0.b bVarL2 = eVar2.l();
                        vc.s.j(bVarL2);
                        return new t80.b(aVarX, eVarH9, bVarL2);
                    case 3:
                        com.revolut.kompot.navigable.a aVar12 = (com.revolut.kompot.navigable.a) m1Var.d.get();
                        f60.q.a(aVar12);
                        return pli.c.a(new ks0.n(aVar12));
                    case 4:
                        File cacheDir = qgh.c.i(k0Var13.f247352b);
                        cr7.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(cacheDir, "cacheDir");
                        return new t80.c(new t80.d(cacheDir), SizeBasedTriggeringPolicy.DEFAULT_MAX_FILE_SIZE);
                    case 5:
                        return t96.a.a();
                    case 6:
                        return f60.r.a();
                    case 7:
                        aii.o oVar2 = (aii.o) m1Var.f247389j.get();
                        y80.a aVarR = k0Var13.f.r();
                        vc.s.j(aVarR);
                        return new e60.y(oVar2, aVarR, m1Var.d(), Optional.empty());
                    case 8:
                        return kxa.j.l((j60.a) m1Var.o.get());
                    case 9:
                        return h30.l.p((com.revolut.kompot.navigable.a) m1Var.d.get(), (rp0.m) m1Var.f247392n.get());
                    case 10:
                        return new rp0.m();
                    case 11:
                        e60.t tVar = (e60.t) m1Var.k.get();
                        f60.o.a(tVar);
                        return tVar;
                    case 12:
                        jki.p pVar11 = (jki.p) m1Var.f247396s.get();
                        UploadFilesListScreenContract$InputData uploadFilesListScreenContract$InputData = m1Var.f247384a;
                        ll7.l lVar = (ll7.l) k0Var13.u.get();
                        e60.a aVar13 = (e60.a) m1Var.f247390l.get();
                        j60.a aVar14 = (j60.a) m1Var.o.get();
                        vn7.a aVar15 = new vn7.a();
                        zk0.b bVarL3 = k0Var13.f.l();
                        vc.s.j(bVarL3);
                        return new br7.m(pVar11, uploadFilesListScreenContract$InputData, lVar, aVar13, aVar14, aVar15, bVarL3);
                    case 13:
                        p80.a aVar16 = (p80.a) m1Var.f247395r.get();
                        cr7.b.Companion.getClass();
                        return new br7.o(aVar16, new o80.b());
                    case 14:
                        Context context = k0Var13.f247352b;
                        cr7.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(context, "context");
                        return new p80.a(context);
                    default:
                        throw new AssertionError(i110);
                }
            case 27:
                int i111 = this.f247373c;
                if (i111 != 0) {
                    if (i111 == 1) {
                        return new io7.g();
                    }
                    throw new AssertionError(i111);
                }
                n1 n1Var = (n1) this.d;
                ViewDriverScreenContract$InputData viewDriverScreenContract$InputData = n1Var.f247404a;
                cli.n nVar2 = (cli.n) n1Var.f247405b.get();
                gte.a aVarB2 = this.f247372b.f247355h.b();
                vc.s.j(aVarB2);
                return new io7.f(viewDriverScreenContract$InputData, nVar2, aVarB2);
            case 28:
                t1 t1Var = (t1) this.d;
                int i112 = this.f247373c;
                switch (i112) {
                    case 0:
                        tl7.f fVar17 = (tl7.f) t1Var.f.get();
                        ufg.p0.l(fVar17);
                        return fVar17;
                    case 1:
                        fVar6 = new tl7.f((j60.a) t1Var.e.get(), new vn7.a(), new in7.a(), new yl7.a(), new yl7.b(), new yl7.e());
                        break;
                    case 2:
                        return h30.l.p((com.revolut.kompot.navigable.a) t1Var.f247475c.get(), (rp0.m) t1Var.d.get());
                    case 3:
                        return new rp0.m();
                    case 4:
                        return kxa.j.l((j60.a) t1Var.e.get());
                    case 5:
                        jki.p pVar12 = (jki.p) t1Var.i.get();
                        MtaReviewScreenContract$InputData mtaReviewScreenContract$InputData = t1Var.f247474b;
                        k0 k0Var14 = this.f247372b;
                        fVar6 = new go7.s(pVar12, mtaReviewScreenContract$InputData, (ll7.m) k0Var14.z.get(), (ll7.v) k0Var14.f247365w.get(), k0Var14.i.e(), k0Var14.f247354g.b(), (tl7.f) t1Var.f.get());
                        break;
                    case 6:
                        return new go7.t();
                    default:
                        throw new AssertionError(i112);
                }
                return fVar6;
            default:
                t1 t1Var2 = (t1) this.d;
                int i113 = this.f247373c;
                switch (i113) {
                    case 0:
                        tl7.f fVar18 = (tl7.f) t1Var2.f.get();
                        ufg.p0.l(fVar18);
                        return fVar18;
                    case 1:
                        fVar7 = new tl7.f((j60.a) t1Var2.e.get(), new vn7.a(), new in7.a(), new yl7.a(), new yl7.b(), new yl7.e());
                        break;
                    case 2:
                        return h30.l.p((com.revolut.kompot.navigable.a) t1Var2.f247475c.get(), (rp0.m) t1Var2.d.get());
                    case 3:
                        return new rp0.m();
                    case 4:
                        return kxa.j.l((j60.a) t1Var2.e.get());
                    case 5:
                        jki.p pVar13 = (jki.p) t1Var2.i.get();
                        MtaReviewScreenContract$InputData mtaReviewScreenContract$InputData2 = t1Var2.f247474b;
                        k0 k0Var15 = this.f247372b;
                        fVar7 = new go7.s(pVar13, mtaReviewScreenContract$InputData2, (ll7.m) k0Var15.z.get(), (ll7.v) k0Var15.f247365w.get(), k0Var15.i.e(), k0Var15.f247354g.b(), (tl7.f) t1Var2.f.get());
                        break;
                    case 6:
                        return new go7.t();
                    default:
                        throw new AssertionError(i113);
                }
                return fVar7;
        }
    }
}
