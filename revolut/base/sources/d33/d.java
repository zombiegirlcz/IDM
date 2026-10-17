package d33;

import cli.j;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f110903a;

    public d(boolean z) {
        this.f110903a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f110903a == ((d) obj2).f110903a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f110903a);
    }
}
