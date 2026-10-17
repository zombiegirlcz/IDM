package no;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gpk.c f217751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d4m.a f217752b;

    public d(d4m.a tracker, gpk.c coroutineScopeProvider) {
        Intrinsics.checkNotNullParameter(coroutineScopeProvider, "coroutineScopeProvider");
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.f217751a = coroutineScopeProvider;
        this.f217752b = tracker;
    }
}
