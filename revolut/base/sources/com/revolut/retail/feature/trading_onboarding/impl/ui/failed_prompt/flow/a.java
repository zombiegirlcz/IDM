package com.revolut.retail.feature.trading_onboarding.impl.ui.failed_prompt.flow;

import c1l.e;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerNavigationId;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.trading_onboarding.impl.ui.failed_prompt.flow.GiaOnboardingFailedFlowContract$Step;
import d8l.d;
import dzk.b;
import ibb.c;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import yki.i;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends h implements b {
    public final d1l.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f104159p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e1l.a f104160q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i f104161r;

    public a(GiaOnboardingFailedFlowContract$InputData inputData, d1l.b tradingOnboardingAccountOrTypeProvider, e tradingOnboardingStartCommandProvider, e1l.a errorDialogProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(tradingOnboardingAccountOrTypeProvider, "tradingOnboardingAccountOrTypeProvider");
        Intrinsics.checkNotNullParameter(tradingOnboardingStartCommandProvider, "tradingOnboardingStartCommandProvider");
        Intrinsics.checkNotNullParameter(errorDialogProvider, "errorDialogProvider");
        this.o = tradingOnboardingAccountOrTypeProvider;
        this.f104159p = tradingOnboardingStartCommandProvider;
        this.f104160q = errorDialogProvider;
        this.f104161r = d.a(this, new a8a.a(this, inputData, 22));
    }

    public static final FeatureCommand I2(a aVar) {
        return new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(new MainContainerNavigationId.NewMainScreenContainerTabId(c.f160141b.f83420a, null), null, null, 6)));
    }

    @Override // yki.j
    public final void M0() {
        h.z2(this.f104161r, GiaOnboardingFailedFlowContract$Step.OnboardingFailed.f104158a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f104161r;
    }
}
