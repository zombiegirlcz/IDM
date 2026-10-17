package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class ny {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f165587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f165588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f165589c;

    public ny(boolean z, boolean z3, boolean z4) {
        this.f165587a = z;
        this.f165588b = z3;
        this.f165589c = z4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ny)) {
            return false;
        }
        ny nyVar = (ny) obj2;
        return this.f165587a == nyVar.f165587a && this.f165588b == nyVar.f165588b && this.f165589c == nyVar.f165589c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f165589c) + j6.a.c(Boolean.hashCode(this.f165587a) * 31, 31, this.f165588b);
    }
}
