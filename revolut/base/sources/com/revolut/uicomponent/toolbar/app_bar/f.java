package com.revolut.uicomponent.toolbar.app_bar;

import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f107296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ToolbarTitleRevealBehavior f107297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CoordinatorLayout f107298c;
    public final /* synthetic */ RecyclerView d;

    public /* synthetic */ f(ToolbarTitleRevealBehavior toolbarTitleRevealBehavior, CoordinatorLayout coordinatorLayout, RecyclerView recyclerView, int i) {
        this.f107296a = i;
        this.f107297b = toolbarTitleRevealBehavior;
        this.f107298c = coordinatorLayout;
        this.d = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f107296a) {
            case 0:
                this.f107297b.lambda$onNestedScroll$18(this.f107298c, this.d);
                break;
            default:
                this.f107297b.lambda$onStartNestedScroll$8(this.f107298c, this.d);
                break;
        }
    }
}
