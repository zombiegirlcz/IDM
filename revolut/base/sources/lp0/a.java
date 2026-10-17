package lp0;

/* JADX INFO: loaded from: classes19.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f198903a;

    public a(boolean z) {
        this.f198903a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && this.f198903a == ((a) obj2).f198903a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f198903a);
    }
}
