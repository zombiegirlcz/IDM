package com.fourthline.orca.internal;

import android.os.SystemClock;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes23.dex */
final class ih0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f29597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f29598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Long f29599c;
    private float d;

    public ih0(int i) {
        this.f29597a = i;
        this.f29598b = c();
    }

    private final long c() {
        return SystemClock.uptimeMillis();
    }

    public final void a(int i) {
        this.f29597a = i;
    }

    public final void b() {
        this.f29599c = Long.valueOf(c());
    }

    public final Map d() {
        long jC;
        Long l2 = this.f29599c;
        if (l2 != null) {
            jC = c() - l2.longValue();
        } else {
            jC = 0;
        }
        return zhm.r0.k(new Pair("time_in_document", Long.valueOf(c() - this.f29598b)), new Pair("time_in_zoom", Float.valueOf(this.d + jC)), new Pair("total_pages", Integer.valueOf(this.f29597a)));
    }

    public final boolean e() {
        return this.f29599c != null;
    }

    public final Unit a() {
        if (this.f29599c == null) {
            return null;
        }
        this.d += c() - r0.longValue();
        this.f29599c = null;
        return Unit.f186387a;
    }

    public /* synthetic */ ih0(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}
