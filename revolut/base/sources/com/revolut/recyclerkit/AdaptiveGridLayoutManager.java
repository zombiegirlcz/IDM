package com.revolut.recyclerkit;

import android.app.Activity;
import android.content.Context;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import goi.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xpe.d;
import z92.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/recyclerkit/AdaptiveGridLayoutManager;", "Landroidx/recyclerview/widget/GridLayoutManager;", "Companion", "b", "a", "recycler_kit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class AdaptiveGridLayoutManager extends GridLayoutManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function0 f98527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f98528b;

    /* JADX INFO: renamed from: com.revolut.recyclerkit.AdaptiveGridLayoutManager$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static abstract class b extends GridLayoutManager.SpanSizeLookup {
        public b() {
            setSpanIndexCacheEnabled(true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdaptiveGridLayoutManager(Context context, Function0 spanCountProvider) {
        super(context, ((Number) spanCountProvider.invoke()).intValue());
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(spanCountProvider, "spanCountProvider");
        this.f98527a = spanCountProvider;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAttachedToWindow(RecyclerView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onAttachedToWindow(view);
        setSpanCount(((Number) this.f98527a.invoke()).intValue());
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Activity activityI = f.i(context);
        if (activityI == null) {
            return;
        }
        a aVar = new a(this, 0);
        this.f98528b = aVar;
        activityI.registerComponentCallbacks(aVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
        Context context;
        Activity activityI;
        if (recyclerView != null && (context = recyclerView.getContext()) != null && (activityI = f.i(context)) != null) {
            activityI.unregisterComponentCallbacks(this.f98528b);
        }
        this.f98528b = null;
        super.onDetachedFromWindow(recyclerView, recycler);
    }

    public /* synthetic */ AdaptiveGridLayoutManager(Context context) {
        this(context, 4, true);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdaptiveGridLayoutManager(Context context, int i, boolean z) {
        this(context, new d(i, 3, context, z));
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
