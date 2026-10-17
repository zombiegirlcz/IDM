package wqh;

import com.revolut.feature.wealth_discovery.impl.screener.domain.model.ScreenerStatsGroup;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScreenerStatsGroup f299457a;

    public a(ScreenerStatsGroup group) {
        Intrinsics.checkNotNullParameter(group, "group");
        this.f299457a = group;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f299457a, ((a) obj2).f299457a);
    }

    public final int hashCode() {
        return this.f299457a.hashCode();
    }
}
