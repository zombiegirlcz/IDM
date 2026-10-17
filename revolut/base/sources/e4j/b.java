package e4j;

import cli.j;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f122566a;

    public b(boolean z) {
        this.f122566a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f122566a == ((b) obj2).f122566a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f122566a);
    }
}
