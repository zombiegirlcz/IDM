package kv5;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f189960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f189961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f189962c;

    public g(Data derivativesBalanceData, Data balanceRatesData, xi0.b displayCurrency) {
        Intrinsics.checkNotNullParameter(derivativesBalanceData, "derivativesBalanceData");
        Intrinsics.checkNotNullParameter(balanceRatesData, "balanceRatesData");
        Intrinsics.checkNotNullParameter(displayCurrency, "displayCurrency");
        this.f189960a = derivativesBalanceData;
        this.f189961b = balanceRatesData;
        this.f189962c = displayCurrency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f189960a, gVar.f189960a) && Intrinsics.f(this.f189961b, gVar.f189961b) && Intrinsics.f(this.f189962c, gVar.f189962c);
    }

    public final int hashCode() {
        return this.f189962c.hashCode() + kii.e.c(this.f189961b, this.f189960a.hashCode() * 31, 31);
    }
}
