package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class zd implements qv0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f167447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f167448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f167449c;
    public final boolean d;

    public zd(boolean z, boolean z3, boolean z4, boolean z6) {
        this.f167447a = z;
        this.f167448b = z3;
        this.f167449c = z4;
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
        if (!(obj2 instanceof zd)) {
            return false;
        }
        zd zdVar = (zd) obj2;
        return this.f167447a == zdVar.f167447a && this.f167448b == zdVar.f167448b && this.f167449c == zdVar.f167449c && this.d == zdVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.c(j6.a.c(Boolean.hashCode(this.f167447a) * 31, 31, this.f167448b), 31, this.f167449c);
    }
}
