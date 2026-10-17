package iy8;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f169630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f169631b;

    public k(boolean z, boolean z3) {
        this.f169630a = z;
        this.f169631b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f169630a == kVar.f169630a && this.f169631b == kVar.f169631b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f169631b) + (Boolean.hashCode(this.f169630a) * 31);
    }
}
