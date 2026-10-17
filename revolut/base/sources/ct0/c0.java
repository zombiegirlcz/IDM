package ct0;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.SparseIntArray;
import android.view.KeyEvent;
import android.view.View;
import androidx.collection.LongSparseArray;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class c0 implements z {

    @NotNull
    public static final a0 Companion = new a0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f108572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f108573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f108574c;
    public final Path d;
    public final Matrix e;
    public final float[] f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LongSparseArray f108575g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final SparseIntArray f108576h;
    public final float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f108577j;
    public final float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f108578l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f108579m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f108580n;
    public final float o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f108581p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f108582q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f108583r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final RadialGradient f108584s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final RadialGradient f108585t;

    /* JADX WARN: Multi-variable type inference failed */
    public c0(Context context, ts0.a hostView) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(hostView, "hostView");
        this.f108572a = context;
        this.f108573b = (View) hostView;
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setAntiAlias(true);
        this.f108574c = paint;
        this.d = new Path();
        this.e = new Matrix();
        this.f = new float[8];
        this.f108575g = new LongSparseArray(0, 1, null);
        this.f108576h = new SparseIntArray();
        this.i = kli.a.l(context, 4.0f);
        this.f108577j = kli.a.l(context, 2.0f);
        this.k = kli.a.l(context, 8.0f);
        this.f108578l = kli.a.l(context, 16.0f);
        this.f108579m = kli.a.l(context, 12.0f);
        this.f108580n = kli.a.l(context, 2.0f);
        this.o = kli.a.l(context, 60.0f);
        this.f108581p = kli.a.s(R$attr.uikit_colorGreyTone10, context);
        this.f108582q = io0.a.d(0.06f, kli.a.s(R$attr.uikit_colorForeground, context));
        this.f108583r = kli.a.s(R$attr.uikit_colorTransparent, context);
        float[] fArr = {BitmapDescriptorFactory.HUE_RED, 0.18f, 1.0f};
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f108584s = new RadialGradient(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, new int[]{-1, -1, 0}, fArr, tileMode);
        this.f108585t = new RadialGradient(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, io0.a.d(0.3f, -1), 0, tileMode);
    }

    public static int j(int i) {
        float f = i / 255.0f;
        return kotlin.ranges.f.g((int) ((f < 0.5f ? f * 0.5f : (f * 1.5f) - 0.5f) * 255.0f), 0, 255);
    }

    public final void c(u uVar, w wVar) {
        float f;
        int i = b0.f[wVar.ordinal()];
        float f4 = this.f108577j;
        if (i == 1) {
            f4 = this.i;
            f = f4;
        } else if (i == 2) {
            f = f4;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            f = BitmapDescriptorFactory.HUE_RED;
        }
        k(uVar, f4, f);
    }

    public final void d(Canvas canvas, RectF rect, t color, int i, boolean z, u direction, v position, x state) {
        int iA;
        int iValueAt;
        Intrinsics.checkNotNullParameter(canvas, "<this>");
        Intrinsics.checkNotNullParameter(rect, "rect");
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(state, "state");
        v vVar = v.TIP;
        float f = BitmapDescriptorFactory.HUE_RED;
        float fH = position == vVar ? h(rect, direction) : 0.0f;
        if (z) {
            f = fH;
        }
        k(direction, fH, f);
        KeyEvent.Callback callback = this.f108573b;
        boolean z3 = callback instanceof vs0.c;
        vs0.b selectionType = z3 ? ((vs0.c) callback).getSelectionType() : vs0.b.DEFAULT;
        int i2 = b0.d[state.ordinal()];
        if (i2 == 1 || i2 == 2) {
            iA = color.a(i);
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            int i3 = b0.f108563c[selectionType.ordinal()];
            if (i3 == 1) {
                iA = R$attr.uikit_colorDisabledBackground;
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                iA = color.a(i);
            }
        }
        SparseIntArray sparseIntArray = this.f108576h;
        int iIndexOfKey = sparseIntArray.indexOfKey(iA);
        if (iIndexOfKey < 0) {
            iValueAt = kli.a.s(iA, this.f108572a);
            sparseIntArray.put(iA, iValueAt);
        } else {
            iValueAt = sparseIntArray.valueAt(iIndexOfKey);
        }
        g(canvas, rect, iValueAt, direction, state, color == t.DIMMED ? y.SOLID : y.GRADIENT);
        x xVar = x.SELECTED;
        Matrix matrix = this.e;
        Paint paint = this.f108574c;
        if (state == xVar) {
            switch (b0.e[color.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    float fWidth = (((direction == u.UP || direction == u.DOWN) ? rect.width() : rect.height()) / 2.0f) + this.f108578l;
                    int[] iArr = b0.f108561a;
                    int i5 = iArr[direction.ordinal()];
                    float f4 = this.k;
                    float fCenterX = i5 != 1 ? i5 != 2 ? rect.centerX() : rect.right - f4 : rect.left + f4;
                    int i6 = iArr[direction.ordinal()];
                    float fCenterY = i6 != 3 ? i6 != 4 ? rect.centerY() : rect.bottom - f4 : f4 + rect.top;
                    matrix.reset();
                    matrix.postScale(fWidth, fWidth);
                    matrix.postTranslate(fCenterX, fCenterY);
                    RadialGradient radialGradient = this.f108585t;
                    radialGradient.setLocalMatrix(matrix);
                    paint.setAlpha(rim.d.c(255 * (z3 ? ((vs0.c) callback).getSelectionAnimatorValue() : 1.0f)));
                    paint.setShader(radialGradient);
                    canvas.drawPath(this.d, paint);
                    break;
                case 7:
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        if (position == vVar) {
            boolean z4 = callback instanceof vs0.a;
            if ((z4 ? ((vs0.a) callback).getHighlightAnimatorValue() : 1.0f) == 1.0f || state == x.DISABLED) {
                return;
            }
            u uVar = u.UP;
            boolean z6 = direction == uVar || direction == u.DOWN;
            float f5 = this.o;
            float fWidth2 = z6 ? rect.width() / 1.5f : f5;
            float fHeight = z6 ? f5 : rect.height() / 1.5f;
            float fMax = direction == u.RIGHT ? Math.max(rect.right - f5, rect.left) : rect.left;
            float fMax2 = direction == u.DOWN ? Math.max(rect.bottom - f5, rect.top) : rect.top;
            float fMin = direction == u.LEFT ? Math.min(rect.left + f5, rect.right) : rect.right;
            float fMin2 = direction == uVar ? Math.min(rect.top + f5, rect.bottom) : rect.bottom;
            int[] iArr2 = b0.f108561a;
            int i21 = iArr2[direction.ordinal()];
            float fCenterX2 = i21 != 1 ? i21 != 2 ? rect.centerX() : rect.right : rect.left;
            int i22 = iArr2[direction.ordinal()];
            float fCenterY2 = i22 != 3 ? i22 != 4 ? rect.centerY() : rect.bottom : rect.top;
            matrix.reset();
            matrix.postScale(fWidth2, fHeight);
            matrix.postTranslate(fCenterX2, fCenterY2);
            RadialGradient radialGradient2 = this.f108584s;
            radialGradient2.setLocalMatrix(matrix);
            paint.setAlpha(kotlin.ranges.f.g(rim.d.c((1 - (z4 ? ((vs0.a) callback).getHighlightAnimatorValue() : 1.0f)) * 255), 0, 255));
            paint.setShader(radialGradient2);
            float fH2 = h(rect, direction);
            canvas.drawRoundRect(fMax, fMax2, fMin, fMin2, fH2, fH2, paint);
        }
    }

    public final void e(Canvas canvas, RectF rect, boolean z, u direction, q style) {
        Intrinsics.checkNotNullParameter(canvas, "<this>");
        Intrinsics.checkNotNullParameter(rect, "rect");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(style, "style");
        float fH = h(rect, direction);
        k(direction, fH, z ? fH : BitmapDescriptorFactory.HUE_RED);
        int i = b0.f108562b[style.ordinal()];
        if (i == 1) {
            g(canvas, rect, this.f108581p, direction, x.NORMAL, y.SOLID);
            return;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        Path path = this.d;
        path.rewind();
        path.addRoundRect(rect, this.f, Path.Direction.CW);
        int i2 = this.f108581p;
        Paint paint = this.f108574c;
        paint.setColor(i2);
        paint.setShader(i(rect, direction, this.f108582q, this.f108583r));
        canvas.drawPath(path, paint);
    }

    public final void f(Canvas canvas, RectF rect, int i, u direction, w segment) {
        Intrinsics.checkNotNullParameter(canvas, "<this>");
        Intrinsics.checkNotNullParameter(rect, "rect");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(segment, "segment");
        c(direction, segment);
        Path path = this.d;
        path.rewind();
        path.addRoundRect(rect, this.f, Path.Direction.CW);
        LinearGradient linearGradientI = i(rect, direction, i, this.f108583r);
        Paint paint = this.f108574c;
        paint.setShader(linearGradientI);
        canvas.drawPath(path, paint);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(android.graphics.Canvas r7, android.graphics.RectF r8, int r9, ct0.u r10, ct0.x r11, ct0.y r12) {
        /*
            r6 = this;
            android.graphics.Path r0 = r6.d
            r0.rewind()
            float[] r1 = r6.f
            android.graphics.Path$Direction r2 = android.graphics.Path.Direction.CW
            r0.addRoundRect(r8, r1, r2)
            ct0.x r1 = ct0.x.DISABLED
            android.view.View r2 = r6.f108573b
            if (r11 != r1) goto L2c
            boolean r3 = r2 instanceof vs0.c
            if (r3 == 0) goto L1e
            r3 = r2
            vs0.c r3 = (vs0.c) r3
            vs0.b r3 = r3.getSelectionType()
            goto L20
        L1e:
            vs0.b r3 = vs0.b.DEFAULT
        L20:
            vs0.b r4 = vs0.b.ALWAYS_SELECTED
            if (r3 != r4) goto L2c
            r3 = 1058642330(0x3f19999a, float:0.6)
            int r3 = io0.a.b(r3, r9)
            goto L2d
        L2c:
            r3 = r9
        L2d:
            android.graphics.Paint r4 = r6.f108574c
            r4.setColor(r3)
            ct0.y r3 = ct0.y.GRADIENT
            r5 = 0
            if (r12 == r3) goto L38
            goto L70
        L38:
            if (r11 != r1) goto L4c
            boolean r11 = r2 instanceof vs0.c
            if (r11 == 0) goto L45
            vs0.c r2 = (vs0.c) r2
            vs0.b r11 = r2.getSelectionType()
            goto L47
        L45:
            vs0.b r11 = vs0.b.DEFAULT
        L47:
            vs0.b r12 = vs0.b.ALWAYS_SELECTED
            if (r11 == r12) goto L4c
            goto L70
        L4c:
            int r11 = android.graphics.Color.alpha(r9)
            int r12 = android.graphics.Color.red(r9)
            int r12 = j(r12)
            int r1 = android.graphics.Color.green(r9)
            int r1 = j(r1)
            int r2 = android.graphics.Color.blue(r9)
            int r2 = j(r2)
            int r11 = android.graphics.Color.argb(r11, r12, r1, r2)
            android.graphics.LinearGradient r5 = r6.i(r8, r10, r9, r11)
        L70:
            r4.setShader(r5)
            r7.drawPath(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ct0.c0.g(android.graphics.Canvas, android.graphics.RectF, int, ct0.u, ct0.x, ct0.y):void");
    }

    public final float h(RectF rectF, u uVar) {
        int i = b0.f108561a[uVar.ordinal()];
        float f = this.f108580n;
        float f4 = this.i;
        float f5 = this.f108579m;
        if (i == 1 || i == 2) {
            return rectF.bottom - rectF.top >= f5 ? f4 : f;
        }
        if (i == 3 || i == 4) {
            return rectF.right - rectF.left >= f5 ? f4 : f;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final LinearGradient i(RectF rectF, u uVar, int i, int i2) {
        long j2 = (((long) i2) << 32) | (((long) i) & BodyPartID.bodyIdMax);
        LongSparseArray longSparseArray = this.f108575g;
        LinearGradient linearGradient = (LinearGradient) longSparseArray.get(j2);
        if (linearGradient == null) {
            linearGradient = new LinearGradient(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, i2, i, Shader.TileMode.CLAMP);
            longSparseArray.put(j2, linearGradient);
        }
        float f = rectF.right - rectF.left;
        float f4 = rectF.bottom - rectF.top;
        Matrix matrix = this.e;
        matrix.reset();
        int i3 = b0.f108561a[uVar.ordinal()];
        if (i3 == 1) {
            matrix.setRotate(-90.0f);
            matrix.postScale(f, 1.0f);
            matrix.postTranslate(rectF.left, BitmapDescriptorFactory.HUE_RED);
        } else if (i3 == 2) {
            matrix.setRotate(-90.0f);
            matrix.postScale(-f, 1.0f);
            matrix.postTranslate(rectF.right, BitmapDescriptorFactory.HUE_RED);
        } else if (i3 == 3) {
            matrix.setScale(1.0f, f4);
            matrix.postTranslate(BitmapDescriptorFactory.HUE_RED, rectF.top);
        } else {
            if (i3 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            matrix.setScale(1.0f, -f4);
            matrix.postTranslate(BitmapDescriptorFactory.HUE_RED, rectF.bottom);
        }
        linearGradient.setLocalMatrix(matrix);
        return linearGradient;
    }

    public final void k(u uVar, float f, float f4) {
        u uVar2 = u.UP;
        float f5 = (uVar == uVar2 || uVar == u.LEFT) ? f : f4;
        float f6 = (uVar == uVar2 || uVar == u.RIGHT) ? f : f4;
        u uVar3 = u.DOWN;
        float f32 = (uVar == uVar3 || uVar == u.RIGHT) ? f : f4;
        if (uVar != uVar3 && uVar != u.LEFT) {
            f = f4;
        }
        float[] fArr = this.f;
        fArr[0] = f5;
        fArr[1] = f5;
        fArr[2] = f6;
        fArr[3] = f6;
        fArr[4] = f32;
        fArr[5] = f32;
        fArr[6] = f;
        fArr[7] = f;
    }
}
