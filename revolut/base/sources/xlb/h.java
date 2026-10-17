package xlb;

/* JADX INFO: loaded from: classes6.dex */
public final class h implements cli.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f306984a;

    public h(boolean z) {
        this.f306984a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && this.f306984a == ((h) obj2).f306984a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f306984a);
    }
}
