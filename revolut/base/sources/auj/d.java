package auj;

import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.recyclerkit.ScreenGridLayoutManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends ScreenGridLayoutManager.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ScreenContentRecyclerView f9841a;

    public d(ScreenContentRecyclerView screenContentRecyclerView) {
        this.f9841a = screenContentRecyclerView;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
    public final int getSpanSize(int i) {
        RecyclerView.Adapter adapter = this.f9841a.getAdapter();
        Intrinsics.i(adapter, "null cannot be cast to non-null type com.revolut.recyclerkit.delegates.DiffAdapter");
        return ((koi.h) adapter).a(i) instanceof FullScreenStateDelegate.Model ? 2 : 1;
    }
}
