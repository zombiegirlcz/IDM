package f7;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import com.airbnb.lottie.LottieDrawable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import d7.f0;
import java.util.ArrayList;
import java.util.List;
import m7.y;

/* JADX INFO: loaded from: classes16.dex */
public final class q implements o, g7.a, l {
    public final String e;
    public final LottieDrawable f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m7.m f132517g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f132518h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final g7.i f132519j;
    public final g7.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final g7.i f132520l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final g7.i f132521m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final g7.i f132522n;
    public final g7.i o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final g7.i f132523p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f132525r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f132514a = new Path();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path f132515b = new Path();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PathMeasure f132516c = new PathMeasure();
    public final float[] d = new float[2];

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c f132524q = new c(0);

    public q(LottieDrawable lottieDrawable, n7.b bVar, m7.n nVar) {
        this.f = lottieDrawable;
        this.e = nVar.f203245a;
        m7.m mVar = nVar.f203246b;
        this.f132517g = mVar;
        this.f132518h = nVar.f203250j;
        this.i = nVar.k;
        g7.i iVarA = nVar.f203247c.a();
        this.f132519j = iVarA;
        g7.e eVarA = nVar.d.a();
        this.k = eVarA;
        g7.i iVarA2 = nVar.e.a();
        this.f132520l = iVarA2;
        g7.i iVarA3 = nVar.f203248g.a();
        this.f132522n = iVarA3;
        g7.i iVarA4 = nVar.i.a();
        this.f132523p = iVarA4;
        m7.m mVar2 = m7.m.STAR;
        if (mVar == mVar2) {
            this.f132521m = nVar.f.a();
            this.o = nVar.f203249h.a();
        } else {
            this.f132521m = null;
            this.o = null;
        }
        bVar.b(iVarA);
        bVar.b(eVarA);
        bVar.b(iVarA2);
        bVar.b(iVarA3);
        bVar.b(iVarA4);
        if (mVar == mVar2) {
            bVar.b(this.f132521m);
            bVar.b(this.o);
        }
        iVarA.a(this);
        eVarA.a(this);
        iVarA2.a(this);
        iVarA3.a(this);
        iVarA4.a(this);
        if (mVar == mVar2) {
            this.f132521m.a(this);
            this.o.a(this);
        }
    }

    @Override // k7.g
    public final void c(k7.f fVar, int i, ArrayList arrayList, k7.f fVar2) {
        r7.g.g(fVar, i, arrayList, fVar2, this);
    }

    @Override // g7.a
    public final void d() {
        this.f132525r = false;
        this.f.invalidateSelf();
    }

