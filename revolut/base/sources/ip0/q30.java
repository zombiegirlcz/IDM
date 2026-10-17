package ip0;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class q30 extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f165915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ColorDrawable f165916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f165917c;

    public q30(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f165915a = kli.a.k(context, 12.0f);
        this.f165916b = new ColorDrawable(kli.a.s(R$attr.uikit_colorElevatedSearchBackground, context));
        this.f165917c = new Rect();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        outRect.set(0, 0, this.f165916b.getIntrinsicWidth(), 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void onDraw(Canvas c2, RecyclerView parent, RecyclerView.State state) {
        int height;
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        if (parent.getLayoutManager() == null) {
            return;
        }
        c2.save();
        boolean clipToPadding = parent.getClipToPadding();
        int i = this.f165915a;
        if (clipToPadding) {
            int paddingTop = parent.getPaddingTop() + i;
            height = (parent.getHeight() - parent.getPaddingBottom()) - i;
            c2.clipRect(parent.getPaddingLeft(), paddingTop, parent.getWidth() - parent.getPaddingRight(), height);
            i = paddingTop;
        } else {
            height = parent.getHeight() - i;
        }
        int childCount = parent.getChildCount() - 1;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = parent.getChildAt(i2);
            RecyclerView.LayoutManager layoutManager = parent.getLayoutManager();
            Intrinsics.h(layoutManager);
            Rect rect = this.f165917c;
            layoutManager.getDecoratedBoundsWithMargins(childAt, rect);
            int iRound = Math.round(childAt.getTranslationX()) + rect.right;
            ColorDrawable colorDrawable = this.f165916b;
            colorDrawable.setBounds(iRound - colorDrawable.getIntrinsicWidth(), i, iRound, height);
            colorDrawable.draw(c2);
        }
        c2.restore();
    }
}
