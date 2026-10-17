package tq0;

/* JADX INFO: loaded from: classes19.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f273464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f273465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f273466c;

    public h(boolean z, boolean z3, boolean z4) {
        this.f273464a = z;
        this.f273465b = z3;
        this.f273466c = z4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f273464a == hVar.f273464a && this.f273465b == hVar.f273465b && this.f273466c == hVar.f273466c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f273466c) + j6.a.c(Boolean.hashCode(this.f273464a) * 31, 31, this.f273465b);
    }
}
