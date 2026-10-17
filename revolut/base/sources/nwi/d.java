package nwi;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f219895a;

    public d(boolean z) {
        this.f219895a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f219895a == ((d) obj2).f219895a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f219895a);
    }
}
