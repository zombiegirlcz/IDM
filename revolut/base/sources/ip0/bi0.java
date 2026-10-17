package ip0;

import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class bi0 extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SwipeToActionDelegate f163616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zh0 f163617b;

    public bi0(SwipeToActionDelegate swipeToActionDelegate, zh0 zh0Var) {
        this.f163616a = swipeToActionDelegate;
        this.f163617b = zh0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        SwipeToActionDelegate.Companion companion = SwipeToActionDelegate.INSTANCE;
        this.f163616a.w(this.f163617b);
    }
}
