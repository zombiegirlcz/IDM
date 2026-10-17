package ccb;

/* JADX INFO: loaded from: classes6.dex */
public final class q implements jki.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f23010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f23011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f23012c;

    public q(boolean z, boolean z3, boolean z4) {
        this.f23010a = z;
        this.f23011b = z3;
        this.f23012c = z4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return this.f23010a == qVar.f23010a && this.f23011b == qVar.f23011b && this.f23012c == qVar.f23012c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f23012c) + j6.a.c(Boolean.hashCode(this.f23010a) * 31, 31, this.f23011b);
    }
}
