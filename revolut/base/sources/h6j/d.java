package h6j;

import cli.j;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f149750a;

    public d(boolean z) {
        this.f149750a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f149750a == ((d) obj2).f149750a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f149750a);
    }
}
