package com.revolut.core.ui_kit.views.navbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.appbar.AppBarLayout;
import com.revolut.core.ui_kit.R$dimen;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tx0.e2;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0002\t\nB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/revolut/core/ui_kit/views/navbar/NavBarOverlappingScrollingViewBehavior;", "Lcom/revolut/core/ui_kit/views/navbar/NavBarScrollingViewBehavior;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Companion", "tx0/e2", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NavBarOverlappingScrollingViewBehavior extends NavBarScrollingViewBehavior {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public RecyclerView f59315j;
    public AppBarLayout k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final as0.a f59316l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f59317m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Context f59318n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavBarOverlappingScrollingViewBehavior(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        as0.a aVar = new as0.a();
        aVar.f8736b = 0;
        this.f59316l = aVar;
        this.f59317m = -1;
        this.f59318n = context;
    }

    @Override // com.revolut.core.ui_kit.views.navbar.NavBarScrollingViewBehavior
    public final int a(View parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        int iA = super.a(parent);
        return this.f59317m == 1 ? h(this.k) + iA : iA;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int h(View view) {
        e2 e2Var = view instanceof e2 ? (e2) view : null;
        if (e2Var == null) {
            return this.f59318n.getResources().getDimensionPixelSize(R$dimen.internal_nav_bar_with_container_content_overlap);
        }
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return e2Var.a(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i(AppBarLayout appBarLayout) {
        int i = -1;
        int overlapMode = !(appBarLayout instanceof e2) ? -1 : ((e2) appBarLayout).getOverlapMode();
        if (this.f59317m == overlapMode) {
            return;
        }
        this.f59317m = overlapMode;
        int iH = h(appBarLayout);
        int i2 = 0;
        if (overlapMode != -1) {
            if (overlapMode == 0) {
                i2 = (iH * 3) / 2;
                i = i2 - iH;
            } else {
                if (overlapMode != 1) {
                    throw new IllegalStateException(a0.d.n("Unknown overlap mode ", overlapMode));
                }
                i = 0;
            }
        }
        setOverlayTop(i2);
        as0.a aVar = this.f59316l;
        if (aVar.f8736b != i) {
            aVar.f8736b = i;
            RecyclerView recyclerView = this.f59315j;
            if (recyclerView != null) {
                recyclerView.invalidateItemDecorations();
            }
        }
    }

    @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onDependentViewChanged(CoordinatorLayout parent, View child, View dependency) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(dependency, "dependency");
        i(dependency instanceof AppBarLayout ? (AppBarLayout) dependency : null);
        return super.onDependentViewChanged(parent, child, dependency);
    }

    @Override // com.revolut.core.ui_kit.views.navbar.NavBarScrollingViewBehavior, com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, com.google.android.material.appbar.ViewOffsetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onLayoutChild(CoordinatorLayout parent, View child, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        RecyclerView recyclerView = null;
        RecyclerView recyclerView2 = child instanceof RecyclerView ? (RecyclerView) child : null;
        if (recyclerView2 != null) {
            int itemDecorationCount = recyclerView2.getItemDecorationCount();
            int i2 = 0;
            while (true) {
                if (i2 >= itemDecorationCount) {
                    break;
                }
                RecyclerView.ItemDecoration itemDecorationAt = recyclerView2.getItemDecorationAt(i2);
                Intrinsics.checkNotNullExpressionValue(itemDecorationAt, "getItemDecorationAt(...)");
                boolean z = itemDecorationAt instanceof o31.b;
                as0.a aVar = this.f59316l;
                if (z) {
                    recyclerView2.removeItemDecorationAt(i2);
                    recyclerView2.addItemDecoration(aVar);
                    break;
                }
                if (Intrinsics.f(itemDecorationAt, aVar)) {
                    break;
                }
                i2++;
            }
            recyclerView = recyclerView2;
        }
        this.f59315j = recyclerView;
        if (this.f59317m == 0 && !child.hasTransientState()) {
            AppBarLayout appBarLayout = this.k;
            child.setTranslationY((appBarLayout == null || appBarLayout.getTotalScrollRange() != 0) ? BitmapDescriptorFactory.HUE_RED : -getOverlayTop());
        }
        return super.onLayoutChild(parent, child, i);
    }

    @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, com.google.android.material.appbar.HeaderScrollingViewBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onMeasureChild(CoordinatorLayout parent, View child, int i, int i2, int i3, int i5) {
        AppBarLayout appBarLayout;
        int totalScrollRange;
        WindowInsetsCompat lastWindowInsets;
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        List<View> dependencies = parent.getDependencies(child);
        Intrinsics.checkNotNullExpressionValue(dependencies, "getDependencies(...)");
        int size = dependencies.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size) {
                appBarLayout = null;
                break;
            }
            View view = dependencies.get(i6);
            if (view instanceof AppBarLayout) {
                appBarLayout = (AppBarLayout) view;
                break;
            }
            i6++;
        }
        AppBarLayout appBarLayout2 = appBarLayout != null ? appBarLayout : null;
        this.k = appBarLayout2;
        i(appBarLayout2);
        if (this.f59317m != 1) {
            return super.onMeasureChild(parent, child, i, i2, i3, i5);
        }
        int i21 = child.getLayoutParams().height;
        if ((i21 != -2 && i21 != -1) || appBarLayout == null) {
            return false;
        }
        int size2 = View.MeasureSpec.getSize(i3);
        if (size2 <= 0) {
            size2 = parent.getHeight();
        } else if (ViewCompat.getFitsSystemWindows(appBarLayout) && (lastWindowInsets = parent.getLastWindowInsets()) != null) {
            size2 += lastWindowInsets.getSystemWindowInsetBottom() + lastWindowInsets.getSystemWindowInsetTop();
        }
        if (appBarLayout instanceof au0.o) {
            au0.o oVar = (au0.o) appBarLayout;
            totalScrollRange = Math.min(oVar.getTotalScrollRange(), oVar.getMaxCollapseOffset$ui_kit_components_release());
        } else {
            totalScrollRange = appBarLayout.getTotalScrollRange();
        }
        int i22 = size2 + totalScrollRange;
        float f = -h(appBarLayout);
        if (!child.hasTransientState()) {
            child.setTranslationY(f);
        }
        parent.onMeasureChild(child, i, i2, View.MeasureSpec.makeMeasureSpec(i22 - (appBarLayout.getMeasuredHeight() + ((int) f)), i21 == -1 ? 1073741824 : Integer.MIN_VALUE), i5);
        return true;
    }

    @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
    public final boolean shouldHeaderOverlapScrollingChild() {
        return this.f59317m == 1;
    }
}
