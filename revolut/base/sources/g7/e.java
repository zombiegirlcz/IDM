package g7;

import android.view.animation.Interpolator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f141029c;
    public s7.c e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f141027a = new ArrayList(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f141028b = false;
    public float d = BitmapDescriptorFactory.HUE_RED;
    public Object f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f141030g = -1.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f141031h = -1.0f;

    public e(List list) {
        b dVar;
        if (list.isEmpty()) {
            dVar = new ah.a(5);
        } else {
            dVar = list.size() == 1 ? new d(list) : new c(list);
        }
        this.f141029c = dVar;
    }

    public final void a(a aVar) {
        this.f141027a.add(aVar);
    }

    public final s7.a b() {
        d7.a aVar = d7.d.f111646a;
        return this.f141029c.a();
    }

    public float c() {
        if (this.f141031h == -1.0f) {
            this.f141031h = this.f141029c.o();
        }
        return this.f141031h;
    }

    public final float d() {
        Interpolator interpolator;
        s7.a aVarB = b();
        return (aVarB == null || aVarB.c() || (interpolator = aVarB.d) == null) ? BitmapDescriptorFactory.HUE_RED : interpolator.getInterpolation(e());
    }

    public final float e() {
        if (this.f141028b) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        s7.a aVarB = b();
        return aVarB.c() ? BitmapDescriptorFactory.HUE_RED : (this.d - aVarB.b()) / (aVarB.a() - aVarB.b());
    }

    public Object f() {
        float fE = e();
        if (this.e == null && this.f141029c.i(fE) && !l()) {
            return this.f;
        }
        s7.a aVarB = b();
        Interpolator interpolator = aVarB.e;
        Interpolator interpolator2 = aVarB.f;
        Object objG = (interpolator == null || interpolator2 == null) ? g(aVarB, d()) : h(aVarB, fE, interpolator.getInterpolation(fE), interpolator2.getInterpolation(fE));
        this.f = objG;
        return objG;
    }

    public abstract Object g(s7.a aVar, float f);

    public Object h(s7.a aVar, float f, float f4, float f5) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public void i() {
        d7.a aVar = d7.d.f111646a;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f141027a;
            if (i >= arrayList.size()) {
                d7.a aVar2 = d7.d.f111646a;
                return;
            } else {
                ((a) arrayList.get(i)).d();
                i++;
            }
        }
    }

    public void j(float f) {
        d7.a aVar = d7.d.f111646a;
        b bVar = this.f141029c;
        if (bVar.isEmpty()) {
            return;
        }
        if (this.f141030g == -1.0f) {
            this.f141030g = bVar.e();
        }
        float f4 = this.f141030g;
        if (f < f4) {
            if (f4 == -1.0f) {
                this.f141030g = bVar.e();
            }
            f = this.f141030g;
        } else if (f > c()) {
            f = c();
        }
        if (f == this.d) {
            return;
        }
        this.d = f;
        if (bVar.k(f)) {
            i();
        }
    }

    public final void k(s7.c cVar) {
        s7.c cVar2 = this.e;
        if (cVar2 != null) {
            cVar2.getClass();
        }
        this.e = cVar;
    }

    public boolean l() {
        return false;
    }
}
