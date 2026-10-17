package f7;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.collection.LongSparseArray;
import com.airbnb.lottie.LottieDrawable;
import d7.f0;

/* JADX INFO: loaded from: classes16.dex */
public final class j extends b {
    public g7.u A;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f132502q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f132503r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final LongSparseArray f132504s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final LongSparseArray f132505t;
    public final RectF u;
    public final m7.f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f132506w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final g7.j f132507x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final g7.n f132508y;
    public final g7.n z;

    /* JADX WARN: Illegal instructions before constructor call */
    public j(LottieDrawable lottieDrawable, n7.b bVar, m7.e eVar) {
        m7.v vVar = eVar.f203235h;
        vVar.getClass();
        int i = m7.u.f203267a[vVar.ordinal()];
        Paint.Cap cap = i != 1 ? i != 2 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        m7.w wVar = eVar.i;
        wVar.getClass();
        int i2 = m7.u.f203268b[wVar.ordinal()];
        super(lottieDrawable, bVar, cap, i2 != 1 ? i2 != 2 ? i2 != 3 ? null : Paint.Join.ROUND : Paint.Join.MITER : Paint.Join.BEVEL, eVar.f203236j, eVar.d, eVar.f203234g, eVar.k, eVar.f203237l);
        this.f132504s = new LongSparseArray();
        this.f132505t = new LongSparseArray();
        this.u = new RectF();
        this.f132502q = eVar.f203231a;
        this.v = eVar.f203232b;
        this.f132503r = eVar.f203238m;
        this.f132506w = (int) (lottieDrawable.f25588a.b() / 32.0f);
        g7.e eVarA = eVar.f203233c.a();
        this.f132507x = (g7.j) eVarA;
        eVarA.a(this);
        bVar.b(eVarA);
        g7.e eVarA2 = eVar.e.a();
        this.f132508y = (g7.n) eVarA2;
        eVarA2.a(this);
        bVar.b(eVarA2);
        g7.e eVarA3 = eVar.f.a();
        this.z = (g7.n) eVarA3;
        eVarA3.a(this);
        bVar.b(eVarA3);
    }

    public final int[] b(int[] iArr) {
        g7.u uVar = this.A;
        if (uVar != null) {
            Integer[] numArr = (Integer[]) uVar.f();
            int i = 0;
            if (iArr.length == numArr.length) {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    @Override // f7.b, k7.g
    public final void f(Object obj2, s7.c cVar) {
        super.f(obj2, cVar);
        if (obj2 == f0.J) {
            g7.u uVar = this.A;
            n7.b bVar = this.f;
            if (uVar != null) {
                bVar.m(uVar);
            }
            if (cVar == null) {
                this.A = null;
                return;
            }
            g7.u uVar2 = new g7.u(null, cVar);
            this.A = uVar2;
            uVar2.a(this);
            bVar.b(this.A);
        }
    }

    @Override // f7.b, f7.f
    public final void g(Canvas canvas, Matrix matrix, int i, r7.a aVar) {
        Shader shader;
        Shader radialGradient;
        if (this.f132503r) {
            return;
        }
        a(this.u, matrix, false);
        m7.f fVar = this.v;
        m7.f fVar2 = m7.f.LINEAR;
        g7.j jVar = this.f132507x;
        g7.n nVar = this.z;
        g7.n nVar2 = this.f132508y;
        if (fVar == fVar2) {
            long jH = h();
            LongSparseArray longSparseArray = this.f132504s;
            shader = (LinearGradient) longSparseArray.get(jH);
            if (shader == null) {
                PointF pointF = (PointF) nVar2.f();
                PointF pointF2 = (PointF) nVar.f();
                m7.c cVar = (m7.c) jVar.f();
                radialGradient = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, b(cVar.f203225b), cVar.f203224a, Shader.TileMode.CLAMP);
                longSparseArray.put(jH, radialGradient);
                shader = radialGradient;
            }
        } else {
            long jH2 = h();
            LongSparseArray longSparseArray2 = this.f132505t;
            shader = (RadialGradient) longSparseArray2.get(jH2);
            if (shader == null) {
                PointF pointF3 = (PointF) nVar2.f();
                PointF pointF4 = (PointF) nVar.f();
                m7.c cVar2 = (m7.c) jVar.f();
                int[] iArrB = b(cVar2.f203225b);
                float[] fArr = cVar2.f203224a;
                radialGradient = new RadialGradient(pointF3.x, pointF3.y, (float) Math.hypot(pointF4.x - r10, pointF4.y - r11), iArrB, fArr, Shader.TileMode.CLAMP);
                longSparseArray2.put(jH2, radialGradient);
                shader = radialGradient;
            }
        }
        this.i.setShader(shader);
        super.g(canvas, matrix, i, aVar);
    }

    @Override // f7.d
    public final String getName() {
        return this.f132502q;
    }

    public final int h() {
        float f = this.f132508y.d;
        float f4 = this.f132506w;
        int iRound = Math.round(f * f4);
        int iRound2 = Math.round(this.z.d * f4);
        int iRound3 = Math.round(this.f132507x.d * f4);
        int i = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i = i * 31 * iRound2;
        }
        return iRound3 != 0 ? i * 31 * iRound3 : i;
    }
}
