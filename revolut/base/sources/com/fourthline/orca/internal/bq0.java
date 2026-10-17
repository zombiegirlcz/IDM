package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public final class bq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fq0 f27193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final tp0 f27194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CoroutineScope f27195c;

    public bq0(fq0 presenter, tp0 analytics, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(presenter, "presenter");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f27193a = presenter;
        this.f27194b = analytics;
        this.f27195c = coroutineScope;
    }

    public final aq0 a(gq0... providers) {
        Intrinsics.checkNotNullParameter(providers, "providers");
        return new da(zhm.p.c(providers), this.f27193a, this.f27194b, this.f27195c);
    }
}
