package ip0;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class lc0 extends RecyclerView.OnScrollListener implements View.OnLayoutChangeListener {

    @NotNull
    public static final kc0 Companion = new kc0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final md f165187a;

    public lc0(md onLastItemViewed) {
        Intrinsics.checkNotNullParameter(onLastItemViewed, "onLastItemViewed");
        this.f165187a = onLastItemViewed;
    }

    public final void b(RecyclerView recyclerView) {
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if ((linearLayoutManager != null ? linearLayoutManager.findLastCompletelyVisibleItemPosition() : Integer.MIN_VALUE) >= (linearLayoutManager != null ? linearLayoutManager.getItemCount() : -1) - 1) {
            this.f165187a.invoke();
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i5, int i6, int i21, int i22, int i32) {
        List listK = zhm.v.k(Integer.valueOf(i6), Integer.valueOf(i21), Integer.valueOf(i22), Integer.valueOf(i32));
        if ((listK instanceof Collection) && listK.isEmpty()) {
            return;
        }
        Iterator it8 = listK.iterator();
        while (it8.hasNext()) {
            if (((Number) it8.next()).intValue() != 0) {
                if (view instanceof RecyclerView) {
                    b((RecyclerView) view);
                    return;
                }
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recycler, int i, int i2) {
        Intrinsics.checkNotNullParameter(recycler, "recycler");
        b(recycler);
    }
}
