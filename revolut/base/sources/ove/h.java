package ove;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.topup_screen.api.descriptor.FacadeCardTopupFlowDescriptor$InputData;
import com.revolut.feature.topup_screen.impl.data.network.service.CardTopUpRevampedService;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class h implements xki.c, eze.b, pxe.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FacadeCardTopupFlowDescriptor$InputData f230071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f230072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f230073c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public h(t tVar, ViewController viewController, FacadeCardTopupFlowDescriptor$InputData facadeCardTopupFlowDescriptor$InputData) {
        this.f230072b = tVar;
        this.f230071a = facadeCardTopupFlowDescriptor$InputData;
        this.d = e4m.b.b(e4m.c.a(viewController));
        int i = 23;
        this.e = e4m.b.b(new oi9.a(tVar, this, 1, i));
        this.f = e4m.b.b(new oi9.a(tVar, this, 0, i));
    }

    @Override // eze.b
    public final y b() {
        return new y(this.f230072b, this.f230073c, 2);
    }

    @Override // pxe.a
    public final v c() {
        return new v(this.f230072b, this.f230073c, 1);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }

    public final rve.d j() {
        t tVar = this.f230072b;
        CardTopUpRevampedService cardTopUpRevampedServiceS = olc.c.s(((nj0.d) tVar.f230132n).f());
        hue.b bVar = new hue.b(tVar.f.c());
        ywh.b bVar2 = (ywh.b) tVar.i.k.get();
        vc.s.j(bVar2);
        r10.q qVar = new r10.q(cardTopUpRevampedServiceS, bVar, bVar2);
        sf0.h hVarB = tVar.v.b();
        vc.s.j(hVarB);
        return new rve.d(qVar, hVarB);
    }
}
