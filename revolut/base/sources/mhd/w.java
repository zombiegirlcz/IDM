package mhd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class w extends com.revolut.feature.shared_separate_favourites.watchlist.ui.screen.watchlist.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ty0.a f205537a;

    public w(ty0.a data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f205537a = data;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof w) && Intrinsics.f(this.f205537a, ((w) obj2).f205537a);
    }

    public final int hashCode() {
        return this.f205537a.hashCode();
    }
}
