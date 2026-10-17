package dw3;

import com.revolut.feature.credit.application.close.ui.screen.CreditApplicationCloseScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.amount_input.CreditAmountInputScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.calculator.CalculatorScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.co_borrower.consent.initiator.request_consent.RequestConsentScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowContract$Input;
import com.revolut.feature.credit.application.plugins.impl.ui.document.pdf.CreditPdfDocumentControllerContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.documents_upload.summary.SummaryScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class s7 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f119787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c1 f119788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f119789c;
    public final xki.c d;
    public final Object e;

    public /* synthetic */ s7(c1 c1Var, xki.c cVar, Object obj2, int i, int i2) {
        this.f119787a = i2;
        this.f119788b = c1Var;
        this.d = cVar;
        this.e = obj2;
        this.f119789c = i;
    }

    private final Object a() {
        n4 n4Var = (n4) this.d;
        f8 f8Var = (f8) this.e;
        c1 c1Var = this.f119788b;
        int i = this.f119789c;
        switch (i) {
            case 0:
                Object extension = (j60.a) f8Var.f.get();
                d64.e.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension, "extension");
                yji.d dVar = (yji.d) extension;
                vc.s.k(dVar);
                return dVar;
            case 1:
                com.revolut.kompot.navigable.a aVar = (com.revolut.kompot.navigable.a) f8Var.d.get();
                rp0.m mVar = (rp0.m) f8Var.e.get();
                n4Var.getClass();
                return cwi.u.l(aVar, mVar, kxa.j.o(new nji.b()));
            case 2:
                d64.e.Companion.getClass();
                return new rp0.m();
            case 3:
                return e5f.b.e((com.revolut.kompot.navigable.a) f8Var.d.get(), (c84.b) f8Var.f118765h.get(), (PluginFlowContract$Input) n4Var.i.get());
            case 4:
                return new c84.b();
            case 5:
                return com.revolut.data.database.models.openbanking.d.u(c1Var.f118443h, (com.revolut.kompot.navigable.a) f8Var.d.get());
            case 6:
                return new a84.e((a84.b) f8Var.k.get());
            case 7:
                return agk.b.l(f8Var.f118762b);
            case 8:
                lx4.a aVarE = c1Var.f118489y.e();
                return new kx4.a(aVarE, com.revolut.data.database.models.openbanking.d.v(aVarE), ((s41.a) c1Var.f118485x).d());
            case 9:
                j60.a aVar2 = (j60.a) f8Var.f.get();
                cx4.a aVar3 = (cx4.a) f8Var.f118769n.get();
                c64.q qVar = (c64.q) n4Var.v.get();
                ow3.e eVar = (ow3.e) c1Var.Y0.get();
                e64.b bVar = (e64.b) f8Var.o.get();
                CalculatorScreenContract$InputData calculatorScreenContract$InputData = f8Var.f118763c;
                ha3.f fVarD = c1Var.f118474t.d();
                vc.s.j(fVarD);
                return new c64.b0(aVar2, aVar3, qVar, eVar, bVar, calculatorScreenContract$InputData, fVarD, new f64.a(), (cli.n) f8Var.f118770p.get());
            case 10:
                return new e64.c(c1Var.f118489y.b(), new mx4.a1(), new mx4.c1());
            case 11:
                return new c64.d0((e64.b) f8Var.o.get(), new ae4.a(), f8Var.f118763c);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object b() {
        b0 b0Var = (b0) this.d;
        f8 f8Var = (f8) this.e;
        c1 c1Var = this.f119788b;
        int i = this.f119789c;
        switch (i) {
            case 0:
                Object extension = (j60.a) f8Var.f.get();
                d64.e.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension, "extension");
                yji.d dVar = (yji.d) extension;
                vc.s.k(dVar);
                return dVar;
            case 1:
                com.revolut.kompot.navigable.a aVar = (com.revolut.kompot.navigable.a) f8Var.d.get();
                rp0.m mVar = (rp0.m) f8Var.e.get();
                b0Var.getClass();
                return cwi.u.l(aVar, mVar, kxa.j.o(new nji.b()));
            case 2:
                d64.e.Companion.getClass();
                return new rp0.m();
            case 3:
                return e5f.b.e((com.revolut.kompot.navigable.a) f8Var.d.get(), (c84.b) f8Var.f118765h.get(), (PluginFlowContract$Input) b0Var.i.get());
            case 4:
                return new c84.b();
            case 5:
                return com.revolut.data.database.models.openbanking.d.u(c1Var.f118443h, (com.revolut.kompot.navigable.a) f8Var.d.get());
            case 6:
                return new a84.e((a84.b) f8Var.k.get());
            case 7:
                return agk.b.l(f8Var.f118762b);
            case 8:
                lx4.a aVarE = c1Var.f118489y.e();
                return new kx4.a(aVarE, com.revolut.data.database.models.openbanking.d.v(aVarE), ((s41.a) c1Var.f118485x).d());
            case 9:
                j60.a aVar2 = (j60.a) f8Var.f.get();
                cx4.a aVar3 = (cx4.a) f8Var.f118769n.get();
                c64.q qVar = (c64.q) b0Var.f118316w.get();
                ow3.e eVar = (ow3.e) c1Var.Y0.get();
                e64.b bVar = (e64.b) f8Var.o.get();
                CalculatorScreenContract$InputData calculatorScreenContract$InputData = f8Var.f118763c;
                ha3.f fVarD = c1Var.f118474t.d();
                vc.s.j(fVarD);
                return new c64.b0(aVar2, aVar3, qVar, eVar, bVar, calculatorScreenContract$InputData, fVarD, new f64.a(), (cli.n) f8Var.f118770p.get());
            case 10:
                return new e64.c(c1Var.f118489y.b(), new mx4.a1(), new mx4.c1());
            case 11:
                return new c64.d0((e64.b) f8Var.o.get(), new ae4.a(), f8Var.f118763c);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object c() {
        g8 g8Var = (g8) this.e;
        int i = this.f119789c;
        if (i == 0) {
            n60.a aVar = (n60.a) g8Var.d.get();
            o5k.i.l(aVar);
            return aVar;
        }
        if (i == 1) {
            return o5k.i.q((com.revolut.kompot.navigable.a) g8Var.f118831c.get());
        }
        c1 c1Var = this.f119788b;
        if (i == 2) {
            return new com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.details.a((cli.n) g8Var.f.get(), g8Var.f118829a, new com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.details.b(), (xw3.a) c1Var.f118445h1.get(), (hw3.c) c1Var.f118472s0.get(), new a94.d(), (n60.a) g8Var.d.get(), (a94.k) ((t4) this.d).f119843s.get(), (w80.b) g8Var.f118832g.get());
        }
        if (i == 3) {
            return new com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.details.c();
        }
        if (i == 4) {
            w80.b amountFormatter = c1Var.f118443h.j();
            vc.s.j(amountFormatter);
            c94.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
            return amountFormatter;
        }
        if (i != 5) {
            throw new AssertionError(i);
        }
        com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) g8Var.f118831c.get();
        c94.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(controller, "controller");
        return new rp0.l0(controller.m2());
    }

    private final Object d() {
        c1 c1Var = this.f119788b;
        l70.e eVar = c1Var.f118443h;
        j8 j8Var = (j8) this.e;
        int i = this.f119789c;
        if (i == 0) {
            return e5f.b.e((com.revolut.kompot.navigable.a) j8Var.f119056c.get(), (c84.b) j8Var.d.get(), (PluginFlowContract$Input) ((e1) this.d).i.get());
        }
        if (i == 1) {
            return new c84.b();
        }
        if (i != 2) {
            if (i == 3) {
                return new com.revolut.feature.credit.application.plugins.impl.ui.document.pdf.h(j8Var.f119055b);
            }
            throw new AssertionError(i);
        }
        CreditPdfDocumentControllerContract$InputData creditPdfDocumentControllerContract$InputData = j8Var.f119055b;
        hk0.a aVarJ = ((nj0.d) c1Var.d).j();
        zk0.b bVarL = eVar.l();
        vc.s.j(bVarL);
        n80.d dVarA = eVar.a();
        vc.s.j(dVarA);
        return new com.revolut.feature.credit.application.plugins.impl.ui.document.pdf.g(creditPdfDocumentControllerContract$InputData, aVarJ, bVarL, dVarA, c1Var.f118482w.e(), (cli.n) j8Var.f119057g.get());
    }

    private final Object e() {
        c1 c1Var = this.f119788b;
        l70.e eVar = c1Var.f118443h;
        j8 j8Var = (j8) this.e;
        int i = this.f119789c;
        if (i == 0) {
            return e5f.b.e((com.revolut.kompot.navigable.a) j8Var.f119056c.get(), (c84.b) j8Var.d.get(), (PluginFlowContract$Input) ((f4) this.d).i.get());
        }
        if (i == 1) {
            return new c84.b();
        }
        if (i != 2) {
            if (i == 3) {
                return new com.revolut.feature.credit.application.plugins.impl.ui.document.pdf.h(j8Var.f119055b);
            }
            throw new AssertionError(i);
        }
        CreditPdfDocumentControllerContract$InputData creditPdfDocumentControllerContract$InputData = j8Var.f119055b;
        hk0.a aVarJ = ((nj0.d) c1Var.d).j();
        zk0.b bVarL = eVar.l();
        vc.s.j(bVarL);
        n80.d dVarA = eVar.a();
        vc.s.j(dVarA);
        return new com.revolut.feature.credit.application.plugins.impl.ui.document.pdf.g(creditPdfDocumentControllerContract$InputData, aVarJ, bVarL, dVarA, c1Var.f118482w.e(), (cli.n) j8Var.f119057g.get());
    }

    private final Object f() {
        c1 c1Var = this.f119788b;
        l70.e eVar = c1Var.f118443h;
        j8 j8Var = (j8) this.e;
        int i = this.f119789c;
        if (i == 0) {
            return e5f.b.e((com.revolut.kompot.navigable.a) j8Var.f119056c.get(), (c84.b) j8Var.d.get(), (PluginFlowContract$Input) ((h4) this.d).i.get());
        }
        if (i == 1) {
            return new c84.b();
        }
        if (i != 2) {
            if (i == 3) {
                return new com.revolut.feature.credit.application.plugins.impl.ui.document.pdf.h(j8Var.f119055b);
            }
            throw new AssertionError(i);
        }
        CreditPdfDocumentControllerContract$InputData creditPdfDocumentControllerContract$InputData = j8Var.f119055b;
        hk0.a aVarJ = ((nj0.d) c1Var.d).j();
        zk0.b bVarL = eVar.l();
        vc.s.j(bVarL);
        n80.d dVarA = eVar.a();
        vc.s.j(dVarA);
        return new com.revolut.feature.credit.application.plugins.impl.ui.document.pdf.g(creditPdfDocumentControllerContract$InputData, aVarJ, bVarL, dVarA, c1Var.f118482w.e(), (cli.n) j8Var.f119057g.get());
    }

    private final Object g() {
        k8 k8Var = (k8) this.e;
        SummaryScreenContract$InputData summaryScreenContract$InputData = k8Var.f119136a;
        int i = this.f119789c;
        if (i == 0) {
            return e5f.b.e((com.revolut.kompot.navigable.a) k8Var.f119137b.get(), (c84.b) k8Var.d.get(), (PluginFlowContract$Input) ((l2) this.d).i.get());
        }
        if (i == 1) {
            return new c84.b();
        }
        if (i == 2) {
            return new ea4.u(summaryScreenContract$InputData, (jw3.a) this.f119788b.T2.get(), (cli.n) k8Var.f119139g.get());
        }
        if (i == 3) {
            return new ea4.v(summaryScreenContract$InputData, new q74.b());
        }
        throw new AssertionError(i);
    }

    private final Object h() {
        k1 k1Var = (k1) this.d;
        n8 n8Var = (n8) this.e;
        c1 c1Var = this.f119788b;
        int i = this.f119789c;
        switch (i) {
            case 0:
                return e5f.b.e((com.revolut.kompot.navigable.a) n8Var.d.get(), (c84.b) n8Var.e.get(), (PluginFlowContract$Input) k1Var.i.get());
            case 1:
                return new c84.b();
            case 2:
                return com.revolut.data.database.models.openbanking.d.u(c1Var.f118443h, (com.revolut.kompot.navigable.a) n8Var.d.get());
            case 3:
                return new a84.e((a84.b) n8Var.f119370h.get());
            case 4:
                return agk.b.l(n8Var.f119367b);
            case 5:
                lx4.a aVarE = c1Var.f118489y.e();
                return new kx4.a(aVarE, com.revolut.data.database.models.openbanking.d.v(aVarE), ((s41.a) c1Var.f118485x).d());
            case 6:
                return new oc4.k((cx4.a) n8Var.f119371j.get(), (oc4.i) k1Var.u.get(), (cli.n) n8Var.f119372l.get());
            case 7:
                return new i3g.k(new w74.a(n8Var.f119368c.f118489y.c()), new ix4.b());
            default:
                throw new AssertionError(i);
        }
    }

    @Override // phm.a
    public final Object get() {
        switch (this.f119787a) {
            case 0:
                r7 r7Var = (r7) this.e;
                int i = this.f119789c;
                if (i == 0) {
                    return s2l.c.k((r60.b) r7Var.e.get());
                }
                if (i == 1) {
                    return com.revolut.data.database.models.openbanking.d.w((com.revolut.kompot.navigable.a) r7Var.f119694c.get(), (rp0.p0) r7Var.d.get());
                }
                if (i == 2) {
                    return new rp0.p0();
                }
                if (i != 3) {
                    if (i == 4) {
                        return new hq3.p();
                    }
                    throw new AssertionError(i);
                }
                jki.p pVar = (jki.p) r7Var.f119695g.get();
                CreditApplicationCloseScreenContract$InputData creditApplicationCloseScreenContract$InputData = r7Var.f119693b;
                j60.a aVar = (j60.a) ((y4) this.d).f120209g.get();
                c1 c1Var = this.f119788b;
                eq3.d dVar = (eq3.d) c1Var.V1.get();
                dq3.a aVar2 = (dq3.a) c1Var.W1.get();
                ow3.e eVar = (ow3.e) c1Var.Y0.get();
                eq3.b bVar = (eq3.b) c1Var.X1.get();
                ow3.i iVar = (ow3.i) c1Var.Y1.get();
                mri.w wVarA = ((ozl.a) c1Var.u).a();
                vc.s.j(wVarA);
                return new hq3.o(pVar, creditApplicationCloseScreenContract$InputData, aVar, dVar, aVar2, eVar, bVar, iVar, wVarA, ((s41.a) c1Var.f118485x).d(), (hw3.c) c1Var.f118472s0.get());
            case 1:
                r7 r7Var2 = (r7) this.e;
                int i2 = this.f119789c;
                if (i2 == 0) {
                    return s2l.c.k((r60.b) r7Var2.e.get());
                }
                if (i2 == 1) {
                    return com.revolut.data.database.models.openbanking.d.w((com.revolut.kompot.navigable.a) r7Var2.f119694c.get(), (rp0.p0) r7Var2.d.get());
                }
                if (i2 == 2) {
                    return new rp0.p0();
                }
                if (i2 != 3) {
                    if (i2 == 4) {
                        return new hq3.p();
                    }
                    throw new AssertionError(i2);
                }
                jki.p pVar2 = (jki.p) r7Var2.f119695g.get();
                CreditApplicationCloseScreenContract$InputData creditApplicationCloseScreenContract$InputData2 = r7Var2.f119693b;
                j60.a aVar3 = (j60.a) ((o2) this.d).f119412g.get();
                c1 c1Var2 = this.f119788b;
                eq3.d dVar2 = (eq3.d) c1Var2.V1.get();
                dq3.a aVar4 = (dq3.a) c1Var2.W1.get();
                ow3.e eVar2 = (ow3.e) c1Var2.Y0.get();
                eq3.b bVar2 = (eq3.b) c1Var2.X1.get();
                ow3.i iVar2 = (ow3.i) c1Var2.Y1.get();
                mri.w wVarA2 = ((ozl.a) c1Var2.u).a();
                vc.s.j(wVarA2);
                return new hq3.o(pVar2, creditApplicationCloseScreenContract$InputData2, aVar3, dVar2, aVar4, eVar2, bVar2, iVar2, wVarA2, ((s41.a) c1Var2.f118485x).d(), (hw3.c) c1Var2.f118472s0.get());
            case 2:
                r7 r7Var3 = (r7) this.e;
                int i3 = this.f119789c;
                if (i3 == 0) {
                    return s2l.c.k((r60.b) r7Var3.e.get());
                }
                if (i3 == 1) {
                    return com.revolut.data.database.models.openbanking.d.w((com.revolut.kompot.navigable.a) r7Var3.f119694c.get(), (rp0.p0) r7Var3.d.get());
                }
                if (i3 == 2) {
                    return new rp0.p0();
                }
                if (i3 != 3) {
                    if (i3 == 4) {
                        return new hq3.p();
                    }
                    throw new AssertionError(i3);
                }
                jki.p pVar3 = (jki.p) r7Var3.f119695g.get();
                CreditApplicationCloseScreenContract$InputData creditApplicationCloseScreenContract$InputData3 = r7Var3.f119693b;
                j60.a aVar5 = (j60.a) ((f7) this.d).f118750g.get();
                c1 c1Var3 = this.f119788b;
                eq3.d dVar3 = (eq3.d) c1Var3.V1.get();
                dq3.a aVar6 = (dq3.a) c1Var3.W1.get();
                ow3.e eVar3 = (ow3.e) c1Var3.Y0.get();
                eq3.b bVar3 = (eq3.b) c1Var3.X1.get();
                ow3.i iVar3 = (ow3.i) c1Var3.Y1.get();
                mri.w wVarA3 = ((ozl.a) c1Var3.u).a();
                vc.s.j(wVarA3);
                return new hq3.o(pVar3, creditApplicationCloseScreenContract$InputData3, aVar5, dVar3, aVar6, eVar3, bVar3, iVar3, wVarA3, ((s41.a) c1Var3.f118485x).d(), (hw3.c) c1Var3.f118472s0.get());
            case 3:
                r7 r7Var4 = (r7) this.e;
                int i5 = this.f119789c;
                if (i5 == 0) {
                    return s2l.c.k((r60.b) r7Var4.e.get());
                }
                if (i5 == 1) {
                    return com.revolut.data.database.models.openbanking.d.w((com.revolut.kompot.navigable.a) r7Var4.f119694c.get(), (rp0.p0) r7Var4.d.get());
                }
                if (i5 == 2) {
                    return new rp0.p0();
                }
                if (i5 != 3) {
                    if (i5 == 4) {
                        return new hq3.p();
                    }
                    throw new AssertionError(i5);
                }
                jki.p pVar4 = (jki.p) r7Var4.f119695g.get();
                CreditApplicationCloseScreenContract$InputData creditApplicationCloseScreenContract$InputData4 = r7Var4.f119693b;
                j60.a aVar7 = (j60.a) ((a3) this.d).f118252g.get();
                c1 c1Var4 = this.f119788b;
                eq3.d dVar4 = (eq3.d) c1Var4.V1.get();
                dq3.a aVar8 = (dq3.a) c1Var4.W1.get();
                ow3.e eVar4 = (ow3.e) c1Var4.Y0.get();
                eq3.b bVar4 = (eq3.b) c1Var4.X1.get();
                ow3.i iVar4 = (ow3.i) c1Var4.Y1.get();
                mri.w wVarA4 = ((ozl.a) c1Var4.u).a();
                vc.s.j(wVarA4);
                return new hq3.o(pVar4, creditApplicationCloseScreenContract$InputData4, aVar7, dVar4, aVar8, eVar4, bVar4, iVar4, wVarA4, ((s41.a) c1Var4.f118485x).d(), (hw3.c) c1Var4.f118472s0.get());
            case 4:
                r7 r7Var5 = (r7) this.e;
                int i6 = this.f119789c;
                if (i6 == 0) {
                    return s2l.c.k((r60.b) r7Var5.e.get());
                }
                if (i6 == 1) {
                    return com.revolut.data.database.models.openbanking.d.w((com.revolut.kompot.navigable.a) r7Var5.f119694c.get(), (rp0.p0) r7Var5.d.get());
                }
                if (i6 == 2) {
                    return new rp0.p0();
                }
                if (i6 != 3) {
                    if (i6 == 4) {
                        return new hq3.p();
                    }
                    throw new AssertionError(i6);
                }
                jki.p pVar5 = (jki.p) r7Var5.f119695g.get();
                CreditApplicationCloseScreenContract$InputData creditApplicationCloseScreenContract$InputData5 = r7Var5.f119693b;
                j60.a aVar9 = (j60.a) ((j0) this.d).f119000g.get();
                c1 c1Var5 = this.f119788b;
                eq3.d dVar5 = (eq3.d) c1Var5.V1.get();
                dq3.a aVar10 = (dq3.a) c1Var5.W1.get();
                ow3.e eVar5 = (ow3.e) c1Var5.Y0.get();
                eq3.b bVar5 = (eq3.b) c1Var5.X1.get();
                ow3.i iVar5 = (ow3.i) c1Var5.Y1.get();
                mri.w wVarA5 = ((ozl.a) c1Var5.u).a();
                vc.s.j(wVarA5);
                return new hq3.o(pVar5, creditApplicationCloseScreenContract$InputData5, aVar9, dVar5, aVar10, eVar5, bVar5, iVar5, wVarA5, ((s41.a) c1Var5.f118485x).d(), (hw3.c) c1Var5.f118472s0.get());
            case 5:
                r7 r7Var6 = (r7) this.e;
                int i21 = this.f119789c;
                if (i21 == 0) {
                    return s2l.c.k((r60.b) r7Var6.e.get());
                }
                if (i21 == 1) {
                    return com.revolut.data.database.models.openbanking.d.w((com.revolut.kompot.navigable.a) r7Var6.f119694c.get(), (rp0.p0) r7Var6.d.get());
                }
                if (i21 == 2) {
                    return new rp0.p0();
                }
                if (i21 != 3) {
                    if (i21 == 4) {
                        return new hq3.p();
                    }
                    throw new AssertionError(i21);
                }
                jki.p pVar6 = (jki.p) r7Var6.f119695g.get();
                CreditApplicationCloseScreenContract$InputData creditApplicationCloseScreenContract$InputData6 = r7Var6.f119693b;
                j60.a aVar11 = (j60.a) ((n0) this.d).f119311j.get();
                c1 c1Var6 = this.f119788b;
                eq3.d dVar6 = (eq3.d) c1Var6.V1.get();
                dq3.a aVar12 = (dq3.a) c1Var6.W1.get();
                ow3.e eVar6 = (ow3.e) c1Var6.Y0.get();
                eq3.b bVar6 = (eq3.b) c1Var6.X1.get();
                ow3.i iVar6 = (ow3.i) c1Var6.Y1.get();
                mri.w wVarA6 = ((ozl.a) c1Var6.u).a();
                vc.s.j(wVarA6);
                return new hq3.o(pVar6, creditApplicationCloseScreenContract$InputData6, aVar11, dVar6, aVar12, eVar6, bVar6, iVar6, wVarA6, ((s41.a) c1Var6.f118485x).d(), (hw3.c) c1Var6.f118472s0.get());
            case 6:
                r7 r7Var7 = (r7) this.e;
                int i22 = this.f119789c;
                if (i22 == 0) {
                    return s2l.c.k((r60.b) r7Var7.e.get());
                }
                if (i22 == 1) {
                    return com.revolut.data.database.models.openbanking.d.w((com.revolut.kompot.navigable.a) r7Var7.f119694c.get(), (rp0.p0) r7Var7.d.get());
                }
                if (i22 == 2) {
                    return new rp0.p0();
                }
                if (i22 != 3) {
                    if (i22 == 4) {
                        return new hq3.p();
                    }
                    throw new AssertionError(i22);
                }
                jki.p pVar7 = (jki.p) r7Var7.f119695g.get();
                CreditApplicationCloseScreenContract$InputData creditApplicationCloseScreenContract$InputData7 = r7Var7.f119693b;
                j60.a aVar13 = (j60.a) ((m3) this.d).f119264g.get();
                c1 c1Var7 = this.f119788b;
                eq3.d dVar7 = (eq3.d) c1Var7.V1.get();
                dq3.a aVar14 = (dq3.a) c1Var7.W1.get();
                ow3.e eVar7 = (ow3.e) c1Var7.Y0.get();
                eq3.b bVar7 = (eq3.b) c1Var7.X1.get();
                ow3.i iVar7 = (ow3.i) c1Var7.Y1.get();
                mri.w wVarA7 = ((ozl.a) c1Var7.u).a();
                vc.s.j(wVarA7);
                return new hq3.o(pVar7, creditApplicationCloseScreenContract$InputData7, aVar13, dVar7, aVar14, eVar7, bVar7, iVar7, wVarA7, ((s41.a) c1Var7.f118485x).d(), (hw3.c) c1Var7.f118472s0.get());
            case 7:
                x7 x7Var = (x7) this.e;
                CreditAmountInputScreenContract$InputData creditAmountInputScreenContract$InputData = x7Var.f120166b;
                int i32 = this.f119789c;
                switch (i32) {
                    case 0:
                        n60.b bVar8 = (n60.b) x7Var.e.get();
                        o5k.i.m(bVar8);
                        return bVar8;
                    case 1:
                        return o5k.i.r((com.revolut.kompot.navigable.a) x7Var.d.get());
                    case 2:
                        return e5f.b.e((com.revolut.kompot.navigable.a) x7Var.d.get(), (c84.b) x7Var.f120168g.get(), (PluginFlowContract$Input) ((s0) this.d).i.get());
                    case 3:
                        return new c84.b();
                    case 4:
                        return new com.revolut.feature.credit.application.plugins.impl.ui.amount_input.b((e54.z) x7Var.k.get(), (e54.a) x7Var.f120171l.get(), (n60.b) x7Var.e.get(), new e54.x(), new e54.v((e54.z) x7Var.k.get(), (com.revolut.feature.credit.application.plugins.impl.ui.amount_input.c) x7Var.f120172m.get(), new u80.o()), x7Var.f120166b);
                    case 5:
                        return f0k.d.l(creditAmountInputScreenContract$InputData, (w80.b) x7Var.f120170j.get());
                    case 6:
                        w80.b bVarJ = this.f119788b.f118443h.j();
                        vc.s.j(bVarJ);
                        f0k.d.e(bVarJ);
                        return bVarJ;
                    case 7:
                        return f0k.d.d(creditAmountInputScreenContract$InputData);
                    case 8:
                        return f0k.d.k(creditAmountInputScreenContract$InputData, (e54.z) x7Var.k.get(), (e54.a) x7Var.f120171l.get());
                    default:
                        throw new AssertionError(i32);
                }
            case 8:
                x7 x7Var2 = (x7) this.e;
                CreditAmountInputScreenContract$InputData creditAmountInputScreenContract$InputData2 = x7Var2.f120166b;
                int i33 = this.f119789c;
                switch (i33) {
                    case 0:
                        n60.b bVar9 = (n60.b) x7Var2.e.get();
                        o5k.i.m(bVar9);
                        return bVar9;
                    case 1:
                        return o5k.i.r((com.revolut.kompot.navigable.a) x7Var2.d.get());
                    case 2:
                        return e5f.b.e((com.revolut.kompot.navigable.a) x7Var2.d.get(), (c84.b) x7Var2.f120168g.get(), (PluginFlowContract$Input) ((p5) this.d).i.get());
                    case 3:
                        return new c84.b();
                    case 4:
                        return new com.revolut.feature.credit.application.plugins.impl.ui.amount_input.b((e54.z) x7Var2.k.get(), (e54.a) x7Var2.f120171l.get(), (n60.b) x7Var2.e.get(), new e54.x(), new e54.v((e54.z) x7Var2.k.get(), (com.revolut.feature.credit.application.plugins.impl.ui.amount_input.c) x7Var2.f120172m.get(), new u80.o()), x7Var2.f120166b);
                    case 5:
                        return f0k.d.l(creditAmountInputScreenContract$InputData2, (w80.b) x7Var2.f120170j.get());
                    case 6:
                        w80.b bVarJ2 = this.f119788b.f118443h.j();
                        vc.s.j(bVarJ2);
                        f0k.d.e(bVarJ2);
                        return bVarJ2;
                    case 7:
                        return f0k.d.d(creditAmountInputScreenContract$InputData2);
                    case 8:
                        return f0k.d.k(creditAmountInputScreenContract$InputData2, (e54.z) x7Var2.k.get(), (e54.a) x7Var2.f120171l.get());
                    default:
                        throw new AssertionError(i33);
                }
            case 9:
                x7 x7Var3 = (x7) this.e;
                CreditAmountInputScreenContract$InputData creditAmountInputScreenContract$InputData3 = x7Var3.f120166b;
                int i43 = this.f119789c;
                switch (i43) {
                    case 0:
                        n60.b bVar10 = (n60.b) x7Var3.e.get();
                        o5k.i.m(bVar10);
                        return bVar10;
                    case 1:
                        return o5k.i.r((com.revolut.kompot.navigable.a) x7Var3.d.get());
                    case 2:
                        return e5f.b.e((com.revolut.kompot.navigable.a) x7Var3.d.get(), (c84.b) x7Var3.f120168g.get(), (PluginFlowContract$Input) ((n4) this.d).i.get());
                    case 3:
                        return new c84.b();
                    case 4:
                        return new com.revolut.feature.credit.application.plugins.impl.ui.amount_input.b((e54.z) x7Var3.k.get(), (e54.a) x7Var3.f120171l.get(), (n60.b) x7Var3.e.get(), new e54.x(), new e54.v((e54.z) x7Var3.k.get(), (com.revolut.feature.credit.application.plugins.impl.ui.amount_input.c) x7Var3.f120172m.get(), new u80.o()), x7Var3.f120166b);
                    case 5:
                        return f0k.d.l(creditAmountInputScreenContract$InputData3, (w80.b) x7Var3.f120170j.get());
                    case 6:
                        w80.b bVarJ3 = this.f119788b.f118443h.j();
                        vc.s.j(bVarJ3);
                        f0k.d.e(bVarJ3);
                        return bVarJ3;
                    case 7:
                        return f0k.d.d(creditAmountInputScreenContract$InputData3);
                    case 8:
                        return f0k.d.k(creditAmountInputScreenContract$InputData3, (e54.z) x7Var3.k.get(), (e54.a) x7Var3.f120171l.get());
                    default:
                        throw new AssertionError(i43);
                }
            case 10:
                x7 x7Var4 = (x7) this.e;
                CreditAmountInputScreenContract$InputData creditAmountInputScreenContract$InputData4 = x7Var4.f120166b;
                int i59 = this.f119789c;
                switch (i59) {
                    case 0:
                        n60.b bVar11 = (n60.b) x7Var4.e.get();
                        o5k.i.m(bVar11);
                        return bVar11;
                    case 1:
                        return o5k.i.r((com.revolut.kompot.navigable.a) x7Var4.d.get());
                    case 2:
                        return e5f.b.e((com.revolut.kompot.navigable.a) x7Var4.d.get(), (c84.b) x7Var4.f120168g.get(), (PluginFlowContract$Input) ((q4) this.d).i.get());
                    case 3:
                        return new c84.b();
                    case 4:
                        return new com.revolut.feature.credit.application.plugins.impl.ui.amount_input.b((e54.z) x7Var4.k.get(), (e54.a) x7Var4.f120171l.get(), (n60.b) x7Var4.e.get(), new e54.x(), new e54.v((e54.z) x7Var4.k.get(), (com.revolut.feature.credit.application.plugins.impl.ui.amount_input.c) x7Var4.f120172m.get(), new u80.o()), x7Var4.f120166b);
                    case 5:
                        return f0k.d.l(creditAmountInputScreenContract$InputData4, (w80.b) x7Var4.f120170j.get());
                    case 6:
                        w80.b bVarJ4 = this.f119788b.f118443h.j();
                        vc.s.j(bVarJ4);
                        f0k.d.e(bVarJ4);
                        return bVarJ4;
                    case 7:
                        return f0k.d.d(creditAmountInputScreenContract$InputData4);
                    case 8:
                        return f0k.d.k(creditAmountInputScreenContract$InputData4, (e54.z) x7Var4.k.get(), (e54.a) x7Var4.f120171l.get());
                    default:
                        throw new AssertionError(i59);
                }
            case 11:
                x7 x7Var5 = (x7) this.e;
                CreditAmountInputScreenContract$InputData creditAmountInputScreenContract$InputData5 = x7Var5.f120166b;
                int i66 = this.f119789c;
                switch (i66) {
                    case 0:
                        n60.b bVar12 = (n60.b) x7Var5.e.get();
                        o5k.i.m(bVar12);
                        return bVar12;
                    case 1:
                        return o5k.i.r((com.revolut.kompot.navigable.a) x7Var5.d.get());
                    case 2:
                        return e5f.b.e((com.revolut.kompot.navigable.a) x7Var5.d.get(), (c84.b) x7Var5.f120168g.get(), (PluginFlowContract$Input) ((o0) this.d).i.get());
                    case 3:
                        return new c84.b();
                    case 4:
                        return new com.revolut.feature.credit.application.plugins.impl.ui.amount_input.b((e54.z) x7Var5.k.get(), (e54.a) x7Var5.f120171l.get(), (n60.b) x7Var5.e.get(), new e54.x(), new e54.v((e54.z) x7Var5.k.get(), (com.revolut.feature.credit.application.plugins.impl.ui.amount_input.c) x7Var5.f120172m.get(), new u80.o()), x7Var5.f120166b);
                    case 5:
                        return f0k.d.l(creditAmountInputScreenContract$InputData5, (w80.b) x7Var5.f120170j.get());
                    case 6:
                        w80.b bVarJ5 = this.f119788b.f118443h.j();
                        vc.s.j(bVarJ5);
                        f0k.d.e(bVarJ5);
                        return bVarJ5;
                    case 7:
                        return f0k.d.d(creditAmountInputScreenContract$InputData5);
                    case 8:
                        return f0k.d.k(creditAmountInputScreenContract$InputData5, (e54.z) x7Var5.k.get(), (e54.a) x7Var5.f120171l.get());
                    default:
                        throw new AssertionError(i66);
                }
            case 12:
                x7 x7Var6 = (x7) this.e;
                CreditAmountInputScreenContract$InputData creditAmountInputScreenContract$InputData6 = x7Var6.f120166b;
                int i74 = this.f119789c;
                switch (i74) {
                    case 0:
                        n60.b bVar13 = (n60.b) x7Var6.e.get();
                        o5k.i.m(bVar13);
                        return bVar13;
                    case 1:
                        return o5k.i.r((com.revolut.kompot.navigable.a) x7Var6.d.get());
                    case 2:
                        return e5f.b.e((com.revolut.kompot.navigable.a) x7Var6.d.get(), (c84.b) x7Var6.f120168g.get(), (PluginFlowContract$Input) ((e3) this.d).i.get());
                    case 3:
                        return new c84.b();
                    case 4:
                        return new com.revolut.feature.credit.application.plugins.impl.ui.amount_input.b((e54.z) x7Var6.k.get(), (e54.a) x7Var6.f120171l.get(), (n60.b) x7Var6.e.get(), new e54.x(), new e54.v((e54.z) x7Var6.k.get(), (com.revolut.feature.credit.application.plugins.impl.ui.amount_input.c) x7Var6.f120172m.get(), new u80.o()), x7Var6.f120166b);
                    case 5:
                        return f0k.d.l(creditAmountInputScreenContract$InputData6, (w80.b) x7Var6.f120170j.get());
                    case 6:
                        w80.b bVarJ6 = this.f119788b.f118443h.j();
                        vc.s.j(bVarJ6);
                        f0k.d.e(bVarJ6);
                        return bVarJ6;
                    case 7:
                        return f0k.d.d(creditAmountInputScreenContract$InputData6);
                    case 8:
                        return f0k.d.k(creditAmountInputScreenContract$InputData6, (e54.z) x7Var6.k.get(), (e54.a) x7Var6.f120171l.get());
                    default:
                        throw new AssertionError(i74);
                }
            case 13:
                e1 e1Var = (e1) this.d;
                x7 x7Var7 = (x7) this.e;
                CreditAmountInputScreenContract$InputData creditAmountInputScreenContract$InputData7 = x7Var7.f120166b;
                int i92 = this.f119789c;
                switch (i92) {
                    case 0:
                        n60.b bVar14 = (n60.b) x7Var7.e.get();
                        o5k.i.m(bVar14);
                        return bVar14;
                    case 1:
                        return o5k.i.r((com.revolut.kompot.navigable.a) x7Var7.d.get());
                    case 2:
                        return e5f.b.e((com.revolut.kompot.navigable.a) x7Var7.d.get(), (c84.b) x7Var7.f120168g.get(), (PluginFlowContract$Input) e1Var.i.get());
                    case 3:
                        return new c84.b();
                    case 4:
                        return new com.revolut.feature.credit.application.plugins.impl.ui.amount_input.b((e54.z) x7Var7.k.get(), (e54.a) x7Var7.f120171l.get(), (n60.b) x7Var7.e.get(), new g2e.t((g84.e) e1Var.C.get()), new e54.v((e54.z) x7Var7.k.get(), (com.revolut.feature.credit.application.plugins.impl.ui.amount_input.c) x7Var7.f120172m.get(), new u80.o()), x7Var7.f120166b);
                    case 5:
                        return f0k.d.l(creditAmountInputScreenContract$InputData7, (w80.b) x7Var7.f120170j.get());
                    case 6:
                        w80.b bVarJ7 = this.f119788b.f118443h.j();
                        vc.s.j(bVarJ7);
                        f0k.d.e(bVarJ7);
                        return bVarJ7;
                    case 7:
                        return f0k.d.d(creditAmountInputScreenContract$InputData7);
                    case 8:
                        return f0k.d.k(creditAmountInputScreenContract$InputData7, (e54.z) x7Var7.k.get(), (e54.a) x7Var7.f120171l.get());
                    default:
                        throw new AssertionError(i92);
                }
            case 14:
                x7 x7Var8 = (x7) this.e;
                CreditAmountInputScreenContract$InputData creditAmountInputScreenContract$InputData8 = x7Var8.f120166b;
                int i96 = this.f119789c;
                switch (i96) {
                    case 0:
                        n60.b bVar15 = (n60.b) x7Var8.e.get();
                        o5k.i.m(bVar15);
                        return bVar15;
                    case 1:
                        return o5k.i.r((com.revolut.kompot.navigable.a) x7Var8.d.get());
                    case 2:
                        return e5f.b.e((com.revolut.kompot.navigable.a) x7Var8.d.get(), (c84.b) x7Var8.f120168g.get(), (PluginFlowContract$Input) ((f4) this.d).i.get());
                    case 3:
                        return new c84.b();
                    case 4:
                        return new com.revolut.feature.credit.application.plugins.impl.ui.amount_input.b((e54.z) x7Var8.k.get(), (e54.a) x7Var8.f120171l.get(), (n60.b) x7Var8.e.get(), new e54.x(), new e54.v((e54.z) x7Var8.k.get(), (com.revolut.feature.credit.application.plugins.impl.ui.amount_input.c) x7Var8.f120172m.get(), new u80.o()), x7Var8.f120166b);
                    case 5:
                        return f0k.d.l(creditAmountInputScreenContract$InputData8, (w80.b) x7Var8.f120170j.get());
                    case 6:
                        w80.b bVarJ8 = this.f119788b.f118443h.j();
                        vc.s.j(bVarJ8);
                        f0k.d.e(bVarJ8);
                        return bVarJ8;
                    case 7:
                        return f0k.d.d(creditAmountInputScreenContract$InputData8);
                    case 8:
                        return f0k.d.k(creditAmountInputScreenContract$InputData8, (e54.z) x7Var8.k.get(), (e54.a) x7Var8.f120171l.get());
                    default:
                        throw new AssertionError(i96);
                }
            case 15:
                x7 x7Var9 = (x7) this.e;
                CreditAmountInputScreenContract$InputData creditAmountInputScreenContract$InputData9 = x7Var9.f120166b;
                int i99 = this.f119789c;
                switch (i99) {
                    case 0:
                        n60.b bVar16 = (n60.b) x7Var9.e.get();
                        o5k.i.m(bVar16);
                        return bVar16;
                    case 1:
                        return o5k.i.r((com.revolut.kompot.navigable.a) x7Var9.d.get());
                    case 2:
                        return e5f.b.e((com.revolut.kompot.navigable.a) x7Var9.d.get(), (c84.b) x7Var9.f120168g.get(), (PluginFlowContract$Input) ((v4) this.d).i.get());
                    case 3:
                        return new c84.b();
                    case 4:
                        return new com.revolut.feature.credit.application.plugins.impl.ui.amount_input.b((e54.z) x7Var9.k.get(), (e54.a) x7Var9.f120171l.get(), (n60.b) x7Var9.e.get(), new e54.x(), new e54.v((e54.z) x7Var9.k.get(), (com.revolut.feature.credit.application.plugins.impl.ui.amount_input.c) x7Var9.f120172m.get(), new u80.o()), x7Var9.f120166b);
                    case 5:
                        return f0k.d.l(creditAmountInputScreenContract$InputData9, (w80.b) x7Var9.f120170j.get());
                    case 6:
                        w80.b bVarJ9 = this.f119788b.f118443h.j();
                        vc.s.j(bVarJ9);
                        f0k.d.e(bVarJ9);
                        return bVarJ9;
                    case 7:
                        return f0k.d.d(creditAmountInputScreenContract$InputData9);
                    case 8:
                        return f0k.d.k(creditAmountInputScreenContract$InputData9, (e54.z) x7Var9.k.get(), (e54.a) x7Var9.f120171l.get());
                    default:
                        throw new AssertionError(i99);
                }
            case 16:
                x7 x7Var10 = (x7) this.e;
                CreditAmountInputScreenContract$InputData creditAmountInputScreenContract$InputData10 = x7Var10.f120166b;
                int i100 = this.f119789c;
                switch (i100) {
                    case 0:
                        n60.b bVar17 = (n60.b) x7Var10.e.get();
                        o5k.i.m(bVar17);
                        return bVar17;
                    case 1:
                        return o5k.i.r((com.revolut.kompot.navigable.a) x7Var10.d.get());
                    case 2:
                        return e5f.b.e((com.revolut.kompot.navigable.a) x7Var10.d.get(), (c84.b) x7Var10.f120168g.get(), (PluginFlowContract$Input) ((b0) this.d).i.get());
                    case 3:
                        return new c84.b();
                    case 4:
                        return new com.revolut.feature.credit.application.plugins.impl.ui.amount_input.b((e54.z) x7Var10.k.get(), (e54.a) x7Var10.f120171l.get(), (n60.b) x7Var10.e.get(), new e54.x(), new e54.v((e54.z) x7Var10.k.get(), (com.revolut.feature.credit.application.plugins.impl.ui.amount_input.c) x7Var10.f120172m.get(), new u80.o()), x7Var10.f120166b);
                    case 5:
                        return f0k.d.l(creditAmountInputScreenContract$InputData10, (w80.b) x7Var10.f120170j.get());
                    case 6:
                        w80.b bVarJ10 = this.f119788b.f118443h.j();
                        vc.s.j(bVarJ10);
                        f0k.d.e(bVarJ10);
                        return bVarJ10;
                    case 7:
                        return f0k.d.d(creditAmountInputScreenContract$InputData10);
                    case 8:
                        return f0k.d.k(creditAmountInputScreenContract$InputData10, (e54.z) x7Var10.k.get(), (e54.a) x7Var10.f120171l.get());
                    default:
                        throw new AssertionError(i100);
                }
            case 17:
                a8 a8Var = (a8) this.e;
                RequestConsentScreenContract$InputData requestConsentScreenContract$InputData = a8Var.f118294a;
                int i101 = this.f119789c;
                if (i101 == 0) {
                    return e5f.b.e((com.revolut.kompot.navigable.a) a8Var.f118295b.get(), (c84.b) a8Var.d.get(), (PluginFlowContract$Input) ((h0) this.d).i.get());
                }
                if (i101 == 1) {
                    return new c84.b();
                }
                if (i101 == 2) {
                    return new m64.k(requestConsentScreenContract$InputData, (pw3.a) this.f119788b.L1.get(), new m64.m(requestConsentScreenContract$InputData, new q74.b()));
                }
                throw new AssertionError(i101);
            case 18:
                c8 c8Var = (c8) this.e;
                c1 c1Var8 = this.f119788b;
                int i102 = this.f119789c;
                if (i102 == 0) {
                    return new com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.b((r74.q) ((t4) this.d).f119846x.get(), ((s41.a) c1Var8.f118485x).d(), (cli.n) c8Var.f118524c.get());
                }
                if (i102 == 1) {
                    return new r74.v(c8Var.f118523b, new q74.b(), new r74.a(), c1Var8.f118454m);
                }
                throw new AssertionError(i102);
            case 19:
                c8 c8Var2 = (c8) this.e;
                c1 c1Var9 = this.f119788b;
                int i103 = this.f119789c;
                if (i103 == 0) {
                    return new com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.b((r74.q) ((q1) this.d).e.get(), ((s41.a) c1Var9.f118485x).d(), (cli.n) c8Var2.f118524c.get());
                }
                if (i103 == 1) {
                    return new r74.v(c8Var2.f118523b, new q74.b(), new r74.a(), c1Var9.f118454m);
                }
                throw new AssertionError(i103);
            case 20:
                p5 p5Var = (p5) this.d;
                f8 f8Var = (f8) this.e;
                c1 c1Var10 = this.f119788b;
                int i104 = this.f119789c;
                switch (i104) {
                    case 0:
                        Object extension = (j60.a) f8Var.f.get();
                        d64.e.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension, "extension");
                        yji.d dVar8 = (yji.d) extension;
                        vc.s.k(dVar8);
                        return dVar8;
                    case 1:
                        com.revolut.kompot.navigable.a aVar15 = (com.revolut.kompot.navigable.a) f8Var.d.get();
                        rp0.m mVar = (rp0.m) f8Var.e.get();
                        p5Var.getClass();
                        return cwi.u.l(aVar15, mVar, kxa.j.o(new nji.b()));
                    case 2:
                        d64.e.Companion.getClass();
                        return new rp0.m();
                    case 3:
                        return e5f.b.e((com.revolut.kompot.navigable.a) f8Var.d.get(), (c84.b) f8Var.f118765h.get(), (PluginFlowContract$Input) p5Var.i.get());
                    case 4:
                        return new c84.b();
                    case 5:
                        return com.revolut.data.database.models.openbanking.d.u(c1Var10.f118443h, (com.revolut.kompot.navigable.a) f8Var.d.get());
                    case 6:
                        return new a84.e((a84.b) f8Var.k.get());
                    case 7:
                        return agk.b.l(f8Var.f118762b);
                    case 8:
                        lx4.a aVarE = c1Var10.f118489y.e();
                        return new kx4.a(aVarE, com.revolut.data.database.models.openbanking.d.v(aVarE), ((s41.a) c1Var10.f118485x).d());
                    case 9:
                        j60.a aVar16 = (j60.a) f8Var.f.get();
                        cx4.a aVar17 = (cx4.a) f8Var.f118769n.get();
                        c64.q qVar = (c64.q) p5Var.A.get();
                        ow3.e eVar8 = (ow3.e) c1Var10.Y0.get();
                        e64.b bVar18 = (e64.b) f8Var.o.get();
                        CalculatorScreenContract$InputData calculatorScreenContract$InputData = f8Var.f118763c;
                        ha3.f fVarD = c1Var10.f118474t.d();
                        vc.s.j(fVarD);
                        return new c64.b0(aVar16, aVar17, qVar, eVar8, bVar18, calculatorScreenContract$InputData, fVarD, new f64.a(), (cli.n) f8Var.f118770p.get());
                    case 10:
                        return new e64.c(c1Var10.f118489y.b(), new mx4.a1(), new mx4.c1());
                    case 11:
                        return new c64.d0((e64.b) f8Var.o.get(), new ae4.a(), f8Var.f118763c);
                    default:
                        throw new AssertionError(i104);
                }
            case 21:
                return a();
            case 22:
                return b();
            case 23:
                return c();
            case 24:
                return d();
            case 25:
                return e();
            case 26:
                return f();
            case 27:
                return g();
            case 28:
                return h();
            default:
                q4 q4Var = (q4) this.d;
                n8 n8Var = (n8) this.e;
                c1 c1Var11 = this.f119788b;
                int i105 = this.f119789c;
                switch (i105) {
                    case 0:
                        return e5f.b.e((com.revolut.kompot.navigable.a) n8Var.d.get(), (c84.b) n8Var.e.get(), (PluginFlowContract$Input) q4Var.i.get());
                    case 1:
                        return new c84.b();
                    case 2:
                        return com.revolut.data.database.models.openbanking.d.u(c1Var11.f118443h, (com.revolut.kompot.navigable.a) n8Var.d.get());
                    case 3:
                        return new a84.e((a84.b) n8Var.f119370h.get());
                    case 4:
                        return agk.b.l(n8Var.f119367b);
                    case 5:
                        lx4.a aVarE2 = c1Var11.f118489y.e();
                        return new kx4.a(aVarE2, com.revolut.data.database.models.openbanking.d.v(aVarE2), ((s41.a) c1Var11.f118485x).d());
                    case 6:
                        return new oc4.k((cx4.a) n8Var.f119371j.get(), (oc4.i) q4Var.f119582y.get(), (cli.n) n8Var.f119372l.get());
                    case 7:
                        return new i3g.k(new w74.a(n8Var.f119368c.f118489y.c()), new ix4.b());
                    default:
                        throw new AssertionError(i105);
                }
        }
    }
}
