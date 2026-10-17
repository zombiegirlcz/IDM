package mhd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class u extends com.revolut.feature.shared_separate_favourites.watchlist.ui.screen.watchlist.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f205535a;

    public u(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        this.f205535a = query;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof u) && Intrinsics.f(this.f205535a, ((u) obj2).f205535a);
    }

    public final int hashCode() {
        return this.f205535a.hashCode();
    }
}
