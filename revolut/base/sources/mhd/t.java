package mhd;

/* JADX INFO: loaded from: classes7.dex */
public final class t extends com.revolut.feature.shared_separate_favourites.watchlist.ui.screen.watchlist.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f205533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f205534b;

    public t(int i, int i2) {
        this.f205533a = i;
        this.f205534b = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return this.f205533a == tVar.f205533a && this.f205534b == tVar.f205534b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f205534b) + (Integer.hashCode(this.f205533a) * 31);
    }
}
