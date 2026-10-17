package com.revolut.uicomponent.recycler;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/uicomponent/recycler/LayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "core_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LayoutManager extends LinearLayoutManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f107225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f107226b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutManager(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f107225a = true;
        this.f107226b = true;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* JADX INFO: renamed from: canScrollHorizontally */
    public final boolean getF53278a() {
        return this.f107225a && super.getF53278a();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollVertically() {
        return this.f107226b && super.canScrollVertically();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean supportsPredictiveItemAnimations() {
        return false;
    }
}
