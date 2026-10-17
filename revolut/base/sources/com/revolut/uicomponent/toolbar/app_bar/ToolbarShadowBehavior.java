package com.revolut.uicomponent.toolbar.app_bar;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Keep;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ScrollingView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.appbar.AppBarLayout;
import com.revolut.core.ui_kit.views.WebView;
import com.revolut.uicomponent.R$dimen;
import com.revolut.uicomponent.R$styleable;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mx0.jd;
import nkm.u;
import nkm.y;
import org.jetbrains.annotations.NotNull;
import zhm.d0;

/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0005*\u0002 %\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ \u0010'\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00022\u0006\u0010+\u001a\u00020,H\u0016J\u0018\u0010-\u001a\u0004\u0018\u00010\u00122\f\u0010.\u001a\b\u0012\u0004\u0012\u00020,0/H\u0002J\u0012\u00100\u001a\u0004\u0018\u00010\u00152\u0006\u0010(\u001a\u000201H\u0002J \u00102\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00022\u0006\u00103\u001a\u00020\nH\u0016J \u00104\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00022\u0006\u0010+\u001a\u00020,H\u0016J8\u00105\u001a\u00020\u001a2\u0006\u00106\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00022\u0006\u00107\u001a\u00020,2\u0006\u00108\u001a\u00020,2\u0006\u00109\u001a\u00020\n2\u0006\u0010:\u001a\u00020\nH\u0016JH\u0010;\u001a\u00020<2\u0006\u00106\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00022\u0006\u00108\u001a\u00020,2\u0006\u0010=\u001a\u00020\n2\u0006\u0010>\u001a\u00020\n2\u0006\u0010?\u001a\u00020\n2\u0006\u0010@\u001a\u00020\n2\u0006\u0010:\u001a\u00020\nH\u0016J(\u0010A\u001a\u00020<2\u0006\u00106\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00022\u0006\u00108\u001a\u00020,2\u0006\u0010:\u001a\u00020\nH\u0016J8\u0010B\u001a\u00020\u001a2\u0006\u00106\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00022\u0006\u00108\u001a\u00020,2\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020D2\u0006\u0010F\u001a\u00020\u001aH\u0016J\u001a\u0010G\u001a\u00020<2\b\u00108\u001a\u0004\u0018\u00010\u00152\u0006\u0010*\u001a\u00020\u0002H\u0002J\u0018\u0010H\u001a\u00020<2\u0006\u00108\u001a\u00020\u00152\u0006\u0010*\u001a\u00020\u0002H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0010\u0010\u001f\u001a\u00020 X\u0082\u0004¢\u0006\u0004\n\u0002\u0010!R\u000e\u0010\"\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u00020%X\u0082\u0004¢\u0006\u0004\n\u0002\u0010&¨\u0006I"}, d2 = {"Lcom/revolut/uicomponent/toolbar/app_bar/ToolbarShadowBehavior;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;", "Lcom/revolut/uicomponent/toolbar/app_bar/ToolbarShadow;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "dependencyId", "", "scrollViewId", "scrollMaxHeight", "getScrollMaxHeight", "()I", "scrollMaxHeight$delegate", "Lkotlin/Lazy;", "revolutToolbar", "Lcom/revolut/uicomponent/toolbar/app_bar/BaseToolbar;", "pendingFlingTarget", "Ljava/lang/ref/WeakReference;", "Landroidx/core/view/ScrollingView;", "pendingFlingChild", "updateViewAction", "Ljava/lang/Runnable;", "disabled", "", "getDisabled", "()Z", "setDisabled", "(Z)V", "onScrollListener", "com/revolut/uicomponent/toolbar/app_bar/ToolbarShadowBehavior$onScrollListener$1", "Lcom/revolut/uicomponent/toolbar/app_bar/ToolbarShadowBehavior$onScrollListener$1;", "nestedScrollViewListener", "Landroidx/core/widget/NestedScrollView$OnScrollChangeListener;", "onScrollChangedCallback", "com/revolut/uicomponent/toolbar/app_bar/ToolbarShadowBehavior$onScrollChangedCallback$1", "Lcom/revolut/uicomponent/toolbar/app_bar/ToolbarShadowBehavior$onScrollChangedCallback$1;", "layoutDependsOn", "parent", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "child", "dependency", "Landroid/view/View;", "findToolbar", "views", "", "findScrollingView", "Landroid/view/ViewGroup;", "onLayoutChild", "layoutDirection", "onDependentViewChanged", "onStartNestedScroll", "coordinatorLayout", "directTargetChild", "target", "axes", "type", "onNestedScroll", "", "dxConsumed", "dyConsumed", "dxUnconsumed", "dyUnconsumed", "onStopNestedScroll", "onNestedFling", "velocityX", "", "velocityY", "consumed", "setupScrollListeners", "updateView", "core_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ToolbarShadowBehavior extends CoordinatorLayout.Behavior<ToolbarShadow> {
    private final int dependencyId;
    private boolean disabled;

    @NotNull
    private final NestedScrollView.OnScrollChangeListener nestedScrollViewListener;

    @NotNull
    private final ToolbarShadowBehavior$onScrollChangedCallback$1 onScrollChangedCallback;

    @NotNull
    private final ToolbarShadowBehavior$onScrollListener$1 onScrollListener;

    @NotNull
    private WeakReference<ToolbarShadow> pendingFlingChild;

    @NotNull
    private WeakReference<ScrollingView> pendingFlingTarget;
    private BaseToolbar revolutToolbar;

    /* JADX INFO: renamed from: scrollMaxHeight$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy scrollMaxHeight;
    private final int scrollViewId;
    private Runnable updateViewAction;

    /* JADX WARN: Multi-variable type inference failed */
    public ToolbarShadowBehavior(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final ScrollingView findScrollingView(ViewGroup parent) {
        ScrollingView scrollingViewFindScrollingView;
        int childCount = parent.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = parent.getChildAt(i);
            if ((childAt instanceof ScrollingView) && (this.scrollViewId == -1 || childAt.getId() == this.scrollViewId)) {
                return (ScrollingView) childAt;
            }
            if ((childAt instanceof ViewGroup) && (scrollingViewFindScrollingView = findScrollingView((ViewGroup) childAt)) != null) {
                return scrollingViewFindScrollingView;
            }
        }
        return null;
    }

    private final BaseToolbar findToolbar(List<? extends View> views) {
        AppBarLayout appBarLayout = (AppBarLayout) y.r(u.i(d0.Q(views), AppBarLayout.class));
        if (appBarLayout != null) {
            return (BaseToolbar) y.r(u.i(d0.Q(cp5.c.z(appBarLayout)), BaseToolbar.class));
        }
        return null;
    }

    private final int getScrollMaxHeight() {
        return ((Number) this.scrollMaxHeight.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nestedScrollViewListener$lambda$0(ToolbarShadowBehavior toolbarShadowBehavior, NestedScrollView nestedScrollView, int i, int i2, int i3, int i5) {
        ToolbarShadow toolbarShadow;
        ScrollingView scrollingView;
        Intrinsics.checkNotNullParameter(nestedScrollView, "<unused var>");
        if (i2 != 0 || (toolbarShadow = toolbarShadowBehavior.pendingFlingChild.get()) == null || (scrollingView = toolbarShadowBehavior.pendingFlingTarget.get()) == null) {
            return;
        }
        toolbarShadowBehavior.updateView(scrollingView, toolbarShadow);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int scrollMaxHeight_delegate$lambda$0(Context context) {
        Resources resources;
        return 4 * ((context == null || (resources = context.getResources()) == null) ? 0 : resources.getDimensionPixelSize(R$dimen.toolbar_shadow_height));
    }

    private final void setupScrollListeners(ScrollingView target, ToolbarShadow child) {
        if (target instanceof RecyclerView) {
            this.pendingFlingChild = new WeakReference<>(child);
            this.pendingFlingTarget = new WeakReference<>(target);
            RecyclerView recyclerView = (RecyclerView) target;
            recyclerView.removeOnScrollListener(this.onScrollListener);
            recyclerView.addOnScrollListener(this.onScrollListener);
            return;
        }
        if (target instanceof NestedScrollView) {
            this.pendingFlingChild = new WeakReference<>(child);
            this.pendingFlingTarget = new WeakReference<>(target);
            ((NestedScrollView) target).setOnScrollChangeListener(this.nestedScrollViewListener);
        } else {
            if (!(target instanceof WebView)) {
                int i = jli.h.f175850a;
                return;
            }
            this.pendingFlingChild = new WeakReference<>(child);
            this.pendingFlingTarget = new WeakReference<>(target);
            ToolbarShadowBehavior$onScrollChangedCallback$1 onScrollChangedCallback = this.onScrollChangedCallback;
            Intrinsics.checkNotNullParameter(onScrollChangedCallback, "onScrollChangedCallback");
            ((WebView) target).f58930b.add(onScrollChangedCallback);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateView(ScrollingView target, ToolbarShadow child) {
        float scrollMaxHeight;
        if (this.disabled) {
            scrollMaxHeight = BitmapDescriptorFactory.HUE_RED;
        } else {
            int iComputeVerticalScrollOffset = target.computeVerticalScrollOffset();
            if (iComputeVerticalScrollOffset > getScrollMaxHeight()) {
                iComputeVerticalScrollOffset = getScrollMaxHeight();
            }
            scrollMaxHeight = iComputeVerticalScrollOffset / getScrollMaxHeight();
        }
        child.setAlpha(scrollMaxHeight);
        BaseToolbar baseToolbar = this.revolutToolbar;
        if (baseToolbar != null) {
            baseToolbar.setUnderlineAlpha(Math.abs(1.0f - scrollMaxHeight));
        }
    }

    public final boolean getDisabled() {
        return this.disabled;
    }

    public final void setDisabled(boolean z) {
        this.disabled = z;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.revolut.uicomponent.toolbar.app_bar.ToolbarShadowBehavior$onScrollListener$1] */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.revolut.uicomponent.toolbar.app_bar.ToolbarShadowBehavior$onScrollChangedCallback$1] */
    public ToolbarShadowBehavior(final Context context, AttributeSet attributeSet) {
        int resourceId;
        super(context, attributeSet);
        this.scrollMaxHeight = yhm.j.b(new Function0() { // from class: com.revolut.uicomponent.toolbar.app_bar.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(ToolbarShadowBehavior.scrollMaxHeight_delegate$lambda$0(context));
            }
        });
        this.pendingFlingTarget = new WeakReference<>(null);
        this.pendingFlingChild = new WeakReference<>(null);
        this.onScrollListener = new RecyclerView.OnScrollListener() { // from class: com.revolut.uicomponent.toolbar.app_bar.ToolbarShadowBehavior$onScrollListener$1
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int dx9, int dy10) {
                ScrollingView scrollingView;
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                super.onScrolled(recyclerView, dx9, dy10);
                ToolbarShadow toolbarShadow = (ToolbarShadow) this.this$0.pendingFlingChild.get();
                if (toolbarShadow == null || (scrollingView = (ScrollingView) this.this$0.pendingFlingTarget.get()) == null) {
                    return;
                }
                this.this$0.updateView(scrollingView, toolbarShadow);
            }
        };
        this.nestedScrollViewListener = new c(this);
        this.onScrollChangedCallback = new jd() { // from class: com.revolut.uicomponent.toolbar.app_bar.ToolbarShadowBehavior$onScrollChangedCallback$1
            @Override // mx0.jd
            public void onScroll(int l2, int t2, int oldl, int oldt) {
                ScrollingView scrollingView;
                ToolbarShadow toolbarShadow = (ToolbarShadow) this.this$0.pendingFlingChild.get();
                if (toolbarShadow == null || (scrollingView = (ScrollingView) this.this$0.pendingFlingTarget.get()) == null) {
                    return;
                }
                this.this$0.updateView(scrollingView, toolbarShadow);
            }
        };
        TypedArray typedArrayObtainStyledAttributes = context != null ? context.obtainStyledAttributes(attributeSet, R$styleable.ToolbarShadowBehaviour) : null;
        if (typedArrayObtainStyledAttributes != null) {
            try {
                resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.ToolbarShadowBehaviour_tbs_dependency, -1);
            } catch (Throwable th10) {
                if (typedArrayObtainStyledAttributes != null) {
                    typedArrayObtainStyledAttributes.recycle();
                }
                throw th10;
            }
        } else {
            resourceId = -1;
        }
        this.dependencyId = resourceId;
        this.scrollViewId = typedArrayObtainStyledAttributes != null ? typedArrayObtainStyledAttributes.getResourceId(R$styleable.ToolbarShadowBehaviour_tbs_scroll_view_id, -1) : -1;
        if (typedArrayObtainStyledAttributes != null) {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean layoutDependsOn(@NotNull CoordinatorLayout parent, @NotNull ToolbarShadow child, @NotNull View dependency) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(dependency, "dependency");
        return this.dependencyId == -1 ? dependency instanceof AppBarLayout : dependency.getId() == this.dependencyId;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onDependentViewChanged(@NotNull CoordinatorLayout parent, @NotNull ToolbarShadow child, @NotNull View dependency) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(dependency, "dependency");
        float bottom = dependency.getBottom();
        ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
        child.setY(bottom + ((layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null) != null ? r1.topMargin : 0));
        return super.onDependentViewChanged(parent, child, dependency);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(@NotNull CoordinatorLayout parent, @NotNull ToolbarShadow child, int layoutDirection) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        if (this.revolutToolbar == null) {
            List<? extends View> dependencies = parent.getDependencies(child);
            Intrinsics.checkNotNullExpressionValue(dependencies, "getDependencies(...)");
            this.revolutToolbar = findToolbar(dependencies);
        }
        ScrollingView scrollingViewFindScrollingView = findScrollingView(parent);
        setupScrollListeners(scrollingViewFindScrollingView, child);
        if (scrollingViewFindScrollingView instanceof View) {
            View view = (View) scrollingViewFindScrollingView;
            view.removeCallbacks(this.updateViewAction);
            b0.d dVar = new b0.d(this, 4, scrollingViewFindScrollingView, child);
            this.updateViewAction = dVar;
            view.postDelayed(dVar, 100L);
        }
        return super.onLayoutChild(parent, child, layoutDirection);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onNestedFling(@NotNull CoordinatorLayout coordinatorLayout, @NotNull ToolbarShadow child, @NotNull View target, float velocityX, float velocityY, boolean consumed) {
        Intrinsics.checkNotNullParameter(coordinatorLayout, "coordinatorLayout");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(target, "target");
        boolean z = target instanceof ScrollingView;
        if (z) {
            ScrollingView scrollingView = (ScrollingView) target;
            updateView(scrollingView, child);
            consumed = velocityY > BitmapDescriptorFactory.HUE_RED || scrollingView.computeVerticalScrollOffset() > 0;
        }
        boolean z3 = consumed;
        if (z) {
            setupScrollListeners((ScrollingView) target, child);
        }
        return super.onNestedFling(coordinatorLayout, child, target, velocityX, velocityY, z3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedScroll(@NotNull CoordinatorLayout coordinatorLayout, @NotNull ToolbarShadow child, @NotNull View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type) {
        Intrinsics.checkNotNullParameter(coordinatorLayout, "coordinatorLayout");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(target, "target");
        super.onNestedScroll(coordinatorLayout, child, target, dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, type);
        if ((target instanceof ScrollingView) && type == 0) {
            updateView((ScrollingView) target, child);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(@NotNull CoordinatorLayout coordinatorLayout, @NotNull ToolbarShadow child, @NotNull View directTargetChild, @NotNull View target, int axes, int type) {
        Intrinsics.checkNotNullParameter(coordinatorLayout, "coordinatorLayout");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(directTargetChild, "directTargetChild");
        Intrinsics.checkNotNullParameter(target, "target");
        if (type == 0) {
            return (target instanceof NestedScrollView) || (target instanceof RecyclerView);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onStopNestedScroll(@NotNull CoordinatorLayout coordinatorLayout, @NotNull ToolbarShadow child, @NotNull View target, int type) {
        Intrinsics.checkNotNullParameter(coordinatorLayout, "coordinatorLayout");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(target, "target");
        super.onStopNestedScroll(coordinatorLayout, child, target, type);
        if ((target instanceof ScrollingView) && type == 0 && target.isAttachedToWindow()) {
            updateView((ScrollingView) target, child);
        }
    }

    public /* synthetic */ ToolbarShadowBehavior(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
