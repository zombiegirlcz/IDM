package t2i;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f267577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h5i.g f267578b;

    public e(j orderDetailsUiMapper, h5i.g currencyExchangeSummaryMapper) {
        Intrinsics.checkNotNullParameter(orderDetailsUiMapper, "orderDetailsUiMapper");
        Intrinsics.checkNotNullParameter(currencyExchangeSummaryMapper, "currencyExchangeSummaryMapper");
        this.f267577a = orderDetailsUiMapper;
        this.f267578b = currencyExchangeSummaryMapper;
    }
}
