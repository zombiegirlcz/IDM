package com.revolut.uicomponent.toolbar.app_bar;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes12.dex */
public final class RevolutButtonScrollBehavior extends CoordinatorLayout.Behavior<View> {
    private int[] buttonCoordinates;
    private Rect buttonRect;
    private Handler handler;
    private int[] intersectCoordinates;
    private boolean moving;
    private View.OnTouchListener touchListener;
    private WeakReference<ViewGroup> viewContainer;

    public RevolutButtonScrollBehavior() {
        this.viewContainer = new WeakReference<>(null);
        this.buttonRect = new Rect();
        this.handler = new Handler();
        this.intersectCoordinates = new int[2];
        this.buttonCoordinates = new int[2];
    }

    private NestedScrollView getScrollView(CoordinatorLayout coordinatorLayout, View view) {
        for (View view2 : coordinatorLayout.getDependencies(view)) {
            if (view2 instanceof NestedScrollView) {
                return (NestedScrollView) view2;
            }
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                if (viewGroup.getChildCount() > 0 && (viewGroup.getChildAt(0) instanceof NestedScrollView)) {
                    return (NestedScrollView) viewGroup.getChildAt(0);
                }
            }
        }
        return null;
    }

    private View getView(@NonNull ViewGroup viewGroup, @NonNull Rect rect) {
        Rect rect2 = new Rect();
        int childCount = viewGroup.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                return null;
            }
            View childAt = viewGroup.getChildAt(childCount);
            View view = childAt instanceof ViewGroup ? getView((ViewGroup) childAt, rect) : null;
            if (view != null) {
                return view;
            }
            childAt.getGlobalVisibleRect(rect2);
            if (Rect.intersects(rect2, rect) && childAt.isFocused()) {
                return childAt;
            }
        }
    }

    private void handleButton(CoordinatorLayout coordinatorLayout, View view) {
        NestedScrollView scrollView;
        setUpTouchListener(coordinatorLayout, view);
        ViewGroup viewGroup = this.viewContainer.get();
        if (viewGroup == null || (scrollView = getScrollView(coordinatorLayout, view)) == null) {
            return;
        }
        view.getGlobalVisibleRect(this.buttonRect);
        View view2 = getView(viewGroup, this.buttonRect);
        if (view2 == null) {
            return;
        }
        view2.getLocationOnScreen(this.intersectCoordinates);
        view.getLocationOnScreen(this.buttonCoordinates);
        postScroll(scrollView, Math.abs((view2.getHeight() + this.intersectCoordinates[1]) - this.buttonCoordinates[1]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$setUpTouchListener$0(CoordinatorLayout coordinatorLayout, View view, View view2, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            this.moving = false;
            handleButton(coordinatorLayout, view);
        } else if (motionEvent.getAction() == 2) {
            this.moving = true;
        }
        return false;
    }

    private void postScroll(NestedScrollView nestedScrollView, int i) {
        if (this.moving) {
            return;
        }
        this.handler.removeCallbacksAndMessages(null);
        this.handler.postDelayed(new com.google.android.material.sidesheet.b(nestedScrollView, i, 3), 50L);
    }

    private void setUpTouchListener(CoordinatorLayout coordinatorLayout, View view) {
        NestedScrollView scrollView;
        if (this.touchListener != null || (scrollView = getScrollView(coordinatorLayout, view)) == null) {
            return;
        }
        a aVar = new a(this, 0, coordinatorLayout, view);
        this.touchListener = aVar;
        scrollView.setOnTouchListener(aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean layoutDependsOn(androidx.coordinatorlayout.widget.CoordinatorLayout r2, android.view.View r3, android.view.View r4) {
        /*
            r1 = this;
            boolean r2 = r4 instanceof androidx.core.widget.NestedScrollView
            r3 = 0
            if (r2 == 0) goto L8
            androidx.core.widget.NestedScrollView r4 = (androidx.core.widget.NestedScrollView) r4
            goto L25
        L8:
            boolean r2 = r4 instanceof android.view.ViewGroup
            if (r2 == 0) goto L24
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            int r2 = r4.getChildCount()
            if (r2 <= 0) goto L24
            android.view.View r2 = r4.getChildAt(r3)
            boolean r2 = r2 instanceof androidx.core.widget.NestedScrollView
            if (r2 == 0) goto L24
            android.view.View r2 = r4.getChildAt(r3)
            r4 = r2
            androidx.core.widget.NestedScrollView r4 = (androidx.core.widget.NestedScrollView) r4
            goto L25
        L24:
            r4 = 0
        L25:
            if (r4 == 0) goto L44
        L27:
            int r2 = r4.getChildCount()
            if (r3 >= r2) goto L42
            android.view.View r2 = r4.getChildAt(r3)
            boolean r0 = r2 instanceof android.view.ViewGroup
            if (r0 == 0) goto L3f
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r3.<init>(r2)
            r1.viewContainer = r3
            goto L42
        L3f:
            int r3 = r3 + 1
            goto L27
        L42:
            r2 = 1
            return r2
        L44:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.uicomponent.toolbar.app_bar.RevolutButtonScrollBehavior.layoutDependsOn(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View):boolean");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
        handleButton(coordinatorLayout, view);
        return super.onDependentViewChanged(coordinatorLayout, view, view2);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onRequestChildRectangleOnScreen(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
        handleButton(coordinatorLayout, view);
        return super.onRequestChildRectangleOnScreen(coordinatorLayout, view, rect, z);
    }

    public RevolutButtonScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.viewContainer = new WeakReference<>(null);
        this.buttonRect = new Rect();
        this.handler = new Handler();
        this.intersectCoordinates = new int[2];
        this.buttonCoordinates = new int[2];
    }
}
