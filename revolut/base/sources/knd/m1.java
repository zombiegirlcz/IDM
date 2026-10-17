package knd;

import com.revolut.data.model.Data;
import com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnalyticsSpendingPeriod$Interval f186113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f186114b;

    public m1(AnalyticsSpendingPeriod$Interval key, Data data) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f186113a = key;
        this.f186114b = data;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m1)) {
            return false;
        }
        m1 m1Var = (m1) obj2;
        return Intrinsics.f(this.f186113a, m1Var.f186113a) && Intrinsics.f(this.f186114b, m1Var.f186114b);
    }

    public final int hashCode() {
        return this.f186114b.hashCode() + (this.f186113a.hashCode() * 31);
    }
}
