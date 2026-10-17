package eoi;

import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: loaded from: classes13.dex */
public final class z extends ViewPager2.OnPageChangeCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b0 f127984a;

    public z(b0 b0Var) {
        this.f127984a = b0Var;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageScrollStateChanged(int i) {
        if (i == 0) {
            this.f127984a.f127913a.invoke();
        }
    }
}
