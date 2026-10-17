package m6c;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f203048a;

    public d(boolean z) {
        this.f203048a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f203048a == ((d) obj2).f203048a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f203048a);
    }
}
