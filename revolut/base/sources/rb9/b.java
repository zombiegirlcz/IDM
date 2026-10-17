package rb9;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f252997a;

    public b(long j2) {
        this.f252997a = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f252997a == ((b) obj2).f252997a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f252997a);
    }
}
