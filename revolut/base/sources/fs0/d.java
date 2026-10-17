package fs0;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class d extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Drawable f137518a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Drawable drawable = this.f137518a;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        Drawable drawable = this.f137518a;
        if (drawable == null || drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
            setMeasuredDimension(0, 0);
        } else {
            setMeasuredDimension(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
    }

    public final void setDrawable(Drawable drawable) {
        Drawable drawable2 = this.f137518a;
        if (drawable2 == drawable) {
            return;
        }
        boolean z = drawable2 != null && drawable2.getIntrinsicWidth() > 0 && drawable2.getIntrinsicHeight() > 0;
        boolean z3 = drawable != null && drawable.getIntrinsicWidth() > 0 && drawable.getIntrinsicHeight() > 0;
        this.f137518a = drawable;
        if (z != z3) {
            requestLayout();
        } else {
            invalidate();
        }
    }
}
