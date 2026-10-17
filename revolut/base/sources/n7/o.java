package n7;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.collection.LongSparseArray;
import com.airbnb.lottie.LottieDrawable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import d7.f0;
import g7.r;
import g7.u;
import h30.q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import m7.a0;

/* JADX INFO: loaded from: classes16.dex */
public final class o extends b {
    public final StringBuilder D;
    public final StringBuilder E;
    public final StringBuilder F;
    public final StringBuilder G;
    public final RectF H;
    public final Matrix I;
    public final l J;
    public final l K;
    public final HashMap L;
    public final LongSparseArray M;
    public final ArrayList N;
    public final ArrayList O;
    public final r P;
    public final LottieDrawable Q;
    public final d7.j R;
    public final a0 S;
    public final g7.f T;
    public u U;
    public final g7.f V;
    public u W;
    public final g7.i X;
    public u Y;
    public final g7.i Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public u f212968a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final g7.f f212969b0;
    public u c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public u f212970d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final g7.f f212971e0;
    public final g7.f f0;
    public final g7.f g0;

    public o(LottieDrawable lottieDrawable, h hVar) {
        q qVar;
        q qVar2;
        l7.a aVar;
        q qVar3;
        l7.a aVar2;
        q qVar4;
        l7.a aVar3;
        a5h.g gVar;
        l7.a aVar4;
        a5h.g gVar2;
        l7.b bVar;
        a5h.g gVar3;
        l7.b bVar2;
        a5h.g gVar4;
        l7.a aVar5;
        a5h.g gVar5;
        l7.a aVar6;
        super(lottieDrawable, hVar);
        this.D = new StringBuilder(2);
        this.E = new StringBuilder(0);
        this.F = new StringBuilder(0);
        this.G = new StringBuilder(0);
        this.H = new RectF();
        this.I = new Matrix();
        l lVar = new l(1);
        lVar.setStyle(Paint.Style.FILL);
        this.J = lVar;
        l lVar2 = new l(1);
        lVar2.setStyle(Paint.Style.STROKE);
        this.K = lVar2;
        this.L = new HashMap();
        this.M = new LongSparseArray();
        this.N = new ArrayList();
        this.O = new ArrayList();
        this.S = a0.INDEX;
        this.Q = lottieDrawable;
        this.R = hVar.f212949b;
        r rVar = new r((List) hVar.f212958q.f22248b);
        this.P = rVar;
        rVar.a(this);
        b(rVar);
        cpi.g gVar6 = hVar.f212959r;
        if (gVar6 != null && (gVar5 = (a5h.g) gVar6.f107954b) != null && (aVar6 = (l7.a) gVar5.f1406b) != null) {
            g7.e eVarA = aVar6.a();
            this.T = (g7.f) eVarA;
            eVarA.a(this);
            b(eVarA);
        }
        if (gVar6 != null && (gVar4 = (a5h.g) gVar6.f107954b) != null && (aVar5 = (l7.a) gVar4.f1407c) != null) {
            g7.e eVarA2 = aVar5.a();
            this.V = (g7.f) eVarA2;
            eVarA2.a(this);
            b(eVarA2);
        }
        if (gVar6 != null && (gVar3 = (a5h.g) gVar6.f107954b) != null && (bVar2 = (l7.b) gVar3.d) != null) {
            g7.i iVarA = bVar2.a();
            this.X = iVarA;
            iVarA.a(this);
            b(iVarA);
        }
        if (gVar6 != null && (gVar2 = (a5h.g) gVar6.f107954b) != null && (bVar = (l7.b) gVar2.e) != null) {
            g7.i iVarA2 = bVar.a();
            this.Z = iVarA2;
            iVarA2.a(this);
            b(iVarA2);
        }
        if (gVar6 != null && (gVar = (a5h.g) gVar6.f107954b) != null && (aVar4 = (l7.a) gVar.f) != null) {
            g7.e eVarA3 = aVar4.a();
            this.f212969b0 = (g7.f) eVarA3;
            eVarA3.a(this);
            b(eVarA3);
        }
        if (gVar6 != null && (qVar4 = (q) gVar6.f107955c) != null && (aVar3 = (l7.a) qVar4.f148941b) != null) {
            g7.e eVarA4 = aVar3.a();
            this.f212971e0 = (g7.f) eVarA4;
            eVarA4.a(this);
            b(eVarA4);
        }
        if (gVar6 != null && (qVar3 = (q) gVar6.f107955c) != null && (aVar2 = (l7.a) qVar3.f148942c) != null) {
            g7.e eVarA5 = aVar2.a();
            this.f0 = (g7.f) eVarA5;
            eVarA5.a(this);
            b(eVarA5);
        }
        if (gVar6 != null && (qVar2 = (q) gVar6.f107955c) != null && (aVar = (l7.a) qVar2.d) != null) {
            g7.e eVarA6 = aVar.a();
            this.g0 = (g7.f) eVarA6;
            eVarA6.a(this);
            b(eVarA6);
        }
        if (gVar6 == null || (qVar = (q) gVar6.f107955c) == null) {
            return;
        }
        this.S = (a0) qVar.e;
    }

