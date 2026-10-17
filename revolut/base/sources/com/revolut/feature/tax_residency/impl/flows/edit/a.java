package com.revolut.feature.tax_residency.impl.flows.edit;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.tax_residency.impl.R$string;
import com.revolut.feature.tax_residency.impl.flows.edit.EditTaxResidenciesFlowContract$Step;
import com.revolut.feature.tax_residency.impl.flows.list.TaxResidenciesListFlow;
import com.revolut.feature.tax_residency.impl.flows.list.TaxResidenciesListFlowContract$InputData;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.g;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import wi0.b;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends g implements yne.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final EditTaxResidenciesFlowContract$InputData f90019t;
    public final EditTaxResidenciesFlowContract$Step.TaxResidenciesList u;
    public final EditTaxResidenciesFlowContract$State v;

    public a(EditTaxResidenciesFlowContract$InputData inputData, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f90019t = inputData;
        this.u = EditTaxResidenciesFlowContract$Step.TaxResidenciesList.f90018a;
        this.v = new EditTaxResidenciesFlowContract$State(null, null, null);
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        EditTaxResidenciesFlowContract$Step step = (EditTaxResidenciesFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (!(step instanceof EditTaxResidenciesFlowContract$Step.TaxResidenciesList)) {
            throw new NoWhenBranchMatchedException();
        }
        f0 f0Var = f0.f322471a;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.tax_residency_list_reasonableness_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.tax_residency_common_action_continue, null, null, 14);
        EditTaxResidenciesFlowContract$InputData editTaxResidenciesFlowContract$InputData = this.f90019t;
        TaxResidenciesListFlow taxResidenciesListFlow = new TaxResidenciesListFlow(new TaxResidenciesListFlowContract$InputData((b) null, (List) null, (List) null, (List) f0Var, false, false, true, true, textLocalisedClause, textLocalisedClause2, editTaxResidenciesFlowContract$InputData.f90012a, editTaxResidenciesFlowContract$InputData.f90013b, true, 7));
        yne.b bVar = new yne.b(this, 0);
        Intrinsics.checkNotNullParameter(bVar, "<set-?>");
        taxResidenciesListFlow.J = bVar;
        return taxResidenciesListFlow;
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
