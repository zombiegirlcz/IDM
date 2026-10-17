package com.revolut.recyclerkit;

import android.content.Context;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import goi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/revolut/recyclerkit/ScreenGridLayoutManager;", "Lcom/revolut/recyclerkit/AdaptiveGridLayoutManager;", "a", "recycler_kit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ScreenGridLayoutManager extends AdaptiveGridLayoutManager {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f98531c;
    public final j d;

    public static abstract class a extends GridLayoutManager.SpanSizeLookup {
        public a() {
            setSpanIndexCacheEnabled(true);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ScreenGridLayoutManager(Context context, int i, int i2) {
        boolean z = (i2 & 4) != 0;
        float f = (i2 & 8) != 0 ? -1.0f : 16.0f;
        Intrinsics.checkNotNullParameter(context, "context");
        super(context, i, z);
        this.f98531c = z;
        this.d = new j(f);
    }

    @Override // com.revolut.recyclerkit.AdaptiveGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onAttachedToWindow(RecyclerView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onAttachedToWindow(view);
        int itemDecorationCount = view.getItemDecorationCount();
        for (int i = 0; i < itemDecorationCount; i++) {
            if (view.getItemDecorationAt(i) instanceof j) {
                return;
            }
        }
        if (this.f98531c) {
            view.addItemDecoration(this.d);
        }
    }
}