    public static void s(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        canvas.drawText(str, 0, str.length(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, paint);
    }

    public static void t(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    @Override // n7.b, f7.f
    public final void a(RectF rectF, Matrix matrix, boolean z) {
        super.a(rectF, matrix, z);
        d7.j jVar = this.R;
        rectF.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, jVar.k.width(), jVar.k.height());
    }

    @Override // n7.b, k7.g
    public final void f(Object obj2, s7.c cVar) {
        super.f(obj2, cVar);
        PointF pointF = f0.f111651a;
        if (obj2 == 1) {
            u uVar = this.U;
            if (uVar != null) {
                m(uVar);
            }
            if (cVar == null) {
                this.U = null;
                return;
            }
            u uVar2 = new u(null, cVar);
            this.U = uVar2;
            uVar2.a(this);
            b(this.U);
            return;
        }
        if (obj2 == 2) {
            u uVar3 = this.W;
            if (uVar3 != null) {
                m(uVar3);
            }
            if (cVar == null) {
                this.W = null;
                return;
            }
            u uVar4 = new u(null, cVar);
            this.W = uVar4;
            uVar4.a(this);
            b(this.W);
            return;
        }
        if (obj2 == f0.f111661q) {
            u uVar5 = this.Y;
            if (uVar5 != null) {
                m(uVar5);
            }
            if (cVar == null) {
                this.Y = null;
                return;
            }
            u uVar6 = new u(null, cVar);
            this.Y = uVar6;
            uVar6.a(this);
            b(this.Y);
            return;
        }
        if (obj2 == f0.f111662r) {
            u uVar7 = this.f212968a0;
            if (uVar7 != null) {
                m(uVar7);
            }
            if (cVar == null) {
                this.f212968a0 = null;
                return;
            }
            u uVar8 = new u(null, cVar);
            this.f212968a0 = uVar8;
            uVar8.a(this);
            b(this.f212968a0);
            return;
        }
        if (obj2 == f0.D) {
            u uVar9 = this.c0;
            if (uVar9 != null) {
                m(uVar9);
            }
            if (cVar == null) {
                this.c0 = null;
                return;
            }
            u uVar10 = new u(null, cVar);
            this.c0 = uVar10;
            uVar10.a(this);
            b(this.c0);
            return;
        }
        if (obj2 != f0.K) {
            if (obj2 == f0.M) {
                r rVar = this.P;
                rVar.getClass();
                rVar.k(new g7.q(new s7.b(), cVar, new k7.c()));
                return;
            }
            return;
        }
        u uVar11 = this.f212970d0;
        if (uVar11 != null) {
            m(uVar11);
        }
        if (cVar == null) {
            this.f212970d0 = null;
            return;
        }
        u uVar12 = new u(null, cVar);
        this.f212970d0 = uVar12;
        uVar12.a(this);
        b(this.f212970d0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:163:0x0527, code lost:
    
        r3.insert(0, r6);
        r5 = r5 + 1;
        r20 = r1;
        r1 = r23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e7  */
    @Override // n7.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(android.graphics.Canvas r31, android.graphics.Matrix r32, int r33, r7.a r34) {
        /*
            Method dump skipped, instruction units count: 1461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n7.o.i(android.graphics.Canvas, android.graphics.Matrix, int, r7.a):void");
    }

    public final String q(int i, String str) {
        int iCodePointAt = str.codePointAt(i);
        int iCharCount = Character.charCount(iCodePointAt) + i;
        while (iCharCount < str.length()) {
            int iCodePointAt2 = str.codePointAt(iCharCount);
            if (Character.getType(iCodePointAt2) != 16 && Character.getType(iCodePointAt2) != 27 && Character.getType(iCodePointAt2) != 6 && Character.getType(iCodePointAt2) != 28 && Character.getType(iCodePointAt2) != 8 && Character.getType(iCodePointAt2) != 19) {
                break;
            }
            iCharCount += Character.charCount(iCodePointAt2);
            iCodePointAt = (iCodePointAt * 31) + iCodePointAt2;
        }
        long j2 = iCodePointAt;
        LongSparseArray longSparseArray = this.M;
        if (longSparseArray.containsKey(j2)) {
            return (String) longSparseArray.get(j2);
        }
        StringBuilder sb6 = this.D;
        sb6.setLength(0);
        while (i < iCharCount) {
            int iCodePointAt3 = str.codePointAt(i);
            sb6.appendCodePoint(iCodePointAt3);
            i += Character.charCount(iCodePointAt3);
        }
        String string = sb6.toString();
        longSparseArray.put(j2, string);
        return string;
    }

    public final void r(k7.c cVar, int i, int i2) {
        u uVar = this.U;
        l lVar = this.J;
        if (uVar != null) {
            lVar.setColor(((Integer) uVar.f()).intValue());
        } else {
            g7.f fVar = this.T;
            if (fVar == null || !v(i2)) {
                lVar.setColor(cVar.f181756h);
            } else {
                lVar.setColor(((Integer) fVar.f()).intValue());
            }
        }
        u uVar2 = this.W;
        l lVar2 = this.K;
        if (uVar2 != null) {
            lVar2.setColor(((Integer) uVar2.f()).intValue());
        } else {
            g7.f fVar2 = this.V;
            if (fVar2 == null || !v(i2)) {
                lVar2.setColor(cVar.i);
            } else {
                lVar2.setColor(((Integer) fVar2.f()).intValue());
            }
        }
        g7.e eVar = this.f212944w.f141063p;
        int iIntValue = 100;
        int iIntValue2 = eVar == null ? 100 : ((Integer) eVar.f()).intValue();
        g7.f fVar3 = this.f212969b0;
        if (fVar3 != null && v(i2)) {
            iIntValue = ((Integer) fVar3.f()).intValue();
        }
        int iRound = Math.round((((iIntValue / 100.0f) * ((iIntValue2 * 255.0f) / 100.0f)) * i) / 255.0f);
        lVar.setAlpha(iRound);
        lVar2.setAlpha(iRound);
        u uVar3 = this.Y;
        if (uVar3 != null) {
            lVar2.setStrokeWidth(((Float) uVar3.f()).floatValue());
            return;
        }
        g7.i iVar = this.X;
        if (iVar == null || !v(i2)) {
            lVar2.setStrokeWidth(r7.l.c() * cVar.f181757j);
        } else {
            lVar2.setStrokeWidth(((Float) iVar.f()).floatValue());
        }
    }

    public final n u(int i) {
        ArrayList arrayList = this.O;
        for (int size = arrayList.size(); size < i; size++) {
            n nVar = new n();
            nVar.f212966a = "";
            nVar.f212967b = BitmapDescriptorFactory.HUE_RED;
            arrayList.add(nVar);
        }
        return (n) arrayList.get(i - 1);
    }

    public final boolean v(int i) {
        g7.f fVar;
        int length = ((k7.c) this.P.f()).f181752a.length();
        g7.f fVar2 = this.f212971e0;
        if (fVar2 == null || (fVar = this.f0) == null) {
            return true;
        }
        int iMin = Math.min(((Integer) fVar2.f()).intValue(), ((Integer) fVar.f()).intValue());
        int iMax = Math.max(((Integer) fVar2.f()).intValue(), ((Integer) fVar.f()).intValue());
        g7.f fVar3 = this.g0;
        if (fVar3 != null) {
            int iIntValue = ((Integer) fVar3.f()).intValue();
            iMin += iIntValue;
            iMax += iIntValue;
        }
        if (this.S == a0.INDEX) {
            return i >= iMin && i < iMax;
        }
        float f = (i / length) * 100.0f;
        return f >= ((float) iMin) && f < ((float) iMax);
    }

    public final boolean w(Canvas canvas, k7.c cVar, int i, float f) {
        PointF pointF = cVar.f181758l;
        PointF pointF2 = cVar.f181759m;
        float fC = r7.l.c();
        float f4 = BitmapDescriptorFactory.HUE_RED;
        float f5 = (i * cVar.f * fC) + (pointF == null ? 0.0f : (cVar.f * fC) + pointF.y);
        if (this.Q.f25602w && pointF2 != null && pointF != null && f5 >= pointF.y + pointF2.y + cVar.f181754c) {
            return false;
        }
        float f6 = pointF == null ? 0.0f : pointF.x;
        if (pointF2 != null) {
            f4 = pointF2.x;
        }
        int i2 = m.f212965a[cVar.d.ordinal()];
        if (i2 == 1) {
            canvas.translate(f6, f5);
            return true;
        }
        if (i2 == 2) {
            canvas.translate((f6 + f4) - f, f5);
            return true;
        }
        if (i2 != 3) {
            return true;
        }
        canvas.translate(((f4 / 2.0f) + f6) - (f / 2.0f), f5);
        return true;
    }

    public final List x(String str, float f, k7.d dVar, float f4, float f5, boolean z) {
        float fMeasureText;
        int i = 0;
        int i2 = 0;
        boolean z3 = false;
        int i3 = 0;
        float f6 = 0.0f;
        float f32 = 0.0f;
        float f35 = 0.0f;
        for (int i5 = 0; i5 < str.length(); i5++) {
            char cCharAt = str.charAt(i5);
            if (z) {
                k7.e eVar = (k7.e) this.R.f111681h.get(k7.e.a(cCharAt, dVar.f181760a, dVar.f181762c));
                if (eVar != null) {
                    fMeasureText = (r7.l.c() * ((float) eVar.f181765c) * f4) + f5;
                }
            } else {
                fMeasureText = this.J.measureText(str.substring(i5, i5 + 1)) + f5;
            }
            if (cCharAt == ' ') {
                z3 = true;
                f35 = fMeasureText;
            } else if (z3) {
                z3 = false;
                i3 = i5;
                f32 = fMeasureText;
            } else {
                f32 += fMeasureText;
            }
            f6 += fMeasureText;
            if (f > BitmapDescriptorFactory.HUE_RED && f6 >= f && cCharAt != ' ') {
                i++;
                n nVarU = u(i);
                if (i3 == i2) {
                    nVarU.f212966a = str.substring(i2, i5).trim();
                    nVarU.f212967b = (f6 - fMeasureText) - ((r10.length() - r8.length()) * f35);
                    i2 = i5;
                    i3 = i2;
                    f6 = fMeasureText;
                    f32 = f6;
                } else {
                    nVarU.f212966a = str.substring(i2, i3 - 1).trim();
                    nVarU.f212967b = ((f6 - f32) - ((r8.length() - r14.length()) * f35)) - f35;
                    f6 = f32;
                    i2 = i3;
                }
            }
        }
        if (f6 > BitmapDescriptorFactory.HUE_RED) {
            i++;
            n nVarU2 = u(i);
            nVarU2.f212966a = str.substring(i2);
            nVarU2.f212967b = f6;
        }
        return this.O.subList(0, i);
    }
}
