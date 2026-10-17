package com.revolut.feature.apm.core.impl.crypto;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ang.f f61864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tl0.a f61865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kg.o f61866c;

    public h(ang.f userInteractor, tl0.a base64Wrapper, kg.o gson) {
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(base64Wrapper, "base64Wrapper");
        Intrinsics.checkNotNullParameter(gson, "gson");
        this.f61864a = userInteractor;
        this.f61865b = base64Wrapper;
        this.f61866c = gson;
    }
}
