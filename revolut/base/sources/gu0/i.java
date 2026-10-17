package gu0;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.revolut.core.ui_kit.views.ScrollingPagerIndicatorView;
import kotlin.jvm.internal.Intrinsics;
import mx0.sb;

/* JADX INFO: loaded from: classes19.dex */
public final class i implements sb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ScrollingPagerIndicatorView f146653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewPager2 f146654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RecyclerView.Adapter f146655c;
    public final g d = new g(this);
    public final h e = new h(this);

    @Override // mx0.sb
    public final void a() {
        RecyclerView.Adapter adapter = this.f146655c;
        if (adapter != null) {
            adapter.unregisterAdapterDataObserver(this.d);
        }
        ViewPager2 viewPager2 = this.f146654b;
        if (viewPager2 != null) {
            viewPager2.unregisterOnPageChangeCallback(this.e);
        }
        this.f146653a = null;
        this.f146655c = null;
        this.f146654b = null;
    }

    @Override // mx0.sb
    public final void b(ScrollingPagerIndicatorView indicator, Object obj2) {
        ViewPager2 pager = (ViewPager2) obj2;
        Intrinsics.checkNotNullParameter(indicator, "indicator");
        Intrinsics.checkNotNullParameter(pager, "pager");
        a();
        if (pager.getAdapter() == null) {
            throw new IllegalStateException("ViewPager has not Adapter attached");
        }
        RecyclerView.Adapter adapter = pager.getAdapter();
        this.f146655c = adapter;
        this.f146653a = indicator;
        this.f146654b = pager;
        if (adapter != null) {
            adapter.registerAdapterDataObserver(this.d);
        }
        ViewPager2 viewPager2 = this.f146654b;
        if (viewPager2 != null) {
            viewPager2.registerOnPageChangeCallback(this.e);
        }
        c();
    }

    public final void c() {
        ViewPager2 viewPager2;
        RecyclerView.Adapter adapter;
        ScrollingPagerIndicatorView scrollingPagerIndicatorView = this.f146653a;
        if (scrollingPagerIndicatorView == null || (viewPager2 = this.f146654b) == null || (adapter = this.f146655c) == null) {
            return;
        }
        scrollingPagerIndicatorView.setDotCount(adapter.getItemCount());
        scrollingPagerIndicatorView.setCurrentPosition(viewPager2.getCurrentItem());
    }
}
