package com.revolut.feature.tax_residency.impl.v2.ui.multi_residency_flow;

import com.revolut.feature.tax_residency.impl.v2.models.CountryRule;
import com.revolut.feature.tax_residency.impl.v2.ui.declaration_flow.TaxResidencyDeclarationFlowContract$UseCase;
import com.revolut.feature.tax_residency.impl.v2.ui.multi_residency_flow.MultiResidencyFlowContract$Step;
import com.revolut.kompot.common.ModalDestination;
import java.util.List;
import jpe.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import wde.f;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends h implements wpe.b {
    public final MultiResidencyFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f90287p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yki.a f90288q;

    public c(MultiResidencyFlowContract$InputData inputData, d taxResidencyInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(taxResidencyInteractor, "taxResidencyInteractor");
        this.o = inputData;
        this.f90287p = taxResidencyInteractor;
        this.f90288q = cp5.d.a(this, inputData.f90276c ? new MultiResidencyFlowContract$Step.AddTaxResidencyDeclaration(true, null, inputData.f, inputData.f90279j) : MultiResidencyFlowContract$Step.TaxResidencyList.f90286a, f0.f322471a, new f(this, 22));
    }

    public final void I2(wi0.b bVar, TaxResidencyDeclarationFlowContract$UseCase taxResidencyDeclarationFlowContract$UseCase, List list) {
        CountryRule countryRule = (CountryRule) this.o.d.get(bVar);
        if (countryRule == null) {
            C2(new wpe.d(p.a.p("Unable to edit tax residency declaration for ", bVar.f297794a, ". CountryRule is missing.")));
            return;
        }
        h.w2(this.f90288q, new MultiResidencyFlowContract$Step.EditTaxResidencyDeclaration(bVar, countryRule, taxResidencyDeclarationFlowContract$UseCase, list), ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f90288q;
    }
}
