package n09;

import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.delegates.SmallCardDelegate;
import com.revolut.recyclerkit.AdaptiveGridLayoutManager;
import com.revolut.recyclerkit.ScreenGridLayoutManager;
import ip0.nf0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends AdaptiveGridLayoutManager.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f210949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ScreenGridLayoutManager f210950b;

    public k(RecyclerView recyclerView, ScreenGridLayoutManager screenGridLayoutManager) {
        this.f210949a = recyclerView;
        this.f210950b = screenGridLayoutManager;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
    public final int getSpanSize(int i) {
        RecyclerView.Adapter adapter = this.f210949a.getAdapter();
        Intrinsics.i(adapter, "null cannot be cast to non-null type com.revolut.rxdiffadapter.RxDiffAdapter");
        koi.j jVarA = ((z4l.j) adapter).a(i);
        if ((jVarA instanceof SmallCardDelegate.Model) || (jVarA instanceof nf0)) {
            return 1;
        }
        return this.f210950b.getSpanCount();
    }
}
