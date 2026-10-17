package ybh;

/* JADX INFO: loaded from: classes9.dex */
public final class i implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f312314a;

    public i(boolean z) {
        this.f312314a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && this.f312314a == ((i) obj2).f312314a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f312314a);
    }
}
