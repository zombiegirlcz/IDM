package com.revolut.feature.pix.impl.flow.authorisation_request.screens.request;

import cli.g;
import cli.y;
import com.revolut.data.model.Data;
import hx7.e;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import mra.d;
import o9a.j;
import o9a.p;
import o9a.w;
import o9a.z;
import oki.h;
import s8a.f;
import wsg.n;
import yi5.b;
import yji.l;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends h implements p {
    public final MutableStateFlow o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final n f80595p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ryc.a f80596q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final f f80597r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final zof.f f80598s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f80599t;
    public final com.revolut.kompot.navigable.vc.modal.a u;

    public a(MutableStateFlow inputDataFlow, n walletInteractor, ryc.a authorisationRequestInteractor, f automaticoInteractor, zof.f transferFeatureScreensProvider, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(inputDataFlow, "inputDataFlow");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(authorisationRequestInteractor, "authorisationRequestInteractor");
        Intrinsics.checkNotNullParameter(automaticoInteractor, "automaticoInteractor");
        Intrinsics.checkNotNullParameter(transferFeatureScreensProvider, "transferFeatureScreensProvider");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputDataFlow;
        this.f80595p = walletInteractor;
        this.f80596q = authorisationRequestInteractor;
        this.f80597r = automaticoInteractor;
        this.f80598s = transferFeatureScreensProvider;
        this.f80599t = d.b(this, new j(((PixAuthorisationRequestScreenContract$InputData) inputDataFlow.getValue()).f80588a, null, null, new Data(null, null, false, 7, null), null, true, null), stateMapper, null, false, 12);
        this.u = e.a(this, new nx2.f(this, 28));
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, this.o, null, null, new z(this, continuation, 1), 3);
        l2(new w(this, continuation, 1), new b(26));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.u;
    }

    @Override // cli.z
    public final g getState() {
        return this.f80599t;
    }
}
