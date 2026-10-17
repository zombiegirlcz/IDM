package z55;

/* JADX INFO: loaded from: classes21.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f319494a;

    public d(boolean z) {
        this.f319494a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f319494a == ((d) obj2).f319494a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f319494a);
    }
}
