package gu0;

import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.views.ScrollingPagerIndicatorView;
import kotlin.jvm.internal.Intrinsics;
import mx0.sb;
import xq0.m;

/* JADX INFO: loaded from: classes19.dex */
public final class f implements sb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f146645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f146646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ScrollingPagerIndicatorView f146647c;
    public RecyclerView d;
    public LinearLayoutManager e;
    public RecyclerView.Adapter f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a f146648g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e f146649h = new e(this);
    public final d i = new d(this);

    public f(int i, int i2) {
        this.f146645a = i;
        this.f146646b = i2;
    }

    @Override // mx0.sb
    public final void a() {
        RecyclerView.Adapter adapter = this.f;
        if (adapter != null) {
            adapter.unregisterAdapterDataObserver(this.i);
        }
        RecyclerView recyclerView = this.d;
        if (recyclerView != null) {
            recyclerView.removeOnScrollListener(this.f146649h);
        }
        a aVar = this.f146648g;
        if (aVar != null) {
            aVar.cancel();
        }
        this.f146648g = null;
        this.e = null;
        this.f = null;
        this.f146647c = null;
        this.d = null;
    }

    @Override // mx0.sb
    public final void b(ScrollingPagerIndicatorView indicator, Object obj2) {
        RecyclerView pager = (RecyclerView) obj2;
        Intrinsics.checkNotNullParameter(indicator, "indicator");
        Intrinsics.checkNotNullParameter(pager, "pager");
        a();
        if (!(pager.getLayoutManager() instanceof LinearLayoutManager)) {
            throw new IllegalStateException("Only LinearLayoutManager is supported");
        }
        if (pager.getAdapter() == null) {
            throw new IllegalStateException("RecyclerView has not Adapter attached");
        }
        this.e = (LinearLayoutManager) pager.getLayoutManager();
        this.d = pager;
        RecyclerView.Adapter adapter = pager.getAdapter();
        this.f = adapter;
        this.f146647c = indicator;
        if (adapter != null) {
            adapter.registerAdapterDataObserver(this.i);
        }
        RecyclerView recyclerView = this.d;
        if (recyclerView != null) {
            recyclerView.addOnScrollListener(this.f146649h);
        }
        c();
        d();
    }

    public final void c() {
        RecyclerView.Adapter adapter = this.f;
        Intrinsics.h(adapter);
        int itemCount = adapter.getItemCount();
        int i = this.f146645a;
        int i2 = itemCount % i == 0 ? itemCount / i : (itemCount / i) + 1;
        ScrollingPagerIndicatorView scrollingPagerIndicatorView = this.f146647c;
        if (scrollingPagerIndicatorView != null) {
            scrollingPagerIndicatorView.setDotCount(i2);
        }
        a aVar = this.f146648g;
        if (aVar != null) {
            aVar.cancel();
        }
        RecyclerView recyclerView = this.d;
        a aVar2 = null;
        if (recyclerView != null) {
            if (!ViewCompat.isLaidOut(recyclerView) || recyclerView.isLayoutRequested()) {
                aVar2 = new a(recyclerView, 1, this);
                recyclerView.addOnLayoutChangeListener(aVar2);
            } else {
                d();
            }
        }
        this.f146648g = aVar2;
    }

    public final void d() {
        RecyclerView.Adapter adapter = this.f;
        if (adapter == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        LinearLayoutManager linearLayoutManager = this.e;
        if (linearLayoutManager == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        int iMin = Math.min(linearLayoutManager.findFirstVisibleItemPosition(), adapter.getItemCount() - 1);
        if (iMin == -1) {
            return;
        }
        int i = this.f146645a;
        int i2 = iMin / i;
        Float fA = m.a(linearLayoutManager, adapter, i, this.f146646b, iMin);
        if (fA != null) {
            float fFloatValue = fA.floatValue();
            ScrollingPagerIndicatorView scrollingPagerIndicatorView = this.f146647c;
            if (scrollingPagerIndicatorView != null) {
                scrollingPagerIndicatorView.K(fFloatValue, i2);
            }
        }
    }
}
