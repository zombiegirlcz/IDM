package yp0;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class v extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f315756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f315757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f315758c;

    public v(int i, Function1 function1, boolean z) {
        this.f315756a = function1;
        this.f315757b = i;
        this.f315758c = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        Integer numValueOf;
        int iIntValue;
        RecyclerView.Adapter adapter;
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onScrolled(recyclerView, i, i2);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null) {
            return;
        }
        int itemCount = layoutManager.getItemCount();
        Integer numValueOf2 = null;
        if (layoutManager instanceof LinearLayoutManager) {
            iIntValue = ((LinearLayoutManager) layoutManager).findLastCompletelyVisibleItemPosition();
        } else {
            if (!(layoutManager instanceof StaggeredGridLayoutManager)) {
                return;
            }
            int[] iArrFindLastVisibleItemPositions = ((StaggeredGridLayoutManager) layoutManager).findLastVisibleItemPositions(null);
            Intrinsics.checkNotNullExpressionValue(iArrFindLastVisibleItemPositions, "findLastVisibleItemPositions(...)");
            Intrinsics.checkNotNullParameter(iArrFindLastVisibleItemPositions, "<this>");
            if (iArrFindLastVisibleItemPositions.length == 0) {
                numValueOf = null;
            } else {
                int i3 = iArrFindLastVisibleItemPositions[0];
                Intrinsics.checkNotNullParameter(iArrFindLastVisibleItemPositions, "<this>");
                int i5 = 1;
                int length = iArrFindLastVisibleItemPositions.length - 1;
                if (1 <= length) {
                    while (true) {
                        int i6 = iArrFindLastVisibleItemPositions[i5];
                        if (i3 < i6) {
                            i3 = i6;
                        }
                        if (i5 == length) {
                            break;
                        } else {
                            i5++;
                        }
                    }
                }
                numValueOf = Integer.valueOf(i3);
            }
            iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
        }
        if (iIntValue > itemCount - this.f315757b || (itemCount == 0 && this.f315758c)) {
            if (iIntValue != -1 && (adapter = recyclerView.getAdapter()) != null) {
                numValueOf2 = Integer.valueOf(adapter.getItemViewType(iIntValue));
            }
            this.f315756a.invoke(numValueOf2);
        }
    }
}
