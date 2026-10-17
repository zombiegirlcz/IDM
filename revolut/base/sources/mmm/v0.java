package mmm;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public class v0 {

    @NotNull
    public static final u0 Companion = new u0();
    public static final t0 d = new t0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f207309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f207310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f207311c;

    public v0 a() {
        this.f207309a = false;
        return this;
    }

    public v0 b() {
        this.f207311c = 0L;
        return this;
    }

    public long c() {
        if (this.f207309a) {
            return this.f207310b;
        }
        throw new IllegalStateException("No deadline");
    }

    public v0 d(long j2) {
        this.f207309a = true;
        this.f207310b = j2;
        return this;
    }

    public boolean e() {
        return this.f207309a;
    }

    public void f() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f207309a && this.f207310b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public v0 g(long j2, TimeUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j2 < 0) {
            throw new IllegalArgumentException(p.a.m(j2, "timeout < 0: ").toString());
        }
        this.f207311c = unit.toNanos(j2);
        return this;
    }

    public long h() {
        return this.f207311c;
    }
}
