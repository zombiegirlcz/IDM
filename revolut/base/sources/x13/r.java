package x13;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.CardPersonalisationControllerContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class r implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardPersonalisationControllerContract$InputData f302188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x23.o f302189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f302190c;
    public final q d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f302191g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f302192h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f302193j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f302194l;

    public r(p pVar, q qVar, ViewController viewController, CardPersonalisationControllerContract$InputData cardPersonalisationControllerContract$InputData, x23.o oVar) {
        this.f302190c = pVar;
        this.d = qVar;
        this.f302188a = cardPersonalisationControllerContract$InputData;
        this.f302189b = oVar;
        this.e = e4m.b.b(e4m.c.a(viewController));
        int i = 20;
        this.f = e4m.b.b(new whc.t(pVar, this, 1, i));
        this.f302191g = e4m.b.b(new whc.t(pVar, this, 0, i));
        this.f302192h = e4m.b.b(new whc.t(pVar, this, 3, i));
        this.i = e4m.b.b(new whc.t(pVar, this, 2, i));
        this.f302193j = e4m.b.b(new whc.t(pVar, this, 5, i));
        this.k = e4m.b.b(new whc.t(pVar, this, 6, i));
        this.f302194l = e4m.b.b(new whc.t(pVar, this, 4, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f302190c.V.get(), (yji.n) this.d.f302183r.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f302191g.get(), (yji.d) this.i.get());
    }
}
