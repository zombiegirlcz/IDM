package lmf;

import amf.o;
import chc.c0;
import cmf.p;
import hd.r;
import hmf.k0;
import kkf.i9;
import kkf.l8;
import kkf.m5;
import kkf.o1;
import kkf.y0;
import klf.h0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import pdi.j;
import pkf.a1;
import pkf.d0;
import pkf.e1;
import pkf.i0;
import pkf.l0;
import pkf.p1;
import pkf.q0;
import pkf.s0;
import pkf.v2;
import pkf.w0;
import pkf.x;
import pkf.z;
import vkm.q;
import vkm.y;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends hmf.a {
    public final h0 e;
    public final r f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i9 f196992g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final amf.a f196993h;
    public final amf.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p1 f196994j;
    public final y0 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final w0 f196995l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final a1 f196996m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final q0 f196997n;
    public final z o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final v2 f196998p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e1 f196999q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final l8 f197000r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final d0 f197001s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final i0 f197002t;
    public final o u;
    public final kkf.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final o1 f197003w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final clf.a f197004x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final hlf.b f197005y;

    public d(h0 commonDataSource, r headerProvider, i9 userCommentBlockProvider, amf.a adjustForAnalyticsMenuOptionProvider, amf.c hideTransactionMenuOptionProvider, p1 cryptoRemittanceUpdateAppBannerBlockProvider, y0 equivalentBlockProvider, w0 cryptoDepositTfrMeshVerificationBlockProvider, a1 tfrSenderDetailsBlockProvider, q0 cryptoDepositTfrAdditionalInfoBlockProvider, z cryptoDepositBelowMinimumWarningBlockProvider, v2 returnCryptoDepositBannerBlockProvider, e1 cryptoDepositTrackingBlockProvider, l8 toAccountBlockProvider, d0 cryptoDepositDetailsBlockProvider, i0 cryptoDepositOfframpBlockProvider, o userCommentMenuOptionProvider, kkf.e analyticsBlockProvider, o1 getHelpBlockProvider, clf.a slotBlockProvider, hlf.b clickHandler) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(headerProvider, "headerProvider");
        Intrinsics.checkNotNullParameter(userCommentBlockProvider, "userCommentBlockProvider");
        Intrinsics.checkNotNullParameter(adjustForAnalyticsMenuOptionProvider, "adjustForAnalyticsMenuOptionProvider");
        Intrinsics.checkNotNullParameter(hideTransactionMenuOptionProvider, "hideTransactionMenuOptionProvider");
        Intrinsics.checkNotNullParameter(cryptoRemittanceUpdateAppBannerBlockProvider, "cryptoRemittanceUpdateAppBannerBlockProvider");
        Intrinsics.checkNotNullParameter(equivalentBlockProvider, "equivalentBlockProvider");
        Intrinsics.checkNotNullParameter(cryptoDepositTfrMeshVerificationBlockProvider, "cryptoDepositTfrMeshVerificationBlockProvider");
        Intrinsics.checkNotNullParameter(tfrSenderDetailsBlockProvider, "tfrSenderDetailsBlockProvider");
        Intrinsics.checkNotNullParameter(cryptoDepositTfrAdditionalInfoBlockProvider, "cryptoDepositTfrAdditionalInfoBlockProvider");
        Intrinsics.checkNotNullParameter(cryptoDepositBelowMinimumWarningBlockProvider, "cryptoDepositBelowMinimumWarningBlockProvider");
        Intrinsics.checkNotNullParameter(returnCryptoDepositBannerBlockProvider, "returnCryptoDepositBannerBlockProvider");
        Intrinsics.checkNotNullParameter(cryptoDepositTrackingBlockProvider, "cryptoDepositTrackingBlockProvider");
        Intrinsics.checkNotNullParameter(toAccountBlockProvider, "toAccountBlockProvider");
        Intrinsics.checkNotNullParameter(cryptoDepositDetailsBlockProvider, "cryptoDepositDetailsBlockProvider");
        Intrinsics.checkNotNullParameter(cryptoDepositOfframpBlockProvider, "cryptoDepositOfframpBlockProvider");
        Intrinsics.checkNotNullParameter(userCommentMenuOptionProvider, "userCommentMenuOptionProvider");
        Intrinsics.checkNotNullParameter(analyticsBlockProvider, "analyticsBlockProvider");
        Intrinsics.checkNotNullParameter(getHelpBlockProvider, "getHelpBlockProvider");
        Intrinsics.checkNotNullParameter(slotBlockProvider, "slotBlockProvider");
        Intrinsics.checkNotNullParameter(clickHandler, "clickHandler");
        this.e = commonDataSource;
        this.f = headerProvider;
        this.f196992g = userCommentBlockProvider;
        this.f196993h = adjustForAnalyticsMenuOptionProvider;
        this.i = hideTransactionMenuOptionProvider;
        this.f196994j = cryptoRemittanceUpdateAppBannerBlockProvider;
        this.k = equivalentBlockProvider;
        this.f196995l = cryptoDepositTfrMeshVerificationBlockProvider;
        this.f196996m = tfrSenderDetailsBlockProvider;
        this.f196997n = cryptoDepositTfrAdditionalInfoBlockProvider;
        this.o = cryptoDepositBelowMinimumWarningBlockProvider;
        this.f196998p = returnCryptoDepositBannerBlockProvider;
        this.f196999q = cryptoDepositTrackingBlockProvider;
        this.f197000r = toAccountBlockProvider;
        this.f197001s = cryptoDepositDetailsBlockProvider;
        this.f197002t = cryptoDepositOfframpBlockProvider;
        this.u = userCommentMenuOptionProvider;
        this.v = analyticsBlockProvider;
        this.f197003w = getHelpBlockProvider;
        this.f197004x = slotBlockProvider;
        this.f197005y = clickHandler;
    }

    @Override // hmf.b0
    public final Flow a() {
        p pVarZ2 = this.f197004x.Z2();
        p1 p1Var = this.f196994j;
        p pVar = new p(new oi3.g(q.Q(p1Var.f237106l.d(), new x(null, p1Var, 2)), p1Var, 25), new c0(23), u.c(p1Var), "CryptoRemittanceUpdateAppBanner");
        p pVarA = this.k.a();
        w0 w0Var = this.f196995l;
        p pVar2 = new p(q.Q(w0Var.f237149r, new s0(null, w0Var, 0)), new pka.c(9), v.k(w0Var, w0Var.o), "CryptoDepositTfrFundsOnHold");
        a1 a1Var = this.f196996m;
        p pVar3 = new p(q.Q(a1Var.f237018p, new pkf.y0(null, a1Var, 0)), new pka.c(10), u.c(a1Var), "CryptoDepositTfrSenderDetails");
        q0 q0Var = this.f196997n;
        p pVar4 = new p(q.Q(q0Var.f237118r, new l0(null, q0Var, 0)), new pka.c(8), v.k(q0Var, q0Var.o), "CryptoDepositTfrAdditionalInfo");
        z zVar = this.o;
        p pVar5 = new p(q.Q(zVar.f237163l.d(), new x(null, zVar, 0)), new c0(23), u.c(zVar), "CryptoDepositBelowMinimumWarning");
        v2 v2Var = this.f196998p;
        p pVar6 = new p(q.Q(v2Var.f237141l.d(), new x(null, v2Var, 4)), new c0(23), u.c(v2Var), "ReturnCryptoDepositBanner");
        e1 e1Var = this.f196999q;
        klf.y0 y0Var = e1Var.f237044l;
        p pVar7 = new p(new y(new j(e1Var, null, 21), new oi3.g(q.Q(y0Var.f185608a.d(), new m5(null, y0Var, 17)), e1Var.f237046n, 24)), new c0(23), u.c(e1Var), "CryptoDepositTracking");
        p pVarA2 = k0.a(this.f197000r.Z2());
        d0 d0Var = this.f197001s;
        p pVar8 = new p(new y(new j(d0Var, null, 20), q.Q(d0Var.f237030l.d(), new x(null, d0Var, 1))), new c0(23), v.k(d0Var.f237035r, d0Var.f237034q), "CryptoDepositDetails");
        i0 i0Var = this.f197002t;
        h0 h0Var = i0Var.f237073l;
        p[] elements = {pVarZ2, pVar, pVarA, pVar2, pVar3, pVar4, pVar5, pVar6, pVar7, pVarA2, pVar8, new p(new oi3.g(yh5.b.d(h0Var.d(), h0Var.c()), i0Var, 23), new c0(23), v.k(i0Var, i0Var.f237077q), "CryptoDepositOfframp"), this.f196992g.a(), this.v.Z2(), this.f197003w.a()};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return h(kotlin.collections.d.L(elements));
    }

    @Override // hmf.b0
    public final Flow b() {
        r rVar = this.f;
        return q.q(ta6.a.g(((jt0.b) rVar.f151364a).A0(false), ((h0) rVar.f151365b).d(), rd0.e.b(((ap5.b) rVar.f151366c).g()), nim.a.v(rd0.e.b(((fbj.a) rVar.d).c(w4l.h.f294642c)), new rj7.b(25)), new rlf.b(rVar, null)));
    }

    @Override // hmf.b0
    public final elf.s0 c() {
        return this.f197005y;
    }

    @Override // hmf.b0
    public final Flow d() {
        return new go.g(f0.f322471a, 2);
    }

    @Override // hmf.b0
    public final Flow e() {
        return q.Q(new lfg.d0(this.e.d(), 3), new li2.f(null, this, 3));
    }

    @Override // hmf.a
    public final h0 i() {
        return this.e;
    }
}
