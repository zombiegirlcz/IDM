package no;

import android.content.Intent;
import grl.m5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class m1 implements k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uo.b f217817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gpk.c f217818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uo.l f217819c;
    public final uo.q0 d;
    public final d4m.a e;

    public m1(d4m.a tracker, gpk.c coroutineScopeProvider, uo.b activeScreenHolder, uo.l productMapper, uo.q0 screenNameFinder) {
        Intrinsics.checkNotNullParameter(activeScreenHolder, "activeScreenHolder");
        Intrinsics.checkNotNullParameter(coroutineScopeProvider, "coroutineScopeProvider");
        Intrinsics.checkNotNullParameter(productMapper, "productMapper");
        Intrinsics.checkNotNullParameter(screenNameFinder, "screenNameFinder");
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.f217817a = activeScreenHolder;
        this.f217818b = coroutineScopeProvider;
        this.f217819c = productMapper;
        this.d = screenNameFinder;
        this.e = tracker;
    }

    public final void a(Intent intent, m5 type) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(type, "type");
        skm.e0.C(this.f217818b.c(), null, null, new l1(intent, type, null, this), 3);
    }
}
