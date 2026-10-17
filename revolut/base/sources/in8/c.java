package in8;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f162682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f162683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f162684c;

    public c(boolean z, boolean z3, boolean z4) {
        this.f162682a = z;
        this.f162683b = z3;
        this.f162684c = z4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f162682a == cVar.f162682a && this.f162683b == cVar.f162683b && this.f162684c == cVar.f162684c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f162684c) + j6.a.c(Boolean.hashCode(this.f162682a) * 31, 31, this.f162683b);
    }
}
