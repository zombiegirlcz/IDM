package kvb;

import com.revolut.feature.rev_points.exclusive_store.impl.data.network.ExclusiveStoreService;
import kotlin.jvm.internal.Intrinsics;
import vc.s;

/* JADX INFO: loaded from: classes6.dex */
public abstract class i implements e4m.e {
    public static ExclusiveStoreService a(ek.a converterFactory, ik0.b retrofitFactory) {
        h.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        ExclusiveStoreService exclusiveStoreService = (ExclusiveStoreService) ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27).create(ExclusiveStoreService.class);
        s.k(exclusiveStoreService);
        return exclusiveStoreService;
    }
}
