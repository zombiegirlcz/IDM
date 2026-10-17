package dyl;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;
import androidx.core.view.ViewKt;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.views.BackgroundWallpaperView;
import com.revolut.ui_kit.payments.transition.TransferToChatTransitionFlowContainerLayout;
import gw0.t;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class j extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bitmap f121156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ShapeDrawable f121157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f121158c;
    public final Bitmap d;
    public final Path e;

    public j(TransferToChatTransitionFlowContainerLayout transferToChatTransitionFlowContainerLayout, Bitmap bitmap, View bubbleView, Rect amountAbsoluteRect, RecyclerView recycler, t bubbleBlockPosition, BackgroundWallpaperView backgroundWallpaperView) {
        Intrinsics.checkNotNullParameter(bubbleView, "bubbleView");
        Intrinsics.checkNotNullParameter(amountAbsoluteRect, "amountAbsoluteRect");
        Intrinsics.checkNotNullParameter(recycler, "recycler");
        Intrinsics.checkNotNullParameter(bubbleBlockPosition, "bubbleBlockPosition");
        this.f121156a = bitmap;
        float[] fArr = new float[8];
        int i = TransferToChatTransitionFlowContainerLayout.f107124p;
        transferToChatTransitionFlowContainerLayout.c(1.0f, 1.0f, 1.0f, bubbleBlockPosition, fArr);
        Path path = null;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        shapeDrawable.getPaint().setColor(TransferToChatTransitionFlowContainerLayout.d(bubbleView));
        this.f121157b = shapeDrawable;
        Rect rect = new Rect(amountAbsoluteRect);
        this.f121158c = rect;
        Rect rect2 = new Rect();
        bubbleView.getDrawingRect(rect2);
        recycler.offsetDescendantRectToMyCoords(bubbleView, rect2);
        rect2.right -= transferToChatTransitionFlowContainerLayout.e;
        shapeDrawable.setBounds(rect2);
        int[] iArr = new int[2];
        recycler.getLocationOnScreen(iArr);
        rect.offset(-iArr[0], -iArr[1]);
        Bitmap bitmapDrawToBitmap$default = backgroundWallpaperView != null ? ViewKt.drawToBitmap$default(backgroundWallpaperView, null, 1, null) : null;
        this.d = bitmapDrawToBitmap$default;
        if (bitmapDrawToBitmap$default != null) {
            path = new Path();
            path.addRoundRect(new RectF(shapeDrawable.getBounds()), fArr, Path.Direction.CW);
        }
        this.e = path;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void onDraw(Canvas canvas, RecyclerView parent, RecyclerView.State state) {
        Rect rect;
        Path path;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        super.onDraw(canvas, parent, state);
        ShapeDrawable shapeDrawable = this.f121157b;
        Bitmap bitmap = this.d;
        if (bitmap == null || (path = this.e) == null) {
            shapeDrawable.draw(canvas);
        } else {
            canvas.save();
            canvas.clipPath(path);
            canvas.drawBitmap(bitmap, (Rect) null, shapeDrawable.getBounds(), (Paint) null);
            canvas.restore();
        }
        int i = TransferToChatTransitionFlowContainerLayout.f107124p;
        Bitmap bitmap2 = this.f121156a;
        if (bitmap2 == null || (rect = this.f121158c) == null) {
            return;
        }
        canvas.drawBitmap(bitmap2, (Rect) null, rect, (Paint) null);
    }
}
