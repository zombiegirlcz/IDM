package o4a;

import efm.r;
import h3a.t;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import n14.k;
import vkm.q;
import wkm.l;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f222178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g3k.a f222179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ang.f f222180c;

    public c(t transferFeaturesProvider, g3k.a paymentVendorsInteractor, ang.f userInteractor) {
        Intrinsics.checkNotNullParameter(transferFeaturesProvider, "transferFeaturesProvider");
        Intrinsics.checkNotNullParameter(paymentVendorsInteractor, "paymentVendorsInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f222178a = transferFeaturesProvider;
        this.f222179b = paymentVendorsInteractor;
        this.f222180c = userInteractor;
    }

    public final l a(Set initialFilters) {
        Intrinsics.checkNotNullParameter(initialFilters, "initialFilters");
        r rVarX = this.f222178a.a().x();
        Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
        return q.H(new b(this, initialFilters, null, 0), yh5.b.e(rd0.e.b(rVarX), mo3.a.g(k.p(this.f222179b.a(), new o2g.f(20)), new nz7.g(29), null, 2), mo3.a.g(nim.a.v(rd0.e.n(rd0.e.b(this.f222180c.k(false)), h0.f322473a), new o2g.f(21)), null, new a(0), 1)));
    }
}
