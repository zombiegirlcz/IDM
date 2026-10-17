package cq9;

import com.revolut.feature.payments.bills_chooser.impl.domain.SplitBillItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class j implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SplitBillItem f108053a;

    public j(SplitBillItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.f108053a = item;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f108053a, ((j) obj2).f108053a);
    }

    public final int hashCode() {
        return this.f108053a.hashCode();
    }
}
