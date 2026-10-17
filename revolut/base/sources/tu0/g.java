package tu0;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class g extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ihm.f f274513a = v0.a.d("create(...)");

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.f274513a.onNext((recyclerView.canScrollVertically(1) || i2 <= 0) ? (recyclerView.canScrollVertically(-1) || i2 >= 0) ? f.SCROLLED_TO_OFFSET : f.SCROLLED_TO_TOP : f.SCROLLED_TO_BOTTOM);
    }
}
