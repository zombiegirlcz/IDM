package k4l;

/* JADX INFO: loaded from: classes12.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f180995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f180996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f180997c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f180998g;

    public q(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29) {
        this.f180995a = z;
        this.f180996b = z3;
        this.f180997c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f180998g = z29;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return this.f180995a == qVar.f180995a && this.f180996b == qVar.f180996b && this.f180997c == qVar.f180997c && this.d == qVar.d && this.e == qVar.e && this.f == qVar.f && this.f180998g == qVar.f180998g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f180998g) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f180995a) * 31, 31, this.f180996b), 31, this.f180997c), 31, this.d), 31, this.e), 31, this.f);
    }
}
