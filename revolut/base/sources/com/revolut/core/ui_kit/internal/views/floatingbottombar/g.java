package com.revolut.core.ui_kit.internal.views.floatingbottombar;

import android.view.View;
import com.revolut.core.ui_kit.internal.views.floatingbottombar.FloatingBottomBarExpandedView;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;

/* JADX INFO: loaded from: classes19.dex */
public final class g implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TrackableItem f57068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ py0.d f57069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FloatingBottomBarExpandedView.ItemDelegate f57070c;
    public final /* synthetic */ FloatingBottomBarExpandedView.ItemDelegate.Model d;

    public g(FloatingBottomBarExpandedView.ItemDelegate.Model model, py0.c cVar, FloatingBottomBarExpandedView.ItemDelegate itemDelegate, FloatingBottomBarExpandedView.ItemDelegate.Model model2) {
        this.f57068a = model;
        this.f57069b = cVar;
        this.f57070c = itemDelegate;
        this.d = model2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        h30.l.w(view, view).a(view, this.f57068a, this.f57069b);
        this.f57070c.f57028c.onNext(this.d);
    }
}
