package com.revolut.core.ui_kit.internal.views.chart;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import aw0.b6;
import aw0.d1;
import aw0.e1;
import aw0.f1;
import aw0.g1;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit.internal.views.chart.ChartHeaderBottomValueView;
import com.revolut.core.ui_kit.internal.views.chart.HorizontalSingleLineChartLegendView;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import mx0.c9;
import or0.u;
import org.jetbrains.annotations.NotNull;
import ts0.q;
import yhm.j;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010%\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010$R\u001b\u0010\u0010\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u001d\u001a\u0004\b(\u0010)R\u001b\u0010.\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\u001d\u001a\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/chart/ChartHeaderBottomValueView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Law0/b6;", "chartLegend", "", "setLegend", "(Law0/b6;)V", "Law0/g1;", "button", "setButton", "(Law0/g1;)V", "bottomValue", "gravity", "setModel", "(Law0/g1;I)V", "", "enabled", "setEnabled", "(Z)V", "Landroidx/appcompat/widget/AppCompatTextView;", "a", "Lkotlin/Lazy;", "getDescription", "()Landroidx/appcompat/widget/AppCompatTextView;", "description", "Lts0/q;", "b", "getCompositeDescription", "()Lts0/q;", "compositeDescription", "Lcom/revolut/core/ui_kit/internal/views/SmallActionButton;", "c", "getButton", "()Lcom/revolut/core/ui_kit/internal/views/SmallActionButton;", "Lcom/revolut/core/ui_kit/internal/views/chart/HorizontalSingleLineChartLegendView;", "d", "getLegend", "()Lcom/revolut/core/ui_kit/internal/views/chart/HorizontalSingleLineChartLegendView;", "legend", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ChartHeaderBottomValueView extends FrameLayout {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f56602h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final Lazy description;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final Lazy compositeDescription;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final Lazy button;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final Lazy legend;
    public final ihm.f e;
    public final ihm.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public g1 f56606g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChartHeaderBottomValueView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final SmallActionButton getButton() {
        return (SmallActionButton) this.button.getValue();
    }

    private final q getCompositeDescription() {
        return (q) this.compositeDescription.getValue();
    }

    private final AppCompatTextView getDescription() {
        return (AppCompatTextView) this.description.getValue();
    }

    private final HorizontalSingleLineChartLegendView getLegend() {
        return (HorizontalSingleLineChartLegendView) this.legend.getValue();
    }

    private final void setButton(g1 button) {
        getButton();
        throw new IllegalStateException("BottomValue is not button type");
    }

    private final void setLegend(b6 chartLegend) {
        getLegend().setModel(chartLegend);
    }

    public final void a() {
        g1 g1Var = this.f56606g;
        if (g1Var instanceof d1) {
            if (getCompositeDescription().isEnabled() != isEnabled()) {
                getCompositeDescription().setEnabled(isEnabled());
            }
        } else if (!(g1Var instanceof e1) && !(g1Var instanceof f1) && g1Var != null) {
            throw new NoWhenBranchMatchedException();
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        a();
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    public final void setModel(@NotNull g1 bottomValue, int gravity) {
        Object compositeDescription;
        Intrinsics.checkNotNullParameter(bottomValue, "bottomValue");
        this.f56606g = bottomValue;
        boolean z = bottomValue instanceof e1;
        if (z) {
            compositeDescription = getDescription();
        } else if (bottomValue instanceof f1) {
            compositeDescription = getLegend();
        } else {
            if (!(bottomValue instanceof d1)) {
                throw new NoWhenBranchMatchedException();
            }
            compositeDescription = getCompositeDescription();
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            childAt.setVisibility(Intrinsics.f(childAt, compositeDescription) ? 0 : 8);
        }
        if (z) {
            ?? r110 = ((e1) bottomValue).f10288a;
            ty0.c cVarB0 = u.k(this).b0();
            AppCompatTextView description = getDescription();
            ty0.c.b(cVarB0, r110, description, null, null, 12);
            description.setGravity(gravity);
        } else if (bottomValue instanceof f1) {
            setLegend(null);
        } else {
            if (!(bottomValue instanceof d1)) {
                throw new NoWhenBranchMatchedException();
            }
            q compositeDescription2 = getCompositeDescription();
            compositeDescription2.setModel((d1) bottomValue);
            compositeDescription2.setGravity(gravity);
        }
        a();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChartHeaderBottomValueView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChartHeaderBottomValueView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        final int i2 = 0;
        this.description = j.b(new Function0(this) { // from class: ts0.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChartHeaderBottomValueView f273883b;

            {
                this.f273883b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                ChartHeaderBottomValueView chartHeaderBottomValueView = this.f273883b;
                switch (i3) {
                    case 0:
                        int i5 = ChartHeaderBottomValueView.f56602h;
                        chartHeaderBottomValueView.getClass();
                        AppCompatTextView appCompatTextView = new AppCompatTextView(chartHeaderBottomValueView.getContext());
                        appCompatTextView.setId(R$id.chartHeaderBottomValueView_description);
                        jb3.l.e(appCompatTextView, R$attr.internal_textAppearanceBody1);
                        Context context2 = appCompatTextView.getContext();
                        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                        appCompatTextView.setTextColor(kli.a.s(R$attr.uikit_colorGreyTone50, context2));
                        chartHeaderBottomValueView.addView(appCompatTextView);
                        return appCompatTextView;
                    case 1:
                        int i6 = ChartHeaderBottomValueView.f56602h;
                        Context context3 = chartHeaderBottomValueView.getContext();
                        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                        q qVar = new q(context3, null, 6, 0);
                        qVar.setId(R$id.chartHeaderBottomValueView_compositeDescription);
                        efm.r rVarHide = qVar.d.hide();
                        Intrinsics.checkNotNullExpressionValue(rVarHide, "hide(...)");
                        rVarHide.subscribe(chartHeaderBottomValueView.f);
                        chartHeaderBottomValueView.addView(qVar);
                        return qVar;
                    case 2:
                        int i21 = ChartHeaderBottomValueView.f56602h;
                        Context context4 = chartHeaderBottomValueView.getContext();
                        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                        SmallActionButton smallActionButton = new SmallActionButton(context4, null, 6, 0);
                        smallActionButton.setId(R$id.chartHeaderBottomValueView_button);
                        smallActionButton.setLayoutParams(new FrameLayout.LayoutParams(-2, foh.i.j(40)));
                        smallActionButton.setOnClickListener(new c9(chartHeaderBottomValueView, 19));
                        chartHeaderBottomValueView.addView(smallActionButton);
                        return smallActionButton;
                    default:
                        int i22 = ChartHeaderBottomValueView.f56602h;
                        Context context5 = chartHeaderBottomValueView.getContext();
                        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                        HorizontalSingleLineChartLegendView horizontalSingleLineChartLegendView = new HorizontalSingleLineChartLegendView(context5, null, 6, 0);
                        horizontalSingleLineChartLegendView.setId(R$id.chartHeaderBottomValueView_legend);
                        chartHeaderBottomValueView.addView(horizontalSingleLineChartLegendView);
                        return horizontalSingleLineChartLegendView;
                }
            }
        });
        final int i3 = 1;
        this.compositeDescription = j.b(new Function0(this) { // from class: ts0.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChartHeaderBottomValueView f273883b;

            {
                this.f273883b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i3;
                ChartHeaderBottomValueView chartHeaderBottomValueView = this.f273883b;
                switch (i32) {
                    case 0:
                        int i5 = ChartHeaderBottomValueView.f56602h;
                        chartHeaderBottomValueView.getClass();
                        AppCompatTextView appCompatTextView = new AppCompatTextView(chartHeaderBottomValueView.getContext());
                        appCompatTextView.setId(R$id.chartHeaderBottomValueView_description);
                        jb3.l.e(appCompatTextView, R$attr.internal_textAppearanceBody1);
                        Context context2 = appCompatTextView.getContext();
                        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                        appCompatTextView.setTextColor(kli.a.s(R$attr.uikit_colorGreyTone50, context2));
                        chartHeaderBottomValueView.addView(appCompatTextView);
                        return appCompatTextView;
                    case 1:
                        int i6 = ChartHeaderBottomValueView.f56602h;
                        Context context3 = chartHeaderBottomValueView.getContext();
                        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                        q qVar = new q(context3, null, 6, 0);
                        qVar.setId(R$id.chartHeaderBottomValueView_compositeDescription);
                        efm.r rVarHide = qVar.d.hide();
                        Intrinsics.checkNotNullExpressionValue(rVarHide, "hide(...)");
                        rVarHide.subscribe(chartHeaderBottomValueView.f);
                        chartHeaderBottomValueView.addView(qVar);
                        return qVar;
                    case 2:
                        int i21 = ChartHeaderBottomValueView.f56602h;
                        Context context4 = chartHeaderBottomValueView.getContext();
                        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                        SmallActionButton smallActionButton = new SmallActionButton(context4, null, 6, 0);
                        smallActionButton.setId(R$id.chartHeaderBottomValueView_button);
                        smallActionButton.setLayoutParams(new FrameLayout.LayoutParams(-2, foh.i.j(40)));
                        smallActionButton.setOnClickListener(new c9(chartHeaderBottomValueView, 19));
                        chartHeaderBottomValueView.addView(smallActionButton);
                        return smallActionButton;
                    default:
                        int i22 = ChartHeaderBottomValueView.f56602h;
                        Context context5 = chartHeaderBottomValueView.getContext();
                        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                        HorizontalSingleLineChartLegendView horizontalSingleLineChartLegendView = new HorizontalSingleLineChartLegendView(context5, null, 6, 0);
                        horizontalSingleLineChartLegendView.setId(R$id.chartHeaderBottomValueView_legend);
                        chartHeaderBottomValueView.addView(horizontalSingleLineChartLegendView);
                        return horizontalSingleLineChartLegendView;
                }
            }
        });
        final int i5 = 2;
        this.button = j.b(new Function0(this) { // from class: ts0.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChartHeaderBottomValueView f273883b;

            {
                this.f273883b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i5;
                ChartHeaderBottomValueView chartHeaderBottomValueView = this.f273883b;
                switch (i32) {
                    case 0:
                        int i59 = ChartHeaderBottomValueView.f56602h;
                        chartHeaderBottomValueView.getClass();
                        AppCompatTextView appCompatTextView = new AppCompatTextView(chartHeaderBottomValueView.getContext());
                        appCompatTextView.setId(R$id.chartHeaderBottomValueView_description);
                        jb3.l.e(appCompatTextView, R$attr.internal_textAppearanceBody1);
                        Context context2 = appCompatTextView.getContext();
                        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                        appCompatTextView.setTextColor(kli.a.s(R$attr.uikit_colorGreyTone50, context2));
                        chartHeaderBottomValueView.addView(appCompatTextView);
                        return appCompatTextView;
                    case 1:
                        int i6 = ChartHeaderBottomValueView.f56602h;
                        Context context3 = chartHeaderBottomValueView.getContext();
                        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                        q qVar = new q(context3, null, 6, 0);
                        qVar.setId(R$id.chartHeaderBottomValueView_compositeDescription);
                        efm.r rVarHide = qVar.d.hide();
                        Intrinsics.checkNotNullExpressionValue(rVarHide, "hide(...)");
                        rVarHide.subscribe(chartHeaderBottomValueView.f);
                        chartHeaderBottomValueView.addView(qVar);
                        return qVar;
                    case 2:
                        int i21 = ChartHeaderBottomValueView.f56602h;
                        Context context4 = chartHeaderBottomValueView.getContext();
                        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                        SmallActionButton smallActionButton = new SmallActionButton(context4, null, 6, 0);
                        smallActionButton.setId(R$id.chartHeaderBottomValueView_button);
                        smallActionButton.setLayoutParams(new FrameLayout.LayoutParams(-2, foh.i.j(40)));
                        smallActionButton.setOnClickListener(new c9(chartHeaderBottomValueView, 19));
                        chartHeaderBottomValueView.addView(smallActionButton);
                        return smallActionButton;
                    default:
                        int i22 = ChartHeaderBottomValueView.f56602h;
                        Context context5 = chartHeaderBottomValueView.getContext();
                        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                        HorizontalSingleLineChartLegendView horizontalSingleLineChartLegendView = new HorizontalSingleLineChartLegendView(context5, null, 6, 0);
                        horizontalSingleLineChartLegendView.setId(R$id.chartHeaderBottomValueView_legend);
                        chartHeaderBottomValueView.addView(horizontalSingleLineChartLegendView);
                        return horizontalSingleLineChartLegendView;
                }
            }
        });
        final int i6 = 3;
        this.legend = j.b(new Function0(this) { // from class: ts0.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChartHeaderBottomValueView f273883b;

            {
                this.f273883b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i6;
                ChartHeaderBottomValueView chartHeaderBottomValueView = this.f273883b;
                switch (i32) {
                    case 0:
                        int i59 = ChartHeaderBottomValueView.f56602h;
                        chartHeaderBottomValueView.getClass();
                        AppCompatTextView appCompatTextView = new AppCompatTextView(chartHeaderBottomValueView.getContext());
                        appCompatTextView.setId(R$id.chartHeaderBottomValueView_description);
                        jb3.l.e(appCompatTextView, R$attr.internal_textAppearanceBody1);
                        Context context2 = appCompatTextView.getContext();
                        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                        appCompatTextView.setTextColor(kli.a.s(R$attr.uikit_colorGreyTone50, context2));
                        chartHeaderBottomValueView.addView(appCompatTextView);
                        return appCompatTextView;
                    case 1:
                        int i66 = ChartHeaderBottomValueView.f56602h;
                        Context context3 = chartHeaderBottomValueView.getContext();
                        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                        q qVar = new q(context3, null, 6, 0);
                        qVar.setId(R$id.chartHeaderBottomValueView_compositeDescription);
                        efm.r rVarHide = qVar.d.hide();
                        Intrinsics.checkNotNullExpressionValue(rVarHide, "hide(...)");
                        rVarHide.subscribe(chartHeaderBottomValueView.f);
                        chartHeaderBottomValueView.addView(qVar);
                        return qVar;
                    case 2:
                        int i21 = ChartHeaderBottomValueView.f56602h;
                        Context context4 = chartHeaderBottomValueView.getContext();
                        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                        SmallActionButton smallActionButton = new SmallActionButton(context4, null, 6, 0);
                        smallActionButton.setId(R$id.chartHeaderBottomValueView_button);
                        smallActionButton.setLayoutParams(new FrameLayout.LayoutParams(-2, foh.i.j(40)));
                        smallActionButton.setOnClickListener(new c9(chartHeaderBottomValueView, 19));
                        chartHeaderBottomValueView.addView(smallActionButton);
                        return smallActionButton;
                    default:
                        int i22 = ChartHeaderBottomValueView.f56602h;
                        Context context5 = chartHeaderBottomValueView.getContext();
                        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                        HorizontalSingleLineChartLegendView horizontalSingleLineChartLegendView = new HorizontalSingleLineChartLegendView(context5, null, 6, 0);
                        horizontalSingleLineChartLegendView.setId(R$id.chartHeaderBottomValueView_legend);
                        chartHeaderBottomValueView.addView(horizontalSingleLineChartLegendView);
                        return horizontalSingleLineChartLegendView;
                }
            }
        });
        this.e = v0.a.d("create(...)");
        this.f = v0.a.d("create(...)");
    }

    public /* synthetic */ ChartHeaderBottomValueView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
