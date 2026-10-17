package com.revolut.core.ui_kit.internal.views.chart;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import aw0.d1;
import aw0.e1;
import aw0.f1;
import aw0.g1;
import aw0.h1;
import aw0.i1;
import aw0.j1;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.animated_numbers.AnimatedNumbersView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_resources.R$attr;
import e8.q;
import efm.r;
import jo0.m;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import or0.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 12\u00020\u0001:\u0002\u001e#B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001d\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u001d\u0010\u000eJ\u0015\u0010 \u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!R\u001b\u0010\u001a\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001b\u0010+\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010$\u001a\u0004\b)\u0010*R\u001b\u00100\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010$\u001a\u0004\b.\u0010/¨\u00062"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/chart/ChartButtonHeaderView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "enabled", "", "setEnabled", "(Z)V", "Law0/j1;", "chartButtonHeader", "Lcom/revolut/core/ui_kit/models/Clause;", "displayValueAnimateFrom", "setChartHeader", "(Law0/j1;Lcom/revolut/core/ui_kit/models/Clause;)V", "displayValueData", "animateFromValue", "setDisplayValue", "(Lcom/revolut/core/ui_kit/models/Clause;Lcom/revolut/core/ui_kit/models/Clause;)V", "Law0/i1;", "title", "setTitle", "(Law0/i1;)V", "setTitleSingleLineEllipsize", "Lts0/b;", "alignment", "setAlignment", "(Lts0/b;)V", "Landroid/widget/TextView;", "a", "Le8/q;", "getTitle", "()Landroid/widget/TextView;", "Lcom/revolut/core/ui_kit/internal/views/animated_numbers/AnimatedNumbersView;", "b", "getDisplayValue", "()Lcom/revolut/core/ui_kit/internal/views/animated_numbers/AnimatedNumbersView;", "displayValue", "Lcom/revolut/core/ui_kit/internal/views/chart/ChartHeaderBottomValueView;", "c", "getBottomValue", "()Lcom/revolut/core/ui_kit/internal/views/chart/ChartHeaderBottomValueView;", "bottomValue", "Companion", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ChartButtonHeaderView extends LinearLayout {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final q title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final q displayValue;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final q bottomValue;
    public boolean d;

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChartButtonHeaderView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final ChartHeaderBottomValueView getBottomValue() {
        return (ChartHeaderBottomValueView) this.bottomValue.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AnimatedNumbersView getDisplayValue() {
        return (AnimatedNumbersView) this.displayValue.f();
    }

    private final TextView getTitle() {
        return (TextView) this.title.f();
    }

    public final ihm.f b() {
        return getBottomValue().e;
    }

    public final r c() {
        r rVarHide = getBottomValue().f.hide();
        Intrinsics.checkNotNullExpressionValue(rVarHide, "hide(...)");
        return rVarHide;
    }

    public final void setAlignment(@NotNull ts0.b alignment) {
        int i;
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        int i2 = ts0.c.f273859a[alignment.ordinal()];
        if (i2 == 1) {
            i = 17;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = 8388611;
        }
        setGravity(i);
        getDisplayValue().setGravity(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    public final void setChartHeader(@NotNull j1 chartButtonHeader, Clause displayValueAnimateFrom) {
        Intrinsics.checkNotNullParameter(chartButtonHeader, "chartButtonHeader");
        setTitle(chartButtonHeader.f10367a);
        setDisplayValue(chartButtonHeader.f10368b, displayValueAnimateFrom);
        g1 g1Var = chartButtonHeader.f10369c;
        getBottomValue().setVisibility(g1Var != null ? 0 : 8);
        if (g1Var != null) {
            getBottomValue().setModel(g1Var, getGravity());
            if (!(g1Var instanceof d1) && !(g1Var instanceof e1) && !(g1Var instanceof f1)) {
                throw new NoWhenBranchMatchedException();
            }
            ViewGroup.LayoutParams layoutParams = getBottomValue().getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams == null || marginLayoutParams.topMargin == 0) {
                return;
            }
            u.z(getBottomValue(), 0, 0, 0, 0, false, 29);
        }
    }

    public final void setDisplayValue(@NotNull Clause displayValueData, Clause animateFromValue) {
        Intrinsics.checkNotNullParameter(displayValueData, "displayValueData");
        getDisplayValue().setTextAppearance(R$attr.internal_textAppearanceDisplay2);
        if (animateFromValue == null || !m.f176851h || this.d) {
            getDisplayValue().setAnimateSpin(false);
            getDisplayValue().setCurrentClause(displayValueData);
        } else {
            getDisplayValue().setAnimateSpin(true);
            getDisplayValue().setCurrentClause(animateFromValue);
            getDisplayValue().postDelayed(new r8.d(12, this, false, displayValueData), 500L);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        if (enabled != isEnabled()) {
            getTitle().setEnabled(enabled);
            getDisplayValue().setEnabled(enabled);
            getBottomValue().setEnabled(enabled);
        }
        super.setEnabled(enabled);
    }

    public final void setTitle(i1 title) {
        if (title instanceof h1) {
            kli.a.b(getTitle(), ((h1) title).f10333a, ty0.f.f275450a);
        } else {
            if (title != null) {
                throw new NoWhenBranchMatchedException();
            }
            kli.a.b(getTitle(), null, ty0.f.f275450a);
        }
    }

    public final void setTitleSingleLineEllipsize(boolean enabled) {
        getTitle().setMaxLines(enabled ? 1 : Integer.MAX_VALUE);
        getTitle().setEllipsize(enabled ? TextUtils.TruncateAt.END : null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChartButtonHeaderView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChartButtonHeaderView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.title = kli.a.J(R$id.chartButtonHeaderView_title, this);
        this.displayValue = kli.a.J(R$id.chartButtonHeaderView_display, this);
        this.bottomValue = kli.a.J(R$id.chartButtonHeaderView_bottomValue, this);
        View.inflate(context, R$layout.internal_chart_button_header_view, this);
        setOrientation(1);
        getDisplayValue().setGravity(17);
        getDisplayValue().setAutoSize(true);
        setAlignment(ts0.b.CENTER);
    }

    public /* synthetic */ ChartButtonHeaderView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
