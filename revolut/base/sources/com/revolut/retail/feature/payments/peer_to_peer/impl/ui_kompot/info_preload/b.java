package com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.info_preload;

import abk.c;
import d8l.d;
import gvc.m;
import h43.q;
import j9k.t;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import yki.i;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends h implements h9k.b {
    public final PeerToPeerInfoPreloadFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f102355p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c f102356q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i f102357r;

    public b(PeerToPeerInfoPreloadFlowContract$InputData inputData, t infoPreloadInteractor, c errorDialogProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(infoPreloadInteractor, "infoPreloadInteractor");
        Intrinsics.checkNotNullParameter(errorDialogProvider, "errorDialogProvider");
        this.o = inputData;
        this.f102355p = infoPreloadInteractor;
        this.f102356q = errorDialogProvider;
        this.f102357r = d.a(this, new q(16));
    }

    @Override // yki.j
    public final void M0() {
        l2(new m(this, null, 10), new h56.a(this, 13));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f102357r;
    }
}
