package com.revolut.core.ui_kit.views;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.ImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import aw0.v1;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.R$drawable;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.R$styleable;
import com.revolut.core.ui_kit.click.animator.ripple.UIKitRippleDrawable;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$color;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import mx0.m8;
import mx0.n8;
import mx0.o8;
import mx0.r8;
import mx0.s8;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.r0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 s2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0004\u0015\u000etuB'\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00102\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00102\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001d\u0010\u001cJ#\u0010 \u001a\u00020\u00102\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001e¢\u0006\u0004\b \u0010!J\u001d\u0010$\u001a\u00020\u00102\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\"¢\u0006\u0004\b$\u0010%J\u001d\u0010&\u001a\u00020\u00102\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\"¢\u0006\u0004\b&\u0010%J#\u0010(\u001a\u00020\u00102\u0014\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001e¢\u0006\u0004\b(\u0010!J\u0017\u0010-\u001a\u00020\u00102\u0006\u0010*\u001a\u00020)H\u0000¢\u0006\u0004\b+\u0010,J\u001f\u00101\u001a\u00020\u00102\u0006\u0010*\u001a\u00020)2\u0006\u0010.\u001a\u00020)H\u0000¢\u0006\u0004\b/\u00100J\u0019\u00104\u001a\u00020\u00102\b\b\u0002\u00103\u001a\u000202H\u0002¢\u0006\u0004\b4\u00105R\u001b\u0010;\u001a\u0002068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001b\u0010>\u001a\u0002068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u00108\u001a\u0004\b=\u0010:R\u001b\u0010A\u001a\u0002068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u00108\u001a\u0004\b@\u0010:R\u001b\u0010D\u001a\u0002068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u00108\u001a\u0004\bC\u0010:R\u001b\u0010G\u001a\u0002068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bE\u00108\u001a\u0004\bF\u0010:R\u001b\u0010J\u001a\u0002068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bH\u00108\u001a\u0004\bI\u0010:R\u001b\u0010M\u001a\u0002068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bK\u00108\u001a\u0004\bL\u0010:R\u001b\u0010P\u001a\u0002068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bN\u00108\u001a\u0004\bO\u0010:R\u001b\u0010S\u001a\u0002068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bQ\u00108\u001a\u0004\bR\u0010:R\u001b\u0010V\u001a\u0002068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bT\u00108\u001a\u0004\bU\u0010:R\u001b\u0010[\u001a\u00020W8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bX\u00108\u001a\u0004\bY\u0010ZR\u001b\u0010^\u001a\u00020W8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\\\u00108\u001a\u0004\b]\u0010ZR\u001b\u0010d\u001a\u00020_8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\bb\u0010cR$\u0010l\u001a\u0004\u0018\u00010e8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bf\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR\u001a\u0010r\u001a\u00020m8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bn\u0010o\u001a\u0004\bp\u0010q¨\u0006v"}, d2 = {"Lcom/revolut/core/ui_kit/views/KeypadView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/view/View$OnClickListener;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "Lzz0/d;", "Lur0/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lmx0/n8;", "mode", "", "setMode", "(Lmx0/n8;)V", "getMode", "()Lmx0/n8;", "Lmx0/r8;", "style", "setupStyle", "(Lmx0/r8;)V", "Lyy0/h;", "image", "setStartActionImage", "(Lyy0/h;)V", "setEndActionImage", "Lkotlin/Function1;", "numberClickListener", "setOnNumberClickListener", "(Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function0;", "actionClickListener", "setOnStartActionClickListener", "(Lkotlin/jvm/functions/Function0;)V", "setOnEndActionClickListener", "modeChangedListener", "setModeChangedListener", "", "canInteract", "setNumbersEnabled$ui_kit_components_release", "(Z)V", "setNumbersEnabled", "hideDisabled", "setActionsEnabled$ui_kit_components_release", "(ZZ)V", "setActionsEnabled", "Lmx0/o8;", "buttonParams", "setupStyleInternal", "(Lmx0/o8;)V", "Landroid/widget/Button;", "k", "Le8/q;", "getButton0", "()Landroid/widget/Button;", "button0", "l", "getButton1", "button1", "m", "getButton2", "button2", "n", "getButton3", "button3", "o", "getButton4", "button4", "p", "getButton5", "button5", "q", "getButton6", "button6", "r", "getButton7", "button7", "s", "getButton8", "button8", "t", "getButton9", "button9", "Landroid/widget/ImageButton;", "u", "getButtonStartAction", "()Landroid/widget/ImageButton;", "buttonStartAction", "v", "getButtonEndAction", "buttonEndAction", "Lcom/revolut/core/ui_kit/views/KeypadView$b;", "w", "Lkotlin/Lazy;", "getSecureAccessibilityDelegate", "()Lcom/revolut/core/ui_kit/views/KeypadView$b;", "secureAccessibilityDelegate", "Landroid/os/Parcelable;", "B", "Landroid/os/Parcelable;", "getAnalyticsContext", "()Landroid/os/Parcelable;", "setAnalyticsContext", "(Landroid/os/Parcelable;)V", "analyticsContext", "Lzz0/h;", "C", "Lzz0/h;", "getInteractionTracker", "()Lzz0/h;", "interactionTracker", "Companion", "b", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class KeypadView extends ConstraintLayout implements View.OnClickListener, TrackableItem, zz0.d, ur0.a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final Object E = r0.k(new Pair(0, r8.REGULAR), new Pair(1, r8.VOLUMETRIC));
    public o8 A;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public Parcelable analyticsContext;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public final zz0.h interactionTracker;
    public v1 D;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Function1 f58693b;
    public Function0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Function0 f58694g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Function1 f58695h;
    public final List i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f58696j;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public final e8.q button0;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public final e8.q button1;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public final e8.q button2;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final e8.q button3;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public final e8.q button4;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public final e8.q button5;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    public final e8.q button6;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public final e8.q button7;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    public final e8.q button8;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public final e8.q button9;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public final e8.q buttonStartAction;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public final e8.q buttonEndAction;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    public final Lazy secureAccessibilityDelegate;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final SecureRandom f58706x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public n8 f58707y;
    public r8 z;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.views.KeypadView$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    /* JADX INFO: loaded from: classes20.dex */
    public static final class b extends View.AccessibilityDelegate {
        @Override // android.view.View.AccessibilityDelegate
        public final void onInitializeAccessibilityNodeInfo(View host, AccessibilityNodeInfo info) {
            Intrinsics.checkNotNullParameter(host, "host");
            Intrinsics.checkNotNullParameter(info, "info");
            super.onInitializeAccessibilityNodeInfo(host, info);
            info.setText(null);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void onPopulateAccessibilityEvent(View host, AccessibilityEvent event) {
            Intrinsics.checkNotNullParameter(host, "host");
            Intrinsics.checkNotNullParameter(event, "event");
            super.onPopulateAccessibilityEvent(host, event);
            event.getText().clear();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KeypadView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static Unit f0(KeypadView keypadView, Context context, Configuration it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        o8 o8VarA = keypadView.z.a(context);
        if (!o8VarA.equals(keypadView.A)) {
            keypadView.setupStyleInternal(o8VarA);
        }
        return Unit.f186387a;
    }

    public static Unit g0(KeypadView keypadView) {
        keypadView.getButtonStartAction().setOnClickListener(keypadView);
        return Unit.f186387a;
    }

    private final Button getButton0() {
        return (Button) this.button0.f();
    }

    private final Button getButton1() {
        return (Button) this.button1.f();
    }

    private final Button getButton2() {
        return (Button) this.button2.f();
    }

    private final Button getButton3() {
        return (Button) this.button3.f();
    }

    private final Button getButton4() {
        return (Button) this.button4.f();
    }

    private final Button getButton5() {
        return (Button) this.button5.f();
    }

    private final Button getButton6() {
        return (Button) this.button6.f();
    }

    private final Button getButton7() {
        return (Button) this.button7.f();
    }

    private final Button getButton8() {
        return (Button) this.button8.f();
    }

    private final Button getButton9() {
        return (Button) this.button9.f();
    }

    private final ImageButton getButtonEndAction() {
        return (ImageButton) this.buttonEndAction.f();
    }

    private final ImageButton getButtonStartAction() {
        return (ImageButton) this.buttonStartAction.f();
    }

    private final b getSecureAccessibilityDelegate() {
        return (b) this.secureAccessibilityDelegate.getValue();
    }

    public static Unit h0(KeypadView keypadView) {
        keypadView.getButtonEndAction().setOnClickListener(keypadView);
        return Unit.f186387a;
    }

    private final void setupStyleInternal(o8 buttonParams) {
        j0(this.z, this.D);
        this.A = buttonParams;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iK = kli.a.k(context, buttonParams.d());
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int iK2 = kli.a.k(context2, buttonParams.a());
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        int iK3 = kli.a.k(context3, buttonParams.b());
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        int iK4 = kli.a.k(context4, buttonParams.c());
        for (Button button : this.i) {
            ViewGroup.LayoutParams layoutParams = button.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int i = 0;
            boolean z = button.getId() == getButton1().getId() || button.getId() == getButton2().getId() || button.getId() == getButton3().getId();
            if (this.z != r8.REGULAR_FULLSCREEN || !z) {
                i = iK4;
            }
            marginLayoutParams.height = iK2;
            marginLayoutParams.width = iK;
            marginLayoutParams.leftMargin = iK3;
            marginLayoutParams.rightMargin = iK3;
            marginLayoutParams.topMargin = i;
            button.setLayoutParams(marginLayoutParams);
        }
        for (ImageButton imageButton : this.f58696j) {
            ViewGroup.LayoutParams layoutParams2 = imageButton.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            marginLayoutParams2.height = iK2;
            marginLayoutParams2.width = iK;
            marginLayoutParams2.leftMargin = iK3;
            marginLayoutParams2.rightMargin = iK3;
            marginLayoutParams2.topMargin = iK4;
            imageButton.setLayoutParams(marginLayoutParams2);
        }
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    public Parcelable getAnalyticsContext() {
        return this.analyticsContext;
    }

    @Override // zz0.d
    @NotNull
    public zz0.h getInteractionTracker() {
        return this.interactionTracker;
    }

    @NotNull
    /* JADX INFO: renamed from: getMode, reason: from getter */
    public final n8 getF58707y() {
        return this.f58707y;
    }

    public final UIKitRippleDrawable i0(v1 v1Var) {
        int iS;
        int i = v1Var == null ? -1 : s8.f209997c[v1Var.ordinal()];
        if (i == -1) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            iS = kli.a.s(R$attr.uikit_colorGreyTone20, context);
        } else if (i == 1) {
            iS = ContextCompat.getColor(getContext(), R$color.internal_greyTone20);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            iS = ContextCompat.getColor(getContext(), R$color.internal_greyTone20_night);
        }
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        UIKitRippleDrawable uIKitRippleDrawableE = dr0.l.e(context2, new Color.SolidInt(iS), null, null, 28);
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        uIKitRippleDrawableE.setRadius(kli.a.k(context3, 32.0f));
        return uIKitRippleDrawableE;
    }

    public final void j0(r8 r8Var, v1 v1Var) {
        for (Button button : this.i) {
            int i = s8.f209996b[r8Var.ordinal()];
            if (i == 1) {
                button.setBackgroundResource(R$drawable.internal_keypad_volumetric_button_states);
            } else {
                if (i != 2 && i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                button.setBackground(i0(v1Var));
            }
        }
        for (ImageButton imageButton : this.f58696j) {
            int i2 = s8.f209996b[r8Var.ordinal()];
            if (i2 == 1) {
                imageButton.setBackgroundResource(R$drawable.internal_shaped_ripple_24);
            } else {
                if (i2 != 2 && i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                imageButton.setBackground(i0(v1Var));
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object next;
        Integer numValueOf = view != null ? Integer.valueOf(view.getId()) : null;
        int i = R$id.internalViewKeypadView_buttonActionStart;
        if (numValueOf != null && numValueOf.intValue() == i) {
            Function0 function0 = this.f;
            if (function0 != null) {
                Image imageD = or0.u.k(this).Q().d(getButtonStartAction());
                or0.u.k(this).n0().a(this, this, imageD != null ? new py0.b(imageD) : null);
                function0.invoke();
            }
        } else {
            int i2 = R$id.internalViewKeypadView_buttonActionEnd;
            if (numValueOf != null && numValueOf.intValue() == i2) {
                Function0 function02 = this.f58694g;
                if (function02 != null) {
                    Image imageD2 = or0.u.k(this).Q().d(getButtonEndAction());
                    or0.u.k(this).n0().a(this, this, imageD2 != null ? new py0.b(imageD2) : null);
                    function02.invoke();
                }
            } else {
                Iterator it8 = this.i.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it8.next();
                    Button button = (Button) next;
                    if (view != null && button.getId() == view.getId()) {
                        break;
                    }
                }
                Button button2 = (Button) next;
                Integer numM = z.m(String.valueOf(button2 != null ? button2.getText() : null));
                if (numM != null) {
                    int iIntValue = numM.intValue();
                    Function1 function1 = this.f58693b;
                    if (function1 != null) {
                        function1.invoke(Integer.valueOf(iIntValue));
                    }
                }
            }
        }
        if (view != null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            if (io3.h.m(context)) {
                view.performHapticFeedback(1, 2);
            }
        }
    }

    @Override // ur0.a
    public final void r(v1 colorScheme, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
        if (this.D == colorScheme) {
            return;
        }
        this.D = colorScheme;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iS = kli.a.s(colorScheme.a(), context);
        List list = this.i;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            ((Button) list.get(i5)).setTextColor(iS);
        }
        List list2 = this.f58696j;
        int size2 = list2.size();
        for (int i6 = 0; i6 < size2; i6++) {
            ((ImageButton) list2.get(i6)).setColorFilter(iS);
        }
        j0(this.z, colorScheme);
    }

    public final void setActionsEnabled$ui_kit_components_release(boolean canInteract, boolean hideDisabled) {
        for (ImageButton imageButton : this.f58696j) {
            imageButton.setEnabled(canInteract);
            imageButton.setAlpha(canInteract ? 1.0f : 0.5f);
            int i = 0;
            if ((!canInteract && hideDisabled) || imageButton.getDrawable() == null) {
                i = 4;
            }
            imageButton.setVisibility(i);
        }
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    public void setAnalyticsContext(Parcelable parcelable) {
        this.analyticsContext = parcelable;
    }

    public final void setEndActionImage(yy0.h image) {
        zi0.c.h(getButtonEndAction(), image, true, new m8(this, 0), true);
    }

    public final void setMode(@NotNull n8 mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f58707y = mode;
        Function1 function1 = this.f58695h;
        if (function1 != null) {
            function1.invoke(mode);
        }
        int i = s8.f209995a[this.f58707y.ordinal()];
        List list = this.i;
        int i2 = 0;
        if (i == 1) {
            int i3 = 0;
            for (Object obj2 : list) {
                int i5 = i3 + 1;
                if (i3 < 0) {
                    zhm.v.s();
                    throw null;
                }
                Button button = (Button) obj2;
                button.setImportantForAccessibility(0);
                button.setContentDescription(null);
                button.setAccessibilityDelegate(null);
                button.setText(String.valueOf(i3));
                i3 = i5;
            }
            return;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        List list2 = list;
        Intrinsics.checkNotNullParameter(list2, "<this>");
        SecureRandom random = this.f58706x;
        Intrinsics.checkNotNullParameter(random, "random");
        List listG1 = d0.g1(list2);
        Collections.shuffle(listG1, random);
        for (Object obj3 : listG1) {
            int i6 = i2 + 1;
            if (i2 < 0) {
                zhm.v.s();
                throw null;
            }
            Button button2 = (Button) obj3;
            button2.setImportantForAccessibility(2);
            button2.setAccessibilityDelegate(getSecureAccessibilityDelegate());
            button2.setContentDescription("");
            button2.setText(String.valueOf(i2));
            i2 = i6;
        }
    }

    public final void setModeChangedListener(Function1<? super n8, Unit> modeChangedListener) {
        this.f58695h = modeChangedListener;
    }

    public final void setNumbersEnabled$ui_kit_components_release(boolean canInteract) {
        for (Button button : this.i) {
            button.setEnabled(canInteract);
            button.setAlpha(canInteract ? 1.0f : 0.5f);
        }
    }

    public final void setOnEndActionClickListener(Function0<Unit> actionClickListener) {
        this.f58694g = actionClickListener;
    }

    public final void setOnNumberClickListener(Function1<? super Integer, Unit> numberClickListener) {
        this.f58693b = numberClickListener;
    }

    public final void setOnStartActionClickListener(Function0<Unit> actionClickListener) {
        this.f = actionClickListener;
    }

    public final void setStartActionImage(yy0.h image) {
        zi0.c.h(getButtonStartAction(), image, true, new m8(this, 1), true);
    }

    public final void setupStyle(@NotNull r8 style) {
        Intrinsics.checkNotNullParameter(style, "style");
        if (this.z == style) {
            return;
        }
        this.z = style;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        setupStyleInternal(style.a(context));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KeypadView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.Map] */
    public KeypadView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.button0 = kli.a.J(R$id.internalViewKeypadView_button0, this);
        this.button1 = kli.a.J(R$id.internalViewKeypadView_button1, this);
        this.button2 = kli.a.J(R$id.internalViewKeypadView_button2, this);
        this.button3 = kli.a.J(R$id.internalViewKeypadView_button3, this);
        this.button4 = kli.a.J(R$id.internalViewKeypadView_button4, this);
        this.button5 = kli.a.J(R$id.internalViewKeypadView_button5, this);
        this.button6 = kli.a.J(R$id.internalViewKeypadView_button6, this);
        this.button7 = kli.a.J(R$id.internalViewKeypadView_button7, this);
        this.button8 = kli.a.J(R$id.internalViewKeypadView_button8, this);
        this.button9 = kli.a.J(R$id.internalViewKeypadView_button9, this);
        this.buttonStartAction = kli.a.J(R$id.internalViewKeypadView_buttonActionStart, this);
        this.buttonEndAction = kli.a.J(R$id.internalViewKeypadView_buttonActionEnd, this);
        this.secureAccessibilityDelegate = yhm.j.b(new lm.d(14));
        this.f58706x = new SecureRandom();
        this.f58707y = n8.DEFAULT;
        this.interactionTracker = new zz0.h();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.uikit_KeypadView);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            Object obj2 = E.get(Integer.valueOf(typedArrayObtainStyledAttributes.getInt(R$styleable.uikit_KeypadView_uikit_keypad_style, 1)));
            if (obj2 != null) {
                this.z = (r8) obj2;
                typedArrayObtainStyledAttributes.recycle();
                View.inflate(getContext(), R$layout.internal_view_keypad_view, this);
                List listK = zhm.v.k(getButton0(), getButton1(), getButton2(), getButton3(), getButton4(), getButton5(), getButton6(), getButton7(), getButton8(), getButton9());
                this.i = listK;
                this.f58696j = zhm.v.k(getButtonEndAction(), getButtonStartAction());
                r8 r8Var = this.z;
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                setupStyleInternal(r8Var.a(context2));
                Iterator it8 = listK.iterator();
                while (it8.hasNext()) {
                    ((Button) it8.next()).setOnClickListener(this);
                }
                for (ImageButton imageButton : this.f58696j) {
                    zz0.h tracker = getInteractionTracker();
                    Intrinsics.checkNotNullParameter(imageButton, "<this>");
                    Intrinsics.checkNotNullParameter(tracker, "tracker");
                    imageButton.setOnTouchListener(tracker);
                    imageButton.setAccessibilityDelegate(tracker);
                }
                setLayoutDirection(0);
                c8g.a.a(this, ny0.a.f220589a, new bsi.b(this, context, 3));
                return;
            }
            throw new IllegalArgumentException("Required value was null.");
        } catch (Throwable th10) {
            typedArrayObtainStyledAttributes.recycle();
            throw th10;
        }
    }

    public /* synthetic */ KeypadView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
