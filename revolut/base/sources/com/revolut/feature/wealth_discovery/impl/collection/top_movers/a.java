package com.revolut.feature.wealth_discovery.impl.collection.top_movers;

import ael.t0;
import boh.x;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.wealth_discovery.api.declaration.collection.TopMoversDestination;
import efm.r;
import f5h.b;
import foh.d;
import foh.e;
import foh.o;
import foh.p;
import foh.v;
import go.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import oki.h;
import tsk.t;
import twg.c;
import vkm.j2;
import vkm.q;
import xzg.j0;
import xzg.l0;
import xzg.n0;
import ybl.l;
import z0h.p1;
import zhm.f0;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends h implements o {
    public final c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f96142p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final l f96143q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ugh.a f96144r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final x f96145s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e f96146t;
    public final TopMoversDestination u;
    public final j0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final j2 f96147w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final y f96148x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f96149y;

    public a(TopMoversScreenContract$InputData inputData, c assetsProvider, t topMoversInteractor, l tradingConfigInteractor, ugh.a navigationProvider, x disclaimersProvider, e filtersMapper, foh.y stateMapper) {
        j0 j0Var;
        l0 l0Var;
        n0 n0Var;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(assetsProvider, "assetsProvider");
        Intrinsics.checkNotNullParameter(topMoversInteractor, "topMoversInteractor");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        Intrinsics.checkNotNullParameter(navigationProvider, "navigationProvider");
        Intrinsics.checkNotNullParameter(disclaimersProvider, "disclaimersProvider");
        Intrinsics.checkNotNullParameter(filtersMapper, "filtersMapper");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = assetsProvider;
        this.f96142p = topMoversInteractor;
        this.f96143q = tradingConfigInteractor;
        this.f96144r = navigationProvider;
        this.f96145s = disclaimersProvider;
        this.f96146t = filtersMapper;
        TopMoversDestination topMoversDestination = inputData.f96139a;
        this.u = topMoversDestination;
        Intrinsics.checkNotNullParameter(topMoversDestination, "<this>");
        if (topMoversDestination instanceof TopMoversDestination.Trading) {
            j0Var = j0.STOCK;
        } else {
            if (!(topMoversDestination instanceof TopMoversDestination.Crypto)) {
                throw new NoWhenBranchMatchedException();
            }
            j0Var = j0.CRYPTO;
        }
        this.v = j0Var;
        wnh.e f96123a = topMoversDestination.getF96123a();
        Intrinsics.checkNotNullParameter(f96123a, "<this>");
        int i = d.f136961a[f96123a.ordinal()];
        if (i == 1) {
            l0Var = l0.ONE_DAY;
        } else if (i == 2) {
            l0Var = l0.ONE_WEEK;
        } else if (i == 3) {
            l0Var = l0.ONE_MONTH;
        } else if (i == 4) {
            l0Var = l0.ONE_YEAR;
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            l0Var = l0.FIVE_YEARS;
        }
        wnh.d f96124b = topMoversDestination.getF96124b();
        Intrinsics.checkNotNullParameter(f96124b, "<this>");
        int i2 = d.f136962b[f96124b.ordinal()];
        if (i2 == 1) {
            n0Var = n0.ALL;
        } else if (i2 == 2) {
            n0Var = n0.GAINERS;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            n0Var = n0.LOSERS;
        }
        j2 j2VarC = q.c(new foh.t(l0Var, n0Var));
        this.f96147w = j2VarC;
        this.f96148x = mra.d.b(this, new p(topMoversDestination, new Data(null, null, true, 3, null), ((foh.t) j2VarC.getValue()).f136981a, ((foh.t) j2VarC.getValue()).f136982b, null, null), stateMapper, null, false, 12);
        this.f96149y = hx7.e.a(this, new fb.c(this, inputData, 4));
    }

    @Override // yji.l
    public final void I1() {
        Flow flowV;
        Continuation continuation = null;
        v vVar = new v(this, continuation, 0);
        j2 j2Var = this.f96147w;
        yji.l.a1(this, j2Var, null, null, vVar, 3);
        yji.l.a1(this, q.Q(j2Var, new b(continuation, this, 11)), null, null, new v(this, continuation, 1), 3);
        TopMoversDestination destination = this.u;
        boolean z = destination instanceof TopMoversDestination.Trading;
        if (z) {
            r rVarX = ((t0) this.f96143q).g().x();
            Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
            yji.l.a1(this, rd0.e.b(rVarX), null, null, new v(this, continuation, 2), 3);
        }
        x xVar = this.f96145s;
        xVar.getClass();
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (destination instanceof TopMoversDestination.Crypto) {
            flowV = new g(new Data(new p1(f0.f322471a, null), null, false, 6, null), 2);
        } else {
            if (!z) {
                throw new NoWhenBranchMatchedException();
            }
            flowV = nim.a.v(xVar.f17486a.w0(), new fo9.a(4));
        }
        yji.l.a1(this, flowV, null, null, new v(this, continuation, 3), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f96149y;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f96148x;
    }
}
