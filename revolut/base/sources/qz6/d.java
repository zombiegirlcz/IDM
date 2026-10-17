package qz6;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f250373a;

    public d(boolean z) {
        this.f250373a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f250373a == ((d) obj2).f250373a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f250373a);
    }
}
