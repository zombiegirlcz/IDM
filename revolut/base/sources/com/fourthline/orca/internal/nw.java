package com.fourthline.orca.internal;

import com.fourthline.orca.internal.uw;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class nw implements kw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final mw f31487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qg0 f31488b;

    public nw(mw realHandler, qg0 analytics) {
        Intrinsics.checkNotNullParameter(realHandler, "realHandler");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        this.f31487a = realHandler;
        this.f31488b = analytics;
    }

    @Override // com.fourthline.orca.internal.kw
    public void handleError(Throwable error, String source) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(source, "source");
        qg0 qg0Var = this.f31488b;
        this.f31487a.handleError(error, source);
        qg0Var.track(new uw.a.C0295a(error, source));
    }

    @Override // com.fourthline.orca.internal.kw
    public void handleRecoverableError(Throwable error, String source, Function0 onRetry) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(onRetry, "onRetry");
        qg0 qg0Var = this.f31488b;
        this.f31487a.handleRecoverableError(error, source, onRetry);
        qg0Var.track(new uw.a.C0295a(error, source));
    }
}
