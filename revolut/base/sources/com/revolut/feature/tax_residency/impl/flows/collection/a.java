package com.revolut.feature.tax_residency.impl.flows.collection;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.tax_residency.api.WhatIsTaxDialogConfig;
import com.revolut.feature.tax_residency.impl.R$string;
import com.revolut.feature.tax_residency.impl.flows.collection.CollectTaxResidencyFlowContract$Step;
import com.revolut.feature.tax_residency.impl.flows.list.TaxResidenciesListFlow;
import com.revolut.feature.tax_residency.impl.flows.list.TaxResidenciesListFlowContract$InputData;
import com.revolut.feature.tax_residency.impl.flows.submit.SubmitTaxResidencyFlow;
import com.revolut.feature.tax_residency.impl.flows.submit.SubmitTaxResidencyFlowContract$InputData;
import com.revolut.feature.tax_residency.impl.flows.tin.TaxNumberInputFlow;
import com.revolut.feature.tax_residency.impl.flows.tin.TaxNumberInputFlowContract$InputData;
import com.revolut.feature.tax_residency.impl.screens.prefetch.TaxResidencyPrefetchDataScreen;
import com.revolut.feature.tax_residency.impl.screens.prefetch.TaxResidencyPrefetchDataScreenContract$InputData;
import com.revolut.feature.tax_residency.impl.ui.sole.TaxResidencySoleScreen;
import com.revolut.feature.tax_residency.impl.ui.sole.TaxResidencySoleScreenContract$InputData;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.g;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import xf0.j;
import xne.c;
import yji.l;
import zhm.f0;
import zhm.v;
import zme.f;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends g implements xne.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final CollectTaxResidencyFlowContract$InputData f90011t;
    public final CollectTaxResidencyFlowContract$Step.PrefetchData u;
    public final CollectTaxResidencyFlowContract$State v;

    public a(CollectTaxResidencyFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f90011t = inputData;
        this.u = CollectTaxResidencyFlowContract$Step.PrefetchData.f90008a;
        f0 f0Var = f0.f322471a;
        this.v = new CollectTaxResidencyFlowContract$State(null, f0Var, inputData.f89998a, f0Var, f0Var, 1);
    }

    public final void O2(String str, List list) {
        L2(CollectTaxResidencyFlowContract$State.a((CollectTaxResidencyFlowContract$State) A2().f98429a, null, null, null, null, list, 15));
        l.i2(this, new SubmitTaxResidencyFlow(new SubmitTaxResidencyFlowContract$InputData(((CollectTaxResidencyFlowContract$State) A2().f98429a).b(), ((CollectTaxResidencyFlowContract$State) A2().f98429a).e, ((CollectTaxResidencyFlowContract$State) A2().f98429a).f90004b, ((CollectTaxResidencyFlowContract$State) A2().f98429a).d, f0.f322471a, this.f90011t.f, str, 64)), null, new c(this, 4), 1);
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        CollectTaxResidencyFlowContract$Step step = (CollectTaxResidencyFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        boolean z = step instanceof CollectTaxResidencyFlowContract$Step.PrefetchData;
        CollectTaxResidencyFlowContract$InputData collectTaxResidencyFlowContract$InputData = this.f90011t;
        if (z) {
            TaxResidencyPrefetchDataScreen taxResidencyPrefetchDataScreen = new TaxResidencyPrefetchDataScreen(new TaxResidencyPrefetchDataScreenContract$InputData(collectTaxResidencyFlowContract$InputData.f89998a, collectTaxResidencyFlowContract$InputData.f89999b, false));
            c cVar = new c(this, 1);
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            taxResidencyPrefetchDataScreen.H = cVar;
            return taxResidencyPrefetchDataScreen;
        }
        if (step instanceof CollectTaxResidencyFlowContract$Step.List) {
            TaxResidenciesListFlow taxResidenciesListFlow = new TaxResidenciesListFlow(new TaxResidenciesListFlowContract$InputData(((CollectTaxResidencyFlowContract$State) A2().f98429a).f90005c, v.l(((CollectTaxResidencyFlowContract$State) A2().f98429a).f90003a), ((CollectTaxResidencyFlowContract$State) A2().f98429a).f90004b, ((CollectTaxResidencyFlowContract$State) A2().f98429a).d, !collectTaxResidencyFlowContract$InputData.f90001g, true, collectTaxResidencyFlowContract$InputData.f90000c, false, new TextLocalisedClause(R$string.tax_residency_list_title, null, null, 14), new TextLocalisedClause(R$string.tax_residency_common_action_continue, null, null, 14), (WhatIsTaxDialogConfig) null, collectTaxResidencyFlowContract$InputData.e, collectTaxResidencyFlowContract$InputData.d, 2304));
            c cVar2 = new c(this, 2);
            Intrinsics.checkNotNullParameter(cVar2, "<set-?>");
            taxResidenciesListFlow.J = cVar2;
            return taxResidenciesListFlow;
        }
        if (step instanceof CollectTaxResidencyFlowContract$Step.SolePrompt) {
            TaxResidencySoleScreen taxResidencySoleScreen = new TaxResidencySoleScreen(new TaxResidencySoleScreenContract$InputData(((CollectTaxResidencyFlowContract$State) A2().f98429a).b()));
            c block = new c(this, 3);
            Intrinsics.checkNotNullParameter(block, "block");
            taxResidencySoleScreen.H = block;
            return taxResidencySoleScreen;
        }
        if (step instanceof CollectTaxResidencyFlowContract$Step.LocalTinInput) {
            TaxNumberInputFlow taxNumberInputFlow = new TaxNumberInputFlow(new TaxNumberInputFlowContract$InputData(v.l(((CollectTaxResidencyFlowContract$State) A2().f98429a).f90003a), ((CollectTaxResidencyFlowContract$State) A2().f98429a).b(), ((CollectTaxResidencyFlowContract$State) A2().f98429a).f90004b, ((CollectTaxResidencyFlowContract$State) A2().f98429a).d, new f(((CollectTaxResidencyFlowContract$State) A2().f98429a).b(), null, null, false, null, null, 62), true, false, collectTaxResidencyFlowContract$InputData.f90000c, collectTaxResidencyFlowContract$InputData.e, collectTaxResidencyFlowContract$InputData.d));
            j jVar = new j(this, taxNumberInputFlow, 24);
            Intrinsics.checkNotNullParameter(jVar, "<set-?>");
            taxNumberInputFlow.J = jVar;
            return taxNumberInputFlow;
        }
        if (!(step instanceof CollectTaxResidencyFlowContract$Step.SoleTinInput)) {
            throw new NoWhenBranchMatchedException();
        }
        TaxNumberInputFlow taxNumberInputFlow2 = new TaxNumberInputFlow(new TaxNumberInputFlowContract$InputData(v.l(((CollectTaxResidencyFlowContract$State) A2().f98429a).f90003a), ((CollectTaxResidencyFlowContract$State) A2().f98429a).b(), ((CollectTaxResidencyFlowContract$State) A2().f98429a).f90004b, ((CollectTaxResidencyFlowContract$State) A2().f98429a).d, new f(((CollectTaxResidencyFlowContract$State) A2().f98429a).b(), null, null, false, null, null, 62), true, true, collectTaxResidencyFlowContract$InputData.f90000c, collectTaxResidencyFlowContract$InputData.e, collectTaxResidencyFlowContract$InputData.d));
        c cVar3 = new c(this, 0);
        Intrinsics.checkNotNullParameter(cVar3, "<set-?>");
        taxNumberInputFlow2.J = cVar3;
        return taxNumberInputFlow2;
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.v;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.u;
    }
}
