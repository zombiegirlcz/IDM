package com.fourthline.orca.internal;

import android.os.SystemClock;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class e30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final sg0 f27983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Long f27984b;

    public e30(sg0 tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.f27983a = tracker;
    }

    public final void a() {
        this.f27983a.a(d2.f27624b);
    }

    public final void b(long j2) {
        this.f27983a.a(new c2(j2));
    }

    public final void c() {
        Long l2 = this.f27984b;
        if (l2 != null) {
            long jUptimeMillis = SystemClock.uptimeMillis() - l2.longValue();
            this.f27984b = null;
            this.f27983a.a(new f2(jUptimeMillis));
        }
    }

    public final void d() {
        this.f27984b = Long.valueOf(SystemClock.uptimeMillis());
        this.f27983a.a(g2.f28735b);
    }

    public final void a(long j2) {
        this.f27983a.a(new b2(j2));
    }

    public final void b() {
        Long l2 = this.f27984b;
        if (l2 != null) {
            long jUptimeMillis = SystemClock.uptimeMillis() - l2.longValue();
            this.f27984b = null;
            this.f27983a.a(new e2(jUptimeMillis));
        }
    }
}
