package com.revolut.core.ui_kit.internal.views.trend;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import aw0.ab;
import aw0.ya;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import hul.c;
import ip0.bm0;
import java.util.Iterator;
import java.util.List;
import kli.a;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r10.r;
import yhm.j;
import zhm.f0;
import zhm.v;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 ,2\u00020\u0001:\u0003-./B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR6\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R*\u0010\u001b\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\u00148\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR.\u0010#\u001a\u0004\u0018\u00010\u001c2\b\u0010\f\u001a\u0004\u0018\u00010\u001c8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R.\u0010+\u001a\u0004\u0018\u00010$2\b\u0010\f\u001a\u0004\u0018\u00010$8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u00060"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/trend/TrendPreviewView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "Law0/ab;", "value", "i", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "items", "", "j", "F", "getFillFraction", "()F", "setFillFraction", "(F)V", "fillFraction", "Law0/ya;", "k", "Law0/ya;", "getChartColor", "()Law0/ya;", "setChartColor", "(Law0/ya;)V", "chartColor", "Lip0/bm0;", "l", "Lip0/bm0;", "getBaseline", "()Lip0/bm0;", "setBaseline", "(Lip0/bm0;)V", "baseline", "Companion", "b", "r10/r", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TrendPreviewView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f57694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path f57695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Path f57696c;
    public final b d;
    public final r e;
    public final SparseIntArray f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f57697g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f57698h;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public List items;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public float fillFraction;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public ya chartColor;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public bm0 baseline;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RectF f57701a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f57702b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f57703c;
        public float d;
        public float e;

        public b() {
            this(0);
        }

        public b(int i) {
            RectF chartRect = new RectF();
            Intrinsics.checkNotNullParameter(chartRect, "chartRect");
            this.f57701a = chartRect;
            this.f57702b = BitmapDescriptorFactory.HUE_RED;
            this.f57703c = BitmapDescriptorFactory.HUE_RED;
            this.d = BitmapDescriptorFactory.HUE_RED;
            this.e = BitmapDescriptorFactory.HUE_RED;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TrendPreviewView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a() {
        float fMax = Float.NEGATIVE_INFINITY;
        float fMin = Float.POSITIVE_INFINITY;
        float fMin2 = Float.POSITIVE_INFINITY;
        float fMax2 = Float.NEGATIVE_INFINITY;
        for (ab abVar : this.items) {
            float f = abVar.f10238b;
            float f4 = abVar.f10237a;
            fMax2 = Math.max(f, fMax2);
            fMin2 = Math.min(abVar.f10238b, fMin2);
            fMax = Math.max(f4, fMax);
            fMin = Math.min(f4, fMin);
        }
        b bVar = this.d;
        RectF rectF = bVar.f57701a;
        RectF rectF2 = bVar.f57701a;
        rectF.left = getPaddingLeft() + 2.0f;
        rectF.right = (getWidth() - getPaddingRight()) - 2.0f;
        rectF.top = getPaddingTop() + 2.0f;
        rectF.bottom = (getHeight() - getPaddingBottom()) - 2.0f;
        bVar.d = fMin;
        bVar.e = fMin2;
        float fHeight = BitmapDescriptorFactory.HUE_RED;
        bVar.f57703c = fMax == fMin ? 0.0f : (rectF.width() * this.fillFraction) / (fMax - fMin);
        if (fMax2 != fMin2) {
            fHeight = rectF.height() / (fMax2 - fMin2);
        }
        bVar.f57702b = fHeight;
        Path path = this.f57695b;
        path.reset();
        bm0 bm0Var = this.baseline;
        if (bm0Var != null) {
            float fMin3 = Math.min(Math.max(bm0Var.f163630a, fMin2), fMax2);
            path.moveTo(rectF2.left, c(fMin3));
            path.lineTo(rectF2.right, c(fMin3));
        }
        Path path2 = this.f57694a;
        path2.reset();
        Iterator it8 = this.items.iterator();
        int i = 0;
        while (true) {
            LinearGradient linearGradient = null;
            if (!it8.hasNext()) {
                Path path3 = this.f57696c;
                path3.reset();
                path3.set(path2);
                path3.lineTo(rectF2.right * this.fillFraction, rectF2.bottom);
                path3.lineTo(rectF2.left, rectF2.bottom);
                path3.close();
                ya yaVar = this.chartColor;
                if (yaVar != null) {
                    int i2 = yaVar.d;
                    int i3 = yaVar.f10636c;
                    if (i2 != 0 && i3 != 0) {
                        linearGradient = new LinearGradient(BitmapDescriptorFactory.HUE_RED, rectF2.top, BitmapDescriptorFactory.HUE_RED, rectF2.bottom, b(i3), b(i2), Shader.TileMode.CLAMP);
                    }
                    r rVar = this.e;
                    Paint paint = (Paint) ((Lazy) rVar.f250851a).getValue();
                    paint.setStrokeWidth(this.f57697g);
                    paint.setColor(b(yaVar.f10634a));
                    ((Paint) ((Lazy) rVar.f250852b).getValue()).setColor(b(yaVar.f10635b));
                    ((Paint) ((Lazy) rVar.f250853c).getValue()).setShader(linearGradient);
                }
                this.f57698h = false;
                return;
            }
            Object next = it8.next();
            int i5 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            ab abVar2 = (ab) next;
            float f5 = ((abVar2.f10237a - bVar.d) * bVar.f57703c) + rectF2.left;
            float fC = c(abVar2.f10238b);
            if (i == 0) {
                path2.moveTo(f5, fC);
            } else {
                path2.lineTo(f5, fC);
            }
            i = i5;
        }
    }

    public final int b(int i) {
        SparseIntArray sparseIntArray = this.f;
        int iIndexOfKey = sparseIntArray.indexOfKey(i);
        if (iIndexOfKey >= 0) {
            return sparseIntArray.valueAt(iIndexOfKey);
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iS = a.s(i, context);
        sparseIntArray.put(i, iS);
        return iS;
    }

    public final float c(float f) {
        b bVar = this.d;
        return bVar.f57701a.bottom - ((f - bVar.e) * bVar.f57702b);
    }

    @Override // android.view.View
    public final bm0 getBaseline() {
        return this.baseline;
    }

    public final ya getChartColor() {
        return this.chartColor;
    }

    public final float getFillFraction() {
        return this.fillFraction;
    }

    @NotNull
    public final List<ab> getItems() {
        return this.items;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        r rVar = this.e;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        if (this.f57698h) {
            a();
        }
        int iSave = canvas.save();
        try {
            canvas.clipRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, canvas.getWidth(), canvas.getHeight());
            if (((Paint) ((Lazy) rVar.f250853c).getValue()).getShader() != null) {
                iSave = canvas.save();
                try {
                    canvas.clipPath(this.f57696c);
                    canvas.drawPaint((Paint) ((Lazy) rVar.f250853c).getValue());
                    canvas.restoreToCount(iSave);
                } finally {
                    canvas.restoreToCount(iSave);
                }
            }
            canvas.drawPath(this.f57694a, (Paint) ((Lazy) rVar.f250851a).getValue());
            if (this.baseline != null) {
                canvas.drawPath(this.f57695b, (Paint) ((Lazy) rVar.f250852b).getValue());
            }
        } catch (Throwable th10) {
            throw th10;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            suggestedMinimumWidth = Math.min(suggestedMinimumWidth, size);
        } else if (mode == 1073741824) {
            suggestedMinimumWidth = size;
        }
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE) {
            suggestedMinimumHeight = Math.min(suggestedMinimumHeight, size2);
        } else if (mode2 == 1073741824) {
            suggestedMinimumHeight = size2;
        }
        setMeasuredDimension(suggestedMinimumWidth, suggestedMinimumHeight);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i5) {
        super.onSizeChanged(i, i2, i3, i5);
        a();
    }

    public final void setBaseline(bm0 bm0Var) {
        this.baseline = bm0Var;
        this.f57698h = true;
        invalidate();
    }

    public final void setChartColor(ya yaVar) {
        this.chartColor = yaVar;
        this.f57698h = true;
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0006 A[PHI: r0
      0x0006: PHI (r0v2 float) = (r0v0 float), (r0v1 float) binds: [B:3:0x0004, B:6:0x000b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setFillFraction(float r3) {
        /*
            r2 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 <= 0) goto L8
        L6:
            r3 = r0
            goto Le
        L8:
            r0 = 0
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 >= 0) goto Le
            goto L6
        Le:
            r2.fillFraction = r3
            r3 = 1
            r2.f57698h = r3
            r2.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.internal.views.trend.TrendPreviewView.setFillFraction(float):void");
    }

    public final void setItems(@NotNull List<ab> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.items = value;
        this.f57698h = true;
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TrendPreviewView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrendPreviewView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f57694a = new Path();
        this.f57695b = new Path();
        this.f57696c = new Path();
        this.d = new b(0);
        Intrinsics.checkNotNullParameter(context, "context");
        r rVar = new r();
        rVar.f250851a = j.b(new c(8));
        rVar.f250852b = j.b(new b0.b(context, 22));
        rVar.f250853c = j.b(new c(9));
        this.e = rVar;
        this.f = new SparseIntArray();
        this.f57697g = a.k(context, 2.0f);
        this.f57698h = true;
        this.items = f0.f322471a;
        this.fillFraction = 1.0f;
        setWillNotDraw(false);
    }

    public /* synthetic */ TrendPreviewView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
