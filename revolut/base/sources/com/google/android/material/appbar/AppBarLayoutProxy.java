package com.google.android.material.appbar;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.WindowInsetsCompat;
import au0.o;
import com.google.android.material.appbar.AppBarLayout;
import ix0.v0;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ny0.h;
import org.jetbrains.annotations.NotNull;
import z92.f;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001'B\u001d\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u0019\u0010\u0010\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J7\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u00138\u0016X\u0096D¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001dR\u0016\u0010!\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001dR \u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0#0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006("}, d2 = {"Lcom/google/android/material/appbar/AppBarLayoutProxy;", "Lcom/google/android/material/appbar/AppBarLayout;", "Lix0/v0;", "Lny0/h;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "collectViewHierarchy", "()V", "requestLayoutByViewHierarchy", "Landroidx/core/view/WindowInsetsCompat;", "insets", "onWindowInsetChanged", "(Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/view/WindowInsetsCompat;", "onApplyWindowInsets", "", "changed", "", "l", "t", "r", "b", "onLayout", "(ZIIII)V", "fitsReadableArea", "Z", "getFitsReadableArea", "()Z", "created", "fixLayoutOnPreQScheduled", "Ljava/util/LinkedList;", "Ljava/lang/ref/WeakReference;", "Landroid/view/View;", "viewHierarchy", "Ljava/util/LinkedList;", "Behavior", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class AppBarLayoutProxy extends AppBarLayout implements v0, h {
    private boolean created;
    private final boolean fitsReadableArea;
    private boolean fixLayoutOnPreQScheduled;

    @NotNull
    private final LinkedList<WeakReference<View>> viewHierarchy;

    /* JADX INFO: loaded from: classes16.dex */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000f\u0010\u000eJ\u001d\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/google/android/material/appbar/AppBarLayoutProxy$Behavior;", "Lcom/google/android/material/appbar/AppBarLayout$Behavior;", "<init>", "()V", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "parent", "Lcom/google/android/material/appbar/AppBarLayout;", "layout", "", "onFlingFinished", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Lcom/google/android/material/appbar/AppBarLayout;)V", "view", "", "getMaxDragOffset", "(Lcom/google/android/material/appbar/AppBarLayout;)I", "getScrollRangeForDragFling", "Lau0/o;", "appBarLayout", "newOffset", "setHeaderTopBottomOffset", "(Lau0/o;I)V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static class Behavior extends AppBarLayout.Behavior {
        public final void setHeaderTopBottomOffset(@NotNull o appBarLayout, int newOffset) {
            Intrinsics.checkNotNullParameter(appBarLayout, "appBarLayout");
            ViewParent parent = appBarLayout.getParent();
            Intrinsics.i(parent, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout");
            setHeaderTopBottomOffset((CoordinatorLayout) parent, appBarLayout, newOffset);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, com.google.android.material.appbar.HeaderBehavior
        public int getMaxDragOffset(@NotNull AppBarLayout view) {
            Intrinsics.checkNotNullParameter(view, "view");
            o oVar = view instanceof o ? (o) view : null;
            int maxCollapseOffset$ui_kit_components_release = oVar != null ? oVar.getMaxCollapseOffset$ui_kit_components_release() : Integer.MAX_VALUE;
            return maxCollapseOffset$ui_kit_components_release != Integer.MAX_VALUE ? -maxCollapseOffset$ui_kit_components_release : super.getMaxDragOffset(view);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, com.google.android.material.appbar.HeaderBehavior
        public int getScrollRangeForDragFling(@NotNull AppBarLayout view) {
            Intrinsics.checkNotNullParameter(view, "view");
            o oVar = view instanceof o ? (o) view : null;
            int maxCollapseOffset$ui_kit_components_release = oVar != null ? oVar.getMaxCollapseOffset$ui_kit_components_release() : Integer.MAX_VALUE;
            return maxCollapseOffset$ui_kit_components_release != Integer.MAX_VALUE ? maxCollapseOffset$ui_kit_components_release : super.getScrollRangeForDragFling(view);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, com.google.android.material.appbar.HeaderBehavior
        public void onFlingFinished(@NotNull CoordinatorLayout parent, @NotNull AppBarLayout layout) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            Intrinsics.checkNotNullParameter(layout, "layout");
            super.onFlingFinished(parent, layout);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AppBarLayoutProxy(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void collectViewHierarchy() {
        Window window;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Activity activityI = f.i(context);
        View decorView = (activityI == null || (window = activityI.getWindow()) == null) ? null : window.getDecorView();
        if (decorView != null) {
            View view = this;
            while (view != null && !view.equals(decorView)) {
                this.viewHierarchy.add(new WeakReference<>(view));
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onWindowInsetChanged$lambda$1(AppBarLayoutProxy appBarLayoutProxy) {
        Window window;
        Context context = appBarLayoutProxy.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Activity activityI = f.i(context);
        View decorView = (activityI == null || (window = activityI.getWindow()) == null) ? null : window.getDecorView();
        if (decorView == null || !appBarLayoutProxy.isLayoutRequested()) {
            appBarLayoutProxy.fixLayoutOnPreQScheduled = false;
        } else {
            Object parent = appBarLayoutProxy.getParent();
            View view = parent instanceof View ? (View) parent : null;
            while (view != null && !view.equals(decorView)) {
                if (!view.isLayoutRequested()) {
                    view.requestLayout();
                }
                Object parent2 = view.getParent();
                view = parent2 instanceof View ? (View) parent2 : null;
                if (view == null) {
                    appBarLayoutProxy.requestLayoutByViewHierarchy();
                }
            }
        }
        appBarLayoutProxy.viewHierarchy.clear();
    }

    private final void requestLayoutByViewHierarchy() {
        while (this.viewHierarchy.size() > 0) {
            WeakReference<View> weakReferencePoll = this.viewHierarchy.poll();
            View view = weakReferencePoll != null ? weakReferencePoll.get() : null;
            if (view != null && !view.isLayoutRequested()) {
                view.requestLayout();
            }
        }
    }

    @Override // ny0.h
    /* JADX INFO: renamed from: getFitsReadableArea, reason: from getter */
    public boolean getF51506a() {
        return this.fitsReadableArea;
    }

    @Override // ix0.v0
    public /* bridge */ boolean getInsetsAdjustable() {
        return true;
    }

    @NotNull
    public WindowInsetsCompat onApplyWindowInsets(@NotNull WindowInsetsCompat insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        return insets;
    }

    @Override // com.google.android.material.appbar.AppBarLayout, android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int l2, int t2, int r2, int b4) {
        this.fixLayoutOnPreQScheduled = false;
        this.viewHierarchy.clear();
        super.onLayout(changed, l2, t2, r2, b4);
    }

    @Override // com.google.android.material.appbar.AppBarLayout
    @NotNull
    public final WindowInsetsCompat onWindowInsetChanged(WindowInsetsCompat insets) {
        boolean zIsLayoutRequested = isLayoutRequested();
        WindowInsetsCompat windowInsetsCompatOnWindowInsetChanged = super.onWindowInsetChanged(insets != null ? onApplyWindowInsets(insets) : null);
        if (Build.VERSION.SDK_INT <= 28 && !zIsLayoutRequested && isLayoutRequested() && !this.fixLayoutOnPreQScheduled) {
            this.fixLayoutOnPreQScheduled = true;
            collectViewHierarchy();
            post(new a0.a(this, 12));
        }
        Intrinsics.h(windowInsetsCompatOnWindowInsetChanged);
        return windowInsetsCompatOnWindowInsetChanged;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBarLayoutProxy(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.created = true;
        this.viewHierarchy = new LinkedList<>();
    }

    public /* synthetic */ AppBarLayoutProxy(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
