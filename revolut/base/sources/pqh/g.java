package pqh;

import aii.r;
import com.revolut.shared.feature.wealth.models.screener.ScreenerSortingOptions;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScreenerSortingOptions f238782a;

    public g(ScreenerSortingOptions sortingOptions) {
        Intrinsics.checkNotNullParameter(sortingOptions, "sortingOptions");
        this.f238782a = sortingOptions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f238782a, ((g) obj2).f238782a);
    }

    public final int hashCode() {
        return this.f238782a.hashCode();
    }
}
