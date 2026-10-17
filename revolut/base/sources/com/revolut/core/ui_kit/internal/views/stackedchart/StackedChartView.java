package com.revolut.core.ui_kit.internal.views.stackedchart;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.internal.views.stackedchart.StackedChartView;
import com.revolut.core.ui_kit_core.displayers.haptic.Haptic;
import com.revolut.core.ui_kit_resources.R$attr;
import efm.r;
import ihm.b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nr0.e;
import org.jetbrains.annotations.NotNull;
import pu0.a;
import pu0.f;
import pu0.g;
import pu0.h;
import rzl.c;
import te0.w;
import yhm.m;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001b\u0010\u000f\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR!\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0019\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0017\u0010\u0018R!\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\f\u001a\u0004\b\u001c\u0010\u0014R\u001f\u0010#\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u001f0\u001e8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R.\u0010&\u001a\u0004\u0018\u00010$2\b\u0010%\u001a\u0004\u0018\u00010$8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R4\u0010-\u001a\u0004\u0018\u00010,2\b\u0010%\u001a\u0004\u0018\u00010,8\u0006@FX\u0087\u000e¢\u0006\u0018\n\u0004\b-\u0010.\u0012\u0004\b3\u00104\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u0014\u00108\u001a\u0002058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R\u0014\u0010:\u001a\u0002058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b9\u00107R\u0014\u0010<\u001a\u0002058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b;\u00107¨\u0006="}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/stackedchart/StackedChartView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/graphics/drawable/ShapeDrawable;", "b", "Lkotlin/Lazy;", "getBarDrawable", "()Landroid/graphics/drawable/ShapeDrawable;", "barDrawable", "", "Lpu0/e;", "h", "getSegmentsCache", "()Ljava/util/List;", "segmentsCache", "i", "getTextColor", "()I", "textColor", "Lpu0/f;", "j", "getTextCache", "textCache", "Lefm/r;", "Lyhm/m;", "", "getPileTouchedObservable", "()Lefm/r;", "pileTouchedObservable", "Lpu0/h;", "value", "data", "Lpu0/h;", "getData", "()Lpu0/h;", "setData", "(Lpu0/h;)V", "Lpu0/g;", "currentPileTouched", "Lpu0/g;", "getCurrentPileTouched", "()Lpu0/g;", "setCurrentPileTouched", "(Lpu0/g;)V", "getCurrentPileTouched$annotations", "()V", "", "getPlotTextSize", "()F", "plotTextSize", "getAvailableChartWidth", "availableChartWidth", "getAvailableChartHeight", "availableChartHeight", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StackedChartView extends View {
    public static final /* synthetic */ int o = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f57564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f57565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f57566c;
    public final float d;
    public final float e;
    public final a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f57567g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f57568h;
    public final Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f57569j;
    public final PointF k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final PointF f57570l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final o6.a f57571m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f57572n;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StackedChartView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static ArrayList a(StackedChartView stackedChartView) {
        ArrayList arrayList = new ArrayList(10);
        for (int i = 0; i < 10; i++) {
            f fVar = new f(stackedChartView.f57566c, stackedChartView.getTextColor());
            fVar.d.setTextSize(stackedChartView.getPlotTextSize());
            arrayList.add(fVar);
        }
        return arrayList;
    }

    public static ArrayList b(StackedChartView stackedChartView) {
        ArrayList arrayList = new ArrayList(20);
        for (int i = 0; i < 20; i++) {
            arrayList.add(new pu0.e(stackedChartView.getBarDrawable(), stackedChartView.f57567g));
        }
        return arrayList;
    }

    private final float getAvailableChartHeight() {
        return getHeight() - this.e;
    }

    private final float getAvailableChartWidth() {
        return getWidth() - this.d;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final ShapeDrawable getBarDrawable() {
        return (ShapeDrawable) this.f57565b.getValue();
    }

    public static /* synthetic */ void getCurrentPileTouched$annotations() {
    }

    private final float getPlotTextSize() {
        Intrinsics.checkNotNullExpressionValue(getContext(), "getContext(...)");
        return kli.a.k(r0, 10.0f);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final List<pu0.e> getSegmentsCache() {
        return (List) this.f57568h.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final List<f> getTextCache() {
        return (List) this.f57569j.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final int getTextColor() {
        return ((Number) this.i.getValue()).intValue();
    }

    public final g getCurrentPileTouched() {
        return null;
    }

    public final h getData() {
        return null;
    }

    @NotNull
    public final r<m<Object>> getPileTouchedObservable() {
        return this.f57564a;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) throws Throwable {
        Canvas canvas2;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        a aVar = this.f;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        c cVar = aVar.f239787b;
        float f = cVar.f258699a;
        float f4 = cVar.f258700b;
        int iSave = canvas.save();
        canvas.translate(f, f4);
        try {
            canvas2 = canvas;
            try {
                canvas2.drawLine(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, aVar.f239786a);
                canvas2.restoreToCount(iSave);
            } catch (Throwable th10) {
                th = th10;
                Throwable th11 = th;
                canvas2.restoreToCount(iSave);
                throw th11;
            }
        } catch (Throwable th12) {
            th = th12;
            canvas2 = canvas;
        }
    }

    @Override // android.view.View
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
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int action = event.getAction();
        PointF pointF = this.f57570l;
        o6.a aVar = this.f57571m;
        PointF pointF2 = this.k;
        if (action == 0) {
            pointF2.set(event.getX(), event.getY());
            pointF.set(event.getX(), event.getY());
            getHandler().post(aVar);
            return true;
        }
        if (action != 1) {
            if (action == 2) {
                if (pointF2.x == -999999.0f) {
                    event.getX();
                } else if (Math.abs(event.getX() - pointF2.x) >= this.f57572n) {
                    event.getX();
                    pointF2.set(-999999.0f, -999999.0f);
                    getParent().requestDisallowInterceptTouchEvent(true);
                    getHandler().removeCallbacks(aVar);
                }
                pointF.set(event.getX(), event.getY());
                return true;
            }
            if (action != 3) {
                return super.onTouchEvent(event);
            }
        }
        getHandler().removeCallbacks(aVar);
        setCurrentPileTouched(null);
        getParent().requestDisallowInterceptTouchEvent(false);
        invalidate();
        return true;
    }

    public final void setCurrentPileTouched(g gVar) {
        if (Intrinsics.f(null, gVar)) {
            return;
        }
        this.f57564a.onNext(new m(null));
    }

    public final void setData(h hVar) {
        if (Intrinsics.f(null, hVar)) {
            return;
        }
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StackedChartView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StackedChartView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f57564a = j6.a.h("create(...)");
        this.f57565b = w.y0(new pni.a(13));
        final int i2 = 0;
        this.f57566c = new e(this, new Function0(this) { // from class: pu0.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StackedChartView f239799b;

            {
                this.f239799b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                StackedChartView stackedChartView = this.f239799b;
                switch (i3) {
                    case 0:
                        int i5 = StackedChartView.o;
                        stackedChartView.getClass();
                        return Unit.f186387a;
                    case 1:
                        return StackedChartView.b(stackedChartView);
                    default:
                        return StackedChartView.a(stackedChartView);
                }
            }
        });
        Paint paint = new Paint();
        paint.setColor(kli.a.s(R$attr.uikit_colorGreyTone20, context));
        paint.setStrokeWidth(kli.a.k(context, 1.0f));
        paint.setStyle(Paint.Style.STROKE);
        final int i3 = 2;
        final int i5 = 1;
        paint.setPathEffect(new DashPathEffect(new float[]{kli.a.k(context, 5.0f), kli.a.k(context, 5.0f)}, BitmapDescriptorFactory.HUE_RED));
        this.d = kli.a.k(context, 40.0f);
        this.e = kli.a.k(context, 20.0f);
        kli.a.k(context, 10.0f);
        kli.a.k(context, 16.0f);
        this.f = new a(paint);
        this.f57567g = kli.a.k(context, 5.0f);
        this.f57568h = w.y0(new Function0(this) { // from class: pu0.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StackedChartView f239799b;

            {
                this.f239799b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i5;
                StackedChartView stackedChartView = this.f239799b;
                switch (i32) {
                    case 0:
                        int i59 = StackedChartView.o;
                        stackedChartView.getClass();
                        return Unit.f186387a;
                    case 1:
                        return StackedChartView.b(stackedChartView);
                    default:
                        return StackedChartView.a(stackedChartView);
                }
            }
        });
        this.i = w.y0(new lu0.a(context, 20));
        this.f57569j = w.y0(new Function0(this) { // from class: pu0.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StackedChartView f239799b;

            {
                this.f239799b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i3;
                StackedChartView stackedChartView = this.f239799b;
                switch (i32) {
                    case 0:
                        int i59 = StackedChartView.o;
                        stackedChartView.getClass();
                        return Unit.f186387a;
                    case 1:
                        return StackedChartView.b(stackedChartView);
                    default:
                        return StackedChartView.a(stackedChartView);
                }
            }
        });
        this.k = new PointF();
        this.f57570l = new PointF();
        this.f57571m = new o6.a(this, 9);
        this.f57572n = ViewConfiguration.get(context).getScaledTouchSlop();
        new PointF();
        new Haptic.Effect(com.revolut.core.ui_kit_core.displayers.haptic.c.SHORT, true);
        new PointF();
    }

    public /* synthetic */ StackedChartView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
