package qf7;

import com.revolut.feature.incentive_reward.impl.model.IncentiveRewardDetailsParams;
import com.revolut.feature.incentive_reward.impl.model.lotteries.LotteryParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c {
    private c() {
    }

    public static String a(LotteryParams lotteryParams) {
        Intrinsics.checkNotNullParameter(lotteryParams, "<this>");
        return j6.a.q("LotteryDrawParams-", lotteryParams.f74855a);
    }

    public static String b(LotteryParams lotteryParams) {
        Intrinsics.checkNotNullParameter(lotteryParams, "<this>");
        return j6.a.q("LotteryEnrollmentParams-", lotteryParams.f74855a);
    }

    public static String c(IncentiveRewardDetailsParams incentiveRewardDetailsParams) {
        Intrinsics.checkNotNullParameter(incentiveRewardDetailsParams, "<this>");
        return p.a.p("IncentiveRewardDetailsParams-v2-", incentiveRewardDetailsParams.f74850a, "-REWARD}");
    }
}
