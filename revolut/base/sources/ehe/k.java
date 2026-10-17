package ehe;

import aie.c0;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.tab.accounts.models.ProductId;
import com.revolut.kompot.navigable.vc.ViewController;
import dw3.q8;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class k implements bie.a {
    public final e4m.e A;
    public final e4m.e B;
    public final e4m.e C;
    public final e4m.e D;
    public final e4m.e E;
    public final e4m.e F;
    public final e4m.e G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f126050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f126051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f126052c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f126053g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f126054h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f126055j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f126056l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f126057m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f126058n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f126059p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f126060q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f126061r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f126062s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f126063t;
    public final e4m.e u;
    public final e4m.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e4m.e f126064w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e4m.e f126065x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final e4m.e f126066y;
    public final e4m.e z;

    public k(c cVar, a aVar, ViewController viewController) {
        this.f126050a = cVar;
        this.f126051b = aVar;
        this.f126052c = com.revolut.data.database.models.openbanking.d.n(cVar, aVar, this, 2);
        this.d = com.revolut.data.database.models.openbanking.d.n(cVar, aVar, this, 1);
        this.e = com.revolut.data.database.models.openbanking.d.n(cVar, aVar, this, 0);
        this.f = e4m.b.b(e4m.c.a(viewController));
        this.f126053g = com.revolut.data.database.models.openbanking.d.n(cVar, aVar, this, 6);
        this.f126054h = com.revolut.data.database.models.openbanking.d.n(cVar, aVar, this, 7);
        this.i = com.revolut.data.database.models.openbanking.d.n(cVar, aVar, this, 8);
        this.f126055j = com.revolut.data.database.models.openbanking.d.n(cVar, aVar, this, 9);
        this.k = com.revolut.data.database.models.openbanking.d.n(cVar, aVar, this, 10);
        this.f126056l = com.revolut.data.database.models.openbanking.d.n(cVar, aVar, this, 11);
        this.f126057m = com.revolut.data.database.models.openbanking.d.n(cVar, aVar, this, 12);
        this.f126058n = com.revolut.data.database.models.openbanking.d.n(cVar, aVar, this, 13);
        this.o = com.revolut.data.database.models.openbanking.d.n(cVar, aVar, this, 14);
        this.f126059p = com.revolut.data.database.models.openbanking.d.n(cVar, aVar, this, 15);
        this.f126060q = com.revolut.data.database.models.openbanking.d.n(cVar, aVar, this, 16);
        this.f126061r = com.revolut.data.database.models.openbanking.d.n(cVar, aVar, this, 17);
        this.f126062s = com.revolut.data.database.models.openbanking.d.n(cVar, aVar, this, 5);
        this.f126063t = com.revolut.data.database.models.openbanking.d.n(cVar, aVar, this, 4);
        this.u = com.revolut.data.database.models.openbanking.d.n(cVar, aVar, this, 3);
        this.v = com.revolut.data.database.models.openbanking.d.n(cVar, aVar, this, 19);
        this.f126064w = com.revolut.data.database.models.openbanking.d.n(cVar, aVar, this, 18);
        this.f126065x = e4m.b.b(new q8(cVar, aVar, this, 21, 28));
        this.f126066y = com.revolut.data.database.models.openbanking.d.n(cVar, aVar, this, 20);
        this.z = com.revolut.data.database.models.openbanking.d.n(cVar, aVar, this, 22);
        this.A = com.revolut.data.database.models.openbanking.d.n(cVar, aVar, this, 25);
        this.B = com.revolut.data.database.models.openbanking.d.n(cVar, aVar, this, 24);
        this.C = com.revolut.data.database.models.openbanking.d.n(cVar, aVar, this, 23);
        int i = 28;
        this.D = e4m.b.b(new q8(cVar, aVar, this, 27, i));
        this.E = com.revolut.data.database.models.openbanking.d.n(cVar, aVar, this, 28);
        this.F = e4m.b.b(new q8(cVar, aVar, this, 29, i));
        this.G = e4m.b.b(new q8(cVar, aVar, this, 26, i));
    }

    @Override // bie.a
    public final aie.b a() {
        return (aie.b) this.G.get();
    }

    public final com.revolut.feature.tab.accounts.impl.ui.spaces.j b() {
        c cVar = this.f126050a;
        zjh.j jVarC = ((zc6.a) cVar.M).c();
        wa7.p pVarC = cVar.f125991s.c();
        return new com.revolut.feature.tab.accounts.impl.ui.spaces.j((c0) this.D.get(), new mge.a(), pVarC, jVarC);
    }

    public final ImmutableMap c() {
        ImmutableMap.Builder builderBuilderWithExpectedSize = ImmutableMap.builderWithExpectedSize(12);
        builderBuilderWithExpectedSize.put(ProductId.CURRENCY, this.f126053g.get());
        builderBuilderWithExpectedSize.put(ProductId.ON_HOLD, this.f126054h.get());
        builderBuilderWithExpectedSize.put(ProductId.YOUTH, this.i.get());
        builderBuilderWithExpectedSize.put(ProductId.TEEN, this.f126055j.get());
        builderBuilderWithExpectedSize.put(ProductId.SUBACCOUNT, this.k.get());
        builderBuilderWithExpectedSize.put(ProductId.SAVINGS, this.f126056l.get());
        builderBuilderWithExpectedSize.put(ProductId.CREDIT, this.f126057m.get());
        builderBuilderWithExpectedSize.put(ProductId.PRO, this.f126058n.get());
        builderBuilderWithExpectedSize.put(ProductId.LINKED, this.o.get());
        builderBuilderWithExpectedSize.put(ProductId.JOINT, this.f126059p.get());
        builderBuilderWithExpectedSize.put(ProductId.BEREAVEMENT, this.f126060q.get());
        builderBuilderWithExpectedSize.put(ProductId.TOTAL_WEALTH, this.f126061r.get());
        return builderBuilderWithExpectedSize.build();
    }

    @Override // xki.e
    public final Set f() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(4);
        builderBuilderWithExpectedSize.add(this.f126064w.get());
        builderBuilderWithExpectedSize.add(this.f126066y.get());
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
