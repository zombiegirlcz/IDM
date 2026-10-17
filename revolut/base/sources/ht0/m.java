package ht0;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntObjectMap;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class m {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f155163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MutableIntObjectMap f155164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f155165c;
    public final float[] d;

    public m(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f155163a = kli.a.l(context, 1.0f);
        this.f155164b = IntObjectMapKt.mutableIntObjectMapOf();
        this.f155165c = new int[5];
        this.d = new float[5];
    }

    public final Paint a(float f, float f4, float f5, float f6, int i, int i2) {
        float fAbs = Math.abs(f4);
        float fMin = Math.min(1.0f, Math.max(BitmapDescriptorFactory.HUE_RED, (fAbs > BitmapDescriptorFactory.HUE_RED ? f6 / fAbs : 1.0f) * f5));
        float fMax = Math.max(BitmapDescriptorFactory.HUE_RED, fMin - 0.15f);
        float fMin2 = Math.min(1.0f, 0.15f + fMin);
        MutableIntObjectMap mutableIntObjectMap = this.f155164b;
        Object obj2 = mutableIntObjectMap.get(i2);
        Object obj3 = obj2;
        if (obj2 == null) {
            Paint paint = new Paint(1);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(this.f155163a);
            mutableIntObjectMap.set(i2, paint);
            obj3 = paint;
        }
        Paint paint2 = (Paint) obj3;
        int[] iArr = this.f155165c;
        iArr[0] = 0;
        iArr[1] = i;
        iArr[2] = -1;
        iArr[3] = i;
        iArr[4] = 0;
        float[] fArr = this.d;
        fArr[0] = 0.0f;
        if (fMax < 1.0E-4f) {
            fMax = 1.0E-4f;
        }
        fArr[1] = fMax;
        fArr[2] = kotlin.ranges.f.f(fMin, 2.0E-4f, 0.99998f);
        if (fMin2 > 0.9999f) {
            fMin2 = 0.9999f;
        }
        fArr[3] = fMin2;
        fArr[4] = 1.0f;
        paint2.setShader(new LinearGradient(f, BitmapDescriptorFactory.HUE_RED, f, f4, this.f155165c, this.d, Shader.TileMode.CLAMP));
        return paint2;
    }
}
