package afj;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.flow.BaseFlow;
import com.revolut.retail.feature.esim.impl.ui.flows.home.EsimHomeFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class m implements qji.a, ihj.a, gij.a, kij.a, anj.a, cij.b, qnj.a, knj.a, xgj.a, qmj.a, gjj.a, wjj.a, ylj.a, qkj.a, nhj.a, yij.a, bkj.a, omj.a, ikj.a, ujj.a, gkj.a, mij.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimHomeFlowContract$InputData f4336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f4337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f4338c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public m(b bVar, BaseFlow baseFlow, EsimHomeFlowContract$InputData esimHomeFlowContract$InputData) {
        this.f4337b = bVar;
        this.f4336a = esimHomeFlowContract$InputData;
        this.d = e4m.b.b(new a1e.c(bVar, this, 0, 12));
        this.e = e4m.b.b(e4m.c.a(baseFlow));
        this.f = e4m.b.b(new a1e.c(bVar, this, 1, 12));
    }

    @Override // omj.a
    public final m2 A() {
        return new m2(this.f4337b, this.f4338c, 2);
    }

    @Override // qkj.a
    public final g2 B() {
        return new g2(this.f4337b, this.f4338c, 4);
    }

    @Override // gkj.a
    public final c2 D() {
        return new c2(this.f4337b, this.f4338c, 1);
    }

    @Override // anj.a
    public final k3 G() {
        return new k3(this.f4337b, this.f4338c, 1);
    }

    @Override // xgj.a
    public final z0 H() {
        return new z0(this.f4337b, this.f4338c, 1);
    }

    @Override // gjj.a
    public final w1 I() {
        return new w1(this.f4337b, this.f4338c, 1);
    }

    @Override // qnj.a
    public final q3 J() {
        return new q3(this.f4337b, this.f4338c, 6);
    }

    @Override // cij.b
    public final cij.a M() {
        return new r10.q(this.f4337b, this.f4338c, 4);
    }

    @Override // ujj.a
    public final u1 N() {
        return new u1(this.f4337b, this.f4338c, 6);
    }

    @Override // ihj.a
    public final b1 O() {
        return new b1(this.f4337b, this.f4338c, 5);
    }

    @Override // ylj.a
    public final i2 Q() {
        return new i2(this.f4337b, this.f4338c, 1);
    }

    @Override // kij.a
    public final k1 R() {
        return new k1(this.f4337b, this.f4338c, 1);
    }

    @Override // bkj.a
    public final a2 T() {
        return new a2(this.f4337b, this.f4338c, 2);
    }

    @Override // nhj.a
    public final e1 V() {
        return new e1(this.f4337b, this.f4338c, 3);
    }

    @Override // gij.a
    public final i1 W() {
        return new i1(this.f4337b, this.f4338c, 1);
    }

    @Override // yij.a
    public final o1 b() {
        return new o1(this.f4337b, this.f4338c, 4);
    }

    @Override // ikj.a
    public final e2 c() {
        return new e2(this.f4337b, this.f4338c, 1);
    }

    @Override // dki.t
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // dki.q
    public final Set g() {
        return ImmutableSet.of();
    }

    @Override // knj.a
    public final i3 j() {
        return new i3(this.f4337b, this.f4338c, 3);
    }

    @Override // mij.a
    public final m1 q() {
        return new m1(this.f4337b, this.f4338c, 1);
    }

    @Override // wjj.a
    public final y1 s() {
        return new y1(this.f4337b, this.f4338c, 2);
    }

    @Override // qmj.a
    public final o2 y() {
        return new o2(this.f4337b, this.f4338c, 2);
    }
}
