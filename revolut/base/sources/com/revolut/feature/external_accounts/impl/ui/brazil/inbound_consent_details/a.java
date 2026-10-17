package com.revolut.feature.external_accounts.impl.ui.brazil.inbound_consent_details;

import cli.y;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;
import mj6.g;
import mj6.k;
import mra.d;
import of6.b;
import oki.h;
import w4l.i;
import yji.l;
import zhm.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements mj6.h {
    public final BrazilInboundConsentDetailsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final qg6.a f72568p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f72569q;

    public a(k stateMapper, BrazilInboundConsentDetailsScreenContract$InputData inputData, qg6.a consentDetailsInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(consentDetailsInteractor, "consentDetailsInteractor");
        this.o = inputData;
        this.f72568p = consentDetailsInteractor;
        this.f72569q = d.b(this, new g(new Data(null, null, true, 3, null), h0.f322473a), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        String consentId = this.o.f72563a;
        qg6.a aVar = this.f72568p;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(consentId, "consentId");
        i loadingStrategy = i.f294643c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        b bVar = aVar.f245654a;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(consentId, "consentId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        l.a1(this, bVar.f224741c.b(consentId, loadingStrategy), null, null, new m75.i(this, null, 29), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f72569q;
    }
}
