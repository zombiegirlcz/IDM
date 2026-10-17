package a91;

import cli.j;

/* JADX INFO: loaded from: classes20.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f2289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f2290b;

    public d(boolean z, boolean z3) {
        this.f2289a = z;
        this.f2290b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f2289a == dVar.f2289a && this.f2290b == dVar.f2290b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f2290b) + (Boolean.hashCode(this.f2289a) * 31);
    }
}
