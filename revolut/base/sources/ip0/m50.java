package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class m50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f165318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f165319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f165320c;
    public final boolean d;

    public m50(boolean z, boolean z3, boolean z4, boolean z6) {
        this.f165318a = z;
        this.f165319b = z3;
        this.f165320c = z4;
        this.d = z6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m50)) {
            return false;
        }
        m50 m50Var = (m50) obj2;
        return this.f165318a == m50Var.f165318a && this.f165319b == m50Var.f165319b && this.f165320c == m50Var.f165320c && this.d == m50Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.c(j6.a.c(Boolean.hashCode(this.f165318a) * 31, 31, this.f165319b), 31, this.f165320c);
    }
}
