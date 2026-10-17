package com.revolut.feature.tax_residency.impl.flows.list;

import com.revolut.feature.tax_residency.impl.flows.list.TaxResidenciesListFlowContract$Step;
import com.revolut.feature.tax_residency.impl.flows.tin.TaxNumberInputFlow;
import com.revolut.feature.tax_residency.impl.flows.tin.TaxNumberInputFlowContract$InputData;
import com.revolut.feature.tax_residency.impl.screens.list.TaxResidencyListScreen;
import com.revolut.feature.tax_residency.impl.screens.list.TaxResidencyListScreenContract$InputData;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.g;
import ihm.k;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zme.f;
import zne.c;
import zne.d;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends g implements zne.a {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final TaxResidenciesListFlowContract$InputData f90035t;
    public final k u;
    public final k v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final TaxResidenciesListFlowContract$Step.TaxResidenciesList f90036w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final TaxResidenciesListFlowContract$State f90037x;

    public b(TaxResidenciesListFlowContract$InputData inputData, k updateTaxResidencySubject, k updateTaxCertificationsSubject) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(updateTaxResidencySubject, "updateTaxResidencySubject");
        Intrinsics.checkNotNullParameter(updateTaxCertificationsSubject, "updateTaxCertificationsSubject");
        this.f90035t = inputData;
        this.u = updateTaxResidencySubject;
        this.v = updateTaxCertificationsSubject;
        wi0.b bVar = inputData.f90020a;
        List list = inputData.f90021b;
        List list2 = inputData.f90022c;
        this.f90036w = new TaxResidenciesListFlowContract$Step.TaxResidenciesList(list, list2, inputData.d, bVar);
        this.f90037x = new TaxResidenciesListFlowContract$State(bVar, list, list2);
    }

    public final void O2(f fVar) {
        List list = ((TaxResidenciesListFlowContract$State) A2().f98429a).f90030b;
        if (list == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        wi0.b bVar = ((TaxResidenciesListFlowContract$State) A2().f98429a).f90029a;
        if (bVar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        List list2 = ((TaxResidenciesListFlowContract$State) A2().f98429a).f90031c;
        if (list2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        TaxResidenciesListFlowContract$InputData taxResidenciesListFlowContract$InputData = this.f90035t;
        d2(new TaxNumberInputFlow(new TaxNumberInputFlowContract$InputData(list, bVar, list2, taxResidenciesListFlowContract$InputData.d, fVar, taxResidenciesListFlowContract$InputData.f, true, taxResidenciesListFlowContract$InputData.f90023g, taxResidenciesListFlowContract$InputData.f90027m, taxResidenciesListFlowContract$InputData.f90028n)), ModalDestination.Style.POPUP.f98311a, new c(this, 1));
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        TaxResidenciesListFlowContract$Step step = (TaxResidenciesListFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (!(step instanceof TaxResidenciesListFlowContract$Step.TaxResidenciesList)) {
            throw new NoWhenBranchMatchedException();
        }
        TaxResidenciesListFlowContract$Step.TaxResidenciesList taxResidenciesList = (TaxResidenciesListFlowContract$Step.TaxResidenciesList) step;
        TaxResidenciesListFlowContract$InputData taxResidenciesListFlowContract$InputData = this.f90035t;
        TaxResidencyListScreen taxResidencyListScreen = new TaxResidencyListScreen(new TaxResidencyListScreenContract$InputData(taxResidenciesListFlowContract$InputData.f90025j, taxResidenciesListFlowContract$InputData.k, taxResidenciesList.f90032a, taxResidenciesList.f90033b, taxResidenciesList.f90034c, taxResidenciesList.d, taxResidenciesListFlowContract$InputData.f90024h, taxResidenciesListFlowContract$InputData.i, taxResidenciesListFlowContract$InputData.f90026l, taxResidenciesListFlowContract$InputData.f90023g, taxResidenciesListFlowContract$InputData.f90027m, taxResidenciesListFlowContract$InputData.f90028n));
        c block = new c(this, 0);
        Intrinsics.checkNotNullParameter(block, "block");
        taxResidencyListScreen.H = block;
        return taxResidencyListScreen;
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.f90037x;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.f90036w;
    }
}
