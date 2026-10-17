package c1g;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f0 extends lk0.d {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(Function0 getPagedData, Function1 storePagedData, Function0 initialParams, gcc.g promotedMerchantsRepository, efm.c0 singleThreadScheduler) {
        super(new gcc.b(promotedMerchantsRepository, 3), new a3l.b(6, getPagedData), new js7.c(2, storePagedData), (ucc.g) initialParams.invoke(), new k9h.d(24), new k9h.d(25), singleThreadScheduler);
        Intrinsics.checkNotNullParameter(getPagedData, "getPagedData");
        Intrinsics.checkNotNullParameter(storePagedData, "storePagedData");
        Intrinsics.checkNotNullParameter(initialParams, "initialParams");
        Intrinsics.checkNotNullParameter(promotedMerchantsRepository, "promotedMerchantsRepository");
        Intrinsics.checkNotNullParameter(singleThreadScheduler, "singleThreadScheduler");
    }
}
