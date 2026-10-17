package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public abstract class lw {
    public static final nw a(fq0 presenter, yw stateBuilder, ww clicksHandler, qg0 analytics, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(presenter, "presenter");
        Intrinsics.checkNotNullParameter(stateBuilder, "stateBuilder");
        Intrinsics.checkNotNullParameter(clicksHandler, "clicksHandler");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        return new nw(new mw(stateBuilder, presenter, new xw(clicksHandler, analytics), skm.e0.D(coroutineScope, skm.e0.d())), analytics);
    }
}
