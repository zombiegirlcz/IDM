package yri;

import android.os.SystemClock;
import kotlin.jvm.internal.Intrinsics;
import l80.h;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f316320a;

    public b(h systemTimeProvider) {
        Intrinsics.checkNotNullParameter(systemTimeProvider, "systemTimeProvider");
        zri.a screensRepository = zri.a.f324739a;
        Intrinsics.checkNotNullParameter(screensRepository, "screensRepository");
        this.f316320a = systemTimeProvider;
    }

    @Override // yri.a
    public final boolean a() {
        return zri.a.f324741c != 0;
    }

    @Override // yri.a
    public final void b(boolean z) {
        zri.a.e = z;
    }

    @Override // yri.a
    public final void c() {
        zri.a.f324739a.b(zri.a.f324740b + 1);
    }

    @Override // yri.a
    public final boolean d() {
        return zri.a.f324740b != 0;
    }

    @Override // yri.a
    public final void e() {
        zri.a.f324739a.b(zri.a.f324740b - 1);
        if (d()) {
            return;
        }
        this.f316320a.getClass();
        zri.a.d = SystemClock.elapsedRealtime();
    }

    @Override // yri.a
    public final void f() {
        zri.a.f324739a.a(zri.a.f324741c - 1);
    }

    @Override // yri.a
    public final void g() {
        zri.a.f324739a.a(zri.a.f324741c + 1);
    }

    @Override // yri.a
    public final boolean h() {
        return zri.a.e;
    }

    @Override // yri.a
    public final long i() {
        return SystemClock.elapsedRealtime() - zri.a.d;
    }
}
