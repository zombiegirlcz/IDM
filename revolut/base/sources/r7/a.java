package r7;

import android.graphics.Color;
import android.graphics.Matrix;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes16.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f251928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f251929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f251930c;
    public int d;
    public float[] e = null;

    public a(float f, float f4, float f5, int i) {
        this.f251928a = f;
        this.f251929b = f4;
        this.f251930c = f5;
        this.d = i;
    }

    public final void a(a80.e eVar) {
        if (Color.alpha(this.d) > 0) {
            eVar.f1989c = this;
        } else {
            eVar.f1989c = null;
        }
    }

    public final void b(int i, e7.a aVar) {
        int iAlpha = Color.alpha(this.d);
        int iC = g.c(i);
        Matrix matrix = l.f251966a;
        int i2 = (int) ((((iAlpha / 255.0f) * iC) / 255.0f) * 255.0f);
        if (i2 <= 0) {
            aVar.clearShadowLayer();
        } else {
            aVar.setShadowLayer(Math.max(this.f251928a, Float.MIN_VALUE), this.f251929b, this.f251930c, Color.argb(i2, Color.red(this.d), Color.green(this.d), Color.blue(this.d)));
        }
    }

    public final void c(int i) {
        this.d = Color.argb(Math.round((g.c(i) * Color.alpha(this.d)) / 255.0f), Color.red(this.d), Color.green(this.d), Color.blue(this.d));
    }

    public final void d(Matrix matrix) {
        if (this.e == null) {
            this.e = new float[2];
        }
        float[] fArr = this.e;
        fArr[0] = this.f251929b;
        fArr[1] = this.f251930c;
        matrix.mapVectors(fArr);
        float[] fArr2 = this.e;
        this.f251929b = fArr2[0];
        this.f251930c = fArr2[1];
        this.f251928a = matrix.mapRadius(this.f251928a);
    }

    public a(a aVar) {
        this.f251928a = BitmapDescriptorFactory.HUE_RED;
        this.f251929b = BitmapDescriptorFactory.HUE_RED;
        this.f251930c = BitmapDescriptorFactory.HUE_RED;
        this.d = 0;
        this.f251928a = aVar.f251928a;
        this.f251929b = aVar.f251929b;
        this.f251930c = aVar.f251930c;
        this.d = aVar.d;
    }
}
