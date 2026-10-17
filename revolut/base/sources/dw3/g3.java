package dw3;

import android.app.Activity;
import ch.qos.logback.core.rolling.SizeBasedTriggeringPolicy;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowContract$Input;
import com.revolut.feature.credit.application.plugins.impl.ui.debts.OutstandingDebtsFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.OutstandingDebtsV2FlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.debts_v3.flow.OutstandingDebtsV3FlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.financial_situation_confirmation.FinancialSituationConfirmationFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.financial_situation_confirmation.changes.FinancialSituationChangesScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.form.FormFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.home_insurance.HomeInsuranceFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.how_it_works.flow.HowItWorksFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.illion_bankstatement.IllionBankStatementFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.KontomatikIncomeCheckFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.sign_in.KontomatikSignInControllerContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.loan_selection.LoanSelectionFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.ManualUnderwritingContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer.MortgageOfferFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_refinancing_details_v2.flow.MortgageRefinancingDetailsV2FlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_signature.flow.MortgageSignatureFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_signature.signed.MortgageSignatureSignedFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_valuation.flow.MortgageValuationFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.offer.OfferFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.OfferV2FlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.overdraft_offer.OverdraftOfferFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.payment.flow.PaymentFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.personal_details.PersonalDetailsFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.photo_upload.flow.PhotosUploadFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.plan_subscribe.PlanSubscribeFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.product_articles.ProductArticlesFlowContract$InputData;
import java.util.Optional;
import kotlin.jvm.internal.Intrinsics;
import t80.e;

