package k8i;

import h5i.g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f182165a;

    public b(g currencyExchangeSummaryMapper, a creditCardExtraDataMapper) {
        Intrinsics.checkNotNullParameter(currencyExchangeSummaryMapper, "currencyExchangeSummaryMapper");
        Intrinsics.checkNotNullParameter(creditCardExtraDataMapper, "creditCardExtraDataMapper");
        this.f182165a = currencyExchangeSummaryMapper;
    }
}
