package com.revolut.feature.credit.card.impl.ui.instalment.confirmation;

import ang.f;
import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import gs4.i;
import hx7.e;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import smd.s;
import tna.p;
import tp8.l;
import tr4.g;
import tr4.k;
import tr4.r;
import vkm.j2;
import w4l.j;
import whf.b;
import zhm.h0;
import zi0.c;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends h implements k {
    public final InstalmentConfirmationScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final s f69308p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i f69309q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final gs4.s f69310r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final f f69311s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final b f69312t;
    public final pak.h u;
    public final y v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f69313w;

    public a(InstalmentConfirmationScreenContract$InputData inputData, s documentsInteractor, i instalmentDialogMapper, gs4.s transactionsOverviewControllerProvider, f userInteractor, b transactionItemsProvider, pak.h documentViewerDestinationMapper, n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(documentsInteractor, "documentsInteractor");
        Intrinsics.checkNotNullParameter(instalmentDialogMapper, "instalmentDialogMapper");
        Intrinsics.checkNotNullParameter(transactionsOverviewControllerProvider, "transactionsOverviewControllerProvider");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(transactionItemsProvider, "transactionItemsProvider");
        Intrinsics.checkNotNullParameter(documentViewerDestinationMapper, "documentViewerDestinationMapper");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f69308p = documentsInteractor;
        this.f69309q = instalmentDialogMapper;
        this.f69310r = transactionsOverviewControllerProvider;
        this.f69311s = userInteractor;
        this.f69312t = transactionItemsProvider;
        this.u = documentViewerDestinationMapper;
        this.v = d.b(this, new g(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        this.f69313w = e.a(this, new l(this, 5));
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, rd0.e.n(xam.a.h(new tr4.s(this, null), nim.a.v(this.f69311s.j(j.f294644c), r.f)), h0.f322473a), null, null, new p(this, null, 6), 3);
    }

    public final tr4.f I2() {
        return (tr4.f) c.I(((g) ((j2) this.v.f22677a).getValue()).f273733a);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f69313w;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.v;
    }
}
