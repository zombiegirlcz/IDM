package um2;

/* JADX INFO: loaded from: classes21.dex */
public final class q implements cli.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f281212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f281213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f281214c;
    public final boolean d;

    public q(boolean z, boolean z3, boolean z4, boolean z6) {
        this.f281212a = z;
        this.f281213b = z3;
        this.f281214c = z4;
        this.d = z6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return this.f281212a == qVar.f281212a && this.f281213b == qVar.f281213b && this.f281214c == qVar.f281214c && this.d == qVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.c(j6.a.c(Boolean.hashCode(this.f281212a) * 31, 31, this.f281213b), 31, this.f281214c);
    }
}
