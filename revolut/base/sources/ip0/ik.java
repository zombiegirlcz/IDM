package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class ik {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f164708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f164709b;

    public ik(int i, int i2) {
        this.f164708a = i;
        this.f164709b = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ik)) {
            return false;
        }
        ik ikVar = (ik) obj2;
        return this.f164708a == ikVar.f164708a && this.f164709b == ikVar.f164709b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f164709b) + (Integer.hashCode(this.f164708a) * 31);
    }
}
