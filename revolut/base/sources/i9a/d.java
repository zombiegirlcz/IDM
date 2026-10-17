package i9a;

import cli.j;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f159615a;

    public d() {
        this(false);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f159615a == ((d) obj2).f159615a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f159615a);
    }

    public d(boolean z) {
        this.f159615a = z;
    }
}
