package lxf;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f200574a;

    public f(boolean z) {
        this.f200574a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && this.f200574a == ((f) obj2).f200574a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f200574a);
    }
}
