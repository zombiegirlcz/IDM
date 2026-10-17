package com.revolut.feature.trading.managed_portfolios.impl.ui.investor_update.history;

import cli.g;
import cli.y;
import klf.a3;
import kotlin.jvm.internal.Intrinsics;
import l0c.v;
import l7f.d;
import md6.s;
import oki.h;
import vkm.q;
import yji.l;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends h implements d {
    public final InvestorUpdateHistoryFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t1j.b f91360p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final vii.b f91361q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f91362r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ali.b f91363s;

    public b(InvestorUpdateHistoryFlowContract$InputData inputData, t1j.b investorUpdateInteractor, vii.b reloadContentFlow, c stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(investorUpdateInteractor, "investorUpdateInteractor");
        Intrinsics.checkNotNullParameter(reloadContentFlow, "reloadContentFlow");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f91360p = investorUpdateInteractor;
        this.f91361q = reloadContentFlow;
        this.f91362r = mra.d.b(this, new l7f.c(null, null), stateMapper, null, false, 12);
        this.f91363s = s.b(this, new v(this, 15));
    }

    @Override // ali.h
    public final ali.b I0() {
        return this.f91363s;
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, q.Q(this.f91361q, new a3(null, this, 21)), null, null, new a(this, null), 3);
    }

    @Override // ali.h, cli.z
    public final g getState() {
        return this.f91362r;
    }
}
