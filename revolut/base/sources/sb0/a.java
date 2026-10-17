package sb0;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: loaded from: classes19.dex */
public final class a extends RecyclerView.AdapterDataObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ProducerScope f261468a;

    public a(ProducerScope producerScope) {
        this.f261468a = producerScope;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public final void onChanged() {
        com.bumptech.glide.c.E(this.f261468a, Unit.f186387a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public final void onItemRangeChanged(int i, int i2) {
        com.bumptech.glide.c.E(this.f261468a, Unit.f186387a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public final void onItemRangeInserted(int i, int i2) {
        com.bumptech.glide.c.E(this.f261468a, Unit.f186387a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public final void onItemRangeMoved(int i, int i2, int i3) {
        com.bumptech.glide.c.E(this.f261468a, Unit.f186387a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public final void onItemRangeRemoved(int i, int i2) {
        com.bumptech.glide.c.E(this.f261468a, Unit.f186387a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public final void onItemRangeChanged(int i, int i2, Object obj2) {
        com.bumptech.glide.c.E(this.f261468a, Unit.f186387a);
    }
}
