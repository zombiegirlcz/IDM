package yc3;

import aii.u;
import com.revolut.feature.cashback.api.navigation.YourCashbackFeatureConfig;
import com.revolut.feature.cashback.impl.ui.yourcashback.YourCashbackFlow;
import com.revolut.feature.cashback.impl.ui.yourcashback.YourCashbackFlowContract$InputData;
import com.revolut.feature.cashback.impl.ui.yourcashback.YourCashbackFlowContract$Step;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class k implements ohi.a {
    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof YourCashbackFeatureConfig.HomeDestination) {
            return new YourCashbackFlow(new YourCashbackFlowContract$InputData(new YourCashbackFlowContract$Step.Home(((YourCashbackFeatureConfig.HomeDestination) destination).f65693c)));
        }
        if (destination instanceof YourCashbackFeatureConfig.ProductDestination) {
            YourCashbackFeatureConfig.ProductDestination productDestination = (YourCashbackFeatureConfig.ProductDestination) destination;
            return new YourCashbackFlow(new YourCashbackFlowContract$InputData(new YourCashbackFlowContract$Step.Product(productDestination.f65696a, productDestination.f65697b)));
        }
        if (destination instanceof YourCashbackFeatureConfig.WithdrawPlanCashbackDestination) {
            return new YourCashbackFlow(new YourCashbackFlowContract$InputData(new YourCashbackFlowContract$Step.WithdrawMetal(((YourCashbackFeatureConfig.WithdrawPlanCashbackDestination) destination).f65698a)));
        }
        if (destination instanceof YourCashbackFeatureConfig.PlanCashbackDetailsDestination) {
            return new YourCashbackFlow(new YourCashbackFlowContract$InputData(new YourCashbackFlowContract$Step.PlanCashbackDetails(((YourCashbackFeatureConfig.PlanCashbackDetailsDestination) destination).f65695a)));
        }
        return null;
    }
}
