package ct0;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import android.text.TextPaint;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class p {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f108601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f108602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f108603c;
    public final int d;
    public final int e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f108604g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f108605h;
    public final float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f108606j;
    public final float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Paint f108607l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Paint f108608m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final DashPathEffect f108609n;
    public final RectF o;

    public p(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f108601a = kli.a.s(R$attr.uikit_colorGreyTone10, context);
        this.f108602b = kli.a.s(R$attr.uikit_colorGreyTone20, context);
        this.f108603c = kli.a.s(R$attr.uikit_colorGreyTone50, context);
        int iS = kli.a.s(R$attr.uikit_colorForeground, context);
        this.d = iS;
        this.e = io0.a.d(0.5f, iS);
        int iD = io0.a.d(0.7f, kli.a.s(R$attr.uikit_colorPopoverBackground, context));
        this.f = iD;
        this.f108604g = io0.a.d(0.8f, kli.a.s(R$attr.uikit_colorPopoverBackground, context));
        this.f108605h = kli.a.l(context, 8.0f);
        this.i = kli.a.l(context, 6.0f);
        this.f108606j = kli.a.l(context, 2.0f);
        this.k = kli.a.l(context, 4.0f);
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(kli.a.l(context, 2.0f));
        this.f108607l = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(iD);
        this.f108608m = paint2;
        this.f108609n = new DashPathEffect(new float[]{kli.a.l(context, 4.0f), kli.a.l(context, 4.0f)}, BitmapDescriptorFactory.HUE_RED);
        this.o = new RectF();
    }

    public final void a(Canvas canvas, RectF rectF, float f, float f4, int i) {
        Paint paint = this.f108608m;
        paint.setColor(i);
        float f5 = rectF.left - (2 * f4);
        float f6 = rectF.top - f;
        float f32 = rectF.right;
        float f35 = rectF.bottom + f;
        RectF rectF2 = this.o;
        rectF2.set(f5, f6, f32, f35);
        float f36 = this.k;
        canvas.drawRoundRect(rectF2, f36, f36, paint);
    }

    public final void b(Canvas canvas, Layout textLayout, TextPaint labelPaint, float f, float f4, boolean z) {
        Intrinsics.checkNotNullParameter(canvas, "<this>");
        Intrinsics.checkNotNullParameter(textLayout, "textLayout");
        Intrinsics.checkNotNullParameter(labelPaint, "labelPaint");
        labelPaint.setColor(z ? this.d : this.f108603c);
        a.a.g(textLayout, canvas, f, f4);
    }

    public final void c(Canvas canvas, m style, Layout textLayout, TextPaint labelPaint, RectF textBounds) {
        Intrinsics.checkNotNullParameter(canvas, "<this>");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(textLayout, "textLayout");
        Intrinsics.checkNotNullParameter(labelPaint, "labelPaint");
        Intrinsics.checkNotNullParameter(textBounds, "textBounds");
        labelPaint.setTextAlign(Paint.Align.RIGHT);
        if (style != m.REGULAR) {
            float f = this.f108606j;
            a(canvas, textBounds, f, f, this.f108604g);
            labelPaint.setColor(this.e);
            a.a.i(textLayout, canvas, textBounds.right - this.f108606j, textBounds.top);
            return;
        }
        a(canvas, textBounds, this.i, this.f108605h, this.f);
        labelPaint.setColor(this.f108603c);
        a.a.i(textLayout, canvas, textBounds.right - this.f108605h, textBounds.top);
    }

    public final void d(Canvas canvas, m style, float f, float f4, float f5) {
        Intrinsics.checkNotNullParameter(canvas, "<this>");
        Intrinsics.checkNotNullParameter(style, "style");
        Paint paintE = e(style);
        if (paintE == null) {
            return;
        }
        canvas.drawLine(f4, f, f5, f, paintE);
    }

    public final Paint e(m mVar) {
        int i = o.f108600a[mVar.ordinal()];
        Paint paint = this.f108607l;
        if (i == 1) {
            paint.setColor(this.f108601a);
            paint.setPathEffect(null);
            return paint;
        }
        if (i != 2) {
            if (i == 3) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        paint.setColor(this.f108602b);
        paint.setPathEffect(this.f108609n);
        return paint;
    }
}
