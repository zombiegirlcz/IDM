package com.revolut.feature.external_accounts.impl.ui.consents_kompot.linked_accounts.linked_account_consent_details_screen;

import cli.g;
import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import th6.q;
import wl6.e;
import wl6.f;
import xg6.r;
import yji.l;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements f {
    public final LinkedAccountConsentDetailsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final r f72809p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f72810q;

    public a(LinkedAccountConsentDetailsScreenContract$InputData inputData, n stateMapper, r linkedAccountConsentInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(linkedAccountConsentInteractor, "linkedAccountConsentInteractor");
        this.o = inputData;
        this.f72809p = linkedAccountConsentInteractor;
        this.f72810q = d.b(this, new e(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        String consentId = this.o.f72803a;
        r rVar = this.f72809p;
        rVar.getClass();
        Intrinsics.checkNotNullParameter(consentId, "consentId");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        q qVar = rVar.f305600a;
        qVar.getClass();
        Intrinsics.checkNotNullParameter(consentId, "consentId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        l.a1(this, qVar.e.b(consentId, loadingStrategy), null, null, new wka.e(this, null, 2), 3);
    }

    @Override // cli.z
    public final g getState() {
        return this.f72810q;
    }
}
