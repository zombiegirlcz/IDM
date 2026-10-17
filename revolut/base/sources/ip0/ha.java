package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class ha {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f164524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f164525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f164526c;
    public final boolean d;

    public ha(boolean z, boolean z3, boolean z4, boolean z6) {
        this.f164524a = z;
        this.f164525b = z3;
        this.f164526c = z4;
        this.d = z6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ha)) {
            return false;
        }
        ha haVar = (ha) obj2;
        return this.f164524a == haVar.f164524a && this.f164525b == haVar.f164525b && this.f164526c == haVar.f164526c && this.d == haVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.c(j6.a.c(Boolean.hashCode(this.f164524a) * 31, 31, this.f164525b), 31, this.f164526c);
    }
}
