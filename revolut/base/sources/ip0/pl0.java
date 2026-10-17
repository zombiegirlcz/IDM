package ip0;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.delegates.TransactionsCountPreviewDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class pl0 extends LinearLayoutManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f165848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f165849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f165850c;
    public final int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pl0(Context context) {
        super(context, 1, false);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f165848a = 5;
        this.d = kli.a.w(TransactionsCountPreviewDelegate.f53555c, context);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollVertically() {
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void measureChildWithMargins(View child, int i, int i2) {
        Intrinsics.checkNotNullParameter(child, "child");
        if (Intrinsics.f(child.getTag(), Integer.valueOf(R$id.internal_transactionsCountPreviewDelegate_transactionSkeleton))) {
            child.getLayoutParams().height = this.f165849b;
        } else if (Intrinsics.f(child.getTag(), Integer.valueOf(R$id.internal_transactionsCountPreviewDelegate_contentSkeleton))) {
            child.getLayoutParams().height = this.f165850c;
        }
        super.measureChildWithMargins(child, i, i2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        int i = height / this.f165848a;
        this.f165849b = i;
        this.f165850c = (height - i) - this.d;
        super.onLayoutChildren(recycler, state);
    }
}
