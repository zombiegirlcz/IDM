package de;

import androidx.concurrent.futures.AbstractResolvableFuture;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes17.dex */
public final class h extends AbstractResolvableFuture implements ScheduledFuture {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScheduledFuture f113278a;

    public h(g gVar) {
        this.f113278a = gVar.a(new i4b.f(this, 15));
    }

    @Override // androidx.concurrent.futures.AbstractResolvableFuture
    public final void afterDone() {
        this.f113278a.cancel(wasInterrupted());
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.f113278a.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f113278a.getDelay(timeUnit);
    }
}
