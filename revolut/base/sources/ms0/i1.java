package ms0;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.IndicesBarView$IndexBarDelegate;
import com.revolut.core.ui_kit.models.IndexBarModel;
import com.revolut.flexbox.FlexboxLayoutManager;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import com.revolut.rxdiffadapter.AsyncDiffRecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import kotlin.ranges.IntRange;
import ms0.g1;
import ms0.h1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class i1 extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z4l.j f208279a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(Context context, IndicesBarView$IndexBarDelegate indexBarDelegate) {
        super(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(indexBarDelegate, "indexBarDelegate");
        z4l.j jVar = new z4l.j(7, zhm.v.k(indexBarDelegate, new BaseRecyclerViewDelegate<g1, h1>() { // from class: com.revolut.core.ui_kit.internal.views.IndicesBarView$IndexBarLoadingDelegate
            {
                int i = R$layout.internal_delegate_index_bar_loading;
                new mqg.a(11);
            }

            @Override // koi.k
            public final RecyclerView.ViewHolder g(ViewGroup parent) {
                Intrinsics.checkNotNullParameter(parent, "parent");
                return new h1(s.r(parent, this.f98535a));
            }

            @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
            public final void p(h1 holder, g1 data, int i, List payloads) {
                Intrinsics.checkNotNullParameter(holder, "holder");
                Intrinsics.checkNotNullParameter(data, "data");
                Intrinsics.checkNotNullParameter(payloads, "payloads");
                super.p(holder, data, i, payloads);
                ShimmerFrameLayout shimmerFrameLayout = holder.f;
                Intrinsics.checkNotNullExpressionValue(shimmerFrameLayout, "<get-shimmerLayout>(...)");
                ifk.b.r(shimmerFrameLayout);
            }
        }), false);
        this.f208279a = jVar;
        AsyncDiffRecyclerView asyncDiffRecyclerView = new AsyncDiffRecyclerView(context, null, 6, 0);
        addView(asyncDiffRecyclerView, new FrameLayout.LayoutParams(-2, -2, 8388611));
        FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(context, 0);
        flexboxLayoutManager.B(3);
        Unit unit = Unit.f186387a;
        yp0.y.h(asyncDiffRecyclerView, jVar, flexboxLayoutManager);
        asyncDiffRecyclerView.setOverScrollMode(2);
    }

    public final void setItems(@NotNull List<IndexBarModel> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f208279a.c(items);
    }

    public final void setLoadingItems(int i) {
        IntRange intRange = new IntRange(1, i, 1);
        ArrayList arrayList = new ArrayList(zhm.w.t(intRange, 10));
        vim.f it8 = intRange.iterator();
        while (it8.f289625c) {
            arrayList.add(new g1(a0.d.n("indexBarLoading", it8.nextInt())));
        }
        this.f208279a.c(arrayList);
    }
}