/* JADX INFO: loaded from: classes22.dex */
public final class g3 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f118805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f118806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f118807c;
    public final Object d;

    public /* synthetic */ g3(Object obj2, Object obj3, int i, int i2) {
        this.f118805a = i2;
        this.f118806b = obj2;
        this.d = obj3;
        this.f118807c = i;
    }

    private final Object a() {
        c1 c1Var = (c1) this.f118806b;
        z3 z3Var = (z3) this.d;
        int i = this.f118807c;
        switch (i) {
            case 0:
                return ige.d.h(z3Var.f120271a, (j60.a) z3Var.f120274g.get());
            case 1:
                return com.revolut.data.database.models.openbanking.d.q(z3Var.f120271a, (com.revolut.kompot.navigable.a) z3Var.e.get(), (rp0.m) z3Var.f.get());
            case 2:
                iq3.a aVar = z3Var.f120271a;
                return new rp0.m();
            case 3:
                return e5f.b.x((c84.z) z3Var.f120281q.get());
            case 4:
                return new c84.z((c84.g) z3Var.f120280p.get(), (rz3.c) c1Var.f118470r1.get(), (PluginFlowContract$Input) z3Var.i.get());
            case 5:
                PluginFlowContract$Input pluginFlowContract$Input = (PluginFlowContract$Input) z3Var.i.get();
                e4m.e eVar = c1Var.f118470r1;
                uq3.b bVar = c1Var.f118428c;
                rz3.c cVar = (rz3.c) eVar.get();
                xa4.a aVar2 = (xa4.a) z3Var.k.get();
                xq3.j jVarH = bVar.h();
                vc.s.j(jVarH);
                mri.w wVarA = ((ozl.a) c1Var.u).a();
                vc.s.j(wVarA);
                ii4.o oVar = (ii4.o) z3Var.o.get();
                aq3.a aVarE = bVar.e();
                vc.s.j(aVarE);
                return new c84.i(pluginFlowContract$Input, cVar, aVar2, jVarH, wVarA, oVar, aVarE);
            case 6:
                PluginFlowContract$Input pluginFlowContract$Input2 = (PluginFlowContract$Input) z3Var.i.get();
                c1 c1Var2 = z3Var.f120273c;
                return new xa4.b(pluginFlowContract$Input2, ImmutableSet.of((ya4.g) new ya4.c(c1Var2.i(), (ya4.f) z3Var.f120276j.get()), (ya4.g) new ya4.c(c1Var2.b(), new py3.g()), (ya4.g) new ya4.c(new py3.c(), (ya4.f) z3Var.f120276j.get()), new ya4.g(new py3.f())));
            case 7:
                rz3.c cVar2 = (rz3.c) c1Var.f118470r1.get();
                xq3.j jVarH2 = c1Var.f118428c.h();
                vc.s.j(jVarH2);
                return new ya4.f(cVar2, jVarH2);
            case 8:
                return new ii4.z((li4.a) z3Var.f120279n.get());
            case 9:
                return new li4.a(ImmutableMap.of(li4.d.class, (li4.b) z3Var.f120277l.get(), li4.e.class, (li4.b) z3Var.f120278m.get()));
            case 10:
                xq3.j jVarH3 = c1Var.f118428c.h();
                vc.s.j(jVarH3);
                return new li4.c(jVarH3);
            case 11:
                uq3.b bVar2 = c1Var.f118428c;
                uq3.b bVar3 = c1Var.f118428c;
                xq3.j jVarH4 = bVar2.h();
                vc.s.j(jVarH4);
                xq3.c cVarF = bVar3.f();
                vc.s.j(cVarF);
                sp3.a aVarM = bVar3.m();
                vc.s.j(aVarM);
                return new ji4.b(jVarH4, cVarF, aVarM, c1Var.i());
            case 12:
                c84.z zVar = (c84.z) z3Var.f120281q.get();
                e5f.b.a(zVar);
                return zVar;
            case 13:
                PluginFlowContract$Input pluginFlowContract$Input3 = (PluginFlowContract$Input) z3Var.i.get();
                xr3.y yVarK = c1Var.f118428c.k();
                vc.s.j(yVarK);
                return new c84.c(pluginFlowContract$Input3, yVarK);
            case 14:
                LoanSelectionFlowContract$InputData loanSelectionFlowContract$InputData = z3Var.f120272b;
                mx3.a aVar3 = (mx3.a) c1Var.f118488x2.get();
                PluginFlowContract$Input pluginFlowContract$Input4 = (PluginFlowContract$Input) z3Var.i.get();
                c84.g gVar = (c84.g) z3Var.f120280p.get();
                xa4.a aVar4 = (xa4.a) z3Var.k.get();
                c1 c1Var3 = z3Var.f120273c;
                gte.a aVarB = c1Var3.f118423b.b();
                vc.s.j(aVarB);
                hz3.c cVarB = c1Var3.b();
                xq3.j jVarD = c1Var3.f118428c.d();
                vc.s.j(jVarD);
                mri.w wVarA2 = ((ozl.a) c1Var3.u).a();
                vc.s.j(wVarA2);
                hy3.j jVar = (hy3.j) c1Var3.Q1.get();
                vie.i iVarB = c1Var3.z.b();
                vc.s.j(iVarB);
                return new com.revolut.feature.credit.application.plugins.impl.ui.loan_selection.a(loanSelectionFlowContract$InputData, aVar3, e5f.b.w(pluginFlowContract$Input4, gVar, aVar4, aVarB, cVarB, jVarD, wVarA2, jVar, iVarB));
            default:
                throw new AssertionError(i);
        }
    }

    private final Object b() {
        a4 a4Var = (a4) this.d;
        int i = this.f118807c;
        if (i == 0) {
            return e5f.b.e((com.revolut.kompot.navigable.a) a4Var.f118264b.get(), (c84.b) a4Var.d.get(), (PluginFlowContract$Input) ((g4) this.f118806b).i.get());
        }
        if (i == 1) {
            return new c84.b();
        }
        if (i == 2) {
            return new ke4.q((cli.n) a4Var.f118266g.get());
        }
        if (i == 3) {
            return new ke4.r(a4Var.f118263a, new q74.b());
        }
        throw new AssertionError(i);
    }

    private final Object c() {
        c1 c1Var = (c1) this.f118806b;
        b4 b4Var = (b4) this.d;
        int i = this.f118807c;
        switch (i) {
            case 0:
                return ige.d.h(b4Var.f118343a, (j60.a) b4Var.f118346g.get());
            case 1:
                return com.revolut.data.database.models.openbanking.d.q(b4Var.f118343a, (com.revolut.kompot.navigable.a) b4Var.e.get(), (rp0.m) b4Var.f.get());
            case 2:
                iq3.a aVar = b4Var.f118343a;
                return new rp0.m();
            case 3:
                return e5f.b.x((c84.z) b4Var.f118353q.get());
            case 4:
                return new c84.z((c84.g) b4Var.f118352p.get(), (rz3.c) c1Var.f118470r1.get(), (PluginFlowContract$Input) b4Var.i.get());
            case 5:
                PluginFlowContract$Input pluginFlowContract$Input = (PluginFlowContract$Input) b4Var.i.get();
                e4m.e eVar = c1Var.f118470r1;
                uq3.b bVar = c1Var.f118428c;
                rz3.c cVar = (rz3.c) eVar.get();
                xa4.a aVar2 = (xa4.a) b4Var.k.get();
                xq3.j jVarH = bVar.h();
                vc.s.j(jVarH);
                mri.w wVarA = ((ozl.a) c1Var.u).a();
                vc.s.j(wVarA);
                ii4.o oVar = (ii4.o) b4Var.o.get();
                aq3.a aVarE = bVar.e();
                vc.s.j(aVarE);
                return new c84.i(pluginFlowContract$Input, cVar, aVar2, jVarH, wVarA, oVar, aVarE);
            case 6:
                PluginFlowContract$Input pluginFlowContract$Input2 = (PluginFlowContract$Input) b4Var.i.get();
                c1 c1Var2 = b4Var.f118345c;
                return new xa4.b(pluginFlowContract$Input2, ImmutableSet.of((ya4.g) new ya4.c(c1Var2.i(), (ya4.f) b4Var.f118348j.get()), (ya4.g) new ya4.c(c1Var2.b(), new py3.g()), (ya4.g) new ya4.c(new py3.c(), (ya4.f) b4Var.f118348j.get()), new ya4.g(new py3.f())));
            case 7:
                rz3.c cVar2 = (rz3.c) c1Var.f118470r1.get();
                xq3.j jVarH2 = c1Var.f118428c.h();
                vc.s.j(jVarH2);
                return new ya4.f(cVar2, jVarH2);
            case 8:
                return new ii4.z((li4.a) b4Var.f118351n.get());
            case 9:
                return new li4.a(ImmutableMap.of(li4.d.class, (li4.b) b4Var.f118349l.get(), li4.e.class, (li4.b) b4Var.f118350m.get()));
            case 10:
                xq3.j jVarH3 = c1Var.f118428c.h();
                vc.s.j(jVarH3);
                return new li4.c(jVarH3);
            case 11:
                uq3.b bVar2 = c1Var.f118428c;
                uq3.b bVar3 = c1Var.f118428c;
                xq3.j jVarH4 = bVar2.h();
                vc.s.j(jVarH4);
                xq3.c cVarF = bVar3.f();
                vc.s.j(cVarF);
                sp3.a aVarM = bVar3.m();
                vc.s.j(aVarM);
                return new ji4.b(jVarH4, cVarF, aVarM, c1Var.i());
            case 12:
                return kxa.j.m((j60.a) b4Var.f118356t.get());
            case 13:
                return wp5.y.r((com.revolut.kompot.navigable.a) b4Var.e.get(), (rp0.m) b4Var.f118355s.get());
            case 14:
                return new rp0.m();
            case 15:
                c84.z zVar = (c84.z) b4Var.f118353q.get();
                e5f.b.a(zVar);
                return zVar;
            case 16:
                PluginFlowContract$Input pluginFlowContract$Input3 = (PluginFlowContract$Input) b4Var.i.get();
                xr3.y yVarK = c1Var.f118428c.k();
                vc.s.j(yVarK);
                return new c84.c(pluginFlowContract$Input3, yVarK);
            case 17:
                e4m.e eVar2 = b4Var.f118356t;
                c1 c1Var3 = b4Var.f118345c;
                j60.a aVar3 = (j60.a) eVar2.get();
                ManualUnderwritingContract$InputData manualUnderwritingContract$InputData = b4Var.f118344b;
                zd4.b bVar4 = new zd4.b();
                sp3.a aVarM2 = c1Var.f118428c.m();
                vc.s.j(aVarM2);
                wr3.f fVar = (wr3.f) c1Var3.f118428c.f0.get();
                vc.s.j(fVar);
                s70.a aVarM3 = c1Var3.f118443h.m();
                vc.s.j(aVarM3);
                be4.d dVar = new be4.d(fVar, aVarM3);
                PluginFlowContract$Input pluginFlowContract$Input4 = (PluginFlowContract$Input) b4Var.i.get();
                c84.g gVar = (c84.g) b4Var.f118352p.get();
                xa4.a aVar4 = (xa4.a) b4Var.k.get();
                gte.a aVarB = c1Var3.f118423b.b();
                vc.s.j(aVarB);
                hz3.c cVarB = c1Var3.b();
                xq3.j jVarD = c1Var3.f118428c.d();
                vc.s.j(jVarD);
                mri.w wVarA2 = ((ozl.a) c1Var3.u).a();
                vc.s.j(wVarA2);
                hy3.j jVar = (hy3.j) c1Var3.Q1.get();
                vie.i iVarB = c1Var3.z.b();
                vc.s.j(iVarB);
                return new com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.a(aVar3, manualUnderwritingContract$InputData, bVar4, aVarM2, dVar, e5f.b.w(pluginFlowContract$Input4, gVar, aVar4, aVarB, cVarB, jVarD, wVarA2, jVar, iVarB));
            case 18:
                return new hw3.w((di0.i) b4Var.f118359y.get(), (hw3.f0) b4Var.z.get(), (hw3.y) b4Var.A.get());
            case 19:
                bi0.f factory = new bi0.f(new ci0.a(), c1Var.E.d(), new di0.e());
                od4.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory, "factory");
                return factory.b(eh0.c.LATIN);
            case 20:
                return new hw3.f0((di0.i) b4Var.f118359y.get());
            case 21:
                return new hw3.y();
            case 22:
                return new hw3.i0();
            case 23:
                return new hw3.r((hw3.f0) b4Var.z.get(), new hw3.g0(), (hw3.y) b4Var.A.get());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object d() {
        c4 c4Var = (c4) this.d;
        int i = this.f118807c;
        if (i == 0) {
            return e5f.b.d((com.revolut.kompot.navigable.a) c4Var.f118504b.get(), (c84.b) c4Var.d.get(), (PluginFlowContract$Input) ((b4) this.f118806b).i.get());
        }
        if (i == 1) {
            return new c84.b();
        }
        if (i == 2) {
            return new rd4.i(c4Var.f118503a, (jki.p) c4Var.f118506g.get());
        }
        if (i == 3) {
            return new rd4.j();
        }
        throw new AssertionError(i);
    }

    private final Object e() {
        c1 c1Var = (c1) this.f118806b;
        f4 f4Var = (f4) this.d;
        int i = this.f118807c;
        switch (i) {
            case 0:
                return ige.d.h(f4Var.f118715a, (j60.a) f4Var.f118718g.get());
            case 1:
                return com.revolut.data.database.models.openbanking.d.q(f4Var.f118715a, (com.revolut.kompot.navigable.a) f4Var.e.get(), (rp0.m) f4Var.f.get());
            case 2:
                iq3.a aVar = f4Var.f118715a;
                return new rp0.m();
            case 3:
                return e5f.b.x((c84.z) f4Var.f118725q.get());
            case 4:
                return new c84.z((c84.g) f4Var.f118724p.get(), (rz3.c) c1Var.f118470r1.get(), (PluginFlowContract$Input) f4Var.i.get());
            case 5:
                PluginFlowContract$Input pluginFlowContract$Input = (PluginFlowContract$Input) f4Var.i.get();
                e4m.e eVar = c1Var.f118470r1;
                uq3.b bVar = c1Var.f118428c;
                rz3.c cVar = (rz3.c) eVar.get();
                xa4.a aVar2 = (xa4.a) f4Var.k.get();
                xq3.j jVarH = bVar.h();
                vc.s.j(jVarH);
                mri.w wVarA = ((ozl.a) c1Var.u).a();
                vc.s.j(wVarA);
                ii4.o oVar = (ii4.o) f4Var.o.get();
                aq3.a aVarE = bVar.e();
                vc.s.j(aVarE);
                return new c84.i(pluginFlowContract$Input, cVar, aVar2, jVarH, wVarA, oVar, aVarE);
            case 6:
                PluginFlowContract$Input pluginFlowContract$Input2 = (PluginFlowContract$Input) f4Var.i.get();
                c1 c1Var2 = f4Var.f118717c;
                return new xa4.b(pluginFlowContract$Input2, ImmutableSet.of((ya4.g) new ya4.c(c1Var2.i(), (ya4.f) f4Var.f118720j.get()), (ya4.g) new ya4.c(c1Var2.b(), new py3.g()), (ya4.g) new ya4.c(new py3.c(), (ya4.f) f4Var.f118720j.get()), new ya4.g(new py3.f())));
            case 7:
                rz3.c cVar2 = (rz3.c) c1Var.f118470r1.get();
                xq3.j jVarH2 = c1Var.f118428c.h();
                vc.s.j(jVarH2);
                return new ya4.f(cVar2, jVarH2);
            case 8:
                return new ii4.z((li4.a) f4Var.f118723n.get());
            case 9:
                return new li4.a(ImmutableMap.of(li4.d.class, (li4.b) f4Var.f118721l.get(), li4.e.class, (li4.b) f4Var.f118722m.get()));
            case 10:
                xq3.j jVarH3 = c1Var.f118428c.h();
                vc.s.j(jVarH3);
                return new li4.c(jVarH3);
            case 11:
                uq3.b bVar2 = c1Var.f118428c;
                uq3.b bVar3 = c1Var.f118428c;
                xq3.j jVarH4 = bVar2.h();
                vc.s.j(jVarH4);
                xq3.c cVarF = bVar3.f();
                vc.s.j(cVarF);
                sp3.a aVarM = bVar3.m();
                vc.s.j(aVarM);
                return new ji4.b(jVarH4, cVarF, aVarM, c1Var.i());
            case 12:
                c84.z zVar = (c84.z) f4Var.f118725q.get();
                e5f.b.a(zVar);
                return zVar;
            case 13:
                PluginFlowContract$Input pluginFlowContract$Input3 = (PluginFlowContract$Input) f4Var.i.get();
                xr3.y yVarK = c1Var.f118428c.k();
                vc.s.j(yVarK);
                return new c84.c(pluginFlowContract$Input3, yVarK);
            case 14:
                return new mf4.c((rx3.b) c1Var.i2.get(), (PluginFlowContract$Input) f4Var.i.get());
            case 15:
                MortgageOfferFlowContract$InputData mortgageOfferFlowContract$InputData = f4Var.f118716b;
                ce4.n nVar = (ce4.n) f4Var.v.get();
                rx3.a aVar3 = (rx3.a) c1Var.f118473s1.get();
                PluginFlowContract$Input pluginFlowContract$Input4 = (PluginFlowContract$Input) f4Var.i.get();
                c84.g gVar = (c84.g) f4Var.f118724p.get();
                xa4.a aVar4 = (xa4.a) f4Var.k.get();
                c1 c1Var3 = f4Var.f118717c;
                gte.a aVarB = c1Var3.f118423b.b();
                vc.s.j(aVarB);
                hz3.c cVarB = c1Var3.b();
                xq3.j jVarD = c1Var3.f118428c.d();
                vc.s.j(jVarD);
                mri.w wVarA2 = ((ozl.a) c1Var3.u).a();
                vc.s.j(wVarA2);
                hy3.j jVar = (hy3.j) c1Var3.Q1.get();
                vie.i iVarB = c1Var3.z.b();
                vc.s.j(iVarB);
                return new com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer.d(mortgageOfferFlowContract$InputData, nVar, aVar3, e5f.b.w(pluginFlowContract$Input4, gVar, aVar4, aVarB, cVarB, jVarD, wVarA2, jVar, iVarB));
            case 16:
                return new ce4.n((PluginFlowContract$Input) f4Var.i.get(), (nx3.a) c1Var.F2.get());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object f() {
        c1 c1Var = (c1) this.f118806b;
        g4 g4Var = (g4) this.d;
        int i = this.f118807c;
        switch (i) {
            case 0:
                return ige.d.h(g4Var.f118808a, (j60.a) g4Var.f118811g.get());
            case 1:
                return com.revolut.data.database.models.openbanking.d.q(g4Var.f118808a, (com.revolut.kompot.navigable.a) g4Var.e.get(), (rp0.m) g4Var.f.get());
            case 2:
                iq3.a aVar = g4Var.f118808a;
                return new rp0.m();
            case 3:
                return e5f.b.x((c84.z) g4Var.f118818q.get());
            case 4:
                return new c84.z((c84.g) g4Var.f118817p.get(), (rz3.c) c1Var.f118470r1.get(), (PluginFlowContract$Input) g4Var.i.get());
            case 5:
                PluginFlowContract$Input pluginFlowContract$Input = (PluginFlowContract$Input) g4Var.i.get();
                e4m.e eVar = c1Var.f118470r1;
                uq3.b bVar = c1Var.f118428c;
                rz3.c cVar = (rz3.c) eVar.get();
                xa4.a aVar2 = (xa4.a) g4Var.k.get();
                xq3.j jVarH = bVar.h();
                vc.s.j(jVarH);
                mri.w wVarA = ((ozl.a) c1Var.u).a();
                vc.s.j(wVarA);
                ii4.o oVar = (ii4.o) g4Var.o.get();
                aq3.a aVarE = bVar.e();
                vc.s.j(aVarE);
                return new c84.i(pluginFlowContract$Input, cVar, aVar2, jVarH, wVarA, oVar, aVarE);
            case 6:
                PluginFlowContract$Input pluginFlowContract$Input2 = (PluginFlowContract$Input) g4Var.i.get();
                c1 c1Var2 = g4Var.f118810c;
                return new xa4.b(pluginFlowContract$Input2, ImmutableSet.of((ya4.g) new ya4.c(c1Var2.i(), (ya4.f) g4Var.f118813j.get()), (ya4.g) new ya4.c(c1Var2.b(), new py3.g()), (ya4.g) new ya4.c(new py3.c(), (ya4.f) g4Var.f118813j.get()), new ya4.g(new py3.f())));
            case 7:
                rz3.c cVar2 = (rz3.c) c1Var.f118470r1.get();
                xq3.j jVarH2 = c1Var.f118428c.h();
                vc.s.j(jVarH2);
                return new ya4.f(cVar2, jVarH2);
            case 8:
                return new ii4.z((li4.a) g4Var.f118816n.get());
            case 9:
                return new li4.a(ImmutableMap.of(li4.d.class, (li4.b) g4Var.f118814l.get(), li4.e.class, (li4.b) g4Var.f118815m.get()));
            case 10:
                xq3.j jVarH3 = c1Var.f118428c.h();
                vc.s.j(jVarH3);
                return new li4.c(jVarH3);
            case 11:
                uq3.b bVar2 = c1Var.f118428c;
                uq3.b bVar3 = c1Var.f118428c;
                xq3.j jVarH4 = bVar2.h();
                vc.s.j(jVarH4);
                xq3.c cVarF = bVar3.f();
                vc.s.j(cVarF);
                sp3.a aVarM = bVar3.m();
                vc.s.j(aVarM);
                return new ji4.b(jVarH4, cVarF, aVarM, c1Var.i());
            case 12:
                c84.z zVar = (c84.z) g4Var.f118818q.get();
                e5f.b.a(zVar);
                return zVar;
            case 13:
                PluginFlowContract$Input pluginFlowContract$Input3 = (PluginFlowContract$Input) g4Var.i.get();
                xr3.y yVarK = c1Var.f118428c.k();
                vc.s.j(yVarK);
                return new c84.c(pluginFlowContract$Input3, yVarK);
            case 14:
                MortgageRefinancingDetailsV2FlowContract$InputData mortgageRefinancingDetailsV2FlowContract$InputData = g4Var.f118809b;
                ox3.a aVar3 = (ox3.a) c1Var.H2.get();
                ang.f fVarE = c1Var.k.e();
                PluginFlowContract$Input pluginFlowContract$Input4 = (PluginFlowContract$Input) g4Var.i.get();
                c84.g gVar = (c84.g) g4Var.f118817p.get();
                xa4.a aVar4 = (xa4.a) g4Var.k.get();
                c1 c1Var3 = g4Var.f118810c;
                gte.a aVarB = c1Var3.f118423b.b();
                vc.s.j(aVarB);
                hz3.c cVarB = c1Var3.b();
                xq3.j jVarD = c1Var3.f118428c.d();
                vc.s.j(jVarD);
                mri.w wVarA2 = ((ozl.a) c1Var3.u).a();
                vc.s.j(wVarA2);
                hy3.j jVar = (hy3.j) c1Var3.Q1.get();
                vie.i iVarB = c1Var3.z.b();
                vc.s.j(iVarB);
                return new com.revolut.feature.credit.application.plugins.impl.ui.mortgage_refinancing_details_v2.flow.d(mortgageRefinancingDetailsV2FlowContract$InputData, aVar3, fVarE, e5f.b.w(pluginFlowContract$Input4, gVar, aVar4, aVarB, cVarB, jVarD, wVarA2, jVar, iVarB));
            default:
                throw new AssertionError(i);
        }
    }

    private final Object g() {
        c1 c1Var = (c1) this.f118806b;
        h4 h4Var = (h4) this.d;
        int i = this.f118807c;
        switch (i) {
            case 0:
                return ige.d.h(h4Var.f118873a, (j60.a) h4Var.f118876g.get());
            case 1:
                return com.revolut.data.database.models.openbanking.d.q(h4Var.f118873a, (com.revolut.kompot.navigable.a) h4Var.e.get(), (rp0.m) h4Var.f.get());
            case 2:
                iq3.a aVar = h4Var.f118873a;
                return new rp0.m();
            case 3:
                return e5f.b.x((c84.z) h4Var.f118883q.get());
            case 4:
                return new c84.z((c84.g) h4Var.f118882p.get(), (rz3.c) c1Var.f118470r1.get(), (PluginFlowContract$Input) h4Var.i.get());
            case 5:
                PluginFlowContract$Input pluginFlowContract$Input = (PluginFlowContract$Input) h4Var.i.get();
                e4m.e eVar = c1Var.f118470r1;
                uq3.b bVar = c1Var.f118428c;
                rz3.c cVar = (rz3.c) eVar.get();
                xa4.a aVar2 = (xa4.a) h4Var.k.get();
                xq3.j jVarH = bVar.h();
                vc.s.j(jVarH);
                mri.w wVarA = ((ozl.a) c1Var.u).a();
                vc.s.j(wVarA);
                ii4.o oVar = (ii4.o) h4Var.o.get();
                aq3.a aVarE = bVar.e();
                vc.s.j(aVarE);
                return new c84.i(pluginFlowContract$Input, cVar, aVar2, jVarH, wVarA, oVar, aVarE);
            case 6:
                PluginFlowContract$Input pluginFlowContract$Input2 = (PluginFlowContract$Input) h4Var.i.get();
                c1 c1Var2 = h4Var.f118875c;
                return new xa4.b(pluginFlowContract$Input2, ImmutableSet.of((ya4.g) new ya4.c(c1Var2.i(), (ya4.f) h4Var.f118878j.get()), (ya4.g) new ya4.c(c1Var2.b(), new py3.g()), (ya4.g) new ya4.c(new py3.c(), (ya4.f) h4Var.f118878j.get()), new ya4.g(new py3.f())));
            case 7:
                rz3.c cVar2 = (rz3.c) c1Var.f118470r1.get();
                xq3.j jVarH2 = c1Var.f118428c.h();
                vc.s.j(jVarH2);
                return new ya4.f(cVar2, jVarH2);
            case 8:
                return new ii4.z((li4.a) h4Var.f118881n.get());
            case 9:
                return new li4.a(ImmutableMap.of(li4.d.class, (li4.b) h4Var.f118879l.get(), li4.e.class, (li4.b) h4Var.f118880m.get()));
            case 10:
                xq3.j jVarH3 = c1Var.f118428c.h();
                vc.s.j(jVarH3);
                return new li4.c(jVarH3);
            case 11:
                uq3.b bVar2 = c1Var.f118428c;
                uq3.b bVar3 = c1Var.f118428c;
                xq3.j jVarH4 = bVar2.h();
                vc.s.j(jVarH4);
                xq3.c cVarF = bVar3.f();
                vc.s.j(cVarF);
                sp3.a aVarM = bVar3.m();
                vc.s.j(aVarM);
                return new ji4.b(jVarH4, cVarF, aVarM, c1Var.i());
            case 12:
                c84.z zVar = (c84.z) h4Var.f118883q.get();
                e5f.b.a(zVar);
                return zVar;
            case 13:
                PluginFlowContract$Input pluginFlowContract$Input3 = (PluginFlowContract$Input) h4Var.i.get();
                xr3.y yVarK = c1Var.f118428c.k();
                vc.s.j(yVarK);
                return new c84.c(pluginFlowContract$Input3, yVarK);
            case 14:
                MortgageSignatureFlowContract$InputData mortgageSignatureFlowContract$InputData = h4Var.f118874b;
                re4.e eVar2 = (re4.e) h4Var.u.get();
                PluginFlowContract$Input pluginFlowContract$Input4 = (PluginFlowContract$Input) h4Var.i.get();
                c84.g gVar = (c84.g) h4Var.f118882p.get();
                xa4.a aVar3 = (xa4.a) h4Var.k.get();
                c1 c1Var3 = h4Var.f118875c;
                gte.a aVarB = c1Var3.f118423b.b();
                vc.s.j(aVarB);
                hz3.c cVarB = c1Var3.b();
                xq3.j jVarD = c1Var3.f118428c.d();
                vc.s.j(jVarD);
                mri.w wVarA2 = ((ozl.a) c1Var3.u).a();
                vc.s.j(wVarA2);
                hy3.j jVar = (hy3.j) c1Var3.Q1.get();
                vie.i iVarB = c1Var3.z.b();
                vc.s.j(iVarB);
                return new com.revolut.feature.credit.application.plugins.impl.ui.mortgage_signature.flow.a(mortgageSignatureFlowContract$InputData, eVar2, e5f.b.w(pluginFlowContract$Input4, gVar, aVar3, aVarB, cVarB, jVarD, wVarA2, jVar, iVarB));
            case 15:
                return new re4.e((PluginFlowContract$Input) h4Var.i.get(), (px3.a) c1Var.c2.get());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object h() {
        c1 c1Var = (c1) this.f118806b;
        i4 i4Var = (i4) this.d;
        int i = this.f118807c;
        switch (i) {
            case 0:
                return ige.d.h(i4Var.f118964a, (j60.a) i4Var.f118967g.get());
            case 1:
                return com.revolut.data.database.models.openbanking.d.q(i4Var.f118964a, (com.revolut.kompot.navigable.a) i4Var.e.get(), (rp0.m) i4Var.f.get());
            case 2:
                iq3.a aVar = i4Var.f118964a;
                return new rp0.m();
            case 3:
                return e5f.b.x((c84.z) i4Var.f118974q.get());
            case 4:
                return new c84.z((c84.g) i4Var.f118973p.get(), (rz3.c) c1Var.f118470r1.get(), (PluginFlowContract$Input) i4Var.i.get());
            case 5:
                PluginFlowContract$Input pluginFlowContract$Input = (PluginFlowContract$Input) i4Var.i.get();
                e4m.e eVar = c1Var.f118470r1;
                uq3.b bVar = c1Var.f118428c;
                rz3.c cVar = (rz3.c) eVar.get();
                xa4.a aVar2 = (xa4.a) i4Var.k.get();
                xq3.j jVarH = bVar.h();
                vc.s.j(jVarH);
                mri.w wVarA = ((ozl.a) c1Var.u).a();
                vc.s.j(wVarA);
                ii4.o oVar = (ii4.o) i4Var.o.get();
                aq3.a aVarE = bVar.e();
                vc.s.j(aVarE);
                return new c84.i(pluginFlowContract$Input, cVar, aVar2, jVarH, wVarA, oVar, aVarE);
            case 6:
                PluginFlowContract$Input pluginFlowContract$Input2 = (PluginFlowContract$Input) i4Var.i.get();
                c1 c1Var2 = i4Var.f118966c;
                return new xa4.b(pluginFlowContract$Input2, ImmutableSet.of((ya4.g) new ya4.c(c1Var2.i(), (ya4.f) i4Var.f118969j.get()), (ya4.g) new ya4.c(c1Var2.b(), new py3.g()), (ya4.g) new ya4.c(new py3.c(), (ya4.f) i4Var.f118969j.get()), new ya4.g(new py3.f())));
            case 7:
                rz3.c cVar2 = (rz3.c) c1Var.f118470r1.get();
                xq3.j jVarH2 = c1Var.f118428c.h();
                vc.s.j(jVarH2);
                return new ya4.f(cVar2, jVarH2);
            case 8:
                return new ii4.z((li4.a) i4Var.f118972n.get());
            case 9:
                return new li4.a(ImmutableMap.of(li4.d.class, (li4.b) i4Var.f118970l.get(), li4.e.class, (li4.b) i4Var.f118971m.get()));
            case 10:
                xq3.j jVarH3 = c1Var.f118428c.h();
                vc.s.j(jVarH3);
                return new li4.c(jVarH3);
            case 11:
                uq3.b bVar2 = c1Var.f118428c;
                uq3.b bVar3 = c1Var.f118428c;
                xq3.j jVarH4 = bVar2.h();
                vc.s.j(jVarH4);
                xq3.c cVarF = bVar3.f();
                vc.s.j(cVarF);
                sp3.a aVarM = bVar3.m();
                vc.s.j(aVarM);
                return new ji4.b(jVarH4, cVarF, aVarM, c1Var.i());
            case 12:
                c84.z zVar = (c84.z) i4Var.f118974q.get();
                e5f.b.a(zVar);
                return zVar;
            case 13:
                PluginFlowContract$Input pluginFlowContract$Input3 = (PluginFlowContract$Input) i4Var.i.get();
                xr3.y yVarK = c1Var.f118428c.k();
                vc.s.j(yVarK);
                return new c84.c(pluginFlowContract$Input3, yVarK);
            case 14:
                MortgageSignatureSignedFlowContract$InputData mortgageSignatureSignedFlowContract$InputData = i4Var.f118965b;
                px3.a aVar3 = (px3.a) c1Var.c2.get();
                PluginFlowContract$Input pluginFlowContract$Input4 = (PluginFlowContract$Input) i4Var.i.get();
                c84.g gVar = (c84.g) i4Var.f118973p.get();
                xa4.a aVar4 = (xa4.a) i4Var.k.get();
                c1 c1Var3 = i4Var.f118966c;
                gte.a aVarB = c1Var3.f118423b.b();
                vc.s.j(aVarB);
                hz3.c cVarB = c1Var3.b();
                xq3.j jVarD = c1Var3.f118428c.d();
                vc.s.j(jVarD);
                mri.w wVarA2 = ((ozl.a) c1Var3.u).a();
                vc.s.j(wVarA2);
                hy3.j jVar = (hy3.j) c1Var3.Q1.get();
                vie.i iVarB = c1Var3.z.b();
                vc.s.j(iVarB);
                return new com.revolut.feature.credit.application.plugins.impl.ui.mortgage_signature.signed.b(mortgageSignatureSignedFlowContract$InputData, aVar3, e5f.b.w(pluginFlowContract$Input4, gVar, aVar4, aVarB, cVarB, jVarD, wVarA2, jVar, iVarB));
            default:
                throw new AssertionError(i);
        }
    }

    private final Object i() {
        c1 c1Var = (c1) this.f118806b;
        j4 j4Var = (j4) this.d;
        int i = this.f118807c;
        switch (i) {
            case 0:
                return ige.d.h(j4Var.f119031a, (j60.a) j4Var.f119034g.get());
            case 1:
                return com.revolut.data.database.models.openbanking.d.q(j4Var.f119031a, (com.revolut.kompot.navigable.a) j4Var.e.get(), (rp0.m) j4Var.f.get());
            case 2:
                iq3.a aVar = j4Var.f119031a;
                return new rp0.m();
            case 3:
                return e5f.b.x((c84.z) j4Var.f119040p.get());
            case 4:
                return new c84.z((c84.g) j4Var.o.get(), (rz3.c) c1Var.f118470r1.get(), j4Var.f119032b);
            case 5:
                MortgageValuationFlowContract$InputData mortgageValuationFlowContract$InputData = j4Var.f119032b;
                e4m.e eVar = c1Var.f118470r1;
                uq3.b bVar = c1Var.f118428c;
                rz3.c cVar = (rz3.c) eVar.get();
                xa4.a aVar2 = (xa4.a) j4Var.f119036j.get();
                xq3.j jVarH = bVar.h();
                vc.s.j(jVarH);
                mri.w wVarA = ((ozl.a) c1Var.u).a();
                vc.s.j(wVarA);
                ii4.o oVar = (ii4.o) j4Var.f119039n.get();
                aq3.a aVarE = bVar.e();
                vc.s.j(aVarE);
                return new c84.i(mortgageValuationFlowContract$InputData, cVar, aVar2, jVarH, wVarA, oVar, aVarE);
            case 6:
                MortgageValuationFlowContract$InputData mortgageValuationFlowContract$InputData2 = j4Var.f119032b;
                c1 c1Var2 = j4Var.f119033c;
                return new xa4.b(mortgageValuationFlowContract$InputData2, ImmutableSet.of((ya4.g) new ya4.c(c1Var2.i(), (ya4.f) j4Var.i.get()), (ya4.g) new ya4.c(c1Var2.b(), new py3.g()), (ya4.g) new ya4.c(new py3.c(), (ya4.f) j4Var.i.get()), new ya4.g(new py3.f())));
            case 7:
                rz3.c cVar2 = (rz3.c) c1Var.f118470r1.get();
                xq3.j jVarH2 = c1Var.f118428c.h();
                vc.s.j(jVarH2);
                return new ya4.f(cVar2, jVarH2);
            case 8:
                return new ii4.z((li4.a) j4Var.f119038m.get());
            case 9:
                return new li4.a(ImmutableMap.of(li4.d.class, (li4.b) j4Var.k.get(), li4.e.class, (li4.b) j4Var.f119037l.get()));
            case 10:
                xq3.j jVarH3 = c1Var.f118428c.h();
                vc.s.j(jVarH3);
                return new li4.c(jVarH3);
            case 11:
                uq3.b bVar2 = c1Var.f118428c;
                uq3.b bVar3 = c1Var.f118428c;
                xq3.j jVarH4 = bVar2.h();
                vc.s.j(jVarH4);
                xq3.c cVarF = bVar3.f();
                vc.s.j(cVarF);
                sp3.a aVarM = bVar3.m();
                vc.s.j(aVarM);
                return new ji4.b(jVarH4, cVarF, aVarM, c1Var.i());
            case 12:
                c84.z zVar = (c84.z) j4Var.f119040p.get();
                e5f.b.a(zVar);
                return zVar;
            case 13:
                MortgageValuationFlowContract$InputData mortgageValuationFlowContract$InputData3 = j4Var.f119032b;
                xr3.y yVarK = c1Var.f118428c.k();
                vc.s.j(yVarK);
                return new c84.c(mortgageValuationFlowContract$InputData3, yVarK);
            case 14:
                MortgageValuationFlowContract$InputData mortgageValuationFlowContract$InputData4 = j4Var.f119032b;
                c84.g gVar = (c84.g) j4Var.o.get();
                xa4.a aVar3 = (xa4.a) j4Var.f119036j.get();
                c1 c1Var3 = j4Var.f119033c;
                gte.a aVarB = c1Var3.f118423b.b();
                vc.s.j(aVarB);
                hz3.c cVarB = c1Var3.b();
                xq3.j jVarD = c1Var3.f118428c.d();
                vc.s.j(jVarD);
                mri.w wVarA2 = ((ozl.a) c1Var3.u).a();
                vc.s.j(wVarA2);
                hy3.j jVar = (hy3.j) c1Var3.Q1.get();
                vie.i iVarB = c1Var3.z.b();
                vc.s.j(iVarB);
                return new com.revolut.feature.credit.application.plugins.impl.ui.mortgage_valuation.flow.a(mortgageValuationFlowContract$InputData4, e5f.b.w(mortgageValuationFlowContract$InputData4, gVar, aVar3, aVarB, cVarB, jVarD, wVarA2, jVar, iVarB));
            default:
                throw new AssertionError(i);
        }
    }

    private final Object j() {
        int i = this.f118807c;
        if (i == 0) {
            return new fz4.l(((s41.a) ((c1) this.f118806b).f118485x).d(), new xy4.b(), (jki.p) ((m4) this.d).f119276b.get());
        }
        if (i == 1) {
            return new fz4.m();
        }
        throw new AssertionError(i);
    }

    private final Object k() {
        c1 c1Var = (c1) this.f118806b;
        n4 n4Var = (n4) this.d;
        int i = this.f118807c;
        switch (i) {
            case 0:
                return ige.d.h(n4Var.f119337a, (j60.a) n4Var.f119340g.get());
            case 1:
                return com.revolut.data.database.models.openbanking.d.q(n4Var.f119337a, (com.revolut.kompot.navigable.a) n4Var.e.get(), (rp0.m) n4Var.f.get());
            case 2:
                iq3.a aVar = n4Var.f119337a;
                return new rp0.m();
            case 3:
                return e5f.b.x((c84.z) n4Var.f119347q.get());
            case 4:
                return new c84.z((c84.g) n4Var.f119346p.get(), (rz3.c) c1Var.f118470r1.get(), (PluginFlowContract$Input) n4Var.i.get());
            case 5:
                PluginFlowContract$Input pluginFlowContract$Input = (PluginFlowContract$Input) n4Var.i.get();
                e4m.e eVar = c1Var.f118470r1;
                uq3.b bVar = c1Var.f118428c;
                rz3.c cVar = (rz3.c) eVar.get();
                xa4.a aVar2 = (xa4.a) n4Var.k.get();
                xq3.j jVarH = bVar.h();
                vc.s.j(jVarH);
                mri.w wVarA = ((ozl.a) c1Var.u).a();
                vc.s.j(wVarA);
                ii4.o oVar = (ii4.o) n4Var.o.get();
                aq3.a aVarE = bVar.e();
                vc.s.j(aVarE);
                return new c84.i(pluginFlowContract$Input, cVar, aVar2, jVarH, wVarA, oVar, aVarE);
            case 6:
                PluginFlowContract$Input pluginFlowContract$Input2 = (PluginFlowContract$Input) n4Var.i.get();
                c1 c1Var2 = n4Var.f119339c;
                return new xa4.b(pluginFlowContract$Input2, ImmutableSet.of((ya4.g) new ya4.c(c1Var2.i(), (ya4.f) n4Var.f119342j.get()), (ya4.g) new ya4.c(c1Var2.b(), new py3.g()), (ya4.g) new ya4.c(new py3.c(), (ya4.f) n4Var.f119342j.get()), new ya4.g(new py3.f())));
            case 7:
                rz3.c cVar2 = (rz3.c) c1Var.f118470r1.get();
                xq3.j jVarH2 = c1Var.f118428c.h();
                vc.s.j(jVarH2);
                return new ya4.f(cVar2, jVarH2);
            case 8:
                return new ii4.z((li4.a) n4Var.f119345n.get());
            case 9:
                return new li4.a(ImmutableMap.of(li4.d.class, (li4.b) n4Var.f119343l.get(), li4.e.class, (li4.b) n4Var.f119344m.get()));
            case 10:
                xq3.j jVarH3 = c1Var.f118428c.h();
                vc.s.j(jVarH3);
                return new li4.c(jVarH3);
            case 11:
                uq3.b bVar2 = c1Var.f118428c;
                uq3.b bVar3 = c1Var.f118428c;
                xq3.j jVarH4 = bVar2.h();
                vc.s.j(jVarH4);
                xq3.c cVarF = bVar3.f();
                vc.s.j(cVarF);
                sp3.a aVarM = bVar3.m();
                vc.s.j(aVarM);
                return new ji4.b(jVarH4, cVarF, aVarM, c1Var.i());
            case 12:
                c84.z zVar = (c84.z) n4Var.f119347q.get();
                e5f.b.a(zVar);
                return zVar;
            case 13:
                PluginFlowContract$Input pluginFlowContract$Input3 = (PluginFlowContract$Input) n4Var.i.get();
                xr3.y yVarK = c1Var.f118428c.k();
                vc.s.j(yVarK);
                return new c84.c(pluginFlowContract$Input3, yVarK);
            case 14:
                OfferFlowContract$InputData offerFlowContract$InputData = n4Var.f119338b;
                rx3.b bVar4 = (rx3.b) c1Var.i2.get();
                ff4.t tVar = (ff4.t) n4Var.v.get();
                sp3.a aVarM2 = c1Var.f118428c.m();
                vc.s.j(aVarM2);
                wli.x xVarD = ((s41.a) c1Var.f118485x).d();
                hw3.c cVar3 = (hw3.c) c1Var.f118472s0.get();
                PluginFlowContract$Input pluginFlowContract$Input4 = (PluginFlowContract$Input) n4Var.i.get();
                c84.g gVar = (c84.g) n4Var.f119346p.get();
                xa4.a aVar3 = (xa4.a) n4Var.k.get();
                c1 c1Var3 = n4Var.f119339c;
                gte.a aVarB = c1Var3.f118423b.b();
                vc.s.j(aVarB);
                hz3.c cVarB = c1Var3.b();
                xq3.j jVarD = c1Var3.f118428c.d();
                vc.s.j(jVarD);
                mri.w wVarA2 = ((ozl.a) c1Var3.u).a();
                vc.s.j(wVarA2);
                hy3.j jVar = (hy3.j) c1Var3.Q1.get();
                vie.i iVarB = c1Var3.z.b();
                vc.s.j(iVarB);
                return new com.revolut.feature.credit.application.plugins.impl.ui.offer.e(offerFlowContract$InputData, bVar4, tVar, aVarM2, xVarD, cVar3, e5f.b.w(pluginFlowContract$Input4, gVar, aVar3, aVarB, cVarB, jVarD, wVarA2, jVar, iVarB));
            case 15:
                hw3.c cVar4 = (hw3.c) c1Var.f118472s0.get();
                ha3.f fVarD = c1Var.f118474t.d();
                vc.s.j(fVarD);
                return new cf4.b(cVar4, fVarD, (ne0.j) n4Var.u.get());
            case 16:
                lf4.b.Companion.getClass();
                return new ne0.d();
            default:
                throw new AssertionError(i);
        }
    }

    private final Object l() {
        c1 c1Var = (c1) this.f118806b;
        q4 q4Var = (q4) this.d;
        int i = this.f118807c;
        switch (i) {
            case 0:
                return ige.d.h(q4Var.f119566a, (j60.a) q4Var.f119569g.get());
            case 1:
                return com.revolut.data.database.models.openbanking.d.q(q4Var.f119566a, (com.revolut.kompot.navigable.a) q4Var.e.get(), (rp0.m) q4Var.f.get());
            case 2:
                iq3.a aVar = q4Var.f119566a;
                return new rp0.m();
            case 3:
                return e5f.b.x((c84.z) q4Var.f119576q.get());
            case 4:
                return new c84.z((c84.g) q4Var.f119575p.get(), (rz3.c) c1Var.f118470r1.get(), (PluginFlowContract$Input) q4Var.i.get());
            case 5:
                PluginFlowContract$Input pluginFlowContract$Input = (PluginFlowContract$Input) q4Var.i.get();
                e4m.e eVar = c1Var.f118470r1;
                uq3.b bVar = c1Var.f118428c;
                rz3.c cVar = (rz3.c) eVar.get();
                xa4.a aVar2 = (xa4.a) q4Var.k.get();
                xq3.j jVarH = bVar.h();
                vc.s.j(jVarH);
                mri.w wVarA = ((ozl.a) c1Var.u).a();
                vc.s.j(wVarA);
                ii4.o oVar = (ii4.o) q4Var.o.get();
                aq3.a aVarE = bVar.e();
                vc.s.j(aVarE);
                return new c84.i(pluginFlowContract$Input, cVar, aVar2, jVarH, wVarA, oVar, aVarE);
            case 6:
                PluginFlowContract$Input pluginFlowContract$Input2 = (PluginFlowContract$Input) q4Var.i.get();
                c1 c1Var2 = q4Var.f119568c;
                return new xa4.b(pluginFlowContract$Input2, ImmutableSet.of((ya4.g) new ya4.c(c1Var2.i(), (ya4.f) q4Var.f119571j.get()), (ya4.g) new ya4.c(c1Var2.b(), new py3.g()), (ya4.g) new ya4.c(new py3.c(), (ya4.f) q4Var.f119571j.get()), new ya4.g(new py3.f())));
            case 7:
                rz3.c cVar2 = (rz3.c) c1Var.f118470r1.get();
                xq3.j jVarH2 = c1Var.f118428c.h();
                vc.s.j(jVarH2);
                return new ya4.f(cVar2, jVarH2);
            case 8:
                return new ii4.z((li4.a) q4Var.f119574n.get());
            case 9:
                return new li4.a(ImmutableMap.of(li4.d.class, (li4.b) q4Var.f119572l.get(), li4.e.class, (li4.b) q4Var.f119573m.get()));
            case 10:
                xq3.j jVarH3 = c1Var.f118428c.h();
                vc.s.j(jVarH3);
                return new li4.c(jVarH3);
            case 11:
                uq3.b bVar2 = c1Var.f118428c;
                uq3.b bVar3 = c1Var.f118428c;
                xq3.j jVarH4 = bVar2.h();
                vc.s.j(jVarH4);
                xq3.c cVarF = bVar3.f();
                vc.s.j(cVarF);
                sp3.a aVarM = bVar3.m();
                vc.s.j(aVarM);
                return new ji4.b(jVarH4, cVarF, aVarM, c1Var.i());
            case 12:
                return kxa.j.m((j60.a) q4Var.f119579t.get());
            case 13:
                return wp5.y.r((com.revolut.kompot.navigable.a) q4Var.e.get(), (rp0.m) q4Var.f119578s.get());
            case 14:
                return new rp0.m();
            case 15:
                c84.z zVar = (c84.z) q4Var.f119576q.get();
                e5f.b.a(zVar);
                return zVar;
            case 16:
                PluginFlowContract$Input pluginFlowContract$Input3 = (PluginFlowContract$Input) q4Var.i.get();
                xr3.y yVarK = c1Var.f118428c.k();
                vc.s.j(yVarK);
                return new c84.c(pluginFlowContract$Input3, yVarK);
            case 17:
                return new mf4.c((rx3.b) c1Var.i2.get(), (PluginFlowContract$Input) q4Var.i.get());
            case 18:
                OfferV2FlowContract$InputData offerV2FlowContract$InputData = q4Var.f119567b;
                c1 c1Var3 = q4Var.f119568c;
                mf4.e eVar2 = (mf4.e) q4Var.f119582y.get();
                f64.a aVar3 = new f64.a();
                j60.a aVar4 = (j60.a) q4Var.f119579t.get();
                mf4.a aVar5 = (mf4.a) q4Var.f119581x.get();
                zja.a aVarA = ((ika.b) c1Var3.L).a();
                vc.s.j(aVarA);
                wx4.b bVar4 = new wx4.b(aVarA);
                PluginFlowContract$Input pluginFlowContract$Input4 = (PluginFlowContract$Input) q4Var.i.get();
                c84.g gVar = (c84.g) q4Var.f119575p.get();
                xa4.a aVar6 = (xa4.a) q4Var.k.get();
                gte.a aVarB = c1Var3.f118423b.b();
                vc.s.j(aVarB);
                hz3.c cVarB = c1Var3.b();
                xq3.j jVarD = c1Var3.f118428c.d();
                vc.s.j(jVarD);
                mri.w wVarA2 = ((ozl.a) c1Var3.u).a();
                vc.s.j(wVarA2);
                hy3.j jVar = (hy3.j) c1Var3.Q1.get();
                vie.i iVarB = c1Var3.z.b();
                vc.s.j(iVarB);
                return new com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.g(offerV2FlowContract$InputData, eVar2, aVar3, aVar4, aVar5, bVar4, e5f.b.w(pluginFlowContract$Input4, gVar, aVar6, aVarB, cVarB, jVarD, wVarA2, jVar, iVarB));
            case 19:
                sx3.a aVar7 = (sx3.a) c1Var.f118451k2.get();
                sp3.a aVarM2 = c1Var.f118428c.m();
                vc.s.j(aVarM2);
                return new mf4.a0(aVar7, aVarM2, q4Var.f119567b);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object m() {
        c1 c1Var = (c1) this.f118806b;
        s4 s4Var = (s4) this.d;
        int i = this.f118807c;
        switch (i) {
            case 0:
                return ige.d.h(s4Var.f119749a, (j60.a) s4Var.f119752g.get());
            case 1:
                return com.revolut.data.database.models.openbanking.d.q(s4Var.f119749a, (com.revolut.kompot.navigable.a) s4Var.e.get(), (rp0.m) s4Var.f.get());
            case 2:
                iq3.a aVar = s4Var.f119749a;
                return new rp0.m();
            case 3:
                return e5f.b.x((c84.z) s4Var.f119759q.get());
            case 4:
                return new c84.z((c84.g) s4Var.f119758p.get(), (rz3.c) c1Var.f118470r1.get(), (PluginFlowContract$Input) s4Var.i.get());
            case 5:
                PluginFlowContract$Input pluginFlowContract$Input = (PluginFlowContract$Input) s4Var.i.get();
                e4m.e eVar = c1Var.f118470r1;
                uq3.b bVar = c1Var.f118428c;
                rz3.c cVar = (rz3.c) eVar.get();
                xa4.a aVar2 = (xa4.a) s4Var.k.get();
                xq3.j jVarH = bVar.h();
                vc.s.j(jVarH);
                mri.w wVarA = ((ozl.a) c1Var.u).a();
                vc.s.j(wVarA);
                ii4.o oVar = (ii4.o) s4Var.o.get();
                aq3.a aVarE = bVar.e();
                vc.s.j(aVarE);
                return new c84.i(pluginFlowContract$Input, cVar, aVar2, jVarH, wVarA, oVar, aVarE);
            case 6:
                PluginFlowContract$Input pluginFlowContract$Input2 = (PluginFlowContract$Input) s4Var.i.get();
                c1 c1Var2 = s4Var.f119751c;
                return new xa4.b(pluginFlowContract$Input2, ImmutableSet.of((ya4.g) new ya4.c(c1Var2.i(), (ya4.f) s4Var.f119754j.get()), (ya4.g) new ya4.c(c1Var2.b(), new py3.g()), (ya4.g) new ya4.c(new py3.c(), (ya4.f) s4Var.f119754j.get()), new ya4.g(new py3.f())));
            case 7:
                rz3.c cVar2 = (rz3.c) c1Var.f118470r1.get();
                xq3.j jVarH2 = c1Var.f118428c.h();
                vc.s.j(jVarH2);
                return new ya4.f(cVar2, jVarH2);
            case 8:
                return new ii4.z((li4.a) s4Var.f119757n.get());
            case 9:
                return new li4.a(ImmutableMap.of(li4.d.class, (li4.b) s4Var.f119755l.get(), li4.e.class, (li4.b) s4Var.f119756m.get()));
            case 10:
                xq3.j jVarH3 = c1Var.f118428c.h();
                vc.s.j(jVarH3);
                return new li4.c(jVarH3);
            case 11:
                uq3.b bVar2 = c1Var.f118428c;
                uq3.b bVar3 = c1Var.f118428c;
                xq3.j jVarH4 = bVar2.h();
                vc.s.j(jVarH4);
                xq3.c cVarF = bVar3.f();
                vc.s.j(cVarF);
                sp3.a aVarM = bVar3.m();
                vc.s.j(aVarM);
                return new ji4.b(jVarH4, cVarF, aVarM, c1Var.i());
            case 12:
                Object extension = (j60.a) s4Var.f119762t.get();
                Intrinsics.checkNotNullParameter(extension, "extension");
                yji.d dVar = (yji.d) extension;
                vc.s.k(dVar);
                return dVar;
            case 13:
                com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) s4Var.e.get();
                rp0.m dialogDisplayer = (rp0.m) s4Var.f119761s.get();
                he2.b dialogHostFinder = kxa.j.o(new nji.b());
                Intrinsics.checkNotNullParameter(controller, "controller");
                Intrinsics.checkNotNullParameter(dialogDisplayer, "dialogDisplayer");
                Intrinsics.checkNotNullParameter(dialogHostFinder, "dialogHostFinder");
                return new j60.c(controller, dialogDisplayer, dialogHostFinder);
            case 14:
                return new rp0.m();
            case 15:
                c84.z zVar = (c84.z) s4Var.f119759q.get();
                e5f.b.a(zVar);
                return zVar;
            case 16:
                PluginFlowContract$Input pluginFlowContract$Input3 = (PluginFlowContract$Input) s4Var.i.get();
                xr3.y yVarK = c1Var.f118428c.k();
                vc.s.j(yVarK);
                return new c84.c(pluginFlowContract$Input3, yVarK);
            case 17:
                z84.a aVar3 = new z84.a();
                ww3.c cVar3 = (ww3.c) c1Var.f118435e1.get();
                wsg.n nVarB = c1Var.f118452l.b();
                OutstandingDebtsFlowContract$InputData outstandingDebtsFlowContract$InputData = s4Var.f119750b;
                j60.a aVar4 = (j60.a) s4Var.f119762t.get();
                PluginFlowContract$Input pluginFlowContract$Input4 = (PluginFlowContract$Input) s4Var.i.get();
                c84.g gVar = (c84.g) s4Var.f119758p.get();
                xa4.a aVar5 = (xa4.a) s4Var.k.get();
                c1 c1Var3 = s4Var.f119751c;
                gte.a aVarB = c1Var3.f118423b.b();
                vc.s.j(aVarB);
                hz3.c cVarB = c1Var3.b();
                xq3.j jVarD = c1Var3.f118428c.d();
                vc.s.j(jVarD);
                mri.w wVarA2 = ((ozl.a) c1Var3.u).a();
                vc.s.j(wVarA2);
                hy3.j jVar = (hy3.j) c1Var3.Q1.get();
                vie.i iVarB = c1Var3.z.b();
                vc.s.j(iVarB);
                return new com.revolut.feature.credit.application.plugins.impl.ui.debts.c(aVar3, cVar3, nVarB, outstandingDebtsFlowContract$InputData, aVar4, e5f.b.w(pluginFlowContract$Input4, gVar, aVar5, aVarB, cVarB, jVarD, wVarA2, jVar, iVarB));
            default:
                throw new AssertionError(i);
        }
    }

    private final Object n() {
        c1 c1Var = (c1) this.f118806b;
        t4 t4Var = (t4) this.d;
        int i = this.f118807c;
        switch (i) {
            case 0:
                return ige.d.h(t4Var.f119831a, (j60.a) t4Var.f119834g.get());
            case 1:
                return com.revolut.data.database.models.openbanking.d.q(t4Var.f119831a, (com.revolut.kompot.navigable.a) t4Var.e.get(), (rp0.m) t4Var.f.get());
            case 2:
                iq3.a aVar = t4Var.f119831a;
                return new rp0.m();
            case 3:
                return e5f.b.x((c84.z) t4Var.f119841q.get());
            case 4:
                return new c84.z((c84.g) t4Var.f119840p.get(), (rz3.c) c1Var.f118470r1.get(), (PluginFlowContract$Input) t4Var.i.get());
            case 5:
                PluginFlowContract$Input pluginFlowContract$Input = (PluginFlowContract$Input) t4Var.i.get();
                e4m.e eVar = c1Var.f118470r1;
                uq3.b bVar = c1Var.f118428c;
                rz3.c cVar = (rz3.c) eVar.get();
                xa4.a aVar2 = (xa4.a) t4Var.k.get();
                xq3.j jVarH = bVar.h();
                vc.s.j(jVarH);
                mri.w wVarA = ((ozl.a) c1Var.u).a();
                vc.s.j(wVarA);
                ii4.o oVar = (ii4.o) t4Var.o.get();
                aq3.a aVarE = bVar.e();
                vc.s.j(aVarE);
                return new c84.i(pluginFlowContract$Input, cVar, aVar2, jVarH, wVarA, oVar, aVarE);
            case 6:
                PluginFlowContract$Input pluginFlowContract$Input2 = (PluginFlowContract$Input) t4Var.i.get();
                c1 c1Var2 = t4Var.f119833c;
                return new xa4.b(pluginFlowContract$Input2, ImmutableSet.of((ya4.g) new ya4.c(c1Var2.i(), (ya4.f) t4Var.f119836j.get()), (ya4.g) new ya4.c(c1Var2.b(), new py3.g()), (ya4.g) new ya4.c(new py3.c(), (ya4.f) t4Var.f119836j.get()), new ya4.g(new py3.f())));
            case 7:
                rz3.c cVar2 = (rz3.c) c1Var.f118470r1.get();
                xq3.j jVarH2 = c1Var.f118428c.h();
                vc.s.j(jVarH2);
                return new ya4.f(cVar2, jVarH2);
            case 8:
                return new ii4.z((li4.a) t4Var.f119839n.get());
            case 9:
                return new li4.a(ImmutableMap.of(li4.d.class, (li4.b) t4Var.f119837l.get(), li4.e.class, (li4.b) t4Var.f119838m.get()));
            case 10:
                xq3.j jVarH3 = c1Var.f118428c.h();
                vc.s.j(jVarH3);
                return new li4.c(jVarH3);
            case 11:
                uq3.b bVar2 = c1Var.f118428c;
                uq3.b bVar3 = c1Var.f118428c;
                xq3.j jVarH4 = bVar2.h();
                vc.s.j(jVarH4);
                xq3.c cVarF = bVar3.f();
                vc.s.j(cVarF);
                sp3.a aVarM = bVar3.m();
                vc.s.j(aVarM);
                return new ji4.b(jVarH4, cVarF, aVarM, c1Var.i());
            case 12:
                a94.k debtsControllerModelExtension = (a94.k) t4Var.f119843s.get();
                d94.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(debtsControllerModelExtension, "debtsControllerModelExtension");
                vc.s.k(debtsControllerModelExtension);
                return debtsControllerModelExtension;
            case 13:
                OutstandingDebtsV2FlowContract$InputData inputData = t4Var.f119832b;
                xw3.a interactor = (xw3.a) c1Var.f118445h1.get();
                d94.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(inputData, "inputData");
                Intrinsics.checkNotNullParameter(interactor, "interactor");
                return new a94.k(inputData.k8(), interactor);
            case 14:
                c84.z zVar = (c84.z) t4Var.f119841q.get();
                e5f.b.a(zVar);
                return zVar;
            case 15:
                PluginFlowContract$Input pluginFlowContract$Input3 = (PluginFlowContract$Input) t4Var.i.get();
                xr3.y yVarK = c1Var.f118428c.k();
                vc.s.j(yVarK);
                return new c84.c(pluginFlowContract$Input3, yVarK);
            case 16:
                OutstandingDebtsV2FlowContract$InputData outstandingDebtsV2FlowContract$InputData = t4Var.f119832b;
                PluginFlowContract$Input pluginFlowContract$Input4 = (PluginFlowContract$Input) t4Var.i.get();
                c84.g gVar = (c84.g) t4Var.f119840p.get();
                xa4.a aVar3 = (xa4.a) t4Var.k.get();
                c1 c1Var3 = t4Var.f119833c;
                gte.a aVarB = c1Var3.f118423b.b();
                vc.s.j(aVarB);
                hz3.c cVarB = c1Var3.b();
                xq3.j jVarD = c1Var3.f118428c.d();
                vc.s.j(jVarD);
                mri.w wVarA2 = ((ozl.a) c1Var3.u).a();
                vc.s.j(wVarA2);
                hy3.j jVar = (hy3.j) c1Var3.Q1.get();
                vie.i iVarB = c1Var3.z.b();
                vc.s.j(iVarB);
                return new com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.b(outstandingDebtsV2FlowContract$InputData, e5f.b.w(pluginFlowContract$Input4, gVar, aVar3, aVarB, cVarB, jVarD, wVarA2, jVar, iVarB), (hw3.c) c1Var.f118472s0.get(), (xw3.a) c1Var.f118445h1.get(), new a94.d(), new a94.a(new com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.details.b()), c1Var.f118452l.b());
            case 17:
                return new xw3.b(t4Var.f119832b, (xw3.a) c1Var.f118445h1.get());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object o() {
        c1 c1Var = (c1) this.f118806b;
        u4 u4Var = (u4) this.d;
        int i = this.f118807c;
        switch (i) {
            case 0:
                return ige.d.h(u4Var.f119904a, (j60.a) u4Var.f119907g.get());
            case 1:
                return com.revolut.data.database.models.openbanking.d.q(u4Var.f119904a, (com.revolut.kompot.navigable.a) u4Var.e.get(), (rp0.m) u4Var.f.get());
            case 2:
                iq3.a aVar = u4Var.f119904a;
                return new rp0.m();
            case 3:
                return e5f.b.x((c84.z) u4Var.f119914q.get());
            case 4:
                return new c84.z((c84.g) u4Var.f119913p.get(), (rz3.c) c1Var.f118470r1.get(), (PluginFlowContract$Input) u4Var.i.get());
            case 5:
                PluginFlowContract$Input pluginFlowContract$Input = (PluginFlowContract$Input) u4Var.i.get();
                e4m.e eVar = c1Var.f118470r1;
                uq3.b bVar = c1Var.f118428c;
                rz3.c cVar = (rz3.c) eVar.get();
                xa4.a aVar2 = (xa4.a) u4Var.k.get();
                xq3.j jVarH = bVar.h();
                vc.s.j(jVarH);
                mri.w wVarA = ((ozl.a) c1Var.u).a();
                vc.s.j(wVarA);
                ii4.o oVar = (ii4.o) u4Var.o.get();
                aq3.a aVarE = bVar.e();
                vc.s.j(aVarE);
                return new c84.i(pluginFlowContract$Input, cVar, aVar2, jVarH, wVarA, oVar, aVarE);
            case 6:
                PluginFlowContract$Input pluginFlowContract$Input2 = (PluginFlowContract$Input) u4Var.i.get();
                c1 c1Var2 = u4Var.f119906c;
                return new xa4.b(pluginFlowContract$Input2, ImmutableSet.of((ya4.g) new ya4.c(c1Var2.i(), (ya4.f) u4Var.f119909j.get()), (ya4.g) new ya4.c(c1Var2.b(), new py3.g()), (ya4.g) new ya4.c(new py3.c(), (ya4.f) u4Var.f119909j.get()), new ya4.g(new py3.f())));
            case 7:
                rz3.c cVar2 = (rz3.c) c1Var.f118470r1.get();
                xq3.j jVarH2 = c1Var.f118428c.h();
                vc.s.j(jVarH2);
                return new ya4.f(cVar2, jVarH2);
            case 8:
                return new ii4.z((li4.a) u4Var.f119912n.get());
            case 9:
                return new li4.a(ImmutableMap.of(li4.d.class, (li4.b) u4Var.f119910l.get(), li4.e.class, (li4.b) u4Var.f119911m.get()));
            case 10:
                xq3.j jVarH3 = c1Var.f118428c.h();
                vc.s.j(jVarH3);
                return new li4.c(jVarH3);
            case 11:
                uq3.b bVar2 = c1Var.f118428c;
                uq3.b bVar3 = c1Var.f118428c;
                xq3.j jVarH4 = bVar2.h();
                vc.s.j(jVarH4);
                xq3.c cVarF = bVar3.f();
                vc.s.j(cVarF);
                sp3.a aVarM = bVar3.m();
                vc.s.j(aVarM);
                return new ji4.b(jVarH4, cVarF, aVarM, c1Var.i());
            case 12:
                c84.z zVar = (c84.z) u4Var.f119914q.get();
                e5f.b.a(zVar);
                return zVar;
            case 13:
                PluginFlowContract$Input pluginFlowContract$Input3 = (PluginFlowContract$Input) u4Var.i.get();
                xr3.y yVarK = c1Var.f118428c.k();
                vc.s.j(yVarK);
                return new c84.c(pluginFlowContract$Input3, yVarK);
            case 14:
                OutstandingDebtsV3FlowContract$InputData outstandingDebtsV3FlowContract$InputData = u4Var.f119905b;
                yw3.a aVar3 = (yw3.a) c1Var.w3.get();
                PluginFlowContract$Input pluginFlowContract$Input4 = (PluginFlowContract$Input) u4Var.i.get();
                c84.g gVar = (c84.g) u4Var.f119913p.get();
                xa4.a aVar4 = (xa4.a) u4Var.k.get();
                c1 c1Var3 = u4Var.f119906c;
                gte.a aVarB = c1Var3.f118423b.b();
                vc.s.j(aVarB);
                hz3.c cVarB = c1Var3.b();
                xq3.j jVarD = c1Var3.f118428c.d();
                vc.s.j(jVarD);
                mri.w wVarA2 = ((ozl.a) c1Var3.u).a();
                vc.s.j(wVarA2);
                hy3.j jVar = (hy3.j) c1Var3.Q1.get();
                vie.i iVarB = c1Var3.z.b();
                vc.s.j(iVarB);
                return new com.revolut.feature.credit.application.plugins.impl.ui.debts_v3.flow.e(outstandingDebtsV3FlowContract$InputData, aVar3, e5f.b.w(pluginFlowContract$Input4, gVar, aVar4, aVarB, cVarB, jVarD, wVarA2, jVar, iVarB));
            default:
                throw new AssertionError(i);
        }
    }

    private final Object p() {
        c1 c1Var = (c1) this.f118806b;
        v4 v4Var = (v4) this.d;
        int i = this.f118807c;
        switch (i) {
            case 0:
                return ige.d.h(v4Var.f119987a, (j60.a) v4Var.f119990g.get());
            case 1:
                return com.revolut.data.database.models.openbanking.d.q(v4Var.f119987a, (com.revolut.kompot.navigable.a) v4Var.e.get(), (rp0.m) v4Var.f.get());
            case 2:
                iq3.a aVar = v4Var.f119987a;
                return new rp0.m();
            case 3:
                return e5f.b.x((c84.z) v4Var.f119997q.get());
            case 4:
                return new c84.z((c84.g) v4Var.f119996p.get(), (rz3.c) c1Var.f118470r1.get(), (PluginFlowContract$Input) v4Var.i.get());
            case 5:
                PluginFlowContract$Input pluginFlowContract$Input = (PluginFlowContract$Input) v4Var.i.get();
                e4m.e eVar = c1Var.f118470r1;
                uq3.b bVar = c1Var.f118428c;
                rz3.c cVar = (rz3.c) eVar.get();
                xa4.a aVar2 = (xa4.a) v4Var.k.get();
                xq3.j jVarH = bVar.h();
                vc.s.j(jVarH);
                mri.w wVarA = ((ozl.a) c1Var.u).a();
                vc.s.j(wVarA);
                ii4.o oVar = (ii4.o) v4Var.o.get();
                aq3.a aVarE = bVar.e();
                vc.s.j(aVarE);
                return new c84.i(pluginFlowContract$Input, cVar, aVar2, jVarH, wVarA, oVar, aVarE);
            case 6:
                PluginFlowContract$Input pluginFlowContract$Input2 = (PluginFlowContract$Input) v4Var.i.get();
                c1 c1Var2 = v4Var.f119989c;
                return new xa4.b(pluginFlowContract$Input2, ImmutableSet.of((ya4.g) new ya4.c(c1Var2.i(), (ya4.f) v4Var.f119992j.get()), (ya4.g) new ya4.c(c1Var2.b(), new py3.g()), (ya4.g) new ya4.c(new py3.c(), (ya4.f) v4Var.f119992j.get()), new ya4.g(new py3.f())));
            case 7:
                rz3.c cVar2 = (rz3.c) c1Var.f118470r1.get();
                xq3.j jVarH2 = c1Var.f118428c.h();
                vc.s.j(jVarH2);
                return new ya4.f(cVar2, jVarH2);
            case 8:
                return new ii4.z((li4.a) v4Var.f119995n.get());
            case 9:
                return new li4.a(ImmutableMap.of(li4.d.class, (li4.b) v4Var.f119993l.get(), li4.e.class, (li4.b) v4Var.f119994m.get()));
            case 10:
                xq3.j jVarH3 = c1Var.f118428c.h();
                vc.s.j(jVarH3);
                return new li4.c(jVarH3);
            case 11:
                uq3.b bVar2 = c1Var.f118428c;
                uq3.b bVar3 = c1Var.f118428c;
                xq3.j jVarH4 = bVar2.h();
                vc.s.j(jVarH4);
                xq3.c cVarF = bVar3.f();
                vc.s.j(cVarF);
                sp3.a aVarM = bVar3.m();
                vc.s.j(aVarM);
                return new ji4.b(jVarH4, cVarF, aVarM, c1Var.i());
            case 12:
                c84.z zVar = (c84.z) v4Var.f119997q.get();
                e5f.b.a(zVar);
                return zVar;
            case 13:
                PluginFlowContract$Input pluginFlowContract$Input3 = (PluginFlowContract$Input) v4Var.i.get();
                xr3.y yVarK = c1Var.f118428c.k();
                vc.s.j(yVarK);
                return new c84.c(pluginFlowContract$Input3, yVarK);
            case 14:
                OverdraftOfferFlowContract$InputData overdraftOfferFlowContract$InputData = v4Var.f119988b;
                com.revolut.feature.credit.application.plugins.impl.ui.overdraft_offer.a aVar3 = (com.revolut.feature.credit.application.plugins.impl.ui.overdraft_offer.a) v4Var.u.get();
                rx3.a aVar4 = (rx3.a) c1Var.f118473s1.get();
                PluginFlowContract$Input pluginFlowContract$Input4 = (PluginFlowContract$Input) v4Var.i.get();
                c84.g gVar = (c84.g) v4Var.f119996p.get();
                xa4.a aVar5 = (xa4.a) v4Var.k.get();
                c1 c1Var3 = v4Var.f119989c;
                gte.a aVarB = c1Var3.f118423b.b();
                vc.s.j(aVarB);
                hz3.c cVarB = c1Var3.b();
                xq3.j jVarD = c1Var3.f118428c.d();
                vc.s.j(jVarD);
                mri.w wVarA2 = ((ozl.a) c1Var3.u).a();
                vc.s.j(wVarA2);
                hy3.j jVar = (hy3.j) c1Var3.Q1.get();
                vie.i iVarB = c1Var3.z.b();
                vc.s.j(iVarB);
                return new com.revolut.feature.credit.application.plugins.impl.ui.overdraft_offer.b(overdraftOfferFlowContract$InputData, aVar3, aVar4, e5f.b.w(pluginFlowContract$Input4, gVar, aVar5, aVarB, cVarB, jVarD, wVarA2, jVar, iVarB));
            case 15:
                return new com.revolut.feature.credit.application.plugins.impl.ui.overdraft_offer.a((tx3.b) c1Var.f118487x1.get(), v4Var.f119988b, (tx3.d) c1Var.f118490y1.get());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object q() {
        c1 c1Var = (c1) this.f118806b;
        y4 y4Var = (y4) this.d;
        int i = this.f118807c;
        switch (i) {
            case 0:
                return ige.d.h(y4Var.f120206a, (j60.a) y4Var.f120209g.get());
            case 1:
                return com.revolut.data.database.models.openbanking.d.q(y4Var.f120206a, (com.revolut.kompot.navigable.a) y4Var.e.get(), (rp0.m) y4Var.f.get());
            case 2:
                iq3.a aVar = y4Var.f120206a;
                return new rp0.m();
            case 3:
                return e5f.b.x((c84.z) y4Var.f120216q.get());
            case 4:
                return new c84.z((c84.g) y4Var.f120215p.get(), (rz3.c) c1Var.f118470r1.get(), (PluginFlowContract$Input) y4Var.i.get());
            case 5:
                PluginFlowContract$Input pluginFlowContract$Input = (PluginFlowContract$Input) y4Var.i.get();
                e4m.e eVar = c1Var.f118470r1;
                uq3.b bVar = c1Var.f118428c;
                rz3.c cVar = (rz3.c) eVar.get();
                xa4.a aVar2 = (xa4.a) y4Var.k.get();
                xq3.j jVarH = bVar.h();
                vc.s.j(jVarH);
                mri.w wVarA = ((ozl.a) c1Var.u).a();
                vc.s.j(wVarA);
                ii4.o oVar = (ii4.o) y4Var.o.get();
                aq3.a aVarE = bVar.e();
                vc.s.j(aVarE);
                return new c84.i(pluginFlowContract$Input, cVar, aVar2, jVarH, wVarA, oVar, aVarE);
            case 6:
                PluginFlowContract$Input pluginFlowContract$Input2 = (PluginFlowContract$Input) y4Var.i.get();
                c1 c1Var2 = y4Var.f120208c;
                return new xa4.b(pluginFlowContract$Input2, ImmutableSet.of((ya4.g) new ya4.c(c1Var2.i(), (ya4.f) y4Var.f120211j.get()), (ya4.g) new ya4.c(c1Var2.b(), new py3.g()), (ya4.g) new ya4.c(new py3.c(), (ya4.f) y4Var.f120211j.get()), new ya4.g(new py3.f())));
            case 7:
                rz3.c cVar2 = (rz3.c) c1Var.f118470r1.get();
                xq3.j jVarH2 = c1Var.f118428c.h();
                vc.s.j(jVarH2);
                return new ya4.f(cVar2, jVarH2);
            case 8:
                return new ii4.z((li4.a) y4Var.f120214n.get());
            case 9:
                return new li4.a(ImmutableMap.of(li4.d.class, (li4.b) y4Var.f120212l.get(), li4.e.class, (li4.b) y4Var.f120213m.get()));
            case 10:
                xq3.j jVarH3 = c1Var.f118428c.h();
                vc.s.j(jVarH3);
                return new li4.c(jVarH3);
            case 11:
                uq3.b bVar2 = c1Var.f118428c;
                uq3.b bVar3 = c1Var.f118428c;
                xq3.j jVarH4 = bVar2.h();
                vc.s.j(jVarH4);
                xq3.c cVarF = bVar3.f();
                vc.s.j(cVarF);
                sp3.a aVarM = bVar3.m();
                vc.s.j(aVarM);
                return new ji4.b(jVarH4, cVarF, aVarM, c1Var.i());
            case 12:
                c84.z zVar = (c84.z) y4Var.f120216q.get();
                e5f.b.a(zVar);
                return zVar;
            case 13:
                PluginFlowContract$Input pluginFlowContract$Input3 = (PluginFlowContract$Input) y4Var.i.get();
                xr3.y yVarK = c1Var.f118428c.k();
                vc.s.j(yVarK);
                return new c84.c(pluginFlowContract$Input3, yVarK);
            case 14:
                PaymentFlowContract$InputData paymentFlowContract$InputData = y4Var.f120207b;
                PluginFlowContract$Input pluginFlowContract$Input4 = (PluginFlowContract$Input) y4Var.i.get();
                c84.g gVar = (c84.g) y4Var.f120215p.get();
                xa4.a aVar3 = (xa4.a) y4Var.k.get();
                c1 c1Var3 = y4Var.f120208c;
                gte.a aVarB = c1Var3.f118423b.b();
                vc.s.j(aVarB);
                hz3.c cVarB = c1Var3.b();
                xq3.j jVarD = c1Var3.f118428c.d();
                vc.s.j(jVarD);
                mri.w wVarA2 = ((ozl.a) c1Var3.u).a();
                vc.s.j(wVarA2);
                hy3.j jVar = (hy3.j) c1Var3.Q1.get();
                vie.i iVarB = c1Var3.z.b();
                vc.s.j(iVarB);
                return new com.revolut.feature.credit.application.plugins.impl.ui.payment.flow.a(paymentFlowContract$InputData, e5f.b.w(pluginFlowContract$Input4, gVar, aVar3, aVarB, cVarB, jVarD, wVarA2, jVar, iVarB));
            default:
                throw new AssertionError(i);
        }
    }

    private final Object r() {
        c1 c1Var = (c1) this.f118806b;
        z4 z4Var = (z4) this.d;
        int i = this.f118807c;
        switch (i) {
            case 0:
                return ige.d.h(z4Var.f120285a, (j60.a) z4Var.f120288g.get());
            case 1:
                return com.revolut.data.database.models.openbanking.d.q(z4Var.f120285a, (com.revolut.kompot.navigable.a) z4Var.e.get(), (rp0.m) z4Var.f.get());
            case 2:
                iq3.a aVar = z4Var.f120285a;
                return new rp0.m();
            case 3:
                return e5f.b.x((c84.z) z4Var.f120295q.get());
            case 4:
                return new c84.z((c84.g) z4Var.f120294p.get(), (rz3.c) c1Var.f118470r1.get(), (PluginFlowContract$Input) z4Var.i.get());
            case 5:
                PluginFlowContract$Input pluginFlowContract$Input = (PluginFlowContract$Input) z4Var.i.get();
                e4m.e eVar = c1Var.f118470r1;
                uq3.b bVar = c1Var.f118428c;
                rz3.c cVar = (rz3.c) eVar.get();
                xa4.a aVar2 = (xa4.a) z4Var.k.get();
                xq3.j jVarH = bVar.h();
                vc.s.j(jVarH);
                mri.w wVarA = ((ozl.a) c1Var.u).a();
                vc.s.j(wVarA);
                ii4.o oVar = (ii4.o) z4Var.o.get();
                aq3.a aVarE = bVar.e();
                vc.s.j(aVarE);
                return new c84.i(pluginFlowContract$Input, cVar, aVar2, jVarH, wVarA, oVar, aVarE);
            case 6:
                PluginFlowContract$Input pluginFlowContract$Input2 = (PluginFlowContract$Input) z4Var.i.get();
                c1 c1Var2 = z4Var.f120287c;
                return new xa4.b(pluginFlowContract$Input2, ImmutableSet.of((ya4.g) new ya4.c(c1Var2.i(), (ya4.f) z4Var.f120290j.get()), (ya4.g) new ya4.c(c1Var2.b(), new py3.g()), (ya4.g) new ya4.c(new py3.c(), (ya4.f) z4Var.f120290j.get()), new ya4.g(new py3.f())));
            case 7:
                rz3.c cVar2 = (rz3.c) c1Var.f118470r1.get();
                xq3.j jVarH2 = c1Var.f118428c.h();
                vc.s.j(jVarH2);
                return new ya4.f(cVar2, jVarH2);
            case 8:
                return new ii4.z((li4.a) z4Var.f120293n.get());
            case 9:
                return new li4.a(ImmutableMap.of(li4.d.class, (li4.b) z4Var.f120291l.get(), li4.e.class, (li4.b) z4Var.f120292m.get()));
            case 10:
                xq3.j jVarH3 = c1Var.f118428c.h();
                vc.s.j(jVarH3);
                return new li4.c(jVarH3);
            case 11:
                uq3.b bVar2 = c1Var.f118428c;
                uq3.b bVar3 = c1Var.f118428c;
                xq3.j jVarH4 = bVar2.h();
                vc.s.j(jVarH4);
                xq3.c cVarF = bVar3.f();
                vc.s.j(cVarF);
                sp3.a aVarM = bVar3.m();
                vc.s.j(aVarM);
                return new ji4.b(jVarH4, cVarF, aVarM, c1Var.i());
            case 12:
                c84.z zVar = (c84.z) z4Var.f120295q.get();
                e5f.b.a(zVar);
                return zVar;
            case 13:
                PluginFlowContract$Input pluginFlowContract$Input3 = (PluginFlowContract$Input) z4Var.i.get();
                xr3.y yVarK = c1Var.f118428c.k();
                vc.s.j(yVarK);
                return new c84.c(pluginFlowContract$Input3, yVarK);
            case 14:
                PersonalDetailsFlowContract$InputData personalDetailsFlowContract$InputData = z4Var.f120286b;
                PluginFlowContract$Input pluginFlowContract$Input4 = (PluginFlowContract$Input) z4Var.i.get();
                c84.g gVar = (c84.g) z4Var.f120294p.get();
                xa4.a aVar3 = (xa4.a) z4Var.k.get();
                c1 c1Var3 = z4Var.f120287c;
                gte.a aVarB = c1Var3.f118423b.b();
                vc.s.j(aVarB);
                hz3.c cVarB = c1Var3.b();
                xq3.j jVarD = c1Var3.f118428c.d();
                vc.s.j(jVarD);
                mri.w wVarA2 = ((ozl.a) c1Var3.u).a();
                vc.s.j(wVarA2);
                hy3.j jVar = (hy3.j) c1Var3.Q1.get();
                vie.i iVarB = c1Var3.z.b();
                vc.s.j(iVarB);
                return new com.revolut.feature.credit.application.plugins.impl.ui.personal_details.a(personalDetailsFlowContract$InputData, e5f.b.w(pluginFlowContract$Input4, gVar, aVar3, aVarB, cVarB, jVarD, wVarA2, jVar, iVarB));
            default:
                throw new AssertionError(i);
        }
    }

    private final Object s() {
        c1 c1Var = (c1) this.f118806b;
        b5 b5Var = (b5) this.d;
        int i = this.f118807c;
        switch (i) {
            case 0:
                return ige.d.h(b5Var.f118360a, (j60.a) b5Var.f118364h.get());
            case 1:
                return com.revolut.data.database.models.openbanking.d.q(b5Var.f118360a, (com.revolut.kompot.navigable.a) b5Var.f.get(), (rp0.m) b5Var.f118363g.get());
            case 2:
                iq3.a aVar = b5Var.f118360a;
                return new rp0.m();
            case 3:
                return e5f.b.x((c84.z) b5Var.f118371r.get());
            case 4:
                return new c84.z((c84.g) b5Var.f118370q.get(), (rz3.c) c1Var.f118470r1.get(), (PluginFlowContract$Input) b5Var.f118365j.get());
            case 5:
                PluginFlowContract$Input pluginFlowContract$Input = (PluginFlowContract$Input) b5Var.f118365j.get();
                e4m.e eVar = c1Var.f118470r1;
                uq3.b bVar = c1Var.f118428c;
                rz3.c cVar = (rz3.c) eVar.get();
                xa4.a aVar2 = (xa4.a) b5Var.f118366l.get();
                xq3.j jVarH = bVar.h();
                vc.s.j(jVarH);
                mri.w wVarA = ((ozl.a) c1Var.u).a();
                vc.s.j(wVarA);
                ii4.o oVar = (ii4.o) b5Var.f118369p.get();
                aq3.a aVarE = bVar.e();
                vc.s.j(aVarE);
                return new c84.i(pluginFlowContract$Input, cVar, aVar2, jVarH, wVarA, oVar, aVarE);
            case 6:
                PluginFlowContract$Input pluginFlowContract$Input2 = (PluginFlowContract$Input) b5Var.f118365j.get();
                c1 c1Var2 = b5Var.f118362c;
                return new xa4.b(pluginFlowContract$Input2, ImmutableSet.of((ya4.g) new ya4.c(c1Var2.i(), (ya4.f) b5Var.k.get()), (ya4.g) new ya4.c(c1Var2.b(), new py3.g()), (ya4.g) new ya4.c(new py3.c(), (ya4.f) b5Var.k.get()), new ya4.g(new py3.f())));
            case 7:
                rz3.c cVar2 = (rz3.c) c1Var.f118470r1.get();
                xq3.j jVarH2 = c1Var.f118428c.h();
                vc.s.j(jVarH2);
                return new ya4.f(cVar2, jVarH2);
            case 8:
                return new ii4.z((li4.a) b5Var.o.get());
            case 9:
                return new li4.a(ImmutableMap.of(li4.d.class, (li4.b) b5Var.f118367m.get(), li4.e.class, (li4.b) b5Var.f118368n.get()));
            case 10:
                xq3.j jVarH3 = c1Var.f118428c.h();
                vc.s.j(jVarH3);
                return new li4.c(jVarH3);
            case 11:
                uq3.b bVar2 = c1Var.f118428c;
                uq3.b bVar3 = c1Var.f118428c;
                xq3.j jVarH4 = bVar2.h();
                vc.s.j(jVarH4);
                xq3.c cVarF = bVar3.f();
                vc.s.j(cVarF);
                sp3.a aVarM = bVar3.m();
                vc.s.j(aVarM);
                return new ji4.b(jVarH4, cVarF, aVarM, c1Var.i());
            case 12:
                return f60.i.a((e60.a) b5Var.z.get());
            case 13:
                com.revolut.kompot.navigable.a aVar3 = (com.revolut.kompot.navigable.a) b5Var.f.get();
                g60.a aVarA = f60.e.a((com.revolut.kompot.navigable.a) b5Var.f.get());
                Activity activityA = f60.b.a((com.revolut.kompot.navigable.a) b5Var.f.get());
                t80.b bVarB = b5Var.b();
                com.revolut.kompot.navigable.a aVar4 = (com.revolut.kompot.navigable.a) b5Var.f.get();
                f60.h.a(aVar4);
                d4m.a aVarA2 = e4m.b.a(b5Var.f118373t);
                nli.a aVar5 = new nli.a((t80.c) b5Var.u.get(), f60.b.a((com.revolut.kompot.navigable.a) b5Var.f.get()));
                t80.b bVarB2 = b5Var.b();
                zk0.b bVarL = b5Var.f118362c.f118443h.l();
                vc.s.j(bVarL);
                return f60.j.a(aVar3, new t80.v(aVarA, activityA, bVarB, aVar4, aVarA2, aVar5, new oli.c(bVarB2, bVarL, new nli.a((t80.c) b5Var.u.get(), f60.b.a((com.revolut.kompot.navigable.a) b5Var.f.get())), f60.e.a((com.revolut.kompot.navigable.a) b5Var.f.get()), b5Var.j()), new oli.g(f60.d.a(f60.b.a((com.revolut.kompot.navigable.a) b5Var.f.get())), pli.b.a(f60.d.a(f60.b.a((com.revolut.kompot.navigable.a) b5Var.f.get()))), new ami.n(e4m.b.a(b5Var.v), 1), e4m.b.a(b5Var.f118373t), b5Var.b(), new nli.a((t80.c) b5Var.u.get(), f60.b.a((com.revolut.kompot.navigable.a) b5Var.f.get())), new i90.b(), b5Var.c(), b5Var.j()), b5Var.j()), f60.g.a(), (rp0.m) b5Var.f118374w.get(), (e60.t) b5Var.f118376y.get(), new nji.b());
            case 14:
                com.revolut.kompot.navigable.a aVar6 = (com.revolut.kompot.navigable.a) b5Var.f.get();
                f60.h.a(aVar6);
                return pli.c.a(new ks0.n(aVar6));
            case 15:
                kg4.b.Companion.getClass();
                return new t80.c(new e.a(null), SizeBasedTriggeringPolicy.DEFAULT_MAX_FILE_SIZE);
            case 16:
                return t96.a.a();
            case 17:
                return f60.c.a();
            case 18:
                aii.o oVar2 = (aii.o) b5Var.f118375x.get();
                y80.a aVarR = c1Var.f118443h.r();
                vc.s.j(aVarR);
                return new e60.y(oVar2, aVarR, b5Var.c(), Optional.empty());
            case 19:
                c84.z zVar = (c84.z) b5Var.f118371r.get();
                e5f.b.a(zVar);
                return zVar;
            case 20:
                e60.t tVar = (e60.t) b5Var.f118376y.get();
                f60.f.a(tVar);
                return tVar;
            case 21:
                PluginFlowContract$Input pluginFlowContract$Input3 = (PluginFlowContract$Input) b5Var.f118365j.get();
                xr3.y yVarK = c1Var.f118428c.k();
                vc.s.j(yVarK);
                return new c84.c(pluginFlowContract$Input3, yVarK);
            case 22:
                PhotosUploadFlowContract$InputData photosUploadFlowContract$InputData = b5Var.f118361b;
                e60.a aVar7 = (e60.a) b5Var.z.get();
                wx3.c cVar3 = (wx3.c) c1Var.f118436e3.get();
                jg4.a aVar8 = new jg4.a();
                PluginFlowContract$Input pluginFlowContract$Input4 = (PluginFlowContract$Input) b5Var.f118365j.get();
                c84.g gVar = (c84.g) b5Var.f118370q.get();
                xa4.a aVar9 = (xa4.a) b5Var.f118366l.get();
                c1 c1Var3 = b5Var.f118362c;
                gte.a aVarB = c1Var3.f118423b.b();
                vc.s.j(aVarB);
                hz3.c cVarB = c1Var3.b();
                xq3.j jVarD = c1Var3.f118428c.d();
                vc.s.j(jVarD);
                mri.w wVarA2 = ((ozl.a) c1Var3.u).a();
                vc.s.j(wVarA2);
                hy3.j jVar = (hy3.j) c1Var3.Q1.get();
                vie.i iVarB = c1Var3.z.b();
                vc.s.j(iVarB);
                return new com.revolut.feature.credit.application.plugins.impl.ui.photo_upload.flow.c(photosUploadFlowContract$InputData, aVar7, cVar3, aVar8, e5f.b.w(pluginFlowContract$Input4, gVar, aVar9, aVarB, cVarB, jVarD, wVarA2, jVar, iVarB));
            default:
                throw new AssertionError(i);
        }
    }

    private final Object t() {
        c1 c1Var = (c1) this.f118806b;
        d5 d5Var = (d5) this.d;
        int i = this.f118807c;
        switch (i) {
            case 0:
                return ige.d.h(d5Var.f118568a, (j60.a) d5Var.f118572h.get());
            case 1:
                return com.revolut.data.database.models.openbanking.d.q(d5Var.f118568a, (com.revolut.kompot.navigable.a) d5Var.f.get(), (rp0.m) d5Var.f118571g.get());
            case 2:
                iq3.a aVar = d5Var.f118568a;
                return new rp0.m();
            case 3:
                return e5f.b.x((c84.z) d5Var.f118579r.get());
            case 4:
                return new c84.z((c84.g) d5Var.f118578q.get(), (rz3.c) c1Var.f118470r1.get(), (PluginFlowContract$Input) d5Var.f118573j.get());
            case 5:
                PluginFlowContract$Input pluginFlowContract$Input = (PluginFlowContract$Input) d5Var.f118573j.get();
                e4m.e eVar = c1Var.f118470r1;
                uq3.b bVar = c1Var.f118428c;
                rz3.c cVar = (rz3.c) eVar.get();
                xa4.a aVar2 = (xa4.a) d5Var.f118574l.get();
                xq3.j jVarH = bVar.h();
                vc.s.j(jVarH);
                mri.w wVarA = ((ozl.a) c1Var.u).a();
                vc.s.j(wVarA);
                ii4.o oVar = (ii4.o) d5Var.f118577p.get();
                aq3.a aVarE = bVar.e();
                vc.s.j(aVarE);
                return new c84.i(pluginFlowContract$Input, cVar, aVar2, jVarH, wVarA, oVar, aVarE);
            case 6:
                PluginFlowContract$Input pluginFlowContract$Input2 = (PluginFlowContract$Input) d5Var.f118573j.get();
                c1 c1Var2 = d5Var.d;
                return new xa4.b(pluginFlowContract$Input2, ImmutableSet.of((ya4.g) new ya4.c(c1Var2.i(), (ya4.f) d5Var.k.get()), (ya4.g) new ya4.c(c1Var2.b(), new py3.g()), (ya4.g) new ya4.c(new py3.c(), (ya4.f) d5Var.k.get()), new ya4.g(new py3.f())));
            case 7:
                rz3.c cVar2 = (rz3.c) c1Var.f118470r1.get();
                xq3.j jVarH2 = c1Var.f118428c.h();
                vc.s.j(jVarH2);
                return new ya4.f(cVar2, jVarH2);
            case 8:
                return new ii4.z((li4.a) d5Var.o.get());
            case 9:
                return new li4.a(ImmutableMap.of(li4.d.class, (li4.b) d5Var.f118575m.get(), li4.e.class, (li4.b) d5Var.f118576n.get()));
            case 10:
                xq3.j jVarH3 = c1Var.f118428c.h();
                vc.s.j(jVarH3);
                return new li4.c(jVarH3);
            case 11:
                uq3.b bVar2 = c1Var.f118428c;
                uq3.b bVar3 = c1Var.f118428c;
                xq3.j jVarH4 = bVar2.h();
                vc.s.j(jVarH4);
                xq3.c cVarF = bVar3.f();
                vc.s.j(cVarF);
                sp3.a aVarM = bVar3.m();
                vc.s.j(aVarM);
                return new ji4.b(jVarH4, cVarF, aVarM, c1Var.i());
            case 12:
                c84.z zVar = (c84.z) d5Var.f118579r.get();
                e5f.b.a(zVar);
                return zVar;
            case 13:
                return agk.b.B(d5Var.f118569b, (zfk.c) d5Var.f118583x.get(), (xfk.b) d5Var.u.get(), (bgk.a) d5Var.v.get(), (wfk.a) d5Var.f118582w.get(), (bgk.a) d5Var.f118584y.get());
            case 14:
                agk.a aVar3 = d5Var.f118569b;
                mhk.a aVarC = c1Var.M.c();
                vc.s.j(aVarC);
                return afj.y3.C(aVar3, aVarC, (xfk.b) d5Var.u.get(), (bgk.a) d5Var.v.get(), (wfk.a) d5Var.f118582w.get());
            case 15:
                agk.a aVar4 = d5Var.f118569b;
                fhk.a aVarB = c1Var.M.b();
                vc.s.j(aVarB);
                return afj.y3.b(aVar4, aVarB);
            case 16:
                agk.a aVar5 = d5Var.f118569b;
                ohk.a aVarD = c1Var.M.d();
                vc.s.j(aVarD);
                return afj.y3.D(aVar5, aVarD);
            case 17:
                agk.a aVar6 = d5Var.f118569b;
                dhk.a aVarA = c1Var.M.a();
                vc.s.j(aVarA);
                return afj.y3.z(aVar6, aVarA);
            case 18:
                agk.a aVar7 = d5Var.f118569b;
                ohk.a aVarD2 = c1Var.M.d();
                vc.s.j(aVarD2);
                return agk.b.y(aVar7, aVarD2);
            case 19:
                PluginFlowContract$Input pluginFlowContract$Input3 = (PluginFlowContract$Input) d5Var.f118573j.get();
                xr3.y yVarK = c1Var.f118428c.k();
                vc.s.j(yVarK);
                return new c84.c(pluginFlowContract$Input3, yVarK);
            case 20:
                PlanSubscribeFlowContract$InputData planSubscribeFlowContract$InputData = d5Var.f118570c;
                yx3.a aVar8 = (yx3.a) c1Var.o3.get();
                ffk.t tVarF = c1Var.G.f();
                vc.s.j(tVarF);
                zfk.c cVar3 = (zfk.c) d5Var.f118583x.get();
                PluginFlowContract$Input pluginFlowContract$Input4 = (PluginFlowContract$Input) d5Var.f118573j.get();
                c84.g gVar = (c84.g) d5Var.f118578q.get();
                xa4.a aVar9 = (xa4.a) d5Var.f118574l.get();
                c1 c1Var3 = d5Var.d;
                gte.a aVarB2 = c1Var3.f118423b.b();
                vc.s.j(aVarB2);
                hz3.c cVarB = c1Var3.b();
                xq3.j jVarD = c1Var3.f118428c.d();
                vc.s.j(jVarD);
                mri.w wVarA2 = ((ozl.a) c1Var3.u).a();
                vc.s.j(wVarA2);
                hy3.j jVar = (hy3.j) c1Var3.Q1.get();
                vie.i iVarB = c1Var3.z.b();
                vc.s.j(iVarB);
                return new og4.d(planSubscribeFlowContract$InputData, aVar8, tVarF, cVar3, e5f.b.w(pluginFlowContract$Input4, gVar, aVar9, aVarB2, cVarB, jVarD, wVarA2, jVar, iVarB));
            default:
                throw new AssertionError(i);
        }
    }

    @Override // phm.a
    public final Object get() {
        Object zVar;
        Object fVar;
        Object zVar2;
        Object fVar2;
        switch (this.f118805a) {
            case 0:
                h3 h3Var = (h3) this.d;
                FinancialSituationChangesScreenContract$InputData financialSituationChangesScreenContract$InputData = h3Var.f118868a;
                int i = this.f118807c;
                if (i == 0) {
                    return e5f.b.e((com.revolut.kompot.navigable.a) h3Var.f118869b.get(), (c84.b) h3Var.d.get(), (PluginFlowContract$Input) ((i3) this.f118806b).i.get());
                }
                if (i == 1) {
                    return new c84.b();
                }
                if (i == 2) {
                    return new yb4.j((cli.n) h3Var.f118871g.get(), financialSituationChangesScreenContract$InputData);
                }
                if (i == 3) {
                    return new yb4.k(financialSituationChangesScreenContract$InputData);
                }
                throw new AssertionError(i);
            case 1:
                c1 c1Var = (c1) this.d;
                i3 i3Var = (i3) this.f118806b;
                int i2 = this.f118807c;
                switch (i2) {
                    case 0:
                        return ige.d.h(i3Var.f118950a, (j60.a) i3Var.f118953g.get());
                    case 1:
                        return com.revolut.data.database.models.openbanking.d.q(i3Var.f118950a, (com.revolut.kompot.navigable.a) i3Var.e.get(), (rp0.m) i3Var.f.get());
                    case 2:
                        iq3.a aVar = i3Var.f118950a;
                        return new rp0.m();
                    case 3:
                        return e5f.b.x((c84.z) i3Var.f118960q.get());
                    case 4:
                        return new c84.z((c84.g) i3Var.f118959p.get(), (rz3.c) c1Var.f118470r1.get(), (PluginFlowContract$Input) i3Var.i.get());
                    case 5:
                        PluginFlowContract$Input pluginFlowContract$Input = (PluginFlowContract$Input) i3Var.i.get();
                        e4m.e eVar = c1Var.f118470r1;
                        uq3.b bVar = c1Var.f118428c;
                        rz3.c cVar = (rz3.c) eVar.get();
                        xa4.a aVar2 = (xa4.a) i3Var.k.get();
                        xq3.j jVarH = bVar.h();
                        vc.s.j(jVarH);
                        mri.w wVarA = ((ozl.a) c1Var.u).a();
                        vc.s.j(wVarA);
                        ii4.o oVar = (ii4.o) i3Var.o.get();
                        aq3.a aVarE = bVar.e();
                        vc.s.j(aVarE);
                        return new c84.i(pluginFlowContract$Input, cVar, aVar2, jVarH, wVarA, oVar, aVarE);
                    case 6:
                        PluginFlowContract$Input pluginFlowContract$Input2 = (PluginFlowContract$Input) i3Var.i.get();
                        c1 c1Var2 = i3Var.f118952c;
                        return new xa4.b(pluginFlowContract$Input2, ImmutableSet.of((ya4.g) new ya4.c(c1Var2.i(), (ya4.f) i3Var.f118955j.get()), (ya4.g) new ya4.c(c1Var2.b(), new py3.g()), (ya4.g) new ya4.c(new py3.c(), (ya4.f) i3Var.f118955j.get()), new ya4.g(new py3.f())));
                    case 7:
                        rz3.c cVar2 = (rz3.c) c1Var.f118470r1.get();
                        xq3.j jVarH2 = c1Var.f118428c.h();
                        vc.s.j(jVarH2);
                        return new ya4.f(cVar2, jVarH2);
                    case 8:
                        return new ii4.z((li4.a) i3Var.f118958n.get());
                    case 9:
                        return new li4.a(ImmutableMap.of(li4.d.class, (li4.b) i3Var.f118956l.get(), li4.e.class, (li4.b) i3Var.f118957m.get()));
                    case 10:
                        xq3.j jVarH3 = c1Var.f118428c.h();
                        vc.s.j(jVarH3);
                        return new li4.c(jVarH3);
                    case 11:
                        uq3.b bVar2 = c1Var.f118428c;
                        uq3.b bVar3 = c1Var.f118428c;
                        xq3.j jVarH4 = bVar2.h();
                        vc.s.j(jVarH4);
                        xq3.c cVarF = bVar3.f();
                        vc.s.j(cVarF);
                        sp3.a aVarM = bVar3.m();
                        vc.s.j(aVarM);
                        return new ji4.b(jVarH4, cVarF, aVarM, c1Var.i());
                    case 12:
                        c84.z zVar3 = (c84.z) i3Var.f118960q.get();
                        e5f.b.a(zVar3);
                        return zVar3;
                    case 13:
                        PluginFlowContract$Input pluginFlowContract$Input3 = (PluginFlowContract$Input) i3Var.i.get();
                        xr3.y yVarK = c1Var.f118428c.k();
                        vc.s.j(yVarK);
                        return new c84.c(pluginFlowContract$Input3, yVarK);
                    case 14:
                        ix3.a aVar3 = (ix3.a) c1Var.c3.get();
                        FinancialSituationConfirmationFlowContract$InputData financialSituationConfirmationFlowContract$InputData = i3Var.f118951b;
                        PluginFlowContract$Input pluginFlowContract$Input4 = (PluginFlowContract$Input) i3Var.i.get();
                        c84.g gVar = (c84.g) i3Var.f118959p.get();
                        xa4.a aVar4 = (xa4.a) i3Var.k.get();
                        c1 c1Var3 = i3Var.f118952c;
                        gte.a aVarB = c1Var3.f118423b.b();
                        vc.s.j(aVarB);
                        hz3.c cVarB = c1Var3.b();
                        xq3.j jVarD = c1Var3.f118428c.d();
                        vc.s.j(jVarD);
                        mri.w wVarA2 = ((ozl.a) c1Var3.u).a();
                        vc.s.j(wVarA2);
                        hy3.j jVar = (hy3.j) c1Var3.Q1.get();
                        vie.i iVarB = c1Var3.z.b();
                        vc.s.j(iVarB);
                        return new com.revolut.feature.credit.application.plugins.impl.ui.financial_situation_confirmation.c(aVar3, financialSituationConfirmationFlowContract$InputData, e5f.b.w(pluginFlowContract$Input4, gVar, aVar4, aVarB, cVarB, jVarD, wVarA2, jVar, iVarB));
                    default:
                        throw new AssertionError(i2);
                }
            case 2:
                c1 c1Var4 = (c1) this.f118806b;
                k3 k3Var = (k3) this.d;
                int i3 = this.f118807c;
                switch (i3) {
                    case 0:
                        return ige.d.h(k3Var.f119096a, (j60.a) k3Var.f119099g.get());
                    case 1:
                        return com.revolut.data.database.models.openbanking.d.q(k3Var.f119096a, (com.revolut.kompot.navigable.a) k3Var.e.get(), (rp0.m) k3Var.f.get());
                    case 2:
                        iq3.a aVar5 = k3Var.f119096a;
                        return new rp0.m();
                    case 3:
                        return e5f.b.x((c84.z) k3Var.f119106q.get());
                    case 4:
                        return new c84.z((c84.g) k3Var.f119105p.get(), (rz3.c) c1Var4.f118470r1.get(), (PluginFlowContract$Input) k3Var.i.get());
                    case 5:
                        PluginFlowContract$Input pluginFlowContract$Input5 = (PluginFlowContract$Input) k3Var.i.get();
                        e4m.e eVar2 = c1Var4.f118470r1;
                        uq3.b bVar4 = c1Var4.f118428c;
                        rz3.c cVar3 = (rz3.c) eVar2.get();
                        xa4.a aVar6 = (xa4.a) k3Var.k.get();
                        xq3.j jVarH5 = bVar4.h();
                        vc.s.j(jVarH5);
                        mri.w wVarA3 = ((ozl.a) c1Var4.u).a();
                        vc.s.j(wVarA3);
                        ii4.o oVar2 = (ii4.o) k3Var.o.get();
                        aq3.a aVarE2 = bVar4.e();
                        vc.s.j(aVarE2);
                        return new c84.i(pluginFlowContract$Input5, cVar3, aVar6, jVarH5, wVarA3, oVar2, aVarE2);
                    case 6:
                        PluginFlowContract$Input pluginFlowContract$Input6 = (PluginFlowContract$Input) k3Var.i.get();
                        c1 c1Var5 = k3Var.f119098c;
                        return new xa4.b(pluginFlowContract$Input6, ImmutableSet.of((ya4.g) new ya4.c(c1Var5.i(), (ya4.f) k3Var.f119101j.get()), (ya4.g) new ya4.c(c1Var5.b(), new py3.g()), (ya4.g) new ya4.c(new py3.c(), (ya4.f) k3Var.f119101j.get()), new ya4.g(new py3.f())));
                    case 7:
                        rz3.c cVar4 = (rz3.c) c1Var4.f118470r1.get();
                        xq3.j jVarH6 = c1Var4.f118428c.h();
                        vc.s.j(jVarH6);
                        return new ya4.f(cVar4, jVarH6);
                    case 8:
                        return new ii4.z((li4.a) k3Var.f119104n.get());
                    case 9:
                        return new li4.a(ImmutableMap.of(li4.d.class, (li4.b) k3Var.f119102l.get(), li4.e.class, (li4.b) k3Var.f119103m.get()));
                    case 10:
                        xq3.j jVarH7 = c1Var4.f118428c.h();
                        vc.s.j(jVarH7);
                        return new li4.c(jVarH7);
                    case 11:
                        uq3.b bVar5 = c1Var4.f118428c;
                        uq3.b bVar6 = c1Var4.f118428c;
                        xq3.j jVarH8 = bVar5.h();
                        vc.s.j(jVarH8);
                        xq3.c cVarF2 = bVar6.f();
                        vc.s.j(cVarF2);
                        sp3.a aVarM2 = bVar6.m();
                        vc.s.j(aVarM2);
                        return new ji4.b(jVarH8, cVarF2, aVarM2, c1Var4.i());
                    case 12:
                        c84.z zVar4 = (c84.z) k3Var.f119106q.get();
                        e5f.b.a(zVar4);
                        return zVar4;
                    case 13:
                        PluginFlowContract$Input pluginFlowContract$Input7 = (PluginFlowContract$Input) k3Var.i.get();
                        xr3.y yVarK2 = c1Var4.f118428c.k();
                        vc.s.j(yVarK2);
                        return new c84.c(pluginFlowContract$Input7, yVarK2);
                    case 14:
                        FormFlowContract$InputData formFlowContract$InputData = k3Var.f119097b;
                        jx3.a aVar7 = (jx3.a) c1Var4.f118421a2.get();
                        ra0.h hVarA = c1Var4.A.a();
                        vc.s.j(hVarA);
                        PluginFlowContract$Input pluginFlowContract$Input8 = (PluginFlowContract$Input) k3Var.i.get();
                        c84.g gVar2 = (c84.g) k3Var.f119105p.get();
                        xa4.a aVar8 = (xa4.a) k3Var.k.get();
                        c1 c1Var6 = k3Var.f119098c;
                        gte.a aVarB2 = c1Var6.f118423b.b();
                        vc.s.j(aVarB2);
                        hz3.c cVarB2 = c1Var6.b();
                        xq3.j jVarD2 = c1Var6.f118428c.d();
                        vc.s.j(jVarD2);
                        mri.w wVarA4 = ((ozl.a) c1Var6.u).a();
                        vc.s.j(wVarA4);
                        hy3.j jVar2 = (hy3.j) c1Var6.Q1.get();
                        vie.i iVarB2 = c1Var6.z.b();
                        vc.s.j(iVarB2);
                        return new cc4.c(formFlowContract$InputData, aVar7, hVarA, e5f.b.w(pluginFlowContract$Input8, gVar2, aVar8, aVarB2, cVarB2, jVarD2, wVarA4, jVar2, iVarB2));
                    default:
                        throw new AssertionError(i3);
                }
            case 3:
                c1 c1Var7 = (c1) this.f118806b;
                l3 l3Var = (l3) this.d;
                int i5 = this.f118807c;
                switch (i5) {
                    case 0:
                        return ige.d.h(l3Var.f119186a, (j60.a) l3Var.f119189g.get());
                    case 1:
                        return com.revolut.data.database.models.openbanking.d.q(l3Var.f119186a, (com.revolut.kompot.navigable.a) l3Var.e.get(), (rp0.m) l3Var.f.get());
                    case 2:
                        iq3.a aVar9 = l3Var.f119186a;
                        return new rp0.m();
                    case 3:
                        return e5f.b.x((c84.z) l3Var.f119196q.get());
                    case 4:
                        return new c84.z((c84.g) l3Var.f119195p.get(), (rz3.c) c1Var7.f118470r1.get(), (PluginFlowContract$Input) l3Var.i.get());
                    case 5:
                        PluginFlowContract$Input pluginFlowContract$Input9 = (PluginFlowContract$Input) l3Var.i.get();
                        e4m.e eVar3 = c1Var7.f118470r1;
                        uq3.b bVar7 = c1Var7.f118428c;
                        rz3.c cVar5 = (rz3.c) eVar3.get();
                        xa4.a aVar10 = (xa4.a) l3Var.k.get();
                        xq3.j jVarH9 = bVar7.h();
                        vc.s.j(jVarH9);
                        mri.w wVarA5 = ((ozl.a) c1Var7.u).a();
                        vc.s.j(wVarA5);
                        ii4.o oVar3 = (ii4.o) l3Var.o.get();
                        aq3.a aVarE3 = bVar7.e();
                        vc.s.j(aVarE3);
                        return new c84.i(pluginFlowContract$Input9, cVar5, aVar10, jVarH9, wVarA5, oVar3, aVarE3);
                    case 6:
                        PluginFlowContract$Input pluginFlowContract$Input10 = (PluginFlowContract$Input) l3Var.i.get();
                        c1 c1Var8 = l3Var.f119188c;
                        return new xa4.b(pluginFlowContract$Input10, ImmutableSet.of((ya4.g) new ya4.c(c1Var8.i(), (ya4.f) l3Var.f119191j.get()), (ya4.g) new ya4.c(c1Var8.b(), new py3.g()), (ya4.g) new ya4.c(new py3.c(), (ya4.f) l3Var.f119191j.get()), new ya4.g(new py3.f())));
                    case 7:
                        rz3.c cVar6 = (rz3.c) c1Var7.f118470r1.get();
                        xq3.j jVarH10 = c1Var7.f118428c.h();
                        vc.s.j(jVarH10);
                        return new ya4.f(cVar6, jVarH10);
                    case 8:
                        return new ii4.z((li4.a) l3Var.f119194n.get());
                    case 9:
                        return new li4.a(ImmutableMap.of(li4.d.class, (li4.b) l3Var.f119192l.get(), li4.e.class, (li4.b) l3Var.f119193m.get()));
                    case 10:
                        xq3.j jVarH11 = c1Var7.f118428c.h();
                        vc.s.j(jVarH11);
                        return new li4.c(jVarH11);
                    case 11:
                        uq3.b bVar8 = c1Var7.f118428c;
                        uq3.b bVar9 = c1Var7.f118428c;
                        xq3.j jVarH12 = bVar8.h();
                        vc.s.j(jVarH12);
                        xq3.c cVarF3 = bVar9.f();
                        vc.s.j(cVarF3);
                        sp3.a aVarM3 = bVar9.m();
                        vc.s.j(aVarM3);
                        return new ji4.b(jVarH12, cVarF3, aVarM3, c1Var7.i());
                    case 12:
                        c84.z zVar5 = (c84.z) l3Var.f119196q.get();
                        e5f.b.a(zVar5);
                        return zVar5;
                    case 13:
                        PluginFlowContract$Input pluginFlowContract$Input11 = (PluginFlowContract$Input) l3Var.i.get();
                        xr3.y yVarK3 = c1Var7.f118428c.k();
                        vc.s.j(yVarK3);
                        return new c84.c(pluginFlowContract$Input11, yVarK3);
                    case 14:
                        kx3.a aVar11 = (kx3.a) c1Var7.R2.get();
                        HomeInsuranceFlowContract$InputData homeInsuranceFlowContract$InputData = l3Var.f119187b;
                        wli.x xVarD = ((s41.a) c1Var7.f118485x).d();
                        da4.g gVar3 = new da4.g();
                        PluginFlowContract$Input pluginFlowContract$Input12 = (PluginFlowContract$Input) l3Var.i.get();
                        c84.g gVar4 = (c84.g) l3Var.f119195p.get();
                        xa4.a aVar12 = (xa4.a) l3Var.k.get();
                        c1 c1Var9 = l3Var.f119188c;
                        gte.a aVarB3 = c1Var9.f118423b.b();
                        vc.s.j(aVarB3);
                        hz3.c cVarB3 = c1Var9.b();
                        xq3.j jVarD3 = c1Var9.f118428c.d();
                        vc.s.j(jVarD3);
                        mri.w wVarA6 = ((ozl.a) c1Var9.u).a();
                        vc.s.j(wVarA6);
                        hy3.j jVar3 = (hy3.j) c1Var9.Q1.get();
                        vie.i iVarB3 = c1Var9.z.b();
                        vc.s.j(iVarB3);
                        return new com.revolut.feature.credit.application.plugins.impl.ui.home_insurance.e(aVar11, homeInsuranceFlowContract$InputData, xVarD, gVar3, e5f.b.w(pluginFlowContract$Input12, gVar4, aVar12, aVarB3, cVarB3, jVarD3, wVarA6, jVar3, iVarB3));
                    default:
                        throw new AssertionError(i5);
                }
            case 4:
                c1 c1Var10 = (c1) this.f118806b;
                m3 m3Var = (m3) this.d;
                int i6 = this.f118807c;
                switch (i6) {
                    case 0:
                        return ige.d.h(m3Var.f119261a, (j60.a) m3Var.f119264g.get());
                    case 1:
                        return com.revolut.data.database.models.openbanking.d.q(m3Var.f119261a, (com.revolut.kompot.navigable.a) m3Var.e.get(), (rp0.m) m3Var.f.get());
                    case 2:
                        iq3.a aVar13 = m3Var.f119261a;
                        return new rp0.m();
                    case 3:
                        return e5f.b.x((c84.z) m3Var.f119271q.get());
                    case 4:
                        zVar = new c84.z((c84.g) m3Var.f119270p.get(), (rz3.c) c1Var10.f118470r1.get(), (PluginFlowContract$Input) m3Var.i.get());
                        return zVar;
                    case 5:
                        PluginFlowContract$Input pluginFlowContract$Input13 = (PluginFlowContract$Input) m3Var.i.get();
                        e4m.e eVar4 = c1Var10.f118470r1;
                        uq3.b bVar10 = c1Var10.f118428c;
                        rz3.c cVar7 = (rz3.c) eVar4.get();
                        xa4.a aVar14 = (xa4.a) m3Var.k.get();
                        xq3.j jVarH13 = bVar10.h();
                        vc.s.j(jVarH13);
                        mri.w wVarA7 = ((ozl.a) c1Var10.u).a();
                        vc.s.j(wVarA7);
                        ii4.o oVar4 = (ii4.o) m3Var.o.get();
                        aq3.a aVarE4 = bVar10.e();
                        vc.s.j(aVarE4);
                        return new c84.i(pluginFlowContract$Input13, cVar7, aVar14, jVarH13, wVarA7, oVar4, aVarE4);
                    case 6:
                        PluginFlowContract$Input pluginFlowContract$Input14 = (PluginFlowContract$Input) m3Var.i.get();
                        c1 c1Var11 = m3Var.f119263c;
                        return new xa4.b(pluginFlowContract$Input14, ImmutableSet.of((ya4.g) new ya4.c(c1Var11.i(), (ya4.f) m3Var.f119266j.get()), (ya4.g) new ya4.c(c1Var11.b(), new py3.g()), (ya4.g) new ya4.c(new py3.c(), (ya4.f) m3Var.f119266j.get()), new ya4.g(new py3.f())));
                    case 7:
                        rz3.c cVar8 = (rz3.c) c1Var10.f118470r1.get();
                        xq3.j jVarH14 = c1Var10.f118428c.h();
                        vc.s.j(jVarH14);
                        fVar = new ya4.f(cVar8, jVarH14);
                        return fVar;
                    case 8:
                        return new ii4.z((li4.a) m3Var.f119269n.get());
                    case 9:
                        return new li4.a(ImmutableMap.of(li4.d.class, (li4.b) m3Var.f119267l.get(), li4.e.class, (li4.b) m3Var.f119268m.get()));
                    case 10:
                        xq3.j jVarH15 = c1Var10.f118428c.h();
                        vc.s.j(jVarH15);
                        fVar = new li4.c(jVarH15);
                        return fVar;
                    case 11:
                        uq3.b bVar11 = c1Var10.f118428c;
                        uq3.b bVar12 = c1Var10.f118428c;
                        xq3.j jVarH16 = bVar11.h();
                        vc.s.j(jVarH16);
                        xq3.c cVarF4 = bVar12.f();
                        vc.s.j(cVarF4);
                        sp3.a aVarM4 = bVar12.m();
                        vc.s.j(aVarM4);
                        fVar = new ji4.b(jVarH16, cVarF4, aVarM4, c1Var10.i());
                        return fVar;
                    case 12:
                        c84.z zVar6 = (c84.z) m3Var.f119271q.get();
                        e5f.b.a(zVar6);
                        return zVar6;
                    case 13:
                        PluginFlowContract$Input pluginFlowContract$Input15 = (PluginFlowContract$Input) m3Var.i.get();
                        xr3.y yVarK4 = c1Var10.f118428c.k();
                        vc.s.j(yVarK4);
                        zVar = new c84.c(pluginFlowContract$Input15, yVarK4);
                        return zVar;
                    case 14:
                        HowItWorksFlowContract$InputData howItWorksFlowContract$InputData = m3Var.f119262b;
                        PluginFlowContract$Input pluginFlowContract$Input16 = (PluginFlowContract$Input) m3Var.i.get();
                        c84.g gVar5 = (c84.g) m3Var.f119270p.get();
                        xa4.a aVar15 = (xa4.a) m3Var.k.get();
                        c1 c1Var12 = m3Var.f119263c;
                        gte.a aVarB4 = c1Var12.f118423b.b();
                        vc.s.j(aVarB4);
                        hz3.c cVarB4 = c1Var12.b();
                        xq3.j jVarD4 = c1Var12.f118428c.d();
                        vc.s.j(jVarD4);
                        mri.w wVarA8 = ((ozl.a) c1Var12.u).a();
                        vc.s.j(wVarA8);
                        hy3.j jVar4 = (hy3.j) c1Var12.Q1.get();
                        vie.i iVarB4 = c1Var12.z.b();
                        vc.s.j(iVarB4);
                        return new ic4.a(howItWorksFlowContract$InputData, e5f.b.w(pluginFlowContract$Input16, gVar5, aVar15, aVarB4, cVarB4, jVarD4, wVarA8, jVar4, iVarB4));
                    default:
                        throw new AssertionError(i6);
                }
            case 5:
                c1 c1Var13 = (c1) this.f118806b;
                o3 o3Var = (o3) this.d;
                int i21 = this.f118807c;
                switch (i21) {
                    case 0:
                        return ige.d.h(o3Var.f119423a, (j60.a) o3Var.f119426g.get());
                    case 1:
                        return com.revolut.data.database.models.openbanking.d.q(o3Var.f119423a, (com.revolut.kompot.navigable.a) o3Var.e.get(), (rp0.m) o3Var.f.get());
                    case 2:
                        iq3.a aVar16 = o3Var.f119423a;
                        return new rp0.m();
                    case 3:
                        return e5f.b.x((c84.z) o3Var.f119433q.get());
                    case 4:
                        return new c84.z((c84.g) o3Var.f119432p.get(), (rz3.c) c1Var13.f118470r1.get(), (PluginFlowContract$Input) o3Var.i.get());
                    case 5:
                        PluginFlowContract$Input pluginFlowContract$Input17 = (PluginFlowContract$Input) o3Var.i.get();
                        e4m.e eVar5 = c1Var13.f118470r1;
                        uq3.b bVar13 = c1Var13.f118428c;
                        rz3.c cVar9 = (rz3.c) eVar5.get();
                        xa4.a aVar17 = (xa4.a) o3Var.k.get();
                        xq3.j jVarH17 = bVar13.h();
                        vc.s.j(jVarH17);
                        mri.w wVarA9 = ((ozl.a) c1Var13.u).a();
                        vc.s.j(wVarA9);
                        ii4.o oVar5 = (ii4.o) o3Var.o.get();
                        aq3.a aVarE5 = bVar13.e();
                        vc.s.j(aVarE5);
                        return new c84.i(pluginFlowContract$Input17, cVar9, aVar17, jVarH17, wVarA9, oVar5, aVarE5);
                    case 6:
                        PluginFlowContract$Input pluginFlowContract$Input18 = (PluginFlowContract$Input) o3Var.i.get();
                        c1 c1Var14 = o3Var.f119425c;
                        return new xa4.b(pluginFlowContract$Input18, ImmutableSet.of((ya4.g) new ya4.c(c1Var14.i(), (ya4.f) o3Var.f119428j.get()), (ya4.g) new ya4.c(c1Var14.b(), new py3.g()), (ya4.g) new ya4.c(new py3.c(), (ya4.f) o3Var.f119428j.get()), new ya4.g(new py3.f())));
                    case 7:
                        rz3.c cVar10 = (rz3.c) c1Var13.f118470r1.get();
                        xq3.j jVarH18 = c1Var13.f118428c.h();
                        vc.s.j(jVarH18);
                        return new ya4.f(cVar10, jVarH18);
                    case 8:
                        return new ii4.z((li4.a) o3Var.f119431n.get());
                    case 9:
                        return new li4.a(ImmutableMap.of(li4.d.class, (li4.b) o3Var.f119429l.get(), li4.e.class, (li4.b) o3Var.f119430m.get()));
                    case 10:
                        xq3.j jVarH19 = c1Var13.f118428c.h();
                        vc.s.j(jVarH19);
                        return new li4.c(jVarH19);
                    case 11:
                        uq3.b bVar14 = c1Var13.f118428c;
                        uq3.b bVar15 = c1Var13.f118428c;
                        xq3.j jVarH20 = bVar14.h();
                        vc.s.j(jVarH20);
                        xq3.c cVarF5 = bVar15.f();
                        vc.s.j(cVarF5);
                        sp3.a aVarM5 = bVar15.m();
                        vc.s.j(aVarM5);
                        return new ji4.b(jVarH20, cVarF5, aVarM5, c1Var13.i());
                    case 12:
                        c84.z zVar7 = (c84.z) o3Var.f119433q.get();
                        e5f.b.a(zVar7);
                        return zVar7;
                    case 13:
                        PluginFlowContract$Input pluginFlowContract$Input19 = (PluginFlowContract$Input) o3Var.i.get();
                        xr3.y yVarK5 = c1Var13.f118428c.k();
                        vc.s.j(yVarK5);
                        return new c84.c(pluginFlowContract$Input19, yVarK5);
                    case 14:
                        IllionBankStatementFlowContract$InputData illionBankStatementFlowContract$InputData = o3Var.f119424b;
                        hw3.b0 b0Var = (hw3.b0) c1Var13.P2.get();
                        PluginFlowContract$Input pluginFlowContract$Input20 = (PluginFlowContract$Input) o3Var.i.get();
                        c84.g gVar6 = (c84.g) o3Var.f119432p.get();
                        xa4.a aVar18 = (xa4.a) o3Var.k.get();
                        c1 c1Var15 = o3Var.f119425c;
                        gte.a aVarB5 = c1Var15.f118423b.b();
                        vc.s.j(aVarB5);
                        hz3.c cVarB5 = c1Var15.b();
                        xq3.j jVarD5 = c1Var15.f118428c.d();
                        vc.s.j(jVarD5);
                        mri.w wVarA10 = ((ozl.a) c1Var15.u).a();
                        vc.s.j(wVarA10);
                        hy3.j jVar5 = (hy3.j) c1Var15.Q1.get();
                        vie.i iVarB5 = c1Var15.z.b();
                        vc.s.j(iVarB5);
                        return new com.revolut.feature.credit.application.plugins.impl.ui.illion_bankstatement.b(illionBankStatementFlowContract$InputData, b0Var, e5f.b.w(pluginFlowContract$Input20, gVar6, aVar18, aVarB5, cVarB5, jVarD5, wVarA10, jVar5, iVarB5));
                    default:
                        throw new AssertionError(i21);
                }
            case 6:
                c1 c1Var16 = (c1) this.f118806b;
                r3 r3Var = (r3) this.d;
                int i22 = this.f118807c;
                switch (i22) {
                    case 0:
                        return ige.d.h(r3Var.f119645a, (j60.a) r3Var.f119648g.get());
                    case 1:
                        return com.revolut.data.database.models.openbanking.d.q(r3Var.f119645a, (com.revolut.kompot.navigable.a) r3Var.e.get(), (rp0.m) r3Var.f.get());
                    case 2:
                        iq3.a aVar19 = r3Var.f119645a;
                        return new rp0.m();
                    case 3:
                        return e5f.b.x((c84.z) r3Var.f119655q.get());
                    case 4:
                        zVar2 = new c84.z((c84.g) r3Var.f119654p.get(), (rz3.c) c1Var16.f118470r1.get(), (PluginFlowContract$Input) r3Var.i.get());
                        return zVar2;
                    case 5:
                        PluginFlowContract$Input pluginFlowContract$Input21 = (PluginFlowContract$Input) r3Var.i.get();
                        e4m.e eVar6 = c1Var16.f118470r1;
                        uq3.b bVar16 = c1Var16.f118428c;
                        rz3.c cVar11 = (rz3.c) eVar6.get();
                        xa4.a aVar20 = (xa4.a) r3Var.k.get();
                        xq3.j jVarH21 = bVar16.h();
                        vc.s.j(jVarH21);
                        mri.w wVarA11 = ((ozl.a) c1Var16.u).a();
                        vc.s.j(wVarA11);
                        ii4.o oVar6 = (ii4.o) r3Var.o.get();
                        aq3.a aVarE6 = bVar16.e();
                        vc.s.j(aVarE6);
                        return new c84.i(pluginFlowContract$Input21, cVar11, aVar20, jVarH21, wVarA11, oVar6, aVarE6);
                    case 6:
                        PluginFlowContract$Input pluginFlowContract$Input22 = (PluginFlowContract$Input) r3Var.i.get();
                        c1 c1Var17 = r3Var.f119647c;
                        return new xa4.b(pluginFlowContract$Input22, ImmutableSet.of((ya4.g) new ya4.c(c1Var17.i(), (ya4.f) r3Var.f119650j.get()), (ya4.g) new ya4.c(c1Var17.b(), new py3.g()), (ya4.g) new ya4.c(new py3.c(), (ya4.f) r3Var.f119650j.get()), new ya4.g(new py3.f())));
                    case 7:
                        rz3.c cVar12 = (rz3.c) c1Var16.f118470r1.get();
                        xq3.j jVarH22 = c1Var16.f118428c.h();
                        vc.s.j(jVarH22);
                        fVar2 = new ya4.f(cVar12, jVarH22);
                        return fVar2;
                    case 8:
                        return new ii4.z((li4.a) r3Var.f119653n.get());
                    case 9:
                        return new li4.a(ImmutableMap.of(li4.d.class, (li4.b) r3Var.f119651l.get(), li4.e.class, (li4.b) r3Var.f119652m.get()));
                    case 10:
                        xq3.j jVarH23 = c1Var16.f118428c.h();
                        vc.s.j(jVarH23);
                        fVar2 = new li4.c(jVarH23);
                        return fVar2;
                    case 11:
                        uq3.b bVar17 = c1Var16.f118428c;
                        uq3.b bVar18 = c1Var16.f118428c;
                        xq3.j jVarH24 = bVar17.h();
                        vc.s.j(jVarH24);
                        xq3.c cVarF6 = bVar18.f();
                        vc.s.j(cVarF6);
                        sp3.a aVarM6 = bVar18.m();
                        vc.s.j(aVarM6);
                        fVar2 = new ji4.b(jVarH24, cVarF6, aVarM6, c1Var16.i());
                        return fVar2;
                    case 12:
                        c84.z zVar8 = (c84.z) r3Var.f119655q.get();
                        e5f.b.a(zVar8);
                        return zVar8;
                    case 13:
                        PluginFlowContract$Input pluginFlowContract$Input23 = (PluginFlowContract$Input) r3Var.i.get();
                        xr3.y yVarK6 = c1Var16.f118428c.k();
                        vc.s.j(yVarK6);
                        zVar2 = new c84.c(pluginFlowContract$Input23, yVarK6);
                        return zVar2;
                    case 14:
                        KontomatikIncomeCheckFlowContract$InputData kontomatikIncomeCheckFlowContract$InputData = r3Var.f119646b;
                        hw3.d0 d0Var = (hw3.d0) c1Var16.T0.get();
                        hw3.c cVar13 = (hw3.c) c1Var16.f118472s0.get();
                        ow3.e eVar7 = (ow3.e) c1Var16.Y0.get();
                        PluginFlowContract$Input pluginFlowContract$Input24 = (PluginFlowContract$Input) r3Var.i.get();
                        c84.g gVar7 = (c84.g) r3Var.f119654p.get();
                        xa4.a aVar21 = (xa4.a) r3Var.k.get();
                        c1 c1Var18 = r3Var.f119647c;
                        gte.a aVarB6 = c1Var18.f118423b.b();
                        vc.s.j(aVarB6);
                        hz3.c cVarB6 = c1Var18.b();
                        xq3.j jVarD6 = c1Var18.f118428c.d();
                        vc.s.j(jVarD6);
                        mri.w wVarA12 = ((ozl.a) c1Var18.u).a();
                        vc.s.j(wVarA12);
                        hy3.j jVar6 = (hy3.j) c1Var18.Q1.get();
                        vie.i iVarB6 = c1Var18.z.b();
                        vc.s.j(iVarB6);
                        fVar2 = new com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.c(kontomatikIncomeCheckFlowContract$InputData, d0Var, cVar13, eVar7, e5f.b.w(pluginFlowContract$Input24, gVar7, aVar21, aVarB6, cVarB6, jVarD6, wVarA12, jVar6, iVarB6));
                        return fVar2;
                    case 15:
                        return new mc4.i();
                    default:
                        throw new AssertionError(i22);
                }
            case 7:
                t3 t3Var = (t3) this.d;
                int i32 = this.f118807c;
                if (i32 == 0) {
                    return e5f.b.e((com.revolut.kompot.navigable.a) t3Var.f119827a.get(), (c84.b) t3Var.f119829c.get(), (PluginFlowContract$Input) ((r3) this.f118806b).i.get());
                }
                if (i32 == 1) {
                    return new c84.b();
                }
                if (i32 == 2) {
                    return new wc4.k((cli.n) t3Var.f.get());
                }
                if (i32 == 3) {
                    return new tyc.l(new nc4.a());
                }
                throw new AssertionError(i32);
            case 8:
                u3 u3Var = (u3) this.d;
                int i33 = this.f118807c;
                if (i33 == 0) {
                    KontomatikSignInControllerContract$InputData kontomatikSignInControllerContract$InputData = u3Var.f119901a;
                    qd0.b bVarN = ((c1) this.f118806b).f118443h.n();
                    vc.s.j(bVarN);
                    return new com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.sign_in.a(kontomatikSignInControllerContract$InputData, bVarN, (cli.n) u3Var.e.get(), new yc4.a());
                }
                if (i33 == 1) {
                    return new qee.s(new mc4.h((c90.c) u3Var.d.get(), 0));
                }
                if (i33 != 2) {
                    throw new AssertionError(i33);
                }
                com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) u3Var.f119903c.get();
                zc4.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller, "controller");
                return new c90.c(controller.m2());
            case 9:
                return a();
            case 10:
                return b();
            case 11:
                return c();
            case 12:
                return d();
            case 13:
                return e();
            case 14:
                return f();
            case 15:
                return g();
            case 16:
                return h();
            case 17:
                return i();
            case 18:
                return j();
            case 19:
                return k();
            case 20:
                return l();
            case 21:
                return m();
            case 22:
                return n();
            case 23:
                return o();
            case 24:
                return p();
            case 25:
                return q();
            case 26:
                return r();
            case 27:
                return s();
            case 28:
                return t();
            default:
                c1 c1Var19 = (c1) this.f118806b;
                f5 f5Var = (f5) this.d;
                int i43 = this.f118807c;
                switch (i43) {
                    case 0:
                        return ige.d.h(f5Var.f118730a, (j60.a) f5Var.f118733g.get());
                    case 1:
                        return com.revolut.data.database.models.openbanking.d.q(f5Var.f118730a, (com.revolut.kompot.navigable.a) f5Var.e.get(), (rp0.m) f5Var.f.get());
                    case 2:
                        iq3.a aVar22 = f5Var.f118730a;
                        return new rp0.m();
                    case 3:
                        return e5f.b.x((c84.z) f5Var.f118740q.get());
                    case 4:
                        return new c84.z((c84.g) f5Var.f118739p.get(), (rz3.c) c1Var19.f118470r1.get(), (PluginFlowContract$Input) f5Var.i.get());
                    case 5:
                        PluginFlowContract$Input pluginFlowContract$Input25 = (PluginFlowContract$Input) f5Var.i.get();
                        e4m.e eVar8 = c1Var19.f118470r1;
                        uq3.b bVar19 = c1Var19.f118428c;
                        rz3.c cVar14 = (rz3.c) eVar8.get();
                        xa4.a aVar23 = (xa4.a) f5Var.k.get();
                        xq3.j jVarH25 = bVar19.h();
                        vc.s.j(jVarH25);
                        mri.w wVarA13 = ((ozl.a) c1Var19.u).a();
                        vc.s.j(wVarA13);
                        ii4.o oVar7 = (ii4.o) f5Var.o.get();
                        aq3.a aVarE7 = bVar19.e();
                        vc.s.j(aVarE7);
                        return new c84.i(pluginFlowContract$Input25, cVar14, aVar23, jVarH25, wVarA13, oVar7, aVarE7);
                    case 6:
                        PluginFlowContract$Input pluginFlowContract$Input26 = (PluginFlowContract$Input) f5Var.i.get();
                        c1 c1Var20 = f5Var.f118732c;
                        return new xa4.b(pluginFlowContract$Input26, ImmutableSet.of((ya4.g) new ya4.c(c1Var20.i(), (ya4.f) f5Var.f118735j.get()), (ya4.g) new ya4.c(c1Var20.b(), new py3.g()), (ya4.g) new ya4.c(new py3.c(), (ya4.f) f5Var.f118735j.get()), new ya4.g(new py3.f())));
                    case 7:
                        rz3.c cVar15 = (rz3.c) c1Var19.f118470r1.get();
                        xq3.j jVarH26 = c1Var19.f118428c.h();
                        vc.s.j(jVarH26);
                        return new ya4.f(cVar15, jVarH26);
                    case 8:
                        return new ii4.z((li4.a) f5Var.f118738n.get());
                    case 9:
                        return new li4.a(ImmutableMap.of(li4.d.class, (li4.b) f5Var.f118736l.get(), li4.e.class, (li4.b) f5Var.f118737m.get()));
                    case 10:
                        xq3.j jVarH27 = c1Var19.f118428c.h();
                        vc.s.j(jVarH27);
                        return new li4.c(jVarH27);
                    case 11:
                        uq3.b bVar20 = c1Var19.f118428c;
                        uq3.b bVar21 = c1Var19.f118428c;
                        xq3.j jVarH28 = bVar20.h();
                        vc.s.j(jVarH28);
                        xq3.c cVarF7 = bVar21.f();
                        vc.s.j(cVarF7);
                        sp3.a aVarM7 = bVar21.m();
                        vc.s.j(aVarM7);
                        return new ji4.b(jVarH28, cVarF7, aVarM7, c1Var19.i());
                    case 12:
                        c84.z zVar9 = (c84.z) f5Var.f118740q.get();
                        e5f.b.a(zVar9);
                        return zVar9;
                    case 13:
                        PluginFlowContract$Input pluginFlowContract$Input27 = (PluginFlowContract$Input) f5Var.i.get();
                        xr3.y yVarK7 = c1Var19.f118428c.k();
                        vc.s.j(yVarK7);
                        return new c84.c(pluginFlowContract$Input27, yVarK7);
                    case 14:
                        ProductArticlesFlowContract$InputData productArticlesFlowContract$InputData = f5Var.f118731b;
                        hw3.c cVar16 = (hw3.c) c1Var19.f118472s0.get();
                        wli.x xVarD2 = ((s41.a) c1Var19.f118485x).d();
                        PluginFlowContract$Input pluginFlowContract$Input28 = (PluginFlowContract$Input) f5Var.i.get();
                        c84.g gVar8 = (c84.g) f5Var.f118739p.get();
                        xa4.a aVar24 = (xa4.a) f5Var.k.get();
                        c1 c1Var21 = f5Var.f118732c;
                        gte.a aVarB7 = c1Var21.f118423b.b();
                        vc.s.j(aVarB7);
                        hz3.c cVarB7 = c1Var21.b();
                        xq3.j jVarD7 = c1Var21.f118428c.d();
                        vc.s.j(jVarD7);
                        mri.w wVarA14 = ((ozl.a) c1Var21.u).a();
                        vc.s.j(wVarA14);
                        hy3.j jVar7 = (hy3.j) c1Var21.Q1.get();
                        vie.i iVarB7 = c1Var21.z.b();
                        vc.s.j(iVarB7);
                        return new com.revolut.feature.credit.application.plugins.impl.ui.product_articles.a(productArticlesFlowContract$InputData, cVar16, xVarD2, e5f.b.w(pluginFlowContract$Input28, gVar8, aVar24, aVarB7, cVarB7, jVarD7, wVarA14, jVar7, iVarB7));
                    default:
                        throw new AssertionError(i43);
                }
        }
    }

    public g3(c1 c1Var, i3 i3Var, int i) {
        this.f118805a = 1;
        this.d = c1Var;
        this.f118806b = i3Var;
        this.f118807c = i;
    }
}
