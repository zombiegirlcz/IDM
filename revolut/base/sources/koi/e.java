package koi;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes10.dex */
public final class e extends RecyclerView.AdapterDataObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f186371a;

    public e(h hVar) {
        this.f186371a = hVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public final void onItemRangeInserted(int i, int i2) {
        h hVar = this.f186371a;
        WeakReference weakReference = hVar.i;
        RecyclerView recyclerView = weakReference != null ? (RecyclerView) weakReference.get() : null;
        if (recyclerView == null) {
            return;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        int iFindFirstCompletelyVisibleItemPosition = hVar.f186374g ? layoutManager instanceof LinearLayoutManager ? ((LinearLayoutManager) layoutManager).findFirstCompletelyVisibleItemPosition() : 0 : -1;
        if (i == 0 && iFindFirstCompletelyVisibleItemPosition == 0) {
            recyclerView.scrollToPosition(0);
        }
    }
}
