package n7;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.LottieDrawable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import d7.f0;
import g7.u;

/* JADX INFO: loaded from: classes16.dex */
public final class k extends b {
    public final RectF D;
    public final e7.a E;
    public final float[] F;
    public final Path G;
    public final h H;
    public u I;
    public u J;

    public k(LottieDrawable lottieDrawable, h hVar) {
        super(lottieDrawable, hVar);
        this.D = new RectF();
        e7.a aVar = new e7.a();
        this.E = aVar;
        this.F = new float[8];
        this.G = new Path();
        this.H = hVar;
        aVar.setAlpha(0);
        aVar.setStyle(Paint.Style.FILL);
        aVar.setColor(hVar.f212954l);
    }

    @Override // n7.b, f7.f
    public final void a(RectF rectF, Matrix matrix, boolean z) {
        super.a(rectF, matrix, z);
        h hVar = this.H;
        float f = hVar.f212953j;
        float f4 = hVar.k;
        RectF rectF2 = this.D;
        rectF2.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f, f4);
        this.f212938n.mapRect(rectF2);
        rectF.set(rectF2);
    }

    @Override // n7.b, k7.g
    public final void f(Object obj2, s7.c cVar) {
        super.f(obj2, cVar);
        if (obj2 == f0.I) {
            if (cVar == null) {
                this.I = null;
                return;
            } else {
                this.I = new u(null, cVar);
                return;
            }
        }
        if (obj2 == 1) {
            if (cVar != null) {
                this.J = new u(null, cVar);
                return;
            }
            this.J = null;
            this.E.setColor(this.H.f212954l);
        }
    }

    @Override // n7.b
    public final void i(Canvas canvas, Matrix matrix, int i, r7.a aVar) {
        h hVar = this.H;
        int iAlpha = Color.alpha(hVar.f212954l);
        if (iAlpha == 0) {
            return;
        }
        u uVar = this.J;
        Integer num = uVar == null ? null : (Integer) uVar.f();
        e7.a aVar2 = this.E;
        if (num != null) {
            aVar2.setColor(num.intValue());
        } else {
            aVar2.setColor(hVar.f212954l);
        }
        int iIntValue = (int) ((((iAlpha / 255.0f) * (this.f212944w.f141063p == null ? 100 : ((Integer) r2.f()).intValue())) / 100.0f) * (i / 255.0f) * 255.0f);
        aVar2.setAlpha(iIntValue);
        if (aVar == null || Color.alpha(aVar.d) <= 0) {
            aVar2.clearShadowLayer();
        } else {
            aVar2.setShadowLayer(Math.max(aVar.f251928a, Float.MIN_VALUE), aVar.f251929b, aVar.f251930c, aVar.d);
        }
        u uVar2 = this.I;
        if (uVar2 != null) {
            aVar2.setColorFilter((ColorFilter) uVar2.f());
        }
        if (iIntValue > 0) {
            float[] fArr = this.F;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            float f = hVar.f212953j;
            fArr[2] = f;
            fArr[3] = 0.0f;
            fArr[4] = f;
            float f4 = hVar.k;
            fArr[5] = f4;
            fArr[6] = 0.0f;
            fArr[7] = f4;
            matrix.mapPoints(fArr);
            Path path = this.G;
            path.reset();
            path.moveTo(fArr[0], fArr[1]);
            path.lineTo(fArr[2], fArr[3]);
            path.lineTo(fArr[4], fArr[5]);
            path.lineTo(fArr[6], fArr[7]);
            path.lineTo(fArr[0], fArr[1]);
            path.close();
            canvas.drawPath(path, aVar2);
        }
    }
}
