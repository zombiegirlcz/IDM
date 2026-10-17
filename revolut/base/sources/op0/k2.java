package op0;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class k2 extends LinearLayoutManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f227330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f227331b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(Context context, q widgetSize) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(widgetSize, "widgetSize");
        this.f227330a = context;
        this.f227331b = widgetSize;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        int width;
        int i;
        Intrinsics.checkNotNullParameter(recycler, "recycler");
        Intrinsics.checkNotNullParameter(state, "state");
        if (state.getItemCount() == 0) {
            removeAllViews();
            return;
        }
        detachAndScrapAttachedViews(recycler);
        int[] iArr = j2.f227318a;
        q qVar = this.f227331b;
        int i2 = iArr[qVar.ordinal()];
        if (i2 == 1) {
            width = getWidth() / 2;
        } else {
            if (i2 != 2) {
                if (i2 != 3 && i2 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException(qVar + " size is not supported");
            }
            width = getWidth();
        }
        int paddingTop = getPaddingTop();
        Context context = this.f227330a;
        if (kli.a.z(context.getResources().getDisplayMetrics().widthPixels, context) < 359.0f) {
            paddingTop += kli.a.k(context, 12.0f);
            i = 1;
        } else {
            i = 0;
        }
        int itemCount = state.getItemCount();
        int measuredHeight = paddingTop;
        while (i < itemCount) {
            View viewForPosition = recycler.getViewForPosition(i);
            Intrinsics.checkNotNullExpressionValue(viewForPosition, "getViewForPosition(...)");
            if (i == 1) {
                viewForPosition.getLayoutParams().height = width - measuredHeight;
            }
            addView(viewForPosition);
            measureChildWithMargins(viewForPosition, 0, 0);
            layoutDecorated(viewForPosition, getPaddingLeft(), measuredHeight, getWidth() - getPaddingRight(), viewForPosition.getMeasuredHeight() + measuredHeight);
            measuredHeight += viewForPosition.getMeasuredHeight();
            i++;
        }
    }
}
