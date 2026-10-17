package ehe;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.tab.accounts.impl.total_wealth.category_list.TotalWealthCategoryListContract$InputData;
import com.revolut.feature.tab.accounts.models.ProductId;
import com.revolut.kompot.navigable.vc.ViewController;
import dw3.q8;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements lhe.a {
    public final e4m.e A;
    public final e4m.e B;
    public final e4m.e C;
    public final e4m.e D;
    public final e4m.e E;
    public final e4m.e F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TotalWealthCategoryListContract$InputData f126004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f126005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f126006c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f126007g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f126008h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f126009j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f126010l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f126011m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f126012n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f126013p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f126014q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f126015r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f126016s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f126017t;
    public final e4m.e u;
    public final e4m.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e4m.e f126018w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e4m.e f126019x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final e4m.e f126020y;
    public final e4m.e z;

    public e(c cVar, a aVar, ViewController viewController, TotalWealthCategoryListContract$InputData totalWealthCategoryListContract$InputData) {
        this.f126005b = cVar;
        this.f126006c = aVar;
        this.f126004a = totalWealthCategoryListContract$InputData;
        this.d = com.revolut.data.database.models.openbanking.d.m(cVar, aVar, this, 2);
        this.e = com.revolut.data.database.models.openbanking.d.m(cVar, aVar, this, 1);
        this.f = com.revolut.data.database.models.openbanking.d.m(cVar, aVar, this, 0);
        this.f126007g = e4m.b.b(e4m.c.a(viewController));
        this.f126008h = com.revolut.data.database.models.openbanking.d.m(cVar, aVar, this, 6);
        this.i = com.revolut.data.database.models.openbanking.d.m(cVar, aVar, this, 7);
        this.f126009j = com.revolut.data.database.models.openbanking.d.m(cVar, aVar, this, 8);
        this.k = com.revolut.data.database.models.openbanking.d.m(cVar, aVar, this, 9);
        this.f126010l = com.revolut.data.database.models.openbanking.d.m(cVar, aVar, this, 10);
        this.f126011m = com.revolut.data.database.models.openbanking.d.m(cVar, aVar, this, 11);
        this.f126012n = com.revolut.data.database.models.openbanking.d.m(cVar, aVar, this, 12);
        this.o = com.revolut.data.database.models.openbanking.d.m(cVar, aVar, this, 13);
        this.f126013p = com.revolut.data.database.models.openbanking.d.m(cVar, aVar, this, 14);
        this.f126014q = com.revolut.data.database.models.openbanking.d.m(cVar, aVar, this, 15);
        this.f126015r = com.revolut.data.database.models.openbanking.d.m(cVar, aVar, this, 16);
        this.f126016s = com.revolut.data.database.models.openbanking.d.m(cVar, aVar, this, 17);
        this.f126017t = com.revolut.data.database.models.openbanking.d.m(cVar, aVar, this, 5);
        this.u = com.revolut.data.database.models.openbanking.d.m(cVar, aVar, this, 4);
        this.v = com.revolut.data.database.models.openbanking.d.m(cVar, aVar, this, 3);
        this.f126018w = com.revolut.data.database.models.openbanking.d.m(cVar, aVar, this, 19);
        this.f126019x = com.revolut.data.database.models.openbanking.d.m(cVar, aVar, this, 18);
        this.f126020y = com.revolut.data.database.models.openbanking.d.m(cVar, aVar, this, 20);
        this.z = com.revolut.data.database.models.openbanking.d.m(cVar, aVar, this, 23);
        this.A = com.revolut.data.database.models.openbanking.d.m(cVar, aVar, this, 22);
        this.B = com.revolut.data.database.models.openbanking.d.m(cVar, aVar, this, 21);
        int i = 26;
        this.C = e4m.b.b(new q8(cVar, aVar, this, 25, i));
        this.D = e4m.b.b(new q8(cVar, aVar, this, 26, i));
        this.E = e4m.b.b(new q8(cVar, aVar, this, 27, i));
        this.F = e4m.b.b(new q8(cVar, aVar, this, 24, i));
    }

    @Override // lhe.a
    public final khe.b a() {
        return (khe.b) this.F.get();
    }

    public final ImmutableMap b() {
        ImmutableMap.Builder builderBuilderWithExpectedSize = ImmutableMap.builderWithExpectedSize(12);
        builderBuilderWithExpectedSize.put(ProductId.CURRENCY, this.f126008h.get());
        builderBuilderWithExpectedSize.put(ProductId.ON_HOLD, this.i.get());
        builderBuilderWithExpectedSize.put(ProductId.YOUTH, this.f126009j.get());
        builderBuilderWithExpectedSize.put(ProductId.TEEN, this.k.get());
        builderBuilderWithExpectedSize.put(ProductId.SUBACCOUNT, this.f126010l.get());
        builderBuilderWithExpectedSize.put(ProductId.SAVINGS, this.f126011m.get());
        builderBuilderWithExpectedSize.put(ProductId.CREDIT, this.f126012n.get());
        builderBuilderWithExpectedSize.put(ProductId.PRO, this.o.get());
        builderBuilderWithExpectedSize.put(ProductId.LINKED, this.f126013p.get());
        builderBuilderWithExpectedSize.put(ProductId.JOINT, this.f126014q.get());
        builderBuilderWithExpectedSize.put(ProductId.BEREAVEMENT, this.f126015r.get());
        builderBuilderWithExpectedSize.put(ProductId.TOTAL_WEALTH, this.f126016s.get());
        return builderBuilderWithExpectedSize.build();
    }

    @Override // xki.e
    public final Set f() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(3);
        builderBuilderWithExpectedSize.add(this.f126019x.get());
        builderBuilderWithExpectedSize.add(this.f126020y.get());
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
