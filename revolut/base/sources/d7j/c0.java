package d7j;

import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.models.ExchangeOrderDraft;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c0 extends d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f111981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Throwable f111982b;

    public c0(boolean z, Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f111981a = z;
        this.f111982b = error;
    }

    @Override // d7j.d0
    public final ExchangeOrderDraft a() {
        return null;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj2;
        return this.f111981a == c0Var.f111981a && Intrinsics.f(this.f111982b, c0Var.f111982b);
    }

    public final int hashCode() {
        return (this.f111982b.hashCode() + (Boolean.hashCode(this.f111981a) * 31)) * 31;
    }
}
