package pt0;

/* JADX INFO: loaded from: classes19.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f239567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f239568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f239569c;
    public final boolean d;

    public a(boolean z, boolean z3, boolean z4, boolean z6) {
        this.f239567a = z;
        this.f239568b = z3;
        this.f239569c = z4;
        this.d = z6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f239567a == aVar.f239567a && this.f239568b == aVar.f239568b && this.f239569c == aVar.f239569c && this.d == aVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.c(j6.a.c(Boolean.hashCode(this.f239567a) * 31, 31, this.f239568b), 31, this.f239569c);
    }
}
