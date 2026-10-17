package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class kk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f165035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f165036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f165037c;
    public final boolean d;

    public kk0(boolean z, boolean z3, boolean z4, boolean z6) {
        this.f165035a = z;
        this.f165036b = z3;
        this.f165037c = z4;
        this.d = z6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof kk0)) {
            return false;
        }
        kk0 kk0Var = (kk0) obj2;
        return this.f165035a == kk0Var.f165035a && this.f165036b == kk0Var.f165036b && this.f165037c == kk0Var.f165037c && this.d == kk0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.c(j6.a.c(Boolean.hashCode(this.f165035a) * 31, 31, this.f165036b), 31, this.f165037c);
    }
}
