package ove;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.topup_screen.api.descriptor.TopupWithNewCardFlowDescriptor$InputData;
import com.revolut.feature.topup_screen.impl.data.network.service.CardTopUpRevampedService;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class u implements xki.c, eze.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TopupWithNewCardFlowDescriptor$InputData f230159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f230160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f230161c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public u(t tVar, ViewController viewController, TopupWithNewCardFlowDescriptor$InputData topupWithNewCardFlowDescriptor$InputData) {
        this.f230160b = tVar;
        this.f230159a = topupWithNewCardFlowDescriptor$InputData;
        this.d = e4m.b.b(e4m.c.a(viewController));
        this.e = e4m.b.b(new oi9.a(tVar, this, 1, 29));
        this.f = e4m.b.b(new oi9.a(tVar, this, 0, 29));
    }

    @Override // eze.b
    public final y b() {
        return new y(this.f230160b, this.f230161c, 1);
    }

    public final rve.d c() {
        t tVar = this.f230160b;
        CardTopUpRevampedService cardTopUpRevampedServiceS = olc.c.s(((nj0.d) tVar.f230132n).f());
        hue.b bVar = new hue.b(tVar.f.c());
        ywh.b bVar2 = (ywh.b) tVar.i.k.get();
        vc.s.j(bVar2);
        r10.q qVar = new r10.q(cardTopUpRevampedServiceS, bVar, bVar2);
        sf0.h hVarB = tVar.v.b();
        vc.s.j(hVarB);
        return new rve.d(qVar, hVarB);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
