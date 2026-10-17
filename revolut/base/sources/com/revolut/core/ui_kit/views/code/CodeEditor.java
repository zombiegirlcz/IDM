package com.revolut.core.ui_kit.views.code;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.text.method.SingleLineTransformationMethod;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.R$string;
import com.revolut.core.ui_kit.R$styleable;
import com.revolut.core.ui_kit.delegates.CodeEditorDelegate;
import com.revolut.core.ui_kit.views.code.CodeEditor;
import com.revolut.core.ui_kit.views.input.InputText;
import com.revolut.core.ui_kit.views.input.MaskedTextInputEditText;
import e8.q;
import et0.k;
import ihm.f;
import ip0.ab;
import java.util.ArrayList;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.ranges.IntRange;
import kotlin.text.a0;
import kotlin.text.d0;
import kotlin.text.f0;
import m70.a;
import mx0.c9;
import org.jetbrains.annotations.NotNull;
import pd.b;
import qwd.o;
import qx0.c;
import qx0.e;
import rr0.d;
import rr0.g;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0007\u0018\u0000 u2\u00020\u00012\u00020\u0002:\u0003vwxB'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001d\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0012\u001a\u0004\b\u001c\u0010\u0019R\u001b\u0010 \u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0012\u001a\u0004\b\u001f\u0010\u0019R\u001b\u0010#\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0012\u001a\u0004\b\"\u0010\u0019R\u001b\u0010&\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u0012\u001a\u0004\b%\u0010\u0019R\u001b\u0010)\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u0012\u001a\u0004\b(\u0010\u0019R\u001b\u0010,\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u0012\u001a\u0004\b+\u0010\u0019R\u001b\u0010/\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\u0012\u001a\u0004\b.\u0010\u0019R\u001b\u00102\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010\u0012\u001a\u0004\b1\u0010\u0019R\u001b\u00107\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u0010\u0012\u001a\u0004\b5\u00106R\u001b\u0010:\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u0010\u0012\u001a\u0004\b9\u00106R\u001b\u0010=\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010\u0012\u001a\u0004\b<\u00106R\u001b\u0010@\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u0010\u0012\u001a\u0004\b?\u00106R\u001b\u0010C\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u0010\u0012\u001a\u0004\bB\u00106R\u001b\u0010F\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bD\u0010\u0012\u001a\u0004\bE\u00106R\u001b\u0010I\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bG\u0010\u0012\u001a\u0004\bH\u00106R\u001b\u0010L\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010\u0012\u001a\u0004\bK\u00106R\u001b\u0010O\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bM\u0010\u0012\u001a\u0004\bN\u00106R\"\u0010U\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010\u000fR*\u0010^\u001a\u00020V2\u0006\u0010W\u001a\u00020V8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R*\u0010b\u001a\u00020\u000b2\u0006\u0010W\u001a\u00020\u000b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b_\u0010Q\u001a\u0004\b`\u0010S\"\u0004\ba\u0010\u000fR*\u0010j\u001a\u00020c2\u0006\u0010W\u001a\u00020c8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bd\u0010e\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR$\u0010p\u001a\u00020k2\u0006\u0010W\u001a\u00020k8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR$\u0010t\u001a\u00020k2\u0006\u0010q\u001a\u00020k8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\br\u0010m\"\u0004\bs\u0010o¨\u0006y"}, d2 = {"Lcom/revolut/core/ui_kit/views/code/CodeEditor;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lrr0/d;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "enabled", "", "setLoadingState", "(Z)V", "Landroid/view/View;", "i", "Le8/q;", "getDivider", "()Landroid/view/View;", "divider", "Lcom/revolut/core/ui_kit/views/input/InputText;", "j", "getInput0", "()Lcom/revolut/core/ui_kit/views/input/InputText;", "input0", "k", "getInput1", "input1", "l", "getInput2", "input2", "m", "getInput3", "input3", "n", "getInput4", "input4", "o", "getInput5", "input5", "p", "getInput6", "input6", "q", "getInput7", "input7", "r", "getInput8", "input8", "Landroid/widget/TextView;", "s", "getText0", "()Landroid/widget/TextView;", "text0", "t", "getText1", "text1", "u", "getText2", "text2", "v", "getText3", "text3", "w", "getText4", "text4", "x", "getText5", "text5", "y", "getText6", "text6", "z", "getText7", "text7", "A", "getText8", "text8", "B", "Z", "getAutoFocusEnabled", "()Z", "setAutoFocusEnabled", "autoFocusEnabled", "Lcom/revolut/core/ui_kit/delegates/CodeEditorDelegate$a;", "value", "C", "Lcom/revolut/core/ui_kit/delegates/CodeEditorDelegate$a;", "getInputVariant", "()Lcom/revolut/core/ui_kit/delegates/CodeEditorDelegate$a;", "setInputVariant", "(Lcom/revolut/core/ui_kit/delegates/CodeEditorDelegate$a;)V", "inputVariant", "D", "getSecurityInput", "setSecurityInput", "securityInput", "Lip0/ab;", "E", "Lip0/ab;", "getMode", "()Lip0/ab;", "setMode", "(Lip0/ab;)V", "mode", "", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "text", "newCode", "getCode", "setCode", "code", "Companion", "qx0/c", "prl/e", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CodeEditor extends ConstraintLayout implements d {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public final q text8;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public boolean autoFocusEnabled;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public CodeEditorDelegate.a inputVariant;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public boolean securityInput;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public ab mode;
    public ValueAnimator F;
    public boolean G;
    public boolean H;
    public int I;
    public boolean J;
    public boolean K;
    public final g L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InputText[] f59036b;
    public final TextView[] f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f f59037g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f f59038h;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final q divider;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final q input0;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public final q input1;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public final q input2;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public final q input3;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final q input4;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public final q input5;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public final q input6;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    public final q input7;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public final q input8;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    public final q text0;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public final q text1;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public final q text2;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public final q text3;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    public final q text4;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    public final q text5;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    public final q text6;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public final q text7;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.views.code.CodeEditor$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CodeEditor(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final View getDivider() {
        return this.divider.f();
    }

    private final InputText getInput0() {
        return (InputText) this.input0.f();
    }

    private final InputText getInput1() {
        return (InputText) this.input1.f();
    }

    private final InputText getInput2() {
        return (InputText) this.input2.f();
    }

    private final InputText getInput3() {
        return (InputText) this.input3.f();
    }

    private final InputText getInput4() {
        return (InputText) this.input4.f();
    }

    private final InputText getInput5() {
        return (InputText) this.input5.f();
    }

    private final InputText getInput6() {
        return (InputText) this.input6.f();
    }

    private final InputText getInput7() {
        return (InputText) this.input7.f();
    }

    private final InputText getInput8() {
        return (InputText) this.input8.f();
    }

    private final TextView getText0() {
        return (TextView) this.text0.f();
    }

    private final TextView getText1() {
        return (TextView) this.text1.f();
    }

    private final TextView getText2() {
        return (TextView) this.text2.f();
    }

    private final TextView getText3() {
        return (TextView) this.text3.f();
    }

    private final TextView getText4() {
        return (TextView) this.text4.f();
    }

    private final TextView getText5() {
        return (TextView) this.text5.f();
    }

    private final TextView getText6() {
        return (TextView) this.text6.f();
    }

    private final TextView getText7() {
        return (TextView) this.text7.f();
    }

    private final TextView getText8() {
        return (TextView) this.text8.f();
    }

    @Override // rr0.d
    public final void L(boolean z) {
        this.K = z;
        m0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.F == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    public final void f0(boolean z) {
        ArrayList arrayList = new ArrayList();
        for (TextView textView : this.f) {
            CharSequence text = textView.getText();
            Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
            if (text.length() <= 0) {
                break;
            }
            arrayList.add(textView);
        }
        this.I = Math.min(arrayList.size(), this.mode.a() - 1);
        if (z) {
            h0();
        }
    }

    public final void g0() {
        this.f59038h.onNext(getCode());
        if (this.mode.a() == getCode().length()) {
            this.f59037g.onNext(new c(getCode(), this.G));
        }
    }

    public final boolean getAutoFocusEnabled() {
        return this.autoFocusEnabled;
    }

    @NotNull
    public final String getCode() {
        StringBuilder sb6 = new StringBuilder();
        for (TextView textView : this.f) {
            sb6.append(textView.getText());
            Intrinsics.checkNotNullExpressionValue(sb6, "append(...)");
        }
        String string = sb6.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @NotNull
    public final CodeEditorDelegate.a getInputVariant() {
        return this.inputVariant;
    }

    @NotNull
    public final ab getMode() {
        return this.mode;
    }

    public final boolean getSecurityInput() {
        return this.securityInput;
    }

    @NotNull
    public final String getText() {
        a.c(t0.f186434a);
        return kotlin.collections.d.d0(this.f, "", null, null, new o(18), 30);
    }

    public final void h0() {
        InputText inputText = this.f59036b[this.I];
        InputText.Companion companion = InputText.INSTANCE;
        inputText.C0(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i0() {
        /*
            r8 = this;
            com.revolut.core.ui_kit.views.input.InputText[] r0 = r8.f59036b
            int r1 = r0.length
            r2 = 0
            r3 = r2
            r4 = r3
        L6:
            if (r3 >= r1) goto L31
            r5 = r0[r3]
            int r6 = r4 + 1
            com.revolut.core.ui_kit.views.input.MaskedTextInputEditText r5 = r5.getInnerEditText()
            boolean r7 = r8.securityInput
            if (r7 != 0) goto L29
            android.widget.TextView[] r7 = r8.f
            r4 = r7[r4]
            java.lang.CharSequence r4 = r4.getText()
            java.lang.String r7 = "getText(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r7)
            int r4 = r4.length()
            if (r4 != 0) goto L29
            r4 = 1
            goto L2a
        L29:
            r4 = r2
        L2a:
            r5.setCursorVisible(r4)
            int r3 = r3 + 1
            r4 = r6
            goto L6
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.views.code.CodeEditor.i0():void");
    }

    public final void j0() {
        boolean z = this.securityInput;
        CodeEditorDelegate.a.C0399a c0399a = CodeEditorDelegate.a.C0399a.f52101a;
        int i = 2;
        CodeEditorDelegate.a.b bVar = CodeEditorDelegate.a.b.f52102a;
        if (z) {
            CodeEditorDelegate.a aVar = this.inputVariant;
            if (!Intrinsics.f(aVar, bVar)) {
                if (!Intrinsics.f(aVar, c0399a)) {
                    throw new NoWhenBranchMatchedException();
                }
                i = 129;
            }
        } else {
            CodeEditorDelegate.a aVar2 = this.inputVariant;
            if (!Intrinsics.f(aVar2, bVar)) {
                if (!Intrinsics.f(aVar2, c0399a)) {
                    throw new NoWhenBranchMatchedException();
                }
                i = 145;
            }
        }
        for (TextView textView : this.f) {
            textView.setInputType(i);
            textView.setTransformationMethod(this.securityInput ? new PasswordTransformationMethod() : null);
        }
        for (InputText inputText : this.f59036b) {
            inputText.setInputType(i);
            inputText.setTransformationMethod(this.securityInput ? new PasswordTransformationMethod() : new SingleLineTransformationMethod());
            boolean z3 = this.securityInput;
            Intrinsics.checkNotNullParameter(inputText, "<this>");
            inputText.setImportantForAccessibility(!z3 ? 1 : 4);
        }
    }

    public final void l0(int i, String str) {
        this.f[i].setText(str);
        boolean z = this.securityInput;
        InputText[] inputTextArr = this.f59036b;
        if (z) {
            inputTextArr[i].getInnerEditText().setContentDescription(null);
            return;
        }
        MaskedTextInputEditText innerEditText = inputTextArr[i].getInnerEditText();
        if (d0.W(str)) {
            str = null;
        }
        innerEditText.setContentDescription(str);
    }

    public final void m0() {
        boolean z = this.J || this.K;
        if (z == (this.F != null)) {
            return;
        }
        rx0.f fVar = z ? rx0.f.ANIMATABLE : rx0.f.DEFAULT;
        for (InputText inputText : this.f59036b) {
            inputText.setBackgroundStateList(fVar);
            inputText.setFocusable(!z);
            inputText.setActivated(false);
        }
        if (!z) {
            ValueAnimator valueAnimator = this.F;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.F = null;
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new e(this));
        valueAnimatorOfFloat.setDuration(((long) this.mode.a()) * 200);
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        this.F = valueAnimatorOfFloat;
        if (isAttachedToWindow()) {
            valueAnimatorOfFloat.start();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f0(this.autoFocusEnabled);
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            if (!valueAnimator.isStarted()) {
                valueAnimator.start();
            } else if (valueAnimator.isPaused()) {
                valueAnimator.resume();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.pause();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (z) {
            f0(true);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        super.onInitializeAccessibilityNodeInfo(info);
        if (this.securityInput) {
            od0.a aVar = od0.a.f224253a;
            if (!od0.a.i()) {
                String string = getContext().getString(R$string.passcode_field_accessibility_label);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                String string2 = getContext().getString(R$string.passcode_field_accessibility_value, Integer.valueOf(getCode().length()), Integer.valueOf(this.mode.a()));
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                info.setText(string + " " + string2);
                return;
            }
        }
        info.setText(getText());
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final void setAutoFocusEnabled(boolean z) {
        this.autoFocusEnabled = z;
    }

    public final void setCode(@NotNull String newCode) {
        String strValueOf;
        Intrinsics.checkNotNullParameter(newCode, "newCode");
        String code = getCode();
        if (Intrinsics.f(newCode, code)) {
            return;
        }
        boolean z = (newCode.length() >= this.mode.a()) && ((newCode.length() - code.length() > 1) || !a0.H(newCode, code, false));
        this.G = z;
        if (z) {
            this.L.b0();
        }
        this.H = false;
        int iA = this.mode.a();
        for (int i = 0; i < iA; i++) {
            Character chR0 = f0.R0(i, newCode);
            if (chR0 == null || (strValueOf = String.valueOf(chR0.charValue())) == null) {
                strValueOf = "";
            }
            l0(i, strValueOf);
        }
        this.H = true;
        i0();
        f0(this.autoFocusEnabled);
        g0();
    }

    public final void setInputVariant(@NotNull CodeEditorDelegate.a value) {
        Intrinsics.checkNotNullParameter(value, "value");
        boolean zF = Intrinsics.f(this.inputVariant, value);
        this.inputVariant = value;
        if (zF) {
            return;
        }
        j0();
        i0();
    }

    public final void setLoadingState(boolean enabled) {
        this.J = enabled;
        m0();
    }

    public final void setMode(@NotNull ab value) {
        int iK;
        int iK2;
        Intrinsics.checkNotNullParameter(value, "value");
        this.mode = value;
        int[] iArr = qx0.d.f249977a;
        int i = iArr[value.ordinal()];
        if (i == 1) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            iK = kli.a.k(context, 30.0f);
        } else if (i != 2) {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            iK = kli.a.k(context2, 40.0f);
        } else {
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            iK = kli.a.k(context3, 29.0f);
        }
        int i2 = iArr[value.ordinal()];
        if (i2 == 1) {
            Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            iK2 = kli.a.k(context4, 40.0f);
        } else if (i2 != 2) {
            Context context5 = getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
            iK2 = kli.a.k(context5, 48.0f);
        } else {
            Context context6 = getContext();
            Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
            iK2 = kli.a.k(context6, 40.0f);
        }
        InputText[] inputTextArr = this.f59036b;
        for (InputText inputText : inputTextArr) {
            inputText.setHorizontalPaddingEnabled$ui_kit_components_release(false);
            ViewGroup.LayoutParams layoutParams = inputText.getLayoutParams();
            if (layoutParams != null && (layoutParams.width != iK || layoutParams.height != iK2)) {
                layoutParams.width = iK;
                layoutParams.height = iK2;
                inputText.setLayoutParams(layoutParams);
            }
        }
        IntRange intRangeO = kotlin.ranges.f.o(0, value.a());
        tz4.d.c(inputTextArr, intRangeO);
        tz4.d.c(this.f, intRangeO);
        getDivider().setVisibility(value == ab.DIGITS_6 ? 0 : 8);
        int iA = this.mode.a();
        for (int i3 = 0; i3 < iA; i3++) {
            l0(i3, "");
        }
        f0(this.autoFocusEnabled);
        g0();
    }

    public final void setSecurityInput(boolean z) {
        boolean z3 = this.securityInput != z;
        this.securityInput = z;
        if (z3) {
            j0();
            i0();
        }
    }

    public final void setText(@NotNull String value) {
        MaskedTextInputEditText innerEditText;
        Intrinsics.checkNotNullParameter(value, "value");
        int i = 0;
        int i2 = 0;
        while (i < value.length()) {
            char cCharAt = value.charAt(i);
            int i3 = i2 + 1;
            InputText inputText = (InputText) kotlin.collections.d.W(i2, this.f59036b);
            if (inputText != null && (innerEditText = inputText.getInnerEditText()) != null) {
                innerEditText.setText(String.valueOf(cCharAt));
            }
            i++;
            i2 = i3;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CodeEditor(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CodeEditor(@NotNull Context context, AttributeSet attributeSet, int i) {
        ab abVar;
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f59037g = v0.a.d("create(...)");
        this.f59038h = v0.a.d("create(...)");
        this.divider = kli.a.J(R$id.codeEditor_divider, this);
        this.input0 = kli.a.J(R$id.codeEditor_input0, this);
        this.input1 = kli.a.J(R$id.codeEditor_input1, this);
        this.input2 = kli.a.J(R$id.codeEditor_input2, this);
        this.input3 = kli.a.J(R$id.codeEditor_input3, this);
        this.input4 = kli.a.J(R$id.codeEditor_input4, this);
        this.input5 = kli.a.J(R$id.codeEditor_input5, this);
        this.input6 = kli.a.J(R$id.codeEditor_input6, this);
        this.input7 = kli.a.J(R$id.codeEditor_input7, this);
        this.input8 = kli.a.J(R$id.codeEditor_input8, this);
        this.text0 = kli.a.J(R$id.codeEditor_text0, this);
        this.text1 = kli.a.J(R$id.codeEditor_text1, this);
        this.text2 = kli.a.J(R$id.codeEditor_text2, this);
        this.text3 = kli.a.J(R$id.codeEditor_text3, this);
        this.text4 = kli.a.J(R$id.codeEditor_text4, this);
        this.text5 = kli.a.J(R$id.codeEditor_text5, this);
        this.text6 = kli.a.J(R$id.codeEditor_text6, this);
        this.text7 = kli.a.J(R$id.codeEditor_text7, this);
        this.text8 = kli.a.J(R$id.codeEditor_text8, this);
        this.inputVariant = CodeEditorDelegate.a.b.f52102a;
        this.securityInput = true;
        this.mode = ab.DIGITS_6;
        this.H = true;
        g gVarB = s.b(this, true);
        gVarB.i = false;
        this.L = gVarB;
        View.inflate(context, R$layout.internal_view_code_editor, this);
        this.f59036b = new InputText[]{getInput0(), getInput1(), getInput2(), getInput3(), getInput4(), getInput5(), getInput6(), getInput7(), getInput8()};
        TextView[] textViewArr = {getText0(), getText1(), getText2(), getText3(), getText4(), getText5(), getText6(), getText7(), getText8()};
        this.f = textViewArr;
        for (int i2 = 0; i2 < 9; i2++) {
            b.q(textViewArr[i2], false);
        }
        this.L.f(new prl.e(this));
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.CodeEditor);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            try {
                int i3 = typedArrayObtainStyledAttributes.getInt(R$styleable.CodeEditor_uikit_mode, ab.DIGITS_6.a());
                switch (i3) {
                    case 4:
                        abVar = ab.DIGITS_4;
                        break;
                    case 5:
                    default:
                        throw new IllegalArgumentException(j6.a.l(i3, "mode with ", " digits is not supported. Only 4, 6, 7, 8 and 9 digits are eligible"));
                    case 6:
                        abVar = ab.DIGITS_6;
                        break;
                    case 7:
                        abVar = ab.DIGITS_7;
                        break;
                    case 8:
                        abVar = ab.DIGITS_8;
                        break;
                    case 9:
                        abVar = ab.DIGITS_9;
                        break;
                }
                setMode(abVar);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        j0();
        i0();
        for (InputText inputText : this.f59036b) {
            inputText.setSharingEnabled(false);
        }
        int iZ = (int) kli.a.z(10, context);
        int iZ2 = (int) kli.a.z(20, context);
        InputText[] inputTextArr = this.f59036b;
        int length = inputTextArr.length;
        int i5 = 0;
        final int i6 = 0;
        while (i5 < length) {
            InputText inputText2 = inputTextArr[i5];
            int i21 = i6 + 1;
            inputText2.setTextIsImportantForAutofill(8);
            MaskedTextInputEditText innerEditText = inputText2.getInnerEditText();
            Intrinsics.i(innerEditText, "null cannot be cast to non-null type com.google.android.material.textfield.TextInputEditText");
            innerEditText.setPaddingRelative(iZ2, iZ, 0, iZ);
            innerEditText.setGravity(16);
            inputText2.setInputFilters(v.k(new InputFilter.LengthFilter(1), new InputFilter.AllCaps(), new InputFilter() { // from class: qx0.a
                @Override // android.text.InputFilter
                public final CharSequence filter(CharSequence charSequence, int i22, int i32, Spanned spanned, int i33, int i43) {
                    boolean zMatches;
                    CodeEditor.Companion companion = CodeEditor.INSTANCE;
                    String string = charSequence.toString();
                    CodeEditor codeEditor = this.f249971a;
                    TextView[] textViewArr2 = codeEditor.f;
                    int i59 = i6;
                    if (Intrinsics.f(string, textViewArr2[i59].getText().toString())) {
                        return "";
                    }
                    CodeEditorDelegate.a aVar = codeEditor.inputVariant;
                    if (aVar instanceof CodeEditorDelegate.a.b) {
                        zMatches = TextUtils.isDigitsOnly(charSequence);
                    } else {
                        if (!(aVar instanceof CodeEditorDelegate.a.C0399a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        zMatches = Pattern.matches("[a-zA-Z0-9]", charSequence);
                    }
                    if (!zMatches) {
                        return "";
                    }
                    codeEditor.G = false;
                    codeEditor.l0(i59, charSequence.toString());
                    if (!codeEditor.H) {
                        return "";
                    }
                    codeEditor.i0();
                    codeEditor.f0(codeEditor.autoFocusEnabled);
                    codeEditor.g0();
                    return "";
                }
            }));
            od0.a aVar = od0.a.f224253a;
            if (od0.a.e()) {
                hx7.b.v(inputText2.getInnerEditText(), "codeEditorView-inputText-" + i6);
            }
            inputText2.getInnerEditText().setOnDeleteKeyPressedWhenEmpty(new k(this, i6, 5));
            inputText2.getInnerEditText().setOnKeyListener(new View.OnKeyListener() { // from class: qx0.b
                @Override // android.view.View.OnKeyListener
                public final boolean onKey(View view, int i22, KeyEvent keyEvent) {
                    CodeEditor.Companion companion = CodeEditor.INSTANCE;
                    int action = keyEvent.getAction();
                    CodeEditor codeEditor = this.f249973a;
                    if (action == 0) {
                        codeEditor.L.b0();
                    }
                    CharSequence text = codeEditor.f[i6].getText();
                    Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
                    return text.length() > 0;
                }
            });
            inputText2.P = true;
            i5++;
            i6 = i21;
        }
        setOnClickListener(new c9(this, 11));
        setFocusable(true);
        setFocusableInTouchMode(true);
        this.autoFocusEnabled = true;
        setLayoutDirection(0);
    }

    public /* synthetic */ CodeEditor(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
