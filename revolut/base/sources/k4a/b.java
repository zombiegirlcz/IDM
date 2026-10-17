package k4a;

import androidx.recyclerview.widget.GridLayoutManager;
import com.revolut.recyclerkit.ScreenContentRecyclerView;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends GridLayoutManager.SpanSizeLookup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ScreenContentRecyclerView f180868a;

    public b(c cVar, ScreenContentRecyclerView screenContentRecyclerView) {
        this.f180868a = screenContentRecyclerView;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
    public final int getSpanSize(int i) {
        return !c.a(i, this.f180868a) ? 4 : 1;
    }
}
