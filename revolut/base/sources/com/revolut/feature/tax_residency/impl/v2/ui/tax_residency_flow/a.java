package com.revolut.feature.tax_residency.impl.v2.ui.tax_residency_flow;

import bt9.v;
import com.revolut.feature.tax_residency.api.BackNavigationType;
import com.revolut.feature.tax_residency.impl.v2.models.CountryRule;
import com.revolut.feature.tax_residency.impl.v2.models.Requirements;
import com.revolut.feature.tax_residency.impl.v2.models.UserSpecificRule;
import com.revolut.feature.tax_residency.impl.v2.ui.declaration_flow.TaxResidencyDeclarationFlowContract$InputData;
import com.revolut.feature.tax_residency.impl.v2.ui.declaration_flow.TaxResidencyDeclarationFlowContract$UseCase;
import com.revolut.feature.tax_residency.impl.v2.ui.tax_residency_flow.TaxResidencyFlowContract$Step;
import com.revolut.shared.feature.workflow.engine.api.models.MobileScreenParams;
import ht0.b0;
import hx7.e;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import jpe.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import rd0.c;
import vkm.j2;
import wg9.p;
import xf0.j;
import xif.k;
import xpe.b;
import xpe.f;
import xpe.g;
import yji.l;
import yki.i;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.r0;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends h implements b {
    public final TaxResidencyFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f90302p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final jvh.a f90303q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final a61.a f90304r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final lpe.d f90305s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final qki.d f90306t;
    public final i u;

    public a(TaxResidencyFlowContract$InputData inputData, d taxResidencyInteractor, jvh.a workflowInteractor, a61.a errorParser, lpe.d dialogProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(taxResidencyInteractor, "taxResidencyInteractor");
        Intrinsics.checkNotNullParameter(workflowInteractor, "workflowInteractor");
        Intrinsics.checkNotNullParameter(errorParser, "errorParser");
        Intrinsics.checkNotNullParameter(dialogProvider, "dialogProvider");
        this.o = inputData;
        this.f90302p = taxResidencyInteractor;
        this.f90303q = workflowInteractor;
        this.f90304r = errorParser;
        this.f90305s = dialogProvider;
        this.f90306t = e.b(this, new TaxResidencyFlowContract$State(r0.g(), r0.g(), f0.f322471a));
        this.u = d8l.d.a(this, new k(this, 17));
    }

    public static /* synthetic */ void M2(a aVar, int i, int i2) {
        if ((i2 & 1) != 0) {
            i = -1;
        }
        aVar.L2(i, (i2 & 2) != 0);
    }

    public final void I2(String str) {
        N2(new IllegalStateException(str), new b0(0, this, a.class, "initFlow", "initFlow()V", 0, 25));
    }

    public final void J2(wi0.b bVar, TaxResidencyDeclarationFlowContract$UseCase taxResidencyDeclarationFlowContract$UseCase) {
        TaxResidencyFlowContract$State taxResidencyFlowContract$State = (TaxResidencyFlowContract$State) ((j2) this.f90306t.f22677a).getValue();
        CountryRule countryRule = (CountryRule) taxResidencyFlowContract$State.f90292a.get(bVar);
        if (countryRule != null) {
            UserSpecificRule userSpecificRuleA = com.revolut.feature.tax_residency.impl.v2.models.a.a(taxResidencyFlowContract$State.f90293b, bVar);
            TaxResidencyFlowContract$InputData taxResidencyFlowContract$InputData = this.o;
            h.u2(this, this.u, new TaxResidencyFlowContract$Step.Declaration(new TaxResidencyDeclarationFlowContract$InputData(bVar, countryRule, userSpecificRuleA, taxResidencyDeclarationFlowContract$UseCase, taxResidencyFlowContract$InputData.d, taxResidencyFlowContract$InputData.f90290b.f90181c, taxResidencyFlowContract$InputData.f90289a, BackNavigationType.BACK, true)), null, 6);
            return;
        }
        I2("Missing declaration for " + bVar.f297794a + " requested, but rule not found");
    }

    public final void K2() {
        P2(new b0(0, this, a.class, "initFlow", "initFlow()V", 0, 26), new xpe.e(this, null, 1));
    }

    public final void L2(int i, boolean z) {
        int i2 = i + 1;
        TaxResidencyFlowContract$State taxResidencyFlowContract$State = (TaxResidencyFlowContract$State) ((j2) this.f90306t.f22677a).getValue();
        BackNavigationType backNavigationType = (z || this.u.c()) ? BackNavigationType.BACK : this.o.f90291c;
        Requirements.Step step = (Requirements.Step) d0.e0(i2, taxResidencyFlowContract$State.f90294c);
        if (step instanceof Requirements.Step.Fatca) {
            P2(new xpe.d(i, 0, this, z), new f(this, (Requirements.Step.Fatca) step, i2, taxResidencyFlowContract$State, z, backNavigationType, null));
            return;
        }
        if (step instanceof Requirements.Step.Crs) {
            P2(new xpe.d(i, 1, this, z), new g(this, (Requirements.Step.Crs) step, i2, taxResidencyFlowContract$State, z, backNavigationType, null));
        } else if (step instanceof Requirements.Step.DirectTin) {
            P2(new xpe.d(i, 2, this, z), new xpe.h(this, (Requirements.Step.DirectTin) step, i2, taxResidencyFlowContract$State, z, backNavigationType, null));
        } else {
            if (step != null) {
                throw new NoWhenBranchMatchedException();
            }
            O2(null, null, null);
        }
    }

    @Override // yki.j
    public final void M0() {
        K2();
    }

    public final void N2(Throwable th10, Function0 function0) {
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(c.ERROR, null, null, th10, h0Var);
        l.a1(this, X1(this.f90305s.b(th10, true)), null, null, new wo2.l(function0, this, (Continuation) null, 14), 3);
    }

    public final void O2(MobileScreenParams.TaxResidenciesCollection.PrimaryCountryReplacement primaryCountryReplacement, List list, List list2) {
        l2(new xpe.k(this, primaryCountryReplacement, list, list2, null), new p(this, primaryCountryReplacement, list, list2, 12));
    }

    public final void P2(Function0 function0, Function1 function1) {
        l2(new v(8, null, function1), new j(this, function0, 28));
    }

    @Override // qki.e
    public final qki.d getState() {
        return this.f90306t;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.u;
    }
}
