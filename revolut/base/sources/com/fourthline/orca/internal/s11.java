package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class s11 {
    public final i21 a(q11 mainRepository, ef deviceDataBundle, sg0 analyticsTracker, boolean z) {
        Intrinsics.checkNotNullParameter(mainRepository, "mainRepository");
        Intrinsics.checkNotNullParameter(deviceDataBundle, "deviceDataBundle");
        Intrinsics.checkNotNullParameter(analyticsTracker, "analyticsTracker");
        n01 n01VarA = mainRepository.h().a();
        return new x11(deviceDataBundle, analyticsTracker, o01.a(n01VarA, z), n01VarA.getRandomnessConfig());
    }

    public final n31 a(o80 navigationChannel) {
        Intrinsics.checkNotNullParameter(navigationChannel, "navigationChannel");
        return new n31(navigationChannel);
    }
}
