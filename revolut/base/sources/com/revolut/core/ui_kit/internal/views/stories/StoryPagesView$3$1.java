package com.revolut.core.ui_kit.internal.views.stories;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/revolut/core/ui_kit/internal/views/stories/StoryPagesView$3$1", "Landroidx/recyclerview/widget/LinearLayoutManager;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StoryPagesView$3$1 extends LinearLayoutManager {
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollVertically() {
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        if (!getRecycleChildrenOnDetach() || recyclerView == null) {
            return;
        }
        recyclerView.requestLayout();
    }
}
