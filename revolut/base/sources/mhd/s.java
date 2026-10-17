package mhd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class s extends com.revolut.feature.shared_separate_favourites.watchlist.ui.screen.watchlist.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f205532a;

    public s(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f205532a = id10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s) && Intrinsics.f(this.f205532a, ((s) obj2).f205532a);
    }

    public final int hashCode() {
        return this.f205532a.hashCode();
    }
}
