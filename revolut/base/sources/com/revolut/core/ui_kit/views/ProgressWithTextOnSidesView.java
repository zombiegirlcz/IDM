package com.revolut.core.ui_kit.views;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0010\u001a\u00020\u000b2\b\b\u0001\u0010\u000e\u001a\u00020\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000b2\b\b\u0001\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\rJ\u001f\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0016\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010!\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010\u001dR\u001b\u0010&\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u001b\u001a\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lcom/revolut/core/ui_kit/views/ProgressWithTextOnSidesView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "color", "", "setTextColor", "(I)V", "backgroundColor", "trackColor", "setProgressColor", "(II)V", "progress", "setProgress", "Lcom/revolut/core/ui_kit/models/Clause;", "start", "end", "setText", "(Lcom/revolut/core/ui_kit/models/Clause;Lcom/revolut/core/ui_kit/models/Clause;)V", "Landroid/widget/TextView;", "b", "Le8/q;", "getTextStartView", "()Landroid/widget/TextView;", "textStartView", "f", "getTextEndView", "textEndView", "Landroid/widget/ProgressBar;", "g", "getProgressView", "()Landroid/widget/ProgressBar;", "progressView", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ProgressWithTextOnSidesView extends ConstraintLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final e8.q textStartView;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final e8.q textEndView;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final e8.q progressView;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProgressWithTextOnSidesView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final ProgressBar getProgressView() {
        return (ProgressBar) this.progressView.f();
    }

    private final TextView getTextEndView() {
        return (TextView) this.textEndView.f();
    }

    private final TextView getTextStartView() {
        return (TextView) this.textStartView.f();
    }

    public final void setProgress(int progress) {
        getProgressView().setProgress(progress);
    }

    public final void setProgressColor(int backgroundColor, int trackColor) {
        ProgressBar progressView = getProgressView();
        progressView.setProgressBackgroundTintList(ColorStateList.valueOf(backgroundColor));
        progressView.setProgressTintList(ColorStateList.valueOf(trackColor));
    }

    public final void setText(Clause start, @NotNull Clause end2) {
        Intrinsics.checkNotNullParameter(end2, "end");
        kli.a.b(getTextStartView(), start, ty0.f.f275450a);
        kli.a.b(getTextEndView(), end2, ty0.f.f275450a);
    }

    public final void setTextColor(int color) {
        getTextStartView().setTextColor(color);
        getTextEndView().setTextColor(color);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProgressWithTextOnSidesView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressWithTextOnSidesView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.textStartView = kli.a.J(R$id.progressWithTextOnSides_startText, this);
        this.textEndView = kli.a.J(R$id.progressWithTextOnSides_endText, this);
        this.progressView = kli.a.J(R$id.progressWithTextOnSides_progress, this);
        View.inflate(context, R$layout.internal_progress_with_text_on_sides, this);
    }

    public /* synthetic */ ProgressWithTextOnSidesView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
