package lbj;

/* JADX INFO: loaded from: classes11.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f193694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f193695b;

    public c(int i, int i2) {
        this.f193694a = i;
        this.f193695b = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f193694a == cVar.f193694a && this.f193695b == cVar.f193695b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f193695b) + (Integer.hashCode(this.f193694a) * 31);
    }
}
