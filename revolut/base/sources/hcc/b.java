package hcc;

import aii.u;
import com.revolut.feature.revolutpay.promoted_merchants.api.navigation.PromotedMerchantsDestination;
import com.revolut.feature.revolutpay.promoted_merchants.impl.ui.flow.promotedmerchants.PromotedMerchantsFlow;
import dki.g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements ohi.a {
    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof PromotedMerchantsDestination) {
            return new PromotedMerchantsFlow(((PromotedMerchantsDestination) destination).f84666a);
        }
        return null;
    }
}
