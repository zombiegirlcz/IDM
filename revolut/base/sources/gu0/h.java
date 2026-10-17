package gu0;

import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: loaded from: classes19.dex */
public final class h extends ViewPager2.OnPageChangeCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f146651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f146652b;

    public h(i iVar) {
        this.f146652b = iVar;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageScrollStateChanged(int i) {
        this.f146651a = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0005 A[PHI: r4
      0x0005: PHI (r4v5 float) = (r4v1 float), (r4v2 float) binds: [B:3:0x0003, B:6:0x000b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPageScrolled(int r2, float r3, int r4) {
        /*
            r1 = this;
            r4 = 0
            int r0 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r0 >= 0) goto L7
        L5:
            r3 = r4
            goto Le
        L7:
            r4 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r0 <= 0) goto Le
            goto L5
        Le:
            gu0.i r4 = r1.f146652b
            com.revolut.core.ui_kit.views.ScrollingPagerIndicatorView r4 = r4.f146653a
            if (r4 == 0) goto L17
            r4.K(r3, r2)
        L17:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gu0.h.onPageScrolled(int, float, int):void");
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageSelected(int i) {
        if (this.f146651a == 0) {
            this.f146652b.c();
        }
    }
}
