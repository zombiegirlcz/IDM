package w1c;

import com.revolut.feature.rev_points.spare_change.impl.data.network.RevPointsSpareChangeService;
import vc.s;

/* JADX INFO: loaded from: classes6.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nj0.a f293842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ee0.a f293843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final an0.c f293844c;
    public final wvh.a d;
    public final xmg.a e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f293845g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f293846h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f293847j;
    public final vy9.a k;

    public j(m mVar, ee0.a aVar, nj0.a aVar2, an0.c cVar, wvh.a aVar3, xmg.a aVar4) {
        this.f293842a = aVar2;
        this.f293843b = aVar;
        this.f293844c = cVar;
        this.d = aVar3;
        this.e = aVar4;
        int i = 2;
        this.f = e4m.b.b(new vy9.a(this, 2, i));
        this.f293845g = e4m.b.b(new vy9.a(this, 1, i));
        this.f293846h = e4m.b.b(new vy9.a(this, 0, i));
        this.i = e4m.b.b(new vy9.a(this, 3, i));
        this.f293847j = e4m.b.b(new vy9.a(this, 4, i));
        this.k = new vy9.a(this, 5, i);
    }

    public final rul.e a() {
        s1c.f fVar = new s1c.f((RevPointsSpareChangeService) this.f293846h.get(), (ue0.c) this.i.get(), (ne0.j) this.f293847j.get());
        xvh.c cVarA = ((a6d.e) this.d).a();
        s.j(cVarA);
        return new rul.e(fVar, cVarA);
    }

    public final a2c.e b() {
        l61.a aVarB = this.e.b();
        s.j(aVarB);
        return new a2c.e(aVarB);
    }
}
