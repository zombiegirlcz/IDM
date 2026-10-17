package bp9;

import aii.r;
import com.revolut.feature.payments.bills_chooser.api.common.BillType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BillType.CustomBill f17565a;

    public d(BillType.CustomBill customBill) {
        Intrinsics.checkNotNullParameter(customBill, "customBill");
        this.f17565a = customBill;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f17565a, ((d) obj2).f17565a);
    }

    public final int hashCode() {
        return this.f17565a.hashCode();
    }
}
