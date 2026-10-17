package ghk;

import com.revolut.data.model.Data;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$PlanPageLayout$BillingOptionItem;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.PassportService;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class s implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f143983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PlansDashboardLayout$PlanPageLayout$BillingOptionItem f143984b;

    public /* synthetic */ s(PlansDashboardLayout$PlanPageLayout$BillingOptionItem plansDashboardLayout$PlanPageLayout$BillingOptionItem, int i) {
        this.f143983a = i;
        this.f143984b = plansDashboardLayout$PlanPageLayout$BillingOptionItem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f143983a) {
            case 0:
                j update = (j) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                od0.i.Companion.getClass();
                return j.a(update, null, null, null, null, null, zi0.c.P(od0.h.a(this.f143984b), false, null, 3), null, false, PassportService.DEFAULT_MAX_BLOCKSIZE);
            default:
                zkk.j update2 = (zkk.j) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return zkk.j.a(update2, null, new Data(this.f143984b, null, false, 6, null), null, 5);
        }
    }
}
