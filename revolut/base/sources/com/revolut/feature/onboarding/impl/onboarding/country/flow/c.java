package com.revolut.feature.onboarding.impl.onboarding.country.flow;

import d8l.d;
import db9.e;
import i4b.f;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import om4.m1;
import org.jetbrains.annotations.NotNull;
import yki.i;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends h implements pa9.b {

    @NotNull
    public static final pa9.h Companion = new pa9.h();
    public final CountryOfResidenceFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f78419p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final jt0.b f78420q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final r39.a f78421r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final f f78422s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final gte.a f78423t;
    public final pa9.f u;
    public final i v;

    public c(CountryOfResidenceFlowContract$InputData inputData, e onboardingCountriesRestrictionProvider, jt0.b countriesRestrictionPromptFactory, r39.a countryOfResidenceRevolutXDisclaimerFactory, f onboardingCompaniesInteractor, gte.a featureToggleInteractor, pa9.f countryOfResidenceDialogProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(onboardingCountriesRestrictionProvider, "onboardingCountriesRestrictionProvider");
        Intrinsics.checkNotNullParameter(countriesRestrictionPromptFactory, "countriesRestrictionPromptFactory");
        Intrinsics.checkNotNullParameter(countryOfResidenceRevolutXDisclaimerFactory, "countryOfResidenceRevolutXDisclaimerFactory");
        Intrinsics.checkNotNullParameter(onboardingCompaniesInteractor, "onboardingCompaniesInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(countryOfResidenceDialogProvider, "countryOfResidenceDialogProvider");
        this.o = inputData;
        this.f78419p = onboardingCountriesRestrictionProvider;
        this.f78420q = countriesRestrictionPromptFactory;
        this.f78421r = countryOfResidenceRevolutXDisclaimerFactory;
        this.f78422s = onboardingCompaniesInteractor;
        this.f78423t = featureToggleInteractor;
        this.u = countryOfResidenceDialogProvider;
        this.v = d.a(this, new p5f.c(this, 7));
    }

    @Override // yki.j
    public final void M0() {
        l2(new omg.e(this, null, 26), new m1(1, this, c.class, "handleCountryStepInitError", "handleCountryStepInitError(Ljava/lang/Throwable;)Z", 0, 23));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.v;
    }
}
