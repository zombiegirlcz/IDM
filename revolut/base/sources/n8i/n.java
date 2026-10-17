package n8i;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class n implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f213450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f213451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f213452c;

    public n(boolean z, boolean z3, p iconType) {
        Intrinsics.checkNotNullParameter(iconType, "iconType");
        this.f213450a = z;
        this.f213451b = z3;
        this.f213452c = iconType;
    }

    @Override // n8i.o
    public final boolean a() {
        return this.f213450a;
    }

    @Override // n8i.o
    public final p b() {
        return this.f213452c;
    }

    @Override // n8i.o
    public final boolean c() {
        return this.f213451b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.f213450a == nVar.f213450a && this.f213451b == nVar.f213451b && this.f213452c == nVar.f213452c;
    }

    public final int hashCode() {
        return this.f213452c.hashCode() + j6.a.c(Boolean.hashCode(this.f213450a) * 31, 31, this.f213451b);
    }
}
