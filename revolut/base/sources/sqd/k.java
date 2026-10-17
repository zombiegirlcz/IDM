package sqd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class k implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f265067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f265068b;

    public k(dj0.d displayValue, xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(displayValue, "displayValue");
        this.f265067a = currency;
        this.f265068b = displayValue;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f265067a, kVar.f265067a) && Intrinsics.f(this.f265068b, kVar.f265068b);
    }

    public final int hashCode() {
        return this.f265068b.hashCode() + (this.f265067a.hashCode() * 31);
    }
}
