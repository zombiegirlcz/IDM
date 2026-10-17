package cy0;

/* JADX INFO: loaded from: classes20.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f110014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f110015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f110016c;

    public a(int i, boolean z, boolean z3) {
        this.f110014a = i;
        this.f110015b = z;
        this.f110016c = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f110014a == aVar.f110014a && this.f110015b == aVar.f110015b && this.f110016c == aVar.f110016c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f110016c) + j6.a.c(Integer.hashCode(this.f110014a) * 31, 31, this.f110015b);
    }
}
