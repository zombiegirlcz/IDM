package oyl;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class e extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f231058a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f231059b;

    public e(f fVar) {
        this.f231059b = fVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        f fVar = this.f231059b;
        c cVar = fVar.f231063g;
        TextView textView = fVar.e;
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onScrollStateChanged(recyclerView, i);
        if (i == 0) {
            if (fVar.f) {
                textView.removeCallbacks(cVar);
                textView.postDelayed(cVar, 1000L);
                return;
            }
            return;
        }
        if ((i == 1 || i == 2) && fVar.f) {
            textView.removeCallbacks(cVar);
            textView.animate().cancel();
            textView.setVisibility(0);
            textView.setAlpha(1.0f);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int iFindFirstVisibleItemPosition;
        View viewFindViewByPosition;
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onScrolled(recyclerView, i, i2);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null || (iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition()) == -1 || (viewFindViewByPosition = linearLayoutManager.findViewByPosition(iFindFirstVisibleItemPosition)) == null) {
            return;
        }
        if (Math.min(viewFindViewByPosition.getBottom(), recyclerView.getHeight()) - Math.max(viewFindViewByPosition.getTop(), 0) < viewFindViewByPosition.getHeight() * 0.5f) {
            iFindFirstVisibleItemPosition++;
        }
        if (this.f231058a != iFindFirstVisibleItemPosition) {
            this.f231058a = iFindFirstVisibleItemPosition;
            f fVar = this.f231059b;
            RecyclerView.Adapter adapter = fVar.d.getAdapter();
            int itemCount = adapter != null ? adapter.getItemCount() : 0;
            int i3 = itemCount != 0 ? iFindFirstVisibleItemPosition + 1 : 0;
            fVar.e.setText(i3 + " / " + itemCount);
        }
        Unit unit = Unit.f186387a;
    }
}
