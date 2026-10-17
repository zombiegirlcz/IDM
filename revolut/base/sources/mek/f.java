package mek;

/* JADX INFO: loaded from: classes11.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f204699a;

    public f(boolean z) {
        this.f204699a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && this.f204699a == ((f) obj2).f204699a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f204699a);
    }
}
