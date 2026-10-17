package bi3;

import android.content.Context;
import sri.m;
import vc.s;

/* JADX INFO: loaded from: classes21.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f15422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l70.e f15423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f15424c;
    public final da3.j d;
    public final kmg.a e;
    public final ite.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f15425g = e4m.b.b(new ap3.d(this, 16));

    public g(da3.j jVar, d dVar, l70.e eVar, ite.a aVar, kmg.a aVar2, Context context) {
        this.f15422a = dVar;
        this.f15423b = eVar;
        this.f15424c = context;
        this.d = jVar;
        this.e = aVar2;
        this.f = aVar;
    }

    public final oi3.h a() {
        sh3.a aVarA = this.f15422a.a();
        s.j(aVarA);
        y63.h hVar = new y63.h();
        l80.e eVarH = this.f15423b.h();
        s.j(eVarH);
        m mVar = (m) this.f15425g.get();
        m93.d dVarF = this.d.f();
        s.j(dVarF);
        oi3.j jVar = new oi3.j(dVarF, new oi3.b());
        emg.a aVarA2 = this.e.a();
        s.j(aVarA2);
        gte.a aVarB = this.f.b();
        s.j(aVarB);
        return new oi3.h(aVarA, hVar, eVarH, mVar, jVar, aVarA2, aVarB);
    }
}
