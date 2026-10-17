package ehe;

import b9.w2;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.tab.accounts.models.ProductId;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import vge.b1;
import vge.d2;
import vge.e2;
import vge.u0;
import vge.y2;
import vge.z2;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements hhe.d {
    public final e4m.e A;
    public final e4m.e B;
    public final e4m.e C;
    public final e4m.e D;
    public final e4m.e E;
    public final e4m.e F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w2 f125932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f125933b;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f125935g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f125936h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f125937j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f125938l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f125940n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f125941p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f125942q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f125943r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f125944s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f125945t;
    public final e4m.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e4m.e f125946w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e4m.e f125947x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final e4m.e f125948y;
    public final e4m.e z;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f125934c = this;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.a f125939m = new e4m.a();
    public final e4m.a u = new e4m.a();

    public a(c cVar, w2 w2Var) {
        this.f125933b = cVar;
        this.f125932a = w2Var;
        int i = 5;
        this.d = e4m.b.b(new ea2.p(cVar, this, 1, i));
        this.e = e4m.b.b(new ea2.p(cVar, this, 4, i));
        this.f = e4m.b.b(new ea2.p(cVar, this, 6, i));
        this.f125935g = e4m.b.b(new ea2.p(cVar, this, 5, i));
        this.f125936h = e4m.b.b(new ea2.p(cVar, this, 3, i));
        this.i = e4m.b.b(new ea2.p(cVar, this, 7, i));
        this.f125937j = e4m.b.b(new ea2.p(cVar, this, 9, i));
        this.k = e4m.b.b(new ea2.p(cVar, this, 8, i));
        this.f125938l = e4m.b.b(new ea2.p(cVar, this, 13, i));
        this.f125940n = e4m.b.b(new ea2.p(cVar, this, 16, i));
        this.o = e4m.b.b(new ea2.p(cVar, this, 17, i));
        this.f125941p = e4m.b.b(new ea2.p(cVar, this, 19, i));
        this.f125942q = e4m.b.b(new ea2.p(cVar, this, 18, i));
        this.f125943r = e4m.b.b(new ea2.p(cVar, this, 20, i));
        this.f125944s = e4m.b.b(new ea2.p(cVar, this, 21, i));
        this.f125945t = e4m.b.b(new ea2.p(cVar, this, 22, i));
        this.v = e4m.b.b(new ea2.p(cVar, this, 15, i));
        this.f125946w = e4m.b.b(new ea2.p(cVar, this, 14, i));
        e4m.a.a(this.f125939m, e4m.b.b(new ea2.p(cVar, this, 12, i)));
        this.f125947x = e4m.b.b(new ea2.p(cVar, this, 23, i));
        this.f125948y = e4m.b.b(new ea2.p(cVar, this, 11, i));
        e4m.a.a(this.u, e4m.b.b(new ea2.p(cVar, this, 10, i)));
        this.z = e4m.b.b(new ea2.p(cVar, this, 2, i));
        this.A = e4m.b.b(new ea2.p(cVar, this, 25, i));
        this.B = e4m.b.b(new ea2.p(cVar, this, 24, i));
        this.C = e4m.b.b(new ea2.p(cVar, this, 26, i));
        this.D = e4m.b.b(new ea2.p(cVar, this, 0, i));
        this.E = e4m.b.b(new ea2.p(cVar, this, 27, i));
        this.F = e4m.b.b(new ea2.p(cVar, this, 28, i));
    }

    @Override // hhe.d
    public final u0 a() {
        return new u0((vge.d) this.D.get());
    }

    @Override // hhe.d
    public final m b() {
        return new m(this.f125933b, this.f125934c, 0);
    }

    @Override // hhe.d
    public final she.d c() {
        return new she.d((vge.d) this.D.get(), (z2) this.B.get());
    }

    @Override // hhe.d
    public final d2 d() {
        return new d2((e2) this.f125936h.get());
    }

    @Override // hhe.d
    public final zfe.b e() {
        return (zfe.b) this.E.get();
    }

    @Override // hhe.d
    public final b1 f() {
        return new b1(n(), (e2) this.f125936h.get(), (vge.d) this.D.get());
    }

    @Override // hhe.d
    public final xge.a g() {
        return (xge.a) this.z.get();
    }

    @Override // hhe.d
    public final rfe.a h() {
        w2 dependencies = this.f125932a;
        Intrinsics.checkNotNullParameter(dependencies, "dependencies");
        return (vie.a) dependencies.f13500c;
    }

    @Override // hhe.d
    public final g i() {
        return new g(this.f125933b, this.f125934c, 0);
    }

    @Override // hhe.d
    public final d j() {
        return new d(this.f125933b, this.f125934c, 0);
    }

    @Override // hhe.d
    public final j k() {
        return new j(this.f125933b, this.f125934c, 0);
    }

    @Override // hhe.d
    public final ImmutableSet l() {
        CoroutineScope scope = (CoroutineScope) this.d.get();
        hhe.a aVar = hhe.b.Companion;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(scope, "scope");
        efk.b bVar = new efk.b(scope, 1);
        ne0.j cache = (ne0.j) this.e.get();
        aVar.getClass();
        Intrinsics.checkNotNullParameter(cache, "cache");
        vc.s.k(cache);
        ue0.c storage = (ue0.c) this.f.get();
        aVar.getClass();
        Intrinsics.checkNotNullParameter(storage, "storage");
        vc.s.k(storage);
        ue0.c storage2 = (ue0.c) this.f125941p.get();
        Intrinsics.checkNotNullParameter(storage2, "storage");
        vc.s.k(storage2);
        return ImmutableSet.of((ue0.c) bVar, (ue0.c) cache, storage, storage2);
    }

    public final ImmutableMap m() {
        ImmutableMap.Builder builderBuilderWithExpectedSize = ImmutableMap.builderWithExpectedSize(13);
        ProductId productId = ProductId.CURRENCY;
        c cVar = this.f125933b;
        builderBuilderWithExpectedSize.put(productId, cVar.N0.get());
        builderBuilderWithExpectedSize.put(ProductId.ON_HOLD, cVar.O0.get());
        builderBuilderWithExpectedSize.put(ProductId.YOUTH, cVar.P0.get());
        builderBuilderWithExpectedSize.put(ProductId.TEEN, cVar.Q0.get());
        builderBuilderWithExpectedSize.put(ProductId.SUBACCOUNT, cVar.R0.get());
        builderBuilderWithExpectedSize.put(ProductId.SAVINGS, cVar.S0.get());
        builderBuilderWithExpectedSize.put(ProductId.CREDIT, cVar.T0.get());
        builderBuilderWithExpectedSize.put(ProductId.CREDIT_HUB, cVar.U0.get());
        builderBuilderWithExpectedSize.put(ProductId.LINKED, cVar.V0.get());
        builderBuilderWithExpectedSize.put(ProductId.PRO, cVar.W0.get());
        builderBuilderWithExpectedSize.put(ProductId.JOINT, cVar.X0.get());
        builderBuilderWithExpectedSize.put(ProductId.BEREAVEMENT, cVar.Y0.get());
        builderBuilderWithExpectedSize.put(ProductId.TOTAL_WEALTH, this.A.get());
        return builderBuilderWithExpectedSize.build();
    }

    public final y2 n() {
        y2 interactor = (y2) this.f125933b.f125987p.f174005c.get();
        vc.s.j(interactor);
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        return interactor;
    }

    public final jhe.l o() {
        c cVar = this.f125933b;
        x79.a aVarA = cVar.f125996w.a();
        vc.s.j(aVarA);
        y79.a aVarB = cVar.f125996w.b();
        vc.s.j(aVarB);
        return new jhe.l(aVarA, aVarB);
    }
}
