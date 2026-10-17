package eki;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.kompot.navigable.flow.scroller.BaseScrollerFlow;
import com.revolut.kompot.navigable.flow.scroller.ScrollerFlowStep;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BaseScrollerFlow f127170a;

    public d(BaseScrollerFlow baseScrollerFlow) {
        this.f127170a = baseScrollerFlow;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (i == 0) {
            BaseScrollerFlow baseScrollerFlow = this.f127170a;
            int iFindFirstCompletelyVisibleItemPosition = ((LinearLayoutManager) baseScrollerFlow.M.getValue()).findFirstCompletelyVisibleItemPosition();
            if (iFindFirstCompletelyVisibleItemPosition == -1 || iFindFirstCompletelyVisibleItemPosition < 0 || iFindFirstCompletelyVisibleItemPosition > baseScrollerFlow.P2().getCurrentList().size()) {
                return;
            }
            Object obj2 = baseScrollerFlow.P2().getCurrentList().get(iFindFirstCompletelyVisibleItemPosition);
            Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
            baseScrollerFlow.V2((ScrollerFlowStep) obj2);
        }
    }
}
