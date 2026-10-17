package o02;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f221098a;

    public a(boolean z) {
        this.f221098a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && this.f221098a == ((a) obj2).f221098a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f221098a);
    }
}
