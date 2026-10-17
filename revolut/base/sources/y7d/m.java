package y7d;

/* JADX INFO: loaded from: classes7.dex */
public final class m implements jki.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f311478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f311479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f311480c;

    public m() {
        this(true, true, true);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.f311478a == mVar.f311478a && this.f311479b == mVar.f311479b && this.f311480c == mVar.f311480c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f311480c) + j6.a.c(Boolean.hashCode(this.f311478a) * 31, 31, this.f311479b);
    }

    public m(boolean z, boolean z3, boolean z4) {
        this.f311478a = z;
        this.f311479b = z3;
        this.f311480c = z4;
    }
}
