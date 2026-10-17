package com.revolut.core.ui_kit.views;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.transition.AutoTransition;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.SpringAnimation;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.R$string;
import com.revolut.core.ui_kit.internal.views.switcher_button.SwitcherButtonView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.input.MaskedTextInputEditText;
import com.revolut.core.ui_kit_core.displayers.haptic.Haptic;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mx0.c0;
import mx0.f3;
import mx0.g3;
import mx0.h3;
import mx0.i3;
import mx0.j3;
import mx0.k3;
import mx0.l3;
import mx0.m3;
import mx0.n3;
import mx0.o3;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 w2\u00020\u0001:\u0006)!xy\u001dzB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u001c\u0010\u001aJ\u0017\u0010\u001f\u001a\u00020\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010#\u001a\u00020\f2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0007¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\f2\u0006\u0010&\u001a\u00020%H\u0007¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\f2\b\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b+\u0010,J\u0015\u0010.\u001a\u00020\f2\u0006\u0010-\u001a\u00020%¢\u0006\u0004\b.\u0010(J\u0017\u00101\u001a\u00020\f2\b\u00100\u001a\u0004\u0018\u00010/¢\u0006\u0004\b1\u00102J\u0017\u00105\u001a\u00020\f2\b\u00104\u001a\u0004\u0018\u000103¢\u0006\u0004\b5\u00106J\u0017\u00109\u001a\u00020\f2\b\u00108\u001a\u0004\u0018\u000107¢\u0006\u0004\b9\u0010:J\u0019\u0010;\u001a\u00020\f2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0004\b;\u0010$J\u0017\u0010<\u001a\u00020\f2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b<\u0010(R\u001b\u0010B\u001a\u00020=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u001b\u0010G\u001a\u00020C8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bD\u0010?\u001a\u0004\bE\u0010FR\u001b\u0010J\u001a\u00020=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bH\u0010?\u001a\u0004\bI\u0010AR\u001b\u0010O\u001a\u00020K8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bL\u0010?\u001a\u0004\bM\u0010NR\u001b\u0010R\u001a\u00020=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bP\u0010?\u001a\u0004\bQ\u0010AR\u001b\u0010W\u001a\u00020S8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bT\u0010?\u001a\u0004\bU\u0010VR\u001b\u0010Z\u001a\u00020K8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bX\u0010?\u001a\u0004\bY\u0010NR\u001b\u0010]\u001a\u00020=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b[\u0010?\u001a\u0004\b\\\u0010AR\u001b\u0010`\u001a\u00020S8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b^\u0010?\u001a\u0004\b_\u0010VR\u001b\u0010e\u001a\u00020a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bb\u0010?\u001a\u0004\bc\u0010dR\u001b\u0010k\u001a\u00020f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\bi\u0010jR(\u0010r\u001a\u0004\u0018\u00010l2\b\u0010m\u001a\u0004\u0018\u00010l8@@@X\u0080\u000e¢\u0006\f\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR\u0011\u0010v\u001a\u00020s8F¢\u0006\u0006\u001a\u0004\bt\u0010u¨\u0006{"}, d2 = {"Lcom/revolut/core/ui_kit/views/CenteredAmountView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/revolut/core/ui_kit/models/Clause;", "label", "", "setTopLabel", "(Lcom/revolut/core/ui_kit/models/Clause;)V", "Lbw0/h;", "amountInputModel", "setAmountInput", "(Lbw0/h;)V", "Lmx0/c0;", "size", "setAmountFontSize", "(Lmx0/c0;)V", "Lbw0/m;", "hint", "setHint", "(Lbw0/m;)V", "secondHint", "setSecondHint", "Lmx0/l3;", "sideControls", "setSideControls", "(Lmx0/l3;)V", "Lmx0/i3;", "fiatSwitcherData", "setFiatSwitcherData", "(Lmx0/i3;)V", "", "show", "setChevronButton", "(Z)V", "Lmx0/f3;", "currencyPickerData", "setCurrencyPickerData", "(Lmx0/f3;)V", "isInErrorState", "setErrorHappened", "Law0/i3;", "customFont", "setCustomFont", "(Law0/i3;)V", "Lbw0/a;", "amountInputColors", "setInputColors", "(Lbw0/a;)V", "Ljo0/b;", "customKeyboardStyle", "setCustomKeyboardStyle", "(Ljo0/b;)V", "setFiatSwitcherDataInternal", "setChevronButtonInternal", "Landroid/widget/TextView;", "o", "Le8/q;", "getTopLabelText", "()Landroid/widget/TextView;", "topLabelText", "Lcom/revolut/core/ui_kit/views/AmountInputView;", "p", "getInputView", "()Lcom/revolut/core/ui_kit/views/AmountInputView;", "inputView", "s", "getFiatSwitcherText", "fiatSwitcherText", "Landroid/widget/ImageView;", "t", "getHintIcon", "()Landroid/widget/ImageView;", "hintIcon", "u", "getHintText", "hintText", "Lcom/facebook/shimmer/ShimmerFrameLayout;", "v", "getHintShimmer", "()Lcom/facebook/shimmer/ShimmerFrameLayout;", "hintShimmer", "w", "getSecondHintIcon", "secondHintIcon", "x", "getSecondHintText", "secondHintText", "y", "getSecondHintShimmer", "secondHintShimmer", "Lcom/revolut/core/ui_kit/internal/views/switcher_button/SwitcherButtonView;", "z", "getCurrencyPicker", "()Lcom/revolut/core/ui_kit/internal/views/switcher_button/SwitcherButtonView;", "currencyPicker", "Landroid/transition/AutoTransition;", "F", "Lkotlin/Lazy;", "getHintVisibilityTransition", "()Landroid/transition/AutoTransition;", "hintVisibilityTransition", "Lyz0/b;", "value", "getMaskingDelegate$ui_kit_components_release", "()Lyz0/b;", "setMaskingDelegate$ui_kit_components_release", "(Lyz0/b;)V", "maskingDelegate", "Lcom/revolut/core/ui_kit/views/input/MaskedTextInputEditText;", "getEditText", "()Lcom/revolut/core/ui_kit/views/input/MaskedTextInputEditText;", "editText", "Companion", "mx0/h3", "mx0/m3", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CenteredAmountView extends ConstraintLayout {

    @NotNull
    private static final a Companion = new a();
    public static final GlyphImage G = new GlyphImage(R$drawable.uikit_icn_16_minus, null, new TextLocalisedClause(R$string.common_action_minus, null, null, 14), 2);
    public static final GlyphImage H = new GlyphImage(R$drawable.uikit_icn_16_plus, null, new TextLocalisedClause(R$string.common_action_plus, null, null, 14), 2);
    public boolean A;
    public boolean B;
    public final fp0.p C;
    public final fp0.p D;
    public final SpringAnimation E;
    public final Object F;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ihm.f f58408b;
    public final ihm.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ihm.f f58409g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ihm.f f58410h;
    public final ihm.f i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ihm.f f58411j;
    public final ihm.f k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ihm.f f58412l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f58413m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f58414n;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public final e8.q topLabelText;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public final e8.q inputView;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final AppCompatImageView f58416q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final AppCompatImageView f58417r;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    public final e8.q fiatSwitcherText;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public final e8.q hintIcon;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public final e8.q hintText;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public final e8.q hintShimmer;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    public final e8.q secondHintIcon;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    public final e8.q secondHintText;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    public final e8.q secondHintShimmer;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public final e8.q currencyPicker;

    public static final class a {
        private a() {
        }
    }

    public static final class b implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f58423a = new b();

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            return Boolean.valueOf(obj2 instanceof ViewGroup);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CenteredAmountView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final SwitcherButtonView getCurrencyPicker() {
        return (SwitcherButtonView) this.currencyPicker.f();
    }

    private final TextView getFiatSwitcherText() {
        return (TextView) this.fiatSwitcherText.f();
    }

    private final ImageView getHintIcon() {
        return (ImageView) this.hintIcon.f();
    }

    private final ShimmerFrameLayout getHintShimmer() {
        return (ShimmerFrameLayout) this.hintShimmer.f();
    }

    private final TextView getHintText() {
        return (TextView) this.hintText.f();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final AutoTransition getHintVisibilityTransition() {
        return (AutoTransition) this.F.getValue();
    }

    private final AmountInputView getInputView() {
        return (AmountInputView) this.inputView.f();
    }

    private final ImageView getSecondHintIcon() {
        return (ImageView) this.secondHintIcon.f();
    }

    private final ShimmerFrameLayout getSecondHintShimmer() {
        return (ShimmerFrameLayout) this.secondHintShimmer.f();
    }

    private final TextView getSecondHintText() {
        return (TextView) this.secondHintText.f();
    }

    private final TextView getTopLabelText() {
        return (TextView) this.topLabelText.f();
    }

    private final void setChevronButtonInternal(boolean show) {
        AppCompatImageView appCompatImageView = this.f58416q;
        if (show) {
            AmountInputView inputView = getInputView();
            int i = this.f58413m;
            inputView.setStartView$ui_kit_components_release(appCompatImageView, i, i, this.f58414n);
            appCompatImageView.setVisibility(0);
            appCompatImageView.setEnabled(true);
            yy0.f.e(or0.u.k(this).Q(), LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_16_chevron_down, null, R$attr.uikit_colorElevatedWidgetBackground, 4.8f, Float.valueOf(14.4f), null, 32), appCompatImageView, null, null, 12);
        } else {
            appCompatImageView.setVisibility(8);
            yy0.f.e(or0.u.k(this).Q(), null, appCompatImageView, null, null, 12);
            AmountInputView inputView2 = getInputView();
            inputView2.f58337m.setVisibility(8);
            if (inputView2.f58332b) {
                inputView2.f58341r.l(false);
            }
        }
        fp0.p pVar = this.C;
        fp0.p.b(pVar, show);
        View view = pVar.f137029a;
        or0.m.a(view);
        if (show) {
            view.setOnClickListener(new o3(this, 0));
        } else {
            or0.u.o(view);
        }
    }

    private final void setFiatSwitcherDataInternal(i3 fiatSwitcherData) {
        AppCompatImageView appCompatImageView = this.f58417r;
        if (fiatSwitcherData == null) {
            getFiatSwitcherText().setVisibility(8);
            appCompatImageView.setVisibility(8);
            AmountInputView inputView = getInputView();
            inputView.f58338n.setVisibility(8);
            if (inputView.f58332b) {
                inputView.f58341r.k(false);
                return;
            }
            return;
        }
        m3 m3Var = fiatSwitcherData.f209750a;
        Clause clause = fiatSwitcherData.f209751b;
        getFiatSwitcherText().setVisibility(clause != null ? 0 : 8);
        TextView fiatSwitcherText = getFiatSwitcherText();
        boolean z = clause != null;
        or0.m.a(fiatSwitcherText);
        if (z) {
            fiatSwitcherText.setOnClickListener(new o3(this, 2));
        } else {
            or0.u.o(fiatSwitcherText);
        }
        if (clause != null) {
            ty0.c.b(or0.u.k(this).b0(), fiatSwitcherData.f209751b, getFiatSwitcherText(), null, null, 12);
        }
        int i = m3Var == null ? -1 : n3.f209852b[m3Var.ordinal()];
        if (i == -1) {
            AmountInputView inputView2 = getInputView();
            inputView2.f58338n.setVisibility(8);
            if (inputView2.f58332b) {
                inputView2.f58341r.k(false);
            }
            appCompatImageView.setVisibility(8);
        } else {
            if (i != 1 && i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            AmountInputView inputView3 = getInputView();
            int i2 = this.f58413m;
            inputView3.setEndView$ui_kit_components_release(appCompatImageView, i2, i2, this.f58414n);
            appCompatImageView.setVisibility(0);
            appCompatImageView.setEnabled(true);
            yy0.f.e(or0.u.k(this).Q(), LayeredImage.Companion.a(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_arrows_sort, new Color.Solid(R$attr.uikit_colorAccent), new Color.ModifiedColor(new Color.Solid(R$attr.uikit_colorAccentNeutral), 0.1f), 4.8f, Float.valueOf(14.4f), 32), appCompatImageView, null, null, 12);
            pd.b.p(appCompatImageView, fiatSwitcherData.f209752c);
        }
        boolean z3 = m3Var != null;
        fp0.p pVar = this.D;
        fp0.p.b(pVar, z3);
        View view = pVar.f137029a;
        or0.m.a(view);
        if (z3) {
            view.setOnClickListener(new o3(this, 1));
        } else {
            or0.u.o(view);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f0(android.widget.TextView r4, android.widget.ImageView r5, com.facebook.shimmer.ShimmerFrameLayout r6, boolean r7, boolean r8, boolean r9) {
        /*
            r3 = this;
            android.transition.TransitionManager.endTransitions(r3)
            int r0 = r4.getVisibility()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto Ld
            r0 = r1
            goto Le
        Ld:
            r0 = r2
        Le:
            if (r0 != r7) goto L1a
            int r0 = r6.getVisibility()
            if (r0 != 0) goto L17
            goto L18
        L17:
            r1 = r2
        L18:
            if (r1 == r9) goto L21
        L1a:
            android.transition.AutoTransition r0 = r3.getHintVisibilityTransition()
            android.transition.TransitionManager.beginDelayedTransition(r3, r0)
        L21:
            r0 = 8
            if (r7 == 0) goto L27
            r7 = r2
            goto L28
        L27:
            r7 = r0
        L28:
            r4.setVisibility(r7)
            if (r8 == 0) goto L2f
            r4 = r2
            goto L30
        L2f:
            r4 = r0
        L30:
            r5.setVisibility(r4)
            if (r9 == 0) goto L36
            goto L37
        L36:
            r2 = r0
        L37:
            r6.setVisibility(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.views.CenteredAmountView.f0(android.widget.TextView, android.widget.ImageView, com.facebook.shimmer.ShimmerFrameLayout, boolean, boolean, boolean):void");
    }

    public final efm.r g0() {
        return getInputView().i;
    }

    @NotNull
    public final MaskedTextInputEditText getEditText() {
        return getInputView().getEditText();
    }

    public final yz0.b getMaskingDelegate$ui_kit_components_release() {
        return getInputView().getMaskingDelegate$ui_kit_components_release();
    }

    public final efm.r h0() {
        return getInputView().f58333g;
    }

    public final efm.r i0() {
        return getInputView().f58334h;
    }

    public final efm.r j0() {
        return te0.w.a0(getCurrencyPicker().e, new bt9.t(12));
    }

    public final efm.r l0() {
        return getInputView().f;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m0(bw0.m r13, android.widget.TextView r14, android.widget.ImageView r15, ihm.f r16, com.facebook.shimmer.ShimmerFrameLayout r17) {
        /*
            Method dump skipped, instruction units count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.views.CenteredAmountView.m0(bw0.m, android.widget.TextView, android.widget.ImageView, ihm.f, com.facebook.shimmer.ShimmerFrameLayout):void");
    }

    public final void n0(boolean z) {
        this.A = z;
        AppCompatImageView appCompatImageView = this.f58417r;
        AppCompatImageView appCompatImageView2 = this.f58416q;
        if (z) {
            yy0.f fVarQ = or0.u.k(this).Q();
            yy0.f.e(fVarQ, G, appCompatImageView2, null, null, 12);
            yy0.f.e(fVarQ, H, appCompatImageView, null, null, 12);
            AmountInputView inputView = getInputView();
            int i = this.f58413m;
            int i2 = this.f58414n;
            inputView.setStartView$ui_kit_components_release(appCompatImageView2, i, i, i2);
            getInputView().setEndView$ui_kit_components_release(appCompatImageView, i, i, i2);
            appCompatImageView2.setVisibility(0);
            appCompatImageView.setVisibility(0);
            o0();
            return;
        }
        appCompatImageView2.setVisibility(8);
        appCompatImageView.setVisibility(8);
        fp0.p pVar = this.C;
        fp0.p.b(pVar, false);
        View view = pVar.f137029a;
        or0.m.a(view);
        or0.u.o(view);
        fp0.p pVar2 = this.D;
        fp0.p.b(pVar2, false);
        View view2 = pVar2.f137029a;
        or0.m.a(view2);
        or0.u.o(view2);
    }

    public final void o0() {
        if (this.A) {
            this.f58416q.setEnabled(this.B);
            this.f58417r.setEnabled(this.B);
            boolean z = this.B;
            fp0.p pVar = this.C;
            fp0.p.b(pVar, z);
            View view = pVar.f137029a;
            or0.m.a(view);
            if (z) {
                view.setOnClickListener(new o3(this, 3));
            } else {
                or0.u.o(view);
            }
            boolean z3 = this.B;
            fp0.p pVar2 = this.D;
            fp0.p.b(pVar2, z3);
            View view2 = pVar2.f137029a;
            or0.m.a(view2);
            if (z3) {
                view2.setOnClickListener(new o3(this, 4));
            } else {
                or0.u.o(view2);
            }
        }
    }

    public final efm.r s() {
        return getInputView().v.g();
    }

    public final void setAmountFontSize(@NotNull c0 size) {
        Intrinsics.checkNotNullParameter(size, "size");
        getInputView().setAmountFontSize(size);
    }

    public final void setAmountInput(@NotNull bw0.h amountInputModel) {
        Intrinsics.checkNotNullParameter(amountInputModel, "amountInputModel");
        this.B = amountInputModel.o.b();
        getInputView().setAmountInput(amountInputModel);
        o0();
    }

    @yhm.d
    public final void setChevronButton(boolean show) {
        setSideControls(new j3(null, show, 1));
    }

    public final void setCurrencyPickerData(f3 currencyPickerData) {
        bv0.a aVar;
        if (currencyPickerData == null) {
            getCurrencyPicker().setVisibility(8);
            return;
        }
        getCurrencyPicker().setVisibility(0);
        getCurrencyPicker().setChevronVisible(currencyPickerData.d);
        getCurrencyPicker().setLeftImage(currencyPickerData.f209692a);
        getCurrencyPicker().setText(currencyPickerData.f209693b, currencyPickerData.f209694c);
        SwitcherButtonView currencyPicker = getCurrencyPicker();
        h3 h3Var = currencyPickerData.e;
        h3Var.getClass();
        switch (g3.f209712a[h3Var.ordinal()]) {
            case 1:
                aVar = bv0.a.ERROR;
                break;
            case 2:
                aVar = bv0.a.ACTIVE_SYSTEM_THEME;
                break;
            case 3:
                aVar = bv0.a.ACTIVE_NOT_CLICKABLE;
                break;
            case 4:
                aVar = bv0.a.LOADING_LONG;
                break;
            case 5:
                aVar = bv0.a.ACTIVE_CONTEXTUAL_THEME;
                break;
            case 6:
                aVar = bv0.a.INACTIVE_CONTEXTUAL_THEME;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        currencyPicker.setState(aVar);
        getCurrencyPicker().setClickable(currencyPickerData.f);
    }

    public final void setCustomFont(aw0.i3 customFont) {
        getInputView().setCustomFont(customFont);
    }

    public final void setCustomKeyboardStyle(jo0.b customKeyboardStyle) {
        getInputView().setCustomKeyboardStyle(customKeyboardStyle);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    public final void setErrorHappened(boolean isInErrorState) {
        if (jo0.m.f176851h && isInErrorState) {
            if (!((Boolean) jo0.g.f176829l.getValue()).booleanValue()) {
                SpringAnimation springAnimation = this.E;
                springAnimation.cancel();
                springAnimation.setStartValue(foh.i.j(10));
                springAnimation.start();
            }
            ((com.revolut.core.ui_kit_core.displayers.haptic.b) or0.u.k(this).Y()).a(new Haptic.Effect(com.revolut.core.ui_kit_core.displayers.haptic.c.SHORT, true));
        }
    }

    @yhm.d
    public final void setFiatSwitcherData(i3 fiatSwitcherData) {
        setSideControls(new j3(fiatSwitcherData, false, 2));
    }

    public final void setHint(bw0.m hint) {
        m0(hint, getHintText(), getHintIcon(), this.f58410h, getHintShimmer());
    }

    public final void setInputColors(bw0.a amountInputColors) {
        getInputView().setCustomColors(amountInputColors);
    }

    public final void setMaskingDelegate$ui_kit_components_release(yz0.b bVar) {
        getInputView().setMaskingDelegate$ui_kit_components_release(bVar);
    }

    public final void setSecondHint(bw0.m secondHint) {
        m0(secondHint, getSecondHintText(), getSecondHintIcon(), this.i, getSecondHintShimmer());
    }

    public final void setSideControls(l3 sideControls) {
        if (sideControls instanceof j3) {
            n0(false);
            j3 j3Var = (j3) sideControls;
            setFiatSwitcherDataInternal(j3Var.f209772a);
            setChevronButtonInternal(j3Var.f209773b);
            return;
        }
        if (sideControls instanceof k3) {
            setFiatSwitcherDataInternal(null);
            setChevronButtonInternal(false);
            n0(true);
        } else {
            if (sideControls != null) {
                throw new NoWhenBranchMatchedException();
            }
            setFiatSwitcherDataInternal(null);
            setChevronButtonInternal(false);
            n0(false);
        }
    }

    public final void setTopLabel(Clause label) {
        getTopLabelText().setVisibility(label != null ? 0 : 8);
        kli.a.I(getTopLabelText(), label);
        ty0.c.b(or0.u.k(getTopLabelText()).b0(), label, getTopLabelText(), new mqi.a(this, 25), null, 8);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CenteredAmountView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CenteredAmountView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f58408b = v0.a.d("create(...)");
        this.f = v0.a.d("create(...)");
        this.f58409g = v0.a.d("create(...)");
        this.f58410h = v0.a.d("create(...)");
        this.i = v0.a.d("create(...)");
        this.f58411j = v0.a.d("create(...)");
        this.k = v0.a.d("create(...)");
        this.f58412l = v0.a.d("create(...)");
        this.f58413m = kli.a.k(context, 48.0f);
        int iK = kli.a.k(context, 12.0f);
        this.f58414n = kli.a.k(context, 12.0f);
        this.topLabelText = kli.a.J(R$id.centeredAmountView_topLabelText, this);
        this.inputView = kli.a.J(R$id.centeredAmountView_input, this);
        AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
        appCompatImageView.setPadding(iK, iK, iK, iK);
        int i2 = 1;
        pd.b.h(appCompatImageView, true);
        this.f58416q = appCompatImageView;
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(getContext());
        appCompatImageView2.setPadding(iK, iK, iK, iK);
        pd.b.h(appCompatImageView2, true);
        this.f58417r = appCompatImageView2;
        this.fiatSwitcherText = kli.a.J(R$id.centeredAmountView_fiatSwitcherText, this);
        this.hintIcon = kli.a.J(R$id.centeredAmountView_hintIcon, this);
        this.hintText = kli.a.J(R$id.centeredAmountView_hintText, this);
        this.hintShimmer = kli.a.J(R$id.centeredAmountView_hintShimmer, this);
        this.secondHintIcon = kli.a.J(R$id.centeredAmountView_secondHintIcon, this);
        this.secondHintText = kli.a.J(R$id.centeredAmountView_secondHintText, this);
        this.secondHintShimmer = kli.a.J(R$id.centeredAmountView_secondHintShimmer, this);
        this.currencyPicker = kli.a.J(R$id.centeredAmountView_currencyPickerButton, this);
        this.B = true;
        ColorDrawable colorDrawable = null;
        hp0.c cVar = new hp0.c(colorDrawable, new InsetDrawable((Drawable) dr0.l.c(context, new Color.Solid(R$attr.uikit_colorForeground)), iK), i2);
        gp0.c cVar2 = gp0.c.FOREGROUND;
        gp0.h hVar = new gp0.h(cVar, new gp0.f(cVar2, 2), new fp0.d(new Color.Solid(R$attr.uikit_colorAccent), new Color.Solid(R$attr.uikit_colorAccent_10), false));
        gp0.h hVar2 = new gp0.h(new hp0.c(colorDrawable, new InsetDrawable((Drawable) dr0.l.c(context, new Color.Solid(R$attr.uikit_colorForeground)), iK), i2), new gp0.f(cVar2, 2), new fp0.d(new Color.Solid(R$attr.uikit_colorForeground), new Color.Solid(R$attr.uikit_colorElevatedWidgetBackground), false));
        fp0.p.Companion.getClass();
        this.C = fp0.m.a(appCompatImageView, hVar2);
        this.D = fp0.m.a(appCompatImageView2, hVar);
        this.F = te0.w.y0(new maa.r(this, 26));
        View.inflate(context, R$layout.internal_centered_amount_view, this);
        this.E = new SpringAnimation(getInputView(), DynamicAnimation.TRANSLATION_X, BitmapDescriptorFactory.HUE_RED);
        hx7.b.v(getCurrencyPicker(), "AccountSwitcherControl");
    }

    public /* synthetic */ CenteredAmountView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
