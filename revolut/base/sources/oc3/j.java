package oc3;

import com.revolut.feature.cash_topup.api.models.CashTopUpLocationInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class j extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CashTopUpLocationInfo f224069a;

    public j(CashTopUpLocationInfo location) {
        Intrinsics.checkNotNullParameter(location, "location");
        this.f224069a = location;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f224069a, ((j) obj2).f224069a);
    }

    public final int hashCode() {
        return this.f224069a.hashCode();
    }
}
