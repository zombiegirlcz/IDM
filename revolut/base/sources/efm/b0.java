package efm;

import efm.c0;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes22.dex */
public final class b0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f125379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lfm.b f125380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f125381c;
    public long d;
    public long e;
    public long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c0.a f125382g;

    public b0(c0.a aVar, long j2, Runnable runnable, long j3, lfm.b bVar, long j5) {
        this.f125382g = aVar;
        this.f125379a = runnable;
        this.f125380b = bVar;
        this.f125381c = j5;
        this.e = j3;
        this.f = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j2;
        this.f125379a.run();
        lfm.b bVar = this.f125380b;
        if (bVar.isDisposed()) {
            return;
        }
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        c0.a aVar = this.f125382g;
        aVar.getClass();
        long jA = c0.a(timeUnit);
        long j3 = c0.f125384b;
        long j5 = jA + j3;
        long j16 = this.e;
        long j22 = this.f125381c;
        if (j5 < j16 || jA >= j16 + j22 + j3) {
            j2 = jA + j22;
            long j42 = this.d + 1;
            this.d = j42;
            this.f = j2 - (j22 * j42);
        } else {
            long j46 = this.f;
            long j47 = this.d + 1;
            this.d = j47;
            j2 = (j47 * j22) + j46;
        }
        this.e = jA;
        ifm.c cVarB = aVar.b(this, j2 - jA, timeUnit);
        bVar.getClass();
        lfm.d.c(bVar, cVarB);
    }
}
