package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class n7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f165460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f165461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f165462c;

    public n7(boolean z, boolean z3, boolean z4) {
        this.f165460a = z;
        this.f165461b = z3;
        this.f165462c = z4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n7)) {
            return false;
        }
        n7 n7Var = (n7) obj2;
        return this.f165460a == n7Var.f165460a && this.f165461b == n7Var.f165461b && this.f165462c == n7Var.f165462c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f165462c) + j6.a.c(Boolean.hashCode(this.f165460a) * 31, 31, this.f165461b);
    }
}
