package ali;

import androidx.viewpager2.widget.ViewPager2;
import com.revolut.kompot.navigable.vc.pager.PagerItem;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends ViewPager2.OnPageChangeCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f6272a;

    public d(f fVar) {
        this.f6272a = fVar;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageScrollStateChanged(int i) {
        this.f6272a.f = i != 0;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageSelected(int i) {
        f fVar = this.f6272a;
        PagerItem pagerItem = (PagerItem) fVar.d.getCurrentList().get(i);
        fVar.f6277g = pagerItem.getF70838b();
        fVar.f6274a.Q1(pagerItem);
    }
}