    @Override // f7.d
    public final void e(List list, List list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i >= arrayList.size()) {
                return;
            }
            d dVar = (d) arrayList.get(i);
            if (dVar instanceof x) {
                x xVar = (x) dVar;
                if (xVar.f132551c == y.SIMULTANEOUSLY) {
                    this.f132524q.f132468a.add(xVar);
                    xVar.b(this);
                }
            }
            i++;
        }
    }

    @Override // k7.g
    public final void f(Object obj2, s7.c cVar) {
        g7.i iVar;
        g7.i iVar2;
        if (obj2 == f0.u) {
            this.f132519j.k(cVar);
            return;
        }
        if (obj2 == f0.v) {
            this.f132520l.k(cVar);
            return;
        }
        if (obj2 == f0.i) {
            this.k.k(cVar);
            return;
        }
        if (obj2 == f0.f111665w && (iVar2 = this.f132521m) != null) {
            iVar2.k(cVar);
            return;
        }
        if (obj2 == f0.f111666x) {
            this.f132522n.k(cVar);
            return;
        }
        if (obj2 == f0.f111667y && (iVar = this.o) != null) {
            iVar.k(cVar);
        } else if (obj2 == f0.z) {
            this.f132523p.k(cVar);
        }
    }

    @Override // f7.d
    public final String getName() {
        return this.e;
    }

    @Override // f7.o
    public final Path getPath() {
        boolean z;
        float f;
        double d;
        float f4;
        float f5;
        float f6;
        float f32;
        float f35;
        int i;
        double d5;
        boolean z3 = this.f132525r;
        Path path = this.f132514a;
        if (z3) {
            return path;
        }
        path.reset();
        if (this.f132518h) {
            this.f132525r = true;
            return path;
        }
        int i2 = p.f132513a[this.f132517g.ordinal()];
        g7.e eVar = this.k;
        g7.i iVar = this.f132522n;
        g7.i iVar2 = this.f132523p;
        g7.i iVar3 = this.f132520l;
        g7.i iVar4 = this.f132519j;
        if (i2 == 1) {
            z = true;
            float fFloatValue = ((Float) iVar4.f()).floatValue();
            double radians = Math.toRadians((iVar3 != null ? ((Float) iVar3.f()).floatValue() : 0.0d) - 90.0d);
            double d6 = fFloatValue;
            float f36 = (float) (6.283185307179586d / d6);
            if (this.i) {
                f36 *= -1.0f;
            }
            float f37 = f36;
            float f41 = f37 / 2.0f;
            float f42 = fFloatValue - ((int) fFloatValue);
            if (f42 != BitmapDescriptorFactory.HUE_RED) {
                f = 2.0f;
                radians += (double) ((1.0f - f42) * f41);
            } else {
                f = 2.0f;
            }
            float fFloatValue2 = ((Float) iVar.f()).floatValue();
            float fFloatValue3 = ((Float) this.f132521m.f()).floatValue();
            g7.i iVar5 = this.o;
            float fFloatValue4 = iVar5 != null ? ((Float) iVar5.f()).floatValue() / 100.0f : 0.0f;
            float fFloatValue5 = iVar2 != null ? ((Float) iVar2.f()).floatValue() / 100.0f : 0.0f;
            if (f42 != BitmapDescriptorFactory.HUE_RED) {
                float fA = j6.a.a(fFloatValue2, fFloatValue3, f42, fFloatValue3);
                double d10 = fA;
                f6 = fA;
                float fCos = (float) (Math.cos(radians) * d10);
                float fSin = (float) (Math.sin(radians) * d10);
                path.moveTo(fCos, fSin);
                d = radians + ((double) ((f37 * f42) / f));
                f4 = fCos;
                f5 = fSin;
            } else {
                double d15 = fFloatValue2;
                float fCos2 = (float) (Math.cos(radians) * d15);
                float fSin2 = (float) (Math.sin(radians) * d15);
                path.moveTo(fCos2, fSin2);
                d = radians + ((double) f41);
                f4 = fCos2;
                f5 = fSin2;
                f6 = 0.0f;
            }
            double dCeil = Math.ceil(d6) * 2.0d;
            double d41 = d;
            int i3 = 0;
            boolean z4 = false;
            while (true) {
                double d51 = i3;
                if (d51 >= dCeil) {
                    break;
                }
                float f57 = z4 ? fFloatValue2 : fFloatValue3;
                float f69 = (f6 == BitmapDescriptorFactory.HUE_RED || d51 != dCeil - 2.0d) ? f41 : (f37 * f42) / f;
                if (f6 != BitmapDescriptorFactory.HUE_RED && d51 == dCeil - 1.0d) {
                    f57 = f6;
                }
                double d68 = f57;
                float fCos3 = (float) (Math.cos(d41) * d68);
                float fSin3 = (float) (Math.sin(d41) * d68);
                if (fFloatValue4 == BitmapDescriptorFactory.HUE_RED && fFloatValue5 == BitmapDescriptorFactory.HUE_RED) {
                    path.lineTo(fCos3, fSin3);
                    f32 = f42;
                    f35 = fCos3;
                } else {
                    f32 = f42;
                    Path path2 = path;
                    double dAtan2 = (float) (Math.atan2(f5, f4) - 1.5707963267948966d);
                    float fCos4 = (float) Math.cos(dAtan2);
                    float fSin4 = (float) Math.sin(dAtan2);
                    float f75 = f4;
                    float f77 = f5;
                    double dAtan22 = (float) (Math.atan2(fSin3, fCos3) - 1.5707963267948966d);
                    float fCos5 = (float) Math.cos(dAtan22);
                    float fSin5 = (float) Math.sin(dAtan22);
                    float f81 = z4 ? fFloatValue4 : fFloatValue5;
                    float f82 = z4 ? fFloatValue5 : fFloatValue4;
                    float f93 = (z4 ? fFloatValue3 : fFloatValue2) * f81 * 0.47829f;
                    float f94 = fCos4 * f93;
                    float f99 = f93 * fSin4;
                    float f100 = (z4 ? fFloatValue2 : fFloatValue3) * f82 * 0.47829f;
                    float f101 = fCos5 * f100;
                    float f102 = f100 * fSin5;
                    if (f42 != BitmapDescriptorFactory.HUE_RED) {
                        if (i3 == 0) {
                            f94 *= f32;
                            f99 *= f32;
                        } else if (d51 == dCeil - 1.0d) {
                            f101 *= f32;
                            f102 *= f32;
                        }
                    }
                    f35 = fCos3;
                    path = path2;
                    path.cubicTo(f75 - f94, f77 - f99, f101 + fCos3, fSin3 + f102, f35, fSin3);
                }
                d41 += (double) f69;
                z4 = !z4;
                i3++;
                f4 = f35;
                f5 = fSin3;
                f42 = f32;
                f = 2.0f;
            }
            PointF pointF = (PointF) eVar.f();
            path.offset(pointF.x, pointF.y);
            path.close();
        } else if (i2 != 2) {
            z = true;
        } else {
            int iFloor = (int) Math.floor(((Float) iVar4.f()).floatValue());
            double radians2 = Math.toRadians((iVar3 != null ? ((Float) iVar3.f()).floatValue() : 0.0d) - 90.0d);
            double d81 = iFloor;
            float fFloatValue6 = ((Float) iVar2.f()).floatValue() / 100.0f;
            float fFloatValue7 = ((Float) iVar.f()).floatValue();
            double d82 = fFloatValue7;
            z = true;
            float fCos6 = (float) (Math.cos(radians2) * d82);
            float fSin6 = (float) (Math.sin(radians2) * d82);
            path.moveTo(fCos6, fSin6);
            double d95 = (float) (6.283185307179586d / d81);
            double dCeil2 = Math.ceil(d81);
            double d100 = radians2 + d95;
            int i5 = 0;
            while (true) {
                double d101 = i5;
                if (d101 >= dCeil2) {
                    break;
                }
                double d102 = dCeil2;
                float fCos7 = (float) (Math.cos(d100) * d82);
                float fSin7 = (float) (Math.sin(d100) * d82);
                if (fFloatValue6 != BitmapDescriptorFactory.HUE_RED) {
                    i = i5;
                    Path path3 = path;
                    d5 = d82;
                    double dAtan23 = (float) (Math.atan2(fSin6, fCos6) - 1.5707963267948966d);
                    float fCos8 = (float) Math.cos(dAtan23);
                    float fSin8 = (float) Math.sin(dAtan23);
                    double dAtan24 = (float) (Math.atan2(fSin7, fCos7) - 1.5707963267948966d);
                    float f103 = fFloatValue7 * fFloatValue6 * 0.25f;
                    float f104 = f103 * fCos8;
                    float f105 = f103 * fSin8;
                    float fCos9 = ((float) Math.cos(dAtan24)) * f103;
                    float fSin9 = f103 * ((float) Math.sin(dAtan24));
                    if (d101 == d102 - 1.0d) {
                        Path path4 = this.f132515b;
                        path4.reset();
                        path4.moveTo(fCos6, fSin6);
                        float f106 = fCos6 - f104;
                        float f107 = fSin6 - f105;
                        float f108 = fCos7 + fCos9;
                        float f109 = fSin7 + fSin9;
                        path4.cubicTo(f106, f107, f108, f109, fCos7, fSin7);
                        PathMeasure pathMeasure = this.f132516c;
                        pathMeasure.setPath(path4, false);
                        float length = pathMeasure.getLength() * 0.9999f;
                        float[] fArr = this.d;
                        pathMeasure.getPosTan(length, fArr, null);
                        path = path3;
                        path.cubicTo(f106, f107, f108, f109, fArr[0], fArr[1]);
                        fCos6 = fCos7;
                        fSin6 = fSin7;
                    } else {
                        float f110 = fSin7 + fSin9;
                        path = path3;
                        fSin6 = fSin7;
                        path.cubicTo(fCos6 - f104, fSin6 - f105, fCos7 + fCos9, f110, fCos7, fSin6);
                        fCos6 = fCos7;
                    }
                } else {
                    i = i5;
                    d5 = d82;
                    fCos6 = fCos7;
                    fSin6 = fSin7;
                    if (d101 == d102 - 1.0d) {
                        i5 = i + 1;
                        dCeil2 = d102;
                        d82 = d5;
                    } else {
                        path.lineTo(fCos6, fSin6);
                    }
                }
                d100 += d95;
                i5 = i + 1;
                dCeil2 = d102;
                d82 = d5;
            }
            PointF pointF2 = (PointF) eVar.f();
            path.offset(pointF2.x, pointF2.y);
            path.close();
        }
        path.close();
        this.f132524q.a(path);
        this.f132525r = z;
        return path;
    }
}
