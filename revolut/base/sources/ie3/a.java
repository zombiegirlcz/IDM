package ie3;

import java.util.List;
import k71.q;
import kotlin.jvm.internal.Intrinsics;
import xi0.b;

/* JADX INFO: loaded from: classes21.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f160626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f160627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f160628c;
    public final b d;

    public a(List transactions, List rates, q extraData, b targetCurrency) {
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        Intrinsics.checkNotNullParameter(rates, "rates");
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        this.f160626a = transactions;
        this.f160627b = rates;
        this.f160628c = extraData;
        this.d = targetCurrency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f160626a, aVar.f160626a) && Intrinsics.f(this.f160627b, aVar.f160627b) && Intrinsics.f(this.f160628c, aVar.f160628c) && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f160628c.hashCode() + p.a.d(this.f160626a.hashCode() * 31, 31, this.f160627b)) * 31);
    }
}
