package com.revolut.core.ui_kit.recycler;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/recycler/RevStaggeredGridLayoutManager;", "Landroidx/recyclerview/widget/StaggeredGridLayoutManager;", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RevStaggeredGridLayoutManager extends StaggeredGridLayoutManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f58168a;

    public RevStaggeredGridLayoutManager(int i) {
        super(i, 1);
        this.f58168a = new Bundle();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        int i = Build.VERSION.SDK_INT;
        Bundle bundle = this.f58168a;
        if (i >= 33) {
            Parcelable parcelable = (Parcelable) bundle.getParcelable("STAGGERED_GRID_LAYOUT_MANAGER_STATE", Parcelable.class);
            if (parcelable != null) {
                onRestoreInstanceState(parcelable);
                return;
            }
            return;
        }
        Parcelable parcelable2 = bundle.getParcelable("STAGGERED_GRID_LAYOUT_MANAGER_STATE");
        if (parcelable2 != null) {
            onRestoreInstanceState(parcelable2);
        }
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
        this.f58168a.putParcelable("STAGGERED_GRID_LAYOUT_MANAGER_STATE", onSaveInstanceState());
        super.onDetachedFromWindow(recyclerView, recycler);
    }
}
