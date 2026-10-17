package nnd;

import com.revolut.retail.feature.api.AnalyticsAccount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class l0 implements c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnalyticsAccount.Savings.JointAll f217566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rnd.a f217567b;

    public l0(AnalyticsAccount.Savings.JointAll analyticsAccount, rnd.a extraData) {
        Intrinsics.checkNotNullParameter(analyticsAccount, "analyticsAccount");
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        this.f217566a = analyticsAccount;
        this.f217567b = extraData;
    }

    @Override // nnd.c1
    public final AnalyticsAccount a() {
        return this.f217566a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj2;
        return Intrinsics.f(this.f217566a, l0Var.f217566a) && Intrinsics.f(this.f217567b, l0Var.f217567b);
    }

    public final int hashCode() {
        return this.f217567b.hashCode() + (this.f217566a.f99198a.hashCode() * 31);
    }
}
