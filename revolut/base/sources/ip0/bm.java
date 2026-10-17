package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class bm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f163627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f163628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f163629c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public bm(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12) {
        this.f163627a = z;
        this.f163628b = z3;
        this.f163629c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof bm)) {
            return false;
        }
        bm bmVar = (bm) obj2;
        return this.f163627a == bmVar.f163627a && this.f163628b == bmVar.f163628b && this.f163629c == bmVar.f163629c && this.d == bmVar.d && this.e == bmVar.e && this.f == bmVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f163627a) * 31, 31, this.f163628b), 31, false), 31, this.f163629c), 31, this.d), 31, this.e);
    }
}
