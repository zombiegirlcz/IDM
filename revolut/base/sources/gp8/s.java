package gp8;

import com.revolut.feature.junior_tasks.impl.services.JuniorTasksRewardsQuoteService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public abstract class s implements e4m.e {
    public static JuniorTasksRewardsQuoteService a(ek.a converterFactory, ik0.b retrofitFactory) {
        r.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Object objCreate = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27).create(JuniorTasksRewardsQuoteService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        JuniorTasksRewardsQuoteService juniorTasksRewardsQuoteService = (JuniorTasksRewardsQuoteService) objCreate;
        vc.s.k(juniorTasksRewardsQuoteService);
        return juniorTasksRewardsQuoteService;
    }
}
