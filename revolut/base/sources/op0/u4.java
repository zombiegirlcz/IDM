package op0;

/* JADX INFO: loaded from: classes19.dex */
public final class u4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f227447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f227448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f227449c;
    public final boolean d;

    public u4(boolean z, boolean z3, boolean z4, boolean z6) {
        this.f227447a = z;
        this.f227448b = z3;
        this.f227449c = z4;
        this.d = z6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u4)) {
            return false;
        }
        u4 u4Var = (u4) obj2;
        return this.f227447a == u4Var.f227447a && this.f227448b == u4Var.f227448b && this.f227449c == u4Var.f227449c && this.d == u4Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.c(j6.a.c(Boolean.hashCode(this.f227447a) * 31, 31, this.f227448b), 31, this.f227449c);
    }
}
