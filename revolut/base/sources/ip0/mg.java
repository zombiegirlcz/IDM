package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class mg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f165373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f165374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f165375c;
    public final boolean d;
    public final boolean e;

    public mg(boolean z, boolean z3, boolean z4, boolean z6, boolean z11) {
        this.f165373a = z;
        this.f165374b = z3;
        this.f165375c = z4;
        this.d = z6;
        this.e = z11;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof mg)) {
            return false;
        }
        mg mgVar = (mg) obj2;
        return this.f165373a == mgVar.f165373a && this.f165374b == mgVar.f165374b && this.f165375c == mgVar.f165375c && this.d == mgVar.d && this.e == mgVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f165373a) * 31, 31, this.f165374b), 31, this.f165375c), 31, this.d);
    }
}
