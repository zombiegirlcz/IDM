package afj;

import com.revolut.retail.feature.esim.impl.ui.screens.country_picker.EsimCountryPickerScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.home.get_plan.EsimGetPlanScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_billing.EsimMobilePlanBillingScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_get_port_out_credentials.EsimMobilePlanGetPortOutCredentialsScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_invoices.EsimMobilePlanInvoicesScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer.EsimMobilePlanNumberTransferScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_payments.EsimMobilePlanPaymentsScreenContract$InputData;

/* JADX INFO: loaded from: classes11.dex */
public final class c1 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f4189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4190c;
    public final Object d;

    public /* synthetic */ c1(b bVar, Object obj2, int i, int i2) {
        this.f4188a = i2;
        this.f4189b = bVar;
        this.d = obj2;
        this.f4190c = i;
    }

    private final Object a() {
        x1 x1Var = (x1) this.d;
        int i = this.f4190c;
        if (i != 0) {
            if (i != 1) {
                throw new AssertionError(i);
            }
            dec.r rVar = new dec.r();
            dec.g gVar = new dec.g();
            dec.a aVar = new dec.a();
            l80.e eVarH = x1Var.f4521c.f4150p.h();
            vc.s.j(eVarH);
            return new fjj.c0(new hjj.d(new dec.q(rVar, gVar, aVar, eVarH)), new hjj.h(), new hjj.g(), new hjj.i(), new hjj.b());
        }
        EsimMobilePlanBillingScreenContract$InputData esimMobilePlanBillingScreenContract$InputData = x1Var.f4520b;
        cli.n nVar = (cli.n) x1Var.d.get();
        hjj.e eVar = new hjj.e();
        b bVar = this.f4189b;
        q7c.g gVarE = bVar.k.e();
        dfj.s3 s3Var = (dfj.s3) bVar.f4140k0.get();
        hjj.f fVar = new hjj.f();
        nyb.k kVarC = bVar.f4166x.c();
        vc.s.j(kVarC);
        dfj.c0 c0Var = (dfj.c0) bVar.f4124b1.get();
        gte.a aVarB = bVar.f4120a.b();
        vc.s.j(aVarB);
        return new com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_billing.a(esimMobilePlanBillingScreenContract$InputData, nVar, eVar, gVarE, s3Var, fVar, kVarC, c0Var, aVarB, new ijj.u(b.b()));
    }

    private final Object b() {
        f2 f2Var = (f2) this.d;
        int i = this.f4190c;
        if (i == 0) {
            cli.n nVar = (cli.n) f2Var.d.get();
            EsimMobilePlanInvoicesScreenContract$InputData esimMobilePlanInvoicesScreenContract$InputData = f2Var.f4243b;
            b bVar = this.f4189b;
            return new hkj.f(nVar, esimMobilePlanInvoicesScreenContract$InputData, (bej.m) bVar.F0.get(), (dfj.s3) bVar.f4140k0.get(), new jkj.a());
        }
        if (i != 1) {
            throw new AssertionError(i);
        }
        l70.e eVar = f2Var.f4244c.f4150p;
        qd0.b bVarN = eVar.n();
        vc.s.j(bVarN);
        l80.e eVarH = eVar.h();
        vc.s.j(eVarH);
        return new a3e.u(new jkj.e(bVarN, eVarH));
    }

    private final Object c() {
        h2 h2Var = (h2) this.d;
        b bVar = h2Var.f4274c;
        EsimMobilePlanNumberTransferScreenContract$InputData esimMobilePlanNumberTransferScreenContract$InputData = h2Var.f4273b;
        int i = this.f4190c;
        if (i != 0) {
            if (i == 1) {
                return new pkj.m(esimMobilePlanNumberTransferScreenContract$InputData, new rkj.c(esimMobilePlanNumberTransferScreenContract$InputData), new rkj.b(esimMobilePlanNumberTransferScreenContract$InputData, bVar.c(), new ugc.a(b.b())));
            }
            throw new AssertionError(i);
        }
        cli.n nVar = (cli.n) h2Var.d.get();
        ang.f fVarE = bVar.f4142l.e();
        z80.b bVarS = bVar.f4150p.s();
        vc.s.j(bVarS);
        r10.d dVar = new r10.d(fVarE, bVarS);
        z80.b bVarS2 = this.f4189b.f4150p.s();
        vc.s.j(bVarS2);
        return new pkj.k(nVar, esimMobilePlanNumberTransferScreenContract$InputData, dVar, bVarS2);
    }

    @Override // phm.a
    public final Object get() {
        switch (this.f4188a) {
            case 0:
                d1 d1Var = (d1) this.d;
                int i = this.f4190c;
                if (i == 0) {
                    return new hhj.g((jki.p) d1Var.e.get());
                }
                if (i != 1) {
                    if (i == 2) {
                        return ihj.c.a((com.revolut.kompot.navigable.a) d1Var.f4205c.get());
                    }
                    throw new AssertionError(i);
                }
                EsimCountryPickerScreenContract$InputData esimCountryPickerScreenContract$InputData = d1Var.f4204b;
                f01.a aVar = (f01.a) d1Var.d.get();
                ynj.e eVar = new ynj.e();
                b bVar = this.f4189b;
                return new com.revolut.retail.feature.esim.impl.ui.screens.country_picker.a(esimCountryPickerScreenContract$InputData, aVar, eVar, (xnj.a) bVar.R0.get(), new jhj.e(new jhj.a(new ynj.e())), (cej.b) bVar.X.get());
            case 1:
                d1 d1Var2 = (d1) this.d;
                int i2 = this.f4190c;
                if (i2 == 0) {
                    return new hhj.g((jki.p) d1Var2.e.get());
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        return ihj.c.a((com.revolut.kompot.navigable.a) d1Var2.f4205c.get());
                    }
                    throw new AssertionError(i2);
                }
                EsimCountryPickerScreenContract$InputData esimCountryPickerScreenContract$InputData2 = d1Var2.f4204b;
                f01.a aVar2 = (f01.a) d1Var2.d.get();
                ynj.e eVar2 = new ynj.e();
                b bVar2 = this.f4189b;
                return new com.revolut.retail.feature.esim.impl.ui.screens.country_picker.a(esimCountryPickerScreenContract$InputData2, aVar2, eVar2, (xnj.a) bVar2.R0.get(), new jhj.e(new jhj.a(new ynj.e())), (cej.b) bVar2.X.get());
            case 2:
                d1 d1Var3 = (d1) this.d;
                int i3 = this.f4190c;
                if (i3 == 0) {
                    return new hhj.g((jki.p) d1Var3.e.get());
                }
                if (i3 != 1) {
                    if (i3 == 2) {
                        return ihj.c.a((com.revolut.kompot.navigable.a) d1Var3.f4205c.get());
                    }
                    throw new AssertionError(i3);
                }
                EsimCountryPickerScreenContract$InputData esimCountryPickerScreenContract$InputData3 = d1Var3.f4204b;
                f01.a aVar3 = (f01.a) d1Var3.d.get();
                ynj.e eVar3 = new ynj.e();
                b bVar3 = this.f4189b;
                return new com.revolut.retail.feature.esim.impl.ui.screens.country_picker.a(esimCountryPickerScreenContract$InputData3, aVar3, eVar3, (xnj.a) bVar3.R0.get(), new jhj.e(new jhj.a(new ynj.e())), (cej.b) bVar3.X.get());
            case 3:
                d1 d1Var4 = (d1) this.d;
                int i5 = this.f4190c;
                if (i5 == 0) {
                    return new hhj.g((jki.p) d1Var4.e.get());
                }
                if (i5 != 1) {
                    if (i5 == 2) {
                        return ihj.c.a((com.revolut.kompot.navigable.a) d1Var4.f4205c.get());
                    }
                    throw new AssertionError(i5);
                }
                EsimCountryPickerScreenContract$InputData esimCountryPickerScreenContract$InputData4 = d1Var4.f4204b;
                f01.a aVar4 = (f01.a) d1Var4.d.get();
                ynj.e eVar4 = new ynj.e();
                b bVar4 = this.f4189b;
                return new com.revolut.retail.feature.esim.impl.ui.screens.country_picker.a(esimCountryPickerScreenContract$InputData4, aVar4, eVar4, (xnj.a) bVar4.R0.get(), new jhj.e(new jhj.a(new ynj.e())), (cej.b) bVar4.X.get());
            case 4:
                d1 d1Var5 = (d1) this.d;
                int i6 = this.f4190c;
                if (i6 == 0) {
                    return new hhj.g((jki.p) d1Var5.e.get());
                }
                if (i6 != 1) {
                    if (i6 == 2) {
                        return ihj.c.a((com.revolut.kompot.navigable.a) d1Var5.f4205c.get());
                    }
                    throw new AssertionError(i6);
                }
                EsimCountryPickerScreenContract$InputData esimCountryPickerScreenContract$InputData5 = d1Var5.f4204b;
                f01.a aVar5 = (f01.a) d1Var5.d.get();
                ynj.e eVar5 = new ynj.e();
                b bVar5 = this.f4189b;
                return new com.revolut.retail.feature.esim.impl.ui.screens.country_picker.a(esimCountryPickerScreenContract$InputData5, aVar5, eVar5, (xnj.a) bVar5.R0.get(), new jhj.e(new jhj.a(new ynj.e())), (cej.b) bVar5.X.get());
            case 5:
                d1 d1Var6 = (d1) this.d;
                int i21 = this.f4190c;
                if (i21 == 0) {
                    return new hhj.g((jki.p) d1Var6.e.get());
                }
                if (i21 != 1) {
                    if (i21 == 2) {
                        return ihj.c.a((com.revolut.kompot.navigable.a) d1Var6.f4205c.get());
                    }
                    throw new AssertionError(i21);
                }
                EsimCountryPickerScreenContract$InputData esimCountryPickerScreenContract$InputData6 = d1Var6.f4204b;
                f01.a aVar6 = (f01.a) d1Var6.d.get();
                ynj.e eVar6 = new ynj.e();
                b bVar6 = this.f4189b;
                return new com.revolut.retail.feature.esim.impl.ui.screens.country_picker.a(esimCountryPickerScreenContract$InputData6, aVar6, eVar6, (xnj.a) bVar6.R0.get(), new jhj.e(new jhj.a(new ynj.e())), (cej.b) bVar6.X.get());
            case 6:
                g1 g1Var = (g1) this.d;
                b bVar7 = this.f4189b;
                int i22 = this.f4190c;
                if (i22 != 0) {
                    if (i22 != 1) {
                        throw new AssertionError(i22);
                    }
                    dij.b bVar8 = new dij.b(new vnj.a());
                    dij.a aVar7 = new dij.a();
                    gte.a aVarB = bVar7.f4120a.b();
                    vc.s.j(aVarB);
                    return new bij.l(bVar8, aVar7, aVarB, (cej.b) bVar7.X.get());
                }
                cli.n nVar = (cli.n) g1Var.f4256c.get();
                dfj.k0 k0Var = (dfj.k0) bVar7.Y.get();
                eij.a aVar8 = new eij.a();
                b bVar9 = g1Var.f4255b;
                dfj.v2 v2Var = (dfj.v2) bVar9.R.get();
                nfj.a1 a1Var = (nfj.a1) bVar9.Q.get();
                dfj.s3 s3Var = (dfj.s3) bVar9.f4140k0.get();
                dfj.k0 k0Var2 = (dfj.k0) bVar9.Y.get();
                ynj.m mVar = new ynj.m();
                dfj.l lVar = (dfj.l) bVar9.q0.get();
                dm0.d dVarD = bVar9.f4144m.d();
                vc.s.j(dVarD);
                return new bij.k(nVar, k0Var, aVar8, new dfj.u(v2Var, a1Var, s3Var, k0Var2, mVar, lVar, dVarD));
            case 7:
                g1 g1Var2 = (g1) this.d;
                b bVar10 = this.f4189b;
                int i32 = this.f4190c;
                if (i32 != 0) {
                    if (i32 != 1) {
                        throw new AssertionError(i32);
                    }
                    dij.b bVar11 = new dij.b(new vnj.a());
                    dij.a aVar9 = new dij.a();
                    gte.a aVarB2 = bVar10.f4120a.b();
                    vc.s.j(aVarB2);
                    return new bij.l(bVar11, aVar9, aVarB2, (cej.b) bVar10.X.get());
                }
                cli.n nVar2 = (cli.n) g1Var2.f4256c.get();
                dfj.k0 k0Var3 = (dfj.k0) bVar10.Y.get();
                eij.a aVar10 = new eij.a();
                b bVar12 = g1Var2.f4255b;
                dfj.v2 v2Var2 = (dfj.v2) bVar12.R.get();
                nfj.a1 a1Var2 = (nfj.a1) bVar12.Q.get();
                dfj.s3 s3Var2 = (dfj.s3) bVar12.f4140k0.get();
                dfj.k0 k0Var4 = (dfj.k0) bVar12.Y.get();
                ynj.m mVar2 = new ynj.m();
                dfj.l lVar2 = (dfj.l) bVar12.q0.get();
                dm0.d dVarD2 = bVar12.f4144m.d();
                vc.s.j(dVarD2);
                return new bij.k(nVar2, k0Var3, aVar10, new dfj.u(v2Var2, a1Var2, s3Var2, k0Var4, mVar2, lVar2, dVarD2));
            case 8:
                g1 g1Var3 = (g1) this.d;
                b bVar13 = this.f4189b;
                int i33 = this.f4190c;
                if (i33 != 0) {
                    if (i33 != 1) {
                        throw new AssertionError(i33);
                    }
                    dij.b bVar14 = new dij.b(new vnj.a());
                    dij.a aVar11 = new dij.a();
                    gte.a aVarB3 = bVar13.f4120a.b();
                    vc.s.j(aVarB3);
                    return new bij.l(bVar14, aVar11, aVarB3, (cej.b) bVar13.X.get());
                }
                cli.n nVar3 = (cli.n) g1Var3.f4256c.get();
                dfj.k0 k0Var5 = (dfj.k0) bVar13.Y.get();
                eij.a aVar12 = new eij.a();
                b bVar15 = g1Var3.f4255b;
                dfj.v2 v2Var3 = (dfj.v2) bVar15.R.get();
                nfj.a1 a1Var3 = (nfj.a1) bVar15.Q.get();
                dfj.s3 s3Var3 = (dfj.s3) bVar15.f4140k0.get();
                dfj.k0 k0Var6 = (dfj.k0) bVar15.Y.get();
                ynj.m mVar3 = new ynj.m();
                dfj.l lVar3 = (dfj.l) bVar15.q0.get();
                dm0.d dVarD3 = bVar15.f4144m.d();
                vc.s.j(dVarD3);
                return new bij.k(nVar3, k0Var5, aVar12, new dfj.u(v2Var3, a1Var3, s3Var3, k0Var6, mVar3, lVar3, dVarD3));
            case 9:
                g1 g1Var4 = (g1) this.d;
                b bVar16 = this.f4189b;
                int i43 = this.f4190c;
                if (i43 != 0) {
                    if (i43 != 1) {
                        throw new AssertionError(i43);
                    }
                    dij.b bVar17 = new dij.b(new vnj.a());
                    dij.a aVar13 = new dij.a();
                    gte.a aVarB4 = bVar16.f4120a.b();
                    vc.s.j(aVarB4);
                    return new bij.l(bVar17, aVar13, aVarB4, (cej.b) bVar16.X.get());
                }
                cli.n nVar4 = (cli.n) g1Var4.f4256c.get();
                dfj.k0 k0Var7 = (dfj.k0) bVar16.Y.get();
                eij.a aVar14 = new eij.a();
                b bVar18 = g1Var4.f4255b;
                dfj.v2 v2Var4 = (dfj.v2) bVar18.R.get();
                nfj.a1 a1Var4 = (nfj.a1) bVar18.Q.get();
                dfj.s3 s3Var4 = (dfj.s3) bVar18.f4140k0.get();
                dfj.k0 k0Var8 = (dfj.k0) bVar18.Y.get();
                ynj.m mVar4 = new ynj.m();
                dfj.l lVar4 = (dfj.l) bVar18.q0.get();
                dm0.d dVarD4 = bVar18.f4144m.d();
                vc.s.j(dVarD4);
                return new bij.k(nVar4, k0Var7, aVar14, new dfj.u(v2Var4, a1Var4, s3Var4, k0Var8, mVar4, lVar4, dVarD4));
            case 10:
                g1 g1Var5 = (g1) this.d;
                b bVar19 = this.f4189b;
                int i59 = this.f4190c;
                if (i59 != 0) {
                    if (i59 != 1) {
                        throw new AssertionError(i59);
                    }
                    dij.b bVar20 = new dij.b(new vnj.a());
                    dij.a aVar15 = new dij.a();
                    gte.a aVarB5 = bVar19.f4120a.b();
                    vc.s.j(aVarB5);
                    return new bij.l(bVar20, aVar15, aVarB5, (cej.b) bVar19.X.get());
                }
                cli.n nVar5 = (cli.n) g1Var5.f4256c.get();
                dfj.k0 k0Var9 = (dfj.k0) bVar19.Y.get();
                eij.a aVar16 = new eij.a();
                b bVar21 = g1Var5.f4255b;
                dfj.v2 v2Var5 = (dfj.v2) bVar21.R.get();
                nfj.a1 a1Var5 = (nfj.a1) bVar21.Q.get();
                dfj.s3 s3Var5 = (dfj.s3) bVar21.f4140k0.get();
                dfj.k0 k0Var10 = (dfj.k0) bVar21.Y.get();
                ynj.m mVar5 = new ynj.m();
                dfj.l lVar5 = (dfj.l) bVar21.q0.get();
                dm0.d dVarD5 = bVar21.f4144m.d();
                vc.s.j(dVarD5);
                return new bij.k(nVar5, k0Var9, aVar16, new dfj.u(v2Var5, a1Var5, s3Var5, k0Var10, mVar5, lVar5, dVarD5));
            case 11:
                h1 h1Var = (h1) this.d;
                int i66 = this.f4190c;
                if (i66 != 0) {
                    if (i66 == 1) {
                        return new qee.s(new zhj.b(new zhj.d(h1Var.f4270b.c()), b.b()));
                    }
                    throw new AssertionError(i66);
                }
                xhj.f fVar = h1Var.f4269a;
                b bVar22 = this.f4189b;
                return new com.revolut.retail.feature.esim.impl.ui.screens.help.b(fVar, (dfj.g0) bVar22.f4162u1.get(), ((s41.a) bVar22.f4164w).d(), (dfj.v2) bVar22.R.get(), new aij.a(), (cli.n) h1Var.f4271c.get());
            case 12:
                g1 g1Var6 = (g1) this.d;
                b bVar23 = this.f4189b;
                int i74 = this.f4190c;
                if (i74 != 0) {
                    if (i74 != 1) {
                        throw new AssertionError(i74);
                    }
                    dij.b bVar24 = new dij.b(new vnj.a());
                    dij.a aVar17 = new dij.a();
                    gte.a aVarB6 = bVar23.f4120a.b();
                    vc.s.j(aVarB6);
                    return new bij.l(bVar24, aVar17, aVarB6, (cej.b) bVar23.X.get());
                }
                cli.n nVar6 = (cli.n) g1Var6.f4256c.get();
                dfj.k0 k0Var11 = (dfj.k0) bVar23.Y.get();
                eij.a aVar18 = new eij.a();
                b bVar25 = g1Var6.f4255b;
                dfj.v2 v2Var6 = (dfj.v2) bVar25.R.get();
                nfj.a1 a1Var6 = (nfj.a1) bVar25.Q.get();
                dfj.s3 s3Var6 = (dfj.s3) bVar25.f4140k0.get();
                dfj.k0 k0Var12 = (dfj.k0) bVar25.Y.get();
                ynj.m mVar6 = new ynj.m();
                dfj.l lVar6 = (dfj.l) bVar25.q0.get();
                dm0.d dVarD6 = bVar25.f4144m.d();
                vc.s.j(dVarD6);
                return new bij.k(nVar6, k0Var11, aVar18, new dfj.u(v2Var6, a1Var6, s3Var6, k0Var12, mVar6, lVar6, dVarD6));
            case 13:
                g1 g1Var7 = (g1) this.d;
                b bVar26 = this.f4189b;
                int i92 = this.f4190c;
                if (i92 != 0) {
                    if (i92 != 1) {
                        throw new AssertionError(i92);
                    }
                    dij.b bVar27 = new dij.b(new vnj.a());
                    dij.a aVar19 = new dij.a();
                    gte.a aVarB7 = bVar26.f4120a.b();
                    vc.s.j(aVarB7);
                    return new bij.l(bVar27, aVar19, aVarB7, (cej.b) bVar26.X.get());
                }
                cli.n nVar7 = (cli.n) g1Var7.f4256c.get();
                dfj.k0 k0Var13 = (dfj.k0) bVar26.Y.get();
                eij.a aVar20 = new eij.a();
                b bVar28 = g1Var7.f4255b;
                dfj.v2 v2Var7 = (dfj.v2) bVar28.R.get();
                nfj.a1 a1Var7 = (nfj.a1) bVar28.Q.get();
                dfj.s3 s3Var7 = (dfj.s3) bVar28.f4140k0.get();
                dfj.k0 k0Var14 = (dfj.k0) bVar28.Y.get();
                ynj.m mVar7 = new ynj.m();
                dfj.l lVar7 = (dfj.l) bVar28.q0.get();
                dm0.d dVarD7 = bVar28.f4144m.d();
                vc.s.j(dVarD7);
                return new bij.k(nVar7, k0Var13, aVar20, new dfj.u(v2Var7, a1Var7, s3Var7, k0Var14, mVar7, lVar7, dVarD7));
            case 14:
                j1 j1Var = (j1) this.d;
                EsimGetPlanScreenContract$InputData esimGetPlanScreenContract$InputData = j1Var.f4300b;
                b bVar29 = j1Var.f4301c;
                b bVar30 = this.f4189b;
                int i96 = this.f4190c;
                if (i96 != 0) {
                    if (i96 != 1) {
                        throw new AssertionError(i96);
                    }
                    hij.g gVar = new hij.g((cej.b) bVar29.X.get());
                    cej.b bVar31 = (cej.b) bVar29.X.get();
                    nij.h hVar = new nij.h((gej.a) bVar29.K.get());
                    gte.a aVarB8 = bVar29.f4120a.b();
                    vc.s.j(aVarB8);
                    r10.r rVar = new r10.r(bVar31, new hij.b(hVar, new nij.c(aVarB8), new ynj.e(), (cej.b) bVar29.X.get()), new hij.k(esimGetPlanScreenContract$InputData, (gej.a) bVar29.K.get(), new ynj.e(), new hij.i(bVar29.c())));
                    hij.l lVar8 = new hij.l((cej.b) bVar29.X.get());
                    cej.b bVar32 = (cej.b) bVar29.X.get();
                    gte.a aVarB9 = bVar29.f4120a.b();
                    vc.s.j(aVarB9);
                    iij.b bVar33 = new iij.b(bVar32, esimGetPlanScreenContract$InputData, aVarB9);
                    gte.a aVarB10 = bVar29.f4120a.b();
                    vc.s.j(aVarB10);
                    gte.a aVarB11 = bVar29.f4120a.b();
                    vc.s.j(aVarB11);
                    return new fij.h0(gVar, rVar, lVar8, bVar33, new hij.e(aVarB10, esimGetPlanScreenContract$InputData, new hij.c(aVarB11)), (cej.b) bVar30.X.get());
                }
                cli.n nVar8 = (cli.n) j1Var.d.get();
                EsimGetPlanScreenContract$InputData esimGetPlanScreenContract$InputData2 = j1Var.f4300b;
                dfj.w wVar = (dfj.w) bVar30.f4135h0.get();
                dfj.z1 z1Var = new dfj.z1((dfj.w) bVar29.f4135h0.get());
                gte.a aVarB12 = bVar29.f4120a.b();
                vc.s.j(aVarB12);
                oij.b bVar34 = new oij.b((cej.b) bVar29.X.get(), esimGetPlanScreenContract$InputData, aVarB12);
                oij.d dVar = new oij.d((cej.b) bVar29.X.get());
                ogm.i iVar = new ogm.i(esimGetPlanScreenContract$InputData);
                l61.a aVarB13 = bVar30.f4142l.b();
                vc.s.j(aVarB13);
                gte.a aVarB14 = bVar30.f4120a.b();
                vc.s.j(aVarB14);
                cej.b bVar35 = (cej.b) bVar30.X.get();
                hij.f fVar2 = new hij.f(new ynj.e());
                hij.d dVar2 = new hij.d();
                gte.a aVarB15 = bVar29.f4120a.b();
                vc.s.j(aVarB15);
                return new com.revolut.retail.feature.esim.impl.ui.screens.home.get_plan.f(nVar8, esimGetPlanScreenContract$InputData2, wVar, z1Var, bVar34, dVar, iVar, aVarB13, aVarB14, bVar35, fVar2, dVar2, new hij.c(aVarB15), new ugc.a(b.b()));
            case 15:
                j1 j1Var2 = (j1) this.d;
                EsimGetPlanScreenContract$InputData esimGetPlanScreenContract$InputData3 = j1Var2.f4300b;
                b bVar36 = j1Var2.f4301c;
                b bVar37 = this.f4189b;
                int i99 = this.f4190c;
                if (i99 != 0) {
                    if (i99 != 1) {
                        throw new AssertionError(i99);
                    }
                    hij.g gVar2 = new hij.g((cej.b) bVar36.X.get());
                    cej.b bVar38 = (cej.b) bVar36.X.get();
                    nij.h hVar2 = new nij.h((gej.a) bVar36.K.get());
                    gte.a aVarB16 = bVar36.f4120a.b();
                    vc.s.j(aVarB16);
                    r10.r rVar2 = new r10.r(bVar38, new hij.b(hVar2, new nij.c(aVarB16), new ynj.e(), (cej.b) bVar36.X.get()), new hij.k(esimGetPlanScreenContract$InputData3, (gej.a) bVar36.K.get(), new ynj.e(), new hij.i(bVar36.c())));
                    hij.l lVar9 = new hij.l((cej.b) bVar36.X.get());
                    cej.b bVar39 = (cej.b) bVar36.X.get();
                    gte.a aVarB17 = bVar36.f4120a.b();
                    vc.s.j(aVarB17);
                    iij.b bVar40 = new iij.b(bVar39, esimGetPlanScreenContract$InputData3, aVarB17);
                    gte.a aVarB18 = bVar36.f4120a.b();
                    vc.s.j(aVarB18);
                    gte.a aVarB19 = bVar36.f4120a.b();
                    vc.s.j(aVarB19);
                    return new fij.h0(gVar2, rVar2, lVar9, bVar40, new hij.e(aVarB18, esimGetPlanScreenContract$InputData3, new hij.c(aVarB19)), (cej.b) bVar37.X.get());
                }
                cli.n nVar9 = (cli.n) j1Var2.d.get();
                EsimGetPlanScreenContract$InputData esimGetPlanScreenContract$InputData4 = j1Var2.f4300b;
                dfj.w wVar2 = (dfj.w) bVar37.f4135h0.get();
                dfj.z1 z1Var2 = new dfj.z1((dfj.w) bVar36.f4135h0.get());
                gte.a aVarB20 = bVar36.f4120a.b();
                vc.s.j(aVarB20);
                oij.b bVar41 = new oij.b((cej.b) bVar36.X.get(), esimGetPlanScreenContract$InputData3, aVarB20);
                oij.d dVar3 = new oij.d((cej.b) bVar36.X.get());
                ogm.i iVar2 = new ogm.i(esimGetPlanScreenContract$InputData3);
                l61.a aVarB21 = bVar37.f4142l.b();
                vc.s.j(aVarB21);
                gte.a aVarB22 = bVar37.f4120a.b();
                vc.s.j(aVarB22);
                cej.b bVar42 = (cej.b) bVar37.X.get();
                hij.f fVar3 = new hij.f(new ynj.e());
                hij.d dVar4 = new hij.d();
                gte.a aVarB23 = bVar36.f4120a.b();
                vc.s.j(aVarB23);
                return new com.revolut.retail.feature.esim.impl.ui.screens.home.get_plan.f(nVar9, esimGetPlanScreenContract$InputData4, wVar2, z1Var2, bVar41, dVar3, iVar2, aVarB21, aVarB22, bVar42, fVar3, dVar4, new hij.c(aVarB23), new ugc.a(b.b()));
            case 16:
                l1 l1Var = (l1) this.d;
                EsimGetPlanScreenContract$InputData esimGetPlanScreenContract$InputData5 = l1Var.f4328b;
                b bVar43 = l1Var.f4329c;
                int i100 = this.f4190c;
                if (i100 != 0) {
                    if (i100 != 1) {
                        throw new AssertionError(i100);
                    }
                    cej.b bVar44 = (cej.b) bVar43.X.get();
                    gte.a aVarB24 = bVar43.f4120a.b();
                    vc.s.j(aVarB24);
                    iij.b bVar45 = new iij.b(bVar44, esimGetPlanScreenContract$InputData5, aVarB24);
                    gte.a aVarB25 = bVar43.f4120a.b();
                    vc.s.j(aVarB25);
                    gte.a aVarB26 = bVar43.f4120a.b();
                    vc.s.j(aVarB26);
                    return new jij.o(bVar45, new hij.e(aVarB25, esimGetPlanScreenContract$InputData5, new hij.c(aVarB26)), new nij.p(), new nij.f((cej.b) bVar43.X.get(), new nij.k(new kdh.b(new ynj.e(), esimGetPlanScreenContract$InputData5), new nij.h((gej.a) bVar43.K.get())), new nij.m(new kdh.b(new ynj.e(), esimGetPlanScreenContract$InputData5), new nij.o(bVar43.c()), (gej.a) bVar43.K.get(), (cej.b) bVar43.X.get())), new nij.b(bVar43.f4153r));
                }
                cli.n nVar10 = (cli.n) l1Var.d.get();
                EsimGetPlanScreenContract$InputData esimGetPlanScreenContract$InputData6 = l1Var.f4328b;
                b bVar46 = this.f4189b;
                dfj.w wVar3 = (dfj.w) bVar46.f4135h0.get();
                dfj.z1 z1Var3 = new dfj.z1((dfj.w) bVar43.f4135h0.get());
                gte.a aVarB27 = bVar43.f4120a.b();
                vc.s.j(aVarB27);
                oij.b bVar47 = new oij.b((cej.b) bVar43.X.get(), esimGetPlanScreenContract$InputData5, aVarB27);
                oij.d dVar5 = new oij.d((cej.b) bVar43.X.get());
                ogm.i iVar3 = new ogm.i(esimGetPlanScreenContract$InputData5);
                l61.a aVarB28 = bVar46.f4142l.b();
                vc.s.j(aVarB28);
                gte.a aVarB29 = bVar46.f4120a.b();
                vc.s.j(aVarB29);
                cej.b bVar48 = (cej.b) bVar46.X.get();
                hij.f fVar4 = new hij.f(new ynj.e());
                hij.d dVar6 = new hij.d();
                gte.a aVarB30 = bVar43.f4120a.b();
                vc.s.j(aVarB30);
                return new com.revolut.retail.feature.esim.impl.ui.screens.home.get_plan.f(nVar10, esimGetPlanScreenContract$InputData6, wVar3, z1Var3, bVar47, dVar5, iVar3, aVarB28, aVarB29, bVar48, fVar4, dVar6, new hij.c(aVarB30), new ugc.a(b.b()));
            case 17:
                l1 l1Var2 = (l1) this.d;
                EsimGetPlanScreenContract$InputData esimGetPlanScreenContract$InputData7 = l1Var2.f4328b;
                b bVar49 = l1Var2.f4329c;
                int i101 = this.f4190c;
                if (i101 != 0) {
                    if (i101 != 1) {
                        throw new AssertionError(i101);
                    }
                    cej.b bVar50 = (cej.b) bVar49.X.get();
                    gte.a aVarB31 = bVar49.f4120a.b();
                    vc.s.j(aVarB31);
                    iij.b bVar51 = new iij.b(bVar50, esimGetPlanScreenContract$InputData7, aVarB31);
                    gte.a aVarB32 = bVar49.f4120a.b();
                    vc.s.j(aVarB32);
                    gte.a aVarB33 = bVar49.f4120a.b();
                    vc.s.j(aVarB33);
                    return new jij.o(bVar51, new hij.e(aVarB32, esimGetPlanScreenContract$InputData7, new hij.c(aVarB33)), new nij.p(), new nij.f((cej.b) bVar49.X.get(), new nij.k(new kdh.b(new ynj.e(), esimGetPlanScreenContract$InputData7), new nij.h((gej.a) bVar49.K.get())), new nij.m(new kdh.b(new ynj.e(), esimGetPlanScreenContract$InputData7), new nij.o(bVar49.c()), (gej.a) bVar49.K.get(), (cej.b) bVar49.X.get())), new nij.b(bVar49.f4153r));
                }
                cli.n nVar11 = (cli.n) l1Var2.d.get();
                EsimGetPlanScreenContract$InputData esimGetPlanScreenContract$InputData8 = l1Var2.f4328b;
                b bVar52 = this.f4189b;
                dfj.w wVar4 = (dfj.w) bVar52.f4135h0.get();
                dfj.z1 z1Var4 = new dfj.z1((dfj.w) bVar49.f4135h0.get());
                gte.a aVarB34 = bVar49.f4120a.b();
                vc.s.j(aVarB34);
                oij.b bVar53 = new oij.b((cej.b) bVar49.X.get(), esimGetPlanScreenContract$InputData7, aVarB34);
                oij.d dVar7 = new oij.d((cej.b) bVar49.X.get());
                ogm.i iVar4 = new ogm.i(esimGetPlanScreenContract$InputData7);
                l61.a aVarB35 = bVar52.f4142l.b();
                vc.s.j(aVarB35);
                gte.a aVarB36 = bVar52.f4120a.b();
                vc.s.j(aVarB36);
                cej.b bVar54 = (cej.b) bVar52.X.get();
                hij.f fVar5 = new hij.f(new ynj.e());
                hij.d dVar8 = new hij.d();
                gte.a aVarB37 = bVar49.f4120a.b();
                vc.s.j(aVarB37);
                return new com.revolut.retail.feature.esim.impl.ui.screens.home.get_plan.f(nVar11, esimGetPlanScreenContract$InputData8, wVar4, z1Var4, bVar53, dVar7, iVar4, aVarB35, aVarB36, bVar54, fVar5, dVar8, new hij.c(aVarB37), new ugc.a(b.b()));
            case 18:
                p1 p1Var = (p1) this.d;
                b bVar55 = this.f4189b;
                int i102 = this.f4190c;
                if (i102 == 0) {
                    return new xij.c(p1Var.f4388b, (cli.n) p1Var.d.get(), ((s41.a) bVar55.f4164w).d());
                }
                if (i102 == 1) {
                    return new xij.e(b.b(), new zij.a(p1Var.f4389c.c()), bVar55.c());
                }
                throw new AssertionError(i102);
            case 19:
                p1 p1Var2 = (p1) this.d;
                b bVar56 = this.f4189b;
                int i103 = this.f4190c;
                if (i103 == 0) {
                    return new xij.c(p1Var2.f4388b, (cli.n) p1Var2.d.get(), ((s41.a) bVar56.f4164w).d());
                }
                if (i103 == 1) {
                    return new xij.e(b.b(), new zij.a(p1Var2.f4389c.c()), bVar56.c());
                }
                throw new AssertionError(i103);
            case 20:
                p1 p1Var3 = (p1) this.d;
                b bVar57 = this.f4189b;
                int i104 = this.f4190c;
                if (i104 == 0) {
                    return new xij.c(p1Var3.f4388b, (cli.n) p1Var3.d.get(), ((s41.a) bVar57.f4164w).d());
                }
                if (i104 == 1) {
                    return new xij.e(b.b(), new zij.a(p1Var3.f4389c.c()), bVar57.c());
                }
                throw new AssertionError(i104);
            case 21:
                p1 p1Var4 = (p1) this.d;
                b bVar58 = this.f4189b;
                int i105 = this.f4190c;
                if (i105 == 0) {
                    return new xij.c(p1Var4.f4388b, (cli.n) p1Var4.d.get(), ((s41.a) bVar58.f4164w).d());
                }
                if (i105 == 1) {
                    return new xij.e(b.b(), new zij.a(p1Var4.f4389c.c()), bVar58.c());
                }
                throw new AssertionError(i105);
            case 22:
                p1 p1Var5 = (p1) this.d;
                b bVar59 = this.f4189b;
                int i106 = this.f4190c;
                if (i106 == 0) {
                    return new xij.c(p1Var5.f4388b, (cli.n) p1Var5.d.get(), ((s41.a) bVar59.f4164w).d());
                }
                if (i106 == 1) {
                    return new xij.e(b.b(), new zij.a(p1Var5.f4389c.c()), bVar59.c());
                }
                throw new AssertionError(i106);
            case 23:
                r1 r1Var = (r1) this.d;
                int i107 = this.f4190c;
                if (i107 == 0) {
                    return new jjj.j((cli.n) r1Var.f4421c.get());
                }
                if (i107 == 1) {
                    return new com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_cancellation.bottom_sheets.terms.a(r1Var.f4420b, (gej.a) this.f4189b.K.get());
                }
                throw new AssertionError(i107);
            case 24:
                r1 r1Var2 = (r1) this.d;
                int i108 = this.f4190c;
                if (i108 == 0) {
                    return new jjj.j((cli.n) r1Var2.f4421c.get());
                }
                if (i108 == 1) {
                    return new com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_cancellation.bottom_sheets.terms.a(r1Var2.f4420b, (gej.a) this.f4189b.K.get());
                }
                throw new AssertionError(i108);
            case 25:
                return a();
            case 26:
                d2 d2Var = (d2) this.d;
                EsimMobilePlanGetPortOutCredentialsScreenContract$InputData esimMobilePlanGetPortOutCredentialsScreenContract$InputData = d2Var.f4207b;
                int i109 = this.f4190c;
                if (i109 != 0) {
                    if (i109 == 1) {
                        return new fkj.i(esimMobilePlanGetPortOutCredentialsScreenContract$InputData);
                    }
                    throw new AssertionError(i109);
                }
                cli.n nVar12 = (cli.n) d2Var.f4208c.get();
                b bVar60 = this.f4189b;
                c70.a aVarZ = bVar60.f4150p.z();
                vc.s.j(aVarZ);
                return new fkj.f(nVar12, esimMobilePlanGetPortOutCredentialsScreenContract$InputData, aVarZ, (dfj.q1) bVar60.f4130e1.get());
            case 27:
                return b();
            case 28:
                return c();
            default:
                j2 j2Var = (j2) this.d;
                int i110 = this.f4190c;
                if (i110 != 0) {
                    if (i110 != 1) {
                        throw new AssertionError(i110);
                    }
                    whf.n nVarB = this.f4189b.f4168y.b();
                    vc.s.j(nVarB);
                    return new xlj.i(nVarB);
                }
                EsimMobilePlanPaymentsScreenContract$InputData esimMobilePlanPaymentsScreenContract$InputData = j2Var.f4303b;
                cli.n nVar13 = (cli.n) j2Var.d.get();
                b bVar61 = j2Var.f4304c;
                dfj.s3 s3Var8 = (dfj.s3) bVar61.f4140k0.get();
                nyb.m0 m0VarG = bVar61.f4166x.g();
                vc.s.j(m0VarG);
                whf.b bVarA = bVar61.f4168y.a();
                vc.s.j(bVarA);
                return new xlj.g(esimMobilePlanPaymentsScreenContract$InputData, nVar13, new r10.r(s3Var8, m0VarG, bVarA));
        }
    }
}
