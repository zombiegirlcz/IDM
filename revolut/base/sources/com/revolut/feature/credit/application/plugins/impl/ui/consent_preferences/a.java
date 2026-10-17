package com.revolut.feature.credit.application.plugins.impl.ui.consent_preferences;

import a74.b;
import com.revolut.feature.credit.application.plugins.impl.ui.consent_preferences.LegacyConsentPreferencesFlowContract$Step;
import hx7.e;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import qki.d;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends h implements b {
    public final LegacyConsentPreferencesFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final rw3.a f67273p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d f67274q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yki.a f67275r;

    public a(LegacyConsentPreferencesFlowContract$InputData inputData, rw3.a interactor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        this.o = inputData;
        this.f67273p = interactor;
        this.f67274q = e.b(this, new LegacyConsentPreferencesFlowContract$State(null, null));
        a09.b bVar = new a09.b(this, 17);
        this.f67275r = cp5.d.a(this, LegacyConsentPreferencesFlowContract$Step.Preferences.f67272a, f0.f322471a, bVar);
    }

    @Override // qki.e
    public final d getState() {
        return this.f67274q;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f67275r;
    }
}
