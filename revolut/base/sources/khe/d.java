package khe;

/* JADX INFO: loaded from: classes8.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f184098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f184099b;

    public d(int i, boolean z) {
        this.f184098a = i;
        this.f184099b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f184098a == dVar.f184098a && this.f184099b == dVar.f184099b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f184099b) + (Integer.hashCode(this.f184098a) * 31);
    }
}
