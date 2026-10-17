package b6b;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.flows.post_activation.CobrandedCardsPostActivationFlowContract$InputData;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class x implements xki.c, d7b.a, f7b.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final agk.a f12691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CobrandedCardsPostActivationFlowContract$InputData f12692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f12693c;
    public final x d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f12694g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f12695h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f12696j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f12697l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f12698m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f12699n;
    public final e4m.e o;

    public x(o oVar, agk.a aVar, CobrandedCardsPostActivationFlowContract$InputData cobrandedCardsPostActivationFlowContract$InputData) {
        this.f12693c = oVar;
        this.f12691a = aVar;
        this.f12692b = cobrandedCardsPostActivationFlowContract$InputData;
        this.e = e4m.b.b(new m(oVar, this, 2, 9));
        this.f = e4m.b.b(new m(oVar, this, 3, 9));
        this.f12694g = e4m.b.b(new m(oVar, this, 4, 9));
        this.f12695h = e4m.b.b(new m(oVar, this, 1, 9));
        this.i = e4m.b.b(new m(oVar, this, 5, 9));
        this.f12696j = e4m.b.b(new m(oVar, this, 0, 9));
        this.k = e4m.b.b(new m(oVar, this, 7, 9));
        this.f12697l = e4m.b.b(new m(oVar, this, 6, 9));
        this.f12698m = e4m.b.b(new m(oVar, this, 8, 9));
        this.f12699n = e4m.b.b(new m(oVar, this, 9, 9));
        this.o = e4m.b.b(new m(oVar, this, 10, 9));
    }

    @Override // d7b.a
    public final z b() {
        return new z(this.f12693c, this.d, 1);
    }

    @Override // f7b.b
    public final b0 c() {
        return new b0(this.f12693c, this.d, 2);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.copyOf((Collection) this.f12696j.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
