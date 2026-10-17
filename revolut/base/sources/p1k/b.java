package p1k;

import aii.u;
import com.revolut.retail.feature.payment_options.api.PaymentOptionsFeatureConfig;
import com.revolut.retail.feature.payment_options.impl.ui.flow.PaymentOptionsFlow;
import com.revolut.retail.feature.payment_options.impl.ui.flow.PaymentOptionsFlowContract$InputData;
import dki.g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements ohi.a {
    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof PaymentOptionsFeatureConfig.PaymentOptionsDestination) {
            return new PaymentOptionsFlow(new PaymentOptionsFlowContract$InputData(((PaymentOptionsFeatureConfig.PaymentOptionsDestination) destination).getF101881a()));
        }
        return null;
    }
}
