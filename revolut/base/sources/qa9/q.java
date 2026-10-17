package qa9;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class q extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f243999a;

    public q(e onLastDisclosureRead) {
        Intrinsics.checkNotNullParameter(onLastDisclosureRead, "onLastDisclosureRead");
        this.f243999a = onLastDisclosureRead;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if ((linearLayoutManager != null ? linearLayoutManager.findLastCompletelyVisibleItemPosition() : Integer.MIN_VALUE) >= (linearLayoutManager != null ? linearLayoutManager.getItemCount() : -1) - 1) {
            this.f243999a.invoke();
        }
    }
}
