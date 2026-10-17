package com.revolut.feature.payments_migration.impl.ui.screen.move_payment.account_details;

import cli.y;
import hx7.e;
import iug.j;
import j6a.g;
import j6a.n;
import kbb.c;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import vkm.j2;
import vkm.q;
import wda.b;
import yji.l;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends h implements j6a.h {
    public final AccountDetailsPaymentControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f80274p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b f80275q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final wsg.b f80276r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final c70.a f80277s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final r70.c f80278t;
    public final s70.a u;
    public final vii.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final y f80279w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f80280x;

    public a(AccountDetailsPaymentControllerContract$InputData inputData, c accountDetailsInteractor, b accountDetailsCommonMapper, wsg.b walletInteractor, c70.a clipboard, r70.c hapticEngine, s70.a intentProvider, n statesMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(accountDetailsInteractor, "accountDetailsInteractor");
        Intrinsics.checkNotNullParameter(accountDetailsCommonMapper, "accountDetailsCommonMapper");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(clipboard, "clipboard");
        Intrinsics.checkNotNullParameter(hapticEngine, "hapticEngine");
        Intrinsics.checkNotNullParameter(intentProvider, "intentProvider");
        Intrinsics.checkNotNullParameter(statesMapper, "statesMapper");
        this.o = inputData;
        this.f80274p = accountDetailsInteractor;
        this.f80275q = accountDetailsCommonMapper;
        this.f80276r = walletInteractor;
        this.f80277s = clipboard;
        this.f80278t = hapticEngine;
        this.u = intentProvider;
        this.v = new vii.b();
        this.f80279w = d.b(this, new g(inputData.f80272b, 63), statesMapper, null, false, 12);
        this.f80280x = e.a(this, new j2c.n(this, 10));
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, rd0.e.n(q.Q(this.v, new j6a.l(continuation, this, 0)), h0.f322473a), null, null, new j(this, continuation, 25), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f80280x;
    }

    @Override // yji.l
    public final void T1(long j2) {
        y yVar = this.f80279w;
        if (((g) ((j2) yVar.f22677a).getValue()).f) {
            H2(yVar, new j3f.d(18));
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f80279w;
    }
}
