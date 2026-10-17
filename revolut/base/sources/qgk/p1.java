package qgk;

import com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_selection.switch_to_individual.SwitchToIndividualPromptControllerModelExtension;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_billing_picker.PlanBillingPickerContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.select_family_plan.SelectFamilyPlanFlowContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.student_verification.StudentVerificationFlowContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_billing_picker.PlanBillingPickerScreenContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.downgrade_block.PlanDowngradeBlockScreenContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.downgrade_terms.PlanDowngradeFeesAndTermsScreenContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.features.PlanCancelFeaturesScreenContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.student_email_validation.StudentEmailValidationScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class p1 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f246190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f246191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f246192c;
    public final Object d;

    public /* synthetic */ p1(Object obj2, Object obj3, int i, int i2) {
        this.f246190a = i2;
        this.f246191b = obj2;
        this.d = obj3;
        this.f246192c = i;
    }

    private final Object a() {
        i0 i0Var = (i0) this.f246191b;
        efk.a aVar = i0Var.f246013h;
        i3 i3Var = i0Var.f246010b;
        y2 y2Var = (y2) this.d;
        i0 i0Var2 = y2Var.f246338c;
        int i = this.f246192c;
        switch (i) {
            case 0:
                return kxa.j.k((j60.a) y2Var.f246339g.get());
            case 1:
                return ehe.n.s((com.revolut.kompot.navigable.a) y2Var.e.get(), (rp0.m) y2Var.f.get());
            case 2:
                return new rp0.m();
            case 3:
                cli.n nVar = (cli.n) y2Var.f246341j.get();
                PlanCancelFeaturesScreenContract$InputData planCancelFeaturesScreenContract$InputData = y2Var.f246337b;
                ffk.t tVarF = aVar.f();
                vc.s.j(tVarF);
                skk.a aVar2 = new skk.a();
                egk.d dVarA = i3Var.a();
                vc.s.j(dVarA);
                bgc.e eVarC = i0Var.f246012g.c();
                vc.s.j(eVarC);
                jgk.c cVar = (jgk.c) y2Var.k.get();
                ang.f fVarE = i0Var.f246014j.e();
                gte.a aVarB = i0Var.f246011c.b();
                vc.s.j(aVarB);
                dnk.d dVar = new dnk.d();
                l93.f fVarJ = i0Var.f246017n.j();
                vc.s.j(fVarJ);
                xua.a aVarA = i0Var.f246021s.a();
                vc.s.j(aVarA);
                cha.b bVarC = aVar.c();
                vc.s.j(bVarC);
                mlk.a aVar3 = new mlk.a();
                j60.a aVar4 = (j60.a) y2Var.f246339g.get();
                i4b.f fVar = new i4b.f(((s41.a) i0Var2.k).d());
                ffk.t tVarF2 = i0Var2.f246013h.f();
                vc.s.j(tVarF2);
                return new mlk.h0(nVar, planCancelFeaturesScreenContract$InputData, tVarF, aVar2, dVarA, eVarC, cVar, fVarE, aVarB, dVar, fVarJ, aVarA, bVarC, aVar3, aVar4, fVar, new mlk.c(tVarF2));
            case 4:
                ujk.a aVar5 = new ujk.a();
                kgc.d dVarB = i0Var2.f246012g.b();
                vc.s.j(dVarB);
                m93.g gVarI = i0Var2.f246017n.i();
                vc.s.j(gVarI);
                dnk.k kVar = new dnk.k(y2Var.b(), new dnk.i((c90.c) y2Var.i.get()));
                dnk.l lVarB = y2Var.b();
                return new mlk.i0(new slk.b(aVar5, dVarB, gVarI, new mlk.f(kVar, new dnk.a(new dnk.c(y2Var.b()), new dnk.d(), lVarB), new dnk.m(new dnk.c(y2Var.b()), new dnk.d(), y2Var.b()), (c90.c) y2Var.i.get()), y2Var.b(), new slk.e(y2Var.b(), new ojk.n0())), new mlk.d(), new mlk.e(), new yik.b());
            case 5:
                return nlk.f.a(y2Var.f246336a);
            case 6:
                return nlk.e.a(i3Var.c());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object b() {
        i0 i0Var = (i0) this.f246191b;
        efk.a aVar = i0Var.f246013h;
        i3 i3Var = i0Var.f246010b;
        z2 z2Var = (z2) this.d;
        i0 i0Var2 = z2Var.d;
        int i = this.f246192c;
        switch (i) {
            case 0:
                return kxa.j.k((j60.a) z2Var.f246358g.get());
            case 1:
                return ehe.n.s((com.revolut.kompot.navigable.a) z2Var.e.get(), (rp0.m) z2Var.f.get());
            case 2:
                return new rp0.m();
            case 3:
                cli.n nVar = (cli.n) z2Var.f246360j.get();
                PlanCancelFeaturesScreenContract$InputData planCancelFeaturesScreenContract$InputData = z2Var.f246357c;
                ffk.t tVarF = aVar.f();
                vc.s.j(tVarF);
                skk.a aVar2 = new skk.a();
                egk.d dVarA = i3Var.a();
                vc.s.j(dVarA);
                bgc.e eVarC = i0Var.f246012g.c();
                vc.s.j(eVarC);
                jgk.c cVar = (jgk.c) z2Var.k.get();
                ang.f fVarE = i0Var.f246014j.e();
                gte.a aVarB = i0Var.f246011c.b();
                vc.s.j(aVarB);
                dnk.d dVar = new dnk.d();
                l93.f fVarJ = i0Var.f246017n.j();
                vc.s.j(fVarJ);
                xua.a aVarA = i0Var.f246021s.a();
                vc.s.j(aVarA);
                cha.b bVarC = aVar.c();
                vc.s.j(bVarC);
                mlk.a aVar3 = new mlk.a();
                j60.a aVar4 = (j60.a) z2Var.f246358g.get();
                i4b.f fVar = new i4b.f(((s41.a) i0Var2.k).d());
                ffk.t tVarF2 = i0Var2.f246013h.f();
                vc.s.j(tVarF2);
                return new mlk.h0(nVar, planCancelFeaturesScreenContract$InputData, tVarF, aVar2, dVarA, eVarC, cVar, fVarE, aVarB, dVar, fVarJ, aVarA, bVarC, aVar3, aVar4, fVar, new mlk.c(tVarF2));
            case 4:
                ujk.a aVar5 = new ujk.a();
                kgc.d dVarB = i0Var2.f246012g.b();
                vc.s.j(dVarB);
                m93.g gVarI = i0Var2.f246017n.i();
                vc.s.j(gVarI);
                dnk.k kVar = new dnk.k(z2Var.b(), new dnk.i((c90.c) z2Var.i.get()));
                dnk.l lVarB = z2Var.b();
                return new mlk.i0(new slk.b(aVar5, dVarB, gVarI, new mlk.f(kVar, new dnk.a(new dnk.c(z2Var.b()), new dnk.d(), lVarB), new dnk.m(new dnk.c(z2Var.b()), new dnk.d(), z2Var.b()), (c90.c) z2Var.i.get()), z2Var.b(), new slk.e(z2Var.b(), new ojk.n0())), new mlk.d(), new mlk.e(), new yik.b());
            case 5:
                return nlk.f.a(z2Var.f246356b);
            case 6:
                return nlk.e.a(i3Var.c());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object c() {
        i0 i0Var = (i0) this.f246191b;
        z2 z2Var = (z2) this.d;
        i0 i0Var2 = z2Var.d;
        int i = this.f246192c;
        switch (i) {
            case 0:
                return kxa.j.k((j60.a) z2Var.f246358g.get());
            case 1:
                return ehe.n.s((com.revolut.kompot.navigable.a) z2Var.e.get(), (rp0.m) z2Var.f.get());
            case 2:
                return new rp0.m();
            case 3:
                cli.n nVar = (cli.n) z2Var.f246360j.get();
                PlanCancelFeaturesScreenContract$InputData planCancelFeaturesScreenContract$InputData = z2Var.f246357c;
                ffk.t tVarF = i0Var.f246013h.f();
                vc.s.j(tVarF);
                skk.a aVar = new skk.a();
                egk.d dVarA = i0Var.f246010b.a();
                vc.s.j(dVarA);
                bgc.e eVarC = i0Var.f246012g.c();
                vc.s.j(eVarC);
                jgk.c cVar = (jgk.c) z2Var.k.get();
                ang.f fVarE = i0Var.f246014j.e();
                gte.a aVarB = i0Var.f246011c.b();
                vc.s.j(aVarB);
                dnk.d dVar = new dnk.d();
                l93.f fVarJ = i0Var.f246017n.j();
                vc.s.j(fVarJ);
                xua.a aVarA = i0Var.f246021s.a();
                vc.s.j(aVarA);
                cha.b bVarC = i0Var.f246013h.c();
                vc.s.j(bVarC);
                mlk.a aVar2 = new mlk.a();
                j60.a aVar3 = (j60.a) z2Var.f246358g.get();
                i4b.f fVar = new i4b.f(((s41.a) i0Var2.k).d());
                ffk.t tVarF2 = i0Var2.f246013h.f();
                vc.s.j(tVarF2);
                return new mlk.h0(nVar, planCancelFeaturesScreenContract$InputData, tVarF, aVar, dVarA, eVarC, cVar, fVarE, aVarB, dVar, fVarJ, aVarA, bVarC, aVar2, aVar3, fVar, new mlk.c(tVarF2));
            case 4:
                ujk.a aVar4 = new ujk.a();
                kgc.d dVarB = i0Var2.f246012g.b();
                vc.s.j(dVarB);
                m93.g gVarI = i0Var2.f246017n.i();
                vc.s.j(gVarI);
                dnk.k kVar = new dnk.k(z2Var.b(), new dnk.i((c90.c) z2Var.i.get()));
                dnk.l lVarB = z2Var.b();
                slk.b bVar = new slk.b(aVar4, dVarB, gVarI, new mlk.f(kVar, new dnk.a(new dnk.c(z2Var.b()), new dnk.d(), lVarB), new dnk.m(new dnk.c(z2Var.b()), new dnk.d(), z2Var.b()), (c90.c) z2Var.i.get()), z2Var.b(), new slk.e(z2Var.b(), new ojk.n0()));
                mlk.d dVar2 = new mlk.d();
                mlk.e eVar = new mlk.e();
                i3 i3Var = i0Var.f246010b;
                return new mlk.i0(bVar, dVar2, eVar, new yik.b());
            case 5:
                return nlk.f.a(z2Var.f246356b);
            case 6:
                return nlk.e.a(i0Var.f246010b.c());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object d() {
        ql7.e eVar = (ql7.e) this.d;
        int i = this.f246192c;
        switch (i) {
            case 0:
                tl7.f fVar = (tl7.f) eVar.e.get();
                ufg.p0.l(fVar);
                return fVar;
            case 1:
                return new tl7.f((j60.a) eVar.d.get(), new vn7.a(), new in7.a(), new yl7.a(), new yl7.b(), new yl7.e());
            case 2:
                return h30.l.p((com.revolut.kompot.navigable.a) eVar.f247278b.get(), (rp0.m) eVar.f247279c.get());
            case 3:
                return new rp0.m();
            case 4:
                return kxa.j.l((j60.a) eVar.d.get());
            case 5:
                return new ap7.l((jki.p) eVar.f247281h.get(), eVar.f247277a, (tl7.f) eVar.e.get(), ((ql7.k0) this.f246191b).i.e());
            case 6:
                return new ap7.m();
            default:
                throw new AssertionError(i);
        }
    }

    private final Object e() {
        ql7.k0 k0Var = (ql7.k0) this.f246191b;
        ql7.f fVar = (ql7.f) this.d;
        int i = this.f246192c;
        if (i == 0) {
            return kxa.j.l((j60.a) fVar.d.get());
        }
        if (i == 1) {
            return h30.l.p((com.revolut.kompot.navigable.a) fVar.f247290b.get(), (rp0.m) fVar.f247291c.get());
        }
        if (i == 2) {
            return new rp0.m();
        }
        if (i == 3) {
            jki.p pVar = (jki.p) fVar.f.get();
            ang.f fVarE = k0Var.i.e();
            w39.b bVarA = k0Var.f247356j.a();
            vc.s.j(bVarA);
            return new ko7.l(pVar, fVarE, bVarA, (j60.a) fVar.d.get(), new vn7.a(), (rp0.g1) fVar.f247292g.get(), fVar.f247289a);
        }
        if (i == 4) {
            return new ko7.m();
        }
        if (i != 5) {
            throw new AssertionError(i);
        }
        com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) fVar.f247290b.get();
        lo7.a.Companion.getClass();
        Intrinsics.checkNotNullParameter(controller, "controller");
        return rp0.x0.a(rp0.g1.Companion, controller.D2());
    }

    @Override // phm.a
    public final Object get() {
        switch (this.f246190a) {
            case 0:
                i0 i0Var = (i0) this.f246191b;
                q1 q1Var = (q1) this.d;
                i0 i0Var2 = q1Var.f246204b;
                int i = this.f246192c;
                if (i == 0) {
                    return new com.revolut.retail.feature.pricing_plans.ui.impl.footer.d(((s41.a) i0Var.k).d(), i0Var.f246010b.f(), new ajk.c(i0Var2.f246010b.g()));
                }
                if (i == 1) {
                    return new cnk.m(new cnk.o(new dnk.l(i0Var2.e.g(), 0), new dok.e(new yik.b()), new com.revolut.retail.feature.pricing_plans.ui.impl.footer.e(), q1Var.f246203a), (dgk.a) q1Var.f246205c.get());
                }
                throw new AssertionError(i);
            case 1:
                ite.a aVar = ((i0) this.f246191b).f246011c;
                int i2 = this.f246192c;
                if (i2 == 0) {
                    gte.a aVarB = aVar.b();
                    vc.s.j(aVarB);
                    return new phk.l(aVarB);
                }
                if (i2 != 1) {
                    throw new AssertionError(i2);
                }
                r1 r1Var = (r1) this.d;
                SelectFamilyPlanFlowContract$InputData selectFamilyPlanFlowContract$InputData = r1Var.f246214a;
                phk.k kVar = (phk.k) r1Var.f246215b.get();
                gte.a aVarB2 = aVar.b();
                vc.s.j(aVarB2);
                return new com.revolut.retail.feature.pricing_plans.ui.impl.flows.select_family_plan.a(selectFamilyPlanFlowContract$InputData, kVar, aVarB2);
            case 2:
                t1 t1Var = (t1) this.d;
                i0 i0Var3 = (i0) this.f246191b;
                efk.a aVar2 = i0Var3.f246013h;
                int i3 = this.f246192c;
                if (i3 == 0) {
                    n60.a aVar3 = (n60.a) t1Var.f246243c.get();
                    o5k.i.l(aVar3);
                    return aVar3;
                }
                if (i3 == 1) {
                    return o5k.i.q((com.revolut.kompot.navigable.a) t1Var.f246242b.get());
                }
                if (i3 != 2) {
                    throw new AssertionError(i3);
                }
                snk.m mVar = new snk.m(t1Var.f246241a);
                StudentEmailValidationScreenContract$InputData studentEmailValidationScreenContract$InputData = t1Var.f246241a;
                n60.a aVar4 = (n60.a) t1Var.f246243c.get();
                tnk.b.Companion.getClass();
                zzl.c cVar = new zzl.c();
                ffk.e0 e0Var = (ffk.e0) aVar2.N.get();
                vc.s.j(e0Var);
                cha.c cVarJ = aVar2.j();
                vc.s.j(cVarJ);
                ang.f fVarE = i0Var3.f246014j.e();
                snk.u uVar = (snk.u) i0Var3.f246009a0.get();
                mre.c cVarB = i0Var3.D.b();
                vc.s.j(cVarB);
                return new snk.r(mVar, studentEmailValidationScreenContract$InputData, aVar4, cVar, e0Var, cVarJ, fVarE, uVar, cVarB);
            case 3:
                i0 i0Var4 = (i0) this.f246191b;
                rkd.g gVar = i0Var4.d;
                i3 i3Var = i0Var4.f246010b;
                v1 v1Var = (v1) this.d;
                i0 i0Var5 = v1Var.f246291c;
                int i5 = this.f246192c;
                if (i5 == 0) {
                    nkd.a extension = (nkd.a) v1Var.d.get();
                    pnk.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(extension, "extension");
                    vc.s.k(extension);
                    return extension;
                }
                if (i5 == 1) {
                    nkd.b view = v1Var.f246289a;
                    kld.a factory = (kld.a) gVar.K.get();
                    vc.s.j(factory);
                    pnk.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(view, "view");
                    Intrinsics.checkNotNullParameter(factory, "factory");
                    return factory.a(view);
                }
                if (i5 == 2) {
                    mkd.g view2 = v1Var.f246290b;
                    rkd.m factory2 = gVar.a();
                    vc.s.j(factory2);
                    pnk.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(view2, "view");
                    Intrinsics.checkNotNullParameter(factory2, "factory");
                    return factory2.a(view2);
                }
                if (i5 == 3) {
                    cli.n nVar = (cli.n) v1Var.f246292g.get();
                    egk.e eVarE = i3Var.e();
                    vc.s.j(eVarE);
                    cha.c cVarJ2 = i0Var4.f246013h.j();
                    vc.s.j(cVarJ2);
                    mkd.d dVar = (mkd.d) v1Var.f.get();
                    q06.l lVarA = i0Var4.f.a();
                    vc.s.j(lVarA);
                    return new onk.l(nVar, eVarE, cVarJ2, dVar, lVarA, new ajk.c(i0Var5.f246010b.g()), i3Var.f());
                }
                if (i5 != 4) {
                    throw new AssertionError(i5);
                }
                dnk.l lVarB = v1Var.b();
                ojk.t tVar = new ojk.t(new c7b.a(i0Var5.e.g(), 2), v1Var.b());
                ojk.p0 p0Var = new ojk.p0(v1Var.b(), new ojk.n0());
                ojk.s sVar = new ojk.s();
                gte.a aVarB3 = i0Var5.f246011c.b();
                vc.s.j(aVarB3);
                return new kxk.o(new ojk.g0(lVarB, tVar, p0Var, sVar, aVarB3), new onk.a(new imk.c(v1Var.b(), new dok.e(new yik.b()), new imk.k(new c7b.a(i0Var5.e.g(), 2), v1Var.b()))));
            case 4:
                i0 i0Var6 = (i0) this.f246191b;
                efk.a aVar5 = i0Var6.f246013h;
                int i6 = this.f246192c;
                if (i6 != 0) {
                    if (i6 != 1) {
                        throw new AssertionError(i6);
                    }
                    l80.e eVarH = i0Var6.E.h();
                    vc.s.j(eVarH);
                    return new tik.c(eVarH);
                }
                y1 y1Var = (y1) this.d;
                StudentVerificationFlowContract$InputData studentVerificationFlowContract$InputData = y1Var.f246333a;
                uik.a aVar6 = new uik.a();
                tik.c cVar2 = (tik.c) y1Var.d.get();
                zja.a aVarA = ((ika.b) i0Var6.Q).a();
                vc.s.j(aVarA);
                cha.c cVarJ3 = aVar5.j();
                vc.s.j(cVarJ3);
                ffk.e0 e0Var2 = (ffk.e0) aVar5.N.get();
                vc.s.j(e0Var2);
                g81.a aVarC = i0Var6.R.c();
                vc.s.j(aVarC);
                return new com.revolut.retail.feature.pricing_plans.ui.impl.flows.student_verification.g(studentVerificationFlowContract$InputData, aVar6, cVar2, aVarA, cVarJ3, e0Var2, aVarC, (snk.u) i0Var6.f246009a0.get());
            case 5:
                z1 z1Var = (z1) this.d;
                i0 i0Var7 = (i0) this.f246191b;
                efk.a aVar7 = i0Var7.f246013h;
                int i21 = this.f246192c;
                if (i21 != 0) {
                    if (i21 == 1) {
                        return new rmk.j();
                    }
                    throw new AssertionError(i21);
                }
                jki.p pVar = (jki.p) z1Var.f246353b.get();
                i0 i0Var8 = z1Var.f246352a;
                pre.c cVarA = i0Var8.D.a();
                vc.s.j(cVarA);
                ang.f fVarE2 = i0Var8.f246014j.e();
                gte.a aVarB4 = i0Var8.f246011c.b();
                vc.s.j(aVarB4);
                wik.q qVar = new wik.q(cVarA, fVarE2, aVarB4);
                ffk.t tVarF = aVar7.f();
                vc.s.j(tVarF);
                mre.c cVarB2 = i0Var7.D.b();
                vc.s.j(cVarB2);
                cha.b bVarC = aVar7.c();
                vc.s.j(bVarC);
                return new rmk.i(pVar, qVar, tVarF, cVarB2, bVarC);
            case 6:
                int i22 = this.f246192c;
                if (i22 != 0) {
                    if (i22 == 1) {
                        return new plk.k();
                    }
                    throw new AssertionError(i22);
                }
                cli.n nVar2 = (cli.n) ((b2) this.d).f245892a.get();
                ffk.t tVarF2 = ((i0) this.f246191b).f246013h.f();
                vc.s.j(tVarF2);
                return new plk.j(nVar2, tVarF2);
            case 7:
                d2 d2Var = (d2) this.d;
                i0 i0Var9 = (i0) this.f246191b;
                efk.a aVar8 = i0Var9.f246013h;
                ite.a aVar9 = i0Var9.f246011c;
                int i32 = this.f246192c;
                switch (i32) {
                    case 0:
                        gte.a aVarB5 = aVar9.b();
                        vc.s.j(aVarB5);
                        return new phk.l(aVarB5);
                    case 1:
                        ohk.a factory3 = i0Var9.u.d();
                        vc.s.j(factory3);
                        khk.c.Companion.getClass();
                        Intrinsics.checkNotNullParameter(factory3, "factory");
                        return factory3.a();
                    case 2:
                        cha.b bVarC2 = aVar8.c();
                        vc.s.j(bVarC2);
                        return new com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_selection.switch_to_individual.c(bVarC2, new nhk.b());
                    case 3:
                        return new wmk.f(i0Var9.f246024x.a(), new whk.g(new whk.a(), new umk.n(new tjk.d())));
                    case 4:
                        gte.a aVarB6 = aVar9.b();
                        vc.s.j(aVarB6);
                        pfk.x xVarD = aVar8.d();
                        vc.s.j(xVarD);
                        return new aok.c(aVarB6, xVarD, ((s41.a) i0Var9.k).d());
                    case 5:
                        i0 i0Var10 = d2Var.f245919b;
                        ffk.t tVarF3 = i0Var10.f246013h.f();
                        vc.s.j(tVarF3);
                        r10.q qVarD = i0Var10.f246014j.d();
                        gte.a aVarB7 = i0Var10.f246011c.b();
                        vc.s.j(aVarB7);
                        return new dhk.e(new dhk.l(tVarF3, qVarD, aVarB7));
                    case 6:
                        jhk.c cVar3 = d2Var.f245918a;
                        ffk.t tVarF4 = aVar8.f();
                        vc.s.j(tVarF4);
                        phk.k kVar2 = (phk.k) d2Var.f245920c.get();
                        bgk.a aVar10 = (bgk.a) d2Var.d.get();
                        SwitchToIndividualPromptControllerModelExtension switchToIndividualPromptControllerModelExtension = (SwitchToIndividualPromptControllerModelExtension) d2Var.e.get();
                        wmk.b bVar = (wmk.b) d2Var.f.get();
                        aok.a aVar11 = (aok.a) d2Var.f245921g.get();
                        wfk.a aVar12 = (wfk.a) d2Var.f245922h.get();
                        com.revolut.retail.feature.pricing_plans.ui.impl.analytics.a aVar13 = new com.revolut.retail.feature.pricing_plans.ui.impl.analytics.a((yik.d) d2Var.i.get());
                        gte.a aVarB8 = aVar9.b();
                        vc.s.j(aVarB8);
                        return new com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_selection.b(cVar3, tVarF4, kVar2, aVar10, switchToIndividualPromptControllerModelExtension, bVar, aVar11, aVar12, aVar13, aVarB8);
                    case 7:
                        gte.a aVarB9 = aVar9.b();
                        vc.s.j(aVarB9);
                        return new yik.d(aVarB9);
                    default:
                        throw new AssertionError(i32);
                }
            case 8:
                e2 e2Var = (e2) this.d;
                i0 i0Var11 = (i0) this.f246191b;
                efk.a aVar14 = i0Var11.f246013h;
                ite.a aVar15 = i0Var11.f246011c;
                int i33 = this.f246192c;
                switch (i33) {
                    case 0:
                        gte.a aVarB10 = aVar15.b();
                        vc.s.j(aVarB10);
                        return new phk.l(aVarB10);
                    case 1:
                        ohk.a factory4 = i0Var11.u.d();
                        vc.s.j(factory4);
                        khk.c.Companion.getClass();
                        Intrinsics.checkNotNullParameter(factory4, "factory");
                        return factory4.a();
                    case 2:
                        cha.b bVarC3 = aVar14.c();
                        vc.s.j(bVarC3);
                        return new com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_selection.switch_to_individual.c(bVarC3, new nhk.b());
                    case 3:
                        return new wmk.f(i0Var11.f246024x.a(), new whk.g(new whk.a(), new umk.n(new tjk.d())));
                    case 4:
                        gte.a aVarB11 = aVar15.b();
                        vc.s.j(aVarB11);
                        pfk.x xVarD2 = aVar14.d();
                        vc.s.j(xVarD2);
                        return new aok.c(aVarB11, xVarD2, ((s41.a) i0Var11.k).d());
                    case 5:
                        i0 i0Var12 = e2Var.f245940b;
                        ffk.t tVarF5 = i0Var12.f246013h.f();
                        vc.s.j(tVarF5);
                        r10.q qVarD2 = i0Var12.f246014j.d();
                        gte.a aVarB12 = i0Var12.f246011c.b();
                        vc.s.j(aVarB12);
                        return new dhk.e(new dhk.l(tVarF5, qVarD2, aVarB12));
                    case 6:
                        jhk.c cVar4 = e2Var.f245939a;
                        ffk.t tVarF6 = aVar14.f();
                        vc.s.j(tVarF6);
                        phk.k kVar3 = (phk.k) e2Var.d.get();
                        bgk.a aVar16 = (bgk.a) e2Var.e.get();
                        SwitchToIndividualPromptControllerModelExtension switchToIndividualPromptControllerModelExtension2 = (SwitchToIndividualPromptControllerModelExtension) e2Var.f.get();
                        wmk.b bVar2 = (wmk.b) e2Var.f245942g.get();
                        aok.a aVar17 = (aok.a) e2Var.f245943h.get();
                        wfk.a aVar18 = (wfk.a) e2Var.i.get();
                        com.revolut.retail.feature.pricing_plans.ui.impl.analytics.a aVar19 = new com.revolut.retail.feature.pricing_plans.ui.impl.analytics.a((yik.d) e2Var.f245944j.get());
                        gte.a aVarB13 = aVar15.b();
                        vc.s.j(aVarB13);
                        return new com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_selection.b(cVar4, tVarF6, kVar3, aVar16, switchToIndividualPromptControllerModelExtension2, bVar2, aVar17, aVar18, aVar19, aVarB13);
                    case 7:
                        gte.a aVarB14 = aVar15.b();
                        vc.s.j(aVarB14);
                        return new yik.d(aVarB14);
                    default:
                        throw new AssertionError(i33);
                }
            case 9:
                i0 i0Var13 = (i0) this.f246191b;
                i3 i3Var2 = i0Var13.f246010b;
                cri.b bVar3 = i0Var13.k;
                g3 g3Var = i0Var13.u;
                g2 g2Var = (g2) this.d;
                int i43 = this.f246192c;
                switch (i43) {
                    case 0:
                        return qgh.c.j(g2Var.f245969a, (zfk.c) g2Var.i.get(), (xfk.b) g2Var.f.get(), (bgk.a) g2Var.f245972g.get(), (wfk.a) g2Var.f245973h.get());
                    case 1:
                        mhk.a factory5 = g3Var.c();
                        vc.s.j(factory5);
                        xfk.b planDurableTermsControllerExtension = (xfk.b) g2Var.f.get();
                        bgk.a planTermsWorkflowControllerExtension = (bgk.a) g2Var.f245972g.get();
                        wfk.a globalPlansControllerExtension = (wfk.a) g2Var.f245973h.get();
                        Intrinsics.checkNotNullParameter(factory5, "factory");
                        Intrinsics.checkNotNullParameter(planDurableTermsControllerExtension, "planDurableTermsControllerExtension");
                        Intrinsics.checkNotNullParameter(planTermsWorkflowControllerExtension, "planTermsWorkflowControllerExtension");
                        Intrinsics.checkNotNullParameter(globalPlansControllerExtension, "globalPlansControllerExtension");
                        return factory5.a(planTermsWorkflowControllerExtension, planDurableTermsControllerExtension, globalPlansControllerExtension);
                    case 2:
                        fhk.a factory6 = g3Var.b();
                        vc.s.j(factory6);
                        Intrinsics.checkNotNullParameter(factory6, "factory");
                        return factory6.a();
                    case 3:
                        ohk.a factory7 = g3Var.d();
                        vc.s.j(factory7);
                        Intrinsics.checkNotNullParameter(factory7, "factory");
                        return factory7.a();
                    case 4:
                        dhk.a factory8 = g3Var.a();
                        vc.s.j(factory8);
                        Intrinsics.checkNotNullParameter(factory8, "factory");
                        return new dhk.e(factory8.f114822a);
                    case 5:
                        wli.x xVarD3 = ((s41.a) bVar3).d();
                        ajk.b bVarF = i3Var2.f();
                        zfk.c cVar5 = (zfk.c) g2Var.i.get();
                        ma3.a aVarA2 = i0Var13.f246023w.a();
                        vc.s.j(aVarA2);
                        ffk.t tVarF7 = i0Var13.f246013h.f();
                        vc.s.j(tVarF7);
                        return qgh.c.h(xVarD3, bVarF, cVar5, aVarA2, tVarF7, new ylk.a());
                    case 6:
                        PlanBillingPickerContract$InputData planBillingPickerContract$InputData = g2Var.f245970b;
                        wli.x xVarD4 = ((s41.a) bVar3).d();
                        ajk.b bVarF2 = i3Var2.f();
                        com.revolut.retail.feature.pricing_plans.ui.impl.flow.action.b bVar4 = (com.revolut.retail.feature.pricing_plans.ui.impl.flow.action.b) g2Var.k.get();
                        com.revolut.retail.feature.pricing_plans.ui.impl.flow.action.a aVar20 = new com.revolut.retail.feature.pricing_plans.ui.impl.flow.action.a();
                        hkd.b bVar5 = (hkd.b) i0Var13.d.M.get();
                        vc.s.j(bVar5);
                        return new com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_billing_picker.a(planBillingPickerContract$InputData, xVarD4, bVarF2, bVar4, aVar20, bVar5);
                    default:
                        throw new AssertionError(i43);
                }
            case 10:
                i0 i0Var14 = (i0) this.f246191b;
                i2 i2Var = (i2) this.d;
                int i59 = this.f246192c;
                switch (i59) {
                    case 0:
                        return qgh.c.j(i2Var.f246029a, (zfk.c) i2Var.f246033h.get(), (xfk.b) i2Var.e.get(), (bgk.a) i2Var.f.get(), (wfk.a) i2Var.f246032g.get());
                    case 1:
                        mhk.a factory9 = i0Var14.u.c();
                        vc.s.j(factory9);
                        xfk.b planDurableTermsControllerExtension2 = (xfk.b) i2Var.e.get();
                        bgk.a planTermsWorkflowControllerExtension2 = (bgk.a) i2Var.f.get();
                        wfk.a globalPlansControllerExtension2 = (wfk.a) i2Var.f246032g.get();
                        Intrinsics.checkNotNullParameter(factory9, "factory");
                        Intrinsics.checkNotNullParameter(planDurableTermsControllerExtension2, "planDurableTermsControllerExtension");
                        Intrinsics.checkNotNullParameter(planTermsWorkflowControllerExtension2, "planTermsWorkflowControllerExtension");
                        Intrinsics.checkNotNullParameter(globalPlansControllerExtension2, "globalPlansControllerExtension");
                        return factory9.a(planTermsWorkflowControllerExtension2, planDurableTermsControllerExtension2, globalPlansControllerExtension2);
                    case 2:
                        fhk.a factory10 = i0Var14.u.b();
                        vc.s.j(factory10);
                        Intrinsics.checkNotNullParameter(factory10, "factory");
                        return factory10.a();
                    case 3:
                        ohk.a factory11 = i0Var14.u.d();
                        vc.s.j(factory11);
                        Intrinsics.checkNotNullParameter(factory11, "factory");
                        return factory11.a();
                    case 4:
                        dhk.a factory12 = i0Var14.u.a();
                        vc.s.j(factory12);
                        Intrinsics.checkNotNullParameter(factory12, "factory");
                        return new dhk.e(factory12.f114822a);
                    case 5:
                        wli.x xVarD5 = ((s41.a) i0Var14.k).d();
                        ajk.b bVarF3 = i0Var14.f246010b.f();
                        zfk.c cVar6 = (zfk.c) i2Var.f246033h.get();
                        ma3.a aVarA3 = i0Var14.f246023w.a();
                        vc.s.j(aVarA3);
                        ffk.t tVarF8 = i0Var14.f246013h.f();
                        vc.s.j(tVarF8);
                        return qgh.c.h(xVarD5, bVarF3, cVar6, aVarA3, tVarF8, new ylk.a());
                    case 6:
                        PlanBillingPickerContract$InputData planBillingPickerContract$InputData2 = i2Var.f246030b;
                        wli.x xVarD6 = ((s41.a) i0Var14.k).d();
                        ajk.b bVarF4 = i0Var14.f246010b.f();
                        com.revolut.retail.feature.pricing_plans.ui.impl.flow.action.b bVar6 = (com.revolut.retail.feature.pricing_plans.ui.impl.flow.action.b) i2Var.f246034j.get();
                        com.revolut.retail.feature.pricing_plans.ui.impl.flow.action.a aVar21 = new com.revolut.retail.feature.pricing_plans.ui.impl.flow.action.a();
                        hkd.b bVar7 = (hkd.b) i0Var14.d.M.get();
                        vc.s.j(bVar7);
                        return new com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_billing_picker.a(planBillingPickerContract$InputData2, xVarD6, bVarF4, bVar6, aVar21, bVar7);
                    default:
                        throw new AssertionError(i59);
                }
            case 11:
                i0 i0Var15 = (i0) this.f246191b;
                k2 k2Var = (k2) this.d;
                i0 i0Var16 = k2Var.f246087c;
                int i66 = this.f246192c;
                switch (i66) {
                    case 0:
                        fd6.a aVar22 = (fd6.a) k2Var.e.get();
                        va.g.t(aVar22);
                        return aVar22;
                    case 1:
                        return va.g.s(((zc6.a) i0Var15.B).d(), (xc6.a) k2Var.d.get());
                    case 2:
                        return r6.b.k((zc6.a) i0Var15.B, "factory");
                    case 3:
                        return va.g.u((xc6.a) k2Var.d.get());
                    case 4:
                        return new com.revolut.retail.feature.pricing_plans.ui.impl.footer.d(((s41.a) i0Var15.k).d(), i0Var15.f246010b.f(), new ajk.c(i0Var16.f246010b.g()));
                    case 5:
                        cli.n nVar3 = (cli.n) k2Var.f246090j.get();
                        PlanBillingPickerScreenContract$InputData planBillingPickerScreenContract$InputData = k2Var.f246086b;
                        egk.e eVarE2 = i0Var16.f246010b.e();
                        vc.s.j(eVarE2);
                        zkk.a aVar23 = new zkk.a(eVarE2, (yik.d) k2Var.i.get());
                        ffk.t tVarF9 = i0Var16.f246013h.f();
                        vc.s.j(tVarF9);
                        return new zkk.t(nVar3, planBillingPickerScreenContract$InputData, aVar23, new i4b.f(tVarF9), (dgk.a) k2Var.f246089h.get(), ((zc6.a) i0Var15.B).b());
                    case 6:
                        return new zkk.u(k2Var.f246086b, new hhk.b(new com.revolut.retail.feature.pricing_plans.ui.impl.footer.e(), new hhk.a(new dnk.l(i0Var16.e.g(), 0))), ((zc6.a) i0Var15.B).c(), new com.revolut.retail.feature.pricing_plans.ui.impl.analytics.a((yik.d) k2Var.i.get()));
                    case 7:
                        gte.a aVarB15 = i0Var15.f246011c.b();
                        vc.s.j(aVarB15);
                        return new yik.d(aVarB15);
                    default:
                        throw new AssertionError(i66);
                }
            case 12:
                o2 o2Var = (o2) this.d;
                int i74 = this.f246192c;
                if (i74 == 0) {
                    return new com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_offer_prompt.a((cli.n) o2Var.f246183c.get(), o2Var.f246182b, ((i0) this.f246191b).f246024x.a());
                }
                if (i74 == 1) {
                    return new umk.n(new tjk.d());
                }
                throw new AssertionError(i74);
            case 13:
                i0 i0Var17 = (i0) this.f246191b;
                zc6.b bVar8 = i0Var17.B;
                k2 k2Var2 = (k2) this.d;
                i0 i0Var18 = k2Var2.f246087c;
                int i92 = this.f246192c;
                switch (i92) {
                    case 0:
                        fd6.a aVar24 = (fd6.a) k2Var2.e.get();
                        va.g.t(aVar24);
                        return aVar24;
                    case 1:
                        return va.g.s(((zc6.a) bVar8).d(), (xc6.a) k2Var2.d.get());
                    case 2:
                        return r6.b.k((zc6.a) bVar8, "factory");
                    case 3:
                        return va.g.u((xc6.a) k2Var2.d.get());
                    case 4:
                        return new com.revolut.retail.feature.pricing_plans.ui.impl.footer.d(((s41.a) i0Var17.k).d(), i0Var17.f246010b.f(), new ajk.c(i0Var18.f246010b.g()));
                    case 5:
                        cli.n nVar4 = (cli.n) k2Var2.f246090j.get();
                        PlanBillingPickerScreenContract$InputData planBillingPickerScreenContract$InputData2 = k2Var2.f246086b;
                        egk.e eVarE3 = i0Var18.f246010b.e();
                        vc.s.j(eVarE3);
                        zkk.a aVar25 = new zkk.a(eVarE3, (yik.d) k2Var2.i.get());
                        ffk.t tVarF10 = i0Var18.f246013h.f();
                        vc.s.j(tVarF10);
                        return new zkk.t(nVar4, planBillingPickerScreenContract$InputData2, aVar25, new i4b.f(tVarF10), (dgk.a) k2Var2.f246089h.get(), ((zc6.a) bVar8).b());
                    case 6:
                        return new zkk.u(k2Var2.f246086b, new hhk.b(new com.revolut.retail.feature.pricing_plans.ui.impl.footer.e(), new hhk.a(new dnk.l(i0Var18.e.g(), 0))), ((zc6.a) bVar8).c(), new com.revolut.retail.feature.pricing_plans.ui.impl.analytics.a((yik.d) k2Var2.i.get()));
                    case 7:
                        gte.a aVarB16 = i0Var17.f246011c.b();
                        vc.s.j(aVarB16);
                        return new yik.d(aVarB16);
                    default:
                        throw new AssertionError(i92);
                }
            case 14:
                o2 o2Var2 = (o2) this.d;
                int i96 = this.f246192c;
                if (i96 == 0) {
                    return new com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_offer_prompt.a((cli.n) o2Var2.f246183c.get(), o2Var2.f246182b, ((i0) this.f246191b).f246024x.a());
                }
                if (i96 == 1) {
                    return new umk.n(new tjk.d());
                }
                throw new AssertionError(i96);
            case 15:
                int i99 = this.f246192c;
                if (i99 != 0) {
                    if (i99 == 1) {
                        return new glk.m(new glk.b());
                    }
                    throw new AssertionError(i99);
                }
                s2 s2Var = (s2) this.d;
                PlanDowngradeBlockScreenContract$InputData planDowngradeBlockScreenContract$InputData = s2Var.f246232a;
                cli.n nVar5 = (cli.n) s2Var.f246233b.get();
                ffk.t tVarF11 = ((i0) this.f246191b).f246013h.f();
                vc.s.j(tVarF11);
                return new glk.l(planDowngradeBlockScreenContract$InputData, nVar5, tVarF11);
            case 16:
                i0 i0Var19 = (i0) this.f246191b;
                u2 u2Var = (u2) this.d;
                int i100 = this.f246192c;
                if (i100 == 0) {
                    return kxa.j.k((j60.a) u2Var.e.get());
                }
                if (i100 == 1) {
                    return ehe.n.s((com.revolut.kompot.navigable.a) u2Var.f246277c.get(), (rp0.m) u2Var.d.get());
                }
                if (i100 == 2) {
                    return new rp0.m();
                }
                if (i100 != 3) {
                    if (i100 == 4) {
                        return new jlk.q();
                    }
                    throw new AssertionError(i100);
                }
                cli.n nVar6 = (cli.n) u2Var.f246278g.get();
                PlanDowngradeFeesAndTermsScreenContract$InputData planDowngradeFeesAndTermsScreenContract$InputData = u2Var.f246276b;
                q06.l lVarA2 = i0Var19.f.a();
                vc.s.j(lVarA2);
                return new jlk.p(nVar6, planDowngradeFeesAndTermsScreenContract$InputData, lVarA2, new llk.a(), (j60.a) u2Var.e.get(), i0Var19.f246010b.f());
            case 17:
                i0 i0Var20 = (i0) this.f246191b;
                u2 u2Var2 = (u2) this.d;
                int i101 = this.f246192c;
                if (i101 == 0) {
                    return kxa.j.k((j60.a) u2Var2.e.get());
                }
                if (i101 == 1) {
                    return ehe.n.s((com.revolut.kompot.navigable.a) u2Var2.f246277c.get(), (rp0.m) u2Var2.d.get());
                }
                if (i101 == 2) {
                    return new rp0.m();
                }
                if (i101 != 3) {
                    if (i101 == 4) {
                        return new jlk.q();
                    }
                    throw new AssertionError(i101);
                }
                cli.n nVar7 = (cli.n) u2Var2.f246278g.get();
                PlanDowngradeFeesAndTermsScreenContract$InputData planDowngradeFeesAndTermsScreenContract$InputData2 = u2Var2.f246276b;
                q06.l lVarA3 = i0Var20.f.a();
                vc.s.j(lVarA3);
                return new jlk.p(nVar7, planDowngradeFeesAndTermsScreenContract$InputData2, lVarA3, new llk.a(), (j60.a) u2Var2.e.get(), i0Var20.f246010b.f());
            case 18:
                i0 i0Var21 = (i0) this.f246191b;
                v2 v2Var = (v2) this.d;
                int i102 = this.f246192c;
                if (i102 == 0) {
                    return kxa.j.k((j60.a) v2Var.e.get());
                }
                if (i102 == 1) {
                    return ehe.n.s((com.revolut.kompot.navigable.a) v2Var.f246296c.get(), (rp0.m) v2Var.d.get());
                }
                if (i102 == 2) {
                    return new rp0.m();
                }
                if (i102 != 3) {
                    if (i102 == 4) {
                        return new jlk.q();
                    }
                    throw new AssertionError(i102);
                }
                cli.n nVar8 = (cli.n) v2Var.f246297g.get();
                PlanDowngradeFeesAndTermsScreenContract$InputData planDowngradeFeesAndTermsScreenContract$InputData3 = v2Var.f246294a;
                q06.l lVarA4 = i0Var21.f.a();
                vc.s.j(lVarA4);
                return new jlk.p(nVar8, planDowngradeFeesAndTermsScreenContract$InputData3, lVarA4, new llk.a(), (j60.a) v2Var.e.get(), i0Var21.f246010b.f());
            case 19:
                i0 i0Var22 = (i0) this.f246191b;
                u2 u2Var3 = (u2) this.d;
                int i103 = this.f246192c;
                if (i103 == 0) {
                    return kxa.j.k((j60.a) u2Var3.e.get());
                }
                if (i103 == 1) {
                    return ehe.n.s((com.revolut.kompot.navigable.a) u2Var3.f246277c.get(), (rp0.m) u2Var3.d.get());
                }
                if (i103 == 2) {
                    return new rp0.m();
                }
                if (i103 != 3) {
                    if (i103 == 4) {
                        return new jlk.q();
                    }
                    throw new AssertionError(i103);
                }
                cli.n nVar9 = (cli.n) u2Var3.f246278g.get();
                PlanDowngradeFeesAndTermsScreenContract$InputData planDowngradeFeesAndTermsScreenContract$InputData4 = u2Var3.f246276b;
                q06.l lVarA5 = i0Var22.f.a();
                vc.s.j(lVarA5);
                return new jlk.p(nVar9, planDowngradeFeesAndTermsScreenContract$InputData4, lVarA5, new llk.a(), (j60.a) u2Var3.e.get(), i0Var22.f246010b.f());
            case 20:
                int i104 = this.f246192c;
                if (i104 != 0) {
                    if (i104 == 1) {
                        return new glk.m(new glk.b());
                    }
                    throw new AssertionError(i104);
                }
                w2 w2Var = (w2) this.d;
                PlanDowngradeBlockScreenContract$InputData planDowngradeBlockScreenContract$InputData2 = w2Var.f246308a;
                cli.n nVar10 = (cli.n) w2Var.f246310c.get();
                ffk.t tVarF12 = ((i0) this.f246191b).f246013h.f();
                vc.s.j(tVarF12);
                return new glk.l(planDowngradeBlockScreenContract$InputData2, nVar10, tVarF12);
            case 21:
                i0 i0Var23 = (i0) this.f246191b;
                u2 u2Var4 = (u2) this.d;
                int i105 = this.f246192c;
                if (i105 == 0) {
                    return kxa.j.k((j60.a) u2Var4.e.get());
                }
                if (i105 == 1) {
                    return ehe.n.s((com.revolut.kompot.navigable.a) u2Var4.f246277c.get(), (rp0.m) u2Var4.d.get());
                }
                if (i105 == 2) {
                    return new rp0.m();
                }
                if (i105 != 3) {
                    if (i105 == 4) {
                        return new jlk.q();
                    }
                    throw new AssertionError(i105);
                }
                cli.n nVar11 = (cli.n) u2Var4.f246278g.get();
                PlanDowngradeFeesAndTermsScreenContract$InputData planDowngradeFeesAndTermsScreenContract$InputData5 = u2Var4.f246276b;
                q06.l lVarA6 = i0Var23.f.a();
                vc.s.j(lVarA6);
                return new jlk.p(nVar11, planDowngradeFeesAndTermsScreenContract$InputData5, lVarA6, new llk.a(), (j60.a) u2Var4.e.get(), i0Var23.f246010b.f());
            case 22:
                return a();
            case 23:
                return b();
            case 24:
                return c();
            case 25:
                qh8.k kVar4 = (qh8.k) this.f246191b;
                qh8.b bVar9 = kVar4.f;
                nj0.a aVar26 = kVar4.f246538m;
                int i106 = this.f246192c;
                if (i106 != 0) {
                    if (i106 != 1) {
                        throw new AssertionError(i106);
                    }
                    wj0.a idempotencyKeyHolder = ((nj0.d) aVar26).i();
                    vc.s.j(idempotencyKeyHolder);
                    l80.e dateProvider = kVar4.i.h();
                    vc.s.j(dateProvider);
                    ii8.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
                    Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
                    return new m60.b(idempotencyKeyHolder, dateProvider, "JUNIOR_ACCOUNT_CREATION_TAG");
                }
                qh8.l lVar = (qh8.l) this.d;
                vh8.b gmUiConfiguration = new vh8.b();
                vh8.a ptUiConfiguration = new vh8.a(new vh8.b(), 2);
                vh8.a coUiConfiguration = new vh8.a(new vh8.b(), 0);
                vh8.a usUiConfiguration = new vh8.a(new vh8.b(), 3);
                vh8.a grUiConfiguration = new vh8.a(new vh8.b(), 1);
                ang.f userInteractor = lVar.f246540a.f246537l.e();
                Intrinsics.checkNotNullParameter(gmUiConfiguration, "gmUiConfiguration");
                Intrinsics.checkNotNullParameter(ptUiConfiguration, "ptUiConfiguration");
                Intrinsics.checkNotNullParameter(coUiConfiguration, "coUiConfiguration");
                Intrinsics.checkNotNullParameter(usUiConfiguration, "usUiConfiguration");
                Intrinsics.checkNotNullParameter(grUiConfiguration, "grUiConfiguration");
                Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
                hd.r rVar = new hd.r();
                rVar.f151364a = gmUiConfiguration;
                rVar.f151365b = ptUiConfiguration;
                rVar.f151366c = coUiConfiguration;
                rVar.d = usUiConfiguration;
                rVar.e = grUiConfiguration;
                rVar.f = userInteractor;
                prl.e eVarA = bVar9.a();
                te8.z zVarE = kVar4.d.e();
                vc.s.j(zVarE);
                wj0.a aVarI = ((nj0.d) aVar26).i();
                vc.s.j(aVarI);
                rh8.o0 o0Var = (rh8.o0) bVar9.f246500m.get();
                vc.s.j(o0Var);
                return new com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.e(rVar, eVarA, zVarE, aVarI, o0Var);
            case 26:
                return d();
            case 27:
                return e();
            case 28:
                int i107 = this.f246192c;
                if (i107 == 0) {
                    ql7.i iVar = (ql7.i) this.d;
                    return new com.revolut.feature.insurance_car.impl.ui.flow.cancellation.b(iVar.f247326a, new aq7.a(iVar.d));
                }
                if (i107 == 1) {
                    return new rl7.d((ll7.i0) ((ql7.k0) this.f246191b).f247367y.get());
                }
                throw new AssertionError(i107);
            default:
                ql7.j jVar = (ql7.j) this.d;
                int i108 = this.f246192c;
                if (i108 == 0) {
                    return new bq7.l((jki.p) jVar.f247339b.get(), jVar.f247338a, (ll7.v) ((ql7.k0) this.f246191b).f247365w.get());
                }
                if (i108 == 1) {
                    return new bq7.m();
                }
                throw new AssertionError(i108);
        }
    }
}
