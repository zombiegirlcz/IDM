package ct0;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.collection.MutableFloatObjectMap;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes19.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f108564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f108565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f108566c;
    public final float d;
    public final Paint e;
    public final Matrix f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public RadialGradient f108567g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public RadialGradient f108568h;
    public float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f108569j;
    public final MutableFloatObjectMap k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public List f108570l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f108571m;

    public c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f108564a = kli.a.q(context);
        this.f108565b = kli.a.s(R$attr.uikit_colorForeground, context);
        this.f108566c = kli.a.l(context, 24.0f);
        this.d = kli.a.l(context, 36.0f);
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(kli.a.l(context, 0.5f));
        this.e = paint;
        this.f = new Matrix();
        this.i = -1.0f;
        this.f108569j = -1.0f;
        this.k = new MutableFloatObjectMap(0, 1, null);
        this.f108570l = f0.f322471a;
        this.f108571m = Integer.MIN_VALUE;
    }

    public final void a(Canvas canvas, RectF rect) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(rect, "rect");
        float f = rect.top;
        float f4 = rect.bottom;
        float f5 = rect.left;
        float f6 = rect.right;
        float f32 = f4 - f;
        if (f32 <= BitmapDescriptorFactory.HUE_RED || f6 - f5 <= BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        int iG = kotlin.ranges.f.g((int) (f32 / this.f108566c), 1, 7);
        RadialGradient radialGradientE = e(f5, f, f6, f4);
        Paint paint = this.e;
        paint.setShader(radialGradientE);
        float f35 = f32 / iG;
        if (iG >= 0) {
            int i = 0;
            while (true) {
                float f36 = f4 - (i * f35);
                Canvas canvas2 = canvas;
                canvas2.drawLine(f5, f36, f6, f36, paint);
                if (i == iG) {
                    break;
                }
                i++;
                canvas = canvas2;
            }
        }
        paint.setShader(null);
    }

    public final void b(Canvas canvas, List peakPositions, float f, float f4, float f5, float f6, int i, b bVar) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(peakPositions, "peakPositions");
        ir0.g.Companion.getClass();
        if (f <= BitmapDescriptorFactory.HUE_RED || f4 <= BitmapDescriptorFactory.HUE_RED || Math.abs(f) > Float.MAX_VALUE || Math.abs(f4) > Float.MAX_VALUE) {
            return;
        }
        if (f != this.i || f4 != this.f108569j) {
            float f32 = f / 2.0f;
            float f35 = f4 / 2.0f;
            RadialGradient radialGradient = new RadialGradient(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, new int[]{io0.a.d(0.24f, this.f108565b), 0}, (float[]) null, Shader.TileMode.CLAMP);
            Matrix matrix = this.f;
            matrix.reset();
            matrix.setScale(f32 * 1.3f, 1.3f * f35);
            matrix.postTranslate(f32, -f35);
            radialGradient.setLocalMatrix(matrix);
            this.f108568h = radialGradient;
            this.i = f;
            this.f108569j = f4;
        }
        c(canvas, this.f108568h, f, f4, f5, f6);
        if (bVar == null) {
            d(canvas, peakPositions, f, f4, f5, f6, i);
            return;
        }
        float f36 = bVar.f108560b;
        int iSave = canvas.save();
        canvas.clipRect(bVar.f108559a, -f4, f36, BitmapDescriptorFactory.HUE_RED);
        try {
            d(canvas, peakPositions, f, f4, f5, f6, i);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    public final void c(Canvas canvas, RadialGradient radialGradient, float f, float f4, float f5, float f6) {
        Paint paint = this.e;
        paint.setShader(radialGradient);
        float f32 = (f6 - f5) / 7;
        float f35 = f / 9.0f;
        int i = 0;
        while (i < 8) {
            float f36 = (i * f32) + f5;
            int i2 = i + 1;
            float f37 = i2 * f35;
            Canvas canvas2 = canvas;
            float f41 = f;
            canvas2.drawLine(BitmapDescriptorFactory.HUE_RED, f36, f41, f36, paint);
            canvas2.drawLine(f37, -f4, f37, BitmapDescriptorFactory.HUE_RED, paint);
            f = f41;
            canvas = canvas2;
            i = i2;
        }
        paint.setShader(null);
    }

    public final void d(Canvas canvas, List list, float f, float f4, float f5, float f6, int i) {
        c cVar = this;
        if (!cVar.f108564a || list.isEmpty()) {
            return;
        }
        int iD = io0.a.d(0.3f, i);
        List list2 = cVar.f108570l;
        MutableFloatObjectMap mutableFloatObjectMap = cVar.k;
        if (list != list2 || iD != cVar.f108571m) {
            mutableFloatObjectMap.clear();
            cVar.f108570l = list;
            cVar.f108571m = iD;
        }
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            PointF pointF = (PointF) list.get(i2);
            if (Math.abs(pointF.x) <= Float.MAX_VALUE && Math.abs(pointF.y) <= Float.MAX_VALUE) {
                float f32 = pointF.x;
                Object obj2 = mutableFloatObjectMap.get(f32);
                if (obj2 == null) {
                    RadialGradient radialGradient = new RadialGradient(pointF.x, pointF.y, cVar.d, new int[]{iD, 0}, (float[]) null, Shader.TileMode.CLAMP);
                    mutableFloatObjectMap.set(f32, radialGradient);
                    obj2 = radialGradient;
                }
                RadialGradient radialGradient2 = (RadialGradient) obj2;
                float f35 = pointF.x;
                float f36 = cVar.d;
                float f37 = pointF.y;
                int iSave = canvas.save();
                canvas.clipRect(f35 - f36, f37 - f36, f35 + f36, f37 + f36);
                try {
                    cVar.c(canvas, radialGradient2, f, f4, f5, f6);
                } finally {
                    canvas.restoreToCount(iSave);
                }
            }
            i2++;
            cVar = this;
        }
    }

    public final RadialGradient e(float f, float f4, float f5, float f6) {
        RadialGradient radialGradient = this.f108567g;
        if (radialGradient == null) {
            RadialGradient radialGradient2 = new RadialGradient(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, new int[]{io0.a.d(0.24f, this.f108565b), 0}, (float[]) null, Shader.TileMode.CLAMP);
            this.f108567g = radialGradient2;
            radialGradient = radialGradient2;
        }
        float f32 = (f5 - f) / 2.0f;
        float f35 = (f6 - f4) / 2.0f;
        Matrix matrix = this.f;
        matrix.reset();
        matrix.setScale(f32 * 1.3f, 1.3f * f35);
        matrix.postTranslate(f + f32, f4 + f35);
        radialGradient.setLocalMatrix(matrix);
        return radialGradient;
    }
}
