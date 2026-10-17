package pmb;

import androidx.viewpager2.widget.ViewPager2;
import com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_product_selection.SavingsProductSelectionScreen;

/* JADX INFO: loaded from: classes6.dex */
public final class n extends ViewPager2.OnPageChangeCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SavingsProductSelectionScreen f237543a;

    public n(SavingsProductSelectionScreen savingsProductSelectionScreen) {
        this.f237543a = savingsProductSelectionScreen;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageSelected(int i) {
        com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_product_selection.a aVar = (com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_product_selection.a) this.f237543a.R2();
        aVar.H2(aVar.u, new l2c.l(i, 9));
    }
}
