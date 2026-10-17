package tr2;

import com.revolut.feature.blocked_merchants.impl.data.network.BlockedMerchantsService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public abstract class e implements e4m.e {
    public static BlockedMerchantsService a(ek.a converterFactory, ik0.b retrofitFactory) {
        a.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Object objCreate = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27).create(BlockedMerchantsService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        BlockedMerchantsService blockedMerchantsService = (BlockedMerchantsService) objCreate;
        vc.s.k(blockedMerchantsService);
        return blockedMerchantsService;
    }
}
