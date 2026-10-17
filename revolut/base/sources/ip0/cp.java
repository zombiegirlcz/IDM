package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class cp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f163768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f163769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f163770c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f163771g;

    public cp(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29) {
        this.f163768a = z;
        this.f163769b = z3;
        this.f163770c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f163771g = z29;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof cp)) {
            return false;
        }
        cp cpVar = (cp) obj2;
        return this.f163768a == cpVar.f163768a && this.f163769b == cpVar.f163769b && this.f163770c == cpVar.f163770c && this.d == cpVar.d && this.e == cpVar.e && this.f == cpVar.f && this.f163771g == cpVar.f163771g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f163771g) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f163768a) * 31, 31, this.f163769b), 31, this.f163770c), 31, this.d), 31, this.e), 31, this.f);
    }
}
