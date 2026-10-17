package com.revolut.feature.onboarding.impl.language_change.flow;

import com.revolut.feature.onboarding.impl.language_change.flow.LanguageChangeFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import x99.b;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends h implements b {
    public final LanguageChangeFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final dl0.a f78285p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yki.a f78286q;

    public a(LanguageChangeFlowContract$InputData inputData, dl0.a localeInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(localeInteractor, "localeInteractor");
        this.o = inputData;
        this.f78285p = localeInteractor;
        x2g.b bVar = new x2g.b(this, 11);
        this.f78286q = d.a(this, LanguageChangeFlowContract$Step.LanguageChangePrompt.f78284a, f0.f322471a, bVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f78286q;
    }
}
