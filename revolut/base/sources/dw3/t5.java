package dw3;

import android.app.Activity;
import android.content.Context;
import ch.qos.logback.core.rolling.SizeBasedTriggeringPolicy;
import com.revolut.feature.credit.application.close.ui.screen.CreditApplicationCloseScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.conveyancing_appointment.scheduling.schedule.ScheduleScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowContract$Input;
import com.revolut.feature.credit.application.plugins.impl.ui.documents_upload.document.UploadScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.transactions.RevolutTransactionsSelectionScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.document.UploadDocumentsScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.sepa_direct_debit.set_up.SepaDirectDebitSetUpContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.solicitor_selection.select_solicitor.SelectSolicitorControllerContract$InputData;
import java.util.Optional;
import kotlin.jvm.internal.Intrinsics;
import t80.e;

/* JADX INFO: loaded from: classes22.dex */
public final class t5 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f119847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c1 f119848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f119849c;
    public final Object d;
    public final Object e;

    public /* synthetic */ t5(c1 c1Var, Object obj2, Object obj3, int i, int i2) {
        this.f119847a = i2;
        this.f119848b = c1Var;
        this.d = obj2;
        this.e = obj3;
        this.f119849c = i;
    }

    private final Object a() {
        l7 l7Var = (l7) this.e;
        int i = this.f119849c;
        if (i == 0) {
            return s2l.c.k((r60.b) l7Var.e.get());
        }
        if (i == 1) {
            return com.revolut.data.database.models.openbanking.d.w((com.revolut.kompot.navigable.a) l7Var.f119216c.get(), (rp0.p0) l7Var.d.get());
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
        jki.p pVar = (jki.p) l7Var.f119217g.get();
        CreditApplicationCloseScreenContract$InputData creditApplicationCloseScreenContract$InputData = l7Var.f119215b;
        j60.a aVar = (j60.a) ((k5) this.d).f119119g.get();
        c1 c1Var = this.f119848b;
        eq3.d dVar = (eq3.d) c1Var.V1.get();
        dq3.a aVar2 = (dq3.a) c1Var.W1.get();
        ow3.e eVar = (ow3.e) c1Var.Y0.get();
        eq3.b bVar = (eq3.b) c1Var.X1.get();
        ow3.i iVar = (ow3.i) c1Var.Y1.get();
        mri.w wVarA = ((ozl.a) c1Var.u).a();
        vc.s.j(wVarA);
        return new hq3.o(pVar, creditApplicationCloseScreenContract$InputData, aVar, dVar, aVar2, eVar, bVar, iVar, wVarA, ((s41.a) c1Var.f118485x).d(), (hw3.c) c1Var.f118472s0.get());
    }

    private final Object b() {
        l7 l7Var = (l7) this.e;
        int i = this.f119849c;
        if (i == 0) {
            return s2l.c.k((r60.b) l7Var.e.get());
        }
        if (i == 1) {
            return com.revolut.data.database.models.openbanking.d.w((com.revolut.kompot.navigable.a) l7Var.f119216c.get(), (rp0.p0) l7Var.d.get());
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
        jki.p pVar = (jki.p) l7Var.f119217g.get();
        CreditApplicationCloseScreenContract$InputData creditApplicationCloseScreenContract$InputData = l7Var.f119215b;
        j60.a aVar = (j60.a) ((m5) this.d).f119281g.get();
        c1 c1Var = this.f119848b;
        eq3.d dVar = (eq3.d) c1Var.V1.get();
        dq3.a aVar2 = (dq3.a) c1Var.W1.get();
        ow3.e eVar = (ow3.e) c1Var.Y0.get();
        eq3.b bVar = (eq3.b) c1Var.X1.get();
        ow3.i iVar = (ow3.i) c1Var.Y1.get();
        mri.w wVarA = ((ozl.a) c1Var.u).a();
        vc.s.j(wVarA);
        return new hq3.o(pVar, creditApplicationCloseScreenContract$InputData, aVar, dVar, aVar2, eVar, bVar, iVar, wVarA, ((s41.a) c1Var.f118485x).d(), (hw3.c) c1Var.f118472s0.get());
    }

    private final Object c() {
        l7 l7Var = (l7) this.e;
        int i = this.f119849c;
        if (i == 0) {
            return s2l.c.k((r60.b) l7Var.e.get());
        }
        if (i == 1) {
            return com.revolut.data.database.models.openbanking.d.w((com.revolut.kompot.navigable.a) l7Var.f119216c.get(), (rp0.p0) l7Var.d.get());
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
        jki.p pVar = (jki.p) l7Var.f119217g.get();
        CreditApplicationCloseScreenContract$InputData creditApplicationCloseScreenContract$InputData = l7Var.f119215b;
        j60.a aVar = (j60.a) ((n4) this.d).f119340g.get();
        c1 c1Var = this.f119848b;
        eq3.d dVar = (eq3.d) c1Var.V1.get();
        dq3.a aVar2 = (dq3.a) c1Var.W1.get();
        ow3.e eVar = (ow3.e) c1Var.Y0.get();
        eq3.b bVar = (eq3.b) c1Var.X1.get();
        ow3.i iVar = (ow3.i) c1Var.Y1.get();
        mri.w wVarA = ((ozl.a) c1Var.u).a();
        vc.s.j(wVarA);
        return new hq3.o(pVar, creditApplicationCloseScreenContract$InputData, aVar, dVar, aVar2, eVar, bVar, iVar, wVarA, ((s41.a) c1Var.f118485x).d(), (hw3.c) c1Var.f118472s0.get());
    }

    private final Object d() {
        l7 l7Var = (l7) this.e;
        int i = this.f119849c;
        if (i == 0) {
            return s2l.c.k((r60.b) l7Var.e.get());
        }
        if (i == 1) {
            return com.revolut.data.database.models.openbanking.d.w((com.revolut.kompot.navigable.a) l7Var.f119216c.get(), (rp0.p0) l7Var.d.get());
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
        jki.p pVar = (jki.p) l7Var.f119217g.get();
        CreditApplicationCloseScreenContract$InputData creditApplicationCloseScreenContract$InputData = l7Var.f119215b;
        j60.a aVar = (j60.a) ((q4) this.d).f119569g.get();
        c1 c1Var = this.f119848b;
        eq3.d dVar = (eq3.d) c1Var.V1.get();
        dq3.a aVar2 = (dq3.a) c1Var.W1.get();
        ow3.e eVar = (ow3.e) c1Var.Y0.get();
        eq3.b bVar = (eq3.b) c1Var.X1.get();
        ow3.i iVar = (ow3.i) c1Var.Y1.get();
        mri.w wVarA = ((ozl.a) c1Var.u).a();
        vc.s.j(wVarA);
        return new hq3.o(pVar, creditApplicationCloseScreenContract$InputData, aVar, dVar, aVar2, eVar, bVar, iVar, wVarA, ((s41.a) c1Var.f118485x).d(), (hw3.c) c1Var.f118472s0.get());
    }

    private final Object e() {
        l7 l7Var = (l7) this.e;
        int i = this.f119849c;
        if (i == 0) {
            return s2l.c.k((r60.b) l7Var.e.get());
        }
        if (i == 1) {
            return com.revolut.data.database.models.openbanking.d.w((com.revolut.kompot.navigable.a) l7Var.f119216c.get(), (rp0.p0) l7Var.d.get());
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
        jki.p pVar = (jki.p) l7Var.f119217g.get();
        CreditApplicationCloseScreenContract$InputData creditApplicationCloseScreenContract$InputData = l7Var.f119215b;
        j60.a aVar = (j60.a) ((p0) this.d).f119480g.get();
        c1 c1Var = this.f119848b;
        eq3.d dVar = (eq3.d) c1Var.V1.get();
        dq3.a aVar2 = (dq3.a) c1Var.W1.get();
        ow3.e eVar = (ow3.e) c1Var.Y0.get();
        eq3.b bVar = (eq3.b) c1Var.X1.get();
        ow3.i iVar = (ow3.i) c1Var.Y1.get();
        mri.w wVarA = ((ozl.a) c1Var.u).a();
        vc.s.j(wVarA);
        return new hq3.o(pVar, creditApplicationCloseScreenContract$InputData, aVar, dVar, aVar2, eVar, bVar, iVar, wVarA, ((s41.a) c1Var.f118485x).d(), (hw3.c) c1Var.f118472s0.get());
    }

    private final Object f() {
        l7 l7Var = (l7) this.e;
        int i = this.f119849c;
        if (i == 0) {
            return s2l.c.k((r60.b) l7Var.e.get());
        }
        if (i == 1) {
            return com.revolut.data.database.models.openbanking.d.w((com.revolut.kompot.navigable.a) l7Var.f119216c.get(), (rp0.p0) l7Var.d.get());
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
        jki.p pVar = (jki.p) l7Var.f119217g.get();
        CreditApplicationCloseScreenContract$InputData creditApplicationCloseScreenContract$InputData = l7Var.f119215b;
        j60.a aVar = (j60.a) ((x) this.d).f120097g.get();
        c1 c1Var = this.f119848b;
        eq3.d dVar = (eq3.d) c1Var.V1.get();
        dq3.a aVar2 = (dq3.a) c1Var.W1.get();
        ow3.e eVar = (ow3.e) c1Var.Y0.get();
        eq3.b bVar = (eq3.b) c1Var.X1.get();
        ow3.i iVar = (ow3.i) c1Var.Y1.get();
        mri.w wVarA = ((ozl.a) c1Var.u).a();
        vc.s.j(wVarA);
        return new hq3.o(pVar, creditApplicationCloseScreenContract$InputData, aVar, dVar, aVar2, eVar, bVar, iVar, wVarA, ((s41.a) c1Var.f118485x).d(), (hw3.c) c1Var.f118472s0.get());
    }

    private final Object g() {
        l7 l7Var = (l7) this.e;
        int i = this.f119849c;
        if (i == 0) {
            return s2l.c.k((r60.b) l7Var.e.get());
        }
        if (i == 1) {
            return com.revolut.data.database.models.openbanking.d.w((com.revolut.kompot.navigable.a) l7Var.f119216c.get(), (rp0.p0) l7Var.d.get());
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
        jki.p pVar = (jki.p) l7Var.f119217g.get();
        CreditApplicationCloseScreenContract$InputData creditApplicationCloseScreenContract$InputData = l7Var.f119215b;
        j60.a aVar = (j60.a) ((s4) this.d).f119752g.get();
        c1 c1Var = this.f119848b;
        eq3.d dVar = (eq3.d) c1Var.V1.get();
        dq3.a aVar2 = (dq3.a) c1Var.W1.get();
        ow3.e eVar = (ow3.e) c1Var.Y0.get();
        eq3.b bVar = (eq3.b) c1Var.X1.get();
        ow3.i iVar = (ow3.i) c1Var.Y1.get();
        mri.w wVarA = ((ozl.a) c1Var.u).a();
        vc.s.j(wVarA);
        return new hq3.o(pVar, creditApplicationCloseScreenContract$InputData, aVar, dVar, aVar2, eVar, bVar, iVar, wVarA, ((s41.a) c1Var.f118485x).d(), (hw3.c) c1Var.f118472s0.get());
    }

    private final Object h() {
        l7 l7Var = (l7) this.e;
        int i = this.f119849c;
        if (i == 0) {
            return s2l.c.k((r60.b) l7Var.e.get());
        }
        if (i == 1) {
            return com.revolut.data.database.models.openbanking.d.w((com.revolut.kompot.navigable.a) l7Var.f119216c.get(), (rp0.p0) l7Var.d.get());
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
        jki.p pVar = (jki.p) l7Var.f119217g.get();
        CreditApplicationCloseScreenContract$InputData creditApplicationCloseScreenContract$InputData = l7Var.f119215b;
        j60.a aVar = (j60.a) ((t4) this.d).f119834g.get();
        c1 c1Var = this.f119848b;
        eq3.d dVar = (eq3.d) c1Var.V1.get();
        dq3.a aVar2 = (dq3.a) c1Var.W1.get();
        ow3.e eVar = (ow3.e) c1Var.Y0.get();
        eq3.b bVar = (eq3.b) c1Var.X1.get();
        ow3.i iVar = (ow3.i) c1Var.Y1.get();
        mri.w wVarA = ((ozl.a) c1Var.u).a();
        vc.s.j(wVarA);
        return new hq3.o(pVar, creditApplicationCloseScreenContract$InputData, aVar, dVar, aVar2, eVar, bVar, iVar, wVarA, ((s41.a) c1Var.f118485x).d(), (hw3.c) c1Var.f118472s0.get());
    }

    private final Object i() {
        l7 l7Var = (l7) this.e;
        int i = this.f119849c;
        if (i == 0) {
            return s2l.c.k((r60.b) l7Var.e.get());
        }
        if (i == 1) {
            return com.revolut.data.database.models.openbanking.d.w((com.revolut.kompot.navigable.a) l7Var.f119216c.get(), (rp0.p0) l7Var.d.get());
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
        jki.p pVar = (jki.p) l7Var.f119217g.get();
        CreditApplicationCloseScreenContract$InputData creditApplicationCloseScreenContract$InputData = l7Var.f119215b;
        j60.a aVar = (j60.a) ((v2) this.d).f119971g.get();
        c1 c1Var = this.f119848b;
        eq3.d dVar = (eq3.d) c1Var.V1.get();
        dq3.a aVar2 = (dq3.a) c1Var.W1.get();
        ow3.e eVar = (ow3.e) c1Var.Y0.get();
        eq3.b bVar = (eq3.b) c1Var.X1.get();
        ow3.i iVar = (ow3.i) c1Var.Y1.get();
        mri.w wVarA = ((ozl.a) c1Var.u).a();
        vc.s.j(wVarA);
        return new hq3.o(pVar, creditApplicationCloseScreenContract$InputData, aVar, dVar, aVar2, eVar, bVar, iVar, wVarA, ((s41.a) c1Var.f118485x).d(), (hw3.c) c1Var.f118472s0.get());
    }

    private final Object j() {
        l7 l7Var = (l7) this.e;
        int i = this.f119849c;
        if (i == 0) {
            return s2l.c.k((r60.b) l7Var.e.get());
        }
        if (i == 1) {
            return com.revolut.data.database.models.openbanking.d.w((com.revolut.kompot.navigable.a) l7Var.f119216c.get(), (rp0.p0) l7Var.d.get());
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
        jki.p pVar = (jki.p) l7Var.f119217g.get();
        CreditApplicationCloseScreenContract$InputData creditApplicationCloseScreenContract$InputData = l7Var.f119215b;
        j60.a aVar = (j60.a) ((u6) this.d).f119926g.get();
        c1 c1Var = this.f119848b;
        eq3.d dVar = (eq3.d) c1Var.V1.get();
        dq3.a aVar2 = (dq3.a) c1Var.W1.get();
        ow3.e eVar = (ow3.e) c1Var.Y0.get();
        eq3.b bVar = (eq3.b) c1Var.X1.get();
        ow3.i iVar = (ow3.i) c1Var.Y1.get();
        mri.w wVarA = ((ozl.a) c1Var.u).a();
        vc.s.j(wVarA);
        return new hq3.o(pVar, creditApplicationCloseScreenContract$InputData, aVar, dVar, aVar2, eVar, bVar, iVar, wVarA, ((s41.a) c1Var.f118485x).d(), (hw3.c) c1Var.f118472s0.get());
    }

    @Override // phm.a
    public final Object get() {
        Object jVar;
        switch (this.f119847a) {
            case 0:
                q qVar = (q) this.d;
                u5 u5Var = (u5) this.e;
                c1 c1Var = this.f119848b;
                djf.c cVar = c1Var.f0;
                int i = this.f119849c;
                if (i == 0) {
                    return e5f.b.e((com.revolut.kompot.navigable.a) u5Var.f119920c.get(), (c84.b) u5Var.e.get(), (PluginFlowContract$Input) qVar.f119544j.get());
                }
                if (i == 1) {
                    return new c84.b();
                }
                if (i == 2) {
                    sb4.c cVar2 = (sb4.c) qVar.F.get();
                    sgm.f0 f0Var = new sgm.f0((dtc.i) u5Var.f119922h.get());
                    RevolutTransactionsSelectionScreenContract$InputData revolutTransactionsSelectionScreenContract$InputData = u5Var.f119918a;
                    whf.n nVarB = u5Var.f119919b.f0.b();
                    vc.s.j(nVarB);
                    return new vb4.s(cVar2, f0Var, new vb4.t(revolutTransactionsSelectionScreenContract$InputData, nVarB));
                }
                if (i != 3) {
                    throw new AssertionError(i);
                }
                thf.m textResourcesMapper = cVar.g();
                vc.s.j(textResourcesMapper);
                thf.c categoryResourcesMapper = cVar.c();
                vc.s.j(categoryResourcesMapper);
                n8b.a countryInteractor = c1Var.C.a();
                vc.s.j(countryInteractor);
                l93.f cardsInteractor = c1Var.f118474t.j();
                vc.s.j(cardsInteractor);
                nhf.a unitedWalletInteractor = c1Var.g0.a();
                vc.s.j(unitedWalletInteractor);
                wif.a userFeaturesChecker = c1Var.f118444h0.a();
                t70.b currencyLocalization = c1Var.f118443h.g();
                vc.s.j(currencyLocalization);
                Context context = c1Var.f118454m;
                wb4.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(textResourcesMapper, "textResourcesMapper");
                Intrinsics.checkNotNullParameter(categoryResourcesMapper, "categoryResourcesMapper");
                Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
                Intrinsics.checkNotNullParameter(cardsInteractor, "cardsInteractor");
                Intrinsics.checkNotNullParameter(unitedWalletInteractor, "unitedWalletInteractor");
                Intrinsics.checkNotNullParameter(userFeaturesChecker, "userFeaturesChecker");
                Intrinsics.checkNotNullParameter(currencyLocalization, "currencyLocalization");
                Intrinsics.checkNotNullParameter(context, "context");
                return new dtc.i(textResourcesMapper, categoryResourcesMapper, countryInteractor, unitedWalletInteractor, cardsInteractor, userFeaturesChecker, currencyLocalization, context);
            case 1:
                w5 w5Var = (w5) this.e;
                int i2 = this.f119849c;
                switch (i2) {
                    case 0:
                        return e5f.b.e((com.revolut.kompot.navigable.a) w5Var.d.get(), (c84.b) w5Var.f.get(), (PluginFlowContract$Input) ((v5) this.d).i.get());
                    case 1:
                        return new c84.b();
                    case 2:
                        return new qh4.b((qh4.z) w5Var.f120070h.get());
                    case 3:
                        yji.o viewController = w5Var.f120066a;
                        rh4.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(viewController, "viewController");
                        return (qh4.z) viewController;
                    case 4:
                        return new qh4.b0((cli.n) w5Var.k.get(), w5Var.f120067b, new qh4.m((kg.o) w5Var.f120068c.f118457n0.get(), 0), (cy3.a) this.f119848b.f118422a3.get(), (c90.c) w5Var.f120072l.get());
                    case 5:
                        return new qee.s(w5Var.f120067b);
                    case 6:
                        com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) w5Var.d.get();
                        rh4.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(controller, "controller");
                        return new c90.c(controller.m2());
                    default:
                        throw new AssertionError(i2);
                }
            case 2:
                x5 x5Var = (x5) this.e;
                ScheduleScreenContract$InputData scheduleScreenContract$InputData = x5Var.f120146a;
                int i3 = this.f119849c;
                if (i3 == 0) {
                    return e5f.b.e((com.revolut.kompot.navigable.a) x5Var.f120147b.get(), (c84.b) x5Var.d.get(), (PluginFlowContract$Input) ((r0) this.d).i.get());
                }
                if (i3 == 1) {
                    return new c84.b();
                }
                if (i3 == 2) {
                    return new com.revolut.feature.credit.application.plugins.impl.ui.conveyancing_appointment.scheduling.schedule.a(scheduleScreenContract$InputData, (cli.n) x5Var.f120149g.get());
                }
                if (i3 != 3) {
                    throw new AssertionError(i3);
                }
                qd0.b bVarN = this.f119848b.f118443h.n();
                vc.s.j(bVarN);
                return new o74.p(scheduleScreenContract$InputData, bVarN);
            case 3:
                c6 c6Var = (c6) this.e;
                int i5 = this.f119849c;
                if (i5 == 0) {
                    return e5f.b.e((com.revolut.kompot.navigable.a) c6Var.f118514b.get(), (c84.b) c6Var.d.get(), (PluginFlowContract$Input) ((z3) this.d).i.get());
                }
                if (i5 == 1) {
                    return new c84.b();
                }
                c1 c1Var2 = this.f119848b;
                if (i5 == 2) {
                    return com.revolut.data.database.models.openbanking.d.u(c1Var2.f118443h, (com.revolut.kompot.navigable.a) c6Var.f118514b.get());
                }
                if (i5 == 3) {
                    lx4.a aVarE = c1Var2.f118489y.e();
                    return new kx4.a(aVarE, com.revolut.data.database.models.openbanking.d.v(aVarE), ((s41.a) c1Var2.f118485x).d());
                }
                if (i5 == 4) {
                    return new ld4.n((mx3.a) c1Var2.f118488x2.get(), c6Var.f118513a, (cli.n) c6Var.i.get());
                }
                if (i5 == 5) {
                    return new ld4.o();
                }
                throw new AssertionError(i5);
            case 4:
                d6 d6Var = (d6) this.e;
                SelectSolicitorControllerContract$InputData selectSolicitorControllerContract$InputData = d6Var.f118585a;
                int i6 = this.f119849c;
                if (i6 == 0) {
                    return e5f.b.e((com.revolut.kompot.navigable.a) d6Var.f118587c.get(), (c84.b) d6Var.e.get(), (PluginFlowContract$Input) ((r6) this.d).i.get());
                }
                if (i6 == 1) {
                    return new c84.b();
                }
                c1 c1Var3 = this.f119848b;
                if (i6 == 2) {
                    return com.revolut.data.database.models.openbanking.d.u(c1Var3.f118443h, (com.revolut.kompot.navigable.a) d6Var.f118587c.get());
                }
                if (i6 == 3) {
                    lx4.a aVarE2 = c1Var3.f118489y.e();
                    return new kx4.a(aVarE2, com.revolut.data.database.models.openbanking.d.v(aVarE2), ((s41.a) c1Var3.f118485x).d());
                }
                if (i6 == 4) {
                    return new gi4.l(selectSolicitorControllerContract$InputData, (cx4.a) d6Var.f118589h.get(), new ac4.g(selectSolicitorControllerContract$InputData, d6Var.f118586b.f118489y.c()));
                }
                throw new AssertionError(i6);
            case 5:
                i6 i6Var = (i6) this.e;
                int i21 = this.f119849c;
                if (i21 == 0) {
                    return e5f.b.e((com.revolut.kompot.navigable.a) i6Var.f118982b.get(), (c84.b) i6Var.d.get(), ((h6) this.d).f118902b);
                }
                if (i21 == 1) {
                    return new c84.b();
                }
                if (i21 == 2) {
                    return new com.revolut.feature.credit.application.plugins.impl.ui.sepa_direct_debit.repayment_method.a(i6Var.f118981a, (ey3.a) this.f119848b.s3.get(), new wh4.x(new c45.b()));
                }
                throw new AssertionError(i21);
            case 6:
                j6 j6Var = (j6) this.e;
                int i22 = this.f119849c;
                if (i22 == 0) {
                    return e5f.b.e((com.revolut.kompot.navigable.a) j6Var.f119047b.get(), (c84.b) j6Var.d.get(), ((h6) this.d).f118902b);
                }
                if (i22 == 1) {
                    return new c84.b();
                }
                if (i22 != 2) {
                    throw new AssertionError(i22);
                }
                SepaDirectDebitSetUpContract$InputData sepaDirectDebitSetUpContract$InputData = j6Var.f119046a;
                c1 c1Var4 = this.f119848b;
                return new com.revolut.feature.credit.application.plugins.impl.ui.sepa_direct_debit.set_up.a(sepaDirectDebitSetUpContract$InputData, (ey3.a) c1Var4.s3.get(), c1Var4.f118449k0.b(), new uh4.a(), new yh4.y(new c45.b()));
            case 7:
                h4 h4Var = (h4) this.d;
                n6 n6Var = (n6) this.e;
                int i32 = this.f119849c;
                if (i32 == 0) {
                    return e5f.b.e((com.revolut.kompot.navigable.a) n6Var.f119358a.get(), (c84.b) n6Var.f119360c.get(), (PluginFlowContract$Input) h4Var.i.get());
                }
                if (i32 == 1) {
                    return new c84.b();
                }
                if (i32 != 2) {
                    if (i32 == 3) {
                        return new qe4.l((re4.e) h4Var.u.get(), new h54.a(), this.f119848b.c());
                    }
                    if (i32 == 4) {
                        return new ve4.s((re4.e) h4Var.u.get(), (qe4.e) n6Var.e.get(), new ve4.t());
                    }
                    throw new AssertionError(i32);
                }
                Object extension = (qe4.e) n6Var.e.get();
                we4.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension, "extension");
                yji.n nVar = (yji.n) extension;
                vc.s.k(nVar);
                return nVar;
            case 8:
                o6 o6Var = (o6) this.e;
                int i33 = this.f119849c;
                if (i33 == 0) {
                    return e5f.b.e((com.revolut.kompot.navigable.a) o6Var.f119459b.get(), (c84.b) o6Var.d.get(), (PluginFlowContract$Input) ((f4) this.d).i.get());
                }
                if (i33 == 1) {
                    return new c84.b();
                }
                if (i33 == 2) {
                    return new iz3.c(((s41.a) this.f119848b.f118485x).d());
                }
                if (i33 == 3) {
                    return new fe4.j((iz3.a) o6Var.f.get(), o6Var.f119458a, new fe4.k());
                }
                throw new AssertionError(i33);
            case 9:
                y6 y6Var = (y6) this.e;
                int i43 = this.f119849c;
                if (i43 == 0) {
                    return e5f.b.e((com.revolut.kompot.navigable.a) y6Var.f120235b.get(), (c84.b) y6Var.d.get(), (PluginFlowContract$Input) ((x6) this.d).i.get());
                }
                if (i43 == 1) {
                    return new c84.b();
                }
                if (i43 == 2) {
                    return new yi4.g((cli.n) y6Var.f120237g.get(), y6Var.f120234a, (hw3.c) this.f119848b.f118472s0.get(), new yi4.b());
                }
                if (i43 == 3) {
                    return new yi4.h();
                }
                throw new AssertionError(i43);
            case 10:
                b4 b4Var = (b4) this.d;
                z6 z6Var = (z6) this.e;
                c1 c1Var5 = this.f119848b;
                int i59 = this.f119849c;
                switch (i59) {
                    case 0:
                        return f0k.d.p((e60.a) z6Var.f120308l.get());
                    case 1:
                        com.revolut.kompot.navigable.a aVar = (com.revolut.kompot.navigable.a) z6Var.d.get();
                        g60.a aVarA = f60.v.a((com.revolut.kompot.navigable.a) z6Var.d.get());
                        Activity activityA = f60.t.a((com.revolut.kompot.navigable.a) z6Var.d.get());
                        t80.g gVar = (t80.g) z6Var.e.get();
                        com.revolut.kompot.navigable.a aVar2 = (com.revolut.kompot.navigable.a) z6Var.d.get();
                        f60.y.a(aVar2);
                        d4m.a aVarA2 = e4m.b.a(z6Var.f);
                        nli.a aVar3 = new nli.a((t80.c) z6Var.f120305g.get(), f60.t.a((com.revolut.kompot.navigable.a) z6Var.d.get()));
                        t80.g gVar2 = (t80.g) z6Var.e.get();
                        zk0.b bVarL = z6Var.f120303b.f118443h.l();
                        vc.s.j(bVarL);
                        return v1.c.q(aVar, new t80.v(aVarA, activityA, gVar, aVar2, aVarA2, aVar3, new oli.c(gVar2, bVarL, new nli.a((t80.c) z6Var.f120305g.get(), f60.t.a((com.revolut.kompot.navigable.a) z6Var.d.get())), f60.v.a((com.revolut.kompot.navigable.a) z6Var.d.get()), z6Var.c()), new oli.g(f60.u.a(f60.t.a((com.revolut.kompot.navigable.a) z6Var.d.get())), v1.c.e((com.revolut.kompot.navigable.a) z6Var.d.get()), new ami.n(e4m.b.a(z6Var.f120306h), 1), e4m.b.a(z6Var.f), (t80.g) z6Var.e.get(), new nli.a((t80.c) z6Var.f120305g.get(), f60.t.a((com.revolut.kompot.navigable.a) z6Var.d.get())), new i90.b(), z6Var.b(), z6Var.c()), z6Var.c()), f60.x.a(), (rp0.m) z6Var.i.get(), (e60.t) z6Var.k.get());
                    case 2:
                        l70.e eVar = c1Var5.f118443h;
                        l70.e eVar2 = c1Var5.f118443h;
                        f80.a aVarX = eVar.x();
                        vc.s.j(aVarX);
                        l80.e eVarH = eVar2.h();
                        vc.s.j(eVarH);
                        zk0.b bVarL2 = eVar2.l();
                        vc.s.j(bVarL2);
                        return new t80.b(aVarX, eVarH, bVarL2);
                    case 3:
                        com.revolut.kompot.navigable.a aVar4 = (com.revolut.kompot.navigable.a) z6Var.d.get();
                        f60.y.a(aVar4);
                        return pli.c.a(new ks0.n(aVar4));
                    case 4:
                        qd4.b.Companion.getClass();
                        return new t80.c(new e.a("ManualUnderwritingApplication"), SizeBasedTriggeringPolicy.DEFAULT_MAX_FILE_SIZE);
                    case 5:
                        return t96.a.a();
                    case 6:
                        return f60.z.a();
                    case 7:
                        aii.o oVar = (aii.o) z6Var.f120307j.get();
                        y80.a aVarR = c1Var5.f118443h.r();
                        vc.s.j(aVarR);
                        return new e60.y(oVar, aVarR, z6Var.b(), Optional.empty());
                    case 8:
                        return kxa.j.k((j60.a) z6Var.o.get());
                    case 9:
                        return ehe.n.s((com.revolut.kompot.navigable.a) z6Var.d.get(), (rp0.m) z6Var.f120310n.get());
                    case 10:
                        return new rp0.m();
                    case 11:
                        return e5f.b.e((com.revolut.kompot.navigable.a) z6Var.d.get(), (c84.b) z6Var.f120313r.get(), (PluginFlowContract$Input) b4Var.i.get());
                    case 12:
                        return new c84.b();
                    case 13:
                        e60.t tVar = (e60.t) z6Var.k.get();
                        f60.w.a(tVar);
                        return tVar;
                    case 14:
                        hw3.d0 d0Var = (hw3.d0) c1Var5.T0.get();
                        e60.a aVar5 = (e60.a) z6Var.f120308l.get();
                        py3.b bVarC = c1Var5.c();
                        pd4.b bVar = new pd4.b();
                        hw3.s sVar = (hw3.s) b4Var.B.get();
                        hw3.i0 i0Var = (hw3.i0) b4Var.C.get();
                        hw3.g0 g0Var = new hw3.g0();
                        zd4.a aVar6 = new zd4.a();
                        sf0.h hVarB = c1Var5.f118440g.b();
                        vc.s.j(hVarB);
                        UploadDocumentsScreenContract$InputData uploadDocumentsScreenContract$InputData = z6Var.f120302a;
                        pd4.m mVar = (pd4.m) z6Var.v.get();
                        hw3.g0 pdfPasswordUnlockAvailabilityProvider = new hw3.g0();
                        Intrinsics.checkNotNullParameter(pdfPasswordUnlockAvailabilityProvider, "pdfPasswordUnlockAvailabilityProvider");
                        return new com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.document.d(d0Var, aVar5, bVarC, bVar, sVar, i0Var, g0Var, aVar6, hVarB, uploadDocumentsScreenContract$InputData, mVar, new pd4.w());
                    case 15:
                        return new pd4.a();
                    default:
                        throw new AssertionError(i59);
                }
            case 11:
                a7 a7Var = (a7) this.e;
                c1 c1Var6 = this.f119848b;
                int i66 = this.f119849c;
                switch (i66) {
                    case 0:
                        return f0k.d.p((e60.a) a7Var.f118286l.get());
                    case 1:
                        com.revolut.kompot.navigable.a aVar7 = (com.revolut.kompot.navigable.a) a7Var.d.get();
                        g60.a aVarA3 = f60.v.a((com.revolut.kompot.navigable.a) a7Var.d.get());
                        Activity activityA2 = f60.t.a((com.revolut.kompot.navigable.a) a7Var.d.get());
                        t80.g gVar3 = (t80.g) a7Var.e.get();
                        com.revolut.kompot.navigable.a aVar8 = (com.revolut.kompot.navigable.a) a7Var.d.get();
                        f60.y.a(aVar8);
                        d4m.a aVarA4 = e4m.b.a(a7Var.f);
                        nli.a aVar9 = new nli.a((t80.c) a7Var.f118283g.get(), f60.t.a((com.revolut.kompot.navigable.a) a7Var.d.get()));
                        t80.g gVar4 = (t80.g) a7Var.e.get();
                        zk0.b bVarL3 = a7Var.f118281b.f118443h.l();
                        vc.s.j(bVarL3);
                        return v1.c.q(aVar7, new t80.v(aVarA3, activityA2, gVar3, aVar8, aVarA4, aVar9, new oli.c(gVar4, bVarL3, new nli.a((t80.c) a7Var.f118283g.get(), f60.t.a((com.revolut.kompot.navigable.a) a7Var.d.get())), f60.v.a((com.revolut.kompot.navigable.a) a7Var.d.get()), a7Var.c()), new oli.g(f60.u.a(f60.t.a((com.revolut.kompot.navigable.a) a7Var.d.get())), v1.c.e((com.revolut.kompot.navigable.a) a7Var.d.get()), new ami.n(e4m.b.a(a7Var.f118284h), 1), e4m.b.a(a7Var.f), (t80.g) a7Var.e.get(), new nli.a((t80.c) a7Var.f118283g.get(), f60.t.a((com.revolut.kompot.navigable.a) a7Var.d.get())), new i90.b(), a7Var.b(), a7Var.c()), a7Var.c()), f60.x.a(), (rp0.m) a7Var.i.get(), (e60.t) a7Var.k.get());
                    case 2:
                        l70.e eVar3 = c1Var6.f118443h;
                        l70.e eVar4 = c1Var6.f118443h;
                        f80.a aVarX2 = eVar3.x();
                        vc.s.j(aVarX2);
                        l80.e eVarH2 = eVar4.h();
                        vc.s.j(eVarH2);
                        zk0.b bVarL4 = eVar4.l();
                        vc.s.j(bVarL4);
                        return new t80.b(aVarX2, eVarH2, bVarL4);
                    case 3:
                        com.revolut.kompot.navigable.a aVar10 = (com.revolut.kompot.navigable.a) a7Var.d.get();
                        f60.y.a(aVar10);
                        return pli.c.a(new ks0.n(aVar10));
                    case 4:
                        ca4.b.Companion.getClass();
                        return new t80.c(new e.a("DocumentsUpload"), SizeBasedTriggeringPolicy.DEFAULT_MAX_FILE_SIZE);
                    case 5:
                        return t96.a.a();
                    case 6:
                        return f60.z.a();
                    case 7:
                        aii.o oVar2 = (aii.o) a7Var.f118285j.get();
                        y80.a aVarR2 = c1Var6.f118443h.r();
                        vc.s.j(aVarR2);
                        return new e60.y(oVar2, aVarR2, a7Var.b(), Optional.empty());
                    case 8:
                        return e5f.b.e((com.revolut.kompot.navigable.a) a7Var.d.get(), (c84.b) a7Var.o.get(), (PluginFlowContract$Input) ((l2) this.d).i.get());
                    case 9:
                        return new c84.b();
                    case 10:
                        e60.t tVar2 = (e60.t) a7Var.k.get();
                        f60.w.a(tVar2);
                        return tVar2;
                    case 11:
                        return new com.revolut.feature.credit.application.plugins.impl.ui.documents_upload.document.a(a7Var.f118280a, (jw3.a) c1Var6.T2.get(), (e60.a) a7Var.f118286l.get(), new jz3.c(), ((nj0.d) c1Var6.d).j(), c1Var6.f118482w.d(), (cli.n) a7Var.f118292s.get());
                    case 12:
                        UploadScreenContract$InputData uploadScreenContract$InputData = a7Var.f118280a;
                        jb4.a fileMapper = new jb4.a();
                        Intrinsics.checkNotNullParameter(fileMapper, "fileMapper");
                        return new ba4.a0(uploadScreenContract$InputData, new u94.a(), new q74.b());
                    default:
                        throw new AssertionError(i66);
                }
            case 12:
                e7 e7Var = (e7) this.e;
                int i74 = this.f119849c;
                if (i74 == 0) {
                    return e5f.b.e((com.revolut.kompot.navigable.a) e7Var.f118663a.get(), (c84.b) e7Var.f118665c.get(), (PluginFlowContract$Input) ((u2) this.d).i.get());
                }
                if (i74 == 1) {
                    return new c84.b();
                }
                if (i74 == 2) {
                    jVar = new ta4.j(this.f119848b.k.e(), (cli.n) e7Var.f118666g.get());
                } else {
                    if (i74 != 3) {
                        if (i74 != 4) {
                            throw new AssertionError(i74);
                        }
                        ua4.b.Companion.getClass();
                        return new zzl.c();
                    }
                    jVar = new ta4.l((zzl.b) e7Var.f.get());
                }
                return jVar;
            case 13:
                l7 l7Var = (l7) this.e;
                int i92 = this.f119849c;
                if (i92 == 0) {
                    return s2l.c.k((r60.b) l7Var.e.get());
                }
                if (i92 == 1) {
                    return com.revolut.data.database.models.openbanking.d.w((com.revolut.kompot.navigable.a) l7Var.f119216c.get(), (rp0.p0) l7Var.d.get());
                }
                if (i92 == 2) {
                    return new rp0.p0();
                }
                if (i92 != 3) {
                    if (i92 == 4) {
                        return new hq3.p();
                    }
                    throw new AssertionError(i92);
                }
                jki.p pVar = (jki.p) l7Var.f119217g.get();
                CreditApplicationCloseScreenContract$InputData creditApplicationCloseScreenContract$InputData = l7Var.f119215b;
                j60.a aVar11 = (j60.a) ((x6) this.d).f120154g.get();
                c1 c1Var7 = this.f119848b;
                eq3.d dVar = (eq3.d) c1Var7.V1.get();
                dq3.a aVar12 = (dq3.a) c1Var7.W1.get();
                ow3.e eVar5 = (ow3.e) c1Var7.Y0.get();
                eq3.b bVar2 = (eq3.b) c1Var7.X1.get();
                ow3.i iVar = (ow3.i) c1Var7.Y1.get();
                mri.w wVarA = ((ozl.a) c1Var7.u).a();
                vc.s.j(wVarA);
                return new hq3.o(pVar, creditApplicationCloseScreenContract$InputData, aVar11, dVar, aVar12, eVar5, bVar2, iVar, wVarA, ((s41.a) c1Var7.f118485x).d(), (hw3.c) c1Var7.f118472s0.get());
            case 14:
                l7 l7Var2 = (l7) this.e;
                int i96 = this.f119849c;
                if (i96 == 0) {
                    return s2l.c.k((r60.b) l7Var2.e.get());
                }
                if (i96 == 1) {
                    return com.revolut.data.database.models.openbanking.d.w((com.revolut.kompot.navigable.a) l7Var2.f119216c.get(), (rp0.p0) l7Var2.d.get());
                }
                if (i96 == 2) {
                    return new rp0.p0();
                }
                if (i96 != 3) {
                    if (i96 == 4) {
                        return new hq3.p();
                    }
                    throw new AssertionError(i96);
                }
                jki.p pVar2 = (jki.p) l7Var2.f119217g.get();
                CreditApplicationCloseScreenContract$InputData creditApplicationCloseScreenContract$InputData2 = l7Var2.f119215b;
                j60.a aVar13 = (j60.a) ((t) this.d).f119796g.get();
                c1 c1Var8 = this.f119848b;
                eq3.d dVar2 = (eq3.d) c1Var8.V1.get();
                dq3.a aVar14 = (dq3.a) c1Var8.W1.get();
                ow3.e eVar6 = (ow3.e) c1Var8.Y0.get();
                eq3.b bVar3 = (eq3.b) c1Var8.X1.get();
                ow3.i iVar2 = (ow3.i) c1Var8.Y1.get();
                mri.w wVarA2 = ((ozl.a) c1Var8.u).a();
                vc.s.j(wVarA2);
                return new hq3.o(pVar2, creditApplicationCloseScreenContract$InputData2, aVar13, dVar2, aVar14, eVar6, bVar3, iVar2, wVarA2, ((s41.a) c1Var8.f118485x).d(), (hw3.c) c1Var8.f118472s0.get());
            case 15:
                l7 l7Var3 = (l7) this.e;
                int i99 = this.f119849c;
                if (i99 == 0) {
                    return s2l.c.k((r60.b) l7Var3.e.get());
                }
                if (i99 == 1) {
                    return com.revolut.data.database.models.openbanking.d.w((com.revolut.kompot.navigable.a) l7Var3.f119216c.get(), (rp0.p0) l7Var3.d.get());
                }
                if (i99 == 2) {
                    return new rp0.p0();
                }
                if (i99 != 3) {
                    if (i99 == 4) {
                        return new hq3.p();
                    }
                    throw new AssertionError(i99);
                }
                jki.p pVar3 = (jki.p) l7Var3.f119217g.get();
                CreditApplicationCloseScreenContract$InputData creditApplicationCloseScreenContract$InputData3 = l7Var3.f119215b;
                j60.a aVar15 = (j60.a) ((l0) this.d).f119147g.get();
                c1 c1Var9 = this.f119848b;
                eq3.d dVar3 = (eq3.d) c1Var9.V1.get();
                dq3.a aVar16 = (dq3.a) c1Var9.W1.get();
                ow3.e eVar7 = (ow3.e) c1Var9.Y0.get();
                eq3.b bVar4 = (eq3.b) c1Var9.X1.get();
                ow3.i iVar3 = (ow3.i) c1Var9.Y1.get();
                mri.w wVarA3 = ((ozl.a) c1Var9.u).a();
                vc.s.j(wVarA3);
                return new hq3.o(pVar3, creditApplicationCloseScreenContract$InputData3, aVar15, dVar3, aVar16, eVar7, bVar4, iVar3, wVarA3, ((s41.a) c1Var9.f118485x).d(), (hw3.c) c1Var9.f118472s0.get());
            case 16:
                l7 l7Var4 = (l7) this.e;
                int i100 = this.f119849c;
                if (i100 == 0) {
                    return s2l.c.k((r60.b) l7Var4.e.get());
                }
                if (i100 == 1) {
                    return com.revolut.data.database.models.openbanking.d.w((com.revolut.kompot.navigable.a) l7Var4.f119216c.get(), (rp0.p0) l7Var4.d.get());
                }
                if (i100 == 2) {
                    return new rp0.p0();
                }
                if (i100 != 3) {
                    if (i100 == 4) {
                        return new hq3.p();
                    }
                    throw new AssertionError(i100);
                }
                jki.p pVar4 = (jki.p) l7Var4.f119217g.get();
                CreditApplicationCloseScreenContract$InputData creditApplicationCloseScreenContract$InputData4 = l7Var4.f119215b;
                j60.a aVar17 = (j60.a) ((b4) this.d).f118346g.get();
                c1 c1Var10 = this.f119848b;
                eq3.d dVar4 = (eq3.d) c1Var10.V1.get();
                dq3.a aVar18 = (dq3.a) c1Var10.W1.get();
                ow3.e eVar8 = (ow3.e) c1Var10.Y0.get();
                eq3.b bVar5 = (eq3.b) c1Var10.X1.get();
                ow3.i iVar4 = (ow3.i) c1Var10.Y1.get();
                mri.w wVarA4 = ((ozl.a) c1Var10.u).a();
                vc.s.j(wVarA4);
                return new hq3.o(pVar4, creditApplicationCloseScreenContract$InputData4, aVar17, dVar4, aVar18, eVar8, bVar5, iVar4, wVarA4, ((s41.a) c1Var10.f118485x).d(), (hw3.c) c1Var10.f118472s0.get());
            case 17:
                l7 l7Var5 = (l7) this.e;
                int i101 = this.f119849c;
                if (i101 == 0) {
                    return s2l.c.k((r60.b) l7Var5.e.get());
                }
                if (i101 == 1) {
                    return com.revolut.data.database.models.openbanking.d.w((com.revolut.kompot.navigable.a) l7Var5.f119216c.get(), (rp0.p0) l7Var5.d.get());
                }
                if (i101 == 2) {
                    return new rp0.p0();
                }
                if (i101 != 3) {
                    if (i101 == 4) {
                        return new hq3.p();
                    }
                    throw new AssertionError(i101);
                }
                jki.p pVar5 = (jki.p) l7Var5.f119217g.get();
                CreditApplicationCloseScreenContract$InputData creditApplicationCloseScreenContract$InputData5 = l7Var5.f119215b;
                j60.a aVar19 = (j60.a) ((b0) this.d).f118305g.get();
                c1 c1Var11 = this.f119848b;
                eq3.d dVar5 = (eq3.d) c1Var11.V1.get();
                dq3.a aVar20 = (dq3.a) c1Var11.W1.get();
                ow3.e eVar9 = (ow3.e) c1Var11.Y0.get();
                eq3.b bVar6 = (eq3.b) c1Var11.X1.get();
                ow3.i iVar5 = (ow3.i) c1Var11.Y1.get();
                mri.w wVarA5 = ((ozl.a) c1Var11.u).a();
                vc.s.j(wVarA5);
                return new hq3.o(pVar5, creditApplicationCloseScreenContract$InputData5, aVar19, dVar5, aVar20, eVar9, bVar6, iVar5, wVarA5, ((s41.a) c1Var11.f118485x).d(), (hw3.c) c1Var11.f118472s0.get());
            case 18:
                l7 l7Var6 = (l7) this.e;
                int i102 = this.f119849c;
                if (i102 == 0) {
                    return s2l.c.k((r60.b) l7Var6.e.get());
                }
                if (i102 == 1) {
                    return com.revolut.data.database.models.openbanking.d.w((com.revolut.kompot.navigable.a) l7Var6.f119216c.get(), (rp0.p0) l7Var6.d.get());
                }
                if (i102 == 2) {
                    return new rp0.p0();
                }
                if (i102 != 3) {
                    if (i102 == 4) {
                        return new hq3.p();
                    }
                    throw new AssertionError(i102);
                }
                jki.p pVar6 = (jki.p) l7Var6.f119217g.get();
                CreditApplicationCloseScreenContract$InputData creditApplicationCloseScreenContract$InputData6 = l7Var6.f119215b;
                j60.a aVar21 = (j60.a) ((p5) this.d).f119514g.get();
                c1 c1Var12 = this.f119848b;
                eq3.d dVar6 = (eq3.d) c1Var12.V1.get();
                dq3.a aVar22 = (dq3.a) c1Var12.W1.get();
                ow3.e eVar10 = (ow3.e) c1Var12.Y0.get();
                eq3.b bVar7 = (eq3.b) c1Var12.X1.get();
                ow3.i iVar6 = (ow3.i) c1Var12.Y1.get();
                mri.w wVarA6 = ((ozl.a) c1Var12.u).a();
                vc.s.j(wVarA6);
                return new hq3.o(pVar6, creditApplicationCloseScreenContract$InputData6, aVar21, dVar6, aVar22, eVar10, bVar7, iVar6, wVarA6, ((s41.a) c1Var12.f118485x).d(), (hw3.c) c1Var12.f118472s0.get());
            case 19:
                return a();
            case 20:
                return b();
            case 21:
                return c();
            case 22:
                return d();
            case 23:
                return e();
            case 24:
                return f();
            case 25:
                return g();
            case 26:
                return h();
            case 27:
                return i();
            case 28:
                return j();
            default:
                l7 l7Var7 = (l7) this.e;
                int i103 = this.f119849c;
                if (i103 == 0) {
                    return s2l.c.k((r60.b) l7Var7.e.get());
                }
                if (i103 == 1) {
                    return com.revolut.data.database.models.openbanking.d.w((com.revolut.kompot.navigable.a) l7Var7.f119216c.get(), (rp0.p0) l7Var7.d.get());
                }
                if (i103 == 2) {
                    return new rp0.p0();
                }
                if (i103 != 3) {
                    if (i103 == 4) {
                        return new hq3.p();
                    }
                    throw new AssertionError(i103);
                }
                jki.p pVar7 = (jki.p) l7Var7.f119217g.get();
                CreditApplicationCloseScreenContract$InputData creditApplicationCloseScreenContract$InputData7 = l7Var7.f119215b;
                j60.a aVar23 = (j60.a) ((w6) this.d).f120077g.get();
                c1 c1Var13 = this.f119848b;
                eq3.d dVar7 = (eq3.d) c1Var13.V1.get();
                dq3.a aVar24 = (dq3.a) c1Var13.W1.get();
                ow3.e eVar11 = (ow3.e) c1Var13.Y0.get();
                eq3.b bVar8 = (eq3.b) c1Var13.X1.get();
                ow3.i iVar7 = (ow3.i) c1Var13.Y1.get();
                mri.w wVarA7 = ((ozl.a) c1Var13.u).a();
                vc.s.j(wVarA7);
                return new hq3.o(pVar7, creditApplicationCloseScreenContract$InputData7, aVar23, dVar7, aVar24, eVar11, bVar8, iVar7, wVarA7, ((s41.a) c1Var13.f118485x).d(), (hw3.c) c1Var13.f118472s0.get());
        }
    }
}
