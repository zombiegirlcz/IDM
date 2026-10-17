package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class ob {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f165647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f165648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f165649c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f165650g;

    public ob(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29) {
        this.f165647a = z;
        this.f165648b = z3;
        this.f165649c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f165650g = z29;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ob)) {
            return false;
        }
        ob obVar = (ob) obj2;
        return this.f165647a == obVar.f165647a && this.f165648b == obVar.f165648b && this.f165649c == obVar.f165649c && this.d == obVar.d && this.e == obVar.e && this.f == obVar.f && this.f165650g == obVar.f165650g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f165650g) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f165647a) * 31, 31, this.f165648b), 31, this.f165649c), 31, this.d), 31, this.e), 31, this.f);
    }
}
