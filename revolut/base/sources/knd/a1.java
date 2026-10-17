package knd;

import com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnalyticsSpendingPeriod$Interval f186054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f186055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f186056c;

    public a1(AnalyticsSpendingPeriod$Interval interval, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(interval, "interval");
        this.f186054a = interval;
        this.f186055b = z;
        this.f186056c = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj2;
        return Intrinsics.f(this.f186054a, a1Var.f186054a) && this.f186055b == a1Var.f186055b && this.f186056c == a1Var.f186056c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f186056c) + j6.a.c(this.f186054a.hashCode() * 31, 31, this.f186055b);
    }
}
