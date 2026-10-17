package ehe;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.tab.accounts.impl.total_wealth.category_list.TotalWealthCategoryListContract$InputData;
import com.revolut.feature.tab.accounts.models.ProductId;
import com.revolut.kompot.navigable.vc.ViewController;
import dw3.q8;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class f implements lhe.a {
    public final e4m.e A;
    public final e4m.e B;
    public final e4m.e C;
    public final e4m.e D;
    public final e4m.e E;
    public final e4m.e F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TotalWealthCategoryListContract$InputData f126021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f126022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f126023c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f126024g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f126025h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f126026j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f126027l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f126028m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f126029n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f126030p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f126031q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f126032r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f126033s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f126034t;
    public final e4m.e u;
    public final e4m.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e4m.e f126035w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e4m.e f126036x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final e4m.e f126037y;
    public final e4m.e z;

    public f(c cVar, b bVar, ViewController viewController, TotalWealthCategoryListContract$InputData totalWealthCategoryListContract$InputData) {
        this.f126022b = cVar;
        this.f126023c = bVar;
        this.f126021a = totalWealthCategoryListContract$InputData;
        this.d = com.revolut.data.database.models.openbanking.d.o(cVar, bVar, this, 2);
        this.e = com.revolut.data.database.models.openbanking.d.o(cVar, bVar, this, 1);
        this.f = com.revolut.data.database.models.openbanking.d.o(cVar, bVar, this, 0);
        this.f126024g = e4m.b.b(e4m.c.a(viewController));
        this.f126025h = com.revolut.data.database.models.openbanking.d.o(cVar, bVar, this, 6);
        this.i = com.revolut.data.database.models.openbanking.d.o(cVar, bVar, this, 7);
        this.f126026j = com.revolut.data.database.models.openbanking.d.o(cVar, bVar, this, 8);
        this.k = com.revolut.data.database.models.openbanking.d.o(cVar, bVar, this, 9);
        this.f126027l = com.revolut.data.database.models.openbanking.d.o(cVar, bVar, this, 10);
        this.f126028m = com.revolut.data.database.models.openbanking.d.o(cVar, bVar, this, 11);
        this.f126029n = com.revolut.data.database.models.openbanking.d.o(cVar, bVar, this, 12);
        this.o = com.revolut.data.database.models.openbanking.d.o(cVar, bVar, this, 13);
        this.f126030p = com.revolut.data.database.models.openbanking.d.o(cVar, bVar, this, 14);
        this.f126031q = com.revolut.data.database.models.openbanking.d.o(cVar, bVar, this, 15);
        this.f126032r = com.revolut.data.database.models.openbanking.d.o(cVar, bVar, this, 16);
        this.f126033s = com.revolut.data.database.models.openbanking.d.o(cVar, bVar, this, 17);
        this.f126034t = com.revolut.data.database.models.openbanking.d.o(cVar, bVar, this, 5);
        this.u = com.revolut.data.database.models.openbanking.d.o(cVar, bVar, this, 4);
        this.v = com.revolut.data.database.models.openbanking.d.o(cVar, bVar, this, 3);
        this.f126035w = com.revolut.data.database.models.openbanking.d.o(cVar, bVar, this, 19);
        this.f126036x = com.revolut.data.database.models.openbanking.d.o(cVar, bVar, this, 18);
        this.f126037y = com.revolut.data.database.models.openbanking.d.o(cVar, bVar, this, 20);
        this.z = com.revolut.data.database.models.openbanking.d.o(cVar, bVar, this, 23);
        this.A = com.revolut.data.database.models.openbanking.d.o(cVar, bVar, this, 22);
        this.B = com.revolut.data.database.models.openbanking.d.o(cVar, bVar, this, 21);
        int i = 27;
        this.C = e4m.b.b(new q8(cVar, bVar, this, 25, i));
        this.D = e4m.b.b(new q8(cVar, bVar, this, 26, i));
        this.E = e4m.b.b(new q8(cVar, bVar, this, 27, i));
        this.F = e4m.b.b(new q8(cVar, bVar, this, 24, i));
    }

    @Override // lhe.a
    public final khe.b a() {
        return (khe.b) this.F.get();
    }

    public final ImmutableMap b() {
        ImmutableMap.Builder builderBuilderWithExpectedSize = ImmutableMap.builderWithExpectedSize(12);
        builderBuilderWithExpectedSize.put(ProductId.CURRENCY, this.f126025h.get());
        builderBuilderWithExpectedSize.put(ProductId.ON_HOLD, this.i.get());
        builderBuilderWithExpectedSize.put(ProductId.YOUTH, this.f126026j.get());
        builderBuilderWithExpectedSize.put(ProductId.TEEN, this.k.get());
        builderBuilderWithExpectedSize.put(ProductId.SUBACCOUNT, this.f126027l.get());
        builderBuilderWithExpectedSize.put(ProductId.SAVINGS, this.f126028m.get());
        builderBuilderWithExpectedSize.put(ProductId.CREDIT, this.f126029n.get());
        builderBuilderWithExpectedSize.put(ProductId.PRO, this.o.get());
        builderBuilderWithExpectedSize.put(ProductId.LINKED, this.f126030p.get());
        builderBuilderWithExpectedSize.put(ProductId.JOINT, this.f126031q.get());
        builderBuilderWithExpectedSize.put(ProductId.BEREAVEMENT, this.f126032r.get());
        builderBuilderWithExpectedSize.put(ProductId.TOTAL_WEALTH, this.f126033s.get());
        return builderBuilderWithExpectedSize.build();
    }

    @Override // xki.e
    public final Set f() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(3);
        builderBuilderWithExpectedSize.add(this.f126036x.get());
        builderBuilderWithExpectedSize.add(this.f126037y.get());
        builderBuilderWithExpectedSize.addAll((Iterable) this.B.get());
        return builderBuilderWithExpectedSize.build();
    }

    @Override // xki.e
    public final Set g() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(2);
        builderBuilderWithExpectedSize.add(this.f.get());
        builderBuilderWithExpectedSize.addAll((Iterable) this.v.get());
        return builderBuilderWithExpectedSize.build();
    }

    @Override // lhe.a
    public final fd6.a h() {
        return (fd6.a) this.e.get();
    }
}
