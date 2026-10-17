package z55;

/* JADX INFO: loaded from: classes21.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f319500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f319501b;

    public p(int i, boolean z) {
        this.f319500a = i;
        this.f319501b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return this.f319500a == pVar.f319500a && this.f319501b == pVar.f319501b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f319501b) + (Integer.hashCode(this.f319500a) * 31);
    }
}
