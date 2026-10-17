package afh;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.wealth.private_companies.api.ui.details.PrivateCompanyDetailsContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;
import n2h.g;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements efh.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f4072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PrivateCompanyDetailsContract$InputData f4073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f4074c;
    public final c d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f4075g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f4076h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f4077j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f4078l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f4079m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f4080n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f4081p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f4082q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f4083r;

    public c(e eVar, ViewController viewController, PrivateCompanyDetailsContract$InputData privateCompanyDetailsContract$InputData, g gVar) {
        this.f4074c = eVar;
        this.f4072a = gVar;
        this.f4073b = privateCompanyDetailsContract$InputData;
        this.e = e4m.b.b(new a1e.c(eVar, this, 2, 6));
        this.f = e4m.b.b(new a1e.c(eVar, this, 1, 6));
        this.f4075g = e4m.b.b(new a1e.c(eVar, this, 0, 6));
        this.f4076h = e4m.b.b(e4m.c.a(viewController));
        this.i = e4m.b.b(new a1e.c(eVar, this, 5, 6));
        this.f4077j = e4m.b.b(new a1e.c(eVar, this, 4, 6));
        this.k = e4m.b.b(new a1e.c(eVar, this, 3, 6));
        this.f4078l = e4m.b.b(new a1e.c(eVar, this, 6, 6));
        this.f4079m = e4m.b.b(new a1e.c(eVar, this, 7, 6));
        this.f4080n = e4m.b.b(new a1e.c(eVar, this, 9, 6));
        this.o = e4m.b.b(new a1e.c(eVar, this, 8, 6));
        this.f4081p = e4m.b.b(new a1e.c(eVar, this, 11, 6));
        this.f4082q = e4m.b.b(new a1e.c(eVar, this, 10, 6));
        this.f4083r = e4m.b.b(new a1e.c(eVar, this, 12, 6));
    }

    @Override // xki.e
    public final Set f() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(5);
        builderBuilderWithExpectedSize.add(this.f4078l.get());
        builderBuilderWithExpectedSize.addAll((Iterable) this.f4079m.get());
        builderBuilderWithExpectedSize.add(this.o.get());
        builderBuilderWithExpectedSize.add(this.f4082q.get());
        return j6.a.g(this.f, builderBuilderWithExpectedSize);
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f4075g.get(), (yji.d) this.k.get());
    }
}
