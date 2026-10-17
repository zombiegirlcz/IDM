package nh2;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.apm.wero.impl.ui.pay.WeroPayFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class v implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeroPayFlowContract$InputData f215355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f215356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f215357c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public v(o oVar, WeroPayFlowContract$InputData weroPayFlowContract$InputData) {
        this.f215356b = oVar;
        this.f215355a = weroPayFlowContract$InputData;
        int i = 26;
        this.d = e4m.b.b(new ms1.s(oVar, this, 1, i));
        this.e = e4m.b.b(new ms1.s(oVar, this, 0, i));
        this.f = e4m.b.b(new ms1.s(oVar, this, 2, i));
    }

    public final ki2.b b() {
        o oVar = this.f215356b;
        ih2.c cVar = (ih2.c) oVar.B.get();
        ax1.a aVarE = ((lz1.m) oVar.f215313a).e();
        vc.s.j(aVarE);
        pz1.b bVar = (pz1.b) oVar.f215319l.f210571b.get();
        vc.s.j(bVar);
        vv9.c cVarC = ((s6k.b) oVar.f215320m).c();
        vc.s.j(cVarC);
        return new ki2.b(cVar, aVarE, bVar, cVarC);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.e.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
