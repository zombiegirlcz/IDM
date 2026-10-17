package ard;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: loaded from: classes7.dex */
public final class m0 extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ScreenContentRecyclerView f8670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ProducerScope f8671b;

    public m0(ScreenContentRecyclerView screenContentRecyclerView, ProducerScope producerScope) {
        this.f8670a = screenContentRecyclerView;
        this.f8671b = producerScope;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onScrolled(recyclerView, i, i2);
        RecyclerView.LayoutManager layoutManager = this.f8670a.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null && linearLayoutManager.findFirstVisibleItemPosition() <= 5 && i2 < 0) {
            com.bumptech.glide.c.E(this.f8671b, Unit.f186387a);
        }
    }
}
