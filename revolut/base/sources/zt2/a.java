package zt2;

/* JADX INFO: loaded from: classes21.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f325042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f325043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f325044c;

    public a(boolean z, boolean z3, boolean z4) {
        this.f325042a = z;
        this.f325043b = z3;
        this.f325044c = z4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f325042a == aVar.f325042a && this.f325043b == aVar.f325043b && this.f325044c == aVar.f325044c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f325044c) + j6.a.c(Boolean.hashCode(this.f325042a) * 31, 31, this.f325043b);
    }
}
