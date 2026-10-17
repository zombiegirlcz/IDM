package v17;

import com.revolut.feature.freelancer.impl.ui.sales.filters.screen.sales_filters.FreelancerSalesFiltersScreen;
import com.revolut.recyclerkit.ScreenGridLayoutManager;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends ScreenGridLayoutManager.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FreelancerSalesFiltersScreen f285240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ScreenGridLayoutManager f285241b;

    public b(FreelancerSalesFiltersScreen freelancerSalesFiltersScreen, ScreenGridLayoutManager screenGridLayoutManager) {
        this.f285240a = freelancerSalesFiltersScreen;
        this.f285241b = screenGridLayoutManager;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
    public final int getSpanSize(int i) {
        KProperty[] kPropertyArr = FreelancerSalesFiltersScreen.f74135h0;
        String f55265b = this.f285240a.d3().a(i).getF55265b();
        if (Intrinsics.f(f55265b, "MINIMUM_AMOUNT_ID") || Intrinsics.f(f55265b, "MAXIMUM_AMOUNT_ID")) {
            return 1;
        }
        return this.f285241b.getSpanCount();
    }
}
