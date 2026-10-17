package cq9;

import com.revolut.feature.payments.bills_chooser.impl.domain.SplitBillItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f108050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SplitBillItem f108051b;

    public g(xi0.b currency, SplitBillItem splitBillItem) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f108050a = currency;
        this.f108051b = splitBillItem;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f108050a, gVar.f108050a) && Intrinsics.f(this.f108051b, gVar.f108051b);
    }

    public final int hashCode() {
        int iHashCode = this.f108050a.hashCode() * 31;
        SplitBillItem splitBillItem = this.f108051b;
        return iHashCode + (splitBillItem == null ? 0 : splitBillItem.hashCode());
    }
}
