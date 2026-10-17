package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class j3 implements i3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d3 f29789a;

    public j3(d3 bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        this.f29789a = bundle;
    }

    @Override // com.fourthline.orca.internal.i3
    public void a(h3 bavCaptureResult) {
        Intrinsics.checkNotNullParameter(bavCaptureResult, "bavCaptureResult");
        this.f29789a.a(bavCaptureResult.a());
    }
}
