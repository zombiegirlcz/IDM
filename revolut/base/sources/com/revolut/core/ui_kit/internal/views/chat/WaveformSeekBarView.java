package com.revolut.core.ui_kit.internal.views.chat;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit_resources.R$attr;
import d70.a;
import d70.b;
import d70.c;
import et0.a1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;
import org.jetbrains.annotations.NotNull;
import rim.d;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0019B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u000eJ\r\u0010\u0013\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u000eJ\u0017\u0010\u0017\u001a\u00020\f2\b\b\u0001\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/chat/WaveformSeekBarView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "value", "", "setProgressInternal", "(J)V", "Ld70/a;", "setAmplitudes", "(Ld70/a;)V", "setProgress", "getProgress", "()J", "setMax", "colorAttrId", "setProgressColor", "(I)V", "Let0/a1;", "listener", "setProgressTrackingListener", "(Let0/a1;)V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WaveformSeekBarView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f56860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f56861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f56862c;
    public final float d;
    public final Path e;
    public final Paint f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Matrix f56863g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int[] f56864h;
    public final float[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c f56865j;
    public a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f56866l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f56867m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f56868n;
    public a1 o;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WaveformSeekBarView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void setProgressInternal(long value) {
        long jI = f.i(value, 0L, this.f56868n);
        if (this.f56867m != jI) {
            this.f56867m = jI;
            b();
        }
    }

    public final c a(a elements) {
        float width = getWidth();
        float f = this.f56861b;
        int i = ((int) ((width - f) / (this.f56860a + f))) + 1;
        c cVar = new c(i);
        int i2 = elements.f111733b;
        if (i2 <= i) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            cVar.c(cVar.f111733b, elements);
            int i3 = i - elements.f111733b;
            for (int i5 = 0; i5 < i3; i5++) {
                cVar.b((byte) 0);
            }
        } else {
            float f4 = i2 / i;
            int i6 = 0;
            while (i6 < i) {
                i6++;
                int iMin = Math.min(elements.f111733b - 1, (int) Math.ceil(i6 * f4));
                byte bMax = 0;
                for (int iMin2 = Math.min(elements.f111733b - 1, (int) (i6 * f4)); iMin2 < iMin; iMin2++) {
                    bMax = (byte) Math.max((int) bMax, (int) elements.a(iMin2));
                }
                cVar.b(bMax);
            }
        }
        return cVar;
    }

    public final void b() {
        float width;
        if (this.f56867m == 0 || this.f56868n == 0) {
            width = 0.0f;
        } else {
            width = (this.f56867m / this.f56868n) * getWidth();
        }
        Matrix matrix = this.f56863g;
        matrix.reset();
        matrix.setTranslate(width - getWidth(), BitmapDescriptorFactory.HUE_RED);
        Shader shader = this.f.getShader();
        if (shader != null) {
            shader.setLocalMatrix(matrix);
        }
        invalidate();
    }

    public final void c() {
        Path path = this.e;
        path.reset();
        if (this.f56865j.f111733b == 0) {
            invalidate();
        } else {
            float height = getHeight();
            float f = 2;
            float f4 = height / f;
            int i = this.f56865j.f111733b - 1;
            float width = getWidth();
            c cVar = this.f56865j;
            int i2 = cVar.f111733b;
            float f5 = this.f56860a;
            float f6 = i;
            float f32 = this.f56861b;
            float f35 = (width - (i2 * f5)) - (f6 * f32);
            if (i != 0) {
                f32 += f35 / f6;
            }
            float f36 = f32;
            byte[] bArr = cVar.f111732a;
            for (int i3 = 0; i3 < i2; i3++) {
                float fMax = Math.max(Math.min((bArr[i3] / 100) * height, height), this.f56862c);
                float f37 = f4 - (fMax / f);
                float f41 = f37 + fMax;
                float f42 = (f5 + f36) * i3;
                float f57 = f42 + f5;
                float f69 = this.d;
                path.addRoundRect(f42, f37, f57, f41, f69, f69, Path.Direction.CW);
            }
            invalidate();
        }
        b();
    }

    public final void d(MotionEvent motionEvent) {
        float x3 = motionEvent.getX();
        setProgressInternal(d.d((x3 / getWidth()) * this.f56868n));
    }

    /* JADX INFO: renamed from: getProgress, reason: from getter */
    public final long getF56867m() {
        return this.f56867m;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        canvas.drawPath(this.e, this.f);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i5) {
        super.onLayout(z, i, i2, i3, i5);
        this.f56865j = a(this.k);
        float width = getWidth();
        float[] fArr = this.i;
        fArr[1] = width;
        fArr[3] = width;
        this.f.setShader(new LinearGradient(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, width, BitmapDescriptorFactory.HUE_RED, this.f56864h, this.i, Shader.TileMode.CLAMP));
        c();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            java.lang.String r0 = "event"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            d70.a r0 = r6.k
            int r0 = r0.f111733b
            if (r0 != 0) goto Lc
            goto L12
        Lc:
            boolean r0 = r6.isEnabled()
            if (r0 != 0) goto L17
        L12:
            boolean r7 = super.onTouchEvent(r7)
            return r7
        L17:
            int r0 = r7.getAction()
            r1 = 1
            if (r0 == 0) goto L50
            if (r0 == r1) goto L40
            r2 = 2
            if (r0 == r2) goto L2b
            r2 = 3
            if (r0 == r2) goto L40
            boolean r7 = super.onTouchEvent(r7)
            return r7
        L2b:
            r6.f56866l = r1
            long r2 = r6.f56867m
            r6.d(r7)
            long r4 = r6.f56867m
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 == 0) goto L67
            et0.a1 r7 = r6.o
            if (r7 == 0) goto L67
            r7.B(r4)
            return r1
        L40:
            r6.d(r7)
            r7 = 0
            r6.f56866l = r7
            et0.a1 r7 = r6.o
            if (r7 == 0) goto L67
            long r2 = r6.f56867m
            r7.g(r2)
            return r1
        L50:
            r6.f56866l = r1
            android.view.ViewParent r0 = r6.getParent()
            if (r0 == 0) goto L5b
            r0.requestDisallowInterceptTouchEvent(r1)
        L5b:
            r6.d(r7)
            et0.a1 r7 = r6.o
            if (r7 == 0) goto L67
            long r2 = r6.f56867m
            r7.B(r2)
        L67:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.internal.views.chat.WaveformSeekBarView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setAmplitudes(@NotNull a value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (Intrinsics.f(this.k, value)) {
            return;
        }
        this.f56866l = false;
        this.k = value;
        this.f56865j = a(value);
        c();
    }

    public final void setMax(long value) {
        if (this.f56868n != value) {
            long jMax = Math.max(0L, value);
            this.f56868n = jMax;
            this.f56867m = Math.min(this.f56867m, jMax);
            b();
        }
    }

    public final void setProgress(long value) {
        if (this.f56866l) {
            return;
        }
        setProgressInternal(value);
    }

    public final void setProgressColor(int colorAttrId) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iS = kli.a.s(colorAttrId, context);
        int[] iArr = this.f56864h;
        if (iS != iArr[0]) {
            iArr[0] = iS;
            iArr[1] = iS;
            invalidate();
        }
    }

    public final void setProgressTrackingListener(a1 listener) {
        this.o = listener;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WaveformSeekBarView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WaveformSeekBarView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        float fL = kli.a.l(context, 2.0f);
        this.f56860a = fL;
        this.f56861b = kli.a.l(context, 4.0f);
        this.f56862c = kli.a.l(context, 4.0f);
        this.d = fL / 2;
        this.e = new Path();
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(fL);
        paint.setAntiAlias(true);
        this.f = paint;
        this.f56863g = new Matrix();
        int iS = kli.a.s(R$attr.uikit_colorAccentNeutral, context);
        int iS2 = kli.a.s(R$attr.uikit_colorGreyTone20, context);
        this.f56864h = new int[]{iS, iS, iS2, iS2};
        this.i = new float[4];
        c cVar = b.f111735b;
        this.f56865j = cVar;
        this.k = cVar;
        setWillNotDraw(false);
    }

    public /* synthetic */ WaveformSeekBarView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
