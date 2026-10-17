package ek2;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements cli.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f126929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f126930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f126931c;

    public c(boolean z, boolean z3, boolean z4) {
        this.f126929a = z;
        this.f126930b = z3;
        this.f126931c = z4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f126929a == cVar.f126929a && this.f126930b == cVar.f126930b && this.f126931c == cVar.f126931c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f126931c) + j6.a.c(Boolean.hashCode(this.f126929a) * 31, 31, this.f126930b);
    }
}
