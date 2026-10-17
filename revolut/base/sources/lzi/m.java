package lzi;

import com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval;
import ip0.v7;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f200987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f200988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AnalyticsSpendingPeriod$Interval f200989c;
    public final List d;

    public m(String walletId, dj0.d total, AnalyticsSpendingPeriod$Interval interval, List categories) {
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        Intrinsics.checkNotNullParameter(total, "total");
        Intrinsics.checkNotNullParameter(interval, "interval");
        Intrinsics.checkNotNullParameter(categories, "categories");
        this.f200987a = walletId;
        this.f200988b = total;
        this.f200989c = interval;
        this.d = categories;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f200987a, mVar.f200987a) && Intrinsics.f(this.f200988b, mVar.f200988b) && Intrinsics.f(this.f200989c, mVar.f200989c) && Intrinsics.f(this.d, mVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f200989c.hashCode() + v7.c(this.f200987a.hashCode() * 31, 31, this.f200988b)) * 31);
    }
}
