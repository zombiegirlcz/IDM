package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ProgressTimelineLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ProgressTimelineLayoutManager extends LinearLayoutManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f53033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f53034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f53035c;
    public boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressTimelineLayoutManager(Context context, int i, int i2, int i3) {
        super(context, 0, false);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f53033a = i;
        this.f53034b = i2;
        this.f53035c = i3;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* JADX INFO: renamed from: canScrollHorizontally */
    public final boolean getF53278a() {
        return this.d && super.getF53278a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void measureChildWithMargins(View child, int i, int i2) {
        Intrinsics.checkNotNullParameter(child, "child");
        if (getItemCount() == 0) {
            return;
        }
        int width = (getWidth() - (this.f53035c * 2)) - ((getItemCount() - 1) * this.f53034b);
        int itemCount = getItemCount();
        int itemCount2 = this.f53033a;
        this.d = itemCount * itemCount2 > width;
        ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
        if (getItemCount() <= 3) {
            itemCount2 = width / getItemCount();
        }
        layoutParams.width = itemCount2;
        super.measureChildWithMargins(child, i, i2);
    }
}
