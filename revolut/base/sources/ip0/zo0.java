package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class zo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f167525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f167526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f167527c;

    public zo0(boolean z, boolean z3, boolean z4) {
        this.f167525a = z;
        this.f167526b = z3;
        this.f167527c = z4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof zo0)) {
            return false;
        }
        zo0 zo0Var = (zo0) obj2;
        return this.f167525a == zo0Var.f167525a && this.f167526b == zo0Var.f167526b && this.f167527c == zo0Var.f167527c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f167527c) + j6.a.c(Boolean.hashCode(this.f167525a) * 31, 31, this.f167526b);
    }
}
