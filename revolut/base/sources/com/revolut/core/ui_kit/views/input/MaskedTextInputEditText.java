package com.revolut.core.ui_kit.views.input;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.KeyListener;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.appcompat.R$attr;
import au0.a2;
import au0.m4;
import c01.d;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.models.Clause;
import com.youTransactor.uCube.rpc.Constants;
import hz0.e;
import ifm.c;
import ihm.f;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import jo0.g;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import or0.u;
import org.jetbrains.annotations.NotNull;
import rrd.l;
import rtl.y;
import rwg.e0;
import rx0.n;
import rx0.q;
import yhm.j;
import yz0.a;
import yz0.b;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\r\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0019\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ/\u0010 \u001a\u00020\r2\b\u0010\u001b\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u001d\u001a\u00020\u001c2\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\r0\u001e¢\u0006\u0004\b \u0010!J\u0019\u0010#\u001a\u00020\r2\b\u0010\"\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b#\u0010\u000fJ\u000f\u0010$\u001a\u00020\u0007H\u0002¢\u0006\u0004\b$\u0010%R!\u0010+\u001a\b\u0012\u0004\u0012\u00020\r0&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\"\u00102\u001a\u00020\u001c8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R.\u0010;\u001a\u0004\u0018\u0001032\b\u00104\u001a\u0004\u0018\u0001038\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010?\u001a\u00020\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010-\u001a\u0004\b=\u0010/\"\u0004\b>\u00101¨\u0006@"}, d2 = {"Lcom/revolut/core/ui_kit/views/input/MaskedTextInputEditText;", "Lrx0/q;", "Lyz0/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/text/method/KeyListener;", "listener", "", "setKeyListener", "(Landroid/text/method/KeyListener;)V", "type", "setInputType", "(I)V", "Lcom/revolut/core/ui_kit/models/Clause;", "placeholder", "setAlwaysVisiblePlaceholder", "(Lcom/revolut/core/ui_kit/models/Clause;)V", "Landroid/view/View$OnFocusChangeListener;", "l", "setOnFocusChangeListener", "(Landroid/view/View$OnFocusChangeListener;)V", "clause", "", "keepStyle", "Lkotlin/Function0;", "onTextSet", "setTextSafely", "(Lcom/revolut/core/ui_kit/models/Clause;ZLkotlin/jvm/functions/Function0;)V", "newListener", "setNewKeyListener", "getVerticalOffset", "()I", "Lihm/f;", "f", "Lkotlin/Lazy;", "getSelectionStateChangedSubject", "()Lihm/f;", "selectionStateChangedSubject", "j", "Z", "getDisplayAlwaysVisiblePlaceholderUnfocused$ui_kit_components_release", "()Z", "setDisplayAlwaysVisiblePlaceholderUnfocused$ui_kit_components_release", "(Z)V", "displayAlwaysVisiblePlaceholderUnfocused", "Lyz0/b;", "value", "o", "Lyz0/b;", "getMaskingDelegate", "()Lyz0/b;", "setMaskingDelegate", "(Lyz0/b;)V", "maskingDelegate", "p", "getButtonMode", "setButtonMode", "buttonMode", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class MaskedTextInputEditText extends q implements a {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f59117y = 0;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final Lazy selectionStateChangedSubject;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public StaticLayout f59118g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f59119h;
    public SpannableStringBuilder i;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public boolean displayAlwaysVisiblePlaceholderUnfocused;
    public KeyListener k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public y f59121l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f59122m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Integer f59123n;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public b maskingDelegate;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public boolean buttonMode;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public View.OnFocusChangeListener f59125q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final CopyOnWriteArrayList f59126r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final f f59127s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final a2 f59128t;
    public final ArrayList u;
    public boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public d f59129w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public c f59130x;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MaskedTextInputEditText(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void g(MaskedTextInputEditText maskedTextInputEditText, int i, int i2, boolean z, int i3) {
        if ((i3 & 1) != 0) {
            i = maskedTextInputEditText.getPaddingStart();
        }
        int paddingTop = maskedTextInputEditText.getPaddingTop();
        int paddingBottom = maskedTextInputEditText.getPaddingBottom();
        if ((i3 & 16) != 0) {
            z = false;
        }
        if (z) {
            maskedTextInputEditText.f59122m = true;
        }
        maskedTextInputEditText.setPaddingRelative(i, paddingTop, i2, paddingBottom);
        if (z) {
            maskedTextInputEditText.f59122m = false;
        }
    }

    private final f getSelectionStateChangedSubject() {
        return (f) this.selectionStateChangedSubject.getValue();
    }

    private final int getVerticalOffset() {
        int gravity;
        StaticLayout staticLayout = this.f59118g;
        if (staticLayout != null && (gravity = getGravity() & 112) != 48) {
            int measuredHeight = getMeasuredHeight() - (getExtendedPaddingBottom() + getExtendedPaddingTop());
            int height = staticLayout.getHeight();
            if (height < measuredHeight) {
                return gravity == 80 ? measuredHeight - height : (measuredHeight - height) >> 1;
            }
        }
        return 0;
    }

    private final void setNewKeyListener(KeyListener newListener) {
        if (Intrinsics.f(newListener, this.k)) {
            return;
        }
        this.k = newListener;
        super.setKeyListener(newListener);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setTextSafely$default(MaskedTextInputEditText maskedTextInputEditText, Clause clause, boolean z, Function0 function0, int i, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setTextSafely");
        }
        if ((i & 4) != 0) {
            function0 = new e0(1);
        }
        maskedTextInputEditText.setTextSafely(clause, z, function0);
    }

    @Override // yz0.a
    public void a(View.OnFocusChangeListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f59126r.add(listener);
    }

    @Override // yz0.a
    public void b(View.OnFocusChangeListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f59126r.remove(listener);
    }

    public final f e() {
        return getSelectionStateChangedSubject();
    }

    public final void f(String str) {
        SpannableStringBuilder spannableStringBuilder = this.i;
        if (spannableStringBuilder != null) {
            String str2 = this.f59119h;
            Intrinsics.h(str2);
            spannableStringBuilder.clear();
            spannableStringBuilder.append(str, new ForegroundColorSpan(0), 33);
            String strSubstring = str2.substring(Math.min(str.length(), str2.length()));
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            spannableStringBuilder.append((CharSequence) strSubstring);
        }
        this.f59118g = null;
    }

    public final boolean getButtonMode() {
        return this.buttonMode;
    }

    /* JADX INFO: renamed from: getDisplayAlwaysVisiblePlaceholderUnfocused$ui_kit_components_release, reason: from getter */
    public final boolean getDisplayAlwaysVisiblePlaceholderUnfocused() {
        return this.displayAlwaysVisiblePlaceholderUnfocused;
    }

    public final b getMaskingDelegate() {
        return this.maskingDelegate;
    }

    @Override // android.widget.TextView
    public final boolean isSuggestionsEnabled() {
        return false;
    }

    @Override // rx0.q, com.google.android.material.textfield.TextInputEditText, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        f fVar;
        super.onAttachedToWindow();
        d dVarW = this.f59129w;
        if (dVarW == null && !this.v) {
            this.v = true;
            dVarW = u.k(this).W();
            this.f59129w = dVarW;
        }
        this.f59130x = (dVarW == null || (fVar = ((e) dVarW).e) == null) ? null : fVar.subscribe(new rw9.d(new l(this, 18), 2));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // rx0.q, com.google.android.material.textfield.TextInputEditText, androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo outAttrs) {
        Intrinsics.checkNotNullParameter(outAttrs, "outAttrs");
        InputConnection target = super.onCreateInputConnection(outAttrs);
        if (target == null) {
            return null;
        }
        if (!((Boolean) g.L.getValue()).booleanValue() || (getInputType() & 15) != 2) {
            return target;
        }
        Intrinsics.checkNotNullParameter(target, "target");
        return new n(target, true);
    }

    @Override // rx0.q, androidx.appcompat.widget.AppCompatEditText, android.view.View
    public final void onDetachedFromWindow() {
        c cVar = this.f59130x;
        if (cVar != null) {
            cVar.dispose();
        }
        this.f59130x = null;
        super.onDetachedFromWindow();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Editable text;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.displayAlwaysVisiblePlaceholderUnfocused || isFocused() || ((text = getText()) != null && text.length() != 0)) {
            if (this.f59119h != null && this.f59118g == null) {
                TextPaint textPaint = new TextPaint(getLayout().getPaint());
                SpannableStringBuilder spannableStringBuilder = this.i;
                Intrinsics.h(spannableStringBuilder);
                this.f59118g = new StaticLayout(spannableStringBuilder, textPaint, (getRight() - getLeft()) - getCompoundPaddingRight(), getLayout().getAlignment(), getLayout().getSpacingMultiplier(), getLayout().getSpacingAdd(), true);
            }
            StaticLayout staticLayout = this.f59118g;
            if (staticLayout != null) {
                canvas.save();
                int extendedPaddingTop = getExtendedPaddingTop();
                int extendedPaddingBottom = getExtendedPaddingBottom();
                int height = staticLayout.getHeight() - (((getBottom() - getTop()) - getCompoundPaddingBottom()) - getCompoundPaddingTop());
                float compoundPaddingLeft = getCompoundPaddingLeft() + getScrollX();
                float scrollY = getScrollY() == 0 ? BitmapDescriptorFactory.HUE_RED : extendedPaddingTop + getScrollY();
                float width = staticLayout.getWidth() + getScrollX();
                int scrollY2 = getScrollY() + (getBottom() - getTop());
                if (getScrollY() == height) {
                    extendedPaddingBottom = 0;
                }
                canvas.clipRect(compoundPaddingLeft, scrollY, width, scrollY2 - extendedPaddingBottom);
                canvas.translate(getScrollX() + getCompoundPaddingLeft(), extendedPaddingTop + ((getGravity() & 112) != 48 ? getVerticalOffset() : 0));
                TextPaint paint = staticLayout.getPaint();
                Integer num = this.f59123n;
                paint.setColor(num != null ? num.intValue() : getCurrentHintTextColor());
                staticLayout.draw(canvas);
                canvas.restore();
            }
        }
        super.onDraw(canvas);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0053  */
    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onKeyUp(int r3, android.view.KeyEvent r4) {
        /*
            r2 = this;
            boolean r3 = super.onKeyUp(r3, r4)     // Catch: java.lang.IllegalStateException -> L5
            return r3
        L5:
            r3 = move-exception
            r4 = 130(0x82, float:1.82E-43)
            android.view.View r4 = r2.focusSearch(r4)
            if (r4 == 0) goto L53
            int r0 = r4.getId()
            r1 = -1
            if (r0 != r1) goto L2b
            java.lang.Class r4 = r4.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            java.lang.String r4 = " (no id)"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            goto L4b
        L2b:
            android.content.res.Resources r1 = r2.getResources()
            java.lang.String r0 = r1.getResourceName(r0)
            java.lang.Class r4 = r4.getClass()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
        L4b:
            java.lang.String r0 = "failed to request focus: "
            java.lang.String r4 = j6.a.q(r0, r4)
            if (r4 != 0) goto L55
        L53:
            java.lang.String r4 = "focus view not found"
        L55:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r4, r3)
            zhm.h0 r3 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r4 = rd0.d.f253311a
            rd0.c r4 = rd0.c.ERROR
            r1 = 0
            rd0.d.a(r4, r1, r1, r0, r3)
            android.content.Context r3 = r2.getContext()
            java.lang.Class<android.view.inputmethod.InputMethodManager> r4 = android.view.inputmethod.InputMethodManager.class
            java.lang.Object r3 = r3.getSystemService(r4)
            android.view.inputmethod.InputMethodManager r3 = (android.view.inputmethod.InputMethodManager) r3
            if (r3 == 0) goto L80
            boolean r4 = r3.isActive(r2)
            if (r4 == 0) goto L80
            android.os.IBinder r4 = r2.getWindowToken()
            r0 = 0
            r3.hideSoftInputFromWindow(r4, r0)
        L80:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.views.input.MaskedTextInputEditText.onKeyUp(int, android.view.KeyEvent):boolean");
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        if (Build.VERSION.SDK_INT >= 35) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            if (jh.d.k(context)) {
                boolean z = false;
                boolean z3 = (getInputType() & 3) != 0;
                if (getFocusable() == 1 && !z3) {
                    z = true;
                }
                if (z != isLocalePreferredLineHeightForMinimumUsed()) {
                    setLocalePreferredLineHeightForMinimumUsed(z);
                }
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public final void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        b bVar = this.maskingDelegate;
        if (bVar != null) {
            bVar.onSelectionChanged(i2);
            if (bVar.d()) {
                Editable text = getText();
                int length = text != null ? text.length() : 0;
                int iF = bVar.f();
                if (iF < 0 || iF > length) {
                    Editable text2 = getText();
                    setSelection(text2 != null ? text2.length() : 0);
                } else {
                    setSelection(bVar.f());
                }
            }
        }
        y yVar = this.f59121l;
        if (yVar != null) {
            yVar.invoke();
        }
    }

    @Override // rx0.q, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.buttonMode) {
            return false;
        }
        return super.onTouchEvent(event);
    }

    @Override // android.view.View
    public final void requestLayout() {
        if (this.f59122m) {
            return;
        }
        super.requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setAlwaysVisiblePlaceholder(com.revolut.core.ui_kit.models.Clause r11) {
        /*
            r10 = this;
            r0 = 0
            if (r11 == 0) goto L8c
            wy0.a r1 = or0.u.k(r10)
            ty0.c r2 = r1.b0()
            android.content.Context r4 = r10.getContext()
            java.lang.String r1 = "getContext(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r1)
            r8 = 0
            r9 = 252(0xfc, float:3.53E-43)
            r5 = 0
            r6 = 0
            r7 = 0
            r3 = r11
            android.text.SpannableStringBuilder r11 = ty0.c.a(r2, r3, r4, r5, r6, r7, r8, r9)
            boolean r2 = r3 instanceof aw0.fa
            if (r2 == 0) goto L40
            r2 = r3
            aw0.fa r2 = (aw0.fa) r2
            com.revolut.core.ui_kit.models.Style r4 = r2.getD()
            boolean r4 = r4 instanceof com.revolut.core.ui_kit.models.Color
            if (r4 == 0) goto L40
            com.revolut.core.ui_kit.models.Style r1 = r2.getD()
            java.lang.String r2 = "null cannot be cast to non-null type com.revolut.core.ui_kit.models.Color"
            kotlin.jvm.internal.Intrinsics.i(r1, r2)
            com.revolut.core.ui_kit.models.Color r1 = (com.revolut.core.ui_kit.models.Color) r1
            int r1 = r1.f57746a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L70
        L40:
            boolean r2 = r3 instanceof com.revolut.core.ui_kit.models.TextClause
            if (r2 == 0) goto L5f
            r2 = r3
            com.revolut.core.ui_kit.models.TextClause r2 = (com.revolut.core.ui_kit.models.TextClause) r2
            java.lang.Integer r2 = r2.f57938c
            if (r2 == 0) goto L5f
            int r2 = r2.intValue()
            android.content.Context r3 = r10.getContext()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r1)
            int r1 = kli.a.s(r2, r3)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L70
        L5f:
            android.content.Context r2 = r10.getContext()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r1)
            int r1 = com.revolut.core.ui_kit_resources.R$attr.uikit_colorGreyTone50
            int r1 = kli.a.s(r1, r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
        L70:
            r10.f59123n = r1
            java.lang.String r11 = r11.toString()
            r10.f59119h = r11
            android.text.SpannableStringBuilder r11 = android.text.SpannableStringBuilder.valueOf(r11)
            r10.i = r11
            r10.f59118g = r0
            android.text.Editable r11 = r10.getText()
            java.lang.String r11 = java.lang.String.valueOf(r11)
            r10.f(r11)
            return
        L8c:
            r10.f59118g = r0
            r10.f59119h = r0
            r10.i = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.views.input.MaskedTextInputEditText.setAlwaysVisiblePlaceholder(com.revolut.core.ui_kit.models.Clause):void");
    }

    public final void setButtonMode(boolean z) {
        this.buttonMode = z;
    }

    public final void setDisplayAlwaysVisiblePlaceholderUnfocused$ui_kit_components_release(boolean z) {
        this.displayAlwaysVisiblePlaceholderUnfocused = z;
    }

    @Override // rx0.q, android.widget.TextView
    public void setInputType(int type) throws Throwable {
        KeyListener keyListener = this.k;
        if (keyListener != null && keyListener.getInputType() != type) {
            hx7.e.n(new IllegalStateException(com.google.android.gms.internal.mlkit_vision_face.a.m("Input type mismatch: requested ", type, keyListener.getInputType(), " but current KeyListener requires ", ". Ideally, do not set inputType manually when a KeyListener is present unless they match.")));
        }
        if (type == getInputType()) {
            return;
        }
        super.setInputType(type);
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView
    public void setKeyListener(KeyListener listener) {
        KeyListener keyListenerB;
        b bVar = this.maskingDelegate;
        if (bVar != null && (keyListenerB = bVar.b()) != null) {
            listener = keyListenerB;
        }
        setNewKeyListener(listener);
    }

    public final void setMaskingDelegate(b bVar) {
        setNewKeyListener(bVar != null ? bVar.b() : null);
        this.maskingDelegate = bVar;
    }

    @Override // android.view.View
    @yhm.d
    public final void setOnFocusChangeListener(View.OnFocusChangeListener l2) {
        View.OnFocusChangeListener onFocusChangeListener = this.f59125q;
        if (onFocusChangeListener != null) {
            b(onFocusChangeListener);
        }
        this.f59125q = l2;
        if (l2 != null) {
            a(l2);
        }
    }

    public final void setTextSafely(Clause clause, boolean keepStyle, @NotNull Function0<Unit> onTextSet) {
        CharSequence charSequenceA;
        String string;
        String string2;
        String str;
        Intrinsics.checkNotNullParameter(onTextSet, "onTextSet");
        if (clause != null) {
            ty0.c cVarB0 = u.k(this).b0();
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            charSequenceA = ty0.c.a(cVarB0, clause, context, null, null, null, null, Constants.TAG_FC_SPEED_MODE);
        } else {
            charSequenceA = null;
        }
        if (charSequenceA == null || (string = charSequenceA.toString()) == null) {
            string = "";
        }
        b bVar = this.maskingDelegate;
        Editable text = getText();
        boolean zF = Intrinsics.f(text != null ? text.toString() : null, string);
        boolean z = !zF;
        if (!zF && (bVar instanceof zp0.y) && (str = ((zp0.y) bVar).f324153g) != null) {
            z = !str.equals(string);
        }
        if (z) {
            a2 a2Var = this.f59128t;
            removeTextChangedListener(a2Var);
            if (!keepStyle) {
                charSequenceA = string;
            }
            try {
                setTextKeepState(charSequenceA != null ? charSequenceA : "");
            } catch (IndexOutOfBoundsException unused) {
                setText(charSequenceA);
            }
            addTextChangedListener(a2Var);
            Editable text2 = getText();
            if (text2 != null && (string2 = text2.toString()) != null) {
                string = string2;
            }
            f(string);
            onTextSet.invoke();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MaskedTextInputEditText(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaskedTextInputEditText(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.selectionStateChangedSubject = j.b(new y(this, 3));
        View.OnFocusChangeListener m4Var = new m4(this, 13);
        this.f59126r = new CopyOnWriteArrayList();
        this.f59127s = v0.a.d("create(...)");
        a2 a2Var = new a2(this, 11);
        this.f59128t = a2Var;
        this.u = new ArrayList();
        super.setOnFocusChangeListener(m4Var);
        addTextChangedListener(a2Var);
    }

    public /* synthetic */ MaskedTextInputEditText(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, R$attr.editTextStyle);
    }
}
