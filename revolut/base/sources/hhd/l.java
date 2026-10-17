package hhd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class l extends com.revolut.feature.shared_separate_favourites.watchlist.ui.flow.add_asset.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f152397a;

    public l(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f152397a = id10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f152397a, ((l) obj2).f152397a);
    }

    public final int hashCode() {
        return this.f152397a.hashCode();
    }
}
