package com.revolut.ui_kit_pdf.recycler;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import nya.b0;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/ui_kit_pdf/recycler/ZoomableLinearLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "ui_kit_pdf_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ZoomableLinearLayoutManager extends LinearLayoutManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f107140a;

    public ZoomableLinearLayoutManager(Context context, b0 b0Var) {
        super(context, 1, false);
        this.f107140a = b0Var;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        b0 b0Var = this.f107140a;
        if (b0Var != null) {
            i = ((Number) b0Var.invoke(Integer.valueOf(i))).intValue();
        }
        return super.scrollVerticallyBy(i, recycler, state);
    }
}
