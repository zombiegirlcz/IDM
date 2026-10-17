package com.revolut.core.ui_kit.internal.drawables;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/core/ui_kit/internal/drawables/PassCardPunchDrawable;", "Landroid/graphics/drawable/Drawable;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PassCardPunchDrawable extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f55995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function0 f55996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f55997c;
    public final Path d;
    public final RectF e;
    public List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f55998g;

    public PassCardPunchDrawable(int i, float f, Function0 getPunchCenterYs) {
        Intrinsics.checkNotNullParameter(getPunchCenterYs, "getPunchCenterYs");
        this.f55995a = f;
        this.f55996b = getPunchCenterYs;
        Paint paint = new Paint();
        paint.setColor(i);
        paint.setStyle(Paint.Style.FILL);
        this.f55997c = paint;
        this.d = new Path();
        this.e = new RectF();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (getBounds().isEmpty()) {
            return;
        }
        Path path = this.d;
        path.reset();
        path.addRect(this.e, Path.Direction.CW);
        Iterator it8 = ((Iterable) this.f55996b.invoke()).iterator();
        while (it8.hasNext()) {
            float fFloatValue = ((Number) it8.next()).floatValue();
            Path.Direction direction = Path.Direction.CCW;
            float f = this.f55995a;
            path.addCircle(BitmapDescriptorFactory.HUE_RED, fFloatValue, f, direction);
            path.addCircle(this.f55998g, fFloatValue, f, direction);
        }
        canvas.drawPath(path, this.f55997c);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        super.onBoundsChange(bounds);
        this.e.set(bounds);
        this.f = (List) this.f55996b.invoke();
        this.f55998g = bounds.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f55997c.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f55997c.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
