package nu0;

/* JADX INFO: loaded from: classes19.dex */
public final class f extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f219181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f219182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f219183c;

    public f(int i, boolean z, boolean z3) {
        this.f219181a = i;
        this.f219182b = z;
        this.f219183c = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f219181a == fVar.f219181a && this.f219182b == fVar.f219182b && this.f219183c == fVar.f219183c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f219183c) + j6.a.c(Integer.hashCode(this.f219181a) * 31, 31, this.f219182b);
    }
}
