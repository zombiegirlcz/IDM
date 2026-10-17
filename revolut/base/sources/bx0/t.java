package bx0;

/* JADX INFO: loaded from: classes19.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f19455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f19456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f19457c;

    public t(boolean z, boolean z3, boolean z4) {
        this.f19455a = z;
        this.f19456b = z3;
        this.f19457c = z4;
    }

    public final boolean a() {
        return this.f19456b;
    }

    public final boolean b() {
        return this.f19457c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return this.f19455a == tVar.f19455a && this.f19456b == tVar.f19456b && this.f19457c == tVar.f19457c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f19457c) + j6.a.c(Boolean.hashCode(this.f19455a) * 31, 31, this.f19456b);
    }
}
