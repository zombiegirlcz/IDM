package com.revolut.feature.retail.global_accounts.impl.onboarding.ui;

import com.revolut.feature.retail.global_accounts.impl.onboarding.ui.CountryProfileOnboardingFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import nd.m;
import oki.h;
import org.jetbrains.annotations.NotNull;
import t9b.c;
import vvc.s;
import w9b.b;
import w9b.e;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends h implements b {

    @NotNull
    public static final e Companion = new e();
    public final c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t9b.e f82643p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final m f82644q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yki.a f82645r;

    public a(c availableCountriesPickerControllerInteractor, t9b.e createCountryProfileInteractor, m switchCountryProfileInteractor) {
        Intrinsics.checkNotNullParameter(availableCountriesPickerControllerInteractor, "availableCountriesPickerControllerInteractor");
        Intrinsics.checkNotNullParameter(createCountryProfileInteractor, "createCountryProfileInteractor");
        Intrinsics.checkNotNullParameter(switchCountryProfileInteractor, "switchCountryProfileInteractor");
        this.o = availableCountriesPickerControllerInteractor;
        this.f82643p = createCountryProfileInteractor;
        this.f82644q = switchCountryProfileInteractor;
        s sVar = new s(this, 20);
        this.f82645r = d.a(this, CountryProfileOnboardingFlowContract$Step.CreateCountryProfileArticle.f82642a, f0.f322471a, sVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f82645r;
    }
}
