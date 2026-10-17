package yv8;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f317140a;

    public d(boolean z) {
        this.f317140a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f317140a == ((d) obj2).f317140a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f317140a);
    }
}
