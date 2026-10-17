package i5f;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f158827a;

    public e(xi0.b cashHoldingCurrency) {
        Intrinsics.checkNotNullParameter(cashHoldingCurrency, "cashHoldingCurrency");
        this.f158827a = cashHoldingCurrency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f158827a, ((e) obj2).f158827a);
    }

    public final int hashCode() {
        return this.f158827a.hashCode();
    }
}
