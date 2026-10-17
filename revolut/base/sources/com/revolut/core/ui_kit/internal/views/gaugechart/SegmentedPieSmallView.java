package com.revolut.core.ui_kit.internal.views.gaugechart;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.internal.views.gaugechart.a;
import com.revolut.core.ui_kit_resources.R$attr;
import jq0.r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;
import mx0.w5;
import org.jetbrains.annotations.NotNull;
import pt0.t;
import te0.w;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u001e2\u00020\u0001:\u0002\n\u0010B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR$\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00068\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00068\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R\u001b\u0010\u001d\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/gaugechart/SegmentedPieSmallView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lpt0/t;", "model", "", "setProgressStyle", "(Lpt0/t;)V", "value", "a", "I", "setTotalSegments", "(I)V", "totalSegments", "b", "setActiveSegments", "activeSegments", "Landroid/graphics/Paint;", "k", "Lkotlin/Lazy;", "getArcPaint", "()Landroid/graphics/Paint;", "arcPaint", "Companion", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SegmentedPieSmallView extends View {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public int totalSegments;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public int activeSegments;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ValueAnimator f57155c;
    public final float d;
    public final RectF e;
    public final Path f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a.b f57156g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f57157h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f57158j;
    public final Object k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f57159l;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.internal.views.gaugechart.SegmentedPieSmallView$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SegmentedPieSmallView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final Paint getArcPaint() {
        return (Paint) this.k.getValue();
    }

    private final void setActiveSegments(int i) {
        int iG = f.g(i, 0, this.totalSegments);
        if (this.activeSegments != iG) {
            this.activeSegments = iG;
        }
    }

    private final void setTotalSegments(int i) {
        if (i < 1) {
            i = 1;
        }
        if (this.totalSegments != i) {
            this.totalSegments = i;
            if (this.activeSegments > i) {
                setActiveSegments(i);
            }
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        int i = this.totalSegments;
        float f = this.f57157h;
        int i2 = this.f57158j;
        RectF rectF = this.e;
        int i3 = this.i;
        if (i == 1) {
            Paint.Style style = Paint.Style.STROKE;
            Paint paint = new Paint(1);
            paint.setStyle(style);
            paint.setStrokeCap(Paint.Cap.BUTT);
            paint.setStrokeWidth(f);
            paint.setColor(i3);
            canvas.drawArc(rectF, -90.0f, 360.0f, false, paint);
            if (this.activeSegments == 1) {
                paint.setColor(i2);
                canvas.drawArc(rectF, -90.0f, 360.0f, false, paint);
                return;
            }
            return;
        }
        RectF rectF2 = rectF;
        float f4 = 2;
        float fWidth = rectF2.width() - (f * f4);
        Intrinsics.checkNotNullExpressionValue(getContext(), "getContext(...)");
        float fK = (kli.a.k(r3, 2.5f) * 360.0f) / (fWidth * 3.1415927f);
        int i5 = this.totalSegments;
        float f5 = i5;
        float f6 = f5 * fK;
        if (f6 >= 360.0f) {
            return;
        }
        float f32 = (360.0f - f6) / f5;
        float f35 = BitmapDescriptorFactory.HUE_RED;
        if (f32 <= BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        float f36 = (fK / f4) - 90.0f;
        int i6 = 0;
        while (i6 < i5) {
            float f37 = i6;
            float f41 = ((f32 + fK) * f37) + f36;
            a.b bVar = this.f57156g;
            float f42 = f35;
            Path path = this.f;
            int i21 = i6;
            RectF rectF3 = rectF2;
            a.a(path, rectF3, f41, f32, this.f57157h, this.d, bVar, false);
            float f57 = f32;
            getArcPaint().setColor(i3);
            canvas.drawPath(path, getArcPaint());
            float f69 = this.f57159l;
            if (f69 > f37) {
                a.a(path, rectF3, f41, f.f(f69 - f37, f42, 1.0f) * f57, this.f57157h, this.d, this.f57156g, false);
                getArcPaint().setColor(i2);
                canvas.drawPath(path, getArcPaint());
            }
            f35 = f42;
            rectF2 = rectF3;
            i6 = i21 + 1;
            f32 = f57;
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i5) {
        float f = this.f57157h / 2;
        RectF rectF = this.e;
        rectF.left = BitmapDescriptorFactory.HUE_RED;
        rectF.top = BitmapDescriptorFactory.HUE_RED;
        rectF.right = i3 - i;
        rectF.bottom = i5 - i2;
        rectF.inset(f, f);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(kli.a.k(context, 44.0f), 1073741824);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }

    public final void setProgressStyle(@NotNull t model) {
        Intrinsics.checkNotNullParameter(model, "model");
        int i = this.totalSegments;
        int i2 = this.activeSegments;
        setTotalSegments(model.f239587b);
        setActiveSegments(model.f239586a);
        if (i == this.totalSegments && i2 == this.activeSegments) {
            return;
        }
        ValueAnimator valueAnimator = this.f57155c;
        valueAnimator.cancel();
        valueAnimator.setFloatValues(i2, this.activeSegments);
        valueAnimator.start();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SegmentedPieSmallView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SegmentedPieSmallView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f57155c = valueAnimator;
        this.d = kli.a.l(context, 1.0f);
        this.e = new RectF();
        this.f = new Path();
        this.f57156g = new a.b();
        this.f57157h = kli.a.l(context, 4.0f);
        this.i = kli.a.s(R$attr.uikit_colorGreyTone10, context);
        this.f57158j = kli.a.s(R$attr.uikit_colorBlue, context);
        this.k = w.y0(new pgk.f(this, 21));
        valueAnimator.setDuration(1500L);
        valueAnimator.setInterpolator(r.e);
        valueAnimator.addUpdateListener(new w5(this, 3));
    }

    public /* synthetic */ SegmentedPieSmallView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
