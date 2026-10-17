package com.revolut.core.ui_kit.recycler;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import tw0.b1;
import tw0.g1;
import tw0.t0;
import tw0.u0;
import tw0.v0;
import tw0.y0;
import z92.f;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/core/ui_kit/recycler/WidgetGridLayoutManager;", "Landroidx/recyclerview/widget/GridLayoutManager;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WidgetGridLayoutManager extends GridLayoutManager {
    public static final /* synthetic */ int f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v0 f58172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t0 f58173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y0 f58174c;
    public final boolean d;
    public u0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WidgetGridLayoutManager(Context context, v0 smoothScroller, t0 itemDecoration, y0 spanSizeLookup, boolean z) {
        super(context, b1.a(context).getColumnCount());
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(smoothScroller, "smoothScroller");
        Intrinsics.checkNotNullParameter(itemDecoration, "itemDecoration");
        Intrinsics.checkNotNullParameter(spanSizeLookup, "spanSizeLookup");
        g1.Companion.getClass();
        this.f58172a = smoothScroller;
        this.f58173b = itemDecoration;
        this.f58174c = spanSizeLookup;
        this.d = z;
    }

    public final void m(RecyclerView recyclerView) {
        b1 b1Var = g1.Companion;
        Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        b1Var.getClass();
        g1 g1VarA = b1.a(context);
        if (getSpanCount() == g1VarA.getColumnCount()) {
            return;
        }
        setSpanCount(g1VarA.getColumnCount());
        y0 y0Var = this.f58174c;
        y0Var.d = null;
        y0Var.invalidateSpanIndexCache();
        this.f58173b.f274882c = false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onAttachedToWindow(RecyclerView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onAttachedToWindow(view);
        m(view);
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Activity activityI = f.i(context);
        if (activityI == null) {
            return;
        }
        u0 u0Var = new u0(this, view);
        this.e = u0Var;
        activityI.registerComponentCallbacks(u0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
        Context context;
        Activity activityI;
        u0 u0Var = this.e;
        if (u0Var != null) {
            if (recyclerView != null && (context = recyclerView.getContext()) != null && (activityI = f.i(context)) != null) {
                activityI.unregisterComponentCallbacks(u0Var);
            }
            this.e = null;
        }
        super.onDetachedFromWindow(recyclerView, recycler);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.ItemTouchHelper.ViewDropHandler
    public final void prepareForDrop(View view, View target, int i, int i2) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(target, "target");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        v0 v0Var = this.f58172a;
        v0Var.setTargetPosition(i);
        startSmoothScroll(v0Var);
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean supportsPredictiveItemAnimations() {
        return this.d && super.supportsPredictiveItemAnimations();
    }
}
