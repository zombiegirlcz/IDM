package ql7;

import com.google.common.collect.ImmutableMap;
import com.revolut.feature.picker.legacy.PickerScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class t implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f247467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f247468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f247469c;

    public /* synthetic */ t(Object obj2, int i, int i2) {
        this.f247467a = i2;
        this.f247469c = obj2;
        this.f247468b = i;
    }

    @Override // phm.a
    public final Object get() {
        Object fVar;
        Object fVar2;
        Object fVar3;
        Object fVar4;
        Object fVar5;
        switch (this.f247467a) {
            case 0:
                u uVar = (u) this.f247469c;
                int i = this.f247468b;
                if (i == 0) {
                    tl7.f extension = (tl7.f) uVar.f.get();
                    Intrinsics.checkNotNullParameter(extension, "extension");
                    vc.s.k(extension);
                    return extension;
                }
                if (i == 1) {
                    return ufg.p0.k((j60.a) uVar.e.get(), new vn7.a(), new in7.a(), new yl7.a(), new yl7.b(), new yl7.e());
                }
                if (i == 2) {
                    return wp5.y.r((com.revolut.kompot.navigable.a) uVar.f247481c.get(), (rp0.m) uVar.d.get());
                }
                if (i == 3) {
                    return new rp0.m();
                }
                if (i == 4) {
                    return kxa.j.m((j60.a) uVar.e.get());
                }
                if (i == 5) {
                    return new com.revolut.feature.insurance_car.impl.ui.flow.onboarding.survey.current_insurance.a((tl7.f) uVar.f.get());
                }
                throw new AssertionError(i);
            case 1:
                int i2 = this.f247468b;
                if (i2 == 0) {
                    w wVar = (w) this.f247469c;
                    return new nn7.h(wVar.f247503a, (cli.n) wVar.f247504b.get());
                }
                if (i2 == 1) {
                    return new nn7.i();
                }
                throw new AssertionError(i2);
            case 2:
                a0 a0Var = (a0) this.f247469c;
                int i3 = this.f247468b;
                if (i3 == 0) {
                    return new zq7.g((jki.p) a0Var.f247225b.get(), a0Var.f247224a);
                }
                if (i3 == 1) {
                    return new zq7.h();
                }
                throw new AssertionError(i3);
            case 3:
                int i5 = this.f247468b;
                if (i5 == 0) {
                    return new op7.g((cli.n) ((d0) this.f247469c).f247269a.get());
                }
                if (i5 == 1) {
                    return new op7.h();
                }
                throw new AssertionError(i5);
            case 4:
                int i6 = this.f247468b;
                if (i6 == 0) {
                    return new jq7.d((jki.p) ((e0) this.f247469c).f247282a.get());
                }
                if (i6 == 1) {
                    return new jq7.e();
                }
                throw new AssertionError(i6);
            case 5:
                h0 h0Var = (h0) this.f247469c;
                int i21 = this.f247468b;
                switch (i21) {
                    case 0:
                        tl7.f fVar6 = (tl7.f) h0Var.e.get();
                        ufg.p0.l(fVar6);
                        return fVar6;
                    case 1:
                        fVar = new tl7.f((j60.a) h0Var.d.get(), new vn7.a(), new in7.a(), new yl7.a(), new yl7.b(), new yl7.e());
                        break;
                    case 2:
                        return h30.l.p((com.revolut.kompot.navigable.a) h0Var.f247317b.get(), (rp0.m) h0Var.f247318c.get());
                    case 3:
                        return new rp0.m();
                    case 4:
                        return kxa.j.l((j60.a) h0Var.d.get());
                    case 5:
                        fVar = new po7.h((jki.p) h0Var.f247320h.get(), h0Var.f247316a, (tl7.f) h0Var.e.get());
                        break;
                    case 6:
                        return new po7.i();
                    default:
                        throw new AssertionError(i21);
                }
                return fVar;
            case 6:
                q0 q0Var = (q0) this.f247469c;
                int i22 = this.f247468b;
                switch (i22) {
                    case 0:
                        tl7.f extension2 = (tl7.f) q0Var.e.get();
                        ul7.d.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension2, "extension");
                        vc.s.k(extension2);
                        return extension2;
                    case 1:
                        fVar2 = new tl7.f((j60.a) q0Var.d.get(), new vn7.a(), new in7.a(), new yl7.a(), new yl7.b(), new yl7.e());
                        break;
                    case 2:
                        return ehe.n.s((com.revolut.kompot.navigable.a) q0Var.f247436b.get(), (rp0.m) q0Var.f247437c.get());
                    case 3:
                        return new rp0.m();
                    case 4:
                        return kxa.j.k((j60.a) q0Var.d.get());
                    case 5:
                        fVar2 = new yn7.h(q0Var.f247435a, (cli.n) q0Var.f247439h.get(), (tl7.f) q0Var.e.get());
                        break;
                    case 6:
                        return new yn7.i();
                    default:
                        throw new AssertionError(i22);
                }
                return fVar2;
            case 7:
                int i32 = this.f247468b;
                if (i32 == 0) {
                    return new eo7.f((cli.n) ((s0) this.f247469c).f247462a.get());
                }
                if (i32 == 1) {
                    return new eo7.g();
                }
                throw new AssertionError(i32);
            case 8:
                v0 v0Var = (v0) this.f247469c;
                int i33 = this.f247468b;
                switch (i33) {
                    case 0:
                        tl7.f fVar7 = (tl7.f) v0Var.d.get();
                        ufg.p0.l(fVar7);
                        return fVar7;
                    case 1:
                        fVar3 = new tl7.f((j60.a) v0Var.f247497c.get(), new vn7.a(), new in7.a(), new yl7.a(), new yl7.b(), new yl7.e());
                        break;
                    case 2:
                        return h30.l.p((com.revolut.kompot.navigable.a) v0Var.f247495a.get(), (rp0.m) v0Var.f247496b.get());
                    case 3:
                        return new rp0.m();
                    case 4:
                        return kxa.j.l((j60.a) v0Var.f247497c.get());
                    case 5:
                        fVar3 = new xp7.i((jki.p) v0Var.f247498g.get(), (tl7.f) v0Var.d.get());
                        break;
                    case 6:
                        return new xp7.j();
                    default:
                        throw new AssertionError(i33);
                }
                return fVar3;
            case 9:
                x0 x0Var = (x0) this.f247469c;
                int i43 = this.f247468b;
                if (i43 == 0) {
                    return kxa.j.l((j60.a) x0Var.d.get());
                }
                if (i43 == 1) {
                    return h30.l.p((com.revolut.kompot.navigable.a) x0Var.f247521b.get(), (rp0.m) x0Var.f247522c.get());
                }
                if (i43 == 2) {
                    return new rp0.m();
                }
                if (i43 == 3) {
                    return new gp7.f((jki.p) x0Var.f.get(), x0Var.f247520a, (j60.a) x0Var.d.get(), new gp7.h());
                }
                if (i43 == 4) {
                    return new gp7.g();
                }
                throw new AssertionError(i43);
            case 10:
                y0 y0Var = (y0) this.f247469c;
                int i59 = this.f247468b;
                if (i59 == 0) {
                    tl7.f extension3 = (tl7.f) y0Var.f.get();
                    Intrinsics.checkNotNullParameter(extension3, "extension");
                    vc.s.k(extension3);
                    return extension3;
                }
                if (i59 == 1) {
                    return ufg.p0.k((j60.a) y0Var.e.get(), new vn7.a(), new in7.a(), new yl7.a(), new yl7.b(), new yl7.e());
                }
                if (i59 == 2) {
                    return wp5.y.r((com.revolut.kompot.navigable.a) y0Var.f247535c.get(), (rp0.m) y0Var.d.get());
                }
                if (i59 == 3) {
                    return new rp0.m();
                }
                if (i59 == 4) {
                    return kxa.j.m((j60.a) y0Var.e.get());
                }
                if (i59 == 5) {
                    return new com.revolut.feature.insurance_car.impl.ui.flow.onboarding.survey.penalty.a((tl7.f) y0Var.f.get());
                }
                throw new AssertionError(i59);
            case 11:
                d1 d1Var = (d1) this.f247469c;
                int i66 = this.f247468b;
                if (i66 == 0) {
                    return new rn7.g((jki.p) d1Var.f247272b.get(), d1Var.f247271a);
                }
                if (i66 == 1) {
                    return new rn7.h();
                }
                throw new AssertionError(i66);
            case 12:
                f1 f1Var = (f1) this.f247469c;
                int i74 = this.f247468b;
                if (i74 == 0) {
                    return new hr7.h((cli.n) f1Var.f247300b.get(), f1Var.f247299a);
                }
                if (i74 == 1) {
                    return new hr7.i();
                }
                throw new AssertionError(i74);
            case 13:
                p1 p1Var = (p1) this.f247469c;
                int i92 = this.f247468b;
                if (i92 == 0) {
                    return new jn7.h((jki.p) p1Var.f247429c.get(), p1Var.f247428b);
                }
                if (i92 == 1) {
                    return new jn7.i();
                }
                throw new AssertionError(i92);
            case 14:
                p1 p1Var2 = (p1) this.f247469c;
                int i96 = this.f247468b;
                if (i96 == 0) {
                    return new jn7.h((jki.p) p1Var2.f247429c.get(), p1Var2.f247428b);
                }
                if (i96 == 1) {
                    return new jn7.i();
                }
                throw new AssertionError(i96);
            case 15:
                r1 r1Var = (r1) this.f247469c;
                int i99 = this.f247468b;
                if (i99 == 0) {
                    return new co7.h((jki.p) r1Var.f247455c.get(), r1Var.f247454b);
                }
                if (i99 == 1) {
                    return new co7.i();
                }
                throw new AssertionError(i99);
            case 16:
                r1 r1Var2 = (r1) this.f247469c;
                int i100 = this.f247468b;
                if (i100 == 0) {
                    return new co7.h((jki.p) r1Var2.f247455c.get(), r1Var2.f247454b);
                }
                if (i100 == 1) {
                    return new co7.i();
                }
                throw new AssertionError(i100);
            case 17:
                y1 y1Var = (y1) this.f247469c;
                int i101 = this.f247468b;
                switch (i101) {
                    case 0:
                        tl7.f fVar8 = (tl7.f) y1Var.f.get();
                        ufg.p0.l(fVar8);
                        return fVar8;
                    case 1:
                        fVar4 = new tl7.f((j60.a) y1Var.e.get(), new vn7.a(), new in7.a(), new yl7.a(), new yl7.b(), new yl7.e());
                        break;
                    case 2:
                        return h30.l.p((com.revolut.kompot.navigable.a) y1Var.f247540c.get(), (rp0.m) y1Var.d.get());
                    case 3:
                        return new rp0.m();
                    case 4:
                        return kxa.j.l((j60.a) y1Var.e.get());
                    case 5:
                        fVar4 = new ep7.k((jki.p) y1Var.i.get(), y1Var.f247539b, (tl7.f) y1Var.f.get());
                        break;
                    case 6:
                        return new ep7.l();
                    default:
                        throw new AssertionError(i101);
                }
                return fVar4;
            case 18:
                y1 y1Var2 = (y1) this.f247469c;
                int i102 = this.f247468b;
                switch (i102) {
                    case 0:
                        tl7.f fVar9 = (tl7.f) y1Var2.f.get();
                        ufg.p0.l(fVar9);
                        return fVar9;
                    case 1:
                        fVar5 = new tl7.f((j60.a) y1Var2.e.get(), new vn7.a(), new in7.a(), new yl7.a(), new yl7.b(), new yl7.e());
                        break;
                    case 2:
                        return h30.l.p((com.revolut.kompot.navigable.a) y1Var2.f247540c.get(), (rp0.m) y1Var2.d.get());
                    case 3:
                        return new rp0.m();
                    case 4:
                        return kxa.j.l((j60.a) y1Var2.e.get());
                    case 5:
                        fVar5 = new ep7.k((jki.p) y1Var2.i.get(), y1Var2.f247539b, (tl7.f) y1Var2.f.get());
                        break;
                    case 6:
                        return new ep7.l();
                    default:
                        throw new AssertionError(i102);
                }
                return fVar5;
            case 19:
                a2 a2Var = (a2) this.f247469c;
                int i103 = this.f247468b;
                if (i103 == 0) {
                    return new tp7.i((jki.p) a2Var.f247234c.get(), a2Var.f247233b);
                }
                if (i103 == 1) {
                    return new tp7.j();
                }
                throw new AssertionError(i103);
            case 20:
                a2 a2Var2 = (a2) this.f247469c;
                int i104 = this.f247468b;
                if (i104 == 0) {
                    return new tp7.i((jki.p) a2Var2.f247234c.get(), a2Var2.f247233b);
                }
                if (i104 == 1) {
                    return new tp7.j();
                }
                throw new AssertionError(i104);
            case 21:
                b2 b2Var = (b2) this.f247469c;
                PickerScreenContract$InputData pickerScreenContract$InputData = b2Var.f247246b;
                int i105 = this.f247468b;
                if (i105 == 0) {
                    return new y7a.f0(ImmutableMap.of("CarInsuranceOnboardingAnswerPickerInteractor", (zp7.c) new sp7.b(), "CarInsuranceOnboardingOccupationSearchPickerInteractor", new zp7.c((ll7.a) b2Var.d.f247363s.get())), pickerScreenContract$InputData, (jki.p) b2Var.e.get());
                }
                if (i105 == 1) {
                    return new com.revolut.feature.picker.legacy.a(pickerScreenContract$InputData, b2Var.f247247c);
                }
                throw new AssertionError(i105);
            case 22:
                b2 b2Var2 = (b2) this.f247469c;
                PickerScreenContract$InputData pickerScreenContract$InputData2 = b2Var2.f247246b;
                int i106 = this.f247468b;
                if (i106 != 0) {
                    if (i106 == 1) {
                        return new com.revolut.feature.picker.legacy.a(pickerScreenContract$InputData2, b2Var2.f247247c);
                    }
                    throw new AssertionError(i106);
                }
                sp7.b bVar = new sp7.b();
                k0 k0Var = b2Var2.d;
                zp7.c cVar = new zp7.c((ll7.a) k0Var.f247363s.get());
                n8b.a aVarA = k0Var.f247357l.a();
                vc.s.j(aVarA);
                return new y7a.f0(ImmutableMap.of("CarInsuranceOnboardingAnswerPickerInteractor", (to7.h) bVar, "CarInsuranceOnboardingOccupationSearchPickerInteractor", (to7.h) cVar, "CarInsuranceOnboardingCountryPickerInteractor", new to7.h(aVarA)), pickerScreenContract$InputData2, (jki.p) b2Var2.e.get());
            case 23:
                b2 b2Var3 = (b2) this.f247469c;
                PickerScreenContract$InputData pickerScreenContract$InputData3 = b2Var3.f247246b;
                int i107 = this.f247468b;
                if (i107 == 0) {
                    return new y7a.f0(ImmutableMap.of("CarInsuranceOnboardingAnswerPickerInteractor", (zp7.c) new sp7.b(), "CarInsuranceOnboardingOccupationSearchPickerInteractor", new zp7.c((ll7.a) b2Var3.d.f247363s.get())), pickerScreenContract$InputData3, (jki.p) b2Var3.e.get());
                }
                if (i107 == 1) {
                    return new com.revolut.feature.picker.legacy.a(pickerScreenContract$InputData3, b2Var3.f247247c);
                }
                throw new AssertionError(i107);
            case 24:
                b2 b2Var4 = (b2) this.f247469c;
                PickerScreenContract$InputData pickerScreenContract$InputData4 = b2Var4.f247246b;
                int i108 = this.f247468b;
                if (i108 == 0) {
                    return new y7a.f0(ImmutableMap.of("CarInsuranceOnboardingAnswerPickerInteractor", (zp7.c) new sp7.b(), "CarInsuranceOnboardingOccupationSearchPickerInteractor", new zp7.c((ll7.a) b2Var4.d.f247363s.get())), pickerScreenContract$InputData4, (jki.p) b2Var4.e.get());
                }
                if (i108 == 1) {
                    return new com.revolut.feature.picker.legacy.a(pickerScreenContract$InputData4, b2Var4.f247247c);
                }
                throw new AssertionError(i108);
            case 25:
                b2 b2Var5 = (b2) this.f247469c;
                PickerScreenContract$InputData pickerScreenContract$InputData5 = b2Var5.f247246b;
                int i109 = this.f247468b;
                if (i109 == 0) {
                    return new y7a.f0(ImmutableMap.of("CarInsuranceOnboardingAnswerPickerInteractor", (zp7.c) new sp7.b(), "CarInsuranceOnboardingOccupationSearchPickerInteractor", new zp7.c((ll7.a) b2Var5.d.f247363s.get())), pickerScreenContract$InputData5, (jki.p) b2Var5.e.get());
                }
                if (i109 == 1) {
                    return new com.revolut.feature.picker.legacy.a(pickerScreenContract$InputData5, b2Var5.f247247c);
                }
                throw new AssertionError(i109);
            case 26:
                c2 c2Var = (c2) this.f247469c;
                PickerScreenContract$InputData pickerScreenContract$InputData6 = c2Var.f247263a;
                int i110 = this.f247468b;
                if (i110 != 0) {
                    if (i110 == 1) {
                        return new com.revolut.feature.picker.legacy.a(pickerScreenContract$InputData6, c2Var.f247264b);
                    }
                    throw new AssertionError(i110);
                }
                ImmutableMap.Builder builderBuilderWithExpectedSize = ImmutableMap.builderWithExpectedSize(10);
                builderBuilderWithExpectedSize.put("CarInsuranceOnboardingAnswerPickerInteractor", new sp7.b());
                k0 k0Var2 = c2Var.f247265c;
                builderBuilderWithExpectedSize.put("CarInsuranceOnboardingOccupationSearchPickerInteractor", new zp7.c((ll7.a) k0Var2.f247363s.get()));
                n8b.a aVarA2 = k0Var2.f247357l.a();
                vc.s.j(aVarA2);
                builderBuilderWithExpectedSize.put("CarInsuranceOnboardingCountryPickerInteractor", new to7.h(aVarA2));
                builderBuilderWithExpectedSize.put("CarInsuranceOnboardingCarMakePickerInteractor", new to7.b((ll7.a) k0Var2.f247363s.get()));
                builderBuilderWithExpectedSize.put("CarInsuranceOnboardingCarModelPickerInteractor", new to7.e((ll7.a) k0Var2.f247363s.get()));
                ll7.a aVar = (ll7.a) k0Var2.f247363s.get();
                pqi.a aVar2 = k0Var2.f247358m;
                builderBuilderWithExpectedSize.put("CarInsuranceOnboardingFuelTypePickerInteractor", new to7.n(aVar, aVar2.g()));
                ll7.a aVar3 = (ll7.a) k0Var2.f247363s.get();
                l70.e eVar = k0Var2.f;
                l80.e eVarH = eVar.h();
                vc.s.j(eVarH);
                builderBuilderWithExpectedSize.put("CarInsuranceOnboardingYearMadePickerInteractor", new to7.g0(aVar3, eVarH));
                ll7.a aVar4 = (ll7.a) k0Var2.f247363s.get();
                l80.e eVarH2 = eVar.h();
                vc.s.j(eVarH2);
                builderBuilderWithExpectedSize.put("CarInsuranceOnboardingTransmissionPickerInteractor", new to7.x(aVar4, eVarH2, aVar2.g()));
                ll7.a aVar5 = (ll7.a) k0Var2.f247363s.get();
                l80.e eVarH3 = eVar.h();
                vc.s.j(eVarH3);
                builderBuilderWithExpectedSize.put("CarInsuranceOnboardingVariationPickerInteractor", new to7.c0(aVar5, eVarH3, aVar2.g()));
                l80.e eVarH4 = eVar.h();
                vc.s.j(eVarH4);
                builderBuilderWithExpectedSize.put("CarInsuranceOnboardingPurchaseYearPickerInteractor", new to7.s(eVarH4));
                return new y7a.f0(builderBuilderWithExpectedSize.build(), pickerScreenContract$InputData6, (jki.p) c2Var.d.get());
            case 27:
                b2 b2Var6 = (b2) this.f247469c;
                PickerScreenContract$InputData pickerScreenContract$InputData7 = b2Var6.f247246b;
                int i111 = this.f247468b;
                if (i111 == 0) {
                    return new y7a.f0(ImmutableMap.of("CarInsuranceOnboardingAnswerPickerInteractor", (zp7.c) new sp7.b(), "CarInsuranceOnboardingOccupationSearchPickerInteractor", new zp7.c((ll7.a) b2Var6.d.f247363s.get())), pickerScreenContract$InputData7, (jki.p) b2Var6.e.get());
                }
                if (i111 == 1) {
                    return new com.revolut.feature.picker.legacy.a(pickerScreenContract$InputData7, b2Var6.f247247c);
                }
                throw new AssertionError(i111);
            case 28:
                b2 b2Var7 = (b2) this.f247469c;
                PickerScreenContract$InputData pickerScreenContract$InputData8 = b2Var7.f247246b;
                int i112 = this.f247468b;
                if (i112 == 0) {
                    return new y7a.f0(ImmutableMap.of("CarInsuranceOnboardingAnswerPickerInteractor", (zp7.c) new sp7.b(), "CarInsuranceOnboardingOccupationSearchPickerInteractor", new zp7.c((ll7.a) b2Var7.d.f247363s.get())), pickerScreenContract$InputData8, (jki.p) b2Var7.e.get());
                }
                if (i112 == 1) {
                    return new com.revolut.feature.picker.legacy.a(pickerScreenContract$InputData8, b2Var7.f247247c);
                }
                throw new AssertionError(i112);
            default:
                b2 b2Var8 = (b2) this.f247469c;
                PickerScreenContract$InputData pickerScreenContract$InputData9 = b2Var8.f247246b;
                int i113 = this.f247468b;
                if (i113 == 0) {
                    return new y7a.f0(ImmutableMap.of("CarInsuranceOnboardingAnswerPickerInteractor", (zp7.c) new sp7.b(), "CarInsuranceOnboardingOccupationSearchPickerInteractor", new zp7.c((ll7.a) b2Var8.d.f247363s.get())), pickerScreenContract$InputData9, (jki.p) b2Var8.e.get());
                }
                if (i113 == 1) {
                    return new com.revolut.feature.picker.legacy.a(pickerScreenContract$InputData9, b2Var8.f247247c);
                }
                throw new AssertionError(i113);
        }
    }
}
