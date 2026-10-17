package com.revolut.feature.in_app_calls.notifications;

import ie7.k;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class d {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z70.a f74834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s70.a f74835b;

    public d(z70.a contextProvider, s70.a intentProvider) {
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(intentProvider, "intentProvider");
        this.f74834a = contextProvider;
        this.f74835b = intentProvider;
    }
}
