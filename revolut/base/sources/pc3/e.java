package pc3;

import aii.r;
import com.revolut.feature.cash_topup.api.models.CashTopUpLocationInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CashTopUpLocationInfo f234814a;

    public e(CashTopUpLocationInfo topUpLocation) {
        Intrinsics.checkNotNullParameter(topUpLocation, "topUpLocation");
        this.f234814a = topUpLocation;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f234814a, ((e) obj2).f234814a);
    }

    public final int hashCode() {
        return this.f234814a.hashCode();
    }
}
