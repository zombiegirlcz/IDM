package jp0;

/* JADX INFO: loaded from: classes19.dex */
public final class a implements qv0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f177177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f177178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f177179c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public a(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12) {
        this.f177177a = z;
        this.f177178b = z3;
        this.f177179c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
    }

    @Override // qv0.b
    public final boolean a() {
        return this.f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f177177a == aVar.f177177a && this.f177178b == aVar.f177178b && this.f177179c == aVar.f177179c && this.d == aVar.d && this.e == aVar.e && this.f == aVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f177177a) * 31, 31, this.f177178b), 31, this.f177179c), 31, this.d), 31, this.e);
    }
}
