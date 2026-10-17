package j02;

/* JADX INFO: loaded from: classes20.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f169915a;

    public d(boolean z) {
        this.f169915a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f169915a == ((d) obj2).f169915a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f169915a);
    }
}
