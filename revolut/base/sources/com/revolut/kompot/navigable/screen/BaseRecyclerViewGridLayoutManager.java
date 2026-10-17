package com.revolut.kompot.navigable.screen;

import android.content.Context;
import androidx.recyclerview.widget.GridLayoutManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewGridLayoutManager;", "Landroidx/recyclerview/widget/GridLayoutManager;", "kompot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BaseRecyclerViewGridLayoutManager extends GridLayoutManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f98433a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseRecyclerViewGridLayoutManager(Context context, int i) {
        super(context, i);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean supportsPredictiveItemAnimations() {
        return this.f98433a && super.supportsPredictiveItemAnimations();
    }
}
