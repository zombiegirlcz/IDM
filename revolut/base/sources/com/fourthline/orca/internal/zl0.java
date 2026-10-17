package com.fourthline.orca.internal;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class zl0 {
    public final e30 a(sg0 tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        return new e30(tracker);
    }

    public final f30 a(Context context, e30 analytics) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        return new em0(context, analytics);
    }

    public final o71 a(mb.d networkEnvironment, ib0 onboardingNetworkService) {
        Intrinsics.checkNotNullParameter(networkEnvironment, "networkEnvironment");
        Intrinsics.checkNotNullParameter(onboardingNetworkService, "onboardingNetworkService");
        if (a1m.e.B(networkEnvironment)) {
            return new dg0();
        }
        return new lb0(onboardingNetworkService);
    }

    public final h2 a(mb.d networkEnvironment, f30 tokenProvider, o71 submitAttestationWorker, e30 analytics) {
        Intrinsics.checkNotNullParameter(networkEnvironment, "networkEnvironment");
        Intrinsics.checkNotNullParameter(tokenProvider, "tokenProvider");
        Intrinsics.checkNotNullParameter(submitAttestationWorker, "submitAttestationWorker");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        if (a1m.e.B(networkEnvironment)) {
            return new ag0();
        }
        return new yl0(tokenProvider, submitAttestationWorker, analytics);
    }
}
