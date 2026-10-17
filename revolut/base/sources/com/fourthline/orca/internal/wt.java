package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class wt implements vt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final us f34788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final mb.d f34789b;

    public wt(us eidFlowConfig, mb.d networkEnvironment) {
        Intrinsics.checkNotNullParameter(eidFlowConfig, "eidFlowConfig");
        Intrinsics.checkNotNullParameter(networkEnvironment, "networkEnvironment");
        this.f34788a = eidFlowConfig;
        this.f34789b = networkEnvironment;
    }

    @Override // com.fourthline.orca.internal.vt
    public boolean a() {
        return !Intrinsics.f(this.f34789b, mb.b.f204053a) && this.f34788a.getBoxCardSimulation();
    }
}
