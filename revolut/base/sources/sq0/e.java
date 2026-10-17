package sq0;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class e extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f264977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f264978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f264979c;
    public final ShapeDrawable d;

    public e(Context context, int[] iArr) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f264977a = iArr;
        this.f264978b = kli.a.k(context, 16.0f);
        this.f264979c = new Rect();
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        this.d = shapeDrawable;
        shapeDrawable.setIntrinsicHeight(kli.a.k(context, 1.0f));
        shapeDrawable.setIntrinsicWidth(1);
        shapeDrawable.getPaint().setColor(io0.a.b(0.2f, kli.a.s(R$attr.uikit_colorForeground, context)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        int[] iArr = this.f264977a;
        if (iArr == null || kotlin.collections.d.G(iArr, parent.getChildAdapterPosition(view))) {
            outRect.set(0, 0, 0, this.d.getIntrinsicHeight());
        } else {
            outRect.set(0, 0, 0, 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void onDraw(Canvas canvas, RecyclerView parent, RecyclerView.State state) {
        int width;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        boolean clipToPadding = parent.getClipToPadding();
        if (clipToPadding) {
            canvas.save();
        }
        int i = this.f264978b;
        if (clipToPadding) {
            int paddingLeft = parent.getPaddingLeft() + i;
            width = (parent.getWidth() - parent.getPaddingRight()) - i;
            canvas.clipRect(paddingLeft, parent.getPaddingTop(), width, parent.getHeight() - parent.getPaddingBottom());
            i = paddingLeft;
        } else {
            width = parent.getWidth() - i;
        }
        int childCount = parent.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = parent.getChildAt(i2);
            int[] iArr = this.f264977a;
            if (iArr == null || kotlin.collections.d.G(iArr, parent.getChildAdapterPosition(childAt))) {
                Rect rect = this.f264979c;
                parent.getDecoratedBoundsWithMargins(childAt, rect);
                int iC = rim.d.c(childAt.getTranslationY()) + rect.bottom;
                ShapeDrawable shapeDrawable = this.d;
                shapeDrawable.setBounds(i, iC - shapeDrawable.getIntrinsicHeight(), width, iC);
                shapeDrawable.draw(canvas);
            }
        }
        if (clipToPadding) {
            canvas.restore();
        }
    }
}
