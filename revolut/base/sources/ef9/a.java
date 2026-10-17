package ef9;

import com.revolut.feature.pay_bills_taxes.api.navigation.BillPaymentNavigation$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BillPaymentNavigation$InputData f125291a;

    public a(BillPaymentNavigation$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f125291a = inputData;
    }

    public final BillPaymentNavigation$InputData b() {
        return this.f125291a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f125291a, ((a) obj2).f125291a);
    }

    public final int hashCode() {
        return this.f125291a.hashCode();
    }
}
