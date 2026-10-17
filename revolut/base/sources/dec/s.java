package dec;

/* JADX INFO: loaded from: classes6.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f113374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f113375b;

    public s(boolean z, boolean z3) {
        this.f113374a = z;
        this.f113375b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return this.f113374a == sVar.f113374a && this.f113375b == sVar.f113375b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f113375b) + j6.a.c(Boolean.hashCode(false) * 31, 31, this.f113374a);
    }
}
