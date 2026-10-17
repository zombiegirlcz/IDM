package au0;

import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class n5 {

    @NotNull
    public static final m5 Companion = new m5();
    public static final float[] f = {BitmapDescriptorFactory.HUE_RED, 0.12f, 0.21f, 0.29f, 0.35f, 0.4f, 0.45f, 0.48f, 0.52f, 0.55f, 0.6f, 0.65f, 0.71f, 0.79f, 0.88f, 1.0f};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f9288g = {-16777216, io0.a.d(0.99f, -16777216), io0.a.d(0.97f, -16777216), io0.a.d(0.93f, -16777216), io0.a.d(0.88f, -16777216), io0.a.d(0.82f, -16777216), io0.a.d(0.75f, -16777216), io0.a.d(0.67f, -16777216), io0.a.d(0.59f, -16777216), io0.a.d(0.5f, -16777216), io0.a.d(0.41f, -16777216), io0.a.d(0.33f, -16777216), io0.a.d(0.24f, -16777216), io0.a.d(0.15f, -16777216), io0.a.d(0.07f, -16777216), 0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f9289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f9290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9291c;
    public int d;
    public float e;

    public n5(float f4) {
        this.f9289a = f4;
        Paint paint = new Paint(1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        this.f9290b = paint;
    }

    public final void a(int i, int i2, int i3) {
        this.f9291c = i;
        this.d = i2;
        Paint paint = this.f9290b;
        if (i > 0 && i2 > 0) {
            float f4 = this.f9289a;
            if (f4 > BitmapDescriptorFactory.HUE_RED) {
                float f5 = (i2 - i3) - f4;
                this.e = f5;
                paint.setShader(new LinearGradient(BitmapDescriptorFactory.HUE_RED, this.e, BitmapDescriptorFactory.HUE_RED, f5 + f4, f9288g, f, Shader.TileMode.CLAMP));
                return;
            }
        }
        paint.setShader(null);
    }
}
