package com.fourthline.orca.internal;

import com.fourthline.orca.internal.uw;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class xw implements ww {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ww f35102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qg0 f35103b;

    public xw(ww realHandler, qg0 analytics) {
        Intrinsics.checkNotNullParameter(realHandler, "realHandler");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        this.f35102a = realHandler;
        this.f35103b = analytics;
    }

    @Override // com.fourthline.orca.internal.ww
    public void onPrimaryClicked(kd1 intent, Throwable error, String source, Function0 retryBlock) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(retryBlock, "retryBlock");
        this.f35103b.track(new uw.a.b(intent, error, source));
        this.f35102a.onPrimaryClicked(intent, error, source, retryBlock);
    }

    @Override // com.fourthline.orca.internal.ww
    public void onSecondaryClicked(kd1 intent, Throwable error, String source, Function0 retryBlock) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(retryBlock, "retryBlock");
        this.f35103b.track(new uw.a.c(intent, error, source));
        this.f35102a.onSecondaryClicked(intent, error, source, retryBlock);
    }
}
