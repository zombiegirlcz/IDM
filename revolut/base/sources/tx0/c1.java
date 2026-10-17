package tx0;

import androidx.viewpager2.widget.ViewPager2;
import com.revolut.core.ui_kit.views.navbar.MarketingPhotoHeaderContentView;

/* JADX INFO: loaded from: classes20.dex */
public final class c1 extends ViewPager2.OnPageChangeCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MarketingPhotoHeaderContentView f275094a;

    public c1(MarketingPhotoHeaderContentView marketingPhotoHeaderContentView) {
        this.f275094a = marketingPhotoHeaderContentView;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageSelected(int i) {
        MarketingPhotoHeaderContentView.Companion aVar = MarketingPhotoHeaderContentView.INSTANCE;
        this.f275094a.b(i, false);
    }
}
