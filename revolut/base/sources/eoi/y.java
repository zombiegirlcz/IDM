package eoi;

import androidx.viewpager.widget.ViewPager;

/* JADX INFO: loaded from: classes13.dex */
public final class y implements ViewPager.OnPageChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b0 f127983a;

    public y(b0 b0Var) {
        this.f127983a = b0Var;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrollStateChanged(int i) {
        if (i == 0) {
            this.f127983a.f127913a.invoke();
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrolled(int i, float f, int i2) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageSelected(int i) {
    }
}
