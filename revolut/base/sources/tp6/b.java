package tp6;

import cli.j;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f273290a;

    public b(boolean z) {
        this.f273290a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f273290a == ((b) obj2).f273290a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f273290a);
    }
}
