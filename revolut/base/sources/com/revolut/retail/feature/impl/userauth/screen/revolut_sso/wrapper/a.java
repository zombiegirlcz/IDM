package com.revolut.retail.feature.impl.userauth.screen.revolut_sso.wrapper;

import av8.n;
import axj.b;
import com.revolut.retail.feature.impl.userauth.screen.revolut_sso.wrapper.RetailRevolutSsoAccessRecoveryWrapperFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import mli.e;
import oki.h;
import xjl.i;
import zhm.f0;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends h implements b {
    public final nkl.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i f101725p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final com.revolut.retail.feature.api.userauth.navigation.a f101726q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e f101727r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final yki.a f101728s;

    public a(nkl.b revolutSsoFlowsFactory, i revolutSsoFlowConfigurationInteractor, com.revolut.retail.feature.api.userauth.navigation.a userOnboardingNavigationProvider, e userLogoutInteractor) {
        Intrinsics.checkNotNullParameter(revolutSsoFlowsFactory, "revolutSsoFlowsFactory");
        Intrinsics.checkNotNullParameter(revolutSsoFlowConfigurationInteractor, "revolutSsoFlowConfigurationInteractor");
        Intrinsics.checkNotNullParameter(userOnboardingNavigationProvider, "userOnboardingNavigationProvider");
        Intrinsics.checkNotNullParameter(userLogoutInteractor, "userLogoutInteractor");
        this.o = revolutSsoFlowsFactory;
        this.f101725p = revolutSsoFlowConfigurationInteractor;
        this.f101726q = userOnboardingNavigationProvider;
        this.f101727r = userLogoutInteractor;
        n nVar = new n(this, 5);
        this.f101728s = d.a(this, RetailRevolutSsoAccessRecoveryWrapperFlowContract$Step.UnlockAppWithBiometrics.f101724a, f0.f322471a, nVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f101728s;
    }
}
