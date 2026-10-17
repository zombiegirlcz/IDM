package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class gg implements qv0.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f164412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f164413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f164414c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f164415g;

    public gg(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29) {
        this.f164412a = z;
        this.f164413b = z3;
        this.f164414c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f164415g = z29;
    }

    @Override // qv0.b
    public final boolean a() {
        return this.f164415g;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof gg)) {
            return false;
        }
        gg ggVar = (gg) obj2;
        return this.f164412a == ggVar.f164412a && this.f164413b == ggVar.f164413b && this.f164414c == ggVar.f164414c && this.d == ggVar.d && this.e == ggVar.e && this.f == ggVar.f && this.f164415g == ggVar.f164415g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f164415g) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f164412a) * 31, 31, this.f164413b), 31, this.f164414c), 31, this.d), 31, this.e), 31, this.f);
    }
}
