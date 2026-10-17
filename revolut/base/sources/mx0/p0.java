package mx0;

import android.animation.ValueAnimator;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.Editable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.keyboard.api.style.UIKitKeyboardStyle;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class p0 extends View implements yz0.a, rv0.a {

    @NotNull
    public static final a Companion = new a();
    public final PathInterpolator A;
    public final LinearInterpolator B;
    public final kt0.d C;
    public long D;
    public final CopyOnWriteArrayList E;
    public View.OnFocusChangeListener F;
    public final Rect G;
    public final Rect H;
    public ActionMode I;
    public u0 J;
    public final i0 K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f209898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r0 f209899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o0 f209900c;
    public Function0 d;
    public Function0 e;
    public final ix0.k f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ix0.a f209901g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public FrameLayout f209902h;
    public FrameLayout i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public j0 f209903j;
    public j0 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Boolean f209904l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Boolean f209905m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f209906n;
    public float o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f209907p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f209908q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f209909r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f209910s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final maa.r f209911t;
    public final TextPaint u;
    public final Paint v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final float f209912w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ValueAnimator f209913x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f209914y;
    public float z;

    public static final class a {
        private a() {
        }
    }

    public static final class b implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj2, Object obj3) {
            return cim.b.b(Float.valueOf(((s0) obj2).d), Float.valueOf(((s0) obj3).d));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public p0(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ClipboardManager getClipboardManager() {
        Object systemService = getContext().getSystemService("clipboard");
        Intrinsics.i(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        return (ClipboardManager) systemService;
    }

    private final rv0.k getKeyboardManagerCore() {
        rv0.j jVarA = kli.c.a(this);
        if (jVarA instanceof rv0.k) {
            return (rv0.k) jVarA;
        }
        return null;
    }

    private static /* synthetic */ void getKeyboardManagerCore$annotations() {
    }

    public static /* synthetic */ void getSuffixClickBounds$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getTextForCopy() {
        StringBuilder sb6 = new StringBuilder();
        Iterable iterable = (Iterable) this.f209898a;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : iterable) {
            if (((s0) obj2).f == 7) {
                arrayList.add(obj2);
            }
        }
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        if (arrayList == null) {
            Iterable iterable2 = (Iterable) this.f209898a;
            arrayList = new ArrayList();
            for (Object obj3 : iterable2) {
                if (((s0) obj3).f == 2) {
                    arrayList.add(obj3);
                }
            }
        }
        List listP0 = zhm.d0.P0(arrayList, new b());
        int size = listP0.size();
        for (int i = 0; i < size; i++) {
            sb6.append(((s0) listP0.get(i)).f209981a);
        }
        String string = sb6.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ void n(p0 p0Var) {
        p0Var.m(m0.ANIMATED);
    }

    @Override // yz0.a
    public final void a(View.OnFocusChangeListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.E.add(listener);
    }

    @Override // yz0.a
    public final void b(View.OnFocusChangeListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.E.remove(listener);
    }

    @Override // rv0.a
    public final void c() {
        this.f209899b.d();
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.K.dispatchHoverEvent(event)) {
            return true;
        }
        return super.dispatchHoverEvent(event);
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent != null && keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66) {
            View viewFocusSearch = focusSearch(130);
            if (viewFocusSearch == null) {
                return true;
            }
            viewFocusSearch.requestFocus();
            return true;
        }
        r0 r0Var = this.f209899b;
        Editable text = r0Var.getText();
        if (text != null) {
            r0Var.setSelection(text.length());
        }
        return r0Var.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final void f(boolean z) {
        k0 k0Var;
        ?? r06 = this.f209898a;
        int size = r06.size();
        float f = BitmapDescriptorFactory.HUE_RED;
        for (int i = 0; i < size; i++) {
            s0 s0Var = (s0) r06.get(i);
            float f4 = s0Var.d + s0Var.e;
            if (f4 > f && ((k0Var = s0Var.f209982b) == k0.NONE || k0Var == k0.ADD)) {
                f = f4;
            }
        }
        float f5 = this.o;
        TextPaint textPaint = this.u;
        textPaint.setTextSize(f5);
        float f6 = this.o * 1.4137931f;
        float measuredHeight = ((f6 * 0.5f) + (((getMeasuredHeight() / 2.0f) - (textPaint.ascent() / 2.0f)) - (0.77710843f * f6))) - (getAmountInputEndView().getMeasuredHeight() * 0.5f);
        if (!z) {
            getAmountInputEndView().animate().translationX(f).translationY(measuredHeight).setDuration(300L).setInterpolator(new AccelerateDecelerateInterpolator()).start();
            return;
        }
        getAmountInputEndView().animate().cancel();
        getAmountInputEndView().setTranslationX(f);
        getAmountInputEndView().setTranslationY(measuredHeight);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final void g(boolean z) {
        k0 k0Var;
        float f = this.o;
        TextPaint textPaint = this.u;
        textPaint.setTextSize(f);
        ?? r06 = this.f209898a;
        int size = r06.size();
        float f4 = 0.0f;
        for (int i = 0; i < size; i++) {
            s0 s0Var = (s0) r06.get(i);
            float f5 = s0Var.d;
            if ((f5 < f4 || f4 == BitmapDescriptorFactory.HUE_RED) && ((k0Var = s0Var.f209982b) == k0.NONE || k0Var == k0.ADD)) {
                f4 = f5;
            }
        }
        float measuredWidth = f4 - getAmountInputStartView().getMeasuredWidth();
        float f6 = this.o * 1.4137931f;
        float measuredHeight = ((f6 * 0.5f) + (((getMeasuredHeight() / 2.0f) - (textPaint.ascent() / 2.0f)) - (0.77710843f * f6))) - (getAmountInputStartView().getMeasuredHeight() * 0.5f);
        if (!z) {
            getAmountInputStartView().animate().translationX(measuredWidth).translationY(measuredHeight).setDuration(300L).setInterpolator(new AccelerateDecelerateInterpolator()).start();
            return;
        }
        getAmountInputStartView().animate().cancel();
        getAmountInputStartView().setTranslationX(measuredWidth);
        getAmountInputStartView().setTranslationY(measuredHeight);
    }

    @NotNull
    public final FrameLayout getAmountInputEndView() {
        FrameLayout frameLayout = this.f209902h;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.r("amountInputEndView");
        throw null;
    }

    @NotNull
    public final FrameLayout getAmountInputStartView() {
        FrameLayout frameLayout = this.i;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.r("amountInputStartView");
        throw null;
    }

    @NotNull
    public final o0 getArithmeticDelegateCallback() {
        return this.f209900c;
    }

    @Override // yz0.a
    public int getInputType() {
        return 532482;
    }

    @NotNull
    public final r0 getMainEditText$ui_kit_components_release() {
        return this.f209899b;
    }

    public final Function0<Unit> getOnPrefixClickListener$ui_kit_components_release() {
        return this.d;
    }

    public final Function0<Unit> getOnSuffixClickListener$ui_kit_components_release() {
        return this.e;
    }

    @NotNull
    public final Rect getSuffixClickBounds() {
        return this.H;
    }

    public final void h(int i) {
        r0 r0Var = this.f209899b;
        jb3.l.e(r0Var, i);
        r0Var.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        this.f209910s = r0Var.getMeasuredHeight();
        float textSize = r0Var.getTextSize();
        this.f209906n = textSize;
        this.o = textSize;
        this.f209907p = textSize;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.f209901g = new ix0.a(kli.a.B(context, 12.0f), (int) this.o, this.u);
        requestLayout();
    }

    public final void i(ArrayList arrayList, int i, Rect rect) {
        int size = arrayList.size();
        float f = BitmapDescriptorFactory.HUE_RED;
        float f4 = Float.MIN_VALUE;
        float f5 = Float.MIN_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            s0 s0Var = (s0) arrayList.get(i2);
            if (s0Var.f == i) {
                if (f4 == Float.MIN_VALUE || f4 > s0Var.d) {
                    f4 = s0Var.d;
                }
                if (f5 == Float.MIN_VALUE || f5 < s0Var.d + s0Var.e) {
                    f5 = s0Var.e + s0Var.d;
                }
                f = s0Var.e;
            }
        }
        if (f4 == Float.MIN_VALUE) {
            rect.setEmpty();
            return;
        }
        float f6 = this.o;
        TextPaint textPaint = this.u;
        textPaint.setTextSize(f6);
        float measuredHeight = (getMeasuredHeight() / 2.0f) - (textPaint.ascent() / 2.0f);
        rect.set(rim.d.c(f4), rim.d.c(measuredHeight - this.o), rim.d.c(f5), rim.d.c(measuredHeight));
        int iC = rim.d.c(f / 4);
        rect.set(rect.left - iC, rect.top, rect.right + iC, rect.bottom + rim.d.b(((double) this.o) * 0.2d));
    }

    public final void j(ArrayList arrayList) {
        Iterator it8 = arrayList.iterator();
        double d = 0.0d;
        while (it8.hasNext()) {
            d += (double) ((s0) it8.next()).e;
        }
        float measuredWidth = (getMeasuredWidth() - ((float) d)) / 2;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            s0 s0Var = (s0) arrayList.get(i);
            s0Var.d = measuredWidth;
            s0Var.f209983c = measuredWidth;
            measuredWidth += s0Var.e;
        }
    }

    public final void k(boolean z) {
        if (Intrinsics.f(this.f209904l, Boolean.valueOf(z))) {
            return;
        }
        this.f209904l = Boolean.valueOf(z);
        if (z) {
            FrameLayout amountInputEndView = getAmountInputEndView();
            if (!amountInputEndView.isLaidOut() || amountInputEndView.isLayoutRequested()) {
                amountInputEndView.addOnLayoutChangeListener(new x0(this, 0));
            } else {
                f(true);
            }
        }
    }

    public final void l(boolean z) {
        if (Intrinsics.f(this.f209905m, Boolean.valueOf(z))) {
            return;
        }
        this.f209905m = Boolean.valueOf(z);
        if (z) {
            FrameLayout amountInputStartView = getAmountInputStartView();
            if (!amountInputStartView.isLaidOut() || amountInputStartView.isLayoutRequested()) {
                amountInputStartView.addOnLayoutChangeListener(new x0(this, 1));
            } else {
                g(true);
            }
        }
    }

    public final void m(m0 animationMode) {
        int length;
        int i;
        o0 o0Var = this.f209900c;
        int i2 = o0Var.f209872l;
        p0 p0Var = o0Var.f209878s;
        ix0.b bVar = o0Var.f209877r;
        Intrinsics.checkNotNullParameter(animationMode, "animationMode");
        ArrayList arrayList = new ArrayList();
        if (o0Var.f209867b) {
            String str = o0Var.f209868c;
            int i3 = o0Var.d;
            bVar.getClass();
            ix0.b.a(str, i3, 1, arrayList);
        }
        Editable text = p0Var.getMainEditText$ui_kit_components_release().getText();
        if (text == null || text.length() == 0) {
            length = 0;
            CharSequence hint = p0Var.getMainEditText$ui_kit_components_release().getHint();
            int currentHintTextColor = p0Var.getMainEditText$ui_kit_components_release().getCurrentHintTextColor();
            bVar.getClass();
            i = 2;
            ix0.b.a(hint, currentHintTextColor, 2, arrayList);
        } else {
            int length2 = text.length();
            int i5 = 0;
            loop0: while (true) {
                if (i5 >= length2) {
                    i5 = -1;
                    break;
                }
                char cCharAt = text.charAt(i5);
                bw0.j.Companion.getClass();
                for (bw0.j jVar : bw0.j.cachedValues) {
                    if (jVar.b() == cCharAt) {
                        break loop0;
                    }
                }
                i5++;
            }
            if (i5 == -1) {
                int currentTextColor = p0Var.getMainEditText$ui_kit_components_release().getCurrentTextColor();
                bVar.getClass();
                i = 2;
                ix0.b.a(text, currentTextColor, 2, arrayList);
                length = 0;
            } else {
                length = 0;
                CharSequence charSequenceSubSequence = text.subSequence(0, i5);
                int currentTextColor2 = p0Var.getMainEditText$ui_kit_components_release().getCurrentTextColor();
                bVar.getClass();
                ix0.b.a(charSequenceSubSequence, currentTextColor2, 2, arrayList);
                int i6 = i5 + 1;
                ix0.b.a(text.subSequence(i5, i6), p0Var.getMainEditText$ui_kit_components_release().getCurrentTextColor(), 3, arrayList);
                ix0.b.a(text.subSequence(i6, text.length()), p0Var.getMainEditText$ui_kit_components_release().getCurrentTextColor(), 4, arrayList);
                i = 2;
            }
        }
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            length += ((t0) it8.next()).f210003a.length();
        }
        CharSequence charSequence = o0Var.f;
        int i21 = o0Var.f209869g;
        t0 t0Var = (t0) zhm.d0.o0(arrayList);
        if (t0Var != null) {
            i = t0Var.f210005c;
        }
        bVar.getClass();
        ix0.b.a(charSequence, i21, i, arrayList);
        if (o0Var.f209870h) {
            ix0.b.a(o0Var.i, i2, 5, arrayList);
            ix0.b.a(o0Var.f209871j, i2, 6, arrayList);
            ix0.b.a(o0Var.k, i2, 7, arrayList);
        }
        if (o0Var.f209874n) {
            ix0.b.a(o0Var.o, o0Var.f209875p, 8, arrayList);
        }
        j0 j0Var = new j0(arrayList, length, animationMode);
        if (Intrinsics.f(this.f209903j, j0Var)) {
            return;
        }
        this.f209903j = j0Var;
        maa.r rVar = this.f209911t;
        removeCallbacks(new a3l.c(7, rVar));
        post(new a3l.c(8, rVar));
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        return true;
    }

    @Override // android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        UIKitKeyboardStyle.Transparent transparent;
        if (editorInfo != null) {
            editorInfo.imeOptions |= 33554432;
            editorInfo.inputType = getInputType();
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            Bundle bundle = editorInfo.extras;
            r0 r0Var = this.f209899b;
            bundle.putBoolean("keyboard_suggestions_always_on_key", r0Var.getKeyboardSuggestionsAlwaysOn());
            Bundle bundle2 = editorInfo.extras;
            jo0.b customKeyboardStyle = r0Var.getCustomKeyboardStyle();
            if (Intrinsics.f(customKeyboardStyle, jo0.a.f176821a)) {
                transparent = UIKitKeyboardStyle.Transparent.f57722a;
            } else {
                if (customKeyboardStyle != null) {
                    throw new NoWhenBranchMatchedException();
                }
                transparent = null;
            }
            bundle2.putParcelable("custom_keyboard_style_key", transparent);
        }
        return new w0(this);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        rv0.k keyboardManagerCore = getKeyboardManagerCore();
        if (keyboardManagerCore != null) {
            ((sv0.c) keyboardManagerCore).m(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0179  */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v41 */
    /* JADX WARN: Type inference failed for: r7v43 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDraw(android.graphics.Canvas r25) {
        /*
            Method dump skipped, instruction units count: 507
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mx0.p0.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(this.f209910s, 1073741824));
    }

    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object, java.util.List] */
    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i5) {
        super.onSizeChanged(i, i2, i3, i5);
        if (i == i3 || i <= 0 || ((Collection) this.f209898a).isEmpty()) {
            return;
        }
        ?? r72 = this.f209898a;
        ArrayList arrayList = new ArrayList();
        int size = r72.size();
        for (int i6 = 0; i6 < size; i6++) {
            Object obj2 = r72.get(i6);
            if (((s0) obj2).f209982b != k0.REMOVE) {
                arrayList.add(obj2);
            }
        }
        s0 s0Var = (s0) zhm.d0.d0(arrayList);
        float f = s0Var != null ? s0Var.d : BitmapDescriptorFactory.HUE_RED;
        j(arrayList);
        if (s0Var != null) {
            float f4 = s0Var.d - f;
            ?? r92 = this.f209898a;
            int size2 = r92.size();
            for (int i21 = 0; i21 < size2; i21++) {
                s0 s0Var2 = (s0) r92.get(i21);
                if (s0Var2.f209982b == k0.REMOVE) {
                    s0Var2.f209983c += f4;
                    s0Var2.d += f4;
                }
            }
        }
        if (this.f209909r != Float.MIN_VALUE) {
            float f5 = i / 2.0f;
            s0 s0Var3 = (s0) zhm.d0.e0(this.k.f209766b - 1, arrayList);
            if (s0Var3 != null) {
                f5 = s0Var3.d + s0Var3.e;
            }
            this.f209908q = f5;
            this.f209909r = f5;
        }
        f(true);
        g(true);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        Function0 function0;
        Function0 function02;
        Intrinsics.checkNotNullParameter(event, "event");
        int action = event.getAction();
        Rect rect = this.G;
        Rect rect2 = this.H;
        if (action != 0) {
            if (action == 1) {
                int i = v0.f210036a[this.J.ordinal()];
                if (i == 1) {
                    ActionMode actionMode = this.I;
                    if (actionMode != null) {
                        actionMode.finish();
                    }
                    this.I = null;
                    this.J = u0.NONE;
                    return true;
                }
                if (i == 2) {
                    if (rect.contains((int) event.getX(), (int) event.getY()) && (function0 = this.d) != null) {
                        function0.invoke();
                    }
                    this.J = u0.NONE;
                    return true;
                }
                if (i == 3) {
                    if (rect2.contains((int) event.getX(), (int) event.getY()) && (function02 = this.e) != null) {
                        function02.invoke();
                    }
                    this.J = u0.NONE;
                    return true;
                }
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                if (isEnabled()) {
                    requestFocus();
                    kli.c.f(this);
                }
            }
        } else {
            if (this.I != null) {
                this.J = u0.FINISH_ACTION_MODE;
                return true;
            }
            if (rect.contains((int) event.getX(), (int) event.getY())) {
                this.J = u0.PREFIX_CLICK;
                return true;
            }
            if (rect2.contains((int) event.getX(), (int) event.getY())) {
                this.J = u0.SUFFIX_CLICK;
                return true;
            }
        }
        super.onTouchEvent(event);
        return true;
    }

    public final void setAmountInputEndView(@NotNull FrameLayout frameLayout) {
        Intrinsics.checkNotNullParameter(frameLayout, "<set-?>");
        this.f209902h = frameLayout;
    }

    public final void setAmountInputStartView(@NotNull FrameLayout frameLayout) {
        Intrinsics.checkNotNullParameter(frameLayout, "<set-?>");
        this.i = frameLayout;
    }

    public final void setCustomColors(bw0.a aVar) {
        int iS;
        int iS2;
        if (aVar != null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            iS = io0.a.c(context, aVar.f19174c);
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            iS2 = io0.a.c(context2, aVar.f19173b);
        } else {
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            iS = kli.a.s(R$attr.uikit_colorGreyTone50, context3);
            Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            iS2 = kli.a.s(R$attr.uikit_colorAccent, context4);
        }
        this.f209899b.setHintTextColor(iS);
        this.v.setColor(iS2);
        n(this);
        invalidate();
    }

    public final void setCustomFont(aw0.i3 i3Var) {
        if (Build.VERSION.SDK_INT >= 29) {
            g4i.a.j(this.f209899b).a(i3Var);
        }
    }

    public final void setCustomKeyboardStyle(jo0.b bVar) {
        this.f209899b.setCustomKeyboardStyle(bVar);
    }

    @Override // android.view.View
    @yhm.d
    public void setOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        View.OnFocusChangeListener onFocusChangeListener2 = this.F;
        if (onFocusChangeListener2 != null) {
            b(onFocusChangeListener2);
        }
        this.F = onFocusChangeListener;
        if (onFocusChangeListener != null) {
            a(onFocusChangeListener);
        }
    }

    public final void setOnPrefixClickListener$ui_kit_components_release(Function0<Unit> function0) {
        this.d = function0;
    }

    public final void setOnSuffixClickListener$ui_kit_components_release(Function0<Unit> function0) {
        this.e = function0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public p0(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        zhm.f0 f0Var = zhm.f0.f322471a;
        this.f209898a = f0Var;
        r0 r0Var = new r0(this, context);
        this.f209899b = r0Var;
        this.f = new ix0.k(new u80.d(jh.d.e(context)));
        this.k = new j0(f0Var, 0, m0.ANIMATED);
        this.f209908q = Float.MIN_VALUE;
        this.f209909r = Float.MIN_VALUE;
        this.f209911t = new maa.r(this, 24);
        Paint paint = new Paint(1);
        paint.setColor(kli.a.s(R$attr.uikit_colorAccent, context));
        this.v = paint;
        this.f209912w = kli.a.l(context, 2.0f);
        this.A = new PathInterpolator(0.25f, 0.1f, 0.25f, 1.0f);
        this.B = new LinearInterpolator();
        this.D = SystemClock.elapsedRealtime();
        fzl.e eVar = new fzl.e(this, 1);
        this.E = new CopyOnWriteArrayList();
        this.G = new Rect(0, 0, 0, 0);
        this.H = new Rect(0, 0, 0, 0);
        this.J = u0.NONE;
        i0 i0Var = new i0(this);
        this.K = i0Var;
        ViewCompat.setAccessibilityDelegate(this, i0Var);
        this.C = new kt0.d(this, 14);
        super.setOnFocusChangeListener(eVar);
        setFocusableInTouchMode(true);
        setOnLongClickListener(new et0.f0(this, 2));
        r0Var.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        TextPaint paint2 = r0Var.getPaint();
        Intrinsics.checkNotNullExpressionValue(paint2, "getPaint(...)");
        this.u = paint2;
        paint2.setColor(kli.a.s(R$attr.uikit_colorForeground, context));
        r0Var.setHintTextColor(kli.a.s(R$attr.uikit_colorGreyTone50, context));
        r0Var.setHint("0");
        r0Var.setPadding(0, 0, 0, 0);
        h(R$attr.internal_textAppearanceDisplay2);
        this.f209900c = new o0(this, context);
    }

    public /* synthetic */ p0(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
