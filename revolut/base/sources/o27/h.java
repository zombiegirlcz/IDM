package o27;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f221509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f221510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f221511c;

    public h(boolean z, boolean z3, boolean z4) {
        this.f221509a = z;
        this.f221510b = z3;
        this.f221511c = z4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f221509a == hVar.f221509a && this.f221510b == hVar.f221510b && this.f221511c == hVar.f221511c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f221511c) + j6.a.c(Boolean.hashCode(this.f221509a) * 31, 31, this.f221510b);
    }
}
