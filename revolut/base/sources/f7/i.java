package f7;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.collection.LongSparseArray;
import com.airbnb.lottie.LottieDrawable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import d7.f0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class i implements f, g7.a, l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f132488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f132489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n7.b f132490c;
    public final LongSparseArray d = new LongSparseArray();
    public final LongSparseArray e = new LongSparseArray();
    public final Path f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e7.a f132491g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final RectF f132492h;
    public final ArrayList i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final m7.f f132493j;
    public final g7.j k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final g7.f f132494l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final g7.n f132495m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final g7.n f132496n;
    public g7.u o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public g7.u f132497p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final LottieDrawable f132498q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f132499r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public g7.e f132500s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f132501t;

    public i(LottieDrawable lottieDrawable, d7.j jVar, n7.b bVar, m7.d dVar) {
        Path path = new Path();
        this.f = path;
        this.f132491g = new e7.a(1);
        this.f132492h = new RectF();
        this.i = new ArrayList();
        this.f132501t = BitmapDescriptorFactory.HUE_RED;
        this.f132490c = bVar;
        this.f132488a = dVar.f203229g;
        this.f132489b = dVar.f203230h;
        this.f132498q = lottieDrawable;
        this.f132493j = dVar.f203226a;
        path.setFillType(dVar.f203227b);
        this.f132499r = (int) (jVar.b() / 32.0f);
        g7.e eVarA = dVar.f203228c.a();
        this.k = (g7.j) eVarA;
        eVarA.a(this);
        bVar.b(eVarA);
        g7.e eVarA2 = dVar.d.a();
        this.f132494l = (g7.f) eVarA2;
        eVarA2.a(this);
        bVar.b(eVarA2);
        g7.e eVarA3 = dVar.e.a();
        this.f132495m = (g7.n) eVarA3;
        eVarA3.a(this);
        bVar.b(eVarA3);
        g7.e eVarA4 = dVar.f.a();
        this.f132496n = (g7.n) eVarA4;
        eVarA4.a(this);
        bVar.b(eVarA4);
        if (bVar.j() != null) {
            g7.i iVarA = ((l7.b) bVar.j().b).a();
            this.f132500s = iVarA;
            iVarA.a(this);
            bVar.b(this.f132500s);
        }
    }

    @Override // f7.f
    public final void a(RectF rectF, Matrix matrix, boolean z) {
        Path path = this.f;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.i;
            if (i >= arrayList.size()) {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            } else {
                path.addPath(((o) arrayList.get(i)).getPath(), matrix);
                i++;
            }
        }
    }

    public final int[] b(int[] iArr) {
        g7.u uVar = this.f132497p;
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

    @Override // k7.g
    public final void c(k7.f fVar, int i, ArrayList arrayList, k7.f fVar2) {
        r7.g.g(fVar, i, arrayList, fVar2, this);
    }

    @Override // g7.a
    public final void d() {
        this.f132498q.invalidateSelf();
    }

    @Override // f7.d
    public final void e(List list, List list2) {
        for (int i = 0; i < list2.size(); i++) {
            d dVar = (d) list2.get(i);
            if (dVar instanceof o) {
                this.i.add((o) dVar);
            }
        }
    }

    @Override // k7.g
    public final void f(Object obj2, s7.c cVar) {
        PointF pointF = f0.f111651a;
        if (obj2 == 4) {
            this.f132494l.k(cVar);
            return;
        }
        ColorFilter colorFilter = f0.I;
        n7.b bVar = this.f132490c;
        if (obj2 == colorFilter) {
            g7.u uVar = this.o;
            if (uVar != null) {
                bVar.m(uVar);
            }
            if (cVar == null) {
                this.o = null;
                return;
            }
            g7.u uVar2 = new g7.u(null, cVar);
            this.o = uVar2;
            uVar2.a(this);
            bVar.b(this.o);
            return;
        }
        if (obj2 != f0.J) {
            if (obj2 == f0.e) {
                g7.e eVar = this.f132500s;
                if (eVar != null) {
                    eVar.k(cVar);
                    return;
                }
                g7.u uVar3 = new g7.u(null, cVar);
                this.f132500s = uVar3;
                uVar3.a(this);
                bVar.b(this.f132500s);
                return;
            }
            return;
        }
        g7.u uVar4 = this.f132497p;
        if (uVar4 != null) {
            bVar.m(uVar4);
        }
        if (cVar == null) {
            this.f132497p = null;
            return;
        }
        this.d.clear();
        this.e.clear();
        g7.u uVar5 = new g7.u(null, cVar);
        this.f132497p = uVar5;
        uVar5.a(this);
        bVar.b(this.f132497p);
    }

    @Override // f7.f
    public final void g(Canvas canvas, Matrix matrix, int i, r7.a aVar) {
        float[] fArr;
        int[] iArr;
        Shader linearGradient;
        int[] iArr2;
        if (this.f132489b) {
            return;
        }
        d7.a aVar2 = d7.d.f111646a;
        Path path = this.f;
        path.reset();
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.i;
            if (i2 >= arrayList.size()) {
                break;
            }
            path.addPath(((o) arrayList.get(i2)).getPath(), matrix);
            i2++;
        }
        path.computeBounds(this.f132492h, false);
        m7.f fVar = this.f132493j;
        m7.f fVar2 = m7.f.LINEAR;
        g7.j jVar = this.k;
        g7.n nVar = this.f132496n;
        g7.n nVar2 = this.f132495m;
        if (fVar == fVar2) {
            long jH = h();
            LongSparseArray longSparseArray = this.d;
            linearGradient = (LinearGradient) longSparseArray.get(jH);
            if (linearGradient == null) {
                PointF pointF = (PointF) nVar2.f();
                PointF pointF2 = (PointF) nVar.f();
                m7.c cVar = (m7.c) jVar.f();
                int[] iArrB = b(cVar.f203225b);
                float[] fArr2 = cVar.f203224a;
                if (iArrB.length < 2) {
                    int[] iArr3 = {iArrB[0], iArrB[0]};
                    fArr2 = new float[]{BitmapDescriptorFactory.HUE_RED, 1.0f};
                    iArr2 = iArr3;
                } else {
                    iArr2 = iArrB;
                }
                linearGradient = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, iArr2, fArr2, Shader.TileMode.CLAMP);
                longSparseArray.put(jH, linearGradient);
            }
        } else {
            long jH2 = h();
            LongSparseArray longSparseArray2 = this.e;
            RadialGradient radialGradient = (RadialGradient) longSparseArray2.get(jH2);
            if (radialGradient != null) {
                linearGradient = radialGradient;
            } else {
                PointF pointF3 = (PointF) nVar2.f();
                PointF pointF4 = (PointF) nVar.f();
                m7.c cVar2 = (m7.c) jVar.f();
                int[] iArrB2 = b(cVar2.f203225b);
                float[] fArr3 = cVar2.f203224a;
                if (iArrB2.length < 2) {
                    iArr = new int[]{iArrB2[0], iArrB2[0]};
                    fArr = new float[]{BitmapDescriptorFactory.HUE_RED, 1.0f};
                } else {
                    fArr = fArr3;
                    iArr = iArrB2;
                }
                float f = pointF3.x;
                float f4 = pointF3.y;
                float fHypot = (float) Math.hypot(pointF4.x - f, pointF4.y - f4);
                if (fHypot <= BitmapDescriptorFactory.HUE_RED) {
                    fHypot = 0.001f;
                }
                RadialGradient radialGradient2 = new RadialGradient(f, f4, fHypot, iArr, fArr, Shader.TileMode.CLAMP);
                longSparseArray2.put(jH2, radialGradient2);
                linearGradient = radialGradient2;
            }
        }
        linearGradient.setLocalMatrix(matrix);
        e7.a aVar3 = this.f132491g;
        aVar3.setShader(linearGradient);
        g7.u uVar = this.o;
        if (uVar != null) {
            aVar3.setColorFilter((ColorFilter) uVar.f());
        }
        g7.e eVar = this.f132500s;
        if (eVar != null) {
            float fFloatValue = ((Float) eVar.f()).floatValue();
            if (fFloatValue == BitmapDescriptorFactory.HUE_RED) {
                aVar3.setMaskFilter(null);
            } else if (fFloatValue != this.f132501t) {
                aVar3.setMaskFilter(new BlurMaskFilter(fFloatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.f132501t = fFloatValue;
        }
        float fIntValue = ((Integer) this.f132494l.f()).intValue() / 100.0f;
        aVar3.setAlpha(r7.g.c((int) (i * fIntValue)));
        if (aVar != null) {
            aVar.b((int) (fIntValue * 255.0f), aVar3);
        }
        canvas.drawPath(path, aVar3);
        d7.a aVar4 = d7.d.f111646a;
    }

    @Override // f7.d
    public final String getName() {
        return this.f132488a;
    }

    public final int h() {
        float f = this.f132495m.d;
        float f4 = this.f132499r;
        int iRound = Math.round(f * f4);
        int iRound2 = Math.round(this.f132496n.d * f4);
        int iRound3 = Math.round(this.k.d * f4);
        int i = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i = i * 31 * iRound2;
        }
        return iRound3 != 0 ? i * 31 * iRound3 : i;
    }
}
