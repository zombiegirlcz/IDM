package bx0;

/* JADX INFO: loaded from: classes.dex */
public final class a0 extends c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f19391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f19392c;

    public a0(int i, boolean z, boolean z3) {
        this.f19390a = i;
        this.f19391b = z;
        this.f19392c = z3;
    }

    @Override // bx0.c0
    public final int a() {
        return this.f19390a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return this.f19390a == a0Var.f19390a && this.f19391b == a0Var.f19391b && this.f19392c == a0Var.f19392c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f19392c) + j6.a.c(Integer.hashCode(this.f19390a) * 31, 31, this.f19391b);
    }

    public /* synthetic */ a0() {
        this(-16777216, false, false);
    }
}
