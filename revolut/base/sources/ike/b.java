package ike;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f161941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f161942b;

    public b(boolean z, boolean z3) {
        this.f161941a = z;
        this.f161942b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f161941a == bVar.f161941a && this.f161942b == bVar.f161942b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f161942b) + (Boolean.hashCode(this.f161941a) * 31);
    }
}
