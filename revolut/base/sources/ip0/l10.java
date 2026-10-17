package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class l10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f165109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f165110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f165111c;
    public final boolean d;

    public l10(boolean z, boolean z3, boolean z4, boolean z6) {
        this.f165109a = z;
        this.f165110b = z3;
        this.f165111c = z4;
        this.d = z6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l10)) {
            return false;
        }
        l10 l10Var = (l10) obj2;
        return this.f165109a == l10Var.f165109a && this.f165110b == l10Var.f165110b && this.f165111c == l10Var.f165111c && this.d == l10Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.c(j6.a.c(Boolean.hashCode(this.f165109a) * 31, 31, this.f165110b), 31, this.f165111c);
    }
}
