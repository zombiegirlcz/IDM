package ruk;

import androidx.viewpager2.widget.ViewPager2;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.analyst_details_screen.AnalystDetailsScreen;

/* JADX INFO: loaded from: classes12.dex */
public final class e extends ViewPager2.OnPageChangeCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AnalystDetailsScreen f257596a;

    public e(AnalystDetailsScreen analystDetailsScreen) {
        this.f257596a = analystDetailsScreen;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageSelected(int i) {
        ((t) this.f257596a.T2()).y2(i);
    }
}
