package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class le {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f165189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f165190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f165191c;
    public final boolean d;

    public le(boolean z, boolean z3, boolean z4, boolean z6) {
        this.f165189a = z;
        this.f165190b = z3;
        this.f165191c = z4;
        this.d = z6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof le)) {
            return false;
        }
        le leVar = (le) obj2;
        return this.f165189a == leVar.f165189a && this.f165190b == leVar.f165190b && this.f165191c == leVar.f165191c && this.d == leVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.c(j6.a.c(Boolean.hashCode(this.f165189a) * 31, 31, this.f165190b), 31, this.f165191c);
    }
}
