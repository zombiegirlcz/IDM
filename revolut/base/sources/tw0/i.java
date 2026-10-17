package tw0;

/* JADX INFO: loaded from: classes19.dex */
public final class i implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f274818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f274819b;

    public i(int i, int i2) {
        this.f274818a = i;
        this.f274819b = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f274818a == iVar.f274818a && this.f274819b == iVar.f274819b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f274819b) + (Integer.hashCode(this.f274818a) * 31);
    }
}
