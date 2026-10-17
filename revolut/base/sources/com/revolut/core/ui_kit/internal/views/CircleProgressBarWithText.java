package com.revolut.core.ui_kit.internal.views;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import au0.b5;
import aw0.o9;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.models.CharSequenceClause;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_resources.R$attr;
import e8.q;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u0019\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u000b¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u000b¢\u0006\u0004\b\u001f\u0010\u001eJ\u0017\u0010!\u001a\u00020\u000b2\b\b\u0001\u0010 \u001a\u00020\u0006¢\u0006\u0004\b!\u0010\rJ\u0017\u0010\"\u001a\u00020\u000b2\b\b\u0001\u0010 \u001a\u00020\u0006¢\u0006\u0004\b\"\u0010\rJ\u0017\u0010#\u001a\u00020\u000b2\b\b\u0001\u0010 \u001a\u00020\u0006¢\u0006\u0004\b#\u0010\rR\u001b\u0010)\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001b\u0010.\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010&\u001a\u0004\b,\u0010-R\u001b\u00101\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010&\u001a\u0004\b0\u0010-R\u001b\u00104\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010&\u001a\u0004\b3\u0010-¨\u00065"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/CircleProgressBarWithText;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "progress", "", "setProgress", "(I)V", "Lcom/revolut/core/ui_kit/internal/views/ProgressStyle;", "style", "setProgressStyle", "(Lcom/revolut/core/ui_kit/internal/views/ProgressStyle;)V", "Lcom/revolut/core/ui_kit/models/Clause;", "text", "", "percentBadgeVisible", "setPercentText", "(Lcom/revolut/core/ui_kit/models/Clause;Z)V", "label", "setLabel", "(Lcom/revolut/core/ui_kit/models/Clause;)V", "", "(Ljava/lang/CharSequence;)V", "setDefaultPercentTextStyleAndSingleLine", "()V", "setCustomPercentTextStyleAndMaxTwoLines", "colour", "setProgressColour", "setProgressBaseColour", "setTextColour", "Lcom/revolut/core/ui_kit/internal/views/CircleProgressBar;", "f", "Le8/q;", "getProgressBar", "()Lcom/revolut/core/ui_kit/internal/views/CircleProgressBar;", "progressBar", "Landroid/widget/TextView;", "g", "getPercentText", "()Landroid/widget/TextView;", "percentText", "h", "getPercentBadge", "percentBadge", "i", "getPercentInnerText", "percentInnerText", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CircleProgressBarWithText extends ConstraintLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b5 f56143b;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final q progressBar;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final q percentText;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final q percentBadge;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final q percentInnerText;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CircleProgressBarWithText(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void f0(CircleProgressBarWithText circleProgressBarWithText, ValueAnimator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        kli.a.b(circleProgressBarWithText.getPercentText(), new TextClause(animation.getAnimatedValue().toString(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), ty0.f.f275450a);
    }

    private final TextView getPercentBadge() {
        return (TextView) this.percentBadge.f();
    }

    private final TextView getPercentInnerText() {
        return (TextView) this.percentInnerText.f();
    }

    private final TextView getPercentText() {
        return (TextView) this.percentText.f();
    }

    private final CircleProgressBar getProgressBar() {
        return (CircleProgressBar) this.progressBar.f();
    }

    public static /* synthetic */ void setPercentText$default(CircleProgressBarWithText circleProgressBarWithText, Clause clause, boolean z, int i, Object obj2) {
        if ((i & 2) != 0) {
            z = true;
        }
        circleProgressBarWithText.setPercentText(clause, z);
    }

    public final void g0() {
        getProgressBar().b();
    }

    public final void setCustomPercentTextStyleAndMaxTwoLines() {
        jb3.l.e(getPercentText(), R$attr.internal_textAppearanceHeading1);
        getPercentText().setMaxLines(2);
    }

    public final void setDefaultPercentTextStyleAndSingleLine() {
        jb3.l.e(getPercentText(), R$attr.internal_textAppearanceDisplay1);
        getPercentText().setMaxLines(1);
    }

    public final void setLabel(Clause label) {
        kli.a.b(getPercentInnerText(), label, ty0.f.f275450a);
    }

    public final void setPercentText(@NotNull Clause text, boolean percentBadgeVisible) {
        Intrinsics.checkNotNullParameter(text, "text");
        kli.a.b(getPercentText(), text, ty0.f.f275450a);
        getPercentBadge().setVisibility(percentBadgeVisible ? 0 : 8);
    }

    public final void setProgress(int progress) {
        getProgressBar().setProgress(progress);
        getPercentText().setText(String.valueOf(progress));
        getPercentBadge().setVisibility(0);
    }

    public final void setProgressBaseColour(int colour) {
        CircleProgressBar progressBar = getProgressBar();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        progressBar.setBgColor(kli.a.s(colour, context));
    }

    public final void setProgressColour(int colour) {
        CircleProgressBar progressBar = getProgressBar();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        progressBar.setStartColor(kli.a.s(colour, context));
        CircleProgressBar progressBar2 = getProgressBar();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        progressBar2.setEndColor(kli.a.s(colour, context2));
    }

    public final void setProgressStyle(@NotNull ProgressStyle style) {
        Intrinsics.checkNotNullParameter(style, "style");
        getProgressBar().a(style);
        if (style.i == null) {
            b5 listener = this.f56143b;
            if (listener != null) {
                CircleProgressBar progressBar = getProgressBar();
                progressBar.getClass();
                Intrinsics.checkNotNullParameter(listener, "listener");
                progressBar.f56136j.remove(listener);
                this.f56143b = null;
                return;
            }
            return;
        }
        if (this.f56143b == null) {
            b5 listener2 = new b5(this, 24);
            CircleProgressBar progressBar2 = getProgressBar();
            progressBar2.getClass();
            Intrinsics.checkNotNullParameter(listener2, "listener");
            progressBar2.f56136j.add(listener2);
            this.f56143b = listener2;
        }
    }

    public final void setTextColour(int colour) {
        TextView percentText = getPercentText();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        percentText.setTextColor(kli.a.s(colour, context));
        TextView percentBadge = getPercentBadge();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        percentBadge.setTextColor(kli.a.s(colour, context2));
        TextView percentInnerText = getPercentInnerText();
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        percentInnerText.setTextColor(kli.a.s(colour, context3));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CircleProgressBarWithText(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @yhm.d
    public final void setLabel(@NotNull CharSequence label) {
        Intrinsics.checkNotNullParameter(label, "label");
        setLabel(new CharSequenceClause(label));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CircleProgressBarWithText(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.progressBar = kli.a.J(R$id.progressBar, this);
        this.percentText = kli.a.J(R$id.percentText, this);
        this.percentBadge = kli.a.J(R$id.percentBadge, this);
        this.percentInnerText = kli.a.J(R$id.percentInnerText, this);
        LayoutInflater.from(context).inflate(R$layout.internal_circle_progress_bar_with_text, (ViewGroup) this, true);
    }

    public /* synthetic */ CircleProgressBarWithText(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
