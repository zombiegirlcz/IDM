package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class py {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f165901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f165902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f165903c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f165904g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f165905h;

    public py(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, boolean z31) {
        this.f165901a = z;
        this.f165902b = z3;
        this.f165903c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f165904g = z29;
        this.f165905h = z31;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof py)) {
            return false;
        }
        py pyVar = (py) obj2;
        return this.f165901a == pyVar.f165901a && this.f165902b == pyVar.f165902b && this.f165903c == pyVar.f165903c && this.d == pyVar.d && this.e == pyVar.e && this.f == pyVar.f && this.f165904g == pyVar.f165904g && this.f165905h == pyVar.f165905h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f165905h) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f165901a) * 31, 31, this.f165902b), 31, this.f165903c), 31, this.d), 31, this.e), 31, this.f), 31, this.f165904g);
    }
}
