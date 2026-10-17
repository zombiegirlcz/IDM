package com.revolut.feature.kyc.impl.trustdock.icchip;

import com.revolut.feature.kyc.impl.trustdock.icchip.TrustdockSdkFlowContract$Step;
import cp5.d;
import ghl.c;
import gx8.b;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import zhm.f0;
import zhm.y0;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends h implements b {
    public final TrustdockSdkFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y80.a f77880p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ix8.a f77881q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yki.a f77882r;

    public a(TrustdockSdkFlowContract$InputData inputData, y80.a permissionProvider, ix8.a promptProvider, xg0.a dynamicDelivery, z70.a contextProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(permissionProvider, "permissionProvider");
        Intrinsics.checkNotNullParameter(promptProvider, "promptProvider");
        Intrinsics.checkNotNullParameter(dynamicDelivery, "dynamicDelivery");
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        this.o = inputData;
        this.f77880p = permissionProvider;
        this.f77881q = promptProvider;
        this.f77882r = d.a(this, !((oi0.b) dynamicDelivery).d(contextProvider.getContext(), y0.b("feature_trustdock_ic_chip")).f305464a.isEmpty() ? TrustdockSdkFlowContract$Step.InstallFeature.f77877a : permissionProvider.c("android.permission.CAMERA") ? TrustdockSdkFlowContract$Step.LaunchSdk.f77878a : TrustdockSdkFlowContract$Step.RequestPermission.f77879a, f0.f322471a, new c(this, 24));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f77882r;
    }
}
