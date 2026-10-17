package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class di0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f163906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f163907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f163908c;

    public di0(boolean z, boolean z3, boolean z4) {
        this.f163906a = z;
        this.f163907b = z3;
        this.f163908c = z4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof di0)) {
            return false;
        }
        di0 di0Var = (di0) obj2;
        return this.f163906a == di0Var.f163906a && this.f163907b == di0Var.f163907b && this.f163908c == di0Var.f163908c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f163908c) + j6.a.c(Boolean.hashCode(this.f163906a) * 31, 31, this.f163907b);
    }
}
