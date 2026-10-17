package com.revolut.retail.feature.impl.rewards_hub.ui.flow.rewards_hub;

import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import wli.x;
import wtj.b;
import wtj.c;
import zhm.f0;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends h implements b {
    public final x o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f101572p;

    public a(RewardsHubFlowContract$Step initialStep, x deeplinkHandler) {
        Intrinsics.checkNotNullParameter(initialStep, "initialStep");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        this.o = deeplinkHandler;
        this.f101572p = d.a(this, initialStep, f0.f322471a, new c(this, 0));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f101572p;
    }
}
