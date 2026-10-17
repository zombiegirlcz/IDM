package g6a;

import cli.q;

/* JADX INFO: loaded from: classes5.dex */
public final class k implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f140908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f140909b;

    public k(boolean z, boolean z3) {
        this.f140908a = z;
        this.f140909b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f140908a == kVar.f140908a && this.f140909b == kVar.f140909b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f140909b) + (Boolean.hashCode(this.f140908a) * 31);
    }
}
