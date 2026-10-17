package au0;

import androidx.viewpager2.widget.ViewPager2;
import com.revolut.core.ui_kit.internal.views.navbar.HeaderWithBigTileLayout;

/* JADX INFO: loaded from: classes19.dex */
public final class i1 extends ViewPager2.OnPageChangeCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HeaderWithBigTileLayout f9231a;

    public i1(HeaderWithBigTileLayout headerWithBigTileLayout) {
        this.f9231a = headerWithBigTileLayout;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageScrollStateChanged(int i) {
        boolean z = i == 1;
        HeaderWithBigTileLayout headerWithBigTileLayout = this.f9231a;
        if (z != headerWithBigTileLayout.l0) {
            headerWithBigTileLayout.l0 = z;
            headerWithBigTileLayout.j0();
            headerWithBigTileLayout.o0();
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageSelected(int i) {
        HeaderWithBigTileLayout headerWithBigTileLayout = this.f9231a;
        headerWithBigTileLayout.f57281s.onNext(Integer.valueOf(i));
        headerWithBigTileLayout.n0((u0) zhm.d0.e0(i, headerWithBigTileLayout.f57287x));
        headerWithBigTileLayout.p0();
        headerWithBigTileLayout.l0();
    }
}
