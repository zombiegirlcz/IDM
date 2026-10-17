package pmf;

import amf.c;
import dkf.g;
import hmf.k0;
import jt0.b;
import kkf.b5;
import kkf.e;
import kkf.i7;
import kkf.k1;
import kkf.k7;
import kkf.o1;
import kkf.s7;
import kkf.t5;
import kkf.y1;
import kkf.z3;
import klf.h0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import nof.i;
import pj9.n;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends hmf.a {
    public final h0 e;
    public final i f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f237553g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final amf.a f237554h;
    public final c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final g f237555j;
    public final e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final xkf.e f237556l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final k1 f237557m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final o1 f237558n;
    public final y1 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final z3 f237559p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b5 f237560q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final t5 f237561r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i7 f237562s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final k7 f237563t;
    public final s7 u;

    public a(h0 commonDataSource, i transactionStatisticsProvider, b commonHeaderProvider, amf.a adjustForAnalyticsMenuOptionProvider, c hideTransactionMenuOptionProvider, g loyaltyActionsProvider, e analyticsBlockProvider, xkf.e bankTransferPaymentBreakdownBlockProvider, k1 fromBlockProvider, o1 getHelpBlockProvider, y1 initiatorBlockProvider, z3 originalTransactionBlockProvider, b5 refundsBlockProvider, t5 revPointsBlockProvider, i7 statisticsBlockProvider, k7 statusBlockProvider, s7 suspiciousTransactionBlockProvider) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(transactionStatisticsProvider, "transactionStatisticsProvider");
        Intrinsics.checkNotNullParameter(commonHeaderProvider, "commonHeaderProvider");
        Intrinsics.checkNotNullParameter(adjustForAnalyticsMenuOptionProvider, "adjustForAnalyticsMenuOptionProvider");
        Intrinsics.checkNotNullParameter(hideTransactionMenuOptionProvider, "hideTransactionMenuOptionProvider");
        Intrinsics.checkNotNullParameter(loyaltyActionsProvider, "loyaltyActionsProvider");
        Intrinsics.checkNotNullParameter(analyticsBlockProvider, "analyticsBlockProvider");
        Intrinsics.checkNotNullParameter(bankTransferPaymentBreakdownBlockProvider, "bankTransferPaymentBreakdownBlockProvider");
        Intrinsics.checkNotNullParameter(fromBlockProvider, "fromBlockProvider");
        Intrinsics.checkNotNullParameter(getHelpBlockProvider, "getHelpBlockProvider");
        Intrinsics.checkNotNullParameter(initiatorBlockProvider, "initiatorBlockProvider");
        Intrinsics.checkNotNullParameter(originalTransactionBlockProvider, "originalTransactionBlockProvider");
        Intrinsics.checkNotNullParameter(refundsBlockProvider, "refundsBlockProvider");
        Intrinsics.checkNotNullParameter(revPointsBlockProvider, "revPointsBlockProvider");
        Intrinsics.checkNotNullParameter(statisticsBlockProvider, "statisticsBlockProvider");
        Intrinsics.checkNotNullParameter(statusBlockProvider, "statusBlockProvider");
        Intrinsics.checkNotNullParameter(suspiciousTransactionBlockProvider, "suspiciousTransactionBlockProvider");
        this.e = commonDataSource;
        this.f = transactionStatisticsProvider;
        this.f237553g = commonHeaderProvider;
        this.f237554h = adjustForAnalyticsMenuOptionProvider;
        this.i = hideTransactionMenuOptionProvider;
        this.f237555j = loyaltyActionsProvider;
        this.k = analyticsBlockProvider;
        this.f237556l = bankTransferPaymentBreakdownBlockProvider;
        this.f237557m = fromBlockProvider;
        this.f237558n = getHelpBlockProvider;
        this.o = initiatorBlockProvider;
        this.f237559p = originalTransactionBlockProvider;
        this.f237560q = refundsBlockProvider;
        this.f237561r = revPointsBlockProvider;
        this.f237562s = statisticsBlockProvider;
        this.f237563t = statusBlockProvider;
        this.u = suspiciousTransactionBlockProvider;
    }

    @Override // hmf.b0
    public final Flow a() {
        return h(v.k(this.f237560q.Z2(), this.u.Z2(), k0.a(this.f237563t.a(), this.o.a(), this.f237557m.Z2(), this.f237561r.Z2()), this.f237556l.b(), k0.a(this.k.Z2(), this.f237562s.Z2(this.f)), this.f237559p.c3(new n(26)), this.f237558n.a()));
    }

    @Override // hmf.b0
    public final Flow b() {
        return this.f237553g.A0(false);
    }

    @Override // hmf.b0
    public final Flow d() {
        return f(u.c(this.f237555j.Z2()));
    }

    @Override // hmf.b0
    public final Flow e() {
        return g(v.k(this.f237554h.a(), this.i.a()));
    }

    @Override // hmf.a
    public final h0 i() {
        return this.e;
    }
}
