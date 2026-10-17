package ms0;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class p extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bitmap f208357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bitmap f208358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f208359c;
    public final Paint d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Context context, Bitmap firstBitmap, Bitmap secondBitmap) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(firstBitmap, "firstBitmap");
        Intrinsics.checkNotNullParameter(secondBitmap, "secondBitmap");
        this.f208357a = firstBitmap;
        this.f208358b = secondBitmap;
        this.d = new Paint();
        setWillNotDraw(false);
    }

    public final float getProgress() {
        return this.f208359c;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int iC = (int) ix0.i1.c(1 - this.f208359c, 0, 255);
        Paint paint = this.d;
        paint.setAlpha(iC);
        if (paint.getAlpha() != 0) {
            canvas.drawBitmap(this.f208357a, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, paint);
        }
        paint.setAlpha((int) ix0.i1.c(this.f208359c, 0, 255));
        if (paint.getAlpha() != 0) {
            canvas.drawBitmap(this.f208358b, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, paint);
        }
    }

    public final void setProgress(float f) {
        if (f == this.f208359c) {
            return;
        }
        this.f208359c = f;
        invalidate();
    }
}
