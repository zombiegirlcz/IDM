package zsi;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f324928a;

    public a(boolean z) {
        this.f324928a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && this.f324928a == ((a) obj2).f324928a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f324928a);
    }
}
