package xgd;

import com.revolut.feature.shared_separate_favourites.domain.watchlist.Watchlist;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Watchlist f305681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f305682b;

    public l(Watchlist watchlist, boolean z) {
        Intrinsics.checkNotNullParameter(watchlist, "watchlist");
        this.f305681a = watchlist;
        this.f305682b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f305681a, lVar.f305681a) && this.f305682b == lVar.f305682b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f305682b) + (this.f305681a.hashCode() * 31);
    }
}
