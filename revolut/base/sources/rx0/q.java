package rx0;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.google.android.material.textfield.TextInputEditText;
import com.revolut.core.ui_kit.keyboard.api.style.UIKitKeyboardStyle;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public class q extends TextInputEditText implements rv0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Function0 f258010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f258011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public jo0.b f258012c;
    public int d;
    public boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.e = getShowSoftInputOnFocus();
    }

    public static /* synthetic */ void getCustomKeyboardStyle$annotations() {
    }

    private final rv0.k getKeyboardManagerCore() {
        rv0.j jVarA = kli.c.a(this);
        if (jVarA instanceof rv0.k) {
            return (rv0.k) jVarA;
        }
        return null;
    }

    public static /* synthetic */ void getKeyboardSuggestionsAlwaysOn$annotations() {
    }

    public static /* synthetic */ void getOnDeleteKeyPressedWhenEmpty$annotations() {
    }

    public static /* synthetic */ void getUiKitInputType$annotations() {
    }

    public static /* synthetic */ void getUiKitShowSoftInputOnFocus$annotations() {
    }

    @Override // rv0.a
    public final void c() {
        d();
    }

    public final void d() {
        rv0.k keyboardManagerCore = getKeyboardManagerCore();
        setShowSoftInputOnFocus((keyboardManagerCore == null || !((sv0.c) keyboardManagerCore).j(this)) ? this.e : false);
    }

    public final jo0.b getCustomKeyboardStyle() {
        return this.f258012c;
    }

    public final boolean getKeyboardSuggestionsAlwaysOn() {
        return this.f258011b;
    }

    public final Function0<Unit> getOnDeleteKeyPressedWhenEmpty() {
        return this.f258010a;
    }

    public final int getUiKitInputType() {
        return this.d;
    }

    public final boolean getUiKitShowSoftInputOnFocus() {
        return this.e;
    }

    @Override // com.google.android.material.textfield.TextInputEditText, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        d();
    }

    @Override // com.google.android.material.textfield.TextInputEditText, androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo outAttrs) {
        Intrinsics.checkNotNullParameter(outAttrs, "outAttrs");
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(outAttrs);
        UIKitKeyboardStyle.Transparent transparent = null;
        if (inputConnectionOnCreateInputConnection == null) {
            return null;
        }
        if (outAttrs.extras == null) {
            outAttrs.extras = new Bundle();
        }
        outAttrs.extras.putBoolean("keyboard_suggestions_always_on_key", this.f258011b);
        Bundle bundle = outAttrs.extras;
        jo0.b bVar = this.f258012c;
        if (Intrinsics.f(bVar, jo0.a.f176821a)) {
            transparent = UIKitKeyboardStyle.Transparent.f57722a;
        } else if (bVar != null) {
            throw new NoWhenBranchMatchedException();
        }
        bundle.putParcelable("custom_keyboard_style_key", transparent);
        return new p(this, inputConnectionOnCreateInputConnection);
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.view.View
    public void onDetachedFromWindow() {
        rv0.k keyboardManagerCore = getKeyboardManagerCore();
        if (keyboardManagerCore != null) {
            ((sv0.c) keyboardManagerCore).m(this);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        rv0.k keyboardManagerCore;
        super.onFocusChanged(z, i, rect);
        if (!z || (keyboardManagerCore = getKeyboardManagerCore()) == null) {
            return;
        }
        ((sv0.c) keyboardManagerCore).n(this);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        rv0.k keyboardManagerCore;
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getAction() == 1 && ((isEnabled() || isTextSelectable()) && this.e && (keyboardManagerCore = getKeyboardManagerCore()) != null && ((sv0.c) keyboardManagerCore).j(this))) {
            requestFocus();
            rv0.k keyboardManagerCore2 = getKeyboardManagerCore();
            if (keyboardManagerCore2 != null) {
                ((sv0.c) keyboardManagerCore2).p(this);
            }
        }
        return super.onTouchEvent(event);
    }

    public final void setCustomKeyboardStyle(jo0.b bVar) {
        if (Intrinsics.f(this.f258012c, bVar)) {
            return;
        }
        this.f258012c = bVar;
        rv0.k keyboardManagerCore = getKeyboardManagerCore();
        if (keyboardManagerCore != null) {
            ((sv0.c) keyboardManagerCore).n(this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z) {
        rv0.k keyboardManagerCore;
        rv0.k keyboardManagerCore2;
        if (isEnabled() != z && isFocused() && !z && (keyboardManagerCore = getKeyboardManagerCore()) != null && ((sv0.c) keyboardManagerCore).j(this) && (keyboardManagerCore2 = getKeyboardManagerCore()) != null) {
            ((sv0.c) keyboardManagerCore2).h(this);
        }
        super.setEnabled(z);
    }

    @Override // android.widget.TextView
    public void setInputType(int i) {
        super.setInputType(i);
        d();
    }

    public final void setKeyboardSuggestionsAlwaysOn(boolean z) {
        if (this.f258011b != z) {
            this.f258011b = z;
            rv0.k keyboardManagerCore = getKeyboardManagerCore();
            if (keyboardManagerCore != null) {
                ((sv0.c) keyboardManagerCore).n(this);
            }
        }
    }

    public final void setOnDeleteKeyPressedWhenEmpty(Function0<Unit> function0) {
        this.f258010a = function0;
    }

    public final void setUiKitInputType(int i) {
        if (this.d != i) {
            this.d = i;
            rv0.k keyboardManagerCore = getKeyboardManagerCore();
            if (keyboardManagerCore != null) {
                ((sv0.c) keyboardManagerCore).n(this);
            }
        }
    }

    public final void setUiKitShowSoftInputOnFocus(boolean z) {
        this.e = z;
        d();
    }
}
