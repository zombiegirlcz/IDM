package a6f;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1670b;

    public c(int i, int i2) {
        this.f1669a = i;
        this.f1670b = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f1669a == cVar.f1669a && this.f1670b == cVar.f1670b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f1670b) + (Integer.hashCode(this.f1669a) * 31);
    }
}
