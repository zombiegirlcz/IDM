package nnd;

import com.revolut.retail.feature.api.AnalyticsAccount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class p0 implements c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnalyticsAccount.Savings.PersonalIndividual f217578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rnd.d f217579b;

    public p0(AnalyticsAccount.Savings.PersonalIndividual analyticsAccount, rnd.d extraData) {
        Intrinsics.checkNotNullParameter(analyticsAccount, "analyticsAccount");
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        this.f217578a = analyticsAccount;
        this.f217579b = extraData;
    }

    @Override // nnd.c1
    public final AnalyticsAccount a() {
        return this.f217578a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj2;
        return Intrinsics.f(this.f217578a, p0Var.f217578a) && Intrinsics.f(this.f217579b, p0Var.f217579b);
    }

    public final int hashCode() {
        return this.f217579b.hashCode() + (this.f217578a.f99204a.hashCode() * 31);
    }
}
