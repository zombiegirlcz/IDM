package lig;

import cli.q;

/* JADX INFO: loaded from: classes9.dex */
public final class m implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f195515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f195516b;

    public m(boolean z, boolean z3) {
        this.f195515a = z;
        this.f195516b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.f195515a == mVar.f195515a && this.f195516b == mVar.f195516b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f195516b) + (Boolean.hashCode(this.f195515a) * 31);
    }
}
