package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public final class dq0 {
    public final bq0 a(fq0 presenter, tp0 analytics, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(presenter, "presenter");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        return new bq0(presenter, analytics, coroutineScope);
    }
}
