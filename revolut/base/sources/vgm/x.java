package vgm;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes14.dex */
public final class x extends Scheduler {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x f289264c = new x();

    @Override // io.reactivex.rxjava3.core.Scheduler
    public final fgm.o b() {
        return new w();
    }

    @Override // io.reactivex.rxjava3.core.Scheduler
    public final Disposable c(Runnable runnable) {
        Objects.requireNonNull(runnable, "run is null");
        runnable.run();
        return jgm.c.INSTANCE;
    }

    @Override // io.reactivex.rxjava3.core.Scheduler
    public final Disposable d(Runnable runnable, long j2, TimeUnit timeUnit) {
        try {
            timeUnit.sleep(j2);
            Objects.requireNonNull(runnable, "run is null");
            runnable.run();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            jb3.l.v(e);
        }
        return jgm.c.INSTANCE;
    }
}
