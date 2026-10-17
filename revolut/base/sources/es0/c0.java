package es0;

import androidx.viewpager.widget.ViewPager;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes19.dex */
public final class c0 implements ViewPager.OnPageChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f128813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f128814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f128815c;

    public c0(b0 b0Var) {
        this.f128813a = new WeakReference(b0Var);
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrollStateChanged(int i) {
        this.f128814b = this.f128815c;
        this.f128815c = i;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrolled(int i, float f, int i2) {
        b0 b0Var = (b0) this.f128813a.get();
        if (b0Var != null) {
            int i3 = this.f128815c;
            b0Var.setScrollPosition(i, f, i3 != 2 || this.f128814b == 1, (i3 == 2 && this.f128814b == 0) ? false : true);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageSelected(int i) {
        b0 b0Var = (b0) this.f128813a.get();
        if (b0Var == null || b0Var.getSelectedTabPosition() == i || i >= b0Var.getTabCount()) {
            return;
        }
        int i2 = this.f128815c;
        b0Var.r(b0Var.k(i), i2 == 0 || (i2 == 2 && this.f128814b == 0));
    }
}
