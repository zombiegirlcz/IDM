package mb7;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f204173a;

    public d(boolean z) {
        this.f204173a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f204173a == ((d) obj2).f204173a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f204173a);
    }
}
