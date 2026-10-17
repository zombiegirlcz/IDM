package ulk;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f281033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f281034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f281035c;
    public final Data d;
    public final Data e;

    public g(Data selectedPlan, Data selectedBilling, Data currentSubscription, Data subscribeInfo, Data planChangeTotalPrice) {
        Intrinsics.checkNotNullParameter(selectedPlan, "selectedPlan");
        Intrinsics.checkNotNullParameter(selectedBilling, "selectedBilling");
        Intrinsics.checkNotNullParameter(currentSubscription, "currentSubscription");
        Intrinsics.checkNotNullParameter(subscribeInfo, "subscribeInfo");
        Intrinsics.checkNotNullParameter(planChangeTotalPrice, "planChangeTotalPrice");
        this.f281033a = selectedPlan;
        this.f281034b = selectedBilling;
        this.f281035c = currentSubscription;
        this.d = subscribeInfo;
        this.e = planChangeTotalPrice;
    }

    public static g a(g gVar, Data data, Data data2, Data data3, Data data4, int i) {
        if ((i & 1) != 0) {
            data = gVar.f281033a;
        }
        Data selectedPlan = data;
        Data selectedBilling = gVar.f281034b;
        if ((i & 4) != 0) {
            data2 = gVar.f281035c;
        }
        Data currentSubscription = data2;
        if ((i & 8) != 0) {
            data3 = gVar.d;
        }
        Data subscribeInfo = data3;
        if ((i & 16) != 0) {
            data4 = gVar.e;
        }
        Data planChangeTotalPrice = data4;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(selectedPlan, "selectedPlan");
        Intrinsics.checkNotNullParameter(selectedBilling, "selectedBilling");
        Intrinsics.checkNotNullParameter(currentSubscription, "currentSubscription");
        Intrinsics.checkNotNullParameter(subscribeInfo, "subscribeInfo");
        Intrinsics.checkNotNullParameter(planChangeTotalPrice, "planChangeTotalPrice");
        return new g(selectedPlan, selectedBilling, currentSubscription, subscribeInfo, planChangeTotalPrice);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f281033a, gVar.f281033a) && Intrinsics.f(this.f281034b, gVar.f281034b) && Intrinsics.f(this.f281035c, gVar.f281035c) && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + kii.e.c(this.d, kii.e.c(this.f281035c, kii.e.c(this.f281034b, this.f281033a.hashCode() * 31, 31), 31), 31);
    }
}
