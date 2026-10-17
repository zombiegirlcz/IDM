package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class u90 implements t90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final gf1 f33981a;

    public u90(gf1 bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        this.f33981a = bundle;
    }

    @Override // com.fourthline.orca.internal.t90
    public void a(lg1 networkConfig) {
        Intrinsics.checkNotNullParameter(networkConfig, "networkConfig");
        this.f33981a.a(networkConfig);
    }

    @Override // com.fourthline.orca.internal.t90
    public void a(xg1 challengeData) {
        Intrinsics.checkNotNullParameter(challengeData, "challengeData");
        this.f33981a.a(challengeData);
    }
}
