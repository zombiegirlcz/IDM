package bv;

/* JADX INFO: loaded from: classes13.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18923b;

    public c(int i, int i2) {
        this.f18922a = i;
        this.f18923b = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f18922a == cVar.f18922a && this.f18923b == cVar.f18923b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f18923b) + (Integer.hashCode(this.f18922a) * 31);
    }
}
