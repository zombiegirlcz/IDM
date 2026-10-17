package t60;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import tfm.z0;

/* JADX INFO: loaded from: classes19.dex */
public final class d extends RecyclerView.AdapterDataObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z0 f268125a;

    public d(z0 z0Var) {
        this.f268125a = z0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public final void onChanged() {
        this.f268125a.c(Unit.f186387a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public final void onItemRangeChanged(int i, int i2) {
        this.f268125a.c(Unit.f186387a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public final void onItemRangeInserted(int i, int i2) {
        this.f268125a.c(Unit.f186387a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public final void onItemRangeMoved(int i, int i2, int i3) {
        this.f268125a.c(Unit.f186387a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public final void onItemRangeRemoved(int i, int i2) {
        this.f268125a.c(Unit.f186387a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public final void onItemRangeChanged(int i, int i2, Object obj2) {
        this.f268125a.c(Unit.f186387a);
    }
}
