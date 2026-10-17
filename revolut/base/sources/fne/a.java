package fne;

import aii.e;
import aii.g;
import aii.u;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.tax_residency.api.BackNavigationType;
import com.revolut.feature.tax_residency.api.TaxResidencyDestination$CollectTaxResidencies;
import com.revolut.feature.tax_residency.api.TaxResidencyDestination$EditTaxResidencies;
import com.revolut.feature.tax_residency.api.TaxResidencyDestination$SingleTinSelection;
import com.revolut.feature.tax_residency.api.TaxResidencyFlowControllerDescriptor;
import com.revolut.feature.tax_residency.impl.flows.collection.CollectTaxResidencyFlow;
import com.revolut.feature.tax_residency.impl.flows.collection.CollectTaxResidencyFlowContract$InputData;
import com.revolut.feature.tax_residency.impl.flows.edit.EditTaxResidenciesFlow;
import com.revolut.feature.tax_residency.impl.flows.edit.EditTaxResidenciesFlowContract$InputData;
import com.revolut.feature.tax_residency.impl.flows.single_tin.SingleTinCollectionFlow;
import com.revolut.feature.tax_residency.impl.flows.single_tin.SingleTinCollectionFlowContract$InputData;
import com.revolut.feature.tax_residency.impl.v2.models.TaxResidencyFlowContext;
import com.revolut.feature.tax_residency.impl.v2.ui.tax_residency_flow.TaxResidencyFlow;
import com.revolut.feature.tax_residency.impl.v2.ui.tax_residency_flow.TaxResidencyFlowContract$InputData;
import grl.k9;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements ohi.a, nte.a {
    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!(descriptor instanceof TaxResidencyFlowControllerDescriptor)) {
            return null;
        }
        TaxResidencyFlowControllerDescriptor taxResidencyFlowControllerDescriptor = (TaxResidencyFlowControllerDescriptor) descriptor;
        String f89962a = taxResidencyFlowControllerDescriptor.getF89962a();
        TaxResidencyFlowContext taxResidencyFlowContext = new TaxResidencyFlowContext(taxResidencyFlowControllerDescriptor.getD(), taxResidencyFlowControllerDescriptor.getF89964c(), taxResidencyFlowControllerDescriptor.getF89963b());
        BackNavigationType e = taxResidencyFlowControllerDescriptor.getE();
        k9 k9Var = k9.TaxResidency;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return taxResidencyFlowControllerDescriptor.a(new TaxResidencyFlow(new TaxResidencyFlowContract$InputData(f89962a, taxResidencyFlowContext, e, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var))));
    }

    @Override // nte.a
    public final List e() {
        return f0.f322471a;
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (!(destination instanceof TaxResidencyDestination$CollectTaxResidencies)) {
            if (destination instanceof TaxResidencyDestination$EditTaxResidencies) {
                TaxResidencyDestination$EditTaxResidencies taxResidencyDestination$EditTaxResidencies = (TaxResidencyDestination$EditTaxResidencies) destination;
                return new EditTaxResidenciesFlow(new EditTaxResidenciesFlowContract$InputData(taxResidencyDestination$EditTaxResidencies.f89958a, taxResidencyDestination$EditTaxResidencies.f89959b, 2));
            }
            if (!(destination instanceof TaxResidencyDestination$SingleTinSelection)) {
                return null;
            }
            TaxResidencyDestination$SingleTinSelection taxResidencyDestination$SingleTinSelection = (TaxResidencyDestination$SingleTinSelection) destination;
            wi0.b bVar = taxResidencyDestination$SingleTinSelection.f89960a;
            AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
            k9 k9Var = frl.a.f137506s;
            return new SingleTinCollectionFlow(new SingleTinCollectionFlowContract$InputData(bVar, com.google.android.gms.internal.mlkit_vision_face.a.g(companion, k9Var, k9Var), taxResidencyDestination$SingleTinSelection.f89961b == null));
        }
        TaxResidencyDestination$CollectTaxResidencies taxResidencyDestination$CollectTaxResidencies = (TaxResidencyDestination$CollectTaxResidencies) destination;
        wi0.b bVar2 = taxResidencyDestination$CollectTaxResidencies.f89954a;
        boolean z = taxResidencyDestination$CollectTaxResidencies.f89955b;
        boolean z3 = taxResidencyDestination$CollectTaxResidencies.f89956c;
        AnalyticsProduct analyticsProductG = taxResidencyDestination$CollectTaxResidencies.d;
        if (analyticsProductG == null) {
            AnalyticsProduct.Companion companion2 = AnalyticsProduct.INSTANCE;
            k9 k9Var2 = frl.a.f137506s;
            analyticsProductG = com.google.android.gms.internal.mlkit_vision_face.a.g(companion2, k9Var2, k9Var2);
        }
        return new CollectTaxResidencyFlow(new CollectTaxResidencyFlowContract$InputData(bVar2, z, z3, taxResidencyDestination$CollectTaxResidencies.f, analyticsProductG, true, taxResidencyDestination$CollectTaxResidencies.f89957g, taxResidencyDestination$CollectTaxResidencies.e));
    }
}
