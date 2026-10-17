package lc0;

/* JADX INFO: loaded from: classes19.dex */
public final class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f193749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f193750b;

    public f(boolean z, boolean z3) {
        this.f193749a = z;
        this.f193750b = z3;
    }

    @Override // lc0.h
    public final boolean a() {
        return this.f193750b;
    }

    @Override // lc0.h
    public final boolean b() {
        return this.f193749a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f193749a == fVar.f193749a && this.f193750b == fVar.f193750b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f193750b) + (Boolean.hashCode(this.f193749a) * 31);
    }
}
