package i13;

import cli.q;

/* JADX INFO: loaded from: classes21.dex */
public final class l implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f157539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f157540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f157541c;

    public l(boolean z, boolean z3, boolean z4) {
        this.f157539a = z;
        this.f157540b = z3;
        this.f157541c = z4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f157539a == lVar.f157539a && this.f157540b == lVar.f157540b && this.f157541c == lVar.f157541c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f157541c) + j6.a.c(Boolean.hashCode(this.f157539a) * 31, 31, this.f157540b);
    }
}
