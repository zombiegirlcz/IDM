package ns0;

import android.animation.TimeInterpolator;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.MaskFilter;
import android.text.TextPaint;
import android.text.style.ImageSpan;
import android.view.Choreographer;
import androidx.collection.MutableScatterMap;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ht0.b0;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class o implements b, Choreographer.FrameCallback {

    @NotNull
    private static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f218712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b0 f218713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f218714c;
    public final MutableScatterMap d;
    public final ArrayList e;
    public final MutableScatterMap f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f218715g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f218716h;
    public final BlurMaskFilter[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public h f218717j;
    public long k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f218718l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f218719m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f218720n;
    public float o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f218721p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public TimeInterpolator f218722q;

    public o(b0 onInvalidate, b0 onAnimationEnd) {
        Intrinsics.checkNotNullParameter(onInvalidate, "onInvalidate");
        Intrinsics.checkNotNullParameter(onAnimationEnd, "onAnimationEnd");
        this.f218712a = onInvalidate;
        this.f218713b = onAnimationEnd;
        this.f218714c = new ArrayList();
        this.d = new MutableScatterMap(0, 1, null);
        this.e = new ArrayList();
        this.f = new MutableScatterMap(0, 1, null);
        this.f218715g = new ArrayList();
        this.f218716h = new ArrayList();
        this.i = new BlurMaskFilter[13];
        this.f218717j = h.Increase;
        this.k = -1L;
        this.f218720n = true;
        this.o = Float.NaN;
        this.f218721p = 200L;
        this.f218722q = jq0.r.f177392a;
    }

    public static float r(long j2, long j3, long j5) {
        return kotlin.ranges.f.f((j2 - j3) / j5, BitmapDescriptorFactory.HUE_RED, 1.0f);
    }

    public static m u(char c2) {
        return (c2 == '+' || c2 == '-' || c2 == 8722) ? m.Sign : c2 == '%' ? m.Percentage : (c2 == '.' || c2 == ',' || c2 == 1643 || c2 == 1644) ? m.Separator : (Character.getType(c2) == 26 || Character.isLetter(c2)) ? m.Currency : m.Other;
    }

    public static m v(CharSequence charSequence) {
        return charSequence.length() == 0 ? m.Other : u(charSequence.charAt(0));
    }

    public static int w(float f, int i) {
        return kotlin.ranges.f.g(rim.d.c(i * f), 0, 255);
    }

    @Override // ns0.b
    public final long a() {
        return this.f218721p;
    }

    @Override // ns0.b
    public final void b(List nonDigits) {
        Intrinsics.checkNotNullParameter(nonDigits, "nonDigits");
        ArrayList arrayList = this.e;
        arrayList.clear();
        arrayList.addAll(nonDigits);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ns0.b
    public final void c(Canvas canvas, r nonDigit, TextPaint paint, float f, float f4) {
        fs0.b bVar = nonDigit.e;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(nonDigit, "nonDigit");
        Intrinsics.checkNotNullParameter(paint, "paint");
        k kVar = (k) this.f.get(nonDigit);
        if (kVar == null || !kVar.e) {
            q.a(canvas, bVar, nonDigit.d, nonDigit.f218724a, f, paint);
            return;
        }
        if (kVar.f218705c == l.Move) {
            q.a(canvas, bVar, nonDigit.d, kVar.f218704b, f, paint);
            return;
        }
        int alpha = paint.getAlpha();
        MaskFilter maskFilter = paint.getMaskFilter();
        paint.setMaskFilter(q(paint.getTextSize(), kVar.f218709l));
        paint.setAlpha(w(kVar.f218707h, alpha));
        float f5 = f + (kVar.f * f4);
        ImageSpan imageSpan = nonDigit.d;
        float f6 = kVar.f218704b;
        float f32 = (nonDigit.f218725b / 2.0f) + f6;
        float fDescent = ((paint.descent() + paint.ascent()) / 2.0f) + f5;
        float f35 = kVar.f218708j;
        canvas.save();
        canvas.scale(f35, f35, f32, fDescent);
        q.a(canvas, bVar, imageSpan, f6, f5, paint);
        canvas.restore();
        paint.setAlpha(alpha);
        paint.setMaskFilter(maskFilter);
    }

    @Override // ns0.b
    public final void cancel() {
        this.f218718l = false;
        Choreographer choreographer = Choreographer.getInstance();
        Intrinsics.checkNotNullExpressionValue(choreographer, "getInstance(...)");
        choreographer.removeFrameCallback(this);
        x(true);
        this.f218719m = false;
    }

    @Override // ns0.b
    public final void d(long j2) {
        this.f218721p = j2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0108 A[PHI: r2 r3 r10 r12 r25 r26
      0x0108: PHI (r2v12 float) = (r2v9 float), (r2v13 float) binds: [B:56:0x011c, B:49:0x0106] A[DONT_GENERATE, DONT_INLINE]
      0x0108: PHI (r3v44 float) = (r3v41 float), (r3v52 float) binds: [B:56:0x011c, B:49:0x0106] A[DONT_GENERATE, DONT_INLINE]
      0x0108: PHI (r10v39 long) = (r10v36 long), (r10v40 long) binds: [B:56:0x011c, B:49:0x0106] A[DONT_GENERATE, DONT_INLINE]
      0x0108: PHI (r12v13 int) = (r12v10 int), (r12v16 int) binds: [B:56:0x011c, B:49:0x0106] A[DONT_GENERATE, DONT_INLINE]
      0x0108: PHI (r25v5 java.util.ArrayList) = (r25v2 java.util.ArrayList), (r25v6 java.util.ArrayList) binds: [B:56:0x011c, B:49:0x0106] A[DONT_GENERATE, DONT_INLINE]
      0x0108: PHI (r26v6 int) = (r26v3 int), (r26v7 int) binds: [B:56:0x011c, B:49:0x0106] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010a A[PHI: r2 r3 r10 r12 r25 r26
      0x010a: PHI (r2v10 float) = (r2v9 float), (r2v9 float), (r2v13 float), (r2v13 float) binds: [B:54:0x0118, B:56:0x011c, B:47:0x0102, B:49:0x0106] A[DONT_GENERATE, DONT_INLINE]
      0x010a: PHI (r3v42 float) = (r3v41 float), (r3v41 float), (r3v52 float), (r3v52 float) binds: [B:54:0x0118, B:56:0x011c, B:47:0x0102, B:49:0x0106] A[DONT_GENERATE, DONT_INLINE]
      0x010a: PHI (r10v37 long) = (r10v36 long), (r10v36 long), (r10v40 long), (r10v40 long) binds: [B:54:0x0118, B:56:0x011c, B:47:0x0102, B:49:0x0106] A[DONT_GENERATE, DONT_INLINE]
      0x010a: PHI (r12v11 int) = (r12v10 int), (r12v10 int), (r12v16 int), (r12v16 int) binds: [B:54:0x0118, B:56:0x011c, B:47:0x0102, B:49:0x0106] A[DONT_GENERATE, DONT_INLINE]
      0x010a: PHI (r25v3 java.util.ArrayList) = (r25v2 java.util.ArrayList), (r25v2 java.util.ArrayList), (r25v6 java.util.ArrayList), (r25v6 java.util.ArrayList) binds: [B:54:0x0118, B:56:0x011c, B:47:0x0102, B:49:0x0106] A[DONT_GENERATE, DONT_INLINE]
      0x010a: PHI (r26v4 int) = (r26v3 int), (r26v3 int), (r26v7 int), (r26v7 int) binds: [B:54:0x0118, B:56:0x011c, B:47:0x0102, B:49:0x0106] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.Choreographer.FrameCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void doFrame(long r37) {
        /*
            Method dump skipped, instruction units count: 918
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ns0.o.doFrame(long):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ns0.b
    public final void e(Canvas canvas, g digit, TextPaint paint, float f, float f4, float f5) {
        float f6;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(digit, "digit");
        Intrinsics.checkNotNullParameter(paint, "paint");
        j jVar = (j) this.d.get(digit);
        String[] strArr = a.f218677b;
        if (jVar == null || !jVar.f218697g) {
            b.Companion.getClass();
            canvas.drawText(strArr[digit.f], jVar != null ? jVar.f218695b : digit.f218688a, f, paint);
            return;
        }
        int color = paint.getColor();
        int alpha = paint.getAlpha();
        MaskFilter maskFilter = paint.getMaskFilter();
        float fDescent = (paint.descent() + paint.ascent()) / 2.0f;
        paint.setMaskFilter(q(paint.getTextSize(), jVar.o));
        if (jVar.f218696c >= 0) {
            if (jVar.f218698h) {
                paint.setColor(digit.f218691g);
            }
            paint.setAlpha(w(jVar.f218700l, alpha));
            float f32 = (jVar.f218699j * f4) + f;
            b.Companion.getClass();
            String str = strArr[jVar.f218696c];
            float f35 = jVar.f218695b;
            f6 = 2.0f;
            float f36 = jVar.f218702n;
            canvas.save();
            canvas.scale(f36, f36, (digit.f218689b / 2.0f) + f35, f32 + fDescent);
            canvas.drawText(str, f35, f32, paint);
            canvas.restore();
        } else {
            f6 = 2.0f;
        }
        if (jVar.f218698h) {
            paint.setColor(digit.f218692h);
        }
        paint.setAlpha(w(jVar.k, alpha));
        float f37 = (jVar.i * f4) + f;
        b.Companion.getClass();
        String str2 = strArr[digit.f];
        float f41 = jVar.f218695b;
        float f42 = jVar.f218701m;
        canvas.save();
        canvas.scale(f42, f42, (digit.f218689b / f6) + f41, fDescent + f37);
        canvas.drawText(str2, f41, f37, paint);
        canvas.restore();
        paint.setColor(color);
        paint.setAlpha(alpha);
        paint.setMaskFilter(maskFilter);
    }

    @Override // ns0.b
    public final boolean f(g digit) {
        Intrinsics.checkNotNullParameter(digit, "digit");
        if (this.f218718l || !this.f218720n) {
            return false;
        }
        this.f218715g.add(digit);
        j jVarS = s(digit);
        float f = digit.f218688a;
        jVarS.f218694a = f;
        jVarS.f218695b = f;
        jVarS.f218696c = digit.f;
        jVarS.d = false;
        jVarS.e = false;
        jVarS.f218697g = true;
        jVarS.f218699j = BitmapDescriptorFactory.HUE_RED;
        jVarS.f218700l = 1.0f;
        jVarS.f218702n = 1.0f;
        jVarS.o = BitmapDescriptorFactory.HUE_RED;
        return true;
    }

    @Override // ns0.b
    public final boolean g(r previous, char c2) {
        Intrinsics.checkNotNullParameter(previous, "previous");
        fs0.b bVar = previous.e;
        m mVarV = v(bVar);
        m mVarU = u(c2);
        if (mVarV == mVarU) {
            int i = n.f218710a[mVarU.ordinal()];
            if (i != 1 && i != 2 && i != 3) {
                if (i != 4 && i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                if (bVar.length() != 1 || bVar.charAt(0) != c2) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // ns0.b
    public final TimeInterpolator h() {
        return this.f218722q;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ns0.b
    public final void i(Canvas canvas, TextPaint paint, float f, float f4) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(paint, "paint");
        int color = paint.getColor();
        int alpha = paint.getAlpha();
        MaskFilter maskFilter = paint.getMaskFilter();
        ArrayList arrayList = this.f218715g;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            g gVar = (g) arrayList.get(i);
            j jVar = (j) this.d.get(gVar);
            if (jVar != null) {
                paint.setColor(gVar.f218691g);
                paint.setAlpha(w(jVar.f218700l, alpha));
                paint.setMaskFilter(q(paint.getTextSize(), jVar.o));
                float f5 = (jVar.f218699j * f4) + f;
                b.Companion.getClass();
                String str = a.f218677b[jVar.f218696c];
                float f6 = jVar.f218695b;
                float f32 = (gVar.f218689b / 2.0f) + f6;
                float fDescent = ((paint.descent() + paint.ascent()) / 2.0f) + f5;
                float f35 = jVar.f218702n;
                canvas.save();
                canvas.scale(f35, f35, f32, fDescent);
                canvas.drawText(str, f6, f5, paint);
                canvas.restore();
            }
        }
        paint.setColor(color);
        paint.setAlpha(alpha);
        paint.setMaskFilter(maskFilter);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x004b  */
    @Override // ns0.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean j(ns0.g r7, int r8, int r9, float r10, float r11, boolean r12, boolean r13) {
        /*
            r6 = this;
            java.lang.String r0 = "digit"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            ns0.j r0 = r6.s(r7)
            boolean r1 = r6.f218718l
            r2 = 0
            if (r1 == 0) goto Lf
            return r2
        Lf:
            boolean r1 = r0.d
            r3 = 1
            if (r1 == 0) goto L15
            return r3
        L15:
            if (r12 == 0) goto L19
            r1 = r11
            goto L1a
        L19:
            r1 = r10
        L1a:
            r0.f218694a = r1
            r0.f218695b = r1
            if (r12 != 0) goto L29
            boolean r1 = r6.f218720n
            if (r1 == 0) goto L29
            if (r13 == 0) goto L27
            goto L29
        L27:
            r1 = r8
            goto L2a
        L29:
            r1 = -1
        L2a:
            r0.f218696c = r1
            if (r12 != 0) goto L38
            boolean r1 = r6.f218720n
            if (r1 == 0) goto L38
            if (r13 != 0) goto L36
            if (r8 == r9) goto L38
        L36:
            r1 = r3
            goto L39
        L38:
            r1 = r2
        L39:
            r0.e = r1
            boolean r4 = r6.f218720n
            if (r4 == 0) goto L4f
            if (r1 == 0) goto L4d
            int r4 = r7.f218691g
            int r5 = r7.f218693j
            if (r4 != r5) goto L4b
            int r7 = r7.i
            if (r7 == r5) goto L4d
        L4b:
            r7 = r3
            goto L5a
        L4d:
            r7 = r2
            goto L5a
        L4f:
            int r4 = r7.f218691g
            int r5 = r7.f218693j
            if (r4 != r5) goto L4b
            int r7 = r7.i
            if (r7 == r5) goto L4d
            goto L4b
        L5a:
            r0.f = r7
            if (r1 != 0) goto L67
            if (r7 != 0) goto L67
            if (r12 != 0) goto L68
            int r7 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r7 != 0) goto L67
            goto L68
        L67:
            r2 = r3
        L68:
            r0.d = r2
            boolean r7 = r6.f218719m
            if (r7 != 0) goto L7d
            if (r13 != 0) goto L7d
            if (r8 == r9) goto L7d
            if (r9 <= r8) goto L77
            ns0.h r7 = ns0.h.Increase
            goto L79
        L77:
            ns0.h r7 = ns0.h.Decrease
        L79:
            r6.f218717j = r7
            r6.f218719m = r3
        L7d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ns0.o.j(ns0.g, int, int, float, float, boolean, boolean):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ns0.b
    public final void k(Canvas canvas, TextPaint paint, float f, float f4) {
        Canvas canvas2 = canvas;
        Intrinsics.checkNotNullParameter(canvas2, "canvas");
        Intrinsics.checkNotNullParameter(paint, "paint");
        int color = paint.getColor();
        int alpha = paint.getAlpha();
        MaskFilter maskFilter = paint.getMaskFilter();
        ArrayList arrayList = this.f218716h;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            r rVar = (r) arrayList.get(i);
            k kVar = (k) this.f.get(rVar);
            if (kVar != null) {
                paint.setColor(rVar.f218726c);
                paint.setMaskFilter(q(paint.getTextSize(), kVar.f218709l));
                paint.setAlpha(w(kVar.i, alpha));
                float f5 = (kVar.f218706g * f4) + f;
                fs0.b bVar = rVar.e;
                ImageSpan imageSpan = rVar.d;
                float f6 = kVar.f218704b;
                float f32 = (rVar.f218725b / 2.0f) + f6;
                float fDescent = ((paint.descent() + paint.ascent()) / 2.0f) + f5;
                float f35 = kVar.k;
                canvas2.save();
                canvas2.scale(f35, f35, f32, fDescent);
                q.a(canvas2, bVar, imageSpan, f6, f5, paint);
                canvas.restore();
            }
            i++;
            canvas2 = canvas;
        }
        paint.setColor(color);
        paint.setAlpha(alpha);
        paint.setMaskFilter(maskFilter);
    }

    @Override // ns0.b
    public final void l(TimeInterpolator timeInterpolator) {
        Intrinsics.checkNotNullParameter(timeInterpolator, "<set-?>");
        this.f218722q = timeInterpolator;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    @Override // ns0.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(com.revolut.core.ui_kit.models.Clause r3, com.revolut.core.ui_kit.models.Clause r4, int r5, int r6, boolean r7) {
        /*
            r2 = this;
            r2.f218720n = r7
            r7 = 0
            if (r6 <= r5) goto L8
            ns0.h r5 = ns0.h.Increase
            goto Le
        L8:
            if (r6 >= r5) goto Ld
            ns0.h r5 = ns0.h.Decrease
            goto Le
        Ld:
            r5 = r7
        Le:
            boolean r6 = r3 instanceof com.revolut.core.ui_kit.models.MoneyClause
            if (r6 == 0) goto L27
            boolean r6 = r4 instanceof com.revolut.core.ui_kit.models.MoneyClause
            if (r6 == 0) goto L27
            com.revolut.core.ui_kit.models.MoneyClause r4 = (com.revolut.core.ui_kit.models.MoneyClause) r4
            dj0.d r4 = r4.f57821a
            long r0 = r4.f115082a
            com.revolut.core.ui_kit.models.MoneyClause r3 = (com.revolut.core.ui_kit.models.MoneyClause) r3
            dj0.d r3 = r3.f57821a
            long r3 = r3.f115082a
            int r3 = kotlin.jvm.internal.Intrinsics.l(r0, r3)
            goto L3b
        L27:
            boolean r6 = r3 instanceof com.revolut.core.ui_kit.models.RateClause
            if (r6 == 0) goto L44
            boolean r6 = r4 instanceof com.revolut.core.ui_kit.models.RateClause
            if (r6 == 0) goto L44
            com.revolut.core.ui_kit.models.RateClause r4 = (com.revolut.core.ui_kit.models.RateClause) r4
            java.math.BigDecimal r4 = r4.f57927a
            com.revolut.core.ui_kit.models.RateClause r3 = (com.revolut.core.ui_kit.models.RateClause) r3
            java.math.BigDecimal r3 = r3.f57927a
            int r3 = r4.compareTo(r3)
        L3b:
            if (r3 <= 0) goto L40
            ns0.h r7 = ns0.h.Increase
            goto L44
        L40:
            if (r3 >= 0) goto L44
            ns0.h r7 = ns0.h.Decrease
        L44:
            if (r7 != 0) goto L47
            goto L48
        L47:
            r5 = r7
        L48:
            if (r5 == 0) goto L4f
            r2.f218717j = r5
            r3 = 1
            r2.f218719m = r3
        L4f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ns0.o.m(com.revolut.core.ui_kit.models.Clause, com.revolut.core.ui_kit.models.Clause, int, int, boolean):void");
    }

    @Override // ns0.b
    public final void n(List digits) {
        Intrinsics.checkNotNullParameter(digits, "digits");
        ArrayList arrayList = this.f218714c;
        arrayList.clear();
        arrayList.addAll(digits);
    }

    @Override // ns0.b
    public final boolean o(r nonDigit) {
        fs0.b bVar = nonDigit.e;
        Intrinsics.checkNotNullParameter(nonDigit, "nonDigit");
        if (this.f218718l || !this.f218720n || !v(bVar).b()) {
            return false;
        }
        ArrayList arrayList = this.f218716h;
        if (!arrayList.contains(nonDigit)) {
            arrayList.add(nonDigit);
            k kVarT = t(nonDigit);
            float f = nonDigit.f218724a;
            kVarT.f218703a = f;
            kVarT.f218704b = f;
            l lVar = v(bVar).c() ? l.RollOut : l.FadeOut;
            Intrinsics.checkNotNullParameter(lVar, "<set-?>");
            kVarT.f218705c = lVar;
            kVarT.d = false;
            kVarT.e = true;
            kVarT.f = BitmapDescriptorFactory.HUE_RED;
            kVarT.f218706g = BitmapDescriptorFactory.HUE_RED;
            kVarT.f218707h = 1.0f;
            kVarT.i = 1.0f;
            kVarT.f218708j = 1.0f;
            kVarT.k = 1.0f;
            kVarT.f218709l = BitmapDescriptorFactory.HUE_RED;
        }
        return true;
    }

    @Override // ns0.b
    public final boolean p(r nonDigit, float f, float f4, boolean z, boolean z3) {
        fs0.b bVar = nonDigit.e;
        Intrinsics.checkNotNullParameter(nonDigit, "nonDigit");
        k kVarT = t(nonDigit);
        boolean z4 = false;
        if (this.f218718l) {
            return false;
        }
        if (kVarT.d) {
            return true;
        }
        float f5 = (z || !this.f218720n) ? f4 : f;
        kVarT.f218703a = f5;
        kVarT.f218704b = f5;
        l lVar = (!z && this.f218720n && z3) ? v(bVar).c() ? l.RollIn : v(bVar).a() ? l.FadeIn : l.Move : l.Move;
        Intrinsics.checkNotNullParameter(lVar, "<set-?>");
        kVarT.f218705c = lVar;
        if (this.f218720n && !z && (f != f4 || (z3 && v(bVar).a()))) {
            z4 = true;
        }
        kVarT.d = z4;
        return z4;
    }

    public final BlurMaskFilter q(float f, float f4) {
        float f5 = this.o;
        BlurMaskFilter[] blurMaskFilterArr = this.i;
        if (f5 != f) {
            this.o = f;
            zhm.p.p(blurMaskFilterArr, 0, blurMaskFilterArr.length, null);
        }
        float f6 = 12;
        int iC = rim.d.c(kotlin.ranges.f.f(f4, BitmapDescriptorFactory.HUE_RED, 1.0f) * f6);
        if (iC == 0) {
            return null;
        }
        BlurMaskFilter blurMaskFilter = blurMaskFilterArr[iC];
        if (blurMaskFilter != null) {
            return blurMaskFilter;
        }
        BlurMaskFilter blurMaskFilter2 = new BlurMaskFilter(((f * 0.11f) * iC) / f6, BlurMaskFilter.Blur.NORMAL);
        blurMaskFilterArr[iC] = blurMaskFilter2;
        return blurMaskFilter2;
    }

    public final j s(g gVar) {
        MutableScatterMap mutableScatterMap = this.d;
        Object jVar = mutableScatterMap.get(gVar);
        if (jVar == null) {
            jVar = new j(0);
            mutableScatterMap.set(gVar, jVar);
        }
        return (j) jVar;
    }

    @Override // ns0.b
    public final void start() {
        this.f218718l = false;
        Choreographer choreographer = Choreographer.getInstance();
        Intrinsics.checkNotNullExpressionValue(choreographer, "getInstance(...)");
        choreographer.removeFrameCallback(this);
        float fA = this.f218717j.a();
        boolean z = (this.f218715g.isEmpty() && this.f218716h.isEmpty()) ? false : true;
        ArrayList arrayList = this.f218714c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            j jVarS = s((g) arrayList.get(i));
            boolean z3 = jVarS.d;
            boolean z4 = jVarS.e;
            jVarS.f218697g = z4;
            jVarS.f218698h = jVarS.f;
            jVarS.d = false;
            jVarS.e = false;
            jVarS.f = false;
            jVarS.f218695b = jVarS.f218694a;
            if (z4) {
                jVarS.i = fA * 0.45f;
                jVarS.f218699j = BitmapDescriptorFactory.HUE_RED;
                jVarS.k = BitmapDescriptorFactory.HUE_RED;
                jVarS.f218700l = 1.0f;
                jVarS.f218701m = 0.3f;
                jVarS.f218702n = 1.0f;
                jVarS.o = BitmapDescriptorFactory.HUE_RED;
            }
            z = z || z3;
        }
        ArrayList arrayList2 = this.e;
        int size2 = arrayList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            k kVarT = t((r) arrayList2.get(i2));
            boolean z6 = kVarT.d;
            kVarT.e = z6;
            kVarT.d = false;
            kVarT.f218704b = kVarT.f218703a;
            if (z6) {
                kVarT.f = BitmapDescriptorFactory.HUE_RED;
                kVarT.f218706g = BitmapDescriptorFactory.HUE_RED;
                l lVar = kVarT.f218705c;
                lVar.getClass();
                kVarT.f218707h = (lVar == l.FadeIn || lVar == l.RollIn) ? 0.0f : 1.0f;
                kVarT.i = BitmapDescriptorFactory.HUE_RED;
                kVarT.f218708j = 1.0f;
                kVarT.k = 1.0f;
                kVarT.f218709l = BitmapDescriptorFactory.HUE_RED;
                l lVar2 = kVarT.f218705c;
                lVar2.getClass();
                if (lVar2 == l.RollIn || lVar2 == l.RollOut) {
                    kVarT.f = fA * 0.45f;
                    kVarT.f218708j = 0.3f;
                }
            }
            z = z || z6;
        }
        if (!z) {
            x(false);
            return;
        }
        this.f218718l = true;
        this.k = -1L;
        this.f218712a.invoke();
        Choreographer choreographer2 = Choreographer.getInstance();
        Intrinsics.checkNotNullExpressionValue(choreographer2, "getInstance(...)");
        choreographer2.postFrameCallback(this);
    }

    public final k t(r rVar) {
        MutableScatterMap mutableScatterMap = this.f;
        Object kVar = mutableScatterMap.get(rVar);
        if (kVar == null) {
            kVar = new k(0);
            mutableScatterMap.set(rVar, kVar);
        }
        return (k) kVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void x(boolean z) {
        MutableScatterMap mutableScatterMap;
        MutableScatterMap mutableScatterMap2;
        ArrayList arrayList = this.f218714c;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            mutableScatterMap = this.d;
            if (i >= size) {
                break;
            }
            g gVar = (g) arrayList.get(i);
            j jVar = (j) mutableScatterMap.get(gVar);
            if (jVar != null) {
                float f = gVar.f218688a;
                jVar.f218694a = f;
                jVar.f218695b = f;
                jVar.f218696c = gVar.f;
                jVar.d = false;
                jVar.e = false;
                jVar.f = false;
                jVar.f218697g = false;
                jVar.f218698h = false;
                jVar.i = BitmapDescriptorFactory.HUE_RED;
                jVar.f218699j = BitmapDescriptorFactory.HUE_RED;
                jVar.k = 1.0f;
                jVar.f218700l = BitmapDescriptorFactory.HUE_RED;
                jVar.f218701m = 1.0f;
                jVar.f218702n = 0.1f;
                jVar.o = BitmapDescriptorFactory.HUE_RED;
            }
            gVar.d = gVar.e;
            int i2 = gVar.f218693j;
            gVar.f218691g = i2;
            gVar.f218692h = i2;
            gVar.i = i2;
            i++;
        }
        ArrayList arrayList2 = this.f218715g;
        int size2 = arrayList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            mutableScatterMap.remove((g) arrayList2.get(i3));
        }
        arrayList2.clear();
        ArrayList arrayList3 = this.e;
        int size3 = arrayList3.size();
        int i5 = 0;
        while (true) {
            mutableScatterMap2 = this.f;
            if (i5 >= size3) {
                break;
            }
            r rVar = (r) arrayList3.get(i5);
            k kVar = (k) mutableScatterMap2.get(rVar);
            if (kVar != null) {
                float f4 = rVar.f218724a;
                kVar.f218703a = f4;
                kVar.f218704b = f4;
                kVar.d = false;
                kVar.e = false;
                kVar.f = BitmapDescriptorFactory.HUE_RED;
                kVar.f218706g = BitmapDescriptorFactory.HUE_RED;
                kVar.f218707h = 1.0f;
                kVar.i = BitmapDescriptorFactory.HUE_RED;
                kVar.f218708j = 1.0f;
                kVar.k = 1.0f;
                kVar.f218709l = BitmapDescriptorFactory.HUE_RED;
            }
            i5++;
        }
        ArrayList arrayList4 = this.f218716h;
        int size4 = arrayList4.size();
        for (int i6 = 0; i6 < size4; i6++) {
            mutableScatterMap2.remove((r) arrayList4.get(i6));
        }
        arrayList4.clear();
        if (z) {
            this.f218712a.invoke();
        }
    }
}
