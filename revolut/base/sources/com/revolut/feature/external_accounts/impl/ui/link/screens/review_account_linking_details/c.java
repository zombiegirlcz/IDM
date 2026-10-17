package com.revolut.feature.external_accounts.impl.ui.link.screens.review_account_linking_details;

import bh6.j;
import cli.g;
import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import hx7.e;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import th6.m;
import xg6.l;
import zfd.s;
import zhm.h0;
import zn6.k;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends h implements k {
    public final ReviewAccountLinkingDetailsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l f73060p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final xg6.a f73061q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j f73062r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f73063s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f73064t;

    public c(n stateMapper, ReviewAccountLinkingDetailsScreenContract$InputData inputData, l linkExternalInstitutionsInteractor, xg6.a accountLinkingPreviewInteractor, j uriDestinationProvider) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(linkExternalInstitutionsInteractor, "linkExternalInstitutionsInteractor");
        Intrinsics.checkNotNullParameter(accountLinkingPreviewInteractor, "accountLinkingPreviewInteractor");
        Intrinsics.checkNotNullParameter(uriDestinationProvider, "uriDestinationProvider");
        this.o = inputData;
        this.f73060p = linkExternalInstitutionsInteractor;
        this.f73061q = accountLinkingPreviewInteractor;
        this.f73062r = uriDestinationProvider;
        this.f73063s = d.b(this, new zn6.h(new Data(null, null, true, 3, null), h0.f322473a, inputData.d, null), stateMapper, null, false, 12);
        this.f73064t = e.a(this, new zba.a(this, 26));
    }

    @Override // yji.l
    public final void I1() {
        ReviewAccountLinkingDetailsScreenContract$InputData reviewAccountLinkingDetailsScreenContract$InputData = this.o;
        String institutionId = reviewAccountLinkingDetailsScreenContract$InputData.f73053a;
        String str = reviewAccountLinkingDetailsScreenContract$InputData.f73055c;
        xg6.a aVar = this.f73061q;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(institutionId, "institutionId");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        m mVar = (m) aVar.f305573a;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(institutionId, "institutionId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        yji.l.a1(this, mVar.d.b(new th6.a(institutionId, str), loadingStrategy), null, null, new s(this, (Continuation) null, 17), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f73064t;
    }

    @Override // cli.z
    public final g getState() {
        return this.f73063s;
    }
}
