package op0;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class y3 extends LinearLayoutManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f227488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f227489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aw0.d0 f227490c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3(Context context, q widgetSize, int i) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(widgetSize, "widgetSize");
        this.f227488a = context;
        this.f227489b = i;
        tw0.g1.Companion.getClass();
        this.f227490c = tw0.b1.a(context).b(widgetSize);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        float f;
        int i;
        Intrinsics.checkNotNullParameter(recycler, "recycler");
        Intrinsics.checkNotNullParameter(state, "state");
        if (state.getItemCount() == 0) {
            removeAllViews();
            return;
        }
        detachAndScrapAttachedViews(recycler);
        View viewForPosition = recycler.getViewForPosition(0);
        Intrinsics.checkNotNullExpressionValue(viewForPosition, "getViewForPosition(...)");
        addView(viewForPosition);
        measureChildWithMargins(viewForPosition, 0, 0);
        layoutDecorated(viewForPosition, getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getPaddingTop() + viewForPosition.getMeasuredHeight());
        int measuredHeight = viewForPosition.getMeasuredHeight();
        int itemCount = state.getItemCount() - 1;
        int i2 = this.f227489b;
        int iMin = Math.min(itemCount, i2 - 1);
        if (iMin < 0) {
            iMin = 0;
        }
        ArrayList arrayList = new ArrayList();
        int measuredHeight2 = measuredHeight;
        if (iMin != 0) {
            int i3 = 0;
            while (i3 < iMin) {
                i3++;
                View viewForPosition2 = recycler.getViewForPosition(i3);
                Intrinsics.checkNotNullExpressionValue(viewForPosition2, "getViewForPosition(...)");
                addView(viewForPosition2);
                measureChildWithMargins(viewForPosition2, 0, 0);
                measuredHeight2 += viewForPosition2.getMeasuredHeight();
                arrayList.add(viewForPosition2);
            }
        }
        if (i2 != arrayList.size() + 1 && !arrayList.isEmpty()) {
            measuredHeight2 += ((View) zhm.d0.m0(arrayList)).getMeasuredHeight() * (i2 - (arrayList.size() + 1));
        }
        aw0.d0 d0Var = this.f227490c;
        int width = (((d0Var == null || d0Var.f10274a <= 0) ? measuredHeight2 : (getWidth() * d0Var.f10275b) / d0Var.f10274a) - getPaddingTop()) - getPaddingBottom();
        if (measuredHeight2 > width) {
            f = (width - measuredHeight) / (measuredHeight2 - measuredHeight);
            i = 0;
        } else {
            f = 1.0f;
            i = (width - measuredHeight2) / i2;
        }
        float f4 = f;
        int iK = kli.a.k(this.f227488a, 4.0f);
        int paddingTop = getPaddingTop() + measuredHeight + i;
        int size = arrayList.size();
        int i5 = paddingTop;
        for (int i6 = 0; i6 < size; i6++) {
            int measuredHeight3 = (int) (r1.getMeasuredHeight() * f4);
            layoutDecorated((View) arrayList.get(i6), getPaddingLeft(), i5, getWidth() - getPaddingRight(), i5 + measuredHeight3 + iK);
            i5 += measuredHeight3 + i;
        }
    }
}
