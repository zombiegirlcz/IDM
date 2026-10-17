package com.revolut.feature.apm.multibanco.impl.ui;

import com.revolut.feature.apm.core.models.multibanco.MultibancoRegistrationStatus;
import com.revolut.feature.apm.multibanco.api.navigation.MultibancoFlowInputData;
import com.revolut.feature.apm.multibanco.impl.ui.MultibancoFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import nx2.f;
import o10.c;
import o72.b;
import oki.h;
import om4.d0;
import p72.l;
import p72.p;
import v62.e;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends h implements b {
    public final MultibancoFlowInputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j72.a f62569p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d0 f62570q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final p f62571r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final l f62572s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final gte.a f62573t;
    public final d12.b u;
    public final yki.a v;

    public a(MultibancoFlowInputData flowInputData, j72.a errorHandlerExtension, d0 newContactNavigationProvider, p recipientListNavigationProvider, l pendingPaymentExtension, gte.a featureToggleInteractor, d12.b entryExtension) {
        Intrinsics.checkNotNullParameter(flowInputData, "flowInputData");
        Intrinsics.checkNotNullParameter(errorHandlerExtension, "errorHandlerExtension");
        Intrinsics.checkNotNullParameter(newContactNavigationProvider, "newContactNavigationProvider");
        Intrinsics.checkNotNullParameter(recipientListNavigationProvider, "recipientListNavigationProvider");
        Intrinsics.checkNotNullParameter(pendingPaymentExtension, "pendingPaymentExtension");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(entryExtension, "entryExtension");
        this.o = flowInputData;
        this.f62569p = errorHandlerExtension;
        this.f62570q = newContactNavigationProvider;
        this.f62571r = recipientListNavigationProvider;
        this.f62572s = pendingPaymentExtension;
        this.f62573t = featureToggleInteractor;
        this.u = entryExtension;
        f fVar = new f(this, 23);
        this.v = d.a(this, MultibancoFlowContract$Step.Intro.f62562a, f0.f322471a, fVar);
    }

    public final void I2(MultibancoRegistrationStatus multibancoRegistrationStatus) {
        if (!(this.o.f62546a instanceof MultibancoFlowInputData.StartType.CheckRegistration)) {
            h.D2(this.v);
        }
        C2(multibancoRegistrationStatus != null ? new e(multibancoRegistrationStatus) : v62.d.f286316a);
    }

    @Override // yji.l
    public final boolean o1(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (((j72.b) this.f62569p).b3(throwable, new c(this, 7))) {
            return true;
        }
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        return false;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.v;
    }
}
