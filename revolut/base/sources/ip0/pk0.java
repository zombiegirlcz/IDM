package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class pk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f165844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f165845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f165846c;
    public final boolean d;

    public pk0(boolean z, boolean z3, boolean z4, boolean z6) {
        this.f165844a = z;
        this.f165845b = z3;
        this.f165846c = z4;
        this.d = z6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof pk0)) {
            return false;
        }
        pk0 pk0Var = (pk0) obj2;
        return this.f165844a == pk0Var.f165844a && this.f165845b == pk0Var.f165845b && this.f165846c == pk0Var.f165846c && this.d == pk0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.c(j6.a.c(Boolean.hashCode(this.f165844a) * 31, 31, this.f165845b), 31, this.f165846c);
    }
}
