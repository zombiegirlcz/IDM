package ss4;

/* JADX INFO: loaded from: classes22.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f265267a;

    public b0(boolean z) {
        this.f265267a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b0) && this.f265267a == ((b0) obj2).f265267a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f265267a);
    }
}
