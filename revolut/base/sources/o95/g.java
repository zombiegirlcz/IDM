package o95;

import ft3.d1;
import ft3.j1;
import grl.r2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import vkm.q;
import w4l.k;
import wkm.l;
import xq3.j;

/* JADX INFO: loaded from: classes21.dex */
public final class g extends qx4.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xoj.a f223079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f223080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t95.e f223081c;

    public g(xoj.a featuresInteractor, j creditApplicationInteractor, t95.e overdraftProductRepository) {
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        Intrinsics.checkNotNullParameter(creditApplicationInteractor, "creditApplicationInteractor");
        Intrinsics.checkNotNullParameter(overdraftProductRepository, "overdraftProductRepository");
        this.f223079a = featuresInteractor;
        this.f223080b = creditApplicationInteractor;
        this.f223081c = overdraftProductRepository;
    }

    @Override // qx4.i
    public final Flow c(k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return q.q(nim.a.v(l(loadingStrategy), new b(2)));
    }

    @Override // qx4.i
    public final Flow d() {
        return q.q(nim.a.v(rd0.e.b(((cpj.b) this.f223079a).k(yoj.c.OVERDRAFT_APPLICATION, yoj.d.DISABLED)), new b(3)));
    }

    @Override // qx4.f, qx4.i
    public final Flow f(r2 origin) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        return nim.a.y(super.f(origin), new b(4));
    }

    @Override // qx4.f
    public final Flow g(r2 origin, boolean z) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        return zi0.c.i(z ? g95.a.f141461a : g95.b.f141462a);
    }

    @Override // qx4.f
    public final Flow k(r2 origin) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        return nim.a.v(this.f223080b.k(mif.a.m(d1.Companion, j1.OVERDRAFT, null)), new f(origin, 0));
    }

    public final l l(k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return q.Q(h(loadingStrategy), new ns9.h(null, this, 17));
    }
}
