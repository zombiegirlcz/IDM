package b6b;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.flows.order_card.CobrandedCardsOrderCardFlowContract$InputData;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class p implements xki.c, f7b.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final agk.a f12656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CobrandedCardsOrderCardFlowContract$InputData f12657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f12658c;
    public final p d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f12659g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f12660h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f12661j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f12662l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f12663m;

    public p(o oVar, agk.a aVar, CobrandedCardsOrderCardFlowContract$InputData cobrandedCardsOrderCardFlowContract$InputData) {
        this.f12658c = oVar;
        this.f12656a = aVar;
        this.f12657b = cobrandedCardsOrderCardFlowContract$InputData;
        this.e = e4m.b.b(new m(oVar, this, 2, 1));
        this.f = e4m.b.b(new m(oVar, this, 3, 1));
        this.f12659g = e4m.b.b(new m(oVar, this, 4, 1));
        this.f12660h = e4m.b.b(new m(oVar, this, 1, 1));
        this.i = e4m.b.b(new m(oVar, this, 5, 1));
        this.f12661j = e4m.b.b(new m(oVar, this, 0, 1));
        this.k = e4m.b.b(new m(oVar, this, 7, 1));
        this.f12662l = e4m.b.b(new m(oVar, this, 6, 1));
        this.f12663m = e4m.b.b(new m(oVar, this, 8, 1));
    }

    @Override // f7b.b
    public final b0 c() {
        return new b0(this.f12658c, this.d, 1);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.copyOf((Collection) this.f12661j.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
