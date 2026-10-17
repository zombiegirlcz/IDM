package kce;

import com.revolut.data.model.Data;
import com.revolut.feature.cashback.impl.ui.pocket.details.CashbackPocketDetailsScreen;
import com.revolut.feature.insurance.api.models.cfac.CFACClaimDetails;
import com.revolut.feature.insurance.api.models.details.CFACInsuranceDetails;
import com.revolut.feature.recurring_payments.api.data.models.RecurringPaymentWithExtra;
import com.revolut.feature.tab.accounts.impl.total_wealth.category_list.TotalWealthCategoryListScreen;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlanHubScreenConfig;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanBottomSheetConfig;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanScreenConfig;
import e8e.t;
import efm.h0;
import efm.w;
import efm.x;
import ggk.g1;
import ggk.h1;
import ggk.y;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;
import java.util.List;
import ke7.v;
import kl.c2;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import ml.o0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class c implements kfm.o, x, kfm.p, ObservableTransformer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f182702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f182703b;

    public /* synthetic */ c(Object obj2, int i) {
        this.f182702a = i;
        this.f182703b = obj2;
    }

    @Override // efm.x
    public w apply(efm.r p0) {
        gae.a aVar = (gae.a) this.f182703b;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return (w) aVar.invoke(p0);
    }

    @Override // io.reactivex.rxjava3.core.ObservableTransformer
    public ObservableSource b(Observable observable) {
        c2 this$0 = (c2) this.f182703b;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(observable, "observable");
        Observable observableCast = this$0.C.filter(kl.p.d).cast(o0.class);
        Intrinsics.checkNotNullExpressionValue(observableCast, "cast(...)");
        return observableCast.switchMap(new k7i.i(observable, this$0, 1));
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        int i = this.f182702a;
        Object obj2 = this.f182703b;
        switch (i) {
            case 8:
                KProperty[] kPropertyArr = CashbackPocketDetailsScreen.g0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 12:
                KProperty[] kPropertyArr2 = TotalWealthCategoryListScreen.X;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
        }
        return ((Boolean) ((kh4.b) obj2).invoke(p0)).booleanValue();
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        int i = this.f182702a;
        Object obj2 = this.f182703b;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (xi0.b) ((kcd.a) obj2).invoke(p0);
            case 1:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((d) obj2).invoke(p0);
            case 2:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) ((kcd.a) obj2).invoke(p0);
            case 3:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) ((kcd.a) obj2).invoke(p0);
            case 4:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (RecurringPaymentWithExtra.LinkedTransaction) ((t) obj2).invoke(p0);
            case 5:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((d) obj2).invoke(p0);
            case 6:
            case 8:
            case 12:
            case 14:
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Pair) ((v) obj2).invoke(p0);
            case 7:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((k5e.k) obj2).invoke(p0);
            case 9:
                KProperty[] kPropertyArr = CashbackPocketDetailsScreen.g0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (bbj.d) ((kcd.a) obj2).invoke(p0);
            case 10:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) ((kcd.a) obj2).invoke(p0);
            case 11:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (od0.i) ((imk.e) obj2).invoke(p0);
            case 13:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) ((k79.b) obj2).invoke(p0);
            case 15:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (ui7.b) ((kh4.b) obj2).invoke(p0);
            case 16:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (CFACInsuranceDetails) ((kh4.b) obj2).invoke(p0);
            case 17:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((kh4.b) obj2).invoke(p0);
            case 18:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (CFACClaimDetails) ((kh4.b) obj2).invoke(p0);
            case 19:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((kh4.b) obj2).invoke(p0);
            case 20:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h1) ((kh4.b) obj2).invoke(p0);
            case 21:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (PricingPlanScreenConfig) ((kjk.w) obj2).invoke(p0);
            case 22:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (g1) ((kh4.b) obj2).invoke(p0);
            case 23:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (PlanHubScreenConfig) ((k79.b) obj2).invoke(p0);
            case 24:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h1) ((kjk.x) obj2).invoke(p0);
            case 25:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (PricingPlanBottomSheetConfig) ((k65.d) obj2).invoke(p0);
            case 26:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (ggk.l) ((kjk.x) obj2).invoke(p0);
            case 27:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (y) ((kjk.x) obj2).invoke(p0);
        }
    }
}
