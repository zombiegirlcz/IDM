package wfm;

import efm.c0;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes13.dex */
public final class a0 extends c0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a0 f297161c = new a0();

    @Override // efm.c0
    public final c0.a b() {
        return new z();
    }

    @Override // efm.c0
    public final ifm.c c(Runnable runnable) {
        runnable.run();
        return lfm.e.INSTANCE;
    }

    @Override // efm.c0
    public final ifm.c d(Runnable runnable, long j2, TimeUnit timeUnit) {
        try {
            timeUnit.sleep(j2);
            mfm.f.b(runnable, "run is null");
            runnable.run();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            mo3.a.m(e);
        }
        return lfm.e.INSTANCE;
    }
}
