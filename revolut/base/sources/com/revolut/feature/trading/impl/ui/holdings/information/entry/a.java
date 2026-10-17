package com.revolut.feature.trading.impl.ui.holdings.information.entry;

import ael.t;
import boh.f;
import cli.g;
import cli.n;
import cli.y;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.data.model.Data;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import hx7.e;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import vii.c;
import vkm.q;
import y4b.b;
import y4f.i;
import y4f.j;
import y4f.o;
import y4f.p;
import ybl.d;
import ybl.k;
import yji.l;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends h implements y4f.h {
    public final a5f.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final k f91219p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d f91220q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final t f91221r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final c f91222s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f91223t;
    public final com.revolut.kompot.navigable.vc.modal.a u;

    public a(n stateMapper, a5f.a holdingsInformationDialogProvider, k tradingAccountsInteractor, d portfolioInteractor, t portfolioBalanceInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(holdingsInformationDialogProvider, "holdingsInformationDialogProvider");
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        Intrinsics.checkNotNullParameter(portfolioInteractor, "portfolioInteractor");
        Intrinsics.checkNotNullParameter(portfolioBalanceInteractor, "portfolioBalanceInteractor");
        this.o = holdingsInformationDialogProvider;
        this.f91219p = tradingAccountsInteractor;
        this.f91220q = portfolioInteractor;
        this.f91221r = portfolioBalanceInteractor;
        this.f91222s = new c();
        this.f91223t = mra.d.b(this, new i(new Data(null, null, false, 7, null), new Data(null, null, false, 7, null), new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        this.u = e.a(this, new xwd.a(this, 20));
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, q.Q(this.f91222s.a(Unit.f186387a, w4l.h.f294642c), new o(null, this, 0)), null, null, new p(this, null, 0), 3);
        l.a1(this, nim.a.v(this.f91223t.B(new b(6)), new b(7)), null, null, new p(this, null, 1), 3);
    }

    public final void I2(ListSubheaderDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f52708a;
        if (Intrinsics.f(str, "BANK_BALANCES_HEADER")) {
            C2(new j(x4f.a.BANK_BALANCES));
        } else if (Intrinsics.f(str, "BROKERAGE_HOLDINGS_HEADER")) {
            C2(new j(x4f.a.BROKERAGE_HOLDINGS));
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.u;
    }

    @Override // yji.l
    public final void T1(long j2) {
        l.b1(this, f.e(nim.a.v(k.h(this.f91219p, TradingAccountType.Gia.f105270a, null, 6), new b(8)), new y4f.n(this, 0)), null, new p(this, null, 2), 3);
    }

    @Override // cli.z
    public final g getState() {
        return this.f91223t;
    }
}
