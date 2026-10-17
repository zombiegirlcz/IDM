package omf;

import cmf.p;
import go.g;
import kkf.o1;
import kkf.v2;
import klf.h0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import ukf.f;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends hmf.a {
    public final h0 e;
    public final jt0.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final amf.c f226826g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f f226827h;
    public final v2 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final o1 f226828j;

    public b(h0 commonDataSource, jt0.b commonHeaderProvider, amf.c hideTransactionMenuOptionProvider, f futuresFundingBlockProvider, v2 linkedOrderBlockProvider, o1 getHelpBlockProvider) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(commonHeaderProvider, "commonHeaderProvider");
        Intrinsics.checkNotNullParameter(hideTransactionMenuOptionProvider, "hideTransactionMenuOptionProvider");
        Intrinsics.checkNotNullParameter(futuresFundingBlockProvider, "futuresFundingBlockProvider");
        Intrinsics.checkNotNullParameter(linkedOrderBlockProvider, "linkedOrderBlockProvider");
        Intrinsics.checkNotNullParameter(getHelpBlockProvider, "getHelpBlockProvider");
        this.e = commonDataSource;
        this.f = commonHeaderProvider;
        this.f226826g = hideTransactionMenuOptionProvider;
        this.f226827h = futuresFundingBlockProvider;
        this.i = linkedOrderBlockProvider;
        this.f226828j = getHelpBlockProvider;
    }

    @Override // hmf.b0
    public final Flow a() {
        f fVar = this.f226827h;
        return h(v.k(new p(new tse.c(fVar.f280739a.d(), fVar, 18), new ujb.v(12), f0.f322471a, "FuturesFunding"), this.f226828j.a(), this.i.Z2()));
    }

    @Override // hmf.b0
    public final Flow b() {
        return this.f.A0(false);
    }

    @Override // hmf.b0
    public final Flow d() {
        return new g(f0.f322471a, 2);
    }

    @Override // hmf.b0
    public final Flow e() {
        return g(u.c(this.f226826g.a()));
    }

    @Override // hmf.a
    public final h0 i() {
        return this.e;
    }
}
