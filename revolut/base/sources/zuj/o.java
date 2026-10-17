package zuj;

/* JADX INFO: loaded from: classes11.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f325500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f325501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f325502c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public o() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return this.f325500a == oVar.f325500a && this.f325501b == oVar.f325501b && this.f325502c == oVar.f325502c && this.d == oVar.d && this.e == oVar.e && this.f == oVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f325500a) * 31, 31, this.f325501b), 31, this.f325502c), 31, this.d), 31, this.e);
    }

    public /* synthetic */ o(int i) {
        this(false, false, false, false, false, false);
    }

    public o(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12) {
        this.f325500a = z;
        this.f325501b = z3;
        this.f325502c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
    }
}
