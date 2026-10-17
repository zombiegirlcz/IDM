package com.revolut.feature.robo.impl.ui.screen.manage_goal;

import ael.t;
import cli.g;
import cli.y;
import cnc.e;
import cnc.f;
import cnc.s;
import cnc.u;
import cnc.v;
import cnc.w;
import cnc.x;
import k4l.c0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import mra.d;
import oki.h;
import org.jetbrains.annotations.NotNull;
import t1j.b;
import woc.c;
import yji.l;
import yoc.n;
import zh9.u0;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends h implements f {
    public final com.revolut.kompot.navigable.vc.modal.a A;
    public final e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final zjh.f f85139p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b f85140q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final emc.e f85141r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final l80.e f85142s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final woc.f f85143t;
    public final c u;
    public final t v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final usc.a f85144w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final n f85145x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final qmc.b f85146y;
    public final y z;

    @NotNull
    private static final v Companion = new v();
    public static final c0 B = c0.MONTH;

    public a(s mapper, e input, zjh.f portfolioInteractor, b portfolioRecurringOrdersInteractor, emc.e templatesInteractor, l80.e dateProvider, woc.f optimalRecurringDepositCalculator, c optimalInitialDepositCalculator, t portfolioBalanceInteractor, usc.a paymentsCountProvider, n roundedMoneyProvider, qmc.b roboContextProvider) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(portfolioInteractor, "portfolioInteractor");
        Intrinsics.checkNotNullParameter(portfolioRecurringOrdersInteractor, "portfolioRecurringOrdersInteractor");
        Intrinsics.checkNotNullParameter(templatesInteractor, "templatesInteractor");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(optimalRecurringDepositCalculator, "optimalRecurringDepositCalculator");
        Intrinsics.checkNotNullParameter(optimalInitialDepositCalculator, "optimalInitialDepositCalculator");
        Intrinsics.checkNotNullParameter(portfolioBalanceInteractor, "portfolioBalanceInteractor");
        Intrinsics.checkNotNullParameter(paymentsCountProvider, "paymentsCountProvider");
        Intrinsics.checkNotNullParameter(roundedMoneyProvider, "roundedMoneyProvider");
        Intrinsics.checkNotNullParameter(roboContextProvider, "roboContextProvider");
        this.o = input;
        this.f85139p = portfolioInteractor;
        this.f85140q = portfolioRecurringOrdersInteractor;
        this.f85141r = templatesInteractor;
        this.f85142s = dateProvider;
        this.f85143t = optimalRecurringDepositCalculator;
        this.u = optimalInitialDepositCalculator;
        this.v = portfolioBalanceInteractor;
        this.f85144w = paymentsCountProvider;
        this.f85145x = roundedMoneyProvider;
        this.f85146y = roboContextProvider;
        this.z = d.b(this, new cnc.d(0), mapper, null, false, 12);
        this.A = hx7.e.a(this, new cnc.t(this, 0));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.A;
    }

    @Override // yji.l
    public final void T1(long j2) {
        e eVar = this.o;
        Continuation continuation = null;
        l.b1(this, nim.a.v(this.f85146y.c(eVar.f25389a), new cmc.c(16)), null, new x(this, null), 3);
        String str = eVar.f25389a;
        vkm.d dVarB = rd0.e.b(mo3.a.n(this.f85139p.B(str, w4l.h.f294642c)));
        akg.n nVarV = nim.a.v(dVarB, new cmc.c(17));
        l.b1(this, nVarV, null, new w(this, continuation, 2), 3);
        akg.n nVarV2 = nim.a.v(rd0.e.b(b.m(this.f85140q, str)), new cmc.c(18));
        l.b1(this, nVarV2, null, new w(this, continuation, 3), 3);
        akg.n nVarV3 = nim.a.v(nVarV2, new cmc.c(19));
        l.b1(this, nVarV3, null, new w(this, continuation, 4), 3);
        Flow flowE = boh.f.e(dVarB, new u(this, 0));
        Flow flowE2 = boh.f.e(dVarB, new u(this, 1));
        l.b1(this, nim.a.u(new w(continuation, this, 0), u0.m(u0.i(nVarV, nVarV3, flowE), flowE2)), null, new w(this, continuation, 5), 3);
        l.b1(this, nim.a.u(new w(continuation, this, 1), u0.m(u0.i(flowE, nVarV, nVarV2), flowE2)), null, new w(this, continuation, 6), 3);
    }

    @Override // cli.z
    public final g getState() {
        return this.z;
    }
}
