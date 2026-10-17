package v35;

import aii.e;
import com.revolut.feature.credit.loan.autopay.api.account_selector.AccountSelectorV2$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccountSelectorV2$InputData f285852a;

    public a(AccountSelectorV2$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f285852a = inputData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f285852a, ((a) obj2).f285852a);
    }

    public final int hashCode() {
        return this.f285852a.hashCode();
    }
}
