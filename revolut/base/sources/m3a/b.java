package m3a;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f202306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f202307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f202308c;

    public b(boolean z, boolean z3, boolean z4) {
        this.f202306a = z;
        this.f202307b = z3;
        this.f202308c = z4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f202306a == bVar.f202306a && this.f202307b == bVar.f202307b && this.f202308c == bVar.f202308c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f202308c) + j6.a.c(Boolean.hashCode(this.f202306a) * 31, 31, this.f202307b);
    }
}
