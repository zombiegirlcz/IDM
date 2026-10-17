package mhd;

/* JADX INFO: loaded from: classes7.dex */
public final class v extends com.revolut.feature.shared_separate_favourites.watchlist.ui.screen.watchlist.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f205536a;

    public v(boolean z) {
        this.f205536a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof v) && this.f205536a == ((v) obj2).f205536a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f205536a);
    }
}
