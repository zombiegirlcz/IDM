package ak5;

import a3e.u;
import android.app.Activity;
import android.content.Context;
import androidx.view.ComponentActivity;
import androidx.view.result.ActivityResultRegistry;
import ayh.o;
import ayh.p;
import b3j.t;
import b9.w2;
import blh.g0;
import com.google.common.collect.ImmutableSet;
import com.revolut.core.backend_flow.ui.BackendFlowContract$Configuration;
import com.revolut.feature.apm.bills.bpay.impl.data.network.bills.BPayBillService;
import com.revolut.feature.apm.bills.bpay.impl.flow.BPayFlowContract$InputData;
import com.revolut.feature.apm.bills.bpay.impl.screen.amount.AmountScreenContract$InputData;
import com.revolut.feature.corporate_events.impl.ui.screen.home.CorporateEventsHomeScreenContract$Input;
import com.revolut.feature.credit.forbearance.application.impl.ui.forbearance.questionnaire.ForbearanceApplicationQuestionnaireContract$Configuration;
import com.revolut.feature.insurance_pet.impl.ui.cancellation.feedback.CancellationFeedbackScreenContract$Configuration;
import com.revolut.feature.retail.savings.api.navigation.feature_config.SavingsKompotFeatureConfig$CapitalAtRiskScreen$InputData;
import com.revolut.feature.retail.savings.api.navigation.feature_config.SavingsKompotFeatureConfig$NextInterestPaymentDialogScreen$InputData;
import com.revolut.feature.retail.savings.api.navigation.feature_config.SavingsKompotFeatureConfig$SavingsReturnExampleScreen$InputData;
import com.revolut.feature.retail.savings.impl.ui.automations.SavingsAutomationsScreenContract$InputData;
import com.revolut.feature.retail.savings.impl.ui.common.dialogs.balance_summary.BalanceSummaryDialogScreenContract$InputData;
import com.revolut.feature.retail.savings.impl.ui.details.SavingsDetailsScreenContract$InputData;
import com.revolut.feature.retail.savings.impl.ui.fund_information.FundInfoControllerContract$InputData;
import com.revolut.feature.retail.savings.impl.ui.product_migration.ProductMigrationScreenContract$InputData;
import com.revolut.feature_crypto_order_details.api.navigation.CryptoOrderDetailsInputData;
import com.revolut.feature_crypto_order_details.impl.ui.details.CryptoOrderDetailsController;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import com.revolut.retail.feature.beneficiary.api.navigation.BeneficiaryCreationKompotInputData;
import com.revolut.retail.feature.beneficiary.impl.ui.bank_beneficiary_details.BankBeneficiaryDetailsScreenContract$InputData;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields.AccountFieldsScreenContract$InputData;
import f60.x;
import f60.y;
import f60.z;
import fo1.e0;
import g48.r0;
import h3j.a0;
import java.util.Collection;
import java.util.Optional;
import kotlin.jvm.internal.Intrinsics;
import mx4.a1;
import om4.k0;
import qgk.k3;
import qi3.r;
import r10.q;
import r10.w;
import sgm.e3;
import t80.e;
import t80.v;
import vc.s;
import vtc.p0;
import yc0.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f5683c;
    public final Object d;

    public /* synthetic */ f(Object obj2, Object obj3, int i, int i2) {
        this.f5681a = i2;
        this.f5683c = obj2;
        this.d = obj3;
        this.f5682b = i;
    }

    private final Object a() {
        ayh.b bVar = (ayh.b) this.f5683c;
        ayh.k kVar = (ayh.k) this.d;
        int i = this.f5682b;
        switch (i) {
            case 0:
                return p0.d(kVar.f11218a, (wxh.e) kVar.d.get(), (yxh.b) kVar.e.get(), (xxh.b) kVar.f.get());
            case 1:
                return new ayh.e(this);
            case 2:
                return new ayh.f(this);
            case 3:
                return new ayh.g(this);
            case 4:
                return new ayh.h(this, 0);
            case 5:
                ViewController view = kVar.f11219b;
                gyh.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(view, "view");
                CryptoOrderDetailsController cryptoOrderDetailsController = (CryptoOrderDetailsController) view;
                s.k(cryptoOrderDetailsController);
                return cryptoOrderDetailsController;
            case 6:
                return new ayh.i(this, 0);
            case 7:
                return new ayh.j(this, 0);
            case 8:
                return new uxh.e((uxh.i) kVar.f11222h.get(), (uxh.h) kVar.f11224l.get());
            case 9:
                mde.e eVarC = bVar.f11193a.c();
                fk3.a aVarA = bVar.f11196g.a();
                s.j(aVarA);
                return new uxh.g(eVarC, aVarA);
            case 10:
                CryptoOrderDetailsInputData cryptoOrderDetailsInputData = kVar.f11218a;
                ayh.b bVar2 = kVar.f11220c;
                u uVar = new u(new txh.b(new r2i.a()), new k18.c(new txh.b(new r2i.a()), bVar2.f11197h.a(), new r10.d(new d0i.j(), new a0i.d(bVar2.i.f275588c.b()), new hzh.a())));
                xua.a aVarA2 = bVar2.f11194b.a();
                s.j(aVarA2);
                ang.f fVarE = bVar2.f11198j.e();
                w0i.b bVarF = bVar2.e.f();
                whf.b bVarA = bVar2.k.a();
                s.j(bVarA);
                return new fyh.n(cryptoOrderDetailsInputData, uVar, new w2(aVarA2, fVarE, bVarF, bVarA, new anf.b(new j9l.a(), 1), new nva.a()), new w(new l4i.a(), bVar2.f11200m.a(), bVar2.f11201n.a()), new q(new r39.a(new l4i.a()), bVar2.f11200m.a(), new l4i.a(), bVar2.f11201n.a()));
            default:
                throw new AssertionError(i);
        }
    }

    private final Object b() {
        ayh.b bVar = (ayh.b) this.f5683c;
        p pVar = (p) this.d;
        int i = this.f5682b;
        switch (i) {
            case 0:
                return p0.d(pVar.f11233a, (wxh.e) pVar.d.get(), (yxh.b) pVar.e.get(), (xxh.b) pVar.f.get());
            case 1:
                return new ayh.m(this);
            case 2:
                return new ayh.n(this);
            case 3:
                return new o(this);
            case 4:
                return new ayh.h(this, 1);
            case 5:
                ViewController view = pVar.f11234b;
                gyh.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(view, "view");
                CryptoOrderDetailsController cryptoOrderDetailsController = (CryptoOrderDetailsController) view;
                s.k(cryptoOrderDetailsController);
                return cryptoOrderDetailsController;
            case 6:
                return new ayh.i(this, 1);
            case 7:
                return new ayh.j(this, 1);
            case 8:
                return new uxh.e((uxh.i) pVar.f11237h.get(), (uxh.h) pVar.f11239l.get());
            case 9:
                mde.e eVarC = bVar.f11193a.c();
                fk3.a aVarA = bVar.f11196g.a();
                s.j(aVarA);
                return new uxh.g(eVarC, aVarA);
            case 10:
                CryptoOrderDetailsInputData cryptoOrderDetailsInputData = pVar.f11233a;
                ayh.b bVar2 = pVar.f11235c;
                v0i.b bVar3 = bVar2.e;
                txh.b bVar4 = new txh.b(new r2i.a());
                v0i.b bVar5 = bVar2.e;
                u uVar = new u(bVar4, new k18.c(new txh.b(new r2i.a()), bVar2.f11197h.a(), new r10.d(new d0i.j(), new a0i.d(bVar2.i.f275588c.b()), new hzh.a())));
                xua.a aVarA2 = bVar2.f11194b.a();
                s.j(aVarA2);
                ang.f fVarE = bVar2.f11198j.e();
                w0i.b bVarF = bVar2.e.f();
                whf.b bVarA = bVar2.k.a();
                s.j(bVarA);
                w2 w2Var = new w2(aVarA2, fVarE, bVarF, bVarA, new anf.b(new j9l.a(), 1), new nva.a());
                j4i.a aVar = bVar2.f11199l;
                w wVar = new w(new l4i.a(), bVar2.f11200m.a(), bVar2.f11201n.a());
                j4i.a aVar2 = bVar2.f11199l;
                return new fyh.n(cryptoOrderDetailsInputData, uVar, w2Var, wVar, new q(new r39.a(new l4i.a()), bVar2.f11200m.a(), new l4i.a(), bVar2.f11201n.a()));
            default:
                throw new AssertionError(i);
        }
    }

    private final Object c() {
        b05.e eVar = (b05.e) this.f5683c;
        b05.b bVar = (b05.b) this.d;
        int i = this.f5682b;
        switch (i) {
            case 0:
                ypi.h hVar = bVar.f11557b;
                fsi.g gVar = bVar.f11556a;
                return new ypi.e(hVar, bq.i.b(gVar), bq.i.o(gVar), bq.i.g(gVar));
            case 1:
                return new hqi.f(bVar.f11558c, bq.i.b(bVar.f11556a));
            case 2:
                return kpi.f.a();
            case 3:
                Context contextI = bq.i.i(bVar.f11556a);
                BaseDelegatesActivity baseDelegatesActivityF = bq.i.f(bVar.f11556a);
                t70.g gVarO = eVar.f11592b.o();
                s.j(gVarO);
                return new npi.c(contextI, baseDelegatesActivityF, gVarO);
            case 4:
                return new tpi.i((rpi.c) bVar.f11561j.get(), gsi.c.a(bVar.f11556a));
            case 5:
                return new rpi.b(bq.i.b(bVar.f11556a));
            case 6:
                return new rpi.h(bq.i.b(bVar.f11556a));
            case 7:
                return new iri.g((iri.j) eVar.f11604n.get(), (iri.m) eVar.u.get(), bq.i.f(bVar.f11556a), bq.i.l(bVar.f11556a));
            case 8:
                return new iri.l((iri.m) eVar.u.get(), bq.i.f(bVar.f11556a), (iri.d) bVar.f11564n.get());
            case 9:
                return new iri.d(bq.i.f(bVar.f11556a));
            case 10:
                return new opi.b(bq.i.f(bVar.f11556a));
            case 11:
                return new qi3.l(bq.i.l(bVar.f11556a), (f9b.f) bVar.f11566q.get(), (r) eVar.q0.get(), (com.revolut.feature.chooser.c) eVar.f11610r0.get(), bVar.d, (ypi.i) bVar.f.get(), (hqi.l) bVar.f11559g.get(), (opi.d) bVar.f11565p.get(), (tpi.j) bVar.k.get(), bq.i.o(bVar.f11556a));
            case 12:
                return bq.i.t(bVar.f11556a);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object d() {
        b05.e eVar = (b05.e) this.f5683c;
        b05.d dVar = (b05.d) this.d;
        int i = this.f5682b;
        switch (i) {
            case 0:
                dVar.getClass();
                return new cn.d(ImmutableSet.copyOf((Collection) dn.b.a()), (cn.e) eVar.o.get(), eVar.h());
            case 1:
                um.c cVar = (um.c) eVar.f11607p.get();
                dVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(6);
                b05.e eVar2 = dVar.f11576g;
                hn.h hVar = (hn.h) eVar2.f11608q.get();
                t70.g gVarO = eVar2.f11592b.o();
                s.j(gVarO);
                builderBuilderWithExpectedSize.add(new jn.a(hVar, gVarO));
                builderBuilderWithExpectedSize.add(new vm.b(com.google.android.gms.internal.mlkit_vision_face.a.f()));
                builderBuilderWithExpectedSize.add(eVar2.k());
                builderBuilderWithExpectedSize.add(new xc0.a((qc0.j) eVar2.Z.get(), (qc0.h) eVar2.W.get()));
                builderBuilderWithExpectedSize.addAll((Iterable) in.g.a());
                builderBuilderWithExpectedSize.add(new jn.d(e4m.b.a(dVar.i)));
                return new in.e(cVar, builderBuilderWithExpectedSize.build(), eVar.h());
            case 2:
                return bq.i.t(dVar.f11573a);
            case 3:
                dVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize2 = ImmutableSet.builderWithExpectedSize(3);
                builderBuilderWithExpectedSize2.addAll((Iterable) kn.g.a());
                builderBuilderWithExpectedSize2.add(dVar.k.get());
                builderBuilderWithExpectedSize2.add(new kn.h(e4m.b.a(dVar.f11580m)));
                return new kn.e(builderBuilderWithExpectedSize2.build(), (ym.d) eVar.Q.get(), eVar.h());
            case 4:
                return new zm.a();
            case 5:
                return new tpi.i((rpi.c) dVar.f11579l.get(), gsi.c.a(dVar.f11573a));
            case 6:
                return new rpi.b(bq.i.b(dVar.f11573a));
            case 7:
                dVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize3 = ImmutableSet.builderWithExpectedSize(2);
                builderBuilderWithExpectedSize3.addAll((Iterable) hn.g.a());
                builderBuilderWithExpectedSize3.add(dVar.f11576g.k());
                return new hn.d(builderBuilderWithExpectedSize3.build(), (hn.h) eVar.f11608q.get(), (npi.f) dVar.o.get());
            case 8:
                Context contextI = bq.i.i(dVar.f11573a);
                BaseDelegatesActivity baseDelegatesActivityF = bq.i.f(dVar.f11573a);
                t70.g gVarO2 = eVar.f11592b.o();
                s.j(gVarO2);
                return new npi.c(contextI, baseDelegatesActivityF, gVarO2);
            case 9:
                b05.e eVar3 = dVar.f11576g;
                return new en.c(ImmutableSet.of((ln.d) eVar3.f11595d0.get(), (ln.d) eVar3.f11609r.get()), bq.i.l(dVar.f11573a));
            case 10:
                return new gn.c((lpi.e) dVar.f11584r.get(), (sm.e) eVar.f11596e0.get(), ImmutableSet.copyOf((Collection) gn.e.a()), eVar.h());
            case 11:
                return new lpi.b(bq.i.i(dVar.f11573a), bq.i.j(dVar.f11573a));
            case 12:
                dVar.getClass();
                return new in.e(ImmutableSet.copyOf((Collection) pm.b.a()), (om.c) eVar.f0.get(), eVar.h());
            case 13:
                dVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize4 = ImmutableSet.builderWithExpectedSize(2);
                builderBuilderWithExpectedSize4.addAll((Iterable) g3l.f.a());
                b05.e eVar4 = dVar.f11576g;
                builderBuilderWithExpectedSize4.add(new wc0.a((qc0.k) eVar4.f11611s.get(), ((s41.a) eVar4.f11598h).d(), (ln.a) eVar4.f11609r.get(), (qc0.j) eVar4.Z.get(), qw7.u.j(eVar4.e), eVar4.d()));
                return new g3l.c(builderBuilderWithExpectedSize4.build(), (g3l.g) eVar.g0.get(), (k3l.b) dVar.u.get(), eVar.h());
            case 14:
                return new k3l.d(bq.i.b(dVar.f11573a));
            case 15:
                ypi.h hVar2 = dVar.f11574b;
                fsi.g gVar = dVar.f11573a;
                return new ypi.e(hVar2, bq.i.b(gVar), bq.i.o(gVar), bq.i.g(gVar));
            case 16:
                return new hqi.f(dVar.f11575c, bq.i.b(dVar.f11573a));
            case 17:
                return new rpi.h(bq.i.b(dVar.f11573a));
            case 18:
                return new iri.g((iri.j) eVar.f11604n.get(), (iri.m) eVar.f11611s.get(), bq.i.f(dVar.f11573a), bq.i.l(dVar.f11573a));
            case 19:
                return new iri.l((iri.m) eVar.f11611s.get(), bq.i.f(dVar.f11573a), (iri.d) dVar.A.get());
            case 20:
                return new iri.d(bq.i.f(dVar.f11573a));
            case 21:
                return new an.q((cqi.h) dVar.C.get(), (an.a) eVar.f11599h0.get(), ImmutableSet.copyOf((Collection) bn.b.a()), eVar.h());
            case 22:
                return new cqi.j(bq.i.f(dVar.f11573a));
            case 23:
                return new xpi.c(dVar.d, bq.i.b(dVar.f11573a));
            case 24:
                return new com.revolut.retail.toast.mediator.a((d4l.a) eVar.i0.get(), (c4l.b) dVar.F.get());
            case 25:
                return new c4l.e(bq.i.i(dVar.f11573a), bq.i.g(dVar.f11573a));
            case 26:
                return new f5l.c((f5l.a) eVar.j0.get(), bq.i.b(dVar.f11573a));
            case 27:
                Activity activityB = bq.i.b(dVar.f11573a);
                y80.b bVar = new y80.b();
                g60.a aVar = (g60.a) dVar.I.get();
                fsi.g gVar2 = dVar.f11573a;
                Activity activityB2 = bq.i.b(gVar2);
                t80.g gVar3 = (t80.g) dVar.J.get();
                BaseDelegatesActivity baseDelegatesActivityF2 = bq.i.f(gVar2);
                d4m.a aVarA = e4m.b.a(dVar.K);
                nli.a aVarG = dVar.g();
                t80.g gVar4 = (t80.g) dVar.J.get();
                l70.e eVar5 = dVar.f11576g.f11592b;
                zk0.b bVarL = eVar5.l();
                s.j(bVarL);
                oli.c cVar2 = new oli.c(gVar4, bVarL, dVar.g(), (g60.a) dVar.I.get(), dVar.h());
                ComponentActivity componentActivityA = gmf.b.a(gVar2);
                ActivityResultRegistry activityResultRegistryA = pli.b.a(gmf.b.a(gVar2));
                ami.n nVar = new ami.n(e4m.b.a(dVar.L), 1);
                d4m.a aVarA2 = e4m.b.a(dVar.K);
                t80.g gVar5 = (t80.g) dVar.J.get();
                nli.a aVarG2 = dVar.g();
                i90.b bVar2 = new i90.b();
                z70.a aVarF = eVar5.f();
                s.j(aVarF);
                c70.b bVar3 = new c70.b(aVarF, 2);
                z70.a aVarF2 = eVar5.f();
                s.j(aVarF2);
                return new upi.b(activityB, bVar, new v(aVar, activityB2, gVar3, baseDelegatesActivityF2, aVarA, aVarG, cVar2, new oli.g(componentActivityA, activityResultRegistryA, nVar, aVarA2, gVar5, aVarG2, bVar2, new u96.b(bVar3, new smd.s(aVarF2)), dVar.h()), dVar.h()));
            case 28:
                return new g60.a(bq.i.b(dVar.f11573a));
            case 29:
                l70.e eVar6 = eVar.f11592b;
                l70.e eVar7 = eVar.f11592b;
                f80.a aVarX = eVar6.x();
                s.j(aVarX);
                l80.e eVarH = eVar7.h();
                s.j(eVarH);
                zk0.b bVarL2 = eVar7.l();
                s.j(bVarL2);
                return new t80.b(aVarX, eVarH, bVarL2);
            case 30:
                return pli.c.a(new ks0.n(bq.i.f(dVar.f11573a)));
            case 31:
                return t96.a.a();
            case 32:
                return new aqi.d(bq.i.b(dVar.f11573a), new y80.b());
            case 33:
                return new iqi.b(dVar.e, bq.i.b(dVar.f11573a));
            case 34:
                return new opi.b(bq.i.f(dVar.f11573a));
            case 35:
                ForbearanceApplicationQuestionnaireContract$Configuration config = dVar.f;
                d05.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(config, "config");
                BackendFlowContract$Configuration backendFlowContract$Configuration = config.f69944a;
                s.k(backendFlowContract$Configuration);
                return backendFlowContract$Configuration;
            case 36:
                x90.c cVar3 = eVar.d;
                yc0.q qVar = new yc0.q(dVar.e());
                yc0.r rVar = (yc0.r) dVar.R.get();
                ad0.c cVar4 = (ad0.c) dVar.S.get();
                ad0.w wVarG = eVar.k.g();
                s.j(wVarG);
                f0 f0Var = (f0) dVar.T.get();
                ad0.h hVar3 = (ad0.h) dVar.U.get();
                ad0.n nVarF = dVar.f();
                u9l.a aVarB = eVar.f11600j.b();
                s.j(aVarB);
                return wpg.v.o(cVar3, qVar, rVar, cVar4, wVarG, f0Var, hVar3, nVarF, aVarB);
            case 37:
                return wpg.v.n(eVar.d, dVar.e(), new yc0.p());
            case 38:
                x90.c cVar5 = eVar.d;
                return new ad0.d();
            case 39:
                x90.c cVar6 = eVar.d;
                hbl.d dVarC = eVar.f11600j.c();
                s.j(dVarC);
                return wpg.v.y(cVar6, dVarC);
            case 40:
                return wpg.v.a(eVar.d, dVar.f());
            case 41:
                return wpg.v.w(eVar.d, (yc0.r) dVar.R.get(), new yc0.p());
            case 42:
                return new ae7.i((upi.f) dVar.M.get(), (t80.c) eVar.f11601k0.get(), (d4l.a) eVar.i0.get(), (aqi.a) dVar.X.get(), new ae7.j(), bq.i.l(dVar.f11573a));
            case 43:
                return aqi.f.a(dVar.f11573a, (aqi.d) dVar.N.get());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object e() {
        b1l.b bVar = (b1l.b) this.f5683c;
        b1l.a aVar = (b1l.a) this.d;
        int i = this.f5682b;
        switch (i) {
            case 0:
                return kpi.f.a();
            case 1:
                Context contextI = bq.i.i(aVar.f11808a);
                BaseDelegatesActivity baseDelegatesActivityF = bq.i.f(aVar.f11808a);
                t70.g gVarO = bVar.f11826b.o();
                s.j(gVarO);
                return new npi.c(contextI, baseDelegatesActivityF, gVarO);
            case 2:
                return new tpi.i((rpi.c) aVar.f.get(), gsi.c.a(aVar.f11808a));
            case 3:
                return new rpi.b(bq.i.b(aVar.f11808a));
            case 4:
                return new rpi.h(bq.i.b(aVar.f11808a));
            case 5:
                return new iri.g((iri.j) bVar.f11830j.get(), (iri.m) bVar.k.get(), bq.i.f(aVar.f11808a), bq.i.l(aVar.f11808a));
            case 6:
                return new iri.l((iri.m) bVar.k.get(), bq.i.f(aVar.f11808a), (iri.d) aVar.f11813j.get());
            case 7:
                return new iri.d(bq.i.f(aVar.f11808a));
            case 8:
                return new opi.b(bq.i.f(aVar.f11808a));
            case 9:
                return new en.c(ImmutableSet.of((ln.d) aVar.f11810c.f11831l.get()), bq.i.l(aVar.f11808a));
            case 10:
                aVar.getClass();
                return new cn.d(ImmutableSet.copyOf((Collection) dn.b.a()), (cn.e) bVar.f11832m.get(), bVar.d());
            case 11:
                um.c cVar = (um.c) bVar.f11833n.get();
                aVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(6);
                b1l.b bVar2 = aVar.f11810c;
                hn.h hVar = (hn.h) bVar2.o.get();
                t70.g gVarO2 = bVar2.f11826b.o();
                s.j(gVarO2);
                builderBuilderWithExpectedSize.add(new jn.a(hVar, gVarO2));
                builderBuilderWithExpectedSize.add(new vm.b(com.google.android.gms.internal.mlkit_vision_face.a.f()));
                builderBuilderWithExpectedSize.add(bVar2.k());
                builderBuilderWithExpectedSize.add(bVar2.f11835q.get());
                builderBuilderWithExpectedSize.addAll((Iterable) in.g.a());
                builderBuilderWithExpectedSize.add(new jn.d(e4m.b.a(aVar.o)));
                return new in.e(cVar, builderBuilderWithExpectedSize.build(), bVar.d());
            case 12:
                return bq.i.t(aVar.f11808a);
            case 13:
                aVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize2 = ImmutableSet.builderWithExpectedSize(3);
                builderBuilderWithExpectedSize2.addAll((Iterable) kn.g.a());
                builderBuilderWithExpectedSize2.add(aVar.f11818q.get());
                builderBuilderWithExpectedSize2.add(new kn.h(e4m.b.a(aVar.f11811g)));
                return new kn.e(builderBuilderWithExpectedSize2.build(), (ym.d) bVar.f11836r.get(), bVar.d());
            case 14:
                return new zm.a();
            case 15:
                aVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize3 = ImmutableSet.builderWithExpectedSize(2);
                builderBuilderWithExpectedSize3.addAll((Iterable) hn.g.a());
                builderBuilderWithExpectedSize3.add(aVar.f11810c.k());
                return new hn.d(builderBuilderWithExpectedSize3.build(), (hn.h) bVar.o.get(), (npi.f) aVar.e.get());
            case 16:
                return new gn.c((lpi.e) aVar.f11821t.get(), (sm.e) bVar.v.get(), ImmutableSet.copyOf((Collection) gn.e.a()), bVar.d());
            case 17:
                return new lpi.b(bq.i.i(aVar.f11808a), bq.i.j(aVar.f11808a));
            case 18:
                aVar.getClass();
                return new in.e(ImmutableSet.copyOf((Collection) pm.b.a()), (om.c) bVar.f11839w.get(), bVar.d());
            case 19:
                aVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize4 = ImmutableSet.builderWithExpectedSize(2);
                builderBuilderWithExpectedSize4.addAll((Iterable) g3l.f.a());
                return new g3l.c(j6.a.g(aVar.f11810c.f11835q, builderBuilderWithExpectedSize4), (g3l.g) bVar.f11834p.get(), (k3l.b) aVar.f11822w.get(), bVar.d());
            case 20:
                return new k3l.d(bq.i.b(aVar.f11808a));
            case 21:
                return new a1l.d((y0l.b) bVar.f11840x.get(), aVar.f11809b, (y0l.f) bVar.f11841y.get());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object f() {
        t tVar = (t) this.f5683c;
        b3j.q qVar = (b3j.q) this.d;
        int i = this.f5682b;
        switch (i) {
            case 0:
                return f0k.d.p((e60.a) qVar.f12078l.get());
            case 1:
                com.revolut.kompot.navigable.a aVar = (com.revolut.kompot.navigable.a) qVar.d.get();
                g60.a aVarA = f60.v.a((com.revolut.kompot.navigable.a) qVar.d.get());
                Activity activityA = f60.t.a((com.revolut.kompot.navigable.a) qVar.d.get());
                t80.g gVar = (t80.g) qVar.e.get();
                com.revolut.kompot.navigable.a aVar2 = (com.revolut.kompot.navigable.a) qVar.d.get();
                y.a(aVar2);
                d4m.a aVarA2 = e4m.b.a(qVar.f);
                nli.a aVar3 = new nli.a((t80.c) qVar.f12075g.get(), f60.t.a((com.revolut.kompot.navigable.a) qVar.d.get()));
                t80.g gVar2 = (t80.g) qVar.e.get();
                zk0.b bVarL = qVar.f12073b.k.l();
                s.j(bVarL);
                return v1.c.q(aVar, new v(aVarA, activityA, gVar, aVar2, aVarA2, aVar3, new oli.c(gVar2, bVarL, new nli.a((t80.c) qVar.f12075g.get(), f60.t.a((com.revolut.kompot.navigable.a) qVar.d.get())), f60.v.a((com.revolut.kompot.navigable.a) qVar.d.get()), qVar.A()), new oli.g(f60.u.a(f60.t.a((com.revolut.kompot.navigable.a) qVar.d.get())), v1.c.e((com.revolut.kompot.navigable.a) qVar.d.get()), new ami.n(e4m.b.a(qVar.f12076h), 1), e4m.b.a(qVar.f), (t80.g) qVar.e.get(), new nli.a((t80.c) qVar.f12075g.get(), f60.t.a((com.revolut.kompot.navigable.a) qVar.d.get())), new i90.b(), qVar.c(), qVar.A()), qVar.A()), x.a(), (rp0.m) qVar.i.get(), (e60.t) qVar.k.get());
            case 2:
                f80.a aVarX = tVar.k.x();
                s.j(aVarX);
                return new t80.x(aVarX, new i90.b());
            case 3:
                com.revolut.kompot.navigable.a aVar4 = (com.revolut.kompot.navigable.a) qVar.d.get();
                y.a(aVar4);
                return pli.c.a(new ks0.n(aVar4));
            case 4:
                ll9.b payWithPhotoExtensionFactory = ((fl9.a) tVar.f12104p).a();
                f4j.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(payWithPhotoExtensionFactory, "payWithPhotoExtensionFactory");
                return new t80.c(new e.a("pay_with_photo"), 20971520L);
            case 5:
                return t96.a.a();
            case 6:
                return z.a();
            case 7:
                aii.o oVar = (aii.o) qVar.f12077j.get();
                y80.a aVarR = tVar.k.r();
                s.j(aVarR);
                return new e60.y(oVar, aVarR, qVar.c(), Optional.empty());
            case 8:
                n60.a aVar5 = (n60.a) qVar.f12080n.get();
                o5k.i.l(aVar5);
                return aVar5;
            case 9:
                return o5k.i.q((com.revolut.kompot.navigable.a) qVar.d.get());
            case 10:
                al9.a extension = (al9.a) qVar.f12081p.get();
                f4j.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension, "extension");
                s.k(extension);
                return extension;
            case 11:
                ll9.b payWithPhotoExtensionFactory2 = ((fl9.a) tVar.f12104p).a();
                e60.a mediaPickerControllerExtension = (e60.a) qVar.f12078l.get();
                f4j.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(payWithPhotoExtensionFactory2, "payWithPhotoExtensionFactory");
                Intrinsics.checkNotNullParameter(mediaPickerControllerExtension, "mediaPickerControllerExtension");
                return payWithPhotoExtensionFactory2.a(mediaPickerControllerExtension);
            case 12:
                e60.t tVar2 = (e60.t) qVar.k.get();
                f60.w.a(tVar2);
                return tVar2;
            case 13:
                Object extension2 = (g4j.a) qVar.f12084s.get();
                o4j.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension2, "extension");
                yji.n nVar = (yji.n) extension2;
                s.k(nVar);
                return nVar;
            case 14:
                return new g4j.b(new h4j.b());
            case 15:
                s4j.a aVar6 = new s4j.a();
                n4j.h hVarQ = qVar.q();
                t tVar3 = qVar.f12073b;
                return new y3j.b(aVar6, hVarQ, qVar.y(), new z3j.b(new usc.a((dnm.a) tVar3.v.get())), qVar.b(), new n4j.c(), new y3j.c(new usc.a((dnm.a) tVar3.v.get())));
            case 16:
                vy9.f factory = (vy9.f) tVar.f12105q.f293275q.get();
                s.j(factory);
                f4j.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory, "factory");
                return new bz9.a(factory.f293284a, factory.f293285b, factory.f293286c);
            case 17:
                g2e.t tVarD = qVar.D();
                AccountFieldsScreenContract$InputData accountFieldsScreenContract$InputData = qVar.f12072a;
                t tVar4 = qVar.f12073b;
                p3j.b bVar = new p3j.b(new b4j.b(tVarD, qVar.B(), qVar.q(), qVar.j(), b3j.q.s()), new b4j.e(qVar.D(), qVar.B(), qVar.q(), new n4j.c()), new b4j.i(qVar.D(), qVar.B(), qVar.q(), qVar.j(), new n4j.c()), new b4j.k(qVar.D(), qVar.B(), qVar.q(), new n4j.c(), b3j.q.s()), new b4j.m(qVar.D(), qVar.B(), qVar.q(), new n4j.c(), b3j.q.s()), new b4j.c(new b4j.b(qVar.D(), qVar.B(), qVar.q(), qVar.j(), b3j.q.s()), new b4j.k(qVar.D(), qVar.B(), qVar.q(), new n4j.c(), b3j.q.s())), new b4j.g(tVar4.f12103n.e(), 0));
                z2j.c cVar = new z2j.c(new z2j.a());
                d3j.b bVarE = ((b3j.p) tVar4.d).e();
                n8b.b bVarB = tVar4.f12106r.b();
                s.j(bVarB);
                n4j.i iVar = new n4j.i(cVar, new n4j.f(bVarE, bVarB), new p4j.b(new z2j.c(new z2j.a()), new s4j.a(), new n4j.c()));
                t3j.c cVarB = qVar.b();
                u3j.b bVar2 = new u3j.b(qVar.D(), qVar.q(), qVar.j(), new n4j.c(), new u3j.c());
                e3 e3Var = new e3(qVar.q(), new x3j.b());
                s3j.d dVar = new s3j.d(qVar.D(), qVar.q(), qVar.j(), new s3j.e(), new n4j.c());
                n4j.h definitionTransformer = qVar.q();
                n4j.j searchListSelectionUtils = new n4j.j();
                Intrinsics.checkNotNullParameter(definitionTransformer, "definitionTransformer");
                Intrinsics.checkNotNullParameter(searchListSelectionUtils, "searchListSelectionUtils");
                v3j.b bVar3 = new v3j.b();
                w3j.b bVar4 = new w3j.b(qVar.D(), qVar.q(), qVar.j(), new n4j.c(), new w3j.c());
                n4j.h definitionTransformer2 = qVar.q();
                Intrinsics.checkNotNullParameter(definitionTransformer2, "definitionTransformer");
                v3j.a aVar7 = new v3j.a();
                y3j.b bVar5 = (y3j.b) qVar.u.get();
                a4j.a aVar8 = new a4j.a(new s4j.a(), qVar.q(), qVar.y(), new n4j.c());
                ldd.b bVar6 = (ldd.b) qVar.f12086w.get();
                q3j.c cVar2 = new q3j.c(((b3j.p) tVar4.d).a(), new q3j.e());
                n60.a aVar9 = (n60.a) qVar.f12080n.get();
                g4j.a aVar10 = (g4j.a) qVar.f12084s.get();
                t2j.a aVar11 = tVar4.d;
                d4j.c cVar3 = new d4j.c(((b3j.p) aVar11).h(), new d4j.b(((b3j.p) aVar11).a(), accountFieldsScreenContract$InputData));
                q3j.h hVar = new q3j.h(new q3j.e());
                al9.a aVar12 = (al9.a) qVar.f12081p.get();
                ry9.a aVar13 = (ry9.a) qVar.v.get();
                r3j.a aVar14 = new r3j.a(qVar.b(), b3j.q.s());
                j4j.f fVar = new j4j.f(accountFieldsScreenContract$InputData);
                n8b.b bVarB2 = tVar4.f12106r.b();
                s.j(bVarB2);
                h30.q qVar2 = new h30.q(fVar, new j4j.h(bVarB2), new j4j.i(), new j4j.j(), new j4j.l(), new p4j.a(new q4j.a(new s4j.a(), (ldd.b) qVar.f12086w.get(), new q4j.b(), new ogm.i(new z2j.c(new z2j.a()), new q4j.c()), new nd.l(new q4j.c(), new n4j.c()), new nd.k(new q4j.c())), new p4j.b(new z2j.c(new z2j.a()), new s4j.a(), new n4j.c()), new p4j.c(new z2j.c(new z2j.a()), new s4j.a(), new n4j.c()), new m3j.o()), new j4j.c(accountFieldsScreenContract$InputData));
                n4j.c cVar4 = new n4j.c();
                fl9.a aVar15 = (fl9.a) tVar4.f12104p;
                gte.a aVarB = aVar15.e.b();
                s.j(aVarB);
                j4j.k kVar = new j4j.k(accountFieldsScreenContract$InputData, cVar4, new j4j.b(accountFieldsScreenContract$InputData, new dl9.c(new zq.a(aVarB, aVar15.f.a()))));
                jul.o oVar2 = new jul.o(new fnc.s(new n4j.a(new n4j.c())), new k4j.a(accountFieldsScreenContract$InputData, new n4j.c()));
                ty9.b bVarC = tVar4.f12105q.c();
                s.j(bVarC);
                return new com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields.d(bVar, iVar, cVarB, bVar2, e3Var, dVar, bVar3, bVar4, aVar7, bVar5, aVar8, bVar6, cVar2, aVar9, aVar10, accountFieldsScreenContract$InputData, cVar3, hVar, aVar12, aVar13, aVar14, new cq9.m(qVar2, kVar, oVar2, bVarC));
            case 18:
                kdd.b bVar7 = tVar.f12107s;
                ldd.a factory2 = new ldd.a();
                f4j.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory2, "factory");
                return new ldd.b();
            case 19:
                return new r4j.c(new z2j.k());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object g() {
        t tVar = (t) this.f5683c;
        b3j.r rVar = (b3j.r) this.d;
        t tVar2 = rVar.f12090b;
        int i = this.f5682b;
        if (i == 0) {
            d2a.a model = (d2a.a) rVar.f12091c.get();
            i3j.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(model, "model");
            s.k(model);
            return model;
        }
        if (i == 1) {
            p2a.a factory = tVar.f12096b.a();
            s.j(factory);
            i3j.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(factory, "factory");
            return factory.a();
        }
        if (i != 2) {
            throw new AssertionError(i);
        }
        c21.e eVar = tVar2.f12097c;
        t2j.a aVar = tVar2.d;
        o71.a aVarA = ((c21.b) eVar).a();
        b3j.p pVar = (b3j.p) aVar;
        ay9.b bVar = (ay9.b) pVar.f12066b.i.get();
        s.j(bVar);
        d3j.d dVar = new d3j.d(bVar);
        kak.a aVarA2 = tVar2.e.a();
        whf.b bVarA = tVar2.f.a();
        s.j(bVarA);
        r10.a aVar2 = new r10.a(new b6k.f(tVar2.f12098g.b(), tVar2.f12099h.a(), new j9l.a()), new b6k.d());
        wif.a aVarA3 = tVar2.i.a();
        gte.a aVarB = pVar.e.b();
        s.j(aVarB);
        h3j.f0 f0Var = new h3j.f0(aVarA, dVar, aVarA2, bVarA, aVar2, aVarA3, new z2j.f(aVarB));
        zof.f fVarD = tVar.f12100j.d();
        s.j(fVarD);
        BankBeneficiaryDetailsScreenContract$InputData bankBeneficiaryDetailsScreenContract$InputData = rVar.f12089a;
        h3j.y yVar = new h3j.y();
        d2a.a aVar3 = (d2a.a) rVar.f12091c.get();
        m3j.j jVarD = b3j.p.d();
        b6k.c cVar = new b6k.c();
        yof.a aVarA4 = tVar2.f12100j.a();
        s.j(aVarA4);
        m3j.h hVarB = ((b3j.p) tVar2.d).b();
        qd0.b bVarN = tVar2.k.n();
        s.j(bVarN);
        r2a.b bVar2 = new r2a.b();
        whf.n nVarB = tVar2.f.b();
        s.j(nVarB);
        return new com.revolut.retail.feature.beneficiary.impl.ui.bank_beneficiary_details.b(f0Var, fVarD, bankBeneficiaryDetailsScreenContract$InputData, yVar, aVar3, new h3j.x(jVarD, new a0(cVar, aVarA4, hVarB, bVarN, bVar2, nVarB)));
    }

    private final Object h() {
        t tVar = (t) this.f5683c;
        t2j.a aVar = tVar.d;
        b3j.s sVar = (b3j.s) this.d;
        t tVar2 = sVar.f12093b;
        BeneficiaryCreationKompotInputData beneficiaryCreationKompotInputData = sVar.f12092a;
        int i = this.f5682b;
        if (i == 0) {
            Object extension = (y4j.a) sVar.d.get();
            x4j.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(extension, "extension");
            yji.n nVar = (yji.n) extension;
            s.k(nVar);
            return nVar;
        }
        if (i == 1) {
            a5j.b bVar = new a5j.b();
            l3j.a aVar2 = (l3j.a) ((b3j.p) aVar).f12070j.get();
            s.j(aVar2);
            return new y4j.c(beneficiaryCreationKompotInputData, bVar, aVar2, (x2j.c) sVar.f12094c.get());
        }
        if (i == 2) {
            return new z2j.g(((b3j.p) aVar).e(), new x2k.e());
        }
        if (i != 3) {
            throw new AssertionError(i);
        }
        t2j.a aVar3 = tVar2.d;
        v4j.e eVar = new v4j.e(((b3j.p) aVar3).e(), sVar.b(), new w4j.a(new w4j.d(new n4j.c()), new w4j.b(), beneficiaryCreationKompotInputData), new su9.c(beneficiaryCreationKompotInputData, ((b3j.p) aVar3).e(), new a5j.b()));
        v4j.i iVar = new v4j.i(sVar.b(), new a5j.b());
        wu2.a aVar4 = (wu2.a) tVar2.f12102m.d.get();
        s.j(aVar4);
        v4j.g gVar = new v4j.g(aVar4, sVar.b(), new n4j.c());
        rul.e eVar2 = new rul.e(((b3j.p) tVar2.d).e(), new w4j.a(new w4j.d(new n4j.c()), new w4j.b(), beneficiaryCreationKompotInputData));
        g6d.a copEligibilityChecker = new g6d.a();
        Intrinsics.checkNotNullParameter(copEligibilityChecker, "copEligibilityChecker");
        z4j.c copDialogProvider = new z4j.c();
        Intrinsics.checkNotNullParameter(copDialogProvider, "copDialogProvider");
        z4j.e eVar3 = new z4j.e();
        a5j.b bVar2 = new a5j.b();
        y4j.a aVar5 = (y4j.a) sVar.d.get();
        ang.f fVarE = tVar.f12103n.e();
        kz9.a aVarA = tVar.o.a();
        s.j(aVarA);
        return new com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.flow.f(eVar, iVar, gVar, eVar2, eVar3, bVar2, aVar5, fVarE, beneficiaryCreationKompotInputData, aVarA);
    }

    private final Object i() {
        b6b.o oVar = (b6b.o) this.f5683c;
        b6b.i iVar = (b6b.i) this.d;
        int i = this.f5682b;
        if (i != 0) {
            if (i == 1) {
                return new s6b.n(new w6b.e(), new w6b.f(), new w6b.b(), new r6b.a(new nd7.d(new nd7.c())));
            }
            throw new AssertionError(i);
        }
        cli.n nVar = (cli.n) iVar.f12617a.get();
        c6b.a aVar = (c6b.a) oVar.f12651b.J.get();
        s.j(aVar);
        return new s6b.m(nVar, aVar, ((s41.a) oVar.f12653g).d());
    }

    @Override // phm.a
    public final Object get() {
        switch (this.f5681a) {
            case 0:
                g gVar = (g) this.d;
                i iVar = (i) this.f5683c;
                int i = this.f5682b;
                if (i != 0) {
                    if (i == 1) {
                        return new uk5.i((uj5.a) iVar.f5694j.get(), (ik5.d) iVar.i.get());
                    }
                    throw new AssertionError(i);
                }
                cli.n nVar = (cli.n) gVar.f5685b.get();
                tk5.j jVar = gVar.f5684a;
                sd5.c cVarA = iVar.f5690b.a();
                s.j(cVarA);
                return new uk5.d(nVar, jVar, cVarA);
            case 1:
                anb.n nVar2 = (anb.n) this.f5683c;
                anb.s sVar = nVar2.i;
                int i2 = this.f5682b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        return new rob.p(new dcd.b());
                    }
                    throw new AssertionError(i2);
                }
                djb.n nVarA = sVar.a();
                s.j(nVarA);
                djb.u uVarD = sVar.d();
                s.j(uVarD);
                xqe.b bVarA = nVar2.f6678y.a();
                s.j(bVarA);
                anb.b bVar = (anb.b) this.d;
                return new rob.l(nVarA, uVarD, bVarA, bVar.f6621a, (cli.n) bVar.f6622b.get());
            case 2:
                anb.n nVar3 = (anb.n) this.f5683c;
                anb.c cVar = (anb.c) this.d;
                int i3 = this.f5682b;
                if (i3 != 0) {
                    if (i3 == 1) {
                        return new sob.h();
                    }
                    throw new AssertionError(i3);
                }
                cli.n nVar4 = (cli.n) cVar.f6626c.get();
                BalanceSummaryDialogScreenContract$InputData balanceSummaryDialogScreenContract$InputData = cVar.f6624a;
                rnb.w wVarB = nVar3.f6664c.b();
                s.j(wVarB);
                anb.n nVar5 = cVar.f6625b;
                ppk.f fVarA = nVar5.D.a();
                com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) nVar5.f6673r).c();
                s.j(aVarC);
                l80.e eVarH = nVar5.f6665g.h();
                s.j(eVarH);
                lqg.a aVar = new lqg.a();
                djb.q qVarC = nVar5.i.c();
                s.j(qVarC);
                rnb.r rVar = new rnb.r(fVarA, aVarC, eVarH, aVar, qVarC);
                l80.e eVarH2 = nVar3.f6665g.h();
                s.j(eVarH2);
                return new sob.g(nVar4, balanceSummaryDialogScreenContract$InputData, wVarB, rVar, eVarH2);
            case 3:
                anb.d dVar = (anb.d) this.d;
                anb.n nVar6 = (anb.n) this.f5683c;
                int i5 = this.f5682b;
                if (i5 != 0) {
                    if (i5 == 1) {
                        return new tob.j();
                    }
                    throw new AssertionError(i5);
                }
                cli.n nVar7 = (cli.n) dVar.f6630b.get();
                SavingsKompotFeatureConfig$CapitalAtRiskScreen$InputData savingsKompotFeatureConfig$CapitalAtRiskScreen$InputData = dVar.f6629a;
                ijb.a aVarG = ((blb.e) nVar6.f6663b).g();
                s.j(aVarG);
                f80.a aVarX = nVar6.f6665g.x();
                s.j(aVarX);
                return new tob.i(nVar7, savingsKompotFeatureConfig$CapitalAtRiskScreen$InputData, aVarG, aVarX, ((s41.a) nVar6.o).d());
            case 4:
                anb.e eVar = (anb.e) this.d;
                int i6 = this.f5682b;
                if (i6 != 0) {
                    if (i6 == 1) {
                        return new epb.h();
                    }
                    throw new AssertionError(i6);
                }
                FundInfoControllerContract$InputData fundInfoControllerContract$InputData = eVar.f6632a;
                ijb.a aVarG2 = ((blb.e) ((anb.n) this.f5683c).f6663b).g();
                s.j(aVarG2);
                return new epb.j(fundInfoControllerContract$InputData, aVarG2, (cli.n) eVar.f6633b.get());
            case 5:
                tib.b bVar2 = ((anb.n) this.f5683c).f6663b;
                anb.g gVar2 = (anb.g) this.d;
                int i21 = this.f5682b;
                if (i21 == 0) {
                    return kxa.j.j((j60.a) gVar2.d.get());
                }
                if (i21 == 1) {
                    return v1.c.r((com.revolut.kompot.navigable.a) gVar2.f6639b.get(), (rp0.m) gVar2.f6640c.get());
                }
                if (i21 == 2) {
                    return new rp0.m();
                }
                if (i21 == 3) {
                    j60.a aVar2 = (j60.a) gVar2.f.get();
                    skb.f fVarB = ((blb.e) bVar2).b();
                    ijb.a aVarG3 = ((blb.e) bVar2).g();
                    s.j(aVarG3);
                    return new gpb.o(aVar2, fVarB, aVarG3, gVar2.f6638a, (cli.n) gVar2.f6641g.get());
                }
                if (i21 != 4) {
                    if (i21 == 5) {
                        return new gpb.q(new dcd.b());
                    }
                    throw new AssertionError(i21);
                }
                j60.a bottomExpandableDialogEmbeddedControllerExtension = (j60.a) gVar2.d.get();
                hpb.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(bottomExpandableDialogEmbeddedControllerExtension, "bottomExpandableDialogEmbeddedControllerExtension");
                s.k(bottomExpandableDialogEmbeddedControllerExtension);
                return bottomExpandableDialogEmbeddedControllerExtension;
            case 6:
                anb.h hVar = (anb.h) this.d;
                anb.n nVar8 = (anb.n) this.f5683c;
                int i22 = this.f5682b;
                if (i22 != 0) {
                    if (i22 == 1) {
                        return new uob.m();
                    }
                    throw new AssertionError(i22);
                }
                SavingsKompotFeatureConfig$NextInterestPaymentDialogScreen$InputData savingsKompotFeatureConfig$NextInterestPaymentDialogScreen$InputData = hVar.f6643a;
                ijb.a aVarG4 = ((blb.e) nVar8.f6663b).g();
                s.j(aVarG4);
                rnb.w wVarB2 = nVar8.f6664c.b();
                s.j(wVarB2);
                return new uob.k(savingsKompotFeatureConfig$NextInterestPaymentDialogScreen$InputData, aVarG4, wVarB2, (mjb.a) nVar8.H.get(), (cli.n) hVar.f6644b.get());
            case 7:
                anb.n nVar9 = (anb.n) this.f5683c;
                tib.b bVar3 = nVar9.f6663b;
                anb.j jVar2 = (anb.j) this.d;
                int i32 = this.f5682b;
                if (i32 == 0) {
                    clb.c extension = (clb.c) jVar2.f6650b.get();
                    lpb.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(extension, "extension");
                    s.k(extension);
                    return extension;
                }
                if (i32 == 1) {
                    dkk.a0 savingsErrorHandlingApiFactory = ((blb.e) bVar3).d();
                    lpb.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(savingsErrorHandlingApiFactory, "savingsErrorHandlingApiFactory");
                    return savingsErrorHandlingApiFactory.a();
                }
                if (i32 == 2) {
                    ProductMigrationScreenContract$InputData productMigrationScreenContract$InputData = jVar2.f6649a;
                    ijb.a aVarG5 = ((blb.e) bVar3).g();
                    s.j(aVarG5);
                    return new kpb.l(productMigrationScreenContract$InputData, aVarG5, (mpg.a) jVar2.d.get(), (clb.c) jVar2.f6650b.get(), (cli.n) jVar2.e.get());
                }
                if (i32 != 3) {
                    if (i32 == 4) {
                        return new kpb.j();
                    }
                    throw new AssertionError(i32);
                }
                pre.c cVarA2 = ((wpg.l) nVar9.f6674s).u.a();
                s.j(cVarA2);
                g0 provider = bjf.f.l(cVarA2);
                lpb.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(provider, "provider");
                return new arg.d((pre.c) provider.f16654b);
            case 8:
                anb.n nVar10 = (anb.n) this.f5683c;
                anb.k kVar = (anb.k) this.d;
                int i33 = this.f5682b;
                if (i33 == 0) {
                    return kxa.j.j((j60.a) kVar.d.get());
                }
                if (i33 == 1) {
                    return v1.c.r((com.revolut.kompot.navigable.a) kVar.f6653b.get(), (rp0.m) kVar.f6654c.get());
                }
                if (i33 == 2) {
                    return new rp0.m();
                }
                if (i33 == 3) {
                    ijb.a aVarG6 = ((blb.e) nVar10.f6663b).g();
                    s.j(aVarG6);
                    j60.a aVar3 = (j60.a) kVar.f.get();
                    mre.c cVarB = nVar10.f6671p.b();
                    s.j(cVarB);
                    f80.a aVarX2 = nVar10.f6665g.x();
                    s.j(aVarX2);
                    return new ipb.k(aVarG6, aVar3, cVarB, aVarX2, ((s41.a) nVar10.o).d(), kVar.f6652a, (cli.n) kVar.f6655g.get());
                }
                if (i33 != 4) {
                    if (i33 == 5) {
                        return new ipb.l();
                    }
                    throw new AssertionError(i33);
                }
                j60.a bottomExpandableDialogEmbeddedControllerExtension2 = (j60.a) kVar.d.get();
                jpb.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(bottomExpandableDialogEmbeddedControllerExtension2, "bottomExpandableDialogEmbeddedControllerExtension");
                s.k(bottomExpandableDialogEmbeddedControllerExtension2);
                return bottomExpandableDialogEmbeddedControllerExtension2;
            case 9:
                anb.n nVar11 = (anb.n) this.f5683c;
                anb.l lVar = (anb.l) this.d;
                int i43 = this.f5682b;
                if (i43 == 0) {
                    clb.c extension2 = (clb.c) lVar.f6658b.get();
                    dpb.a.Companion.getClass();
                    Intrinsics.checkNotNullParameter(extension2, "extension");
                    s.k(extension2);
                    return extension2;
                }
                if (i43 == 1) {
                    dkk.a0 savingsErrorHandlingApiFactory2 = ((blb.e) nVar11.f6663b).d();
                    dpb.a.Companion.getClass();
                    Intrinsics.checkNotNullParameter(savingsErrorHandlingApiFactory2, "savingsErrorHandlingApiFactory");
                    return savingsErrorHandlingApiFactory2.a();
                }
                if (i43 != 2) {
                    throw new AssertionError(i43);
                }
                rnb.w wVarB3 = nVar11.f6664c.b();
                s.j(wVarB3);
                return new cpb.k(wVarB3, (clb.c) lVar.f6658b.get(), new cpb.l(), lVar.f6657a);
            case 10:
                anb.n nVar12 = (anb.n) this.f5683c;
                anb.o oVar = (anb.o) this.d;
                int i59 = this.f5682b;
                if (i59 == 0) {
                    oob.a extension3 = (oob.a) oVar.f6681c.get();
                    pob.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(extension3, "extension");
                    s.k(extension3);
                    return extension3;
                }
                if (i59 == 1) {
                    return new oob.c((mjb.a) nVar12.H.get());
                }
                if (i59 != 2) {
                    throw new AssertionError(i59);
                }
                anb.n nVar13 = oVar.f6680b;
                hpg.a aVar4 = (hpg.a) ((wpg.l) nVar13.f6674s).V.get();
                s.j(aVar4);
                ft6.d dVar2 = new ft6.d();
                xzi.a aVar5 = (xzi.a) ((dqj.r) nVar13.E).Y.get();
                s.j(aVar5);
                i3g.k kVar2 = new i3g.k(new nob.a(aVar4, dVar2, aVar5));
                SavingsAutomationsScreenContract$InputData savingsAutomationsScreenContract$InputData = oVar.f6679a;
                rnb.w wVarB4 = nVar12.f6664c.b();
                s.j(wVarB4);
                rnb.m mVar = (rnb.m) nVar12.i.u.get();
                s.j(mVar);
                return new nob.i(kVar2, savingsAutomationsScreenContract$InputData, wVarB4, mVar, (oob.a) oVar.f6681c.get());
            case 11:
                anb.p pVar = (anb.p) this.d;
                anb.n nVar14 = pVar.f6683b;
                anb.n nVar15 = (anb.n) this.f5683c;
                cri.b bVar4 = nVar15.o;
                l70.e eVar2 = nVar15.f6665g;
                ite.a aVar6 = nVar15.f6667j;
                tib.b bVar5 = nVar15.f6663b;
                int i66 = this.f5682b;
                switch (i66) {
                    case 0:
                        return kxa.j.k((j60.a) pVar.e.get());
                    case 1:
                        return ehe.n.s((com.revolut.kompot.navigable.a) pVar.f6684c.get(), (rp0.m) pVar.d.get());
                    case 2:
                        return new rp0.m();
                    case 3:
                        Object extension4 = (tkb.a) pVar.f6685g.get();
                        yob.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension4, "extension");
                        yji.n nVar16 = (yji.n) extension4;
                        s.k(nVar16);
                        return nVar16;
                    case 4:
                        skb.f fVarB2 = ((blb.e) bVar5).b();
                        f80.a aVarX3 = eVar2.x();
                        s.j(aVarX3);
                        ag.p provider2 = ufg.p0.u(fVarB2, aVarX3, ((s41.a) bVar4).d());
                        j60.a bottomDialogExtension = (j60.a) pVar.e.get();
                        yob.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(provider2, "provider");
                        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomExpandableDialogControllerExtension");
                        skb.f fVar = (skb.f) provider2.f4717b;
                        f80.a aVar7 = (f80.a) provider2.f4718c;
                        wli.x xVar = (wli.x) provider2.d;
                        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
                        return new tkb.c(bottomDialogExtension, fVar, aVar7, xVar);
                    case 5:
                        tkb.e eVar3 = new tkb.e();
                        dcd.b bVar6 = new dcd.b();
                        ite.a aVar8 = nVar14.f6667j;
                        gte.a aVarB = aVar8.b();
                        s.j(aVarB);
                        apb.c cVar2 = new apb.c(eVar3, bVar6, aVarB);
                        com.revolut.feature.retail.savings.impl.common.product_info.a aVar9 = new com.revolut.feature.retail.savings.impl.common.product_info.a();
                        rkb.b bVar7 = new rkb.b();
                        rkb.d dVar3 = new rkb.d();
                        k48.a aVar10 = new k48.a();
                        bpb.a aVar11 = new bpb.a();
                        vlb.e eVar4 = (vlb.e) pVar.i.get();
                        gte.a aVarB2 = aVar8.b();
                        s.j(aVarB2);
                        qee.s sVar2 = new qee.s(new zob.c(cVar2, aVar9, bVar7, dVar3, aVar10, aVar11, eVar4, aVarB2, new hqb.a()));
                        SavingsDetailsScreenContract$InputData savingsDetailsScreenContract$InputData = pVar.f6682a;
                        rnb.w wVarB5 = nVar15.f6664c.b();
                        s.j(wVarB5);
                        ijb.a aVarG7 = ((blb.e) bVar5).g();
                        s.j(aVarG7);
                        j60.a aVar12 = (j60.a) pVar.e.get();
                        skb.f fVarB3 = ((blb.e) bVar5).b();
                        gte.a aVarB3 = aVar6.b();
                        s.j(aVarB3);
                        mre.c cVarB2 = nVar15.f6671p.b();
                        s.j(cVarB2);
                        ang.f fVarE = nVar15.f6672q.e();
                        jhf.a aVar13 = nVar14.f6673r;
                        fpg.c cVar3 = nVar14.f6674s;
                        com.revolut.domain.interactors.transactions.a aVarC2 = ((bjf.a) aVar13).c();
                        s.j(aVarC2);
                        lqg.a aVar14 = new lqg.a();
                        ypg.f fVar2 = (ypg.f) ((wpg.l) cVar3).Q.get();
                        s.j(fVar2);
                        l80.e eVarH3 = nVar14.f6665g.h();
                        s.j(eVarH3);
                        bpb.d dVar4 = new bpb.d(aVarC2, aVar14, fVar2, eVarH3);
                        f80.a aVarX4 = eVar2.x();
                        s.j(aVarX4);
                        tkb.a aVar15 = (tkb.a) pVar.f6685g.get();
                        r0 r0VarC = nVar15.f.c();
                        mj8.b bVar8 = nVar14.f6675t;
                        yf8.a aVar16 = nVar14.u;
                        hj8.a aVarA = bVar8.a();
                        s.j(aVarA);
                        zf8.n nVarB = aVar16.b();
                        s.j(nVarB);
                        pab.a aVar17 = (pab.a) nVar14.v.i.get();
                        s.j(aVar17);
                        jab.a aVar18 = (jab.a) nVar14.f6676w.f159986h.get();
                        s.j(aVar18);
                        zf8.k kVarA = aVar16.a();
                        s.j(kVarA);
                        ou5.b bVar9 = new ou5.b(aVarA, nVarB, aVar17, aVar18, kVarA);
                        wli.x xVarD = ((s41.a) bVar4).d();
                        r10.r rVarH = ((blb.e) bVar5).h();
                        wme.a aVar19 = (wme.a) nVar15.f6677x.f197223l.get();
                        s.j(aVar19);
                        elb.b bVarE = ((blb.e) bVar5).e();
                        pab.a aVar20 = (pab.a) nVar15.v.i.get();
                        s.j(aVar20);
                        return new com.revolut.feature.retail.savings.impl.ui.details.a(sVar2, savingsDetailsScreenContract$InputData, wVarB5, aVarG7, aVar12, fVarB3, aVarB3, cVarB2, fVarE, dVar4, aVarX4, aVar15, r0VarC, bVar9, xVarD, rVarH, aVar19, bVarE, aVar20, (vlb.e) pVar.i.get(), ((vjb.b) nVar15.k).b(), new fkg.a((eqb.b) ((blb.e) bVar5).f16515t.get()));
                    case 6:
                        gte.a featureToggleInteractor = aVar6.b();
                        s.j(featureToggleInteractor);
                        yob.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
                        return new vlb.e(featureToggleInteractor);
                    default:
                        throw new AssertionError(i66);
                }
            case 12:
                anb.q qVar = (anb.q) this.d;
                anb.n nVar17 = (anb.n) this.f5683c;
                int i74 = this.f5682b;
                if (i74 != 0) {
                    if (i74 == 1) {
                        return new vob.k(((k3) nVar17.z).b());
                    }
                    throw new AssertionError(i74);
                }
                cli.n nVar18 = (cli.n) qVar.f6689b.get();
                SavingsKompotFeatureConfig$SavingsReturnExampleScreen$InputData savingsKompotFeatureConfig$SavingsReturnExampleScreen$InputData = qVar.f6688a;
                ijb.a aVarG8 = ((blb.e) nVar17.f6663b).g();
                s.j(aVarG8);
                ffk.t tVarF = nVar17.A.f();
                s.j(tVarF);
                return new vob.i(nVar18, savingsKompotFeatureConfig$SavingsReturnExampleScreen$InputData, aVarG8, tVarF, nVar17.B.b());
            case 13:
                anb.n nVar19 = (anb.n) this.f5683c;
                anb.r rVar2 = (anb.r) this.d;
                int i92 = this.f5682b;
                if (i92 == 0) {
                    return kxa.j.s((j60.a) rVar2.d.get());
                }
                if (i92 == 1) {
                    return kxa.j.q((com.revolut.kompot.navigable.a) rVar2.f6692b.get(), (rp0.m) rVar2.f6693c.get(), new j60.e());
                }
                if (i92 == 2) {
                    return new rp0.m();
                }
                if (i92 == 3) {
                    djb.n nVarA2 = nVar19.i.a();
                    s.j(nVarA2);
                    return new com.revolut.feature.retail.savings.impl.ui.widgets.savings.transfer.a(nVarA2, (j60.a) rVar2.f.get(), (mjb.a) nVar19.H.get(), ((blb.e) nVar19.f6663b).e(), rVar2.f6691a, (jki.p) rVar2.f6694g.get());
                }
                if (i92 != 4) {
                    if (i92 == 5) {
                        return new com.revolut.feature.retail.savings.impl.ui.widgets.savings.transfer.b(new dcd.b());
                    }
                    throw new AssertionError(i92);
                }
                j60.a bottomExpandableDialogEmbeddedControllerExtension3 = (j60.a) rVar2.d.get();
                bqb.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(bottomExpandableDialogEmbeddedControllerExtension3, "bottomExpandableDialogEmbeddedControllerExtension");
                s.k(bottomExpandableDialogEmbeddedControllerExtension3);
                return bottomExpandableDialogEmbeddedControllerExtension3;
            case 14:
                ao1.c cVar4 = (ao1.c) this.d;
                ao1.d dVar5 = (ao1.d) this.f5683c;
                l70.e eVar5 = dVar5.e;
                int i96 = this.f5682b;
                if (i96 != 0) {
                    if (i96 == 1) {
                        w80.b bVar10 = (w80.b) cVar4.f7868c.get();
                        u80.o oVar2 = new u80.o();
                        l80.e eVarH4 = eVar5.h();
                        s.j(eVarH4);
                        return new fo1.w(bVar10, oVar2, eVarH4);
                    }
                    if (i96 != 2) {
                        throw new AssertionError(i96);
                    }
                    qd0.b languageProvider = eVar5.n();
                    s.j(languageProvider);
                    go1.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
                    return v80.b.b(languageProvider, false, false, 58);
                }
                cli.n nVar20 = (cli.n) cVar4.d.get();
                AmountScreenContract$InputData amountScreenContract$InputData = cVar4.f7866a;
                l2j.a aVar21 = new l2j.a();
                opf.b bVarG = dVar5.f.g();
                wsg.n nVarB2 = dVar5.f7872g.b();
                xn1.b bVar11 = (xn1.b) dVar5.f7881s.get();
                w80.b bVar12 = (w80.b) cVar4.f7868c.get();
                oo1.b bVar13 = new oo1.b();
                q12.a aVarG9 = dVar5.d.g();
                s.j(aVarG9);
                zof.f fVarD = cVar4.f7867b.f7873h.d();
                s.j(fVarD);
                zjh.i iVar2 = new zjh.i(fVarD);
                ko1.b bVar14 = new ko1.b();
                vo9.a aVarB4 = ((ut9.a) dVar5.i).b();
                s.j(aVarB4);
                yw1.b bVarK = ((lz1.m) dVar5.f7874j).k();
                s.j(bVarK);
                do1.a aVar22 = new do1.a(bVarK);
                k0 k0VarQ = dVar5.k.q();
                s.j(k0VarQ);
                return new e0(nVar20, amountScreenContract$InputData, aVar21, bVarG, nVarB2, bVar11, bVar12, bVar13, aVarG9, iVar2, bVar14, aVarB4, aVar22, k0VarQ);
            case 15:
                ao1.d dVar6 = (ao1.d) this.f5683c;
                ao1.e eVar6 = (ao1.e) this.d;
                ao1.d dVar7 = eVar6.f7883b;
                int i99 = this.f5682b;
                if (i99 == 0) {
                    BPayFlowContract$InputData bPayFlowContract$InputData = eVar6.f7882a;
                    b3a.a aVarA2 = dVar6.f7869a.a();
                    s.j(aVarA2);
                    co1.b bVar15 = new co1.b();
                    co9.b bVarB = dVar6.f7870b.b();
                    s.j(bVarB);
                    return new com.revolut.feature.apm.bills.bpay.impl.flow.a(bPayFlowContract$InputData, aVarA2, bVar15, bVarB, new qpk.b());
                }
                if (i99 != 1) {
                    if (i99 == 2) {
                        return new p5k.y();
                    }
                    throw new AssertionError(i99);
                }
                p5k.y yVar = (p5k.y) eVar6.e.get();
                k5i.c cVarA3 = dVar6.f7876m.a();
                p5k.y yVar2 = (p5k.y) eVar6.e.get();
                p2k.a aVar23 = dVar7.f7877n;
                ite.a aVar24 = dVar7.o;
                v2k.c cVarA4 = aVar23.a();
                gte.a aVarB5 = aVar24.b();
                s.j(aVarB5);
                gte.a aVarB6 = aVar24.b();
                s.j(aVarB6);
                g1i.c cVar5 = new g1i.c(aVarB6, 2);
                gte.a aVarB7 = aVar24.b();
                s.j(aVarB7);
                p5k.f fVar3 = new p5k.f(yVar2, cVarA4, aVarB5, cVar5, new p5k.l(aVarB7));
                j9l.a aVar25 = new j9l.a();
                gte.a aVarB8 = dVar7.o.b();
                s.j(aVarB8);
                return new p5k.x(yVar, cVarA3, fVar3, new kgm.i(aVar25, aVarB8), new p5k.p());
            case 16:
                ao1.i iVar3 = (ao1.i) this.d;
                int i100 = this.f5682b;
                if (i100 == 0) {
                    n60.a aVar26 = (n60.a) iVar3.f7894c.get();
                    o5k.i.l(aVar26);
                    return aVar26;
                }
                if (i100 == 1) {
                    return o5k.i.q((com.revolut.kompot.navigable.a) iVar3.f7893b.get());
                }
                if (i100 != 2) {
                    throw new AssertionError(i100);
                }
                oo1.a aVar27 = new oo1.a();
                oo1.b bVar16 = new oo1.b();
                xn1.e eVar7 = new xn1.e((BPayBillService) iVar3.f7892a.f7880r.get());
                n60.a aVar28 = (n60.a) iVar3.f7894c.get();
                q12.a aVarG10 = ((ao1.d) this.f5683c).d.g();
                s.j(aVarG10);
                return new lo1.p(aVar27, bVar16, eVar7, aVar28, aVarG10, new lo1.m());
            case 17:
                ap3.h hVar2 = (ap3.h) this.f5683c;
                ap3.f fVar4 = (ap3.f) this.d;
                int i101 = this.f5682b;
                switch (i101) {
                    case 0:
                        return a10.b.f((u8h.b) hVar2.f8090g, "factory");
                    case 1:
                        return trl.f.j((t60.b) fVar4.f.get());
                    case 2:
                        return trl.f.s(fVar4.f8071b);
                    case 3:
                        return kxa.j.k((j60.a) fVar4.f8075j.get());
                    case 4:
                        return ehe.n.s((com.revolut.kompot.navigable.a) fVar4.f8074h.get(), (rp0.m) fVar4.i.get());
                    case 5:
                        return new rp0.m();
                    case 6:
                        return s2l.c.j((r60.b) fVar4.f8077m.get());
                    case 7:
                        return s2l.c.q((com.revolut.kompot.navigable.a) fVar4.f8074h.get(), (rp0.p0) fVar4.f8076l.get(), kxa.j.o(new nji.b()));
                    case 8:
                        return new rp0.p0();
                    case 9:
                        n60.a aVar29 = (n60.a) fVar4.o.get();
                        o5k.i.l(aVar29);
                        return aVar29;
                    case 10:
                        return o5k.i.q((com.revolut.kompot.navigable.a) fVar4.f8074h.get());
                    case 11:
                        hp3.y yVarB = fVar4.b();
                        hp3.y yVarB2 = fVar4.b();
                        whl.e eVar8 = hVar2.f8089c;
                        zdl.c cVar6 = hVar2.d;
                        yhl.d dVarA = eVar8.a();
                        s.j(dVarA);
                        ybl.b bVarB2 = cVar6.b();
                        s.j(bVarB2);
                        ybl.b bVarB3 = cVar6.b();
                        s.j(bVarB3);
                        fkg.a aVar30 = new fkg.a(bVarB3);
                        j60.a aVar31 = (j60.a) fVar4.f8075j.get();
                        h8b.c cVarB3 = hVar2.b();
                        h8b.a aVar32 = new h8b.a();
                        jp3.a aVar33 = new jp3.a();
                        CorporateEventsHomeScreenContract$Input corporateEventsHomeScreenContract$Input = fVar4.f8072c;
                        yhl.d dVarA2 = fVar4.d.f8089c.a();
                        s.j(dVarA2);
                        return new com.revolut.feature.corporate_events.impl.ui.screen.home.b(yVarB, yVarB2, dVarA, bVarB2, aVar30, aVar31, cVarB3, aVar32, aVar33, corporateEventsHomeScreenContract$Input, new i4b.f(dVarA2), (aah.h) fVar4.e.get());
                    case 12:
                        return a10.b.g((u8h.b) hVar2.f8090g, "factory");
                    default:
                        throw new AssertionError(i101);
                }
            case 18:
                ax4.e eVar9 = (ax4.e) this.f5683c;
                ax4.f fVar5 = (ax4.f) this.d;
                int i102 = this.f5682b;
                if (i102 == 0) {
                    return com.revolut.data.database.models.openbanking.d.u(eVar9.f10868c, (com.revolut.kompot.navigable.a) fVar5.f10872c.get());
                }
                if (i102 == 1) {
                    return new kx4.a((lx4.a) eVar9.f10869g.get(), new a1(), ((s41.a) eVar9.d).d());
                }
                if (i102 == 2) {
                    return new ey4.f(new ac4.g(fVar5.f10870a, fVar5.f10871b.c()), (cx4.a) fVar5.e.get());
                }
                throw new AssertionError(i102);
            case 19:
                ay7.b bVar17 = (ay7.b) this.f5683c;
                ay7.a aVar34 = (ay7.a) this.d;
                int i103 = this.f5682b;
                switch (i103) {
                    case 0:
                        return kpi.f.a();
                    case 1:
                        Context contextI = bq.i.i(aVar34.f11074a);
                        BaseDelegatesActivity baseDelegatesActivityF = bq.i.f(aVar34.f11074a);
                        t70.g gVarO = bVar17.f11092b.o();
                        s.j(gVarO);
                        return new npi.c(contextI, baseDelegatesActivityF, gVarO);
                    case 2:
                        return new tpi.i((rpi.c) aVar34.f.get(), gsi.c.a(aVar34.f11074a));
                    case 3:
                        return new rpi.b(bq.i.b(aVar34.f11074a));
                    case 4:
                        return new rpi.h(bq.i.b(aVar34.f11074a));
                    case 5:
                        return new iri.g((iri.j) bVar17.f.get(), (iri.m) bVar17.f11094g.get(), bq.i.f(aVar34.f11074a), bq.i.l(aVar34.f11074a));
                    case 6:
                        return new iri.l((iri.m) bVar17.f11094g.get(), bq.i.f(aVar34.f11074a), (iri.d) aVar34.f11079j.get());
                    case 7:
                        return new iri.d(bq.i.f(aVar34.f11074a));
                    case 8:
                        return new opi.b(bq.i.f(aVar34.f11074a));
                    case 9:
                        aVar34.getClass();
                        return new xpi.c(xpi.f.f307976c, bq.i.b(aVar34.f11074a));
                    case 10:
                        aVar34.getClass();
                        return new iqi.b(iqi.g.f167870b, bq.i.b(aVar34.f11074a));
                    case 11:
                        aVar34.getClass();
                        return new cn.d(ImmutableSet.copyOf((Collection) dn.b.a()), (cn.e) bVar17.i.get(), bVar17.d());
                    case 12:
                        um.c cVar7 = (um.c) bVar17.f11096j.get();
                        aVar34.getClass();
                        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(5);
                        ay7.b bVar18 = aVar34.f11076c;
                        hn.h hVar3 = (hn.h) bVar18.k.get();
                        t70.g gVarO2 = bVar18.f11092b.o();
                        s.j(gVarO2);
                        builderBuilderWithExpectedSize.add(new jn.a(hVar3, gVarO2));
                        builderBuilderWithExpectedSize.add(new vm.b(com.google.android.gms.internal.mlkit_vision_face.a.f()));
                        builderBuilderWithExpectedSize.add(bVar18.h());
                        builderBuilderWithExpectedSize.addAll((Iterable) in.g.a());
                        builderBuilderWithExpectedSize.add(new jn.d(e4m.b.a(aVar34.f11083p)));
                        return new in.e(cVar7, builderBuilderWithExpectedSize.build(), bVar17.d());
                    case 13:
                        return bq.i.t(aVar34.f11074a);
                    case 14:
                        aVar34.getClass();
                        ImmutableSet.Builder builderBuilderWithExpectedSize2 = ImmutableSet.builderWithExpectedSize(3);
                        builderBuilderWithExpectedSize2.addAll((Iterable) kn.g.a());
                        builderBuilderWithExpectedSize2.add(aVar34.f11085r.get());
                        builderBuilderWithExpectedSize2.add(new kn.h(e4m.b.a(aVar34.f11077g)));
                        return new kn.e(builderBuilderWithExpectedSize2.build(), (ym.d) bVar17.f11098m.get(), bVar17.d());
                    case 15:
                        return new zm.a();
                    case 16:
                        aVar34.getClass();
                        ImmutableSet.Builder builderBuilderWithExpectedSize3 = ImmutableSet.builderWithExpectedSize(2);
                        builderBuilderWithExpectedSize3.addAll((Iterable) hn.g.a());
                        builderBuilderWithExpectedSize3.add(aVar34.f11076c.h());
                        return new hn.d(builderBuilderWithExpectedSize3.build(), (hn.h) bVar17.k.get(), (npi.f) aVar34.e.get());
                    case 17:
                        return new en.c(ImmutableSet.of((ln.d) aVar34.f11076c.f11097l.get()), bq.i.l(aVar34.f11074a));
                    case 18:
                        return new gn.c((lpi.e) aVar34.v.get(), (sm.e) bVar17.f11104t.get(), ImmutableSet.copyOf((Collection) gn.e.a()), bVar17.d());
                    case 19:
                        return new lpi.b(bq.i.i(aVar34.f11074a), bq.i.j(aVar34.f11074a));
                    case 20:
                        aVar34.getClass();
                        ImmutableSet.Builder builderBuilderWithExpectedSize4 = ImmutableSet.builderWithExpectedSize(2);
                        builderBuilderWithExpectedSize4.addAll((Iterable) pm.b.a());
                        builderBuilderWithExpectedSize4.add(new fn.d((ln.a) aVar34.f11076c.f11097l.get()));
                        return new in.e(builderBuilderWithExpectedSize4.build(), (om.c) bVar17.f11095h.get(), bVar17.d());
                    case 21:
                        aVar34.getClass();
                        ImmutableSet.Builder builderBuilderWithExpectedSize5 = ImmutableSet.builderWithExpectedSize(4);
                        builderBuilderWithExpectedSize5.addAll((Iterable) g3l.f.a());
                        ay7.b bVar19 = aVar34.f11076c;
                        builderBuilderWithExpectedSize5.add(bVar19.f11100p.get());
                        builderBuilderWithExpectedSize5.add(bVar19.f11101q.get());
                        return new g3l.c(j6.a.g(bVar19.f11103s, builderBuilderWithExpectedSize5), (g3l.g) bVar17.o.get(), (k3l.b) aVar34.f11090y.get(), bVar17.d());
                    case 22:
                        return new k3l.d(bq.i.b(aVar34.f11074a));
                    case 23:
                        return new wm.l((opi.d) aVar34.f11080l.get(), (wm.a) bVar17.f11102r.get(), ImmutableSet.copyOf((Collection) xm.b.a()), bVar17.d());
                    case 24:
                        zx7.q qVar2 = (zx7.q) bVar17.u.get();
                        e4m.e eVar10 = aVar34.f11077g;
                        xoi.d dVar8 = aVar34.f11074a;
                        tpi.j jVar3 = (tpi.j) eVar10.get();
                        f9b.f fVar6 = (f9b.f) aVar34.f11083p.get();
                        xpi.g gVar3 = (xpi.g) aVar34.f11081m.get();
                        iqi.h hVar4 = (iqi.h) aVar34.f11082n.get();
                        tri.c cVarE = bq.i.e(dVar8);
                        ln.a aVar35 = (ln.a) bVar17.f11097l.get();
                        CancellationFeedbackScreenContract$Configuration cancellationFeedbackScreenContract$Configuration = aVar34.f11075b;
                        iqi.h hVar5 = (iqi.h) aVar34.f11082n.get();
                        ay7.b bVar20 = aVar34.f11076c;
                        by7.f fVar7 = new by7.f(qVar2, jVar3, fVar6, gVar3, hVar4, cVarE, aVar35, cancellationFeedbackScreenContract$Configuration, new com.revolut.feature.insurance_pet.impl.ui.cancellation.feedback.a(hVar5, (zx7.k) bVar20.v.get(), (mm.d) bVar20.f11099n.get()));
                        kli.a.p(fVar7, bq.i.d(dVar8));
                        return fVar7;
                    default:
                        throw new AssertionError(i103);
                }
            case 20:
                return a();
            case 21:
                return b();
            case 22:
                return c();
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
                int i104 = this.f5682b;
                if (i104 != 0) {
                    if (i104 == 1) {
                        return new u6b.m(new w6b.e(), new w6b.f(), new w6b.b());
                    }
                    throw new AssertionError(i104);
                }
                cli.n nVar21 = (cli.n) ((b6b.k) this.d).f12628a.get();
                c6b.a aVar36 = (c6b.a) ((b6b.o) this.f5683c).f12651b.J.get();
                s.j(aVar36);
                return new u6b.l(nVar21, aVar36, new w6b.c());
        }
    }
}
