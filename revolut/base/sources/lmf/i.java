package lmf;

import chc.c0;
import cmf.p;
import elf.s0;
import hmf.k0;
import kkf.k1;
import kkf.m5;
import kkf.o1;
import kkf.o2;
import kkf.s7;
import kkf.x5;
import kkf.y0;
import klf.h0;
import klf.u0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.SharedFlow;
import pkf.d2;
import pkf.h2;
import pkf.k2;
import pkf.n2;
import pkf.x;
import pkf.y1;
import vkm.q;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class i extends hmf.a {
    public final h0 e;
    public final ou5.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final amf.a f197027g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final amf.c f197028h;
    public final s7 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final o2 f197029j;
    public final y0 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final n2 f197030l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final k1 f197031m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final y1 f197032n;
    public final d2 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final k2 f197033p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final kkf.e f197034q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final o1 f197035r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final h2 f197036s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final clf.a f197037t;
    public final hlf.e u;

    public i(h0 commonDataSource, ou5.b headerProvider, amf.a adjustForAnalyticsMenuOptionProvider, amf.c hideTransactionMenuOptionProvider, s7 suspiciousTransactionBlockProvider, o2 limitExceededBlockProvider, y0 equivalentBlockProvider, n2 cryptoWithdrawTrackingBlockProvider, k1 fromBlockProvider, y1 cryptoWithdrawBlockchainBlockProvider, d2 cryptoWithdrawDetailsBlockProvider, k2 cryptoWithdrawLinkedTransactionBlockProvider, kkf.e analyticsBlockProvider, o1 getHelpBlockProvider, h2 cryptoWithdrawFooterBlockProvider, clf.a slotBlockProvider, hlf.e clickHandler) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(headerProvider, "headerProvider");
        Intrinsics.checkNotNullParameter(adjustForAnalyticsMenuOptionProvider, "adjustForAnalyticsMenuOptionProvider");
        Intrinsics.checkNotNullParameter(hideTransactionMenuOptionProvider, "hideTransactionMenuOptionProvider");
        Intrinsics.checkNotNullParameter(suspiciousTransactionBlockProvider, "suspiciousTransactionBlockProvider");
        Intrinsics.checkNotNullParameter(limitExceededBlockProvider, "limitExceededBlockProvider");
        Intrinsics.checkNotNullParameter(equivalentBlockProvider, "equivalentBlockProvider");
        Intrinsics.checkNotNullParameter(cryptoWithdrawTrackingBlockProvider, "cryptoWithdrawTrackingBlockProvider");
        Intrinsics.checkNotNullParameter(fromBlockProvider, "fromBlockProvider");
        Intrinsics.checkNotNullParameter(cryptoWithdrawBlockchainBlockProvider, "cryptoWithdrawBlockchainBlockProvider");
        Intrinsics.checkNotNullParameter(cryptoWithdrawDetailsBlockProvider, "cryptoWithdrawDetailsBlockProvider");
        Intrinsics.checkNotNullParameter(cryptoWithdrawLinkedTransactionBlockProvider, "cryptoWithdrawLinkedTransactionBlockProvider");
        Intrinsics.checkNotNullParameter(analyticsBlockProvider, "analyticsBlockProvider");
        Intrinsics.checkNotNullParameter(getHelpBlockProvider, "getHelpBlockProvider");
        Intrinsics.checkNotNullParameter(cryptoWithdrawFooterBlockProvider, "cryptoWithdrawFooterBlockProvider");
        Intrinsics.checkNotNullParameter(slotBlockProvider, "slotBlockProvider");
        Intrinsics.checkNotNullParameter(clickHandler, "clickHandler");
        this.e = commonDataSource;
        this.f = headerProvider;
        this.f197027g = adjustForAnalyticsMenuOptionProvider;
        this.f197028h = hideTransactionMenuOptionProvider;
        this.i = suspiciousTransactionBlockProvider;
        this.f197029j = limitExceededBlockProvider;
        this.k = equivalentBlockProvider;
        this.f197030l = cryptoWithdrawTrackingBlockProvider;
        this.f197031m = fromBlockProvider;
        this.f197032n = cryptoWithdrawBlockchainBlockProvider;
        this.o = cryptoWithdrawDetailsBlockProvider;
        this.f197033p = cryptoWithdrawLinkedTransactionBlockProvider;
        this.f197034q = analyticsBlockProvider;
        this.f197035r = getHelpBlockProvider;
        this.f197036s = cryptoWithdrawFooterBlockProvider;
        this.f197037t = slotBlockProvider;
        this.u = clickHandler;
    }

    @Override // hmf.b0
    public final Flow a() {
        p pVarZ2 = this.f197037t.Z2();
        p pVarZ22 = this.i.Z2();
        p pVarZ23 = this.f197029j.Z2();
        p pVarA = this.k.a();
        n2 n2Var = this.f197030l;
        klf.y0 y0Var = n2Var.f237099l;
        SharedFlow sharedFlowD = y0Var.f185608a.d();
        u0 u0Var = klf.y0.Companion;
        x5 x5Var = new x5(sharedFlowD, 13);
        jmc.e eVar = new jmc.e(y0Var, null, 3);
        u0Var.getClass();
        p pVar = new p(new oi3.g(q.J(sharedFlowD, q.Q(q.q(x5Var), new m5(null, eVar))), n2Var.f237101n, 29), new pgk.f(n2Var, 10), u.c(n2Var), "CryptoWithdrawTracking");
        p pVarA2 = k0.a(this.f197031m.Z2());
        y1 y1Var = this.f197032n;
        p pVar2 = new p(q.Q(y1Var.f237159l.d(), new x(null, y1Var, 3)), new c0(23), u.c(y1Var.f237162p), "CryptoWithdrawBlockchain");
        d2 d2Var = this.o;
        h0 h0Var = d2Var.f237039l;
        p pVar3 = new p(new oi3.g(yh5.b.d(h0Var.d(), h0Var.c()), d2Var, 27), new pgk.f(d2Var, 9), v.k(d2Var, d2Var.f237042p), "CryptoWithdrawDetails");
        k2 k2Var = this.f197033p;
        h0 h0Var2 = k2Var.f237087l;
        p pVar4 = new p(new oi3.g(yh5.b.d(h0Var2.d(), h0Var2.j()), k2Var, 28), new pka.c(14), u.c(k2Var.f237089n), "CryptoWithdrawLinkedTransaction");
        p pVarZ24 = this.f197034q.Z2();
        p pVarA3 = this.f197035r.a();
        h2 h2Var = this.f197036s;
        rhf.d dVar = h2Var.f237071q;
        return h(v.k(pVarZ2, pVarZ22, pVarZ23, pVarA, pVar, pVarA2, pVar2, pVar3, pVar4, pVarZ24, pVarA3, new p(q.Q(h2Var.f237067l.d(), new bbg.c0((Continuation) null, dVar == rhf.d.CRYPTO || dVar == rhf.d.PAYMENTS_CHAT, h2Var, 5)), new c0(23), u.c(h2Var), "CryptoWithdrawFooter")));
    }

    @Override // hmf.b0
    public final Flow b() {
        ou5.b bVar = this.f;
        return q.q(ta6.a.h(((jt0.b) bVar.f229819a).A0(false), ((h0) bVar.f229820b).d(), rd0.e.b(((ap5.b) bVar.f229821c).g()), new rlf.e(bVar, null)));
    }

    @Override // hmf.b0
    public final s0 c() {
        return this.u;
    }

    @Override // hmf.b0
    public final Flow d() {
        return new go.g(f0.f322471a, 2);
    }

    @Override // hmf.b0
    public final Flow e() {
        return g(v.k(this.f197027g.a(), this.f197028h.a()));
    }

    @Override // hmf.a
    public final h0 i() {
        return this.e;
    }
}
