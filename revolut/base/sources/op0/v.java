package op0;

/* JADX INFO: loaded from: classes19.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f227450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f227451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f227452c;

    public v(boolean z, boolean z3, boolean z4) {
        this.f227450a = z;
        this.f227451b = z3;
        this.f227452c = z4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return this.f227450a == vVar.f227450a && this.f227451b == vVar.f227451b && this.f227452c == vVar.f227452c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f227452c) + j6.a.c(Boolean.hashCode(this.f227450a) * 31, 31, this.f227451b);
    }
}
