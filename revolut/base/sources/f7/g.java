package f7;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.LottieDrawable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import d7.f0;
import java.util.ArrayList;
import java.util.List;
import m7.y;

/* JADX INFO: loaded from: classes16.dex */
public final class g implements o, g7.a, l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f132477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LottieDrawable f132478c;
    public final g7.n d;
    public final g7.e e;
    public final m7.a f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f132480h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f132476a = new Path();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c f132479g = new c(0);

    public g(LottieDrawable lottieDrawable, n7.b bVar, m7.a aVar) {
        this.f132477b = aVar.f203221a;
        this.f132478c = lottieDrawable;
        g7.e eVarA = aVar.f203223c.a();
        this.d = (g7.n) eVarA;
        g7.e eVarA2 = aVar.f203222b.a();
        this.e = eVarA2;
        this.f = aVar;
        bVar.b(eVarA);
        bVar.b(eVarA2);
        eVarA.a(this);
        eVarA2.a(this);
    }

    @Override // k7.g
    public final void c(k7.f fVar, int i, ArrayList arrayList, k7.f fVar2) {
        r7.g.g(fVar, i, arrayList, fVar2, this);
    }

    @Override // g7.a
    public final void d() {
        this.f132480h = false;
        this.f132478c.invalidateSelf();
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
                    this.f132479g.f132468a.add(xVar);
                    xVar.b(this);
                }
            }
            i++;
        }
    }

    @Override // k7.g
    public final void f(Object obj2, s7.c cVar) {
        if (obj2 == f0.f) {
            this.d.k(cVar);
        } else if (obj2 == f0.i) {
            this.e.k(cVar);
        }
    }

    @Override // f7.d
    public final String getName() {
        return this.f132477b;
    }

    @Override // f7.o
    public final Path getPath() {
        boolean z = this.f132480h;
        Path path = this.f132476a;
        if (z) {
            return path;
        }
        path.reset();
        m7.a aVar = this.f;
        if (aVar.e) {
            this.f132480h = true;
            return path;
        }
        PointF pointF = (PointF) this.d.f();
        float f = pointF.x / 2.0f;
        float f4 = pointF.y / 2.0f;
        float f5 = f * 0.55228f;
        float f6 = f4 * 0.55228f;
        path.reset();
        if (aVar.d) {
            float f32 = -f4;
            path.moveTo(BitmapDescriptorFactory.HUE_RED, f32);
            float f35 = BitmapDescriptorFactory.HUE_RED - f5;
            float f36 = -f;
            float f37 = BitmapDescriptorFactory.HUE_RED - f6;
            path.cubicTo(f35, f32, f36, f37, f36, BitmapDescriptorFactory.HUE_RED);
            float f41 = f6 + BitmapDescriptorFactory.HUE_RED;
            path.cubicTo(f36, f41, f35, f4, BitmapDescriptorFactory.HUE_RED, f4);
            float f42 = f5 + BitmapDescriptorFactory.HUE_RED;
            path.cubicTo(f42, f4, f, f41, f, BitmapDescriptorFactory.HUE_RED);
            path.cubicTo(f, f37, f42, f32, BitmapDescriptorFactory.HUE_RED, f32);
        } else {
            float f57 = -f4;
            path.moveTo(BitmapDescriptorFactory.HUE_RED, f57);
            float f69 = f5 + BitmapDescriptorFactory.HUE_RED;
            float f75 = BitmapDescriptorFactory.HUE_RED - f6;
            path.cubicTo(f69, f57, f, f75, f, BitmapDescriptorFactory.HUE_RED);
            float f77 = f6 + BitmapDescriptorFactory.HUE_RED;
            path.cubicTo(f, f77, f69, f4, BitmapDescriptorFactory.HUE_RED, f4);
            float f81 = BitmapDescriptorFactory.HUE_RED - f5;
            float f82 = -f;
            path.cubicTo(f81, f4, f82, f77, f82, BitmapDescriptorFactory.HUE_RED);
            path.cubicTo(f82, f75, f81, f57, BitmapDescriptorFactory.HUE_RED, f57);
        }
        PointF pointF2 = (PointF) this.e.f();
        path.offset(pointF2.x, pointF2.y);
        path.close();
        this.f132479g.a(path);
        this.f132480h = true;
        return path;
    }
}
