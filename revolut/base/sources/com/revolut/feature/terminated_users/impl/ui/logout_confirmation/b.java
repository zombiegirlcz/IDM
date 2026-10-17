package com.revolut.feature.terminated_users.impl.ui.logout_confirmation;

import com.revolut.feature.terminated_users.impl.ui.logout_confirmation.LogoutConfirmationFlowContract$Step;
import hfb.d;
import hre.c;
import kotlin.jvm.internal.Intrinsics;
import mli.e;
import oki.h;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends h implements hre.b {

    @NotNull
    public static final c Companion = new c();
    public final e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final com.revolut.retail.feature.api.userauth.navigation.a f90352p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final LogoutConfirmationFlowContract$InputData f90353q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yki.a f90354r;

    public b(e userLogoutInteractor, com.revolut.retail.feature.api.userauth.navigation.a userOnboardingNavigationProvider, LogoutConfirmationFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(userLogoutInteractor, "userLogoutInteractor");
        Intrinsics.checkNotNullParameter(userOnboardingNavigationProvider, "userOnboardingNavigationProvider");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = userLogoutInteractor;
        this.f90352p = userOnboardingNavigationProvider;
        this.f90353q = inputData;
        d dVar = new d(this, 17);
        this.f90354r = cp5.d.a(this, LogoutConfirmationFlowContract$Step.BottomSheet.f90350a, f0.f322471a, dVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f90354r;
    }
}
