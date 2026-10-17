package zs5;

import com.revolut.feature.shared_separate_favourites.domain.combined_watchlist.CombinedWatchlistContext;
import gim.c;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.y0;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements v1d.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f324813a;

    public a() {
        y1d.b.Companion.getClass();
        this.f324813a = y0.b(y1d.a.f310359c);
    }

    @Override // v1d.b
    public final Object b(String str, c cVar) {
        return Boolean.valueOf(!Intrinsics.f(str, "WatchlistSymbol"));
    }

    @Override // v1d.b
    public final CombinedWatchlistContext c() {
        Set set = this.f324813a;
        return new CombinedWatchlistContext("COMBINED_WATCHLIST_ORDERING_CRYPTO", set, set);
    }
}
