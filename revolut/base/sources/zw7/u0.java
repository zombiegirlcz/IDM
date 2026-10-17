package zw7;

/* JADX INFO: loaded from: classes4.dex */
public final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f325855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f325856b;

    public u0(boolean z, boolean z3) {
        this.f325855a = z;
        this.f325856b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj2;
        return this.f325855a == u0Var.f325855a && this.f325856b == u0Var.f325856b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f325856b) + (Boolean.hashCode(this.f325855a) * 31);
    }
}
