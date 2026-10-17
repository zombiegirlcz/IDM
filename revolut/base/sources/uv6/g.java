package uv6;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f283328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f283329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f283330c;

    public g(Data cashbackPlans, Data selectedCashbackPlan, Data user) {
        Intrinsics.checkNotNullParameter(cashbackPlans, "cashbackPlans");
        Intrinsics.checkNotNullParameter(selectedCashbackPlan, "selectedCashbackPlan");
        Intrinsics.checkNotNullParameter(user, "user");
        this.f283328a = cashbackPlans;
        this.f283329b = selectedCashbackPlan;
        this.f283330c = user;
    }

    public static g a(g gVar, Data cashbackPlans, Data selectedCashbackPlan, Data user, int i) {
        if ((i & 1) != 0) {
            cashbackPlans = gVar.f283328a;
        }
        if ((i & 2) != 0) {
            selectedCashbackPlan = gVar.f283329b;
        }
        if ((i & 4) != 0) {
            user = gVar.f283330c;
        }
        gVar.getClass();
        Intrinsics.checkNotNullParameter(cashbackPlans, "cashbackPlans");
        Intrinsics.checkNotNullParameter(selectedCashbackPlan, "selectedCashbackPlan");
        Intrinsics.checkNotNullParameter(user, "user");
        return new g(cashbackPlans, selectedCashbackPlan, user);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f283328a, gVar.f283328a) && Intrinsics.f(this.f283329b, gVar.f283329b) && Intrinsics.f(this.f283330c, gVar.f283330c);
    }

    public final int hashCode() {
        return this.f283330c.hashCode() + kii.e.c(this.f283329b, this.f283328a.hashCode() * 31, 31);
    }
}
