package mx0;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes20.dex */
public final class f extends RecyclerView.LayoutManager implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f209685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f209686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f209687c;

    public f(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f209685a = context;
        this.f209686b = -1;
        this.f209687c = -1;
    }

    @Override // mx0.h
    public final IntRange a() {
        int i = this.f209686b;
        if (i >= 0 && i <= this.f209687c - 1) {
            return new IntRange(this.f209686b, this.f209687c - 2, 1);
        }
        IntRange.INSTANCE.getClass();
        return IntRange.d;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean isAutoMeasureEnabled() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        ArrayList arrayListF0;
        Intrinsics.checkNotNullParameter(recycler, "recycler");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f209687c = state.getItemCount();
        this.f209686b = -1;
        if (state.getItemCount() == 0) {
            removeAllViews();
            return;
        }
        detachAndScrapAttachedViews(recycler);
        int width = getWidth();
        Context context = this.f209685a;
        int i = width < kli.a.k(context, 351.0f) ? 3 : 4;
        int itemCount = state.getItemCount();
        int itemCount2 = state.getItemCount() + (-1) > i ? i - 1 : state.getItemCount() - 1;
        int itemCount3 = (state.getItemCount() - 1) - itemCount2;
        this.f209686b = itemCount2;
        if (itemCount3 > 0) {
            IntRange intRangeO = kotlin.ranges.f.o(0, i - 1);
            ArrayList arrayList = new ArrayList(zhm.w.t(intRangeO, 10));
            vim.f it8 = intRangeO.iterator();
            while (it8.f289625c) {
                arrayList.add(recycler.getViewForPosition(it8.nextInt()));
            }
            arrayListF0 = zhm.d0.F0(recycler.getViewForPosition(itemCount - 1), arrayList);
        } else {
            IntRange intRangeO2 = kotlin.ranges.f.o(0, itemCount2);
            ArrayList arrayList2 = new ArrayList(zhm.w.t(intRangeO2, 10));
            vim.f it9 = intRangeO2.iterator();
            while (it9.f289625c) {
                arrayList2.add(recycler.getViewForPosition(it9.nextInt()));
            }
            arrayListF0 = arrayList2;
        }
        ArrayList<View> arrayListF1 = zhm.d0.f1(arrayListF0);
        int iK = kli.a.k(context, 2.0f);
        int paddingStart = getPaddingStart();
        int width2 = (int) ((((getWidth() - getPaddingStart()) - getPaddingEnd()) - ((arrayListF1.size() - 1) * iK)) / arrayListF1.size());
        int i2 = paddingStart;
        for (View view : arrayListF1) {
            view.getLayoutParams().width = width2;
            measureChildWithMargins(view, 0, 0);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Intrinsics.i(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
            RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) layoutParams;
            int decoratedMeasuredHeight = getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
            addView(view);
            or0.g.a(this, view, i2, getPaddingTop(), i2 + width2, getPaddingTop() + decoratedMeasuredHeight);
            i2 += width2 + iK;
        }
    }
}
