package com.revolut.core.ui_kit.delegates;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ip0.fc0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/revolut/core/ui_kit/delegates/ScrollerBoxDelegate$ViewHolder$getAutoScrollLayoutManager$1", "Landroidx/recyclerview/widget/LinearLayoutManager;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ScrollerBoxDelegate$ViewHolder$getAutoScrollLayoutManager$1 extends LinearLayoutManager {
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* JADX INFO: renamed from: canScrollHorizontally */
    public final boolean getF53278a() {
        return true;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        fc0 fc0Var = new fc0(recyclerView.getContext());
        fc0Var.setTargetPosition(i);
        startSmoothScroll(fc0Var);
    }
}
