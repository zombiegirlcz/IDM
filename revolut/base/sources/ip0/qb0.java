package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class qb0 implements qv0.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f165959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f165960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f165961c;
    public final boolean d;

    public qb0(boolean z, boolean z3, boolean z4, boolean z6) {
        this.f165959a = z;
        this.f165960b = z3;
        this.f165961c = z4;
        this.d = z6;
    }

    @Override // qv0.b
    public final boolean a() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof qb0)) {
            return false;
        }
        qb0 qb0Var = (qb0) obj2;
        return this.f165959a == qb0Var.f165959a && this.f165960b == qb0Var.f165960b && this.f165961c == qb0Var.f165961c && this.d == qb0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.c(j6.a.c(Boolean.hashCode(this.f165959a) * 31, 31, this.f165960b), 31, this.f165961c);
    }
}
