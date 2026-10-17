package hhd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class j extends com.revolut.feature.shared_separate_favourites.watchlist.ui.flow.add_asset.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f152395a;

    public j(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        this.f152395a = query;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f152395a, ((j) obj2).f152395a);
    }

    public final int hashCode() {
        return this.f152395a.hashCode();
    }
}
