package g7;

import android.graphics.Matrix;
import android.graphics.PointF;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import d7.f0;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Matrix f141055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Matrix f141056c;
    public final Matrix d;
    public final float[] e;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public e f141060l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public e f141061m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public e f141062n;
    public e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public e f141063p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public i f141064q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public i f141065r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public i f141066s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public i f141067t;
    public i u;
    public e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public e f141068w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f141069x;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matrix f141054a = new Matrix();
    public float f = Float.NaN;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f141057g = Float.NaN;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f141058h = Float.NaN;
    public float i = 1.0f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f141059j = 1.0f;
    public boolean k = true;

    public t(l7.f fVar) {
        l7.d dVar = fVar.f192420a;
        this.f141060l = dVar == null ? null : dVar.a();
        l7.g gVar = fVar.f192421b;
        this.f141061m = gVar == null ? null : gVar.a();
        l7.a aVar = fVar.f192422c;
        this.f141062n = aVar == null ? null : aVar.a();
        l7.b bVar = fVar.d;
        this.o = bVar == null ? null : bVar.a();
        l7.b bVar2 = fVar.f;
        this.f141064q = bVar2 == null ? null : bVar2.a();
        this.f141069x = fVar.f192427m;
        l7.b bVar3 = fVar.f192424h;
        this.f141066s = bVar3 == null ? null : bVar3.a();
        l7.b bVar4 = fVar.i;
        this.f141067t = bVar4 == null ? null : bVar4.a();
        l7.b bVar5 = fVar.f192425j;
        this.u = bVar5 == null ? null : bVar5.a();
        if (this.f141064q != null) {
            this.f141055b = new Matrix();
            this.f141056c = new Matrix();
            this.d = new Matrix();
            this.e = new float[9];
        } else {
            this.f141055b = null;
            this.f141056c = null;
            this.d = null;
            this.e = null;
        }
        l7.b bVar6 = fVar.f192423g;
        this.f141065r = bVar6 == null ? null : bVar6.a();
        l7.a aVar2 = fVar.e;
        if (aVar2 != null) {
            this.f141063p = aVar2.a();
        }
        l7.b bVar7 = fVar.k;
        if (bVar7 != null) {
            this.v = bVar7.a();
        } else {
            this.v = null;
        }
        l7.b bVar8 = fVar.f192426l;
        if (bVar8 != null) {
            this.f141068w = bVar8.a();
        } else {
            this.f141068w = null;
        }
    }

    public final void a(n7.b bVar) {
        bVar.b(this.f141063p);
        bVar.b(this.v);
        bVar.b(this.f141068w);
        bVar.b(this.f141060l);
        bVar.b(this.f141061m);
        bVar.b(this.f141062n);
        bVar.b(this.o);
        bVar.b(this.f141064q);
        bVar.b(this.f141065r);
        bVar.b(this.f141066s);
        bVar.b(this.f141067t);
        bVar.b(this.u);
    }

    public final void b(a aVar) {
        e eVar = this.f141063p;
        if (eVar != null) {
            eVar.a(aVar);
        }
        e eVar2 = this.v;
        if (eVar2 != null) {
            eVar2.a(aVar);
        }
        e eVar3 = this.f141068w;
        if (eVar3 != null) {
            eVar3.a(aVar);
        }
        e eVar4 = this.f141060l;
        if (eVar4 != null) {
            eVar4.a(aVar);
        }
        e eVar5 = this.f141061m;
        if (eVar5 != null) {
            eVar5.a(aVar);
        }
        e eVar6 = this.f141062n;
        if (eVar6 != null) {
            eVar6.a(aVar);
        }
        e eVar7 = this.o;
        if (eVar7 != null) {
            eVar7.a(aVar);
        }
        i iVar = this.f141064q;
        if (iVar != null) {
            iVar.a(aVar);
        }
        i iVar2 = this.f141065r;
        if (iVar2 != null) {
            iVar2.a(aVar);
        }
        i iVar3 = this.f141066s;
        if (iVar3 != null) {
            iVar3.a(aVar);
            this.f141066s.a(new s(this, 0));
        }
        i iVar4 = this.f141067t;
        if (iVar4 != null) {
            iVar4.a(aVar);
            this.f141067t.a(new s(this, 1));
        }
        i iVar5 = this.u;
        if (iVar5 != null) {
            iVar5.a(aVar);
            this.u.a(new s(this, 2));
        }
    }

    public final boolean c(Object obj2, s7.c cVar) {
        Float fValueOf = Float.valueOf(100.0f);
        Float fValueOf2 = Float.valueOf(BitmapDescriptorFactory.HUE_RED);
        if (obj2 == f0.f111651a) {
            e eVar = this.f141060l;
            if (eVar == null) {
                this.f141060l = new u(new PointF(), cVar);
                return true;
            }
            eVar.k(cVar);
            return true;
        }
        if (obj2 == f0.f111652b) {
            e eVar2 = this.f141061m;
            if (eVar2 == null) {
                this.f141061m = new u(new PointF(), cVar);
                return true;
            }
            eVar2.k(cVar);
            return true;
        }
        if (obj2 == f0.f111653c) {
            e eVar3 = this.f141061m;
            if (eVar3 instanceof p) {
                ((p) eVar3).n(cVar);
                return true;
            }
        }
        if (obj2 == f0.d) {
            e eVar4 = this.f141061m;
            if (eVar4 instanceof p) {
                ((p) eVar4).o(cVar);
                return true;
            }
        }
        if (obj2 == f0.f111656j) {
            e eVar5 = this.f141062n;
            if (eVar5 == null) {
                this.f141062n = new u(new s7.d(), cVar);
                return true;
            }
            eVar5.k(cVar);
            return true;
        }
        if (obj2 == f0.k) {
            e eVar6 = this.o;
            if (eVar6 == null) {
                this.o = new u(fValueOf2, cVar);
                return true;
            }
            eVar6.k(cVar);
            return true;
        }
        if (obj2 == 3) {
            e eVar7 = this.f141063p;
            if (eVar7 == null) {
                this.f141063p = new u(100, cVar);
                return true;
            }
            eVar7.k(cVar);
            return true;
        }
        if (obj2 == f0.A) {
            e eVar8 = this.v;
            if (eVar8 == null) {
                this.v = new u(fValueOf, cVar);
                return true;
            }
            eVar8.k(cVar);
            return true;
        }
        if (obj2 == f0.B) {
            e eVar9 = this.f141068w;
            if (eVar9 == null) {
                this.f141068w = new u(fValueOf, cVar);
                return true;
            }
            eVar9.k(cVar);
            return true;
        }
        if (obj2 == f0.o) {
            if (this.f141064q == null) {
                this.f141064q = new i(Collections.singletonList(new s7.a(fValueOf2)));
            }
            this.f141064q.k(cVar);
            return true;
        }
        if (obj2 == f0.f111660p) {
            if (this.f141065r == null) {
                this.f141065r = new i(Collections.singletonList(new s7.a(fValueOf2)));
            }
            this.f141065r.k(cVar);
            return true;
        }
        if (obj2 == f0.f111657l) {
            if (this.f141066s == null) {
                this.f141066s = new i(Collections.singletonList(new s7.a(fValueOf2)));
            }
            this.f141066s.k(cVar);
            return true;
        }
        if (obj2 == f0.f111658m) {
            if (this.f141067t == null) {
                this.f141067t = new i(Collections.singletonList(new s7.a(fValueOf2)));
            }
            this.f141067t.k(cVar);
            return true;
        }
        if (obj2 != f0.f111659n) {
            return false;
        }
        if (this.u == null) {
            this.u = new i(Collections.singletonList(new s7.a(fValueOf2)));
        }
        this.u.k(cVar);
        return true;
    }

    public final void d() {
        for (int i = 0; i < 9; i++) {
            this.e[i] = 0.0f;
        }
    }

    public final Matrix e() {
        i iVar;
        i iVar2;
        PointF pointF;
        s7.d dVar;
        PointF pointF2;
        Matrix matrix = this.f141054a;
        matrix.reset();
        i iVar3 = this.f141066s;
        if ((iVar3 != null && iVar3.m() != BitmapDescriptorFactory.HUE_RED) || (((iVar = this.f141067t) != null && iVar.m() != BitmapDescriptorFactory.HUE_RED) || ((iVar2 = this.u) != null && iVar2.m() != BitmapDescriptorFactory.HUE_RED))) {
            i iVar4 = this.f141066s;
            float fM = iVar4 != null ? iVar4.m() : 0.0f;
            i iVar5 = this.f141067t;
            float fM2 = iVar5 != null ? iVar5.m() : 0.0f;
            i iVar6 = this.u;
            float fM3 = iVar6 != null ? iVar6.m() : 0.0f;
            if (this.k || fM != this.f || fM2 != this.f141057g || fM3 != this.f141058h) {
                this.f = fM;
                this.f141057g = fM2;
                this.f141058h = fM3;
                if (fM != BitmapDescriptorFactory.HUE_RED) {
                    this.i = (float) Math.cos(Math.toRadians(fM));
                } else {
                    this.i = 1.0f;
                }
                if (fM2 != BitmapDescriptorFactory.HUE_RED) {
                    this.f141059j = (float) Math.cos(Math.toRadians(fM2));
                } else {
                    this.f141059j = 1.0f;
                }
                this.k = false;
            }
            e eVar = this.f141060l;
            PointF pointF3 = eVar == null ? null : (PointF) eVar.f();
            e eVar2 = this.f141061m;
            PointF pointF4 = eVar2 == null ? null : (PointF) eVar2.f();
            e eVar3 = this.f141062n;
            s7.d dVar2 = eVar3 != null ? (s7.d) eVar3.f() : null;
            a.a.c(matrix, pointF3, pointF4, dVar2 != null ? dVar2.f260497a : 1.0f, dVar2 != null ? dVar2.f260498b : 1.0f, fM, fM2, fM3, this.i, this.f141059j);
            return matrix;
        }
        e eVar4 = this.f141061m;
        if (eVar4 != null && (pointF2 = (PointF) eVar4.f()) != null) {
            float f = pointF2.x;
            if (f != BitmapDescriptorFactory.HUE_RED || pointF2.y != BitmapDescriptorFactory.HUE_RED) {
                matrix.preTranslate(f, pointF2.y);
            }
        }
        if (!this.f141069x) {
            e eVar5 = this.o;
            if (eVar5 != null) {
                float fFloatValue = eVar5 instanceof u ? ((Float) eVar5.f()).floatValue() : ((i) eVar5).m();
                if (fFloatValue != BitmapDescriptorFactory.HUE_RED) {
                    matrix.preRotate(fFloatValue);
                }
            }
        } else if (eVar4 != null) {
            float f4 = eVar4.d;
            PointF pointF5 = (PointF) eVar4.f();
            float f5 = pointF5.x;
            float f6 = pointF5.y;
            eVar4.j(1.0E-4f + f4);
            PointF pointF6 = (PointF) eVar4.f();
            eVar4.j(f4);
            matrix.preRotate((float) Math.toDegrees(Math.atan2(pointF6.y - f6, pointF6.x - f5)));
        }
        if (this.f141064q != null) {
            float fCos = this.f141065r == null ? 0.0f : (float) Math.cos(Math.toRadians((-r5.m()) + 90.0f));
            float fSin = this.f141065r == null ? 1.0f : (float) Math.sin(Math.toRadians((-r7.m()) + 90.0f));
            float fTan = (float) Math.tan(Math.toRadians(r1.m()));
            d();
            float[] fArr = this.e;
            fArr[0] = fCos;
            fArr[1] = fSin;
            float f32 = -fSin;
            fArr[3] = f32;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            Matrix matrix2 = this.f141055b;
            matrix2.setValues(fArr);
            d();
            fArr[0] = 1.0f;
            fArr[3] = fTan;
            fArr[4] = 1.0f;
            fArr[8] = 1.0f;
            Matrix matrix3 = this.f141056c;
            matrix3.setValues(fArr);
            d();
            fArr[0] = fCos;
            fArr[1] = f32;
            fArr[3] = fSin;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            Matrix matrix4 = this.d;
            matrix4.setValues(fArr);
            matrix3.preConcat(matrix2);
            matrix4.preConcat(matrix3);
            matrix.preConcat(matrix4);
        }
        e eVar6 = this.f141062n;
        if (eVar6 != null && (dVar = (s7.d) eVar6.f()) != null) {
            float f35 = dVar.f260497a;
            if (f35 != 1.0f || dVar.f260498b != 1.0f) {
                matrix.preScale(f35, dVar.f260498b);
            }
        }
        e eVar7 = this.f141060l;
        if (eVar7 != null && (pointF = (PointF) eVar7.f()) != null) {
            float f36 = pointF.x;
            if (f36 != BitmapDescriptorFactory.HUE_RED || pointF.y != BitmapDescriptorFactory.HUE_RED) {
                matrix.preTranslate(-f36, -pointF.y);
            }
        }
        return matrix;
    }

    public final Matrix f(float f) {
        e eVar = this.f141061m;
        PointF pointF = eVar == null ? null : (PointF) eVar.f();
        e eVar2 = this.f141062n;
        s7.d dVar = eVar2 == null ? null : (s7.d) eVar2.f();
        e eVar3 = this.f141060l;
        PointF pointF2 = eVar3 != null ? (PointF) eVar3.f() : null;
        Matrix matrix = this.f141054a;
        matrix.reset();
        if (pointF != null) {
            matrix.preTranslate(pointF.x * f, pointF.y * f);
        }
        i iVar = this.f141066s;
        float f4 = BitmapDescriptorFactory.HUE_RED;
        float fM = iVar != null ? iVar.m() * f : 0.0f;
        i iVar2 = this.f141067t;
        float fM2 = iVar2 != null ? iVar2.m() * f : 0.0f;
        i iVar3 = this.u;
        float fM3 = iVar3 != null ? iVar3.m() * f : 0.0f;
        if (fM == BitmapDescriptorFactory.HUE_RED && fM2 == BitmapDescriptorFactory.HUE_RED && fM3 == BitmapDescriptorFactory.HUE_RED) {
            e eVar4 = this.o;
            if (eVar4 != null) {
                float fFloatValue = ((Float) eVar4.f()).floatValue() * f;
                float f5 = pointF2 == null ? 0.0f : pointF2.x;
                if (pointF2 != null) {
                    f4 = pointF2.y;
                }
                matrix.preRotate(fFloatValue, f5, f4);
            }
        } else {
            float fCos = fM != BitmapDescriptorFactory.HUE_RED ? (float) Math.cos(Math.toRadians(fM)) : 1.0f;
            float fCos2 = fM2 != BitmapDescriptorFactory.HUE_RED ? (float) Math.cos(Math.toRadians(fM2)) : 1.0f;
            if (fM3 != BitmapDescriptorFactory.HUE_RED) {
                float f6 = pointF2 == null ? 0.0f : pointF2.x;
                if (pointF2 != null) {
                    f4 = pointF2.y;
                }
                matrix.preRotate(fM3, f6, f4);
            }
            a.a.b(matrix, fM, fM2, fCos, fCos2);
        }
        if (dVar != null) {
            double d = f;
            matrix.preScale((float) Math.pow(dVar.f260497a, d), (float) Math.pow(dVar.f260498b, d));
        }
        return matrix;
    }
}
