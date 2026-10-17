package veh;

import cli.q;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f288327a;

    public g(boolean z) {
        this.f288327a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && this.f288327a == ((g) obj2).f288327a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f288327a);
    }
}
