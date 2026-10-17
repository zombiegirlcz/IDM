package c5a;

/* JADX INFO: loaded from: classes5.dex */
public final class u implements cli.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f21529a;

    public u(boolean z) {
        this.f21529a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof u) && this.f21529a == ((u) obj2).f21529a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f21529a);
    }
}
