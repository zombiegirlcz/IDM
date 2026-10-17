package lmf;

import cmf.p;
import hmf.k0;
import kkf.d0;
import kkf.i0;
import kkf.o1;
import kkf.s0;
import klf.h0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import zhm.f0;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends hmf.a {
    public final h0 e;
    public final jt0.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d0 f197006g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final s0 f197007h;
    public final o1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final clf.a f197008j;

    public e(h0 commonDataSource, jt0.b commonHeaderProvider, d0 confirmationBlockProvider, s0 doxgetyRewardAmountBlockProvider, o1 getHelpBlockProvider, clf.a slotBlockProvider) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(commonHeaderProvider, "commonHeaderProvider");
        Intrinsics.checkNotNullParameter(confirmationBlockProvider, "confirmationBlockProvider");
        Intrinsics.checkNotNullParameter(doxgetyRewardAmountBlockProvider, "doxgetyRewardAmountBlockProvider");
        Intrinsics.checkNotNullParameter(getHelpBlockProvider, "getHelpBlockProvider");
        Intrinsics.checkNotNullParameter(slotBlockProvider, "slotBlockProvider");
        this.e = commonDataSource;
        this.f = commonHeaderProvider;
        this.f197006g = confirmationBlockProvider;
        this.f197007h = doxgetyRewardAmountBlockProvider;
        this.i = getHelpBlockProvider;
        this.f197008j = slotBlockProvider;
    }

    @Override // hmf.b0
    public final Flow a() {
        p pVarZ2 = this.f197008j.Z2();
        p pVarA = k0.a(this.f197006g.a());
        s0 s0Var = this.f197007h;
        return h(v.k(pVarZ2, pVarA, new p(new kh4.f(s0Var.f184924l.d(), s0Var, 7), new i0(2), f0.f322471a, "DoxgetyRewardAmount"), this.i.a()));
    }

    @Override // hmf.b0
    public final Flow b() {
        return this.f.A0(false);
    }

    @Override // hmf.b0
    public final Flow d() {
        return new go.g(f0.f322471a, 2);
    }

    @Override // hmf.b0
    public final Flow e() {
        return new go.g(f0.f322471a, 2);
    }

    @Override // hmf.a
    public final h0 i() {
        return this.e;
    }
}
