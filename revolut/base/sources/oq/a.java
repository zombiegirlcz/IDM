package oq;

/* JADX INFO: loaded from: classes17.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f227693a;

    public a(boolean z) {
        this.f227693a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && this.f227693a == ((a) obj2).f227693a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f227693a);
    }
}
