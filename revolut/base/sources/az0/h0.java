package az0;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class h0 extends LayerDrawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f11301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Drawable f11302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bitmap f11303c;
    public final Paint d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(Drawable innerDrawable, Drawable backgroundDrawable, int i, int i2) {
        super(new Drawable[]{backgroundDrawable, innerDrawable});
        Intrinsics.checkNotNullParameter(innerDrawable, "innerDrawable");
        Intrinsics.checkNotNullParameter(backgroundDrawable, "backgroundDrawable");
        this.f11301a = innerDrawable;
        this.f11302b = backgroundDrawable;
        this.d = com.google.android.gms.internal.mlkit_vision_face.a.c(true);
        setLayerInset(1, i2, i2, i2, i2);
        backgroundDrawable.setTint(i);
        innerDrawable.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.XOR));
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.save();
        Drawable drawable = this.f11301a;
        canvas.clipRect(drawable.getBounds(), Region.Op.DIFFERENCE);
        this.f11302b.draw(canvas);
        canvas.restore();
        Bitmap bitmap = this.f11303c;
        Paint paint = this.d;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, paint);
            return;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getBounds().right, drawable.getBounds().bottom, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        drawable.draw(new Canvas(bitmapCreateBitmap));
        canvas.drawBitmap(bitmapCreateBitmap, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, paint);
        this.f11303c = bitmapCreateBitmap;
    }
}
