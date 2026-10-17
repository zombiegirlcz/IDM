package jk;

import com.bumptech.glide.k;
import cpi.g;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
import mp.r;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f175024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicLong f175025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ExecutorService f175026c;
    public final r d;
    public final g e;
    public final ff0.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f175027g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f175028h;
    public final long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f175029j;
    public final long k;

    public f(r sntpClient, dfm.c deviceClock, g responseCache, ff0.b bVar, List ntpHosts, long j2, long j3, long j5, long j16) {
        Intrinsics.checkNotNullParameter(sntpClient, "sntpClient");
        Intrinsics.checkNotNullParameter(deviceClock, "deviceClock");
        Intrinsics.checkNotNullParameter(responseCache, "responseCache");
        Intrinsics.checkNotNullParameter(ntpHosts, "ntpHosts");
        this.d = sntpClient;
        this.e = responseCache;
        this.f = bVar;
        this.f175027g = ntpHosts;
        this.f175028h = j2;
        this.i = j3;
        this.f175029j = j5;
        this.k = j16;
        this.f175024a = new AtomicReference(d.IDLE);
        this.f175025b = new AtomicLong(0L);
        this.f175026c = Executors.newSingleThreadExecutor(e.f175023a);
    }

    public final void a() {
        if (((d) this.f175024a.get()) == d.STOPPED) {
            throw new IllegalStateException("Service already shutdown");
        }
    }

    public final void b() {
        a();
        if (((d) this.f175024a.get()) != d.SYNCING) {
            this.f175026c.submit(new k(this, 14));
        }
    }
}
