package com.revolut.feature.trade_rev_points.impl.ui.screen.transfer;

import cli.y;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.data.model.Data;
import com.revolut.feature.trade_rev_points.models.TradeRevPointsRate;
import ffk.t;
import hx7.e;
import java.text.ParseException;
import kl.b0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.CoroutineScope;
import lxi.g;
import m18.n;
import m1c.o0;
import m2f.c;
import m2f.c0;
import m2f.e0;
import m2f.l;
import m2f.m;
import m2f.q;
import m2f.s;
import m2f.u;
import m2f.z;
import mra.d;
import nii.y0;
import nyb.i0;
import nyb.k;
import nyb.m0;
import oki.h;
import org.jetbrains.annotations.NotNull;
import qr0.i;
import vii.b;
import vkm.j2;
import zhm.h0;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends h implements q {

    @NotNull
    private static final u Companion = new u();
    public final t A;
    public final b0 B;
    public final CoroutineScope C;
    public boolean D;
    public final y E;
    public final com.revolut.kompot.navigable.vc.modal.a F;
    public final b G;
    public final b H;
    public final TradeRevPointsTransferScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final k f91164p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i f91165q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final tsk.t f91166r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final u1f.b f91167s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final c f91168t;
    public final wj0.a u;
    public final n60.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final m2f.a f91169w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final wub.a f91170x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final i0 f91171y;
    public final m0 z;

    public a(e0 stateMapper, i90.b uuidGenerator, TradeRevPointsTransferScreenContract$InputData inputData, k revPointsInteractor, i tradeRevPointsAgentsInteractor, tsk.t tradeRevPointsAccountsInteractor, u1f.b tradeRevPointsTopUpInteractor, c tradeRevPointsFormatter, wj0.a idempotencyKeyHolder, n60.a keyboardExtension, m2f.a pointsCalculator, wub.a revPointsBuyingFeatureInteractor, i0 revPointsProductEligibilityInteractor, m0 revPointsTransactionsInteractor, t pricingPlanInteractor, b0 errorDialogFactory, CoroutineScope appScope) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(uuidGenerator, "uuidGenerator");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(revPointsInteractor, "revPointsInteractor");
        Intrinsics.checkNotNullParameter(tradeRevPointsAgentsInteractor, "tradeRevPointsAgentsInteractor");
        Intrinsics.checkNotNullParameter(tradeRevPointsAccountsInteractor, "tradeRevPointsAccountsInteractor");
        Intrinsics.checkNotNullParameter(tradeRevPointsTopUpInteractor, "tradeRevPointsTopUpInteractor");
        Intrinsics.checkNotNullParameter(tradeRevPointsFormatter, "tradeRevPointsFormatter");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        Intrinsics.checkNotNullParameter(keyboardExtension, "keyboardExtension");
        Intrinsics.checkNotNullParameter(pointsCalculator, "pointsCalculator");
        Intrinsics.checkNotNullParameter(revPointsBuyingFeatureInteractor, "revPointsBuyingFeatureInteractor");
        Intrinsics.checkNotNullParameter(revPointsProductEligibilityInteractor, "revPointsProductEligibilityInteractor");
        Intrinsics.checkNotNullParameter(revPointsTransactionsInteractor, "revPointsTransactionsInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(errorDialogFactory, "errorDialogFactory");
        Intrinsics.checkNotNullParameter(appScope, "appScope");
        this.o = inputData;
        this.f91164p = revPointsInteractor;
        this.f91165q = tradeRevPointsAgentsInteractor;
        this.f91166r = tradeRevPointsAccountsInteractor;
        this.f91167s = tradeRevPointsTopUpInteractor;
        this.f91168t = tradeRevPointsFormatter;
        this.u = idempotencyKeyHolder;
        this.v = keyboardExtension;
        this.f91169w = pointsCalculator;
        this.f91170x = revPointsBuyingFeatureInteractor;
        this.f91171y = revPointsProductEligibilityInteractor;
        this.z = revPointsTransactionsInteractor;
        this.A = pricingPlanInteractor;
        this.B = errorDialogFactory;
        this.C = appScope;
        this.E = d.b(this, new l(wp5.y.u(uuidGenerator, "toString(...)"), new Data(null, null, true, 3, null), new Data(inputData.f91160c, null, false, 6, null), new Data(null, null, true, 3, null), 0.0d, "", 0, "", m.NONE, s.NONE, new Data(null, null, false, 7, null), false, false), stateMapper, null, false, 12);
        this.F = e.a(this, new lp2.c(this, 22));
        this.G = new b();
        this.H = new b();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable I2(com.revolut.feature.trade_rev_points.impl.ui.screen.transfer.a r4, u2f.p r5, gim.c r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof m2f.w
            if (r0 == 0) goto L13
            r0 = r6
            m2f.w r0 = (m2f.w) r0
            int r1 = r0.f201997w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f201997w = r1
            goto L18
        L13:
            m2f.w r0 = new m2f.w
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f201997w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L43
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r6)
            u1f.b r6 = r4.f91167s
            com.revolut.feature.trade_rev_points.impl.ui.screen.transfer.TradeRevPointsTransferScreenContract$InputData r2 = r4.o
            u2f.j r2 = r2.f91159b
            r0.f201997w = r3
            u1f.g r6 = (u1f.g) r6
            java.lang.Object r6 = r6.b(r5, r2, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            u2f.n r6 = (u2f.n) r6
            kotlinx.coroutines.CoroutineScope r5 = r4.C
            lr.l r0 = new lr.l
            r1 = 10
            r2 = 0
            r0.<init>(r4, r6, r2, r1)
            r4 = 3
            skm.e0.C(r5, r2, r2, r0, r4)
            u2f.q r5 = r6.f276649c
            int[] r0 = m2f.v.f201996b
            int r5 = r5.ordinal()
            r5 = r0[r5]
            if (r5 == r3) goto L80
            r0 = 2
            if (r5 == r0) goto L7d
            if (r5 == r4) goto L75
            r4 = 4
            if (r5 == r4) goto L6d
            kotlin.NoWhenBranchMatchedException r4 = new kotlin.NoWhenBranchMatchedException
            r4.<init>()
            throw r4
        L6d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Top up state is unknown"
            r4.<init>(r5)
            throw r4
        L75:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Top up is failed"
            r4.<init>(r5)
            throw r4
        L7d:
            u2f.a r4 = u2f.a.PENDING
            goto L82
        L80:
            u2f.a r4 = u2f.a.COMPLETED
        L82:
            java.lang.String r5 = r6.f276647a
            kotlin.Pair r6 = new kotlin.Pair
            r6.<init>(r4, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.trade_rev_points.impl.ui.screen.transfer.a.I2(com.revolut.feature.trade_rev_points.impl.ui.screen.transfer.a, u2f.p, gim.c):java.io.Serializable");
    }

    public static final String J2(a aVar) {
        String str;
        u2f.d dVar = (u2f.d) ((l) ((j2) aVar.E.f22677a).getValue()).f201977b.getContent();
        if (dVar != null && (str = dVar.f276624m.f276640c) != null) {
            return str;
        }
        m70.a.c(t0.f186434a);
        return "";
    }

    public static final u2f.k K2(a aVar) {
        TradeRevPointsRate tradeRevPointsRate;
        u2f.k kVar;
        u2f.d dVar = (u2f.d) ((l) ((j2) aVar.E.f22677a).getValue()).f201977b.getContent();
        return (dVar == null || (tradeRevPointsRate = dVar.f276624m.f276642h) == null || (kVar = tradeRevPointsRate.f91192c) == null) ? u2f.k.POINTS : kVar;
    }

    @Override // yji.l
    public final void I1() {
        this.u.a("trade-rev-points-topup");
        Continuation continuation = null;
        wkm.l lVarQ = vkm.q.Q(this.H, new m2f.y(1, this, continuation));
        h0 h0Var = h0.f322473a;
        yji.l.a1(this, rd0.e.n(lVarQ, h0Var), null, null, new z(2, this, continuation), 3);
        yji.l.a1(this, rd0.e.n(vkm.q.Q(this.G, new m2f.y(0, this, continuation)), h0Var), null, null, new z(0, this, continuation), 3);
        if (this.f91170x.a()) {
            yji.l.a1(this, mo3.a.g(rd0.e.b(this.f91171y.b(o0.ACTIVATION)), null, new g(16), 1), null, null, new z(1, this, continuation), 3);
        } else {
            H2(this.E, new n(23));
        }
        yji.l.a1(this, rd0.e.b(this.A.q()), null, null, new m2f.b0(this, continuation, 0), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.F;
    }

    public final void L2(String formatted) {
        TradeRevPointsRate rate;
        Intrinsics.checkNotNullParameter(formatted, "text");
        y yVar = this.E;
        u2f.d dVar = (u2f.d) ((l) ((j2) yVar.f22677a).getValue()).f201977b.getContent();
        if (dVar != null && (rate = dVar.f276624m.f276642h) != null) {
            c cVar = this.f91168t;
            cVar.getClass();
            Intrinsics.checkNotNullParameter(formatted, "formatted");
            double dDoubleValue = 0.0d;
            try {
                Number number = cVar.f201965a.parse(formatted);
                if (number != null) {
                    dDoubleValue = number.doubleValue();
                }
            } catch (ParseException unused) {
            }
            double d = dDoubleValue;
            if (d != ((l) ((j2) yVar.f22677a).getValue()).e) {
                this.f91169w.getClass();
                Intrinsics.checkNotNullParameter(rate, "rate");
                int i = (int) (d / rate.f91190a);
                if (i <= 999999) {
                    H2(yVar, new m2f.t(d, formatted, i, this));
                    return;
                }
                n2(new c0(this, formatted, null, 1), new whi.b(6));
            }
        }
    }

    public final void M2(Clause clause) {
        yji.l.a1(this, X1(new y0(null, new nii.z(clause, null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 5)), null, null, new iz1.g(2, 26, null), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.E;
    }
}
