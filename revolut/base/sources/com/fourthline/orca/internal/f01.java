package com.fourthline.orca.internal;

import com.fourthline.orca.core.OnProductCompleted;
import com.fourthline.orca.selfie.SelfieCustomizationConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class f01 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q11 f28307a;

    public f01(e01 selfieConfig, SelfieCustomizationConfig customizationConfig, OnProductCompleted completionBlock, ye1 tenantConfig, lg1 networkConfig) {
        Intrinsics.checkNotNullParameter(selfieConfig, "selfieConfig");
        Intrinsics.checkNotNullParameter(customizationConfig, "customizationConfig");
        Intrinsics.checkNotNullParameter(completionBlock, "completionBlock");
        Intrinsics.checkNotNullParameter(tenantConfig, "tenantConfig");
        Intrinsics.checkNotNullParameter(networkConfig, "networkConfig");
        this.f28307a = new q11(customizationConfig.getFlavor(), null, completionBlock, selfieConfig, tenantConfig, networkConfig, 2, null);
    }

    public final r70 a() {
        return this.f28307a;
    }

    public final zq0 b() {
        return new w11(this.f28307a.g());
    }

    public final sy c() {
        return new sy("NavigationDestination.Selfie::class.java");
    }

    public final q11 d() {
        return this.f28307a;
    }
}
