package com.revolut.feature.credit.card.impl.ui.statement_financing.confirmation;

import al4.m;
import al4.n;
import bhi.c;
import bw4.f;
import bw4.k;
import cli.g;
import cli.y;
import com.revolut.data.model.Data;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ky4.e;
import lt4.d;
import oki.h;
import smd.s;
import vkm.j2;
import vkm.q;
import vt4.b;
import yji.l;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends h implements k {
    public final com.revolut.kompot.navigable.vc.modal.a A;
    public final CreditCardStatementFinancingConfirmationScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final m f69734p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final n f69735q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final b f69736r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final dw4.a f69737s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final j60.a f69738t;
    public final d u;
    public final s v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final pak.h f69739w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final gte.a f69740x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final e f69741y;
    public final y z;

    public a(CreditCardStatementFinancingConfirmationScreenContract$InputData inputData, m creditCardInstalmentInteractor, n creditCardInteractor, b creditCardDialogMapper, dw4.a confirmationDialogMapper, j60.a bottomExpandableDialogExtension, d creditCardDialogModelMapper, s documentsInteractor, pak.h documentViewerDestinationMapper, gte.a featureToggleInteractor, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(creditCardInstalmentInteractor, "creditCardInstalmentInteractor");
        Intrinsics.checkNotNullParameter(creditCardInteractor, "creditCardInteractor");
        Intrinsics.checkNotNullParameter(creditCardDialogMapper, "creditCardDialogMapper");
        Intrinsics.checkNotNullParameter(confirmationDialogMapper, "confirmationDialogMapper");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogExtension, "bottomExpandableDialogExtension");
        Intrinsics.checkNotNullParameter(creditCardDialogModelMapper, "creditCardDialogModelMapper");
        Intrinsics.checkNotNullParameter(documentsInteractor, "documentsInteractor");
        Intrinsics.checkNotNullParameter(documentViewerDestinationMapper, "documentViewerDestinationMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f69734p = creditCardInstalmentInteractor;
        this.f69735q = creditCardInteractor;
        this.f69736r = creditCardDialogMapper;
        this.f69737s = confirmationDialogMapper;
        this.f69738t = bottomExpandableDialogExtension;
        this.u = creditCardDialogModelMapper;
        this.v = documentsInteractor;
        this.f69739w = documentViewerDestinationMapper;
        this.f69740x = featureToggleInteractor;
        this.f69741y = new e(0);
        this.z = mra.d.b(this, new f(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        this.A = hx7.e.a(this, new c(this, 27));
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.b1(this, rd0.e.n(q.Q(this.f69741y, new bw4.s(continuation, this, 0)), h0.f322473a), null, new btd.e(this, continuation, 11), 3);
    }

    public final bw4.e I2() {
        return (bw4.e) zi0.c.I(((f) ((j2) this.z.f22677a).getValue()).f19225a);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.A;
    }

    @Override // cli.z
    public final g getState() {
        return this.z;
    }
}
