package com.revolut.core.ui_kit.internal.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import aw0.j1;
import aw0.r6;
import aw0.s6;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.chart.ChartButtonHeaderView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.LabelButtonView;
import ix0.c0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ms0.o1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 +2\u00020\u0001:\u0001,B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u001c\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0016\b\u0002\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\f\u0018\u00010\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\f2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b \u0010!R.\u0010*\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010\"8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006-"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/LimitProgressBarWithChartHeader;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "enabled", "", "setEnabled", "(Z)V", "Law0/s6;", "progress", "setProgress", "(Law0/s6;)V", "Law0/j1;", "chartHeader", "setHeader", "(Law0/j1;)V", "Lcom/revolut/core/ui_kit/models/Clause;", "description", "Lkotlin/Function1;", "Lty0/a;", "onClick", "setBottomDescription", "(Lcom/revolut/core/ui_kit/models/Clause;Lkotlin/jvm/functions/Function1;)V", "Law0/r6;", "label", "setLabel", "(Law0/r6;)V", "Luw0/i;", "value", "k", "Luw0/i;", "getDataChangeAnimationRequest", "()Luw0/i;", "setDataChangeAnimationRequest", "(Luw0/i;)V", "dataChangeAnimationRequest", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LimitProgressBarWithChartHeader extends ConstraintLayout {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LimitProgressBar f56226b;
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LabelButtonView f56227g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ChartButtonHeaderView f56228h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public o1 f56229j;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public uw0.i dataChangeAnimationRequest;

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LimitProgressBarWithChartHeader(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setBottomDescription$default(LimitProgressBarWithChartHeader limitProgressBarWithChartHeader, Clause clause, Function1 function1, int i, Object obj2) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        limitProgressBarWithChartHeader.setBottomDescription(clause, function1);
    }

    public final uw0.i getDataChangeAnimationRequest() {
        return this.dataChangeAnimationRequest;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int i3 = this.i;
        if (size <= 0 || size > i3) {
            size = i3;
        }
        double d = size;
        int iB = rim.d.b((d - (Math.sin(0.7853981633974483d) * d)) / ((double) 2));
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iK = kli.a.k(context, 16.0f) + iB;
        LabelButtonView labelButtonView = this.f56227g;
        ViewGroup.LayoutParams layoutParams = labelButtonView.getLayoutParams();
        Intrinsics.i(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (marginLayoutParams.leftMargin != iK || marginLayoutParams.rightMargin != iK) {
            marginLayoutParams.leftMargin = iK;
            marginLayoutParams.rightMargin = iK;
            labelButtonView.forceLayout();
        }
        super.onMeasure(i, i2);
    }

    public final void setBottomDescription(Clause description, Function1<? super ty0.a, Unit> onClick) {
        kli.a.e(this.f, description, onClick, null, 0, 12);
    }

    public final void setDataChangeAnimationRequest(uw0.i iVar) {
        if (Intrinsics.f(this.dataChangeAnimationRequest, iVar)) {
            return;
        }
        this.dataChangeAnimationRequest = iVar;
        o1 o1Var = this.f56229j;
        if (o1Var != null) {
            this.f56226b.setupAnimation$ui_kit_components_release(o1Var);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        o1 o1Var;
        if (enabled != isEnabled()) {
            LimitProgressBar limitProgressBar = this.f56226b;
            limitProgressBar.setLimitEnabled(enabled);
            if (enabled && (o1Var = this.f56229j) != null) {
                limitProgressBar.b(o1Var);
            }
            float f = enabled ? 1.0f : 0.4f;
            TextView textView = this.f;
            textView.setEnabled(enabled);
            textView.setAlpha(f);
            ChartButtonHeaderView chartButtonHeaderView = this.f56228h;
            chartButtonHeaderView.setEnabled(enabled);
            chartButtonHeaderView.setAlpha(f);
            LabelButtonView labelButtonView = this.f56227g;
            labelButtonView.setEnabled(enabled);
            labelButtonView.setAlpha(f);
        }
        super.setEnabled(enabled);
    }

    public final void setHeader(@NotNull j1 chartHeader) {
        Intrinsics.checkNotNullParameter(chartHeader, "chartHeader");
        this.f56228h.setChartHeader(chartHeader, null);
    }

    public final void setLabel(r6 label) {
        r6.Companion.getClass();
        int i = label != null ? 0 : 8;
        LabelButtonView labelButtonView = this.f56227g;
        labelButtonView.setVisibility(i);
        if (label != null) {
            labelButtonView.setStartIcon(label.f10513a);
            labelButtonView.setEndIcon(null);
            labelButtonView.setText(null);
        }
    }

    public final void setProgress(@NotNull s6 progress) {
        Intrinsics.checkNotNullParameter(progress, "progress");
        o1 o1Var = new o1(progress.f10524a, progress.f10525b, progress.f10526c, progress.d, progress.e, progress.f, progress.f10527g, 12.0f, 800L, this.dataChangeAnimationRequest, progress.f10528h, 270.0f, BitmapDescriptorFactory.HUE_RED, false, 12288);
        if (Intrinsics.f(this.f56229j, o1Var)) {
            return;
        }
        this.f56229j = o1Var;
        this.f56226b.b(o1Var);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LimitProgressBarWithChartHeader(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LimitProgressBarWithChartHeader(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        int iK = kli.a.k(context, 320.0f);
        this.i = iK;
        LayoutInflater.from(context).inflate(R$layout.internal_limit_progress_bar_with_header, (ViewGroup) this, true);
        setClipChildren(false);
        View viewFindViewById = findViewById(R$id.limitProgressBar_progressView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        LimitProgressBar limitProgressBar = (LimitProgressBar) viewFindViewById;
        this.f56226b = limitProgressBar;
        View viewFindViewById2 = findViewById(R$id.limitProgressBar_bottomDescription);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById2;
        this.f = textView;
        View viewFindViewById3 = findViewById(R$id.limitProgressBar_labelButton);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f56227g = (LabelButtonView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R$id.limitProgressBar_header);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f56228h = (ChartButtonHeaderView) viewFindViewById4;
        textView.setMovementMethod(c0.f169220a);
        ViewGroup.LayoutParams layoutParams = limitProgressBar.getLayoutParams();
        Intrinsics.i(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ((ConstraintLayout.LayoutParams) layoutParams).matchConstraintMaxWidth = iK;
    }

    public /* synthetic */ LimitProgressBarWithChartHeader(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
