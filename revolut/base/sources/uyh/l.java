package uyh;

import com.revolut.feature_crypto_order_flow.impl.order_summary.OrderSummaryScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class l extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f284378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final OrderSummaryScreenContract$InputData f284379b;

    public l(String legalEntityId, OrderSummaryScreenContract$InputData input) {
        Intrinsics.checkNotNullParameter(legalEntityId, "legalEntityId");
        Intrinsics.checkNotNullParameter(input, "input");
        this.f284378a = legalEntityId;
        this.f284379b = input;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f284378a, lVar.f284378a) && Intrinsics.f(this.f284379b, lVar.f284379b);
    }

    public final int hashCode() {
        return this.f284379b.f96775a.hashCode() + (this.f284378a.hashCode() * 31);
    }
}
