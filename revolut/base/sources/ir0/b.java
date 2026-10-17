package ir0;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.PathMeasure;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.view.View;
import androidx.collection.MutableIntIntMap;
import androidx.collection.MutableIntObjectMap;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes19.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f167922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f167923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f167924c;
    public final float d;
    public float[] e;
    public Path f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PathMeasure f167925g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f167926h;
    public List i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f167927j;
    public final float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f167928l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final MutableIntIntMap f167929m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final MutableIntObjectMap f167930n;
    public final Paint o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Path f167931p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Matrix f167932q;

    public b(View hostView, g glowableElement) {
        Intrinsics.checkNotNullParameter(hostView, "hostView");
        Intrinsics.checkNotNullParameter(glowableElement, "glowableElement");
        this.f167922a = glowableElement;
        this.f167923b = hostView.getContext();
        Context context = hostView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.f167924c = kli.a.q(context);
        this.d = r6.b.a(hostView, "getContext(...)", 1.0f);
        this.f167926h = new HashMap();
        this.i = f0.f322471a;
        this.f167927j = Integer.MIN_VALUE;
        this.k = r6.b.a(hostView, "getContext(...)", 17.0f);
        Context context2 = hostView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.f167928l = kli.a.s(R$attr.uikit_colorGreyTone20, context2);
        this.f167929m = new MutableIntIntMap(0, 1, null);
        this.f167930n = new MutableIntObjectMap(0, 1, null);
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.o = paint;
        this.f167931p = new Path();
        this.f167932q = new Matrix();
    }

    public static boolean a(hw0.j jVar, int i, Integer num) {
        Boolean boolValueOf;
        if (num != null) {
            boolean z = true;
            if (jVar instanceof hw0.h) {
                if (i >= num.intValue()) {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            } else {
                if (jVar instanceof hw0.g) {
                    if (i < num.intValue()) {
                    }
                    boolValueOf = Boolean.valueOf(z);
                } else if (jVar != null) {
                    throw new NoWhenBranchMatchedException();
                }
                z = false;
                boolValueOf = Boolean.valueOf(z);
            }
        } else {
            boolValueOf = null;
        }
        return pd.b.j(boolValueOf);
    }

    public final void b(Canvas canvas, Path path, List peakXPositions) {
        b bVar = this;
        Canvas canvas2 = canvas;
        Intrinsics.checkNotNullParameter(canvas2, "canvas");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(peakXPositions, "peakXPositions");
        if (!bVar.f167924c) {
            return;
        }
        g.Companion.getClass();
        if (peakXPositions.isEmpty()) {
            return;
        }
        g gVar = bVar.f167922a;
        float fA = gVar.a();
        int iP = gVar.p();
        PathEffect pathEffect = gVar.getPathEffect();
        Shader shader = gVar.getShader();
        gVar.h(1.0f);
        float[] fArr = null;
        gVar.s(null);
        Color.INSTANCE.getClass();
        float[] fArr2 = Color.f51457a;
        android.graphics.Color.colorToHSV(iP, fArr2);
        float f = fArr2[1];
        float f4 = BitmapDescriptorFactory.HUE_RED;
        fArr2[1] = f < 0.2f ? 0.0f : 0.31f;
        fArr2[2] = 0.96f;
        int iHSVToColor = android.graphics.Color.HSVToColor(android.graphics.Color.alpha(iP), fArr2);
        if (peakXPositions != bVar.i || iHSVToColor != bVar.f167927j) {
            bVar.f167926h.clear();
            bVar.i = peakXPositions;
            bVar.f167927j = iHSVToColor;
        }
        Path path2 = bVar.f;
        if (path2 == null) {
            path2 = new Path();
            bVar.f = path2;
        }
        Path path3 = path2;
        try {
            PathMeasure pathMeasure = bVar.f167925g;
            if (pathMeasure == null) {
                pathMeasure = new PathMeasure();
                bVar.f167925g = pathMeasure;
            }
            float[] fArr3 = bVar.e;
            if (fArr3 == null) {
                fArr3 = new float[2];
                bVar.e = fArr3;
            }
            char c2 = 0;
            pathMeasure.setPath(path, false);
            while (true) {
                pathMeasure.getPosTan(f4, fArr3, fArr);
                float f5 = fArr3[c2];
                char c3 = c2;
                pathMeasure.getPosTan(pathMeasure.getLength(), fArr3, fArr);
                float f6 = fArr3[c3];
                or0.d dVar = f5 <= f6 ? or0.d.LEFT_TO_RIGHT : or0.d.RIGHT_TO_LEFT;
                Iterator it8 = peakXPositions.iterator();
                while (it8.hasNext()) {
                    float[] fArr4 = fArr3;
                    float f32 = f5;
                    float[] fArr5 = fArr;
                    PathMeasure pathMeasure2 = pathMeasure;
                    char c5 = c3;
                    float f35 = f4;
                    or0.d dVar2 = dVar;
                    bVar.d(pathMeasure2, canvas2, ((Number) it8.next()).floatValue(), f32, f6, dVar2, path3, iHSVToColor);
                    fArr3 = fArr4;
                    f5 = f32;
                    dVar = dVar2;
                    f4 = f35;
                    c3 = c5;
                    bVar = this;
                    canvas2 = canvas;
                    pathMeasure = pathMeasure2;
                    fArr = fArr5;
                }
                float[] fArr6 = fArr;
                PathMeasure pathMeasure3 = pathMeasure;
                float[] fArr7 = fArr3;
                char c6 = c3;
                float f36 = f4;
                if (!pathMeasure3.nextContour()) {
                    gVar.h(fA);
                    gVar.d(iP);
                    gVar.s(pathEffect);
                    gVar.setShader(shader);
                    return;
                }
                bVar = this;
                canvas2 = canvas;
                fArr3 = fArr7;
                pathMeasure = pathMeasure3;
                f4 = f36;
                c2 = c6;
                fArr = fArr6;
            }
        } catch (Throwable th10) {
            gVar.h(fA);
            gVar.d(iP);
            gVar.s(pathEffect);
            gVar.setShader(shader);
            throw th10;
        }
    }

    public final void c(Canvas canvas, Path path, float f, float f4, float f5, float f6, int i) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(path, "path");
        if (path.isEmpty()) {
            return;
        }
        Path path2 = this.f167931p;
        path2.rewind();
        path2.addPath(path);
        path2.lineTo(f4, f6);
        path2.lineTo(f, f6);
        path2.close();
        MutableIntObjectMap mutableIntObjectMap = this.f167930n;
        Object obj2 = mutableIntObjectMap.get(i);
        if (obj2 == null) {
            LinearGradient linearGradient = new LinearGradient(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, i, 0, Shader.TileMode.CLAMP);
            mutableIntObjectMap.set(i, linearGradient);
            obj2 = linearGradient;
        }
        LinearGradient linearGradient2 = (LinearGradient) obj2;
        Matrix matrix = this.f167932q;
        matrix.reset();
        matrix.setScale(1.0f, f6 - f5);
        matrix.postTranslate(BitmapDescriptorFactory.HUE_RED, f5);
        linearGradient2.setLocalMatrix(matrix);
        Paint paint = this.o;
        paint.setShader(linearGradient2);
        canvas.drawPath(path2, paint);
    }

    public final void d(PathMeasure pathMeasure, Canvas canvas, float f, float f4, float f5, or0.d dVar, Path path, int i) {
        float f6;
        float f32 = f5 - f4;
        float[] fArr = this.e;
        if (fArr == null) {
            fArr = new float[2];
            this.e = fArr;
        }
        float f35 = BitmapDescriptorFactory.HUE_RED;
        Float fD = c8g.a.d(pathMeasure, fArr, BitmapDescriptorFactory.HUE_RED, pathMeasure.getLength(), f, dVar);
        if (fD != null) {
            f6 = fD.floatValue();
        } else if (f32 == BitmapDescriptorFactory.HUE_RED) {
            return;
        } else {
            f6 = kotlin.ranges.f.f((f - f4) / f32, BitmapDescriptorFactory.HUE_RED, 1.0f) * pathMeasure.getLength();
        }
        float[] fArr2 = this.e;
        if (fArr2 == null) {
            fArr2 = new float[2];
            this.e = fArr2;
        }
        pathMeasure.getPosTan(f6, fArr2, null);
        float[] fArr3 = this.e;
        if (fArr3 == null) {
            fArr3 = new float[2];
            this.e = fArr3;
        }
        float f36 = fArr3[0];
        float[] fArr4 = this.e;
        if (fArr4 == null) {
            fArr4 = new float[2];
            this.e = fArr4;
        }
        float f37 = fArr4[1];
        path.reset();
        float f41 = this.k;
        float f42 = f6 - f41;
        if (f42 >= BitmapDescriptorFactory.HUE_RED) {
            f35 = f42;
        }
        float f57 = f6 + f41;
        float length = pathMeasure.getLength();
        if (f57 > length) {
            f57 = length;
        }
        pathMeasure.getSegment(f35, f57, path, true);
        if (path.isEmpty()) {
            return;
        }
        Float fValueOf = Float.valueOf(f);
        HashMap map = this.f167926h;
        Object obj2 = map.get(fValueOf);
        if (obj2 == null) {
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            RadialGradient radialGradient = new RadialGradient(f36, f37, this.k, new int[]{i, 0}, (float[]) null, tileMode);
            map.put(fValueOf, radialGradient);
            obj2 = radialGradient;
        }
        g gVar = this.f167922a;
        gVar.setShader((Shader) obj2);
        gVar.e(canvas, path, false, true);
    }

    public final void e(Canvas canvas, Path path) {
        int iS;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(path, "path");
        float f = this.d;
        g gVar = this.f167922a;
        gVar.r(f);
        gVar.g(51);
        int i = R$attr.uikit_colorAccentNeutral;
        MutableIntIntMap mutableIntIntMap = this.f167929m;
        int iFindKeyIndex = mutableIntIntMap.findKeyIndex(i);
        if (iFindKeyIndex < 0) {
            Context context = this.f167923b;
            Intrinsics.checkNotNullExpressionValue(context, "context");
            iS = kli.a.s(i, context);
            mutableIntIntMap.put(i, iS);
        } else {
            iS = mutableIntIntMap.values[iFindKeyIndex];
        }
        gVar.d(io0.a.d(0.2f, iS));
        gVar.e(canvas, path, true, true);
    }
}
