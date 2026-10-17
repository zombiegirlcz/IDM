package wyl;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public View f301307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f301308b;

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        if (parent.getChildAdapterPosition(view) == 0) {
            outRect.set(0, this.f301307a.getMeasuredHeight(), 0, 0);
        } else {
            outRect.setEmpty();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void onDrawOver(Canvas canvas, RecyclerView parent, RecyclerView.State state) {
        View view = this.f301307a;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        super.onDrawOver(canvas, parent, state);
        if (!this.f301308b) {
            view.measure(View.MeasureSpec.makeMeasureSpec((parent.getMeasuredWidth() - parent.getPaddingLeft()) - parent.getPaddingRight(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
            parent.requestLayout();
            parent.invalidateItemDecorations();
            this.f301308b = true;
        }
        canvas.save();
        view.layout(0, 0, (parent.getWidth() - parent.getPaddingLeft()) - parent.getPaddingRight(), view.getMeasuredHeight());
        canvas.translate(parent.getPaddingLeft(), parent.getPaddingTop());
        view.draw(canvas);
        canvas.restore();
    }
}
