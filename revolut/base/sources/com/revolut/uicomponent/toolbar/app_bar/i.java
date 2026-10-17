package com.revolut.uicomponent.toolbar.app_bar;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class i implements od0.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f107304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ToolbarTitleRevealBehavior f107305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f107306c;
    public final /* synthetic */ CoordinatorLayout d;

    public /* synthetic */ i(ToolbarTitleRevealBehavior toolbarTitleRevealBehavior, View view, CoordinatorLayout coordinatorLayout, int i) {
        this.f107304a = i;
        this.f107305b = toolbarTitleRevealBehavior;
        this.f107306c = view;
        this.d = coordinatorLayout;
    }

    @Override // od0.f
    public final void accept(Object obj2) {
        switch (this.f107304a) {
            case 0:
                this.f107305b.lambda$onNestedScroll$14(this.f107306c, this.d, (NestedScrollView) obj2);
                break;
            case 1:
                this.f107305b.lambda$onNestedScroll$19(this.f107306c, this.d, (RecyclerView) obj2);
                break;
            case 2:
                this.f107305b.lambda$onStartNestedScroll$5(this.f107306c, this.d, (NestedScrollView) obj2);
                break;
            default:
                this.f107305b.lambda$onStartNestedScroll$9(this.f107306c, this.d, (RecyclerView) obj2);
                break;
        }
    }
}
