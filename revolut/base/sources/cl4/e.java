package cl4;

/* JADX INFO: loaded from: classes22.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f24933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f24934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f24935c;

    public e(boolean z, boolean z3, boolean z4) {
        this.f24933a = z;
        this.f24934b = z3;
        this.f24935c = z4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f24933a == eVar.f24933a && this.f24934b == eVar.f24934b && this.f24935c == eVar.f24935c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f24935c) + j6.a.c(Boolean.hashCode(this.f24933a) * 31, 31, this.f24934b);
    }
}
