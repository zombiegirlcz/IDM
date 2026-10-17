package com.revolut.core.ui_kit.views;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.transition.Fade;
import androidx.transition.TransitionManager;
import androidx.transition.TransitionSet;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.views.InputDualTextView;
import com.revolut.core.ui_kit.views.input.InputText;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import mx0.s7;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 '2\u00020\u0001:\u0003\u0017\u000b\u0012J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00118FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0019\u001a\u00020\u00118FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0013\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0013\u001a\u0004\b!\u0010\"R\u001b\u0010&\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u0013\u001a\u0004\b%\u0010\"¨\u0006("}, d2 = {"Lcom/revolut/core/ui_kit/views/InputDualTextView;", "Landroid/widget/FrameLayout;", "Lcom/revolut/core/ui_kit/views/l;", "switchButtonState", "", "setSwitchButton", "(Lcom/revolut/core/ui_kit/views/l;)V", "Lcom/revolut/core/ui_kit/views/InputDualTextView$b;", "mode", "setMode", "(Lcom/revolut/core/ui_kit/views/InputDualTextView$b;)V", "Lmx0/s7;", "mergedHelperTextState", "", "animateVisibility", "setMergedHelperText", "(Lmx0/s7;Z)V", "Lcom/revolut/core/ui_kit/views/input/InputText;", "a", "Le8/q;", "getTextInput1", "()Lcom/revolut/core/ui_kit/views/input/InputText;", "textInput1", "b", "getTextInput2", "textInput2", "Landroid/widget/TextView;", "c", "getMergedHelperText", "()Landroid/widget/TextView;", "mergedHelperText", "Landroid/widget/ImageView;", "d", "getMergedHelperIcon", "()Landroid/widget/ImageView;", "mergedHelperIcon", "e", "getSwitchButton", "switchButton", "Companion", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InputDualTextView extends FrameLayout {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final TransitionSet f58658h;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final e8.q textInput1;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final e8.q textInput2;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final e8.q mergedHelperText;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final e8.q mergedHelperIcon;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final e8.q switchButton;
    public final ihm.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ihm.f f58662g;

    public static final class a {
        private a() {
        }
    }

    public static abstract class b {

        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final l f58663a;

            public a() {
                this(0);
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof a) && this.f58663a == ((a) obj2).f58663a;
            }

            public final int hashCode() {
                return this.f58663a.hashCode();
            }

            public a(l switchButtonState) {
                Intrinsics.checkNotNullParameter(switchButtonState, "switchButtonState");
                this.f58663a = switchButtonState;
            }

            public /* synthetic */ a(int i) {
                this(l.GONE);
            }
        }

        /* JADX INFO: renamed from: com.revolut.core.ui_kit.views.InputDualTextView$b$b, reason: collision with other inner class name */
        public static final class C0439b extends b {
            private C0439b() {
            }
        }

        private b() {
        }
    }

    static {
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.setOrdering(0);
        transitionSet.addTransition(new Fade(2));
        transitionSet.addTransition(new Fade(1));
        transitionSet.setInterpolator((TimeInterpolator) new AccelerateDecelerateInterpolator());
        transitionSet.setDuration(200L);
        f58658h = transitionSet;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InputDualTextView(@NotNull Context context) {
        this(context, null, 0, 14);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final ImageView getMergedHelperIcon() {
        return (ImageView) this.mergedHelperIcon.f();
    }

    private final TextView getMergedHelperText() {
        return (TextView) this.mergedHelperText.f();
    }

    private final ImageView getSwitchButton() {
        return (ImageView) this.switchButton.f();
    }

    public static /* synthetic */ void setMergedHelperText$default(InputDualTextView inputDualTextView, s7 s7Var, boolean z, int i, Object obj2) {
        if ((i & 2) != 0) {
            z = true;
        }
        inputDualTextView.setMergedHelperText(s7Var, z);
    }

    private final void setSwitchButton(l switchButtonState) {
        final InputDualTextView inputDualTextView;
        boolean z;
        boolean z3;
        int i = switchButtonState == null ? -1 : m.f59161a[switchButtonState.ordinal()];
        View.OnClickListener onClickListener = null;
        if (i != -1) {
            z = true;
            if (i == 1) {
                final int i2 = 0;
                inputDualTextView = this;
                onClickListener = new View.OnClickListener(inputDualTextView) { // from class: mx0.q7

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ InputDualTextView f209961b;

                    {
                        this.f209961b = inputDualTextView;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i2) {
                            case 0:
                                this.f209961b.f58662g.onNext(Unit.f186387a);
                                break;
                            case 1:
                                this.f209961b.f.onNext(Unit.f186387a);
                                break;
                            default:
                                this.f209961b.f.onNext(Unit.f186387a);
                                break;
                        }
                    }
                };
                z3 = z;
            } else if (i != 2) {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                inputDualTextView = this;
                z = false;
                z3 = z;
            } else {
                inputDualTextView = this;
                z3 = false;
            }
        } else {
            inputDualTextView = this;
            z = false;
            z3 = z;
        }
        if (z) {
            yy0.f.e(or0.u.k(inputDualTextView).Q(), LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_arrows_sort, Integer.valueOf(z3 ? R$attr.uikit_colorAccentNeutral : R$attr.uikit_colorAccentNeutral_50), R$attr.uikit_colorBackground, 8.0f, Float.valueOf(16.0f), null, 32), inputDualTextView.getSwitchButton(), null, null, 12);
            inputDualTextView.getSwitchButton().setVisibility(0);
        } else {
            inputDualTextView.getSwitchButton().setVisibility(8);
        }
        inputDualTextView.getSwitchButton().setOnClickListener(onClickListener);
    }

    public final void a(boolean z, TextView textView, ImageView imageView, boolean z3) {
        if (((textView.getVisibility() == 0) != z3 || imageView.getVisibility() == 0) && z) {
            TransitionManager.beginDelayedTransition(this, f58658h);
        }
        textView.setVisibility(z3 ? 0 : 8);
        imageView.setVisibility(8);
    }

    @NotNull
    public final InputText getTextInput1() {
        return (InputText) this.textInput1.f();
    }

    @NotNull
    public final InputText getTextInput2() {
        return (InputText) this.textInput2.f();
    }

    public final void setMergedHelperText(s7 mergedHelperTextState, boolean animateVisibility) {
        a(animateVisibility, getMergedHelperText(), getMergedHelperIcon(), false);
    }

    public final void setMode(@NotNull b mode) {
        int i;
        Intrinsics.checkNotNullParameter(mode, "mode");
        Companion.getClass();
        InputText inputText = (InputText) findViewById(R$id.inputDual_first);
        ViewGroup.LayoutParams layoutParams = inputText.getLayoutParams();
        Intrinsics.i(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        if (mode instanceof b.C0439b) {
            i = -2;
        } else {
            if (!(mode instanceof b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            i = 0;
        }
        ((ViewGroup.MarginLayoutParams) layoutParams2).width = i;
        inputText.setLayoutParams(layoutParams2);
        b.a aVar = mode instanceof b.a ? (b.a) mode : null;
        setSwitchButton(aVar != null ? aVar.f58663a : null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InputDualTextView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InputDualTextView(@NotNull Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public InputDualTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        attributeSet = (i2 & 2) != 0 ? null : attributeSet;
        i = (i2 & 4) != 0 ? 0 : i;
        Intrinsics.checkNotNullParameter(context, "context");
        super(context, attributeSet, i, 0);
        this.textInput1 = kli.a.J(R$id.inputDual_first, this);
        this.textInput2 = kli.a.J(R$id.inputDual_second, this);
        this.mergedHelperText = kli.a.J(R$id.inputDual_mergedHelperText, this);
        this.mergedHelperIcon = kli.a.J(R$id.inputDual_mergedHelperIcon, this);
        this.switchButton = kli.a.J(R$id.inputDual_switchButton, this);
        this.f = v0.a.d("create(...)");
        this.f58662g = v0.a.d("create(...)");
        View.inflate(context, R$layout.internal_view_input_dual_text, this);
    }
}
