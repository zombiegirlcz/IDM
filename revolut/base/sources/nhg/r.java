package nhg;

/* JADX INFO: loaded from: classes9.dex */
public final class r extends com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f215483a;

    public r(boolean z) {
        this.f215483a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r) && this.f215483a == ((r) obj2).f215483a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f215483a);
    }
}
