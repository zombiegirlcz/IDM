package qmf;

import amf.c;
import chc.c0;
import cmf.p;
import go.g;
import hmf.k0;
import jt0.b;
import kkf.d0;
import kkf.e;
import kkf.k7;
import klf.h0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import vkm.q;
import wje.m;
import wkf.d;
import wkf.f;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends hmf.a {
    public final h0 e;
    public final b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final amf.a f247819g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c f247820h;
    public final k7 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d0 f247821j;
    public final f k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final d f247822l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e f247823m;

    public a(h0 commonDataSource, b commonHeaderProvider, amf.a adjustForAnalyticsMenuOptionProvider, c hideTransactionMenuOptionProvider, k7 statusBlockProvider, d0 confirmationBlockProvider, f payLaterTransferRepaymentBlockProvider, d payLaterTransferRelatedBlockProvider, e analyticsBlockProvider) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(commonHeaderProvider, "commonHeaderProvider");
        Intrinsics.checkNotNullParameter(adjustForAnalyticsMenuOptionProvider, "adjustForAnalyticsMenuOptionProvider");
        Intrinsics.checkNotNullParameter(hideTransactionMenuOptionProvider, "hideTransactionMenuOptionProvider");
        Intrinsics.checkNotNullParameter(statusBlockProvider, "statusBlockProvider");
        Intrinsics.checkNotNullParameter(confirmationBlockProvider, "confirmationBlockProvider");
        Intrinsics.checkNotNullParameter(payLaterTransferRepaymentBlockProvider, "payLaterTransferRepaymentBlockProvider");
        Intrinsics.checkNotNullParameter(payLaterTransferRelatedBlockProvider, "payLaterTransferRelatedBlockProvider");
        Intrinsics.checkNotNullParameter(analyticsBlockProvider, "analyticsBlockProvider");
        this.e = commonDataSource;
        this.f = commonHeaderProvider;
        this.f247819g = adjustForAnalyticsMenuOptionProvider;
        this.f247820h = hideTransactionMenuOptionProvider;
        this.i = statusBlockProvider;
        this.f247821j = confirmationBlockProvider;
        this.k = payLaterTransferRepaymentBlockProvider;
        this.f247822l = payLaterTransferRelatedBlockProvider;
        this.f247823m = analyticsBlockProvider;
    }

    @Override // hmf.b0
    public final Flow a() {
        p pVarA = k0.a(this.i.a(), this.f247821j.a());
        f fVar = this.k;
        h0 h0Var = fVar.f298278l;
        p pVar = new p(new t38.e(h0Var.d(), 24, h0Var.j(), new sne.e(fVar, (Continuation) null, 27)), new c0(23), u.c(fVar), "PayLaterTransferRepayment");
        d dVar = this.f247822l;
        return h(v.k(pVarA, pVar, new p(q.Q(yh5.b.d(dVar.f298275l.h(new m(20)), new vy5.d0(dVar.f298276m.a(), 6)), new w2a.q((Continuation) null, dVar, 16)), new c0(23), u.c(dVar), "PayLaterTransferRelated"), this.f247823m.Z2()));
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
        return g(v.k(this.f247819g.a(), this.f247820h.a()));
    }

    @Override // hmf.a
    public final h0 i() {
        return this.e;
    }
}
