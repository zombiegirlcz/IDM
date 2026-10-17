package hhd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class k extends com.revolut.feature.shared_separate_favourites.watchlist.ui.flow.add_asset.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ogd.e f152396a;

    public k(ogd.e item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.f152396a = item;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f152396a, ((k) obj2).f152396a);
    }

    public final int hashCode() {
        return this.f152396a.hashCode();
    }
}
