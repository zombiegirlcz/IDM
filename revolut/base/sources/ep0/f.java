package ep0;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.text.Spanned;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class f extends b {

    @NotNull
    public static final a Companion = new a();
    public final g f = new g();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Paint f128025g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f128026h;
    public int i;

    public static final class a {
        private a() {
        }
    }

    public f() {
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.f128025g = paint;
        this.f128026h = -1.0f;
    }

    @Override // ep0.b
    public final void c(Canvas canvas, Paint p2, int i, int i2, int i3, int i5, Spanned spanned, int i6, int i21, int i22, int i32, float f, float f4) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(p2, "p");
        Intrinsics.checkNotNullParameter(spanned, "spanned");
        Paint paintA = this.f.a(p2, spanned, i22, i32);
        int color = paintA.getColor();
        int i33 = this.i;
        Paint paint = this.f128025g;
        if (color != i33) {
            this.i = paintA.getColor();
            paint.setColor(paintA.getColor());
        }
        if (p2.getTextSize() != this.f128026h) {
            this.f128026h = p2.getTextSize();
            float textSize = p2.getTextSize() * 0.08f;
            paint.setStrokeWidth(textSize);
            paint.setPathEffect(new DashPathEffect(new float[]{0.001f, textSize * 2.33f}, BitmapDescriptorFactory.HUE_RED));
        }
        float textSize2 = (p2.getTextSize() * 0.25f) + i3;
        float fB = b(spanned, i6, i21) + i + f;
        canvas.drawLine(fB, textSize2, fB + f4, textSize2, paint);
    }
}
