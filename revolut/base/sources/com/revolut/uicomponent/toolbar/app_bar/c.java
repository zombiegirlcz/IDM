package com.revolut.uicomponent.toolbar.app_bar;

import androidx.appcompat.widget.SearchView;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class c implements SearchView.OnCloseListener, NestedScrollView.OnScrollChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f107291a;

    public /* synthetic */ c(Object obj2) {
        this.f107291a = obj2;
    }

    @Override // androidx.core.widget.NestedScrollView.OnScrollChangeListener
    public void onScrollChange(NestedScrollView nestedScrollView, int i, int i2, int i3, int i5) {
        ToolbarShadowBehavior.nestedScrollViewListener$lambda$0((ToolbarShadowBehavior) this.f107291a, nestedScrollView, i, i2, i3, i5);
    }
}
