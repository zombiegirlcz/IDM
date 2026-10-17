package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class yg0 implements qv0.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f167312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f167313b;

    public yg0(boolean z, boolean z3) {
        this.f167312a = z;
        this.f167313b = z3;
    }

    @Override // qv0.b
    public final boolean a() {
        return this.f167313b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof yg0)) {
            return false;
        }
        yg0 yg0Var = (yg0) obj2;
        return this.f167312a == yg0Var.f167312a && this.f167313b == yg0Var.f167313b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f167313b) + (Boolean.hashCode(this.f167312a) * 31);
    }
}
