package com.fourthline.orca.internal;

import android.os.SystemClock;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class k81 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final sg0 f30184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map f30185b;

    public k81(sg0 tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.f30184a = tracker;
        this.f30185b = new LinkedHashMap();
    }

    private final long d(String str) {
        Long l2 = (Long) this.f30185b.get(str);
        if (l2 == null) {
            return -1L;
        }
        return a() - l2.longValue();
    }

    public final void a(String processName) {
        Intrinsics.checkNotNullParameter(processName, "processName");
        this.f30184a.a(new sq0(processName, d(processName)));
    }

    public final void b(String processName) {
        Intrinsics.checkNotNullParameter(processName, "processName");
        this.f30185b.put(processName, Long.valueOf(a()));
        this.f30184a.a(new tq0(processName));
    }

    public final void c(String processName) {
        Intrinsics.checkNotNullParameter(processName, "processName");
        this.f30184a.a(new rq0(processName, d(processName)));
    }

    private final long a() {
        return SystemClock.uptimeMillis();
    }
}
