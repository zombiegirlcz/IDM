package com.revolut.core.ui_kit.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.core.view.ViewGroupKt;
import com.revolut.core.ui_kit.R$drawable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_resources.R$attr;
import ip0.l6;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import mx0.xa;
import nkm.d0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001bB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0013\u0010\u0012J\u0013\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/revolut/core/ui_kit/views/NumpadView;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "enabled", "", "setEnabled", "(Z)V", "Lcom/revolut/core/ui_kit/models/Clause;", "clause", "setStartAction", "(Lcom/revolut/core/ui_kit/models/Clause;)V", "setEndAction", "Lkotlin/sequences/Sequence;", "Landroid/view/View;", "getNumericButtons", "()Lkotlin/sequences/Sequence;", "getEndActionButton", "()Landroid/view/View;", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NumpadView extends ViewGroup {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ihm.f f58810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ihm.f f58811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f58812c;
    public final Button d;
    public final Button e;
    public final int f;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.views.NumpadView$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NumpadView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static final void a(NumpadView numpadView, Button button) {
        Context context = numpadView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (io3.h.m(context)) {
            button.performHapticFeedback(1, 2);
        }
    }

    @NotNull
    public final View getEndActionButton() {
        return this.e;
    }

    @NotNull
    public final Sequence<View> getNumericButtons() {
        Sequence<View> children = ViewGroupKt.getChildren(this);
        mv5.h predicate = new mv5.h(9);
        Intrinsics.checkNotNullParameter(children, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return new d0(new nkm.h(new nkm.m(children, 0), true, new nfj.l(predicate, 22)), new njf.d(21));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i5) {
        int width = getWidth();
        int i6 = this.f;
        int i21 = (width - (i6 * 4)) / 3;
        int height = (getHeight() - (i6 * 5)) / 4;
        int childCount = getChildCount();
        for (int i22 = 0; i22 < childCount; i22++) {
            int i32 = i22 % 3;
            int i33 = i22 / 3;
            int i43 = ((i32 + 1) * i6) + (i32 * i21);
            int i59 = ((i33 + 1) * i6) + (i33 * height);
            getChildAt(i22).layout(i43, i59, i43 + i21, i59 + height);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i3 = this.f;
        int i5 = (size - (i3 * 4)) / 3;
        int i6 = (size2 - (i3 * 5)) / 4;
        int childCount = getChildCount();
        for (int i21 = 0; i21 < childCount; i21++) {
            getChildAt(i21).measure(View.MeasureSpec.makeMeasureSpec(i5, 1073741824), View.MeasureSpec.makeMeasureSpec(i6, 1073741824));
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        setAlpha(enabled ? 1.0f : 0.5f);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setEnabled(enabled);
        }
    }

    public final void setEndAction(Clause clause) {
        kli.a.b(this.e, clause, ty0.f.f275450a);
    }

    public final void setStartAction(Clause clause) {
        kli.a.b(this.d, clause, ty0.f.f275450a);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NumpadView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NumpadView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f58810a = v0.a.d("create(...)");
        this.f58811b = v0.a.d("create(...)");
        this.f58812c = v0.a.d("create(...)");
        this.f = kli.a.w(R$attr.uikit_dp4, context);
        int i2 = 0;
        while (i2 < 9) {
            int i3 = i2 + 1;
            String strValueOf = String.valueOf(i3);
            Button button = new Button(getContext());
            button.setText(strValueOf);
            button.setTag("numpad_button_" + ((Object) strValueOf));
            button.setGravity(17);
            button.setStateListAnimator(null);
            button.setIncludeFontPadding(false);
            button.setPadding(0, 0, 0, 0);
            jb3.l.e(button, R$attr.internal_textAppearanceNumPadKeyboardDigit);
            Context context2 = button.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            button.setTextColor(kli.a.s(R$attr.uikit_colorForeground, context2));
            button.setBackgroundResource(R$drawable.internal_numpad_numeric_button_background);
            button.setOnClickListener(new l6(this, button, this, i3, 1));
            addView(button);
            i2 = i3;
        }
        Button button2 = new Button(getContext());
        button2.setText((CharSequence) null);
        button2.setTag("numpad_button_null");
        button2.setGravity(17);
        button2.setStateListAnimator(null);
        button2.setIncludeFontPadding(false);
        button2.setPadding(0, 0, 0, 0);
        jb3.l.e(button2, R$attr.internal_textAppearanceNumPadKeyboardDigit);
        Context context3 = button2.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        button2.setTextColor(kli.a.s(R$attr.uikit_colorForeground, context3));
        button2.setBackgroundResource(R$drawable.internal_numpad_numeric_button_background);
        button2.setOnClickListener(new xa(this, button2, this, 1));
        addView(button2);
        button2.setVisibility(4);
        this.d = button2;
        Button button3 = new Button(getContext());
        button3.setText("0");
        button3.setTag("numpad_button_0");
        button3.setGravity(17);
        button3.setStateListAnimator(null);
        button3.setIncludeFontPadding(false);
        button3.setPadding(0, 0, 0, 0);
        jb3.l.e(button3, R$attr.internal_textAppearanceNumPadKeyboardDigit);
        Context context4 = button3.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        button3.setTextColor(kli.a.s(R$attr.uikit_colorForeground, context4));
        button3.setBackgroundResource(R$drawable.internal_numpad_numeric_button_background);
        button3.setOnClickListener(new xa(this, button3, this, 0));
        addView(button3);
        Button button4 = new Button(getContext());
        button4.setText((CharSequence) null);
        button4.setTag("numpad_button_null");
        button4.setGravity(17);
        button4.setStateListAnimator(null);
        button4.setIncludeFontPadding(false);
        button4.setPadding(0, 0, 0, 0);
        jb3.l.e(button4, R$attr.internal_textAppearanceNumPadKeyboardDigit);
        Context context5 = button4.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        button4.setTextColor(kli.a.s(R$attr.uikit_colorForeground, context5));
        button4.setBackgroundResource(R$drawable.internal_numpad_numeric_button_background);
        button4.setOnClickListener(new xa(this, button4, this, 2));
        addView(button4);
        button4.setVisibility(4);
        this.e = button4;
    }

    public /* synthetic */ NumpadView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
