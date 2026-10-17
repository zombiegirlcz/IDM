package com.revolut.feature.trading.managed_portfolios.impl.ui.details.performance_details;

import cf1.h;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.data.model.Data;
import d7f.i;
import d7f.k;
import iii.c;
import kotlin.jvm.internal.Intrinsics;
import kpj.f;
import nmc.d;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements n {

    @NotNull
    private static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ufl.b f91345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f91346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f91347c;

    public b(ufl.b wealthHoldingsClauseFactory, d roboPortfolioUIMapper, f wealthAccountHeaderUiMapper) {
        Intrinsics.checkNotNullParameter(wealthHoldingsClauseFactory, "wealthHoldingsClauseFactory");
        Intrinsics.checkNotNullParameter(roboPortfolioUIMapper, "roboPortfolioUIMapper");
        Intrinsics.checkNotNullParameter(wealthAccountHeaderUiMapper, "wealthAccountHeaderUiMapper");
        this.f91345a = wealthHoldingsClauseFactory;
        this.f91346b = roboPortfolioUIMapper;
        this.f91347c = wealthAccountHeaderUiMapper;
    }

    @Override // cli.n
    public final o c(j jVar) {
        d7f.f domainState = (d7f.f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.f111955a;
        if (data != null) {
            return (i) c.f(data, new d6j.b(this, 18), new czh.a(28), new h(this, 23));
        }
        i.Companion.getClass();
        return new i(null, null, null, f0.f322471a);
    }
}
