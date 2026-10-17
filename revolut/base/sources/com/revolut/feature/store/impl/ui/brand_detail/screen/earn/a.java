package com.revolut.feature.store.impl.ui.brand_detail.screen.earn;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.store.api.model.StoreMegaOffer;
import hx7.e;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import s9b.n;
import t2e.g;
import t2e.k;
import t2e.r;
import vii.b;
import vkm.q;
import yji.l;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends h implements k {
    public final StoreBrandDetailEarnScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l2e.a f88678p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final q2e.a f88679q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final b f88680r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final wn.a f88681s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final p2e.a f88682t;
    public final y u;
    public final com.revolut.kompot.navigable.vc.modal.a v;

    public a(StoreBrandDetailEarnScreenContract$InputData inputData, l2e.a storeBrandsInteractor, q2e.a campaignsSharedState, b megaOfferLoader, wn.a adsTrackingControllerModelExtension, p2e.a countriesBottomSheetMapper, r stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(storeBrandsInteractor, "storeBrandsInteractor");
        Intrinsics.checkNotNullParameter(campaignsSharedState, "campaignsSharedState");
        Intrinsics.checkNotNullParameter(megaOfferLoader, "megaOfferLoader");
        Intrinsics.checkNotNullParameter(adsTrackingControllerModelExtension, "adsTrackingControllerModelExtension");
        Intrinsics.checkNotNullParameter(countriesBottomSheetMapper, "countriesBottomSheetMapper");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f88678p = storeBrandsInteractor;
        this.f88679q = campaignsSharedState;
        this.f88680r = megaOfferLoader;
        this.f88681s = adsTrackingControllerModelExtension;
        this.f88682t = countriesBottomSheetMapper;
        StoreMegaOffer storeMegaOffer = inputData.f88675b;
        this.u = d.b(this, new g(storeMegaOffer != null ? new Data(storeMegaOffer, null, false, 6, null) : new Data(null, null, true, 3, null), 62), stateMapper, null, false, 12);
        this.v = e.a(this, new suf.a(this, 17));
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, q.Q(this.f88680r, new n((Continuation) null, this, 20)), null, null, new t2e.n(this, null, 1), 3);
        q2e.a aVar = this.f88679q;
        l.a1(this, nim.a.u(new qkg.a(2, 24, null), aVar.f241560b), null, null, new t2e.n(this, null, 0), 3);
        l.a1(this, aVar.d, null, null, new t2e.n(this, null, 2), 3);
        l.a1(this, aVar.f, null, null, new t2e.n(this, null, 3), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.v;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.u;
    }
}
