package qu8;

import cli.o;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f249269a;

    public k(boolean z) {
        this.f249269a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && this.f249269a == ((k) obj2).f249269a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f249269a);
    }
}
