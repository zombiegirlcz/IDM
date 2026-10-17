package q3d;

import kotlin.jvm.internal.Intrinsics;
import l3d.h0;
import l3d.r;

/* JADX INFO: loaded from: classes7.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f241951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f241952b;

    public g(h0 watchlistInteractor, r multipleWatchlistInteractor) {
        Intrinsics.checkNotNullParameter(watchlistInteractor, "watchlistInteractor");
        Intrinsics.checkNotNullParameter(multipleWatchlistInteractor, "multipleWatchlistInteractor");
        this.f241951a = watchlistInteractor;
        this.f241952b = multipleWatchlistInteractor;
    }
}
