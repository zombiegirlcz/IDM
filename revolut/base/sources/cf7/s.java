package cf7;

import com.revolut.feature.incentive_reward.impl.network.IncentiveRewardService;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Converter;

/* JADX INFO: loaded from: classes22.dex */
public abstract class s implements e4m.e {
    public static IncentiveRewardService a(ik0.b retrofitFactory, Converter.Factory converterFactory) {
        r.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Object objCreate = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27).create(IncentiveRewardService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        IncentiveRewardService incentiveRewardService = (IncentiveRewardService) objCreate;
        vc.s.k(incentiveRewardService);
        return incentiveRewardService;
    }
}
