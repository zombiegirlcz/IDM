package tx0;

import androidx.viewpager2.widget.ViewPager2;
import com.revolut.core.ui_kit.views.navbar.AccountSelectionNavBarContentView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes20.dex */
public final class v extends ViewPager2.OnPageChangeCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AccountSelectionNavBarContentView f275250a;

    public v(AccountSelectionNavBarContentView accountSelectionNavBarContentView) {
        this.f275250a = accountSelectionNavBarContentView;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageScrollStateChanged(int i) {
        AccountSelectionNavBarContentView accountSelectionNavBarContentView = this.f275250a;
        accountSelectionNavBarContentView.E = i;
        Function2<String, Integer, Unit> onPagingStateChanged$ui_kit_components_release = accountSelectionNavBarContentView.getOnPagingStateChanged$ui_kit_components_release();
        if (onPagingStateChanged$ui_kit_components_release != null) {
            onPagingStateChanged$ui_kit_components_release.invoke(accountSelectionNavBarContentView.v, Integer.valueOf(accountSelectionNavBarContentView.E));
        }
        if (i == 0) {
            accountSelectionNavBarContentView.p();
        }
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [android.view.View, tx0.x] */
    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageScrolled(int i, float f, int i2) {
        ?? r4;
        AccountSelectionNavBarContentView accountSelectionNavBarContentView = this.f275250a;
        accountSelectionNavBarContentView.O = i;
        accountSelectionNavBarContentView.P = f;
        accountSelectionNavBarContentView.p();
        if (accountSelectionNavBarContentView.E == 0 || (r4 = accountSelectionNavBarContentView.S) == 0) {
            return;
        }
        r4.K(f, i);
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageSelected(int i) {
        AccountSelectionNavBarContentView.Companion companion = AccountSelectionNavBarContentView.INSTANCE;
        this.f275250a.a();
    }
}
