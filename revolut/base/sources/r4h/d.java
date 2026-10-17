package r4h;

import cli.j;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f251463a;

    public d(boolean z) {
        this.f251463a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f251463a == ((d) obj2).f251463a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f251463a);
    }
}
