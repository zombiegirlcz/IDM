package gu0;

import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.views.ScrollingPagerIndicatorView;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.Intrinsics;
import mx0.sb;

/* JADX INFO: loaded from: classes19.dex */
public final class c implements sb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f146639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f146640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ScrollingPagerIndicatorView f146641c;
    public RecyclerView d;
    public LinearLayoutManager e;
    public a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f146642g;

    public c(int i, int i2) {
        this.f146639a = i;
        this.f146640b = i2;
        if (i2 != 1) {
            throw new IllegalArgumentException(a0.d.n("LoopingScrollerPagerIndicatorAttacher only supports itemsOnScreen == 1, got ", i2).toString());
        }
        this.f146642g = new b(this);
    }

    @Override // mx0.sb
    public final void a() {
        RecyclerView recyclerView = this.d;
        if (recyclerView != null) {
            recyclerView.removeOnScrollListener(this.f146642g);
        }
        a aVar = this.f;
        if (aVar != null) {
            aVar.cancel();
        }
        this.f = null;
        this.e = null;
        this.f146641c = null;
        this.d = null;
    }

    @Override // mx0.sb
    public final void b(ScrollingPagerIndicatorView indicator, Object obj2) throws ExecutionException, InterruptedException {
        RecyclerView pager = (RecyclerView) obj2;
        Intrinsics.checkNotNullParameter(indicator, "indicator");
        Intrinsics.checkNotNullParameter(pager, "pager");
        a();
        if (!(pager.getLayoutManager() instanceof LinearLayoutManager)) {
            throw new IllegalStateException("Only LinearLayoutManager is supported");
        }
        if (pager.getAdapter() == null) {
            throw new IllegalStateException("RecyclerView has no adapter attached");
        }
        RecyclerView.LayoutManager layoutManager = pager.getLayoutManager();
        Intrinsics.i(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        this.e = (LinearLayoutManager) layoutManager;
        this.d = pager;
        this.f146641c = indicator;
        pager.addOnScrollListener(this.f146642g);
        int f = indicator.getF();
        int i = this.f146639a;
        indicator.setLooped(i > f);
        indicator.setDotCount(i);
        RecyclerView recyclerView = this.d;
        a aVar = null;
        if (recyclerView != null) {
            if (!ViewCompat.isLaidOut(recyclerView) || recyclerView.isLayoutRequested()) {
                aVar = new a(recyclerView, 0, this);
                recyclerView.addOnLayoutChangeListener(aVar);
            } else {
                c();
            }
        }
        this.f = aVar;
        c();
    }

    public final void c() {
        LinearLayoutManager linearLayoutManager;
        ScrollingPagerIndicatorView scrollingPagerIndicatorView;
        RecyclerView recyclerView;
        int i = this.f146639a;
        if (i <= 0 || (linearLayoutManager = this.e) == null || (scrollingPagerIndicatorView = this.f146641c) == null || (recyclerView = this.d) == null) {
            return;
        }
        float width = recyclerView.getWidth() / 2.0f;
        int childCount = linearLayoutManager.getChildCount();
        float f = Float.MAX_VALUE;
        int position = -1;
        View view = null;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = linearLayoutManager.getChildAt(i2);
            if (childAt != null) {
                float fAbs = Math.abs(((childAt.getRight() + childAt.getLeft()) / 2.0f) - width);
                if (fAbs < f) {
                    position = linearLayoutManager.getPosition(childAt);
                    view = childAt;
                    f = fAbs;
                }
            }
        }
        if (view == null || position == -1) {
            return;
        }
        Integer numValueOf = Integer.valueOf(view.getWidth());
        Integer num = numValueOf.intValue() > 0 ? numValueOf : null;
        if (num != null) {
            int iIntValue = num.intValue();
            float right = ((view.getRight() + view.getLeft()) / 2.0f) - width;
            int i3 = (position / this.f146640b) % i;
            if (right < BitmapDescriptorFactory.HUE_RED) {
                int i5 = (i3 + 1) % i;
                float f4 = kotlin.ranges.f.f((-right) / iIntValue, BitmapDescriptorFactory.HUE_RED, 1.0f);
                if (i5 > i3) {
                    scrollingPagerIndicatorView.K(f4, i3);
                    return;
                } else {
                    scrollingPagerIndicatorView.e(f4, i3, i5);
                    return;
                }
            }
            if (right <= BitmapDescriptorFactory.HUE_RED) {
                scrollingPagerIndicatorView.setCurrentPosition(i3);
                return;
            }
            int i6 = ((i3 - 1) + i) % i;
            float f5 = kotlin.ranges.f.f(1.0f - (right / iIntValue), BitmapDescriptorFactory.HUE_RED, 1.0f);
            if (i6 < i3) {
                scrollingPagerIndicatorView.K(f5, i6);
            } else {
                scrollingPagerIndicatorView.e(1.0f - f5, i3, i6);
            }
        }
    }
}
