package oc3;

import com.revolut.feature.cash_topup.api.models.CashTopUpLocationInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class k extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CashTopUpLocationInfo f224070a;

    public k(CashTopUpLocationInfo location) {
        Intrinsics.checkNotNullParameter(location, "location");
        this.f224070a = location;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f224070a, ((k) obj2).f224070a);
    }

    public final int hashCode() {
        return this.f224070a.hashCode();
    }
}
