package com.revolut.uicomponent.toolbar.app_bar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.uicomponent.R$styleable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes12.dex */
@Keep
public final class ToolbarTitleRevealBehavior extends CoordinatorLayout.Behavior<View> {
    private int anchorId;
    private boolean firstLayout;
    private View header;
    private int headerId;
    private NestedScrollView nestedScrollView;
    private Rect rectHeader;
    private Rect rectToolbar;
    private RecyclerView recycler;
    private od0.i scrollDelegate;
    private BaseToolbar toolbar;
    private int toolbarId;

    public ToolbarTitleRevealBehavior() {
        od0.i.Companion.getClass();
        this.scrollDelegate = od0.i.f224256b;
        this.rectHeader = new Rect();
        this.rectToolbar = new Rect();
        this.firstLayout = true;
    }

    private View getHeader(CoordinatorLayout coordinatorLayout) {
        NestedScrollView nestedScrollView;
        RecyclerView recyclerView;
        int i;
        View view = this.header;
        if (view == null && (i = this.headerId) != 0) {
            this.header = coordinatorLayout.findViewById(i);
        } else if (view == null && (recyclerView = this.recycler) != null && recyclerView.getChildCount() > 0) {
            this.header = this.recycler.getChildAt(0);
        } else if (this.header == null && (nestedScrollView = this.nestedScrollView) != null && nestedScrollView.getChildCount() > 0) {
            View childAt = this.nestedScrollView.getChildAt(0);
            if (childAt instanceof RecyclerView) {
                RecyclerView recyclerView2 = (RecyclerView) childAt;
                if (recyclerView2.getChildCount() > 0) {
                    this.header = recyclerView2.getChildAt(0);
                }
            } else {
                this.header = childAt;
            }
        }
        return this.header;
    }

    private BaseToolbar getToolbar(CoordinatorLayout coordinatorLayout) {
        int i;
        if (this.toolbar == null && (i = this.toolbarId) != 0) {
            this.toolbar = (BaseToolbar) coordinatorLayout.findViewById(i);
        }
        return this.toolbar;
    }

