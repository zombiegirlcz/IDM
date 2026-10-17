package com.revolut.core.ui_kit.internal.views.stackedchart;

import a0.d;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import aw0.k1;
import aw0.o1;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.TooltipView;
import com.revolut.core.ui_kit.internal.views.chart.ChartHeaderView;
import com.revolut.core.ui_kit.internal.views.chart.HorizontalChartLegendView;
import com.revolut.core.ui_kit_resources.R$attr;
import efm.r;
import kli.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import plc.i;
import pu0.h;
import te0.w;
import yhm.m;
import yhm.n;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u001c\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010!\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001b\u0010&\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010%R\u001b\u0010+\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u001e\u001a\u0004\b)\u0010*R\u001f\u00101\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010.0-0,8F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0017\u00103\u001a\b\u0012\u0004\u0012\u00020\f0,8F¢\u0006\u0006\u001a\u0004\b2\u00100¨\u00064"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/stackedchart/StackedChartWithHeaderAndLegendView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Law0/k1;", "model", "", "setHeaderModel", "(Law0/k1;)V", "Law0/o1;", "setLegendModel", "(Law0/o1;)V", "Lpu0/h;", "setChartModel", "(Lpu0/h;)V", "Lcom/revolut/core/ui_kit/internal/views/stackedchart/StackedChartView;", "d", "Lcom/revolut/core/ui_kit/internal/views/stackedchart/StackedChartView;", "getChartView", "()Lcom/revolut/core/ui_kit/internal/views/stackedchart/StackedChartView;", "getChartView$annotations", "()V", "chartView", "e", "Lkotlin/Lazy;", "getTooltipOffsetFromPointer", "()I", "tooltipOffsetFromPointer", "Lcom/revolut/core/ui_kit/internal/views/TooltipView;", "f", "getTooltip", "()Lcom/revolut/core/ui_kit/internal/views/TooltipView;", "tooltip", "Landroid/widget/PopupWindow;", "g", "getTooltipPopup", "()Landroid/widget/PopupWindow;", "tooltipPopup", "Lefm/r;", "Lyhm/m;", "", "getPileTouchedCallback", "()Lefm/r;", "pileTouchedCallback", "getHeaderImageClicked", "headerImageClicked", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StackedChartWithHeaderAndLegendView extends FrameLayout {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f57573h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k1 f57574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ChartHeaderView f57575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HorizontalChartLegendView f57576c;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final StackedChartView chartView;
    public final Object e;
    public final Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f57577g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StackedChartWithHeaderAndLegendView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static PopupWindow a(Context context, StackedChartWithHeaderAndLegendView stackedChartWithHeaderAndLegendView) {
        PopupWindow popupWindow = new PopupWindow(context);
        popupWindow.setOutsideTouchable(true);
        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        popupWindow.setContentView(stackedChartWithHeaderAndLegendView.getTooltip());
        return popupWindow;
    }

    public static final void b(StackedChartWithHeaderAndLegendView stackedChartWithHeaderAndLegendView, Object obj2) {
        ChartHeaderView chartHeaderView = stackedChartWithHeaderAndLegendView.f57575b;
        m.Companion companion = m.INSTANCE;
        if (obj2 instanceof n) {
            obj2 = null;
        }
        d.B(obj2);
        stackedChartWithHeaderAndLegendView.getTooltipPopup().dismiss();
        chartHeaderView.setFloatingStyleEnabled(false);
        k1 k1Var = stackedChartWithHeaderAndLegendView.f57574a;
        if (k1Var != null) {
            ChartHeaderView.setChartHeader$default(chartHeaderView, k1Var, false, 2, null);
        }
        stackedChartWithHeaderAndLegendView.invalidate();
    }

    public static /* synthetic */ void getChartView$annotations() {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final TooltipView getTooltip() {
        return (TooltipView) this.f.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final int getTooltipOffsetFromPointer() {
        return ((Number) this.e.getValue()).intValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final PopupWindow getTooltipPopup() {
        return (PopupWindow) this.f57577g.getValue();
    }

    @NotNull
    public final StackedChartView getChartView() {
        return this.chartView;
    }

    @NotNull
    public final r<Unit> getHeaderImageClicked() {
        return this.f57575b.a();
    }

    @NotNull
    public final r<m<Object>> getPileTouchedCallback() {
        return this.chartView.getPileTouchedObservable();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
    }

    public final void setChartModel(@NotNull h model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.chartView.setData(model);
    }

    public final void setHeaderModel(k1 model) {
        this.f57574a = model;
        int i = model != null ? 0 : 8;
        ChartHeaderView chartHeaderView = this.f57575b;
        chartHeaderView.setVisibility(i);
        if (model != null) {
            ChartHeaderView.setChartHeader$default(chartHeaderView, model, false, 2, null);
        }
    }

    public final void setLegendModel(o1 model) {
        this.f57576c.setModel(model);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StackedChartWithHeaderAndLegendView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StackedChartWithHeaderAndLegendView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Paint paint = new Paint();
        paint.setColor(a.s(R$attr.uikit_colorGreyTone20, context));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(a.k(context, 1.0f));
        new Rect();
        this.e = w.y0(new lu0.a(context, 21));
        this.f = w.y0(new lu0.a(context, 22));
        this.f57577g = w.y0(new pt4.d(context, this, 4));
        setWillNotDraw(false);
        LayoutInflater.from(context).inflate(R$layout.internal_stacked_chart_with_header_and_legend_view, (ViewGroup) this, true);
        View viewFindViewById = findViewById(R$id.stackedChartWithHeaderAndLegend_header);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f57575b = (ChartHeaderView) viewFindViewById;
        View viewFindViewById2 = findViewById(R$id.stackedChartWithHeaderAndLegend_legend);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f57576c = (HorizontalChartLegendView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R$id.stackedChartWithHeaderAndLegend_chart);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        StackedChartView stackedChartView = (StackedChartView) viewFindViewById3;
        this.chartView = stackedChartView;
        stackedChartView.getPileTouchedObservable().subscribe(new prl.n(5, new i(1, this, StackedChartWithHeaderAndLegendView.class, "pileTouchedCallback", "pileTouchedCallback(Ljava/lang/Object;)V", 0, 24)));
    }

    public /* synthetic */ StackedChartWithHeaderAndLegendView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
