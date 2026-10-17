package bx0;

/* JADX INFO: loaded from: classes19.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f19473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f19474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f19475c;

    public y(boolean z, boolean z3, boolean z4) {
        this.f19473a = z;
        this.f19474b = z3;
        this.f19475c = z4;
    }

    public final boolean a() {
        return this.f19475c;
    }

    public final boolean b() {
        return this.f19473a;
    }

    public final boolean c() {
        return this.f19474b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return this.f19473a == yVar.f19473a && this.f19474b == yVar.f19474b && this.f19475c == yVar.f19475c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f19475c) + j6.a.c(Boolean.hashCode(this.f19473a) * 31, 31, this.f19474b);
    }
}
