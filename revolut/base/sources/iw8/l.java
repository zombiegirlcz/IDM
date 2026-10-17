package iw8;

import cli.o;

/* JADX INFO: loaded from: classes4.dex */
public final class l implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f168996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f168997b;

    public l(boolean z, boolean z3) {
        this.f168996a = z;
        this.f168997b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f168996a == lVar.f168996a && this.f168997b == lVar.f168997b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f168997b) + (Boolean.hashCode(this.f168996a) * 31);
    }
}
