package lu6;

import com.revolut.feature.freelancer.impl.ui.acquiring_order.filters.screen.FreelancerAcquiringOrderFiltersScreen;
import com.revolut.recyclerkit.ScreenGridLayoutManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends ScreenGridLayoutManager.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FreelancerAcquiringOrderFiltersScreen f200044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ScreenGridLayoutManager f200045b;

    public c(FreelancerAcquiringOrderFiltersScreen freelancerAcquiringOrderFiltersScreen, ScreenGridLayoutManager screenGridLayoutManager) {
        this.f200044a = freelancerAcquiringOrderFiltersScreen;
        this.f200045b = screenGridLayoutManager;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
    public final int getSpanSize(int i) {
        String f54961b = this.f200044a.T.a(i).getF54961b();
        if (Intrinsics.f(f54961b, "ITEM_ID_MINIMUM_AMOUNT") || Intrinsics.f(f54961b, "ITEM_ID_MAXIMUM_AMOUNT")) {
            return 1;
        }
        return this.f200045b.getSpanCount();
    }
}
