package de;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class d implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f113270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f113271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f113272c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ TimeUnit f;

    public /* synthetic */ d(f fVar, Runnable runnable, long j2, long j3, TimeUnit timeUnit, int i) {
        this.f113270a = i;
        this.f113271b = fVar;
        this.f113272c = runnable;
        this.d = j2;
        this.e = j3;
        this.f = timeUnit;
    }

    @Override // de.g
    public final ScheduledFuture a(i4b.f fVar) {
        switch (this.f113270a) {
            case 0:
                f fVar2 = this.f113271b;
                return fVar2.f113277b.scheduleAtFixedRate(new e(fVar2, this.f113272c, fVar, 0), this.d, this.e, this.f);
            default:
                f fVar3 = this.f113271b;
                return fVar3.f113277b.scheduleWithFixedDelay(new e(fVar3, this.f113272c, fVar, 2), this.d, this.e, this.f);
        }
    }
}
