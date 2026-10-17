package f2i;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qua.p f131800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f131801b;

    public i(qua.p recurringPayment, xi0.b pocketCurrency) {
        Intrinsics.checkNotNullParameter(recurringPayment, "recurringPayment");
        Intrinsics.checkNotNullParameter(pocketCurrency, "pocketCurrency");
        this.f131800a = recurringPayment;
        this.f131801b = pocketCurrency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f131800a, iVar.f131800a) && Intrinsics.f(this.f131801b, iVar.f131801b);
    }

    public final int hashCode() {
        return this.f131801b.hashCode() + (this.f131800a.hashCode() * 31);
    }
}
