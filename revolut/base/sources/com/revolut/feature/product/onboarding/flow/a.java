package com.revolut.feature.product.onboarding.flow;

import com.revolut.feature.product.onboarding.domain.models.DeclarationValue;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import pbi.e;
import qki.d;
import til.m;
import uyh.w;
import vge.r;
import vja.f;
import vja.g;
import vja.i;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends h implements f {

    @NotNull
    public static final i Companion = new i();
    public final oja.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b f81256p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final vja.b f81257q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final m f81258r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e f81259s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final d f81260t;
    public final yki.i u;

    public a(oja.a productOnboardingRepository, b productOnboardingStepMapper, vja.b errorHandlerExtension, m workflowFlowProvider, e countryInteractor) {
        Intrinsics.checkNotNullParameter(productOnboardingRepository, "productOnboardingRepository");
        Intrinsics.checkNotNullParameter(productOnboardingStepMapper, "productOnboardingStepMapper");
        Intrinsics.checkNotNullParameter(errorHandlerExtension, "errorHandlerExtension");
        Intrinsics.checkNotNullParameter(workflowFlowProvider, "workflowFlowProvider");
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        this.o = productOnboardingRepository;
        this.f81256p = productOnboardingStepMapper;
        this.f81257q = errorHandlerExtension;
        this.f81258r = workflowFlowProvider;
        this.f81259s = countryInteractor;
        this.f81260t = hx7.e.b(this, new ProductOnboardingFlowContract$State(f0.f322471a));
        this.u = d8l.d.a(this, new vh9.b(this, 4));
    }

    public final void I2() {
        g gVar = new g(this, 0);
        l2(new r(this, gVar, null, 16), gVar);
    }

    public final void J2(String str, DeclarationValue declarationValue) {
        l2(new uvf.b(this, str, declarationValue, (Continuation) null, 28), new w(str, 16, this, declarationValue));
    }

    @Override // yki.j
    public final void M0() {
        I2();
    }

    @Override // qki.e
    public final d getState() {
        return this.f81260t;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.u;
    }
}
