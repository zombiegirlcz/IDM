package ghk;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class j implements oki.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f143959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f143960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f143961c;
    public final Data d;
    public final Data e;
    public final Data f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Data f143962g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f143963h;

    public j(List pagerItems, String selectedPagerItemId, Data plans, Data subscription, Data selectedPlanLayout, Data selectedBillingOption, Data planDashboardLayout, boolean z) {
        Intrinsics.checkNotNullParameter(pagerItems, "pagerItems");
        Intrinsics.checkNotNullParameter(selectedPagerItemId, "selectedPagerItemId");
        Intrinsics.checkNotNullParameter(plans, "plans");
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        Intrinsics.checkNotNullParameter(selectedPlanLayout, "selectedPlanLayout");
        Intrinsics.checkNotNullParameter(selectedBillingOption, "selectedBillingOption");
        Intrinsics.checkNotNullParameter(planDashboardLayout, "planDashboardLayout");
        this.f143959a = pagerItems;
        this.f143960b = selectedPagerItemId;
        this.f143961c = plans;
        this.d = subscription;
        this.e = selectedPlanLayout;
        this.f = selectedBillingOption;
        this.f143962g = planDashboardLayout;
        this.f143963h = z;
    }

    public static j a(j jVar, List list, String str, Data data, Data data2, Data data3, Data data4, Data data5, boolean z, int i) {
        if ((i & 1) != 0) {
            list = jVar.f143959a;
        }
        List pagerItems = list;
        if ((i & 2) != 0) {
            str = jVar.f143960b;
        }
        String selectedPagerItemId = str;
        if ((i & 4) != 0) {
            data = jVar.f143961c;
        }
        Data plans = data;
        if ((i & 8) != 0) {
            data2 = jVar.d;
        }
        Data subscription = data2;
        if ((i & 16) != 0) {
            data3 = jVar.e;
        }
        Data selectedPlanLayout = data3;
        if ((i & 32) != 0) {
            data4 = jVar.f;
        }
        Data selectedBillingOption = data4;
        Data planDashboardLayout = (i & 64) != 0 ? jVar.f143962g : data5;
        boolean z3 = (i & 128) != 0 ? jVar.f143963h : z;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(pagerItems, "pagerItems");
        Intrinsics.checkNotNullParameter(selectedPagerItemId, "selectedPagerItemId");
        Intrinsics.checkNotNullParameter(plans, "plans");
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        Intrinsics.checkNotNullParameter(selectedPlanLayout, "selectedPlanLayout");
        Intrinsics.checkNotNullParameter(selectedBillingOption, "selectedBillingOption");
        Intrinsics.checkNotNullParameter(planDashboardLayout, "planDashboardLayout");
        return new j(pagerItems, selectedPagerItemId, plans, subscription, selectedPlanLayout, selectedBillingOption, planDashboardLayout, z3);
    }

    @Override // oki.a
    /* JADX INFO: renamed from: W */
    public final List getF85711b() {
        return this.f143959a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f143959a, jVar.f143959a) && Intrinsics.f(this.f143960b, jVar.f143960b) && Intrinsics.f(this.f143961c, jVar.f143961c) && Intrinsics.f(this.d, jVar.d) && Intrinsics.f(this.e, jVar.e) && Intrinsics.f(this.f, jVar.f) && Intrinsics.f(this.f143962g, jVar.f143962g) && this.f143963h == jVar.f143963h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f143963h) + kii.e.c(this.f143962g, kii.e.c(this.f, kii.e.c(this.e, kii.e.c(this.d, kii.e.c(this.f143961c, p.a.c(this.f143959a.hashCode() * 31, 31, this.f143960b), 31), 31), 31), 31), 31);
    }

    @Override // oki.a
    /* JADX INFO: renamed from: z */
    public final String getF85710a() {
        return this.f143960b;
    }
}
