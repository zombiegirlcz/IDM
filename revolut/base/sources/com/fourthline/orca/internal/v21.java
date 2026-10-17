package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class v21 {
    public final u21 a() {
        return new u21();
    }

    public final c00 a(ib0 networkService) {
        Intrinsics.checkNotNullParameter(networkService, "networkService");
        return new ia0(networkService);
    }

    public final w70 a(u21 signingManager, c00 getChallengeWorker) {
        Intrinsics.checkNotNullParameter(signingManager, "signingManager");
        Intrinsics.checkNotNullParameter(getChallengeWorker, "getChallengeWorker");
        return new la0(signingManager, getChallengeWorker);
    }
}
