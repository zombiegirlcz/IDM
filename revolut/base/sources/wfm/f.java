package wfm;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements Future {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ifm.c f297170a;

    public f(ifm.c cVar) {
        this.f297170a = cVar;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        this.f297170a.dispose();
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return null;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j2, TimeUnit timeUnit) {
        return null;
    }
}
