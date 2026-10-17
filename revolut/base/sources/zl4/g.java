package zl4;

import com.revolut.feature.credit.card.api.navigation.descriptor.CreditCardDisplayBalanceSettings$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditCardDisplayBalanceSettings$InputData f323183a;

    public g(CreditCardDisplayBalanceSettings$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f323183a = inputData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f323183a, ((g) obj2).f323183a);
    }

    public final int hashCode() {
        return this.f323183a.f68993a.hashCode();
    }
}
