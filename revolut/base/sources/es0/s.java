package es0;

import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

/* JADX INFO: loaded from: classes19.dex */
public final class s implements ViewPager.OnAdapterChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f128846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f128847b;

    public s(b0 b0Var) {
        this.f128847b = b0Var;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnAdapterChangeListener
    public final void onAdapterChanged(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
        b0 b0Var = this.f128847b;
        if (b0Var.K == viewPager) {
            b0Var.s(pagerAdapter2, this.f128846a);
        }
    }
}
