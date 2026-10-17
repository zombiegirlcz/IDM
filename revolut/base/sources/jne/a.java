package jne;

import aii.u;
import com.revolut.feature.tax_residency.api.exemption.TaxExemptionDestination$TaxExemption;
import com.revolut.feature.tax_residency.impl.exemption.flows.main.TaxExemptionFlow;
import com.revolut.feature.tax_residency.impl.exemption.flows.main.TaxExemptionFlowContract$InputData;
import dki.g;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements ohi.a, nte.a {
    @Override // nte.a
    public final List e() {
        return f0.f322471a;
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof TaxExemptionDestination$TaxExemption) {
            return new TaxExemptionFlow(new TaxExemptionFlowContract$InputData(((TaxExemptionDestination$TaxExemption) destination).getF89967a()));
        }
        return null;
    }
}
