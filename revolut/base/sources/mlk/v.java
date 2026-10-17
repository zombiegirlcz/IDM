package mlk;

import com.revolut.data.model.Data;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.PlanCancelFeatures$CancelReason;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class v implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PlanCancelFeatures$CancelReason f207027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f207028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f207029c;
    public final Data d;
    public final Data e;
    public final Data f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f207030g;

    public v(PlanCancelFeatures$CancelReason cancelReason, Data subscription, Data paidPlanToDowngradeTo, Data benefitsModel, Data userFirstName, Data familyPlanInfo, boolean z) {
        Intrinsics.checkNotNullParameter(cancelReason, "cancelReason");
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        Intrinsics.checkNotNullParameter(paidPlanToDowngradeTo, "paidPlanToDowngradeTo");
        Intrinsics.checkNotNullParameter(benefitsModel, "benefitsModel");
        Intrinsics.checkNotNullParameter(userFirstName, "userFirstName");
        Intrinsics.checkNotNullParameter(familyPlanInfo, "familyPlanInfo");
        this.f207027a = cancelReason;
        this.f207028b = subscription;
        this.f207029c = paidPlanToDowngradeTo;
        this.d = benefitsModel;
        this.e = userFirstName;
        this.f = familyPlanInfo;
        this.f207030g = z;
    }

    public static v a(v vVar, Data data, Data data2, Data data3, Data data4, Data data5, int i) {
        PlanCancelFeatures$CancelReason cancelReason = vVar.f207027a;
        if ((i & 2) != 0) {
            data = vVar.f207028b;
        }
        Data subscription = data;
        if ((i & 4) != 0) {
            data2 = vVar.f207029c;
        }
        Data paidPlanToDowngradeTo = data2;
        if ((i & 8) != 0) {
            data3 = vVar.d;
        }
        Data benefitsModel = data3;
        if ((i & 16) != 0) {
            data4 = vVar.e;
        }
        Data userFirstName = data4;
        if ((i & 32) != 0) {
            data5 = vVar.f;
        }
        Data familyPlanInfo = data5;
        boolean z = vVar.f207030g;
        vVar.getClass();
        Intrinsics.checkNotNullParameter(cancelReason, "cancelReason");
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        Intrinsics.checkNotNullParameter(paidPlanToDowngradeTo, "paidPlanToDowngradeTo");
        Intrinsics.checkNotNullParameter(benefitsModel, "benefitsModel");
        Intrinsics.checkNotNullParameter(userFirstName, "userFirstName");
        Intrinsics.checkNotNullParameter(familyPlanInfo, "familyPlanInfo");
        return new v(cancelReason, subscription, paidPlanToDowngradeTo, benefitsModel, userFirstName, familyPlanInfo, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f207027a, vVar.f207027a) && Intrinsics.f(this.f207028b, vVar.f207028b) && Intrinsics.f(this.f207029c, vVar.f207029c) && Intrinsics.f(this.d, vVar.d) && Intrinsics.f(this.e, vVar.e) && Intrinsics.f(this.f, vVar.f) && this.f207030g == vVar.f207030g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f207030g) + kii.e.c(this.f, kii.e.c(this.e, kii.e.c(this.d, kii.e.c(this.f207029c, kii.e.c(this.f207028b, this.f207027a.hashCode() * 31, 31), 31), 31), 31), 31);
    }
}
