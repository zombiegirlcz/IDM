package yg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;

/* JADX INFO: loaded from: classes17.dex */
public final class a extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f313475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Drawable f313476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f313477c = -1;

    public a(Context context) {
        this.f313476b = ContextCompat.getDrawable(context, 2131230970);
        this.f313475a = ContextCompat.getDrawable(context, 2131230971);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.f313476b.draw(canvas);
        canvas.drawColor(this.f313477c, PorterDuff.Mode.SRC_IN);
        this.f313475a.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        return this.f313476b.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i5) {
        this.f313476b.setBounds(i, i2, i3, i5);
        this.f313475a.setBounds(i, i2, i3, i5);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        throw new UnsupportedOperationException();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(Rect rect) {
        this.f313476b.setBounds(rect);
        this.f313475a.setBounds(rect);
    }
}
