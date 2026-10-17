package mf7;

import aii.p;
import aii.u;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.incentive_reward.api.navigation.IncentiveRewardFeatureConfig;
import com.revolut.feature.incentive_reward.api.navigation.LotteryDrawDestination;
import com.revolut.feature.incentive_reward.api.navigation.LotteryEnrollmentDestination;
import com.revolut.feature.incentive_reward.api.navigation.RedeemRewardDestination;
import com.revolut.feature.incentive_reward.impl.navigation.IncentiveRewardDetailsDestination;
import com.revolut.feature.incentive_reward.impl.ui.incentive_reward.flow.IncentiveRewardFlow;
import com.revolut.feature.incentive_reward.impl.ui.incentive_reward.flow.IncentiveRewardFlowContract$InputData$Details;
import com.revolut.feature.incentive_reward.impl.ui.incentive_selection.flow.IncentiveSelectionFlow;
import com.revolut.feature.incentive_reward.impl.ui.incentive_selection.flow.IncentiveSelectionFlowContract$InputData;
import com.revolut.feature.incentive_reward.impl.ui.lottery.draw.flow.LotteryDrawFlow;
import com.revolut.feature.incentive_reward.impl.ui.lottery.draw.flow.LotteryDrawFlowContract$InputData;
import com.revolut.feature.incentive_reward.impl.ui.lottery.enrollment.screen.LotteryEnrollmentController;
import com.revolut.feature.incentive_reward.impl.ui.lottery.enrollment.screen.LotteryEnrollmentControllerContract$InputData;
import com.revolut.feature.incentive_reward.impl.ui.redeem_reward.flow.RedeemRewardFlow;
import com.revolut.feature.incentive_reward.impl.ui.redeem_reward.flow.RedeemRewardFlowContract$InputData;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f204954a;

    public b(ImmutableSet deeplinkGateways) {
        Intrinsics.checkNotNullParameter(deeplinkGateways, "deeplinkGateways");
        this.f204954a = deeplinkGateways;
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof IncentiveRewardDetailsDestination) {
            return new IncentiveRewardFlow(new IncentiveRewardFlowContract$InputData$Details(((IncentiveRewardDetailsDestination) destination).getF74860a()));
        }
        if (destination instanceof IncentiveRewardFeatureConfig.SelectionDestination) {
            IncentiveRewardFeatureConfig.SelectionDestination selectionDestination = (IncentiveRewardFeatureConfig.SelectionDestination) destination;
            return new IncentiveSelectionFlow(new IncentiveSelectionFlowContract$InputData(selectionDestination.getF74843a(), selectionDestination.a(), selectionDestination.getD(), selectionDestination.getF74844b(), selectionDestination.getE()));
        }
        if (destination instanceof RedeemRewardDestination) {
            RedeemRewardDestination redeemRewardDestination = (RedeemRewardDestination) destination;
            return new RedeemRewardFlow(new RedeemRewardFlowContract$InputData(redeemRewardDestination.getF74848a(), redeemRewardDestination.getF74849b()));
        }
        if (destination instanceof LotteryEnrollmentDestination) {
            return gc0.c.b(new LotteryEnrollmentController(new LotteryEnrollmentControllerContract$InputData(((LotteryEnrollmentDestination) destination).getF74847a())), new aab.b(24));
        }
        if (destination instanceof LotteryDrawDestination) {
            return new LotteryDrawFlow(new LotteryDrawFlowContract$InputData(((LotteryDrawDestination) destination).getF74846a()));
        }
        return null;
    }

    @Override // aii.p
    public final Set h() {
        return this.f204954a;
    }
}
