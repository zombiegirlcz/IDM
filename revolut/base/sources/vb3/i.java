package vb3;

import com.revolut.feature.cash_topup.api.models.CashTopUpLocationInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class i extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CashTopUpLocationInfo f287384a;

    public i(CashTopUpLocationInfo location) {
        Intrinsics.checkNotNullParameter(location, "location");
        this.f287384a = location;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f287384a, ((i) obj2).f287384a);
    }

    public final int hashCode() {
        return this.f287384a.hashCode();
    }
}
