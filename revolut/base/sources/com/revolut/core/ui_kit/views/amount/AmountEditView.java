package com.revolut.core.ui_kit.views.amount;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.InputFilter;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import bw0.h;
import bw0.m;
import bx0.v;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.R$string;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.amount.AmountEditView;
import com.revolut.core.ui_kit.views.input.MaskedTextInputEditText;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import e8.q;
import efm.r;
import ifm.c;
import ip0.l0;
import ix0.t;
import j01.e;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jb3.l;
import jo0.g;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import nuc.n;
import nx0.d;
import nx0.f;
import nx0.i;
import or0.u;
import org.jetbrains.annotations.NotNull;
import te0.w;
import yz0.b;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u008a\u00012\u00020\u00012\u00020\u0002:\u0006\u0016.\u008b\u0001\u008c\u0001B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ\u0017\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010 \u001a\u00020\r2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0019\u0010#\u001a\u00020\r2\b\u0010\"\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b#\u0010\u0015J\u0017\u0010&\u001a\u00020\r2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J!\u0010,\u001a\u00020\r2\b\u0010)\u001a\u0004\u0018\u00010(2\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u00100\u001a\u00020\r2\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u00020\r2\u0006\u00102\u001a\u00020\u000bH\u0002¢\u0006\u0004\b3\u0010\u000fJ\u0017\u00105\u001a\u00020\r2\u0006\u00104\u001a\u00020\u000bH\u0002¢\u0006\u0004\b5\u0010\u000fJ\u0017\u00106\u001a\u00020\r2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b6\u0010'R\u001b\u0010<\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u001b\u0010A\u001a\u00020=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u00109\u001a\u0004\b?\u0010@R\u001b\u0010F\u001a\u00020B8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u00109\u001a\u0004\bD\u0010ER\u001b\u0010K\u001a\u00020G8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bH\u00109\u001a\u0004\bI\u0010JR\u001b\u0010P\u001a\u00020L8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bM\u00109\u001a\u0004\bN\u0010OR\u001b\u0010S\u001a\u00020B8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bQ\u00109\u001a\u0004\bR\u0010ER\u001b\u0010V\u001a\u00020L8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bT\u00109\u001a\u0004\bU\u0010OR\u001b\u0010Y\u001a\u00020L8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bW\u00109\u001a\u0004\bX\u0010OR\u001b\u0010\\\u001a\u00020L8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bZ\u00109\u001a\u0004\b[\u0010OR\u001b\u0010a\u001a\u00020]8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b^\u00109\u001a\u0004\b_\u0010`R\u001b\u0010e\u001a\u00020\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bb\u00109\u001a\u0004\bc\u0010dR\u001b\u0010h\u001a\u00020L8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bf\u00109\u001a\u0004\bg\u0010OR\u001b\u0010k\u001a\u00020B8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bi\u00109\u001a\u0004\bj\u0010ER\u001b\u0010n\u001a\u00020]8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bl\u00109\u001a\u0004\bm\u0010`R\u001b\u0010q\u001a\u00020B8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bo\u00109\u001a\u0004\bp\u0010ER\u001b\u0010t\u001a\u00020B8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\br\u00109\u001a\u0004\bs\u0010ER\u001b\u0010w\u001a\u00020]8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bu\u00109\u001a\u0004\bv\u0010`R\u001b\u0010z\u001a\u00020\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bx\u00109\u001a\u0004\by\u0010dR\u001b\u0010}\u001a\u00020L8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b{\u00109\u001a\u0004\b|\u0010OR\u001c\u0010\u0080\u0001\u001a\u00020B8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b~\u00109\u001a\u0004\b\u007f\u0010ER\u0016\u0010\u0082\u0001\u001a\u0002078VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0081\u0001\u0010;R0\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u0083\u00012\n\u0010\u0084\u0001\u001a\u0005\u0018\u00010\u0083\u00018V@VX\u0096\u000e¢\u0006\u0010\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001\"\u0006\b\u0087\u0001\u0010\u0088\u0001¨\u0006\u008d\u0001"}, d2 = {"Lcom/revolut/core/ui_kit/views/amount/AmountEditView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lnx0/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "enabled", "", "setEnabled", "(Z)V", "focusable", "setFocusable", "", "uniqueSuggestionsId", "setSuggestionsSourceId", "(Ljava/lang/String;)V", "Lnx0/e;", "chevron", "setChevron", "(Lnx0/e;)V", "Lcom/revolut/core/ui_kit/models/Clause;", "amountTypeClause", "setAmountType", "(Lcom/revolut/core/ui_kit/models/Clause;)V", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "typeImage", "setAmountTypeImage", "(Lcom/revolut/core/ui_kit_core/displayers/image/Image;)V", "customId", "setAmountTypeE2ECustomId", "Lbw0/h;", "amountInputModel", "setAmountInput", "(Lbw0/h;)V", "Lbw0/m;", "hintModel", "Lbw0/n;", "hintType", "setHint", "(Lbw0/m;Lbw0/n;)V", "Lnx0/g;", "switcher", "setSwitcher", "(Lnx0/g;)V", "visible", "setAmountChevronVisibility", "focus", "setFocus", "setInputFilters", "Lcom/revolut/core/ui_kit/views/input/MaskedTextInputEditText;", "j", "Le8/q;", "getAmountInputText", "()Lcom/revolut/core/ui_kit/views/input/MaskedTextInputEditText;", "amountInputText", "Landroid/widget/FrameLayout;", "k", "getAmountInputContainer", "()Landroid/widget/FrameLayout;", "amountInputContainer", "Landroid/widget/ImageView;", "l", "getAmountTypeChevron", "()Landroid/widget/ImageView;", "amountTypeChevron", "Landroid/view/View;", "m", "getAmountTypeContainer", "()Landroid/view/View;", "amountTypeContainer", "Landroid/widget/TextView;", "n", "getAmountTypeText", "()Landroid/widget/TextView;", "amountTypeText", "o", "getAmountTypeImage", "amountTypeImage", "p", "getAmountInputPrefix", "amountInputPrefix", "q", "getAmountInputResult", "amountInputResult", "r", "getAmountInputSuffix", "amountInputSuffix", "Lcom/facebook/shimmer/ShimmerFrameLayout;", "s", "getAmountInputShimmer", "()Lcom/facebook/shimmer/ShimmerFrameLayout;", "amountInputShimmer", "t", "getStartHintContainer", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "startHintContainer", "u", "getStartHintText", "startHintText", "v", "getStartHintIcon", "startHintIcon", "w", "getStartHintShimmer", "startHintShimmer", "x", "getEndHintLeftIcon", "endHintLeftIcon", "y", "getEndHintRightIcon", "endHintRightIcon", "z", "getEndHintShimmer", "endHintShimmer", "A", "getEndHintContainer", "endHintContainer", "B", "getEndHintText", "endHintText", "C", "getSwitcherIcon", "switcherIcon", "getEditText", "editText", "Lyz0/b;", "value", "getMaskingDelegate", "()Lyz0/b;", "setMaskingDelegate", "(Lyz0/b;)V", "maskingDelegate", "Companion", "nx0/f", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AmountEditView extends ConstraintLayout implements nx0.a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final int P = R$attr.internal_textAppearanceEmphasis1;
    public static final int Q = R$attr.internal_textAppearanceHeading3;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public final q endHintContainer;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public final q endHintText;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public final q switcherIcon;
    public final t D;
    public h E;
    public ValueAnimator F;
    public ValueAnimator G;
    public final Paint H;
    public final float I;
    public final float J;
    public f K;
    public final float L;
    public float M;
    public boolean N;
    public c O;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ihm.f f58932b;
    public final ihm.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ihm.f f58933g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ihm.f f58934h;
    public final LinkedHashMap i;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final q amountInputText;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public final q amountInputContainer;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public final q amountTypeChevron;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public final q amountTypeContainer;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final q amountTypeText;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public final q amountTypeImage;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public final q amountInputPrefix;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    public final q amountInputResult;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public final q amountInputSuffix;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    public final q amountInputShimmer;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public final q startHintContainer;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public final q startHintText;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public final q startHintIcon;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    public final q startHintShimmer;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    public final q endHintLeftIcon;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    public final q endHintRightIcon;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public final q endHintShimmer;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.views.amount.AmountEditView$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static float a(f style) {
            Intrinsics.checkNotNullParameter(style, "style");
            int i = a.f58950a[style.ordinal()];
            if (i == 1) {
                return b() ? 12.0f : 16.0f;
            }
            if (i == 2) {
                return b() ? 16.0f : 12.0f;
            }
            throw new NoWhenBranchMatchedException();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public static boolean b() {
            return ((Boolean) g.f176837w.getValue()).booleanValue();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AmountEditView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static Unit f0(AmountEditView amountEditView, CharSequence charSequence) {
        amountEditView.getAmountInputText().setContentDescription(charSequence);
        return Unit.f186387a;
    }

    public static void g0(AmountEditView amountEditView, ValueAnimator it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        MaskedTextInputEditText amountInputText = amountEditView.getAmountInputText();
        Object animatedValue = it8.getAnimatedValue();
        Intrinsics.i(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        amountInputText.setTextColor(((Integer) animatedValue).intValue());
    }

    private final FrameLayout getAmountInputContainer() {
        return (FrameLayout) this.amountInputContainer.f();
    }

    private final TextView getAmountInputPrefix() {
        return (TextView) this.amountInputPrefix.f();
    }

    private final TextView getAmountInputResult() {
        return (TextView) this.amountInputResult.f();
    }

    private final ShimmerFrameLayout getAmountInputShimmer() {
        return (ShimmerFrameLayout) this.amountInputShimmer.f();
    }

    private final TextView getAmountInputSuffix() {
        return (TextView) this.amountInputSuffix.f();
    }

    private final MaskedTextInputEditText getAmountInputText() {
        return (MaskedTextInputEditText) this.amountInputText.f();
    }

    private final ImageView getAmountTypeChevron() {
        return (ImageView) this.amountTypeChevron.f();
    }

    private final View getAmountTypeContainer() {
        return this.amountTypeContainer.f();
    }

    private final ImageView getAmountTypeImage() {
        return (ImageView) this.amountTypeImage.f();
    }

    private final TextView getAmountTypeText() {
        return (TextView) this.amountTypeText.f();
    }

    private final ConstraintLayout getEndHintContainer() {
        return (ConstraintLayout) this.endHintContainer.f();
    }

    private final ImageView getEndHintLeftIcon() {
        return (ImageView) this.endHintLeftIcon.f();
    }

    private final ImageView getEndHintRightIcon() {
        return (ImageView) this.endHintRightIcon.f();
    }

    private final ShimmerFrameLayout getEndHintShimmer() {
        return (ShimmerFrameLayout) this.endHintShimmer.f();
    }

    private final TextView getEndHintText() {
        return (TextView) this.endHintText.f();
    }

    private final ConstraintLayout getStartHintContainer() {
        return (ConstraintLayout) this.startHintContainer.f();
    }

    private final ImageView getStartHintIcon() {
        return (ImageView) this.startHintIcon.f();
    }

    private final ShimmerFrameLayout getStartHintShimmer() {
        return (ShimmerFrameLayout) this.startHintShimmer.f();
    }

    private final TextView getStartHintText() {
        return (TextView) this.startHintText.f();
    }

    private final ImageView getSwitcherIcon() {
        return (ImageView) this.switcherIcon.f();
    }

    private final void setAmountChevronVisibility(boolean visible) {
        getAmountTypeChevron().setVisibility(visible ? 0 : 8);
        getAmountTypeContainer().setOnTouchListener(new e(new View[]{getAmountTypeText(), getAmountTypeImage(), getAmountTypeChevron()}));
        if (visible) {
            getAmountTypeContainer().setOnClickListener(new d(this, 1));
        } else {
            u.o(getAmountTypeContainer());
        }
    }

    private final void setFocus(boolean focus) {
        if (focus && !getAmountInputText().isFocused()) {
            j0();
        } else {
            if (focus || !getAmountInputText().isFocused()) {
                return;
            }
            getAmountInputText().clearFocus();
        }
    }

    private final void setInputFilters(h amountInputModel) {
        List list = amountInputModel.e;
        InputFilter[] filters = getAmountInputText().getFilters();
        Intrinsics.checkNotNullExpressionValue(filters, "getFilters(...)");
        if (Intrinsics.f(list, kotlin.collections.d.v0(filters))) {
            return;
        }
        getAmountInputText().setFilters((InputFilter[]) amountInputModel.e.toArray(new InputFilter[0]));
    }

    @Override // nx0.a
    public final View F() {
        return this;
    }

    @Override // nx0.a
    public final r I() {
        return this.f58934h;
    }

    @Override // nx0.a
    public final void M() {
        this.G.cancel();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 77, 0);
        valueAnimatorOfInt.addUpdateListener(new nx0.c(this, 0));
        valueAnimatorOfInt.setDuration(1000L);
        valueAnimatorOfInt.start();
        Intrinsics.checkNotNullExpressionValue(valueAnimatorOfInt, "apply(...)");
        this.G = valueAnimatorOfInt;
    }

    @Override // nx0.a
    /* JADX INFO: renamed from: g, reason: from getter */
    public final ihm.f getF58932b() {
        return this.f58932b;
    }

    @Override // nx0.a
    @NotNull
    public MaskedTextInputEditText getEditText() {
        return getAmountInputText();
    }

    public b getMaskingDelegate() {
        return this.D.f169296c.u();
    }

    public final void h0(f style) {
        int iK;
        int i;
        Intrinsics.checkNotNullParameter(style, "style");
        if (this.K == style) {
            return;
        }
        int i2 = nx0.h.d[style.ordinal()];
        if (i2 == 1) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            iK = kli.a.k(context, 28.0f);
            i = Q;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            iK = kli.a.k(context2, 22.0f);
            i = P;
        }
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        INSTANCE.getClass();
        int iK2 = kli.a.k(context3, 16.0f);
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        int iK3 = kli.a.k(context4, Companion.a(style));
        l.e(getAmountInputPrefix(), i);
        l.e(getAmountInputText(), i);
        l.e(getAmountInputSuffix(), i);
        l.e(getAmountInputResult(), i);
        this.M = getAmountInputText().getTextSize();
        getAmountInputText().setMinimumHeight(iK);
        getAmountInputText().setMinHeight(iK);
        setPadding(iK2, iK3, iK2, iK3);
        this.K = style;
    }

    public final GradientDrawable i0(int i) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Color.Solid solid = new Color.Solid(i);
        float f = this.I;
        return dr0.l.i(context, f, f, f, f, solid, 192);
    }

    public final void j0() {
        getAmountInputText().requestFocus();
        kli.c.d(getAmountInputText(), 0L);
    }

    @Override // nx0.a
    public final r k() {
        r map = this.f58933g.distinctUntilChanged().filter(new noi.l(24, new n(25))).map(new noi.l(25, new n(26)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public final int l0(h hVar) {
        Context context = getAmountInputText().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int i = (getAmountInputText().isEnabled() && hVar.d) ? R$attr.uikit_colorForeground : R$attr.uikit_colorGreyTone50;
        return kli.a.s(i, context);
    }

    public final void m0() {
        h hVar;
        bw0.c cVar;
        getAmountInputText().setEnabled(isEnabled() && ((hVar = this.E) == null || (cVar = hVar.o) == null || cVar.b()));
    }

    public final void n0(float f) {
        if (f == getAmountInputText().getTextSize()) {
            return;
        }
        getAmountInputPrefix().setTextSize(0, f);
        getAmountInputSuffix().setTextSize(0, f);
        getAmountInputResult().setTextSize(0, f);
        getAmountInputText().setTextSize(0, f);
    }

    public final void o0() {
        LinkedHashMap linkedHashMap = this.i;
        boolean z = false;
        if (!linkedHashMap.isEmpty()) {
            Iterator it8 = linkedHashMap.entrySet().iterator();
            while (true) {
                if (!it8.hasNext()) {
                    break;
                }
                m mVar = (m) ((Map.Entry) it8.next()).getValue();
                if ((mVar != null ? mVar.f19189b : null) == bw0.l.ERROR) {
                    z = true;
                    break;
                }
            }
        }
        setActivated(z);
        setSelected(getAmountInputText().isFocused());
        or0.m.c(this, isActivated() ? getContext().getString(R$string.common_accessibility_trait_invalid) : null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        t tVar = this.D;
        tVar.i();
        this.O = tVar.h().subscribe(new noi.l(26, new nrd.g(this, 24)));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        t tVar = this.D;
        d01.g gVarE0 = tVar.f169297g.e0();
        if (gVarE0 != null) {
            ((iz0.e) gVarE0).c(tVar.f169305r);
        }
        tVar.f169303p.d();
        c cVar = tVar.o;
        if (cVar != null) {
            cVar.dispose();
        }
        w.p0(this.O);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        Paint paint = this.H;
        if (paint.getAlpha() > 0) {
            float width = getWidth();
            float f = this.J;
            float f4 = this.I;
            float f5 = this.J;
            canvas.drawRoundRect(f5, f5, width - f, getHeight() - f, f4, f4, paint);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (isEnabled() || motionEvent == null || motionEvent.getAction() != 0) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int iF;
        int iF2;
        int iMin;
        int size = View.MeasureSpec.getSize(i);
        float f = this.M;
        if (size <= 0 || getAmountInputShimmer().getVisibility() == 0) {
            n0(f);
            super.onMeasure(i, i2);
            return;
        }
        this.N = true;
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        ViewGroup.LayoutParams layoutParams = getAmountTypeText().getLayoutParams();
        Intrinsics.i(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i3 = marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
        ImageView amountTypeImage = getAmountTypeImage();
        if (amountTypeImage.getVisibility() != 0) {
            amountTypeImage = null;
        }
        if (amountTypeImage != null) {
            ViewGroup.LayoutParams layoutParams2 = amountTypeImage.getLayoutParams();
            iF = boh.f.f(layoutParams2) + layoutParams2.width;
        } else {
            iF = 0;
        }
        ImageView amountTypeChevron = getAmountTypeChevron();
        if (amountTypeChevron.getVisibility() != 0) {
            amountTypeChevron = null;
        }
        if (amountTypeChevron != null) {
            ViewGroup.LayoutParams layoutParams3 = amountTypeChevron.getLayoutParams();
            iF2 = boh.f.f(layoutParams3) + layoutParams3.width;
        } else {
            iF2 = 0;
        }
        ViewGroup.LayoutParams layoutParams4 = getAmountInputContainer().getLayoutParams();
        Intrinsics.checkNotNullExpressionValue(layoutParams4, "getLayoutParams(...)");
        int iF3 = boh.f.f(layoutParams4);
        if (f == getAmountInputText().getTextSize()) {
            super.onMeasure(i, i2);
            if (getAmountInputContainer().getMeasuredWidth() + getAmountTypeText().getMeasuredWidth() + i3 + iF + iF2 + iF3 <= paddingLeft) {
                this.N = false;
                return;
            } else {
                getAmountInputText().setMinHeight(getAmountInputText().getMeasuredHeight());
                getAmountInputText().setMinimumHeight(getAmountInputText().getMeasuredHeight());
            }
        }
        CharSequence text = getAmountTypeText().getText();
        Intrinsics.h(text);
        if (text.length() == 0 || (iMin = Math.min(rim.d.c(Layout.getDesiredWidth(text, getAmountTypeText().getPaint())), (((paddingLeft / 2) - i3) - iF) - iF2)) < 0) {
            iMin = 0;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TextView amountInputPrefix = getAmountInputPrefix();
        if (amountInputPrefix.getVisibility() != 0) {
            amountInputPrefix = null;
        }
        if (amountInputPrefix != null) {
            spannableStringBuilder.append(amountInputPrefix.getText());
        }
        MaskedTextInputEditText amountInputText = getAmountInputText();
        if (amountInputText.getVisibility() != 0) {
            amountInputText = null;
        }
        if (amountInputText != null) {
            spannableStringBuilder.append((CharSequence) amountInputText.getText());
        }
        TextView amountInputResult = getAmountInputResult();
        if (amountInputResult.getVisibility() != 0) {
            amountInputResult = null;
        }
        if (amountInputResult != null) {
            spannableStringBuilder.append(amountInputResult.getText());
        }
        TextView amountInputResult2 = getAmountInputResult();
        TextView textView = amountInputResult2.getVisibility() == 0 ? amountInputResult2 : null;
        if (textView != null) {
            spannableStringBuilder.append(textView.getText());
        }
        TextPaint paint = getAmountInputText().getPaint();
        float textSize = paint.getTextSize();
        paint.setTextSize(f);
        float desiredWidth = spannableStringBuilder.length() == 0 ? 0.0f : Layout.getDesiredWidth(spannableStringBuilder, paint);
        paint.setTextSize(textSize);
        n0(kotlin.ranges.f.f(desiredWidth == BitmapDescriptorFactory.HUE_RED ? f : ((paddingLeft - ((((i3 + iMin) + iF) + iF2) + iF3)) * f) / desiredWidth, Math.min(this.L, f), f));
        super.onMeasure(i, i2);
        this.N = false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.N) {
            return;
        }
        super.requestLayout();
    }

    @Override // nx0.a
    public final r s() {
        return this.D.g();
    }

    @Override // nx0.a
    public void setAmountInput(@NotNull h amountInputModel) {
        Intrinsics.checkNotNullParameter(amountInputModel, "amountInputModel");
        this.E = amountInputModel;
        setInputFilters(amountInputModel);
        this.D.j(amountInputModel);
        boolean z = amountInputModel.f19184j;
        getAmountInputPrefix().setVisibility(z ? 4 : 0);
        getAmountInputText().setVisibility(z ? 4 : 0);
        getAmountInputShimmer().setVisibility(z ? 0 : 8);
        m0();
        Boolean bool = amountInputModel.f;
        if (bool != null) {
            setFocus(bool.booleanValue());
        }
    }

    @Override // nx0.a
    public void setAmountType(@NotNull Clause amountTypeClause) {
        Intrinsics.checkNotNullParameter(amountTypeClause, "amountTypeClause");
        kli.a.b(getAmountTypeText(), amountTypeClause, ty0.f.f275450a);
        pd.b.p(getAmountTypeContainer(), amountTypeClause);
    }

    @Override // nx0.a
    public void setAmountTypeE2ECustomId(String customId) {
        hx7.b.v(getAmountTypeText(), customId);
    }

    @Override // nx0.a
    public void setAmountTypeImage(Image typeImage) {
        zi0.c.g(getAmountTypeImage(), typeImage);
    }

    @Override // nx0.a
    public void setChevron(@NotNull nx0.e chevron) {
        Intrinsics.checkNotNullParameter(chevron, "chevron");
        setAmountChevronVisibility(chevron == nx0.e.AMOUNT);
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        m0();
        getAmountInputPrefix().setEnabled(enabled);
        getAmountTypeText().setEnabled(enabled);
        getAmountTypeChevron().setEnabled(enabled);
        getStartHintText().setEnabled(enabled);
        setFocusable(enabled);
        t tVar = this.D;
        tVar.q();
        tVar.r();
    }

    @Override // android.view.View
    public void setFocusable(boolean focusable) {
        super.setFocusable(focusable);
        getAmountInputText().setFocusable(focusable);
        getAmountInputText().setFocusableInTouchMode(focusable);
        if (focusable) {
            getAmountInputContainer().setOnClickListener(new d(this, 0));
        } else {
            u.o(getAmountInputContainer());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x0254 A[LOOP:0: B:77:0x024e->B:79:0x0254, LOOP_END] */
    @Override // nx0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setHint(bw0.m r19, @org.jetbrains.annotations.NotNull bw0.n r20) {
        /*
            Method dump skipped, instruction units count: 884
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.views.amount.AmountEditView.setHint(bw0.m, bw0.n):void");
    }

    @Override // nx0.a
    public void setInputPosition(@NotNull l0 fieldPosition) {
        Intrinsics.checkNotNullParameter(fieldPosition, "fieldPosition");
    }

    @Override // nx0.a
    public void setMaskingDelegate(b bVar) {
        t tVar = this.D;
        b bVarU = tVar.f169296c.u();
        if (Intrinsics.f(bVarU, bVar)) {
            if (bVar != null) {
                bVar.a();
            }
        } else {
            if (bVarU != null) {
                bVarU.a();
            }
            tVar.l(bVar);
        }
    }

    @Override // nx0.a
    public void setSuggestionsSourceId(@NotNull String uniqueSuggestionsId) {
        Intrinsics.checkNotNullParameter(uniqueSuggestionsId, "uniqueSuggestionsId");
        t tVar = this.D;
        tVar.getClass();
        Intrinsics.checkNotNullParameter(uniqueSuggestionsId, "uniqueSuggestionsId");
        tVar.f169305r = uniqueSuggestionsId;
    }

    @Override // nx0.a
    public void setSwitcher(@NotNull nx0.g switcher) {
        xv0.c cVar;
        Intrinsics.checkNotNullParameter(switcher, "switcher");
        int i = nx0.h.f220048c[switcher.ordinal()];
        if (i == 1) {
            getSwitcherIcon().setVisibility(8);
            getSwitcherIcon().setOnTouchListener(null);
            u.o(getSwitcherIcon());
        } else if (i == 2) {
            getSwitcherIcon().setVisibility(0);
            getSwitcherIcon().setOnTouchListener(new e(new View[]{getSwitcherIcon()}));
            getSwitcherIcon().setOnClickListener(new d(this, 2));
            yy0.f.e(u.k(this).Q(), new ResourceImage(R$drawable.uikit_icn_24_arrows_sort, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), getSwitcherIcon(), null, null, 12);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            getSwitcherIcon().setVisibility(0);
            getSwitcherIcon().setOnTouchListener(new e(new View[]{getSwitcherIcon()}));
            getSwitcherIcon().setOnClickListener(new d(this, 3));
            yy0.f.e(u.k(this).Q(), new ResourceImage(R$drawable.uikit_icn_24_arrows_sort, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), getSwitcherIcon(), null, null, 12);
        }
        ImageView switcherIcon = getSwitcherIcon();
        boolean z = switcher != nx0.g.NONE;
        Object parent = switcherIcon.getParent();
        Intrinsics.i(parent, "null cannot be cast to non-null type android.view.View");
        View view = (View) parent;
        if (!view.isLaidOut() || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new i(z, switcherIcon, view));
            return;
        }
        if (!z) {
            TouchDelegate touchDelegate = view.getTouchDelegate();
            cVar = touchDelegate instanceof xv0.c ? (xv0.c) touchDelegate : null;
            if (cVar != null) {
                cVar.b("switcher");
                return;
            }
            return;
        }
        Rect rect = new Rect();
        switcherIcon.getHitRect(rect);
        int i2 = rect.left;
        Context context = switcherIcon.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        rect.left = i2 - kli.a.k(context, 16.0f);
        int i3 = rect.right;
        Context context2 = switcherIcon.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        rect.right = kli.a.k(context2, 16.0f) + i3;
        int i5 = rect.bottom;
        Context context3 = switcherIcon.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        rect.bottom = kli.a.k(context3, 16.0f) + i5;
        TouchDelegate touchDelegate2 = new TouchDelegate(rect, switcherIcon);
        TouchDelegate touchDelegate3 = view.getTouchDelegate();
        cVar = touchDelegate3 instanceof xv0.c ? (xv0.c) touchDelegate3 : null;
        if (cVar != null) {
            cVar.a("switcher", touchDelegate2);
            return;
        }
        xv0.c cVar2 = new xv0.c(switcherIcon);
        cVar2.a("switcher", touchDelegate2);
        view.setTouchDelegate(cVar2);
    }

    @Override // nx0.a
    public final void u(int i) {
        this.F.cancel();
        h hVar = this.E;
        if (hVar != null) {
            ValueAnimator valueAnimatorOfArgb = ValueAnimator.ofArgb(l0(hVar), i, l0(hVar));
            valueAnimatorOfArgb.addUpdateListener(new nx0.c(this, 1));
            valueAnimatorOfArgb.setDuration(1000L);
            valueAnimatorOfArgb.start();
            Intrinsics.checkNotNullExpressionValue(valueAnimatorOfArgb, "apply(...)");
            this.F = valueAnimatorOfArgb;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AmountEditView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AmountEditView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f58932b = v0.a.d("create(...)");
        this.f = v0.a.d("create(...)");
        this.f58933g = v0.a.d("create(...)");
        this.f58934h = v0.a.d("create(...)");
        this.i = new LinkedHashMap();
        this.amountInputText = kli.a.J(R$id.amountEdit_amountInputText, this);
        this.amountInputContainer = kli.a.J(R$id.amountEdit_amountInputContainer, this);
        this.amountTypeChevron = kli.a.J(R$id.amountEdit_amountTypeChevron, this);
        this.amountTypeContainer = kli.a.J(R$id.amountEdit_amountTypeContainer, this);
        this.amountTypeText = kli.a.J(R$id.amountEdit_amountTypeText, this);
        this.amountTypeImage = kli.a.J(R$id.amountEdit_amountTypeImage, this);
        this.amountInputPrefix = kli.a.J(R$id.amountEdit_amountInputPrefix, this);
        this.amountInputResult = kli.a.J(R$id.amountEdit_amountInputResult, this);
        this.amountInputSuffix = kli.a.J(R$id.amountEdit_amountInputSuffix, this);
        this.amountInputShimmer = kli.a.J(R$id.amountEdit_amountInputShimmer, this);
        this.startHintContainer = kli.a.J(R$id.amountEdit_startHintContainer, this);
        this.startHintText = kli.a.J(R$id.amountEdit_startHintText, this);
        this.startHintIcon = kli.a.J(R$id.amountEdit_startHintIcon, this);
        this.startHintShimmer = kli.a.J(R$id.amountEdit_startHintShimmer, this);
        this.endHintLeftIcon = kli.a.J(R$id.amountEdit_endHintLeftIcon, this);
        this.endHintRightIcon = kli.a.J(R$id.amountEdit_endHintRightIcon, this);
        this.endHintShimmer = kli.a.J(R$id.amountEdit_endHintShimmer, this);
        this.endHintContainer = kli.a.J(R$id.amountEdit_endHintContainer, this);
        this.endHintText = kli.a.J(R$id.amountEdit_endHintText, this);
        this.switcherIcon = kli.a.J(R$id.amountEdit_switcher, this);
        this.F = new ValueAnimator();
        this.G = new ValueAnimator();
        Paint paint = new Paint();
        paint.setColor(kli.a.s(R$attr.uikit_colorBackground, context));
        paint.setAlpha(0);
        this.H = paint;
        this.I = kli.a.l(context, qv0.h.EXTRA_LARGE.a());
        this.J = kli.a.k(context, 4.0f);
        View.inflate(context, R$layout.internal_amount_edit_view, this);
        this.D = new t(context, false, new sz5.f(getAmountInputPrefix(), getAmountInputText(), getAmountInputResult(), getAmountInputSuffix(), jh.d.f(context).b0()));
        final int i2 = 0;
        getAmountInputText().a(new View.OnFocusChangeListener(this) { // from class: nx0.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AmountEditView f220041b;

            {
                this.f220041b = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                int i3 = i2;
                AmountEditView amountEditView = this.f220041b;
                switch (i3) {
                    case 0:
                        amountEditView.f58933g.onNext(Boolean.valueOf(z));
                        break;
                    default:
                        AmountEditView.Companion companion = AmountEditView.INSTANCE;
                        amountEditView.o0();
                        break;
                }
            }
        });
        FrameLayout amountInputContainer = getAmountInputContainer();
        Object parent = amountInputContainer.getParent();
        Intrinsics.i(parent, "null cannot be cast to non-null type android.view.View");
        View view = (View) parent;
        if (view.isLaidOut() && !view.isLayoutRequested()) {
            Rect rect = new Rect();
            amountInputContainer.getHitRect(rect);
            int i3 = rect.right;
            Context context2 = amountInputContainer.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            rect.right = kli.a.k(context2, 16.0f) + i3;
            int i5 = rect.top;
            Context context3 = amountInputContainer.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            rect.top = i5 - kli.a.k(context3, 16.0f);
            TouchDelegate touchDelegate = new TouchDelegate(rect, amountInputContainer);
            TouchDelegate touchDelegate2 = view.getTouchDelegate();
            xv0.c cVar = touchDelegate2 instanceof xv0.c ? (xv0.c) touchDelegate2 : null;
            if (cVar != null) {
                cVar.a("inputContainer", touchDelegate);
            } else {
                xv0.c cVar2 = new xv0.c(amountInputContainer);
                cVar2.a("inputContainer", touchDelegate);
                view.setTouchDelegate(cVar2);
            }
        } else {
            view.addOnLayoutChangeListener(new v(amountInputContainer, view, 10));
        }
        hx7.b.v(getAmountInputText(), "AmountInput.TextField");
        getAmountInputContainer().setOnClickListener(new d(this, 0));
        o0();
        final int i6 = 1;
        getAmountInputText().a(new View.OnFocusChangeListener(this) { // from class: nx0.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AmountEditView f220041b;

            {
                this.f220041b = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                int i32 = i6;
                AmountEditView amountEditView = this.f220041b;
                switch (i32) {
                    case 0:
                        amountEditView.f58933g.onNext(Boolean.valueOf(z));
                        break;
                    default:
                        AmountEditView.Companion companion = AmountEditView.INSTANCE;
                        amountEditView.o0();
                        break;
                }
            }
        });
        StateListDrawable stateListDrawable = new StateListDrawable();
        INSTANCE.getClass();
        int i21 = Companion.b() ? R$attr.uikit_colorSearchBackground : R$attr.uikit_colorGreyTone5;
        int i22 = Companion.b() ? R$attr.uikit_colorSearchBackground : R$attr.uikit_colorGreyTone8;
        stateListDrawable.addState(new int[]{R.attr.state_activated, R.attr.state_selected}, i0(R$attr.uikit_colorInputErrorFocus));
        stateListDrawable.addState(new int[]{R.attr.state_activated}, i0(R$attr.uikit_colorInputError));
        stateListDrawable.addState(new int[]{-16842910}, i0(i21));
        stateListDrawable.addState(new int[]{R.attr.state_selected}, i0(R$attr.uikit_colorGreyTone10));
        stateListDrawable.addState(new int[0], i0(i22));
        setBackground(stateListDrawable);
        this.L = kli.a.B(context, 12.0f);
        h0(f.NORMAL);
    }

    public /* synthetic */ AmountEditView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
