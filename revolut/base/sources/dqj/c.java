package dqj;

import com.revolut.retail.feature.impl.balance_history.network.BalanceHistoryService;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Converter;

/* JADX INFO: loaded from: classes11.dex */
public abstract class c implements e4m.e {
    public static BalanceHistoryService a(ik0.b retrofitFactory, Converter.Factory converterFactory) {
        b.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Object objCreate = ik0.b.a(retrofitFactory, null, null, new pqj.a(converterFactory), null, 27).create(BalanceHistoryService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        BalanceHistoryService balanceHistoryService = (BalanceHistoryService) objCreate;
        vc.s.k(balanceHistoryService);
        return balanceHistoryService;
    }
}
