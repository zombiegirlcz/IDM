package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class i2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f164625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f164626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f164627c;

    public i2(boolean z, boolean z3, boolean z4) {
        this.f164625a = z;
        this.f164626b = z3;
        this.f164627c = z4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i2)) {
            return false;
        }
        i2 i2Var = (i2) obj2;
        return this.f164625a == i2Var.f164625a && this.f164626b == i2Var.f164626b && this.f164627c == i2Var.f164627c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f164627c) + j6.a.c(Boolean.hashCode(this.f164625a) * 31, 31, this.f164626b);
    }
}
