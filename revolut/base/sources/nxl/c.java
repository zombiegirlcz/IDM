package nxl;

/* JADX INFO: loaded from: classes12.dex */
public final class c extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f220583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f220584b;

    public c(int i, int i2) {
        this.f220583a = i;
        this.f220584b = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f220583a == cVar.f220583a && this.f220584b == cVar.f220584b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f220584b) + (Integer.hashCode(this.f220583a) * 31);
    }
}
