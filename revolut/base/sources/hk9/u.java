package hk9;

/* JADX INFO: loaded from: classes5.dex */
public final class u implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f152893a;

    public u(int i) {
        this.f152893a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof u) && this.f152893a == ((u) obj2).f152893a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f152893a);
    }
}
