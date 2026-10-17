package mmf;

import chc.c0;
import cmf.p;
import go.g;
import hmf.k0;
import kkf.l8;
import kkf.o1;
import klf.h0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import pkg.e;
import qkf.d;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends hmf.a {
    public final h0 e;
    public final slf.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final amf.c f207206g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l8 f207207h;
    public final d i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final o1 f207208j;

    public a(h0 commonDataSource, slf.c headerProvider, amf.c hideTransactionMenuOptionProvider, l8 toAccountBlockProvider, d detailsBlockProvider, o1 getHelpBlockProvider) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(headerProvider, "headerProvider");
        Intrinsics.checkNotNullParameter(hideTransactionMenuOptionProvider, "hideTransactionMenuOptionProvider");
        Intrinsics.checkNotNullParameter(toAccountBlockProvider, "toAccountBlockProvider");
        Intrinsics.checkNotNullParameter(detailsBlockProvider, "detailsBlockProvider");
        Intrinsics.checkNotNullParameter(getHelpBlockProvider, "getHelpBlockProvider");
        this.e = commonDataSource;
        this.f = headerProvider;
        this.f207206g = hideTransactionMenuOptionProvider;
        this.f207207h = toAccountBlockProvider;
        this.i = detailsBlockProvider;
        this.f207208j = getHelpBlockProvider;
    }

    @Override // hmf.b0
    public final Flow a() {
        p pVarA = k0.a(this.f207207h.Z2());
        d dVar = this.i;
        return h(v.k(pVarA, new p(new e(dVar.f246991a.d(), dVar, 26), new c0(23), u.c(dVar.f246993c), "DeFiDepositDetails"), this.f207208j.a()));
    }

    @Override // hmf.b0
    public final Flow b() {
        return this.f.a();
    }

    @Override // hmf.b0
    public final Flow d() {
        return new g(f0.f322471a, 2);
    }

    @Override // hmf.b0
    public final Flow e() {
        return g(u.c(this.f207206g.a()));
    }

    @Override // hmf.a
    public final h0 i() {
        return this.e;
    }
}
