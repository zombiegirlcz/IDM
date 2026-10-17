package com.fourthline.orca.internal;

import android.os.SystemClock;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class qi0 implements rz0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final sg0 f32449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f32450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private sz0 f32451c;

    public qi0(sg0 tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.f32449a = tracker;
        this.f32450b = new LinkedHashMap();
    }

    private final long e(String str) {
        Long l2 = (Long) this.f32450b.get(str);
        if (l2 == null) {
            return -1L;
        }
        return b() - l2.longValue();
    }

    @Override // com.fourthline.orca.internal.rz0
    public void a(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f32449a.a(new mi0(name, e(name)));
        sz0 sz0Var = this.f32451c;
        if (sz0Var != null) {
            this.f32449a.a(sz0Var.getIdentifier());
        }
    }

    @Override // com.fourthline.orca.internal.rz0
    public void b(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f32449a.a(new oi0(name, e(name)));
        sz0 sz0Var = this.f32451c;
        if (sz0Var != null) {
            this.f32449a.a(sz0Var.getIdentifier());
        }
    }

    @Override // com.fourthline.orca.internal.rz0
    public void c(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f32449a.a(new ni0(name, e(name)));
        sz0 sz0Var = this.f32451c;
        if (sz0Var != null) {
            this.f32449a.a(sz0Var.getIdentifier());
        }
    }

    @Override // com.fourthline.orca.internal.rz0
    public void d(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f32450b.put(name, Long.valueOf(b()));
        sz0 sz0Var = new sz0(name);
        this.f32449a.a(sz0Var);
        this.f32451c = sz0Var;
        this.f32449a.a(new pi0(name));
    }

    private final long b() {
        return SystemClock.uptimeMillis();
    }
}
