package ix0;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.Spannable;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import android.text.style.TextAppearanceSpan;
import android.text.style.UpdateAppearance;
import android.view.View;
import com.revolut.core.ui_kit.R$attr;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes20.dex */
public final class b0 extends MetricAffectingSpan implements UpdateAppearance {
    public static final /* synthetic */ int o = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f169211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f169212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f169213c;
    public final boolean d;
    public final Clause e;
    public final ty0.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Function0 f169214g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ValueAnimator f169215h;
    public float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a0 f169216j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f169217l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f169218m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f169219n;

    public b0(Context context, Integer num, boolean z, boolean z3, Clause clause, ty0.b underlineMode, Function0 onClick) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(underlineMode, "underlineMode");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.f169211a = context;
        this.f169212b = num;
        this.f169213c = z;
        this.d = z3;
        this.e = clause;
        this.f = underlineMode;
        this.f169214g = onClick;
        this.f169215h = new ValueAnimator();
        this.i = 1.0f;
        final int i = 0;
        this.f169217l = te0.w.y0(new Function0(this) { // from class: ix0.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b0 f169321b;

            {
                this.f169321b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean zR;
                switch (i) {
                    case 0:
                        zR = kli.a.r(R$attr.internal_forceBoldLinks, this.f169321b.f169211a);
                        break;
                    case 1:
                        zR = kli.a.r(R$attr.internal_forceUnderlineLinks, this.f169321b.f169211a);
                        break;
                    default:
                        b0 b0Var = this.f169321b;
                        int iY = kli.a.y(b0Var.f169211a, R$attr.internal_linkTypefaceStyle, 0);
                        if (iY != 0) {
                            return new TextAppearanceSpan(b0Var.f169211a, iY);
                        }
                        return null;
                }
                return Boolean.valueOf(zR);
            }
        });
        final int i2 = 1;
        this.f169218m = te0.w.y0(new Function0(this) { // from class: ix0.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b0 f169321b;

            {
                this.f169321b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean zR;
                switch (i2) {
                    case 0:
                        zR = kli.a.r(R$attr.internal_forceBoldLinks, this.f169321b.f169211a);
                        break;
                    case 1:
                        zR = kli.a.r(R$attr.internal_forceUnderlineLinks, this.f169321b.f169211a);
                        break;
                    default:
                        b0 b0Var = this.f169321b;
                        int iY = kli.a.y(b0Var.f169211a, R$attr.internal_linkTypefaceStyle, 0);
                        if (iY != 0) {
                            return new TextAppearanceSpan(b0Var.f169211a, iY);
                        }
                        return null;
                }
                return Boolean.valueOf(zR);
            }
        });
        final int i3 = 2;
        this.f169219n = te0.w.y0(new Function0(this) { // from class: ix0.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b0 f169321b;

            {
                this.f169321b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean zR;
                switch (i3) {
                    case 0:
                        zR = kli.a.r(R$attr.internal_forceBoldLinks, this.f169321b.f169211a);
                        break;
                    case 1:
                        zR = kli.a.r(R$attr.internal_forceUnderlineLinks, this.f169321b.f169211a);
                        break;
                    default:
                        b0 b0Var = this.f169321b;
                        int iY = kli.a.y(b0Var.f169211a, R$attr.internal_linkTypefaceStyle, 0);
                        if (iY != 0) {
                            return new TextAppearanceSpan(b0Var.f169211a, iY);
                        }
                        return null;
                }
                return Boolean.valueOf(zR);
            }
        });
    }

    public final void a(Spannable spannable) {
        int spanStart = spannable.getSpanStart(this);
        int spanEnd = spannable.getSpanEnd(this);
        if (spanStart == -1 || spanEnd == -1) {
            return;
        }
        spannable.setSpan(this, spanStart, spanEnd, spannable.getSpanFlags(this));
    }

    public final void b(int i, View view, CharSequence charSequence, boolean z) {
        ValueAnimator valueAnimator = this.f169215h;
        if (i == 0) {
            valueAnimator.cancel();
            this.i = 0.3f;
            if (z && (charSequence instanceof Spannable)) {
                a((Spannable) charSequence);
            }
            if (view != null) {
                view.postInvalidateOnAnimation();
                return;
            }
            return;
        }
        if (i != 1) {
            if (i == 3) {
                valueAnimator.cancel();
                a0 a0Var = this.f169216j;
                if (a0Var != null) {
                    a0Var.cancel();
                }
                this.f169216j = null;
                this.i = 1.0f;
                if (z && (charSequence instanceof Spannable)) {
                    a((Spannable) charSequence);
                }
                if (view != null) {
                    view.postInvalidateOnAnimation();
                    return;
                }
            }
            return;
        }
        float f = this.i;
        Function0 function0 = this.f169214g;
        if (f == 1.0f) {
            valueAnimator.cancel();
            a0 a0Var2 = this.f169216j;
            if (a0Var2 != null) {
                a0Var2.cancel();
            }
            this.f169216j = null;
            function0.invoke();
            return;
        }
        valueAnimator.setFloatValues(f, 1.0f);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.f186409a = view;
        a0 a0Var3 = this.f169216j;
        if (a0Var3 != null) {
            a0Var3.cancel();
        }
        a0 a0Var4 = new a0(valueAnimator, ref$ObjectRef, this, z, charSequence, ref$ObjectRef);
        valueAnimator.addListener(a0Var4);
        valueAnimator.addUpdateListener(a0Var4);
        this.f169216j = a0Var4;
        valueAnimator.start();
        function0.invoke();
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj2;
        return Intrinsics.f(this.f169211a, b0Var.f169211a) && Intrinsics.f(this.f169212b, b0Var.f169212b) && this.f169213c == b0Var.f169213c && this.d == b0Var.d && Intrinsics.f(this.e, b0Var.e) && this.f == b0Var.f && Intrinsics.f(this.f169214g, b0Var.f169214g);
    }

    public final int hashCode() {
        int iHashCode = this.f169211a.hashCode() * 31;
        Integer num = this.f169212b;
        int iC = j6.a.c(j6.a.c((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.f169213c), 31, this.d);
        Clause clause = this.e;
        return this.f169214g.hashCode() + ((this.f.hashCode() + ((iC + (clause != null ? clause.hashCode() : 0)) * 31)) * 31);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0087  */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.text.style.CharacterStyle
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void updateDrawState(android.text.TextPaint r5) {
        /*
            r4 = this;
            java.lang.String r0 = "ds"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.Object r0 = r4.f169219n
            java.lang.Object r0 = r0.getValue()
            android.text.style.TextAppearanceSpan r0 = (android.text.style.TextAppearanceSpan) r0
            if (r0 == 0) goto L12
            r0.updateDrawState(r5)
        L12:
            int r0 = com.revolut.core.ui_kit_resources.R$attr.uikit_colorTransparent
            java.lang.Integer r1 = r4.f169212b
            if (r1 != 0) goto L19
            goto L1f
        L19:
            int r2 = r1.intValue()
            if (r2 == r0) goto L39
        L1f:
            int r0 = r4.k
            if (r0 != 0) goto L34
            if (r1 == 0) goto L2a
            int r0 = r1.intValue()
            goto L2c
        L2a:
            int r0 = com.revolut.core.ui_kit.R$attr.uikit_colorLink
        L2c:
            android.content.Context r1 = r4.f169211a
            int r0 = kli.a.s(r0, r1)
            r4.k = r0
        L34:
            int r0 = r4.k
            r5.setColor(r0)
        L39:
            r0 = 1132396544(0x437f0000, float:255.0)
            float r1 = r4.i
            float r1 = r1 * r0
            int r0 = (int) r1
            r5.setAlpha(r0)
            int[] r0 = ix0.z.f169324a
            ty0.b r1 = r4.f
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L5e
            r3 = 2
            if (r0 == r3) goto L56
            r3 = 3
            if (r0 != r3) goto L58
        L56:
            r0 = r2
            goto L72
        L58:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L5e:
            boolean r0 = r4.f169213c
            if (r0 != 0) goto L56
            java.lang.Object r0 = r4.f169218m
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L71
            goto L56
        L71:
            r0 = r1
        L72:
            r5.setUnderlineText(r0)
            boolean r0 = r4.d
            if (r0 != 0) goto L87
            java.lang.Object r0 = r4.f169217l
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L88
        L87:
            r1 = r2
        L88:
            r5.setFakeBoldText(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ix0.b0.updateDrawState(android.text.TextPaint):void");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint tp2) {
        Intrinsics.checkNotNullParameter(tp2, "tp");
        TextAppearanceSpan textAppearanceSpan = (TextAppearanceSpan) this.f169219n.getValue();
        if (textAppearanceSpan != null) {
            textAppearanceSpan.updateMeasureState(tp2);
        }
    }
}
