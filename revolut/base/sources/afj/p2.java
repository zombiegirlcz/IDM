package afj;

import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_billing.EsimMobilePlanBillingScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_get_port_out_credentials.EsimMobilePlanGetPortOutCredentialsScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_invoices.EsimMobilePlanInvoicesScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer.EsimMobilePlanNumberTransferScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.picker.EsimPickerScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.portability_date_picker.EsimMobilePlanNumberTransferPortabilityDatePickerScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_payments.EsimMobilePlanPaymentsScreenContract$InputData;
import dfj.s4;

/* JADX INFO: loaded from: classes11.dex */
public final class p2 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f4391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4392c;
    public final Object d;

    public /* synthetic */ p2(b bVar, Object obj2, int i, int i2) {
        this.f4390a = i2;
        this.f4391b = bVar;
        this.d = obj2;
        this.f4392c = i;
    }

    @Override // phm.a
    public final Object get() {
        switch (this.f4390a) {
            case 0:
                q2 q2Var = (q2) this.d;
                int i = this.f4392c;
                if (i == 0) {
                    return new com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_summary.a(new i90.b(), (cli.n) q2Var.f4407c.get(), (bej.m) this.f4391b.F0.get(), new unj.j());
                }
                if (i == 1) {
                    return new kxk.o(q2Var.f4406b, new rmj.c(), new rmj.b(new ugc.a(b.b())));
                }
                throw new AssertionError(i);
            case 1:
                h2 h2Var = (h2) this.d;
                b bVar = h2Var.f4274c;
                EsimMobilePlanNumberTransferScreenContract$InputData esimMobilePlanNumberTransferScreenContract$InputData = h2Var.f4273b;
                int i2 = this.f4392c;
                if (i2 != 0) {
                    if (i2 == 1) {
                        return new pkj.m(esimMobilePlanNumberTransferScreenContract$InputData, new rkj.c(esimMobilePlanNumberTransferScreenContract$InputData), new rkj.b(esimMobilePlanNumberTransferScreenContract$InputData, bVar.c(), new ugc.a(b.b())));
                    }
                    throw new AssertionError(i2);
                }
                cli.n nVar = (cli.n) h2Var.d.get();
                ang.f fVarE = bVar.f4142l.e();
                z80.b bVarS = bVar.f4150p.s();
                vc.s.j(bVarS);
                r10.d dVar = new r10.d(fVarE, bVarS);
                z80.b bVarS2 = this.f4391b.f4150p.s();
                vc.s.j(bVarS2);
                return new pkj.k(nVar, esimMobilePlanNumberTransferScreenContract$InputData, dVar, bVarS2);
            case 2:
                q2 q2Var2 = (q2) this.d;
                int i3 = this.f4392c;
                if (i3 == 0) {
                    return new com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_summary.a(new i90.b(), (cli.n) q2Var2.f4407c.get(), (bej.m) this.f4391b.F0.get(), new unj.j());
                }
                if (i3 == 1) {
                    return new kxk.o(q2Var2.f4406b, new rmj.c(), new rmj.b(new ugc.a(b.b())));
                }
                throw new AssertionError(i3);
            case 3:
                h2 h2Var2 = (h2) this.d;
                b bVar2 = h2Var2.f4274c;
                EsimMobilePlanNumberTransferScreenContract$InputData esimMobilePlanNumberTransferScreenContract$InputData2 = h2Var2.f4273b;
                int i5 = this.f4392c;
                if (i5 != 0) {
                    if (i5 == 1) {
                        return new pkj.m(esimMobilePlanNumberTransferScreenContract$InputData2, new rkj.c(esimMobilePlanNumberTransferScreenContract$InputData2), new rkj.b(esimMobilePlanNumberTransferScreenContract$InputData2, bVar2.c(), new ugc.a(b.b())));
                    }
                    throw new AssertionError(i5);
                }
                cli.n nVar2 = (cli.n) h2Var2.d.get();
                ang.f fVarE2 = bVar2.f4142l.e();
                z80.b bVarS3 = bVar2.f4150p.s();
                vc.s.j(bVarS3);
                r10.d dVar2 = new r10.d(fVarE2, bVarS3);
                z80.b bVarS4 = this.f4391b.f4150p.s();
                vc.s.j(bVarS4);
                return new pkj.k(nVar2, esimMobilePlanNumberTransferScreenContract$InputData2, dVar2, bVarS4);
            case 4:
                h2 h2Var3 = (h2) this.d;
                b bVar3 = h2Var3.f4274c;
                EsimMobilePlanNumberTransferScreenContract$InputData esimMobilePlanNumberTransferScreenContract$InputData3 = h2Var3.f4273b;
                int i6 = this.f4392c;
                if (i6 != 0) {
                    if (i6 == 1) {
                        return new pkj.m(esimMobilePlanNumberTransferScreenContract$InputData3, new rkj.c(esimMobilePlanNumberTransferScreenContract$InputData3), new rkj.b(esimMobilePlanNumberTransferScreenContract$InputData3, bVar3.c(), new ugc.a(b.b())));
                    }
                    throw new AssertionError(i6);
                }
                cli.n nVar3 = (cli.n) h2Var3.d.get();
                ang.f fVarE3 = bVar3.f4142l.e();
                z80.b bVarS5 = bVar3.f4150p.s();
                vc.s.j(bVarS5);
                r10.d dVar3 = new r10.d(fVarE3, bVarS5);
                z80.b bVarS6 = this.f4391b.f4150p.s();
                vc.s.j(bVarS6);
                return new pkj.k(nVar3, esimMobilePlanNumberTransferScreenContract$InputData3, dVar3, bVarS6);
            case 5:
                x1 x1Var = (x1) this.d;
                int i21 = this.f4392c;
                if (i21 != 0) {
                    if (i21 != 1) {
                        throw new AssertionError(i21);
                    }
                    dec.r rVar = new dec.r();
                    dec.g gVar = new dec.g();
                    dec.a aVar = new dec.a();
                    l80.e eVarH = x1Var.f4521c.f4150p.h();
                    vc.s.j(eVarH);
                    return new fjj.c0(new hjj.d(new dec.q(rVar, gVar, aVar, eVarH)), new hjj.h(), new hjj.g(), new hjj.i(), new hjj.b());
                }
                EsimMobilePlanBillingScreenContract$InputData esimMobilePlanBillingScreenContract$InputData = x1Var.f4520b;
                cli.n nVar4 = (cli.n) x1Var.d.get();
                hjj.e eVar = new hjj.e();
                b bVar4 = this.f4391b;
                q7c.g gVarE = bVar4.k.e();
                dfj.s3 s3Var = (dfj.s3) bVar4.f4140k0.get();
                hjj.f fVar = new hjj.f();
                nyb.k kVarC = bVar4.f4166x.c();
                vc.s.j(kVarC);
                dfj.c0 c0Var = (dfj.c0) bVar4.f4124b1.get();
                gte.a aVarB = bVar4.f4120a.b();
                vc.s.j(aVarB);
                return new com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_billing.a(esimMobilePlanBillingScreenContract$InputData, nVar4, eVar, gVarE, s3Var, fVar, kVarC, c0Var, aVarB, new ijj.u(b.b()));
            case 6:
                d2 d2Var = (d2) this.d;
                EsimMobilePlanGetPortOutCredentialsScreenContract$InputData esimMobilePlanGetPortOutCredentialsScreenContract$InputData = d2Var.f4207b;
                int i22 = this.f4392c;
                if (i22 != 0) {
                    if (i22 == 1) {
                        return new fkj.i(esimMobilePlanGetPortOutCredentialsScreenContract$InputData);
                    }
                    throw new AssertionError(i22);
                }
                cli.n nVar5 = (cli.n) d2Var.f4208c.get();
                b bVar5 = this.f4391b;
                c70.a aVarZ = bVar5.f4150p.z();
                vc.s.j(aVarZ);
                return new fkj.f(nVar5, esimMobilePlanGetPortOutCredentialsScreenContract$InputData, aVarZ, (dfj.q1) bVar5.f4130e1.get());
            case 7:
                f2 f2Var = (f2) this.d;
                int i32 = this.f4392c;
                if (i32 == 0) {
                    cli.n nVar6 = (cli.n) f2Var.d.get();
                    EsimMobilePlanInvoicesScreenContract$InputData esimMobilePlanInvoicesScreenContract$InputData = f2Var.f4243b;
                    b bVar6 = this.f4391b;
                    return new hkj.f(nVar6, esimMobilePlanInvoicesScreenContract$InputData, (bej.m) bVar6.F0.get(), (dfj.s3) bVar6.f4140k0.get(), new jkj.a());
                }
                if (i32 != 1) {
                    throw new AssertionError(i32);
                }
                l70.e eVar2 = f2Var.f4244c.f4150p;
                qd0.b bVarN = eVar2.n();
                vc.s.j(bVarN);
                l80.e eVarH2 = eVar2.h();
                vc.s.j(eVarH2);
                return new a3e.u(new jkj.e(bVarN, eVarH2));
            case 8:
                h2 h2Var4 = (h2) this.d;
                b bVar7 = h2Var4.f4274c;
                EsimMobilePlanNumberTransferScreenContract$InputData esimMobilePlanNumberTransferScreenContract$InputData4 = h2Var4.f4273b;
                int i33 = this.f4392c;
                if (i33 != 0) {
                    if (i33 == 1) {
                        return new pkj.m(esimMobilePlanNumberTransferScreenContract$InputData4, new rkj.c(esimMobilePlanNumberTransferScreenContract$InputData4), new rkj.b(esimMobilePlanNumberTransferScreenContract$InputData4, bVar7.c(), new ugc.a(b.b())));
                    }
                    throw new AssertionError(i33);
                }
                cli.n nVar7 = (cli.n) h2Var4.d.get();
                ang.f fVarE4 = bVar7.f4142l.e();
                z80.b bVarS7 = bVar7.f4150p.s();
                vc.s.j(bVarS7);
                r10.d dVar4 = new r10.d(fVarE4, bVarS7);
                z80.b bVarS8 = this.f4391b.f4150p.s();
                vc.s.j(bVarS8);
                return new pkj.k(nVar7, esimMobilePlanNumberTransferScreenContract$InputData4, dVar4, bVarS8);
            case 9:
                j2 j2Var = (j2) this.d;
                int i43 = this.f4392c;
                if (i43 != 0) {
                    if (i43 != 1) {
                        throw new AssertionError(i43);
                    }
                    whf.n nVarB = this.f4391b.f4168y.b();
                    vc.s.j(nVarB);
                    return new xlj.i(nVarB);
                }
                EsimMobilePlanPaymentsScreenContract$InputData esimMobilePlanPaymentsScreenContract$InputData = j2Var.f4303b;
                cli.n nVar8 = (cli.n) j2Var.d.get();
                b bVar8 = j2Var.f4304c;
                dfj.s3 s3Var2 = (dfj.s3) bVar8.f4140k0.get();
                nyb.m0 m0VarG = bVar8.f4166x.g();
                vc.s.j(m0VarG);
                whf.b bVarA = bVar8.f4168y.a();
                vc.s.j(bVarA);
                return new xlj.g(esimMobilePlanPaymentsScreenContract$InputData, nVar8, new r10.r(s3Var2, m0VarG, bVarA));
            case 10:
                q2 q2Var3 = (q2) this.d;
                int i59 = this.f4392c;
                if (i59 == 0) {
                    return new com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_summary.a(new i90.b(), (cli.n) q2Var3.f4407c.get(), (bej.m) this.f4391b.F0.get(), new unj.j());
                }
                if (i59 == 1) {
                    return new kxk.o(q2Var3.f4406b, new rmj.c(), new rmj.b(new ugc.a(b.b())));
                }
                throw new AssertionError(i59);
            case 11:
                v2 v2Var = (v2) this.d;
                EsimMobilePlanNumberTransferPortabilityDatePickerScreenContract$InputData esimMobilePlanNumberTransferPortabilityDatePickerScreenContract$InputData = v2Var.f4497b;
                int i66 = this.f4392c;
                if (i66 == 0) {
                    return new com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.portability_date_picker.a((cli.n) v2Var.f4498c.get(), esimMobilePlanNumberTransferPortabilityDatePickerScreenContract$InputData);
                }
                if (i66 == 1) {
                    return new klj.p(esimMobilePlanNumberTransferPortabilityDatePickerScreenContract$InputData, this.f4391b.c(), new ugc.a(b.b()));
                }
                throw new AssertionError(i66);
            case 12:
                x2 x2Var = (x2) this.d;
                EsimPickerScreenContract$InputData esimPickerScreenContract$InputData = x2Var.f4523b;
                int i74 = this.f4392c;
                if (i74 == 0) {
                    return new ilj.g((cli.n) x2Var.f4524c.get(), esimPickerScreenContract$InputData);
                }
                if (i74 == 1) {
                    return new ilj.h(esimPickerScreenContract$InputData, (xnj.a) this.f4391b.R0.get());
                }
                throw new AssertionError(i74);
            case 13:
                v2 v2Var2 = (v2) this.d;
                EsimMobilePlanNumberTransferPortabilityDatePickerScreenContract$InputData esimMobilePlanNumberTransferPortabilityDatePickerScreenContract$InputData2 = v2Var2.f4497b;
                int i92 = this.f4392c;
                if (i92 == 0) {
                    return new com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.portability_date_picker.a((cli.n) v2Var2.f4498c.get(), esimMobilePlanNumberTransferPortabilityDatePickerScreenContract$InputData2);
                }
                if (i92 == 1) {
                    return new klj.p(esimMobilePlanNumberTransferPortabilityDatePickerScreenContract$InputData2, this.f4391b.c(), new ugc.a(b.b()));
                }
                throw new AssertionError(i92);
            case 14:
                v2 v2Var3 = (v2) this.d;
                EsimMobilePlanNumberTransferPortabilityDatePickerScreenContract$InputData esimMobilePlanNumberTransferPortabilityDatePickerScreenContract$InputData3 = v2Var3.f4497b;
                int i96 = this.f4392c;
                if (i96 == 0) {
                    return new com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.portability_date_picker.a((cli.n) v2Var3.f4498c.get(), esimMobilePlanNumberTransferPortabilityDatePickerScreenContract$InputData3);
                }
                if (i96 == 1) {
                    return new klj.p(esimMobilePlanNumberTransferPortabilityDatePickerScreenContract$InputData3, this.f4391b.c(), new ugc.a(b.b()));
                }
                throw new AssertionError(i96);
            case 15:
                x2 x2Var2 = (x2) this.d;
                EsimPickerScreenContract$InputData esimPickerScreenContract$InputData2 = x2Var2.f4523b;
                int i99 = this.f4392c;
                if (i99 == 0) {
                    return new ilj.g((cli.n) x2Var2.f4524c.get(), esimPickerScreenContract$InputData2);
                }
                if (i99 == 1) {
                    return new ilj.h(esimPickerScreenContract$InputData2, (xnj.a) this.f4391b.R0.get());
                }
                throw new AssertionError(i99);
            case 16:
                int i100 = this.f4392c;
                if (i100 == 0) {
                    j3 j3Var = (j3) this.d;
                    return new jnj.g(j3Var.f4306b, (cli.n) j3Var.f4307c.get(), ((s41.a) this.f4391b.f4164w).d());
                }
                if (i100 == 1) {
                    return new jnj.i(b.b());
                }
                throw new AssertionError(i100);
            case 17:
                int i101 = this.f4392c;
                if (i101 == 0) {
                    j3 j3Var2 = (j3) this.d;
                    return new jnj.g(j3Var2.f4306b, (cli.n) j3Var2.f4307c.get(), ((s41.a) this.f4391b.f4164w).d());
                }
                if (i101 == 1) {
                    return new jnj.i(b.b());
                }
                throw new AssertionError(i101);
            case 18:
                int i102 = this.f4392c;
                if (i102 == 0) {
                    j3 j3Var3 = (j3) this.d;
                    return new jnj.g(j3Var3.f4306b, (cli.n) j3Var3.f4307c.get(), ((s41.a) this.f4391b.f4164w).d());
                }
                if (i102 == 1) {
                    return new jnj.i(b.b());
                }
                throw new AssertionError(i102);
            case 19:
                int i103 = this.f4392c;
                if (i103 == 0) {
                    j3 j3Var4 = (j3) this.d;
                    return new jnj.g(j3Var4.f4306b, (cli.n) j3Var4.f4307c.get(), ((s41.a) this.f4391b.f4164w).d());
                }
                if (i103 == 1) {
                    return new jnj.i(b.b());
                }
                throw new AssertionError(i103);
            case 20:
                p3 p3Var = (p3) this.d;
                b bVar9 = this.f4391b;
                int i104 = this.f4392c;
                if (i104 == 0) {
                    return new com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund.c((cli.n) p3Var.f4395c.get(), p3Var.f4394b, (s4) bVar9.f4139j1.get(), new lnj.p(), ((s41.a) bVar9.f4164w).d());
                }
                if (i104 == 1) {
                    return new lnj.o(new ynj.e(), bVar9.e(), new fhj.h(), b.b());
                }
                throw new AssertionError(i104);
            case 21:
                p3 p3Var2 = (p3) this.d;
                b bVar10 = this.f4391b;
                int i105 = this.f4392c;
                if (i105 == 0) {
                    return new com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund.c((cli.n) p3Var2.f4395c.get(), p3Var2.f4394b, (s4) bVar10.f4139j1.get(), new lnj.p(), ((s41.a) bVar10.f4164w).d());
                }
                if (i105 == 1) {
                    return new lnj.o(new ynj.e(), bVar10.e(), new fhj.h(), b.b());
                }
                throw new AssertionError(i105);
            case 22:
                p3 p3Var3 = (p3) this.d;
                b bVar11 = this.f4391b;
                int i106 = this.f4392c;
                if (i106 == 0) {
                    return new com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund.c((cli.n) p3Var3.f4395c.get(), p3Var3.f4394b, (s4) bVar11.f4139j1.get(), new lnj.p(), ((s41.a) bVar11.f4164w).d());
                }
                if (i106 == 1) {
                    return new lnj.o(new ynj.e(), bVar11.e(), new fhj.h(), b.b());
                }
                throw new AssertionError(i106);
            case 23:
                int i107 = this.f4392c;
                if (i107 == 0) {
                    return new pnj.h((jki.p) ((r3) this.d).f4426b.get(), (bej.n) this.f4391b.Y0.get());
                }
                if (i107 == 1) {
                    return new pnj.i();
                }
                throw new AssertionError(i107);
            case 24:
                int i108 = this.f4392c;
                if (i108 == 0) {
                    return new pnj.h((jki.p) ((r3) this.d).f4426b.get(), (bej.n) this.f4391b.Y0.get());
                }
                if (i108 == 1) {
                    return new pnj.i();
                }
                throw new AssertionError(i108);
            case 25:
                int i109 = this.f4392c;
                if (i109 == 0) {
                    return new pnj.h((jki.p) ((r3) this.d).f4426b.get(), (bej.n) this.f4391b.Y0.get());
                }
                if (i109 == 1) {
                    return new pnj.i();
                }
                throw new AssertionError(i109);
            case 26:
                int i110 = this.f4392c;
                if (i110 == 0) {
                    return new pnj.h((jki.p) ((r3) this.d).f4426b.get(), (bej.n) this.f4391b.Y0.get());
                }
                if (i110 == 1) {
                    return new pnj.i();
                }
                throw new AssertionError(i110);
            case 27:
                int i111 = this.f4392c;
                if (i111 == 0) {
                    return new pnj.h((jki.p) ((r3) this.d).f4426b.get(), (bej.n) this.f4391b.Y0.get());
                }
                if (i111 == 1) {
                    return new pnj.i();
                }
                throw new AssertionError(i111);
            case 28:
                int i112 = this.f4392c;
                if (i112 == 0) {
                    return new pnj.h((jki.p) ((r3) this.d).f4426b.get(), (bej.n) this.f4391b.Y0.get());
                }
                if (i112 == 1) {
                    return new pnj.i();
                }
                throw new AssertionError(i112);
            default:
                int i113 = this.f4392c;
                if (i113 == 0) {
                    return new pnj.h((jki.p) ((r3) this.d).f4426b.get(), (bej.n) this.f4391b.Y0.get());
                }
                if (i113 == 1) {
                    return new pnj.i();
                }
                throw new AssertionError(i113);
        }
    }
}
