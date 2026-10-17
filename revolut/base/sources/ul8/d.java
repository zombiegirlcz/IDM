package ul8;

import cli.q;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f280899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f280900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f280901c;

    public d() {
        this(true, true, true);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f280899a == dVar.f280899a && this.f280900b == dVar.f280900b && this.f280901c == dVar.f280901c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f280901c) + j6.a.c(Boolean.hashCode(this.f280899a) * 31, 31, this.f280900b);
    }

    public d(boolean z, boolean z3, boolean z4) {
        this.f280899a = z;
        this.f280900b = z3;
        this.f280901c = z4;
    }
}
