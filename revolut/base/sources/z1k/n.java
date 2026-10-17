package z1k;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f318879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f318880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f318881c;

    public n(xi0.b currency, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f318879a = currency;
        this.f318880b = z;
        this.f318881c = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f318879a, nVar.f318879a) && this.f318880b == nVar.f318880b && this.f318881c == nVar.f318881c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f318881c) + j6.a.c(this.f318879a.hashCode() * 31, 31, this.f318880b);
    }
}
