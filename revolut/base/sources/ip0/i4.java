package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class i4 implements j4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f164637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f164638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f164639c;

    public i4() {
        this(false, 7);
    }

    @Override // ip0.j4
    public final boolean a() {
        return this.f164638b;
    }

    @Override // ip0.j4
    public final boolean b() {
        return this.f164639c;
    }

    @Override // ip0.j4
    public final boolean c() {
        return this.f164637a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i4)) {
            return false;
        }
        i4 i4Var = (i4) obj2;
        return this.f164637a == i4Var.f164637a && this.f164638b == i4Var.f164638b && this.f164639c == i4Var.f164639c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f164639c) + j6.a.c(Boolean.hashCode(this.f164637a) * 31, 31, this.f164638b);
    }

    public i4(boolean z, int i) {
        z = (i & 2) != 0 ? false : z;
        boolean z3 = (i & 4) == 0;
        this.f164637a = true;
        this.f164638b = z;
        this.f164639c = z3;
    }
}
