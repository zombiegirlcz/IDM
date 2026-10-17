package ltl;

import kotlin.jvm.internal.Intrinsics;
import wul.o;

/* JADX INFO: loaded from: classes12.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yd9.e f199967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f199968b;

    public b(yd9.e ordersMapper, htl.a investOrderToLegacyMapper, o tradingOrderMapper) {
        Intrinsics.checkNotNullParameter(ordersMapper, "ordersMapper");
        Intrinsics.checkNotNullParameter(investOrderToLegacyMapper, "investOrderToLegacyMapper");
        Intrinsics.checkNotNullParameter(tradingOrderMapper, "tradingOrderMapper");
        this.f199967a = ordersMapper;
        this.f199968b = tradingOrderMapper;
    }
}
