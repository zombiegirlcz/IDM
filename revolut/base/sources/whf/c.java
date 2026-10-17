package whf;

/* JADX INFO: loaded from: classes8.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f297635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f297636b;

    public c() {
        this(7);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f297635a == cVar.f297635a && this.f297636b == cVar.f297636b;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + j6.a.c(Boolean.hashCode(this.f297635a) * 31, 31, this.f297636b);
    }

    public c(int i) {
        boolean z = (i & 1) != 0;
        boolean z3 = (i & 2) == 0;
        this.f297635a = z;
        this.f297636b = z3;
    }
}
