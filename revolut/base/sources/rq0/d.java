package rq0;

/* JADX INFO: loaded from: classes19.dex */
public final class d implements qv0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f256438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f256439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f256440c;

    public d(boolean z, boolean z3, boolean z4) {
        this.f256438a = z;
        this.f256439b = z3;
        this.f256440c = z4;
    }

    @Override // qv0.b
    public final boolean a() {
        return this.f256440c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f256438a == dVar.f256438a && this.f256439b == dVar.f256439b && this.f256440c == dVar.f256440c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f256440c) + j6.a.c(Boolean.hashCode(this.f256438a) * 31, 31, this.f256439b);
    }
}
