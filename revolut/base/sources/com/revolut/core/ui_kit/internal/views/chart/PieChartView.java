package com.revolut.core.ui_kit.internal.views.chart;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.LruCache;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import com.revolut.core.ui_kit_resources.R$attr;
import com.youTransactor.uCube.rpc.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jb3.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import th9.t;
import ts0.k0;
import zhm.f0;
import zhm.v;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000bB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR6\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/chart/PieChartView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "Lts0/k0;", "value", "i", "Ljava/util/List;", "getSlices", "()Ljava/util/List;", "setSlices", "(Ljava/util/List;)V", "slices", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PieChartView extends FrameLayout {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f56729m = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RectF f56730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RectF f56731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f56732c;
    public final float d;
    public final float e;
    public final nr0.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SparseIntArray f56733g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int[] f56734h;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public List slices;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextPaint f56735j;
    public final Paint k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Paint f56736l;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PieChartView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a() {
        this.f56732c = false;
        float fMin = (Math.min(getHeight(), getWidth()) / 2.0f) - 0;
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        RectF rectF = this.f56731b;
        rectF.left = width - fMin;
        rectF.right = width + fMin;
        rectF.top = height - fMin;
        rectF.bottom = height + fMin;
    }

    @NotNull
    public final List<k0> getSlices() {
        return this.slices;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        int iValueAt;
        int iValueAt2;
        Canvas canvas3 = canvas;
        Intrinsics.checkNotNullParameter(canvas3, "canvas");
        super.onDraw(canvas);
        if (this.f56732c) {
            a();
        }
        RectF rectF = this.f56730a;
        RectF rectF2 = this.f56731b;
        rectF.set(rectF2);
        Iterator it8 = this.slices.iterator();
        int i = 0;
        int i2 = 0;
        float f = -90.0f;
        while (true) {
            boolean zHasNext = it8.hasNext();
            Paint paint = this.k;
            if (!zHasNext) {
                SparseIntArray sparseIntArray = this.f56733g;
                if (f < 270.0f) {
                    int i3 = R$attr.uikit_colorGreyTone10_80;
                    int iIndexOfKey = sparseIntArray.indexOfKey(i3);
                    if (iIndexOfKey < 0) {
                        Context context = getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                        iValueAt2 = kli.a.s(i3, context);
                        sparseIntArray.put(i3, iValueAt2);
                    } else {
                        iValueAt2 = sparseIntArray.valueAt(iIndexOfKey);
                    }
                    paint.setColor(iValueAt2);
                    canvas.drawArc(rectF, f, 270.0f - f, true, paint);
                }
                rectF.set(rectF2);
                float fHeight = rectF2.height();
                float f4 = this.e;
                float f5 = this.d;
                float f6 = (f4 + f5) * fHeight;
                float f32 = 2;
                float fWidth = (rectF2.width() / f32) - (f6 / f32);
                rectF.inset(fWidth, fWidth);
                float f35 = -90.0f;
                for (Object obj2 : this.slices) {
                    int i5 = i + 1;
                    if (i < 0) {
                        v.s();
                        throw null;
                    }
                    float f36 = ((k0) obj2).f273880a * 3.6f;
                    int[] iArr = this.f56734h;
                    if (iArr == null) {
                        Intrinsics.r("sliceColors");
                        throw null;
                    }
                    paint.setColor(iArr[i]);
                    canvas.drawArc(rectF, f35, f36, true, paint);
                    f35 += f36;
                    f5 = f5;
                    i = i5;
                }
                float f37 = f5;
                if (f35 < 270.0f) {
                    int i6 = R$attr.uikit_colorGreyTone10;
                    int iIndexOfKey2 = sparseIntArray.indexOfKey(i6);
                    if (iIndexOfKey2 < 0) {
                        Context context2 = getContext();
                        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                        iValueAt = kli.a.s(i6, context2);
                        sparseIntArray.put(i6, iValueAt);
                    } else {
                        iValueAt = sparseIntArray.valueAt(iIndexOfKey2);
                    }
                    paint.setColor(iValueAt);
                    canvas2 = canvas;
                    canvas2.drawArc(rectF, f35, 270.0f - f35, true, paint);
                } else {
                    canvas2 = canvas;
                }
                canvas2.drawCircle(rectF2.centerX(), rectF2.centerY(), (rectF2.width() / 2.0f) * f37, this.f56736l);
                return;
            }
            Object next = it8.next();
            int i21 = i2 + 1;
            if (i2 < 0) {
                v.s();
                throw null;
            }
            float f41 = ((k0) next).f273880a * 3.6f;
            int[] iArr2 = this.f56734h;
            if (iArr2 == null) {
                Intrinsics.r("sliceColors");
                throw null;
            }
            paint.setColor(iArr2[i2]);
            paint.setAlpha(Constants.TAG_SYSTEM_FAILURE_LOG_RECORD_2);
            canvas3.drawArc(rectF, f, f41, true, paint);
            paint.setAlpha(255);
            f += f41;
            canvas3 = canvas;
            i2 = i21;
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

    public final void setSlices(@NotNull List<k0> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (!value.isEmpty()) {
            this.f56734h = new int[value.size()];
        }
        Iterator<T> it8 = value.iterator();
        int i = 0;
        while (true) {
            boolean zHasNext = it8.hasNext();
            TextPaint paint = this.f56735j;
            nr0.e eVar = this.f;
            if (!zHasNext) {
                Iterator it9 = this.slices.iterator();
                while (it9.hasNext()) {
                    ((k0) it9.next()).getClass();
                    eVar.getClass();
                    Intrinsics.checkNotNullParameter(paint, "paint");
                }
                this.slices = value;
                this.f56732c = true;
                invalidate();
                return;
            }
            Object next = it8.next();
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            k0 k0Var = (k0) next;
            k0Var.getClass();
            eVar.getClass();
            Intrinsics.checkNotNullParameter(paint, "paint");
            int[] iArr = this.f56734h;
            if (iArr == null) {
                Intrinsics.r("sliceColors");
                throw null;
            }
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            iArr[i] = io0.a.c(context, k0Var.f273881b);
            i = i2;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PieChartView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PieChartView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        tl7.a creator = new tl7.a(22);
        Intrinsics.checkNotNullParameter(creator, "creator");
        ArrayList arrayList = new ArrayList();
        vim.f it8 = new IntRange(0, 10, 1).iterator();
        while (it8.f289625c) {
            it8.nextInt();
            arrayList.add(creator.invoke());
        }
        this.f56730a = new RectF();
        this.f56731b = new RectF();
        this.f56732c = true;
        this.d = 0.4f;
        this.e = 0.2f;
        this.f = new nr0.e(this, new t(this, 18));
        this.f56733g = new SparseIntArray();
        new LruCache(50);
        this.slices = f0.f322471a;
        TextPaint textPaint = new TextPaint();
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setAntiAlias(true);
        textPaint.setColor(-1);
        this.f56735j = textPaint;
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        this.k = paint;
        Paint paint2 = new Paint();
        paint2.setColor(0);
        paint2.setStyle(Paint.Style.FILL_AND_STROKE);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint2.setAntiAlias(true);
        this.f56736l = paint2;
        setWillNotDraw(false);
        setLayerType(2, null);
        l.d(textPaint, context, R$attr.internal_textAppearanceEmphasis4);
    }

    public /* synthetic */ PieChartView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
