package n09;

import androidx.viewpager2.widget.ViewPager2;
import com.revolut.feature.learn.shared.impl.ui.home.LearnHomeScreen;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends ViewPager2.OnPageChangeCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LearnHomeScreen f210945a;

    public j(LearnHomeScreen learnHomeScreen) {
        this.f210945a = learnHomeScreen;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageSelected(int i) {
        ((m0) this.f210945a.T2()).z2(new s(i));
    }
}
