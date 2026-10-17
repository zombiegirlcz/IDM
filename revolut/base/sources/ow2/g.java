package ow2;

import cli.q;

/* JADX INFO: loaded from: classes21.dex */
public final class g implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f230281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f230282b;

    public g(boolean z, boolean z3) {
        this.f230281a = z;
        this.f230282b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f230281a == gVar.f230281a && this.f230282b == gVar.f230282b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f230282b) + (Boolean.hashCode(this.f230281a) * 31);
    }
}
