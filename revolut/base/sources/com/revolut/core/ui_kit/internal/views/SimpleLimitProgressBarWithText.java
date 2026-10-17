package com.revolut.core.ui_kit.internal.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.animated_numbers.AnimatedNumbersView;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ms0.d4;
import ms0.o1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0002\n\u001dB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014R(\u0010\u001b\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/SimpleLimitProgressBarWithText;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lms0/d4;", "style", "", "setStyle", "(Lms0/d4;)V", "Lcom/revolut/core/ui_kit/models/Clause;", "title", "", "animateChange", "setTitle", "(Lcom/revolut/core/ui_kit/models/Clause;Z)V", "Lms0/o1;", "value", "g", "Lms0/o1;", "setLimitProgressBarStyle", "(Lms0/o1;)V", "limitProgressBarStyle", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SimpleLimitProgressBarWithText extends ConstraintLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LimitProgressBar f56383b;
    public final AnimatedNumbersView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public o1 limitProgressBarStyle;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SimpleLimitProgressBarWithText(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void setLimitProgressBarStyle(o1 o1Var) {
        if (Intrinsics.f(this.limitProgressBarStyle, o1Var)) {
            return;
        }
        this.limitProgressBarStyle = o1Var;
        if (o1Var != null) {
            this.f56383b.b(o1Var);
        }
    }

    public static /* synthetic */ void setTitle$default(SimpleLimitProgressBarWithText simpleLimitProgressBarWithText, Clause clause, boolean z, int i, Object obj2) {
        if ((i & 2) != 0) {
            z = false;
        }
        simpleLimitProgressBarWithText.setTitle(clause, z);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void setStyle(@NotNull d4 style) {
        Intrinsics.checkNotNullParameter(style, "style");
        float fE = style.e();
        float f = style.f208228c;
        float fD = style.d();
        int iB = style.c().b();
        long jA = style.a();
        uw0.i iVarB = style.b();
        float f4 = style.f208227b;
        int iA = style.c().a();
        setLimitProgressBarStyle(new o1(fE, BitmapDescriptorFactory.HUE_RED, fD, style.c().c(), 0, iB, iA, f4, jA, iVarB, false, style.f() ? 360.0f : 288.0f, style.f() ? 270.0f : 90.0f, style.g(), 18));
        int i = style.f208226a;
        AnimatedNumbersView animatedNumbersView = this.f;
        animatedNumbersView.setTextAppearance(i);
        ViewGroup.LayoutParams layoutParams = animatedNumbersView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        layoutParams2.setMarginStart(kli.a.k(context, f));
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        layoutParams2.setMarginEnd(kli.a.k(context2, f));
        animatedNumbersView.setLayoutParams(layoutParams2);
    }

    public final void setTitle(@NotNull Clause title, boolean animateChange) {
        Intrinsics.checkNotNullParameter(title, "title");
        AnimatedNumbersView animatedNumbersView = this.f;
        animatedNumbersView.setAnimateSpin(animateChange);
        animatedNumbersView.setCurrentClause(title);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SimpleLimitProgressBarWithText(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleLimitProgressBarWithText(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(context).inflate(R$layout.internal_simple_limit_progress_bar_with_text, (ViewGroup) this, true);
        View viewFindViewById = findViewById(R$id.simpleLimitProgressBarWithText_limitProgress);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f56383b = (LimitProgressBar) viewFindViewById;
        View viewFindViewById2 = findViewById(R$id.simpleLimitProgressBarWithText_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f = (AnimatedNumbersView) viewFindViewById2;
        setClipChildren(false);
    }

    public /* synthetic */ SimpleLimitProgressBarWithText(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
