package ep0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Spanned;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a0 extends b {
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f128012g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f128013h;
    public final RectF i = new RectF();

    public a0(int i, float f, float f4) {
        this.f = i;
        this.f128012g = f;
        this.f128013h = f4;
    }

    @Override // ep0.b
    public final void c(Canvas canvas, Paint paint, int i, int i2, int i3, int i5, Spanned spanned, int i6, int i21, int i22, int i32, float f, float f4) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Intrinsics.checkNotNullParameter(spanned, "spanned");
        float f5 = BitmapDescriptorFactory.HUE_RED;
        float f6 = this.f128013h;
        float f32 = i22 > i6 ? f6 : 0.0f;
        if (i32 < i21) {
            f5 = f6;
        }
        float fB = ((b(spanned, i6, i21) + i) + f) - f32;
        float f35 = f32 + fB + f4 + f5;
        float f36 = i5;
        RectF rectF = this.i;
        rectF.set(fB, i2, f35, f36);
        int color = paint.getColor();
        paint.setColor(this.f);
        float f37 = this.f128012g;
        canvas.drawRoundRect(rectF, f37, f37, paint);
        paint.setColor(color);
    }
}
