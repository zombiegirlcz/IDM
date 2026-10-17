package com.revolut.recyclerkit.layoutmanager;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.BridgeLinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.delegates.chat.ChatUncontainedMessageDelegate;
import com.revolut.core.ui_kit.internal.views.UIKitTextView;
import ioi.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/recyclerkit/layoutmanager/UIKitLinearLayoutManager;", "Landroidx/recyclerview/widget/BridgeLinearLayoutManager;", "recycler_kit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class UIKitLinearLayoutManager extends BridgeLinearLayoutManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f98537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f98538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f98539c;
    public boolean d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UIKitLinearLayoutManager(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f98537a = true;
        this.f98538b = true;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* JADX INFO: renamed from: canScrollHorizontally */
    public final boolean getF53278a() {
        return this.f98537a && super.getF53278a();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollVertically() {
        return this.f98538b && super.canScrollVertically();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int getPaddingBottom() {
        return super.getPaddingBottom() + this.e;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean onRequestChildFocus(RecyclerView parent, RecyclerView.State state, View child, View view) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(child, "child");
        Object childViewHolder = parent.getChildViewHolder(child);
        if (!(childViewHolder instanceof c)) {
            if (this.d && parent.isInTouchMode()) {
                return true;
            }
            return super.onRequestChildFocus(parent, state, child, view);
        }
        ((ChatUncontainedMessageDelegate.ViewHolder) ((c) childViewHolder)).getClass();
        Intrinsics.checkNotNullParameter(child, "child");
        if (child.isInTouchMode()) {
            return true;
        }
        return super.onRequestChildFocus(parent, state, child, view);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean requestChildRectangleOnScreen(RecyclerView parent, View child, Rect rect, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(rect, "rect");
        Object childViewHolder = parent.getChildViewHolder(child);
        if (!(childViewHolder instanceof c)) {
            if (this.d && parent.isInTouchMode()) {
                return true;
            }
            return super.requestChildRectangleOnScreen(parent, child, rect, z, z3);
        }
        ChatUncontainedMessageDelegate.ViewHolder viewHolder = (ChatUncontainedMessageDelegate.ViewHolder) ((c) childViewHolder);
        viewHolder.getClass();
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(rect, "rect");
        UIKitTextView uIKitTextView = viewHolder.f;
        if (Intrinsics.f(child, uIKitTextView) && uIKitTextView.getSelectionStart() == uIKitTextView.getSelectionEnd()) {
            return true;
        }
        return super.requestChildRectangleOnScreen(parent, child, rect, z, z3);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean supportsPredictiveItemAnimations() {
        return this.f98539c && super.supportsPredictiveItemAnimations();
    }
}
