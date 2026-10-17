package com.revolut.feature.rev_points.impl.ui.transactions.details;

import a26.s;
import cli.y;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.data.model.Data;
import com.revolut.feature.rev_points.impl.ui.transactions.details.RevPointsTransactionDetailsScreenContract$InputData;
import com.revolut.feature.rev_points.models.RevPointsTransaction;
import go.g;
import kgm.c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import mra.d;
import n0c.j;
import n0c.p;
import n0c.q;
import n0c.r;
import nyb.m0;
import oki.h;
import rfm.m;
import rp0.l0;
import rul.e;
import te0.w;
import tof.s9;
import yji.l;
import zhm.y0;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends h implements j {
    public final RevPointsTransactionDetailsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final wsg.b f83854p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f83855q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final m0 f83856r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e f83857s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final a2c.e f83858t;
    public final o1c.a u;
    public final l0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final whf.b f83859w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final y f83860x;

    public b(n0c.y stateMapper, RevPointsTransactionDetailsScreenContract$InputData inputData, wsg.b walletsInteractor, com.revolut.domain.interactors.transactions.a transactionsInteractor, m0 revPointsTransactionsInteractor, e revPointsSpareChangeInteractor, a2c.e spareChangeNavigationResolver, o1c.a revPointsSpareChangeResultDialogExtension, l0 popupMenuDialogDisplayer, whf.b transactionsListContentProvider) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(walletsInteractor, "walletsInteractor");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(revPointsTransactionsInteractor, "revPointsTransactionsInteractor");
        Intrinsics.checkNotNullParameter(revPointsSpareChangeInteractor, "revPointsSpareChangeInteractor");
        Intrinsics.checkNotNullParameter(spareChangeNavigationResolver, "spareChangeNavigationResolver");
        Intrinsics.checkNotNullParameter(revPointsSpareChangeResultDialogExtension, "revPointsSpareChangeResultDialogExtension");
        Intrinsics.checkNotNullParameter(popupMenuDialogDisplayer, "popupMenuDialogDisplayer");
        Intrinsics.checkNotNullParameter(transactionsListContentProvider, "transactionsListContentProvider");
        this.o = inputData;
        this.f83854p = walletsInteractor;
        this.f83855q = transactionsInteractor;
        this.f83856r = revPointsTransactionsInteractor;
        this.f83857s = revPointsSpareChangeInteractor;
        this.f83858t = spareChangeNavigationResolver;
        this.u = revPointsSpareChangeResultDialogExtension;
        this.v = popupMenuDialogDisplayer;
        this.f83859w = transactionsListContentProvider;
        this.f83860x = d.b(this, new n0c.h(new Data(null, null, true, 3, null), null), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        RevPointsTransactionDetailsScreenContract$InputData revPointsTransactionDetailsScreenContract$InputData = this.o;
        boolean z = revPointsTransactionDetailsScreenContract$InputData instanceof RevPointsTransactionDetailsScreenContract$InputData.TransactionIdInput;
        m0 m0Var = this.f83856r;
        if (z) {
            rfm.a aVarB = m0Var.b(((RevPointsTransactionDetailsScreenContract$InputData.TransactionIdInput) revPointsTransactionDetailsScreenContract$InputData).f83851a, kub.a.NETWORK_IMMEDIATE);
            Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
            m mVar = new m(aVarB, new c(new p(new BreadcrumbException(), 0)), 2);
            Intrinsics.checkNotNullExpressionValue(mVar, "onErrorResumeNext(...)");
            rfm.b bVar = new rfm.b(new lhi.b(6, new s(ref$BooleanRef, this, 27)), new lhi.b(6, q.f210995a), new r(ref$BooleanRef, this));
            mVar.i(bVar);
            Intrinsics.checkNotNullExpressionValue(bVar, "subscribe(...)");
            return;
        }
        if (!(revPointsTransactionDetailsScreenContract$InputData instanceof RevPointsTransactionDetailsScreenContract$InputData.TransactionInput)) {
            throw new NoWhenBranchMatchedException();
        }
        RevPointsTransaction revPointsTransaction = ((RevPointsTransactionDetailsScreenContract$InputData.TransactionInput) revPointsTransactionDetailsScreenContract$InputData).f83852a;
        String str = revPointsTransaction.e;
        Continuation continuation = null;
        Object objI2 = str != null ? I2(str) : new g(null, 2);
        efm.r rVarStartWith = ue0.e.x(m0Var.b(revPointsTransaction.f84054a, kub.a.NETWORK_IMMEDIATE_AND_FORCE_UPDATE)).n().startWith(revPointsTransaction);
        Intrinsics.checkNotNullExpressionValue(rVarStartWith, "startWith(...)");
        l.a1(this, new t38.e(objI2, 24, rd0.e.b(rVarStartWith), new l05.b(3, 18, continuation)), null, null, new mx5.g(this, continuation, 13), 3);
    }

    public final jhi.b I2(String str) {
        return mo3.a.g(rd0.e.b(whf.b.a(this.f83859w, w.h(new s9(y0.b(str))), null, 1, null, 10)), null, null, 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f83860x;
    }
}
