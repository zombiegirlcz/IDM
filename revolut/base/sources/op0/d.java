package op0;

/* JADX INFO: loaded from: classes19.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f227215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f227216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f227217c;

    public d(boolean z, boolean z3, boolean z4) {
        this.f227215a = z;
        this.f227216b = z3;
        this.f227217c = z4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f227215a == dVar.f227215a && this.f227216b == dVar.f227216b && this.f227217c == dVar.f227217c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f227217c) + j6.a.c(Boolean.hashCode(this.f227215a) * 31, 31, this.f227216b);
    }
}
