package no;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class y2 implements e0m.d, od0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.analytics.tracking.v3.d f217879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e0m.b f217880b;

    public y2(com.revolut.analytics.tracking.v3.d tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.f217879a = tracker;
        this.f217880b = new e0m.b(new ite.d(this, 18));
    }

    @Override // od0.e
    public final void clear() {
        jo0.m.f176852j = null;
    }

    @Override // e0m.d
    public final void init() {
        this.f217880b.init();
    }
}
