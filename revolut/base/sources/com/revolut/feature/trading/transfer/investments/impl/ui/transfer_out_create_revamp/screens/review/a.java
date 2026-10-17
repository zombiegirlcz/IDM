package com.revolut.feature.trading.transfer.investments.impl.ui.transfer_out_create_revamp.screens.review;

import cli.g;
import cli.y;
import ebf.k;
import ebf.m;
import ebf.n;
import ebf.r;
import hx7.e;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import o9f.c;
import oki.h;
import org.jetbrains.annotations.NotNull;
import ybl.l;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends h implements k {

    @NotNull
    private static final m Companion = new m();
    public final TransferOutReviewScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f91645p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final l f91646q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ebf.a f91647r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final aah.h f91648s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f91649t;
    public final com.revolut.kompot.navigable.vc.modal.a u;

    public a(TransferOutReviewScreenContract$InputData inputData, r stateMapper, c transferInteractor, l tradingConfigInteractor, ebf.a dialogMapper, aah.h wealthDisclaimersExtension) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(transferInteractor, "transferInteractor");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        Intrinsics.checkNotNullParameter(dialogMapper, "dialogMapper");
        Intrinsics.checkNotNullParameter(wealthDisclaimersExtension, "wealthDisclaimersExtension");
        this.o = inputData;
        this.f91645p = transferInteractor;
        this.f91646q = tradingConfigInteractor;
        this.f91647r = dialogMapper;
        this.f91648s = wealthDisclaimersExtension;
        this.f91649t = d.b(this, new ebf.h(inputData.f91641a, inputData.f91642b, inputData.f91643c, inputData.d, null, null), stateMapper, null, false, 12);
        this.u = e.a(this, new e54.r(this, 23));
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, l.d(this.f91646q), null, null, new n(this, null, 0), 3);
        yji.l.a1(this, this.f91648s.f2828l.w0(), null, null, new n(this, null, 1), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.u;
    }

    @Override // cli.z
    public final g getState() {
        return this.f91649t;
    }
}
