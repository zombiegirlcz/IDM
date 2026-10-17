package t6e;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f268320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f268321b;

    public k(dj0.d money, l period) {
        Intrinsics.checkNotNullParameter(money, "money");
        Intrinsics.checkNotNullParameter(period, "period");
        this.f268320a = money;
        this.f268321b = period;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f268320a, kVar.f268320a) && this.f268321b == kVar.f268321b;
    }

    public final int hashCode() {
        return this.f268321b.hashCode() + (this.f268320a.hashCode() * 31);
    }
}
