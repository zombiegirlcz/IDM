package t60;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import efm.c0;
import efm.r;
import kotlin.jvm.internal.Intrinsics;
import tfm.n4;

/* JADX INFO: loaded from: classes19.dex */
public final class g extends yji.d implements b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScreenContentRecyclerView f268128c;
    public final n4 d;
    public final n4 e;
    public final r f;

    public g(ScreenContentRecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.f268128c = recyclerView;
        r rVarCreate = r.create(new c(this, 0));
        c0 c0Var = hfm.c.f152030a;
        m70.a.p(c0Var);
        n4 n4VarE = rVarCreate.subscribeOn(c0Var).unsubscribeOn(c0Var).replay(1).e();
        Intrinsics.checkNotNullExpressionValue(n4VarE, "refCount(...)");
        this.d = n4VarE;
        n4 n4VarE2 = r.create(new c(this, 1)).subscribeOn(c0Var).unsubscribeOn(c0Var).replay(1).e();
        Intrinsics.checkNotNullExpressionValue(n4VarE2, "refCount(...)");
        this.e = n4VarE2;
        r rVarUnsubscribeOn = r.create(new c(this, 2)).subscribeOn(c0Var).unsubscribeOn(c0Var);
        Intrinsics.checkNotNullExpressionValue(rVarUnsubscribeOn, "unsubscribeOn(...)");
        this.f = rVarUnsubscribeOn;
    }

    public final a Q() {
        RecyclerView.LayoutManager layoutManager = this.f268128c.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            return new a(linearLayoutManager.findFirstVisibleItemPosition(), linearLayoutManager.findLastVisibleItemPosition(), linearLayoutManager.findFirstCompletelyVisibleItemPosition(), linearLayoutManager.findLastCompletelyVisibleItemPosition(), linearLayoutManager.getItemCount());
        }
        if (!(layoutManager instanceof StaggeredGridLayoutManager)) {
            throw new IllegalStateException(j6.a.q("provide instance of LinearLayoutManager to RecyclerView or rework RecyclerViewScrollViewControllerExtensionImpl to support ", layoutManager != null ? layoutManager.getClass().getSimpleName() : null).toString());
        }
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
        int spanCount = staggeredGridLayoutManager.getSpanCount();
        int[] iArr = new int[spanCount];
        int i = spanCount - 1;
        return new a(staggeredGridLayoutManager.findFirstVisibleItemPositions(iArr)[0], staggeredGridLayoutManager.findLastVisibleItemPositions(iArr)[i], staggeredGridLayoutManager.findFirstCompletelyVisibleItemPositions(iArr)[0], staggeredGridLayoutManager.findLastCompletelyVisibleItemPositions(iArr)[i], staggeredGridLayoutManager.getItemCount());
    }

    public final r R() {
        r rVarStartWith = r.merge(this.e, this.f).map(new c(this, 3)).startWith(Q());
        Intrinsics.checkNotNullExpressionValue(rVarStartWith, "startWith(...)");
        return rVarStartWith;
    }
}
