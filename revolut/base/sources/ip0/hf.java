package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class hf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f164542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f164543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f164544c;

    public hf(boolean z, boolean z3, boolean z4) {
        this.f164542a = z;
        this.f164543b = z3;
        this.f164544c = z4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof hf)) {
            return false;
        }
        hf hfVar = (hf) obj2;
        return this.f164542a == hfVar.f164542a && this.f164543b == hfVar.f164543b && this.f164544c == hfVar.f164544c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f164544c) + j6.a.c(Boolean.hashCode(this.f164542a) * 31, 31, this.f164543b);
    }
}