    private void init(@NonNull Context context, AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.RevolutToolbarReveal);
        try {
            this.toolbarId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.RevolutToolbarReveal_rtbr_toolbar, 0);
            this.headerId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.RevolutToolbarReveal_rtbr_header, 0);
            this.anchorId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.RevolutToolbarReveal_rtbr_anchor, 0);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private boolean isHeaderHidden(int i) {
        if (this.recycler != null) {
            return this.toolbar.getHeight() + (this.header.getBottom() - i) <= this.toolbar.getBottom();
        }
        return i >= this.header.getBottom() - this.header.getPaddingBottom();
    }

    private Boolean isNestedScrollViewOrRecyclerView(View view) {
        return Boolean.valueOf((view instanceof NestedScrollView) || (view instanceof RecyclerView));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onLayoutChild$0(CoordinatorLayout coordinatorLayout) {
        updateView(coordinatorLayout, this.recycler.computeVerticalScrollOffset());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onLayoutChild$1(CoordinatorLayout coordinatorLayout) {
        updateView(coordinatorLayout, this.nestedScrollView.getScrollY());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean lambda$onNestedScroll$10(View view, ScrollBehaviorHelper scrollBehaviorHelper) {
        return Boolean.valueOf(view instanceof NestedScrollView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ NestedScrollView lambda$onNestedScroll$12(View view, ScrollBehaviorHelper scrollBehaviorHelper) {
        return (NestedScrollView) view;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onNestedScroll$13(CoordinatorLayout coordinatorLayout, NestedScrollView nestedScrollView) {
        updateView(coordinatorLayout, nestedScrollView.getScrollY());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onNestedScroll$14(View view, CoordinatorLayout coordinatorLayout, NestedScrollView nestedScrollView) {
        view.post(new j(this, coordinatorLayout, nestedScrollView, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean lambda$onNestedScroll$15(View view, ScrollBehaviorHelper scrollBehaviorHelper) {
        return Boolean.valueOf(view instanceof RecyclerView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ RecyclerView lambda$onNestedScroll$17(View view, ScrollBehaviorHelper scrollBehaviorHelper) {
        return (RecyclerView) view;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onNestedScroll$18(CoordinatorLayout coordinatorLayout, RecyclerView recyclerView) {
        updateView(coordinatorLayout, recyclerView.computeVerticalScrollOffset());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onNestedScroll$19(View view, CoordinatorLayout coordinatorLayout, RecyclerView recyclerView) {
        view.post(new f(this, coordinatorLayout, recyclerView, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean lambda$onStartNestedScroll$2(View view, ScrollBehaviorHelper scrollBehaviorHelper) {
        return Boolean.valueOf(view instanceof NestedScrollView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ NestedScrollView lambda$onStartNestedScroll$3(View view, ScrollBehaviorHelper scrollBehaviorHelper) {
        return (NestedScrollView) view;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onStartNestedScroll$4(CoordinatorLayout coordinatorLayout, NestedScrollView nestedScrollView) {
        updateView(coordinatorLayout, nestedScrollView.getScrollY());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onStartNestedScroll$5(View view, CoordinatorLayout coordinatorLayout, NestedScrollView nestedScrollView) {
        view.post(new j(this, coordinatorLayout, nestedScrollView, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean lambda$onStartNestedScroll$6(View view, ScrollBehaviorHelper scrollBehaviorHelper) {
        return Boolean.valueOf(view instanceof RecyclerView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ RecyclerView lambda$onStartNestedScroll$7(View view, ScrollBehaviorHelper scrollBehaviorHelper) {
        return (RecyclerView) view;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onStartNestedScroll$8(CoordinatorLayout coordinatorLayout, RecyclerView recyclerView) {
        updateView(coordinatorLayout, recyclerView.computeVerticalScrollOffset());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onStartNestedScroll$9(View view, CoordinatorLayout coordinatorLayout, RecyclerView recyclerView) {
        view.post(new f(this, coordinatorLayout, recyclerView, 1));
    }

    private void updateView(CoordinatorLayout coordinatorLayout, int i) {
        BaseToolbar toolbar = getToolbar(coordinatorLayout);
        View header = getHeader(coordinatorLayout);
        if (toolbar == null || header == null) {
            return;
        }
        if (isHeaderHidden(i)) {
            toolbar.showTitle();
        } else {
            toolbar.hideTitle(true);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean layoutDependsOn(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2) {
        if (this.scrollDelegate.d()) {
            return false;
        }
        int i = this.anchorId;
        View view3 = null;
        if (i == 0) {
            Iterator it8 = cp5.c.z(coordinatorLayout).iterator();
            while (true) {
                if (!it8.hasNext()) {
                    break;
                }
                View view4 = (View) it8.next();
                if (isNestedScrollViewOrRecyclerView(view4).booleanValue()) {
                    view3 = view4;
                    break;
                }
            }
        } else {
            View viewFindViewById = coordinatorLayout.findViewById(i);
            if (isNestedScrollViewOrRecyclerView(viewFindViewById).booleanValue()) {
                view3 = viewFindViewById;
            }
        }
        if (view3 instanceof NestedScrollView) {
            NestedScrollView nestedScrollView = (NestedScrollView) view3;
            this.nestedScrollView = nestedScrollView;
            ScrollBehaviorHelper scrollBehaviorHelper = new ScrollBehaviorHelper(nestedScrollView);
            od0.i.Companion.getClass();
            this.scrollDelegate = od0.h.a(scrollBehaviorHelper);
            return true;
        }
        if (view3 == null) {
            return false;
        }
        RecyclerView recyclerView = (RecyclerView) view3;
        this.recycler = recyclerView;
        ScrollBehaviorHelper scrollBehaviorHelper2 = new ScrollBehaviorHelper(recyclerView);
        od0.i.Companion.getClass();
        this.scrollDelegate = od0.h.a(scrollBehaviorHelper2);
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(@NonNull final CoordinatorLayout coordinatorLayout, @NonNull View view, int i) {
        BaseToolbar toolbar = getToolbar(coordinatorLayout);
        View header = getHeader(coordinatorLayout);
        if (this.recycler != null && toolbar != null) {
            if (this.firstLayout) {
                this.firstLayout = false;
                toolbar.hideTitle(false);
            }
            final int i2 = 0;
            this.recycler.post(new Runnable(this) { // from class: com.revolut.uicomponent.toolbar.app_bar.e

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ToolbarTitleRevealBehavior f107294b;

                {
                    this.f107294b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i2) {
                        case 0:
                            this.f107294b.lambda$onLayoutChild$0(coordinatorLayout);
                            break;
                        default:
                            this.f107294b.lambda$onLayoutChild$1(coordinatorLayout);
                            break;
                    }
                }
            });
        } else if (toolbar != null && header != null) {
            if (this.firstLayout) {
                this.firstLayout = false;
                toolbar.hideTitle(false);
            }
            NestedScrollView nestedScrollView = this.nestedScrollView;
            if (nestedScrollView != null) {
                final int i3 = 1;
                nestedScrollView.post(new Runnable(this) { // from class: com.revolut.uicomponent.toolbar.app_bar.e

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ ToolbarTitleRevealBehavior f107294b;

                    {
                        this.f107294b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i3) {
                            case 0:
                                this.f107294b.lambda$onLayoutChild$0(coordinatorLayout);
                                break;
                            default:
                                this.f107294b.lambda$onLayoutChild$1(coordinatorLayout);
                                break;
                        }
                    }
                });
            }
        }
        return super.onLayoutChild(coordinatorLayout, view, i);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2, final int i, final int i2, int i3, int i5, int i6) {
        super.onNestedScroll(coordinatorLayout, view, view2, i, i2, i3, i5, i6);
        final int i21 = 0;
        od0.i iVarB = this.scrollDelegate.b(new g(view2, i21));
        iVarB.a(new od0.f() { // from class: com.revolut.uicomponent.toolbar.app_bar.h
            @Override // od0.f
            public final void accept(Object obj2) {
                switch (i21) {
                    case 0:
                        ((ScrollBehaviorHelper) obj2).onNestedScroll(i, i2);
                        break;
                    default:
                        ((ScrollBehaviorHelper) obj2).onNestedScroll(i, i2);
                        break;
                }
            }
        });
        iVarB.f(new g(view2, 1)).e(new i(this, view2, coordinatorLayout, 0));
        od0.i iVarB2 = this.scrollDelegate.b(new g(view2, 2));
        final int i22 = 1;
        iVarB2.a(new od0.f() { // from class: com.revolut.uicomponent.toolbar.app_bar.h
            @Override // od0.f
            public final void accept(Object obj2) {
                switch (i22) {
                    case 0:
                        ((ScrollBehaviorHelper) obj2).onNestedScroll(i, i2);
                        break;
                    default:
                        ((ScrollBehaviorHelper) obj2).onNestedScroll(i, i2);
                        break;
                }
            }
        });
        iVarB2.f(new g(view2, 3)).e(new i(this, view2, coordinatorLayout, 1));
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2, @NonNull View view3, int i, int i2) {
        this.scrollDelegate.b(new g(view3, 4)).f(new g(view3, 5)).e(new i(this, view3, coordinatorLayout, 2));
        this.scrollDelegate.b(new g(view3, 6)).f(new g(view3, 7)).e(new i(this, view3, coordinatorLayout, 3));
        return (view3 instanceof NestedScrollView) || (view3 instanceof RecyclerView);
    }

    public void resetToolbar() {
        this.toolbar = null;
        this.toolbarId = 0;
    }

    public ToolbarTitleRevealBehavior(BaseToolbar baseToolbar) {
        od0.i.Companion.getClass();
        this.scrollDelegate = od0.i.f224256b;
        this.rectHeader = new Rect();
        this.rectToolbar = new Rect();
        this.firstLayout = true;
        this.toolbar = baseToolbar;
    }

    public ToolbarTitleRevealBehavior(int i) {
        this(i, 0, 0);
    }

    public ToolbarTitleRevealBehavior(int i, int i2, int i3) {
        od0.i.Companion.getClass();
        this.scrollDelegate = od0.i.f224256b;
        this.rectHeader = new Rect();
        this.rectToolbar = new Rect();
        this.firstLayout = true;
        this.toolbarId = i;
        this.headerId = i2;
        this.anchorId = i3;
    }

    public ToolbarTitleRevealBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        od0.i.Companion.getClass();
        this.scrollDelegate = od0.i.f224256b;
        this.rectHeader = new Rect();
        this.rectToolbar = new Rect();
        this.firstLayout = true;
        init(context, attributeSet);
    }
}
