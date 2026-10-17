package nnd;

import com.revolut.retail.feature.api.AnalyticsAccount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class s0 implements c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnalyticsAccount.Savings.JointIndividual f217590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rnd.d f217591b;

    public s0(AnalyticsAccount.Savings.JointIndividual analyticsAccount, rnd.d extraData) {
        Intrinsics.checkNotNullParameter(analyticsAccount, "analyticsAccount");
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        this.f217590a = analyticsAccount;
        this.f217591b = extraData;
    }

    @Override // nnd.c1
    public final AnalyticsAccount a() {
        return this.f217590a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj2;
        return Intrinsics.f(this.f217590a, s0Var.f217590a) && Intrinsics.f(this.f217591b, s0Var.f217591b);
    }

    public final int hashCode() {
        return this.f217591b.hashCode() + (this.f217590a.hashCode() * 31);
    }
}
