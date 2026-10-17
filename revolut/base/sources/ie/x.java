package ie;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class x implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicLong f160579a;

    public x(AtomicLong atomicLong) {
        this.f160579a = atomicLong;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = Executors.defaultThreadFactory().newThread(new w(runnable));
        threadNewThread.setName("awaitEvenIfOnMainThread task continuation executor" + this.f160579a.getAndIncrement());
        return threadNewThread;
    }
}
