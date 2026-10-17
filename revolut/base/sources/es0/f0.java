package es0;

import androidx.viewpager2.widget.ViewPager2;
import com.revolut.core.ui_kit.views.DraggableTabsView;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class f0 extends ViewPager2.OnPageChangeCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f128829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f128830b;

    public f0(DraggableTabsView tabsView, ViewPager2 viewPager) {
        Intrinsics.checkNotNullParameter(tabsView, "tabsView");
        Intrinsics.checkNotNullParameter(viewPager, "viewPager");
        this.f128829a = new WeakReference(viewPager);
        this.f128830b = new e(tabsView);
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageScrollStateChanged(int i) {
        e eVar = this.f128830b;
        eVar.f128827c = eVar.f128826b;
        eVar.f128826b = i;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageScrolled(int i, float f, int i2) {
        e eVar = this.f128830b;
        int i3 = eVar.f128826b;
        if (i3 == 1 || (eVar.f128827c == 1 && i3 == 2)) {
            ((DraggableTabsView) eVar.d).setScrollPosition(i, f, false, true);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageSelected(int i) {
        e eVar = this.f128830b;
        if (eVar.f128826b == 2) {
            r.b((DraggableTabsView) eVar.d, i, 2);
        }
    }
}
