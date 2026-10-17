package w9a;

/* JADX INFO: loaded from: classes5.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f295703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f295704b;

    public i(int i, int i2) {
        this.f295703a = i;
        this.f295704b = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f295703a == iVar.f295703a && this.f295704b == iVar.f295704b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f295704b) + (Integer.hashCode(this.f295703a) * 31);
    }
}
