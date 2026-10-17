package com.revolut.uicomponent.toolbar.app_bar;

import android.view.View;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f107299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f107300b;

    public /* synthetic */ g(View view, int i) {
        this.f107299a = i;
        this.f107300b = view;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f107299a) {
            case 0:
                return ToolbarTitleRevealBehavior.lambda$onNestedScroll$10(this.f107300b, (ScrollBehaviorHelper) obj2);
            case 1:
                return ToolbarTitleRevealBehavior.lambda$onNestedScroll$12(this.f107300b, (ScrollBehaviorHelper) obj2);
            case 2:
                return ToolbarTitleRevealBehavior.lambda$onNestedScroll$15(this.f107300b, (ScrollBehaviorHelper) obj2);
            case 3:
                return ToolbarTitleRevealBehavior.lambda$onNestedScroll$17(this.f107300b, (ScrollBehaviorHelper) obj2);
            case 4:
                return ToolbarTitleRevealBehavior.lambda$onStartNestedScroll$2(this.f107300b, (ScrollBehaviorHelper) obj2);
            case 5:
                return ToolbarTitleRevealBehavior.lambda$onStartNestedScroll$3(this.f107300b, (ScrollBehaviorHelper) obj2);
            case 6:
                return ToolbarTitleRevealBehavior.lambda$onStartNestedScroll$6(this.f107300b, (ScrollBehaviorHelper) obj2);
            default:
                return ToolbarTitleRevealBehavior.lambda$onStartNestedScroll$7(this.f107300b, (ScrollBehaviorHelper) obj2);
        }
    }
}
