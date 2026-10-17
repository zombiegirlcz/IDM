package w6j;

import aii.e;
import aii.g;
import aii.u;
import com.revolut.retail.feature.commodity.order_flow.api.CommodityOrderFlowApi$Toggles$CommodityOrderKeyboardSuggestions;
import com.revolut.retail.feature.commodity.order_flow.api.CommodityOrderFlowApi$Toggles$CommodityRecurringBuys;
import com.revolut.retail.feature.commodity.order_flow.api.navigation.CommodityOrderFlowDestination;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.CommodityOrderFlow;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.CommodityOrderFlowContract$InputData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements ohi.a, nte.a {
    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        super.c(descriptor);
        return null;
    }

    @Override // nte.a
    public final List e() {
        return v.k(CommodityOrderFlowApi$Toggles$CommodityRecurringBuys.f99801c, CommodityOrderFlowApi$Toggles$CommodityOrderKeyboardSuggestions.f99800c);
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (!(destination instanceof CommodityOrderFlowDestination)) {
            return null;
        }
        CommodityOrderFlowDestination commodityOrderFlowDestination = (CommodityOrderFlowDestination) destination;
        return new CommodityOrderFlow(new CommodityOrderFlowContract$InputData(commodityOrderFlowDestination.f99808a, commodityOrderFlowDestination.f99809b));
    }
}
