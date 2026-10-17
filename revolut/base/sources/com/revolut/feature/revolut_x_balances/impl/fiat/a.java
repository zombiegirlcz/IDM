package com.revolut.feature.revolut_x_balances.impl.fiat;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.revolut_x_balances.api.fiat.navigation.RevolutXFiatBalancesDetailsController$InputData;
import hng.g;
import hx7.e;
import j61.b;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import pt5.m;
import r10.w;
import vkm.q;
import xv5.c;
import y4c.f;
import y4c.k;
import yji.l;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends h implements f {
    public final RevolutXFiatBalancesDetailsController$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f84257p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final w f84258q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final m f84259r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final b f84260s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final l61.a f84261t;
    public final y u;
    public final com.revolut.kompot.navigable.vc.modal.a v;

    public a(RevolutXFiatBalancesDetailsController$InputData inputData, c cryptoCommodityBaseCurrencyInteractor, w statsSectionDataProvider, m activityExtension, b mainWalletTransactionsInteractor, l61.a userCompanyInteractor, z4c.c headerActions, k stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(cryptoCommodityBaseCurrencyInteractor, "cryptoCommodityBaseCurrencyInteractor");
        Intrinsics.checkNotNullParameter(statsSectionDataProvider, "statsSectionDataProvider");
        Intrinsics.checkNotNullParameter(activityExtension, "activityExtension");
        Intrinsics.checkNotNullParameter(mainWalletTransactionsInteractor, "mainWalletTransactionsInteractor");
        Intrinsics.checkNotNullParameter(userCompanyInteractor, "userCompanyInteractor");
        Intrinsics.checkNotNullParameter(headerActions, "headerActions");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f84257p = cryptoCommodityBaseCurrencyInteractor;
        this.f84258q = statsSectionDataProvider;
        this.f84259r = activityExtension;
        this.f84260s = mainWalletTransactionsInteractor;
        this.f84261t = userCompanyInteractor;
        xi0.b bVar = inputData.f84249a;
        RevolutXFiatBalancesDetailsController$InputData.Stats stats = inputData.f84250b;
        this.u = d.b(this, new y4c.d(bVar, stats != null ? new Data(new b5c.b(bVar, stats.f84251a, stats.f84252b, stats.f84253c, stats.d), null, false, 6, null) : new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), v.k(headerActions.f319367a, headerActions.f319368b), new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        this.v = e.a(this, new xwd.a(this, 18));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.v;
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        n2(new xb4.e(this, continuation, 24), new whi.b(6));
        c cVar = this.f84257p;
        cVar.getClass();
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        l.b1(this, q.Q(rd0.e.b(m70.a.g(cVar.a(), null, new xti.k(4), 1)), new x18.e(continuation, this, 29)), null, new y4c.h(this, null, 0), 3);
        xi0.b bVar = this.o.f84249a;
        m mVar = this.f84259r;
        mVar.m3(bVar);
        l.b1(this, mVar.l3(), null, new y4c.h(this, null, 2), 3);
        l.b1(this, rd0.e.b(g.b(((ang.b) this.f84261t).f7765a)), null, new y4c.h(this, null, 1), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.u;
    }
}
