package ku0;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class e extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ihm.f f189585a = v0.a.d("create(...)");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f189586b;

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        int i3 = this.f189586b + i2;
        this.f189586b = i3;
        this.f189585a.onNext(i3 == 0 ? d.SCROLLED_TO_TOP : !recyclerView.canScrollVertically(1) ? d.SCROLLED_TO_BOTTOM : d.SCROLLED_TO_OFFSET);
    }
}
