package l5d;

import androidx.recyclerview.widget.RecyclerView;
import au0.x5;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends RecyclerView.AdapterDataObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f192237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x5 f192238b;

    public f(RecyclerView recyclerView, x5 x5Var) {
        this.f192237a = recyclerView;
        this.f192238b = x5Var;
    }

    public final void a() {
        RecyclerView recyclerView = this.f192237a;
        x5 x5Var = this.f192238b;
        recyclerView.removeCallbacks(x5Var);
        recyclerView.postOnAnimation(x5Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public final void onChanged() {
        a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public final void onItemRangeChanged(int i, int i2) {
        a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public final void onItemRangeInserted(int i, int i2) {
        a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public final void onItemRangeMoved(int i, int i2, int i3) {
        a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public final void onItemRangeRemoved(int i, int i2) {
        a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public final void onItemRangeChanged(int i, int i2, Object obj2) {
        a();
    }
}
