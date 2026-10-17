package ihd;

/* JADX INFO: loaded from: classes7.dex */
public final class s extends com.revolut.feature.shared_separate_favourites.watchlist.ui.screen.home_widget_customisation.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f161388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f161389b;

    public s(int i, int i2) {
        this.f161388a = i;
        this.f161389b = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return this.f161388a == sVar.f161388a && this.f161389b == sVar.f161389b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f161389b) + (Integer.hashCode(this.f161388a) * 31);
    }
}
