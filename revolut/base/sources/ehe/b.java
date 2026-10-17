package ehe;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.tab.accounts.models.ProductId;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import tsk.t;
import vge.b1;
import vge.d2;
import vge.e2;
import vge.m0;
import vge.u0;
import vge.y2;
import vge.z2;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements hhe.d {
    public final e4m.e A;
    public final e4m.e B;
    public final e4m.e C;
    public final e4m.e D;
    public final e4m.e E;
    public final e4m.e F;
    public final e4m.e G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b9k.f f125949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f125950b;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f125952g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f125953h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f125954j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f125955l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f125957n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f125958p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f125959q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f125960r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f125961s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f125962t;
    public final e4m.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e4m.e f125963w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e4m.e f125964x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final e4m.e f125965y;
    public final e4m.e z;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f125951c = this;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.a f125956m = new e4m.a();
    public final e4m.a u = new e4m.a();

    public b(c cVar, b9k.f fVar) {
        this.f125950b = cVar;
        this.f125949a = fVar;
        int i = 6;
        this.d = e4m.b.b(new ea2.p(cVar, this, 1, i));
        this.e = e4m.b.b(new ea2.p(cVar, this, 4, i));
        this.f = e4m.b.b(new ea2.p(cVar, this, 6, i));
        this.f125952g = e4m.b.b(new ea2.p(cVar, this, 5, i));
        this.f125953h = e4m.b.b(new ea2.p(cVar, this, 3, i));
        this.i = e4m.b.b(new ea2.p(cVar, this, 7, i));
        this.f125954j = e4m.b.b(new ea2.p(cVar, this, 9, i));
        this.k = e4m.b.b(new ea2.p(cVar, this, 8, i));
        this.f125955l = e4m.b.b(new ea2.p(cVar, this, 13, i));
        this.f125957n = e4m.b.b(new ea2.p(cVar, this, 16, i));
        this.o = e4m.b.b(new ea2.p(cVar, this, 17, i));
        this.f125958p = e4m.b.b(new ea2.p(cVar, this, 19, i));
        this.f125959q = e4m.b.b(new ea2.p(cVar, this, 18, i));
        this.f125960r = e4m.b.b(new ea2.p(cVar, this, 20, i));
        this.f125961s = e4m.b.b(new ea2.p(cVar, this, 21, i));
        this.f125962t = e4m.b.b(new ea2.p(cVar, this, 22, i));
        this.v = e4m.b.b(new ea2.p(cVar, this, 15, i));
        this.f125963w = e4m.b.b(new ea2.p(cVar, this, 14, i));
        e4m.a.a(this.f125956m, e4m.b.b(new ea2.p(cVar, this, 12, i)));
        this.f125964x = e4m.b.b(new ea2.p(cVar, this, 23, i));
        this.f125965y = e4m.b.b(new ea2.p(cVar, this, 11, i));
        e4m.a.a(this.u, e4m.b.b(new ea2.p(cVar, this, 10, i)));
        this.z = e4m.b.b(new ea2.p(cVar, this, 2, i));
        this.A = e4m.b.b(new ea2.p(cVar, this, 25, i));
        this.B = e4m.b.b(new ea2.p(cVar, this, 24, i));
        this.C = e4m.b.b(new ea2.p(cVar, this, 26, i));
        this.D = e4m.b.b(new ea2.p(cVar, this, 0, i));
        this.E = e4m.b.b(new ea2.p(cVar, this, 27, i));
        this.F = e4m.b.b(new ea2.p(cVar, this, 28, i));
        this.G = e4m.b.b(new ea2.p(cVar, this, 29, i));
    }

    @Override // hhe.d
    public final u0 a() {
        return new u0((vge.d) this.D.get());
    }

    @Override // hhe.d
    public final m b() {
        return new m(this.f125950b, this.f125951c, 1);
    }

    @Override // hhe.d
    public final she.d c() {
        return new she.d((vge.d) this.D.get(), (z2) this.B.get());
    }

    @Override // hhe.d
    public final d2 d() {
        return new d2((e2) this.f125953h.get());
    }

    @Override // hhe.d
    public final zfe.b e() {
        return (zfe.b) this.E.get();
    }

    @Override // hhe.d
    public final b1 f() {
        return new b1(o(), (e2) this.f125953h.get(), (vge.d) this.D.get());
    }

    @Override // hhe.d
    public final xge.a g() {
        return (xge.a) this.z.get();
    }

    @Override // hhe.d
    public final rfe.a h() {
        sge.b.Companion.getClass();
        b9k.f dependencies = this.f125949a;
        Intrinsics.checkNotNullParameter(dependencies, "dependencies");
        return (nge.b) dependencies.f13816a;
    }

    @Override // hhe.d
    public final g i() {
        return new g(this.f125950b, this.f125951c, 1);
    }

    @Override // hhe.d
    public final d j() {
        return new d(this.f125950b, this.f125951c, 1);
    }

    @Override // hhe.d
    public final j k() {
        return new j(this.f125950b, this.f125951c, 1);
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
        ue0.c storage2 = (ue0.c) this.f125958p.get();
        Intrinsics.checkNotNullParameter(storage2, "storage");
        vc.s.k(storage2);
        return ImmutableSet.of((ue0.c) bVar, (ue0.c) cache, storage, storage2);
    }

    public final m0 m() {
        sge.b.Companion.getClass();
        b9k.f dependencies = this.f125949a;
        Intrinsics.checkNotNullParameter(dependencies, "dependencies");
        return new m0(new t((qm.e) dependencies.f), (ne0.j) this.e.get());
    }

    public final ImmutableMap n() {
        ImmutableMap.Builder builderBuilderWithExpectedSize = ImmutableMap.builderWithExpectedSize(13);
        ProductId productId = ProductId.CURRENCY;
        c cVar = this.f125950b;
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

    public final y2 o() {
        y2 interactor = (y2) this.f125950b.f125987p.f174004b.get();
        vc.s.j(interactor);
        sge.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        return interactor;
    }

    public final jhe.l p() {
        c cVar = this.f125950b;
        x79.a aVarA = cVar.f125996w.a();
        vc.s.j(aVarA);
        y79.a aVarB = cVar.f125996w.b();
        vc.s.j(aVarB);
        return new jhe.l(aVarA, aVarB);
    }
}
