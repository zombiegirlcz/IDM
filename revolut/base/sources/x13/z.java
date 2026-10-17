package x13;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.card_order_new.impl.kompot.ordernewcard.OrderNewCardFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class z implements l23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final agk.c f302218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final OrderNewCardFlowContract$InputData f302219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f302220c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f302221g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f302222h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f302223j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f302224l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f302225m;

    public z(p pVar, agk.c cVar, OrderNewCardFlowContract$InputData orderNewCardFlowContract$InputData) {
        this.f302220c = pVar;
        this.f302218a = cVar;
        this.f302219b = orderNewCardFlowContract$InputData;
        this.d = e4m.b.b(new whc.t(pVar, this, 0, 22));
        this.e = e4m.b.b(new whc.t(pVar, this, 3, 22));
        this.f = e4m.b.b(new whc.t(pVar, this, 2, 22));
        this.f302221g = e4m.b.b(new whc.t(pVar, this, 1, 22));
        this.f302222h = e4m.b.b(new whc.t(pVar, this, 4, 22));
        this.i = e4m.b.b(new whc.t(pVar, this, 5, 22));
        this.f302223j = e4m.b.b(new whc.t(pVar, this, 7, 22));
        this.k = e4m.b.b(new whc.t(pVar, this, 9, 22));
        this.f302224l = e4m.b.b(new whc.t(pVar, this, 8, 22));
        this.f302225m = e4m.b.b(new whc.t(pVar, this, 6, 22));
    }

    @Override // xki.e
    public final Set f() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(4);
        builderBuilderWithExpectedSize.add(this.f302220c.V.get());
        builderBuilderWithExpectedSize.add(this.f302221g.get());
        builderBuilderWithExpectedSize.addAll((Iterable) this.f302222h.get());
        return j6.a.g(this.i, builderBuilderWithExpectedSize);
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.d.get());
    }
}
