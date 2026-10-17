package bs0;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.internal.views.stories.StoriesHorizontalStepsProgressView;
import com.revolut.core.ui_kit.views.navbar.StoryNavBarContentView;
import kotlin.jvm.internal.Intrinsics;
import tx0.n4;
import tx0.o4;

/* JADX INFO: loaded from: classes19.dex */
public final class e extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n4 f18024a;

    public e(n4 callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f18024a = callback;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            throw new IllegalStateException("Only LinearLayoutManager is supported");
        }
        if (linearLayoutManager.getOrientation() != 0) {
            throw new IllegalStateException("Only HORIZONTAL orientation is supported");
        }
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        int itemCount = adapter != null ? adapter.getItemCount() : 0;
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        RecyclerView.ViewHolder leftViewHolder = recyclerView.findViewHolderForAdapterPosition(iFindFirstVisibleItemPosition);
        if (leftViewHolder == 0) {
            return;
        }
        float x3 = (leftViewHolder.itemView.getX() + leftViewHolder.itemView.getWidth()) / leftViewHolder.itemView.getWidth();
        int i3 = iFindFirstVisibleItemPosition + 1;
        Object objFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i3);
        if (x3 <= 0.5d && iFindFirstVisibleItemPosition != itemCount - 1) {
            iFindFirstVisibleItemPosition = i3;
        }
        n4 n4Var = this.f18024a;
        n4Var.getClass();
        Intrinsics.checkNotNullParameter(leftViewHolder, "leftViewHolder");
        StoryNavBarContentView storyNavBarContentView = n4Var.f275210a;
        StoriesHorizontalStepsProgressView storiesHorizontalStepsProgressView = storyNavBarContentView.f59475b;
        if (storyNavBarContentView.f59476c != iFindFirstVisibleItemPosition) {
            storyNavBarContentView.f59476c = iFindFirstVisibleItemPosition;
            if (storyNavBarContentView.i) {
                storiesHorizontalStepsProgressView.c(iFindFirstVisibleItemPosition, 5000L);
            } else {
                storiesHorizontalStepsProgressView.setOverallProgress(iFindFirstVisibleItemPosition + 1);
            }
        }
        storyNavBarContentView.f = leftViewHolder instanceof o4 ? (o4) leftViewHolder : null;
        storyNavBarContentView.f59477g = objFindViewHolderForAdapterPosition instanceof o4 ? (o4) objFindViewHolderForAdapterPosition : null;
        storyNavBarContentView.f59478h = x3;
        storyNavBarContentView.c();
        storyNavBarContentView.e();
    }
}
