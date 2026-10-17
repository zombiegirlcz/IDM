package com.revolut.uicomponent.toolbar.app_bar;

import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f107307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ToolbarTitleRevealBehavior f107308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CoordinatorLayout f107309c;
    public final /* synthetic */ NestedScrollView d;

    public /* synthetic */ j(ToolbarTitleRevealBehavior toolbarTitleRevealBehavior, CoordinatorLayout coordinatorLayout, NestedScrollView nestedScrollView, int i) {
        this.f107307a = i;
        this.f107308b = toolbarTitleRevealBehavior;
        this.f107309c = coordinatorLayout;
        this.d = nestedScrollView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f107307a) {
            case 0:
                this.f107308b.lambda$onNestedScroll$13(this.f107309c, this.d);
                break;
            default:
                this.f107308b.lambda$onStartNestedScroll$4(this.f107309c, this.d);
                break;
        }
    }
}
