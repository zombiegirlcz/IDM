package zkk;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$PlanPageLayout$BillingOptionItem;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_billing_picker.PlanBillingPickerScreenContract$InputData;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import te0.w;
import vkm.j2;
import zhm.d0;

/* JADX INFO: loaded from: classes11.dex */
public final class t extends oki.h implements m {

    @NotNull
    private static final o Companion = new o();
    public final PlanBillingPickerScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final a f323083p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i4b.f f323084q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final dgk.a f323085r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i4b.f f323086s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f323087t;
    public final y u;

    public t(cli.n stateMapper, PlanBillingPickerScreenContract$InputData input, a planBillingPickerInteractor, i4b.f pricingPlanByTierProvider, dgk.a footerExtension, i4b.f legalEntityContextProvider) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(planBillingPickerInteractor, "planBillingPickerInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanByTierProvider, "pricingPlanByTierProvider");
        Intrinsics.checkNotNullParameter(footerExtension, "footerExtension");
        Intrinsics.checkNotNullParameter(legalEntityContextProvider, "legalEntityContextProvider");
        this.o = input;
        this.f323083p = planBillingPickerInteractor;
        this.f323084q = pricingPlanByTierProvider;
        this.f323085r = footerExtension;
        this.f323086s = legalEntityContextProvider;
        this.f323087t = w.y0(new zh0.b(this, 9));
        this.u = mra.d.b(this, new j(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    public static final PlansDashboardLayout$PlanPageLayout$BillingOptionItem I2(t tVar, List list) {
        Object obj2;
        Object next;
        Object next2;
        PlansDashboardLayout$PlanPageLayout$BillingOptionItem plansDashboardLayout$PlanPageLayout$BillingOptionItem = (PlansDashboardLayout$PlanPageLayout$BillingOptionItem) ((j) ((j2) tVar.u.f22677a).getValue()).f323070b.getContent();
        hha.i f103111a = tVar.o.f103478b.getF103111a();
        List list2 = list;
        Iterator it8 = list2.iterator();
        while (true) {
            obj2 = null;
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f((PlansDashboardLayout$PlanPageLayout$BillingOptionItem) next, plansDashboardLayout$PlanPageLayout$BillingOptionItem)) {
                break;
            }
        }
        PlansDashboardLayout$PlanPageLayout$BillingOptionItem plansDashboardLayout$PlanPageLayout$BillingOptionItem2 = (PlansDashboardLayout$PlanPageLayout$BillingOptionItem) next;
        if (plansDashboardLayout$PlanPageLayout$BillingOptionItem2 != null) {
            return plansDashboardLayout$PlanPageLayout$BillingOptionItem2;
        }
        Iterator it9 = list2.iterator();
        while (true) {
            if (!it9.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it9.next();
            if (((PlansDashboardLayout$PlanPageLayout$BillingOptionItem) next2).f102747a == f103111a) {
                break;
            }
        }
        PlansDashboardLayout$PlanPageLayout$BillingOptionItem plansDashboardLayout$PlanPageLayout$BillingOptionItem3 = (PlansDashboardLayout$PlanPageLayout$BillingOptionItem) next2;
        if (plansDashboardLayout$PlanPageLayout$BillingOptionItem3 != null) {
            return plansDashboardLayout$PlanPageLayout$BillingOptionItem3;
        }
        Iterator it10 = list2.iterator();
        while (true) {
            if (!it10.hasNext()) {
                break;
            }
            Object next3 = it10.next();
            if (((PlansDashboardLayout$PlanPageLayout$BillingOptionItem) next3).f102750g) {
                obj2 = next3;
                break;
            }
        }
        PlansDashboardLayout$PlanPageLayout$BillingOptionItem plansDashboardLayout$PlanPageLayout$BillingOptionItem4 = (PlansDashboardLayout$PlanPageLayout$BillingOptionItem) obj2;
        return plansDashboardLayout$PlanPageLayout$BillingOptionItem4 == null ? (PlansDashboardLayout$PlanPageLayout$BillingOptionItem) d0.d0(list) : plansDashboardLayout$PlanPageLayout$BillingOptionItem4;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, vkm.q.Q((vii.b) this.f323087t.getValue(), new z6e.g((Continuation) null, this, 15)), null, null, new s(this, null, 0), 3);
        yji.l.a1(this, this.f323086s.j(md6.r.f204497a), null, null, new s(this, null, 1), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.u;
    }
}
