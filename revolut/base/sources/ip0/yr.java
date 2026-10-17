package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class yr implements qv0.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f167346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f167347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f167348c;
    public final boolean d;

    public yr(boolean z, boolean z3, boolean z4, boolean z6) {
        this.f167346a = z;
        this.f167347b = z3;
        this.f167348c = z4;
        this.d = z6;
    }

    @Override // qv0.b
    public final boolean a() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof yr)) {
            return false;
        }
        yr yrVar = (yr) obj2;
        return this.f167346a == yrVar.f167346a && this.f167347b == yrVar.f167347b && this.f167348c == yrVar.f167348c && this.d == yrVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.c(j6.a.c(Boolean.hashCode(this.f167346a) * 31, 31, this.f167347b), 31, this.f167348c);
    }
}
