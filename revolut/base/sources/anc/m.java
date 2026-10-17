package anc;

/* JADX INFO: loaded from: classes6.dex */
public final class m implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f6752a;

    public m(boolean z) {
        this.f6752a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && this.f6752a == ((m) obj2).f6752a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f6752a);
    }
}
