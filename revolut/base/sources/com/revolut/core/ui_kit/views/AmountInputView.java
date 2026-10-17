package com.revolut.core.ui_kit.views;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.view.ViewGroupKt;
import au0.m4;
import aw0.i3;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.DynamicWidthHeightAutosizeTextView;
import com.revolut.core.ui_kit.views.AmountInputView;
import com.revolut.core.ui_kit.views.input.MaskedTextInputEditText;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import mx0.c0;
import mx0.d0;
import mx0.e0;
import mx0.f0;
import mx0.g0;
import mx0.p0;
import nkm.y;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000y\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t*\u00013\u0018\u0000 D2\u00020\u0001:\u0002\nEB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ5\u0010#\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001c2\b\b\u0001\u0010\u001e\u001a\u00020\u00062\b\b\u0001\u0010\u001f\u001a\u00020\u00062\b\b\u0001\u0010 \u001a\u00020\u0006H\u0000¢\u0006\u0004\b!\u0010\"J5\u0010&\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001c2\b\b\u0001\u0010\u001e\u001a\u00020\u00062\b\b\u0001\u0010\u001f\u001a\u00020\u00062\b\b\u0001\u0010$\u001a\u00020\u0006H\u0000¢\u0006\u0004\b%\u0010\"J\u0017\u0010)\u001a\u00020\f2\b\u0010(\u001a\u0004\u0018\u00010'¢\u0006\u0004\b)\u0010*J\u0017\u0010-\u001a\u00020\f2\b\u0010,\u001a\u0004\u0018\u00010+¢\u0006\u0004\b-\u0010.J\u0017\u00101\u001a\u00020\f2\b\u00100\u001a\u0004\u0018\u00010/¢\u0006\u0004\b1\u00102J\u000f\u00104\u001a\u000203H\u0002¢\u0006\u0004\b4\u00105J\u0017\u00107\u001a\u00020\f2\u0006\u00106\u001a\u00020\u000fH\u0002¢\u0006\u0004\b7\u0010\u0012J\u0017\u00108\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b8\u0010\u001bR\u0011\u0010<\u001a\u0002098F¢\u0006\u0006\u001a\u0004\b:\u0010;R(\u0010C\u001a\u0004\u0018\u00010=2\b\u0010>\u001a\u0004\u0018\u00010=8@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b?\u0010@\"\u0004\bA\u0010B¨\u0006F"}, d2 = {"Lcom/revolut/core/ui_kit/views/AmountInputView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lmx0/c0;", "size", "", "setAmountFontSize", "(Lmx0/c0;)V", "", "enabled", "setEnabled", "(Z)V", "", "uniqueSuggestionsId", "setSuggestionsSourceId$ui_kit_components_release", "(Ljava/lang/String;)V", "setSuggestionsSourceId", "Lbw0/h;", "amountInputModel", "setAmountInput", "(Lbw0/h;)V", "Landroid/view/View;", "view", "width", "height", "margin", "setEndView$ui_kit_components_release", "(Landroid/view/View;III)V", "setEndView", "endPadding", "setStartView$ui_kit_components_release", "setStartView", "Law0/i3;", "customFont", "setCustomFont", "(Law0/i3;)V", "Lbw0/a;", "inputColors", "setCustomColors", "(Lbw0/a;)V", "Ljo0/b;", "customKeyboardStyle", "setCustomKeyboardStyle", "(Ljo0/b;)V", "mx0/e0", "getArithmeticDelegateCallback", "()Lmx0/e0;", "focus", "setFocus", "setInputFilters", "Lcom/revolut/core/ui_kit/views/input/MaskedTextInputEditText;", "getEditText", "()Lcom/revolut/core/ui_kit/views/input/MaskedTextInputEditText;", "editText", "Lyz0/b;", "value", "getMaskingDelegate$ui_kit_components_release", "()Lyz0/b;", "setMaskingDelegate$ui_kit_components_release", "(Lyz0/b;)V", "maskingDelegate", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AmountInputView extends ConstraintLayout {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f58332b;
    public final ihm.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ihm.f f58333g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ihm.f f58334h;
    public final ihm.f i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f58335j;
    public final TextView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final TextView f58336l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final FrameLayout f58337m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final FrameLayout f58338n;
    public final MaskedTextInputEditText o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TextView f58339p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final DynamicWidthHeightAutosizeTextView f58340q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final p0 f58341r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ifm.c f58342s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ix0.m f58343t;
    public final b9.u u;
    public final ix0.t v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public c0 f58344w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public f0 f58345x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public as0.d f58346y;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.views.AmountInputView$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AmountInputView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static final void f0(AmountInputView amountInputView) {
        MaskedTextInputEditText maskedTextInputEditText = amountInputView.o;
        Editable text = maskedTextInputEditText.getText();
        CharSequence hint = (text == null || text.length() <= 0) ? maskedTextInputEditText.getHint() : maskedTextInputEditText.getText();
        CharSequence text2 = amountInputView.f58335j.getText();
        CharSequence text3 = amountInputView.f58339p.getText();
        CharSequence text4 = amountInputView.k.getText();
        CharSequence text5 = amountInputView.f58336l.getText();
        StringBuilder sb6 = new StringBuilder();
        sb6.append((Object) text2);
        sb6.append((Object) hint);
        sb6.append((Object) text3);
        sb6.append((Object) text4);
        sb6.append((Object) text5);
        amountInputView.f58340q.setText(sb6.toString());
    }

    private final e0 getArithmeticDelegateCallback() {
        return new e0(this);
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
    private final void setFocus(boolean focus) {
        View view = this.f58332b ? this.f58341r : this.o;
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f58346y;
        if (onAttachStateChangeListener != null) {
            view.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        }
        this.f58346y = null;
        f0 f0Var = this.f58345x;
        if (f0Var != null) {
            view.getViewTreeObserver().removeOnWindowFocusChangeListener(f0Var);
        }
        this.f58345x = null;
        if (!focus) {
            if (view.isFocused()) {
                view.clearFocus();
                return;
            }
            return;
        }
        if (view.isFocused()) {
            return;
        }
        view.requestFocus();
        if (((Boolean) jo0.g.v.getValue()).booleanValue()) {
            kli.c.d(view, 0L);
            return;
        }
        if (view.hasWindowFocus()) {
            kli.c.d(view, 0L);
            return;
        }
        if (view.isAttachedToWindow()) {
            f0 f0Var2 = new f0(view, this);
            this.f58345x = f0Var2;
            view.getViewTreeObserver().addOnWindowFocusChangeListener(f0Var2);
        } else {
            as0.d dVar = new as0.d(view, this, 7);
            this.f58346y = dVar;
            view.addOnAttachStateChangeListener(dVar);
        }
    }

    private final void setInputFilters(bw0.h amountInputModel) {
        List list = amountInputModel.e;
        InputFilter[] filters = getEditText().getFilters();
        Intrinsics.checkNotNullExpressionValue(filters, "getFilters(...)");
        if (Intrinsics.f(list, kotlin.collections.d.v0(filters))) {
            return;
        }
        getEditText().setFilters((InputFilter[]) amountInputModel.e.toArray(new InputFilter[0]));
    }

    public final void g0(int i) {
        DynamicWidthHeightAutosizeTextView dynamicWidthHeightAutosizeTextView = this.f58340q;
        jb3.l.e(dynamicWidthHeightAutosizeTextView, i);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        dynamicWidthHeightAutosizeTextView.setAutoSizeTextTypeUniformWithConfiguration(kli.a.B(context, 12.0f), (int) dynamicWidthHeightAutosizeTextView.getTextSize(), 1, 0);
        Intrinsics.checkNotNullParameter(dynamicWidthHeightAutosizeTextView, "<this>");
        dynamicWidthHeightAutosizeTextView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        ViewGroup.LayoutParams layoutParams = dynamicWidthHeightAutosizeTextView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = dynamicWidthHeightAutosizeTextView.getMeasuredHeight();
        dynamicWidthHeightAutosizeTextView.setLayoutParams(layoutParams);
    }

    @NotNull
    public final MaskedTextInputEditText getEditText() {
        return this.f58332b ? this.f58341r.getMainEditText$ui_kit_components_release() : this.o;
    }

    public final yz0.b getMaskingDelegate$ui_kit_components_release() {
        return this.v.f169296c.u();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ix0.t tVar = this.v;
        tVar.i();
        this.f58342s = tVar.h().subscribe(new mv9.h(17, new mqi.a(this, 23)));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        te0.w.p0(this.f58342s);
        ix0.t tVar = this.v;
        d01.g gVarE0 = tVar.f169297g.e0();
        if (gVarE0 != null) {
            ((iz0.e) gVarE0).c(tVar.f169305r);
        }
        tVar.f169303p.d();
        ifm.c cVar = tVar.o;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        boolean z = this.f58332b;
        p0 p0Var = this.f58341r;
        if (!z) {
            p0Var.setVisibility(8);
            return;
        }
        ConstraintSet constraintSet = new ConstraintSet();
        addView(p0Var, 0);
        constraintSet.clone(this);
        constraintSet.connect(p0Var.getId(), 3, getId(), 3);
        constraintSet.connect(p0Var.getId(), 4, getId(), 4);
        FrameLayout frameLayout = this.f58338n;
        constraintSet.clear(frameLayout.getId(), 1);
        constraintSet.clear(frameLayout.getId(), 2);
        constraintSet.clear(frameLayout.getId(), 4);
        constraintSet.clear(frameLayout.getId(), 3);
        FrameLayout frameLayout2 = this.f58337m;
        constraintSet.clear(frameLayout2.getId(), 1);
        constraintSet.clear(frameLayout2.getId(), 2);
        constraintSet.clear(frameLayout2.getId(), 4);
        constraintSet.clear(frameLayout2.getId(), 3);
        TextView textView = this.f58336l;
        constraintSet.clear(textView.getId(), 2);
        constraintSet.connect(frameLayout.getId(), 3, getId(), 3);
        constraintSet.connect(frameLayout2.getId(), 3, getId(), 3);
        constraintSet.applyTo(this);
        this.f58335j.setVisibility(8);
        this.k.setVisibility(8);
        textView.setVisibility(8);
        this.o.setVisibility(8);
        this.f58339p.setVisibility(8);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        DynamicWidthHeightAutosizeTextView dynamicWidthHeightAutosizeTextView = this.f58340q;
        boolean z = this.f58332b;
        if (!z && dynamicWidthHeightAutosizeTextView.getMeasuredWidth() > 0) {
            FrameLayout frameLayout = this.f58337m;
            if (frameLayout.getVisibility() != 0) {
                frameLayout = null;
            }
            int measuredWidth = frameLayout != null ? frameLayout.getMeasuredWidth() : 0;
            FrameLayout frameLayout2 = this.f58338n;
            FrameLayout frameLayout3 = frameLayout2.getVisibility() == 0 ? frameLayout2 : null;
            int measuredWidth2 = frameLayout3 != null ? frameLayout3.getMeasuredWidth() : 0;
            if (dynamicWidthHeightAutosizeTextView.getPaddingStart() != measuredWidth || dynamicWidthHeightAutosizeTextView.getPaddingEnd() != measuredWidth2) {
                knm.b.x(measuredWidth, dynamicWidthHeightAutosizeTextView);
                knm.b.w(measuredWidth2, dynamicWidthHeightAutosizeTextView);
                dynamicWidthHeightAutosizeTextView.measure(View.MeasureSpec.makeMeasureSpec(dynamicWidthHeightAutosizeTextView.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(dynamicWidthHeightAutosizeTextView.getMeasuredHeight(), 1073741824));
            }
        }
        if (z) {
            return;
        }
        float textSize = dynamicWidthHeightAutosizeTextView.getTextSize();
        MaskedTextInputEditText maskedTextInputEditText = this.o;
        if (maskedTextInputEditText.getTextSize() == textSize) {
            return;
        }
        maskedTextInputEditText.setTextSize(0, textSize);
        this.f58339p.setTextSize(0, textSize);
        this.f58336l.setTextSize(0, textSize);
        this.k.setTextSize(0, textSize);
        this.f58335j.setTextSize(0, textSize);
        super.onMeasure(i, i2);
    }

    public final void setAmountFontSize(@NotNull c0 size) {
        int i;
        Intrinsics.checkNotNullParameter(size, "size");
        if (this.f58344w == size) {
            return;
        }
        this.f58344w = size;
        int i2 = d0.f209642a[size.ordinal()];
        if (i2 == 1) {
            i = R$attr.internal_textAppearanceDisplay2;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$attr.internal_textAppearanceHeading1;
        }
        if (this.f58332b) {
            this.f58341r.h(i);
        } else {
            jb3.l.e(this.o, i);
            jb3.l.e(this.f58335j, i);
            jb3.l.e(this.f58339p, i);
            jb3.l.e(this.k, i);
            jb3.l.e(this.f58336l, i);
        }
        g0(i);
    }

    public final void setAmountInput(@NotNull bw0.h amountInputModel) {
        Intrinsics.checkNotNullParameter(amountInputModel, "amountInputModel");
        setInputFilters(amountInputModel);
        this.v.j(amountInputModel);
        bw0.c cVar = amountInputModel.o;
        this.f58341r.setEnabled(cVar.b());
        getEditText().setEnabled(cVar.b());
        setEnabled(cVar.b());
        Boolean bool = amountInputModel.f;
        if (bool != null) {
            setFocus(bool.booleanValue());
        }
    }

    public final void setCustomColors(bw0.a inputColors) {
        ix0.u uVar;
        if (inputColors != null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            mm7.h obtainColorInt = new mm7.h(1, context, io0.a.class, "obtainColorInt", "obtainColorInt(Landroid/content/Context;Lcom/revolut/core/ui/models/Color;)I", 1, 23);
            ix0.m callback = this.f58343t;
            Intrinsics.checkNotNullParameter(callback, "callback");
            Intrinsics.checkNotNullParameter(obtainColorInt, "obtainColorInt");
            Intrinsics.checkNotNullParameter(inputColors, "inputColors");
            r10.r rVar = new r10.r();
            rVar.f250851a = callback;
            rVar.f250852b = obtainColorInt;
            rVar.f250853c = inputColors;
            uVar = rVar;
        } else {
            uVar = this.u;
        }
        ix0.t tVar = this.v;
        tVar.getClass();
        Intrinsics.checkNotNullParameter(uVar, "<set-?>");
        tVar.d = uVar;
        this.f58341r.setCustomColors(inputColors);
        tVar.r();
        tVar.q();
        bw0.h hVar = tVar.f169300l;
        if (hVar == null) {
            return;
        }
        tVar.f169296c.F(tVar.d.q(hVar));
    }

    public final void setCustomFont(i3 customFont) {
        this.f58341r.setCustomFont(customFont);
    }

    public final void setCustomKeyboardStyle(jo0.b customKeyboardStyle) {
        if (this.f58332b) {
            this.f58341r.setCustomKeyboardStyle(customKeyboardStyle);
        } else {
            this.o.setCustomKeyboardStyle(customKeyboardStyle);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        ix0.t tVar = this.v;
        tVar.q();
        tVar.r();
    }

    public final void setEndView$ui_kit_components_release(@NotNull View view, int width, int height, int margin) {
        Intrinsics.checkNotNullParameter(view, "view");
        FrameLayout frameLayout = this.f58338n;
        View view2 = (View) y.r(ViewGroupKt.getChildren(frameLayout));
        ViewGroup.LayoutParams layoutParams = view2 != null ? view2.getLayoutParams() : null;
        boolean zF = Intrinsics.f(view2, view);
        p0 p0Var = this.f58341r;
        boolean z = this.f58332b;
        if (zF && layoutParams != null && width == layoutParams.width && layoutParams.height == height && frameLayout.getPaddingLeft() == margin) {
            frameLayout.setVisibility(0);
            if (z) {
                p0Var.k(true);
                return;
            }
            return;
        }
        frameLayout.removeAllViews();
        frameLayout.addView(view, width, height);
        frameLayout.setPadding(margin, frameLayout.getPaddingTop(), frameLayout.getPaddingRight(), frameLayout.getPaddingBottom());
        frameLayout.setVisibility(0);
        if (z) {
            p0Var.k(true);
        }
    }

    public final void setMaskingDelegate$ui_kit_components_release(yz0.b bVar) {
        this.v.l(bVar);
    }

    public final void setStartView$ui_kit_components_release(@NotNull View view, int width, int height, int endPadding) {
        Intrinsics.checkNotNullParameter(view, "view");
        FrameLayout frameLayout = this.f58337m;
        View view2 = (View) y.r(ViewGroupKt.getChildren(frameLayout));
        ViewGroup.LayoutParams layoutParams = view2 != null ? view2.getLayoutParams() : null;
        boolean zF = Intrinsics.f(view2, view);
        p0 p0Var = this.f58341r;
        boolean z = this.f58332b;
        if (zF && layoutParams != null && width == layoutParams.width && layoutParams.height == height && frameLayout.getPaddingRight() == endPadding) {
            frameLayout.setVisibility(0);
            if (z) {
                p0Var.l(true);
                return;
            }
            return;
        }
        frameLayout.removeAllViews();
        frameLayout.addView(view, width, height);
        frameLayout.setPadding(frameLayout.getPaddingLeft(), frameLayout.getPaddingTop(), endPadding, frameLayout.getPaddingBottom());
        frameLayout.setVisibility(0);
        if (z) {
            p0Var.l(true);
        }
    }

    public final void setSuggestionsSourceId$ui_kit_components_release(@NotNull String uniqueSuggestionsId) {
        Intrinsics.checkNotNullParameter(uniqueSuggestionsId, "uniqueSuggestionsId");
        ix0.t tVar = this.v;
        tVar.getClass();
        Intrinsics.checkNotNullParameter(uniqueSuggestionsId, "uniqueSuggestionsId");
        tVar.f169305r = uniqueSuggestionsId;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AmountInputView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    public AmountInputView(@NotNull Context context, AttributeSet attributeSet, int i) {
        ix0.m arithmeticDelegateCallback;
        int i2;
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        boolean zBooleanValue = ((Boolean) jo0.g.f176829l.getValue()).booleanValue();
        this.f58332b = zBooleanValue;
        this.f = v0.a.d("create(...)");
        this.f58333g = v0.a.d("create(...)");
        this.f58334h = v0.a.d("create(...)");
        this.i = v0.a.d("create(...)");
        p0 p0Var = new p0(context, null, 6, 0);
        this.f58341r = p0Var;
        this.f58344w = c0.DEFAULT;
        View.inflate(context, R$layout.internal_amount_input_view, this);
        View viewFindViewById = findViewById(R$id.amountInput_amountInputPrefix);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById;
        this.f58335j = textView;
        View viewFindViewById2 = findViewById(R$id.amountInput_amountInputResult);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        TextView textView2 = (TextView) viewFindViewById2;
        this.k = textView2;
        View viewFindViewById3 = findViewById(R$id.amountInput_amountInputSuffix);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        TextView textView3 = (TextView) viewFindViewById3;
        this.f58336l = textView3;
        View viewFindViewById4 = findViewById(R$id.amountInput_endView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        FrameLayout frameLayout = (FrameLayout) viewFindViewById4;
        this.f58338n = frameLayout;
        View viewFindViewById5 = findViewById(R$id.amountInput_startView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        FrameLayout frameLayout2 = (FrameLayout) viewFindViewById5;
        this.f58337m = frameLayout2;
        View viewFindViewById6 = findViewById(R$id.amountInput_amountInputText);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        MaskedTextInputEditText maskedTextInputEditText = (MaskedTextInputEditText) viewFindViewById6;
        this.o = maskedTextInputEditText;
        View viewFindViewById7 = findViewById(R$id.amountInput_amountInputFractionDigitsHint);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.f58339p = (TextView) viewFindViewById7;
        View viewFindViewById8 = findViewById(R$id.amountInput_invisibleAutoSizeView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        this.f58340q = (DynamicWidthHeightAutosizeTextView) viewFindViewById8;
        p0Var.setId(R$id.amountInputView_animatedInput);
        p0Var.setAmountInputEndView(frameLayout);
        p0Var.setAmountInputStartView(frameLayout2);
        if (zBooleanValue) {
            arithmeticDelegateCallback = p0Var.getArithmeticDelegateCallback();
        } else {
            arithmeticDelegateCallback = getArithmeticDelegateCallback();
        }
        ix0.m mVar = arithmeticDelegateCallback;
        this.f58343t = mVar;
        this.u = new b9.u(true, mVar, new mm7.h(1, context, kli.a.class, "obtainColorFromAttr", "obtainColorFromAttr(Landroid/content/Context;I)I", 1, 22));
        this.v = new ix0.t(context, true, mVar);
        mVar.a(new m4(this, 8));
        final int i3 = 0;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: mx0.a0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AmountInputView f209566b;

            {
                this.f209566b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        this.f209566b.f58333g.onNext(Unit.f186387a);
                        break;
                    default:
                        this.f209566b.f58334h.onNext(Unit.f186387a);
                        break;
                }
            }
        });
        p0Var.setOnPrefixClickListener$ui_kit_components_release(new Function0(this) { // from class: mx0.b0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AmountInputView f209592b;

            {
                this.f209592b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        ihm.f fVar = this.f209592b.f58333g;
                        Unit unit = Unit.f186387a;
                        fVar.onNext(unit);
                        return unit;
                    case 1:
                        ihm.f fVar2 = this.f209592b.f58334h;
                        Unit unit2 = Unit.f186387a;
                        fVar2.onNext(unit2);
                        return unit2;
                    default:
                        ihm.f fVar3 = this.f209592b.i;
                        Unit unit3 = Unit.f186387a;
                        fVar3.onNext(unit3);
                        return unit3;
                }
            }
        });
        final int i5 = 1;
        textView3.setOnClickListener(new View.OnClickListener(this) { // from class: mx0.a0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AmountInputView f209566b;

            {
                this.f209566b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i5) {
                    case 0:
                        this.f209566b.f58333g.onNext(Unit.f186387a);
                        break;
                    default:
                        this.f209566b.f58334h.onNext(Unit.f186387a);
                        break;
                }
            }
        });
        p0Var.setOnSuffixClickListener$ui_kit_components_release(new Function0(this) { // from class: mx0.b0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AmountInputView f209592b;

            {
                this.f209592b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        ihm.f fVar = this.f209592b.f58333g;
                        Unit unit = Unit.f186387a;
                        fVar.onNext(unit);
                        return unit;
                    case 1:
                        ihm.f fVar2 = this.f209592b.f58334h;
                        Unit unit2 = Unit.f186387a;
                        fVar2.onNext(unit2);
                        return unit2;
                    default:
                        ihm.f fVar3 = this.f209592b.i;
                        Unit unit3 = Unit.f186387a;
                        fVar3.onNext(unit3);
                        return unit3;
                }
            }
        });
        maskedTextInputEditText.addTextChangedListener(new g0(this, 0));
        textView.addTextChangedListener(new g0(this, 1));
        textView2.addTextChangedListener(new g0(this, 2));
        textView3.addTextChangedListener(new g0(this, 3));
        int i6 = d0.f209642a[this.f58344w.ordinal()];
        if (i6 == 1) {
            i2 = R$attr.internal_textAppearanceDisplay2;
        } else if (i6 == 2) {
            i2 = R$attr.internal_textAppearanceHeading1;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        g0(i2);
        hx7.b.v(this, "AmountInput.TextField");
        final int i21 = 2;
        getEditText().setOnDeleteKeyPressedWhenEmpty(new Function0(this) { // from class: mx0.b0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AmountInputView f209592b;

            {
                this.f209592b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i21) {
                    case 0:
                        ihm.f fVar = this.f209592b.f58333g;
                        Unit unit = Unit.f186387a;
                        fVar.onNext(unit);
                        return unit;
                    case 1:
                        ihm.f fVar2 = this.f209592b.f58334h;
                        Unit unit2 = Unit.f186387a;
                        fVar2.onNext(unit2);
                        return unit2;
                    default:
                        ihm.f fVar3 = this.f209592b.i;
                        Unit unit3 = Unit.f186387a;
                        fVar3.onNext(unit3);
                        return unit3;
                }
            }
        });
    }

    public /* synthetic */ AmountInputView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
