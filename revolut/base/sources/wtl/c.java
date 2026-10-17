package wtl;

import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Amount f300034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f300035b;

    public c(Amount amount, xi0.b instrumentCurrency) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(instrumentCurrency, "instrumentCurrency");
        this.f300034a = amount;
        this.f300035b = instrumentCurrency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f300034a, cVar.f300034a) && Intrinsics.f(this.f300035b, cVar.f300035b);
    }

    public final int hashCode() {
        return this.f300035b.hashCode() + (this.f300034a.hashCode() * 31);
    }
}
