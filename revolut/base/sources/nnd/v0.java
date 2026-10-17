package nnd;

import com.revolut.retail.feature.api.AnalyticsAccount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class v0 implements c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnalyticsAccount.Savings.JuniorSaving f217600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rnd.e f217601b;

    public v0(AnalyticsAccount.Savings.JuniorSaving analyticsAccount, rnd.e extraData) {
        Intrinsics.checkNotNullParameter(analyticsAccount, "analyticsAccount");
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        this.f217600a = analyticsAccount;
        this.f217601b = extraData;
    }

    @Override // nnd.c1
    public final AnalyticsAccount a() {
        return this.f217600a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj2;
        return Intrinsics.f(this.f217600a, v0Var.f217600a) && Intrinsics.f(this.f217601b, v0Var.f217601b);
    }

    public final int hashCode() {
        return this.f217601b.hashCode() + (this.f217600a.hashCode() * 31);
    }
}
