package x0l;

import androidx.recyclerview.widget.RecyclerView;
import com.revolut.retail.feature.trading_onboarding.impl.ui.riskwarning.RiskWarningController;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes12.dex */
public final class h extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RiskWarningController f301659a;

    public h(RiskWarningController riskWarningController) {
        this.f301659a = riskWarningController;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onScrolled(recyclerView, i, i2);
        boolean zCanScrollVertically = recyclerView.canScrollVertically(1);
        KProperty[] kPropertyArr = RiskWarningController.W;
        this.f301659a.e3().setCollapsed(zCanScrollVertically, true);
    }
}
