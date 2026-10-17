package com.revolut.feature.pix.impl.flow.automatico.screens.details;

import anf.b;
import cli.g;
import cli.y;
import com.revolut.data.model.Data;
import hx7.e;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import org.jetbrains.annotations.NotNull;
import s8a.f;
import u7k.f0;
import u7k.w;
import u9a.m;
import u9a.n;
import u9a.p;
import u9a.r;
import vkm.q;
import vkm.z1;
import yji.l;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends h implements n {

    @NotNull
    public static final p Companion = new p();
    public final PixAutomaticoPaymentDetailsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f f80615p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ryc.a f80616q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j60.a f80617r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final c70.a f80618s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final b f80619t;
    public final whf.b u;
    public final z1 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final y f80620w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f80621x;

    public a(cli.n stateMapper, PixAutomaticoPaymentDetailsScreenContract$InputData inputData, f pixAutomaticoInteractor, ryc.a authorisationRequestInteractor, j60.a bottomExpandableDialog, c70.a clipboard, b transactionSumCalculator, whf.b transactionsContentProvider) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(pixAutomaticoInteractor, "pixAutomaticoInteractor");
        Intrinsics.checkNotNullParameter(authorisationRequestInteractor, "authorisationRequestInteractor");
        Intrinsics.checkNotNullParameter(bottomExpandableDialog, "bottomExpandableDialog");
        Intrinsics.checkNotNullParameter(clipboard, "clipboard");
        Intrinsics.checkNotNullParameter(transactionSumCalculator, "transactionSumCalculator");
        Intrinsics.checkNotNullParameter(transactionsContentProvider, "transactionsContentProvider");
        this.o = inputData;
        this.f80615p = pixAutomaticoInteractor;
        this.f80616q = authorisationRequestInteractor;
        this.f80617r = bottomExpandableDialog;
        this.f80618s = clipboard;
        this.f80619t = transactionSumCalculator;
        this.u = transactionsContentProvider;
        z1 z1VarB = q.b(0, 6, null);
        z1VarB.k(Unit.f186387a);
        this.v = z1VarB;
        this.f80620w = d.b(this, new m(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), true, null), stateMapper, null, false, 12);
        this.f80621x = e.a(this, new w(this, 6));
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, q.Q(this.v, new r(0, this, continuation)), null, null, new f0(this, continuation, 10), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f80621x;
    }

    @Override // cli.z
    public final g getState() {
        return this.f80620w;
    }
}
