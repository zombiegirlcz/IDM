package f7;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.airbnb.lottie.LottieDrawable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import d7.f0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes16.dex */
public final class r implements g7.a, l, o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f132528c;
    public final boolean d;
    public final LottieDrawable e;
    public final g7.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g7.e f132529g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g7.i f132530h;
    public boolean k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f132526a = new Path();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RectF f132527b = new RectF();
    public final c i = new c(0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public g7.e f132531j = null;

    public r(LottieDrawable lottieDrawable, n7.b bVar, m7.o oVar) {
        this.f132528c = oVar.f203252b;
        this.d = oVar.d;
        this.e = lottieDrawable;
        g7.e eVarA = oVar.e.a();
        this.f = eVarA;
        g7.e eVarA2 = ((l7.g) oVar.f).a();
        this.f132529g = eVarA2;
        g7.i iVarA = oVar.f203253c.a();
        this.f132530h = iVarA;
        bVar.b(eVarA);
        bVar.b(eVarA2);
        bVar.b(iVarA);
        eVarA.a(this);
        eVarA2.a(this);
        iVarA.a(this);
    }

    @Override // k7.g
    public final void c(k7.f fVar, int i, ArrayList arrayList, k7.f fVar2) {
        r7.g.g(fVar, i, arrayList, fVar2, this);
    }

    @Override // g7.a
    public final void d() {
        this.k = false;
        this.e.invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    @Override // f7.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(java.util.List r5, java.util.List r6) {
        /*
            r4 = this;
            r6 = 0
        L1:
            r0 = r5
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r1 = r0.size()
            if (r6 >= r1) goto L35
            java.lang.Object r0 = r0.get(r6)
            f7.d r0 = (f7.d) r0
            boolean r1 = r0 instanceof f7.x
            if (r1 == 0) goto L28
            r1 = r0
            f7.x r1 = (f7.x) r1
            m7.y r2 = r1.f132551c
            m7.y r3 = m7.y.SIMULTANEOUSLY
            if (r2 != r3) goto L28
            f7.c r0 = r4.i
            java.util.ArrayList r0 = r0.f132468a
            r0.add(r1)
            r1.b(r4)
            goto L32
        L28:
            boolean r1 = r0 instanceof f7.t
            if (r1 == 0) goto L32
            f7.t r0 = (f7.t) r0
            g7.e r0 = r0.f132539b
            r4.f132531j = r0
        L32:
            int r6 = r6 + 1
            goto L1
        L35:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f7.r.e(java.util.List, java.util.List):void");
    }

    @Override // k7.g
    public final void f(Object obj2, s7.c cVar) {
        if (obj2 == f0.f111654g) {
            this.f132529g.k(cVar);
        } else if (obj2 == f0.i) {
            this.f.k(cVar);
        } else if (obj2 == f0.f111655h) {
            this.f132530h.k(cVar);
        }
    }

    @Override // f7.d
    public final String getName() {
        return this.f132528c;
    }

    @Override // f7.o
    public final Path getPath() {
        float f;
        g7.e eVar;
        boolean z = this.k;
        Path path = this.f132526a;
        if (z) {
            return path;
        }
        path.reset();
        if (this.d) {
            this.k = true;
            return path;
        }
        PointF pointF = (PointF) this.f132529g.f();
        float f4 = pointF.x / 2.0f;
        float f5 = pointF.y / 2.0f;
        g7.i iVar = this.f132530h;
        float fM = iVar == null ? 0.0f : iVar.m();
        if (fM == BitmapDescriptorFactory.HUE_RED && (eVar = this.f132531j) != null) {
            fM = Math.min(((Float) eVar.f()).floatValue(), Math.min(f4, f5));
        }
        float fMin = Math.min(f4, f5);
        if (fM > fMin) {
            fM = fMin;
        }
        PointF pointF2 = (PointF) this.f.f();
        path.moveTo(pointF2.x + f4, (pointF2.y - f5) + fM);
        path.lineTo(pointF2.x + f4, (pointF2.y + f5) - fM);
        RectF rectF = this.f132527b;
        if (fM > BitmapDescriptorFactory.HUE_RED) {
            float f6 = pointF2.x + f4;
            float f32 = fM * 2.0f;
            f = 2.0f;
            float f35 = pointF2.y + f5;
            rectF.set(f6 - f32, f35 - f32, f6, f35);
            path.arcTo(rectF, BitmapDescriptorFactory.HUE_RED, 90.0f, false);
        } else {
            f = 2.0f;
        }
        path.lineTo((pointF2.x - f4) + fM, pointF2.y + f5);
        if (fM > BitmapDescriptorFactory.HUE_RED) {
            float f36 = pointF2.x - f4;
            float f37 = pointF2.y + f5;
            float f41 = fM * f;
            rectF.set(f36, f37 - f41, f41 + f36, f37);
            path.arcTo(rectF, 90.0f, 90.0f, false);
        }
        path.lineTo(pointF2.x - f4, (pointF2.y - f5) + fM);
        if (fM > BitmapDescriptorFactory.HUE_RED) {
            float f42 = pointF2.x - f4;
            float f57 = pointF2.y - f5;
            float f69 = fM * f;
            rectF.set(f42, f57, f42 + f69, f69 + f57);
            path.arcTo(rectF, 180.0f, 90.0f, false);
        }
        path.lineTo((pointF2.x + f4) - fM, pointF2.y - f5);
        if (fM > BitmapDescriptorFactory.HUE_RED) {
            float f75 = pointF2.x + f4;
            float f77 = fM * f;
            float f81 = pointF2.y - f5;
            rectF.set(f75 - f77, f81, f75, f77 + f81);
            path.arcTo(rectF, 270.0f, 90.0f, false);
        }
        path.close();
        this.i.a(path);
        this.k = true;
        return path;
    }
}
