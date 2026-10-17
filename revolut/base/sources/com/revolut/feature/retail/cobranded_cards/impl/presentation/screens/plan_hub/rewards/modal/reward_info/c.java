package com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.rewards.modal.reward_info;

import cli.g;
import cli.k;
import cli.n;
import cli.y;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import wli.x;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends h implements b {
    public final x o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f82602p;

    public c(n stateMapper, x deeplinkHandler) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        this.o = deeplinkHandler;
        this.f82602p = d.b(this, k.f25028a, stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final g getState() {
        return this.f82602p;
    }
}
