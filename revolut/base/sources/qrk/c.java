package qrk;

import kotlin.jvm.internal.Intrinsics;
import lrk.o;
import w4l.k;

/* JADX INFO: loaded from: classes12.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f248737a;

    public c(o stockInsightsRepository) {
        Intrinsics.checkNotNullParameter(stockInsightsRepository, "stockInsightsRepository");
        this.f248737a = stockInsightsRepository;
    }

    public final vkm.d a(String ref2, k loadingStrategy) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return this.f248737a.f199544c.b(ref2, loadingStrategy);
    }

    public final vkm.d b(String ref2, k loadingStrategy) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return this.f248737a.e.b(ref2, loadingStrategy);
    }

    public final vkm.d c(String ref2, k loadingStrategy) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return this.f248737a.f199545g.b(ref2, loadingStrategy);
    }
}
