package ehe;

import aie.c0;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.tab.accounts.models.ProductId;
import com.revolut.kompot.navigable.vc.ViewController;
import dw3.q8;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class l implements bie.a {
    public final e4m.e A;
    public final e4m.e B;
    public final e4m.e C;
    public final e4m.e D;
    public final e4m.e E;
    public final e4m.e F;
    public final e4m.e G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f126067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f126068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f126069c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f126070g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f126071h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f126072j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f126073l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f126074m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f126075n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f126076p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f126077q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f126078r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f126079s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f126080t;
    public final e4m.e u;
    public final e4m.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e4m.e f126081w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e4m.e f126082x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final e4m.e f126083y;
    public final e4m.e z;

    public l(c cVar, b bVar, ViewController viewController) {
        this.f126067a = cVar;
        this.f126068b = bVar;
        this.f126069c = com.revolut.data.database.models.openbanking.d.p(cVar, bVar, this, 2);
        this.d = com.revolut.data.database.models.openbanking.d.p(cVar, bVar, this, 1);
        this.e = com.revolut.data.database.models.openbanking.d.p(cVar, bVar, this, 0);
        this.f = e4m.b.b(e4m.c.a(viewController));
        this.f126070g = com.revolut.data.database.models.openbanking.d.p(cVar, bVar, this, 6);
        this.f126071h = com.revolut.data.database.models.openbanking.d.p(cVar, bVar, this, 7);
        this.i = com.revolut.data.database.models.openbanking.d.p(cVar, bVar, this, 8);
        this.f126072j = com.revolut.data.database.models.openbanking.d.p(cVar, bVar, this, 9);
        this.k = com.revolut.data.database.models.openbanking.d.p(cVar, bVar, this, 10);
        this.f126073l = com.revolut.data.database.models.openbanking.d.p(cVar, bVar, this, 11);
        this.f126074m = com.revolut.data.database.models.openbanking.d.p(cVar, bVar, this, 12);
        this.f126075n = com.revolut.data.database.models.openbanking.d.p(cVar, bVar, this, 13);
        this.o = com.revolut.data.database.models.openbanking.d.p(cVar, bVar, this, 14);
        this.f126076p = com.revolut.data.database.models.openbanking.d.p(cVar, bVar, this, 15);
        this.f126077q = com.revolut.data.database.models.openbanking.d.p(cVar, bVar, this, 16);
        this.f126078r = com.revolut.data.database.models.openbanking.d.p(cVar, bVar, this, 17);
        this.f126079s = com.revolut.data.database.models.openbanking.d.p(cVar, bVar, this, 5);
        this.f126080t = com.revolut.data.database.models.openbanking.d.p(cVar, bVar, this, 4);
        this.u = com.revolut.data.database.models.openbanking.d.p(cVar, bVar, this, 3);
        this.v = com.revolut.data.database.models.openbanking.d.p(cVar, bVar, this, 19);
        this.f126081w = com.revolut.data.database.models.openbanking.d.p(cVar, bVar, this, 18);
        this.f126082x = e4m.b.b(new q8(cVar, bVar, this, 21, 29));
        this.f126083y = com.revolut.data.database.models.openbanking.d.p(cVar, bVar, this, 20);
        this.z = com.revolut.data.database.models.openbanking.d.p(cVar, bVar, this, 22);
        this.A = com.revolut.data.database.models.openbanking.d.p(cVar, bVar, this, 25);
        this.B = com.revolut.data.database.models.openbanking.d.p(cVar, bVar, this, 24);
        this.C = com.revolut.data.database.models.openbanking.d.p(cVar, bVar, this, 23);
        int i = 29;
        this.D = e4m.b.b(new q8(cVar, bVar, this, 27, i));
        this.E = com.revolut.data.database.models.openbanking.d.p(cVar, bVar, this, 28);
        this.F = e4m.b.b(new q8(cVar, bVar, this, 29, i));
        this.G = e4m.b.b(new q8(cVar, bVar, this, 26, i));
    }

    @Override // bie.a
    public final aie.b a() {
        return (aie.b) this.G.get();
    }

    public final com.revolut.feature.tab.accounts.impl.ui.spaces.j b() {
        c cVar = this.f126067a;
        zjh.j jVarC = ((zc6.a) cVar.M).c();
        wa7.p pVarC = cVar.f125991s.c();
        return new com.revolut.feature.tab.accounts.impl.ui.spaces.j((c0) this.D.get(), new mge.a(), pVarC, jVarC);
    }

    public final ImmutableMap c() {
        ImmutableMap.Builder builderBuilderWithExpectedSize = ImmutableMap.builderWithExpectedSize(12);
        builderBuilderWithExpectedSize.put(ProductId.CURRENCY, this.f126070g.get());
        builderBuilderWithExpectedSize.put(ProductId.ON_HOLD, this.f126071h.get());
        builderBuilderWithExpectedSize.put(ProductId.YOUTH, this.i.get());
        builderBuilderWithExpectedSize.put(ProductId.TEEN, this.f126072j.get());
        builderBuilderWithExpectedSize.put(ProductId.SUBACCOUNT, this.k.get());
        builderBuilderWithExpectedSize.put(ProductId.SAVINGS, this.f126073l.get());
        builderBuilderWithExpectedSize.put(ProductId.CREDIT, this.f126074m.get());
        builderBuilderWithExpectedSize.put(ProductId.PRO, this.f126075n.get());
        builderBuilderWithExpectedSize.put(ProductId.LINKED, this.o.get());
        builderBuilderWithExpectedSize.put(ProductId.JOINT, this.f126076p.get());
        builderBuilderWithExpectedSize.put(ProductId.BEREAVEMENT, this.f126077q.get());
        builderBuilderWithExpectedSize.put(ProductId.TOTAL_WEALTH, this.f126078r.get());
        return builderBuilderWithExpectedSize.build();
    }

    @Override // xki.e
    public final Set f() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(4);
        builderBuilderWithExpectedSize.add(this.f126081w.get());
        builderBuilderWithExpectedSize.add(this.f126083y.get());
        builderBuilderWithExpectedSize.add(this.z.get());
        builderBuilderWithExpectedSize.addAll((Iterable) this.C.get());
        return builderBuilderWithExpectedSize.build();
    }

    @Override // xki.e
    public final Set g() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(2);
        builderBuilderWithExpectedSize.add(this.e.get());
        builderBuilderWithExpectedSize.addAll((Iterable) this.u.get());
        return builderBuilderWithExpectedSize.build();
    }

    @Override // bie.a
    public final fd6.a h() {
        return (fd6.a) this.d.get();
    }
}
