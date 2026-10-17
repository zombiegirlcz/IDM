package xj2;

import com.revolut.feature.atm.impl.network.service.AtmsService;
import vc.s;

/* JADX INFO: loaded from: classes13.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f306452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nj0.a f306453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f49.a f306454c;
    public final xmg.a d;
    public final bpj.a e;
    public final l70.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f306455g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f306456h;
    public final e4m.e i;

    public e(d dVar, l70.e eVar, nj0.a aVar, f49.a aVar2, xmg.a aVar3, bpj.a aVar4) {
        this.f306452a = dVar;
        this.f306453b = aVar;
        this.f306454c = aVar2;
        this.d = aVar3;
        this.e = aVar4;
        this.f = eVar;
        int i = 28;
        this.f306455g = e4m.b.b(new vxc.g(this, 0, i));
        this.f306456h = e4m.b.b(new vxc.g(this, 1, i));
        this.i = e4m.b.b(new vxc.g(this, 2, i));
    }

    public final yj2.l a() {
        bk2.j jVar = new bk2.j((AtmsService) this.f306455g.get(), (bk2.e) this.f306456h.get(), new bk2.c());
        w39.b bVarA = this.f306454c.a();
        s.j(bVarA);
        ang.f fVarE = this.d.e();
        xoj.a aVarA = this.e.a();
        s.j(aVarA);
        qd0.b bVarN = this.f.n();
        s.j(bVarN);
        return new yj2.l(jVar, bVarA, fVarE, aVarA, new yj2.f(bVarN));
    }
}
