package de;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class b implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f113264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f113265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f113266c;
    public final /* synthetic */ TimeUnit d;
    public final /* synthetic */ Object e;

    public /* synthetic */ b(f fVar, Object obj2, long j2, TimeUnit timeUnit, int i) {
        this.f113264a = i;
        this.f113265b = fVar;
        this.e = obj2;
        this.f113266c = j2;
        this.d = timeUnit;
    }

    @Override // de.g
    public final ScheduledFuture a(i4b.f fVar) {
        switch (this.f113264a) {
            case 0:
                Runnable runnable = (Runnable) this.e;
                f fVar2 = this.f113265b;
                return fVar2.f113277b.schedule(new e(fVar2, runnable, fVar, 1), this.f113266c, this.d);
            default:
                Callable callable = (Callable) this.e;
                f fVar3 = this.f113265b;
                return fVar3.f113277b.schedule(new a9j.k(fVar3, 6, callable, fVar), this.f113266c, this.d);
        }
    }
}
